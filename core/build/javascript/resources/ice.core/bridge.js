if(!window.ice){
window.ice=new Object;
}
if(!window.ice.icefaces){
window.ice.globalEval=function(_1){
if(window.execScript){
window.execScript(_1);
}else{
(function(){
window.eval.call(window,_1);
})();
}
};
(function(_2){
_2.icefaces=true;
_2.configuration=new Object();
_2.disableDefaultErrorPopups=false;
_2.submitFunction=jsf.ajax.request;
function _3(_4){
return function(o){
return o==_4;
};
};
function _5(_6,_7){
return function removeCallback(){
var _8=reject(_6,_7);
empty(_6);
each(_8,curry(append,_6));
};
};
var _9=[];
_2.onSessionExpiry=function(_a){
append(_9,_a);
return _5(_9,_3(_a));
};
var _b=[];
_2.onNetworkError=function(_c){
append(_b,_c);
return _5(_b,_3(_c));
};
var _d=[];
_2.onServerError=function(_e){
append(_d,_e);
return _5(_d,_3(_e));
};
var _f=[];
_2.onViewDisposal=function(_10){
append(_f,_10);
return _5(_f,_3(_10));
};
var _11=[];
_2.onBeforeSubmit=function(_12){
append(_11,_12);
return _5(_11,_3(_12));
};
_2.onSubmitSend=_2.onBeforeSubmit;
var _13=[];
_2.onBeforeUpdate=function(_14){
append(_13,_14);
return _5(_13,_3(_14));
};
_2.onSubmitResponse=_2.onBeforeUpdate;
var _15=[];
_2.onAfterUpdate=function(_16){
append(_15,_16);
return _5(_15,_3(_16));
};
function _17(_18){
var _19=_1a(_18);
if(_19){
return _19;
}
_19=_1a(document.getElementById(_18.id));
if(_19){
return _19;
}
debug(_1b,"configuration not found for "+_18.nodeName);
return {};
};
function _1a(_1c){
configParent=detect(parents(_1c),function(e){
if(null!=e){
return e.configuration;
}
return {};
});
if(null!=configParent){
return configParent.configuration;
}
return null;
};
function _1d(_1e){
return _17(_1e).deltaSubmit;
};
function _1f(_20){
return _17(_20).viewID;
};
function _21(_22){
try{
return _23(_22);
}
catch(e){
return _23(document.getElementById(_22.id));
}
};
function _23(_24){
return toLowerCase(_24.nodeName)=="form"?_24:enclosingForm(_24);
};
function _25(id){
var e;
if(id=="javax.faces.ViewRoot"){
e=document.documentElement;
}else{
if(id=="javax.faces.ViewBody"){
e=document.body;
}else{
try{
e=document.getElementById(id);
}
catch(e){
}
}
}
return e;
};
function _26(_27,_28){
var e=_27[_28];
if(!e){
e=detect(_27.getElementsByTagName("input"),function(_29){
return _29.name&&_29.name==_28;
});
}
return e;
};
function _2a(_2b){
var e=_26(_2b,"javax.faces.ViewState");
if(e){
return e;
}else{
throw "cannot find javax.faces.ViewState input element";
}
};
function _2c(_2d){
return _2a(_2d).value;
};
function _2e(_2f){
return _2f+"-retrieve-update";
};
function _30(_31){
return _31+"-single-submit";
};
eval(ice.importFrom("ice.lib.functional"));
eval(ice.importFrom("ice.lib.oo"));
eval(ice.importFrom("ice.lib.collection"));
eval(ice.importFrom("ice.lib.hashtable"));
eval(ice.importFrom("ice.lib.string"));
eval(ice.importFrom("ice.lib.delay"));
eval(ice.importFrom("ice.lib.window"));
eval(ice.importFrom("ice.lib.event"));
eval(ice.importFrom("ice.lib.element"));
eval(ice.importFrom("ice.lib.logger"));
eval(ice.importFrom("ice.lib.query"));
eval(ice.importFrom("ice.lib.http"));
_2.onLoad=curry(onLoad,window);
_2.onUnload=curry(onUnload,window);
var _32=window.console&&window.console.log?ConsoleLogHandler(debug):WindowLogHandler(debug,window.location.href);
var _1b=Logger(["window"],_32);
_2.log=_1b;
_2.log.debug=debug;
_2.log.info=info;
_2.log.warn=warn;
_2.log.error=error;
_2.log.childLogger=childLogger;
var _33;
var _34;
var _35="";
var _36;
var _37;
(function(){
_33=function(id){
_35=id?id:"";
debug(_1b,"persisted focus for element \""+id+"\"");
};
function _38(_39,pos){
if(_39.createTextRange){
var _3a=_39.createTextRange();
_3a.move("character",pos);
_3a.select();
}else{
if(_39.selectionStart||_39.selectionStart==0){
_39.setSelectionRange(pos,pos);
}
}
};
function _3b(_3c){
if((toLowerCase(_3c.nodeName)=="input"&&_3c.type=="text")||toLowerCase(_3c.nodeName)=="textarea"){
var _3d=_3c.value;
_38(_3c,_3d.length);
}
};
function _3e(id){
return /^\w[\w\-\:]*$/.test(id);
};
var _3f=/MSIE/.test(navigator.userAgent);
var _40=function(id){
runOnce(Delay(function(){
if(id&&_3e(id)){
var e=document.getElementById(id);
if(e&&(e!=document.activeElement)){
_33(id);
if(e.focus){
try{
var x=window.scrollX;
var y=window.scrollY;
e.focus();
window.scrollTo(x,y);
}
catch(ex){
}
finally{
if(_3f){
try{
e.focus();
}
catch(ex2){
}
}
debug(_1b,"focused element \""+id+"\"");
_3b(e);
}
}
}
}
},100));
};
var _41=_40;
_34=function(id){
_41(id);
};
if(_3f){
var _42;
onLoad(window,function(){
_42=document.activeElement;
});
var _43=function(_44){
_45(document,"onfocusout",function(){
if(_42==document.activeElement){
_44();
}else{
_42=document.activeElement;
}
});
};
var _46=function(_47){
_45(window,"onfocus",_47);
};
_43(function(){
_41=_33;
});
_46(function(){
_41=_40;
});
}
function _45(_48,_49,_4a){
var _4b=_48[_49];
if(_4b){
_48[_49]=function(e){
var _4c=[e];
_4b.apply(_48,_4c);
_4a.apply(_48,_4c);
};
}else{
_48[_49]=_4a;
}
};
function _4d(e){
var evt=e||window.event;
var _4e=evt.srcElement||evt.target;
_33(_4e.id);
};
_36=function(_4f){
if(_4f.attachEvent){
_4f.attachEvent("onfocusin",_4d);
}else{
_4f.addEventListener("focus",_4d,true);
_4f.addEventListener("click",_4d,true);
}
};
_37=function(_50){
var id=_50.id;
_2.onAfterUpdate(function(_51){
if(detect(_51,function(_52){
return _52.getAttribute("id")==id;
})){
_36(_25(id));
}
});
};
})();
_2.setFocus=_33;
_2.sf=_33;
_2.applyFocus=_34;
_2.af=_34;
function _53(_54,_55,_56,_57){
var _58=document.createElement("input");
_58.setAttribute("name",_55);
_58.setAttribute("value",_56);
_58.setAttribute("type","hidden");
_58.setAttribute("autocomplete","off");
if(_57){
_58.defaultValue=_57;
}
_54.appendChild(_58);
return _58;
};
function _59(_5a,_5b,_5c,_5d){
var _5e=_5a[_5b];
if(!_5e){
_53(_5a,_5b,_5c,_5d);
}else{
if(_5e.value!=_5c){
_5e.parentNode.removeChild(_5e);
_53(_5a,_5b,_5c,_5d);
}
}
};
var _5f=[];
function _60(_61){
append(_5f,_61);
var _62=_2e(_61);
var _63=_25(_62);
_59(_63,"ice.view",_61);
_59(_63,"ice.window",_2.window);
var _64=function(){
var _65=_25(_62);
if(_65){
try{
debug(_1b,"picking updates for view "+_61);
var _66={"ice.submit.type":"ice.push",render:"@all"};
jsf.ajax.request(_65,null,_66);
}
catch(e){
warn(_1b,"failed to pick updates",e);
}
}
};
var _67=function(){
if(_68){
setTimeout(_67,20);
return;
}
_64();
};
return _67;
};
var _69=Client();
function _6a(_6b){
return function(){
var _6c=_25(_30(_6b));
if(_6c){
try{
var _6d=_26(_6c,"javax.faces.encodedURL");
var url=_6d?_6d.value:_6c.action;
_6c.action=url.replace(/(\?|&)cid=[0-9]+/,"$1");
debug(_1b,"dispose window and associated views "+_5f);
postSynchronously(_69,_6c.action,function(_6e){
addNameValue(_6e,"ice.submit.type","ice.dispose.window");
addNameValue(_6e,"ice.window",_2.window);
addNameValue(_6e,"javax.faces.ViewState",_2c(_6c));
each(_5f,curry(addNameValue,_6e,"ice.view"));
},FormPost,noop);
}
catch(e){
warn(_1b,"failed to notify window disposal",e);
}
}
};
};
function _6f(){
_60=noop;
if(_2.push){
each(_5f,_2.push.deregister);
}
broadcast(_9);
};
function _70(doc){
return doc&&doc.documentElement;
};
function _71(doc){
return doc.documentElement.nodeName=="html";
};
function _72(_73,_74,_75){
_73=_73||[];
_74=_74||[];
_75=_75||[];
var _76;
return function(_77){
var _78=_77.source;
if(_78){
_78=_25(_78.id);
try{
_76=_1f(_78);
}
catch(e){
}
if(_76){
switch(_77.status){
case "begin":
var _79=false;
if(_78.id!=_2e(_1f(_78))){
_79=true;
}
broadcast(_73,[_78,_79]);
break;
case "complete":
var _7a=_77.responseXML;
if(_70(_7a)){
if(_71(_7a)){
document.location=document.location.href;
}else{
broadcast(_74,[_7a,_78]);
}
}else{
warn(_1b,"the response does not contain XML data");
if(_17(_78).reloadOnUpdateFailure){
warn(_1b,"reloading page ...");
document.location=document.location.href;
}
}
break;
case "success":
var _7a=_77.responseXML;
broadcast(_75,[_7a,_78]);
break;
}
}
}else{
warn(_1b,"Source element is undefined, cannot determine if this view is ICEfaces enabled.");
}
};
};
function _7b(_7c,_7d,_7e){
_7c=_7c||[];
_7d=_7d||[];
return function(e){
if(e.status=="serverError"){
var _7f=e.responseXML;
if(_70(_7f)&&_7e){
var _80=_7f.getElementsByTagName("error-name")[0].firstChild.nodeValue;
if(_80&&contains(_80,"org.icefaces.application.SessionExpiredException")){
info(_1b,"received session expired message");
_7e();
return;
}
}
info(_1b,"received error message [code: "+e.responseCode+"]: "+e.responseText);
broadcast(_7d,[e.responseCode,e.responseText,_70(_7f)?_7f:null]);
}else{
if(e.status=="httpError"){
warn(_1b,"HTTP error [code: "+e.responseCode+"]: "+e.description);
broadcast(_7c,[e.responseCode,e.description]);
}else{
error(_1b,"Error [status: "+e.status+" code: "+e.responseCode+"]: "+e.description);
}
}
};
};
jsf.ajax.addOnEvent(_72(_11,_13,_15));
jsf.ajax.addOnError(_7b(_b,_d,_6f));
var _68;
function _81(e){
if("begin"==e.status){
_68=e;
}else{
_68=null;
}
if("success"==e.status){
var _82=e.responseXML;
var _83=_82.documentElement.firstChild.childNodes;
var _84=collect(_83,function(_85){
var id=_85.getAttribute("id");
var _86=_85.nodeName;
var _87=_86+(id?"[\""+id+"\"]":"");
if("update"==_86){
_87+=": "+substring(_85.firstChild.data,0,40)+"....";
}else{
if("insert"==_86){
var _88=_85.firstChild.getAttribute("id");
var _89=_85.firstChild.firstChild.data;
_87+=": "+_85.firstChild.nodeName+" "+_88+": "+substring(_89,0,40)+"....";
}else{
if("eval"==_86){
_87+=": "+substring(_85.firstChild.data,0,40)+"....";
}
}
}
return _87;
});
debug(_1b,"applied updates >>\n"+join(_84,"\n"));
}
};
jsf.ajax.addOnEvent(_81);
var _8a;
var _8b;
var _8c;
var _8d;
var _8e;
(function(){
function _8f(e){
return isString(e)?document.getElementById(e):e;
};
function _21(_90){
return toLowerCase(_90.nodeName)=="form"?_90:enclosingForm(_90);
};
function _91(_92,_93){
var _94=_93.id;
var _95=document.getElementById(_92+":ajaxDisabled");
return _95&&contains(split(trim(_95.value)," "),_94);
};
function _96(_97){
return _17(_97).standardFormSerialization;
};
function _98(_99,_9a){
var _9b=object(function(_9c){
_9c(addNameValue,function(_9d,_9e,_9f){
_9a[_9e]=_9f;
});
});
serializeOn(_99,_9b);
};
function _a0(_a1){
return _a1["javax.faces.encodedURL"]?_a1["javax.faces.encodedURL"].value:_a1.action;
};
function _a2(_a3,_a4){
if(_a3){
_a3(function(_a5,_a6){
_a4[_a5]=_a6;
});
}
};
function _a7(_a8,_a9){
if(_a8&&_a9.name&&_a9.id){
var _aa=_a8.split(" ");
for(var i=0,_ab=_aa.length;i<_ab;i++){
if(_aa[i]==_a9.name){
return _a8;
}
}
_a8=_a8+" "+_a9.name;
}
return _a8;
};
_8e=function(_ac,_ad,_ae,_af,_b0,_b1){
var _b2=_1f(_af);
var _b3=document.getElementById(_30(_b2));
var _b4=[];
try{
var _b5=_b3.appendChild(_af.cloneNode(true));
append(_b4,_b5);
var _b6=toLowerCase(_af.nodeName);
if(_b6=="input"){
if(_af.type=="radio"){
_b5.checked=_af.checked;
_ac=_a7(_ac,_af);
}
if(_af.type=="checkbox"){
_b5.checked=_af.checked;
var _b7=_af.name;
each(_af.form.elements,function(_b8){
if(_b8.name==_b7&&_b8!=_af){
var _b9=_b3.appendChild(_b8.cloneNode(true));
append(_b4,_b9);
_b9.checked=_b8.checked;
}
});
_ac=_a7(_ac,_af);
}
}else{
if(_b6=="select"){
var _ba=_b5.options;
each(_af.options,function(_bb,i){
_ba[i].selected=_bb.selected;
});
}else{
if(_b6=="textarea"){
_b5.value=_af.value;
}
}
}
_ae=_ae||null;
var _bc=[];
var _bd=[];
var _be=[];
var _bf=[];
var _c0=[];
if(_b1){
_b1(curry(append,_bc),curry(append,_bd),curry(append,_be),curry(append,_bf),curry(append,_c0));
}
if(_1d(_af)){
append(_be,_d4(_af,_b3));
}
var _c1=_72(_bc,_bd,_be);
var _c2=_7b(_bf,_c0);
var _c3={execute:_ac,render:_ad,onevent:_c1,onerror:_c2,"ice.window":_2.window,"ice.view":_b2,"ice.focus":_35};
var _c4=$event(_ae,_af);
if(isKeyEvent(_c4)&&isEnterKey(_c4)){
cancelBubbling(_c4);
cancelDefaultAction(_c4);
}
_98(_c4,_c3);
_a2(_b0,_c3);
debug(_1b,join(["partial submit to "+_a0(_b3),"javax.faces.execute: "+_ac,"javax.faces.render: "+_ad,"javax.faces.source: "+_af.id,"view ID: "+_b2,"event type: "+type(_c4)],"\n"));
_2.submitFunction(_b5,_ae,_c3);
}
catch(e){
debug(_1b,"singleSubmit failed "+e);
}
finally{
if(window.myfaces){
append(_be,function(){
each(_b4,function(c){
_b3.removeChild(c);
});
});
}else{
each(_b4,function(c){
_b3.removeChild(c);
});
}
}
};
_8a=function(_c5,_c6,_c7,_c8){
var _c9=_8f(_c6);
if(_96(_c9)){
return _8d("@this","@all",_c5,_c9,function(p){
p("ice.submit.type","ice.se");
p("ice.submit.serialization","form");
if(_c7){
_c7(p);
}
},_c8);
}else{
return _8e("@this","@all",_c5,_c9,function(p){
p("ice.submit.type","ice.se");
p("ice.submit.serialization","element");
if(_c7){
_c7(p);
}
},_c8);
}
};
_8b=function(_ca,_cb,_cc,_cd){
var _ce=_8f(_cb);
if(_96(_ce)){
return _8d("@this","@this",_ca,_ce,function(p){
p("ice.submit.type","ice.ser");
p("ice.submit.serialization","form");
if(_cc){
_cc(p);
}
},_cd);
}else{
return _8e("@this","@this",_ca,_ce,function(p){
p("ice.submit.type","ice.ser");
p("ice.submit.serialization","element");
if(_cc){
_cc(p);
}
},_cd);
}
};
var _cf="patch+";
var _d0="patch-";
function _d1(e){
if(!e){
return null;
}
return (e.currentTarget)?e.currentTarget:((e.target)?e.target:e.srcElement);
};
function _d2(e){
var _d3=toLowerCase(e.nodeName);
return (_d3=="input"&&(e.name!="javax.faces.ViewState"))||_d3=="select"||_d3=="textarea";
};
function _d4(_d5,_d6){
return function(_d7){
var _d8=inject(_d7.getElementsByTagName("update"),[],function(_d9,_da){
var id=_da.getAttribute("id");
if(contains(id,"javax.faces.ViewState")||endsWith(id,"_fixviewstate")){
return _d9;
}else{
return append(_d9,_25(id));
}
});
var _db=inject(_d8,[_d6],function(_dc,e){
if(_d2(e)&&not(contains(_dc,e.form))){
append(_dc,e.form);
}else{
each(e.getElementsByTagName("form"),function(_dd){
append(_dc,_dd);
});
}
return _dc;
});
each(_db,function(_de){
debug(_1b,"recalculate initial parameters for updated form[\""+_de.id+"\"]");
_de.previousParameters=HashSet(jsf.getViewState(_de).split("&"));
});
};
};
_8d=function(_df,_e0,_e1,_e2,_e3,_e4){
var f=null;
var _e5=_d1(_e1);
var _e6=(_e5)?_e5:triggeredBy($event(_e1,_e2));
if(_e6&&(_e6.tagName)&&(toLowerCase(_e6.tagName)=="form")){
_e6=_e2;
}
if(toLowerCase(_e2.tagName)=="form"){
f=_e2;
}else{
f=_21(_e2);
}
var _e7=f.id;
var _e8=false;
var _e9=_e6;
while(null!=_e9){
if((_e9.tagName)&&(toLowerCase(_e9.tagName)=="form")){
break;
}
if(_91(_e7,_e9)){
_e8=true;
break;
}
_e9=_e9.parentNode;
}
if(_e8){
if(f&&f.nativeSubmit){
var _ea=document.createElement("input");
_ea.setAttribute("type","hidden");
_ea.setAttribute("name",_e6.name);
_ea.setAttribute("value",_e6.value);
_ea.setAttribute("autocomplete","off");
f.appendChild(_ea);
f.nativeSubmit();
f.removeChild(_ea);
}
}else{
_e1=_e1||null;
var _eb=[];
var _ec=[];
var _ed=[];
var _ee=[];
var _ef=[];
if(_e4){
_e4(curry(append,_eb),curry(append,_ec),curry(append,_ed),curry(append,_ee),curry(append,_ef));
}
var _f0=_1f(_e2);
var _f1=_72(_eb,_ec,_ed);
var _f2=_7b(_ee,_ef);
var _f3={execute:_df,render:_e0,onevent:_f1,onerror:_f2,"ice.window":_2.window,"ice.view":_f0,"ice.focus":_35};
var _f4=$event(_e1,_e2);
if(isKeyEvent(_f4)&&isEnterKey(_f4)){
cancelBubbling(_f4);
cancelDefaultAction(_f4);
}
try{
_98(_f4,_f3);
}
catch(e){
debug(_1b,"Unable to serialize event "+e);
}
_a2(_e3,_f3);
var _f5=_21(_e2);
var _f6=_1d(_e2);
debug(_1b,join([(_f6?"delta ":"")+"full submit to "+_a0(_f5),"javax.faces.execute: "+_df,"javax.faces.render: "+_e0,"javax.faces.source: "+_e2.id,"view ID: "+_f0,"event type: "+type(_f4)],"\n"));
if(_f6){
append(_ed,_d4(_e2,f));
var _f7=_f5.previousParameters||HashSet();
var _f8=HashSet(jsf.getViewState(_f5).split("&"));
var _f9=complement(_f8,_f7);
var _fa=complement(_f7,_f8);
function _fb(f){
return function(p){
var _fc=split(p,"=");
f(decodeURIComponent(_fc[0]),decodeURIComponent(_fc[1]));
};
};
var _fd=document.getElementById(_30(_f0));
var _fe=[];
var _ff;
if(toLowerCase(_e2.nodeName)=="form"){
_ff=document.createElement("input");
_ff.setAttribute("id",_e2.id);
_ff.setAttribute("name",_e2.id);
_ff.setAttribute("value",_e2.id);
_ff.setAttribute("type","hidden");
_ff.setAttribute("autocomplete","off");
}else{
_ff=_e2.cloneNode(true);
_ff.value=_e2.value;
}
append(_fe,_fd.appendChild(_ff));
function _100(name,_101){
append(_fe,_53(_fd,name,_101));
};
try{
_100("ice.deltasubmit.form",_f5.id);
_100(_f5.id,_f5.id);
each(_f9,_fb(function(name,_102){
_100(_cf+name,_102);
}));
each(_fa,_fb(function(name,_103){
_100(_d0+name,_103);
}));
_2.submitFunction(_ff,_e1,_f3);
}
finally{
each(_fe,function(_104){
_fd.removeChild(_104);
});
}
}else{
_2.submitFunction(_e2,_e1,_f3);
}
}
};
_8c=function(_105,_106,_107,_108){
return _8d("@all","@all",_105,_8f(_106),function(p){
p("ice.submit.type","ice.s");
p("ice.submit.serialization","form");
if(_107){
_107(p);
}
},_108);
};
})();
_2.se=_8a;
_2.ser=_8b;
_2.submit=_8c;
_2.s=_8c;
_2.fullSubmit=_8d;
_2.ajaxRefresh=function(_109){
_109=_109||(document.body.configuration?document.body.configuration.viewID:null);
if(!_109){
throw "viewID parameter required";
}
var c=_17(_25(_2e(_109)));
if(!c.ajaxRefresh){
c.ajaxRefresh=_60(_109);
}
c.ajaxRefresh();
};
_2.setupBridge=function(_10a,_10b,_10c,_10d){
var _10e=document.getElementById(_10a).parentNode;
_10e.setupCount=_10e.setupCount?(_10e.setupCount+1):1;
if(_10e.setupCount==1){
_10e.configuration=_10d;
_10e.configuration.viewID=_10b;
_2.window=_10c;
if(_10d.sendDisposeWindow){
onBeforeUnload(window,_6a(_10b));
}
if(_10d.focusManaged){
_36(_10e);
_37(_10e);
}
if(_10d.clientSideElementUpdateDetermination){
_10f();
}
_110(_10e,_10d);
_111(_10e);
}
};
_2.setupPush=function(_112){
ice.push.register([_112],_60(_112));
};
_2.unsetupPush=function(_113){
ice.push.deregister([_113]);
};
_2.setupRefresh=function(_114,_115,_116,id){
var _117=_116<0?null:Math.floor(_116/_115);
var _118=_60(_114);
var _119=Delay(_118,_115);
run(_119,_117);
var _11a=curry(stop,_119);
_2.onSessionExpiry(_11a);
_2.onNetworkError(_11a);
_2.onServerError(_11a);
_2.onUnload(_11a);
_2.onElementUpdate(id,_11a);
};
_2.calculateInitialParameters=function(id){
var f=document.getElementById(id);
f.previousParameters=HashSet(jsf.getViewState(f).split("&"));
};
onBeforeUnload(window,function(){
_b=[];
});
onKeyPress(document,function(ev){
var e=$event(ev);
if(isEscKey(e)){
cancelDefaultAction(e);
}
});
(function(){
var _11b=[];
_2.onBeforeSessionExpiry=function(_11c){
append(_11b,_11c);
return _5(_11b,_3(_11c));
};
var _11d=object(function(_11e){
_11e(stop,noop);
});
var _11f=object(function(_120){
_120(stop,noop);
});
_2.resetSessionExpiryTimeout=function(_121,_122){
stop(_11d);
stop(_11f);
var _123=Math.round(_122/1000);
_11d=runOnce(Delay(function(){
broadcast(_11b,[_123]);
runOnce(Delay(function(){
_11f=broadcast(_9);
},_122));
},_121));
};
})();
var _111;
(function(){
function _124(_125){
_125.onkeypress=null;
_125.onmousedown=null;
_125.onmousemove=null;
_125.onmouseout=null;
_125.onmouseover=null;
_125.onclick=null;
_125.oncontextmenu=null;
_125.onchange=null;
_125.onfocus=null;
_125.onblur=null;
_125.submit=null;
_125.onsubmit=null;
_125.onkeydown=null;
_125.onkeyup=null;
_125.ondblclick=null;
_125.onfocusout=null;
};
_111=function(_126){
onUnload(window,function(){
_126.configuration=null;
each(["a","iframe"],function(type){
each(_126.getElementsByTagName(type),_124);
});
each(_126.getElementsByTagName("form"),function(form){
try{
form.submit=null;
}
catch(ex){
}
form.onsubmit=null;
var _127=form.elements;
if(_127){
each(_127,_124);
}
});
});
};
_2.onBeforeUpdate(function(_128){
each(_128.getElementsByTagName("update"),function(_129){
var id=_129.getAttribute("id");
var e=_25(id);
if(e){
_124(e);
each(["a","iframe","input","select","button","textarea"],function(type){
each(e.getElementsByTagName(type),_124);
});
each(e.getElementsByTagName("form"),function(form){
_124(form);
form.submit=null;
form.onsubmit=null;
});
}
});
});
})();
(function(){
_2.captureKeypress=function(id,_12a){
var f=document.getElementById(id);
f.onkeypress=function(ev){
var e=$event(ev,f);
var _12b=triggeredBy(e);
var type=toLowerCase(_12b.nodeName);
if(type!="textarea"&&type!="a"){
if(_12a){
var _12c=_12a[keyCode(e)];
if(_12c){
_12b=_25(_12c);
_8c(ev||window.event,_12b);
return false;
}
}
if(isEnterKey(e)){
var _12d=_12b;
while(_12d&&!_12d.submitOnEnter){
_12d=_12d.parentNode;
}
if(_12d&&_12d.submitOnEnter=="disabled"){
return false;
}else{
_8c(ev||window.event,_12b);
return false;
}
}
return true;
}
};
};
_2.captureSubmit=function(id){
var f=document.getElementById(id);
f.nativeSubmit=f.submit;
f.submit=function(){
var _12e=null;
if(typeof (event)!="undefined"){
_12e=event;
}else{
if(window.event){
_12e=window.event;
}else{
var _12f=null;
_12f=arguments.callee.caller.caller;
if(null==_12f){
_12f=arguments.callee.caller;
}
var _130=_12f.arguments[0];
if(typeof (_130.target)!="undefined"){
_12e=_130;
}
}
}
_8c(_12e,f);
};
each(["onkeydown","onkeypress","onkeyup","onclick","ondblclick","onchange"],function(name){
f[name]=function(e){
var _131=e||window.event;
var _132=_131.target||_131.srcElement;
f.onsubmit=function(){
if(_132.name&&!_132.id){
var _133=document.getElementById(_132.name);
if(!_133||!_133.id){
_132.id=_132.name;
}
}
var _134=document.getElementById(_132.id);
_8c(_131,_134?_132:f);
f.onsubmit=null;
return false;
};
};
});
};
})();
(function(){
_2.enableSingleSubmit=function(id,_135){
var f=document.getElementById(id);
f.singleSubmit="enabled";
function _136(ev){
var _137;
if(window.event){
_137=window.event.type;
}else{
_137=ev.type;
}
if(0==_137.indexOf("on")){
_137=_137.substr(2);
}
var e=$event(ev,f);
var _138=triggeredBy(e);
var _139=_138;
while(_139&&!_139.singleSubmit){
_139=_139.parentNode;
}
if(_139.singleSubmit=="disabled"){
return;
}
var _13a=_138.type;
if(!_13a){
return;
}
_13a=toLowerCase(_13a);
if(_13a=="image"){
return;
}
if(_13a=="submit"){
return;
}
if((null==_138.id)||(""==_138.id)){
return;
}
var _13b=((_13a=="text")||(_13a=="password")||(_13a=="textarea"));
if(_13b){
if((_137=="click")||!_135&&_137=="blur"){
return;
}
if(!_135&&_137=="focusout"){
if(_138.value==_138.previousTextValue){
return;
}
_138.previousTextValue=_138.value;
}
}
if(_13a==("select-one")){
if(_137!="change"){
if(_137=="click"&&_138.selectedIndex<=0&&!_138.previouslySelected){
_138.previouslySelected=_138.selectedIndex;
return;
}
if(_138.selectedIndex==_138.previouslySelected){
return;
}
_138.previouslySelected=_138.selectedIndex;
}
}
if(_13a==("select-multiple")){
if(_137!="change"){
var _13c=0;
for(var i=0;i<_138.options.length;i++){
if(_138.options[i].selected){
_13c++;
}
}
if(_13c==_138.previousNumberOfSelected&&_138.selectedIndex==_138.previouslySelected){
return;
}
_138.previouslySelected=_138.selectedIndex;
_138.previousNumberOfSelected=_13c;
}
}
ice.setFocus(null);
ice.se(e,_138);
};
if(f.addEventListener){
f.addEventListener("blur",_136,_135);
f.addEventListener("change",_136,false);
}else{
f.attachEvent("onfocusout",_136);
f.attachEvent("onclick",_136);
}
};
_2.cancelSingleSubmit=function(id){
if(typeof id!="string"){
return;
}
var f=document.getElementById(id);
if(!f){
return;
}
var _13d=function(_13e){
_13e=_13e||window.event;
if(_13e.stopPropagation){
_13e.stopPropagation();
}
_13e.cancelBubble=true;
};
if(f.addEventListener){
f.addEventListener("blur",_13d,false);
f.addEventListener("change",_13d,false);
}else{
f.attachEvent("onfocusout",_13d);
f.attachEvent("onclick",_13d);
}
};
_2.disableSingleSubmit=function(id){
var _13f=_25(id);
_13f.singleSubmit="disabled";
};
})();
(function(){
function _140(form){
return _26(form,"javax.faces.encodedURL")||_26(form,"javax.faces.ViewState")||_26(form,"ice.window")||_26(form,"ice.view")||(form.id&&form[form.id]&&form.id==form[form.id].value);
};
function _141(_142,_143){
var _144=detect(_142.getElementsByTagName("update"),function(_145){
return contains(_145.getAttribute("id"),"javax.faces.ViewState");
});
if(_144){
_143(_144.firstChild.data);
}
};
function _146(_147,_148){
each(_147.getElementsByTagName("update"),function(_149){
var id=_149.getAttribute("id");
var e=_25(id);
if(e){
if(toLowerCase(e.nodeName)=="form"){
if(_140(e)){
_148(e);
}
}else{
var _14a=join(collect(_149.childNodes,function(_14b){
return _14b.data;
}),"");
var _14c=_14a.match(/\<form[^\<]*\>/g);
if(_14c){
each(_14c,function(_14d){
var _14e=_14d.match(/id="([\S]*?)"/im);
if(_14e&&_14e[1]){
var id=_14e[1];
var form=document.getElementById(id);
if(form&&_140(form)){
_148(form);
}
}
});
}
}
}
});
};
_2.onAfterUpdate(function(_14f){
_141(_14f,function(_150){
_146(_14f,function(form){
try{
var _151=_2a(form);
if(_151.value!=_150){
_151.value=_150;
}
}
catch(ex){
_53(form,"javax.faces.ViewState",_150,_150);
debug(_1b,"append missing \"javax.faces.ViewState\" input element to form[\""+form.id+"\"]");
}
});
});
});
var _152;
_2.onBeforeSubmit(function(_153){
_152=_26(_21(_153),"ice.view").value;
});
_2.onAfterUpdate(function(_154){
_141(_154,function(_155){
each(document.getElementsByTagName("form"),function(form){
var _156=_26(form,"ice.view");
var _157=_26(form,"javax.faces.ViewState");
if(_157&&_156&&_156.value==_152){
_157.value=_155;
}
});
});
});
function _158(id,_159){
var form=_25(id);
try{
var _15a=_2a(form);
if(_15a.value!=_159){
_15a.value=_159;
}
}
catch(ex){
_53(form,"javax.faces.ViewState",_159,_159);
}
};
_2.fixViewStates=function(_15b,_15c){
for(var i=0;i<_15b.length;i++){
_158(_15b[i],_15c);
}
};
})();
var _10f;
(function(){
var _15d=[];
_2.onElementUpdate=function(id,_15e){
var _15f=_25(id);
if(_15f){
_15f["data-onElementUpdate"]=_15e;
}else{
warn(_1b,"Cannot find element ["+id+"] to assign onElementUpdate callback.");
}
};
function _160(id,_161){
var _162=_25(id);
var _163=[];
var _164=_162;
while(_164){
var _165;
if(_164==document.body){
_165="javax.faces.ViewBody";
}else{
if(_164==document.documentElement){
_165="javax.faces.ViewRoot";
}else{
if(_164==document.getElementsByTagName("head")[0]){
_165="javax.faces.ViewHead";
}else{
_165=_164.id;
}
}
}
if(_165){
_163.push(_165);
}
_164=_164.parentNode;
}
append(_15d,{identifier:id,handler:_161,ancestors:("*"+_163.join("*")+"*")});
return _5(_15d,function(c){
return id==c.id;
});
};
_10f=function(){
_2.onElementUpdate=_160;
_2.onBeforeUpdate(function(_166){
each(_166.getElementsByTagName("update"),_167);
each(_166.getElementsByTagName("delete"),_167);
});
};
function _167(_168){
var _169=_168.getAttribute("id");
if(contains(_169,"javax.faces.ViewState")){
return;
}
var _16a=_169.substr(_169.length-13);
if("_fixviewstate"===_16a){
return;
}
var _16b=_25(_169);
if(_16b){
_15d=reject(_15d,function(_16c){
var _16d=contains(_16c.ancestors,"*"+_169+"*");
if(_16d){
var id=_16c.identifier;
var _16e=_25(id);
if(_16e){
var _16f=_16c.handler;
try{
_16f(_16e);
}
catch(e){
}
}
return true;
}else{
return false;
}
});
}
};
_2.notifyOnElementUpdateCallbacks=function(ids){
each(ids,function(id){
var e=_25(id);
if(e){
var _170=e["data-onElementUpdate"];
if(_170){
try{
_170(id);
}
catch(ex){
warn(_1b,"onElementUpdate callback for ["+id+"] failed to run properly",ex);
}
finally{
e["data-onElementUpdate"]=null;
}
}
}
});
};
_2.notifyAllOnElementUpdateCallbacks=function(){
var _171=document.body.getElementsByTagName("*");
for(var i=0,l=_171.length;i<l;i++){
var e=_171[i];
var _172=e["data-onElementUpdate"];
if(_172){
var id=e.id;
try{
_172(id);
}
catch(ex){
warn(_1b,"onElementUpdate callback for ["+id+"] failed to run properly",ex);
}
finally{
e["data-onElementUpdate"]=null;
}
}
}
};
})();
(function(){
var _173=[];
_2.onElementRemove=function(id,_174){
append(_173,{i:id,c:_174});
return _5(_173,_3(_174));
};
_2.onAfterUpdate(function(){
each(_173,function(_175){
var _176=true;
try{
_176=!document.getElementById(_175.i);
}
catch(ex){
_176=true;
}
if(_176){
try{
_175.c();
}
catch(ex){
warn(_1b,"failed to execute onElementRemove callback for element "+_175.i);
}
}
});
});
})();
(function(){
var _177=[];
var _178=[];
var _179=false;
_2.onUserInactivity=function(_17a,_17b,_17c){
if(!_179){
_179=true;
_17d();
}
var _17e={interval:(_17a*1000),idleCallback:_17b,activeCallback:_17c};
append(_177,_17e);
return _5(_177,_3(_17e));
};
function _17d(){
var _17f=Delay(function(){
var now=(new Date).getTime();
var _180=select(_177,function(_181){
var _182=_181.interval;
var _183=now>_184+_182;
if(_183){
var _185=_181.idleCallback;
try{
_185();
}
catch(ex){
warn(_1b,"onUserInactivity idle user callback failed to run",ex);
}
}
return _183;
});
_177=complement(_177,_180);
_178=concatenate(_178,_180);
},3*1000);
run(_17f);
var _186=curry(stop,_17f);
_2.onSessionExpiry(_186);
_2.onNetworkError(_186);
_2.onServerError(_186);
_2.onUnload(_186);
var _184=(new Date).getTime();
function _187(){
_184=(new Date).getTime();
if(notEmpty(_178)){
each(_178,function(_188){
var _189=_188.activeCallback;
if(_189){
try{
_189();
}
catch(ex){
warn(_1b,"onUserInactivity active user callback failed to run",ex);
}
}
});
_177=concatenate(_177,_178);
_178=[];
}
};
registerListener("keydown",document,_187);
registerListener("mouseover",document,_187);
};
})();
var _110;
(function(){
var off=operator();
function _18a(_18b,_18c,_18d){
var _18e=_18d();
var _18f=document.body.appendChild(document.createElement("div"));
_18f.className="ice-status-indicator";
var _190=_18f.style;
_190.position="absolute";
_190.textAlign="center";
_190.zIndex="28001";
_190.color="black";
_190.backgroundColor="white";
_190.paddingLeft="10px";
_190.paddingRight="10px";
_190.paddingTop="15px";
_190.paddingBottom="15px";
_190.borderBottomColor="gray";
_190.borderRightColor="gray";
_190.borderTopColor="silver";
_190.borderLeftColor="silver";
_190.borderWidth="2px";
_190.borderStyle="solid";
var _191=_18f.appendChild(document.createElement("div"));
_191.appendChild(document.createTextNode(_18b));
_191.className="ice-status-indicator-message";
var _192=_191.style;
_192.textAlign="left";
_192.fontSize="14px";
_192.fontSize="14px";
_192.fontWeight="bold";
var _193=_191.appendChild(document.createElement("div"));
_193.innerHTML=_18c;
_193.className="ice-status-indicator-description";
var _194=_193.style;
_194.fontSize="11px";
_194.marginTop="7px";
_194.marginBottom="7px";
_194.fontWeight="normal";
var _195=function(){
_190.left=((window.width()-_18f.clientWidth)/2)+"px";
_190.top=((window.height()-_18f.clientHeight)/2)+"px";
};
_195();
var _196=onResize(window,_195);
return object(function(_197){
_197(off,function(self){
if(_18f){
try{
document.body.removeChild(_18f);
_196();
off(_18e);
}
finally{
_18f=null;
}
}
});
});
};
function _198(_199){
return function(){
var _19a=_199.ownerDocument.createElement("iframe");
_19a.setAttribute("src","about:blank");
_19a.setAttribute("frameborder","0");
_19a.className="ice-status-indicator-overlay";
var _19b=_19a.style;
_19b.top="0";
_19b.left="0";
_199.appendChild(_19a);
var _19c=_199.tagName.toLowerCase()=="body"?function(){
_19b.width=Math.max(document.documentElement.scrollWidth,document.body.scrollWidth)+"px";
_19b.height=Math.max(document.documentElement.scrollHeight,document.body.scrollHeight)+"px";
}:function(){
_19b.width=_199.offsetWidth+"px";
_19b.height=_199.offsetHeight+"px";
};
_19c();
var _19d=onResize(window,_19c);
return object(function(_19e){
_19e(off,function(self){
if(_19a){
try{
_199.removeChild(_19a);
_19d();
}
finally{
_19a=null;
}
}
});
});
};
};
function _19f(tag,html){
var _1a0=new RegExp("<"+tag+"[^<]*>","g").exec(html);
var end=new RegExp("</"+tag+">","g").exec(html);
var _1a1=html.substring(_1a0.index,end.index+end[0].length);
return _1a1.substring(_1a1.indexOf(">")+1,_1a1.lastIndexOf("<"));
};
_110=function(_1a2,_1a3){
var _1a4=_198(_1a2);
var _1a5=object(function(_1a6){
_1a6(off,noop);
});
function _1a7(){
return !(_2.disableDefaultErrorPopups||_1a3.disableDefaultErrorPopups);
};
_2.onServerError(function(code,html,_1a8){
if(_1a7()){
var _1a9;
var _1aa;
if(_1a8){
_1a9=_1a8.getElementsByTagName("error-message")[0].firstChild.nodeValue;
_1aa=_1a8.getElementsByTagName("error-name")[0].firstChild.nodeValue;
}else{
_1a9=_19f("title",html);
_1aa=_19f("body",html);
}
_18a(_1a9,_1aa,_1a4);
}
});
_2.onNetworkError(function(){
if(_1a7()){
_18a("Network Connection Interrupted","Reload this page to try to reconnect.",_1a4);
}
});
_2.onSessionExpiry(function(){
if(_1a7()){
off(_1a5);
_18a("User Session Expired","Reload this page to start a new user session.",_1a4);
}
});
_2.onBeforeSessionExpiry(function(time){
if(_1a7()){
_1a5=_18a("User Session is about to expire in "+time+" seconds.","Reload this page to keep your current user session.",_1a4);
}
});
};
})();
(function(){
var off=operator();
function _1ab(_1ac){
var _1ad=_1ac||document.body;
var _1ae=_1ad.ownerDocument.createElement("iframe");
_1ae.setAttribute("src","about:blank");
_1ae.setAttribute("frameborder","0");
_1ae.className="ice-blockui-overlay";
var _1af=_1ae.style;
_1af.top="0";
_1af.left="0";
if(_1ad.tagName.toLowerCase()=="body"){
_1af.width=Math.max(document.documentElement.scrollWidth,document.body.scrollWidth)+"px";
_1af.height=Math.max(document.documentElement.scrollHeight,document.body.scrollHeight)+"px";
}else{
_1af.width=_1ad.offsetWidth+"px";
_1af.height=_1ad.offsetHeight+"px";
}
_1ad.appendChild(_1ae);
return object(function(_1b0){
_1b0(off,function(self){
if(_1ae){
try{
_1ad.removeChild(_1ae);
}
catch(e){
}
}
});
});
};
function _1b1(_1b2){
return _17(_1b2).blockUIOnSubmit;
};
function _1b3(_1b4){
return function(e){
var ev=$event(e,_1b4);
var _1b5=type(ev);
var _1b6=triggeredBy(ev);
var _1b7=capturedBy(ev);
cancel(ev);
debug(_1b,"event [type: "+_1b5+", triggered by: "+(identifier(_1b6)||_1b6)+", captured in: "+(identifier(_1b7)||_1b7)+"] was discarded.");
};
};
function _1b8(){
var c=arguments.callee.caller;
while(c){
if(c==_2.fullSubmit){
var _1b9=c.arguments[2];
if(_1b9){
return _1b9.type=="blur";
}else{
return false;
}
}
c=c.arguments.callee.caller;
}
return false;
};
var _1ba=noop;
_2.onBeforeSubmit(function(_1bb,_1bc){
if(_1bc&&_1b1(_1bb)&&not(_1b8())){
debug(_1b,"blocking UI");
var _1bd=_1ab();
var _1be=inject(["input","select","textarea","button","a"],[],function(_1bf,type){
return concatenate(_1bf,asArray(collect(document.body.getElementsByTagName(type),function(e){
var sink=_1b3(e);
var _1c0=e.onkeypress;
var _1c1=e.onkeyup;
var _1c2=e.onkeydown;
var _1c3=e.onclick;
e.onkeypress=sink;
e.onkeyup=sink;
e.onkeydown=sink;
e.onclick=sink;
return function(){
try{
e.onkeypress=_1c0;
e.onkeyup=_1c1;
e.onkeydown=_1c2;
e.onclick=_1c3;
}
catch(ex){
}
};
})));
});
_1ba=function(){
broadcast(_1be);
off(_1bd);
debug(_1b,"unblocked UI");
};
}else{
_1ba=noop;
}
});
_2.onBeforeUpdate(function(){
_1ba();
});
})();
(function(){
function _1c4(tag,html){
var _1c5=new RegExp("<"+tag+"[^<]*>","g").exec(html);
var end=new RegExp("</"+tag+">","g").exec(html);
if(_1c5&&end&&_1c5.index&&end.index){
var _1c6=html.substring(_1c5.index,end.index+end[0].length);
return _1c6.substring(_1c6.indexOf(">")+1,_1c6.lastIndexOf("<"));
}else{
return "";
}
};
function _1c7(html,name,_1c8){
var re=new RegExp(name+"=\"([\\S]*?)\"","im");
var _1c9=html.match(re);
return _1c9?_1c9[1]:_1c8;
};
function _1ca(html){
return _1c7(html,"src");
};
function _1cb(text){
if(text){
var temp=document.createElement("div");
temp.innerHTML=text;
var _1cc=temp.firstChild.data;
temp.removeChild(temp.firstChild);
return _1cc;
}else{
return text;
}
};
function _1cd(url){
try{
var _1ce=indexOf(url,";");
var _1cf=substring(url,0,_1ce);
try{
var _1d0=indexOf(url,"?");
return _1cf+substring(url,_1d0,url.length);
}
catch(e){
return _1cf;
}
}
catch(e){
return url;
}
};
var _1d1=Client();
var _1d2=/<script[^>]*>([\S\s]*?)<\/script>/igm;
function _1d3(_1d4){
var _1d5=_1d4.match(_1d2);
if(_1d5){
var _1d6=collect(_1d5,function(_1d7){
var src=_1ca(_1d7);
var code;
if(src){
src=_1cd(_1cb(src));
if(contains(_1d9,src)){
code="";
}else{
getSynchronously(_1d1,src,noop,noop,function(_1d8){
code=contentAsText(_1d8);
});
append(_1d9,src);
}
}else{
code=_1cb(_1c4("script",_1d7));
}
return code;
});
each(select(_1d6,identity),_2.globalEval);
}
};
var _1da=/<link[^>]*>/igm;
function _1db(_1dc){
var _1dd=_1dc.match(_1da);
if(_1dd){
var _1de=collect(select(_1dd,function(_1df){
return _1c7(_1df,"type")=="text/css";
}),function(_1e0){
return replace(_1c7(_1e0,"href"),"&amp;","&");
});
var _1e1=document.getElementsByTagName("head")[0];
var _1e2=complement(_1de,_1e6);
each(_1e2,function(src){
var code;
getSynchronously(_1d1,src,noop,noop,function(_1e3){
code=contentAsText(_1e3);
});
var _1e4=document.createElement("style");
_1e4.type="text/css";
_1e1.appendChild(_1e4);
if(_1e4.styleSheet){
_1e4.styleSheet.cssText=code;
}else{
var _1e5=document.createTextNode(code);
_1e4.appendChild(_1e5);
}
});
_1e6=_1de;
}
};
var _1d9=[];
var _1e6=[];
function _1e7(_1e8){
return function(_1e9,s){
var src=s.getAttribute(_1e8);
if(src){
append(_1e9,_1cd(src));
}
return _1e9;
};
};
onLoad(window,function(){
var _1ea=document.documentElement.getElementsByTagName("script");
inject(_1ea,_1d9,_1e7("src"));
});
onLoad(window,function(){
var _1eb=document.documentElement.getElementsByTagName("link");
inject(_1eb,_1e6,_1e7("href"));
});
function _1ec(_1ed){
return detect(_1ed.getElementsByTagName("update"),function(_1ee){
return _1ee.getAttribute("id")=="javax.faces.ViewRoot";
});
};
onLoad(window,function(){
document.documentElement.isHeadUpdateSuccessful=null;
});
_2.onBeforeUpdate(function(_1ef){
var _1f0=detect(_1ef.getElementsByTagName("extension"),function(_1f1){
return _1f1.getAttribute("type")=="javax.faces.ViewHead";
});
var _1f2=document.write;
document.write=noop;
if(_1f0){
var _1f3=_1f0.firstChild.data;
_1d3(_1f3);
_1db(_1f3);
document.title=_1c4("title",_1f3);
}
document.write=_1f2;
});
_2.onAfterUpdate(function(_1f4){
var _1f5=_1ec(_1f4);
if(_1f5&&!document.documentElement.isHeadUpdateSuccessful){
var _1f6=_1c4("head",_1f5.firstChild.data);
_1d3(_1f6);
_1db(_1f6);
}else{
document.documentElement.isHeadUpdateSuccessful=null;
}
if(_1f5){
document.title=_1c4("title",_1f5.firstChild.data);
}
});
_2.onBeforeUpdate(function(_1f7){
each(_1f7.getElementsByTagName("update"),function(_1f8){
var id=_1f8.getAttribute("id");
var _1f9=_25(id);
if(_1f9){
each(_1f9.getElementsByTagName("iframe"),function(_1fa){
if(_1fa&&_1fa.parentNode){
_1fa.parentNode.removeChild(_1fa);
}
});
}
});
});
if(!/MSIE/.test(navigator.userAgent)){
_2.onBeforeUpdate(function(_1fb){
var _1fc=_1ec(_1fb);
if(_1fc){
var _1fd=document.body.configuration;
if(_1fd){
document.documentElement.configuration=_1fd;
}
}
});
}
try{
document.execCommand("BackgroundImageCache",false,true);
}
catch(err){
}
})();
})(window.ice);
}

