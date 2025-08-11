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
package com.icesoft.faces.component.inputrichtext;

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

public class InputRichTextTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.InputRichText";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.InputRichTextRenderer";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        customConfigPath = null;
        disabled = null;
        _for = null;
        height = null;
        immediate = null;
        language = null;
        partialSubmit = null;
        required = null;
        requiredMessage = null;
        saveOnSubmit = null;
        skin = null;
        style = null;
        styleClass = null;
        toolbar = null;
        value = null;
        valueChangeListener = null;
        width = null;
        converter = null;
        converterMessage = null;
        validator = null;
        validatorMessage = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (customConfigPath != null) {
                if (isValueReference(customConfigPath)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(customConfigPath));
                    _component.setValueBinding("customConfigPath", _vb);
                } else {
                    _component.getAttributes().put("customConfigPath", customConfigPath);
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
            if (_for != null) {
                if (isValueReference(_for)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(_for));
                    _component.setValueBinding("for", _vb);
                } else {
                    _component.getAttributes().put("for", _for);
                }
            }
            if (height != null) {
                if (isValueReference(height)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(height));
                    _component.setValueBinding("height", _vb);
                } else {
                    _component.getAttributes().put("height", height);
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
            if (language != null) {
                if (isValueReference(language)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(language));
                    _component.setValueBinding("language", _vb);
                } else {
                    _component.getAttributes().put("language", language);
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
            if (saveOnSubmit != null) {
                if (isValueReference(saveOnSubmit)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(saveOnSubmit));
                    _component.setValueBinding("saveOnSubmit", _vb);
                } else {
                    _component.getAttributes().put("saveOnSubmit", Boolean.valueOf(saveOnSubmit));
                }
            }
            if (skin != null) {
                if (isValueReference(skin)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(skin));
                    _component.setValueBinding("skin", _vb);
                } else {
                    _component.getAttributes().put("skin", skin);
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
            if (toolbar != null) {
                if (isValueReference(toolbar)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(toolbar));
                    _component.setValueBinding("toolbar", _vb);
                } else {
                    _component.getAttributes().put("toolbar", toolbar);
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
            if (width != null) {
                if (isValueReference(width)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(width));
                    _component.setValueBinding("width", _vb);
                } else {
                    _component.getAttributes().put("width", width);
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
            if (converterMessage != null) {
                if (isValueReference(converterMessage)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(converterMessage));
                    _component.setValueBinding("converterMessage", _vb);
                } else {
                    _component.getAttributes().put("converterMessage", converterMessage);
                }
            }
            if (validator != null) {
                if (isValueReference(validator)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(validator));
                    _component.setValueBinding("validator", _vb);
                } else {
                    _component.getAttributes().put("validator", validator);
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

    // customConfigPath
    private String customConfigPath = null;
    public void setCustomConfigPath(String customConfigPath) {
        this.customConfigPath = customConfigPath;
    }

    // disabled
    private String disabled = null;
    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    // for
    private String _for = null;
    public void setFor(String _for) {
        this._for = _for;
    }

    // height
    private String height = null;
    public void setHeight(String height) {
        this.height = height;
    }

    // immediate
    private String immediate = null;
    public void setImmediate(String immediate) {
        this.immediate = immediate;
    }

    // language
    private String language = null;
    public void setLanguage(String language) {
        this.language = language;
    }

    // partialSubmit
    private String partialSubmit = null;
    public void setPartialSubmit(String partialSubmit) {
        this.partialSubmit = partialSubmit;
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

    // saveOnSubmit
    private String saveOnSubmit = null;
    public void setSaveOnSubmit(String saveOnSubmit) {
        this.saveOnSubmit = saveOnSubmit;
    }

    // skin
    private String skin = null;
    public void setSkin(String skin) {
        this.skin = skin;
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

    // toolbar
    private String toolbar = null;
    public void setToolbar(String toolbar) {
        this.toolbar = toolbar;
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

    // width
    private String width = null;
    public void setWidth(String width) {
        this.width = width;
    }

    // converter
    private String converter = null;
    public void setConverter(String converter) {
        this.converter = converter;
    }

    // converterMessage
    private String converterMessage = null;
    public void setConverterMessage(String converterMessage) {
        this.converterMessage = converterMessage;
    }

    // validator
    private String validator = null;
    public void setValidator(String validator) {
        this.validator = validator;
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
