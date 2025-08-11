/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an 'AS
 * IS' BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 */
package com.icesoft.faces.component.selectinputtext;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.webapp.UIComponentTag;
import com.icesoft.faces.component.dragdrop.DragEvent;
import com.icesoft.faces.component.dragdrop.DropEvent;
import com.icesoft.faces.component.DisplayEvent;
import com.icesoft.faces.component.outputchart.*;
import com.icesoft.faces.component.ext.*;
import com.icesoft.faces.component.panelpositioned.*;
import com.icesoft.faces.component.paneltabset.*;
import com.icesoft.util.pooling.ELPool;

/**
 * <p>Auto-generated component tag class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

public class SelectInputTextTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.SelectInputText";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.SelectInputText";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        accesskey = null;
        action = null;
        actionListener = null;
        alt = null;
        autocomplete = null;
        converter = null;
        dir = null;
        disabled = null;
        effect = null;
        enabledOnUserRole = null;
        immediate = null;
        lang = null;
        listValue = null;
        listVar = null;
        maxlength = null;
        onchange = null;
        onclick = null;
        onclickeffect = null;
        ondblclick = null;
        ondblclickeffect = null;
        onfocus = null;
        onkeydown = null;
        onkeydowneffect = null;
        onkeypress = null;
        onkeypresseffect = null;
        onkeyup = null;
        onkeyupeffect = null;
        onmousedown = null;
        onmousedowneffect = null;
        onmousemove = null;
        onmousemoveeffect = null;
        onmouseout = null;
        onmouseouteffect = null;
        onmouseover = null;
        onmouseovereffect = null;
        onmouseup = null;
        onmouseupeffect = null;
        onselect = null;
        options = null;
        partialSubmit = null;
        readonly = null;
        renderedOnUserRole = null;
        required = null;
        requiredMessage = null;
        rows = null;
        size = null;
        style = null;
        styleClass = null;
        tabindex = null;
        textChangeListener = null;
        title = null;
        validator = null;
        value = null;
        valueChangeListener = null;
        visible = null;
        width = null;
        converterMessage = null;
        label = null;
        onblur = null;
        validatorMessage = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (accesskey != null) {
                if (isValueReference(accesskey)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(accesskey));
                    _component.setValueBinding("accesskey", _vb);
                } else {
                    _component.getAttributes().put("accesskey", accesskey);
                }
            }
            if (action != null) {
                if (isValueReference(action)) {
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(action), actionArgs);
                    _component.getAttributes().put("action", _mb);
                } else {
                    MethodBinding _mb = new com.icesoft.faces.component.ext.taglib.MethodBindingString(action);
                    _component.getAttributes().put("action", _mb);
                }
            }
            if (actionListener != null) {
                if (isValueReference(actionListener)) {
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(actionListener), actionListenerArgs);
                    _component.getAttributes().put("actionListener", _mb);
                } else {
                    throw new IllegalArgumentException(actionListener);
                }
            }
            if (alt != null) {
                if (isValueReference(alt)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(alt));
                    _component.setValueBinding("alt", _vb);
                } else {
                    _component.getAttributes().put("alt", alt);
                }
            }
            if (autocomplete != null) {
                if (isValueReference(autocomplete)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(autocomplete));
                    _component.setValueBinding("autocomplete", _vb);
                } else {
                    _component.getAttributes().put("autocomplete", autocomplete);
                }
            }
            if (converter != null) {
                if (isValueReference(converter)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(converter));
                    _component.setValueBinding("converter", _vb);
                } else {
                    Converter _converter = FacesContext.getCurrentInstance().
                        getApplication().createConverter(converter);
                    _component.getAttributes().put("converter", _converter);
                }
            }
            if (dir != null) {
                if (isValueReference(dir)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(dir));
                    _component.setValueBinding("dir", _vb);
                } else {
                    _component.getAttributes().put("dir", dir);
                }
            }
            if (disabled != null) {
                if (isValueReference(disabled)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(disabled));
                    _component.setValueBinding("disabled", _vb);
                } else {
                    _component.getAttributes().put("disabled", Boolean.valueOf(disabled));
                }
            }
            if (effect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addEffect(effect, _component);
            }
            if (enabledOnUserRole != null) {
                if (isValueReference(enabledOnUserRole)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(enabledOnUserRole));
                    _component.setValueBinding("enabledOnUserRole", _vb);
                } else {
                    _component.getAttributes().put("enabledOnUserRole", enabledOnUserRole);
                }
            }
            if (immediate != null) {
                if (isValueReference(immediate)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(immediate));
                    _component.setValueBinding("immediate", _vb);
                } else {
                    _component.getAttributes().put("immediate", Boolean.valueOf(immediate));
                }
            }
            if (lang != null) {
                if (isValueReference(lang)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(lang));
                    _component.setValueBinding("lang", _vb);
                } else {
                    _component.getAttributes().put("lang", lang);
                }
            }
            if (listValue != null) {
                if (isValueReference(listValue)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(listValue));
                    _component.setValueBinding("listValue", _vb);
                } else {
                    throw new IllegalArgumentException("Not a valid value bind expression");
                }
            }
            if (listVar != null) {
                if (isValueReference(listVar)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(listVar));
                    _component.setValueBinding("listVar", _vb);
                } else {
                    _component.getAttributes().put("listVar", listVar);
                }
            }
            if (maxlength != null) {
                if (isValueReference(maxlength)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(maxlength));
                    _component.setValueBinding("maxlength", _vb);
                } else {
                    _component.getAttributes().put("maxlength", Integer.valueOf(maxlength));
                }
            }
            if (onchange != null) {
                if (isValueReference(onchange)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onchange));
                    _component.setValueBinding("onchange", _vb);
                } else {
                    _component.getAttributes().put("onchange", onchange);
                }
            }
            if (onclick != null) {
                if (isValueReference(onclick)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onclick));
                    _component.setValueBinding("onclick", _vb);
                } else {
                    _component.getAttributes().put("onclick", onclick);
                }
            }
            if (onclickeffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onclickeffect, "onclickeffect", _component);
            }
            if (ondblclick != null) {
                if (isValueReference(ondblclick)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(ondblclick));
                    _component.setValueBinding("ondblclick", _vb);
                } else {
                    _component.getAttributes().put("ondblclick", ondblclick);
                }
            }
            if (ondblclickeffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(ondblclickeffect, "ondblclickeffect", _component);
            }
            if (onfocus != null) {
                if (isValueReference(onfocus)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onfocus));
                    _component.setValueBinding("onfocus", _vb);
                } else {
                    _component.getAttributes().put("onfocus", onfocus);
                }
            }
            if (onkeydown != null) {
                if (isValueReference(onkeydown)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onkeydown));
                    _component.setValueBinding("onkeydown", _vb);
                } else {
                    _component.getAttributes().put("onkeydown", onkeydown);
                }
            }
            if (onkeydowneffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onkeydowneffect, "onkeydowneffect", _component);
            }
            if (onkeypress != null) {
                if (isValueReference(onkeypress)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onkeypress));
                    _component.setValueBinding("onkeypress", _vb);
                } else {
                    _component.getAttributes().put("onkeypress", onkeypress);
                }
            }
            if (onkeypresseffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onkeypresseffect, "onkeypresseffect", _component);
            }
            if (onkeyup != null) {
                if (isValueReference(onkeyup)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onkeyup));
                    _component.setValueBinding("onkeyup", _vb);
                } else {
                    _component.getAttributes().put("onkeyup", onkeyup);
                }
            }
            if (onkeyupeffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onkeyupeffect, "onkeyupeffect", _component);
            }
            if (onmousedown != null) {
                if (isValueReference(onmousedown)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmousedown));
                    _component.setValueBinding("onmousedown", _vb);
                } else {
                    _component.getAttributes().put("onmousedown", onmousedown);
                }
            }
            if (onmousedowneffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onmousedowneffect, "onmousedowneffect", _component);
            }
            if (onmousemove != null) {
                if (isValueReference(onmousemove)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmousemove));
                    _component.setValueBinding("onmousemove", _vb);
                } else {
                    _component.getAttributes().put("onmousemove", onmousemove);
                }
            }
            if (onmousemoveeffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onmousemoveeffect, "onmousemoveeffect", _component);
            }
            if (onmouseout != null) {
                if (isValueReference(onmouseout)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmouseout));
                    _component.setValueBinding("onmouseout", _vb);
                } else {
                    _component.getAttributes().put("onmouseout", onmouseout);
                }
            }
            if (onmouseouteffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onmouseouteffect, "onmouseouteffect", _component);
            }
            if (onmouseover != null) {
                if (isValueReference(onmouseover)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmouseover));
                    _component.setValueBinding("onmouseover", _vb);
                } else {
                    _component.getAttributes().put("onmouseover", onmouseover);
                }
            }
            if (onmouseovereffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onmouseovereffect, "onmouseovereffect", _component);
            }
            if (onmouseup != null) {
                if (isValueReference(onmouseup)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmouseup));
                    _component.setValueBinding("onmouseup", _vb);
                } else {
                    _component.getAttributes().put("onmouseup", onmouseup);
                }
            }
            if (onmouseupeffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onmouseupeffect, "onmouseupeffect", _component);
            }
            if (onselect != null) {
                if (isValueReference(onselect)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onselect));
                    _component.setValueBinding("onselect", _vb);
                } else {
                    _component.getAttributes().put("onselect", onselect);
                }
            }
            if (options != null) {
                if (isValueReference(options)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(options));
                    _component.setValueBinding("options", _vb);
                } else {
                    _component.getAttributes().put("options", options);
                }
            }
            if (partialSubmit != null) {
                if (isValueReference(partialSubmit)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(partialSubmit));
                    _component.setValueBinding("partialSubmit", _vb);
                } else {
                    _component.getAttributes().put("partialSubmit", Boolean.valueOf(partialSubmit));
                }
            }
            if (readonly != null) {
                if (isValueReference(readonly)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(readonly));
                    _component.setValueBinding("readonly", _vb);
                } else {
                    _component.getAttributes().put("readonly", Boolean.valueOf(readonly));
                }
            }
            if (renderedOnUserRole != null) {
                if (isValueReference(renderedOnUserRole)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(renderedOnUserRole));
                    _component.setValueBinding("renderedOnUserRole", _vb);
                } else {
                    _component.getAttributes().put("renderedOnUserRole", renderedOnUserRole);
                }
            }
            if (required != null) {
                if (isValueReference(required)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(required));
                    _component.setValueBinding("required", _vb);
                } else {
                    _component.getAttributes().put("required", Boolean.valueOf(required));
                }
            }
            if (requiredMessage != null) {
                if (isValueReference(requiredMessage)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(requiredMessage));
                    _component.setValueBinding("requiredMessage", _vb);
                } else {
                    _component.getAttributes().put("requiredMessage", requiredMessage);
                }
            }
            if (rows != null) {
                if (isValueReference(rows)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(rows));
                    _component.setValueBinding("rows", _vb);
                } else {
                    _component.getAttributes().put("rows", Integer.valueOf(rows));
                }
            }
            if (size != null) {
                if (isValueReference(size)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(size));
                    _component.setValueBinding("size", _vb);
                } else {
                    _component.getAttributes().put("size", Integer.valueOf(size));
                }
            }
            if (style != null) {
                if (isValueReference(style)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(style));
                    _component.setValueBinding("style", _vb);
                } else {
                    _component.getAttributes().put("style", style);
                }
            }
            if (styleClass != null) {
                if (isValueReference(styleClass)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(styleClass));
                    _component.setValueBinding("styleClass", _vb);
                } else {
                    _component.getAttributes().put("styleClass", styleClass);
                }
            }
            if (tabindex != null) {
                if (isValueReference(tabindex)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(tabindex));
                    _component.setValueBinding("tabindex", _vb);
                } else {
                    _component.getAttributes().put("tabindex", tabindex);
                }
            }
            if (textChangeListener != null) {
                if (isValueReference(textChangeListener)) {
                    Class[] listenerArgs= new Class[]{com.icesoft.faces.component.selectinputtext.TextChangeEvent.class};
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(textChangeListener), listenerArgs );
                    _component.getAttributes().put("textChangeListener", _mb);
                } else {
                    throw new IllegalArgumentException(textChangeListener);
                }
            }
            if (title != null) {
                if (isValueReference(title)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(title));
                    _component.setValueBinding("title", _vb);
                } else {
                    _component.getAttributes().put("title", title);
                }
            }
            if (validator != null) {
                if (isValueReference(validator)) {
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(validator), validatorArgs);
                    _component.getAttributes().put("validator", _mb);
                } else {
                    throw new IllegalArgumentException(validator);
                }
            }
            if (value != null) {
                if (isValueReference(value)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(value));
                    _component.setValueBinding("value", _vb);
                } else {
                    _component.getAttributes().put("value", value);
                }
            }
            if (valueChangeListener != null) {
                if (isValueReference(valueChangeListener)) {
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(valueChangeListener), valueChangeListenerArgs);
                    _component.getAttributes().put("valueChangeListener", _mb);
                } else {
                    throw new IllegalArgumentException(valueChangeListener);
                }
            }
            if (visible != null) {
                if (isValueReference(visible)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(visible));
                    _component.setValueBinding("visible", _vb);
                } else {
                    _component.getAttributes().put("visible", Boolean.valueOf(visible));
                }
            }
            if (width != null) {
                if (isValueReference(width)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(width));
                    _component.setValueBinding("width", _vb);
                } else {
                    _component.getAttributes().put("width", width);
                }
            }
            if (converterMessage != null) {
                if (isValueReference(converterMessage)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(converterMessage));
                    _component.setValueBinding("converterMessage", _vb);
                } else {
                    _component.getAttributes().put("converterMessage", converterMessage);
                }
            }
            if (label != null) {
                if (isValueReference(label)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(label));
                    _component.setValueBinding("label", _vb);
                } else {
                    _component.getAttributes().put("label", label);
                }
            }
            if (onblur != null) {
                if (isValueReference(onblur)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onblur));
                    _component.setValueBinding("onblur", _vb);
                } else {
                    _component.getAttributes().put("onblur", onblur);
                }
            }
            if (validatorMessage != null) {
                if (isValueReference(validatorMessage)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(validatorMessage));
                    _component.setValueBinding("validatorMessage", _vb);
                } else {
                    _component.getAttributes().put("validatorMessage", validatorMessage);
                }
            }
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // accesskey
    private String accesskey = null;
    public void setAccesskey(String accesskey) {
        this.accesskey = accesskey;
    }

    // action
    private String action = null;
    public void setAction(String action) {
        this.action = action;
    }

    // actionListener
    private String actionListener = null;
    public void setActionListener(String actionListener) {
        this.actionListener = actionListener;
    }

    // alt
    private String alt = null;
    public void setAlt(String alt) {
        this.alt = alt;
    }

    // autocomplete
    private String autocomplete = null;
    public void setAutocomplete(String autocomplete) {
        this.autocomplete = autocomplete;
    }

    // converter
    private String converter = null;
    public void setConverter(String converter) {
        this.converter = converter;
    }

    // dir
    private String dir = null;
    public void setDir(String dir) {
        this.dir = dir;
    }

    // disabled
    private String disabled = null;
    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    // effect
    private String effect = null;
    public void setEffect(String effect) {
        this.effect = effect;
    }

    // enabledOnUserRole
    private String enabledOnUserRole = null;
    public void setEnabledOnUserRole(String enabledOnUserRole) {
        this.enabledOnUserRole = enabledOnUserRole;
    }

    // immediate
    private String immediate = null;
    public void setImmediate(String immediate) {
        this.immediate = immediate;
    }

    // lang
    private String lang = null;
    public void setLang(String lang) {
        this.lang = lang;
    }

    // listValue
    private String listValue = null;
    public void setListValue(String listValue) {
        this.listValue = listValue;
    }

    // listVar
    private String listVar = null;
    public void setListVar(String listVar) {
        this.listVar = listVar;
    }

    // maxlength
    private String maxlength = null;
    public void setMaxlength(String maxlength) {
        this.maxlength = maxlength;
    }

    // onchange
    private String onchange = null;
    public void setOnchange(String onchange) {
        this.onchange = onchange;
    }

    // onclick
    private String onclick = null;
    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    // onclickeffect
    private String onclickeffect = null;
    public void setOnclickeffect(String onclickeffect) {
        this.onclickeffect = onclickeffect;
    }

    // ondblclick
    private String ondblclick = null;
    public void setOndblclick(String ondblclick) {
        this.ondblclick = ondblclick;
    }

    // ondblclickeffect
    private String ondblclickeffect = null;
    public void setOndblclickeffect(String ondblclickeffect) {
        this.ondblclickeffect = ondblclickeffect;
    }

    // onfocus
    private String onfocus = null;
    public void setOnfocus(String onfocus) {
        this.onfocus = onfocus;
    }

    // onkeydown
    private String onkeydown = null;
    public void setOnkeydown(String onkeydown) {
        this.onkeydown = onkeydown;
    }

    // onkeydowneffect
    private String onkeydowneffect = null;
    public void setOnkeydowneffect(String onkeydowneffect) {
        this.onkeydowneffect = onkeydowneffect;
    }

    // onkeypress
    private String onkeypress = null;
    public void setOnkeypress(String onkeypress) {
        this.onkeypress = onkeypress;
    }

    // onkeypresseffect
    private String onkeypresseffect = null;
    public void setOnkeypresseffect(String onkeypresseffect) {
        this.onkeypresseffect = onkeypresseffect;
    }

    // onkeyup
    private String onkeyup = null;
    public void setOnkeyup(String onkeyup) {
        this.onkeyup = onkeyup;
    }

    // onkeyupeffect
    private String onkeyupeffect = null;
    public void setOnkeyupeffect(String onkeyupeffect) {
        this.onkeyupeffect = onkeyupeffect;
    }

    // onmousedown
    private String onmousedown = null;
    public void setOnmousedown(String onmousedown) {
        this.onmousedown = onmousedown;
    }

    // onmousedowneffect
    private String onmousedowneffect = null;
    public void setOnmousedowneffect(String onmousedowneffect) {
        this.onmousedowneffect = onmousedowneffect;
    }

    // onmousemove
    private String onmousemove = null;
    public void setOnmousemove(String onmousemove) {
        this.onmousemove = onmousemove;
    }

    // onmousemoveeffect
    private String onmousemoveeffect = null;
    public void setOnmousemoveeffect(String onmousemoveeffect) {
        this.onmousemoveeffect = onmousemoveeffect;
    }

    // onmouseout
    private String onmouseout = null;
    public void setOnmouseout(String onmouseout) {
        this.onmouseout = onmouseout;
    }

    // onmouseouteffect
    private String onmouseouteffect = null;
    public void setOnmouseouteffect(String onmouseouteffect) {
        this.onmouseouteffect = onmouseouteffect;
    }

    // onmouseover
    private String onmouseover = null;
    public void setOnmouseover(String onmouseover) {
        this.onmouseover = onmouseover;
    }

    // onmouseovereffect
    private String onmouseovereffect = null;
    public void setOnmouseovereffect(String onmouseovereffect) {
        this.onmouseovereffect = onmouseovereffect;
    }

    // onmouseup
    private String onmouseup = null;
    public void setOnmouseup(String onmouseup) {
        this.onmouseup = onmouseup;
    }

    // onmouseupeffect
    private String onmouseupeffect = null;
    public void setOnmouseupeffect(String onmouseupeffect) {
        this.onmouseupeffect = onmouseupeffect;
    }

    // onselect
    private String onselect = null;
    public void setOnselect(String onselect) {
        this.onselect = onselect;
    }

    // options
    private String options = null;
    public void setOptions(String options) {
        this.options = options;
    }

    // partialSubmit
    private String partialSubmit = null;
    public void setPartialSubmit(String partialSubmit) {
        this.partialSubmit = partialSubmit;
    }

    // readonly
    private String readonly = null;
    public void setReadonly(String readonly) {
        this.readonly = readonly;
    }

    // renderedOnUserRole
    private String renderedOnUserRole = null;
    public void setRenderedOnUserRole(String renderedOnUserRole) {
        this.renderedOnUserRole = renderedOnUserRole;
    }

    // required
    private String required = null;
    public void setRequired(String required) {
        this.required = required;
    }

    // requiredMessage
    private String requiredMessage = null;
    public void setRequiredMessage(String requiredMessage) {
        this.requiredMessage = requiredMessage;
    }

    // rows
    private String rows = null;
    public void setRows(String rows) {
        this.rows = rows;
    }

    // size
    private String size = null;
    public void setSize(String size) {
        this.size = size;
    }

    // style
    private String style = null;
    public void setStyle(String style) {
        this.style = style;
    }

    // styleClass
    private String styleClass = null;
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // tabindex
    private String tabindex = null;
    public void setTabindex(String tabindex) {
        this.tabindex = tabindex;
    }

    // textChangeListener
    private String textChangeListener = null;
    public void setTextChangeListener(String textChangeListener) {
        this.textChangeListener = textChangeListener;
    }

    // title
    private String title = null;
    public void setTitle(String title) {
        this.title = title;
    }

    // validator
    private String validator = null;
    public void setValidator(String validator) {
        this.validator = validator;
    }

    // value
    private String value = null;
    public void setValue(String value) {
        this.value = value;
    }

    // valueChangeListener
    private String valueChangeListener = null;
    public void setValueChangeListener(String valueChangeListener) {
        this.valueChangeListener = valueChangeListener;
    }

    // visible
    private String visible = null;
    public void setVisible(String visible) {
        this.visible = visible;
    }

    // width
    private String width = null;
    public void setWidth(String width) {
        this.width = width;
    }

    // converterMessage
    private String converterMessage = null;
    public void setConverterMessage(String converterMessage) {
        this.converterMessage = converterMessage;
    }

    // label
    private String label = null;
    public void setLabel(String label) {
        this.label = label;
    }

    // onblur
    private String onblur = null;
    public void setOnblur(String onblur) {
        this.onblur = onblur;
    }

    // validatorMessage
    private String validatorMessage = null;
    public void setValidatorMessage(String validatorMessage) {
        this.validatorMessage = validatorMessage;
    }

    private static Class actionArgs[] = new Class[0];
    private static Class actionListenerArgs[] = { javax.faces.event.ActionEvent.class };
    private static Class validatorArgs[] = { FacesContext.class, UIComponent.class, Object.class };
    private static Class valueChangeListenerArgs[] = { javax.faces.event.ValueChangeEvent.class };


    // 
    // Methods From TagSupport
    // 

    public int doStartTag() throws JspException {
        int rc = 0;
        try {
            rc = super.doStartTag();
        } catch (JspException e) {
            throw e;
        } catch (Throwable t) {
            throw new JspException(t);
        }
        return rc;
    }


    public int doEndTag() throws JspException {
        int rc = 0;
        try {
            rc = super.doEndTag();
        } catch (JspException e) {
            throw e;
        } catch (Throwable t) {
            throw new JspException(t);
        }
        return rc;
    }

}
