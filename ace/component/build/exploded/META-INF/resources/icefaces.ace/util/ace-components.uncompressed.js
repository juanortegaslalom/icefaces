/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

// Constructor
ice.ace.radiobutton = function(clientId, options) {
    var groups = ice.ace.radiobutton.groups,
        groupId = options.groupId;
    if (groupId) {
        groups[groupId] = groups[groupId] || {};
        groups[groupId][clientId] = clientId;
    }
    this.options = options;

    // Selectors
    this.id = clientId;
    this.jqId = ice.ace.escapeClientId(clientId);
    this.spanSelector = this.jqId + " > span"
    this.innerSpanSelector = this.jqId + " > span > span"
    this.fieldSelector = this.jqId + " > input"
    this.buttonSelector = this.jqId + " > span > span > button"
    this.iconSelector = this.buttonSelector + " > span.ui-icon"

    // References
    this.button = ice.ace.jq(this.buttonSelector);
    this.icon = ice.ace.jq(this.iconSelector);
    var self = this;

    // Event Binding
    ice.ace.jq(this.jqId)
            .on("mouseenter", function() { self.addStateCSSClasses('hover'); })
            .on("mouseleave", function() { self.removeStateCSSClasses('hover') ; });

    if (!options.disabled)
        ice.ace.jq(this.jqId).on("click", function () {
			ice.ace.radiobutton.toggleOthers(self.options, self.id);
			self.toggleCheckbox(true);
        });

    if (options.ariaEnabled)
        ice.ace.jq(this.jqId).on("keypress", function() { self.onAriaKeypress(); });
		
	if (this.isChecked()) {
		this.addStateCSSClasses('checked');
		ice.ace.radiobutton.toggleOthers(this.options, this.id)
	} else {
		this.removeStateCSSClasses('checked');
	}

    var unload = function() {
        // Unload WidgetVar
        // Unload events
        ice.ace.jq(self.jqId).off("click mouseenter mouseleave keypress");
    }

    ice.onElementUpdate(this.id, unload);
};

ice.ace.radiobutton.prototype.isChecked = function() {
    return ice.ace.jq(this.fieldSelector).val() == 'true' ? true : false;
};

ice.ace.radiobutton.prototype.setChecked = function(bool) {
    ice.ace.jq(this.fieldSelector).val(bool == true ? 'true' : 'false');
};

ice.ace.radiobutton.prototype.addStateCSSClasses = function(state) {
    if (state == 'hover') {
        this.button.addClass('ui-state-hover');
    }
    else if (state == 'checked') {
		this.button.removeClass('ice-ace-radiobutton-unselected').addClass('ice-ace-radiobutton-selected');
        this.icon.removeClass('ui-icon-radio-off')
                 .addClass('ui-icon-radio-on');
    }
};

ice.ace.radiobutton.prototype.removeStateCSSClasses = function(state) {
    if (state == 'hover') {
        this.button.removeClass('ui-state-hover');
    }
    else if (state == 'checked') {
		this.button.removeClass('ice-ace-radiobutton-selected').addClass('ice-ace-radiobutton-unselected');
        this.icon.removeClass('ui-icon-radio-on')
                 .addClass('ui-icon-radio-off');
    }
};

ice.ace.radiobutton.prototype.onAriaKeypress = function (e) {
    var isSpace = e.keyCode == 32;
    var submittedValue = this.isChecked();

    if (isSpace) {
        var innerSpan = ice.ace.jq(this.innerSpanSelector);

        if (submittedValue) {
            innerSpan.attr("aria-checked", true);
        } else {
            innerSpan.attr("aria-checked", false);
        }
    }
}

ice.ace.radiobutton.prototype.toggleCheckbox = function (activeButton) {
    var newValue = !this.isChecked();
	if (activeButton) newValue = true;

    this.setChecked(newValue);
    if (newValue == true) this.addStateCSSClasses('checked');
    else this.removeStateCSSClasses('checked');

    if (this.options.ariaEnabled) {
        ice.ace.jq(this.innerSpanSelector).attr("aria-checked", newValue);
    }

	if (this.options.behaviors) {
		if (newValue == true) {
			if (this.options.behaviors.activate) {
				ice.ace.ab(ice.ace.extendAjaxArgs(
					this.options.behaviors.activate,
					{params: this.options.uiParams}
				));
			}
		} else {
			if (this.options.behaviors.deactivate) {
				ice.ace.ab(ice.ace.extendAjaxArgs(
					this.options.behaviors.deactivate,
					{params: this.options.uiParams}
				));
			}
		}
	}
};

if (!ice.ace.radiobutton.groups) ice.ace.radiobutton.groups = {};

ice.ace.radiobutton.toggleOthers = function (options, clientId) {
    var groups = ice.ace.radiobutton.groups,
        groupId = options.groupId,
        id, widget;
    if (groupId) {
        groups[groupId] = groups[groupId] || {};
        for (id in groups[groupId]) {
            if (groups[groupId].hasOwnProperty(id) && id != clientId) {
                widget = document.getElementById(id).widget;
                if (widget && widget.isChecked()) {
                    widget.toggleCheckbox();
                }
            }
        }
    }
};
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

// Constructor
ice.ace.checkboxbutton = function(clientId, options) {
    var groups = ice.ace.checkboxbutton.groups,
        groupId = options.groupId;
    if (groupId) {
        groups[groupId] = groups[groupId] || {};
        groups[groupId][clientId] = clientId;
    }
    this.options = options;

    // Selectors
    this.id = clientId;
    this.jqId = ice.ace.escapeClientId(clientId);
    this.spanSelector = this.jqId + " > span"
    this.innerSpanSelector = this.jqId + " > span > span"
    this.fieldSelector = this.jqId + " > input"
    this.buttonSelector = this.jqId + " > span > span > button"
    this.iconSelector = this.buttonSelector + " > span.ui-icon"

    // References
    this.button = ice.ace.jq(this.buttonSelector);
    this.icon = ice.ace.jq(this.iconSelector);
    var self = this,
        event = ice.ace.util.getEvent();

    // Event Binding
    ice.ace.jq(this.jqId)
            .on("mouseenter", function() { self.addStateCSSClasses('hover'); })
            .on("mouseleave", function() { self.removeStateCSSClasses('hover') ; });

    if (!options.disabled)
        ice.ace.jq(this.jqId).on("click", function () {
            self.toggleCheckbox();
            if (self.isChecked()) {
                ice.ace.checkboxbutton.toggleOthers(self.options, self.id)
            }
        });

    if (options.ariaEnabled)
        ice.ace.jq(this.jqId).on("keypress", function() { self.onAriaKeypress(); });

    // lazy init occuring via kb focus, set focus style since
    // our focus event won't be set up yet
    if (document.activeElement == this.button[0])
        this.addStateCSSClasses('hover');
    else if (event.type == "mouseover")
        this.addStateCSSClasses('hover');

    var unload = function() {
        // Unload WidgetVar
        // Unload events
        ice.ace.jq(self.jqId).off("click mouseenter mouseleave keypress");
    }

    ice.onElementUpdate(this.id, unload);
};

ice.ace.checkboxbutton.prototype.isChecked = function() {
    return ice.ace.jq(this.fieldSelector).val() == 'true' ? true : false;
};

ice.ace.checkboxbutton.prototype.setChecked = function(bool) {
    ice.ace.jq(this.fieldSelector).val(bool == true ? 'true' : 'false');
};

ice.ace.checkboxbutton.prototype.addStateCSSClasses = function(state) {
    if (state == 'hover') {
        this.button.addClass('ui-state-hover');
    }
    else if (state == 'checked') {
        this.button.addClass('ui-state-active');
        this.icon.removeClass('ui-icon-unchecked')
                 .addClass('ui-icon-check');
    }
};

ice.ace.checkboxbutton.prototype.removeStateCSSClasses = function(state) {
    if (state == 'hover') {
        this.button.removeClass('ui-state-hover');
    }
    else if (state == 'checked') {
        this.button.removeClass('ui-state-active');
        this.icon.removeClass('ui-icon-check')
                 .addClass('ui-icon-unchecked');
    }
};

ice.ace.checkboxbutton.prototype.onAriaKeypress = function (e) {
    var isSpace = e.keyCode == 32;
    var submittedValue = this.isChecked();

    if (isSpace) {
        var innerSpan = ice.ace.jq(this.innerSpanSelector);

        if (submittedValue) {
            innerSpan.attr("aria-checked", true);
        } else {
            innerSpan.attr("aria-checked", false);
        }
    }
}

ice.ace.checkboxbutton.prototype.toggleCheckbox = function (e) {
    var newValue = !this.isChecked();

    this.setChecked(newValue);
    if (newValue == true) this.addStateCSSClasses('checked');
    else this.removeStateCSSClasses('checked');

    if (this.options.ariaEnabled) {
        ice.ace.jq(this.innerSpanSelector).attr("aria-checked", newValue);
    }

    if (this.options.behaviors && this.options.behaviors.activate) {
        ice.ace.ab(ice.ace.extendAjaxArgs(
            this.options.behaviors.activate,
            {params: this.options.uiParams}
        ));
    }
};

ice.ace.checkboxbutton.groups = {};

ice.ace.checkboxbutton.toggleOthers = function (options, clientId) {
    var groups = ice.ace.checkboxbutton.groups,
        groupId = options.groupId,
        id, widget;
    if (groupId) {
        groups[groupId] = groups[groupId] || {};
        for (id in groups[groupId]) {
            if (groups[groupId].hasOwnProperty(id) && id != clientId) {
                widget = document.getElementById(id).widget;
                if (widget && widget.isChecked()) {
                    widget.toggleCheckbox();
                }
            }
        }
    }
};
/*
 * jQuery timepicker addon
 * By: Trent Richardson [http://trentrichardson.com]
 * Version 1.2
 * Last Modified: 02/02/2013
 *
 * Copyright 2013 Trent Richardson
 * You may use this project under MIT or GPL licenses.
 * http://trentrichardson.com/Impromptu/GPL-LICENSE.txt
 * http://trentrichardson.com/Impromptu/MIT-LICENSE.txt
 */

/*jslint evil: true, white: false, undef: false, nomen: false */

(function($) {

    /*
     * Lets not redefine timepicker, Prevent "Uncaught RangeError: Maximum call stack size exceeded"
     */
    $.ui.timepicker = $.ui.timepicker || {};
    if ($.ui.timepicker.version) {
        return;
    }

    /*
     * Extend jQueryUI, get it started with our version number
     */
    $.extend($.ui, {
        timepicker: {
            version: "1.2"
        }
    });

    /*
     * Timepicker manager.
     * Use the singleton instance of this class, $.timepicker, to interact with the time picker.
     * Settings for (groups of) time pickers are maintained in an instance object,
     * allowing multiple different settings on the same page.
     */
    var Timepicker = function() {
        this.regional = []; // Available regional settings, indexed by language code
        this.regional[''] = { // Default regional settings
            currentText: 'Now',
            closeText: 'Done',
            amNames: ['AM', 'A'],
            pmNames: ['PM', 'P'],
            timeFormat: 'HH:mm',
            timeSuffix: '',
            timeOnlyTitle: 'Choose Time',
            timeText: 'Time',
            hourText: 'Hour',
            minuteText: 'Minute',
            secondText: 'Second',
            millisecText: 'Millisecond',
            timezoneText: 'Time Zone',
            isRTL: false
        };
        this._defaults = { // Global defaults for all the datetime picker instances
            showButtonPanel: true,
            timeOnly: false,
            showHour: true,
            showMinute: true,
            showSecond: false,
            showMillisec: false,
            showTimezone: false,
            showTime: true,
            stepHour: 1,
            stepMinute: 1,
            stepSecond: 1,
            stepMillisec: 1,
            hour: 0,
            minute: 0,
            second: 0,
            millisec: 0,
            timezone: null,
            useLocalTimezone: false,
            defaultTimezone: "+0000",
            hourMin: 0,
            minuteMin: 0,
            secondMin: 0,
            millisecMin: 0,
            hourMax: 23,
            minuteMax: 59,
            secondMax: 59,
            millisecMax: 999,
            minDateTime: null,
            maxDateTime: null,
            onSelect: null,
            hourGrid: 0,
            minuteGrid: 0,
            secondGrid: 0,
            millisecGrid: 0,
            alwaysSetTime: true,
            separator: ' ',
            altFieldTimeOnly: true,
            altTimeFormat: null,
            altSeparator: null,
            altTimeSuffix: null,
            pickerTimeFormat: null,
            pickerTimeSuffix: null,
            showTimepicker: true,
            timezoneIso8601: false,
            timezoneList: null,
            addSliderAccess: false,
            sliderAccessArgs: null,
            controlType: 'slider',
            defaultValue: null,
            parse: 'strict'
        };
        $.extend(this._defaults, this.regional['']);
    };

    $.extend(Timepicker.prototype, {
        $input: null,
        $altInput: null,
        $timeObj: null,
        inst: null,
        hour_slider: null,
        minute_slider: null,
        second_slider: null,
        millisec_slider: null,
        timezone_select: null,
        hour: 0,
        minute: 0,
        second: 0,
        millisec: 0,
        timezone: null,
        defaultTimezone: "+0000",
        hourMinOriginal: null,
        minuteMinOriginal: null,
        secondMinOriginal: null,
        millisecMinOriginal: null,
        hourMaxOriginal: null,
        minuteMaxOriginal: null,
        secondMaxOriginal: null,
        millisecMaxOriginal: null,
        ampm: '',
        formattedDate: '',
        formattedTime: '',
        formattedDateTime: '',
        timezoneList: null,
        units: ['hour','minute','second','millisec'],
        control: null,

        /*
         * Override the default settings for all instances of the time picker.
         * @param  settings  object - the new settings to use as defaults (anonymous object)
         * @return the manager object
         */
        setDefaults: function(settings) {
            extendRemove(this._defaults, settings || {});
            return this;
        },

        /*
         * Create a new Timepicker instance
         */
        _newInst: function($input, o) {
            var tp_inst = new Timepicker(),
                inlineSettings = {},
                fns = {},
                overrides, i;

            for (var attrName in this._defaults) {
                if(this._defaults.hasOwnProperty(attrName)){
                    var attrValue = $input.attr('time:' + attrName);
                    if (attrValue) {
                        try {
                            inlineSettings[attrName] = eval(attrValue);
                        } catch (err) {
                            inlineSettings[attrName] = attrValue;
                        }
                    }
                }
            }
            overrides = {
                beforeShow: function (input, dp_inst) {
                    if ($.isFunction(tp_inst._defaults.evnts.beforeShow)) {
                        return tp_inst._defaults.evnts.beforeShow.call($input[0], input, dp_inst, tp_inst);
                    }
                },
                onChangeMonthYear: function (year, month, dp_inst) {
                    // Update the time as well : this prevents the time from disappearing from the $input field.
                    // ICE-9392
                    if (!(dp_inst.gotoToday && !dp_inst.settings.todayNowButtonsAlsoSelect) && !dp_inst.gotoPrevMo && !dp_inst.gotoNextMo) {
                        tp_inst._updateDateTime(dp_inst);
                    }
                    if ($.isFunction(tp_inst._defaults.evnts.onChangeMonthYear)) {
                        tp_inst._defaults.evnts.onChangeMonthYear.call($input[0], year, month, dp_inst, tp_inst);
                    }
                },
                onClose: function (dateText, dp_inst) {
                    if (tp_inst.timeDefined === true && $input.val() !== '') {
                        tp_inst._updateDateTime(dp_inst);
                    }
                    if ($.isFunction(tp_inst._defaults.evnts.onClose)) {
                        tp_inst._defaults.evnts.onClose.call($input[0], dateText, dp_inst, tp_inst);
                    }
                }
            };
            for (i in overrides) {
                if (overrides.hasOwnProperty(i)) {
                    fns[i] = o[i] || null;
                }
            }
            tp_inst._defaults = $.extend({}, this._defaults, inlineSettings, o, overrides, {
                evnts:fns,
                timepicker: tp_inst // add timepicker as a property of datepicker: $.datepicker._get(dp_inst, 'timepicker');
            });
            tp_inst.amNames = $.map(tp_inst._defaults.amNames, function(val) {
                return val.toUpperCase();
            });
            tp_inst.pmNames = $.map(tp_inst._defaults.pmNames, function(val) {
                return val.toUpperCase();
            });

            // controlType is string - key to our this._controls
            if(typeof(tp_inst._defaults.controlType) === 'string'){
                if($.fn[tp_inst._defaults.controlType] === undefined){
                    tp_inst._defaults.controlType = 'select';
                }
                tp_inst.control = tp_inst._controls[tp_inst._defaults.controlType];
            }
            // controlType is an object and must implement create, options, value methods
            else{
                tp_inst.control = tp_inst._defaults.controlType;
            }

            if (tp_inst._defaults.timezoneList === null) {
                var timezoneList = ['-1200', '-1100', '-1000', '-0930', '-0900', '-0800', '-0700', '-0600', '-0500', '-0430', '-0400', '-0330', '-0300', '-0200', '-0100', '+0000',
                    '+0100', '+0200', '+0300', '+0330', '+0400', '+0430', '+0500', '+0530', '+0545', '+0600', '+0630', '+0700', '+0800', '+0845', '+0900', '+0930',
                    '+1000', '+1030', '+1100', '+1130', '+1200', '+1245', '+1300', '+1400'];

                if (tp_inst._defaults.timezoneIso8601) {
                    timezoneList = $.map(timezoneList, function(val) {
                        return val == '+0000' ? 'Z' : (val.substring(0, 3) + ':' + val.substring(3));
                    });
                }
                tp_inst._defaults.timezoneList = timezoneList;
            }

            tp_inst.timezone = tp_inst._defaults.timezone;
            tp_inst.hour = tp_inst._defaults.hour < tp_inst._defaults.hourMin? tp_inst._defaults.hourMin :
                tp_inst._defaults.hour > tp_inst._defaults.hourMax? tp_inst._defaults.hourMax : tp_inst._defaults.hour;
            tp_inst.minute = tp_inst._defaults.minute < tp_inst._defaults.minuteMin? tp_inst._defaults.minuteMin :
                tp_inst._defaults.minute > tp_inst._defaults.minuteMax? tp_inst._defaults.minuteMax : tp_inst._defaults.minute;
            tp_inst.second = tp_inst._defaults.second < tp_inst._defaults.secondMin? tp_inst._defaults.secondMin :
                tp_inst._defaults.second > tp_inst._defaults.secondMax? tp_inst._defaults.secondMax : tp_inst._defaults.second;
            tp_inst.millisec = tp_inst._defaults.millisec < tp_inst._defaults.millisecMin? tp_inst._defaults.millisecMin :
                tp_inst._defaults.millisec > tp_inst._defaults.millisecMax? tp_inst._defaults.millisecMax : tp_inst._defaults.millisec;
            tp_inst.ampm = '';
            tp_inst.$input = $input;

            if (o.altField) {
                tp_inst.$altInput = $(o.altField).css({
                    cursor: 'pointer'
                }).focus(function() {
                        $input.trigger("focus");
                    });
            }

            if (tp_inst._defaults.minDate === 0 || tp_inst._defaults.minDateTime === 0) {
                tp_inst._defaults.minDate = new Date();
            }
            if (tp_inst._defaults.maxDate === 0 || tp_inst._defaults.maxDateTime === 0) {
                tp_inst._defaults.maxDate = new Date();
            }

            // datepicker needs minDate/maxDate, timepicker needs minDateTime/maxDateTime..
            if (tp_inst._defaults.minDate !== undefined && tp_inst._defaults.minDate instanceof Date) {
                tp_inst._defaults.minDateTime = new Date(tp_inst._defaults.minDate.getTime());
            }
            if (tp_inst._defaults.minDateTime !== undefined && tp_inst._defaults.minDateTime instanceof Date) {
                tp_inst._defaults.minDate = new Date(tp_inst._defaults.minDateTime.getTime());
            }
            if (tp_inst._defaults.maxDate !== undefined && tp_inst._defaults.maxDate instanceof Date) {
                tp_inst._defaults.maxDateTime = new Date(tp_inst._defaults.maxDate.getTime());
            }
            if (tp_inst._defaults.maxDateTime !== undefined && tp_inst._defaults.maxDateTime instanceof Date) {
                tp_inst._defaults.maxDate = new Date(tp_inst._defaults.maxDateTime.getTime());
            }
            tp_inst.$input.bind('focus', function() {
                tp_inst._onFocus();
            });

            return tp_inst;
        },

        /*
         * add our sliders to the calendar
         */
        _addTimePicker: function(dp_inst) {
            var currDT;
            if (this.$altInput) {
                if (this._defaults.altFieldTimeOnly) {
                    currDT = this.$input.val() + ' ' + this.$altInput.val();
                } else {
                    currDT = this.$altInput.val();
                }
            } else {
                currDT = this.$input.val();
            }

            this.timeDefined = this._parseTime(currDT);
            this._limitMinMaxDateTime(dp_inst, false);
            this._injectTimePicker();
        },

        /*
         * parse the time string from input value or _setTime
         */
        _parseTime: function(timeString, withDate) {
            if (!this.inst) {
                this.inst = $.datepicker._getInst(this.$input[0]);
            }

            if (withDate || !this._defaults.timeOnly) {
                var dp_dateFormat = $.datepicker._get(this.inst, 'dateFormat');
                try {
                    var parseRes = parseDateTimeInternal(dp_dateFormat, this._defaults.timeFormat, timeString, $.datepicker._getFormatConfig(this.inst), this._defaults);
                    if (!parseRes.timeObj) {
                        return false;
                    }
                    $.extend(this, parseRes.timeObj);
                } catch (err) {
                    $.timepicker.log("Error parsing the date/time string: " + err +
                        "\ndate/time string = " + timeString +
                        "\ntimeFormat = " + this._defaults.timeFormat +
                        "\ndateFormat = " + dp_dateFormat);
                    return false;
                }
                return true;
            } else {
                var timeObj = $.datepicker.parseTime(this._defaults.timeFormat, timeString, this._defaults);
                if (!timeObj) {
                    return false;
                }
                $.extend(this, timeObj);
                return true;
            }
        },

        /*
         * generate and inject html for timepicker into ui datepicker
         */
        _injectTimePicker: function() {
            var $dp = this.inst.dpDiv,
                o = this.inst.settings,
                tp_inst = this,
                litem = '',
                uitem = '',
                max = {},
                gridSize = {},
                size = null;

            // Prevent displaying twice
            if ($dp.find("div.ui-timepicker-div").length === 0 && o.showTimepicker) {
                var noDisplay = ' style="display:none;"',
                    html = '<div class="ui-timepicker-div'+ (o.isRTL? ' ui-timepicker-rtl' : '') +'"><dl>' + '<dt class="ui_tpicker_time_label"' + ((o.showTime) ? '' : noDisplay) + '>' + o.timeText + '</dt>' +
                        '<dd class="ui_tpicker_time"' + ((o.showTime) ? '' : noDisplay) + '></dd>';

                // Create the markup
                for(var i=0,l=this.units.length; i<l; i++){
                    litem = this.units[i];
                    uitem = litem.substr(0,1).toUpperCase() + litem.substr(1);
                    // Added by Peter Medeiros:
                    // - Figure out what the hour/minute/second max should be based on the step values.
                    // - Example: if stepMinute is 15, then minMax is 45.
                    max[litem] = parseInt((o[litem+'Max'] - ((o[litem+'Max'] - o[litem+'Min']) % o['step'+uitem])), 10);
                    gridSize[litem] = 0;

                    html += '<dt class="ui_tpicker_'+ litem +'_label"' + ((o['show'+uitem]) ? '' : noDisplay) + '>' + o[litem +'Text'] + '</dt>' +
                        '<dd class="ui_tpicker_'+ litem +'"><div class="ui_tpicker_'+ litem +'_slider"' + ((o['show'+uitem]) ? '' : noDisplay) + '></div>';

                    if (o['show'+uitem] && o[litem+'Grid'] > 0) {
                        html += '<div style="padding-left: 1px"><table class="ui-tpicker-grid-label"><tr>';

                        if(litem == 'hour'){
                            for (var h = o[litem+'Min']; h <= max[litem]; h += parseInt(o[litem+'Grid'], 10)) {
                                gridSize[litem]++;
                                var tmph = $.datepicker.formatTime(useAmpm(o.pickerTimeFormat || o.timeFormat)? 'hht':'HH', {hour:h}, o);
                                html += '<td data-for="'+litem+'">' + tmph + '</td>';
                            }
                        }
                        else{
                            for (var m = o[litem+'Min']; m <= max[litem]; m += parseInt(o[litem+'Grid'], 10)) {
                                gridSize[litem]++;
                                html += '<td data-for="'+litem+'">' + ((m < 10) ? '0' : '') + m + '</td>';
                            }
                        }

                        html += '</tr></table></div>';
                    }
                    html += '</dd>';
                }

                // Timezone
                html += '<dt class="ui_tpicker_timezone_label"' + ((o.showTimezone) ? '' : noDisplay) + '>' + o.timezoneText + '</dt>';
                html += '<dd class="ui_tpicker_timezone" ' + ((o.showTimezone) ? '' : noDisplay) + '></dd>';

                // Create the elements from string
                html += '</dl></div>';
                var $tp = $(html);

                // if we only want time picker...
                if (o.timeOnly === true) {
                    $tp.prepend('<div class="ui-widget-header ui-helper-clearfix ui-corner-all">' + '<div class="ui-datepicker-title">' + o.timeOnlyTitle + '</div>' + '</div>');
                    $dp.find('.ui-datepicker-header, .ui-datepicker-calendar').hide();
                }

                // add sliders, adjust grids, add events
                for(var i=0,l=tp_inst.units.length; i<l; i++){
                    litem = tp_inst.units[i];
                    uitem = litem.substr(0,1).toUpperCase() + litem.substr(1);

                    // add the slider
                    tp_inst[litem+'_slider'] = tp_inst.control.create(tp_inst, $tp.find('.ui_tpicker_'+litem+'_slider'), litem, tp_inst[litem], o[litem+'Min'], max[litem], o['step'+uitem]);

                    // adjust the grid and add click event
                    if (o['show'+uitem] && o[litem+'Grid'] > 0) {
                        size = 100 * gridSize[litem] * o[litem+'Grid'] / (max[litem] - o[litem+'Min']);
                        $tp.find('.ui_tpicker_'+litem+' table').css({
                            width: size + "%",
                            marginLeft: o.isRTL? '0' : ((size / (-2 * gridSize[litem])) + "%"),
                            marginRight: o.isRTL? ((size / (-2 * gridSize[litem])) + "%") : '0',
                            borderCollapse: 'collapse'
                        }).find("td").click(function(e){
                                var $t = $(this),
                                    h = $t.html(),
                                    n = parseInt(h.replace(/[^0-9]/g),10),
                                    ap = h.replace(/[^apm]/ig),
                                    f = $t.data('for'); // loses scope, so we use data-for

                                if(f == 'hour'){
                                    if(ap.indexOf('p') !== -1 && n < 12){
                                        n += 12;
                                    }
                                    else{
                                        if(ap.indexOf('a') !== -1 && n === 12){
                                            n = 0;
                                        }
                                    }
                                }

                                tp_inst.control.value(tp_inst, tp_inst[f+'_slider'], litem, n);

                                tp_inst._onTimeChange();
                                tp_inst._onSelectHandler();
                            })
                            .css({
                                cursor: 'pointer',
                                width: (100 / gridSize[litem]) + '%',
                                textAlign: 'center',
                                overflow: 'hidden'
                            });
                    } // end if grid > 0
                } // end for loop

                // Add timezone options
                this.timezone_select = $tp.find('.ui_tpicker_timezone').append('<select></select>').find("select");
                $.fn.append.apply(this.timezone_select,
                    $.map(o.timezoneList, function(val, idx) {
                        return $("<option />").val(typeof val == "object" ? val.value : val).text(typeof val == "object" ? val.label : val);
                    }));
                if (typeof(this.timezone) != "undefined" && this.timezone !== null && this.timezone !== "") {
                    var local_date = new Date(this.inst.selectedYear, this.inst.selectedMonth, this.inst.selectedDay, 12);
                    var local_timezone = $.timepicker.timeZoneOffsetString(local_date);
                    if (local_timezone == this.timezone) {
                        selectLocalTimeZone(tp_inst);
                    } else {
                        this.timezone_select.val(this.timezone);
                    }
                } else {
                    if (typeof(this.hour) != "undefined" && this.hour !== null && this.hour !== "") {
                        this.timezone_select.val(o.defaultTimezone);
                    } else {
                        selectLocalTimeZone(tp_inst);
                    }
                }
                this.timezone_select.change(function() {
                    tp_inst._defaults.useLocalTimezone = false;
                    tp_inst._onTimeChange();
                    tp_inst._onSelectHandler();
                });
                // End timezone options

                // inject timepicker into datepicker
                var $buttonPanel = $dp.find('.ui-datepicker-buttonpane');
                if ($buttonPanel.length) {
                    $buttonPanel.before($tp);
                } else {
                    $dp.append($tp);
                }

                this.$timeObj = $tp.find('.ui_tpicker_time');

                if (this.inst !== null) {
                    var timeDefined = this.timeDefined;
                    this._onTimeChange();
                    this.timeDefined = timeDefined;
                }

                // slideAccess integration: http://trentrichardson.com/2011/11/11/jquery-ui-sliders-and-touch-accessibility/
                if (this._defaults.addSliderAccess) {
                    var sliderAccessArgs = this._defaults.sliderAccessArgs,
                        rtl = this._defaults.isRTL;
                    sliderAccessArgs.isRTL = rtl;

                    setTimeout(function() { // fix for inline mode
                        if ($tp.find('.ui-slider-access').length === 0) {
                            $tp.find('.ui-slider:visible').sliderAccess(sliderAccessArgs);

                            // fix any grids since sliders are shorter
                            var sliderAccessWidth = $tp.find('.ui-slider-access:eq(0)').outerWidth(true);
                            if (sliderAccessWidth) {
                                $tp.find('table:visible').each(function() {
                                    var $g = $(this),
                                        oldWidth = $g.outerWidth(),
                                        oldMarginLeft = $g.css(rtl? 'marginRight':'marginLeft').toString().replace('%', ''),
                                        newWidth = oldWidth - sliderAccessWidth,
                                        newMarginLeft = ((oldMarginLeft * newWidth) / oldWidth) + '%',
                                        css = { width: newWidth, marginRight: 0, marginLeft: 0 };
                                    css[rtl? 'marginRight':'marginLeft'] = newMarginLeft;
                                    $g.css(css);
                                });
                            }
                        }
                    }, 10);
                }
                // end slideAccess integration

            }
        },

        /*
         * This function tries to limit the ability to go outside the
         * min/max date range
         */
        _limitMinMaxDateTime: function(dp_inst, adjustSliders) {
            var o = this._defaults,
                dp_date = new Date(dp_inst.selectedYear, dp_inst.selectedMonth, dp_inst.selectedDay);

            if (!this._defaults.showTimepicker) {
                return;
            } // No time so nothing to check here

            if ($.datepicker._get(dp_inst, 'minDateTime') !== null && $.datepicker._get(dp_inst, 'minDateTime') !== undefined && dp_date) {
                var minDateTime = $.datepicker._get(dp_inst, 'minDateTime'),
                    minDateTimeDate = new Date(minDateTime.getFullYear(), minDateTime.getMonth(), minDateTime.getDate(), 0, 0, 0, 0);

                if (this.hourMinOriginal === null || this.minuteMinOriginal === null || this.secondMinOriginal === null || this.millisecMinOriginal === null) {
                    this.hourMinOriginal = o.hourMin;
                    this.minuteMinOriginal = o.minuteMin;
                    this.secondMinOriginal = o.secondMin;
                    this.millisecMinOriginal = o.millisecMin;
                }

                if (dp_inst.settings.timeOnly || minDateTimeDate.getTime() == dp_date.getTime()) {
                    this._defaults.hourMin = minDateTime.getHours();
                    if (this.hour <= this._defaults.hourMin) {
                        this.hour = this._defaults.hourMin;
                        this._defaults.minuteMin = minDateTime.getMinutes();
                        if (this.minute <= this._defaults.minuteMin) {
                            this.minute = this._defaults.minuteMin;
                            this._defaults.secondMin = minDateTime.getSeconds();
                            if (this.second <= this._defaults.secondMin) {
                                this.second = this._defaults.secondMin;
                                this._defaults.millisecMin = minDateTime.getMilliseconds();
                            } else {
                                if (this.millisec < this._defaults.millisecMin) {
                                    this.millisec = this._defaults.millisecMin;
                                }
                                this._defaults.millisecMin = this.millisecMinOriginal;
                            }
                        } else {
                            this._defaults.secondMin = this.secondMinOriginal;
                            this._defaults.millisecMin = this.millisecMinOriginal;
                        }
                    } else {
                        this._defaults.minuteMin = this.minuteMinOriginal;
                        this._defaults.secondMin = this.secondMinOriginal;
                        this._defaults.millisecMin = this.millisecMinOriginal;
                    }
                } else {
                    this._defaults.hourMin = this.hourMinOriginal;
                    this._defaults.minuteMin = this.minuteMinOriginal;
                    this._defaults.secondMin = this.secondMinOriginal;
                    this._defaults.millisecMin = this.millisecMinOriginal;
                }
            }

            if ($.datepicker._get(dp_inst, 'maxDateTime') !== null && $.datepicker._get(dp_inst, 'maxDateTime') !== undefined && dp_date) {
                var maxDateTime = $.datepicker._get(dp_inst, 'maxDateTime'),
                    maxDateTimeDate = new Date(maxDateTime.getFullYear(), maxDateTime.getMonth(), maxDateTime.getDate(), 0, 0, 0, 0);

                if (this.hourMaxOriginal === null || this.minuteMaxOriginal === null || this.secondMaxOriginal === null) {
                    this.hourMaxOriginal = o.hourMax;
                    this.minuteMaxOriginal = o.minuteMax;
                    this.secondMaxOriginal = o.secondMax;
                    this.millisecMaxOriginal = o.millisecMax;
                }

                if (dp_inst.settings.timeOnly || maxDateTimeDate.getTime() == dp_date.getTime()) {
                    this._defaults.hourMax = maxDateTime.getHours();
                    if (this.hour >= this._defaults.hourMax) {
                        this.hour = this._defaults.hourMax;
                        this._defaults.minuteMax = maxDateTime.getMinutes();
                        if (this.minute >= this._defaults.minuteMax) {
                            this.minute = this._defaults.minuteMax;
                            this._defaults.secondMax = maxDateTime.getSeconds();
                            if (this.second >= this._defaults.secondMax) {
                                this.second = this._defaults.secondMax;
                                this._defaults.millisecMax = maxDateTime.getMilliseconds();
                            } else {
                                if (this.millisec > this._defaults.millisecMax) {
                                    this.millisec = this._defaults.millisecMax;
                                }
                                this._defaults.millisecMax = this.millisecMaxOriginal;
                            }
                        } else {
                            this._defaults.secondMax = this.secondMaxOriginal;
                            this._defaults.millisecMax = this.millisecMaxOriginal;
                        }
                    } else {
                        this._defaults.minuteMax = this.minuteMaxOriginal;
                        this._defaults.secondMax = this.secondMaxOriginal;
                        this._defaults.millisecMax = this.millisecMaxOriginal;
                    }
                } else {
                    this._defaults.hourMax = this.hourMaxOriginal;
                    this._defaults.minuteMax = this.minuteMaxOriginal;
                    this._defaults.secondMax = this.secondMaxOriginal;
                    this._defaults.millisecMax = this.millisecMaxOriginal;
                }
            }

            if (adjustSliders !== undefined && adjustSliders === true) {
                var hourMax = parseInt((this._defaults.hourMax - ((this._defaults.hourMax - this._defaults.hourMin) % this._defaults.stepHour)), 10),
                    minMax = parseInt((this._defaults.minuteMax - ((this._defaults.minuteMax - this._defaults.minuteMin) % this._defaults.stepMinute)), 10),
                    secMax = parseInt((this._defaults.secondMax - ((this._defaults.secondMax - this._defaults.secondMin) % this._defaults.stepSecond)), 10),
                    millisecMax = parseInt((this._defaults.millisecMax - ((this._defaults.millisecMax - this._defaults.millisecMin) % this._defaults.stepMillisec)), 10);

                if (this.hour_slider) {
                    this.control.options(this, this.hour_slider, 'hour', { min: this._defaults.hourMin, max: hourMax });
                    this.control.value(this, this.hour_slider, 'hour', this.hour - (this.hour % this._defaults.stepHour));
                }
                if (this.minute_slider) {
                    this.control.options(this, this.minute_slider, 'minute', { min: this._defaults.minuteMin, max: minMax });
                    this.control.value(this, this.minute_slider, 'minute', this.minute - (this.minute % this._defaults.stepMinute));
                }
                if (this.second_slider) {
                    this.control.options(this, this.second_slider, 'second', { min: this._defaults.secondMin, max: secMax });
                    this.control.value(this, this.second_slider, 'second', this.second - (this.second % this._defaults.stepSecond));
                }
                if (this.millisec_slider) {
                    this.control.options(this, this.millisec_slider, 'millisec', { min: this._defaults.millisecMin, max: millisecMax });
                    this.control.value(this, this.millisec_slider, 'millisec', this.millisec - (this.millisec % this._defaults.stepMillisec));
                }
            }

        },

        /*
         * when a slider moves, set the internal time...
         * on time change is also called when the time is updated in the text field
         */
        _onTimeChange: function() {
            var hour = (this.hour_slider) ? this.control.value(this, this.hour_slider, 'hour') : false,
                minute = (this.minute_slider) ? this.control.value(this, this.minute_slider, 'minute') : false,
                second = (this.second_slider) ? this.control.value(this, this.second_slider, 'second') : false,
                millisec = (this.millisec_slider) ? this.control.value(this, this.millisec_slider, 'millisec') : false,
                timezone = (this.timezone_select) ? this.timezone_select.val() : false,
                o = this._defaults,
                pickerTimeFormat = o.pickerTimeFormat || o.timeFormat,
                pickerTimeSuffix = o.pickerTimeSuffix || o.timeSuffix;

            if (typeof(hour) == 'object') {
                hour = false;
            }
            if (typeof(minute) == 'object') {
                minute = false;
            }
            if (typeof(second) == 'object') {
                second = false;
            }
            if (typeof(millisec) == 'object') {
                millisec = false;
            }
            if (typeof(timezone) == 'object') {
                timezone = false;
            }

            if (hour !== false) {
                hour = parseInt(hour, 10);
            }
            if (minute !== false) {
                minute = parseInt(minute, 10);
            }
            if (second !== false) {
                second = parseInt(second, 10);
            }
            if (millisec !== false) {
                millisec = parseInt(millisec, 10);
            }

            var ampm = o[hour < 12 ? 'amNames' : 'pmNames'][0];

            // If the update was done in the input field, the input field should not be updated.
            // If the update was done using the sliders, update the input field.
            var hasChanged = (hour != this.hour || minute != this.minute || second != this.second || millisec != this.millisec
                || (this.ampm.length > 0 && (hour < 12) != ($.inArray(this.ampm.toUpperCase(), this.amNames) !== -1))
                || ((this.timezone === null && timezone != this.defaultTimezone) || (this.timezone !== null && timezone != this.timezone)));

            if (hasChanged) {

                if (hour !== false) {
                    this.hour = hour;
                }
                if (minute !== false) {
                    this.minute = minute;
                }
                if (second !== false) {
                    this.second = second;
                }
                if (millisec !== false) {
                    this.millisec = millisec;
                }
                if (timezone !== false) {
                    this.timezone = timezone;
                }

                if (!this.inst) {
                    this.inst = $.datepicker._getInst(this.$input[0]);
                }

                this._limitMinMaxDateTime(this.inst, true);
            }
            if (useAmpm(o.timeFormat)) {
                this.ampm = ampm;
            }

            // Updates the time within the timepicker
            this.formattedTime = $.datepicker.formatTime(o.timeFormat, this, o);
            if (this.$timeObj) {
                if(pickerTimeFormat === o.timeFormat){
                    this.$timeObj.text(this.formattedTime + pickerTimeSuffix);
                }
                else{
                    this.$timeObj.text($.datepicker.formatTime(pickerTimeFormat, this, o) + pickerTimeSuffix);
                }
            }

            this.timeDefined = true;
            // ICE-9392
            if (hasChanged && !(this.inst.gotoToday && !this.inst.settings.todayNowButtonsAlsoSelect)) {
                this._updateDateTime();
            }
        },

        /*
         * call custom onSelect.
         * bind to sliders slidestop, and grid click.
         */
        _onSelectHandler: function() {
            var onSelect = this._defaults.onSelect || this.inst.settings.onSelect;
            var inputEl = this.$input ? this.$input[0] : null;
            if (onSelect && inputEl) {
                onSelect.apply(inputEl, [this.formattedDateTime, this]);
            }
        },

        /*
         * update our input with the new date time..
         */
        _updateDateTime: function(dp_inst) {
            dp_inst = this.inst || dp_inst;
            var dt = $.datepicker._daylightSavingAdjust(new Date(dp_inst.selectedYear, dp_inst.selectedMonth, dp_inst.selectedDay)),
                dateFmt = $.datepicker._get(dp_inst, 'dateFormat'),
                formatCfg = $.datepicker._getFormatConfig(dp_inst),
                timeAvailable = dt !== null && this.timeDefined;
            this.formattedDate = $.datepicker.formatDate(dateFmt, (dt === null ? new Date() : dt), formatCfg);
            var formattedDateTime = this.formattedDate;

            // if a slider was changed but datepicker doesn't have a value yet, set it
            if(dp_inst.lastVal==""){
                dp_inst.currentYear=dp_inst.selectedYear;
                dp_inst.currentMonth=dp_inst.selectedMonth;
                dp_inst.currentDay=dp_inst.selectedDay;
            }

            /*
             * remove following lines to force every changes in date picker to change the input value
             * Bug descriptions: when an input field has a default value, and click on the field to pop up the date picker.
             * If the user manually empty the value in the input field, the date picker will never change selected value.
             */
            //if (dp_inst.lastVal !== undefined && (dp_inst.lastVal.length > 0 && this.$input.val().length === 0)) {
            //	return;
            //}

            if (this._defaults.timeOnly === true) {
                formattedDateTime = this.formattedTime;
            } else if (this._defaults.timeOnly !== true && (this._defaults.alwaysSetTime || timeAvailable)) {
                formattedDateTime += this._defaults.separator + this.formattedTime + this._defaults.timeSuffix;
            }

            this.formattedDateTime = formattedDateTime;

            if (!this._defaults.showTimepicker) {
                this.$input.val(this.formattedDate);
            } else if (this.$altInput && this._defaults.altFieldTimeOnly === true) {
                this.$altInput.val(this.formattedTime);
                this.$input.val(this.formattedDate);
            } else if (this.$altInput) {
                this.$input.val(formattedDateTime);
                var altFormattedDateTime = '',
                    altSeparator = this._defaults.altSeparator ? this._defaults.altSeparator : this._defaults.separator,
                    altTimeSuffix = this._defaults.altTimeSuffix ? this._defaults.altTimeSuffix : this._defaults.timeSuffix;

                if (this._defaults.altFormat) altFormattedDateTime = $.datepicker.formatDate(this._defaults.altFormat, (dt === null ? new Date() : dt), formatCfg);
                else altFormattedDateTime = this.formattedDate;
                if (altFormattedDateTime) altFormattedDateTime += altSeparator;
                if (this._defaults.altTimeFormat) altFormattedDateTime += $.datepicker.formatTime(this._defaults.altTimeFormat, this, this._defaults) + altTimeSuffix;
                else altFormattedDateTime += this.formattedTime + altTimeSuffix;
                this.$altInput.val(altFormattedDateTime);
            } else {
                this.$input.val(formattedDateTime);
            }

            this.$input.trigger("change");
        },

        _onFocus: function() {
            if (!this.$input.val() && this._defaults.defaultValue) {
                this.$input.val(this._defaults.defaultValue);
                var inst = $.datepicker._getInst(this.$input.get(0)),
                    tp_inst = $.datepicker._get(inst, 'timepicker');
                if (tp_inst) {
                    if (tp_inst._defaults.timeOnly && (inst.input.val() != inst.lastVal)) {
                        try {
                            $.datepicker._updateDatepicker(inst);
                        } catch (err) {
                            $.timepicker.log(err);
                        }
                    }
                }
            }
        },

        /*
         * Small abstraction to control types
         * We can add more, just be sure to follow the pattern: create, options, value
         */
        _controls: {
            // slider methods
            slider: {
                create: function(tp_inst, obj, unit, val, min, max, step){
                    var rtl = tp_inst._defaults.isRTL; // if rtl go -60->0 instead of 0->60
                    return obj.prop('slide', null).slider({
                        orientation: "horizontal",
                        value: rtl? val*-1 : val,
                        min: rtl? max*-1 : min,
                        max: rtl? min*-1 : max,
                        step: step,
                        slide: function(event, ui) {
                            tp_inst.control.value(tp_inst, $(this), unit, rtl? ui.value*-1:ui.value);
                            tp_inst._onTimeChange();
                        },
                        stop: function(event, ui) {
                            tp_inst._onSelectHandler();
                        }
                    });
                },
                options: function(tp_inst, obj, unit, opts, val){
                    if(tp_inst._defaults.isRTL){
                        if(typeof(opts) == 'string'){
                            if(opts == 'min' || opts == 'max'){
                                if(val !== undefined)
                                    return obj.slider(opts, val*-1);
                                return Math.abs(obj.slider(opts));
                            }
                            return obj.slider(opts);
                        }
                        var min = opts.min,
                            max = opts.max;
                        opts.min = opts.max = null;
                        if(min !== undefined)
                            opts.max = min * -1;
                        if(max !== undefined)
                            opts.min = max * -1;
                        return obj.slider(opts);
                    }
                    if(typeof(opts) == 'string' && val !== undefined)
                        return obj.slider(opts, val);
                    return obj.slider(opts);
                },
                value: function(tp_inst, obj, unit, val){
                    if(tp_inst._defaults.isRTL){
                        if(val !== undefined)
                            return obj.slider('value', val*-1);
                        return Math.abs(obj.slider('value'));
                    }
                    if(val !== undefined)
                        return obj.slider('value', val);
                    return obj.slider('value');
                }
            },
            // select methods
            select: {
                create: function(tp_inst, obj, unit, val, min, max, step){
                    var sel = '<select class="ui-timepicker-select" data-unit="'+ unit +'" data-min="'+ min +'" data-max="'+ max +'" data-step="'+ step +'">',
                        ul = tp_inst._defaults.timeFormat.indexOf('t') !== -1? 'toLowerCase':'toUpperCase',
                        m = 0;

                    for(var i=min; i<=max; i+=step){
                        sel += '<option value="'+ i +'"'+ (i==val? ' selected':'') +'>';
                        if(unit == 'hour' && useAmpm(tp_inst._defaults.pickerTimeFormat || tp_inst._defaults.timeFormat))
                            sel += $.datepicker.formatTime("hh TT", {hour:i}, tp_inst._defaults);
                        else if(unit == 'millisec' || i >= 10) sel += i;
                        else sel += '0'+ i.toString();
                        sel += '</option>';
                    }
                    sel += '</select>';

                    obj.children('select').remove();

                    $(sel).appendTo(obj).change(function(e){
                        tp_inst._onTimeChange();
                        tp_inst._onSelectHandler();
                    });

                    return obj;
                },
                options: function(tp_inst, obj, unit, opts, val){
                    var o = {},
                        $t = obj.children('select');
                    if(typeof(opts) == 'string'){
                        if(val === undefined)
                            return $t.data(opts);
                        o[opts] = val;
                    }
                    else o = opts;
                    return tp_inst.control.create(tp_inst, obj, $t.data('unit'), $t.val(), o.min || $t.data('min'), o.max || $t.data('max'), o.step || $t.data('step'));
                },
                value: function(tp_inst, obj, unit, val){
                    var $t = obj.children('select');
                    if(val !== undefined)
                        return $t.val(val);
                    return $t.val();
                }
            }
        } // end _controls

    });

    $.fn.extend({
        /*
         * shorthand just to use timepicker..
         */
        timepicker: function(o) {
            o = o || {};
            var tmp_args = Array.prototype.slice.call(arguments);

            if (typeof o == 'object') {
                tmp_args[0] = $.extend(o, {
                    timeOnly: true
                });
            }

            return $(this).each(function() {
                $.fn.datetimepicker.apply($(this), tmp_args);
            });
        },

        /*
         * extend timepicker to datepicker
         */
        datetimepicker: function(o) {
            o = o || {};
            var tmp_args = arguments;

            if (typeof(o) == 'string') {
                if (o == 'getDate') {
                    return $.fn.datepicker.apply($(this[0]), tmp_args);
                } else {
                    return this.each(function() {
                        var $t = $(this);
                        $t.datepicker.apply($t, tmp_args);
                    });
                }
            } else {
                return this.each(function() {
                    var $t = $(this);
                    $t.datepicker($.timepicker._newInst($t, o)._defaults);
                });
            }
        }
    });

    /*
     * Public Utility to parse date and time
     */
    $.datepicker.parseDateTime = function(dateFormat, timeFormat, dateTimeString, dateSettings, timeSettings) {
        var parseRes = parseDateTimeInternal(dateFormat, timeFormat, dateTimeString, dateSettings, timeSettings);
        if (parseRes.timeObj) {
            var t = parseRes.timeObj;
            parseRes.date.setHours(t.hour, t.minute, t.second, t.millisec);
        }

        return parseRes.date;
    };

    /*
     * Public utility to parse time
     */
    $.datepicker.parseTime = function(timeFormat, timeString, options) {
        var o = extendRemove(extendRemove({}, $.timepicker._defaults), options || {});

        // Strict parse requires the timeString to match the timeFormat exactly
        var strictParse = function(f, s, o){

            // pattern for standard and localized AM/PM markers
            var getPatternAmpm = function(amNames, pmNames) {
                var markers = [];
                if (amNames) {
                    $.merge(markers, amNames);
                }
                if (pmNames) {
                    $.merge(markers, pmNames);
                }
                markers = $.map(markers, function(val) {
                    return val.replace(/[.*+?|()\[\]{}\\]/g, '\\$&');
                });
                return '(' + markers.join('|') + ')?';
            };

            // figure out position of time elements.. cause js cant do named captures
            var getFormatPositions = function(timeFormat) {
                var finds = timeFormat.toLowerCase().match(/(h{1,2}|m{1,2}|s{1,2}|l{1}|t{1,2}|z|'.*?')/g),
                    orders = {
                        h: -1,
                        m: -1,
                        s: -1,
                        l: -1,
                        t: -1,
                        z: -1
                    };

                if (finds) {
                    for (var i = 0; i < finds.length; i++) {
                        if (orders[finds[i].toString().charAt(0)] == -1) {
                            orders[finds[i].toString().charAt(0)] = i + 1;
                        }
                    }
                }
                return orders;
            };

            var regstr = '^' + f.toString()
                    .replace(/([hH]{1,2}|mm?|ss?|[tT]{1,2}|[lz]|'.*?')/g, function (match) {
                        var ml = match.length;
                        switch (match.charAt(0).toLowerCase()) {
                            case 'h': return ml === 1? '(\\d?\\d)':'(\\d{'+ml+'})';
                            case 'm': return ml === 1? '(\\d?\\d)':'(\\d{'+ml+'})';
                            case 's': return ml === 1? '(\\d?\\d)':'(\\d{'+ml+'})';
                            case 'l': return '(\\d?\\d?\\d)';
                            case 'z': return '(z|[-+]\\d\\d:?\\d\\d|\\S+)?';
                            case 't': return getPatternAmpm(o.amNames, o.pmNames);
                            default:    // literal escaped in quotes
                                return '(' + match.replace(/\'/g, "").replace(/(\.|\$|\^|\\|\/|\(|\)|\[|\]|\?|\+|\*)/g, function (m) { return "\\" + m; }) + ')?';
                        }
                    })
                    .replace(/\s/g, '\\s?') +
                    o.timeSuffix + '$',
                order = getFormatPositions(f),
                ampm = '',
                treg;

            treg = s.match(new RegExp(regstr, 'i'));

            var resTime = {
                hour: 0,
                minute: 0,
                second: 0,
                millisec: 0
            };

            if (treg) {
                if (order.t !== -1) {
                    if (treg[order.t] === undefined || treg[order.t].length === 0) {
                        ampm = '';
                        resTime.ampm = '';
                    } else {
                        ampm = $.inArray(treg[order.t].toUpperCase(), o.amNames) !== -1 ? 'AM' : 'PM';
                        resTime.ampm = o[ampm == 'AM' ? 'amNames' : 'pmNames'][0];
                    }
                }

                if (order.h !== -1) {
                    if (ampm == 'AM' && treg[order.h] == '12') {
                        resTime.hour = 0; // 12am = 0 hour
                    } else {
                        if (ampm == 'PM' && treg[order.h] != '12') {
                            resTime.hour = parseInt(treg[order.h], 10) + 12; // 12pm = 12 hour, any other pm = hour + 12
                        } else {
                            resTime.hour = Number(treg[order.h]);
                        }
                    }
                }

                if (order.m !== -1) {
                    resTime.minute = Number(treg[order.m]);
                }
                if (order.s !== -1) {
                    resTime.second = Number(treg[order.s]);
                }
                if (order.l !== -1) {
                    resTime.millisec = Number(treg[order.l]);
                }
                if (order.z !== -1 && treg[order.z] !== undefined) {
                    var tz = treg[order.z].toUpperCase();
                    switch (tz.length) {
                        case 1:
                            // Z
                            tz = o.timezoneIso8601 ? 'Z' : '+0000';
                            break;
                        case 5:
                            // +hhmm
                            if (o.timezoneIso8601) {
                                tz = tz.substring(1) == '0000' ? 'Z' : tz.substring(0, 3) + ':' + tz.substring(3);
                            }
                            break;
                        case 6:
                            // +hh:mm
                            if (!o.timezoneIso8601) {
                                tz = tz == 'Z' || tz.substring(1) == '00:00' ? '+0000' : tz.replace(/:/, '');
                            } else {
                                if (tz.substring(1) == '00:00') {
                                    tz = 'Z';
                                }
                            }
                            break;
                    }
                    resTime.timezone = tz;
                }


                return resTime;
            }
            return false;
        };// end strictParse

        // First try JS Date, if that fails, use strictParse
        var looseParse = function(f,s,o){
            try{
                var d = new Date('2012-01-01 '+ s);
                if(isNaN(d.getTime())){
                    d = new Date('2012-01-01T'+ s);
                    if(isNaN(d.getTime())){
                        d = new Date('01/01/2012 '+ s);
                        if(isNaN(d.getTime())){
                            throw "Unable to parse time with native Date: "+ s;
                        }
                    }
                }

                return {
                    hour: d.getHours(),
                    minute: d.getMinutes(),
                    second: d.getSeconds(),
                    millisec: d.getMilliseconds(),
                    timezone: $.timepicker.timeZoneOffsetString(d)
                };
            }
            catch(err){
                try{
                    return strictParse(f,s,o);
                }
                catch(err2){
                    $.timepicker.log("Unable to parse \ntimeString: "+ s +"\ntimeFormat: "+ f);
                }
            }
            return false;
        }; // end looseParse

        if(typeof o.parse === "function"){
            return o.parse(timeFormat, timeString, o)
        }
        if(o.parse === 'loose'){
            return looseParse(timeFormat, timeString, o);
        }
        return strictParse(timeFormat, timeString, o);
    };

    /*
     * Public utility to format the time
     * format = string format of the time
     * time = a {}, not a Date() for timezones
     * options = essentially the regional[].. amNames, pmNames, ampm
     */
    $.datepicker.formatTime = function(format, time, options) {
        options = options || {};
        options = $.extend({}, $.timepicker._defaults, options);
        time = $.extend({
            hour: 0,
            minute: 0,
            second: 0,
            millisec: 0,
            timezone: '+0000'
        }, time);

        var tmptime = format,
            ampmName = options.amNames[0],
            hour = parseInt(time.hour, 10);

        if (hour > 11) {
            ampmName = options.pmNames[0];
        }

        tmptime = tmptime.replace(/(?:HH?|hh?|mm?|ss?|[tT]{1,2}|[lz]|('.*?'|".*?"))/g, function(match) {
            switch (match) {
                case 'HH':
                    return ('0' + hour).slice(-2);
                case 'H':
                    return hour;
                case 'hh':
                    return ('0' + convert24to12(hour)).slice(-2);
                case 'h':
                    return convert24to12(hour);
                case 'mm':
                    return ('0' + time.minute).slice(-2);
                case 'm':
                    return time.minute;
                case 'ss':
                    return ('0' + time.second).slice(-2);
                case 's':
                    return time.second;
                case 'l':
                    return ('00' + time.millisec).slice(-3);
                case 'z':
                    return time.timezone === null? options.defaultTimezone : time.timezone;
                case 'T':
                    return ampmName.charAt(0).toUpperCase();
                case 'TT':
                    return ampmName.toUpperCase();
                case 't':
                    return ampmName.charAt(0).toLowerCase();
                case 'tt':
                    return ampmName.toLowerCase();
                default:
                    return match.replace(/\'/g, "") || "'";
            }
        });

        tmptime = $.trim(tmptime);
        return tmptime;
    };

    /*
     * the bad hack :/ override datepicker so it doesnt close on select
     // inspired: http://stackoverflow.com/questions/1252512/jquery-datepicker-prevent-closing-picker-when-clicking-a-date/1762378#1762378
     */
    $.datepicker._base_selectDate = $.datepicker._selectDate;
    $.datepicker._selectDate = function(id, dateStr) {
        var inst = this._getInst($(id)[0]),
            tp_inst = this._get(inst, 'timepicker');

        if (tp_inst) {
            tp_inst._limitMinMaxDateTime(inst, true);
            inst.inline = inst.stay_open = true;
            //This way the onSelect handler called from calendarpicker get the full dateTime
            this._base_selectDate(id, dateStr);
            inst.inline = inst.stay_open = false;
            this._notifyChange(inst);
            this._updateDatepicker(inst);
        } else {
            this._base_selectDate(id, dateStr);
        }
    };

    /*
     * second bad hack :/ override datepicker so it triggers an event when changing the input field
     * and does not redraw the datepicker on every selectDate event
     */
    $.datepicker._base_updateDatepicker = $.datepicker._updateDatepicker;
    $.datepicker._updateDatepicker = function(inst) {

        // don't popup the datepicker if there is another instance already opened
        var input = inst.input[0];
        if ($.datepicker._curInst && $.datepicker._curInst != inst && $.datepicker._datepickerShowing && $.datepicker._lastInput != input) {
            return;
        }

        if (typeof(inst.stay_open) !== 'boolean' || inst.stay_open === false) {
            var nodeName = input.nodeName.toLowerCase();
            var inline = (nodeName == 'div' || nodeName == 'span');
            this._base_updateDatepicker(inst);
            if (inline) {
                inst.dpDiv.find("button.ui-datepicker-close").remove();
            }

            // Reload the time control when changing something in the input text field.
            var tp_inst = this._get(inst, 'timepicker');
            if (tp_inst) {
                tp_inst._addTimePicker(inst);

//				if (tp_inst._defaults.useLocalTimezone) { //checks daylight saving with the new date.
//					var date = new Date(inst.selectedYear, inst.selectedMonth, inst.selectedDay, 12);
//					selectLocalTimeZone(tp_inst, date);
//					tp_inst._onTimeChange();
//				}
            }
        }
    };

    /*
     * third bad hack :/ override datepicker so it allows spaces and colon in the input field
     */
    $.datepicker._base_doKeyPress = $.datepicker._doKeyPress;
    $.datepicker._doKeyPress = function(event) {
        var inst = $.datepicker._getInst(event.target),
            tp_inst = $.datepicker._get(inst, 'timepicker');

        if (tp_inst) {
            if ($.datepicker._get(inst, 'constrainInput')) {
                var ampm = useAmpm(tp_inst._defaults.timeFormat),
                    dateChars = $.datepicker._possibleChars($.datepicker._get(inst, 'dateFormat')),
                    datetimeChars = tp_inst._defaults.timeFormat.toString()
                        .replace(/[hms]/g, '')
                        .replace(/TT/g, ampm ? 'APM' : '')
                        .replace(/Tt/g, ampm ? 'AaPpMm' : '')
                        .replace(/tT/g, ampm ? 'AaPpMm' : '')
                        .replace(/T/g, ampm ? 'AP' : '')
                        .replace(/tt/g, ampm ? 'apm' : '')
                        .replace(/t/g, ampm ? 'ap' : '') +
                        " " + tp_inst._defaults.separator +
                        tp_inst._defaults.timeSuffix +
                        (tp_inst._defaults.showTimezone ? tp_inst._defaults.timezoneList.join('') : '') +
                        (tp_inst._defaults.amNames.join('')) + (tp_inst._defaults.pmNames.join('')) +
                        dateChars,
                    chr = String.fromCharCode(event.charCode === undefined ? event.keyCode : event.charCode);
                return event.ctrlKey || (chr < ' ' || !dateChars || datetimeChars.indexOf(chr) > -1);
            }
        }

        return $.datepicker._base_doKeyPress(event);
    };

    /*
     * Fourth bad hack :/ override _updateAlternate function used in inline mode to init altField
     */
    $.datepicker._base_updateAlternate = $.datepicker._updateAlternate;
    /* Update any alternate field to synchronise with the main field. */
    $.datepicker._updateAlternate = function(inst) {
        var tp_inst = this._get(inst, 'timepicker');
        if(tp_inst){
            var altField = tp_inst._defaults.altField;
            if (altField) { // update alternate field too
                var altFormat = tp_inst._defaults.altFormat || tp_inst._defaults.dateFormat,
                    date = this._getDate(inst),
                    formatCfg = $.datepicker._getFormatConfig(inst),
                    altFormattedDateTime = '',
                    altSeparator = tp_inst._defaults.altSeparator ? tp_inst._defaults.altSeparator : tp_inst._defaults.separator,
                    altTimeSuffix = tp_inst._defaults.altTimeSuffix ? tp_inst._defaults.altTimeSuffix : tp_inst._defaults.timeSuffix,
                    altTimeFormat = tp_inst._defaults.altTimeFormat !== null ? tp_inst._defaults.altTimeFormat : tp_inst._defaults.timeFormat;

                altFormattedDateTime += $.datepicker.formatTime(altTimeFormat, tp_inst, tp_inst._defaults) + altTimeSuffix;
                if(!tp_inst._defaults.timeOnly && !tp_inst._defaults.altFieldTimeOnly && date !== null){
                    if(tp_inst._defaults.altFormat)
                        altFormattedDateTime = $.datepicker.formatDate(tp_inst._defaults.altFormat, date, formatCfg) + altSeparator + altFormattedDateTime;
                    else altFormattedDateTime = tp_inst.formattedDate + altSeparator + altFormattedDateTime;
                }
                $(altField).val(altFormattedDateTime);
            }
        }
        else{
            $.datepicker._base_updateAlternate(inst);
        }
    };

    /*
     * Override key up event to sync manual input changes.
     */
    $.datepicker._base_doKeyUp = $.datepicker._doKeyUp;
    $.datepicker._doKeyUp = function(event) {
        var inst = $.datepicker._getInst(event.target),
            tp_inst = $.datepicker._get(inst, 'timepicker');

        if (tp_inst) {
            if (tp_inst._defaults.timeOnly && (inst.input.val() != inst.lastVal)) {
                try {
                    $.datepicker._updateDatepicker(inst);
                } catch (err) {
                    $.timepicker.log(err);
                }
            }
        }

        return $.datepicker._base_doKeyUp(event);
    };

    /*
     * override "Today" button to also grab the time.
     */
    $.datepicker._base_gotoToday = $.datepicker._gotoToday;
    $.datepicker._gotoToday = function(id) {
        var inst = this._getInst($(id)[0]),
            $dp = inst.dpDiv;
        // ICE-9392
        inst.gotoToday = true;
        this._base_gotoToday(id);
        var tp_inst = this._get(inst, 'timepicker');
        selectLocalTimeZone(tp_inst);
        var now = new Date();
        this._setTime(inst, now);
        inst.gotoToday = false;
    };

    /*
     * Disable & enable the Time in the datetimepicker
     */
    $.datepicker._disableTimepickerDatepicker = function(target) {
        var inst = this._getInst(target);
        if (!inst) {
            return;
        }

        var tp_inst = this._get(inst, 'timepicker');
        $(target).datepicker('getDate'); // Init selected[Year|Month|Day]
        if (tp_inst) {
            tp_inst._defaults.showTimepicker = false;
            tp_inst._updateDateTime(inst);
        }
    };

    $.datepicker._enableTimepickerDatepicker = function(target) {
        var inst = this._getInst(target);
        if (!inst) {
            return;
        }

        var tp_inst = this._get(inst, 'timepicker');
        $(target).datepicker('getDate'); // Init selected[Year|Month|Day]
        if (tp_inst) {
            tp_inst._defaults.showTimepicker = true;
            tp_inst._addTimePicker(inst); // Could be disabled on page load
            tp_inst._updateDateTime(inst);
        }
    };

    /*
     * Create our own set time function
     */
    $.datepicker._setTime = function(inst, date) {
        var tp_inst = this._get(inst, 'timepicker');
        if (tp_inst) {
            var defaults = tp_inst._defaults;

            // calling _setTime with no date sets time to defaults
            tp_inst.hour = date ? date.getHours() : defaults.hour;
            tp_inst.minute = date ? date.getMinutes() : defaults.minute;
            tp_inst.second = date ? date.getSeconds() : defaults.second;
            tp_inst.millisec = date ? date.getMilliseconds() : defaults.millisec;

            //check if within min/max times..
            tp_inst._limitMinMaxDateTime(inst, true);

            tp_inst._onTimeChange();
            // ICE-9392
            if (!(inst.gotoToday && !inst.settings.todayNowButtonsAlsoSelect)) {
                tp_inst._updateDateTime(inst);
            }
        }
    };

    /*
     * Create new public method to set only time, callable as $().datepicker('setTime', date)
     */
    $.datepicker._setTimeDatepicker = function(target, date, withDate) {
        var inst = this._getInst(target);
        if (!inst) {
            return;
        }

        var tp_inst = this._get(inst, 'timepicker');

        if (tp_inst) {
            this._setDateFromField(inst);
            var tp_date;
            if (date) {
                if (typeof date == "string") {
                    tp_inst._parseTime(date, withDate);
                    tp_date = new Date();
                    tp_date.setHours(tp_inst.hour, tp_inst.minute, tp_inst.second, tp_inst.millisec);
                } else {
                    tp_date = new Date(date.getTime());
                }
                if (tp_date.toString() == 'Invalid Date') {
                    tp_date = undefined;
                }
                this._setTime(inst, tp_date);
            }
        }

    };

    /*
     * override setDate() to allow setting time too within Date object
     */
    $.datepicker._base_setDateDatepicker = $.datepicker._setDateDatepicker;
    $.datepicker._setDateDatepicker = function(target, date) {
        var inst = this._getInst(target);
        if (!inst) {
            return;
        }

        var tp_date = (date instanceof Date) ? new Date(date.getTime()) : date;

        this._updateDatepicker(inst);
        this._base_setDateDatepicker.apply(this, arguments);
        this._setTimeDatepicker(target, tp_date, true);
    };

    /*
     * override getDate() to allow getting time too within Date object
     */
    $.datepicker._base_getDateDatepicker = $.datepicker._getDateDatepicker;
    $.datepicker._getDateDatepicker = function(target, noDefault) {
        var inst = this._getInst(target);
        if (!inst) {
            return;
        }

        var tp_inst = this._get(inst, 'timepicker');

        if (tp_inst) {
            // if it hasn't yet been defined, grab from field
            if(inst.lastVal === undefined){
                this._setDateFromField(inst, noDefault);
            }

            var date = this._getDate(inst);
            if (date && tp_inst._parseTime($(target).val(), tp_inst.timeOnly)) {
                date.setHours(tp_inst.hour, tp_inst.minute, tp_inst.second, tp_inst.millisec);
            }
            return date;
        }
        return this._base_getDateDatepicker(target, noDefault);
    };

    /*
     * override parseDate() because UI 1.8.14 throws an error about "Extra characters"
     * An option in datapicker to ignore extra format characters would be nicer.
     */
    $.datepicker._base_parseDate = $.datepicker.parseDate;
    $.datepicker.parseDate = function(format, value, settings) {
        var date;
        try {
            date = this._base_parseDate(format, value, settings);
        } catch (err) {
            // Hack!  The error message ends with a colon, a space, and
            // the "extra" characters.  We rely on that instead of
            // attempting to perfectly reproduce the parsing algorithm.
            date = this._base_parseDate(format, value.substring(0,value.length-(err.length-err.indexOf(':')-2)), settings);
            $.timepicker.log("Error parsing the date string: " + err + "\ndate string = " + value + "\ndate format = " + format);
        }
        return date;
    };

    /*
     * override formatDate to set date with time to the input
     */
    $.datepicker._base_formatDate = $.datepicker._formatDate;
    $.datepicker._formatDate = function(inst, day, month, year) {
        var tp_inst = this._get(inst, 'timepicker');
        if (tp_inst) {
            tp_inst._updateDateTime(inst);
            return tp_inst.$input.val();
        }
        return this._base_formatDate(inst);
    };

    /*
     * override options setter to add time to maxDate(Time) and minDate(Time). MaxDate
     */
    $.datepicker._base_optionDatepicker = $.datepicker._optionDatepicker;
    $.datepicker._optionDatepicker = function(target, name, value) {
        var inst = this._getInst(target),
            name_clone;
        if (!inst) {
            return null;
        }

        var tp_inst = this._get(inst, 'timepicker');
        if (tp_inst) {
            var min = null,
                max = null,
                onselect = null,
                overrides = tp_inst._defaults.evnts,
                fns = {},
                prop;
            if (typeof name == 'string') { // if min/max was set with the string
                if (name === 'minDate' || name === 'minDateTime') {
                    min = value;
                } else if (name === 'maxDate' || name === 'maxDateTime') {
                    max = value;
                } else if (name === 'onSelect') {
                    onselect = value;
                } else if (overrides.hasOwnProperty(name)) {
                    if (typeof (value) === 'undefined') {
                        return overrides[name];
                    }
                    fns[name] = value;
                    name_clone = {}; //empty results in exiting function after overrides updated
                }
            } else if (typeof name == 'object') { //if min/max was set with the JSON
                if (name.minDate) {
                    min = name.minDate;
                } else if (name.minDateTime) {
                    min = name.minDateTime;
                } else if (name.maxDate) {
                    max = name.maxDate;
                } else if (name.maxDateTime) {
                    max = name.maxDateTime;
                }
                for (prop in overrides) {
                    if (overrides.hasOwnProperty(prop) && name[prop]) {
                        fns[prop] = name[prop];
                    }
                }
            }
            for (prop in fns) {
                if (fns.hasOwnProperty(prop)) {
                    overrides[prop] = fns[prop];
                    if (!name_clone) { name_clone = $.extend({}, name);}
                    delete name_clone[prop];
                }
            }
            if (name_clone && isEmptyObject(name_clone)) { return; }
            if (min) { //if min was set
                if (min === 0) {
                    min = new Date();
                } else {
                    min = new Date(min);
                }
                tp_inst._defaults.minDate = min;
                tp_inst._defaults.minDateTime = min;
            } else if (max) { //if max was set
                if (max === 0) {
                    max = new Date();
                } else {
                    max = new Date(max);
                }
                tp_inst._defaults.maxDate = max;
                tp_inst._defaults.maxDateTime = max;
            } else if (onselect) {
                tp_inst._defaults.onSelect = onselect;
            }
        }
        if (value === undefined) {
            return this._base_optionDatepicker.call($.datepicker, target, name);
        }
        return this._base_optionDatepicker.call($.datepicker, target, name_clone || name, value);
    };
    /*
     * jQuery isEmptyObject does not check hasOwnProperty - if someone has added to the object prototype,
     * it will return false for all objects
     */
    var isEmptyObject = function(obj) {
        var prop;
        for (prop in obj) {
            if (obj.hasOwnProperty(obj)) {
                return false;
            }
        }
        return true;
    };

    /*
     * jQuery extend now ignores nulls!
     */
    var extendRemove = function(target, props) {
        $.extend(target, props);
        for (var name in props) {
            if (props[name] === null || props[name] === undefined) {
                target[name] = props[name];
            }
        }
        return target;
    };

    /*
     * Determine by the time format if should use ampm
     * Returns true if should use ampm, false if not
     */
    var useAmpm = function(timeFormat){
        return (timeFormat.indexOf('t') !== -1 && timeFormat.indexOf('h') !== -1);
    };

    /*
     * Converts 24 hour format into 12 hour
     * Returns 12 hour without leading 0
     */
    var convert24to12 = function(hour) {
        if (hour > 12) {
            hour = hour - 12;
        }

        if (hour == 0) {
            hour = 12;
        }

        return String(hour);
    };

    /*
     * Splits datetime string into date ans time substrings.
     * Throws exception when date can't be parsed
     * Returns [dateString, timeString]
     */
    var splitDateTime = function(dateFormat, dateTimeString, dateSettings, timeSettings) {
        try {
            // The idea is to get the number separator occurances in datetime and the time format requested (since time has
            // fewer unknowns, mostly numbers and am/pm). We will use the time pattern to split.
            var separator = timeSettings && timeSettings.separator ? timeSettings.separator : $.timepicker._defaults.separator,
                format = timeSettings && timeSettings.timeFormat ? timeSettings.timeFormat : $.timepicker._defaults.timeFormat,
                timeParts = format.split(separator), // how many occurances of separator may be in our format?
                timePartsLen = timeParts.length,
                allParts = dateTimeString.split(separator),
                allPartsLen = allParts.length;

            if (allPartsLen > 1) {
                return [
                    allParts.splice(0,allPartsLen-timePartsLen).join(separator),
                    allParts.splice(0,timePartsLen).join(separator)
                ];
            }

        } catch (err) {
            $.timepicker.log('Could not split the date from the time. Please check the following datetimepicker options' +
                "\nthrown error: " + err +
                "\ndateTimeString" + dateTimeString +
                "\ndateFormat = " + dateFormat +
                "\nseparator = " + timeSettings.separator +
                "\ntimeFormat = " + timeSettings.timeFormat);

            if (err.indexOf(":") >= 0) {
                // Hack!  The error message ends with a colon, a space, and
                // the "extra" characters.  We rely on that instead of
                // attempting to perfectly reproduce the parsing algorithm.
                var dateStringLength = dateTimeString.length - (err.length - err.indexOf(':') - 2),
                    timeString = dateTimeString.substring(dateStringLength);

                return [$.trim(dateTimeString.substring(0, dateStringLength)), $.trim(dateTimeString.substring(dateStringLength))];

            } else {
                throw err;
            }
        }
        return [dateTimeString, ''];
    };

    /*
     * Internal function to parse datetime interval
     * Returns: {date: Date, timeObj: Object}, where
     *   date - parsed date without time (type Date)
     *   timeObj = {hour: , minute: , second: , millisec: } - parsed time. Optional
     */
    var parseDateTimeInternal = function(dateFormat, timeFormat, dateTimeString, dateSettings, timeSettings) {
        var date;
        var splitRes = splitDateTime(dateFormat, dateTimeString, dateSettings, timeSettings);
        date = $.datepicker._base_parseDate(dateFormat, splitRes[0], dateSettings);
        if (splitRes[1] !== '') {
            var timeString = splitRes[1],
                parsedTime = $.datepicker.parseTime(timeFormat, timeString, timeSettings);

            if (parsedTime === null) {
                throw 'Wrong time format';
            }
            return {
                date: date,
                timeObj: parsedTime
            };
        } else {
            return {
                date: date
            };
        }
    };

    /*
     * Internal function to set timezone_select to the local timezone
     */
    var selectLocalTimeZone = function(tp_inst, date) {
        if (tp_inst && tp_inst.timezone_select) {
            tp_inst._defaults.useLocalTimezone = true;
            var now = typeof date !== 'undefined' ? date : new Date();
            var tzoffset = $.timepicker.timeZoneOffsetString(now);
            if (tp_inst._defaults.timezoneIso8601) {
                tzoffset = tzoffset.substring(0, 3) + ':' + tzoffset.substring(3);
            }
            tp_inst.timezone_select.val(tzoffset);
        }
    };

    /*
     * Create a Singleton Insance
     */
    $.timepicker = new Timepicker();

    /**
     * Get the timezone offset as string from a date object (eg '+0530' for UTC+5.5)
     * @param  date
     * @return string
     */
    $.timepicker.timeZoneOffsetString = function(date) {
        var off = date.getTimezoneOffset() * -1,
            minutes = off % 60,
            hours = (off - minutes) / 60;
        return (off >= 0 ? '+' : '-') + ('0' + (hours * 101).toString()).slice(-2) + ('0' + (minutes * 101).toString()).slice(-2);
    };

    /**
     * Calls `timepicker()` on the `startTime` and `endTime` elements, and configures them to
     * enforce date range limits.
     * n.b. The input value must be correctly formatted (reformatting is not supported)
     * @param  Element startTime
     * @param  Element endTime
     * @param  obj options Options for the timepicker() call
     * @return jQuery
     */
    $.timepicker.timeRange = function(startTime, endTime, options) {
        return $.timepicker.handleRange('timepicker', startTime, endTime, options);
    };

    /**
     * Calls `datetimepicker` on the `startTime` and `endTime` elements, and configures them to
     * enforce date range limits.
     * @param  Element startTime
     * @param  Element endTime
     * @param  obj options Options for the `timepicker()` call. Also supports `reformat`,
     *   a boolean value that can be used to reformat the input values to the `dateFormat`.
     * @param  string method Can be used to specify the type of picker to be added
     * @return jQuery
     */
    $.timepicker.dateTimeRange = function(startTime, endTime, options) {
        $.timepicker.dateRange(startTime, endTime, options, 'datetimepicker');
    };

    /**
     * Calls `method` on the `startTime` and `endTime` elements, and configures them to
     * enforce date range limits.
     * @param  Element startTime
     * @param  Element endTime
     * @param  obj options Options for the `timepicker()` call. Also supports `reformat`,
     *   a boolean value that can be used to reformat the input values to the `dateFormat`.
     * @param  string method Can be used to specify the type of picker to be added
     * @return jQuery
     */
    $.timepicker.dateRange = function(startTime, endTime, options, method) {
        method = method || 'datepicker';
        $.timepicker.handleRange(method, startTime, endTime, options);
    };

    /**
     * Calls `method` on the `startTime` and `endTime` elements, and configures them to
     * enforce date range limits.
     * @param  string method Can be used to specify the type of picker to be added
     * @param  Element startTime
     * @param  Element endTime
     * @param  obj options Options for the `timepicker()` call. Also supports `reformat`,
     *   a boolean value that can be used to reformat the input values to the `dateFormat`.
     * @return jQuery
     */
    $.timepicker.handleRange = function(method, startTime, endTime, options) {
        $.fn[method].call(startTime, $.extend({
            onClose: function(dateText, inst) {
                checkDates(this, endTime, dateText);
            },
            onSelect: function(selectedDateTime) {
                selected(this, endTime, 'minDate');
            }
        }, options, options.start));
        $.fn[method].call(endTime, $.extend({
            onClose: function(dateText, inst) {
                checkDates(this, startTime, dateText);
            },
            onSelect: function(selectedDateTime) {
                selected(this, startTime, 'maxDate');
            }
        }, options, options.end));
        // timepicker doesn't provide access to its 'timeFormat' option,
        // nor could I get datepicker.formatTime() to behave with times, so I
        // have disabled reformatting for timepicker
        if (method != 'timepicker' && options.reformat) {
            $([startTime, endTime]).each(function() {
                var format = $(this)[method].call($(this), 'option', 'dateFormat'),
                    date = new Date($(this).val());
                if ($(this).val() && date) {
                    $(this).val($.datepicker.formatDate(format, date));
                }
            });
        }
        checkDates(startTime, endTime, startTime.val());

        function checkDates(changed, other, dateText) {
            if (other.val() && (new Date(startTime.val()) > new Date(endTime.val()))) {
                other.val(dateText);
            }
        }
        selected(startTime, endTime, 'minDate');
        selected(endTime, startTime, 'maxDate');

        function selected(changed, other, option) {
            if (!$(changed).val()) {
                return;
            }
            var date = $(changed)[method].call($(changed), 'getDate');
            // timepicker doesn't implement 'getDate' and returns a jQuery
            if (date.getTime) {
                $(other)[method].call($(other), 'option', option, date);
            }
        }
        return $([startTime.get(0), endTime.get(0)]);
    };

    /**
     * Log error or data to the console during error or debugging
     * @param  Object err pass any type object to log to the console during error or debugging
     * @return void
     */
    $.timepicker.log = function(err){
        if(window.console)
            console.log(err);
    };

    /*
     * Keep up with the version
     */
    $.timepicker.version = "1.2";

})(ice.ace.jq);
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

/**
 *  Calendar Widget
 */
ice.ace.Calendar = function(id, cfg) {
    var behavior, altFieldVal;
    this.id = id;
    this.cfg = cfg;
    this.jqId = ice.ace.escapeClientId(id);
    this.jqElId = this.cfg.popup ? this.jqId + '_input' : this.jqId + '_inline';
    this.jq = ice.ace.jq(this.jqElId);
    this.cfg.formId = this.jq.parents('form:first').attr('id');

    //i18n and l7n
    this.configureLocale();

    //Override locale pattern with user pattern
    if(this.cfg.pattern) {
        this.cfg.dateFormat = this.cfg.pattern;
    }

    //Select listener
    this.bindDateSelectListener();

    //Form field to use in inline mode
    if(!this.cfg.popup) {
        this.cfg.altField = ice.ace.jq(this.jqId + '_input');
        altFieldVal = this.cfg.altField.val();
    }

    var hasTimePicker = this.hasTimePicker();

    //Setup timepicker
    if(hasTimePicker) {
        this.configureTimePicker();
    }

    if (this.cfg.withinSingleSubmit) {
        ice.cancelSingleSubmit(this.cfg.clientId);
    }

    //Initialize calendar
    if(!this.cfg.disabled) {
        if(hasTimePicker) {
            if (this.cfg.timeOnly) {
                this.jq.timepicker(this.cfg);
                this.jq.timepicker("setTime", ice.ace.jq.trim(altFieldVal));
                this.pickerFn = "timepicker";
            }
            else {
                this.cfg.altFieldTimeOnly = false;
                this.jq.datetimepicker(this.cfg);
                this.pickerFn = "datetimepicker";
                if (!this.cfg.popup && ice.ace.jq.type(altFieldVal) === "string") {
//                    this.cfg.altField.val(altFieldVal);
                    this.jq.datetimepicker("setDate", ice.ace.jq.trim(altFieldVal));
                }
            }
        }
        else {
            this.jq.datepicker(this.cfg);
            this.pickerFn = "datepicker";
            if (!this.cfg.popup && ice.ace.jq.type(altFieldVal) === "string") {
                this.jq.datepicker("setDate", ice.ace.jq.trim(altFieldVal));
            }
        }
    }

    //Client behaviors and input skinning
    if(this.cfg.popup) {
        if(this.cfg.behaviors) {
            ice.ace.attachBehaviors(this.jq, this.cfg.behaviors);
        }

        //Visuals
        if(this.cfg.popup && this.cfg.theme != false) {
            ice.ace.util.bindHoverFocusStyle(this.jq);
        }
        behavior = this.cfg && this.cfg.behaviors && this.cfg.behaviors.dateTextChange;
    }
};

ice.ace.Calendar.prototype.configureLocale = function() {
    var localeSettings = ice.ace.locales[this.cfg.locale];

    if(localeSettings) {
        for(var setting in localeSettings) {
            this.cfg[setting] = localeSettings[setting];
        }
    }
};

ice.ace.Calendar.prototype.bindDateSelectListener = function() {
    var _self = this;
    var behavior = this.cfg && this.cfg.behaviors && this.cfg.behaviors.dateSelect;

    if(this.cfg.behaviors) {
        this.cfg.onSelect = function(dateText, input) {
            var dateSelectBehavior = _self.cfg.behaviors['dateSelect'];

            if (dateSelectBehavior) {
                var inputID = input[input.input ? "input" : "$input"][0].id;
                dateSelectBehavior.oncomplete = function() {
                    var inputElement= document.getElementById(inputID);
                    if (inputElement.nodeName.toLowerCase() == 'input') {
                        ice.ace.jq(inputElement).unbind('focus', ice.ace.jq.datepicker._showDatepicker);
                        inputElement.focus();
                        setTimeout(function() {
                            ice.ace.jq(inputElement).bind('focus', ice.ace.jq.datepicker._showDatepicker);
                        }, 350);
                    }
                };
                ice.ace.ab.call(_self, dateSelectBehavior);
            }
        };
    }
    if (!behavior && this.cfg.singleSubmit) {
        this.cfg.onSelect = function(dateText, inst) {
            ice.se(null, _self.cfg.clientId);
        };
    }

};

ice.ace.Calendar.prototype.configureTimePicker = function() {
    var pattern = this.cfg.dateFormat,
    timeSeparatorIndex = pattern.toLowerCase().indexOf('h');
    
    this.cfg.dateFormat = pattern.substring(0, timeSeparatorIndex - 1);
    this.cfg.timeFormat = pattern.substring(timeSeparatorIndex, pattern.length);

    //second
    if(this.cfg.timeFormat.indexOf('ss') != -1) {
        this.cfg.showSecond = true;
    }

    //ampm
    if(this.cfg.timeFormat.indexOf('TT') != -1) {
        this.cfg.ampm = true;
    }
};

ice.ace.Calendar.prototype.hasTimePicker = function() {
    return this.cfg.dateFormat.toLowerCase().indexOf('h') != -1;
};

ice.ace.Calendar.prototype.setDate = function(date) {
    this.jq.datetimepicker('setDate', date);
};

ice.ace.Calendar.prototype.getDate = function() {
    return this.jq.datetimepicker('getDate');
};

ice.ace.Calendar.prototype.enable = function() {
    this.jq.datetimepicker('enable');
};

ice.ace.Calendar.prototype.disable = function() {
    this.jq.datetimepicker('disable');
};

ice.ace.Calendar.prototype.destroy = function() {
    if (this.pickerFn) this.jq[this.pickerFn]("destroy");
    window[this.cfg.widgetVar] = this.jq = this.cfg.altField = null;
};

ice.ace.CalendarInit = function(options) {
    ice.ace.jq().ready(function() {
        var widgetVar = options.widgetVar, id = options.id;
        var input = ice.ace.jq(ice.ace.escapeClientId(id) + "_input");
        var trigger = null, triggerClass = ice.ace.jq.datepicker._triggerClass;
        var defaults = ice.ace.jq.datepicker._defaults;
        var showOn = options.showOn || defaults.showOn;
        var buttonText = options.buttonText || defaults.buttonText;
        var buttonImage = options.buttonImage || defaults.buttonImage;
        var buttonImageOnly = options.buttonImageOnly || defaults.buttonImageOnly;
        var isRTL = options.isRTL || defaults.isRTL;
        var initEltSet = ice.ace.jq();
        var create = function () {
            var widget = ice.ace.lazy("Calendar", [id, options]);
            ice.onElementUpdate(id, function () {
                widget.destroy();
                initEltSet.remove();
                window[widgetVar] = null;
                delete window[widgetVar];
            });
            return widget;
        };
        var initAndShow = function() {
            if (window[widgetVar]) return;
            if (trigger) trigger.remove();
            window[widgetVar] = create();
            if (!window[widgetVar].pickerFn) return;
            window[widgetVar].jq[window[widgetVar].pickerFn]("show");
        };
        var behavior = options.behaviors && options.behaviors.dateTextChange;

        if (!options.popup) {
            window[widgetVar] = create();
            return;
        }

        input.one("focus", function() {
            if (behavior) {
                input.bind('change', function() {
                    ice.setFocus();
                    ice.ace.ab(behavior);
                });
            } else if (options.singleSubmit) {
                input.bind('change', function(event) {
                    ice.setFocus();
                    ice.se(event, id);
                });
            }
        });

        initEltSet = initEltSet.add(input);

        window[widgetVar] = null;
        if (ice.ace.jq.inArray(showOn, ["button","both"]) >= 0) {
            trigger = buttonImageOnly ?
                ice.ace.jq('<img/>').addClass(triggerClass).
                    attr({ src: buttonImage, alt: buttonText, title: buttonText }) :
                ice.ace.jq('<button type="button"></button>').addClass(triggerClass).
                    html(buttonImage == '' ? buttonText : ice.ace.jq('<img/>').attr(
                    { src:buttonImage, alt:buttonText, title:buttonText }));
            input[isRTL ? 'before' : 'after'](trigger);
            trigger.one("click", initAndShow);
            initEltSet = initEltSet.add(trigger);
        }
        if (ice.ace.jq.inArray(showOn, ["focus","both"]) >= 0) {
            input.one("focus", initAndShow);
            initEltSet = initEltSet.add(input);
        }

        ice.onElementUpdate(id, function() {
            // .remove cleans jQuery state unlike .unbind
            initEltSet.remove();
            window[widgetVar] = null;
            delete window[widgetVar];
        });
    });
};
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

/*
	Masked Input plugin for jQuery
	Copyright (c) 2007-2009 Josh Bush (digitalbush.com)
	Licensed under the MIT license (http://digitalbush.com/projects/masked-input-plugin/#license)
	Version: 1.2.2 (03/09/2009 22:39:06)
*/
(function($) {
	var pasteEventName = ($.browser.msie ? 'paste' : 'input') + ".mask";
	var iPhone = (window.orientation != undefined);

	$.mask = {
		//Predefined character definitions
		definitions: {
			'9': "[0-9]",
			'a': "[A-Za-z]",
			'*': "[A-Za-z0-9]"
		}
	};

	$.fn.extend({
		//Helper Function for Caret positioning
		caret: function(begin, end) {
			if (this.length == 0) return;
			if (typeof begin == 'number') {
				end = (typeof end == 'number') ? end : begin;
				return this.each(function() {
					if (this.setSelectionRange) {
						this.focus();
						this.setSelectionRange(begin, end);
					} else if (this.createTextRange) {
						var range = this.createTextRange();
						range.collapse(true);
						range.moveEnd('character', end);
						range.moveStart('character', begin);
						range.select();
					}
				});
			} else {
				if (this[0].setSelectionRange) {
					begin = this[0].selectionStart;
					end = this[0].selectionEnd;
				} else if (document.selection && document.selection.createRange) {
					var range = document.selection.createRange();
					begin = 0 - range.duplicate().moveStart('character', -100000);
					end = begin + range.text.length;
				}
				return { begin: begin, end: end };
			}
		},
		unmask: function() { return this.trigger("unmask"); },
		mask: function(mask, settings) {
			if (!mask && this.length > 0) {
				var input = $(this[0]);
				var tests = input.data("tests");
				return $.map(input.data("buffer"), function(c, i) {
					return tests[i] ? c : null;
				}).join('');
			}
			settings = $.extend({
				placeholder: "_",
				completed: null
			}, settings);

			var defs = $.mask.definitions;
			var tests = [];
			var partialPosition = mask.length;
			var firstNonMaskPos = null;
			var len = mask.length;

			$.each(mask.split(""), function(i, c) {
				if (c == '?') {
					len--;
					partialPosition = i;
				} else if (defs[c]) {
					tests.push(new RegExp(defs[c]));
					if(firstNonMaskPos==null)
						firstNonMaskPos =  tests.length - 1;
				} else {
					tests.push(null);
				}
			});

			return this.each(function() {
				var input = $(this);
				var buffer = $.map(mask.split(""), function(c, i) { if (c != '?') return defs[c] ? settings.placeholder : c });
				var ignore = false;  			//Variable for ignoring control keys
				var focusText = input.val();

				input.data("buffer", buffer).data("tests", tests);
                input.data("labelIsInField", settings.labelIsInField);

				function seekNext(pos) {
					while (++pos <= len && !tests[pos]);
					return pos;
				};

				function shiftL(pos) {
					while (!tests[pos] && --pos >= 0);
					for (var i = pos; i < len; i++) {
						if (tests[i]) {
							buffer[i] = settings.placeholder;
							var j = seekNext(i);
							if (j < len && tests[i].test(buffer[j])) {
								buffer[i] = buffer[j];
							} else
								break;
						}
					}
					writeBuffer();
					input.caret(Math.max(firstNonMaskPos, pos));
				};

				function shiftR(pos) {
					for (var i = pos, c = settings.placeholder; i < len; i++) {
						if (tests[i]) {
							var j = seekNext(i);
							var t = buffer[i];
							buffer[i] = c;
							if (j < len && tests[j].test(t))
								c = t;
							else
								break;
						}
					}
				};

				function keydownEvent(e) {
					var pos = $(this).caret();
					var k = e.keyCode;
					ignore = (k < 16 || (k > 16 && k < 32) || (k > 32 && k < 41));

					//delete selection before proceeding
					if ((pos.begin - pos.end) != 0 && (!ignore || k == 8 || k == 46))
						clearBuffer(pos.begin, pos.end);

					//backspace, delete, and escape get special treatment
					if (k == 8 || k == 46 || (iPhone && k == 127)) {//backspace/delete
						shiftL(pos.begin + (k == 46 ? 0 : -1));
						return false;
					} else if (k == 27) {//escape
						input.val(focusText);
						input.caret(0, checkVal());
						return false;
					}
				};

				function keypressEvent(e) {
                    input.removeData("fromCharCode");
					if (ignore) {
						ignore = false;
						//Fixes Mac FF bug on backspace
						return (e.keyCode == 8) ? false : null;
					}
					e = e || window.event;
					var k = e.charCode || e.keyCode || e.which;
					var pos = $(this).caret();

					if (e.ctrlKey || e.altKey || e.metaKey) {//Ignore
						return true;
					} else if ((k >= 32 && k <= 125) || k > 186) {//typeable characters
						var p = seekNext(pos.begin - 1);
						if (p < len) {
							var c = String.fromCharCode(k);
							if (tests[p].test(c)) {
								shiftR(p);
								buffer[p] = c;
                                input.data("fromCharCode", c);
								writeBuffer();
								var next = seekNext(p);
								$(this).caret(next);
								if (settings.completed && next == len)
									settings.completed.call(input);
							}
						}
					}
					return false;
				};

				function clearBuffer(start, end) {
					for (var i = start; i < end && i < len; i++) {
						if (tests[i])
							buffer[i] = settings.placeholder;
					}
				};

				function writeBuffer() { return input.val(buffer.join('')).val(); };

				function checkVal(allow) {
					//try to place characters where they belong
					var test = input.val();
					var lastMatch = -1;
					for (var i = 0, pos = 0; i < len; i++) {
						if (tests[i]) {
							buffer[i] = settings.placeholder;
							while (pos++ < test.length) {
								var c = test.charAt(pos - 1);
								if (tests[i].test(c)) {
									buffer[i] = c;
									lastMatch = i;
									break;
								}
							}
							if (pos > test.length)
								break;
						} else if (buffer[i] == test[pos] && i!=partialPosition) {
							pos++;
							lastMatch = i;
						}
					}
					if (!allow && lastMatch + 1 < partialPosition && !input.data("labelIsInField")) {
						input.val("");
						clearBuffer(0, len);
					} else if (allow || lastMatch + 1 >= partialPosition) {
						writeBuffer();
						if (!allow) input.val(input.val().substring(0, lastMatch + 1));
					}
					return (partialPosition ? i : firstNonMaskPos);
				};

				if (!input.attr("readonly"))
					input
					.one("unmask", function() {
						input
							.unbind(".mask")
							.removeData("buffer")
							.removeData("tests");
					})
					.bind("focus.mask", function() {
                        // ICE-8154: in-field label handling
                        if (input.data("labelIsInField")) {
                            input.val("");
                            input.removeClass(settings.inFieldLabelStyleClass);
                            input.data("labelIsInField", false);
                        }
						focusText = input.val();
						var pos = checkVal();
						writeBuffer();
						setTimeout(function() {
							if (pos == mask.length)
								input.caret(0, pos);
							else
								input.caret(pos);
						}, 0);
					})
					.bind("blur.mask", function() {
						checkVal();
						if (input.val() != focusText)
							input.change();
                        // ICE-8154: in-field label handling
                        if ($.trim(input.val()) == "" && settings.inFieldLabel) {
                            input.val(settings.inFieldLabel);
                            input.addClass(settings.inFieldLabelStyleClass);
                            input.data("labelIsInField", true);
                        }
					})
					.bind("keydown.mask", keydownEvent)
					.bind("keypress.mask", keypressEvent)
					.bind(pasteEventName, function() {
						setTimeout(function() { input.caret(checkVal(true)); }, 0);
					});

				checkVal(); //Perform initial check for existing values
			});
		}
	});
})(ice.ace.jq);

/*
 *  InputMask Widget
 */
ice.ace.InputMask = function(id, cfg) {
    this.id = id;
    this.cfg = cfg;
    this.jqId = ice.ace.escapeClientId(id);
    this.jq = ice.ace.jq(this.jqId).find('input[name="'+this.id+'_field"]');
	this.jq.attr('id', this.id + '_field');

    if (this.cfg.mask) {
        this.cfg.mask = "?" + this.cfg.mask.replace(/\?/g, "");
    }
    if (this.cfg.mask) // only add functionality if mask was provided, otherwise degrade to simple text input
	this.jq.mask(this.cfg.mask, this.cfg);

    this.jq.change(function() { ice.setFocus(''); });
    //Client behaviors
	var behaviors = this.cfg.behaviors;
    if(behaviors) {
		var element = this.jq;
		if (behaviors.blur) {
			element.bind('blur', function() { ice.setFocus(''); ice.ace.ab.call(element, behaviors.blur); });
		}
		if (behaviors.change) {
			element.bind('change', function() { ice.ace.ab.call(element, behaviors.change); });
			element.bind('keypress', function(e,ui) { if (e.keyCode == 13) { 
				ice.ace.ab.call(element, behaviors.change);
				e.stopPropagation();} 
			});
		}
        if (behaviors.keypress) {
            element.keypress(function (e) {
                var $ = ice.ace.jq, character = $(this).data("fromCharCode");
                if (character) {
                    ice.ace.ab($.extend(true, {params: {"char": character}}, behaviors.keypress));
                }
			});
		}
    }

    //Visuals
    if(this.cfg.theme != false) {
        ice.ace.util.bindHoverFocusStyle(this.jq);
    }
}
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
ice.ace.TextEntry = function(id, cfg) {
    var jQ = ice.ace.jq;
    var inputId = id + "_input";
    var labelName = id + "_label";
    this.id = id;
    this.cfg = cfg;
    this.jqId = ice.ace.escapeClientId(id) + " input.ui-textentry";
    this.jq = jQ(this.jqId);
	
	if (cfg.embeddedLabel) { // execute this when component is lazy loaded
		if (this.jq.attr("name") == labelName) {
			this.jq.attr({name: inputId});
			this.jq.val("");
			this.jq.removeClass("ui-input-label-infield");
		}
	}

    if (cfg.autoTab) {
        this.jq.keypress(
            function(e) {
                var curLength = this.value.length + 1, maxLength = this.maxLength;
                var nextTabElement = ice.ace.TextEntry.nextTabElement(this);
                /*
                 console.log("id: ", this.id);
                 console.log("value: ", this.value);
                 console.log("value.length: ", this.value.length);
                 console.log("maxLength: ", maxLength);
                 console.log("charCode: ", e.charCode);
                 console.log("keyCode: ", e.keyCode);
                 console.log("which: ", e.which);
                 //            console.dir(e);
                 */
                if (curLength < maxLength || !nextTabElement) {
                    return;
                }
                if (e.which < 32 || e.charCode == 0 || e.ctrlKey || e.altKey) {
                    return;
                }
                e.preventDefault();
                if (curLength == maxLength) {
                    this.value += String.fromCharCode(e.which);
                }
                /*
                 console.log("value: ", this.value);
                 console.log("value.length: ", this.value.length);
                 */
                nextTabElement.focus();
            }
        );
    }
    if (cfg.embeddedLabel) {
        this.jq.focus(
            function() {
                var input = jQ(this);
                if (input.attr("name") == labelName) {
                    input.attr({name: inputId});
                    input.val("");
                    input.removeClass("ui-input-label-infield");
                }
            }).blur(
            function() {
                var input = jQ(this);
                if (jQ.trim(input.val()) == "") {
                    input.attr({name: labelName});
                    input.val(cfg.embeddedLabel);
                    input.addClass("ui-input-label-infield");
                }
            });
    }
    this.jq.blur(function() {
        ice.setFocus();
    });
    if (this.cfg.behaviors) {
        ice.ace.attachBehaviors(this.jq, this.cfg.behaviors);
    }
};

// Original code copied from http://stackoverflow.com/a/7329696
// See comments at http://jira.icesoft.org/browse/ICE-7824?focusedCommentId=39755&page=com.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel#action_39755
ice.ace.TextEntry.nextTabElement = function(currElement) {
    // if we haven't stored the tabbing order
    if (!currElement.form.tabOrder) {

        var els = currElement.form.elements,
                ti = [],
                rest = [];

        // store all focusable form elements with tabIndex > 0
        for (var i = 0, il = els.length; i < il; i++) {
            if (els[i].tabIndex > 0 &&
                    !els[i].disabled &&
                    !els[i].hidden &&
                    !els[i].readOnly &&
                    els[i].type !== 'hidden') {
                ti.push(els[i]);
            }
        }

        // sort them by tabIndex order
        ti.sort(function(a,b){ return a.tabIndex - b.tabIndex; });

        // store the rest of the elements in order
        for (i = 0, il = els.length; i < il; i++) {
            if (els[i].tabIndex == 0 &&
                    !els[i].disabled &&
                    !els[i].hidden &&
                    !els[i].readOnly &&
                    els[i].type !== 'hidden') {
                rest.push(els[i]);
            }
        }

        // store the full tabbing order
        currElement.form.tabOrder = ti.concat(rest);
    }

    // find the next element in the tabbing order and focus it
    // if the last element of the form then blur
    // (this can be changed to focus the next <form> if any)
    for (var j = 0, jl = currElement.form.tabOrder.length; j < jl; j++) {
        if (currElement === currElement.form.tabOrder[j]) {
            if (j+1 < jl) {
//                        $(this.form.tabOrder[j+1]).focus();
                return currElement.form.tabOrder[j+1];
            } else {
//                        $(this).blur();
            }
        }
    }
};
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

ice.ace.TextAreaEntry = function(id, cfg) {
    var jQ = ice.ace.jq;
    var inputId = id + "_input";
    var labelName = id + "_label";
    var maxlength = cfg.maxlength;
    this.id = id;
    this.cfg = cfg;
    this.jqId = ice.ace.escapeClientId(inputId);
    this.jq = jQ(this.jqId);
	if (cfg.placeholder && !('placeholder' in document.createElement('input'))) { // if 'placeholder' isn't supported, use label inField
		this.cfg.inFieldLabel = this.cfg.placeholder;
	}

    if (cfg.inFieldLabel) {
		if (this.jq.hasClass(cfg.inFieldLabelStyleClass)) {
			this.jq.attr({name: inputId});
			this.jq.val("");
			this.jq.removeClass(cfg.inFieldLabelStyleClass);
		}
        this.jq.focus(
            function() {
                var input = jQ(this);
                if (input.hasClass(cfg.inFieldLabelStyleClass)) {
                    input.attr({name: inputId});
                    input.val("");
                    input.removeClass(cfg.inFieldLabelStyleClass);
                }
            }).blur(
            function() {
                var input = jQ(this);
                if (jQ.trim(input.val()) == "") {
                    input.attr({name: labelName});
                    input.val(cfg.inFieldLabel);
                    input.addClass(cfg.inFieldLabelStyleClass);
                }
            });
    }
    this.jq.blur(function() {
        ice.setFocus();
    });
    if (maxlength > 0) {
        this.jq.on("keyup change", function (e) {
            if (this.value.length > maxlength) {
                this.value = this.value.substring(0, maxlength);
            }
        });
    }
    if (this.cfg.behaviors) {
        ice.ace.attachBehaviors(this.jq, this.cfg.behaviors);
    }
};
/* 
 * Original Code Copyright Prime Technology.
 * Subsequent Code Modifications Copyright 2011-2012 ICEsoft Technologies Canada Corp. (c)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * NOTE THIS CODE HAS BEEN MODIFIED FROM ORIGINAL FORM
 *
 * Subsequent Code Modifications have been made and contributed by ICEsoft Technologies Canada Corp. (c).
 *
 * Code Modification 1: Integrated with ICEfaces Advanced Component Environment.
 * Contributors: ICEsoft Technologies Canada Corp. (c)
 *
 * Code Modification 2: [ADD BRIEF DESCRIPTION HERE]
 * Contributors: ______________________
 * Contributors: ______________________
 *
 */

/**
 *  Dialog Widget
 */
if (!window.ice['ace']) {
    window.ice.ace = {};
}
ice.ace.Dialog = function(id, cfg) {
    var callee = arguments.callee, prevAceDialog = callee[id], jqo;
    if (prevAceDialog) {
        jqo = prevAceDialog.jq;
        if (jqo.dialog("isOpen")) {
            jqo.dialog("close", {type: "close", synthetic: true});
        }
    }
    cfg.height = cfg.height || "auto";
    this.id = id;
    this.cfg = cfg;
    this.jqId = ice.ace.escapeClientId(id);
    this.jq = ice.ace.jq(this.jqId);
    var _self = this, closable = this.cfg.closable;
	var root = this.jq.get(0);
	
	var hasSpecificWidth = function(node) {
		if (node == root) return false;
		var width = ice.ace.jq(node).css('width');
		if (width != '100%' && width != 'auto' && width.substring(0,1) != '0') return true;
		else return hasSpecificWidth(node.parentNode);
	}

	if (!cfg.width) {
		var tables = this.jq.find('.ui-datatable');
		var tableWithoutSpecificWidthFound = false;
		for (var i = 0; i < tables.length; i++) {
			if (!hasSpecificWidth(tables.eq(i).get(0))) {
				tableWithoutSpecificWidthFound = true;
				break;
			}
		}
		if (tableWithoutSpecificWidthFound) {
			cfg.width = '98%';
		} else {
			cfg.width = 'auto';
		}
	}
	
    if (closable == false) {
        this.cfg.closeOnEscape = false;
    }

    // disable unsupported effects
    if (this.cfg.hide == 'pulsate') {
        this.cfg.hide = null;
    } else {
        var browser = ice.ace.Dialog.browser();
        if (browser == 'ie7' || browser == 'ie8') {
            var hide = this.cfg.hide;
            if (hide) {
                if (hide == 'highlight' || hide == 'bounce')
                    this.cfg.hide = null;
            }
        }
    }
	if (this.cfg.show == 'explode') {
        var browser = ice.ace.Dialog.browser();
        if (browser == 'ie7' || browser == 'ie8') {
			this.cfg.show = null;
		}
	}

    //Remove scripts to prevent duplicate widget issues
    this.jq.find("script").remove();
	
	if (this.cfg.relativeTo) {
		var relativeToElement = ice.ace.jq(ice.ace.escapeClientId(this.cfg.relativeTo)).get(0);
		if (relativeToElement != null) {
			this.cfg.position = {my: this.cfg.dialogPosition, at: this.cfg.relativePosition, of: relativeToElement, collision: 'none'};
		}
	}

    //Create the dialog
    this.cfg.autoOpen = false;
    this.jq.dialog(this.cfg);
	
	// set style attribute
	var dialogParent = this.jq.parent();
	var style = dialogParent.attr('style');
	dialogParent.attr('style', style + ';' + this.cfg.dialogStyle);

    ice.onElementRemove(id, function() {
        _self.jq.dialog('close');
    });

    //Event handlers
    this.jq.bind('dialogclose', function(event, ui) {
        _self.onHide(event, ui);
    });
    this.jq.bind('dialogopen', function(event, ui) {
        _self.onShow(event, ui);
    });
	
	this.jq.parent().find('.ui-dialog-titlebar-close').bind('click', function(event, ui) {
		_self.ajaxHide();
	});

    //Hide close icon if dialog is not closable
    if (closable == false) {
        this.jq.parent().find('.ui-dialog-titlebar-close').hide();
    }

    //Hide header if showHeader is false
    if (this.cfg.showHeader == false) {
        this.jq.parent().children('.ui-dialog-titlebar').hide();
    }

    //Relocate dialog to body if appendToBody is true
//    if(this.cfg.appendToBody) {
//        this.jq.parent().appendTo(document.body);
//    }

    //Apply focus to first input initially
    if (this.cfg.isVisible) {
        this.jq.dialog("open");
        this.focusFirstInput();
    }
    callee[id] = this;
};

ice.ace.Dialog.prototype.show = function() {
    this.jq.dialog('open');

    this.focusFirstInput();
};

ice.ace.Dialog.prototype.hide = function() {
    this.jq.dialog('close');
	this.ajaxHide();
};

/**
 * Invokes user provided callback
 */
ice.ace.Dialog.prototype.onShow = function(event, ui) {
    if (this.cfg.onShow) {
        this.cfg.onShow.call(this, event, ui);
    }
};

/**
 * Fires an ajax request to invoke a closeListener passing a CloseEvent
 */
ice.ace.Dialog.prototype.onHide = function(event, ui) {
    if (typeof event.originalEvent != 'undefined') {
        if (event.originalEvent.synthetic) return;
    } else {
        if (event.synthetic) return;
    }

    if (this.cfg.onHide) {
        this.cfg.onHide.call(this, event, ui);
    }
};

ice.ace.Dialog.prototype.ajaxHide = function() {
    if (this.cfg.behaviors) {
        var closeBehavior = this.cfg.behaviors['close'];

        if (closeBehavior) {
            ice.ace.ab(closeBehavior);
        }
    }
}

ice.ace.Dialog.prototype.focusFirstInput = function() {
    this.jq.find(':not(:submit):not(:button):input:visible:enabled:first').focus();
};

ice.ace.Dialog.browser = function() {
    if (ice.ace.jq.browser.msie)
        if (ice.ace.jq.browser.version < 8) {
            if (navigator.userAgent.indexOf("Trident/5") < 0) // detects IE9, regardless of compatibility mode
                return 'ie7';
        } else {
            if (ice.ace.jq.browser.version < 9)
                return 'ie8';
        }
    return '';
};
/* 
* Original Code Copyright Prime Technology.
* Subsequent Code Modifications Copyright 2011-2012 ICEsoft Technologies Canada Corp. (c)
* 
* Licensed under the Apache License, Version 2.0 (the "License"); 
* you may not use this file except in compliance with the License. 
* You may obtain a copy of the License at 
* 
* http://www.apache.org/licenses/LICENSE-2.0 
* 
* Unless required by applicable law or agreed to in writing, software 
* distributed under the License is distributed on an "AS IS" BASIS, 
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
* See the License for the specific language governing permissions and 
* limitations under the License. 
* 
* NOTE THIS CODE HAS BEEN MODIFIED FROM ORIGINAL FORM 
* 
* Subsequent Code Modifications have been made and contributed by ICEsoft Technologies Canada Corp. (c). 
* 
* Code Modification 1: Integrated with ICEfaces Advanced Component Environment. 
* Contributors: ICEsoft Technologies Canada Corp. (c) 
* 
* Code Modification 2: [ADD BRIEF DESCRIPTION HERE] 
* Contributors: ______________________ 
* Contributors: ______________________ 
* 
*/

ice.ace.Draggable = function(id, cfg) {
    this.id = id;
    this.cfg = cfg;
	this.jq = ice.ace.jq(ice.ace.escapeClientId(this.cfg.target));
	this.jq.draggable('destroy');
	
	if (this.cfg.dragStart || (this.cfg.behaviors && this.cfg.behaviors.start)) {
		this.setupDragStartHandler();
	}
	
    this.jq.draggable(this.cfg);
}

ice.ace.Draggable.prototype.setupDragStartHandler = function() {
    this.cfg.formId = ice.ace.jq(ice.ace.escapeClientId(this.id)).parents('form:first').attr('id');

    var _self = this;
    
    this.cfg.start = function(event, ui) {
        var dragStartBehaviour = _self.cfg && _self.cfg.behaviors && _self.cfg.behaviors.start;

        var options = {
            source: _self.id,
            execute: _self.id,
            render: '@none',
            formId: _self.cfg.formId
        };
	
        var params = {};
        params[_self.id + "_dragStart"] = _self.cfg.target;

        options.params = params;

        if (dragStartBehaviour) {
            options.params[_self.id] = _self.id; // also triggers drag start listener, if any
            ice.ace.ab(
                ice.ace.extendAjaxArgs(
                    dragStartBehaviour,
                    ice.ace.clearExecRender(options)
                )
            );
        } else ice.ace.AjaxRequest(options);
    };
}

ice.ace.Droppable = function(id, cfg) {
    this.id = id;
    this.cfg = cfg;
	
    this.setupDropHandler();
	
    ice.ace.jq(ice.ace.escapeClientId(this.cfg.target)).droppable(this.cfg);
}

ice.ace.Droppable.prototype.setupDropHandler = function() {
    this.cfg.formId = ice.ace.jq(ice.ace.escapeClientId(this.id)).parents('form:first').attr('id');

    var _self = this;
    
    this.cfg.drop = function(event, ui) {
        var dropBehaviour = _self.cfg && _self.cfg.behaviors && _self.cfg.behaviors.drop;

        var options = {
            source: _self.id,
            execute: _self.id,
            render: '@none',
            formId: _self.cfg.formId
        };
	
        var params = {};
        params[_self.id + "_dragId"] = ui.draggable.attr('id');
        params[_self.id + "_dropId"] = _self.cfg.target;

        options.params = params;

        if (dropBehaviour) {
            options.params[_self.id] = _self.id; // also triggers drop listener, if any
            ice.ace.ab(
                ice.ace.extendAjaxArgs(
                    dropBehaviour,
                    ice.ace.clearExecRender(options)
                )
            );
        } else ice.ace.AjaxRequest(options);
    };
}
/* 
* Original Code Copyright Prime Technology.
* Subsequent Code Modifications Copyright 2011-2012 ICEsoft Technologies Canada Corp. (c)
* 
* Licensed under the Apache License, Version 2.0 (the "License"); 
* you may not use this file except in compliance with the License. 
* You may obtain a copy of the License at 
* 
* http://www.apache.org/licenses/LICENSE-2.0 
* 
* Unless required by applicable law or agreed to in writing, software 
* distributed under the License is distributed on an "AS IS" BASIS, 
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
* See the License for the specific language governing permissions and 
* limitations under the License. 
* 
* NOTE THIS CODE HAS BEEN MODIFIED FROM ORIGINAL FORM 
* 
* Subsequent Code Modifications have been made and contributed by ICEsoft Technologies Canada Corp. (c). 
* 
* Code Modification 1: Integrated with ICEfaces Advanced Component Environment. 
* Contributors: ICEsoft Technologies Canada Corp. (c) 
* 
* Code Modification 2: [ADD BRIEF DESCRIPTION HERE] 
* Contributors: ______________________ 
* Contributors: ______________________ 
* 
*/

ice.ace.ProgressBar = function(id, cfg) {
    this.id = id;
    this.cfg = cfg;
    this.jqId = ice.ace.escapeClientId(id);

    if(this.cfg.usePolling) {
        this.cfg.formId = ice.ace.jq(this.jqId).parents('form:first').attr('id');
    }

    this.qObj = ice.ace.jq(this.jqId);
    this.qObj.progressbar(this.cfg);
//    if (this.cfg.hasChangeListener) {
        this.qObj.bind('progressbarchange', this, this.changeListener);
//    }
}

ice.ace.ProgressBar.prototype.setValue = function(value) {
    ice.ace.jq(this.jqId).progressbar('value', value);
}

ice.ace.ProgressBar.prototype.getValue  = function() {
    return ice.ace.jq(this.jqId).progressbar('value');
}

ice.ace.ProgressBar.prototype.start = function() {
    var _self = this;
	
    if(this.cfg.usePolling) {
		
        this.progressPoll = setInterval(function() {
            var options = {
                source: _self.id,
                execute: _self.id,
                render: "@none",
                formId: _self.cfg.formId,
                async: true,
                oncomplete: function(xhr, status, args) {
                    var value = args[_self.id + '_value'];
                    _self.setValue(value);

                    //trigger close listener
                    if(value === 100) {
                        _self.fireCompleteEvent();
                    }
                }
            };

            ice.ace.AjaxRequest(options);
            
        }, this.cfg.pollingInterval);
    }
}

ice.ace.ProgressBar.prototype.fireCompleteEvent = function() {
    var completeListener = this.cfg && this.cfg.behaviors && this.cfg.behaviors.complete;
    clearInterval(this.progressPoll);

    var options = {
        source: this.id,
        execute: this.id,
        render: "@none",
        formId: this.cfg.formId,
        async: true
    };

    var params = {};
    params[this.id + '_complete'] = true;

    options.params = params;
	    
    if (completeListener) {
        options.params[this.id] = this.id; // also triggers listener, if any
        ice.ace.ab(ice.ace.extendAjaxArgs(
                completeListener,
                ice.ace.clearExecRender(options)
        ));
    } else ice.ace.AjaxRequest(options);
}

ice.ace.ProgressBar.prototype.changeListener = function(ev, ui) {
    var data = ev.data, id = data.id;
    var cfg = data.cfg;
    var changeListener = cfg && cfg.behaviors && cfg.behaviors.change;
    var options = {
        source: id,
        execute: id,
        render: "@none",
        formId: cfg.formId,
        async: true
    };

    var params = {};
    params[id + '_change'] = true;
    params[id + '_value'] = ui.value;
    params[id + '_percentage'] = ui.percentage;

    options.params = params;

    if (changeListener) {
        options.params[this.id] = this.id; // also triggers listener, if any
        ice.ace.ab(ice.ace.extendAjaxArgs(
                changeListener,
                ice.ace.clearExecRender(options)
        ));
    } else ice.ace.AjaxRequest(options);
};

ice.ace.ProgressBar.prototype.cancel = function() {
    var cancelListener = this.cfg && this.cfg.behaviors && this.cfg.behaviors.cancel;
    clearInterval(this.progressPoll);
    var _self = this;

    var options = {
        source: this.id,
        execute: this.id,
        render: "@none",
        formId: this.cfg.formId,
        async: true,
        oncomplete:function(xhr, status, args) {
            _self.setValue(0);
        }
    };

    var params = {};
    params[this.id + '_cancel'] = true;

    options.params = params;

    if (cancelListener) {
        options.params[this.id] = this.id; // also triggers listener, if any
        ice.ace.ab(ice.ace.extendAjaxArgs(
                cancelListener,
                ice.ace.clearExecRender(options)
        ));
        this.setValue(0);
    } else ice.ace.AjaxRequest(options);
}
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

ice.ace.pushbutton = function(clientId, cfg){
    this.cfg = cfg;
    this.id = clientId;
    this.jqId = ice.ace.escapeClientId(this.id);
    this.element = ice.ace.jq(this.jqId);
    this.button = ice.ace.jq(this.jqId).find(this.buttonSelector);
    this.styleState = 'default';
    var self = this;

    this.button
            .on("click", function() { self.onClick(); })
            .on("mousedown", function() { self.changeStyleState('active'); })
            .on("mouseup", function() { self.changeStyleState('hover'); })
            .on("mouseenter",function() { self.changeStyleState('hover'); })
            .on("focus",function() { self.changeStyleState('hover'); })
            .on("blur",function() { self.changeStyleState('default'); })
            .on("mouseleave",function() { self.changeStyleState('default'); })

    // lazy init occuring via kb focus, set focus style since
    // our focus event won't be set up yet
    if (document.activeElement == this.button[0])
        self.changeStyleState('hover');

    ice.onElementUpdate(this.id, function() {self.unload()});
};

// Selectors
ice.ace.pushbutton.prototype.buttonSelector = " > span > span > button";

ice.ace.pushbutton.prototype.unload = function() {
    this.button.off("click mousedown mouseup mouseenter focus blur mouseleave");
}

ice.ace.pushbutton.prototype.onClick = function () {
    var options = {
        source:this.id,
        render:"@all",
        params:this.cfg.uiParams
    },
    singleOptions = {
        execute:"@this"
    },
    fullOptions = {
        execute:"@all"
    };

    if (this.cfg.fullSubmit)
        ice.ace.jq(options).extend(fullOptions);
    else
        ice.ace.jq(options).extend(singleOptions);

    if (this.cfg.behaviors && this.cfg.behaviors.activate) {
        ice.ace.ab(ice.ace.extendAjaxArgs(
                this.cfg.behaviors.activate,
                ice.ace.clearExecRender(options))
        );
    } else
        ice.ace.ab(options);
};

ice.ace.pushbutton.prototype.changeStyleState = function(state) {
    this.removeStyleState(this.styleState);
    this.addStyleState(state);
    this.styleState = state;
}

ice.ace.pushbutton.prototype.addStyleState = function(state) {
    if (state == 'hover')
        this.button.addClass('ui-state-hover');
    else if (state == 'active')
        this.button.addClass('ui-state-active');
    else if (state == 'default') {};
};

ice.ace.pushbutton.prototype.removeStyleState = function(state) {
    if (state == 'hover')
        this.button.removeClass('ui-state-hover');
    else if (state == 'active')
        this.button.removeClass('ui-state-active');
    else if (state == 'default') {};
};
/* 
* Original Code Copyright Prime Technology.
* Subsequent Code Modifications Copyright 2011-2012 ICEsoft Technologies Canada Corp. (c)
* 
* Licensed under the Apache License, Version 2.0 (the "License"); 
* you may not use this file except in compliance with the License. 
* You may obtain a copy of the License at 
* 
* http://www.apache.org/licenses/LICENSE-2.0 
* 
* Unless required by applicable law or agreed to in writing, software 
* distributed under the License is distributed on an "AS IS" BASIS, 
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
* See the License for the specific language governing permissions and 
* limitations under the License. 
* 
* NOTE THIS CODE HAS BEEN MODIFIED FROM ORIGINAL FORM 
* 
* Subsequent Code Modifications have been made and contributed by ICEsoft Technologies Canada Corp. (c). 
* 
* Code Modification 1: Integrated with ICEfaces Advanced Component Environment. 
* Contributors: ICEsoft Technologies Canada Corp. (c) 
* 
* Code Modification 2: [ADD BRIEF DESCRIPTION HERE] 
* Contributors: ______________________ 
* Contributors: ______________________ 
* 
*/

ice.ace.Resizable = function(id, cfg) {
    var listener = cfg && cfg.behaviors && cfg.behaviors.resize;
    this.id = id;
    this.cfg = cfg;
    this.target = ice.ace.escapeClientId(this.cfg.target);

    if (listener) {
        this.cfg.ajaxResize = true;
    }
    if(this.cfg.ajaxResize) {
        this.cfg.formId = ice.ace.jq(this.target).parents('form:first').attr('id');
    }

    var _self = this;

    this.cfg.stop = function(event, ui) {
        if(_self.cfg.ajaxResize) {
            _self.fireAjaxResizeEvent(event, ui);
        }
    };

    ice.ace.jq(this.target).resizable(this.cfg);
    
};

ice.ace.Resizable.prototype.fireAjaxResizeEvent = function(event, ui) {
    var behaviour = this.cfg && this.cfg.behaviors && this.cfg.behaviors.resize;
    var options = {
        source: this.id,
        execute: this.id,
        render: '@none',
        formId: this.cfg.formId
    };

    var params = {};
    params[this.id + '_ajaxResize'] = true;
    params[this.id + '_width'] = ui.helper.width();
    params[this.id + '_height'] = ui.helper.height();

    options.params = params;

    if (behaviour) {
        ice.ace.ab(ice.ace.extendAjaxArgs(
                behaviour,
                ice.ace.clearExecRender(options))
        );
    } else ice.ace.AjaxRequest(options);
};
/* 
* Original Code Copyright Prime Technology.
* Subsequent Code Modifications Copyright 2011-2012 ICEsoft Technologies Canada Corp. (c)
* 
* Licensed under the Apache License, Version 2.0 (the "License"); 
* you may not use this file except in compliance with the License. 
* You may obtain a copy of the License at 
* 
* http://www.apache.org/licenses/LICENSE-2.0 
* 
* Unless required by applicable law or agreed to in writing, software 
* distributed under the License is distributed on an "AS IS" BASIS, 
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
* See the License for the specific language governing permissions and 
* limitations under the License. 
* 
* NOTE THIS CODE HAS BEEN MODIFIED FROM ORIGINAL FORM 
* 
* Subsequent Code Modifications have been made and contributed by ICEsoft Technologies Canada Corp. (c). 
* 
* Code Modification 1: Integrated with ICEfaces Advanced Component Environment. 
* Contributors: ICEsoft Technologies Canada Corp. (c) 
* 
* Code Modification 2: [ADD BRIEF DESCRIPTION HERE] 
* Contributors: ______________________ 
* Contributors: ______________________ 
* 
*/

/**
 *  Slider Widget
 */
ice.ace.Slider = function(id, cfg) {
	this.id = id;
	this.cfg = cfg;
    this.jq = ice.ace.jq(ice.ace.escapeClientId(this.id)).children('div').eq(1);
	this.input = ice.ace.jq(ice.ace.escapeClientId(this.cfg.input));
    var _self = this;
	
	// disable animation for IE 7/8
	if (!ice.ace.jq.support.leadingWhitespace) {
		this.cfg.animate = false;
	}
    
    //Create slider
	if (this.cfg.clickableRail == false) {
		this.jq.mousedown(function(event) { if (event.target == this) event.stopImmediatePropagation(); }).slider(this.cfg);
	} else {
		this.jq.slider(this.cfg);
	}
	var handle = ice.ace.jq(ice.ace.escapeClientId(this.id) + " .ui-slider-handle");
    handle.attr('id', this.id + '_handle');
	if (this.cfg.tabindex) handle.attr('tabindex', this.cfg.tabindex);

    //Slide handler
	this.jq.bind('slide', function(event, ui) {
        _self.onSlide(event, ui);
    });

    //Slide start handler
    if(this.cfg.onSlideStart) {
        this.jq.bind('slidestart', function(event, ui) {_self.cfg.onSlideStart.call(this, event, ui);});
    }
	if (this.cfg.behaviors) {
		if (this.cfg.behaviors.slideStart) {
			this.jq.bind('slidestart', function(event, ui) { ice.ace.ab(_self.cfg.behaviors.slideStart); });
		}
	}

    //Slide end handler
    this.jq.bind('slidestop', function(event, ui) {_self.onSlideEnd(event, ui);});

    
    // This call required to init slider when inside tabset on IE browsers.
    // Else slider remains hidden until some tab action occurs.
    var jq = this.jq;
    if (this.cfg.disabled)
        window.setTimeout(function () { jq.slider('disable'); } , 1);
    else
        window.setTimeout(function () { jq.slider('enable'); } , 1);
}

ice.ace.Slider.prototype.onSlide = function(event, ui) {
    //User callback
    if(this.cfg.onSlide) {
        this.cfg.onSlide.call(this, event, ui);
    }

    //Update input
	this.input.val(ui.value);
	
	if (this.cfg.behaviors) {
		if (this.cfg.behaviors.slide) {
			ice.ace.ab(this.cfg.behaviors.slide);
		}
	}
}

ice.ace.Slider.prototype.onSlideEnd = function(event, ui) {
    //User callback
    if(this.cfg.onSlideEnd) {
        this.cfg.onSlideEnd.call(this, event, ui);
    }
	
	if (this.cfg.behaviors) {
		if (this.cfg.behaviors.slideEnd) {
			ice.ace.ab(this.cfg.behaviors.slideEnd);
		}
	}
}

ice.ace.Slider.prototype.getValue = function() {
    return this.jq.slider('value');
}

ice.ace.Slider.prototype.setValue = function(value) {
    this.jq.slider('value', value);
}

ice.ace.Slider.prototype.enable = function() {
    this.jq.slider('enable');
}

ice.ace.Slider.prototype.disable = function() {
    this.jq.slider('disable');
}

/* 
* Original Code Copyright Prime Technology.
* Subsequent Code Modifications Copyright 2011-2012 ICEsoft Technologies Canada Corp. (c)
* 
* Licensed under the Apache License, Version 2.0 (the "License"); 
* you may not use this file except in compliance with the License. 
* You may obtain a copy of the License at 
* 
* http://www.apache.org/licenses/LICENSE-2.0 
* 
* Unless required by applicable law or agreed to in writing, software 
* distributed under the License is distributed on an "AS IS" BASIS, 
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
* See the License for the specific language governing permissions and 
* limitations under the License. 
* 
* NOTE THIS CODE HAS BEEN MODIFIED FROM ORIGINAL FORM 
* 
* Subsequent Code Modifications have been made and contributed by ICEsoft Technologies Canada Corp. (c). 
* 
* Code Modification 1: Integrated with ICEfaces Advanced Component Environment. 
* Contributors: ICEsoft Technologies Canada Corp. (c) 
* 
* Code Modification 2: [ADD BRIEF DESCRIPTION HERE] 
* Contributors: ______________________ 
* Contributors: ______________________ 
* 
*/

/**
 *  ConfirmDialog Widget
 */
ice.ace.ConfirmDialog = function(id, cfg) {
    this.id = id;
    this.cfg = cfg;
    this.jqId = ice.ace.escapeClientId(id);
    this.jq = ice.ace.jq(this.jqId + " div:first");
    this.cfg.resizable = false;
    this.cfg.autoOpen = false;

	// disable unsupported effects
	if (this.cfg.hide == 'pulsate') this.cfg.hide = null;
	var browser = ice.ace.ConfirmDialog.browser();
	if (browser == 'ie7' || browser == 'ie8') {
		var hide = this.cfg.hide;
		if (hide) {
			if (hide == 'highlight' || hide == 'bounce')
				this.cfg.hide = null;
			if (browser == 'ie7')
				if (hide == 'puff')
					this.cfg.hide = null;
		}
		var show = this.cfg.show;
		if (show && browser == 'ie7') {
			if (show == 'puff' || show == 'scale')
				this.cfg.show = null;
		}
		if (show == 'explode') {
			this.cfg.show = null;
		}
	}

    //Remove scripts to prevent duplicate widget issues
    this.jq.find("script").remove();

    //Create dialog
    this.jq.dialog(this.cfg);
	
	// set style attribute
	var dialogParent = this.jq.parent();
	var style = dialogParent.attr('style');
	dialogParent.attr('style', style + ';' + this.cfg.dialogStyle);

    //Setup button pane
    var buttons = ice.ace.jq(this.jqId + '_buttons');
    buttons.addClass('ui-dialog-buttonpane ui-widget-content ui-helper-clearfix');
//    buttons.appendTo(buttons.parent().parent()).addClass('ui-dialog-buttonpane ui-widget-content ui-helper-clearfix');

    //Close icon
    if(this.cfg.closable == false) {
        ice.ace.jq(this.jqId).parent().find('.ui-dialog-titlebar-close').hide();
    }

//    if(this.cfg.appendToBody) {
//        this.jq.parent().appendTo(document.body);
//    }

};

ice.ace.ConfirmDialog.prototype.show = function() {
	var jq = this.jq;
    setTimeout(function(){jq.dialog('open');},1);
};

ice.ace.ConfirmDialog.prototype.hide = function() {
	var jq = this.jq;
    setTimeout(function(){jq.dialog('close');},1);
};

ice.ace.ConfirmDialog.browser = function() {
	if (ice.ace.jq.browser.msie) 
		if (ice.ace.jq.browser.version < 8) {
			if (navigator.userAgent.indexOf("Trident/5") < 0) // detects IE9, regardless of compatibility mode
				return 'ie7';
		} else {
			if (ice.ace.jq.browser.version < 9)
				return 'ie8';
		}
	return '';
};
/* 
* Original Code Copyright Prime Technology.
* Subsequent Code Modifications Copyright 2011-2012 ICEsoft Technologies Canada Corp. (c)
* 
* Licensed under the Apache License, Version 2.0 (the "License"); 
* you may not use this file except in compliance with the License. 
* You may obtain a copy of the License at 
* 
* http://www.apache.org/licenses/LICENSE-2.0 
* 
* Unless required by applicable law or agreed to in writing, software 
* distributed under the License is distributed on an "AS IS" BASIS, 
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
* See the License for the specific language governing permissions and 
* limitations under the License. 
* 
* NOTE THIS CODE HAS BEEN MODIFIED FROM ORIGINAL FORM 
* 
* Subsequent Code Modifications have been made and contributed by ICEsoft Technologies Canada Corp. (c). 
* 
* Code Modification 1: Integrated with ICEfaces Advanced Component Environment. 
* Contributors: ICEsoft Technologies Canada Corp. (c) 
* 
* Code Modification 2: [ADD BRIEF DESCRIPTION HERE] 
* Contributors: ______________________ 
* Contributors: ______________________ 
* 
*/

/**
 *  Panel Widget
 */
ice.ace.Panel = function(id, cfg) {
    this.id = id;
    this.cfg = cfg;
    this.jqId = ice.ace.escapeClientId(id);

    if(this.cfg.toggleable) {
        this.toggler = ice.ace.jq(this.jqId + '_toggler');
        this.toggleStateHolder = ice.ace.jq(this.jqId + '_collapsed');
        this.content = ice.ace.jq(this.jqId + '_content');

        this.setupToggleTrigger();
    }

    if(this.cfg.closable) {
        this.visibleStateHolder = ice.ace.jq(this.jqId + "_visible");

        this.setupCloseTrigger();
    }

    if(this.cfg.hasMenu) {
        this.visibleStateHolder = ice.ace.jq(this.jqId + "_visible");

        this.setupMenuTrigger();
    }
	
    if(!this.cfg.visible) {
        ice.ace.jq(this.jqId).css('display','none');
    }
}

ice.ace.Panel.prototype.toggle = function() {
    if(this.cfg.collapsed) {
        this.toggler.removeClass('ui-icon-plusthick').addClass('ui-icon-minusthick');
        this.cfg.collapsed = false;
        this.toggleStateHolder.val(false);
    }
    else {
        this.toggler.removeClass('ui-icon-minusthick').addClass('ui-icon-plusthick');
        this.cfg.collapsed = true;
        this.toggleStateHolder.val(true);
    }
	
    var _self = this;

    this.content.slideToggle(this.cfg.toggleSpeed,
        function(e) {
            if(_self.cfg.behaviors) {
                var toggleBehavior = _self.cfg.behaviors['toggle'];
                if (toggleBehavior) {
                    ice.ace.ab(toggleBehavior);
                }
            }
			// handle disableInputs overlay
			var panel = ice.ace.jq(ice.ace.escapeClientId(_self.id + '_content'));
			var overlay = panel.find('.ui-disableinputs');
			var overlayNode = overlay.get(0);
			if (overlayNode) {
				if (_self.cfg.collapsed == false) {
					ice.ace.Panel.positionOverlay(_self.id, overlayNode);
					overlay.show();
				} else {
					overlay.hide();
				}
			}
        });
}

ice.ace.Panel.prototype.close = function() {
    this.visibleStateHolder.val(false);

    var _self = this;

    ice.ace.jq(this.jqId).fadeOut(this.cfg.closeSpeed, '',
        function(e) {
            if(_self.cfg.behaviors) {
                var closeBehavior = _self.cfg.behaviors['close'];
                if (closeBehavior) {
                    ice.ace.ab(closeBehavior)
                }
            }
        }
    );
}

ice.ace.Panel.prototype.show = function() {
    ice.ace.jq(this.jqId).fadeIn(this.cfg.closeSpeed);
	
    this.visibleStateHolder.val(true);
}

ice.ace.Panel.prototype.setupToggleTrigger = function() {
    var _self = this,
    trigger = this.toggler.parent();

    this.setupTriggerVisuals(trigger);
    
    trigger.click(function() {_self.toggle();});
}

ice.ace.Panel.prototype.setupCloseTrigger = function() {
    var _self = this,
    trigger = ice.ace.jq(this.jqId + '_closer').parent();

    this.setupTriggerVisuals(trigger);
    
    trigger.click(function() {_self.close();});
}

ice.ace.Panel.prototype.setupMenuTrigger = function() {
    var trigger = ice.ace.jq(this.jqId + '_menu').parent();

    this.setupTriggerVisuals(trigger);
}

ice.ace.Panel.prototype.setupTriggerVisuals = function(trigger) {
    trigger.mouseover(function() {ice.ace.jq(this).addClass('ui-state-hover');})
            .mouseout(function() {ice.ace.jq(this).removeClass('ui-state-hover');});
}
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

// Constructor
ice.ace.linkButton = function(clientId, cfg) {
    var self = this,
        event = ice.ace.util.getEvent();
    this.id = clientId;
    this.jqId = ice.ace.escapeClientId(clientId);
    this.element = ice.ace.jq(this.jqId);
    this.anchor = this.element.find(this.anchorSelector);
    this.cfg = cfg;
    this.styleState = 'default';

    this.anchor.on('click', function() { self.onClick() })
               .on('keypress', function(e) { self.onKeypress(e) })
               .on("mousedown", function() { self.changeStyleState('active'); })
               .on("mouseup", function() { self.changeStyleState('hover'); })
               .on("mouseenter",function() { self.changeStyleState('hover'); })
               .on("focus",function() { self.changeStyleState('hover'); })
               .on("blur",function() { self.changeStyleState('default'); })
               .on("mouseleave",function() { self.changeStyleState('default'); });

    // lazy init occuring- our focus/hover event won't be set up yet
    if (document.activeElement == this.anchor[0])
        self.changeStyleState('hover');
    else if (event.type == "mouseover")
        self.changeStyleState('hover');

    var unload = function() {
        self.anchor.off('click keypress mousedown mouseup mouseenter focus blur mouseleave');
    }

    ice.onElementUpdate(clientId, unload);
};

ice.ace.linkButton.prototype.anchorSelector = ' > span > span > a';

ice.ace.linkButton.prototype.onClick = function () {
    var href = this.anchor.attr('href');
    var hasHref = !!href;
    var options = {
        source: this.id,
        render:"@all",
        params:this.cfg.uiParams
    },
    singleOptions = {
        execute:"@this"
    },
    fullOptions = {
        execute:"@all"
    };

    if (this.cfg.behaviors && this.cfg.behaviors.activate) {
        ice.ace.ab(ice.ace.extendAjaxArgs(
                this.cfg.behaviors.activate,
                {params:this.cfg.uiParams}
        ));
    } else if (this.cfg.hasAction) {
        ice.ace.jq(options).extend(fullOptions);
        ice.ace.ab(options);
    } else if (!hasHref) {
        ice.ace.jq(options).extend(singleOptions);
        ice.ace.ab(options);
    }

    // Skip default anchor behavior if missing an href or if
    // a listener/behavior is attached to the component
    if (!hasHref || this.cfg.hasAction || this.cfg.behaviors)
        return false;
};

ice.ace.linkButton.prototype.onKeypress = function (e) {
    if (e.keyCode != 13)
        return true;

    this.onClick();
};

ice.ace.linkButton.prototype.changeStyleState = function(state) {
    this.removeStyleState(this.styleState);
    this.addStyleState(state);
    this.styleState = state;
}

ice.ace.linkButton.prototype.addStyleState = function(state) {
    if (state == 'hover') this.element.addClass('ui-state-hover');
    else if (state == 'active') this.element.addClass('ui-state-active');
    else if (state == 'default') {}
};

ice.ace.linkButton.prototype.removeStyleState = function(state) {
    if (state == 'hover') this.element.removeClass('ui-state-hover');
    else if (state == 'active') this.element.removeClass('ui-state-active');
    else if (state == 'default') {}
};
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

if (!window.ice['ace']) {
    window.ice.ace = {};
}

if (!ice.ace.Lists) ice.ace.Lists = {};

ice.ace.List = function(id, cfg) {
    var self = this;
    this.id = id;
    this.jqId = ice.ace.escapeClientId(this.id);
    this.cfg = cfg;
    this.sep = String.fromCharCode(this.cfg.separator);
    this.element = ice.ace.jq(this.jqId);
    this.behaviors = cfg.behaviors;

    // global list of list objects, used by a component
    // to rebuild widget lists following an inserting update.
    if (ice.ace.Lists[id]) {
        var old = ice.ace.Lists[id];
        if (old.disableClickHandling)
            this.disableClickHandling = true;
        if (old.disableDoubleClickHandling)
            this.disableDoubleClickHandling = true;

        setTimeout(function() {
            self.disableClickHandling = false;
            self.disableDoubleClickHandling = false;
        }, 500);
    }
    ice.ace.Lists[id] = self;

    // Setup drag wrapped drag events
    this.appStartHandler = this.cfg.start;
    cfg.start = function(event, ui) {
        var placeholder = ice.ace.jq(event.currentTarget).find('.if-list-plhld'),
            li = ice.ace.jq(event.originalEvent.target).closest('li'),
            width = li.width(),
            height = li.height();

        // Copy size into placeholder while dragging element around
        placeholder.width(width+"px").height(height+"px");

        self.dragFromHandler.call(self, event, ui);

        if (self.appStartHandler)
            return self.appStartHandler(event, ui);
        return true;
    };

    this.appStopHandler = this.cfg.stop;
    cfg.stop = function(event, ui) {
        self.dragToHandler.call(self, event, ui);
        if (self.appStopHandler)
            return self.appStopHandler.call(self, event, ui);
        return true;
    };

    this.appRecieveHandler = this.cfg.receive;
    cfg.receive = function(event, ui) {
        self.itemReceiveHandler.call(self, event, ui);
        if (self.appRecieveHandler)
            return self.appRecieveHandler.call(self, event, ui);
        return true;
    };

    if (cfg.selection)
        this.setupSelection();

    if (cfg.dblclk_migrate)
        this.setupClickMigration();

    if (cfg.controls)
        this.setupControls();

    if (cfg.dragging)
        this.element.find("> ul").sortable(cfg);
};

// ************************************************************************* //
// List Features //
// ************************************************************************* //

ice.ace.List.prototype.itemReceiveHandler = function(event, ui) {
    var item = ui.item,
        id = item.attr('id'),
        fromIndex = parseInt(id.substr(id.lastIndexOf(this.sep)+1)),
        srcId = ui.sender.closest('.if-list').attr('id'),
        src = ice.ace.Lists[srcId];

    fromIndex = src.getUnshiftedIndex(
            src.element.find('> ul').children().length,
            src.read('reorderings'),
            fromIndex);

    this.immigrantMessage = [];
    this.immigrantMessage.push(srcId);
    this.immigrantMessage.push([[fromIndex , item.index()]]);

    // Deselect all in connected lists but the currently
    // dragged item.
    if (src.cfg.selection) {
        this.deselectConnectedLists();
        this.deselectAll(item);
        src.addSelectedItem(item, fromIndex);
    }

    this.sendMigrateRequest();
};

ice.ace.List.prototype.sendMigrateRequest = function(onsuccess) {
    var destList = this,
        sourceListId = destList.immigrantMessage[0],
        sourceList = ice.ace.Lists[sourceListId],
        options = {
            source: destList.id,
            execute: destList.id + " " + sourceListId,
            render: destList.id + " " + sourceListId
        };

    var params = {};
    params[sourceListId+'_emigration'] = destList.id;
    params[destList.id+'_immigration'] = JSON.stringify(destList.immigrantMessage);
    options.params = params;

    options.onsuccess = function(responseXML) {;
        destList.element = ice.ace.jq(ice.ace.escapeClientId(destList.element.attr('id')));
        if (destList.cfg.dragging) destList.element.find("> ul").sortable(destList.cfg);

        sourceList.element = ice.ace.jq(ice.ace.escapeClientId(sourceList.element.attr('id')));
        if (sourceList.cfg.dragging) sourceList.element.find("> ul").sortable(sourceList.cfg);

        if (ice.ace.jq.isFunction(onsuccess))
            onsuccess();

        return true;
    };

    if (this.behaviors)
        if (this.behaviors.migrate) {
            ice.ace.ab(ice.ace.extendAjaxArgs(this.behaviors.migrate, options));

            // Clear submitted states
            this.clearState();
            sourceList.clearState();
            // Remove items undergoing migration from DOM to prevent rapid clicks from
            // causing premature subsequent migrations to this selection
            sourceList.element.find('> ul > li.ui-state-active').remove();
            return;
        }

    ice.ace.AjaxRequest(options);

    // Clear submitted states
    this.clearState();
    sourceList.clearState();
    // Remove items undergoing migration from DOM to prevent rapid clicks from
    // causing premature subsequent migrations to this selection
    sourceList.element.find('> ul > li.ui-state-active').remove();
};

ice.ace.List.prototype.dragFromHandler = function(event, ui) {
    this.startIndex = ui.item.index();
};

ice.ace.List.prototype.dragToHandler = function(event, ui) {
    // If moving in list

    // Align FF and IE with Webkit, produce a mouseout event
    // on the dropped item if 100ms post drop it has been aligned
    // out from under our cursor.
    var item = ui.item,
        self = this;

    if (!(ice.ace.jq.browser.chrome || ice.ace.jq.browser.safari)) {
        setTimeout(function () {
            var ie = ice.ace.jq.browser.msie && (ice.ace.jq.browser.version == 8 || ice.ace.jq.browser.version == 7);
            if (!ice.ace.util.isMouseOver(item, event)) self.itemLeave({currentTarget : item});
        }, 100);
    }

    /*
        For an odd reason jq.closest() returns no results incorrectly here for some IDs.
        I have the feeling it doesn't process the escaping in the selector for the ':' character correctly */
    if (ui.item.parents(this.jqId).length > 0) {
        var swapRecords = this.read('reorderings'),
            recordStart = swapRecords.length,
            index = ui.item.index(),
            lower = (index > this.startIndex),
            to = ui.item,
            from = lower ? to.prev() : to.next(),
            id = item.attr('id'),
            idIndex = parseInt(id.substr(id.lastIndexOf(this.sep)+1));

        idIndex = this.getUnshiftedIndex(
                        this.element.find('> ul').children().length,
                        this.read('reorderings'),
                        idIndex);

        // If item is in a new position
        if (index != this.startIndex) {
            // Alter selection state
            if (this.cfg.selection) {
                this.deselectAll();
                this.deselectConnectedLists();
                this.addSelectedItem(item, idIndex);
            }

            // Update ID indexes of all previous items
            do {
                var record = [];
                record.push(from.index());
                record.push(to.index());

                swapRecords.splice(recordStart,0,record);
                this.swapIdPrefix(from, to);

                to = from;
                from = lower ? to.prev() : to.next();
            } while (to.index() != this.startIndex);
        }

        this.write('reorderings', swapRecords);

        if (this.behaviors)
            if (this.behaviors.move) {
                var self = this;
                this.behaviors.move.oncomplete = function() {
                    self.clearState();
                };
                ice.ace.ab(this.behaviors.move);
            }
    }
    // Migrating between lists handled by new item insertion handler, not this drop handler
};

ice.ace.List.prototype.setupControls = function() {
    var self = this,
        itemSelector = ' > div.if-list-ctrls .if-list-ctrl';

    this.element
            .off('mouseenter', itemSelector).on('mouseenter', itemSelector, function(e) {
                var ctrl = e.currentTarget;
                ice.ace.jq(ctrl).addClass('ui-state-hover');
            })
            .off('mouseleave', itemSelector).on('mouseleave', itemSelector, function(e) {
                var ctrl = e.currentTarget;
                ice.ace.jq(ctrl).removeClass('ui-state-hover');
            })
            .off('click', itemSelector).on('click', itemSelector, function(e) {
                self.controlClickHandler.call(self, e);
            });
};

ice.ace.List.prototype.controlClickHandler = function(e) {
    var ctrl = e.currentTarget,
        jqCtrl = ice.ace.jq(ctrl),
        dir;

    if (!ice.ace.jq.browser.msie || ice.ace.jq.browser.version == 9) {
        jqCtrl.toggleClass('ui-state-active', 50)
            .toggleClass('ui-state-active', 50);
    }

    if (jqCtrl.hasClass('if-list-ctrl-top'))
        dir = "top";
    else if (jqCtrl.hasClass('if-list-ctrl-up'))
        dir = "up";
    else if (jqCtrl.hasClass('if-list-ctrl-dwn'))
        dir = "dwn";
    else if (jqCtrl.hasClass('if-list-ctrl-btm'))
        dir = "btm";

    this.moveItems(dir);
};

ice.ace.List.prototype.setupSelection = function() {
    var self = this,
        selector = ' > ul > li:not(.disabled)';

    ice.ace.jq(this.element)
            .off('mouseenter mouseleave click', selector)
            .on('mouseenter', selector, this.itemEnter)
            .on('mouseleave', selector, this.itemLeave)
            .on('click', selector, function(e) {
                self.itemClickHandler.call(self, e);
        });
};

ice.ace.List.prototype.setupClickMigration = function() {
    var self = this,
        selector = ' > ul > li';

    ice.ace.jq(this.element)
            .off('dblclick', selector)
            .on('dblclick', selector, function(e) { self.itemDoubleClickHandler.call(self, e); });
}

ice.ace.List.prototype.itemEnter = function(e) {
    ice.ace.jq(e.currentTarget).addClass('ui-state-hover');
};

ice.ace.List.prototype.itemLeave = function(e) {
    ice.ace.jq(e.currentTarget).removeClass('ui-state-hover');
};

ice.ace.List.prototype.itemDoubleClickHandler = function(e) {
    if (!this.disableDoubleClickHandling) {
        var item = ice.ace.jq(e.currentTarget),
            self = this,
            id = item.attr('id'),
            from = this,
            fromIndex = parseInt(id.substr(id.lastIndexOf(this.sep)+1)),
            to = this.getSiblingList(e.shiftKey);

        clearTimeout(this.pendingClickHandling);
        this.pendingClickHandling = undefined;

        fromIndex = this.getUnshiftedIndex(
            this.element.find('> ul').children().length,
            this.read('reorderings'),
            fromIndex);

        if (to == undefined) return;

        to.immigrantMessage = [];
        to.immigrantMessage.push(this.id);
        to.immigrantMessage.push([[fromIndex , to.element.find('> ul').children().length]]);

        if (this.cfg.selection) {
            to.deselectConnectedLists();
            to.deselectAll();
            this.addSelectedItem(item, fromIndex);
        }

        setTimeout(function() {
            self.disableDoubleClickHandling = false;
            self.disableClickHandling = false;
        },500);

        // Only allow more clicks to occur once migration has finished
        to.sendMigrateRequest(function() {
            from.doubleClickAttempted = false;
        });
    }
}

/* Get the following (or if shift is held, previous) list in the first
   listControl binding that associates this list with another */
ice.ace.List.prototype.getSiblingList = function (shift) {
    for(var controlId in ice.ace.ListControls) {
        if(ice.ace.ListControls.hasOwnProperty(controlId)) {
            var listSet = ice.ace.jq(ice.ace.ListControls[controlId].selector),
                listContainer = this.element.parent().parent(),
                lastSibling = (shift || listContainer.hasClass('if-list-dl-2')),
                listIndex = listSet.index(this.element);

            if (listIndex < 0) continue;

            listIndex = lastSibling ? listSet.index(this.element)-1 : listSet.index(this.element)+1;

            if ((!lastSibling && listIndex >= listSet.length) || (lastSibling && listIndex < 0))
                return undefined;

            if (listIndex >= 0)
                return ice.ace.Lists[ice.ace.jq(listSet[listIndex]).attr('id')];
        }
    }

    return undefined;
}

ice.ace.List.prototype.pendingClickHandling;
ice.ace.List.prototype.lastClickedIndex;
ice.ace.List.prototype.disableClickHandling = false;
ice.ace.List.prototype.disableDoubleClickHandling = false;

ice.ace.List.prototype.itemClickHandler = function(e) {
    // Prevent click handling if waiting to see if we've double clicked
    // or prevent click handling if we have already double clicked and are
    // mindlessly mashing on this element
    if (this.pendingClickHandling == undefined && !this.disableClickHandling) {
        var li = e.currentTarget,
            jqLi = ice.ace.jq(li),
            self = this,
            timeout = this.cfg.dblclk_migrate ? 250 : 0;

        this.disableClickHandling = true;

        this.pendingClickHandling =
            setTimeout(function () {
                var index = jqLi.index();

                // find connected lists and deselect all
                self.deselectConnectedLists();

                if (e.shiftKey && self.cfg.selection != "single") {
                    // Clear selection from shift key use
                    self.clearSelection();

                    var lower, higher, last_clicked = self.lastClickedIndex ? self.lastClickedIndex : -1;
                    if (last_clicked < index) {
                        lower = last_clicked + 1;
                        higher = index + 1;
                    } else {
                        lower = index;
                        higher = last_clicked;
                    }

                    jqLi.parent().children().slice(lower, higher).filter(":not(.ui-state-active)").each(function () {
                        self.addSelectedItem(ice.ace.jq(this), null, true);
                    });

                    if (self.behaviors && self.behaviors.select) {
                        self.behaviors.select.oncomplete = function() {
                            self.clearState();
                        };
                        ice.ace.ab(self.behaviors.select);
                    }
                }
                else {
                    var deselection = jqLi.hasClass('ui-state-active');

                    function modifyState() {
                        if (deselection) {
                            self.removeSelectedItem(jqLi);
                        } else {
                            self.addSelectedItem(jqLi);
                        }
                    }

                    // If this is single selection or no ctrl key is depressed
                    // deselect all before modifying selection
                    if (!(e.metaKey || e.ctrlKey) || self.cfg.selection == "single") {
                        self.deselectAll(null, modifyState);
                    } else {
                        modifyState();
                    }
                }

                self.lastClickedIndex = index;
                self.pendingClickHandling = undefined;
                self.disableClickHandling = false;
            }, timeout);
    }
};

/* Determines the original index of an item at a particular index */
ice.ace.List.prototype.getUnshiftedIndex = function(length, reorderings, index) {
    var indexes = [];
    for (var i = 0; length - i >= 0; i++) indexes.push(i);
    for (var i = 0; i < reorderings.length; i++) {
        var from = reorderings[i][0];
            to = reorderings[i][1];
            t = indexes[to];

        indexes[to] = indexes[from];
        indexes[from] = t;
    }

    return indexes[index];
};

ice.ace.List.prototype.addSelectedItem = function(item, inputIndex, skipSubmit) {
    if (!item.hasClass('ui-state-active')) {
        var selections = this.read('selections'),
            deselections = this.read('deselections'),
            reorderings = this.read('reorderings'),
            id = item.attr('id'),
            index;

        if (inputIndex) index = inputIndex;
        else {
            index = id.substr(id.lastIndexOf(this.sep)+1),
            index = this.getUnshiftedIndex(item.siblings().length, reorderings, parseInt(index));
        }

        item.addClass('ui-state-active');

        deselections = ice.ace.jq.grep(deselections, function(r) { return r != index; });
        selections.push(index);

        this.write('selections', selections);
        this.write('deselections', deselections);

        if (this.behaviors && !skipSubmit)
            if (this.behaviors.select) {
                var self = this;
                this.behaviors.select.oncomplete = function() {
                    self.clearState();
                };
                ice.ace.ab(this.behaviors.select);
            }
    }
};


ice.ace.List.prototype.deselectConnectedLists = function() {
    for(var controlId in ice.ace.ListControls) {
        if(ice.ace.ListControls.hasOwnProperty(controlId)) {
            var listSet = ice.ace.jq(ice.ace.ListControls[controlId].selector);
            if (listSet.is(this.element))
                listSet.not(this.element)
                        .each(function (i, elem) {
                            ice.ace.Lists[ice.ace.jq(elem).attr('id')].deselectAll();
                        });
        }
    }
}

ice.ace.List.prototype.removeSelectedItem = function(item) {
    if (item.hasClass('ui-state-active')) {
        var selections = this.read('selections'),
            deselections = this.read('deselections'),
            reorderings = this.read('reorderings'),
            id = item.attr('id'),
            index = id.substr(id.lastIndexOf(this.sep)+1),
            origIndex = this.getUnshiftedIndex(item.siblings().length, reorderings, parseInt(index));

        item.removeClass('ui-state-active');

        selections = ice.ace.jq.grep(selections, function(r) { return r != index; });
        deselections.push(origIndex);

        this.write('selections', selections);
        this.write('deselections', deselections);

        if (this.behaviors)
            if (this.behaviors.deselect) {
                var self = this;
                this.behaviors.deselect.oncomplete = function() {
                    self.clearState();
                };
                ice.ace.ab(this.behaviors.deselect);
            }
    }
};

ice.ace.List.prototype.deselectAll = function(except, done) {
    var self = this,
        reorderings = this.read('reorderings'),
        selections = this.read('selections'),
        deselections = this.read('deselections');

    this.element.find('> ul.if-list-body > li.if-list-item.ui-state-active').each(function(i, elem) {{
                if (except != undefined && except.is(elem)) return;

                var item = ice.ace.jq(elem),
                    id = item.attr('id'),
                    index = parseInt(id.substr(id.lastIndexOf(self.sep)+1));

                item.removeClass('ui-state-active');

                if (index != undefined)
                    index = self.getUnshiftedIndex(item.parent().children().length, reorderings, index);

                if (index != undefined) {
                    deselections.push(index);
                    selections = ice.ace.jq.grep(selections, function(r) { return r != index; });
                }
            }});

    this.write('selections', selections);
    this.write('deselections', deselections);

    if (this.behaviors && this.behaviors.deselect && !isNaN(deselections.length) && deselections.length > 0) {
        var s = this;
        this.behaviors.deselect.oncomplete = function() {
            s.clearState();
            if (done) done();
        };
        ice.ace.ab(this.behaviors.deselect);
    } else {
        if (done) done();
    }
}

ice.ace.List.prototype.clearState = function() {
    // Clear state to avoid having stale state being added to enqueued requests.
    this.write('reorderings', []);
    this.write('selections', []);
    this.write('deselections', []);
}

ice.ace.List.prototype.moveItems = function(dir) {
    var selectedItems = this.element.find('.ui-state-active');

    if (selectedItems.length > 0) {
        // do element swaps
        var swapRecords = this.read('reorderings');

        if (dir == "top") {
            for (var i = selectedItems.length-1; i >= 0; i--) {
                var item = ice.ace.jq(selectedItems[i]),
                        target = item.prev();

                if (target.length > 0) do {
                    var record = [];
                    record.push(item.index());
                    target.before(item);
                    record.push(item.index());

                    swapRecords.push(record);
                    this.swapIdPrefix(item, target);

                    target = item.prev();
                } while (target.length > 0);
            }
        }
        else if (dir == "up") {
            for (var i = 0; i < selectedItems.length; i++) {
                var item = ice.ace.jq(selectedItems[i]),
                        record = [];
                record.push(item.index());

                var target = item.prev(':first');
                target.before(item);

                record.push(item.index());
                swapRecords.push(record);
                this.swapIdPrefix(item, target);
            }
        }
        else if (dir == "dwn" || dir == "down") {
            for (var i = selectedItems.length-1; i >= 0; i--) {
                var item = ice.ace.jq(selectedItems[i]),
                        record = [];
                record.push(item.index());

                var target = item.next(':first');
                target.after(item);

                record.push(item.index());
                swapRecords.push(record);
                this.swapIdPrefix(item, target);
            }
        }
        else if (dir == "btm" || dir == "bottom") {
            for (var i = 0; i < selectedItems.length; i++) {
                var item = ice.ace.jq(selectedItems[i]),
                        target = item.next();

                if (target.length > 0) do {
                    var record = [];
                    record.push(item.index());
                    target.after(item);
                    record.push(item.index());

                    swapRecords.push(record);
                    this.swapIdPrefix(item, target);

                    target = item.next();
                } while (target.length > 0);
            }
        }

        // write swaps or ajax submit
        this.write('reorderings', swapRecords);

        if (this.behaviors)
            if (this.behaviors.move) {
                var self = this;
                this.behaviors.move.oncomplete = function() {
                    self.clearState();
                };
                ice.ace.ab(this.behaviors.move);
            }
    }
};

// Used to keep id for each child in place, so per-item updates
// occur as expected
ice.ace.List.prototype.swapIdPrefix = function(from, to) {
    if (from.length == 0 || to.length == 0) return;

    var fromId = from.attr('id'),
        toId = to.attr('id'),
        fromElems = from.find('*[id^="'+fromId+'"]'),
        toElems = to.find('*[id^="'+toId+'"]');

    from.attr('id', toId);
    to.attr('id', fromId);

    for (var x = 0; x < fromElems.length; x++) {
        var i = ice.ace.jq(fromElems[x]);
        i.attr('id', i.attr('id').replace(fromId, toId));
    }

    for (var x = 0; x < toElems.length; x++) {
        var i = ice.ace.jq(toElems[x]);
        i.attr('id', i.attr('id').replace(toId, fromId));
    }
};

ice.ace.List.prototype.read = function(field) {
    var contents = ice.ace.jq(ice.ace.escapeClientId(this.element.attr('id'))).children('input[name="'+this.jqId.substr(1)+'_'+field+'"]').val();
    if ((contents != "") && (contents != undefined))
        return JSON.parse(contents);
    else return [];
};

ice.ace.List.prototype.write= function(field, data) {
    var element = ice.ace.jq(ice.ace.escapeClientId(this.element.attr('id'))).children('input[name="'+this.jqId.substr(1)+'_'+field+'"]');
    element.attr('value', JSON.stringify(data));
};

ice.ace.List.prototype.clearSelection = function() {
    if (window.getSelection) {
        if (window.getSelection().empty) {  // Chrome
            window.getSelection().empty();
        } else if (window.getSelection().removeAllRanges) {  // Firefox
            window.getSelection().removeAllRanges();
        }
    } else if (document.selection) {  // IE?
        document.selection.empty();
    }
};
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

if (!window.ice['ace']) {
    window.ice.ace = {};
}

if (!ice.ace.ListControls) ice.ace.ListControls = {};

ice.ace.ListControl = function(id, cfg) {
    this.id = id;
    this.jqId = ice.ace.escapeClientId(this.id);
    this.cfg = cfg;
    this.element = ice.ace.jq(this.jqId);
    this.selector = cfg.selector;
    this.sep = String.fromCharCode(this.cfg.separator);

    // If control hasn't been built before setup clean up callback
    if (!ice.ace.ListControls[id]) {
        var self = this;
        ice.onElementUpdate(this.id, function() { self.unload(); });
    }

    // global list of list control objects, used by lists to
    // find lists they share migration controls with, in order
    // to enforce mutually exclusive selection
    ice.ace.ListControls[id] = this;

    this.setupControls();
};

ice.ace.ListControl.prototype.unload = function() {
    delete ice.ace.ListControls[this.id];

    var selector;

    if (this.element.hasClass('if-list-nctrls'))
        selector = '> .if-list-ctrl-spcr > .if-list-nctrl';
    else
        selector = '> .if-list-nctrls .if-list-nctrl, > .if-list-dl > .if-list-nctrls .if-list-nctrl';

    this.element.find(selector).off('mouseenter mouseleave click');
}

ice.ace.ListControl.prototype.setupControls = function(){
    var self = this, selector;

    if (this.element.hasClass('if-list-nctrls'))
        selector = '> .if-list-ctrl-spcr > .if-list-nctrl';
    else
        selector = '> .if-list-nctrls .if-list-nctrl, > .if-list-dl > .if-list-nctrls .if-list-nctrl';

    this.element.find(selector)
        .off('mouseenter').on('mouseenter', function(e) {
            var ctrl = e.currentTarget;
            ice.ace.jq(ctrl).addClass('ui-state-hover');
        })
        .off('mouseleave').on('mouseleave', function(e) {
            var ctrl = e.currentTarget;
            ice.ace.jq(ctrl).removeClass('ui-state-hover');
        })
        .off('click').on('click', function(e) { self.controlClickHandler.call(self, e); });
};


ice.ace.ListControl.prototype.refreshLists = function() {
    this.lists = ice.ace.jq(this.selector);
};

ice.ace.ListControl.prototype.controlClickHandler = function(e) {
    var ctrl = e.currentTarget,
        jqCtrl = ice.ace.jq(ctrl),
        dir,
        all = false;

    this.refreshLists();

    if (!ice.ace.jq.browser.msie || ice.ace.jq.browser.version == 9) {
        jqCtrl.toggleClass('ui-state-active', 50)
        .toggleClass('ui-state-active', 50);
    }

    if (jqCtrl.hasClass('if-list-nctrl-alll')) {
        dir = "alll";
        all = true;
    }
    else if (jqCtrl.hasClass('if-list-nctrl-lft'))
        dir = "lft";
    else if (jqCtrl.hasClass('if-list-nctrl-rgt'))
        dir = "rgt";
    else if (jqCtrl.hasClass('if-list-nctrl-allr')) {
        dir = "allr";
        all = true;
    }

    var from = this.getSourceList(dir, all);
    if (!from) return;

    var to = this.getDestinationList(from, dir);
    if (!to) return;


    var im = [];
    im.push(from.id);
    im.push(this.getRecords(from, to, all));

    from.element.find('> ul > li').removeClass('if-list-last-clicked');
    to.element.find('> ul > li').removeClass('if-list-last-clicked');

    to.immigrantMessage = im;
    to.sendMigrateRequest();
};

ice.ace.ListControl.prototype.getSourceList = function(dir, all) {
    // If we are moving all the elements and this is dual list mode
    if (all && this.element.hasClass('if-list-dl-cnt')) {
        var list;
        if (dir.substr(dir.length-1) == 'r')
            list = this.element.find(' > div.if-list-dl > span.if-list-dl-1 > div > div.if-list');
        else
            list = this.element.find(' > div.if-list-dl > span.if-list-dl-2 > div > div.if-list');

        return ice.ace.Lists[list.attr('id')];
    }

    // Return first list in selector that has a selected row
    var activeList = this.lists.find('.if-list-item.ui-state-active:first');
    if (activeList.length > 0)
        return ice.ace.Lists[ activeList.closest('.if-list').attr('id') ];
    else
        return undefined;
};

ice.ace.ListControl.prototype.getDestinationList = function(source, dir) {
    var sourceIndex = this.lists.index(source.element);

    if (dir == 'allr' || dir == 'rgt') {
        if (sourceIndex != (this.lists.length-1))
            return ice.ace.Lists[ice.ace.jq(this.lists[sourceIndex+1]).attr('id')];
    }
    else
        if (sourceIndex != 0)
            return ice.ace.Lists[ice.ace.jq(this.lists[sourceIndex-1]).attr('id')];

    return undefined;
};

ice.ace.ListControl.prototype.getRecords = function(source, dest, all) {
    var childSelector = all ? '*' : '.ui-state-active' ,
        sourceChildren = ice.ace.jq(source.element).find('> ul.if-list-body').children(),
        sourceIds = sourceChildren.filter(childSelector).map(function() { return ice.ace.jq(this).attr('id'); }),
        sourceLength = sourceChildren.length,
        sourceReorderings = source.read('reorderings'),
        records = [],
        destIndex = ice.ace.jq(dest.element).find('> ul.if-list-body').children().length;

    for (var i = 0; i < sourceIds.length; i++) {
        var record = [], id = sourceIds[i];
        record.push(source.getUnshiftedIndex(sourceLength, sourceReorderings, parseInt(id.substr(id.lastIndexOf(this.sep)+1))));
        record.push(destIndex + i);
        records.push(record);
    }

    return records;
};
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

if (!window['ice']) window.ice = {};
if (!window.ice['ace']) window.ice.ace = {};
ice.ace.animation = {};
		
ice.ace.animation.run = function(args, options, speed, callback) {

	var node;
	if (typeof args.node == 'string') {
		node = ice.ace.jq(ice.ace.escapeClientId(args.node));
	} else {
		node = ice.ace.jq(args.node);
	}
	var effectName = args.name.toLowerCase();
	var easing = args.easing || 'easeOutQuad';

	node.queue(function() {

		if (effectName == 'anim') {

			var iterations = args.iterations || 1;
			var duration = args.duration || 500;
			
			for (var i = 0; i < iterations; i++) {
				node.animate(args.from, 0, easing);
				node.animate(args.to, duration, easing);
			}
		} else {
			if (!options) options = {};
			if (!options.easing) options.easing = easing;
			node.effect(effectName, options, speed, callback);
		}
		
		node.dequeue();
	});
}

ice.ace.animation.register = function(args, callback) {

}
/* 
* Original Code Copyright Prime Technology.
* Subsequent Code Modifications Copyright 2011-2012 ICEsoft Technologies Canada Corp. (c)
* 
* Licensed under the Apache License, Version 2.0 (the "License"); 
* you may not use this file except in compliance with the License. 
* You may obtain a copy of the License at 
* 
* http://www.apache.org/licenses/LICENSE-2.0 
* 
* Unless required by applicable law or agreed to in writing, software 
* distributed under the License is distributed on an "AS IS" BASIS, 
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
* See the License for the specific language governing permissions and 
* limitations under the License. 
* 
* NOTE THIS CODE HAS BEEN MODIFIED FROM ORIGINAL FORM 
* 
* Subsequent Code Modifications have been made and contributed by ICEsoft Technologies Canada Corp. (c). 
* 
* Code Modification 1: Integrated with ICEfaces Advanced Component Environment. 
* Contributors: ICEsoft Technologies Canada Corp. (c) 
* 
* Code Modification 2: [ADD BRIEF DESCRIPTION HERE] 
* Contributors: ______________________ 
* Contributors: ______________________ 
* 
*/


/**
 *  Accordion Widget
 */
ice.ace.AccordionPanel = function(id, cfg) {
    this.id = id;
    this.cfg = cfg;
    this.jqId = ice.ace.escapeClientId(id);
    this.jq = ice.ace.jq(this.jqId).children().eq(0);
	this.activeId = this.jqId + '_active';
    var _self = this;
	
	try {
		this.cfg.active = parseInt(ice.ace.jq(this.activeId).val());
		if (this.cfg.active < 0)
			this.cfg.active = false;
	} catch (e) {
		this.cfg.active = 0;
	}

    //Create accordion
    this.jq.accordion(this.cfg);
    
    this.jq.bind('accordionchangestart', function(event, ui) {
        _self.onTabChange(event, ui);
    });
    
    setTimeout(function() { _self.jq.accordion('resize'); }, 100); // for calculating correct heights when inside tabSet
}

/**
 * TabChange handler
 */
ice.ace.AccordionPanel.prototype.onTabChange = function(event, ui) {
    var panel = ui.newContent.get(0);

    //Write state
    ice.ace.jq(this.activeId).val(ui.options.active);

	this.fireAjaxTabChangeEvent(panel);
}

/**
 * Fires an ajax tabChangeEvent if a tabChangeListener is defined on server side
 */
ice.ace.AccordionPanel.prototype.fireAjaxTabChangeEvent = function(panel) {
    var formId = this.jq.closest('form').attr('id');
    var options = {
        source: this.id,
        execute: this.id,
		render: this.id
    },
    behaviourArgs = this.cfg && this.cfg.behaviors && this.cfg.behaviors.panechange;
	if (this.cfg.ajaxTabChange) {
		options.execute = formId;
		options.render = '@all';
	}

    var params = {};
    params[this.id + '_tabChange'] = true;
    if (panel) params[this.id + '_newTab'] = panel.id;

    options.params = params;

    if (behaviourArgs) {
        ice.ace.ab(ice.ace.extendAjaxArgs(
                behaviourArgs,
                ice.ace.clearExecRender(options)
        ));
    } else ice.ace.AjaxRequest(options);
};

ice.ace.AccordionPanel.prototype.select = function(index) {
    this.jq.accordion('activate', index);
};

ice.ace.AccordionPanel.prototype.collapseAll = function() {
    this.jq.accordion('activate', false);
};
/* 
* Original Code Copyright Prime Technology.
* Subsequent Code Modifications Copyright 2011-2012 ICEsoft Technologies Canada Corp. (c)
* 
* Licensed under the Apache License, Version 2.0 (the "License"); 
* you may not use this file except in compliance with the License. 
* You may obtain a copy of the License at 
* 
* http://www.apache.org/licenses/LICENSE-2.0 
* 
* Unless required by applicable law or agreed to in writing, software 
* distributed under the License is distributed on an "AS IS" BASIS, 
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
* See the License for the specific language governing permissions and 
* limitations under the License. 
* 
* NOTE THIS CODE HAS BEEN MODIFIED FROM ORIGINAL FORM 
* 
* Subsequent Code Modifications have been made and contributed by ICEsoft Technologies Canada Corp. (c). 
* 
* Code Modification 1: Integrated with ICEfaces Advanced Component Environment. 
* Contributors: ICEsoft Technologies Canada Corp. (c) 
* 
* Code Modification 2: [ADD BRIEF DESCRIPTION HERE] 
* Contributors: ______________________ 
* Contributors: ______________________ 
* 
*/

ice.ace.NotificationBar = function(id, cfg) {
    this.id = id;
    this.cfg = cfg;
    this.jq = ice.ace.escapeClientId(this.id);

    ice.ace.jq(this.jq).css(this.cfg.position, '0');
    ice.ace.jq(this.jq).css("left", '0');

//	jQuery(this.jq).appendTo(jQuery('body'));

    if (this.cfg.visible) {
        ice.ace.jq(this.jq).css({'display':'block'});
    } else {
        ice.ace.jq(this.jq).css({'display':'none'});
    }
    if (this.cfg.ariaEnabled) {
        ice.ace.jq(this.jq).attr("aria-hidden", !this.cfg.visible);
    }
};

ice.ace.NotificationBar.prototype.show = function() {
    if (this.cfg.effect === "slide")
        ice.ace.jq(this.jq).slideDown(this.cfg.effect);
    else if (this.cfg.effect === "fade")
        ice.ace.jq(this.jq).fadeIn(this.cfg.effect);
    else if (this.cfg.effect === "none")
        ice.ace.jq(this.jq).show();
    this.cfg.visible = true;
    if (this.cfg.ariaEnabled) {
        ice.ace.jq(this.jq).attr("aria-hidden", !this.cfg.visible);
    }
    var behaviour = this.cfg && this.cfg.behaviors && this.cfg.behaviors.display;
    if (behaviour) {
        ice.ace.ab(behaviour);
    }
};

ice.ace.NotificationBar.prototype.hide = function() {
    if (this.cfg.effect === "slide")
        ice.ace.jq(this.jq).slideUp(this.cfg.effect);
    else if (this.cfg.effect === "fade")
        ice.ace.jq(this.jq).fadeOut(this.cfg.effect);
    else if (this.cfg.effect === "none")
        ice.ace.jq(this.jq).hide();
    this.cfg.visible = false;
    if (this.cfg.ariaEnabled) {
        ice.ace.jq(this.jq).attr("aria-hidden", !this.cfg.visible);
    }
    var behaviour = this.cfg && this.cfg.behaviors && this.cfg.behaviors.close;
    if (behaviour) {
        ice.ace.ab(behaviour);
    }
};
/*
 * eros@recording.it
 * jqprint 0.3
 */
(function($) {
    var opt;

    $.fn.jqprint = function (options) {
        opt = $.extend({}, $.fn.jqprint.defaults, options);

        var $element = (this instanceof ice.ace.jq) ? this : $(this);
		var $iframe;
		var doc;
		var tab;

        if (opt.operaSupport && $.browser.opera)
        {
            tab = window.open("","jqPrint-preview");
            tab.document.open();

            doc = tab.document;
        }
        else
        {
            $iframe = $("<iframe  />");

            if (!opt.debug) { $iframe.css({ position: "absolute", width: "0px", height: "0px", left: "-600px", top: "-600px" }); }

            $iframe.appendTo("body");
            doc = $iframe[0].contentWindow.document;
        }

        if (opt.importCSS)
        {
            if ($("link[media=print]").length > 0)
            {
                $("link[media=print]").each( function() {
                    doc.write("<link type='text/css' rel='stylesheet' href='" + $(this).attr("href") + "' media='print' />");
                });
            }
            else
            {
                $("link").each( function() {
                    doc.write("<link type='text/css' rel='stylesheet' href='" + $(this).attr("href") + "' />");
                });
            }
        }

        if (opt.printContainer) { doc.write($element.outer()); }
        else { $element.each( function() { doc.write($(this).html()); }); }

        doc.close();

		setTimeout( function() {
				var w = opt.operaSupport && $.browser.opera ? tab : $iframe[0].contentWindow;
				w.focus();
				w.print();
				if (tab) { tab.close(); }
		}, 1000);
    }

    $.fn.jqprint.defaults = {
		debug: false,
		importCSS: true,
		printContainer: true,
		operaSupport: true
	};

    // Thanks to 9__, found at http://users.livejournal.com/9__/380664.html
    ice.ace.jq.fn.outer = function() {
		var copy = $('<div></div>');
		copy.html(this.clone());
		copy.find('script').remove();
		return $(copy).html();
    }
})(ice.ace.jq);
/*! qTip2 - Pretty powerful tooltips - v2.0.0 - 2012-08-14
* http://craigsworks.com/projects/qtip2/
* Copyright (c) 2012 Craig Michael Thompson; Licensed MIT, GPL */

/*jslint browser: true, onevar: true, undef: true, nomen: true, bitwise: true, regexp: true, newcap: true, immed: true, strict: true */
/*global window: false, jQuery: false, console: false, define: false */

// Uses AMD or browser globals to create a jQuery plugin.
(function(factory) {
	"use strict";
	if(typeof define === 'function' && define.amd) {
		define(['jquery'], factory);
	}
	else if(ice.ace.jq && !ice.ace.jq.fn.qtip) {
		factory(ice.ace.jq);
	}
}
(function($) {

	"use strict"; // Enable ECMAScript "strict" operation for this function. See more: http://ejohn.org/blog/ecmascript-5-strict-mode-json-and-more/
	
	// Munge the primitives - Paul Irish tip
	var TRUE = true,
		FALSE = false,
		NULL = null,

		// Side names and other stuff
		X = 'x', Y = 'y',
		WIDTH = 'width',
		HEIGHT = 'height',
		TOP = 'top',
		LEFT = 'left',
		BOTTOM = 'bottom',
		RIGHT = 'right',
		CENTER = 'center',
		FLIP = 'flip',
		FLIPINVERT = 'flipinvert',
		SHIFT = 'shift',

		// Shortcut vars
		QTIP, PLUGINS, MOUSE,
		usedIDs = {},
		uitooltip = 'ui-tooltip',
		widget = 'ui-widget',
		disabled = 'ui-state-disabled',
		selector = 'div.qtip.'+uitooltip,
		defaultClass = uitooltip + '-default',
		focusClass = uitooltip + '-focus',
		hoverClass = uitooltip + '-hover',
		fluidClass = uitooltip + '-fluid',
		hideOffset = '-31000px',
		replaceSuffix = '_replacedByqTip',
		oldtitle = 'oldtitle',
		trackingBound;
		
	/* Thanks to Paul Irish for this one: http://paulirish.com/2009/log-a-lightweight-wrapper-for-consolelog/ */
	function log() {
		log.history = log.history || [];
		log.history.push(arguments);
		
		// Make sure console is present
		if('object' === typeof console) {

			// Setup console and arguments
			var c = console[ console.warn ? 'warn' : 'log' ],
			args = Array.prototype.slice.call(arguments), a;

			// Add qTip2 marker to first argument if it's a string
			if(typeof arguments[0] === 'string') { args[0] = 'qTip2: ' + args[0]; }

			// Apply console.warn or .log if not supported
			a = c.apply ? c.apply(console, args) : c(args);
		}
	}


// Option object sanitizer
function sanitizeOptions(opts)
{
	var invalid = function(a) { return a === NULL || 'object' !== typeof a; },
		invalidContent = function(c) { return !$.isFunction(c) && ((!c && !c.attr) || c.length < 1 || ('object' === typeof c && !c.jquery)); };

	if(!opts || 'object' !== typeof opts) { return FALSE; }

	if(invalid(opts.metadata)) {
		opts.metadata = { type: opts.metadata };
	}

	if('content' in opts) {
		if(invalid(opts.content) || opts.content.jquery) {
			opts.content = { text: opts.content };
		}

		if(invalidContent(opts.content.text || FALSE)) {
			opts.content.text = FALSE;
		}

		if('title' in opts.content) {
			if(invalid(opts.content.title)) {
				opts.content.title = { text: opts.content.title };
			}

			if(invalidContent(opts.content.title.text || FALSE)) {
				opts.content.title.text = FALSE;
			}
		}
	}

	if('position' in opts && invalid(opts.position)) {
		opts.position = { my: opts.position, at: opts.position };
	}

	if('show' in opts && invalid(opts.show)) {
		opts.show = opts.show.jquery ? { target: opts.show } : { event: opts.show };
	}

	if('hide' in opts && invalid(opts.hide)) {
		opts.hide = opts.hide.jquery ? { target: opts.hide } : { event: opts.hide };
	}

	if('style' in opts && invalid(opts.style)) {
		opts.style = { classes: opts.style };
	}

	// Sanitize plugin options
	$.each(PLUGINS, function() {
		if(this.sanitize) { this.sanitize(opts); }
	});

	return opts;
}

/*
* Core plugin implementation
*/
function QTip(target, options, id, attr)
{
	// Declare this reference
	var self = this,
		docBody = document.body,
		tooltipID = uitooltip + '-' + id,
		isPositioning = 0,
		isDrawing = 0,
		tooltip = $(),
		namespace = '.qtip-' + id,
		elements, cache;

	// Setup class attributes
	self.id = id;
	self.rendered = FALSE;
	self.destroyed = FALSE;
	self.elements = elements = { target: target };
	self.timers = { img: {} };
	self.options = options;
	self.checks = {};
	self.plugins = {};
	self.cache = cache = {
		event: {},
		target: $(),
		disabled: FALSE,
		attr: attr,
		onTarget: FALSE,
		lastClass: ''
	};

	/*
	* Private core functions
	*/
	function convertNotation(notation)
	{
		var i = 0, obj, option = options,

		// Split notation into array
		levels = notation.split('.');

		// Loop through
		while( option = option[ levels[i++] ] ) {
			if(i < levels.length) { obj = option; }
		}

		return [obj || options, levels.pop()];
	}

	function setWidget() {
		var on = options.style.widget;

		tooltip.toggleClass(widget, on).toggleClass(widget+'-content', on).toggleClass(defaultClass, options.style.def && !on);
		// ICE-8366 removed line

		if(elements.titlebar){
			elements.titlebar.toggleClass(widget+'-header', on);
		}
		if(elements.button){
			elements.button.toggleClass(uitooltip+'-icon', !on);
		}
	}

	function removeTitle(reposition)
	{
		if(elements.title) {
			elements.titlebar.remove();
			elements.titlebar = elements.title = elements.button = NULL;

			// Reposition if enabled
			if(reposition !== FALSE) { self.reposition(); }
		}
	}

	function createButton()
	{
		var button = options.content.title.button,
            ariaEnabled = options.ariaEnabled,
			isString = typeof button === 'string',
			close = isString ? button : 'Close tooltip';

		if(elements.button) { elements.button.remove(); }

		// Use custom button if one was supplied by user, else use default
		if(button.jquery) {
			elements.button = button;
		}
		else {
			elements.button = $('<a />', {
				'class': 'ui-state-default ui-tooltip-close ' + (options.style.widget ? '' : uitooltip+'-icon'),
				'title': close
			})
            .attr('aria-label', function () { return ariaEnabled ? close : undefined; })
			.prepend(
				$('<span />', {
					'class': 'ui-icon ui-icon-close',
					'html': '&times;'
				})
			);
		}

		// Create button and setup attributes
		elements.button.appendTo(elements.titlebar)
			.attr('role', function () { return ariaEnabled ? 'button' : undefined; })
			.click(function(event) {
				if(!tooltip.hasClass(disabled)) { self.hide(event); }
				return FALSE;
			});

		// Redraw the tooltip when we're done
		self.redraw();
	}

	function createTitle()
	{
		var id = tooltipID+'-title';

		// Destroy previous title element, if present
		if(elements.titlebar) { removeTitle(); }

		// Create title bar and title elements
		elements.titlebar = $('<div />', {
			'class': uitooltip + '-titlebar ' + (options.style.widget ? 'ui-widget-header' : '')
		})
		.append(
			elements.title = $('<div />', {
				'id': id,
				'class': uitooltip + '-title'
			})
            .attr('aria-atomic', function () { return options.ariaEnabled ? TRUE : undefined; })
		)
		.insertBefore(elements.content)

		// Button-specific events
		.delegate('.ui-tooltip-close', 'mousedown keydown mouseup keyup mouseout', function(event) {
			$(this).toggleClass('ui-state-active ui-state-focus', event.type.substr(-4) === 'down');
		})
		.delegate('.ui-tooltip-close', 'mouseover mouseout', function(event){
			$(this).toggleClass('ui-state-hover', event.type === 'mouseover');
		});

		// Create button if enabled
		if(options.content.title.button) { createButton(); }

		// Redraw the tooltip dimensions if it's rendered
		else if(self.rendered){ self.redraw(); }
	}

	function updateButton(button)
	{
		var elem = elements.button,
			title = elements.title;

		// Make sure tooltip is rendered and if not, return
		if(!self.rendered) { return FALSE; }

		if(!button) {
			elem.remove();
		}
		else {
			if(!title) {
				createTitle();
			}
			createButton();
		}
	}

	function updateTitle(content, reposition)
	{
		var elem = elements.title;

		// Make sure tooltip is rendered and if not, return
		if(!self.rendered || !content) { return FALSE; }

		// Use function to parse content
		if($.isFunction(content)) {
			content = content.call(target, cache.event, self);
		}

		// Remove title if callback returns false or null/undefined (but not '')
		if(content === FALSE || (!content && content !== '')) { return removeTitle(FALSE); }

		// Append new content if its a DOM array and show it if hidden
		else if(content.jquery && content.length > 0) {
			elem.empty().append(content.css({ display: 'block' }));
		}

		// Content is a regular string, insert the new content
		else { elem.html(content); }

		// Redraw and reposition
		self.redraw();
		if(reposition !== FALSE && self.rendered && tooltip[0].offsetWidth > 0) {
			self.reposition(cache.event);
		}
	}

	function updateContent(content, reposition)
	{
		var elem = elements.content;

		// Make sure tooltip is rendered and content is defined. If not return
		if(!self.rendered || !content) { return FALSE; }

		// Use function to parse content
		if($.isFunction(content)) {
			content = content.call(target, cache.event, self) || '';
		}

		// Append new content if its a DOM array and show it if hidden
		if(content.jquery && content.length > 0) {
			elem.empty().append(content.css({ display: 'block' }));
		}

		// Content is a regular string, insert the new content
		else { elem.html(content); }

		// Image detection
		function detectImages(next) {
			var images, srcs = {};

			function imageLoad(image) {
				// Clear src from object and any timers and events associated with the image
				if(image) {
					delete srcs[image.src];
					clearTimeout(self.timers.img[image.src]);
					$(image).unbind(namespace);
				}

				// If queue is empty after image removal, update tooltip and continue the queue
				if($.isEmptyObject(srcs)) {
					self.redraw();
					if(reposition !== FALSE) {
						self.reposition(cache.event);
					}

					next();
				}
			}

			// Find all content images without dimensions, and if no images were found, continue
			if((images = elem.find('img[src]:not([height]):not([width])')).length === 0) { return imageLoad(); }

			// Apply timer to each image to poll for dimensions
			images.each(function(i, elem) {
				// Skip if the src is already present
				if(srcs[elem.src] !== undefined) { return; }

				// Keep track of how many times we poll for image dimensions.
				// If it doesn't return in a reasonable amount of time, it's better
				// to display the tooltip, rather than hold up the queue.
				var iterations = 0, maxIterations = 3;

				(function timer(){
					// When the dimensions are found, remove the image from the queue
					if(elem.height || elem.width || (iterations > maxIterations)) { return imageLoad(elem); }

					// Increase iterations and restart timer
					iterations += 1;
					self.timers.img[elem.src] = setTimeout(timer, 700);
				}());

				// Also apply regular load/error event handlers
				$(elem).bind('error'+namespace+' load'+namespace, function(){ imageLoad(this); });

				// Store the src and element in our object
				srcs[elem.src] = elem;
			});
		}

		/*
		* If we're still rendering... insert into 'fx' queue our image dimension
		* checker which will halt the showing of the tooltip until image dimensions
		* can be detected properly.
		*/
		if(self.rendered < 0) { tooltip.queue('fx', detectImages); }

		// We're fully rendered, so reset isDrawing flag and proceed without queue delay
		else { isDrawing = 0; detectImages($.noop); }

		return self;
	}

	function assignEvents()
	{
		var posOptions = options.position,
			targets = {
				show: options.show.target,
				hide: options.hide.target,
				viewport: $(posOptions.viewport),
				document: $(document),
				body: $(document.body),
				window: $(window)
			},
			events = {
				show: $.trim('' + options.show.event).split(' '),
				hide: $.trim('' + options.hide.event).split(' ')
			},
			IE6 = $.browser.msie && parseInt($.browser.version, 10) === 6;

		// Define show event method
		function showMethod(event)
		{
			if(tooltip.hasClass(disabled)) { return FALSE; }

			// Clear hide timers
			clearTimeout(self.timers.show);
			clearTimeout(self.timers.hide);

			// Start show timer
			var callback = function(){ self.toggle(TRUE, event); };
			if(options.show.delay > 0) {
				self.timers.show = setTimeout(callback, options.show.delay);
			}
			else{ callback(); }
		}

		// Define hide method
		function hideMethod(event)
		{
			if(tooltip.hasClass(disabled) || isPositioning || isDrawing) { return FALSE; }

			// Check if new target was actually the tooltip element
			var relatedTarget = $(event.relatedTarget || event.target),
				ontoTooltip = relatedTarget.closest(selector)[0] === tooltip[0],
				ontoTarget = relatedTarget[0] === targets.show[0];

			// Clear timers and stop animation queue
			clearTimeout(self.timers.show);
			clearTimeout(self.timers.hide);

			// Prevent hiding if tooltip is fixed and event target is the tooltip. Or if mouse positioning is enabled and cursor momentarily overlaps
			if((posOptions.target === 'mouse' && ontoTooltip) || (options.hide.fixed && ((/mouse(out|leave|move)/).test(event.type) && (ontoTooltip || ontoTarget)))) {
				try { event.preventDefault(); event.stopImmediatePropagation(); } catch(e) {} return;
			}

			// If tooltip has displayed, start hide timer
			if(options.hide.delay > 0) {
				self.timers.hide = setTimeout(function(){ self.hide(event); }, options.hide.delay);
			}
			else{ self.hide(event); }
		}

		// Define inactive method
		function inactiveMethod(event)
		{
			if(tooltip.hasClass(disabled)) { return FALSE; }

			// Clear timer
			clearTimeout(self.timers.inactive);
			self.timers.inactive = setTimeout(function(){ self.hide(event); }, options.hide.inactive);
		}

		function repositionMethod(event) {
			if(self.rendered && tooltip[0].offsetWidth > 0) { self.reposition(event); }
		}

		// On mouseenter/mouseleave...
		tooltip.bind('mouseenter'+namespace+' mouseleave'+namespace, function(event) {
			var state = event.type === 'mouseenter';

			// Focus the tooltip on mouseenter (z-index stacking)
			if(state) { self.focus(event); }

			// Add hover class
			tooltip.toggleClass(hoverClass, state);
		});

		// Enable hide.fixed
		if(options.hide.fixed) {
			// Add tooltip as a hide target
			targets.hide = targets.hide.add(tooltip);

			// Clear hide timer on tooltip hover to prevent it from closing
			tooltip.bind('mouseover'+namespace, function() {
				if(!tooltip.hasClass(disabled)) { clearTimeout(self.timers.hide); }
			});
		}

		/*
		* Make sure hoverIntent functions properly by using mouseleave to clear show timer if
		* mouseenter/mouseout is used for show.event, even if it isn't in the users options.
		*/
		else if(/mouse(over|enter)/i.test(options.show.event)) {
			targets.hide.bind('mouseleave'+namespace, function(event) {
				clearTimeout(self.timers.show);
			});
		}

		// Hide tooltip on document mousedown if unfocus events are enabled
		if(('' + options.hide.event).indexOf('unfocus') > -1) {
			posOptions.container.closest('html').bind('mousedown'+namespace, function(event) {
				var elem = $(event.target),
					enabled = self.rendered && !tooltip.hasClass(disabled) && tooltip[0].offsetWidth > 0,
					isAncestor = elem.parents(selector).filter(tooltip[0]).length > 0;

				if(elem[0] !== target[0] && elem[0] !== tooltip[0] && !isAncestor &&
					!target.has(elem[0]).length && !elem.attr('disabled')
				) {
					self.hide(event);
				}
			});
		}

		// Check if the tooltip hides when inactive
		if('number' === typeof options.hide.inactive) {
			// Bind inactive method to target as a custom event
			targets.show.bind('qtip-'+id+'-inactive', inactiveMethod);

			// Define events which reset the 'inactive' event handler
			$.each(QTIP.inactiveEvents, function(index, type){
				targets.hide.add(elements.tooltip).bind(type+namespace+'-inactive', inactiveMethod);
			});
		}

		// Apply hide events
		$.each(events.hide, function(index, type) {
			var showIndex = $.inArray(type, events.show),
					targetHide = $(targets.hide);

			// Both events and targets are identical, apply events using a toggle
			if((showIndex > -1 && targetHide.add(targets.show).length === targetHide.length) || type === 'unfocus')
			{
				targets.show.bind(type+namespace, function(event) {
					if(tooltip[0].offsetWidth > 0) { hideMethod(event); }
					else { showMethod(event); }
				});

				// Don't bind the event again
				delete events.show[ showIndex ];
			}

			// Events are not identical, bind normally
			else { targets.hide.bind(type+namespace, hideMethod); }
		});

		// Apply show events
		$.each(events.show, function(index, type) {
			targets.show.bind(type+namespace, showMethod);
		});

		// Check if the tooltip hides when mouse is moved a certain distance
		if('number' === typeof options.hide.distance) {
			// Bind mousemove to target to detect distance difference
			targets.show.add(tooltip).bind('mousemove'+namespace, function(event) {
				var origin = cache.origin || {},
					limit = options.hide.distance,
					abs = Math.abs;

				// Check if the movement has gone beyond the limit, and hide it if so
				if(abs(event.pageX - origin.pageX) >= limit || abs(event.pageY - origin.pageY) >= limit) {
					self.hide(event);
				}
			});
		}

		// Mouse positioning events
		if(posOptions.target === 'mouse') {
			// Cache mousemove coords on show targets
			targets.show.bind('mousemove'+namespace, function(event) {
				MOUSE = { pageX: event.pageX, pageY: event.pageY, type: 'mousemove' };
			});

			// If mouse adjustment is on...
			if(posOptions.adjust.mouse) {
				// Apply a mouseleave event so we don't get problems with overlapping
				if(options.hide.event) {
					// Hide when we leave the tooltip and not onto the show target
					tooltip.bind('mouseleave'+namespace, function(event) {
						if((event.relatedTarget || event.target) !== targets.show[0]) { self.hide(event); }
					});

					// Track if we're on the target or not
					elements.target.bind('mouseenter'+namespace+' mouseleave'+namespace, function(event) {
						cache.onTarget = event.type === 'mouseenter';
					});
				}

				// Update tooltip position on mousemove
				targets.document.bind('mousemove'+namespace, function(event) {
					// Update the tooltip position only if the tooltip is visible and adjustment is enabled
					if(self.rendered && cache.onTarget && !tooltip.hasClass(disabled) && tooltip[0].offsetWidth > 0) {
						self.reposition(event || MOUSE);
					}
				});
			}
		}

		// Adjust positions of the tooltip on window resize if enabled
		if(posOptions.adjust.resize || targets.viewport.length) {
			($.event.special.resize ? targets.viewport : targets.window).bind('resize'+namespace, repositionMethod);
		}

		// Adjust tooltip position on scroll if screen adjustment is enabled
		if(targets.viewport.length || (IE6 && tooltip.css('position') === 'fixed')) {
			targets.viewport.bind('scroll'+namespace, repositionMethod);
		}
	}

	function unassignEvents()
	{
		var targets = [
				options.show.target[0],
				options.hide.target[0],
				self.rendered && elements.tooltip[0],
				options.position.container[0],
				options.position.viewport[0],
				options.position.container.closest('html')[0], // unfocus
				window,
				document
			];

		// Check if tooltip is rendered
		if(self.rendered) {
			$([]).pushStack( $.grep(targets, function(i){ return typeof i === 'object'; }) ).unbind(namespace);
		}

		// Tooltip isn't yet rendered, remove render event
		else { options.show.target.unbind(namespace+'-create'); }
	}

	// Setup builtin .set() option checks
	self.checks.builtin = {
		// Core checks
		'^id$': function(obj, o, v) {
			var id = v === TRUE ? QTIP.nextid : v,
				tooltipID = uitooltip + '-' + id;

			if(id !== FALSE && id.length > 0 && !$('#'+tooltipID).length) {
				tooltip[0].id = tooltipID;
				elements.content[0].id = tooltipID + '-content';
				elements.title[0].id = tooltipID + '-title';
			}
		},

		// Content checks
		'^content.text$': function(obj, o, v){ updateContent(v); },
		'^content.title.text$': function(obj, o, v) {
			// Remove title if content is null
			if(!v) { return removeTitle(); }

			// If title isn't already created, create it now and update
			if(!elements.title && v) { createTitle(); }
			updateTitle(v);
		},
		'^content.title.button$': function(obj, o, v){ updateButton(v); },

		// Position checks
		'^position.(my|at)$': function(obj, o, v){
			// Parse new corner value into Corner objecct
			if('string' === typeof v) {
				obj[o] = new PLUGINS.Corner(v);
			}
		},
		'^position.container$': function(obj, o, v){
			if(self.rendered) { tooltip.appendTo(v); }
		},

		// Show checks
		'^show.ready$': function() {
			if(!self.rendered) { self.render(1); }
			else { self.toggle(TRUE); }
		},

		// Style checks
		'^style.classes$': function(obj, o, v) {
			tooltip.attr('class', uitooltip + ' qtip ui-helper-reset ' + v);
		},
		'^style.widget|content.title': setWidget,

		// Events check
		'^events.(render|show|move|hide|focus|blur)$': function(obj, o, v) {
			tooltip[($.isFunction(v) ? '' : 'un') + 'bind']('tooltip'+o, v);
		},

		// Properties which require event reassignment
		'^(show|hide|position).(event|target|fixed|inactive|leave|distance|viewport|adjust)': function() {
			var posOptions = options.position;

			// Set tracking flag
			tooltip.attr('tracking', posOptions.target === 'mouse' && posOptions.adjust.mouse);

			// Reassign events
			unassignEvents(); assignEvents();
		}
	};

	/*
	* Public API methods
	*/
	$.extend(self, {
		render: function(show)
		{
			if(self.rendered) { return self; } // If tooltip has already been rendered, exit

			var text = options.content.text,
				title = options.content.title.text,
				posOptions = options.position,
                ariaEnabled = options.ariaEnabled,
				callback = $.Event('tooltiprender');

			// Add ARIA attributes to target
            if (ariaEnabled) {
			$.attr(target[0], 'aria-describedby', tooltipID);
            }

			// Create tooltip element
			tooltip = elements.tooltip = $('<div/>', {
					'id': tooltipID,
					'class': uitooltip + ' qtip ui-helper-reset ' + defaultClass + ' ' + options.style.classes + ' '+ uitooltip + '-pos-' + options.position.my.abbrev(),
					'width': options.style.width || '',
					'height': options.style.height || '',
					'tracking': posOptions.target === 'mouse' && posOptions.adjust.mouse
				})
                .attr({
                    'role': function () { return ariaEnabled ? 'tooltip' : undefined; },
                    'aria-live': function () { return ariaEnabled ? 'polite' : undefined; },
                    'aria-atomic': function () { return ariaEnabled ? FALSE : undefined; },
                    'aria-describedby': function () { return ariaEnabled ? tooltipID + '-content' : undefined; },
                    'aria-hidden': function () { return ariaEnabled ? TRUE : undefined; }
                })
				.toggleClass(disabled, cache.disabled)
				.data('qtip', self)
				.appendTo(options.position.container)
				.append(
					// Create content element
					elements.content = $('<div />', {
						'class': uitooltip + '-content',
						'id': tooltipID + '-content'
					})
                    .attr('aria-atomic', function () { return ariaEnabled ? TRUE : undefined; })
				);

			// Set rendered flag and prevent redundant redraw/reposition calls for now
			self.rendered = -1;
			isDrawing = 1; isPositioning = 1;

			// Create title...
			if(title) {
				createTitle();

				// Update title only if its not a callback (called in toggle if so)
				if(!$.isFunction(title)) { updateTitle(title, FALSE); }
			}

			// Set proper rendered flag and update content if not a callback function (called in toggle)
			if(!$.isFunction(text)) { updateContent(text, FALSE); }
			self.rendered = TRUE;

			// Setup widget classes
			setWidget();

			// Assign passed event callbacks (before plugins!)
			$.each(options.events, function(name, callback) {
				if($.isFunction(callback)) {
					tooltip.bind(name === 'toggle' ? 'tooltipshow tooltiphide' : 'tooltip'+name, callback);
				}
			});

			// Initialize 'render' plugins
			$.each(PLUGINS, function() {
				if(this.initialize === 'render') { this(self); }
			});

			// Assign events
			assignEvents();

			/* Queue this part of the render process in our fx queue so we can
			* load images before the tooltip renders fully.
			*
			* See: updateContent method
			*/
			tooltip.queue('fx', function(next) {
				// Trigger tooltiprender event and pass original triggering event as original
				callback.originalEvent = cache.event;
				tooltip.trigger(callback, [self]);

				// Reset flags
				isDrawing = 0; isPositioning = 0;

				// Redraw the tooltip manually now we're fully rendered
				self.redraw();

				// Show tooltip if needed
				if(options.show.ready || show) {
					self.toggle(TRUE, cache.event, FALSE);
				}

				next(); // Move on to next method in queue
			});

			return self;
		},

		get: function(notation)
		{
			var result, o;

			switch(notation.toLowerCase())
			{
				case 'dimensions':
					result = {
						height: tooltip.outerHeight(), width: tooltip.outerWidth()
					};
				break;

				case 'offset':
					result = PLUGINS.offset(tooltip, options.position.container);
				break;

				default:
					o = convertNotation(notation.toLowerCase());
					result = o[0][ o[1] ];
					result = result.precedance ? result.string() : result;
				break;
			}

			return result;
		},

		set: function(option, value)
		{
			var rmove = /^position\.(my|at|adjust|target|container)|style|content|show\.ready/i,
				rdraw = /^content\.(title|attr)|style/i,
				reposition = FALSE,
				redraw = FALSE,
				checks = self.checks,
				name;

			function callback(notation, args) {
				var category, rule, match;

				for(category in checks) {
					for(rule in checks[category]) {
						if(match = (new RegExp(rule, 'i')).exec(notation)) {
							args.push(match);
							checks[category][rule].apply(self, args);
						}
					}
				}
			}

			// Convert singular option/value pair into object form
			if('string' === typeof option) {
				name = option; option = {}; option[name] = value;
			}
			else { option = $.extend(TRUE, {}, option); }

			// Set all of the defined options to their new values
			$.each(option, function(notation, value) {
				var obj = convertNotation( notation.toLowerCase() ), previous;

				// Set new obj value
				previous = obj[0][ obj[1] ];
				obj[0][ obj[1] ] = 'object' === typeof value && value.nodeType ? $(value) : value;

				// Set the new params for the callback
				option[notation] = [obj[0], obj[1], value, previous];

				// Also check if we need to reposition / redraw
				reposition = rmove.test(notation) || reposition;
				redraw = rdraw.test(notation) || redraw;
			});

			// Re-sanitize options
			sanitizeOptions(options);

			/*
			* Execute any valid callbacks for the set options
			* Also set isPositioning/isDrawing so we don't get loads of redundant repositioning
			* and redraw calls.
			*/
			isPositioning = isDrawing = 1; $.each(option, callback); isPositioning = isDrawing = 0;

			// Update position / redraw if needed
			if(self.rendered && tooltip[0].offsetWidth > 0) {
				if(reposition) {
					self.reposition( options.position.target === 'mouse' ? NULL : cache.event );
				}
				if(redraw) { self.redraw(); }
			}

			return self;
		},

		toggle: function(state, event)
		{
			// Render the tooltip if showing and it isn't already
			if(!self.rendered) { return state ? self.render(1) : self; }

			var type = state ? 'show' : 'hide',
				opts = options[type],
				otherOpts = options[ !state ? 'show' : 'hide' ],
				posOptions = options.position,
				contentOptions = options.content,
				visible = tooltip[0].offsetWidth > 0,
				animate = state || opts.target.length === 1,
				sameTarget = !event || opts.target.length < 2 || cache.target[0] === event.target,
				delay, callback;

			// Detect state if valid one isn't provided
			if((typeof state).search('boolean|number')) { state = !visible; }

			// Return if element is already in correct state
			if(!tooltip.is(':animated') && visible === state && sameTarget) { return self; }

			// Try to prevent flickering when tooltip overlaps show element
			if(event) {
				if((/over|enter/).test(event.type) && (/out|leave/).test(cache.event.type) &&
					options.show.target.add(event.target).length === options.show.target.length &&
					tooltip.has(event.relatedTarget).length) {
					return self;
				}

				// Cache event
				cache.event = $.extend({}, event);
			}

			// Call API methods
			callback = $.Event('tooltip'+type);
			callback.originalEvent = event ? cache.event : NULL;
			tooltip.trigger(callback, [self, 90]);
			if(callback.isDefaultPrevented()){ return self; }

			// Set ARIA hidden status attribute
            if (options.ariaEnabled) {
			$.attr(tooltip[0], 'aria-hidden', !!!state);
            }

			// Execute state specific properties
			if(state) {
				// Store show origin coordinates
				cache.origin = $.extend({}, MOUSE);

				// Focus the tooltip
				self.focus(event);

				// Update tooltip content & title if it's a dynamic function
				if($.isFunction(contentOptions.text)) { updateContent(contentOptions.text, FALSE); }
				if($.isFunction(contentOptions.title.text)) { updateTitle(contentOptions.title.text, FALSE); }

				// Cache mousemove events for positioning purposes (if not already tracking)
				if(!trackingBound && posOptions.target === 'mouse' && posOptions.adjust.mouse) {
					$(document).bind('mousemove.qtip', function(event) {
						MOUSE = { pageX: event.pageX, pageY: event.pageY, type: 'mousemove' };
					});
					trackingBound = TRUE;
				}

				// Update the tooltip position
				self.reposition(event, arguments[2]);

				// Hide other tooltips if tooltip is solo, using it as the context
				if((callback.solo = !!opts.solo)) { $(selector, opts.solo).not(tooltip).qtip('hide', callback); }
			}
			else {
				// Clear show timer if we're hiding
				clearTimeout(self.timers.show);

				// Remove cached origin on hide
				delete cache.origin;

				// Remove mouse tracking event if not needed (all tracking qTips are hidden)
				if(trackingBound && !$(selector+'[tracking="true"]:visible', opts.solo).not(tooltip).length) {
					$(document).unbind('mousemove.qtip');
					trackingBound = FALSE;
				}

				// Blur the tooltip
				self.blur(event);
			}

			// Define post-animation, state specific properties
			function after() {
				if(state) {
					// Prevent antialias from disappearing in IE by removing filter
					if($.browser.msie) { tooltip[0].style.removeAttribute('filter'); }

					// Remove overflow setting to prevent tip bugs
					tooltip.css('overflow', '');

					// Autofocus elements if enabled
					if('string' === typeof opts.autofocus) {
						$(opts.autofocus, tooltip).focus();
					}

					// If set, hide tooltip when inactive for delay period
					opts.target.trigger('qtip-'+id+'-inactive');
					
					// If using mouseout/mouseleave as a hide event...
					if(/mouse(out|leave)/i.test(options.hide.event)) { // ICE-8699
						// Hide tooltips when leaving current window/frame (but not select/option elements)
						if(options.hide.leave === 'window') {
							self._windowMouseoutHandler = function(event) {
								if(!/select|option/.test(event.target.nodeName) && !event.relatedTarget) {
									self.hide(event);
								}
							}
							$(window).bind('mouseout'+namespace+' blur'+namespace, self._windowMouseoutHandler);
						}
					}
				}
				else {
					if (self._windowMouseoutHandler) { // ICE-8699
						$(window).unbind('mouseout'+namespace+' blur'+namespace, self._windowMouseoutHandler);
						self._windowMouseoutHandler = null;
					}
					// Reset CSS states
					tooltip.css({
						display: '',
						visibility: '',
						opacity: '',
						left: '',
						top: ''
					});
				}

				// Call API method
				callback = $.Event('tooltip'+(state ? 'visible' : 'hidden'));
				callback.originalEvent = event ? cache.event : NULL;
				tooltip.trigger(callback, [self]);
			}

			// If no effect type is supplied, use a simple toggle
			if(opts.effect === FALSE || animate === FALSE) {
				tooltip[ type ]();
				after.call(tooltip);
			}

			// Use custom function if provided
			else if($.isFunction(opts.effect)) {
				tooltip.stop(1, 1);
				opts.effect.call(tooltip, self);
				if ($.browser.msie && $.browser.version < 8) self.reposition(event, arguments[2]); // ICE-8974
				tooltip.queue('fx', function(n){ after(); n(); });
			}

			// Use basic fade function by default
			else { tooltip.fadeTo(90, state ? 1 : 0, after); }

			// If inactive hide method is set, active it
			if(state) { opts.target.trigger('qtip-'+id+'-inactive'); }

			return self;
		},

		show: function(event){ return self.toggle(TRUE, event); },

		hide: function(event){ return self.toggle(FALSE, event); },

		focus: function(event)
		{
			if(!self.rendered) { return self; }

			var qtips = $(selector),
				curIndex = parseInt(tooltip[0].style.zIndex, 10),
				newIndex = QTIP.zindex + qtips.length,
				cachedEvent = $.extend({}, event),
				focusedElem, callback;

			// Only update the z-index if it has changed and tooltip is not already focused
			if(!tooltip.hasClass(focusClass))
			{
				// Call API method
				callback = $.Event('tooltipfocus');
				callback.originalEvent = cachedEvent;
				tooltip.trigger(callback, [self, newIndex]);

				// If default action wasn't prevented...
				if(!callback.isDefaultPrevented()) {
					// Only update z-index's if they've changed
					if(curIndex !== newIndex) {
						// Reduce our z-index's and keep them properly ordered
						qtips.each(function() {
							if(this.style.zIndex > curIndex) {
								this.style.zIndex = this.style.zIndex - 1;
							}
						});

						// Fire blur event for focused tooltip
						qtips.filter('.' + focusClass).qtip('blur', cachedEvent);
					}

					// Set the new z-index
					tooltip.addClass(focusClass)[0].style.zIndex = newIndex;
				}
			}

			return self;
		},

		blur: function(event) {
			var cachedEvent = $.extend({}, event),
				callback;

			// Set focused status to FALSE
			tooltip.removeClass(focusClass);

			// Trigger blur event
			callback = $.Event('tooltipblur');
			callback.originalEvent = cachedEvent;
			tooltip.trigger(callback, [self]);

			return self;
		},

		reposition: function(event, effect)
		{
			if(!self.rendered || isPositioning) { return self; }

			// Set positioning flag
			isPositioning = 1;

			var target = options.position.target,
				posOptions = options.position,
				my = posOptions.my,
				at = posOptions.at,
				adjust = posOptions.adjust,
				method = adjust.method.split(' '),
				elemWidth = tooltip.outerWidth(),
				elemHeight = tooltip.outerHeight(),
				targetWidth = 0,
				targetHeight = 0,
				callback = $.Event('tooltipmove'),
				fixed = tooltip.css('position') === 'fixed',
				viewport = posOptions.viewport,
				position = { left: 0, top: 0 },
				container = posOptions.container,
				visible = tooltip[0].offsetWidth > 0,
				adjusted, offset, win;

			// Check if absolute position was passed
			if($.isArray(target) && target.length === 2) {
				// Force left top and set position
				at = { x: LEFT, y: TOP };
				position = { left: target[0], top: target[1] };
			}

			// Check if mouse was the target
			else if(target === 'mouse' && ((event && event.pageX) || cache.event.pageX)) {
				// Force left top to allow flipping
				at = { x: LEFT, y: TOP };

				// Use cached event if one isn't available for positioning
				event = (event && (event.type === 'resize' || event.type === 'scroll') ? cache.event :
					event && event.pageX && event.type === 'mousemove' ? event :
					MOUSE && MOUSE.pageX && (adjust.mouse || !event || !event.pageX) ? { pageX: MOUSE.pageX, pageY: MOUSE.pageY } :
					!adjust.mouse && cache.origin && cache.origin.pageX && options.show.distance ? cache.origin :
					event) || event || cache.event || MOUSE || {};

				// Use event coordinates for position
				position = { top: event.pageY, left: event.pageX };
			}

			// Target wasn't mouse or absolute...
			else {
				// Check if event targetting is being used
				if(target === 'event' && event && event.target && event.type !== 'scroll' && event.type !== 'resize') {
					cache.target = $(event.target);
				}
				else if(target !== 'event'){
					cache.target = $(target.jquery ? target : elements.target);
				}
				target = cache.target;

				// Parse the target into a jQuery object and make sure there's an element present
				target = $(target).eq(0);
				if(target.length === 0) { return self; }

				// Check if window or document is the target
				else if(target[0] === document || target[0] === window) {
					targetWidth = PLUGINS.iOS ? window.innerWidth : target.width();
					targetHeight = PLUGINS.iOS ? window.innerHeight : target.height();

					if(target[0] === window) {
						position = {
							top: (viewport || target).scrollTop(),
							left: (viewport || target).scrollLeft()
						};
					}
				}

				// Use Imagemap/SVG plugins if needed
				else if(PLUGINS.imagemap && target.is('area')) {
					adjusted = PLUGINS.imagemap(self, target, at, PLUGINS.viewport ? method : FALSE);
				}
				else if(PLUGINS.svg && typeof target[0].xmlbase === 'string') {
					adjusted = PLUGINS.svg(self, target, at, PLUGINS.viewport ? method : FALSE);
				}

				else {
					targetWidth = target.outerWidth();
					targetHeight = target.outerHeight();

					position = PLUGINS.offset(target, container);
				}

				// Parse returned plugin values into proper variables
				if(adjusted) {
					targetWidth = adjusted.width;
					targetHeight = adjusted.height;
					offset = adjusted.offset;
					position = adjusted.position;
				}

				// Adjust for position.fixed tooltips (and also iOS scroll bug in v3.2-4.0 & v4.3-4.3.2)
				if((PLUGINS.iOS > 3.1 && PLUGINS.iOS < 4.1) || 
					(PLUGINS.iOS >= 4.3 && PLUGINS.iOS < 4.33) || 
					(!PLUGINS.iOS && fixed)
				){
					win = $(window);
					position.left -= win.scrollLeft();
					position.top -= win.scrollTop();
				}

				// Adjust position relative to target
				position.left += at.x === RIGHT ? targetWidth : at.x === CENTER ? targetWidth / 2 : 0;
				position.top += at.y === BOTTOM ? targetHeight : at.y === CENTER ? targetHeight / 2 : 0;
			}

			// Adjust position relative to tooltip
			position.left += adjust.x + (my.x === RIGHT ? -elemWidth : my.x === CENTER ? -elemWidth / 2 : 0);
			position.top += adjust.y + (my.y === BOTTOM ? -elemHeight : my.y === CENTER ? -elemHeight / 2 : 0);

			// Use viewport adjustment plugin if enabled
			if(PLUGINS.viewport) {
				position.adjusted = PLUGINS.viewport(
					self, position, posOptions, targetWidth, targetHeight, elemWidth, elemHeight
				);

				// Apply offsets supplied by positioning plugin (if used)
				if(offset && position.adjusted.left) { position.left += offset.left; }
				if(offset && position.adjusted.top) {  position.top += offset.top; }
			}

			// Viewport adjustment is disabled, set values to zero
			else { position.adjusted = { left: 0, top: 0 }; }

			// Call API method
			callback.originalEvent = $.extend({}, event);
			tooltip.trigger(callback, [self, position, viewport.elem || viewport]);
			if(callback.isDefaultPrevented()){ return self; }
			delete position.adjusted;

			// If effect is disabled, target it mouse, no animation is defined or positioning gives NaN out, set CSS directly
			if(effect === FALSE || !visible || isNaN(position.left) || isNaN(position.top) || target === 'mouse' || !$.isFunction(posOptions.effect)) {
				tooltip.css(position);
			}

			// Use custom function if provided
			else if($.isFunction(posOptions.effect)) {
				posOptions.effect.call(tooltip, self, $.extend({}, position));
				tooltip.queue(function(next) {
					// Reset attributes to avoid cross-browser rendering bugs
					$(this).css({ opacity: '', height: '' });
					if($.browser.msie) { this.style.removeAttribute('filter'); }

					next();
				});
			}

			// Set positioning flag
			isPositioning = 0;

			return self;
		},

		// Max/min width simulator function for all browsers.. yeaaah!
		redraw: function()
		{
			if(self.rendered < 1 || isDrawing) { return self; }

			var container = options.position.container,
				perc, width, max, min;

			// Set drawing flag
			isDrawing = 1;

			// If tooltip has a set height, just set it... like a boss!
			if(options.style.height) { tooltip.css(HEIGHT, options.style.height); }

			// If tooltip has a set width, just set it... like a boss!
			if(options.style.width) { tooltip.css(WIDTH, options.style.width); }

			// Otherwise simualte max/min width...
			else {
				// Reset width and add fluid class
				tooltip.css(WIDTH, '').addClass(fluidClass);

				// Grab our tooltip width (add 1 so we don't get wrapping problems.. huzzah!)
				width = tooltip.width() + 1;

				// Grab our max/min properties
				max = tooltip.css('max-width') || '';
				min = tooltip.css('min-width') || '';

				// Parse into proper pixel values
				perc = (max + min).indexOf('%') > -1 ? container.width() / 100 : 0;
				max = ((max.indexOf('%') > -1 ? perc : 1) * parseInt(max, 10)) || width;
				min = ((min.indexOf('%') > -1 ? perc : 1) * parseInt(min, 10)) || 0;

				// Determine new dimension size based on max/min/current values
				width = max + min ? Math.min(Math.max(width, min), max) : width;

				// Set the newly calculated width and remvoe fluid class
				tooltip.css(WIDTH, Math.round(width)).removeClass(fluidClass);
			}

			// Set drawing flag
			isDrawing = 0;

			return self;
		},

		disable: function(state)
		{
			if('boolean' !== typeof state) {
				state = !(tooltip.hasClass(disabled) || cache.disabled);
			}

			if(self.rendered) {
				tooltip.toggleClass(disabled, state);
                if (options.ariaEnabled) {
				$.attr(tooltip[0], 'aria-disabled', state);
                }
			}
			else {
				cache.disabled = !!state;
			}

			return self;
		},

		enable: function() { return self.disable(FALSE); },

		destroy: function()
		{
			var t = target[0],
				title = $.attr(t, oldtitle),
				elemAPI = target.data('qtip');

			// Set flag the signify destroy is taking place to plugins
			self.destroyed = TRUE;

			// Destroy tooltip and  any associated plugins if rendered
			if(self.rendered) {
				tooltip.stop(1,0).remove();

				$.each(self.plugins, function() {
					if(this.destroy) { this.destroy(); }
				});
			}

			// Clear timers and remove bound events
			clearTimeout(self.timers.show);
			clearTimeout(self.timers.hide);
			unassignEvents();

			// If the API if actually this qTip API...
			if(!elemAPI || self === elemAPI) {
				// Remove api object
				$.removeData(t, 'qtip');

				// Reset old title attribute if removed
				if(options.suppress && title) {
					$.attr(t, 'title', title);
					target.removeAttr(oldtitle);
				}

				// Remove ARIA attributes
				target.removeAttr('aria-describedby');
			}

			// Remove qTip events associated with this API
			target.unbind('.qtip-'+id);

			// Remove ID from sued id object
			delete usedIDs[self.id];

			return target;
		}
	});
}

// Initialization method
function init(id, opts)
{
	var obj, posOptions, attr, config, title,

	// Setup element references
	elem = $(this),
	docBody = $(document.body),

	// Use document body instead of document element if needed
	newTarget = this === document ? docBody : elem,

	// Grab metadata from element if plugin is present
	metadata = (elem.metadata) ? elem.metadata(opts.metadata) : NULL,

	// If metadata type if HTML5, grab 'name' from the object instead, or use the regular data object otherwise
	metadata5 = opts.metadata.type === 'html5' && metadata ? metadata[opts.metadata.name] : NULL,

	// Grab data from metadata.name (or data-qtipopts as fallback) using .data() method,
	html5 = elem.data(opts.metadata.name || 'qtipopts');

	// If we don't get an object returned attempt to parse it manualyl without parseJSON
	try { html5 = typeof html5 === 'string' ? $.parseJSON(html5) : html5; }
	catch(e) { log('Unable to parse HTML5 attribute data: ' + html5); }

	// Merge in and sanitize metadata
	config = $.extend(TRUE, {}, QTIP.defaults, opts,
		typeof html5 === 'object' ? sanitizeOptions(html5) : NULL,
		sanitizeOptions(metadata5 || metadata));

	// Re-grab our positioning options now we've merged our metadata and set id to passed value
	posOptions = config.position;
	config.id = id;

	// Setup missing content if none is detected
	if('boolean' === typeof config.content.text) {
		attr = elem.attr(config.content.attr);

		// Grab from supplied attribute if available
		if(config.content.attr !== FALSE && attr) { config.content.text = attr; }

		// No valid content was found, abort render
		else {
			log('Unable to locate content for tooltip! Aborting render of tooltip on element: ', elem);
			return FALSE;
		}
	}

	// Setup target options
	if(!posOptions.container.length) { posOptions.container = docBody; }
	if(posOptions.target === FALSE) { posOptions.target = newTarget; }
	if(config.show.target === FALSE) { config.show.target = newTarget; }
	if(config.show.solo === TRUE) { config.show.solo = posOptions.container.closest('body'); }
	if(config.hide.target === FALSE) { config.hide.target = newTarget; }
	if(config.position.viewport === TRUE) { config.position.viewport = posOptions.container; }

	// Ensure we only use a single container
	posOptions.container = posOptions.container.eq(0);

	// Convert position corner values into x and y strings
	posOptions.at = new PLUGINS.Corner(posOptions.at);
	posOptions.my = new PLUGINS.Corner(posOptions.my);

	// Destroy previous tooltip if overwrite is enabled, or skip element if not
	if($.data(this, 'qtip')) {
		if(config.overwrite) {
			elem.qtip('destroy');
		}
		else if(config.overwrite === FALSE) {
			return FALSE;
		}
	}

	// Remove title attribute and store it if present
	if(config.suppress && (title = $.attr(this, 'title'))) {
		// Final attr call fixes event delegatiom and IE default tooltip showing problem
		$(this).removeAttr('title').attr(oldtitle, title).attr('title', '');
	}

	// Initialize the tooltip and add API reference
	obj = new QTip(elem, config, id, !!attr);
	$.data(this, 'qtip', obj);

	// Catch remove/removeqtip events on target element to destroy redundant tooltip
	elem.bind('remove.qtip-'+id+' removeqtip.qtip-'+id, function(){ obj.destroy(); });

	return obj;
}

// jQuery $.fn extension method
QTIP = $.fn.qtip = function(options, notation, newValue)
{
	var command = ('' + options).toLowerCase(), // Parse command
		returned = NULL,
		args = $.makeArray(arguments).slice(1),
		event = args[args.length - 1],
		opts = this[0] ? $.data(this[0], 'qtip') : NULL;

	// Check for API request
	if((!arguments.length && opts) || command === 'api') {
		return opts;
	}

	// Execute API command if present
	else if('string' === typeof options)
	{
		this.each(function()
		{
			var api = $.data(this, 'qtip');
			if(!api) { return TRUE; }

			// Cache the event if possible
			if(event && event.timeStamp) { api.cache.event = event; }

			// Check for specific API commands
			if((command === 'option' || command === 'options') && notation) {
				if($.isPlainObject(notation) || newValue !== undefined) {
					api.set(notation, newValue);
				}
				else {
					returned = api.get(notation);
					return FALSE;
				}
			}

			// Execute API command
			else if(api[command]) {
				api[command].apply(api[command], args);
			}
		});

		return returned !== NULL ? returned : this;
	}

	// No API commands. validate provided options and setup qTips
	else if('object' === typeof options || !arguments.length)
	{
		opts = sanitizeOptions($.extend(TRUE, {}, options));

		// Bind the qTips
		return QTIP.bind.call(this, opts, event);
	}
};

// $.fn.qtip Bind method
QTIP.bind = function(opts, event)
{
	return this.each(function(i) {
		var options, targets, events, namespace, api, id;

		// Find next available ID, or use custom ID if provided
		id = $.isArray(opts.id) ? opts.id[i] : opts.id;
		id = !id || id === FALSE || id.length < 1 || usedIDs[id] ? QTIP.nextid++ : (usedIDs[id] = id);

		// Setup events namespace
		namespace = '.qtip-'+id+'-create';

		// Initialize the qTip and re-grab newly sanitized options
		api = init.call(this, id, opts);
		if(api === FALSE) { return TRUE; }
		options = api.options;

		// Initialize plugins
		$.each(PLUGINS, function() {
			if(this.initialize === 'initialize') { this(api); }
		});

		// Determine hide and show targets
		targets = { show: options.show.target, hide: options.hide.target };
		events = {
			show: $.trim('' + options.show.event).replace(/ /g, namespace+' ') + namespace,
			hide: $.trim('' + options.hide.event).replace(/ /g, namespace+' ') + namespace
		};

		/*
		* Make sure hoverIntent functions properly by using mouseleave as a hide event if
		* mouseenter/mouseout is used for show.event, even if it isn't in the users options.
		*/
		if(/mouse(over|enter)/i.test(events.show) && !/mouse(out|leave)/i.test(events.hide)) {
			events.hide += ' mouseleave' + namespace;
		}

		/*
		* Also make sure initial mouse targetting works correctly by caching mousemove coords
		* on show targets before the tooltip has rendered.
		*
		* Also set onTarget when triggered to keep mouse tracking working
		*/
		targets.show.bind('mousemove'+namespace, function(event) {
			MOUSE = { pageX: event.pageX, pageY: event.pageY, type: 'mousemove' };
			api.cache.onTarget = TRUE;
		});

		// Define hoverIntent function
		function hoverIntent(event) {
			function render() {
				// Cache mouse coords,render and render the tooltip
				api.render(typeof event === 'object' || options.show.ready);

				// Unbind show and hide events
				targets.show.add(targets.hide).unbind(namespace);
			}

			// Only continue if tooltip isn't disabled
			if(api.cache.disabled) { return FALSE; }

			// Cache the event data
			api.cache.event = $.extend({}, event);
			api.cache.target = event ? $(event.target) : [undefined];

			// Start the event sequence
			if(options.show.delay > 0) {
				clearTimeout(api.timers.show);
				api.timers.show = setTimeout(render, options.show.delay);
				if(events.show !== events.hide) {
					targets.hide.bind(events.hide, function() { clearTimeout(api.timers.show); });
				}
			}
			else { render(); }
		}

		// Bind show events to target
		targets.show.bind(events.show, hoverIntent);

		// Prerendering is enabled, create tooltip now
		if(options.show.ready || options.prerender) { hoverIntent(event); }
	});
};

// Setup base plugins
PLUGINS = QTIP.plugins = {
	// Corner object parser
	Corner: function(corner) {
		corner = ('' + corner).replace(/([A-Z])/, ' $1').replace(/middle/gi, CENTER).toLowerCase();
		this.x = (corner.match(/left|right/i) || corner.match(/center/) || ['inherit'])[0].toLowerCase();
		this.y = (corner.match(/top|bottom|center/i) || ['inherit'])[0].toLowerCase();

		var f = corner.charAt(0); this.precedance = (f === 't' || f === 'b' ? Y : X);

		this.string = function() { return this.precedance === Y ? this.y+this.x : this.x+this.y; };
		this.abbrev = function() {
			var x = this.x.substr(0,1), y = this.y.substr(0,1);
			return x === y ? x : this.precedance === Y ? y + x : x + y;
		};

		this.invertx = function(center) { this.x = this.x === LEFT ? RIGHT : this.x === RIGHT ? LEFT : center || this.x; };
		this.inverty = function(center) { this.y = this.y === TOP ? BOTTOM : this.y === BOTTOM ? TOP : center || this.y; };

		this.clone = function() {
			return {
				x: this.x, y: this.y, precedance: this.precedance,
				string: this.string, abbrev: this.abbrev, clone: this.clone,
				invertx: this.invertx, inverty: this.inverty
			};
		};
	},

	// Custom (more correct for qTip!) offset calculator
	offset: function(elem, container) {
		var pos = elem.offset(),
			docBody = elem.closest('body')[0],
			parent = container, scrolled,
			coffset, overflow;

		function scroll(e, i) {
			pos.left += i * e.scrollLeft();
			pos.top += i * e.scrollTop();
		}

		if(parent) {
			// Compensate for non-static containers offset
			do {
				if(parent.css('position') !== 'static') {
					coffset = parent.position();

					// Account for element positioning, borders and margins
					pos.left -= coffset.left + (parseInt(parent.css('borderLeftWidth'), 10) || 0) + (parseInt(parent.css('marginLeft'), 10) || 0);
					pos.top -= coffset.top + (parseInt(parent.css('borderTopWidth'), 10) || 0) + (parseInt(parent.css('marginTop'), 10) || 0);

					// If this is the first parent element with an overflow of "scroll" or "auto", store it
					if(!scrolled && (overflow = parent.css('overflow')) !== 'hidden' && overflow !== 'visible') { scrolled = parent; }
				}
			}
			while((parent = $(parent[0].offsetParent)).length);

			// Compensate for containers scroll if it also has an offsetParent
			if(scrolled && scrolled[0] !== docBody) { scroll( scrolled, 1 ); }
		}

		return pos;
	},

	/*
	* iOS version detection
	*/
	iOS: parseFloat( 
		('' + (/CPU.*OS ([0-9_]{1,5})|(CPU like).*AppleWebKit.*Mobile/i.exec(navigator.userAgent) || [0,''])[1])
		.replace('undefined', '3_2').replace('_', '.').replace('_', '')
	) || FALSE,

	/*
	* jQuery-specific $.fn overrides
	*/
	fn: {
		/* Allow other plugins to successfully retrieve the title of an element with a qTip applied */
		attr: function(attr, val) {
			if(this.length) {
				var self = this[0],
					title = 'title',
					api = $.data(self, 'qtip');

				if(attr === title && api && 'object' === typeof api && api.options.suppress) {
					if(arguments.length < 2) {
						return $.attr(self, oldtitle);
					}
					else {
						// If qTip is rendered and title was originally used as content, update it
						if(api && api.options.content.attr === title && api.cache.attr) {
							api.set('content.text', val);
						}

						// Use the regular attr method to set, then cache the result
						return this.attr(oldtitle, val);
					}
				}
			}

			return $.fn['attr'+replaceSuffix].apply(this, arguments);
		},

		/* Allow clone to correctly retrieve cached title attributes */
		clone: function(keepData) {
			var titles = $([]), title = 'title',

			// Clone our element using the real clone method
			elems = $.fn['clone'+replaceSuffix].apply(this, arguments);

			// Grab all elements with an oldtitle set, and change it to regular title attribute, if keepData is false
			if(!keepData) {
				elems.filter('['+oldtitle+']').attr('title', function() {
					return $.attr(this, oldtitle);
				})
				.removeAttr(oldtitle);
			}

			return elems;
		}
	}
};

// Apply the fn overrides above
$.each(PLUGINS.fn, function(name, func) {
	if(!func || $.fn[name+replaceSuffix]) { return TRUE; }

	var old = $.fn[name+replaceSuffix] = $.fn[name];
	$.fn[name] = function() {
		return func.apply(this, arguments) || old.apply(this, arguments);
	};
});

/* Fire off 'removeqtip' handler in $.cleanData if jQuery UI not present (it already does similar).
 * This snippet is taken directly from jQuery UI source code found here:
 *     http://code.jquery.com/ui/jquery-ui-git.js
 */
if(!$.ui) {
	$['cleanData'+replaceSuffix] = $.cleanData;
	$.cleanData = function( elems ) {
		for(var i = 0, elem; (elem = elems[i]) !== undefined; i++) {
			try { $( elem ).triggerHandler('removeqtip'); }
			catch( e ) {}
		}
		$['cleanData'+replaceSuffix]( elems );
	};
}

// Set global qTip properties
QTIP.version = '@VERSION';
QTIP.nextid = 0;
QTIP.inactiveEvents = 'click dblclick mousedown mouseup mousemove mouseleave mouseenter'.split(' ');
QTIP.zindex = 15000;

// Define configuration defaults
QTIP.defaults = {
	prerender: FALSE,
	id: FALSE,
	overwrite: TRUE,
	suppress: TRUE,
	content: {
		text: TRUE,
		attr: 'title',
		title: {
			text: FALSE,
			button: FALSE
		}
	},
	position: {
		my: 'top left',
		at: 'bottom right',
		target: FALSE,
		container: FALSE,
		viewport: FALSE,
		adjust: {
			x: 0, y: 0,
			mouse: TRUE,
			resize: TRUE,
			method: 'flip flip'
		},
		effect: function(api, pos, viewport) {
			$(this).animate(pos, {
				duration: 200,
				queue: FALSE
			});
		}
	},
	show: {
		target: FALSE,
		event: 'mouseenter',
		effect: TRUE,
		delay: 90,
		solo: FALSE,
		ready: FALSE,
		autofocus: FALSE
	},
	hide: {
		target: FALSE,
		event: 'mouseleave',
		effect: TRUE,
		delay: 0,
		fixed: FALSE,
		inactive: FALSE,
		leave: 'window',
		distance: FALSE
	},
	style: {
		classes: '',
		widget: FALSE,
		width: FALSE,
		height: FALSE,
		def: TRUE
	},
	events: {
		render: NULL,
		move: NULL,
		show: NULL,
		hide: NULL,
		toggle: NULL,
		visible: NULL,
		hidden: NULL,
		focus: NULL,
		blur: NULL
	}
};


PLUGINS.svg = function(api, svg, corner, adjustMethod)
{
	var doc = $(document),
		elem = svg[0],
		result = {
			width: 0, height: 0,
			position: { top: 1e10, left: 1e10 }
		},
		box, mtx, root, point, tPoint;

	// Ascend the parentNode chain until we find an element with getBBox()
	while(!elem.getBBox) { elem = elem.parentNode; }

	// Check for a valid bounding box method
	if (elem.getBBox && elem.parentNode) {
		box = elem.getBBox();
		mtx = elem.getScreenCTM();
		root = elem.farthestViewportElement || elem;

		// Return if no method is found
		if(!root.createSVGPoint) { return result; }

		// Create our point var
		point = root.createSVGPoint();

		// Adjust top and left
		point.x = box.x;
		point.y = box.y;
		tPoint = point.matrixTransform(mtx);
		result.position.left = tPoint.x;
		result.position.top = tPoint.y;

		// Adjust width and height
		point.x += box.width;
		point.y += box.height;
		tPoint = point.matrixTransform(mtx);
		result.width = tPoint.x - result.position.left;
		result.height = tPoint.y - result.position.top;

		// Adjust by scroll offset
		result.position.left += doc.scrollLeft();
		result.position.top += doc.scrollTop();
	}

	return result;
};


function Ajax(api)
{
	var self = this,
		tooltip = api.elements.tooltip,
		opts = api.options.content.ajax,
		defaults = QTIP.defaults.content.ajax,
		namespace = '.qtip-ajax',
		rscript = /<script\b[^<]*(?:(?!<\/script>)<[^<]*)*<\/script>/gi,
		first = TRUE,
		stop = FALSE,
		xhr;

	api.checks.ajax = {
		'^content.ajax': function(obj, name, v) {
			// If content.ajax object was reset, set our local var
			if(name === 'ajax') { opts = v; }

			if(name === 'once') {
				self.init();
			}
			else if(opts && opts.url) {
				self.load();
			}
			else {
				tooltip.unbind(namespace);
			}
		}
	};

	$.extend(self, {
		init: function() {
			// Make sure ajax options are enabled and bind event
			if(opts && opts.url) {
				tooltip.unbind(namespace)[ opts.once ? 'one' : 'bind' ]('tooltipshow'+namespace, self.load);
			}

			return self;
		},

		load: function(event) {
			if(stop) {stop = FALSE; return; }

			var hasSelector = opts.url.indexOf(' '),
				url = opts.url,
				selector,
				hideFirst = !opts.loading && first;

			// If loading option is disabled, prevent the tooltip showing until we've completed the request
			if(hideFirst) { try{ event.preventDefault(); } catch(e) {} }

			// Make sure default event hasn't been prevented
			else if(event && event.isDefaultPrevented()) { return self; }

			// Cancel old request
			if(xhr && xhr.abort) { xhr.abort(); }
			
			// Check if user delcared a content selector like in .load()
			if(hasSelector > -1) {
				selector = url.substr(hasSelector);
				url = url.substr(0, hasSelector);
			}

			// Define common after callback for both success/error handlers
			function after() {
				var complete;

				// Don't proceed if tooltip is destroyed
				if(api.destroyed) { return; }

				// Set first flag to false
				first = FALSE;

				// Re-display tip if loading and first time, and reset first flag
				if(hideFirst) { stop = TRUE; api.show(event.originalEvent); }

				// Call users complete method if it was defined
				if((complete = defaults.complete || opts.complete) && $.isFunction(complete)) {
					complete.apply(opts.context || api, arguments);
				}
			}

			// Define success handler
			function successHandler(content, status, jqXHR) {
				var success;

				// Don't proceed if tooltip is destroyed
				if(api.destroyed) { return; }

				if(selector) {
					// Create a dummy div to hold the results and grab the selector element
					content = $('<div/>')
						// inject the contents of the document in, removing the scripts
						// to avoid any 'Permission Denied' errors in IE
						.append(content.replace(rscript, ""))
						
						// Locate the specified elements
						.find(selector);
				}

				// Call the success function if one is defined
				if((success = defaults.success || opts.success) && $.isFunction(success)) {
					success.call(opts.context || api, content, status, jqXHR);
				}

				// Otherwise set the content
				else { api.set('content.text', content); }
			}

			// Error handler
			function errorHandler(xhr, status, error) {
				if(api.destroyed || xhr.status === 0) { return; }
				api.set('content.text', status + ': ' + error);
			}

			// Setup $.ajax option object and process the request
			xhr = $.ajax(
				$.extend({
					error: defaults.error || errorHandler,
					context: api
				},
				opts, { url: url, success: successHandler, complete: after })
			);
		},

		destroy: function() {
			// Cancel ajax request if possible
			if(xhr && xhr.abort) { xhr.abort(); }

			// Set api.destroyed flag
			api.destroyed = TRUE;
		}
	});

	self.init();
}


PLUGINS.ajax = function(api)
{
	var self = api.plugins.ajax;
	
	return 'object' === typeof self ? self : (api.plugins.ajax = new Ajax(api));
};

PLUGINS.ajax.initialize = 'render';

// Setup plugin sanitization
PLUGINS.ajax.sanitize = function(options)
{
	var content = options.content, opts;
	if(content && 'ajax' in content) {
		opts = content.ajax;
		if(typeof opts !== 'object') { opts = options.content.ajax = { url: opts }; }
		if('boolean' !== typeof opts.once && opts.once) { opts.once = !!opts.once; }
	}
};

// Extend original api defaults
$.extend(TRUE, QTIP.defaults, {
	content: {
		ajax: {
			loading: TRUE,
			once: TRUE
		}
	}
});


// Tip coordinates calculator
function calculateTip(corner, width, height)
{	
	var width2 = Math.ceil(width / 2), height2 = Math.ceil(height / 2),

	// Define tip coordinates in terms of height and width values
	tips = {
		bottomright:	[[0,0],				[width,height],		[width,0]],
		bottomleft:		[[0,0],				[width,0],				[0,height]],
		topright:		[[0,height],		[width,0],				[width,height]],
		topleft:			[[0,0],				[0,height],				[width,height]],
		topcenter:		[[0,height],		[width2,0],				[width,height]],
		bottomcenter:	[[0,0],				[width,0],				[width2,height]],
		rightcenter:	[[0,0],				[width,height2],		[0,height]],
		leftcenter:		[[width,0],			[width,height],		[0,height2]]
	};

	// Set common side shapes
	tips.lefttop = tips.bottomright; tips.righttop = tips.bottomleft;
	tips.leftbottom = tips.topright; tips.rightbottom = tips.topleft;

	return tips[ corner.string() ];
}


function Tip(qTip, command)
{
	var self = this,
		opts = qTip.options.style.tip,
		elems = qTip.elements,
		tooltip = elems.tooltip,
		cache = { top: 0, left: 0 },
		size = {
			width: opts.width,
			height: opts.height
		},
		color = { },
		border = opts.border || 0,
		namespace = '.qtip-tip',
		hasCanvas = !!($('<canvas />')[0] || {}).getContext;

	self.corner = NULL;
	self.mimic = NULL;
	self.border = border;
	self.offset = opts.offset;
	self.size = size;

	// Add new option checks for the plugin
	qTip.checks.tip = {
		'^position.my|style.tip.(corner|mimic|border)$': function() {
			// Make sure a tip can be drawn
			if(!self.init()) {
				self.destroy();
			}

			// Reposition the tooltip
			qTip.reposition();
		},
		'^style.tip.(height|width)$': function() {
			// Re-set dimensions and redraw the tip
			size = {
				width: opts.width,
				height: opts.height
			};
			self.create();
			self.update();

			// Reposition the tooltip
			qTip.reposition();
		},
		'^content.title.text|style.(classes|widget)$': function() {
			if(elems.tip && elems.tip.length) {
				self.update();
			}
		}
	};

	function swapDimensions() {
		size.width = opts.height;
		size.height = opts.width;
	}

	function resetDimensions() {
		size.width = opts.width;
		size.height = opts.height;
	}

	function reposition(event, api, pos, viewport) {
		if(!elems.tip) { return; }

		var newCorner = self.corner.clone(),
			adjust = pos.adjusted,
			method = qTip.options.position.adjust.method.split(' '),
			horizontal = method[0],
			vertical = method[1] || method[0],
			shift = { left: FALSE, top: FALSE, x: 0, y: 0 },
			offset, css = {}, props;

		// If our tip position isn't fixed e.g. doesn't adjust with viewport...
		if(self.corner.fixed !== TRUE) {
			// Horizontal - Shift or flip method
			if(horizontal === SHIFT && newCorner.precedance === X && adjust.left && newCorner.y !== CENTER) {
				newCorner.precedance = newCorner.precedance === X ? Y : X;
			}
			else if(horizontal !== SHIFT && adjust.left){
				newCorner.x = newCorner.x === CENTER ? (adjust.left > 0 ? LEFT : RIGHT) : (newCorner.x === LEFT ? RIGHT : LEFT);
			}

			// Vertical - Shift or flip method
			if(vertical === SHIFT && newCorner.precedance === Y && adjust.top && newCorner.x !== CENTER) {
				newCorner.precedance = newCorner.precedance === Y ? X : Y;
			}
			else if(vertical !== SHIFT && adjust.top) {
				newCorner.y = newCorner.y === CENTER ? (adjust.top > 0 ? TOP : BOTTOM) : (newCorner.y === TOP ? BOTTOM : TOP);
			}

			// Update and redraw the tip if needed (check cached details of last drawn tip)
			if(newCorner.string() !== cache.corner.string() && (cache.top !== adjust.top || cache.left !== adjust.left)) {
				self.update(newCorner, FALSE);
			}
		}

		// Setup tip offset properties
		offset = self.position(newCorner, adjust);
		offset[ newCorner.x ] += borderWidth(newCorner, newCorner.x, TRUE);
		offset[ newCorner.y ] += borderWidth(newCorner, newCorner.y, TRUE);

		// Readjust offset object to make it left/top
		if(offset.right !== undefined) { offset.left = -offset.right; }
		if(offset.bottom !== undefined) { offset.top = -offset.bottom; }
		offset.user = Math.max(0, opts.offset);

		// Viewport "shift" specific adjustments
		if(shift.left = (horizontal === SHIFT && !!adjust.left)) {
			if(newCorner.x === CENTER) {
				css['margin-left'] = shift.x = offset['margin-left'] - adjust.left;
			}
			else {
				props = offset.right !== undefined ?
					[ adjust.left, -offset.left ] : [ -adjust.left, offset.left ];

				if( (shift.x = Math.max(props[0], props[1])) > props[0] ) {
					pos.left -= adjust.left;
					shift.left = FALSE;
				}
				
				css[ offset.right !== undefined ? RIGHT : LEFT ] = shift.x;
			}
		}
		if(shift.top = (vertical === SHIFT && !!adjust.top)) {
			if(newCorner.y === CENTER) {
				css['margin-top'] = shift.y = offset['margin-top'] - adjust.top;
			}
			else {
				props = offset.bottom !== undefined ?
					[ adjust.top, -offset.top ] : [ -adjust.top, offset.top ];

				if( (shift.y = Math.max(props[0], props[1])) > props[0] ) {
					pos.top -= adjust.top;
					shift.top = FALSE;
				}

				css[ offset.bottom !== undefined ? BOTTOM : TOP ] = shift.y;
			}
		}

		/*
		* If the tip is adjusted in both dimensions, or in a
		* direction that would cause it to be anywhere but the
		* outer border, hide it!
		*/
		elems.tip.css(css).toggle(
			!((shift.x && shift.y) || (newCorner.x === CENTER && shift.y) || (newCorner.y === CENTER && shift.x))
		);

		// Adjust position to accomodate tip dimensions
		pos.left -= offset.left.charAt ? offset.user : horizontal !== SHIFT || shift.top || !shift.left && !shift.top ? offset.left : 0;
		pos.top -= offset.top.charAt ? offset.user : vertical !== SHIFT || shift.left || !shift.left && !shift.top ? offset.top : 0;

		// Cache details
		cache.left = adjust.left; cache.top = adjust.top;
		cache.corner = newCorner.clone();
	}

	/* border width calculator */
	function borderWidth(corner, side, backup) {
		side = !side ? corner[corner.precedance] : side;
		
		var isFluid = tooltip.hasClass(fluidClass),
			isTitleTop = elems.titlebar && corner.y === TOP,
			elem = isTitleTop ? elems.titlebar : elems.tooltip,
			css = 'border-' + side + '-width',
			val;

		// Grab the border-width value (add fluid class if needed)
		tooltip.addClass(fluidClass);
		val = parseInt(elem.css(css), 10);
		val = (backup ? val || parseInt(tooltip.css(css), 10) : val) || 0;
		tooltip.toggleClass(fluidClass, isFluid);

		return val;
	}

	function borderRadius(corner) {
		var isTitleTop = elems.titlebar && corner.y === TOP,
			elem = isTitleTop ? elems.titlebar : elems.content,
			moz = $.browser.mozilla,
			prefix = moz ? '-moz-' : $.browser.webkit ? '-webkit-' : '',
			nonStandard = 'border-radius-' + corner.y + corner.x,
			standard = 'border-' + corner.y + '-' + corner.x + '-radius';

		function r(c) { return parseInt(elem.css(c), 10) || parseInt(tooltip.css(c), 10); }
		return r(standard) || r(prefix + standard) || r(prefix + nonStandard) || r(nonStandard) || 0;
	}

	function calculateSize(corner) {
		var y = corner.precedance === Y,
			width = size [ y ? WIDTH : HEIGHT ],
			height = size [ y ? HEIGHT : WIDTH ],
			isCenter = corner.string().indexOf(CENTER) > -1,
			base = width * (isCenter ? 0.5 : 1),
			pow = Math.pow,
			round = Math.round,
			bigHyp, ratio, result,

		smallHyp = Math.sqrt( pow(base, 2) + pow(height, 2) ),
		
		hyp = [
			(border / base) * smallHyp, (border / height) * smallHyp
		];
		hyp[2] = Math.sqrt( pow(hyp[0], 2) - pow(border, 2) );
		hyp[3] = Math.sqrt( pow(hyp[1], 2) - pow(border, 2) );

		bigHyp = smallHyp + hyp[2] + hyp[3] + (isCenter ? 0 : hyp[0]);
		ratio = bigHyp / smallHyp;

		result = [ round(ratio * height), round(ratio * width) ];
		return { height: result[ y ? 0 : 1 ], width: result[ y ? 1 : 0 ] };
	}

	$.extend(self, {
		init: function()
		{
			var enabled = self.detectCorner() && (hasCanvas || $.browser.msie);

			// Determine tip corner and type
			if(enabled) {
				// Create a new tip and draw it
				self.create();
				self.update();

				// Bind update events
				tooltip.unbind(namespace).bind('tooltipmove'+namespace, reposition);
			}
			
			return enabled;
		},

		detectCorner: function()
		{
			var corner = opts.corner,
				posOptions = qTip.options.position,
				at = posOptions.at,
				my = posOptions.my.string ? posOptions.my.string() : posOptions.my;

			// Detect corner and mimic properties
			if(corner === FALSE || (my === FALSE && at === FALSE)) {
				return FALSE;
			}
			else {
				if(corner === TRUE) {
					self.corner = new PLUGINS.Corner(my);
				}
				else if(!corner.string) {
					self.corner = new PLUGINS.Corner(corner);
					self.corner.fixed = TRUE;
				}
			}

			// Cache it
			cache.corner = new PLUGINS.Corner( self.corner.string() );

			return self.corner.string() !== 'centercenter';
		},

		detectColours: function(actual) {
			var i, fill, border,
				tip = elems.tip.css('cssText', ''),
				corner = actual || self.corner,
				precedance = corner[ corner.precedance ],

				borderSide = 'border-' + precedance + '-color',
				borderSideCamel = 'border' + precedance.charAt(0) + precedance.substr(1) + 'Color',

				invalid = /rgba?\(0, 0, 0(, 0)?\)|transparent|#123456/i,
				backgroundColor = 'background-color',
				transparent = 'transparent',
				important = ' !important',

				useTitle = elems.titlebar && (corner.y === TOP || (corner.y === CENTER && tip.position().top + (size.height / 2) + opts.offset < elems.titlebar.outerHeight(1))),
				colorElem = useTitle ? elems.titlebar : elems.tooltip;

			// Apply the fluid class so we can see our CSS values properly
			tooltip.addClass(fluidClass);

			// Detect tip colours from CSS styles
			color.fill = fill = tip.css(backgroundColor);
			color.border = border = tip[0].style[ borderSideCamel ] || tip.css(borderSide) || tooltip.css(borderSide);

			// Make sure colours are valid
			if(!fill || invalid.test(fill)) {
				color.fill = colorElem.css(backgroundColor) || transparent;
				if(invalid.test(color.fill)) {
					color.fill = tooltip.css(backgroundColor) || fill;
				}
			}
			if(!border || invalid.test(border) || border === $(document.body).css('color')) {
				color.border = colorElem.css(borderSide) || transparent;
				if(invalid.test(color.border) || color.border === colorElem.css('color')) {
					color.border = tooltip.css(borderSide) || tooltip.css(borderSideCamel) || border;
				}
			}

			// Reset background and border colours
			$('*', tip).add(tip).css('cssText', backgroundColor+':'+transparent+important+';border:0'+important+';');

			// Remove fluid class
			tooltip.removeClass(fluidClass);
		},

		create: function()
		{
			var width = size.width,
				height = size.height,
				vml;

			// Remove previous tip element if present
			if(elems.tip) { elems.tip.remove(); }

			// Create tip element and prepend to the tooltip
			elems.tip = $('<div />', { 'class': 'ui-tooltip-tip' }).css({ width: width, height: height }).prependTo(tooltip);

			// Create tip drawing element(s)
			if(hasCanvas) {
				// save() as soon as we create the canvas element so FF2 doesn't bork on our first restore()!
				$('<canvas />').appendTo(elems.tip)[0].getContext('2d').save();
			}
			else {
				vml = '<vml:shape coordorigin="0,0" style="display:inline-block; position:absolute; behavior:url(#default#VML);"></vml:shape>';
				elems.tip.html(vml + vml);

				// Prevent mousing down on the tip since it causes problems with .live() handling in IE due to VML
				$('*', elems.tip).bind('click mousedown', function(event) { event.stopPropagation(); });
			}
		},

		update: function(corner, position)
		{
			var tip = elems.tip,
				inner = tip.children(),
				width = size.width,
				height = size.height,
				regular = 'px solid ',
				transparent = 'px dashed transparent', // Dashed IE6 border-transparency hack. Awesome!
				mimic = opts.mimic,
				round = Math.round,
				precedance, context, coords, translate, newSize;

			// Re-determine tip if not already set
			if(!corner) { corner = cache.corner || self.corner; }

			// Use corner property if we detect an invalid mimic value
			if(mimic === FALSE) { mimic = corner; }

			// Otherwise inherit mimic properties from the corner object as necessary
			else {
				mimic = new PLUGINS.Corner(mimic);
				mimic.precedance = corner.precedance;

				if(mimic.x === 'inherit') { mimic.x = corner.x; }
				else if(mimic.y === 'inherit') { mimic.y = corner.y; }
				else if(mimic.x === mimic.y) {
					mimic[ corner.precedance ] = corner[ corner.precedance ];
				}
			}
			precedance = mimic.precedance;

			// Ensure the tip width.height are relative to the tip position
			if(corner.precedance === X) { swapDimensions(); }
			else { resetDimensions(); }

			// Set the tip dimensions
			elems.tip.css({
				width: (width = size.width),
				height: (height = size.height)
			});

			// Update our colours
			self.detectColours(corner);

			// Detect border width, taking into account colours
			if(color.border !== 'transparent') {
				// Grab border width
				border = borderWidth(corner, NULL, TRUE);

				// If border width isn't zero, use border color as fill (1.0 style tips)
				if(opts.border === 0 && border > 0) { color.fill = color.border; }

				// Set border width (use detected border width if opts.border is true)
				self.border = border = opts.border !== TRUE ? opts.border : border;
			}

			// Border colour was invalid, set border to zero
			else { self.border = border = 0; }

			// Calculate coordinates
			coords = calculateTip(mimic, width , height);

			// Determine tip size
			self.size = newSize = calculateSize(corner);
			tip.css(newSize);

			// Calculate tip translation
			if(corner.precedance === Y) {
				translate = [
					round(mimic.x === LEFT ? border : mimic.x === RIGHT ? newSize.width - width - border : (newSize.width - width) / 2),
					round(mimic.y === TOP ? newSize.height - height : 0)
				];
			}
			else {
				translate = [
					round(mimic.x === LEFT ? newSize.width - width : 0),
					round(mimic.y === TOP ? border : mimic.y === BOTTOM ? newSize.height - height - border : (newSize.height - height) / 2)
				];
			}

			// Canvas drawing implementation
			if(hasCanvas) {
				// Set the canvas size using calculated size
				inner.attr(newSize);

				// Grab canvas context and clear/save it
				context = inner[0].getContext('2d');
				context.restore(); context.save();
				context.clearRect(0,0,3000,3000);

				// Set properties
				context.fillStyle = color.fill;
				context.strokeStyle = color.border;
				context.lineWidth = border * 2;
				context.lineJoin = 'miter';
				context.miterLimit = 100;

				// Translate origin
				context.translate(translate[0], translate[1]);

				// Draw the tip
				context.beginPath();
				context.moveTo(coords[0][0], coords[0][1]);
				context.lineTo(coords[1][0], coords[1][1]);
				context.lineTo(coords[2][0], coords[2][1]);
				context.closePath();

				// Apply fill and border
				if(border) {
					// Make sure transparent borders are supported by doing a stroke
					// of the background colour before the stroke colour
					if(tooltip.css('background-clip') === 'border-box') {
						context.strokeStyle = color.fill;
						context.stroke();
					}
					context.strokeStyle = color.border;
					context.stroke();
				}
				context.fill();
			}

			// VML (IE Proprietary implementation)
			else {
				// Setup coordinates string
				coords = 'm' + coords[0][0] + ',' + coords[0][1] + ' l' + coords[1][0] +
					',' + coords[1][1] + ' ' + coords[2][0] + ',' + coords[2][1] + ' xe';

				// Setup VML-specific offset for pixel-perfection
				translate[2] = border && /^(r|b)/i.test(corner.string()) ?
					parseFloat($.browser.version, 10) === 8 ? 2 : 1 : 0;

				// Set initial CSS
				inner.css({
					antialias: ''+(mimic.string().indexOf(CENTER) > -1),
					left: translate[0] - (translate[2] * Number(precedance === X)),
					top: translate[1] - (translate[2] * Number(precedance === Y)),
					width: width + border,
					height: height + border
				})
				.each(function(i) {
					var $this = $(this);

					// Set shape specific attributes
					$this[ $this.prop ? 'prop' : 'attr' ]({
						coordsize: (width+border) + ' ' + (height+border),
						path: coords,
						fillcolor: color.fill,
						filled: !!i,
						stroked: !i
					})
					.css({ display: border || i ? 'block' : 'none' });

					// Check if border is enabled and add stroke element
					if(!i && $this.html() === '') {
						$this.html(
							'<vml:stroke weight="'+(border*2)+'px" color="'+color.border+'" miterlimit="1000" joinstyle="miter" ' +
							' style="behavior:url(#default#VML); display:inline-block;" />'
						);
					}
				});
			}

			// Position if needed
			if(position !== FALSE) { self.position(corner); }
		},

		// Tip positioning method
		position: function(corner)
		{
			var tip = elems.tip,
				position = {},
				userOffset = Math.max(0, opts.offset),
				precedance, dimensions, corners;

			// Return if tips are disabled or tip is not yet rendered
			if(opts.corner === FALSE || !tip) { return FALSE; }

			// Inherit corner if not provided
			corner = corner || self.corner;
			precedance = corner.precedance;

			// Determine which tip dimension to use for adjustment
			dimensions = calculateSize(corner);

			// Setup corners and offset array
			corners = [ corner.x, corner.y ];
			if(precedance === X) { corners.reverse(); }

			// Calculate tip position
			$.each(corners, function(i, side) {
				var b, br;

				if(side === CENTER) {
					b = precedance === Y ? LEFT : TOP;
					position[ b ] = '50%';
					position['margin-' + b] = -Math.round(dimensions[ precedance === Y ? WIDTH : HEIGHT ] / 2) + userOffset;
				}
				else {
					b = borderWidth(corner, side);
					br = borderRadius(corner);

					position[ side ] = i ? 0 : (userOffset + (br > b ? br : -b));
				}
			});

			// Adjust for tip dimensions
			position[ corner[precedance] ] -= dimensions[ precedance === X ? WIDTH : HEIGHT ];

			// Set and return new position
			tip.css({ top: '', bottom: '', left: '', right: '', margin: '' }).css(position);
			return position;
		},
		
		destroy: function()
		{
			// Remove the tip element
			if(elems.tip) { elems.tip.remove(); }
			elems.tip = false;

			// Unbind events
			tooltip.unbind(namespace);
		}
	});

	self.init();
}

PLUGINS.tip = function(api)
{
	var self = api.plugins.tip;
	
	return 'object' === typeof self ? self : (api.plugins.tip = new Tip(api));
};

// Initialize tip on render
PLUGINS.tip.initialize = 'render';

// Setup plugin sanitization options
PLUGINS.tip.sanitize = function(options)
{
	var style = options.style, opts;
	if(style && 'tip' in style) {
		opts = options.style.tip;
		if(typeof opts !== 'object'){ options.style.tip = { corner: opts }; }
		if(!(/string|boolean/i).test(typeof opts['corner'])) { opts['corner'] = TRUE; }
		if(typeof opts.width !== 'number'){ delete opts.width; }
		if(typeof opts.height !== 'number'){ delete opts.height; }
		if(typeof opts.border !== 'number' && opts.border !== TRUE){ delete opts.border; }
		if(typeof opts.offset !== 'number'){ delete opts.offset; }
	}
};

// Extend original qTip defaults
$.extend(TRUE, QTIP.defaults, {
	style: {
		tip: {
			corner: TRUE,
			mimic: FALSE,
			width: 6,
			height: 6,
			border: TRUE,
			offset: 0
		}
	}
});


function Modal(api)
{
	var self = this,
		options = api.options.show.modal,
		elems = api.elements,
		tooltip = elems.tooltip,
		overlaySelector = '#qtip-overlay',
		globalNamespace = '.qtipmodal',
		namespace = globalNamespace + api.id,
		attr = 'is-modal-qtip',
		docBody = $(document.body),
		focusableSelector = PLUGINS.modal.focusable.join(','),
		focusableElems = {}, overlay;

	// Setup option set checks
	api.checks.modal = {
		'^show.modal.(on|blur)$': function() {
			// Initialise
			self.init();
			
			// Show the modal if not visible already and tooltip is visible
			elems.overlay.toggle( tooltip.is(':visible') );
		},
		'^content.text$': function() {
			updateFocusable();
		}
	};

	function updateFocusable() {
		focusableElems = $(focusableSelector, tooltip).not('[disabled]').map(function() {
			return typeof this.focus === 'function' ? this : null;
		});
	}

	function focusInputs(blurElems) {
		// Blurring body element in IE causes window.open windows to unfocus!
		if(focusableElems.length < 1 && blurElems.length) { blurElems.not('body').blur(); }

		// Focus the inputs
		else { focusableElems.first().focus(); }
	}

	function stealFocus(event) {
		var target = $(event.target),
			container = target.closest('.qtip'),
			targetOnTop;

		// Determine if input container target is above this
		targetOnTop = container.length < 1 ? FALSE :
			(parseInt(container[0].style.zIndex, 10) > parseInt(tooltip[0].style.zIndex, 10));

		// If we're showing a modal, but focus has landed on an input below
		// this modal, divert focus to the first visible input in this modal
		// or if we can't find one... the tooltip itself
		if(!targetOnTop && ($(event.target).closest(selector)[0] !== tooltip[0])) {
			focusInputs(target);
		}
	}

	$.extend(self, {
		init: function()
		{
			// If modal is disabled... return
			if(!options.on) { return self; }

			// Create the overlay if needed
			overlay = self.create();

			// Add unique attribute so we can grab modal tooltips easily via a selector
			tooltip.attr(attr, TRUE)

			// Set z-index
			.css('z-index', PLUGINS.modal.zindex + $(selector+'['+attr+']').length)
			
			// Remove previous bound events in globalNamespace
			.unbind(globalNamespace).unbind(namespace)

			// Apply our show/hide/focus modal events
			.bind('tooltipshow'+globalNamespace+' tooltiphide'+globalNamespace, function(event, api, duration) {
				var oEvent = event.originalEvent;

				// Make sure mouseout doesn't trigger a hide when showing the modal and mousing onto backdrop
				if(event.target === tooltip[0]) {
					if(oEvent && event.type === 'tooltiphide' && /mouse(leave|enter)/.test(oEvent.type) && $(oEvent.relatedTarget).closest(overlay[0]).length) {
						try { event.preventDefault(); } catch(e) {}
					}
					else if(!oEvent || (oEvent && !oEvent.solo)) {
						self[ event.type.replace('tooltip', '') ](event, duration);
					}
				}
			})

			// Adjust modal z-index on tooltip focus
			.bind('tooltipfocus'+globalNamespace, function(event) {
				// If focus was cancelled before it reearch us, don't do anything
				if(event.isDefaultPrevented() || event.target !== tooltip[0]) { return; }

				var qtips = $(selector).filter('['+attr+']'),

				// Keep the modal's lower than other, regular qtips
				newIndex = PLUGINS.modal.zindex + qtips.length,
				curIndex = parseInt(tooltip[0].style.zIndex, 10);

				// Set overlay z-index
				overlay[0].style.zIndex = newIndex - 2;

				// Reduce modal z-index's and keep them properly ordered
				qtips.each(function() {
					if(this.style.zIndex > curIndex) {
						this.style.zIndex -= 1;
					}
				});

				// Fire blur event for focused tooltip
				qtips.end().filter('.' + focusClass).qtip('blur', event.originalEvent);

				// Set the new z-index
				tooltip.addClass(focusClass)[0].style.zIndex = newIndex;

				// Prevent default handling
				try { event.preventDefault(); } catch(e) {}
			})

			// Focus any other visible modals when this one hides
			.bind('tooltiphide'+globalNamespace, function(event) {
				if(event.target === tooltip[0]) {
					$('[' + attr + ']').filter(':visible').not(tooltip).last().qtip('focus', event);
				}
			});

			// Apply keyboard "Escape key" close handler
			if(options.escape) {
				$(document).unbind(namespace).bind('keydown'+namespace, function(event) {
					if(event.keyCode === 27 && tooltip.hasClass(focusClass)) {
						api.hide(event);
					}
				});
			}

			// Apply click handler for blur option
			if(options.blur) {
				elems.overlay.unbind(namespace).bind('click'+namespace, function(event) {
					if(tooltip.hasClass(focusClass)) { api.hide(event); }
				});
			}

			// Update focusable elements
			updateFocusable();

			return self;
		},

		create: function()
		{
			var elem = $(overlaySelector);

			// Return if overlay is already rendered
			if(elem.length) {
				// Modal overlay should always be below all tooltips if possible
				return (elems.overlay = elem.insertAfter( $(selector).last() ));
			}

			// Create document overlay
			overlay = elems.overlay = $('<div />', {
				id: overlaySelector.substr(1),
				html: '<div></div>',
				mousedown: function() { return FALSE; }
			})
			.hide()
			.insertAfter( $(selector).last() );

			// Update position on window resize or scroll
			function resize() {
				overlay.css({
					height: $(window).height(),
					width: $(window).width()
				});
			}
			$(window).unbind(globalNamespace).bind('resize'+globalNamespace, resize);
			resize(); // Fire it initially too

			return overlay;
		},

		toggle: function(event, state, duration)
		{
			// Make sure default event hasn't been prevented
			if(event && event.isDefaultPrevented()) { return self; }

			var effect = options.effect,
				type = state ? 'show': 'hide',
				visible = overlay.is(':visible'),
				modals = $('[' + attr + ']').filter(':visible').not(tooltip),
				zindex;

			// Create our overlay if it isn't present already
			if(!overlay) { overlay = self.create(); }

			// Prevent modal from conflicting with show.solo, and don't hide backdrop is other modals are visible
			if((overlay.is(':animated') && visible === state) || (!state && modals.length)) { return self; }

			// State specific...
			if(state) {
				// Set position
				overlay.css({ left: 0, top: 0 });

				// Toggle backdrop cursor style on show
				overlay.toggleClass('blurs', options.blur);

				// IF the modal can steal the focus
				if(options.stealfocus !== FALSE) {
					// Make sure we can't focus anything outside the tooltip
					docBody.bind('focusin'+namespace, stealFocus);

					// Blur the current item and focus anything in the modal we an
					focusInputs( $('body *') );
				}
			}
			else {
				// Undelegate focus handler
				docBody.unbind('focusin'+namespace);
			}

			// Stop all animations
			overlay.stop(TRUE, FALSE);

			// Use custom function if provided
			if($.isFunction(effect)) {
				effect.call(overlay, state);
			}

			// If no effect type is supplied, use a simple toggle
			else if(effect === FALSE) {
				overlay[ type ]();
			}

			// Use basic fade function
			else {
				overlay.fadeTo( parseInt(duration, 10) || 90, state ? 1 : 0, function() {
					if(!state) { $(this).hide(); }
				});
			}

			// Reset position on hide
			if(!state) {
				overlay.queue(function(next) {
					overlay.css({ left: '', top: '' });
					next();
				});
			}

			return self;
		},

		show: function(event, duration) { return self.toggle(event, TRUE, duration); },
		hide: function(event, duration) { return self.toggle(event, FALSE, duration); },

		destroy: function()
		{
			var delBlanket = overlay;

			if(delBlanket) {
				// Check if any other modal tooltips are present
				delBlanket = $('[' + attr + ']').not(tooltip).length < 1;

				// Remove overlay if needed
				if(delBlanket) {
					elems.overlay.remove();
					$(document).unbind(globalNamespace);
				}
				else {
					elems.overlay.unbind(globalNamespace+api.id);
				}

				// Undelegate focus handler
				docBody.undelegate('*', 'focusin'+namespace);
			}

			// Remove bound events
			return tooltip.removeAttr(attr).unbind(globalNamespace);
		}
	});

	self.init();
}

PLUGINS.modal = function(api) {
	var self = api.plugins.modal;

	return 'object' === typeof self ? self : (api.plugins.modal = new Modal(api));
};

// Plugin needs to be initialized on render
PLUGINS.modal.initialize = 'render';

// Setup sanitiztion rules
PLUGINS.modal.sanitize = function(opts) {
	if(opts.show) { 
		if(typeof opts.show.modal !== 'object') { opts.show.modal = { on: !!opts.show.modal }; }
		else if(typeof opts.show.modal.on === 'undefined') { opts.show.modal.on = TRUE; }
	}
};

// Base z-index for all modal tooltips (use qTip core z-index as a base)
PLUGINS.modal.zindex = QTIP.zindex - 200;

// Defines the selector used to select all 'focusable' elements within the modal when using the show.modal.stealfocus option.
// Selectors initially taken from http://stackoverflow.com/questions/7668525/is-there-a-jquery-selector-to-get-all-elements-that-can-get-focus
PLUGINS.modal.focusable = ['a[href]', 'area[href]', 'input', 'select', 'textarea', 'button', 'iframe', 'object', 'embed', '[tabindex]', '[contenteditable]'];

// Extend original api defaults
$.extend(TRUE, QTIP.defaults, {
	show: {
		modal: {
			on: FALSE,
			effect: TRUE,
			blur: TRUE,
			stealfocus: TRUE,
			escape: TRUE
		}
	}
});


PLUGINS.viewport = function(api, position, posOptions, targetWidth, targetHeight, elemWidth, elemHeight)
{
	var target = posOptions.target,
		tooltip = api.elements.tooltip,
		my = posOptions.my,
		at = posOptions.at,
		adjust = posOptions.adjust,
		method = adjust.method.split(' '),
		methodX = method[0],
		methodY = method[1] || method[0],
		viewport = posOptions.viewport,
		container = posOptions.container,
		cache = api.cache,
		tip = api.plugins.tip,
		adjusted = { left: 0, top: 0 },
		fixed, newMy, newClass;

	// If viewport is not a jQuery element, or it's the window/document or no adjustment method is used... return
	if(!viewport.jquery || target[0] === window || target[0] === document.body || adjust.method === 'none') {
		return adjusted;
	}

	// Cache our viewport details
	fixed = tooltip.css('position') === 'fixed';
	viewport = {
		elem: viewport,
		height: viewport[ (viewport[0] === window ? 'h' : 'outerH') + 'eight' ](),
		width: viewport[ (viewport[0] === window ? 'w' : 'outerW') + 'idth' ](),
		scrollleft: fixed ? 0 : viewport.scrollLeft(),
		scrolltop: fixed ? 0 : viewport.scrollTop(),
		offset: viewport.offset() || { left: 0, top: 0 }
	};
	container = {
		elem: container,
		scrollLeft: container.scrollLeft(),
		scrollTop: container.scrollTop(),
		offset: container.offset() || { left: 0, top: 0 }
	};

	// Generic calculation method
	function calculate(side, otherSide, type, adjust, side1, side2, lengthName, targetLength, elemLength) {
		var initialPos = position[side1],
			mySide = my[side], atSide = at[side],
			isShift = type === SHIFT,
			viewportScroll = -container.offset[side1] + viewport.offset[side1] + viewport['scroll'+side1],
			myLength = mySide === side1 ? elemLength : mySide === side2 ? -elemLength : -elemLength / 2,
			atLength = atSide === side1 ? targetLength : atSide === side2 ? -targetLength : -targetLength / 2,
			tipLength = tip && tip.size ? tip.size[lengthName] || 0 : 0,
			tipAdjust = tip && tip.corner && tip.corner.precedance === side && !isShift ? tipLength : 0,
			overflow1 = viewportScroll - initialPos + tipAdjust,
			overflow2 = initialPos + elemLength - viewport[lengthName] - viewportScroll + tipAdjust,
			offset = myLength - (my.precedance === side || mySide === my[otherSide] ? atLength : 0) - (atSide === CENTER ? targetLength / 2 : 0);

		// shift
		if(isShift) {
			tipAdjust = tip && tip.corner && tip.corner.precedance === otherSide ? tipLength : 0;
			offset = (mySide === side1 ? 1 : -1) * myLength - tipAdjust;

			// Adjust position but keep it within viewport dimensions
			position[side1] += overflow1 > 0 ? overflow1 : overflow2 > 0 ? -overflow2 : 0;
			position[side1] = Math.max(
				-container.offset[side1] + viewport.offset[side1] + (tipAdjust && tip.corner[side] === CENTER ? tip.offset : 0),
				initialPos - offset,
				Math.min(
					Math.max(-container.offset[side1] + viewport.offset[side1] + viewport[lengthName], initialPos + offset),
					position[side1]
				)
			);
		}

		// flip/flipinvert
		else {
			// Update adjustment amount depending on if using flipinvert or flip
			adjust *= (type === FLIPINVERT ? 2 : 0);

			// Check for overflow on the left/top
			if(overflow1 > 0 && (mySide !== side1 || overflow2 > 0)) {
				position[side1] -= offset + adjust;
				newMy['invert'+side](side1);
			}

			// Check for overflow on the bottom/right
			else if(overflow2 > 0 && (mySide !== side2 || overflow1 > 0)  ) {
				position[side1] -= (mySide === CENTER ? -offset : offset) + adjust;
				newMy['invert'+side](side2);
			}

			// Make sure we haven't made things worse with the adjustment and reset if so
			if(position[side1] < viewportScroll && -position[side1] > overflow2) {
				position[side1] = initialPos; newMy = undefined;
			}
		}

		return position[side1] - initialPos;
	}

	// Set newMy if using flip or flipinvert methods
	if(methodX !== 'shift' || methodY !== 'shift') { newMy = my.clone(); }

	// Adjust position based onviewport and adjustment options
	adjusted = {
		left: methodX !== 'none' ? calculate( X, Y, methodX, adjust.x, LEFT, RIGHT, WIDTH, targetWidth, elemWidth ) : 0,
		top: methodY !== 'none' ? calculate( Y, X, methodY, adjust.y, TOP, BOTTOM, HEIGHT, targetHeight, elemHeight ) : 0
	};

	// Set tooltip position class if it's changed
	if(newMy && cache.lastClass !== (newClass = uitooltip + '-pos-' + newMy.abbrev())) {
		tooltip.removeClass(api.cache.lastClass).addClass( (api.cache.lastClass = newClass) );
	}

	return adjusted;
};
PLUGINS.imagemap = function(api, area, corner, adjustMethod)
{
	if(!area.jquery) { area = $(area); }

	var cache = (api.cache.areas = {}),
		shape = (area[0].shape || area.attr('shape')).toLowerCase(),
		coordsString = area[0].coords || area.attr('coords'),
		baseCoords = coordsString.split(','),
		coords = [],
		image = $('img[usemap="#'+area.parent('map').attr('name')+'"]'),
		imageOffset = image.offset(),
		result = {
			width: 0, height: 0,
			position: {
				top: 1e10, right: 0,
				bottom: 0, left: 1e10
			}
		},
		i = 0, next = 0, dimensions;

	// POLY area coordinate calculator
	//	Special thanks to Ed Cradock for helping out with this.
	//	Uses a binary search algorithm to find suitable coordinates.
	function polyCoordinates(result, coords, corner)
	{
		var i = 0,
			compareX = 1, compareY = 1,
			realX = 0, realY = 0,
			newWidth = result.width,
			newHeight = result.height;

		// Use a binary search algorithm to locate most suitable coordinate (hopefully)
		while(newWidth > 0 && newHeight > 0 && compareX > 0 && compareY > 0)
		{
			newWidth = Math.floor(newWidth / 2);
			newHeight = Math.floor(newHeight / 2);

			if(corner.x === LEFT){ compareX = newWidth; }
			else if(corner.x === RIGHT){ compareX = result.width - newWidth; }
			else{ compareX += Math.floor(newWidth / 2); }

			if(corner.y === TOP){ compareY = newHeight; }
			else if(corner.y === BOTTOM){ compareY = result.height - newHeight; }
			else{ compareY += Math.floor(newHeight / 2); }

			i = coords.length; while(i--)
			{
				if(coords.length < 2){ break; }

				realX = coords[i][0] - result.position.left;
				realY = coords[i][1] - result.position.top;

				if((corner.x === LEFT && realX >= compareX) ||
				(corner.x === RIGHT && realX <= compareX) ||
				(corner.x === CENTER && (realX < compareX || realX > (result.width - compareX))) ||
				(corner.y === TOP && realY >= compareY) ||
				(corner.y === BOTTOM && realY <= compareY) ||
				(corner.y === CENTER && (realY < compareY || realY > (result.height - compareY)))) {
					coords.splice(i, 1);
				}
			}
		}

		return { left: coords[0][0], top: coords[0][1] };
	}

	// Make sure we account for padding and borders on the image
	imageOffset.left += Math.ceil((image.outerWidth() - image.width()) / 2);
	imageOffset.top += Math.ceil((image.outerHeight() - image.height()) / 2);

	// Parse coordinates into proper array
	if(shape === 'poly') {
		i = baseCoords.length; while(i--)
		{
			next = [ parseInt(baseCoords[--i], 10), parseInt(baseCoords[i+1], 10) ];

			if(next[0] > result.position.right){ result.position.right = next[0]; }
			if(next[0] < result.position.left){ result.position.left = next[0]; }
			if(next[1] > result.position.bottom){ result.position.bottom = next[1]; }
			if(next[1] < result.position.top){ result.position.top = next[1]; }

			coords.push(next);
		}
	}
	else {
		i = -1; while(i++ < baseCoords.length) {
			coords.push( parseInt(baseCoords[i], 10) );
		}
	}

	// Calculate details
	switch(shape)
	{
		case 'rect':
			result = {
				width: Math.abs(coords[2] - coords[0]),
				height: Math.abs(coords[3] - coords[1]),
				position: {
					left: Math.min(coords[0], coords[2]),
					top: Math.min(coords[1], coords[3])
				}
			};
		break;

		case 'circle':
			result = {
				width: coords[2] + 2,
				height: coords[2] + 2,
				position: { left: coords[0], top: coords[1] }
			};
		break;

		case 'poly':
			result.width = Math.abs(result.position.right - result.position.left);
			result.height = Math.abs(result.position.bottom - result.position.top);

			if(corner.abbrev() === 'c') {
				result.position = {
					left: result.position.left + (result.width / 2),
					top: result.position.top + (result.height / 2)
				};
			}
			else {
				// Calculate if we can't find a cached value
				if(!cache[corner+coordsString]) {
					result.position = polyCoordinates(result, coords.slice(), corner);

					// If flip adjustment is enabled, also calculate the closest opposite point
					if(adjustMethod && (adjustMethod[0] === 'flip' || adjustMethod[1] === 'flip')) {
						result.offset = polyCoordinates(result, coords.slice(), {
							x: corner.x === LEFT ? RIGHT : corner.x === RIGHT ? LEFT : CENTER,
							y: corner.y === TOP ? BOTTOM : corner.y === BOTTOM ? TOP : CENTER
						});

						result.offset.left -= result.position.left;
						result.offset.top -= result.position.top;
					}

					// Store the result
					cache[corner+coordsString] = result;
				}

				// Grab the cached result
				result = cache[corner+coordsString];
			}

			result.width = result.height = 0;
		break;
	}

	// Add image position to offset coordinates
	result.position.left += imageOffset.left;
	result.position.top += imageOffset.top;

	return result;
};


/* 
 * BGIFrame adaption (http://plugins.jquery.com/project/bgiframe)
 * Special thanks to Brandon Aaron
 */
function BGIFrame(api)
{
	var self = this,
		elems = api.elements,
		tooltip = elems.tooltip,
		namespace = '.bgiframe-' + api.id;

	$.extend(self, {
		init: function()
		{
			// Create the BGIFrame element
			elems.bgiframe = $('<iframe class="ui-tooltip-bgiframe" frameborder="0" tabindex="-1" src="javascript:\'\';" ' +
				' style="display:block; position:absolute; z-index:-1; filter:alpha(opacity=0); ' +
					'-ms-filter:"progid:DXImageTransform.Microsoft.Alpha(Opacity=0)";"></iframe>');

			// Append the new element to the tooltip
			elems.bgiframe.appendTo(tooltip);

			// Update BGIFrame on tooltip move
			tooltip.bind('tooltipmove'+namespace, self.adjust);
		},

		adjust: function()
		{
			var dimensions = api.get('dimensions'), // Determine current tooltip dimensions
				plugin = api.plugins.tip,
				tip = elems.tip,
				tipAdjust, offset;

			// Adjust border offset
			offset = parseInt(tooltip.css('border-left-width'), 10) || 0;
			offset = { left: -offset, top: -offset };

			// Adjust for tips plugin
			if(plugin && tip) {
				tipAdjust = (plugin.corner.precedance === 'x') ? ['width', 'left'] : ['height', 'top'];
				offset[ tipAdjust[1] ] -= tip[ tipAdjust[0] ]();
			}

			// Update bgiframe
			elems.bgiframe.css(offset).css(dimensions);
		},

		destroy: function()
		{
			// Remove iframe
			elems.bgiframe.remove();

			// Remove bound events
			tooltip.unbind(namespace);
		}
	});

	self.init();
}

PLUGINS.bgiframe = function(api)
{
	var browser = $.browser,
		self = api.plugins.bgiframe;
	
		// Proceed only if the browser is IE6 and offending elements are present
		if($('select, object').length < 1 || !(browser.msie && (''+browser.version).charAt(0) === '6')) {
		return FALSE;
	}

	return 'object' === typeof self ? self : (api.plugins.bgiframe = new BGIFrame(api));
};

// Plugin needs to be initialized on render
PLUGINS.bgiframe.initialize = 'render';



}));
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

if (!ice.ace.Tooltips) ice.ace.Tooltips = {};
if (!ice.ace.DelegateTooltips) ice.ace.DelegateTooltips = {};
/*
 *  Tooltip Widget
 */
ice.ace.Tooltip = function(id, cfg) {
    var callee = arguments.callee, prevTooltip = callee[id];
    if (prevTooltip) {
         prevTooltip.jq.qtip("destroy");
    }
	this.cfg = cfg;
	this.target = "";

    if (this.cfg.behaviors === undefined)
        this.cfg.behaviors = {};

	if(this.cfg.global) {
		this.target = "*[title]";
	}else {
		if (this.cfg.forDelegate) {
			this.target = ice.ace.escapeClientId(this.cfg.forDelegate);
		} else if (this.cfg.forComponent) {
			this.target = ice.ace.escapeClientId(this.cfg.forComponent);
		} else if (this.cfg.forComponents) {
			var arr = this.cfg.forComponents;
			for (var i = 0; i < arr.length; i++) {
				arr[i] = ice.ace.escapeClientId(arr[i]);
			}
			this.target = arr.join(', ');
		}
	}

    this.jq = ice.ace.jq(this.target);
    if (this.jq.length <= 0) {
        return;
    }
	
	var styleClasses = 'ui-widget-content ice-ace-tooltip ui-corner-all';
	var showTip = false;
    if (this.cfg.speechBubble) {
		styleClasses += ' ice-ace-speechbubble'
		showTip = true;
    }
	styleClasses += ' ' + this.cfg.styleClass;
	this.cfg.style = {widget:true, tip:{corner:showTip, width:12, height:12}};
	var inlineStyle = this.cfg.inlineStyle;
	
	var self = this;
	var events = {};
	events.render = function(event, api) {
		var jqTooltip = api.elements.tooltip;
		jqTooltip.addClass(styleClasses);
		var nodeStyle = jqTooltip.attr('style');
		jqTooltip.attr('style', nodeStyle + ';' + inlineStyle);
	};
	events.show = function() { if (!ice.ace.Tooltips[self.cfg.id] && (self.cfg.displayListener || self.cfg.behaviors.display)) { ice.ace.Tooltips[self.cfg.id] = true; self.triggerDisplayListener(); }};
	events.hide = function() { delete ice.ace.Tooltips[self.cfg.id] };
	this.cfg.events = events;
	
	if (ice.ace.jq.browser.msie) {
		var content = ice.ace.jq(ice.ace.escapeClientId(this.cfg.id+'_content'));
		var contentStyle = content.attr('style');
		contentStyle = typeof contentStyle == 'undefined'? '': contentStyle;
		content.css('left', -10000);
		content.attr('style', contentStyle + ' display: block !important;');
		content.find('img').each(function(i,e) {
			var self = ice.ace.jq(e);;
			var width = self.width();
			var height = self.height();
			e.width = width;
			e.height = height;
		});
		content.attr('style', contentStyle);
	}
	
	if (!this.cfg.forDelegate) {
		this.jq.qtip(this.cfg);
	} else {
		delete self.cfg.events.show; delete self.cfg.events.hide; // will call them manually
		ice.ace.DelegateTooltips[self.cfg.id] = {};
		var delegateNode = this.jq.children().get(0);
		this.jq.delegate('*', this.cfg.show.event, function(event) {
			// 'this' in this scope refers to the current DOM node in the event bubble
			if (this === delegateNode) { // event bubbled to the highest point, we can now begin
				var findTargetComponent = function(node) {
					if (node) {
						if (node.id && ice.ace.Tooltip.endsWith(node.id, self.cfg.forComponent)) {
							return node.id;
						} else {
							return findTargetComponent(node.parentNode);
						}
					}
					return '';
				}
				var targetComponent = findTargetComponent(event.target);
				if (targetComponent) {
					var instanceId = ice.ace.escapeClientId(targetComponent);
					var jqTargetComponent = ice.ace.jq(instanceId);
					var cfg = ice.ace.jq.extend({}, self.cfg);
					cfg.events.hide = function() { delete ice.ace.DelegateTooltips[self.cfg.id][instanceId]; };
					jqTargetComponent.qtip(cfg);
					var openInstances = ice.ace.DelegateTooltips[self.cfg.id];
					for (var id in openInstances) {
						openInstances[id].qtip('hide');
					}
					ice.ace.DelegateTooltips[self.cfg.id][instanceId] = jqTargetComponent;
					self.activeComponent = targetComponent;
					self.currentTooltip = instanceId;
					self.triggerDisplayListener( function() { var instance = ice.ace.DelegateTooltips[self.cfg.id][instanceId]; if (instance && self.currentTooltip == instanceId) instance.qtip('show'); }); 
					self.activeComponent = '';
				}
			}
		});
	}
    callee[id] = this;
};

ice.ace.Tooltip.prototype.triggerDisplayListener = function(callback) {
	var formId = this.jq.parents('form:first').attr('id'),
	    options = {
		source: this.cfg.id,
		execute: this.cfg.id,
		formId: formId,
		async: true
	};

	if (callback) {
		options.onsuccess = callback;
	}
	var params = {};
	if (this.cfg.displayListener) {
		params[this.cfg.id + '_displayListener'] = true;
	}
	if (this.activeComponent) {
		params[this.cfg.id + '_activeComponent'] = this.activeComponent;
	}

	options.params = params;

    var behavior = this.cfg && this.cfg.behaviors && this.cfg.behaviors.display;
    if (behavior) {
        ice.ace.ab(ice.ace.extendAjaxArgs(
                behavior,
                ice.ace.clearExecRender(options)
        ));
    } else ice.ace.AjaxRequest(options);
};

ice.ace.Tooltip.endsWith = function(str, suffix) {
    return str.indexOf(suffix, str.length - suffix.length) !== -1;
};
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

/**
 *  gMap Widget
 */
ice.ace.gMap = function (id, cfg) {
    this.id = id;
    this.cfg = cfg;
    this.jqId = ice.ace.escapeClientId(id);
    this.jq = ice.ace.jq(this.jqId + '_gMap');
    this.stateHolder = ice.ace.jq(this.jqId + '_active');
    var _self = this;

    //Create gMap
    this.jq.gMap(this.cfg);

    if (this.cfg.dynamic && this.cfg.cache) {
        this.markAsLoaded(this.jq.children('div').get(this.cfg.active));
    }
}

if (!GMapRepository) var GMapRepository = new Array();


function GMapWrapper(eleId, realGMap) {
    this.eleId = eleId;
    this.realGMap = realGMap;
    this.overlays = new Object();
    this.markers = new Object();
    this.freeWindows = new Object();
    this.infoWindows = new Object();
    this.directions = new Object();
    var options = "";
    this.services = new Object();
	this.events = new Object();
    this.layer = {};
    this.getElementId = ice.ace.gMap.getElementId;
    this.getRealGMap = ice.ace.gMap.getRealGMap;
}
ice.ace.gMap.getElementId = function () {
    return this.eleId;
}

ice.ace.gMap.getRealGMap = function () {
    return this.realGMap;
}

ice.ace.gMap.getGMapWrapper = function (id) {
    var gmapWrapper = GMapRepository[id];
    if (gmapWrapper) {
        var gmapComp = document.getElementById(id);
        //the googlemap view must be unrendered, however
        //javascript object still exist, so recreate the googlemap
        //with its old state.
        if (!gmapComp.hasChildNodes()) {
            gmapWrapper = ice.ace.gMap.recreate(id, gmapWrapper);
        }
    } else {
        //googleMap not found create a fresh new googleMap object
        gmapWrapper = ice.ace.gMap.create(id);
    }
    return gmapWrapper;
}

    ice.ace.gMap.addMapLayer = function (ele, layerId, layerType, sentOptions, url) {
        var gmapWrapper = ice.ace.gMap.getGMapWrapper(ele);
        var layer = gmapWrapper.layer;
        if (sentOptions == "Skip")
            var options = "";
        else
            var options = sentOptions;
        switch (layerType.toLowerCase()) {
            case "bicycling":
            case "bicyclinglayer":
            case "bicycle":
                layer[layerId] = new google.maps.BicyclingLayer();
                layer[layerId].setMap(gmapWrapper.getRealGMap());
                break;
            case "fusion":
            case "fusiontable":
            case "fusiontables":
                //This is still in it's experimental stage, and I can't get access to the API to make my own fusion table yet. (Google Trusted Testers Only)
                //So I cannot verify if it works. Double check when Fusion Tables is properly released.
                var markerOps = "({" + options + "})";
                layer[layerId] = new google.maps.FusionTablesLayer(eval(options));
                layer[layerId].setMap(gmapWrapper.getRealGMap());
                break;
            case "kml":
            case "kmllayer":
                var markerOps = "({" + options + "})";
                layer[layerId] = new google.maps.KmlLayer(url, eval(options));
                layer[layerId].setMap(gmapWrapper.getRealGMap());
                break;
            case "traffic":
            case "trafficlayer":
                layer[layerId] = new google.maps.TrafficLayer();
                layer[layerId].setMap(gmapWrapper.getRealGMap());
                break;
            case "transit":
            case "transitlayer":
                layer[layerId] = new google.maps.TransitLayer();
                layer[layerId].setMap(gmapWrapper.getRealGMap());
                break;
            default:
                console.log("ERROR: Not a valid layer type");
                return;
        }//switch
    }

    ice.ace.gMap.removeMapLayer = function (ele, layerId) {
        var gmapWrapper = ice.ace.gMap.getGMapWrapper(ele);
        var layer = gmapWrapper.layer[layerId];
        if (layer) {
            layer.setMap(null);
        }
    }

    ice.ace.gMap.locateAddress = function (clientId, address) {

        var geocoder = new google.maps.Geocoder();
        geocoder.geocode({'address':address}, function (results, status) {
            if (status == google.maps.GeocoderStatus.OK) {
                var map = ice.ace.gMap.getGMapWrapper(clientId).getRealGMap();
                map.setCenter(new google.maps.LatLng(results[0].geometry.location.lat(),results[0].geometry.location.lng()));
            } else {
				var message;
				if (status == 'ERROR') message = 'There was a problem contacting the Google servers.';
				else if (status == 'INVALID_REQUEST') message = 'This GeocoderRequest was invalid.';
				else if (status == 'OVER_QUERY_LIMIT') message = 'The webpage has gone over the requests limit in too short a period of time.';
				else if (status == 'REQUEST_DENIED') message = 'The webpage is not allowed to use the geocoder.';
				else if (status == 'ZERO_RESULTS') message = 'No result was found for this GeocoderRequest.';
				else message = 'A geocoding request could not be processed due to a server error. The request may succeed if you try again.'; // UNKNOWN_ERROR
                alert("GMaps Geocode was not successful for the following reason: " + message);
            }
        });

    }
	
	ice.ace.gMap.replaceAddDomListener = function() {
		ice.ace.gMap.original_addDomListener = google.maps.event.addDomListener;
		google.maps.event.addDomListener = function(instance, eventName, handler, capture) {
			var eventListener = ice.ace.gMap.original_addDomListener.call(google.maps.event, instance, eventName, handler, capture);
			if (instance == window && eventName == 'resize') {
				google.maps.event.removeListener(eventListener);
				if (!ice.ace.gMap.windowResizeListener) {
					ice.ace.gMap.windowResizeListener = 
						ice.ace.gMap.original_addDomListener.call(google.maps.event, window, 'resize', ice.ace.gMap.windowResizeHandler);
				}
			}
			return eventListener;
		};
	};
	
	ice.ace.gMap.windowResizeHandler = function() {
		for (var mapKey in GMapRepository) {
			var map = GMapRepository[mapKey];
			if (map) google.maps.event.trigger(map, 'resize');
		}
	};

    ice.ace.gMap.create = function (ele, lat, lng, zoom, type) {
		// replace addDomListener here, because the events code is lazily loaded by google
		if (!ice.ace.gMap.original_addDomListener) ice.ace.gMap.replaceAddDomListener();
		
        if(lat == undefined && lng == undefined)
            var gmapWrapper = new GMapWrapper(ele, new google.maps.Map(document.getElementById(ele), {mapTypeId:google.maps.MapTypeId.ROADMAP, zoom:5, center: new google.maps.LatLng(0,0)}));
        else
            var gmapWrapper = new GMapWrapper(ele, new google.maps.Map(document.getElementById(ele), {mapTypeId:type, zoom:zoom, center: new google.maps.LatLng(lat,lng)}));
        var hiddenField = document.getElementById(ele);
        var mapTypedRegistered = false;
        var map = gmapWrapper.getRealGMap();
        google.maps.event.addDomListener(map,"center_changed",function(){
			var lat = document.getElementById(ele+"_lat");
            if (lat) lat.value = map.getCenter().lat();
			var lng = document.getElementById(ele+"_lng");
            if (lng) lng.value = map.getCenter().lng();
        });
        google.maps.event.addDomListener(map,"zoom_changed",function(){
            var zoom = document.getElementById(ele+"_zoom");
			if (zoom) zoom.value = map.getZoom();
        });
        google.maps.event.addDomListener(map,"maptypeid_changed",function(){
            var type = document.getElementById(ele+"_type");
			if (type) type.value = map.getMapTypeId();
        });
		var previousVisible = ice.ace.jq(map.getDiv()).is(':visible');
		gmapWrapper.poll = window.setInterval(function() {
			var currentVisible = ice.ace.jq(map.getDiv()).is(':visible');
			if (!previousVisible && currentVisible) {
				google.maps.event.trigger(map, 'resize');
			}
			previousVisible = currentVisible;
		}, 1000);
        initializing = false;
        GMapRepository[ele] = gmapWrapper;
        return gmapWrapper;
    }

    ice.ace.gMap.recreate = function (ele, gmapWrapper) {
        var map = gmapWrapper.getRealGMap();
        var options = gmapWrapper.options;
        var lat = map.getCenter().lat();
        var lng = map.getCenter().lng();
        var zoom = map.getZoom();
        var type = map.getMapTypeId();
        var markers = gmapWrapper.markers;
        var freeWindows = gmapWrapper.freeWindows;
        var infoWindows = gmapWrapper.infoWindows;
        var overlays = gmapWrapper.overlays;
        var layer = gmapWrapper.layer;
        ice.ace.gMap.remove(ele);
        gmapWrapper = ice.ace.gMap.create(ele,lat,lng,zoom,type);
        map = gmapWrapper.getRealGMap();
        if(options != undefined)
            map.setOptions(eval("({"+options+"})"));
        gmapWrapper.options = options;
        for (marker in markers) {
            if (gmapWrapper.markers[marker] == null) {
                markers[marker].setMap(map);
                gmapWrapper.markers[marker]=markers[marker];
            }
        }
        for (freeWin in freeWindows) {
            if (gmapWrapper.freeWindows[freeWin] == null) {
                freeWindows[freeWin].open(map);
                gmapWrapper.freeWindows[freeWin]=freeWindows[freeWin];
            }
        }
        for (win in infoWindows) {

            if (gmapWrapper.infoWindows[win] == null) {
                gmapWrapper.infoWindows[win]=infoWindows[win];
            }

        }
        for (overlay in overlays){
            if (gmapWrapper.overlays[overlay] == null){
                overlays[overlay].setMap(map);
                gmapWrapper.overlays[overlay]=overlays[overlay];
            }
        }
        if(layer!=null)
        {
			for (var l in layer) {
				layer[l].setMap(map);
			}
            gmapWrapper.layer=layer;
        }
        return gmapWrapper;
    }

    ice.ace.gMap.remove = function (ele) {
        var newRepository = new Array();
        for (map in GMapRepository) {
            if (map != ele) {
                newRepository[map] = GMapRepository[map];
            }
            else{
                var divParent = document.getElementById(ele).parentNode;
                var styleClass = document.getElementById(ele).getAttribute('class');
                var style = document.getElementById(ele).getAttribute('style');
                var mapDiv = document.getElementById(ele);
                mapDiv.parentNode.removeChild(mapDiv);
                var div = document.createElement("div");
                div.setAttribute("class",styleClass);
                div.setAttribute("style",style);
                div.setAttribute('id',ele);
                divParent.appendChild(div);
            }
        }
        GMapRepository = newRepository;
    }

    ice.ace.gMap.addMarker = function (ele, markerID, Lat, Lon, options) {
        var wrapper = ice.ace.gMap.getGMapWrapper(ele);
        var marker = wrapper.markers[markerID];
        if (marker == null || marker.getMap() == null) {
            if (options != null)
                var markerOps = "({map:wrapper.getRealGMap(), position: new google.maps.LatLng(" + Lat + "," + Lon + "), " + options + "});";
            else
                var markerOps = "({map:wrapper.getRealGMap(), position: new google.maps.LatLng(" + Lat + "," + Lon + ")});";
            var marker = new google.maps.Marker(eval(markerOps));
            wrapper.markers[markerID] = marker;
        }
    }

    ice.ace.gMap.removeMarker = function (ele, markerId) {
        var gmapWrapper = ice.ace.gMap.getGMapWrapper(ele);
        var marker = gmapWrapper.markers[markerId];
        if (marker != null) {
            marker.setMap(null);
        } else {
            //nothing found just return
            return;
        }
        var newMarkerArray = new Object();
        for (markerObj in gmapWrapper.markers) {
            if (marker != markerObj) {
                newMarkerArray[markerObj] = gmapWrapper.markers[markerObj];
            }
        }
        gmapWrapper.markers = newMarkerArray;
    }

    ice.ace.gMap.animateMarker = function (ele, markerId, animation) {
        var gmapWrapper = ice.ace.gMap.getGMapWrapper(ele);
        var marker = gmapWrapper.markers[markerId];
        if(animation=="none")
            marker.setOptions({animation:null});
        else if(animation.toLowerCase()=="bounce")
            marker.setOptions({animation:google.maps.Animation.BOUNCE});
        else if(animation.toLowerCase()=="drop")
            marker.setOptions({animation:google.maps.Animation.DROP});
        else
            alert("Invalid Animation Type");
    }

    ice.ace.gMap.addOptions = function (ele, options) {
        var map = ice.ace.gMap.getGMapWrapper(ele).getRealGMap();
        ice.ace.gMap.getGMapWrapper(ele).options = options;
        var fullOps = "({" + options + "})";
        map.setOptions(eval(fullOps));
    }

    ice.ace.gMap.addAutoComplete = function(mapId, autoId, windowOptions, offset, windowRender,focus){

        var input = ice.ace.jq(ice.ace.escapeClientId(autoId)).children().get(0);
		if (focus) {
			if (input.createTextRange) { // IE
				input.focus();
				if (input.value.length > 0) {
					var fieldRange = input.createTextRange();  
					fieldRange.moveStart('character', input.value.length);  
					fieldRange.collapse(false);  
					fieldRange.select();
				}
			}
			else {
				input.focus();
				var length = input.value.length;  
				input.setSelectionRange(length, length);  
			}
		}
		var init = function() {
			ice.ace.jq(input).off('keypress').on('keypress', function(e) {if (e.keyCode == 13 || e.which == 13) return false;});
			var autocomplete = new google.maps.places.Autocomplete(input);
			var map = ice.ace.gMap.getGMapWrapper(mapId).getRealGMap();
			if(windowRender){
			var infowindow = new google.maps.InfoWindow();
			var marker = new google.maps.Marker({
				map: map
			});
			}
			var splitOffset = offset.split(",");
			var xOffset = splitOffset[0];
			var yOffset = splitOffset[1];
			google.maps.event.addListener(autocomplete, 'place_changed', function() {
				var place = autocomplete.getPlace();
				if (place.geometry) {
					if (place.geometry.viewport) {
						map.fitBounds(place.geometry.viewport);
					} else {
						map.setCenter(place.geometry.location);
					}
					map.panBy(eval(xOffset),eval(yOffset));
					if(windowRender){
					marker.setPosition(place.geometry.location);
					infowindow.setContent("<a href='"+place.url+"' target='_blank'>" + place.formatted_address + "</a>");
					if(windowOptions!=null&&windowOptions!="none")
						infowindow.setOptions(eval("({" + windowOptions + "})"));
					infowindow.open(map,marker);
					}
					document.getElementById(autoId+"_latLng").value = place.geometry.location.toString();
					document.getElementById(autoId+"_address").value = place.formatted_address;
					document.getElementById(autoId+"_types").value = place.types.toString();
					document.getElementById(autoId+"_url").value = place.url;
					ice.se(null,autoId);
				} else {
					var geocoder = new google.maps.Geocoder();
					geocoder.geocode({'address': place.name}, function (results, status) {
						if (status == google.maps.GeocoderStatus.OK) {
							var result = results[0];
							if (result.geometry.viewport) {
								map.fitBounds(result.geometry.viewport);
							} else {
								map.setCenter(result.geometry.location);
							}
							input.value = result.formatted_address;
							
							var url = 'https://maps.google.com/maps/place?q=' + encodeURIComponent(result.formatted_address);
							map.panBy(eval(xOffset),eval(yOffset));
							if(windowRender){
								marker.setPosition(result.geometry.location);
								infowindow.setContent("<a href='"+url+"' target='_blank'>" + result.formatted_address + "</a>");
								if(windowOptions!=null&&windowOptions!="none")
									infowindow.setOptions(eval("({" + windowOptions + "})"));
								infowindow.open(map,marker);
							}
							
							document.getElementById(autoId+"_latLng").value = result.geometry.location.toString();
							document.getElementById(autoId+"_address").value = result.formatted_address;
							document.getElementById(autoId+"_types").value = result.types.toString();
							document.getElementById(autoId+"_url").value = url;
							ice.se(null,autoId);
						}
					});
				}
			});
		}
		if (focus) {
			setTimeout(init, 100);
		} else {
			init();
		}
    }

    ice.ace.gMap.addControl = function (ele, name, givenPosition, style) {
        var wrapper = ice.ace.gMap.getGMapWrapper(ele);
        var map = wrapper.getRealGMap();
        var option;
        if (name == "all")
            option = "disableDefaultUI:false";
        else {
            control = ice.ace.gMap.nameToControl(name);
            if (givenPosition != "none" || style != "none") {
                i
                if (givenPosition != "none" && style == "none") {
                    var position = ice.ace.gMap.textToPosition(givenPosition);
                    option = control + ":true," + control + "Options:{position:" + position + "}";
                }
                else if (givenPosition == "none" && style != "none") {
                    var fullStyle = ice.ace.gMap.textToStyle(name, style);
                    option = control + ":true," + control + "Options:{style:" + fullStyle + "}";
                }
                else if (givenPosition != "none" && style != "none") {
                    var position = ice.ace.gMap.textToPosition(givenPosition);
                    var fullStyle = ice.ace.gMap.textToStyle(name, style);
                    option = control + ":true," + control + "Options:{position:" + position + ", style:" + fullStyle + "}";
                }

            }
            else
                option = control + ":true";
        }
        if(wrapper.options == undefined)
            wrapper.options=option;
        else
            wrapper.options+=", " + option;
        map.setOptions(eval("({"+ option +"})"));
    }

    ice.ace.gMap.removeControl = function (ele, name) {
        var wrapper = ice.ace.gMap.getGMapWrapper(ele);
        var map = wrapper.getRealGMap();
        var option;
        if (name == "all")
            option = "disableDefaultUI:true";
        else {
            control = ice.ace.gMap.nameToControl(name);
            option = control + ":false";
        }
        if(wrapper.options == undefined)
            wrapper.options=option;
        else
            wrapper.options+=", " + option;
        map.setOptions(eval("({"+ option +"})"));
    }

    ice.ace.gMap.nameToControl = function (name) {
        switch (name.toLowerCase()) {
            case "type":
                return "mapTypeControl";
                break;
            case "overview":
                return "overviewMapControl";
                break;
            case "pan":
                return "panControl";
                break;
            case "rotate":
                return "rotateControl";
                break;
            case "scale":
                return "scaleControl";
                break;
            case "streetview":
                return "streetViewControl";
                break;
            case "zoom":
                return "zoomControl";
                break;
        }
    }

    ice.ace.gMap.textToPosition = function (position) {
        switch (position.toLowerCase()) {
            case "bottomcenter":
                return "google.maps.ControlPosition.BOTTOM_CENTER";
                break;
            case "bottomright":
                return "google.maps.ControlPosition.BOTTOM_RIGHT";
                break;
            case "bottomleft":
                return "google.maps.ControlPosition.BOTTOM_LEFT";
                break;
            case "topcenter":
                return "google.maps.ControlPosition.TOP_CENTER";
                break;
            case "topright":
                return "google.maps.ControlPosition.TOP_RIGHT";
                break;
            case "topleft":
                return "google.maps.ControlPosition.TOP_LEFT";
                break;
            case "lefttop":
                return "google.maps.ControlPosition.LEFT_TOP";
                break;
            case "leftcenter":
                return "google.maps.ControlPosition.LEFT_CENTER";
                break;
            case "leftbottom":
                return "google.maps.ControlPosition.LEFT_BOTTOM";
                break;
            case "righttop":
                return "google.maps.ControlPosition.RIGHT_TOP";
                break;
            case "rightcenter":
                return "google.maps.ControlPosition.RIGHT_CENTER";
                break;
            case "rightbottom":
                return "google.maps.ControlPosition.RIGHT_BOTTOM";
                break;
        }
    }

    ice.ace.gMap.textToStyle = function (rawname, rawstyle) {
        var name = rawname.toLowerCase();
        var style = rawstyle.toLowerCase();
        if (name == "type") {
            if (style == "default")
                return "google.maps.MapTypeControlStyle.DEFAULT";
            else if (style == "dropdown")
                return "google.maps.MapTypeControlStyle.DROPDOWN_MENU";
            else if (style == "bar")
                return "google.maps.MapTypeControlStyle.HORIZONTAL_BAR";
        }
        else if (name == "zoom") {
            if (style == "default")
                return "google.maps.ZoomControlStyle.DEFAULT";
            else if (style == "large")
                return "google.maps.ZoomControlStyle.LARGE";
            else if (style == "small")
                return "google.maps.ZoomControlStyle.SMALL";
        }
    }

    ice.ace.gMap.gService = function (ele, name, locationList, options, div) {
        var wrapper = ice.ace.gMap.getGMapWrapper(ele);
        var map = ice.ace.gMap.getGMapWrapper(ele).getRealGMap();
        var service;
        var points = locationList.split(":");
        switch (name.toLowerCase()) {
            case "direction":
            case "directions":
            case "directionsservice":
                //Required options: travelMode, 2 points/addresses (First=origin, last=dest, others=waypoints
                service = new google.maps.DirectionsService();
                var origin = (points[0].charAt(0) == "(") ? "origin: new google.maps.LatLng" + points[0] + ", " : "origin: \"" + points[0] + "\", ";
                var lastElement = points.length - 1;
                var destination = (points[lastElement].charAt(0) == "(") ? "destination: new google.maps.LatLng" + points[lastElement] + ", " : "destination: \"" + points[lastElement] + "\", ";
                if (points.length >= 3) {
                    var waypoints = [];
                    for (var i = 1; i < points.length - 1; i++) {
                        var point = (points[i].charAt(0) == "(") ? "{location:new google.maps.LatLng" + points[i] + "}" : "{location:\"" + points[i] + "\"}";
                        waypoints[i - 1] = point;
                    }
                    var waypointsString = "waypoints: [" + waypoints + "], ";
                    var request = "({" + origin + destination + waypointsString + options + "})";
                } else {
                    var request = "({" + origin + destination + options + "})";
                }
            function directionsCallback(response, status) {
                if (status != google.maps.DirectionsStatus.OK) {
                    alert('Error was: ' + status);
                } else {
                    var renderer = (wrapper.services[ele] != null) ? wrapper.services[ele] : new google.maps.DirectionsRenderer();
                    renderer.setMap(map);
                    renderer.setDirections(response);
                    renderer.setPanel(document.getElementById(div));
                    wrapper.services[ele] = renderer;
                }
            }

                service.route(eval(request), directionsCallback);
                break;
            case "elevation":
            case "elevationservice":
                service = new google.maps.ElevationService();
                var waypoints = [];
                for (var i = 0; i < points.length; i++) {
                    var point = "new google.maps.LatLng" + points[i];
                    waypoints[i] = point;
                }
                var waypointsString = "locations: [" + waypoints + "]";
                var request = "({" + waypointsString + "})";

            function elevationCallback(response, status) {
                if (status != google.maps.ElevationStatus.OK) {
                    alert('Error was: ' + status);
                } else {
                    for (var i = 0; i < response.length; i++) {
                        alert(response[i].elevation);
                    }
                }
            }

                service.getElevationForLocations(eval(request), elevationCallback);
                break;
            case "maxzoom":
            case "maxzoomservice":
                service = new google.maps.MaxZoomService();
                var point = eval("new google.maps.LatLng" + points[0]);

            function maxZoomCallback(response) {
                if (response.status != google.maps.MaxZoomStatus.OK) {
                    alert('Error occurred in contacting Google servers');
                } else {
                    alert("Max zoom at point is: " + response.zoom);
                }
            }

                service.getMaxZoomAtLatLng(point, maxZoomCallback);
                break;
            case "distance":
            case "distancematrix":
            case "distancematrixservice":
                //Required options: travelMode, 2 points/addresses
                service = new google.maps.DistanceMatrixService();
                var origin = (points[0].charAt(0) == "(") ? "origins: [new google.maps.LatLng" + points[0] + "], " : "origins: [\"" + points[0] + "\"], ";
                var destination = (points[1].charAt(0) == "(") ? "destinations: [new google.maps.LatLng" + points[1] + "], " : "destinations: [\"" + points[1] + "\"], ";
                var request = "({" + origin + destination + options + "})";

            function distanceCallback(response, status) {
                if (status != google.maps.DistanceMatrixStatus.OK) {
                    alert('Error was: ' + status);
                } else {
                    alert("Distance is:" + response.rows[0].elements[0].distance.text + " in " + response.rows[0].elements[0].duration.text);
                }
            }

                service.getDistanceMatrix(eval(request), distanceCallback);
                break;
            default:
                console.log("Not a valid service name");
                return;
        }//switch
    }

    ice.ace.gMap.removeGOverlay = function (ele, overlayID) {
        var wrapper = ice.ace.gMap.getGMapWrapper(ele);
        var overlay = wrapper.overlays[overlayID];
        if (overlay != null) {
            overlay.setMap(null);
        } else {
            //nothing found just return
            return;
        }
        var newOverlayArray = new Object();
        for (overlayObj in wrapper.overlays) {
            if (overlay != overlayObj) {
                newOverlayArray[overlayObj] = wrapper.overlays[overlayObj];
            }
        }
        wrapper.overlays = newOverlayArray;
    }

    ice.ace.gMap.gOverlay = function (ele, overlayID, shape, locationList, options) {
        var wrapper = ice.ace.gMap.getGMapWrapper(ele);
        var map = ice.ace.gMap.getGMapWrapper(ele).getRealGMap();
        var overlay;
        var points = locationList.split(":");
        for (var i = 0; i < points.length; i++) {
            points[i] = "new google.maps.LatLng" + points[i] + "";
        }
        switch (shape.toLowerCase()) {
            case "line":
            case "polyline":
                var overlayOptions = (options != null && options.length > 0) ? "({map:map, path:[" + points + "], " + options + "})" : "({map:map, path:[" + points + "]})";
                overlay = new google.maps.Polyline(eval(overlayOptions));
                break;
            case "polygon":
                var overlayOptions = (options != null && options.length > 0) ? "({map:map, paths:[" + points + "], " + options + "})" : "({map:map, paths:[" + points + "]})";
                overlay = new google.maps.Polygon(eval(overlayOptions));
                break;
            case "rectangle":
                //needs SW corner in first point, NE in second
                var overlayOptions = (options != null && options.length > 0) ? "({map:map, bounds:new google.maps.LatLngBounds(" + points[0] +
                    "," + points[1] + "), " + options + "})" : "({map:map, bounds:new google.maps.LatLngBounds(" + points[0] + "," + points[1] + ")})";
                overlay = new google.maps.Rectangle(eval(overlayOptions));
                break;
            case "circle":
                //Requires radius option
                var overlayOptions = (options != null && options.length > 0) ? "({map:map, center: " + points[0] + ", " + options + "})" : "({map:map, center: " + points[0] + "})";
                overlay = new google.maps.Circle(eval(overlayOptions));
                break;
            default:
                console.log("Not a valid shape");
                return;
        }//switch
        ice.ace.gMap.getGMapWrapper(ele).overlays[overlayID] = overlay;
    }

    ice.ace.gMap.addGWindow = function (ele, winId, content, position,options,markerId,showOnClick,startOpen) {
        var wrapper = ice.ace.gMap.getGMapWrapper(ele);
        var map = ice.ace.gMap.getGMapWrapper(ele).getRealGMap();
        var win = wrapper.infoWindows[winId];
        if (win != null)
            win.close();
        win = new google.maps.InfoWindow();
        win.setPosition(position);
        win.setContent(content);
        if (options != "none")
        {
            win.setOptions(eval("({" + options + "})"));
        }
        if (markerId != "none")
        {
            var marker = wrapper.markers[markerId];
            if(showOnClick)
            {
              google.maps.event.addDomListener(marker,"click",function(){
                  var map = ice.ace.gMap.getGMapWrapper(ele).getRealGMap();
                  win.open(map,marker);
              });
              if(startOpen)
                  win.open(map,marker);
            }
            else
                win.open(map,marker);
        }
        else
        {
            win.open(map);
            ice.ace.gMap.getGMapWrapper(ele).freeWindows[winId]=win;
        }
		google.maps.event.addDomListener(win,"closeclick",function(){
			ice.ace.gMap.removeGWindow(ele,winId)
		});
        ice.ace.gMap.getGMapWrapper(ele).infoWindows[winId]=win;
    }

    ice.ace.gMap.removeGWindow = function(mapId,winId){
        var wrapper = ice.ace.gMap.getGMapWrapper(mapId);
        var win = wrapper.infoWindows[winId];
        if(win!=null)
            win.close();
        else
            return;
        var newWindowArray = new Object();
        delete(wrapper.infoWindows[winId]);
        var newFreeWindowArray = new Object();
        if(wrapper.freeWindows[winId]!=null)
            delete(wrapper.freeWindows[winId]);
    }

    ice.ace.gMap.setMapType = function (ele, type) {
        var gmapWrapper = ice.ace.gMap.getGMapWrapper(ele);
        if (type == "MAP")
            type = "ROADMAP";
        if (gmapWrapper.getRealGMap().getMapTypeId() != null) {
            switch (type) {
                case "SATELLITE":
                    gmapWrapper.getRealGMap().setMapTypeId(google.maps.MapTypeId.SATELLITE);
                    break;
                case "HYBRID":
                    gmapWrapper.getRealGMap().setMapTypeId(google.maps.MapTypeId.HYBRID);
                    break;
                case "ROADMAP":
                    gmapWrapper.getRealGMap().setMapTypeId(google.maps.MapTypeId.ROADMAP);
                    break;
                case "TERRAIN":
                    gmapWrapper.getRealGMap().setMapTypeId(google.maps.MapTypeId.TERRAIN);
                    break;
            }
        }
    }

    ice.ace.gMap.addEvent = function (mapId,parentId,eventId,parentName,eventType,rendererType,script){
        var wrapper = ice.ace.gMap.getGMapWrapper(mapId);

        var componentToUse;
        var parent;
        //TODO: Update Autocomplete to work with this.
        if (parentName.indexOf("gmap.GMapAutocomplete") != -1){
            parent = wrapper.infoWindows[parentId];
            componentToUse = "ice.ace.gMap.getGMapWrapper('" + mapId + "').infoWindows['"+parentId+"']";
        }
        else if (parentName.indexOf("gmap.GMapInfoWindow") != -1){
            parent = wrapper.infoWindows[parentId];
            componentToUse = "ice.ace.gMap.getGMapWrapper('" + mapId + "').infoWindows['"+parentId+"']";
        }
        else if (parentName.indexOf("gmap.GMapLayer") != -1){
            parent = wrapper.layer;
            componentToUse = "ice.ace.gMap.getGMapWrapper('" + mapId + "').layer";
        }
        else if (parentName.indexOf("gmap.GMapMarker") != -1){
            parent = wrapper.markers[parentId];
            componentToUse = "ice.ace.gMap.getGMapWrapper('" + mapId + "').markers['"+parentId+"']";
        }
        else if (parentName.indexOf("gmap.GMapOverlay") != -1){
            parent = wrapper.overlays[parentId];
            componentToUse = "ice.ace.gMap.getGMapWrapper('" + mapId + "').overlays['"+parentId+"']";
        }
        else if(parentName.indexOf("gmap.GMap") != -1){
            parent = wrapper.getRealGMap();
            componentToUse = "ice.ace.gMap.getGMapWrapper('" + mapId + "').getRealGMap()";
        }
        var event = wrapper.events[eventId];
		if (event) {
			google.maps.event.removeListener(event);
		}
        wrapper.events[eventId] = google.maps.event.addDomListener(parent,eventType,function(){
            var map = eval("ice.ace.gMap.getGMapWrapper('" + mapId + "').getRealGMap()");
            var component = eval(componentToUse);
            eval(script);
        });
    }
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

ice.ace.Tree = function (clientId, cfg) {
    cfg.id = clientId;
    this.cfg = cfg;
    this.jqId = ice.ace.escapeClientId(cfg.id);
    this.element = ice.ace.jq(this.jqId);
    this.behaviors = cfg.behaviors;

    // Selectors
    this.expansionButtonDeselector = this.jqId + " * .if-tree * .if-node-sw, noexp";
    this.selectionTargetDeselector = this.jqId + " * .if-tree * .if-node, noselect";
    this.expansionButtonSelector = ".if-node-sw:not("+this.expansionButtonDeselector+")";
    this.selectionTargetSelector = ".if-node:not("+this.selectionTargetDeselector+")";
    this.nodeWrapperSelector = this.selectionTargetSelector + " > div.if-node-wrp";
    this.sortableTarget = '.if-node-sub';

    // Setup events
    // Expansion
    if (this.cfg.expansion) {
        this.tearDownExpansion();
        this.setupExpansion();
    }

    // Selection
    if (this.cfg.selection) {
        this.tearDownSelection();
        this.setupSelection();
    }

    // Reordering
    if (this.cfg.reorder) {
        this.tearDownReordering();
        this.setupReordering();
    }

    // Cleanup
    if (!window[this.cfg.widgetVar]) {
        var self = this;
        ice.onElementUpdate(cfg.id, function() { self.unload(); });
    }
};

ice.ace.Tree.prototype.unload = function() {
    this.tearDownReordering();
    this.tearDownSelection();
    this.tearDownExpansion();
};

ice.ace.Tree.prototype.tearDownExpansion = function() {
    this.element.off('click', this.expansionButtonSelector);
};

ice.ace.Tree.prototype.setupExpansion = function() {
    var self = this;
    this.element.on('click', this.expansionButtonSelector, function (event) {
        var container = ice.ace.jq(this),
            icon = container.find('> div > span.ui-icon'),
            expanded = icon.is('.ui-icon-minus'),
            node = container.closest('.if-node-cnt');

        if (self.cfg.expansionMode == 'server') {
            if (expanded)
                self.sendNodeContractionRequest(node);
            else
                self.sendNodeExpansionRequest(node);
        } else {
            if (expanded)
                self.doClientContraction(node);
            else
                self.doClientExpansion(node);
        }
    });
};

ice.ace.Tree.prototype.tearDownSelection = function() {
    this.element
            .off('click', this.selectionTargetSelector)
            .off('mouseenter', this.selectionTargetSelector)
            .off('mouseleave', this.selectionTargetSelector);
};

ice.ace.Tree.prototype.setupReordering = function () {
    var self = this;

    this.sortConfig = {
        connectWith:this.sortableTarget,

        receive:function (event, ui) {
            // Prevent bugged double submit
            if (!self.droppedItemSameParent(ui.item)) {
                var newParent = ice.ace.jq(this).closest('.if-node-cnt, .if-tree'),
                source = ice.ace.jq(ui.item),
                index = source.index();
                self.sendReorderingRequest(source, newParent, index);
            }
        },
        update:function (event, ui) {
            if (self.droppedItemSameParent(ui.item)) {
                var parent = ice.ace.jq(ui.item).parent().closest('.if-node-cnt, .if-tree'),
                    source = ice.ace.jq(ui.item);
                    index = source.index();
                self.sendReorderingRequest(source, parent, index, self.cfg.indexIds);
            }
        }
    }
	
	if (this.cfg.handle) this.sortConfig.handle = this.cfg.handle;

    this.element.find(this.sortableTarget).andSelf().sortable(this.sortConfig);
};

ice.ace.Tree.prototype.refreshSort = function(id) {
    ice.ace.jq(ice.ace.escapeClientId(id))
        .closest(this.sortableTarget).not('.ui-sortable').sortable(this.sortConfig);
}
ice.ace.Tree.prototype.rs = ice.ace.Tree.prototype.refreshSort;

ice.ace.Tree.prototype.reindexSiblings = function(source) {
    source.siblings().andSelf().each(function(i, val) {
        var tar = ice.ace.jq(val),
            oldid = tar.attr('id');
        oldid = oldid.substring(0, oldid.lastIndexOf(':'));
        var newid = oldid.substring(0, oldid.lastIndexOf(':')+1) + i;
        tar.attr('id', newid+':-');
        tar.find('*[id]').each(function(i, v) {
            var c = ice.ace.jq(v);
            c.attr('id', c.attr('id').replace(oldid, newid));
        });
    });
};


ice.ace.Tree.prototype.droppedItemSameParent = function(item) {
    var parent = item.parent().closest('.if-node-cnt, .if-tree'),
        parentid = parent.attr('id');

    parentid = parentid.substring(0, parentid.lastIndexOf(':-'));
    var childSize = this.getNodeKey(item).split(':').length - 1;
    var parentSize = parent.is('.if-tree') ? 0
            : this.getNodeKey(parent).split(':').length - 1;

    return item.is("[id^='"+parentid+"']") && (childSize - 1) == parentSize;
}

ice.ace.Tree.prototype.sendReorderingRequest = function(source, parent, index) {
    var options = {
        source:this.cfg.id,
        execute:this.cfg.id,
        render:this.cfg.id
    },
    reorderKey = this.cfg.id+'_reorder',
    params = {};

    params[reorderKey] = this.getNodeKey(source)
            + '>' + this.getNodeKey(parent)
            + '@' + index;

    if (arguments[3])
        this.reindexSiblings(source);

    options.params = params;

    if (this.cfg.behaviors && this.cfg.behaviors['reorder']) {
        ice.ace.ab(ice.ace.extendAjaxArgs(
                this.cfg.behaviors['reorder'],
                ice.ace.clearExecRender(options)
        ));
    } else {
        ice.ace.AjaxRequest(options);
    }
}

ice.ace.Tree.prototype.tearDownReordering = function() {
    this.element.off("mouseover", this.sortableTarget);
    this.element.find(this.sortableTarget).sortable("destroy");
}

ice.ace.Tree.prototype.setupSelection = function() {
    var self = this;
    this.element.on('mouseenter', this.selectionTargetSelector, function(event) {
        var tar = ice.ace.jq(this),
            wrap = tar.find('> div.if-node-wrp'),
            selected = wrap.is('.ui-state-active');

        if (!selected) wrap.addClass('ui-state-hover');
    });

    this.element.on('mouseleave', this.selectionTargetSelector, function(event) {
        var tar = ice.ace.jq(this),
            wrap = tar.find('> div.if-node-wrp');

        wrap.removeClass('ui-state-hover');
    });

    this.element.on('click', this.selectionTargetSelector, function(event) {
        var tar = ice.ace.jq(this),
            wrap = tar.find('> div.if-node-wrp'),
            selected = wrap.is('.ui-state-active'),
            node = tar.closest('.if-node-cnt');

        if (self.cfg.selectionMode == 'server') {
            if (selected)
                self.sendNodeDeselectionRequest(node);
            else
                self.sendNodeSelectionRequest(node);
        } else {
            if (selected)
                self.doClientDeselection(node, wrap);
            else
                self.doClientSelection(node, wrap);
        }
    });
};

ice.ace.Tree.prototype.sendNodeDeselectionRequest = function(node) {
    var options = {
        source:this.cfg.id,
        execute:this.cfg.id,
        render:this.cfg.id
    };

    this.append('deselect', this.getNodeKey(node));

    if (this.cfg.behaviors && this.cfg.behaviors['deselect']) {
        ice.ace.ab(ice.ace.extendAjaxArgs(
                this.cfg.behaviors['deselect'],
                ice.ace.clearExecRender(options)
        ));
    } else {
        ice.ace.AjaxRequest(options);
    }
};

ice.ace.Tree.prototype.sendNodeSelectionRequest = function(node) {
    var options = {
        source:this.cfg.id,
        execute:this.cfg.id,
        render:this.cfg.id
    };

    this.append('select', this.getNodeKey(node));

    if (!this.cfg.multiSelect)
        this.deselectAll();

    if (this.cfg.behaviors && this.cfg.behaviors['select']) {
        ice.ace.ab(ice.ace.extendAjaxArgs(
                this.cfg.behaviors['select'],
                ice.ace.clearExecRender(options)
        ));
    } else {
        ice.ace.AjaxRequest(options);
    }
};

ice.ace.Tree.prototype.doClientDeselection = function(node, wrap) {
    var key = this.getNodeKey(node);

    wrap.removeClass('ui-state-active');

    this.append('deselect', key);
    this.remove('select', key);
};

ice.ace.Tree.prototype.doClientSelection = function(node, wrap) {
    var key = this.getNodeKey(node);

    if (!this.cfg.multiSelect)
        this.deselectAll();

    wrap.addClass('ui-state-active');

    this.append('select', key);
    this.remove('deselect', key);
};

ice.ace.Tree.prototype.doClientContraction = function(node) {
    var key = this.getNodeKey(node),
        icon = node.find(' > tbody > tr > td.if-node-sw > div > span.ui-icon'),
        sub = node.find(' > tbody > tr > td.if-node-sub');

    icon.removeClass('ui-icon-minus');
    icon.addClass('ui-icon-plus')

    sub.css('display', 'none');

    this.append('contract', key);
    this.remove('expand', key);
};

ice.ace.Tree.prototype.doClientExpansion = function(node) {
    var key = this.getNodeKey(node),
        icon = node.find('  > tbody > tr > td.if-node-sw > div  > span.ui-icon'),
        sub = node.find('  > tbody > tr > td.if-node-sub');

    icon.removeClass('ui-icon-plus');
    icon.addClass('ui-icon-minus')

    sub.css('display', 'block');

    this.append('expand', key);
    this.remove('contract', key);
};

ice.ace.Tree.prototype.sendNodeContractionRequest = function(node) {
    var options = {
        source:this.cfg.id,
        execute:this.cfg.id,
        render:this.cfg.id
    };

    this.append('contract', this.getNodeKey(node));

    if (this.cfg.behaviors && this.cfg.behaviors['contract']) {
        ice.ace.ab(ice.ace.extendAjaxArgs(
                this.cfg.behaviors['contract'],
                ice.ace.clearExecRender(options)
        ));
    } else {
        ice.ace.AjaxRequest(options);
    }
};

ice.ace.Tree.prototype.sendNodeExpansionRequest = function(node) {
    var options = {
        source:this.cfg.id,
        execute:this.cfg.id,
        render:this.cfg.id
    };

    this.append('expand', this.getNodeKey(node));

    if (this.cfg.behaviors && this.cfg.behaviors['expand']) {
        ice.ace.ab(ice.ace.extendAjaxArgs(
                this.cfg.behaviors['expand'],
                ice.ace.clearExecRender(options)
        ));
    } else {
        ice.ace.AjaxRequest(options);
    }
};

ice.ace.Tree.prototype.deselectAll = function() {
    var self = this;
    this.element.find(this.nodeWrapperSelector+'.ui-state-active')
            .each(function() {
        var wrap = ice.ace.jq(this),
            node = wrap.closest('.if-node-cnt'),
            key = self.getNodeKey(node);

        wrap.removeClass('ui-state-active');

        self.append('deselect', key);
        self.remove('select', key);
    });
};

ice.ace.Tree.prototype.getNodeKey = function(node) {
    var startStr = this.cfg.id + ':-:',
        endStr = ':-',
        id = node.attr('id');

    // If we are trying to find the key of the root
    // return the component client id
    if (this.cfg.id == id)
        return id;

    var startIndex = id.indexOf(startStr) + startStr.length,
        endIndex = id.indexOf(endStr, startIndex);

    return id.substring(startIndex, endIndex);
};

ice.ace.Tree.prototype.write = function(key, val) {
    this.element.find(this.jqId+"_"+key).val(JSON.stringify(val));
};

ice.ace.Tree.prototype.read = function(key) {
    var val = this.element.find(this.jqId+"_"+key).val();
    if (val != "") return JSON.parse(val);
    else return [];
};

ice.ace.Tree.prototype.append = function(key, val) {
    var arr = this.read(key);
    arr.push(val);
    this.write(key, arr);
};

ice.ace.Tree.prototype.remove = function(key, val) {
    this.write(key, ice.ace.jq.grep(this.read(key),
        function (o) {
            return o != val;
        }
    ));
};
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

(function() {
    var consoleLog = function(msg) {
        if (window.console) {
            //console.log(msg);
        }
    };

    var broadcast = function(funcs, args) {
        args = args || [];

        for (var i in funcs) {
            if (!isNaN(parseInt(i))) {
                funcs[i].apply(funcs[i],args);
            }
        }
    };

    var fold = function(items, initialValue, injector) {
        var tally = initialValue;
        var size = items.length;
        for (var i = 0; i < size; i++) {
            tally = injector(tally, items[i]);
        }

        return tally;
    };

    var isSessionExpired = function(xmlContent) {
        var sessionExpired = false;
        if (xmlContent && xmlContent.documentElement) {
            var errorNames = xmlContent.getElementsByTagName("error-name");
            if (errorNames && errorNames.length > 0) {
                var errorName = errorNames[0].firstChild.nodeValue;
                if (errorName && errorName.indexOf('org.icefaces.application.SessionExpiredException') >= 0) {
                    sessionExpired = true;
                }
            }
        }
        return sessionExpired;
    };

    function Overlay(cfg, container, whenShownFunc) {
        // If the request is processed before our timeouts for adding the
        // elements, then we need to never add them.
        var addElements = true;
        var addDelay = 250;

        var overlay = document.createElement('div');
        overlay.className = 'ui-widget-overlay';
        overlay.style.cssText = 'position: absolute; z-index: 28000; zoom: 1; display: none;';
        consoleLog('Overlay  Built overlay');
        if (container == document.body) {
            container.appendChild(overlay);
        } else {
            container.parentNode.appendChild(overlay);
        }
        consoleLog('Overlay  Added overlay');

        var cloneToRemove;
        var revertElem;
        var revertZIndex;
        if (cfg.autoCenter) {
            cloneToRemove = ice.ace.jq(ice.ace.escapeClientId(cfg.id)+"_display").clone(false,true);
            cloneToRemove.attr('id', cfg.id + '_clone');
            cloneToRemove.addClass('clone ui-panel ui-widget-content ui-corner-all');
            cloneToRemove.css('z-index', '28001');
            cloneToRemove.css('display', 'none');
            cloneToRemove.children().addClass('ui-panel-titlebar ui-widget-header ui-corner-all');
            consoleLog('Overlay  autoCenter  built clone');
            if (container == document.body) {
                cloneToRemove.appendTo(container);
                cloneToRemove.css('position', 'fixed');
                consoleLog('Overlay  autoCenter  added clone over body');
            } else {
                cloneToRemove.appendTo(container.parentNode);
                cloneToRemove.css('position', 'absolute');
                consoleLog('Overlay  autoCenter  added clone over other');
            }
        } else {
            revertElem = ice.ace.jq(ice.ace.escapeClientId(cfg.id)+"_display");
            consoleLog('Overlay  !autoCenter  found revert');
        }

        setTimeout(function() {
            consoleLog('Overlay  setTimeout to add overlay / clone / revert  addElements: ' + addElements);
            if (whenShownFunc) {
                whenShownFunc();
                whenShownFunc = null;
            }
            if (!addElements) {
                return;
            }
            if (revertElem) {
                revertZIndex = revertElem.css('z-index');
                revertElem.css('z-index', '28001');
                revertElem.css('display', '');
                consoleLog('Overlay  setTimeout  showed revert');
            }
            if (overlay) {
                var overlayWidth = 0, overlayHeight = 0;
                if (container == document.body) {
                    overlayWidth = Math.max(document.documentElement.scrollWidth,
                        Math.max(document.body.scrollWidth, document.body.parentNode.offsetWidth));
                    overlayHeight = Math.max(document.documentElement.scrollHeight,
                        Math.max(document.body.scrollHeight, document.body.parentNode.offsetHeight));
                } else {
                    overlayWidth = container.offsetWidth;
                    overlayHeight = container.offsetHeight;
                }
                overlay.style.cssText = 'top: 0px; left: 0px; width: '+overlayWidth+'px; height: '+overlayHeight+'px; position: absolute; z-index: 28000; zoom: 1;';
                if (container != document.body) {
                    ice.ace.jq(overlay).position({
                        my: 'left top',
                        at: 'left top',
                        of: container,
                        collision: 'none'});
                }
                consoleLog('Overlay  setTimeout  showed and positioned overlay');
            }
            if (cloneToRemove) {
                cloneToRemove.css('display', '');
                if (container == document.body) {
                    cloneToRemove.position({
                        my: 'center center',
                        at: 'center center',
                        of: window,
                        collision: 'fit'});
                    consoleLog('Overlay  setTimeout  showed and positioned clone over body');
                } else {
                    cloneToRemove.position({
                        my: 'center center',
                        at: 'center center',
                        of: container,
                        collision: 'fit'});
                    consoleLog('Overlay  setTimeout  showed and positioned clone over other');
                }
            }
        }, addDelay);

        return function() {
            consoleLog('Overlay  function to cleanup overlay and clone  addElements(sets false): ' + addElements);
            addElements = false;
            if (overlay) {
                try { overlay.parentNode.removeChild(overlay); }
                catch (e) { //ignore, the overlay does not match the document after a html/body level update
                }
            }
            if (cloneToRemove) {
                try { cloneToRemove.remove(); }
                catch (e) { //ignore, the cloneToRemove does not match the document after a html/body level update
                }
            }
            if (revertElem) {
                try {
                    revertElem.css('z-index', revertZIndex);
                    revertElem.css('display', 'none');
                }
                catch (e) { //ignore, the cloneToRemove does not match the document after a html/body level update
                }
            }
        };
    }

    var anticipationStrings = ['unanticipated', 'anticipated', 'commenced'];
    var UNANTICIPATED = 0, ANTICIPATED = 1, COMMENCED = 2;
    var anticipatePossibleSecondSubmit = UNANTICIPATED;

    var NOOP = function () {
        consoleLog('stopBlockingUI NOOP');
    };
    consoleLog('stopBlockingUI = NOOP  from  init');
    var stopBlockingUI = NOOP;

    if (!ice.ace) ice.ace = {};

    var uniqueCounter = 0;

    ice.ace.SubmitMonitor = function (id, cfg) {
        var jqId = ice.ace.escapeClientId(cfg.id);
        var uniqueId = uniqueCounter++;

        function isMonitoringElement(source) {
            consoleLog('Monitor '+uniqueId+'>'+jqId+'  isMonitoringElement  monitorFor: ' + cfg.monitorFor + '  source.id: ' + (source ? source.id : '<null>'));
            var mf = cfg.monitorFor;
            if (mf == undefined || mf.length == 0) {
                return true;
            }
            if (!source) {
                return false;
            }
            var monitoredElementIds = mf.split(" ");
            var curr = source;
            while (true) {
                var currId = curr.id;
                if (currId) {
                    consoleLog('Monitor '+uniqueId+'>'+jqId+'  isMonitoringElement  source ancestor id: ' + currId + '  monitoredElementIds: ' + monitoredElementIds);
                    if (-1 < ice.ace.jq.inArray(currId, monitoredElementIds)) {
                        consoleLog('Monitor '+uniqueId+'>'+jqId+'  isMonitoringElement  MATCHED');
                        return true;
                    }
                    consoleLog('Monitor '+uniqueId+'>'+jqId+'  isMonitoringElement  NOT MATCHED  continuing scanning...');
                }
                if (curr == document.body) {
                    break;
                }
                curr = curr.parentNode;
                if (!curr) {
                    break;
                }
            }
            consoleLog('Monitor '+uniqueId+'>'+jqId+'  isMonitoringElement  NOT MATCHED');
            return false;
        }

        function getBlockUIProperty() {
            return (cfg.blockUI == undefined) ? '@all' : cfg.blockUI;
        }

        function isBlockUIEnabled() {
            return (getBlockUIProperty() != '@none');
        }

        function isBlockUITypeAmenableToCombining() {
            var rawBlockUI = getBlockUIProperty();
            return ( (rawBlockUI != '@source') && (rawBlockUI != '@none') );
        }

        function resolveBlockUIElement(source) {
            var rawBlockUI = getBlockUIProperty();
            if (rawBlockUI == '@all') {
                return document.body;
            } else if (rawBlockUI == '@source') {
                return source;
            } else if (rawBlockUI == '@none') {
                return null;
            } else {
                var elem = ice.ace.jq(ice.ace.escapeClientId(rawBlockUI));
                if (elem && elem.length > 0) {
                    return elem[0];
                }
                return null;
            }
        }

        function eventSink(element) {
            return function(e) {
				e = e || window.event;
                var eventType = ( (e.type != undefined && e.type != null) ? e.type : null );
                var triggeringElement = e.srcElement ? e.srcElement : e.target;
                var capturingElement = element;
                consoleLog('Monitor '+uniqueId+'>'+jqId+'  event [type: ' + eventType +
                        ', triggered by: ' + (triggeringElement.id || triggeringElement) +
                        ', captured in: ' + (capturingElement.id || capturingElement) + '] was discarded.');
                return false;
            }
        }

        var allStates = ['idle', 'active', 'serverError', 'networkError', 'sessionExpired'];
        var IDLE = 0, ACTIVE = 1, SERVER_ERROR = 2, NETWORK_ERROR = 3, SESSION_EXPIRED = 4;
        var currentState = IDLE;

        var changeState = function(state) {
            currentState = state;
            consoleLog('Monitor '+uniqueId+'>'+jqId+'  changeState: ' + state + ' : ' + allStates[state]);
            ice.ace.jq(jqId+'_display > div.ice-sub-mon-mid').hide().filter('.'+allStates[state]).show();
            ice.ace.jq(jqId+'_clone > div.ice-sub-mon-mid').hide().filter('.'+allStates[state]).show();
        };


        var begunApplicableToThis = false;

        var doOverlayIfBlockingUI = function(source) {
            //Only block the UI for client-initiated requests (not push requests)
            if (isBlockUIEnabled()) {
                consoleLog('Monitor '+uniqueId+'>'+jqId+'  doOverlayIfBlockingUI  Blocking UI');

                var overlayShown = false;
                var overlayShownFunc = function() {
                    overlayShown = true;
                };
                var eventSinkFirstClickCount = 0;
                function eventSinkFirstClick(firstSubmitSource, element, originalOnclick, regularSink) {
                    return function(e) {
                        consoleLog('Monitor '+uniqueId+'>'+jqId+'  eventSinkFirstClick()  overlayShown: ' + overlayShown + '  eventSinkFirstClickCount: ' + eventSinkFirstClickCount);
                        if (overlayShown) {
                            consoleLog('eventSinkFirstClick()  overlay shown');
                            return regularSink(e);
                        }
                        if (eventSinkFirstClickCount > 0) {
                            consoleLog('eventSinkFirstClick()  not first click');
                            return regularSink(e);
                        }
                        eventSinkFirstClickCount++;

						e = e || window.event;
                        var triggeringElement = ( (e.srcElement != undefined && e.srcElement != null) ? e.srcElement : e.target);
                        consoleLog('event [type: ' + e.type +
                                ', triggered by: ' + (triggeringElement.id || triggeringElement) +
                                ', captured in: ' + (element.id || element) + ']');
                        consoleLog('first submit element: ' + (firstSubmitSource.id || firstSubmitSource));
                        if ((firstSubmitSource == triggeringElement) || (firstSubmitSource == element)) {
                            consoleLog('eventSinkFirstClick()  clicked on same element as first submit');
                            regularSink(e);
                            // checkbox in Firefox:  onclick, onchange, but in Chrome: onchange, onclick
                            // If icecore:singleSubmit submits onchange, then onclick is trapped, and must
                            //  return true or else it will revert what the onchange submitted.
                            return true;
                        }

                        consoleLog('eventSinkFirstClick()  calling original onclick');
                        // Might not be an onclick directly on that element, it might
                        // have to bubble up, like with icecore:singleSubmit
                        anticipatePossibleSecondSubmit = ANTICIPATED;
                        if (originalOnclick) {
                            return originalOnclick.call(element, e);
                        }
                    }
                }

                consoleLog('Monitor '+uniqueId+'>'+jqId+'  doOverlayIfBlockingUI  after eventSinkFirstClick');
                var overlayContainerElem = resolveBlockUIElement(source);
                consoleLog('Monitor '+uniqueId+'>'+jqId+'  doOverlayIfBlockingUI  overlayContainerElem: ' + overlayContainerElem);
                var blockUIOverlay = Overlay(cfg, overlayContainerElem, overlayShownFunc);
                overlayShownFunc = null;
                var rollbacks = fold(['input', 'select', 'textarea', 'button', 'a'], [], function(result, type) {
                    return result.concat(
                            ice.ace.jq.map(overlayContainerElem.getElementsByTagName(type), function(e) {
                        var sink = eventSink(e);
                        var onkeypress = e.onkeypress;
                        var onkeyup = e.onkeyup;
                        var onkeydown = e.onkeydown;
                        var onclick = e.onclick;
                        var sinkClick = eventSinkFirstClick(source, e, onclick, sink);
                        e.onkeypress = sink;
                        e.onkeyup = sink;
                        e.onkeydown = sink;
                        e.onclick = sinkClick;

                        return function() {
                            try {
                                e.onkeypress = onkeypress;
                                e.onkeyup = onkeyup;
                                e.onkeydown = onkeydown;
                                e.onclick = onclick;
                            } catch (ex) {
                                //don't fail if element is not present anymore
                            }
                        };
                    })
                    );
                });

                stopBlockingUI = function() {
                    broadcast(rollbacks);
                    if (blockUIOverlay) {
                        blockUIOverlay();
                        blockUIOverlay = null;
                    }
                    stopBlockingUI = NOOP;
                    consoleLog('Monitor '+uniqueId+'>'+jqId+'  Unblocked UI');
                };
            } else {
                consoleLog('Monitor '+uniqueId+'>'+jqId+'  stopBlockingUI = NOOP  from  else of isBlockUIEnabled()');
                stopBlockingUI = NOOP;
            }
        };

        var CLEANUP_UNNECESSARY = 0, CLEANUP_PENDING = 1, CLEANUP_ACKNOWLEDGED = 2;
        var cleanup = CLEANUP_UNNECESSARY;
        var cleanBeforeSubmit = null, cleanBeforeUpdate = null, cleanServerError = null, cleanNetworkError = null;

        function handleCleanup(isBeforeSubmit) {
            if (cleanup == CLEANUP_ACKNOWLEDGED) {
                consoleLog('Monitor '+uniqueId+'>'+jqId+'  handleCleanup  DEAD');
                return true;
            } else if (cleanup == CLEANUP_PENDING) {
                cleanup = CLEANUP_ACKNOWLEDGED;
                consoleLog('Monitor '+uniqueId+'>'+jqId+'  handleCleanup  CLEANUP PENDING -> ACKNOWLEDGED');
                setTimeout(function() {
                    consoleLog('Monitor '+uniqueId+'>'+jqId+'  handleCleanup  setTimeout cleanup');
                    if (cleanBeforeSubmit) {
                        cleanBeforeSubmit();
                        cleanBeforeSubmit = null;
                    }
                    if (cleanBeforeUpdate) {
                        cleanBeforeUpdate();
                        cleanBeforeUpdate = null;
                    }
                    if (cleanServerError) {
                        cleanServerError();
                        cleanServerError = null;
                    }
                    if (cleanNetworkError) {
                        cleanNetworkError();
                        cleanNetworkError = null;
                    }
                }, 270);
                return isBeforeSubmit;
            }
            return false;
        }

        consoleLog('Monitor '+uniqueId+'>'+jqId+'  Register onElementUpdate: '+cfg.id+'_script');

        window.ice.onElementUpdate(cfg.id+'_script', function() {
            cleanup = CLEANUP_PENDING;
            consoleLog('Monitor '+uniqueId+'>'+jqId+'  onElementUpdate  -> CLEANUP_PENDING');
        });

        cleanBeforeSubmit = window.ice.onBeforeSubmit(function(source, isClientRequest) {
            if (handleCleanup(true)) {
                return;
            }
            if (!isClientRequest) {
                return;
            }
            if (!isMonitoringElement(source)) {
                consoleLog('Monitor '+uniqueId+'>'+jqId+'  onBeforeSubmit()  NOT monitoring source: ' + source + '  id: ' + source.id);
                return;
            }
            begunApplicableToThis = true;

            consoleLog('Monitor '+uniqueId+'>'+jqId+'  onBeforeSubmit()  IS  monitoring source: ' + source + '  id: ' + source.id);
            consoleLog('Monitor '+uniqueId+'>'+jqId+'  onBeforeSubmit()  ' + anticipationStrings[anticipatePossibleSecondSubmit]);
            if (isBlockUITypeAmenableToCombining() && (anticipatePossibleSecondSubmit == ANTICIPATED)) {
                consoleLog('onBeforeSubmit()  anticipated -> commenced');
                anticipatePossibleSecondSubmit = COMMENCED;
            } else {
                consoleLog('onBeforeSubmit()  regular');
                changeState(ACTIVE);
                doOverlayIfBlockingUI(source);
            }
        });

        var whenUpdate = function(xmlContent, source) {
            consoleLog('Monitor '+uniqueId+'>'+jqId+'  whenUpdate()  stopping');
            anticipatePossibleSecondSubmit = UNANTICIPATED;
            stopBlockingUI();
            changeState(IDLE);
        };

        cleanBeforeUpdate = window.ice.onBeforeUpdate(function(xmlContent, source) {
            if (handleCleanup(false)) {
                return;
            }
            // Can't use isMonitoringElement(source) here since source is from
            // before the update, so doesn't necessarily exist any more, nor
            // a new component with the same id.
            if (!begunApplicableToThis) {
                consoleLog('Monitor '+uniqueId+'>'+jqId+'  onBeforeUpdate()  NOT begunApplicableToThis for source: ' + source + '  id: ' + source.id);
                return;
            }
            begunApplicableToThis = false;
            consoleLog('Monitor '+uniqueId+'>'+jqId+'  onBeforeUpdate()  IS  begunApplicableToThis for source: ' + source + '  id: ' + source.id);

            consoleLog('Monitor '+uniqueId+'>'+jqId+'  onBeforeUpdate()  ' + anticipationStrings[anticipatePossibleSecondSubmit]);
            if (isBlockUITypeAmenableToCombining() && (anticipatePossibleSecondSubmit == ANTICIPATED)) {
                setTimeout(function() {
                    consoleLog('Monitor '+uniqueId+'>'+jqId+'  onBeforeUpdate()  DELAYED  ' + anticipationStrings[anticipatePossibleSecondSubmit]);
                    if (anticipatePossibleSecondSubmit != COMMENCED) {
                        whenUpdate(xmlContent, source);
                    }
                }, 260);
            } else if (isSessionExpired(xmlContent)) {
                consoleLog('Monitor '+uniqueId+'>'+jqId+'  onBeforeUpdate()  isSessionExpired');
                anticipatePossibleSecondSubmit = UNANTICIPATED;
                changeState(SESSION_EXPIRED);
            } else {
                whenUpdate(xmlContent, source);
            }
        });

        cleanServerError = window.ice.onServerError(function() {
            if (handleCleanup(false)) {
                return;
            }
            anticipatePossibleSecondSubmit = UNANTICIPATED;
            changeState(SERVER_ERROR);
        });

        cleanNetworkError = window.ice.onNetworkError(function() {
            if (handleCleanup(false)) {
                return;
            }
            anticipatePossibleSecondSubmit = UNANTICIPATED;
            changeState(NETWORK_ERROR);
        });

        /*
        window.ice.onSessionExpiry(function() {
            //consoleLog('Monitor '+uniqueId+'>'+jqId+'  onSessionExpiry');
            if (handleCleanup(false)) {
                return;
            }
            //consoleLog('Monitor '+uniqueId+'>'+jqId+'  onSessionExpiry  Handling');
            anticipatePossibleSecondSubmit = UNANTICIPATED;
            changeState(SESSION_EXPIRED);
        });
        */

        changeState(IDLE);
    }
})();
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

if (!window['ice']) window.ice = {};
if (!window.ice['ace']) window.ice.ace = {};
if (!ice.ace.Autocompleters) ice.ace.Autocompleters = {};

ice.ace.Autocompleter = function(id, updateId, rowClass, selectedRowClass, delay, minChars, height, direction, behaviors, cfg, clientSideModeCfg, effects, placeholder) {
	this.id = id;
	var isInitialized = false;
	if (ice.ace.Autocompleters[this.id] && ice.ace.Autocompleters[this.id].initialized) isInitialized = true;
	this.showingList = false;
	if (isInitialized) this.showingList = ice.ace.Autocompleters[this.id].showingList;
	ice.ace.Autocompleters[this.id] = this;
	this.clientSideModeCfg = clientSideModeCfg;
	this.delay = delay;
	this.minChars = minChars;
	this.height = height == 0 ? 'auto' : height;
	this.direction = direction;
    this.cfg = cfg;
	var options = {minChars:0};
	this.root = ice.ace.jq(ice.ace.escapeClientId(this.id));
	var $element = this.root.find('input[name="'+this.id+'_input"]');
	this.element = $element.get(0);
	this.element.id = this.id + "_input";
	this.update = ice.ace.jq(ice.ace.escapeClientId(updateId)).get(0);
	this.effects = effects;
	if (placeholder && !('placeholder' in document.createElement('input'))) { // if 'placeholder' isn't supported, use label inField
		this.cfg.inFieldLabel = placeholder;
	}
	$element.data("labelIsInField", this.cfg.labelIsInField);
	
	if (isInitialized) {
		this.initialize(this.element, this.update, options, rowClass, selectedRowClass, behaviors);
	} else {
        if (ice.ace.jq.trim($element.val()) == "" && this.cfg.inFieldLabel) {
            $element.val(this.cfg.inFieldLabel);
            $element.addClass(this.cfg.inFieldLabelStyleClass);
            $element.data("labelIsInField", true);
        }
		var self = this;
		$element.on('focus', function() {
			$element.off('focus');
			if ($element.data("labelIsInField")) {
				$element.val("");
				$element.removeClass(self.cfg.inFieldLabelStyleClass);
				$element.data("labelIsInField", false);
				self.cfg.labelIsInField = false;
			}
			self.initialize(self.element, self.update, options, rowClass, selectedRowClass, behaviors); 
		});
	}
};

ice.ace.Autocompleter.keys = {
KEY_BACKSPACE: 8,
KEY_TAB:       9,
KEY_RETURN:   13,
KEY_ESC:      27,
KEY_LEFT:     37,
KEY_UP:       38,
KEY_RIGHT:    39,
KEY_DOWN:     40,
KEY_DELETE:   46,
KEY_HOME:     36,
KEY_END:      35,
KEY_PAGEUP:   33,
KEY_PAGEDOWN: 34,
KEY_INSERT:   45
};

ice.ace.Autocompleter.Browser = (function() {
        var ua = navigator.userAgent;
        var isOpera = Object.prototype.toString.call(window.opera) == '[object Opera]';
        return {
            IE:             !!window.attachEvent && !isOpera,
            Opera:          isOpera,
            WebKit:         ua.indexOf('AppleWebKit/') > -1,
            Gecko:          ua.indexOf('Gecko') > -1 && ua.indexOf('KHTML') === -1,
            MobileSafari:   /Apple.*Mobile/.test(ua)
        }
    })();

ice.ace.Autocompleter.collectTextNodes = function(element) {
	var children = element.childNodes;
	var str = '';
	for (var i = 0; i < children.length; i++) {
		var node = children[i];
		str += node.nodeType == 3 ? node.nodeValue : ( node.childNodes.length > 0 ? ice.ace.Autocompleter.collectTextNodes(node) : '');
	}
	return str;
};

ice.ace.Autocompleter.collectTextNodesIgnoreClass = function(element, className) {
	var children = element.childNodes;
	var str = '';
	for (var i = 0; i < children.length; i++) {
		var node = children[i];
		str += node.nodeType == 3 ? node.nodeValue : ( node.childNodes.length > 0 && !ice.ace.jq(node).hasClass(className) ? ice.ace.Autocompleter.collectTextNodesIgnoreClass(node, className) : '' );
	}
	return str;
};

ice.ace.Autocompleter.cleanWhitespace = function(element) {
	var node = element.firstChild;
	while (node) {
		var nextNode = node.nextSibling;
		if (node.nodeType == 3 && !/\S/.test(node.nodeValue))
			element.removeChild(node);
		node = nextNode;
	}
	return element;
};

ice.ace.Autocompleter.prototype = {

    initialize: function(element, update, options, rowC, selectedRowC, behaviors) {
        var self = this;
        this.hasFocus = false;
        this.changed = false;
        this.active = false;
        this.index = -1;
        this.entryCount = 0;
        this.rowClass = rowC;
        this.selectedRowClass = selectedRowC;

        if (this.setOptions)
            this.setOptions(options);
        else
            this.options = options || {};

        this.options.paramName = this.options.paramName || this.element.name;
        this.options.tokens = this.options.tokens || [];
        this.options.frequency = this.options.frequency || 0.4;
        this.options.minChars = this.options.minChars || 1;
        this.options.onShow = this.options.onShow ||
            function(element, update) {
                try {
					self.calculateListPosition();
					self.showEffect(update);
                } catch(e) {
                    //logger.info(e);
                }
            };
        this.options.onHide = this.options.onHide ||
            function(element, update) {
			self.hideEffect(update);
            };

        if (typeof(this.options.tokens) == 'string')
            this.options.tokens = new Array(this.options.tokens);

        this.observer = null;
        this.element.setAttribute('autocomplete', 'off');
        ice.ace.jq(this.update).hide();
		ice.ace.jq(this.element).data("labelIsInField", this.cfg.labelIsInField);
		ice.ace.jq(this.element).on("blur", function(e) { self.onBlur.call(self, e); });
		ice.ace.jq(this.element).on("focus", function(e) { self.onFocus.call(self, e); });
        var keyEvent = "keypress";
        if (ice.ace.Autocompleter.Browser.IE || ice.ace.Autocompleter.Browser.WebKit) {
            keyEvent = "keydown";
        } else {
			ice.ace.jq(this.element).on("keyup", function(e) { if (!self.justSubmitted) { self.onKeyPress.call(self, e);} } );
		}
		ice.ace.jq(this.element).on(keyEvent, function(e) { self.onKeyPress.call(self, e); } );
        // ICE-3830
        if (ice.ace.Autocompleter.Browser.IE || ice.ace.Autocompleter.Browser.WebKit)
		ice.ace.jq(this.element).on("paste", function(e) { self.onPaste.call(self, e); });
		
		// ajax behaviors
		if (behaviors) {
			if (behaviors.behaviors) {
				if (behaviors.behaviors.submit) {
					this.ajaxSubmit = behaviors.behaviors.submit;
				}
				if (behaviors.behaviors.blur) {
					this.ajaxBlur = behaviors.behaviors.blur;
				}
				if (behaviors.behaviors.textChange) {
					this.ajaxTextChange = behaviors.behaviors.textChange;
				}
				if (behaviors.behaviors.change) {
					this.ajaxValueChange = behaviors.behaviors.change;
				}
			}
		}
		
		// prepare data model for client side mode
		if (this.clientSideModeCfg) {
			var model = [];
			var $root = ice.ace.jq(ice.ace.escapeClientId(this.id + '_update')).children('div:first');
			this.clientSideModeCfg.data = $root.children();
			if ($root.hasClass('facet')) {
				this.clientSideModeCfg.data.children('span.label').each(function(i,e){model.push(e.innerHTML)});
			} else {
				this.clientSideModeCfg.data.each(function(i,e){model.push(e.innerHTML)});
			}
			this.clientSideModeCfg.model = model;
			//$root.detach();
		}
		
		this.initialized = true;
		
		if (this.clientSideModeCfg && this.showingList) {
			this.clientSideModeUpdate();
		}
    },
	
	calculateListPosition: function() {
		var element = this.element;
		var update = this.update;
		if (update["style"] && (!update.style.position || update.style.position == 'absolute')) {
			update.style.position = 'absolute';
			var jqElement = ice.ace.jq(element);
			var jqUpdate = ice.ace.jq(update);
			var pos = jqElement.offset();
			var autoUp = false;
			if (this.direction == 'auto') {
				var updateHeight = jqUpdate.height();
				updateHeight = updateHeight > this.height ? this.height : updateHeight;
				var winHeight = ice.ace.jq(window).height();
				var docHeight = ice.ace.jq(document).height();
				var scrollTop = ice.ace.jq(document).scrollTop()
				var lengthAbove = pos.top - scrollTop;
				var lengthBelow = scrollTop + winHeight - pos.top - element.offsetHeight;
				if (lengthBelow < updateHeight) {
					if (lengthAbove > lengthBelow)
						autoUp = true;
				}
			}
			if (this.direction == 'up' || autoUp) {
				var updateHeight = jqUpdate.height();
				updateHeight = updateHeight > this.height ? this.height : updateHeight;
				jqUpdate.css({ position: "absolute", marginTop: 0, marginLeft: 0, width: jqElement.width(), maxHeight: this.height, overflow: "auto" });
				var savedPos = element.style.position;
				element.style.position = "relative";
				update.style.left = element.offsetLeft + "px";
				update.style.top = (element.offsetTop - updateHeight) + "px";
				element.style.position = savedPos;
			} else {
				jqUpdate.css({ position: "absolute", marginTop: 0, marginLeft: 0, width: jqElement.width(), maxHeight: this.height, overflow: "auto" });
				var savedPos = element.style.position;
				element.style.position = "relative";
				update.style.left = element.offsetLeft + "px";
				update.style.top = (element.offsetTop + element.offsetHeight) + "px";
				element.style.position = savedPos;
			}
		}
	},

    show: function() {
        try {
            if (ice.ace.jq(this.update).css('display') == 'none')this.options.onShow(this.element, this.update);
            if (!this.iefix &&
                (navigator.appVersion.indexOf('MSIE') > 0) &&
                (navigator.userAgent.indexOf('Opera') < 0) &&
                (ice.ace.jq(this.update).css('position') == 'absolute')) {
                ice.ace.jq('<iframe id="' + this.update.id + '_iefix" title="IE6_Fix" ' +
                        'style="display:none;position:absolute;filter:progid:DXImageTransform.Microsoft.Alpha(opacity=0);" ' +
                        'src="javascript:\'<html></html>\'" frameborder="0" scrolling="no"></iframe>').insertAfter(this.update);
                this.iefix = ice.ace.jq('#' + this.update.id + '_iefix').get(0);
            }
		  var self = this;
            if (this.iefix) setTimeout(function() { self.fixIEOverlapping.call(self) }, 50);
            this.element.focus();
        } catch (e) {
            //logger.info(e);
        }
    },

    fixIEOverlapping: function() {
        try {
		var pos = ice.ace.jq(this.update).offset();
            ice.ace.jq(this.iefix).css(pos);
            this.iefix.style.zIndex = 1;
            this.update.style.zIndex = 2;
            ice.ace.jq(this.iefix).show();
        } catch(e) {
            //logger.info(e);
        }
    },

    hide: function() {
        this.stopIndicator();
        if (ice.ace.jq(this.update).css('display') != 'none') this.options.onHide(this.element, this.update);
        if (this.iefix) ice.ace.jq(this.iefix).hide();
		this.showingList = false;
    },

    startIndicator: function() {
        if (this.options.indicator) ice.ace.jq(this.options.indicator).show();
    },

    stopIndicator: function() {
        if (this.options.indicator) ice.ace.jq(this.options.indicator).hide();
    },

    onKeyPress: function(event) {
        if (!this.active) {
            switch (event.keyCode) {
                case ice.ace.Autocompleter.keys.KEY_TAB:
					ice.setFocus('');
					return;
                case ice.ace.Autocompleter.keys.KEY_RETURN:
					if (this.element.value.length < this.minChars) {
						event.stopPropagation();
						event.preventDefault();
						return false;
					}
                    this.getUpdatedChoices(true, event, -1, 'enter');
					event.stopPropagation();
					event.preventDefault();
                    return;
				case ice.ace.Autocompleter.keys.KEY_UP:
                case ice.ace.Autocompleter.keys.KEY_DOWN:
                    this.getUpdatedChoices(false, event, -1);
                    return;
            }
        }

        if (this.active) {
            switch (event.keyCode) {
                case ice.ace.Autocompleter.keys.KEY_TAB:
					ice.setFocus('');
					return;
                case ice.ace.Autocompleter.keys.KEY_RETURN:
					if (this.element.value.length < this.minChars) {
						event.stopPropagation();
						event.preventDefault();
						return false;
					}

                    this.hidden = true; // Hack to fix before beta. Was popup up the list after a selection was made
                    var idx = this.selectEntry();
                    this.getUpdatedChoices(true, event, idx, 'enter');
                    this.hide();
					event.stopPropagation();
					event.preventDefault();
                    return;
                case ice.ace.Autocompleter.keys.KEY_ESC:
                    this.hide();
                    this.active = false;
					event.stopPropagation();
					event.preventDefault();
                    return;
                case ice.ace.Autocompleter.keys.KEY_LEFT:
                case ice.ace.Autocompleter.keys.KEY_RIGHT:
                    return;
                case ice.ace.Autocompleter.keys.KEY_UP:
                    this.markPrevious();
                    this.render();
					event.stopPropagation();
					event.preventDefault();
                    return;
                case ice.ace.Autocompleter.keys.KEY_DOWN:
                    this.markNext();
                    this.render();
					event.stopPropagation();
					event.preventDefault();
                    return;
            }
        }
        else {
            if (event.keyCode == ice.ace.Autocompleter.keys.KEY_TAB || event.keyCode == ice.ace.Autocompleter.keys.KEY_RETURN) return;
        }
		
		if (!this.isCharacterCode(event.keyCode)) return;

        this.changed = true;
        this.hasFocus = true;
        this.index = -1;
        //This is to avoid an element being select because the mouse just happens to be over the element when the list pops up
        this.skip_mouse_hover = true;
        if (this.active) this.render();
        if (this.observer) clearTimeout(this.observer);
		var self = this;
        this.observer = setTimeout(function() { self.onObserverEvent() }, this.delay);
    },

    onKeyDown: function(event) {
        if (!this.active) {
            switch (event.keyCode) {
				case ice.ace.Autocompleter.keys.KEY_UP:
                case ice.ace.Autocompleter.keys.KEY_DOWN:
                    this.getUpdatedChoices(false, event, -1);
                    return;
                case ice.ace.Autocompleter.keys.KEY_BACKSPACE:
                case ice.ace.Autocompleter.keys.KEY_DELETE:
                    if (this.observer) clearTimeout(this.observer);
				var self = this;
                    this.observer = setTimeout( function() { self.onObserverEvent() }, this.delay);
                    return;
            }
        }
        else if (this.active) {
            switch (event.keyCode) {
                case ice.ace.Autocompleter.keys.KEY_UP:
                    this.markPrevious();
                    this.render();
					event.stopPropagation();
					event.preventDefault();
                    return;
                case ice.ace.Autocompleter.keys.KEY_DOWN:
                    this.markNext();
                    this.render();
					event.stopPropagation();
					event.preventDefault();
                    return;
                case ice.ace.Autocompleter.keys.KEY_ESC:
                    if (ice.ace.Autocompleter.Browser.WebKit) {
                        this.hide();
                        this.active = false;
					event.stopPropagation();
					event.preventDefault();
                        return;
                    }
                case ice.ace.Autocompleter.keys.KEY_BACKSPACE:
                case ice.ace.Autocompleter.keys.KEY_DELETE:
                    if (this.observer) clearTimeout(this.observer);
					var self = this;
                    this.observer = setTimeout(function() { self.onObserverEvent() }, this.delay);
                    return;
            }
        }
    },

    activate: function() {
        this.changed = false;
        this.hasFocus = true;
    },

    onHover: function(event) {
		var element = ice.ace.jq(event.currentTarget).closest('div').get(0);
        if (this.index != element.autocompleteIndex) {
            if (!this.skip_mouse_hover) this.index = element.autocompleteIndex;
            this.render();
        }
		event.stopPropagation();
		event.preventDefault();
    },

    onMove: function(event) {
        if (this.skip_mouse_hover) {
            this.skip_mouse_hover = false;
            this.onHover(event);
        }
    },

    onClick: function(event) {
		if (this.ieScrollbarFixObserver) clearTimeout(this.ieScrollbarFixObserver);
		var element = ice.ace.jq(event.currentTarget).closest('div').get(0);
        this.index = element.autocompleteIndex;
        var idx = element.autocompleteIndex;
		var interactiveElement = this.isInteractive(event.target, element);
		if (!interactiveElement) {
			this.hidden = true;
			this.selectEntry();
			this.getUpdatedChoices(true, event, idx);
			this.hide();
		} else {
			var self = this;
			var jqInteractiveElement = ice.ace.jq(interactiveElement);
			if (!jqInteractiveElement.data("onBlurHandlerRegistered")) {
				jqInteractiveElement.one('blur', function() {jqInteractiveElement.data("onBlurHandlerRegistered", false);self.onBlur();});
				jqInteractiveElement.data("onBlurHandlerRegistered", true);
			}
		}
		if (this.hideObserver) clearTimeout(this.hideObserver);
		if (this.blurObserver) clearTimeout(this.blurObserver);
    },

    onBlur: function(event) {
        var input = ice.ace.jq(this.element);
		// check if last click was done on scrollbar
		if (navigator.userAgent.indexOf("MSIE") >= 0) {
			var n = this.height;
			if (n!=null && n!='' && typeof n === 'number' && n % 1 == 0) {
				var posx=0; var posy=0;
				var e = window.event;
				if (e.pageX || e.pageY) {
					posx = e.pageX;
					posy = e.pageY;
				} else if (e.clientX || e.clientY) {
					posx = e.clientX + document.body.scrollLeft + document.documentElement.scrollLeft;
					posy = e.clientY + document.body.scrollTop + document.documentElement.scrollTop;
				}
				var widthX=input.position().left+input.width();
				var heightX=input.position().top+input.height()+parseFloat(this.height)+10;
				if ( this.active && (posx>input.position().left && posx<=widthX) && (posy>input.position().top && posy<heightX) ) {
					var self = this;
					this.ieScrollbarFixObserver = setTimeout(function(){self.element.focus();}, 200);
					return;
				}
			}
		}
        if (ice.ace.jq.trim(input.val()) == "" && this.cfg.inFieldLabel) {
            input.val(this.cfg.inFieldLabel);
            input.addClass(this.cfg.inFieldLabelStyleClass);
            input.data("labelIsInField", true);
        }
        // needed to make click events work
		var self = this;
        this.hideObserver = setTimeout(function () { self.hide(); }, 400);
        this.hasFocus = false;
        this.active = false;
		ice.setFocus('');
		if (this.ajaxBlur) {
			if (this.blurObserver) clearTimeout(this.blurObserver);
			this.ajaxBlur.params = this.ajaxBlur.params || {};
			this.ajaxBlur.params[this.id + '_hardSubmit'] = true;
			var self = this;
			this.blurObserver = setTimeout(function() { try{ice.ace.ab(self.ajaxBlur);}catch(e){} }, 390);
		}
    },

    onFocus: function(event) {
        var input = ice.ace.jq(this.element);
        if (input.data("labelIsInField")) {
            input.val("");
            input.removeClass(this.cfg.inFieldLabelStyleClass);
            input.data("labelIsInField", false);
        }
      if (this.element.createTextRange) {
       //IE  
	  this.element.focus();
		if (this.element.value.length > 0) {
			var fieldRange = this.element.createTextRange();  
			fieldRange.moveStart('character', this.element.value.length);  
			fieldRange.collapse(false);  
			fieldRange.select();
		}
       }  
      else {
       this.element.focus();
       var length = this.element.value.length;  
       this.element.setSelectionRange(length, length);  
      } 
    },

    // ICE-3830
    onPaste: function(event) {
        this.changed = true;
        this.hasFocus = true;
        this.index = -1;
        this.skip_mouse_hover = true;
        if (this.active) this.render();
        if (this.observer) clearTimeout(this.observer);
		var self = this;
        this.observer = setTimeout(function() { self.onObserverEvent(); }, this.delay);
        return;
    },

    render: function() {
        if (this.entryCount > 0) {
            for (var i = 0; i < this.entryCount; i++)
                if (this.index == i) {
                    ar = this.rowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).removeClass(ar[ai]);
                    ar = this.selectedRowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).addClass(ar[ai]);
                }
                else {
                    ar = this.selectedRowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).removeClass(ar[ai]);
                    ar = this.rowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).addClass(ar[ai]);
                }
            if (this.hasFocus) {
                this.show();
                this.active = true;
            }
        } else {
            this.active = false;
            this.hide();
        }
    },

    markPrevious: function() {
        if (this.index > 0) this.index--
        else this.index = this.entryCount - 1;
    },

    markNext: function() {
        if (this.index == -1) {
            this.index++;
            return;
        }
        if (this.index < this.entryCount - 1) this.index++
        else this.index = 0;
    },

    getEntry: function(index) {
        try {
            return this.update.firstChild.childNodes[index];
        } catch(ee) {
            return null;
        }
    },

    getCurrentEntry: function() {
        return this.getEntry(this.index);
    },

    selectEntry: function() {
        var idx = -1;
        this.active = false;
        if (this.index >= 0) {
            idx = this.index;
            this.updateElement(this.getCurrentEntry());
            this.index = -1;
        }
        return idx;
    },

    updateElement: function(selectedElement) {
        if (this.options.updateElement) {
            this.options.updateElement(selectedElement);
            return;
        }
        var value = '';
        if (this.options.select) {
            var nodes = document.getElementsByClassName(this.options.select, selectedElement) || [];
            if (nodes.length > 0) value = ice.ace.Autocompleter.collectTextNodes(nodes[0], this.options.select);
        } else {
            value = ice.ace.Autocompleter.collectTextNodesIgnoreClass(selectedElement, 'informal');
	}

        var lastTokenPos = this.findLastToken();
        if (lastTokenPos != -1) {
            var newValue = this.element.value.substr(0, lastTokenPos + 1);
            var whitespace = this.element.value.substr(lastTokenPos + 1).match(/^\s+/);
            if (whitespace)
                newValue += whitespace[0];
            this.element.value = newValue + value;
        } else {
            this.element.value = value;
        }
        this.element.focus();

        if (this.options.afterUpdateElement)
            this.options.afterUpdateElement(this.element, selectedElement);
    },

    updateChoices: function(choices) {
        if (!this.changed && this.hasFocus) {
            this.update.innerHTML = choices;
			this.calculateListPosition();
            ice.ace.Autocompleter.cleanWhitespace(this.update);
            ice.ace.Autocompleter.cleanWhitespace(this.update.firstChild);

            if (this.update.firstChild && this.update.firstChild.childNodes) {
                this.entryCount =
                    this.update.firstChild.childNodes.length;
                for (var i = 0; i < this.entryCount; i++) {
                    var entry = this.getEntry(i);
                    entry.autocompleteIndex = i;
                    this.addObservers(entry);
                }
            } else {
                this.entryCount = 0;
            }
            this.stopIndicator();
            this.index = -1;
            this.render();
        } else {

        }
    },

    addObservers: function(element) {
		var self = this;
		ice.ace.jq(element).on("mouseover", function(e) { self.onHover.call(self, e); });
		ice.ace.jq(element).on("click", function(e) { self.onClick.call(self, e); });
		ice.ace.jq(element).on("mousemove", function(e) { self.onMove.call(self, e); });
    },

    dispose:function() {
        for (var i = 0; i < this.entryCount; i++) {
            var entry = this.getEntry(i);
            entry.autocompleteIndex = i;
			ice.ace.jq(entry).off('mouseover');
			ice.ace.jq(entry).off('click');
			ice.ace.jq(entry).off('mousemove');
        }
		ice.ace.jq(this.element).off('mouseover');
		ice.ace.jq(this.element).off('click');
		ice.ace.jq(this.element).off('mousemove');
		ice.ace.jq(this.element).off('blur');
		ice.ace.jq(this.element).off('keypress');
        if (ice.ace.Autocompleter.Browser.IE || ice.ace.Autocompleter.Browser.WebKit)
			ice.ace.jq(this.element).off('keydown');
    },

    onObserverEvent: function() {
        this.changed = false;
        if (this.getToken().length >= this.options.minChars) {
            this.startIndicator();
            this.getUpdatedChoices(false, undefined, -1);
        } else {
            this.active = false;
            this.hide();
            this.getUpdatedChoices(false, undefined, -1);
        }
    },

    getToken: function() {
        var tokenPos = this.findLastToken();
        if (tokenPos != -1)
            var ret = this.element.value.substr(tokenPos + 1).replace(/^\s+/, '').replace(/\s+$/, '');
        else
            var ret = this.element.value;

        return /\n/.test(ret) ? '' : ret;
    },

    findLastToken: function() {
        var lastTokenPos = -1;

        for (var i = 0; i < this.options.tokens.length; i++) {
            var thisTokenPos = this.element.value.lastIndexOf(this.options.tokens[i]);
            if (thisTokenPos > lastTokenPos)
                lastTokenPos = thisTokenPos;
        }
        return lastTokenPos;
    },

    getUpdatedChoices: function(isHardSubmit, event, idx, trigger) {
		if (this.element.value.length < this.minChars) return; // this.hide()
        if (!event) {
            event = new Object();
        }
        entry = encodeURIComponent(this.options.paramName) + '=' +
            encodeURIComponent(this.getToken());

		if (this.observer) clearTimeout(this.observer);
		if (this.blurObserver) clearTimeout(this.blurObserver);
		if (isHardSubmit) {
			if (this.ajaxValueChange || this.ajaxSubmit) {
				var ajaxCfg = {};
				var options = {params: {}};
				options.params[this.id + '_hardSubmit'] = true;
				options.params['ice.event.keycode'] = event.keyCode;
				if (this.ajaxValueChange) {
					ice.ace.jq.extend(ajaxCfg, this.ajaxValueChange, options);
				} else {
					ice.ace.jq.extend(ajaxCfg, this.ajaxSubmit, options);
				}
				ajaxCfg.trigger = trigger;
				ice.ace.ab(ajaxCfg);
			} else if (!this.clientSideModeCfg) {
				ice.s(event, this.element);
			}
		} else {
			if (this.clientSideModeCfg) {
				this.clientSideModeUpdate();
			}
			if (this.ajaxTextChange || this.ajaxSubmit) {
				var ajaxCfg = {};
				var options = {params: {}};
				options.params['ice.event.keycode'] = event.keyCode;
				if (this.ajaxTextChange) {
					ice.ace.jq.extend(ajaxCfg, this.ajaxTextChange, options);
				} else {
					ice.ace.jq.extend(ajaxCfg, this.ajaxSubmit, options);
				}
				ice.ace.ab(ajaxCfg);
			} else if (!this.clientSideModeCfg) {
				ice.s(event, this.element);
			}
		}
		this.justSubmitted = true;
		var self = this;
		if (this.justSubmittedObserver) clearTimeout(this.justSubmittedObserver);
		this.justSubmittedObserver = setTimeout(function() {self.justSubmitted = false;},500);
    },
	
	clientSideModeUpdate: function() {
		
		var data = this.clientSideModeCfg.data;
		var model = this.clientSideModeCfg.model;
		var length = this.clientSideModeCfg.model.length;
		var caseSensitive = this.clientSideModeCfg.caseSensitive;
		var rows = this.clientSideModeCfg.rows;
		var value = this.element.value;
		if (!caseSensitive) value = value.toLowerCase();
		var filter;
		switch (this.clientSideModeCfg.filterMatchMode) {
			case 'contains':
			filter = this.containsFilter;
			break;
			case 'exact':
			filter = this.exactFilter;
			break;
			case 'startsWith':
			filter = this.startsWithFilter;
			break;
			case 'endsWith':
			filter = this.endsWithFilter;
			break;
			default:
			filter = this.noFilter;
			break;
		}
		
		var rowCount = 0;
		var result = ice.ace.jq('<div />');
		for (var i = 0; i < length; i++) {
			var item = caseSensitive ? model[i] : model[i].toLowerCase();
			if (filter(item, value)) {
				rowCount++;
				result.append(data.get(i).cloneNode(true));
			}
			if (rowCount >= rows) break;
		}
		this.updateNOW('<div>'+result.html()+'</div>');
		this.showingList = true;
	},
	
	containsFilter: function(item, value) {
		return item.indexOf(value) > -1;
	},
	exactFilter: function(item, value) {
		return item == value;
	},
	startsWithFilter: function(item, value) {
		return item.indexOf(value) == 0;
	},
	endsWithFilter: function(item, value) {
		return item.indexOf(value, item.length - value.length) > -1;
	},
	noFilter: function(item, value) {
		return true;
	},
	
	isCharacterCode: function(keyCode) {
		if (keyCode == 8 || keyCode == 46) return true; // backspace, del
		if (keyCode >= 16 && keyCode <= 20) return false; // shift, ctrl, alt, pause, caps lock
		if (keyCode >= 33 && keyCode <= 40) return false; // pg up, pg down, end, home, arrow keys
		if (keyCode == 44 || keyCode == 45) return false; // print screen, insert
		if (keyCode == 144 || keyCode == 145) return false; // num lock, scroll lock
		if (keyCode >= 91 && keyCode <= 93) return false; // windows keys, context menu
		if (keyCode >= 112 && keyCode <= 123) return false; // f keys
		if (keyCode == 9 || keyCode == 10 || keyCode == 13 || keyCode ==  27) return false; // tab, lf, cr, esc
		return true;
	},
	
	isInteractive: function(element, container) {
		if (element) {
			var result;
			var currentNode = element;
			while (currentNode !== container) {
				result = this.isInteractiveElement(currentNode);
				if (result) return result;
				else currentNode = currentNode.parentNode;
			}
		}
		return false;
	},
	
	isInteractiveElement: function(element) {
		if (element) {
			var tag = element.tagName;
			if (tag) {
				tag = tag.toLowerCase();
				switch (tag) {
					case 'input':
					case 'select':
					case 'label':
					case 'textarea':
					case 'button':
					case 'a':
						return element;
				}
			}
		}
		return false;
	},
	
    updateNOW: function(text) {

		if (!text) return;
        if (this.hidden) {
            this.hidden = false;
        }
        this.hasFocus = true;
        ice.ace.Autocompleter.cleanWhitespace(this.update);
		if (ice.ace.jq.support.leadingWhitespace) { // browsers other than IE7/8
			this.updateChoices(text);
			this.show();
			this.render();
			this.element.focus();
		}
		else { // give time to IE7/8 to have nodes ready when the full form has been updated
			var self = this;
			setTimeout(function() { 
				self.updateChoices(text);
				self.show();
				self.render();
				if (focus) ice.ace.jq(ice.ace.escapeClientId(self.element.id)).focus(); 
			}, 50);
		}
    },
	
	updateField: function(value, focus) {
		var currentValue = this.element.value;
		if (currentValue.indexOf(value) != 0)
			this.element.value = value;
		if (focus && ice.ace.jq.support.leadingWhitespace) this.element.focus(); // browsers other than IE7/8
		if (!ice.ace.jq.support.leadingWhitespace) { // force IE7/8 to set focus on the text field
			var element = this.element;
			setTimeout(function() { if (focus) ice.ace.jq(ice.ace.escapeClientId(element.id)).focus(); }, 50);
		}
	},
	
	showEffect: function(update) {
		var list = ice.ace.jq(update);
		list.css('opacity', 1);
		var e = this.effects.show;
		e = e ? e.toLowerCase() : '';
		if (e == 'blind' || e == 'bounce' || e == 'clip' || e == 'drop' || e == 'explode'
				|| e == 'fold' || e == 'puff' || e == 'pulsate' || e == 'scale' || e == 'slide' || e == 'shake') {
			list.toggle(e, {}, this.effects.showLength);
		} else list.fadeIn(this.effects.showLength);
	},
	
	hideEffect: function(update) {
		var list = ice.ace.jq(update);
		var e = this.effects.hide;
		e = e ? e.toLowerCase() : '';
		if (e == 'blind' || e == 'bounce' || e == 'clip' || e == 'drop' || e == 'explode'
				|| e == 'fold' || e == 'puff' || e == 'pulsate' || e == 'scale' || e == 'slide') {
			list.toggle(e, {}, this.effects.hideLength);
		} else list.fadeOut(this.effects.hideLength);
	}
};
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

if (!ice.ace.ComboBoxes) ice.ace.ComboBoxes = {};

ice.ace.ComboBox = function(id, updateId, rowClass, highlightedRowClass, selectedRowClass, height, showListOnInput, behaviors, cfg, clientSideModeCfg, effects, placeholder) {
	this.id = id;
	var isInitialized = false;
	if (ice.ace.ComboBoxes[this.id] && ice.ace.ComboBoxes[this.id].initialized) isInitialized = true;
	if (isInitialized) this.selectedIndex = ice.ace.ComboBoxes[this.id].selectedIndex;
	ice.ace.ComboBoxes[this.id] = this;
	this.clientSideModeCfg = clientSideModeCfg;
	this.height = height == 0 ? 'auto' : height;
	this.direction = 'down';
	this.showListOnInput = showListOnInput;
	var options = {};
	this.root = ice.ace.jq(ice.ace.escapeClientId(this.id));
	var $box = this.root.find('.ui-combobox-value');
	var $element = this.root.find('input[type=text]');
	this.element = $element.get(0);
	this.element.id = this.id + "_input";
	this.hidden = this.root.find('input[type=hidden]').get(0);
	var $downArrowButton = $box.find('div');
	$element.css('width', $box.width() - $downArrowButton.outerWidth(true) - ($element.outerWidth(true) - $element.width()));
	this.downArrowButton = $downArrowButton.eq(0);
	this.downArrowButton.css('height', $box.height());
	var height = this.downArrowButton.height();
	var padding = (height - ice.ace.ComboBox.DELTA_HEIGHT) / 2;
	this.downArrowButton.children().eq(0).css('height', padding);
	if (ice.ace.jq.browser.msie) {// ie7 fix
		if (ice.ace.jq.browser.version < 8) {
			if (navigator.userAgent.indexOf("Trident/5") < 0) {
				$downArrowButton.css('height', '').css('position', 'absolute');
			}
		}
	}
	var $update = ice.ace.jq(ice.ace.escapeClientId(updateId))
	$update.css('width', $box.width());
	this.update = $update.get(0);
	this.cfg = cfg;
	this.effects = effects;
	if (placeholder && !('placeholder' in document.createElement('input'))) { // if 'placeholder' isn't supported, use label inField
		this.cfg.inFieldLabel = placeholder;
	}
	$element.data("labelIsInField", this.cfg.labelIsInField);
	
	if (isInitialized) {
		this.initialize(this.element, this.update, options, rowClass, highlightedRowClass, selectedRowClass, behaviors);
	} else {
        if (ice.ace.jq.trim($element.val()) == "" && this.cfg.inFieldLabel) {
            $element.val(this.cfg.inFieldLabel);
            $element.addClass(this.cfg.inFieldLabelStyleClass);
            $element.data("labelIsInField", true);
        }
		var self = this;
		var triggerInit = function() {
			$element.off('focus');
			$downArrowButton.off('click');
			if ($element.data("labelIsInField")) {
				self.element.value = '';
				$element.removeClass(self.cfg.inFieldLabelStyleClass);
				$element.data("labelIsInField", false);
				self.cfg.labelIsInField = false;
			}
			self.initialize(self.element, self.update, options, rowClass, highlightedRowClass, selectedRowClass, behaviors); 
		};
		$element.on('focus', triggerInit);
		$downArrowButton.on('click', triggerInit);
	}
};

ice.ace.ComboBox.setDimensionsOnly = function(id) {
	var root = ice.ace.jq(ice.ace.escapeClientId(id));
	var $box = root.find('.ui-combobox-value');
	var $element = root.find('input');
	var $downArrowButton = $box.find('div');
	$element.css('width', $box.width() - $downArrowButton.outerWidth(true) - ($element.outerWidth(true) - $element.width()));
	var downArrowButton = $downArrowButton.eq(0);
	downArrowButton.css('height', $box.height());
	var height = downArrowButton.height();
	var padding = (height - ice.ace.ComboBox.DELTA_HEIGHT) / 2;
	downArrowButton.children().eq(0).css('height', padding);
	if (ice.ace.jq.browser.msie) {// ie7 fix
		if (ice.ace.jq.browser.version < 8) {
			if (navigator.userAgent.indexOf("Trident/5") < 0) {
				$downArrowButton.css('height', '').css('position', 'absolute');
			}
		}
	}
};

ice.ace.ComboBox.LABEL_CLASS = 'ui-combobox-item-label';
ice.ace.ComboBox.VALUE_CLASS = 'ui-combobox-item-value';
ice.ace.ComboBox.IGNORE_CLASS = 'ui-combobox-item-ignore';
ice.ace.ComboBox.DELTA_WIDTH = 26;
ice.ace.ComboBox.DELTA_HEIGHT = 16;

ice.ace.ComboBox.keys = {
KEY_BACKSPACE: 8,
KEY_TAB:       9,
KEY_RETURN:   13,
KEY_ESC:      27,
KEY_LEFT:     37,
KEY_UP:       38,
KEY_RIGHT:    39,
KEY_DOWN:     40,
KEY_DELETE:   46,
KEY_HOME:     36,
KEY_END:      35,
KEY_PAGEUP:   33,
KEY_PAGEDOWN: 34,
KEY_INSERT:   45
};

ice.ace.ComboBox.Browser = (function() {
        var ua = navigator.userAgent;
        var isOpera = Object.prototype.toString.call(window.opera) == '[object Opera]';
        return {
            IE:             !!window.attachEvent && !isOpera,
            Opera:          isOpera,
            WebKit:         ua.indexOf('AppleWebKit/') > -1,
            Gecko:          ua.indexOf('Gecko') > -1 && ua.indexOf('KHTML') === -1,
            MobileSafari:   /Apple.*Mobile/.test(ua)
        }
    })();

ice.ace.ComboBox.collectTextNodes = function(element) {
	var children = element.childNodes;
	var str = '';
	for (var i = 0; i < children.length; i++) {
		var node = children[i];
		str += node.nodeType == 3 ? node.nodeValue : ( node.childNodes.length > 0 ? ice.ace.ComboBox.collectTextNodes(node) : '');
	}
	return str;
};

ice.ace.ComboBox.collectTextNodesIgnoreClass = function(element, className) {
	var children = element.childNodes;
	var str = '';
	for (var i = 0; i < children.length; i++) {
		var node = children[i];
		str += node.nodeType == 3 ? node.nodeValue : ( node.childNodes.length > 0 && !ice.ace.jq(node).hasClass(className) ? ice.ace.ComboBox.collectTextNodesIgnoreClass(node, className) : '' );
	}
	return str;
};

ice.ace.ComboBox.cleanWhitespace = function(element) {
	var node = element.firstChild;
	while (node) {
		var nextNode = node.nextSibling;
		if (node.nodeType == 3 && !/\S/.test(node.nodeValue))
			element.removeChild(node);
		node = nextNode;
	}
	return element;
};

ice.ace.ComboBox.prototype = {

    initialize: function(element, update, options, rowC, highlightedRowClass, selectedRowC, behaviors) {
        var self = this;
        this.hasFocus = false;
        this.changed = false;
        this.active = false;
        this.index = -1;
		if (!(typeof this.selectedIndex == 'number' && this.selectedIndex > -1)) this.selectedIndex = -1;
        this.rowClass = rowC;
		this.highlightedRowClass = highlightedRowClass;
        this.selectedRowClass = selectedRowC;

        if (this.setOptions)
            this.setOptions(options);
        else
            this.options = options || {};

        this.options.onShow = this.options.onShow ||
            function(element, update) {
                try {
					self.downArrowButton.addClass('ui-state-hover');
					self.calculateListPosition();
                    self.showEffect(update);
					self.active = true;
                } catch(e) {
                    //logger.info(e);
                }
            };
        this.options.onHide = this.options.onHide ||
            function(element, update) {
			self.downArrowButton.removeClass('ui-state-hover');
			self.hideEffect(update);
			self.active = false;
            };

        ice.ace.jq(this.update).hide();
		ice.ace.jq(this.element).on("blur", function(e) { self.onBlur.call(self, e); });
		ice.ace.jq(this.element).on("focus", function(e) { self.onFocus.call(self, e); });
		ice.ace.jq(this.downArrowButton).on("click", function(e) { self.onElementClick.call(self, e); });
		if (ice.ace.ComboBox.Browser.IE) {
			ice.ace.jq(this.downArrowButton).children().on("click", function(e) { 
				self.onElementClick.call(self, e); 
				e.stopPropagation();
				e.preventDefault();
			});
		}
        var keyEvent = "keypress";
        if (ice.ace.ComboBox.Browser.IE || ice.ace.ComboBox.Browser.WebKit) {
            keyEvent = "keydown";
        }
		ice.ace.jq(this.element).on(keyEvent, function(e) { self.onKeyPress.call(self, e); } );
		
		// ajax behaviors
		if (behaviors) {
			if (behaviors.behaviors) {
				if (behaviors.behaviors.change) {
					this.ajaxValueChange = behaviors.behaviors.change;
				}
				if (behaviors.behaviors.blur) {
					this.ajaxBlur = behaviors.behaviors.blur;
				}
			}
		}
		
		// prepare data model for autocomplete functionality
		this.setContent(ice.ace.jq(ice.ace.escapeClientId(this.id + '_update')).get(0).firstChild.innerHTML);
		
		this.initialized = true;
    },
	
	calculateListPosition: function() {
		var element = this.element;
		var update = this.update;
		if (update["style"] && (!update.style.position || update.style.position == 'absolute')) {
			update.style.position = 'absolute';
			var jqElement = ice.ace.jq(element);
			var jqUpdate = ice.ace.jq(update);
			var pos = jqElement.offset();
			var autoUp = false;
			if (this.direction == 'auto') {
				var updateHeight = jqUpdate.height();
				updateHeight = updateHeight > this.height ? this.height : updateHeight;
				var winHeight = ice.ace.jq(window).height();
				var docHeight = ice.ace.jq(document).height();
				var scrollTop = ice.ace.jq(document).scrollTop()
				var lengthAbove = pos.top - scrollTop;
				var lengthBelow = scrollTop + winHeight - pos.top - element.offsetHeight;
				if (lengthBelow < updateHeight) {
					if (lengthAbove > lengthBelow)
						autoUp = true;
				}
			}
			if (this.direction == 'up' || autoUp) {
				var updateHeight = jqUpdate.height();
				updateHeight = updateHeight > this.height ? this.height : updateHeight;
				jqUpdate.css({ position: "absolute", marginTop: 0, marginLeft: 0, maxHeight: this.height, overflow: "auto" });
				var savedPos = element.style.position;
				element.style.position = "relative";
				update.style.left = element.offsetLeft + "px";
				update.style.top = (element.offsetTop - updateHeight) + "px";
				element.style.position = savedPos;
			} else {
				jqUpdate.css({ position: "absolute", marginTop: 0, marginLeft: 0, maxHeight: this.height, overflow: "auto" });
				var savedPos = element.style.position;
				element.style.position = "relative";
				update.style.left = element.offsetLeft + "px";
				update.style.top = (element.offsetTop + element.offsetHeight) + "px";
				element.style.position = savedPos;
			}
		}
	},

    show: function() {
        try {
            if (ice.ace.jq(this.update).css('display') == 'none')this.options.onShow(this.element, this.update);
            if (!this.iefix &&
                (navigator.appVersion.indexOf('MSIE') > 0) &&
                (navigator.userAgent.indexOf('Opera') < 0) &&
                (ice.ace.jq(this.update).css('position') == 'absolute')) {
                ice.ace.jq('<iframe id="' + this.update.id + '_iefix" title="IE6_Fix" ' +
                        'style="display:none;position:absolute;filter:progid:DXImageTransform.Microsoft.Alpha(opacity=0);" ' +
                        'src="javascript:\'<html></html>\'" frameborder="0" scrolling="no"></iframe>').insertAfter(this.update);
                this.iefix = ice.ace.jq('#' + this.update.id + '_iefix').get(0);
            }
		  var self = this;
            if (this.iefix) setTimeout(function() { self.fixIEOverlapping.call(self) }, 50);
            this.element.focus();
        } catch (e) {
            //logger.info(e);
        }
    },

    fixIEOverlapping: function() {
        try {
		var pos = ice.ace.jq(this.update).offset();
            ice.ace.jq(this.iefix).css(pos);
            this.iefix.style.zIndex = 1;
            this.update.style.zIndex = 2;
            ice.ace.jq(this.iefix).show();
        } catch(e) {
            //logger.info(e);
        }
    },

    hide: function() {
        this.stopIndicator();
        if (ice.ace.jq(this.update).css('display') != 'none') this.options.onHide(this.element, this.update);
        if (this.iefix) ice.ace.jq(this.iefix).hide();
    },

    startIndicator: function() {
        if (this.options.indicator) ice.ace.jq(this.options.indicator).show();
    },

    stopIndicator: function() {
        if (this.options.indicator) ice.ace.jq(this.options.indicator).hide();
    },

    onKeyPress: function(event) {
		this.hidden.value = this.element.value;
        if (!this.active) {
            switch (event.keyCode) {
                case ice.ace.ComboBox.keys.KEY_TAB:
					ice.setFocus('');
					return;
                case ice.ace.ComboBox.keys.KEY_RETURN:
                    this.getUpdatedChoices(true, event, -1);
					event.stopPropagation();
					event.preventDefault();
                    return;
				case ice.ace.ComboBox.keys.KEY_UP:
					var self = this;
					setTimeout(function(){self.clientSideModeUpdate();},50);
					event.stopPropagation();
					event.preventDefault();
                    return;
                case ice.ace.ComboBox.keys.KEY_DOWN:
					var self = this;
					setTimeout(function(){self.clientSideModeUpdate();},50);
					event.stopPropagation();
					event.preventDefault();
                    return;
				default:
					this.hidden.value = this.element.value;
					if (this.showListOnInput) {
						var self = this;
						setTimeout(function(){self.clientSideModeUpdate();},50);
					}
					return;
            }
        } else {
			switch (event.keyCode) {
                case ice.ace.ComboBox.keys.KEY_TAB:
					ice.setFocus('');
					return;
                case ice.ace.ComboBox.keys.KEY_RETURN:
					var idx = this.selectEntry();
					this.getUpdatedChoices(true, event, idx);
					this.hide();
					event.stopPropagation();
					event.preventDefault();
                    return;
                case ice.ace.ComboBox.keys.KEY_ESC:
                    this.hide();
					event.stopPropagation();
					event.preventDefault();
                    return;
                case ice.ace.ComboBox.keys.KEY_UP:
                    this.markPrevious();
                    this.render();
					event.stopPropagation();
					event.preventDefault();
                    return;
                case ice.ace.ComboBox.keys.KEY_DOWN:
                    this.markNext();
                    this.render();
					event.stopPropagation();
					event.preventDefault();
                    return;
				default:
					var self = this;
					setTimeout(function(){self.clientSideModeUpdate();},50);
					return;
            }
        }
    },

    activate: function() {
        this.changed = false;
        this.hasFocus = true;
    },

    onHover: function(event) {
		var element = ice.ace.jq(event.currentTarget).closest('div').get(0);
        if (this.index != element.autocompleteIndex) {
            if (!this.skip_mouse_hover) this.index = element.autocompleteIndex;
            this.render();
        }
		event.stopPropagation();
		event.preventDefault();
    },

    onMove: function(event) {
        if (this.skip_mouse_hover) {
            this.skip_mouse_hover = false;
            this.onHover(event);
        }
    },

    onClick: function(event) {
		if (this.ieScrollbarFixObserver) clearTimeout(this.ieScrollbarFixObserver);
		var $element = ice.ace.jq(event.currentTarget).closest('div');
		var element = $element.get(0);
        this.index = element.autocompleteIndex;
        var idx = element.autocompleteIndex;
		var interactiveElement = this.isInteractive(event.target, element);
		if (!$element.hasClass('ui-state-disabled') && !interactiveElement) {
			this.selectEntry();
			this.getUpdatedChoices(true, event, idx);
			this.hide();
		}
		if (interactiveElement) {
			var self = this;
			var jqInteractiveElement = ice.ace.jq(interactiveElement);
			if (!jqInteractiveElement.data("onBlurHandlerRegistered")) {
				jqInteractiveElement.one('blur', function() {jqInteractiveElement.data("onBlurHandlerRegistered", false);self.onBlur();});
				jqInteractiveElement.data("onBlurHandlerRegistered", true);
			}
		}
		if (this.hideObserver) clearTimeout(this.hideObserver);
		if (this.blurObserver) clearTimeout(this.blurObserver);
    },

    onBlur: function(event) {
		var $box = this.root.find('.ui-combobox-value');
		// check if last click was done on scrollbar
		if (navigator.userAgent.indexOf("MSIE") >= 0) {
			var n = this.height;
			if (n!=null && n!='' && typeof n === 'number' && n % 1 == 0) {
				var posx=0; var posy=0;
				var e = window.event;
				if (e.pageX || e.pageY) {
					posx = e.pageX;
					posy = e.pageY;
				} else if (e.clientX || e.clientY) {
					posx = e.clientX + document.body.scrollLeft + document.documentElement.scrollLeft;
					posy = e.clientY + document.body.scrollTop + document.documentElement.scrollTop;
				}
				var widthX=$box.position().left+$box.width();
				var heightX=$box.position().top+$box.height()+parseFloat(this.height)+10;
				if ( this.active && (posx>$box.position().left && posx<=widthX) && (posy>$box.position().top && posy<heightX) ) {
					var self = this;
					this.ieScrollbarFixObserver = setTimeout(function(){self.element.focus();}, 200);
					return;
				}
			}
		}
		var self = this;
        this.hideObserver = setTimeout(function () { // needed to make click events work
				self.hide();
				var element = ice.ace.jq(self.element);
				if (ice.ace.jq.trim(self.element.value) == '' && self.cfg.inFieldLabel) {
					self.element.value = self.cfg.inFieldLabel;
					element.addClass(self.cfg.inFieldLabelStyleClass);
					element.data("labelIsInField", true);
				}
			}, 400);
        this.hasFocus = false;
		ice.setFocus('');
		if (this.ajaxBlur) {
			if (this.blurObserver) clearTimeout(this.blurObserver);
			this.ajaxBlur.params = this.ajaxBlur.params || {};
			var self = this;
			this.blurObserver = setTimeout(function() { try{ice.ace.ab(self.ajaxBlur);}catch(e){} }, 390);
		}
    },

    onFocus: function(event) {
        var element = ice.ace.jq(this.element);
        if (element.data("labelIsInField")) {
			this.element.value = '';
            element.removeClass(this.cfg.inFieldLabelStyleClass);
            element.data("labelIsInField", false);
        }
		
		// place caret at the end of text
		if (this.element.createTextRange) { //IE
			if (this.element.value.length > 0) {
				var fieldRange = this.element.createTextRange();
				fieldRange.moveStart('character', this.element.value.length);
				fieldRange.collapse(false);
				fieldRange.select();
			}
		} else { // other browsers
			var length = this.element.value.length;
			this.element.setSelectionRange(length, length);
		}
    },
	
	onElementClick: function(event) {
		if (this.active) {
			this.hide();
			if (this.hideObserver) clearTimeout(this.hideObserver);
			if (this.blurObserver) clearTimeout(this.blurObserver);
			this.element.focus();
		} else {
			if (this.hideObserver) clearTimeout(this.hideObserver);
			if (this.blurObserver) clearTimeout(this.blurObserver);
			this.clientSideModeUpdate(this.noFilter);
		}
	},

    render: function() {
        if (this.entryCount > 0) {
			this.updateSelectedIndex();
            for (var i = 0; i < this.entryCount; i++)
				if (this.selectedIndex == i) {
                    ar = this.rowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).removeClass(ar[ai]);
                    ar = this.highlightedRowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).removeClass(ar[ai]);
                    ar = this.selectedRowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).addClass(ar[ai]);				
				} else if (this.index == i) {
					if (!ice.ace.jq(this.getEntry(i)).hasClass('ui-state-disabled')) {
						ar = this.rowClass.split(" ");
						for (var ai = 0; ai < ar.length; ai++)
							ice.ace.jq(this.getEntry(i)).removeClass(ar[ai]);
						ar = this.highlightedRowClass.split(" ");
						for (var ai = 0; ai < ar.length; ai++)
							ice.ace.jq(this.getEntry(i)).addClass(ar[ai]);
					}
                } else {
                    ar = this.highlightedRowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).removeClass(ar[ai]);
                    ar = this.rowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).addClass(ar[ai]);
                }
            if (this.hasFocus) {
                this.show();
            }
        } else {
            this.hide();
        }
    },
	
	markFirst: function() {
		this.index = -1;
		this.markNext();
	},

    markPrevious: function() {
		// we skip disabled entries
		var found = false;
		var i = this.index;
		while (true) {
			if (i > 0) i--
			else i = this.entryCount - 1;
			var entry = this.getEntry(i);
			if (entry && !ice.ace.jq(entry).hasClass('ui-state-disabled')) {
				found = true;
				break;
			}
			if (i == this.index) break; // we did one full loop already
			if (this.index == -1 && i == 0) break; // special case
		}
		if (found) {
			this.index = i;
			this.scrollToMarkedItem();
		}
    },

    markNext: function() {
		// we skip disabled entries
		var found = false;
		var i = this.index;
		while (true) {
			if (i < this.entryCount - 1) i++;
			else i = 0;
			var entry = this.getEntry(i);
			if (entry && !ice.ace.jq(entry).hasClass('ui-state-disabled')) {
				found = true;
				break;
			}
			if (i == this.index) break; // we did one full loop already
			if (this.index == -1 && i == this.entryCount) break; // special case
		}
		if (found) {
			this.index = i;
			this.scrollToMarkedItem();
		}
    },
	
	markFirstMatch: function() {
		// we skip disabled entries
		var found = false;
		var i;
		for (i = 0; i < this.entryCount; i++) {
			var entry = this.getEntry(i);
			if (entry && !ice.ace.jq(entry).hasClass('ui-state-disabled')) {
				var labelRoot = ice.ace.jq(entry).children('.'+ice.ace.ComboBox.LABEL_CLASS).get(0);
				if (labelRoot) {
					var entryValue = ice.ace.ComboBox.collectTextNodesIgnoreClass(labelRoot, ice.ace.ComboBox.IGNORE_CLASS);
					if (entryValue) {
						entryValue = ice.ace.jq.trim(entryValue);
						entryValue = entryValue.toLowerCase();
						var mainValue = this.element.value.toLowerCase();
						if (entryValue.indexOf(mainValue) == 0) {
							found = true;
							break;
						}
					}
				}
			}
		}
		if (found) {
			this.index = i;
			this.scrollToMarkedItem();
		}	
	},
	
	scrollToMarkedItem: function() {
		if (this.active) {
			var entry = this.getEntry(this.index);
			if (entry) {
				var itemTop = ice.ace.jq(entry).position().top;
				var $update = ice.ace.jq(this.update);
				if (itemTop < 0 || itemTop > $update.height()) {
					$update.scrollTop($update.scrollTop() + itemTop);
				}
			}
		}
	},

    getEntry: function(index) {
        try {
            return this.update.firstChild.childNodes[index];
        } catch(ee) {
            return null;
        }
    },
	
	getEntryFromContent: function(index) {
		if (index >= 0) {
			return this.$content.get(index);
		} else {
			return null;
		}
	},

    getCurrentEntry: function() {
        return this.getEntry(this.index);
    },

    selectEntry: function() {
        var idx = -1;
        if (this.index >= 0) {
            idx = this.index;
			this.selectedIndex = this.index;
            this.updateElement(this.getCurrentEntry());
            this.index = -1;
        }
        return idx;
    },

    updateElement: function(selectedEntry) {
        var value = '';
        value = ice.ace.ComboBox.collectTextNodesIgnoreClass(selectedEntry, ice.ace.ComboBox.LABEL_CLASS);

		this.updateValue(value);
        this.element.focus();
    },

    updateChoices: function(choices) {
        if (!this.changed && this.hasFocus) {
            this.update.innerHTML = choices;
			this.calculateListPosition();
            ice.ace.ComboBox.cleanWhitespace(this.update);
            ice.ace.ComboBox.cleanWhitespace(this.update.firstChild);

            if (this.update.firstChild && this.update.firstChild.childNodes) {
                this.entryCount =
                    this.update.firstChild.childNodes.length;
                for (var i = 0; i < this.entryCount; i++) {
                    var entry = this.getEntry(i);
                    entry.autocompleteIndex = i;
                    this.addObservers(entry);
                }
            } else {
                this.entryCount = 0;
            }
            this.stopIndicator();
            this.index = -1;
            this.render();
        } else {

        }
    },

    addObservers: function(element) {
		var self = this;
		ice.ace.jq(element).on("mouseover", function(e) { self.onHover.call(self, e); });
		ice.ace.jq(element).on("click", function(e) { self.onClick.call(self, e); });
		ice.ace.jq(element).on("mousemove", function(e) { self.onMove.call(self, e); });
    },

    dispose:function() {
        for (var i = 0; i < this.entryCount; i++) {
            var entry = this.getEntry(i);
            entry.autocompleteIndex = i;
			ice.ace.jq(entry).off('mouseover');
			ice.ace.jq(entry).off('click');
			ice.ace.jq(entry).off('mousemove');
        }
		ice.ace.jq(this.element).off('mouseover');
		ice.ace.jq(this.element).off('click');
		ice.ace.jq(this.element).off('mousemove');
		ice.ace.jq(this.element).off('blur');
		ice.ace.jq(this.element).off('keypress');
        if (ice.ace.ComboBox.Browser.IE || ice.ace.ComboBox.Browser.WebKit)
			ice.ace.jq(this.element).off('keydown');
    },

    onObserverEvent: function() {
        this.changed = false;
        this.startIndicator();
        this.getUpdatedChoices(false, undefined, -1);
    },

    getUpdatedChoices: function(isHardSubmit, event, idx) {
        if (!event) {
            event = new Object();
        }

		if (this.blurObserver) clearTimeout(this.blurObserver);
		if (this.ajaxValueChange) {
			var ajaxCfg = {};
			var options = {params: {}};
			options.params['ice.event.keycode'] = event.keyCode;
			ice.ace.jq.extend(ajaxCfg, this.ajaxValueChange, options);
			ice.ace.ab(ajaxCfg);
		}
    },
	
	clientSideModeUpdate: function(filter) {
		
		var model = this.clientSideModeCfg.model;
		var length = model.length;
		var caseSensitive = this.clientSideModeCfg.caseSensitive;
		var rows = this.clientSideModeCfg.rows;
		var value = this.element.value;
		if (!caseSensitive) value = value.toLowerCase();
		if (!filter) { 
			switch (this.clientSideModeCfg.filterMatchMode) {
				case 'contains':
				filter = this.containsFilter;
				break;
				case 'exact':
				filter = this.exactFilter;
				break;
				case 'startsWith':
				filter = this.startsWithFilter;
				break;
				case 'endsWith':
				filter = this.endsWithFilter;
				break;
				default:
				filter = this.noFilter;
				break;
			}
		}
		
		var rowCount = 0;
		var result = ice.ace.jq('<div />');
		for (var i = 0; i < length; i++) {
			if (model[i]) {
				var item = caseSensitive ? model[i] : model[i].toLowerCase();
				if (filter(item, value)) {
					rowCount++;
					result.append(this.$content.get(i).cloneNode(true));
				}
				if (rowCount >= rows) break;
			}
		}
		this.updateNOW('<div>'+result.html()+'</div>');
		if (filter == this.noFilter) {
			this.markFirstMatch();
		} else {
			this.markFirst();
		}
		this.render();
	},
	
	containsFilter: function(item, value) {
		return item.indexOf(value) > -1;
	},
	exactFilter: function(item, value) {
		return item == value;
	},
	startsWithFilter: function(item, value) {
		return item.indexOf(value) == 0;
	},
	endsWithFilter: function(item, value) {
		return item.indexOf(value, item.length - value.length) > -1;
	},
	noFilter: function(item, value) {
		return true;
	},
	
	isCharacterCode: function(keyCode) {
		if (keyCode == 8 || keyCode == 46) return true; // backspace, del
		if (keyCode >= 16 && keyCode <= 20) return false; // shift, ctrl, alt, pause, caps lock
		if (keyCode >= 33 && keyCode <= 40) return false; // pg up, pg down, end, home, arrow keys
		if (keyCode == 44 || keyCode == 45) return false; // print screen, insert
		if (keyCode == 144 || keyCode == 145) return false; // num lock, scroll lock
		if (keyCode >= 91 && keyCode <= 93) return false; // windows keys, context menu
		if (keyCode >= 112 && keyCode <= 123) return false; // f keys
		if (keyCode == 9 || keyCode == 10 || keyCode == 13 || keyCode ==  27) return false; // tab, lf, cr, esc
		return true;
	},
	
	isInteractive: function(element, container) {
		if (element) {
			var result;
			var currentNode = element;
			while (currentNode !== container) {
				result = this.isInteractiveElement(currentNode);
				if (result) return result;
				else currentNode = currentNode.parentNode;
			}
		}
		return false;
	},
	
	isInteractiveElement: function(element) {
		if (element) {
			var tag = element.tagName;
			if (tag) {
				tag = tag.toLowerCase();
				switch (tag) {
					case 'input':
					case 'select':
					case 'label':
					case 'textarea':
					case 'button':
					case 'a':
						return element;
				}
			}
		}
		return false;
	},
	
	setContent: function(content) {
		this.content = content;
		this.$content = ice.ace.jq(this.content).children();
		this.entryCount = this.$content.size();
		
		if (this.clientSideModeCfg) {
			var model = [];
			var markup = [];
			var n = this.entryCount;
			var i;
			for (i = 0; i < n; i++) {
				var entry = this.$content.get(i);
				if (entry && !ice.ace.jq(entry).hasClass('ui-state-disabled')) {
					var labelRoot = ice.ace.jq(entry).children('.'+ice.ace.ComboBox.LABEL_CLASS).get(0);
					if (labelRoot) {
						var entryValue = ice.ace.ComboBox.collectTextNodesIgnoreClass(labelRoot, ice.ace.ComboBox.IGNORE_CLASS);
						if (entryValue) {
							entryValue = ice.ace.jq.trim(entryValue);
						} else {
							entryValue = '';
						}
						model.push(entryValue);
					}
				} else {
					model.push(null);
				}
			}
			this.clientSideModeCfg.model = model;
		}
	},

    updateNOW: function(text) {

		if (!text) return;
        this.hasFocus = true;
        ice.ace.ComboBox.cleanWhitespace(this.update);
		this.updateChoices(text);
		this.show();
		this.render();
		this.element.focus();
    },
	
	updateValue: function(value) {
		if (value) {
			this.hidden.value = value;
		} else {
			this.hidden.value = '';
			var element = ice.ace.jq(this.element);
			if (this.cfg.inFieldLabel) {
				this.element.value = this.cfg.inFieldLabel;
				element.addClass(this.cfg.inFieldLabelStyleClass);
				element.data("labelIsInField", true);
			} else {
				this.element.value = '';
			}
		}
		this.updateSelectedIndex();
		// update label
		if (value) {
			var currentEntry = this.getEntryFromContent(this.selectedIndex);
			if (currentEntry) {
				var labelSpan = ice.ace.jq(currentEntry).find('.'+ice.ace.ComboBox.LABEL_CLASS).get(0);
				var label = ice.ace.ComboBox.collectTextNodesIgnoreClass(labelSpan, ice.ace.ComboBox.IGNORE_CLASS);
				this.element.value = label;
			} else {
				this.element.value = value;
			}
		}
	},
	
	// update selected index if value was changed programmatically or was pre-selected
	updateSelectedIndex: function() {
		if (typeof this.selectedIndex != 'number' && !this.selectedIndex) this.selectedIndex = -1;
		var found = false;
		var size = this.$content.length;
		for (var i = 0; i < size; i++) {
			var entry = this.getEntryFromContent(i);
			if (entry && (this.hidden.value == ice.ace.ComboBox.collectTextNodesIgnoreClass(entry, ice.ace.ComboBox.LABEL_CLASS))) {
				found = true;
				this.selectedIndex = i;
				break;
			}
		}
		if (!found) this.selectedIndex = -1;
	},
	
	showEffect: function(update) {
		var list = ice.ace.jq(update);
		list.css('opacity', 1);
		var e = this.effects.show;
		e = e ? e.toLowerCase() : '';
		if (e == 'blind' || e == 'bounce' || e == 'clip' || e == 'drop' || e == 'explode'
				|| e == 'fold' || e == 'puff' || e == 'pulsate' || e == 'scale' || e == 'slide' || e == 'shake') {
			list.show(e, {}, this.effects.showLength);
		} else list.fadeIn(this.effects.showLength);
	},
	
	hideEffect: function(update) {
		var list = ice.ace.jq(update);
		var e = this.effects.hide;
		e = e ? e.toLowerCase() : '';
		if (e == 'blind' || e == 'bounce' || e == 'clip' || e == 'drop' || e == 'explode'
				|| e == 'fold' || e == 'puff' || e == 'pulsate' || e == 'scale' || e == 'slide') {
			list.hide(e, {}, this.effects.hideLength);
		} else list.fadeOut(this.effects.hideLength);
	}
};
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

if (!ice.ace.SelectMenus) ice.ace.SelectMenus = {};

ice.ace.SelectMenu = function(id, updateId, rowClass, highlightedRowClass, selectedRowClass, height, behaviors, cfg, effects) {
	this.id = id;
	var isInitialized = false;
	if (ice.ace.SelectMenus[this.id] && ice.ace.SelectMenus[this.id].initialized) isInitialized = true;
	if (isInitialized) this.selectedIndex = ice.ace.SelectMenus[this.id].selectedIndex;
	ice.ace.SelectMenus[this.id] = this;
	this.height = height == 0 ? 'auto' : height;
	this.direction = 'down';
	var options = {};
	this.root = ice.ace.jq(ice.ace.escapeClientId(this.id));
	var $element = this.root.find('.ui-selectmenu-value');
	this.element = $element.get(0);
	this.element.id = this.id + "_input";
	this.displayedValue = $element.find('span').get(0);
	this.$downArrowButton = $element.find('div').eq(0);
	var $displayedValue = ice.ace.jq(this.displayedValue);
	$displayedValue.css('width', $element.width() - this.$downArrowButton.outerWidth(true) - ($displayedValue.outerWidth(true) - $displayedValue.width()));
	if (ice.ace.jq.browser.msie) {// ie7 fix
		if (ice.ace.jq.browser.version < 8) {
			if (navigator.userAgent.indexOf("Trident/5") < 0) {
				this.$downArrowButton.css('position', 'absolute');
			}
		}
	}
	this.adjustDownArrowButtonHeight();
	var $input = this.root.find('input[name="'+this.id+'_input"]');
	this.input = $input.get(0);
	this.input.id = this.id + "_input";
	var $update = ice.ace.jq(ice.ace.escapeClientId(updateId))
	$update.css('width', $element.width());
	this.update = $update.get(0);
	this.cfg = cfg;
	this.effects = effects;
	$element.data("labelIsInField", this.cfg.labelIsInField);
	
	if (isInitialized) {
		this.initialize(this.element, this.update, options, rowClass, highlightedRowClass, selectedRowClass, behaviors);
	} else {
		var self = this;
		$element.on('focus', function() {
			$element.off('focus');
			if (ice.ace.SelectMenu.Browser.IE) { $element.children().off('click'); }
			if ($element.data("labelIsInField")) {
				self.displayedValue.innerHTML = '&nbsp;';
				$element.removeClass(self.cfg.inFieldLabelStyleClass);
				$element.data("labelIsInField", false);
				self.cfg.labelIsInField = false;
			}
			self.initialize(self.element, self.update, options, rowClass, highlightedRowClass, selectedRowClass, behaviors);
			if (ice.ace.SelectMenu.Browser.IE) {
				self.updateNOW(self.content);
			}
		});
		if (ice.ace.SelectMenu.Browser.IE) {
			$element.children().on('click', function(e) {
				$element.off('focus');
				$element.children().off('click');
				if ($element.data("labelIsInField")) {
					self.displayedValue.innerHTML = '&nbsp;';
					$element.removeClass(self.cfg.inFieldLabelStyleClass);
					$element.data("labelIsInField", false);
					self.cfg.labelIsInField = false;
				}
				self.initialize(self.element, self.update, options, rowClass, highlightedRowClass, selectedRowClass, behaviors); 
				e.stopPropagation();
				e.preventDefault();
				if (ice.ace.SelectMenu.Browser.IE) {
					self.updateNOW(self.content);
				}
			});
		}
	}
};

ice.ace.SelectMenu.LABEL_CLASS = 'ui-selectmenu-item-label';
ice.ace.SelectMenu.VALUE_CLASS = 'ui-selectmenu-item-value';
ice.ace.SelectMenu.IGNORE_CLASS = 'ui-selectmenu-item-ignore';

ice.ace.SelectMenu.keys = {
KEY_BACKSPACE: 8,
KEY_TAB:       9,
KEY_RETURN:   13,
KEY_ESC:      27,
KEY_LEFT:     37,
KEY_UP:       38,
KEY_RIGHT:    39,
KEY_DOWN:     40,
KEY_DELETE:   46,
KEY_HOME:     36,
KEY_END:      35,
KEY_PAGEUP:   33,
KEY_PAGEDOWN: 34,
KEY_INSERT:   45
};

ice.ace.SelectMenu.Browser = (function() {
        var ua = navigator.userAgent;
        var isOpera = Object.prototype.toString.call(window.opera) == '[object Opera]';
        return {
            IE:             !!window.attachEvent && !isOpera,
            Opera:          isOpera,
            WebKit:         ua.indexOf('AppleWebKit/') > -1,
            Gecko:          ua.indexOf('Gecko') > -1 && ua.indexOf('KHTML') === -1,
            MobileSafari:   /Apple.*Mobile/.test(ua)
        }
    })();

ice.ace.SelectMenu.collectTextNodes = function(element) {
	var children = element.childNodes;
	var str = '';
	for (var i = 0; i < children.length; i++) {
		var node = children[i];
		str += node.nodeType == 3 ? node.nodeValue : ( node.childNodes.length > 0 ? ice.ace.SelectMenu.collectTextNodes(node) : '');
	}
	return str;
};

ice.ace.SelectMenu.collectTextNodesIgnoreClass = function(element, className) {
	var children = element.childNodes;
	var str = '';
	for (var i = 0; i < children.length; i++) {
		var node = children[i];
		str += node.nodeType == 3 ? node.nodeValue : ( node.childNodes.length > 0 && !ice.ace.jq(node).hasClass(className) ? ice.ace.SelectMenu.collectTextNodesIgnoreClass(node, className) : '' );
	}
	return str;
};

ice.ace.SelectMenu.cleanWhitespace = function(element) {
	var node = element.firstChild;
	while (node) {
		var nextNode = node.nextSibling;
		if (node.nodeType == 3 && !/\S/.test(node.nodeValue))
			element.removeChild(node);
		node = nextNode;
	}
	return element;
};

ice.ace.SelectMenu.prototype = {

    initialize: function(element, update, options, rowC, highlightedRowClass, selectedRowC, behaviors) {
        var self = this;
        this.hasFocus = false;
        this.changed = false;
        this.active = false;
        this.index = -1;
		if (!(typeof this.selectedIndex == 'number' && this.selectedIndex > -1)) this.selectedIndex = -1;
        this.rowClass = rowC;
		this.highlightedRowClass = highlightedRowClass;
        this.selectedRowClass = selectedRowC;

        if (this.setOptions)
            this.setOptions(options);
        else
            this.options = options || {};

        this.options.onShow = this.options.onShow ||
            function(element, update) {
                try {
					self.$downArrowButton.addClass('ui-state-hover');
					self.calculateListPosition();
                    self.showEffect(update);
                } catch(e) {
                    //logger.info(e);
                }
            };
        this.options.onHide = this.options.onHide ||
            function(element, update) {
			self.$downArrowButton.removeClass('ui-state-hover');
			self.hideEffect(update);
            };

        ice.ace.jq(this.update).hide();
		ice.ace.jq(this.element).on("blur", function(e) { self.onBlur.call(self, e); });
		ice.ace.jq(this.element).on("focus", function(e) { self.onFocus.call(self, e); });
		ice.ace.jq(this.element).on("click", function(e) {
            self.onElementClick.call(self, e);
        });
		if (ice.ace.SelectMenu.Browser.IE) {
			ice.ace.jq(this.element).children().on("click", function(e) { 
				self.onElementClick.call(self, e); 
				e.stopPropagation();
				e.preventDefault();
			});
		}
        var keyEvent = "keypress";
        if (ice.ace.SelectMenu.Browser.IE || ice.ace.SelectMenu.Browser.WebKit) {
            keyEvent = "keydown";
        }
		ice.ace.jq(this.element).on(keyEvent, function(e) { self.onKeyPress.call(self, e); } );
		
		// ajax behaviors
		if (behaviors) {
			if (behaviors.behaviors) {
				if (behaviors.behaviors.change) {
					this.ajaxValueChange = behaviors.behaviors.change;
				}
				if (behaviors.behaviors.blur) {
					this.ajaxBlur = behaviors.behaviors.blur;
				}
			}
		}
		
		this.initialized = true;
    },
	
	calculateListPosition: function() {
		var element = this.element;
		var update = this.update;
		if (update["style"] && (!update.style.position || update.style.position == 'absolute')) {
			update.style.position = 'absolute';
			var jqElement = ice.ace.jq(element);
			var jqUpdate = ice.ace.jq(update);
			var pos = jqElement.offset();
			var autoUp = false;
			if (this.direction == 'auto') {
				var updateHeight = jqUpdate.height();
				updateHeight = updateHeight > this.height ? this.height : updateHeight;
				var winHeight = ice.ace.jq(window).height();
				var docHeight = ice.ace.jq(document).height();
				var scrollTop = ice.ace.jq(document).scrollTop()
				var lengthAbove = pos.top - scrollTop;
				var lengthBelow = scrollTop + winHeight - pos.top - element.offsetHeight;
				if (lengthBelow < updateHeight) {
					if (lengthAbove > lengthBelow)
						autoUp = true;
				}
			}
			if (this.direction == 'up' || autoUp) {
				var updateHeight = jqUpdate.height();
				updateHeight = updateHeight > this.height ? this.height : updateHeight;
				jqUpdate.css({ position: "absolute", marginTop: 0, marginLeft: 0, maxHeight: this.height, overflow: "auto" });
				var savedPos = element.style.position;
				element.style.position = "relative";
				update.style.left = element.offsetLeft + "px";
				update.style.top = (element.offsetTop - updateHeight) + "px";
				element.style.position = savedPos;
			} else {
				jqUpdate.css({ position: "absolute", marginTop: 0, marginLeft: 0, maxHeight: this.height, overflow: "auto" });
				var savedPos = element.style.position;
				element.style.position = "relative";
				update.style.left = element.offsetLeft + "px";
				update.style.top = (element.offsetTop + element.offsetHeight - 1) + "px";
				element.style.position = savedPos;
			}
		}
	},

    show: function() {
        try {
            if (ice.ace.jq(this.update).css('display') == 'none')this.options.onShow(this.element, this.update);
            if (!this.iefix &&
                (navigator.appVersion.indexOf('MSIE') > 0) &&
                (navigator.userAgent.indexOf('Opera') < 0) &&
                (ice.ace.jq(this.update).css('position') == 'absolute')) {
                ice.ace.jq('<iframe id="' + this.update.id + '_iefix" title="IE6_Fix" ' +
                        'style="display:none;position:absolute;filter:progid:DXImageTransform.Microsoft.Alpha(opacity=0);" ' +
                        'src="javascript:\'<html></html>\'" frameborder="0" scrolling="no"></iframe>').insertAfter(this.update);
                this.iefix = ice.ace.jq('#' + this.update.id + '_iefix').get(0);
            }
		  var self = this;
            if (this.iefix) setTimeout(function() { self.fixIEOverlapping.call(self) }, 50);
            this.element.focus();
        } catch (e) {
            //logger.info(e);
        }
    },

    fixIEOverlapping: function() {
        try {
		var pos = ice.ace.jq(this.update).offset();
            ice.ace.jq(this.iefix).css(pos);
            this.iefix.style.zIndex = 1;
            this.update.style.zIndex = 2;
            ice.ace.jq(this.iefix).show();
        } catch(e) {
            //logger.info(e);
        }
    },

    hide: function() {
		this.active = false;
        this.stopIndicator();
        if (ice.ace.jq(this.update).css('display') != 'none') this.options.onHide(this.element, this.update);
        if (this.iefix) ice.ace.jq(this.iefix).hide();
    },

    startIndicator: function() {
        if (this.options.indicator) ice.ace.jq(this.options.indicator).show();
    },

    stopIndicator: function() {
        if (this.options.indicator) ice.ace.jq(this.options.indicator).hide();
    },

    onKeyPress: function(event) {
        if (!this.active) {
            switch (event.keyCode) {
                case ice.ace.SelectMenu.keys.KEY_TAB:
					ice.setFocus('');
					return;
                case ice.ace.SelectMenu.keys.KEY_RETURN:
                    this.getUpdatedChoices(true, event, -1);
					event.stopPropagation();
					event.preventDefault();
                    return;
				case ice.ace.SelectMenu.keys.KEY_UP:
					this.index = this.selectedIndex;
                    this.markPrevious();
					this.selectEntry();
					event.stopPropagation();
					event.preventDefault();
                    return;
                case ice.ace.SelectMenu.keys.KEY_DOWN:
					this.index = this.selectedIndex;
                    this.markNext();
					this.selectEntry();
					event.stopPropagation();
					event.preventDefault();
                    return;
				case ice.ace.SelectMenu.keys.KEY_HOME:
                    this.markFirst();
					this.selectEntry();
					event.stopPropagation();
					event.preventDefault();
					return;
				case ice.ace.SelectMenu.keys.KEY_END:
                    this.markLast();
					this.selectEntry();
					event.stopPropagation();
					event.preventDefault();
					return;
				case ice.ace.SelectMenu.keys.KEY_PAGEUP:
                    this.markPageUp();
                    this.selectEntry();
					event.stopPropagation();
					event.preventDefault();
					return;
				case ice.ace.SelectMenu.keys.KEY_PAGEDOWN:
                    this.markPageDown();
                    this.selectEntry();
					event.stopPropagation();
					event.preventDefault();
					return;
				default:
					if (event.which > 0) this.markFirstMatch(event.which);
                    this.selectEntry();
					event.stopPropagation();
					event.preventDefault();
					return;
            }
        } else {
			switch (event.keyCode) {
                case ice.ace.SelectMenu.keys.KEY_TAB:
					ice.setFocus('');
					return;
                case ice.ace.SelectMenu.keys.KEY_RETURN:
					var idx = this.selectEntry();
					this.getUpdatedChoices(true, event, idx);
					this.hide();
					event.stopPropagation();
					event.preventDefault();
                    return;
                case ice.ace.SelectMenu.keys.KEY_ESC:
                    this.hide();
                    this.active = false;
					event.stopPropagation();
					event.preventDefault();
                    return;
                case ice.ace.SelectMenu.keys.KEY_UP:
                    this.markPrevious();
                    this.render();
					event.stopPropagation();
					event.preventDefault();
                    return;
                case ice.ace.SelectMenu.keys.KEY_DOWN:
                    this.markNext();
                    this.render();
					event.stopPropagation();
					event.preventDefault();
                    return;
				case ice.ace.SelectMenu.keys.KEY_HOME:
                    this.markFirst();
                    this.render();
					event.stopPropagation();
					event.preventDefault();
					return;
				case ice.ace.SelectMenu.keys.KEY_END:
                    this.markLast();
                    this.render();
					event.stopPropagation();
					event.preventDefault();
					return;
				case ice.ace.SelectMenu.keys.KEY_PAGEUP:
                    this.markPageUp();
                    this.render();
					event.stopPropagation();
					event.preventDefault();
					return;
				case ice.ace.SelectMenu.keys.KEY_PAGEDOWN:
                    this.markPageDown();
                    this.render();
					event.stopPropagation();
					event.preventDefault();
					return;
				default:
					if (event.which > 0) this.markFirstMatch(event.which);
                    this.render();
					event.stopPropagation();
					event.preventDefault();
					return;
            }
        }
    },

    activate: function() {
        this.changed = false;
        this.hasFocus = true;
    },

    onHover: function(event) {
		var element = ice.ace.jq(event.currentTarget).closest('div').get(0);
        if (this.index != element.autocompleteIndex) {
            if (!this.skip_mouse_hover) this.index = element.autocompleteIndex;
            this.render();
        }
		event.stopPropagation();
		event.preventDefault();
    },

    onMove: function(event) {
        if (this.skip_mouse_hover) {
            this.skip_mouse_hover = false;
            this.onHover(event);
        }
    },

    onClick: function(event) {
		if (this.ieScrollbarFixObserver) clearTimeout(this.ieScrollbarFixObserver);
		var $element = ice.ace.jq(event.currentTarget).closest('div');
		var element = $element.get(0);
        this.index = element.autocompleteIndex;
        var idx = element.autocompleteIndex;
		var interactiveElement = this.isInteractive(event.target, element);
		if (!$element.hasClass('ui-state-disabled') && !interactiveElement) {
			this.selectEntry();
			this.getUpdatedChoices(true, event, idx);
			this.hide();
		}
		if (interactiveElement) {
			var self = this;
			var jqInteractiveElement = ice.ace.jq(interactiveElement);
			if (!jqInteractiveElement.data("onBlurHandlerRegistered")) {
				jqInteractiveElement.one('blur', function() {jqInteractiveElement.data("onBlurHandlerRegistered", false);self.onBlur();});
				jqInteractiveElement.data("onBlurHandlerRegistered", true);
			}
		}
		if (this.hideObserver) clearTimeout(this.hideObserver);
		if (this.blurObserver) clearTimeout(this.blurObserver);
    },

    onBlur: function(event) {
        var element = ice.ace.jq(this.element);
		// check if last click was done on scrollbar
		if (navigator.userAgent.indexOf("MSIE") >= 0) {
			var n = this.height;
			if (n!=null && n!='' && typeof n === 'number' && n % 1 == 0) {
				var posx=0; var posy=0;
				var e = window.event;
				if (e.pageX || e.pageY) {
					posx = e.pageX;
					posy = e.pageY;
				} else if (e.clientX || e.clientY) {
					posx = e.clientX + document.body.scrollLeft + document.documentElement.scrollLeft;
					posy = e.clientY + document.body.scrollTop + document.documentElement.scrollTop;
				}
				var widthX=element.position().left+element.width();
				var heightX=element.position().top+element.height()+parseFloat(this.height)+10;
				if ( this.active && (posx>element.position().left && posx<=widthX) && (posy>element.position().top && posy<heightX) ) {
					var self = this;
					this.ieScrollbarFixObserver = setTimeout(function(){self.element.focus();}, 200);
					return;
				}
			}
		}
        if (ice.ace.jq.trim(this.displayedValue.innerHTML) == '&nbsp;' && this.cfg.inFieldLabel) {
			this.displayedValue.innerHTML = this.replaceSpaces(this.cfg.inFieldLabel);
            element.addClass(this.cfg.inFieldLabelStyleClass);
            element.data("labelIsInField", true);
        }
        // needed to make click events work
		var self = this;
        this.hideObserver = setTimeout(function () { self.hide(); }, 250);
        this.hasFocus = false;
        this.active = false;
		ice.setFocus('');
		if (this.ajaxBlur) {
			if (this.blurObserver) clearTimeout(this.blurObserver);
			this.ajaxBlur.params = this.ajaxBlur.params || {};
			var self = this;
			this.blurObserver = setTimeout(function() { ice.ace.ab(self.ajaxBlur); }, 200);
		}
    },

    onFocus: function(event) {
        var element = ice.ace.jq(this.element);
        if (element.data("labelIsInField")) {
			this.displayedValue.innerHTML = '&nbsp;';
            element.removeClass(this.cfg.inFieldLabelStyleClass);
            element.data("labelIsInField", false);
        }
    },
	
	onElementClick: function(event) {
		if (this.active) {
			this.hide();
			if (this.hideObserver) clearTimeout(this.hideObserver);
			if (this.blurObserver) clearTimeout(this.blurObserver);
		} else {
			if (this.hideObserver) clearTimeout(this.hideObserver);
			if (this.blurObserver) clearTimeout(this.blurObserver);
			this.updateNOW(this.content);
		}
	},

    render: function() {
        if (this.entryCount > 0) {
            for (var i = 0; i < this.entryCount; i++)
				if (this.selectedIndex == i) {
                    ar = this.rowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).removeClass(ar[ai]);
                    ar = this.highlightedRowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).removeClass(ar[ai]);
                    ar = this.selectedRowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).addClass(ar[ai]);				
				} else if (this.index == i) {
					if (!ice.ace.jq(this.getEntry(i)).hasClass('ui-state-disabled')) {
						ar = this.rowClass.split(" ");
						for (var ai = 0; ai < ar.length; ai++)
							ice.ace.jq(this.getEntry(i)).removeClass(ar[ai]);
						ar = this.highlightedRowClass.split(" ");
						for (var ai = 0; ai < ar.length; ai++)
							ice.ace.jq(this.getEntry(i)).addClass(ar[ai]);
					}
                } else {
                    ar = this.highlightedRowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).removeClass(ar[ai]);
                    ar = this.rowClass.split(" ");
                    for (var ai = 0; ai < ar.length; ai++)
                        ice.ace.jq(this.getEntry(i)).addClass(ar[ai]);
                }
            if (this.hasFocus) {
                this.show();
                this.active = true;
            }
        } else {
            this.active = false;
            this.hide();
        }
    },

    markPrevious: function() {
		// we skip disabled entries
		var found = false;
		var i = this.index;
		while (true) {
			if (i > 0) i--
			else i = this.entryCount - 1;
			var entry = this.getEntry(i);
			if (entry && !ice.ace.jq(entry).hasClass('ui-state-disabled')) {
				found = true;
				break;
			}
			if (i == this.index) break; // we did one full loop already
			if (this.index == -1 && i == 0) break; // special case
		}
		if (found) {
			this.index = i;
			this.scrollToMarkedItem();
		}
    },

    markNext: function() {
		// we skip disabled entries
		var found = false;
		var i = this.index;
		while (true) {
			if (i < this.entryCount - 1) i++;
			else i = 0;
			var entry = this.getEntry(i);
			if (entry && !ice.ace.jq(entry).hasClass('ui-state-disabled')) {
				found = true;
				break;
			}
			if (i == this.index) break; // we did one full loop already
			if (this.index == -1 && i == this.entryCount) break; // special case
		}
		if (found) {
			this.index = i;
			this.scrollToMarkedItem();
		}
    },
	
	markFirst: function() {
		this.index = -1;
		this.markNext();
	},
	
	markLast: function() {
		this.index = this.entryCount;
		this.markPrevious();
	},
	
	markPageUp: function() {
		var i = this.index - 9;
		if (i < 0) {
			this.markFirst();
			return;
		}
		this.index = i;
		this.markPrevious();
	},
	
	markPageDown: function() {
		var i = this.index + 9;
		if (i >= this.entryCount) {
			this.markLast();
			return;
		}
		this.index = i;
		this.markNext();
	},
	
	markFirstMatch: function(charCode) {
		var eventChar = String.fromCharCode(charCode).toLowerCase();
		// we skip disabled entries
		var found = false;
		var i = this.index;
		while (true) {
			if (i < this.entryCount - 1) i++;
			else i = 0;
			var entry = this.getEntry(i);
			if (entry && !ice.ace.jq(entry).hasClass('ui-state-disabled')) {
				var labelNode = ice.ace.jq(entry).children('.' + ice.ace.SelectMenu.LABEL_CLASS).get(0);
				value = ice.ace.SelectMenu.collectTextNodesIgnoreClass(labelNode, ice.ace.SelectMenu.IGNORE_CLASS);
				if (value) {
					value = value.replace(/^\s+|\s+$/g, ''); // trim
					var firstChar = String.fromCharCode(value.charCodeAt(0)).toLowerCase();
					if (eventChar == firstChar) {
						found = true;
						break;
					}
				}
			}
			if (i == this.index) break; // we did one full loop already
			if (this.index == -1 && i == (this.entryCount - 1)) break; // special case
		}
		if (found) {
			this.index = i;
			this.scrollToMarkedItem();
		}	
	},
	
	scrollToMarkedItem: function() {
		if (this.active) {
			var entry = this.getEntry(this.index);
			if (entry) {
				var itemTop = ice.ace.jq(entry).position().top;
				var $update = ice.ace.jq(this.update);
				$update.scrollTop($update.scrollTop() + itemTop);
			}
		}
	},

    getEntry: function(index) {
        try {
            return this.update.firstChild.childNodes[index];
        } catch(ee) {
            return null;
        }
    },

    getCurrentEntry: function() {
        return this.getEntry(this.index);
    },

    selectEntry: function() {
        var idx = -1;
        this.active = false;
        if (this.index >= 0) {
            idx = this.index;
			this.selectedIndex = this.index;
            this.updateElement(this.getCurrentEntry());
            this.index = -1;
        }
        return idx;
    },

    updateElement: function(selectedEntry) {
        var value = '';
        value = ice.ace.SelectMenu.collectTextNodesIgnoreClass(selectedEntry, ice.ace.SelectMenu.LABEL_CLASS);

		this.updateValue(value);
        this.element.focus();
    },

    updateChoices: function(choices) {
        if (!this.changed && this.hasFocus) {
            this.update.innerHTML = choices;
			this.calculateListPosition();
            ice.ace.SelectMenu.cleanWhitespace(this.update);
            ice.ace.SelectMenu.cleanWhitespace(this.update.firstChild);

            if (this.update.firstChild && this.update.firstChild.childNodes) {
                this.entryCount =
                    this.update.firstChild.childNodes.length;
                for (var i = 0; i < this.entryCount; i++) {
                    var entry = this.getEntry(i);
                    entry.autocompleteIndex = i;
                    this.addObservers(entry);
                }
            } else {
                this.entryCount = 0;
            }
            this.stopIndicator();
            this.index = -1;
            this.render();
        } else {

        }
    },

    addObservers: function(element) {
		var self = this;
		ice.ace.jq(element).on("mouseover", function(e) { self.onHover.call(self, e); });
		ice.ace.jq(element).on("click", function(e) { self.onClick.call(self, e); });
		ice.ace.jq(element).on("mousemove", function(e) { self.onMove.call(self, e); });
    },

    dispose:function() {
        for (var i = 0; i < this.entryCount; i++) {
            var entry = this.getEntry(i);
            entry.autocompleteIndex = i;
			ice.ace.jq(entry).off('mouseover');
			ice.ace.jq(entry).off('click');
			ice.ace.jq(entry).off('mousemove');
        }
		ice.ace.jq(this.element).off('mouseover');
		ice.ace.jq(this.element).off('click');
		ice.ace.jq(this.element).off('mousemove');
		ice.ace.jq(this.element).off('blur');
		ice.ace.jq(this.element).off('keypress');
        if (ice.ace.SelectMenu.Browser.IE || ice.ace.SelectMenu.Browser.WebKit)
			ice.ace.jq(this.element).off('keydown');
    },

    onObserverEvent: function() {
        this.changed = false;
        this.startIndicator();
        this.getUpdatedChoices(false, undefined, -1);
    },

    getUpdatedChoices: function(isHardSubmit, event, idx) {
        if (!event) {
            event = new Object();
        }

		if (this.blurObserver) clearTimeout(this.blurObserver);
		if (this.ajaxValueChange) {
			var ajaxCfg = {};
			var options = {params: {}};
			options.params['ice.event.keycode'] = event.keyCode;
			ice.ace.jq.extend(ajaxCfg, this.ajaxValueChange, options);
			ice.ace.ab(ajaxCfg);
		}
    },
	
	isCharacterCode: function(keyCode) {
		if (keyCode == 8 || keyCode == 46) return true; // backspace, del
		if (keyCode >= 16 && keyCode <= 20) return false; // shift, ctrl, alt, pause, caps lock
		if (keyCode >= 33 && keyCode <= 40) return false; // pg up, pg down, end, home, arrow keys
		if (keyCode == 44 || keyCode == 45) return false; // print screen, insert
		if (keyCode == 144 || keyCode == 145) return false; // num lock, scroll lock
		if (keyCode >= 91 && keyCode <= 93) return false; // windows keys, context menu
		if (keyCode >= 112 && keyCode <= 123) return false; // f keys
		if (keyCode == 9 || keyCode == 10 || keyCode == 13 || keyCode ==  27) return false; // tab, lf, cr, esc
		return true;
	},
	
	isInteractive: function(element, container) {
		if (element) {
			var result;
			var currentNode = element;
			while (currentNode !== container) {
				result = this.isInteractiveElement(currentNode);
				if (result) return result;
				else currentNode = currentNode.parentNode;
			}
		}
		return false;
	},
	
	isInteractiveElement: function(element) {
		if (element) {
			var tag = element.tagName;
			if (tag) {
				tag = tag.toLowerCase();
				switch (tag) {
					case 'input':
					case 'select':
					case 'label':
					case 'textarea':
					case 'button':
					case 'a':
						return element;
				}
			}
		}
		return false;
	},
	
	setContent: function(content) {
		this.content = content;
		this.update.innerHTML = this.content;
		if (this.update.firstChild && this.update.firstChild.childNodes) {
			this.entryCount = this.update.firstChild.childNodes.length;
		}
	},

    updateNOW: function(text) {

		if (!text) return;
        this.hasFocus = true;
        ice.ace.SelectMenu.cleanWhitespace(this.update);
		this.updateChoices(text);
		this.show();
		this.render();
		this.element.focus();
    },
	
	updateValue: function(value) {
		if (value) {
			this.input.value = value;
		} else {
			this.input.value = '';
		}
		this.updateSelectedIndex();
		// update label
		if (value) {
			var currentEntry = this.getEntry(this.selectedIndex);
			if (currentEntry) {
				var labelSpan = ice.ace.jq(currentEntry).find('.'+ice.ace.SelectMenu.LABEL_CLASS).get(0);
				var label = ice.ace.SelectMenu.collectTextNodesIgnoreClass(labelSpan, ice.ace.SelectMenu.IGNORE_CLASS);
				this.displayedValue.innerHTML = this.replaceSpaces(label);
			} else {
				this.displayedValue.innerHTML = '&nbsp;';
			}
		} else {
			var element = ice.ace.jq(this.element);
			if (this.cfg.inFieldLabel) {
				this.displayedValue.innerHTML = this.replaceSpaces(this.cfg.inFieldLabel);
				element.addClass(this.cfg.inFieldLabelStyleClass);
				element.data("labelIsInField", true);
			} else {
				this.displayedValue.innerHTML = '&nbsp;';
			}
		}
		this.adjustDownArrowButtonHeight();
	},
	
	adjustDownArrowButtonHeight: function() {
		this.$downArrowButton.css('height', ice.ace.jq(this.displayedValue).outerHeight());
		var height = this.$downArrowButton.height();
		var padding = (height - 16) / 2;
		this.$downArrowButton.children().eq(0).css('height', padding);
	},
	
	replaceSpaces: function(str) {
		if (str) return str.replace(/ /g, '&nbsp;');
		else return '';
	},
	
	// update selected index if value was changed programmatically or was pre-selected
	updateSelectedIndex: function() {
		if (typeof this.selectedIndex != 'number' && !this.selectedIndex) this.selectedIndex = -1;
		var currentEntry = this.getEntry(this.selectedIndex);
		if ((currentEntry && (this.input.value != ice.ace.SelectMenu.collectTextNodesIgnoreClass(currentEntry, ice.ace.SelectMenu.LABEL_CLASS)))
			|| (this.selectedIndex == -1 && this.input.value)) {
			var found = false;
			for (var i = 0; i < this.entryCount; i++) {
				var entry = this.getEntry(i);
				if (entry && (this.input.value == ice.ace.SelectMenu.collectTextNodesIgnoreClass(entry, ice.ace.SelectMenu.LABEL_CLASS))) {
					found = true;
					this.selectedIndex = i;
					break;
				}
			}
			if (!found) this.selectedIndex = -1;
		}
	},
	
	showEffect: function(update) {
		var list = ice.ace.jq(update);
		list.css('opacity', 1);
		var e = this.effects.show;
		e = e ? e.toLowerCase() : '';
		if (e == 'blind' || e == 'bounce' || e == 'clip' || e == 'drop' || e == 'explode'
				|| e == 'fold' || e == 'puff' || e == 'pulsate' || e == 'scale' || e == 'slide' || e == 'shake') {
			list.show(e, {}, this.effects.showLength);
		} else list.fadeIn(this.effects.showLength);
	},
	
	hideEffect: function(update) {
		var list = ice.ace.jq(update);
		var e = this.effects.hide;
		e = e ? e.toLowerCase() : '';
		if (e == 'blind' || e == 'bounce' || e == 'clip' || e == 'drop' || e == 'explode'
				|| e == 'fold' || e == 'puff' || e == 'pulsate' || e == 'scale' || e == 'slide') {
			list.hide(e, {}, this.effects.hideLength);
		} else list.fadeOut(this.effects.hideLength);
	}
};
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
(function ($, undefined) {

var ThemeSelect = ice.ace.ThemeSelect = function (clientId, cfg) {
    this.clientId = clientId;
    var selectId = "select_" + clientId;
    this.$sel = $(ice.ace.escapeClientId(selectId));

    if (cfg.behaviors) {
        ice.ace.attachBehaviors(this.$sel, cfg.behaviors);
    }
    var currentSelection = document.getElementById(selectId).value;
    ice.onElementUpdate(selectId, function() {
        if (currentSelection != document.getElementById(selectId).value) {
            window.location.reload();
        } else {
            currentSelection = document.getElementById(selectId).value;
        }
    });
};

ThemeSelect.prototype.destroy = function () {
    var instances = this.constructor.instances;
    this.$sel.off("change");
    instances[this.clientId] = null;
    delete instances[this.clientId];
};

ThemeSelect.instances = {};

ThemeSelect.singleEntry = function (clientId, cfg) {
    $(function () {
        var instance = ThemeSelect.instances[clientId] = new ThemeSelect(clientId, cfg);
        ice.onElementUpdate(clientId, function () {
            instance.destroy();
        });
    });
};

})(ice.ace.jq);
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
(function ($, undefined) {

    var Message;
    ice.ace.Message = function (opts) {
        var effOpts = {};
        this.opts = opts;
        this.$msg = $(document.getElementById(opts.id + "_msg" + (opts.count || "")));
        if (opts.effect == "fade") {
            this.$msg.hide();
        } else if (opts.effect == "size") {
            effOpts.from = {width: 0, height: 0};
        }
        this.$msg.show(opts.effect, effOpts, opts.duration);
    };
    Message = ice.ace.Message;
    Message.prototype.initEffect = function () {
    };
    Message.prototype.changeEffect = function () {
    };
    Message.prototype.destroy = function () {
        this.$msg.remove();
    };

    Message.instances = {};
    Message.factory = function (opts) {
        $(function () {
            var id = opts.id,
                instances = Message.instances;
            instances[id] = new Message(opts);
//            instances[id][opts.event + "Effect"]();
            ice.onElementUpdate(id, function () {
                instances[id].destroy();
                instances[id] = null;
                delete instances[id];
            });
        });
    }

}(ice.ace.jq));
/**
 * jGrowl 1.2.12
 *
 * Dual licensed under the MIT (http://www.opensource.org/licenses/mit-license.php)
 * and GPL (http://www.opensource.org/licenses/gpl-license.php) licenses.
 *
 * Written by Stan Lemon <stosh1985@gmail.com>
 * Last updated: 2013.02.14
 *
 * jGrowl is a jQuery plugin implementing unobtrusive userland notifications.  These
 * notifications function similarly to the Growl Framework available for
 * Mac OS X (http://growl.info).
 *
 * To Do:
 * - Move library settings to containers and allow them to be changed per container
 *
 * Changes in 1.2.13
 * - Fixed clearing interval when the container shuts down
 *
 * Changes in 1.2.12
 * - Added compressed versions using UglifyJS and Sqwish
 * - Improved README with configuration options explanation
 * - Added a source map
 *
 * Changes in 1.2.11
 * - Fix artifacts left behind by the shutdown method and text-cleanup
 *
 * Changes in 1.2.10
 * - Fix beforeClose to be called in click event
 *
 * Changes in 1.2.9
 * - Fixed BC break in jQuery 2.0 beta
 *
 * Changes in 1.2.8
 * - Fixes for jQuery 1.9 and the MSIE6 check, note that with jQuery 2.0 support
 *   jGrowl intends to drop support for IE6 altogether
 *
 * Changes in 1.2.6
 * - Fixed js error when a notification is opening and closing at the same time
 *
 * Changes in 1.2.5
 * - Changed wrapper jGrowl's options usage to "o" instead of $.jGrowl.defaults
 * - Added themeState option to control 'highlight' or 'error' for jQuery UI
 * - Ammended some CSS to provide default positioning for nested usage.
 * - Changed some CSS to be prefixed with jGrowl- to prevent namespacing issues
 * - Added two new options - openDuration and closeDuration to allow
 *   better control of notification open and close speeds, respectively
 *   Patch contributed by Jesse Vincet.
 * - Added afterOpen callback.  Patch contributed by Russel Branca.
 *
 * Changes in 1.2.4
 * - Fixed IE bug with the close-all button
 * - Fixed IE bug with the filter CSS attribute (special thanks to gotwic)
 * - Update IE opacity CSS
 * - Changed font sizes to use "em", and only set the base style
 *
 * Changes in 1.2.3
 * - The callbacks no longer use the container as context, instead they use the actual notification
 * - The callbacks now receive the container as a parameter after the options parameter
 * - beforeOpen and beforeClose now check the return value, if it's false - the notification does
 *   not continue.  The open callback will also halt execution if it returns false.
 * - Fixed bug where containers would get confused
 * - Expanded the pause functionality to pause an entire container.
 *
 * Changes in 1.2.2
 * - Notification can now be theme rolled for jQuery UI, special thanks to Jeff Chan!
 *
 * Changes in 1.2.1
 * - Fixed instance where the interval would fire the close method multiple times.
 * - Added CSS to hide from print media
 * - Fixed issue with closer button when div { position: relative } is set
 * - Fixed leaking issue with multiple containers.  Special thanks to Matthew Hanlon!
 *
 * Changes in 1.2.0
 * - Added message pooling to limit the number of messages appearing at a given time.
 * - Closing a notification is now bound to the notification object and triggered by the close button.
 *
 * Changes in 1.1.2
 * - Added iPhone styled example
 * - Fixed possible IE7 bug when determining if the ie6 class shoudl be applied.
 * - Added template for the close button, so that it's content could be customized.
 *
 * Changes in 1.1.1
 * - Fixed CSS styling bug for ie6 caused by a mispelling
 * - Changes height restriction on default notifications to min-height
 * - Added skinned examples using a variety of images
 * - Added the ability to customize the content of the [close all] box
 * - Added jTweet, an example of using jGrowl + Twitter
 *
 * Changes in 1.1.0
 * - Multiple container and instances.
 * - Standard $.jGrowl() now wraps $.fn.jGrowl() by first establishing a generic jGrowl container.
 * - Instance methods of a jGrowl container can be called by $.fn.jGrowl(methodName)
 * - Added glue preferenced, which allows notifications to be inserted before or after nodes in the container
 * - Added new log callback which is called before anything is done for the notification
 * - Corner's attribute are now applied on an individual notification basis.
 *
 * Changes in 1.0.4
 * - Various CSS fixes so that jGrowl renders correctly in IE6.
 *
 * Changes in 1.0.3
 * - Fixed bug with options persisting across notifications
 * - Fixed theme application bug
 * - Simplified some selectors and manipulations.
 * - Added beforeOpen and beforeClose callbacks
 * - Reorganized some lines of code to be more readable
 * - Removed unnecessary this.defaults context
 * - If corners plugin is present, it's now customizable.
 * - Customizable open animation.
 * - Customizable close animation.
 * - Customizable animation easing.
 * - Added customizable positioning (top-left, top-right, bottom-left, bottom-right, center)
 *
 * Changes in 1.0.2
 * - All CSS styling is now external.
 * - Added a theme parameter which specifies a secondary class for styling, such
 *   that notifications can be customized in appearance on a per message basis.
 * - Notification life span is now customizable on a per message basis.
 * - Added the ability to disable the global closer, enabled by default.
 * - Added callbacks for when a notification is opened or closed.
 * - Added callback for the global closer.
 * - Customizable animation speed.
 * - jGrowl now set itself up and tears itself down.
 *
 * Changes in 1.0.1:
 * - Removed dependency on metadata plugin in favor of .data()
 * - Namespaced all events
 */
(function($) {
	/** Compatibility holdover for 1.9 to check IE6 **/
	var $ie6 = (function(){
		return false === $.support.boxModel && $.support.objectAll && $.support.leadingWhitespace;
	})();

	/** jGrowl Wrapper - Establish a base jGrowl Container for compatibility with older releases. **/
	$.jGrowl = function( m , o ) {
		// To maintain compatibility with older version that only supported one instance we'll create the base container.
		if ( $('#jGrowl').size() == 0 )
			$('<div id="jGrowl"></div>').addClass( (o && o.position) ? o.position : $.jGrowl.defaults.position ).appendTo('body');

		// Create a notification on the container.
		$('#jGrowl').jGrowl(m,o);
	};


	/** Raise jGrowl Notification on a jGrowl Container **/
	$.fn.jGrowl = function( m , o ) {
		if ( $.isFunction(this.each) ) {
			var args = arguments;

			return this.each(function() {
				/** Create a jGrowl Instance on the Container if it does not exist **/
				if ( $(this).data('jGrowl.instance') == undefined ) {
					$(this).data('jGrowl.instance', $.extend( new $.fn.jGrowl(), { notifications: [], element: null, interval: null } ));
					$(this).data('jGrowl.instance').startup( this );
				}

				/** Optionally call jGrowl instance methods, or just raise a normal notification **/
				if ( $.isFunction($(this).data('jGrowl.instance')[m]) ) {
					$(this).data('jGrowl.instance')[m].apply( $(this).data('jGrowl.instance') , $.makeArray(args).slice(1) );
				} else {
					$(this).data('jGrowl.instance').create( m , o );
				}
			});
		};
	};

	$.extend( $.fn.jGrowl.prototype , {

		/** Default JGrowl Settings **/
		defaults: {
			pool:				0,
			header:				'',
			group:				'',
			sticky:				false,
			position: 			'top-right',
			glue:				'after',
			theme:				'default',
			themeState:			'highlight',
			corners:			'10px',
			check:				250,
			life:				3000,
			closeDuration: 		'normal',
			openDuration: 		'normal',
			easing: 			'swing',
			closer: 			true,
			closeTemplate: 		'&times;',
			closerTemplate: 	'<div>[ close all ]</div>',
			log:				function() {},
			beforeOpen:			function() {},
			afterOpen:			function() {},
			open:				function() {},
			beforeClose: 		function() {},
			close:				function() {},
			animateOpen: 		{
				opacity:	 'show'
			},
			animateClose: 		{
				opacity:	 'hide'
			}
		},

		notifications: [],

		/** jGrowl Container Node **/
		element:	 null,

		/** Interval Function **/
		interval:   null,

		/** Create a Notification **/
		create:	 function( message , o ) {
			var o = $.extend({}, this.defaults, o);

			/* To keep backward compatibility with 1.24 and earlier, honor 'speed' if the user has set it */
			if (typeof o.speed !== 'undefined') {
				o.openDuration = o.speed;
				o.closeDuration = o.speed;
			}

			this.notifications.push({ message: message , options: o });

			o.log.apply( this.element , [this.element,message,o] );
		},

		render:		 function( notification ) {
			var self = this;
			var message = notification.message;
			var o = notification.options;

			// Support for jQuery theme-states, if this is not used it displays a widget header
			o.themeState = (o.themeState == '') ? '' : 'ui-state-' + o.themeState;

			var notification = $('<div/>')
				.addClass('jGrowl-notification ' + o.themeState + ' ui-corner-all' + ((o.group != undefined && o.group != '') ? ' ' + o.group : ''))
				.append($('<div/>').addClass('jGrowl-close').html(o.closeTemplate))
				.append($('<div/>').addClass('jGrowl-header').html(o.header))
				.append($('<div/>').addClass('jGrowl-message').html("<span class='ui-icon ui-icon-" + o.icon + "'/>" + message))
				.data("jGrowl", o).addClass(o.theme).children('div.jGrowl-close').bind("click.jGrowl", function() {
					$(this).parent().trigger('jGrowl.beforeClose');
				})
				.parent();


			/** Notification Actions **/
			$(notification).bind("mouseover.jGrowl", function() {
				$('div.jGrowl-notification', self.element).data("jGrowl.pause", true);
			}).bind("mouseout.jGrowl", function() {
				$('div.jGrowl-notification', self.element).data("jGrowl.pause", false);
			}).bind('jGrowl.beforeOpen', function() {
				if ( o.beforeOpen.apply( notification , [notification,message,o,self.element] ) !== false ) {
					$(this).trigger('jGrowl.open');
				}
			}).bind('jGrowl.open', function() {
				if ( o.open.apply( notification , [notification,message,o,self.element] ) !== false ) {
					if ( o.glue == 'after' ) {
						$('div.jGrowl-notification:last', self.element).after(notification);
					} else {
						$('div.jGrowl-notification:first', self.element).before(notification);
					}

					$(this).animate(o.animateOpen, o.openDuration, o.easing, function() {
						// Fixes some anti-aliasing issues with IE filters.
						if ($.support.opacity === false)
							this.style.removeAttribute('filter');

						if ( $(this).data("jGrowl") ) // Happens when a notification is closing before it's open.
							$(this).data("jGrowl").created = new Date();

						$(this).trigger('jGrowl.afterOpen');
					});
				}
			}).bind('jGrowl.afterOpen', function() {
				o.afterOpen.apply( notification , [notification,message,o,self.element] );
			}).bind('jGrowl.beforeClose', function() {
				if ( o.beforeClose.apply( notification , [notification,message,o,self.element] ) !== false )
					$(this).trigger('jGrowl.close');
			}).bind('jGrowl.close', function() {
				// Pause the notification, lest during the course of animation another close event gets called.
				$(this).data('jGrowl.pause', true);
				$(this).animate(o.animateClose, o.closeDuration, o.easing, function() {
					if ( $.isFunction(o.close) ) {
						if ( o.close.apply( notification , [notification,message,o,self.element] ) !== false )
							$(this).remove();
					} else {
						$(this).remove();
					}
				});
			}).trigger('jGrowl.beforeOpen');

			/** Optional Corners Plugin **/
			if ( o.corners != '' && $.fn.corner != undefined ) $(notification).corner( o.corners );

			/** Add a Global Closer if more than one notification exists **/
			if ( $('div.jGrowl-notification:parent', self.element).size() > 1 &&
				 $('div.jGrowl-closer', self.element).size() == 0 && this.defaults.closer !== false ) {
				$(this.defaults.closerTemplate).addClass('jGrowl-closer ui-state-' + this.defaults.themeState + ' ui-corner-all').addClass(this.defaults.theme)
					.appendTo(self.element).animate(this.defaults.animateOpen, this.defaults.speed, this.defaults.easing)
					.bind("click.jGrowl", function() {
						$(this).siblings().trigger("jGrowl.beforeClose");

						if ( $.isFunction( self.defaults.closer ) ) {
							self.defaults.closer.apply( $(this).parent()[0] , [$(this).parent()[0]] );
						}
					});
			};
		},

		/** Update the jGrowl Container, removing old jGrowl notifications **/
		update:	 function() {
			$(this.element).find('div.jGrowl-notification:parent').each( function() {
				if ( $(this).data("jGrowl") != undefined && $(this).data("jGrowl").created !== undefined &&
					 ($(this).data("jGrowl").created.getTime() + parseInt($(this).data("jGrowl").life))  < (new Date()).getTime() &&
					 $(this).data("jGrowl").sticky !== true &&
					 ($(this).data("jGrowl.pause") == undefined || $(this).data("jGrowl.pause") !== true) ) {

					// Pause the notification, lest during the course of animation another close event gets called.
					$(this).trigger('jGrowl.beforeClose');
				}
			});

			if ( this.notifications.length > 0 &&
				 (this.defaults.pool == 0 || $(this.element).find('div.jGrowl-notification:parent').size() < this.defaults.pool) )
				this.render( this.notifications.shift() );

			if ( $(this.element).find('div.jGrowl-notification:parent').size() < 2 ) {
				$(this.element).find('div.jGrowl-closer').animate(this.defaults.animateClose, this.defaults.speed, this.defaults.easing, function() {
					$(this).remove();
				});
			}
		},

		/** Setup the jGrowl Notification Container **/
		startup:	function(e) {
			this.element = $(e).addClass('jGrowl').append('<div class="jGrowl-notification"></div>');
			this.interval = setInterval( function() {
				$(e).data('jGrowl.instance').update();
			}, parseInt(this.defaults.check));

			if ($ie6) {
				$(this.element).addClass('ie6');
			}
		},

		/** Shutdown jGrowl, removing it and clearing the interval **/
		shutdown:   function() {
			$(this.element).removeClass('jGrowl')
				.find('div.jGrowl-notification').trigger('jGrowl.close')
				.parent().empty()

			clearInterval(this.interval);
		},

		close:	 function() {
			$(this.element).find('div.jGrowl-notification').each(function(){
				$(this).trigger('jGrowl.beforeClose');
			});
		}
	});

	/** Reference the Defaults Object for compatibility with older versions of jGrowl **/
	$.jGrowl.defaults = $.fn.jGrowl.prototype.defaults;

})(ice.ace.jq);
/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
ice.ace.GrowlMessages = function (id, cfg) {
    var jq = ice.ace.jq, msgs = cfg.msgs,
        i, opts;

    jq.jGrowl.defaults.pool = cfg.pool;
    jq.jGrowl.defaults.closer = cfg.closer;
    jq.jGrowl.defaults.openDuration = cfg.openDuration;
    jq.jGrowl.defaults.closeDuration = cfg.closeDuration;
    jq.jGrowl.defaults.closeTemplate = "<span class='ui-icon ui-icon-circle-close'></span>";
    jq.jGrowl.defaults.closerTemplate = "<div>close all</div>";

    opts = {header: cfg.header, group: cfg.group, position: cfg.position, glue: cfg.glue, life: cfg.life};

    for (i = 0; i < msgs.length; i++) {
        opts.icon = msgs[i].icon;
        opts.themeState = msgs[i].state;
        opts.sticky = msgs[i].sticky;
        jq.jGrowl(msgs[i].text, opts);
    }

    ice.onElementUpdate(id, function () {
        var instance = jq('#jGrowl').data('jGrowl.instance');
        instance && instance.shutdown();
        jq('#jGrowl').remove();
    });
};
