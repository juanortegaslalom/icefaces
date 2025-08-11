window.Ice={};
if(!window.ice){
window.ice=new Object;
}
if(!window.ice.compat){
(function(_1){
_1.compat=true;
eval(ice.importFrom("ice.lib.functional"));
eval(ice.importFrom("ice.lib.oo"));
eval(ice.importFrom("ice.lib.collection"));
eval(ice.importFrom("ice.lib.string"));
eval(ice.importFrom("ice.lib.delay"));
eval(ice.importFrom("ice.lib.window"));
eval(ice.importFrom("ice.lib.event"));
eval(ice.importFrom("ice.lib.logger"));
eval(ice.importFrom("ice.lib.query"));
function _2(_3){
while(_3){
if(_3.configuration){
return _3;
}
_3=_3.parentNode;
}
return document.body;
};
var _4;
var _5;
(function(){
var on=operator();
var _6=operator();
var _7=object(function(_8){
_8(on,noop);
_8(_6,noop);
});
function _9(_a){
return object(function(_b){
_b(on,function(_c){
window.location.href=_a;
});
_b(_6,noop);
});
};
function _d(_e,_f){
var _10=object(function(_11){
_11(on,function(_12){
each(_f,function(_13){
if(_13!=_12){
_6(_13);
}
});
var e=document.getElementById(_e);
if(e){
e.style.visibility="visible";
}
});
_11(_6,function(_14){
var e=document.getElementById(_e);
if(e){
e.style.visibility="hidden";
}
});
});
append(_f,_10);
_6(_10);
return _10;
};
function _15(_16){
var _17=0;
return object(function(_18){
_18(on,function(){
if(_17==0){
on(_16);
}
++_17;
});
_18(_6,function(){
if(_17<1){
return;
}
if(_17==1){
_6(_16);
}
--_17;
});
});
};
function _19(_1a,_1b){
var _1c=object(function(_1d){
_1d(on,function(_1e){
on(_1a);
_6(_1b);
});
_1d(_6,function(_1f){
_6(_1a);
on(_1b);
});
});
_6(_1c);
return _1c;
};
function _20(){
var _21=arguments;
var _22=object(function(_23){
_23(on,function(_24){
each(_21,on);
});
_23(_6,function(_25){
each(_21,_6);
});
});
_6(_22);
return _22;
};
function _26(_27){
var _28=noop;
function _29(){
_2a=noop;
function _2b(e){
var c=e.style.cursor;
e.style.cursor="wait";
return function(){
e.style.cursor=c;
};
};
var _2c=inject(["input","select","textarea","button","a"],[_2b(_27)],function(_2d,_2e){
each(_27.getElementsByTagName(_2e),function(e){
append(_2d,_2b(e));
});
return _2d;
});
_28=function(){
broadcast(_2c);
_2a=_29;
_28=noop;
};
};
var _2a=_29;
return object(function(_2f){
_2f(on,function(_30){
_2a();
});
_2f(_6,function(_31){
_28();
});
});
};
function _32(_33){
var _34=noop;
function _35(){
_36=noop;
var _37=_33.style;
var _38=_37.cursor;
_37.cursor="wait";
_34=function(){
_37.cursor=_38;
_36=_35;
_34=noop;
};
};
var _36=_35;
return object(function(_39){
_39(on,function(_3a){
_36();
});
_39(_6,function(_3b){
_34();
});
});
};
function _3c(){
return object(function(_3d){
var _3e=/MSIE/.test(navigator.userAgent);
var _3f=_3e?parseInt(navigator.userAgent.match(/MSIE ([0-9]+)\.0;/)[1])>8:false;
var _40;
var _41;
function _42(){
if(_3e&&!_3f){
_40=document.createElement("iframe");
_40.setAttribute("src","javascript:document.write('<html><body style=\"cursor: wait;\"></body><html>');document.close();");
_40.setAttribute("frameborder","0");
document.body.appendChild(_40);
}else{
_40=document.body.appendChild(document.createElement("div"));
_40.style.cursor="wait";
}
var _43=_40.style;
_43.position="absolute";
_43.backgroundColor="white";
_43.zIndex="38000";
_43.top="0";
_43.left="0";
_43.opacity="0";
_43.filter="alpha(opacity=0)";
_43.width=(Math.max(document.documentElement.scrollWidth,document.body.scrollWidth)-20)+"px";
_43.height=(Math.max(document.documentElement.scrollHeight,document.body.scrollHeight)-20)+"px";
};
function _44(){
if(_3e&&!_3f){
var _45=document.createElement("iframe");
_45.setAttribute("src","javascript:document.write(\"<html></html>\");document.close();");
_45.setAttribute("frameborder","0");
try{
document.body.replaceChild(_45,_40);
document.body.removeChild(_45);
}
catch(e){
}
}else{
document.body.removeChild(_40);
}
_40=null;
};
_3d(on,function(_46){
_41=runOnce(Delay(_42,750));
});
_3d(_6,function(_47){
if(_41){
stop(_41);
}
if(_40){
_44();
}
});
});
};
function _48(_49,_4a,_4b,_4c,_4d){
return object(function(_4e){
_4e(on,function(_4f){
on(_4d);
var _50=document.body.appendChild(document.createElement("div"));
_50.className="ice-status-indicator";
var _51=_50.style;
_51.position="absolute";
_51.textAlign="center";
_51.zIndex="28001";
_51.color="black";
_51.backgroundColor="white";
_51.paddingLeft="0";
_51.paddingRight="0";
_51.paddingTop="15px";
_51.paddingBottom="15px";
_51.borderBottomColor="gray";
_51.borderRightColor="gray";
_51.borderTopColor="silver";
_51.borderLeftColor="silver";
_51.borderWidth="2px";
_51.borderStyle="solid";
_51.width="270px";
var _52=_50.appendChild(document.createElement("div"));
_52.appendChild(document.createTextNode(_49));
_52.className="ice-status-indicator-message";
var _53=_52.style;
_53.marginLeft="30px";
_53.textAlign="left";
_53.fontSize="14px";
_53.fontSize="14px";
_53.fontWeight="bold";
var _54=_52.appendChild(document.createElement("div"));
_54.appendChild(document.createTextNode(_4a));
_54.className="ice-status-indicator-description";
var _55=_54.style;
_55.fontSize="11px";
_55.marginTop="7px";
_55.marginBottom="7px";
_55.fontWeight="normal";
var _56=document.createElement("input");
_56.type="button";
_56.value=_4b;
var _57=_56.style;
_57.fontSize="11px";
_57.fontWeight="normal";
_56.onclick=function(){
window.location.reload();
};
_50.appendChild(_56);
var _58=function(){
_51.left=((window.width()-_50.clientWidth)/2)+"px";
_51.top=((window.height()-_50.clientHeight)/2)+"px";
};
_58();
onResize(window,_58);
});
_4e(_6,noop);
});
};
var _59;
_4=function(_5a,_5b){
var _5c=document.getElementById(_5b).parentNode;
_5c.compatDefaultIndicatorsSetupCount=_5c.compatDefaultIndicatorsSetupCount?(_5c.compatDefaultIndicatorsSetupCount+1):1;
if(_5c.compatDefaultIndicatorsSetupCount==1){
if(_5c.configuration.disableDefaultErrorPopups){
_59={busy:_7,sessionExpired:_7,connectionLost:_7,serverError:_7,connectionTrouble:_7};
}else{
_5c.configuration.disableDefaultErrorPopups=true;
var _5d=_5a.connectionLostRedirectURI;
if(_5d=="null"){
_5d=null;
}
var _5e=_5a.sessionExpiredRedirectURI;
if(_5e=="null"){
_5e=null;
}
var _5f=_5d?_9(_5d):null;
var _60=_5e?_9(_5e):null;
var _61=_5a.messages;
var _62=_5a.connection.context+"/xmlhttp/css/xp/css-images/connect_disconnected.gif";
var _63=_5a.connection.context+"/xmlhttp/css/xp/css-images/connect_caution.gif";
var _64=_5a.fastBusyIndicator?_32(_5c):_26(_5c);
var _65=object(function(_66){
_66(on,function(_67){
var _68=_5c.ownerDocument.createElement("iframe");
_68.setAttribute("src","about:blank");
_68.setAttribute("frameborder","0");
var _69=_68.style;
_69.position="absolute";
_69.display="block";
_69.visibility="visible";
_69.backgroundColor="white";
_69.zIndex="28000";
_69.top="0";
_69.left="0";
_69.opacity=0.22;
_69.filter="alpha(opacity=22)";
_5c.appendChild(_68);
var _6a=_5c.tagName.toLowerCase()=="body"?function(){
_69.width=Math.max(document.documentElement.scrollWidth,document.body.scrollWidth)+"px";
_69.height=Math.max(document.documentElement.scrollHeight,document.body.scrollHeight)+"px";
}:function(){
_69.width=_5c.offsetWidth+"px";
_69.height=_5c.offsetHeight+"px";
};
_6a();
onResize(window,_6a);
});
_66(_6,noop);
});
_59={busy:_64,sessionExpired:_60?_60:_48(_61.sessionExpired,_61.description,_61.buttonText,_62,_65),connectionLost:_5f?_5f:_48(_61.connectionLost,_61.description,_61.buttonText,_63,_65),serverError:_48(_61.serverError,_61.description,_61.buttonText,_63,_65),connectionTrouble:_7};
}
}
if(_5c.compatComponentIndicatorsInit){
_5c.compatComponentIndicatorsInit();
}
};
var _6b=[];
_5=function(_6c,_6d,_6e,_6f,_70,_71){
var _72=_2(document.getElementById(_6c));
if(contains(_6b,_6c)){
_72.compatComponentIndicatorsInit=noop;
return;
}else{
append(_6b,_6c);
_72.compatComponentIndicatorsInit=function(){
var _73=[];
var _74=_d(_6c,_73);
var _75=_d(_6d,_73);
var _76=_d(_6f,_73);
var _77=_19(_74,_75);
var _78=_71?_77:_20(_77,_3c());
var _79=_15(_71?_20(_59.busy,_78):_78);
var _7a=_d(_6e,_73);
if(_70){
_59={busy:_79,connectionTrouble:_7a,connectionLost:_20(_76,_59.connectionLost),sessionExpired:_20(_76,_59.sessionExpired),serverError:_20(_76,_59.serverError)};
}else{
_59={busy:_79,connectionTrouble:_7a,connectionLost:_59.connectionLostRedirect?_59.connectionLostRedirect:_76,sessionExpired:_59.sessionExpiredRedirect?_59.sessionExpiredRedirect:_76,serverError:_76};
}
};
}
};
onLoad(window,function(){
ice.onBeforeSubmit(function(_7b,_7c){
if(_7c){
_59&&on(_59.busy);
}
});
ice.onBeforeUpdate(function(){
_59&&_6(_59.busy);
});
ice.onNetworkError(function(){
_59&&on(_59.connectionLost);
});
ice.onServerError(function(){
_59&&on(_59.serverError);
});
ice.onSessionExpiry(function(){
if(_59){
_59.connectionTrouble=_7;
_59.connectionLost=_7;
on(_59.sessionExpired);
}
});
if(ice.push){
ice.onBlockingConnectionUnstable(function(){
_59&&on(_59.connectionTrouble);
});
ice.onBlockingConnectionLost(function(){
_59&&on(_59.connectionLost);
});
}
});
})();
_1.DefaultIndicators=_4;
_1.ComponentIndicators=_5;
window.setFocus=_1.setFocus;
var _7d;
var _7e;
var _7f;
(function(){
_7d=function(_80,_81,evt){
_80=_80||_7f(_81);
ice.submit(evt,_81||_80,function(_82){
if(Ice.Menu!=null&&Ice.Menu.menuContext!=null){
_82("ice.menuContext",Ice.Menu.menuContext);
}
_82("ice.submit.partial",true);
});
return false;
};
_7e=function(_83,_84,evt){
_83=_83||_7f(_84);
var _85;
if(evt.keyCode){
_85=evt.keyCode;
}else{
if(evt.which){
_85=evt.which;
}
}
if(_85>3){
if(_85!=13){
return false;
}
}
ice.submit(evt,_84||_83,function(_86){
if(Ice.Menu!=null&&Ice.Menu.menuContext!=null){
_86("ice.menuContext",Ice.Menu.menuContext);
}
});
return false;
};
_7f=function(_87){
var _88=_87.parentNode;
while(_88){
if(_88.tagName&&_88.tagName.toLowerCase()=="form"){
return _88;
}
_88=_88.parentNode;
}
throw "Cannot find enclosing form.";
};
})();
window.iceSubmitPartial=_7d;
window.iceSubmit=_7e;
window.formOf=_7f;
window.onLoad=_1.onLoad;
window.onUnload=_1.onUnload;
var _89=_1.log.childLogger(_1.log,"compat");
window.logger={debug:curry(_1.log.debug,_89),info:curry(_1.log.info,_89),warn:curry(_1.log.warn,_89),error:curry(_1.log.error,_89),child:function(){
return window.logger;
}};
_1.cancelEnterKeyEvent=function(e,_8a){
var ev=$event(e,_8a);
if(isEnterKey(ev)){
cancel(ev);
}
};
})(window.ice);
}

