window.Ice = {};
if (!window.ice) {
    window.ice = new Object;
}
if (!window.ice.compat) {
    (function(namespace) {
        namespace.compat = true;
        eval(ice.importFrom('ice.lib.functional'));
        eval(ice.importFrom('ice.lib.oo'));
        eval(ice.importFrom('ice.lib.collection'));
        eval(ice.importFrom('ice.lib.string'));
        eval(ice.importFrom('ice.lib.delay'));
        eval(ice.importFrom('ice.lib.window'));
        eval(ice.importFrom('ice.lib.event'));
        eval(ice.importFrom('ice.lib.logger'));
        eval(ice.importFrom('ice.lib.query'));
        function findBridgeContainer(element) {
            while (element) {
                if (element.configuration) {
                    return element;
                }
                element = element.parentNode;
            }
            return document.body;
        }
var DefaultIndicators;
var ComponentIndicators;
(function() {
    var on = operator();
    var off = operator();
    var NOOPIndicator = object(function (method) {
        method(on, noop);
        method(off, noop);
    });
    function RedirectIndicator(uri) {
        return object(function (method) {
            method(on, function(self) {
                window.location.href = uri;
            });
            method(off, noop);
        });
    }
    function ElementIndicator(elementID, indicators) {
        var instance = object(function (method) {
            method(on, function(self) {
                each(indicators, function(indicator) {
                    if (indicator != self) off(indicator);
                });
                var e = document.getElementById(elementID);
                if (e) {
                    e.style.visibility = 'visible';
                }
            });
            method(off, function(self) {
                var e = document.getElementById(elementID);
                if (e) {
                    e.style.visibility = 'hidden';
                }
            });
        });
        append(indicators, instance);
        off(instance);
        return instance;
    }
    function OverlappingStateProtector(indicator) {
        var counter = 0;
        return object(function (method) {
            method(on, function() {
                if (counter == 0) on(indicator);
                ++counter;
            });
            method(off, function() {
                if (counter < 1) return;
                if (counter == 1) off(indicator);
                --counter;
            });
        });
    }
    function ToggleIndicator(onElement, offElement) {
        var instance = object(function (method) {
            method(on, function(self) {
                on(onElement);
                off(offElement);
            });
            method(off, function(self) {
                off(onElement);
                on(offElement);
            });
        });
        off(instance);
        return instance;
    }
    function MuxIndicator() {
        var indicators = arguments;
        var instance = object(function (method) {
            method(on, function(self) {
                each(indicators, on);
            });
            method(off, function(self) {
                each(indicators, off);
            });
        });
        off(instance);
        return instance;
    }
    function PointerIndicator(element) {
        var privateOff = noop;
        function toggle() {
            privateOn = noop;
            function toggleElementCursor(e) {
                var c = e.style.cursor;
                e.style.cursor = 'wait';
                return function() {
                    e.style.cursor = c;
                };
            }
            var cursorRollbacks = inject(['input', 'select', 'textarea', 'button', 'a'], [ toggleElementCursor(element) ], function(result, type) {
                each(element.getElementsByTagName(type), function(e) {
                    append(result, toggleElementCursor(e));
                });
                return result;
            });
            privateOff = function() {
                broadcast(cursorRollbacks);
                privateOn = toggle;
                privateOff = noop;
            };
        }
        var privateOn = toggle;
        return object(function (method) {
            method(on, function(self) {
                privateOn();
            });
            method(off, function(self) {
                privateOff();
            });
        });
    }
    function FastPointerIndicator(element) {
        var privateOff = noop;
        function toggle() {
            privateOn = noop;
            var elementStyle = element.style;
            var previousCursor = elementStyle.cursor;
            elementStyle.cursor = 'wait';
            privateOff = function() {
                elementStyle.cursor = previousCursor;
                privateOn = toggle;
                privateOff = noop;
            };
        }
        var privateOn = toggle;
        return object(function (method) {
            method(on, function(self) {
                privateOn();
            });
            method(off, function(self) {
                privateOff();
            });
        });
    }
    function OverlayIndicator() {
        return object(function(method) {
            var isIEBrowser = /MSIE/.test(navigator.userAgent);
            var isIEGreater8 = isIEBrowser ? parseInt(navigator.userAgent.match(/MSIE ([0-9]+)\.0;/)[1]) > 8 : false;
            var overlay;
            var delayedOverlayRender;
            function createOverlay() {
                if (isIEBrowser && !isIEGreater8) {
                    overlay = document.createElement('iframe');
                    overlay.setAttribute('src', 'javascript:document.write(\'<html><body style="cursor: wait;"></body><html>\');document.close();');
                    overlay.setAttribute('frameborder', '0');
                    document.body.appendChild(overlay);
                } else {
                    overlay = document.body.appendChild(document.createElement('div'));
                    overlay.style.cursor = 'wait';
                }
                var overlayStyle = overlay.style;
                overlayStyle.position = 'absolute';
                overlayStyle.backgroundColor = 'white';
                overlayStyle.zIndex = '38000';
                overlayStyle.top = '0';
                overlayStyle.left = '0';
                overlayStyle.opacity = '0';
                overlayStyle.filter = 'alpha(opacity=0)';
                overlayStyle.width = (Math.max(document.documentElement.scrollWidth, document.body.scrollWidth) - 20) + 'px';
                overlayStyle.height = (Math.max(document.documentElement.scrollHeight, document.body.scrollHeight) - 20) + 'px';
            }
            function deleteOverlay() {
                if (isIEBrowser && !isIEGreater8) {
                    var blankOverlay = document.createElement('iframe');
                    blankOverlay.setAttribute('src', 'javascript:document.write("<html></html>");document.close();');
                    blankOverlay.setAttribute('frameborder', '0');
                    try {
                        document.body.replaceChild(blankOverlay, overlay);
                        document.body.removeChild(blankOverlay);
                    } catch (e) {
                    }
                } else {
                    document.body.removeChild(overlay);
                }
                overlay = null;
            }
            method(on, function(self) {
                delayedOverlayRender = runOnce(Delay(createOverlay, 750));
            });
            method(off, function(self) {
                if (delayedOverlayRender) {
                    stop(delayedOverlayRender);
                }
                if (overlay) {
                    deleteOverlay();
                }
            });
        });
    }
    function PopupIndicator(message, description, buttonText, iconPath, panel) {
        return object(function (method) {
            method(on, function(self) {
                on(panel);
                var messageContainer = document.body.appendChild(document.createElement('div'));
                messageContainer.className = 'ice-status-indicator';
                var messageContainerStyle = messageContainer.style;
                messageContainerStyle.position = 'absolute';
                messageContainerStyle.textAlign = 'center';
                messageContainerStyle.zIndex = '28001';
                messageContainerStyle.color = 'black';
                messageContainerStyle.backgroundColor = 'white';
                messageContainerStyle.paddingLeft = '0';
                messageContainerStyle.paddingRight = '0';
                messageContainerStyle.paddingTop = '15px';
                messageContainerStyle.paddingBottom = '15px';
                messageContainerStyle.borderBottomColor = 'gray';
                messageContainerStyle.borderRightColor = 'gray';
                messageContainerStyle.borderTopColor = 'silver';
                messageContainerStyle.borderLeftColor = 'silver';
                messageContainerStyle.borderWidth = '2px';
                messageContainerStyle.borderStyle = 'solid';
                messageContainerStyle.width = '270px';
                var messageElement = messageContainer.appendChild(document.createElement('div'));
                messageElement.appendChild(document.createTextNode(message));
                messageElement.className = 'ice-status-indicator-message';
                var messageElementStyle = messageElement.style;
                messageElementStyle.marginLeft = '30px';
                messageElementStyle.textAlign = 'left';
                messageElementStyle.fontSize = '14px';
                messageElementStyle.fontSize = '14px';
                messageElementStyle.fontWeight = 'bold';
                var descriptionElement = messageElement.appendChild(document.createElement('div'));
                descriptionElement.appendChild(document.createTextNode(description));
                descriptionElement.className = 'ice-status-indicator-description';
                var descriptionElementStyle = descriptionElement.style;
                descriptionElementStyle.fontSize = '11px';
                descriptionElementStyle.marginTop = '7px';
                descriptionElementStyle.marginBottom = '7px';
                descriptionElementStyle.fontWeight = 'normal';
                var buttonElement = document.createElement('input');
                buttonElement.type = 'button';
                buttonElement.value = buttonText;
                var buttonElementStyle = buttonElement.style;
                buttonElementStyle.fontSize = '11px';
                buttonElementStyle.fontWeight = 'normal';
                buttonElement.onclick = function() {
                    window.location.reload();
                };
                messageContainer.appendChild(buttonElement);
                var resize = function() {
                    messageContainerStyle.left = ((window.width() - messageContainer.clientWidth) / 2) + 'px';
                    messageContainerStyle.top = ((window.height() - messageContainer.clientHeight) / 2) + 'px';
                };
                resize();
                onResize(window, resize);
            });
            method(off, noop);
        });
    }
    var indctrs;
    DefaultIndicators = function(configuration, setupID) {
        var container = document.getElementById(setupID).parentNode;
        container.compatDefaultIndicatorsSetupCount = container.compatDefaultIndicatorsSetupCount ? (container.compatDefaultIndicatorsSetupCount + 1) : 1;
        if (container.compatDefaultIndicatorsSetupCount == 1) {
            if (container.configuration.disableDefaultErrorPopups) {
                indctrs = {
                    busy: NOOPIndicator,
                    sessionExpired: NOOPIndicator,
                    connectionLost: NOOPIndicator,
                    serverError: NOOPIndicator,
                    connectionTrouble: NOOPIndicator
                }
            } else {
                container.configuration.disableDefaultErrorPopups = true;
                var connectionLostURI = configuration.connectionLostRedirectURI;
                if (connectionLostURI == "null") {
                    connectionLostURI = null;
                }
                var sessionExpiredURI = configuration.sessionExpiredRedirectURI;
                if (sessionExpiredURI == "null") {
                    sessionExpiredURI = null;
                }
                var connectionLostRedirect = connectionLostURI ? RedirectIndicator(connectionLostURI) : null;
                var sessionExpiredRedirect = sessionExpiredURI ? RedirectIndicator(sessionExpiredURI) : null;
                var messages = configuration.messages;
                var sessionExpiredIcon = configuration.connection.context + '/xmlhttp/css/xp/css-images/connect_disconnected.gif';
                var connectionLostIcon = configuration.connection.context + '/xmlhttp/css/xp/css-images/connect_caution.gif';
                var busyIndicator = configuration.fastBusyIndicator ? FastPointerIndicator(container) : PointerIndicator(container);
                var overlay = object(function(method) {
                    method(on, function(self) {
                        var overlay = container.ownerDocument.createElement('iframe');
                        overlay.setAttribute('src', 'about:blank');
                        overlay.setAttribute('frameborder', '0');
                        var overlayStyle = overlay.style;
                        overlayStyle.position = 'absolute';
                        overlayStyle.display = 'block';
                        overlayStyle.visibility = 'visible';
                        overlayStyle.backgroundColor = 'white';
                        overlayStyle.zIndex = '28000';
                        overlayStyle.top = '0';
                        overlayStyle.left = '0';
                        overlayStyle.opacity = 0.22;
                        overlayStyle.filter = 'alpha(opacity=22)';
                        container.appendChild(overlay);
                        var resize = container.tagName.toLowerCase() == 'body' ?
                            function() {
                                overlayStyle.width = Math.max(document.documentElement.scrollWidth, document.body.scrollWidth) + 'px';
                                overlayStyle.height = Math.max(document.documentElement.scrollHeight, document.body.scrollHeight) + 'px';
                            } :
                            function() {
                                overlayStyle.width = container.offsetWidth + 'px';
                                overlayStyle.height = container.offsetHeight + 'px';
                            };
                        resize();
                        onResize(window, resize);
                    });
                    method(off, noop);
                });
                indctrs = {
                    busy: busyIndicator,
                    sessionExpired: sessionExpiredRedirect ? sessionExpiredRedirect : PopupIndicator(messages.sessionExpired, messages.description, messages.buttonText, sessionExpiredIcon, overlay),
                    connectionLost: connectionLostRedirect ? connectionLostRedirect : PopupIndicator(messages.connectionLost, messages.description, messages.buttonText, connectionLostIcon, overlay),
                    serverError: PopupIndicator(messages.serverError, messages.description, messages.buttonText, connectionLostIcon, overlay),
                    connectionTrouble: NOOPIndicator
                };
            }
        }
        if (container.compatComponentIndicatorsInit) {
            container.compatComponentIndicatorsInit();
        }
    };
    var workingIDs = [];
    ComponentIndicators = function(workingID, idleID, troubleID, lostID, showPopups, displayHourglassWhenActive) {
        var container = findBridgeContainer(document.getElementById(workingID));
        if (contains(workingIDs, workingID)) {
            container.compatComponentIndicatorsInit = noop;
            return;
        } else {
            append(workingIDs, workingID);
            container.compatComponentIndicatorsInit = function() {
                var indicators = [];
                var connectionWorking = ElementIndicator(workingID, indicators);
                var connectionIdle = ElementIndicator(idleID, indicators);
                var connectionLost = ElementIndicator(lostID, indicators);
                var busyElementIndicator = ToggleIndicator(connectionWorking, connectionIdle);
                var busyIndicator = displayHourglassWhenActive ? busyElementIndicator : MuxIndicator(busyElementIndicator, OverlayIndicator());
                var busy = OverlappingStateProtector(displayHourglassWhenActive ? MuxIndicator(indctrs.busy, busyIndicator) : busyIndicator);
                var connectionTrouble = ElementIndicator(troubleID, indicators);
                if (showPopups) {
                    indctrs = {
                        busy: busy,
                        connectionTrouble: connectionTrouble,
                        connectionLost: MuxIndicator(connectionLost, indctrs.connectionLost),
                        sessionExpired: MuxIndicator(connectionLost, indctrs.sessionExpired),
                        serverError: MuxIndicator(connectionLost, indctrs.serverError)
                    };
                } else {
                    indctrs = {
                        busy: busy,
                        connectionTrouble: connectionTrouble,
                        connectionLost: indctrs.connectionLostRedirect ? indctrs.connectionLostRedirect : connectionLost,
                        sessionExpired: indctrs.sessionExpiredRedirect ? indctrs.sessionExpiredRedirect : connectionLost,
                        serverError: connectionLost
                    };
                }
            }
        }
    };
    onLoad(window, function() {
        ice.onBeforeSubmit(function(source, isClientRequest) {
            if(isClientRequest){
                indctrs && on(indctrs.busy);
            }
        });
        ice.onBeforeUpdate(function() {
            indctrs && off(indctrs.busy);
        });
        ice.onNetworkError(function() {
            indctrs && on(indctrs.connectionLost);
        });
        ice.onServerError(function() {
            indctrs && on(indctrs.serverError);
        });
        ice.onSessionExpiry(function() {
            if (indctrs) {
                indctrs.connectionTrouble = NOOPIndicator;
                indctrs.connectionLost = NOOPIndicator;
                on(indctrs.sessionExpired);
            }
        });
        if (ice.push) {
            ice.onBlockingConnectionUnstable(function() {
                indctrs && on(indctrs.connectionTrouble);
            });
            ice.onBlockingConnectionLost(function() {
                indctrs && on(indctrs.connectionLost);
            });
        }
    });
})();
        namespace.DefaultIndicators = DefaultIndicators;
        namespace.ComponentIndicators = ComponentIndicators;
        window.setFocus = namespace.setFocus;
var iceSubmitPartial;
var iceSubmit;
var formOf;
(function() {
    iceSubmitPartial = function(form, component, evt) {
        form = form || formOf(component);
        ice.submit(evt, component || form, function(parameter) {
            if (Ice.Menu != null && Ice.Menu.menuContext != null) {
                parameter('ice.menuContext', Ice.Menu.menuContext);
            }
            parameter('ice.submit.partial', true);
        });
        return false;
    };
    iceSubmit = function(form, component, evt) {
        form = form || formOf(component);
        var code;
        if (evt.keyCode) code = evt.keyCode;
        else if (evt.which) code = evt.which;
        if (code > 3) {
            if (code != 13) {
                return false;
            }
        }
        ice.submit(evt, component || form, function(parameter) {
            if (Ice.Menu != null && Ice.Menu.menuContext != null) {
                parameter('ice.menuContext', Ice.Menu.menuContext);
            }
        });
        return false;
    };
    formOf = function(element) {
        var parent = element.parentNode;
        while (parent) {
            if (parent.tagName && parent.tagName.toLowerCase() == 'form') return parent;
            parent = parent.parentNode;
        }
        throw 'Cannot find enclosing form.';
    };
})();
        window.iceSubmitPartial = iceSubmitPartial;
        window.iceSubmit = iceSubmit;
        window.formOf = formOf;
        window.onLoad = namespace.onLoad;
        window.onUnload = namespace.onUnload;
        var compatLogger = namespace.log.childLogger(namespace.log, "compat");
        window.logger = {
            debug:  curry(namespace.log.debug, compatLogger),
            info:   curry(namespace.log.info, compatLogger),
            warn:   curry(namespace.log.warn, compatLogger),
            error:  curry(namespace.log.error, compatLogger),
            child:  function() {
                return window.logger;
            }
        };
        namespace.cancelEnterKeyEvent = function(e, element) {
            var ev = $event(e, element);
            if (isEnterKey(ev)) {
                cancel(ev);
            }
        };
    })(window.ice);
}
