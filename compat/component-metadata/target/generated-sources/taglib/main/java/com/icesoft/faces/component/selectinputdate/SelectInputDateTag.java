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
package com.icesoft.faces.component.selectinputdate;

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

public class SelectInputDateTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.SelectInputDate";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.Calendar";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        action = null;
        actionListener = null;
        autocomplete = null;
        converter = null;
        dir = null;
        disabled = null;
        enabledOnUserRole = null;
        highlightClass = null;
        highlightUnit = null;
        highlightValue = null;
        imageDir = null;
        immediate = null;
        inputTitle = null;
        lang = null;
        maxlength = null;
        onclick = null;
        ondblclick = null;
        onkeydown = null;
        onkeypress = null;
        onkeyup = null;
        onmousedown = null;
        onmousemove = null;
        onmouseout = null;
        onmouseover = null;
        onmouseup = null;
        partialSubmit = null;
        popupDateFormat = null;
        readonly = null;
        renderAsPopup = null;
        renderMonthAsDropdown = null;
        renderWeekNumbers = null;
        renderYearAsDropdown = null;
        renderedOnUserRole = null;
        required = null;
        requiredMessage = null;
        style = null;
        styleClass = null;
        tabindex = null;
        title = null;
        validator = null;
        value = null;
        valueChangeListener = null;
        visible = null;
        converterMessage = null;
        validatorMessage = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
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
            if (enabledOnUserRole != null) {
                if (isValueReference(enabledOnUserRole)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(enabledOnUserRole));
                    _component.setValueBinding("enabledOnUserRole", _vb);
                } else {
                    _component.getAttributes().put("enabledOnUserRole", enabledOnUserRole);
                }
            }
            if (highlightClass != null) {
                if (isValueReference(highlightClass)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(highlightClass));
                    _component.setValueBinding("highlightClass", _vb);
                } else {
                    _component.getAttributes().put("highlightClass", highlightClass);
                }
            }
            if (highlightUnit != null) {
                if (isValueReference(highlightUnit)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(highlightUnit));
                    _component.setValueBinding("highlightUnit", _vb);
                } else {
                    _component.getAttributes().put("highlightUnit", highlightUnit);
                }
            }
            if (highlightValue != null) {
                if (isValueReference(highlightValue)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(highlightValue));
                    _component.setValueBinding("highlightValue", _vb);
                } else {
                    _component.getAttributes().put("highlightValue", highlightValue);
                }
            }
            if (imageDir != null) {
                if (isValueReference(imageDir)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(imageDir));
                    _component.setValueBinding("imageDir", _vb);
                } else {
                    _component.getAttributes().put("imageDir", imageDir);
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
            if (inputTitle != null) {
                if (isValueReference(inputTitle)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(inputTitle));
                    _component.setValueBinding("inputTitle", _vb);
                } else {
                    _component.getAttributes().put("inputTitle", inputTitle);
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
            if (maxlength != null) {
                if (isValueReference(maxlength)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(maxlength));
                    _component.setValueBinding("maxlength", _vb);
                } else {
                    _component.getAttributes().put("maxlength", Integer.valueOf(maxlength));
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
            if (ondblclick != null) {
                if (isValueReference(ondblclick)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(ondblclick));
                    _component.setValueBinding("ondblclick", _vb);
                } else {
                    _component.getAttributes().put("ondblclick", ondblclick);
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
            if (onkeypress != null) {
                if (isValueReference(onkeypress)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onkeypress));
                    _component.setValueBinding("onkeypress", _vb);
                } else {
                    _component.getAttributes().put("onkeypress", onkeypress);
                }
            }
            if (onkeyup != null) {
                if (isValueReference(onkeyup)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onkeyup));
                    _component.setValueBinding("onkeyup", _vb);
                } else {
                    _component.getAttributes().put("onkeyup", onkeyup);
                }
            }
            if (onmousedown != null) {
                if (isValueReference(onmousedown)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmousedown));
                    _component.setValueBinding("onmousedown", _vb);
                } else {
                    _component.getAttributes().put("onmousedown", onmousedown);
                }
            }
            if (onmousemove != null) {
                if (isValueReference(onmousemove)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmousemove));
                    _component.setValueBinding("onmousemove", _vb);
                } else {
                    _component.getAttributes().put("onmousemove", onmousemove);
                }
            }
            if (onmouseout != null) {
                if (isValueReference(onmouseout)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmouseout));
                    _component.setValueBinding("onmouseout", _vb);
                } else {
                    _component.getAttributes().put("onmouseout", onmouseout);
                }
            }
            if (onmouseover != null) {
                if (isValueReference(onmouseover)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmouseover));
                    _component.setValueBinding("onmouseover", _vb);
                } else {
                    _component.getAttributes().put("onmouseover", onmouseover);
                }
            }
            if (onmouseup != null) {
                if (isValueReference(onmouseup)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmouseup));
                    _component.setValueBinding("onmouseup", _vb);
                } else {
                    _component.getAttributes().put("onmouseup", onmouseup);
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
            if (popupDateFormat != null) {
                if (isValueReference(popupDateFormat)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(popupDateFormat));
                    _component.setValueBinding("popupDateFormat", _vb);
                } else {
                    _component.getAttributes().put("popupDateFormat", popupDateFormat);
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
            if (renderAsPopup != null) {
                if (isValueReference(renderAsPopup)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(renderAsPopup));
                    _component.setValueBinding("renderAsPopup", _vb);
                } else {
                    _component.getAttributes().put("renderAsPopup", Boolean.valueOf(renderAsPopup));
                }
            }
            if (renderMonthAsDropdown != null) {
                if (isValueReference(renderMonthAsDropdown)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(renderMonthAsDropdown));
                    _component.setValueBinding("renderMonthAsDropdown", _vb);
                } else {
                    _component.getAttributes().put("renderMonthAsDropdown", Boolean.valueOf(renderMonthAsDropdown));
                }
            }
            if (renderWeekNumbers != null) {
                if (isValueReference(renderWeekNumbers)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(renderWeekNumbers));
                    _component.setValueBinding("renderWeekNumbers", _vb);
                } else {
                    _component.getAttributes().put("renderWeekNumbers", Boolean.valueOf(renderWeekNumbers));
                }
            }
            if (renderYearAsDropdown != null) {
                if (isValueReference(renderYearAsDropdown)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(renderYearAsDropdown));
                    _component.setValueBinding("renderYearAsDropdown", _vb);
                } else {
                    _component.getAttributes().put("renderYearAsDropdown", Boolean.valueOf(renderYearAsDropdown));
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
            if (converterMessage != null) {
                if (isValueReference(converterMessage)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(converterMessage));
                    _component.setValueBinding("converterMessage", _vb);
                } else {
                    _component.getAttributes().put("converterMessage", converterMessage);
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

    // enabledOnUserRole
    private String enabledOnUserRole = null;
    public void setEnabledOnUserRole(String enabledOnUserRole) {
        this.enabledOnUserRole = enabledOnUserRole;
    }

    // highlightClass
    private String highlightClass = null;
    public void setHighlightClass(String highlightClass) {
        this.highlightClass = highlightClass;
    }

    // highlightUnit
    private String highlightUnit = null;
    public void setHighlightUnit(String highlightUnit) {
        this.highlightUnit = highlightUnit;
    }

    // highlightValue
    private String highlightValue = null;
    public void setHighlightValue(String highlightValue) {
        this.highlightValue = highlightValue;
    }

    // imageDir
    private String imageDir = null;
    public void setImageDir(String imageDir) {
        this.imageDir = imageDir;
    }

    // immediate
    private String immediate = null;
    public void setImmediate(String immediate) {
        this.immediate = immediate;
    }

    // inputTitle
    private String inputTitle = null;
    public void setInputTitle(String inputTitle) {
        this.inputTitle = inputTitle;
    }

    // lang
    private String lang = null;
    public void setLang(String lang) {
        this.lang = lang;
    }

    // maxlength
    private String maxlength = null;
    public void setMaxlength(String maxlength) {
        this.maxlength = maxlength;
    }

    // onclick
    private String onclick = null;
    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    // ondblclick
    private String ondblclick = null;
    public void setOndblclick(String ondblclick) {
        this.ondblclick = ondblclick;
    }

    // onkeydown
    private String onkeydown = null;
    public void setOnkeydown(String onkeydown) {
        this.onkeydown = onkeydown;
    }

    // onkeypress
    private String onkeypress = null;
    public void setOnkeypress(String onkeypress) {
        this.onkeypress = onkeypress;
    }

    // onkeyup
    private String onkeyup = null;
    public void setOnkeyup(String onkeyup) {
        this.onkeyup = onkeyup;
    }

    // onmousedown
    private String onmousedown = null;
    public void setOnmousedown(String onmousedown) {
        this.onmousedown = onmousedown;
    }

    // onmousemove
    private String onmousemove = null;
    public void setOnmousemove(String onmousemove) {
        this.onmousemove = onmousemove;
    }

    // onmouseout
    private String onmouseout = null;
    public void setOnmouseout(String onmouseout) {
        this.onmouseout = onmouseout;
    }

    // onmouseover
    private String onmouseover = null;
    public void setOnmouseover(String onmouseover) {
        this.onmouseover = onmouseover;
    }

    // onmouseup
    private String onmouseup = null;
    public void setOnmouseup(String onmouseup) {
        this.onmouseup = onmouseup;
    }

    // partialSubmit
    private String partialSubmit = null;
    public void setPartialSubmit(String partialSubmit) {
        this.partialSubmit = partialSubmit;
    }

    // popupDateFormat
    private String popupDateFormat = null;
    public void setPopupDateFormat(String popupDateFormat) {
        this.popupDateFormat = popupDateFormat;
    }

    // readonly
    private String readonly = null;
    public void setReadonly(String readonly) {
        this.readonly = readonly;
    }

    // renderAsPopup
    private String renderAsPopup = null;
    public void setRenderAsPopup(String renderAsPopup) {
        this.renderAsPopup = renderAsPopup;
    }

    // renderMonthAsDropdown
    private String renderMonthAsDropdown = null;
    public void setRenderMonthAsDropdown(String renderMonthAsDropdown) {
        this.renderMonthAsDropdown = renderMonthAsDropdown;
    }

    // renderWeekNumbers
    private String renderWeekNumbers = null;
    public void setRenderWeekNumbers(String renderWeekNumbers) {
        this.renderWeekNumbers = renderWeekNumbers;
    }

    // renderYearAsDropdown
    private String renderYearAsDropdown = null;
    public void setRenderYearAsDropdown(String renderYearAsDropdown) {
        this.renderYearAsDropdown = renderYearAsDropdown;
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

    // converterMessage
    private String converterMessage = null;
    public void setConverterMessage(String converterMessage) {
        this.converterMessage = converterMessage;
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
