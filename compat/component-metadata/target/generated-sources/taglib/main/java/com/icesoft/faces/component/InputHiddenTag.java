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
package com.icesoft.faces.component;

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

public class InputHiddenTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.HtmlInputHidden";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.Hidden";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        converter = null;
        immediate = null;
        required = null;
        requiredMessage = null;
        validator = null;
        value = null;
        valueChangeListener = null;
        converterMessage = null;
        validatorMessage = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
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
            if (immediate != null) {
                if (isValueReference(immediate)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(immediate));
                    _component.setValueBinding("immediate", _vb);
                } else {
                    _component.getAttributes().put("immediate", Boolean.valueOf(immediate));
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

    // converter
    private String converter = null;
    public void setConverter(String converter) {
        this.converter = converter;
    }

    // immediate
    private String immediate = null;
    public void setImmediate(String immediate) {
        this.immediate = immediate;
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
