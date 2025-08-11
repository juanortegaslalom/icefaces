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
package com.icesoft.faces.component.ext;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * A hidden input field
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class HtmlInputHiddenBase extends javax.faces.component.html.HtmlInputHidden {

    /**
     * <p>Construct a new <code>HtmlInputHiddenBase</code>.</p>
     */
    public HtmlInputHiddenBase() {
        super();
        setRendererType("com.icesoft.faces.Hidden");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Input";
    }

    // converter
    private javax.faces.convert.Converter converter = null;

    /**
 * <p>Converter instance registered with this component.</p>
     */
    public javax.faces.convert.Converter getConverter() {
        if (this.converter != null) {
            return this.converter;
        }
        ValueBinding _vb = getValueBinding("converter");
        if (_vb != null) {
            return (javax.faces.convert.Converter) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Converter instance registered with this component.</p>
     * @see #getConverter()
     */
    public void setConverter(javax.faces.convert.Converter converter) {
        this.converter = converter;
    }

    // id
    private String id = null;

    /**
 * <p>The component identifier for this component. This value must be 
 *   			unique within the closest parent component that is a naming 
 *   			container.</p>
     */
    public String getId() {
        if (this.id != null) {
            return this.id;
        }
        ValueBinding _vb = getValueBinding("id");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The component identifier for this component. This value must be 
 *   			unique within the closest parent component that is a naming 
 *   			container.</p>
     * @see #getId()
     */
    public void setId(String id) {
        this.id = id;
    }

    // immediate
    private boolean immediate = false;
    private boolean immediate_set = false;

    /**
 * <p>Flag indicating that this component's value must be converted
 * 		and validated immediately (that is, during Apply Request Values
 * 		phase), rather than waiting until Process Validations phase.</p>
     */
    public boolean isImmediate() {
        if (this.immediate_set) {
            return this.immediate;
        }
        ValueBinding _vb = getValueBinding("immediate");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
 * <p>Flag indicating that this component's value must be converted
 * 		and validated immediately (that is, during Apply Request Values
 * 		phase), rather than waiting until Process Validations phase.</p>
     * @see #isImmediate()
     */
    public void setImmediate(boolean immediate) {
        this.immediate = immediate;
        this.immediate_set = true;
    }

    // rendered
    private boolean rendered = false;
    private boolean rendered_set = false;

    /**
 * <p>Flag indicating whether or not this component should be rendered 
 *   			(during Render Response Phase), or processed on any subsequent form 
 *   			submit.</p>
     */
    public boolean isRendered() {
        if (this.rendered_set) {
            return this.rendered;
        }
        ValueBinding _vb = getValueBinding("rendered");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
 * <p>Flag indicating whether or not this component should be rendered 
 *   			(during Render Response Phase), or processed on any subsequent form 
 *   			submit.</p>
     * @see #isRendered()
     */
    public void setRendered(boolean rendered) {
        this.rendered = rendered;
        this.rendered_set = true;
    }

    // required
    private boolean required = false;
    private boolean required_set = false;

    /**
 * <p>Flag indicating that the user is required to provide a submitted value 
 * 		for this input component.</p>
     */
    public boolean isRequired() {
        if (this.required_set) {
            return this.required;
        }
        ValueBinding _vb = getValueBinding("required");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
 * <p>Flag indicating that the user is required to provide a submitted value 
 * 		for this input component.</p>
     * @see #isRequired()
     */
    public void setRequired(boolean required) {
        this.required = required;
        this.required_set = true;
    }

    // requiredMessage
    private String requiredMessage = null;

    /**
 * <p>A ValueExpression enabled attribute that, if present, will be used as the text of the validation message for the "required" facility, if the "required" facility is used.</p>
     */
    public String getRequiredMessage() {
        if (this.requiredMessage != null) {
            return this.requiredMessage;
        }
        ValueBinding _vb = getValueBinding("requiredMessage");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>A ValueExpression enabled attribute that, if present, will be used as the text of the validation message for the "required" facility, if the "required" facility is used.</p>
     * @see #getRequiredMessage()
     */
    public void setRequiredMessage(String requiredMessage) {
        this.requiredMessage = requiredMessage;
    }

    // validator
    private javax.faces.el.MethodBinding validator = null;

    /**
 * <p>MethodBinding representing a validator method that will be called 
 * 		during Process Validations to perform correctness checks on the value 
 * 		of this component. The expression must evaluate to a public method that 
 * 		takes FacesContext, UIComponent, and Object parameters, with a return 
 * 		type of void.</p>
     */
    public javax.faces.el.MethodBinding getValidator() {
        if (this.validator != null) {
            return this.validator;
        }
        ValueBinding _vb = getValueBinding("validator");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>MethodBinding representing a validator method that will be called 
 * 		during Process Validations to perform correctness checks on the value 
 * 		of this component. The expression must evaluate to a public method that 
 * 		takes FacesContext, UIComponent, and Object parameters, with a return 
 * 		type of void.</p>
     * @see #getValidator()
     */
    public void setValidator(javax.faces.el.MethodBinding validator) {
        this.validator = validator;
    }

    // value
    private Object value = null;

    /**
 * <p>The current value of this component.</p>
 *         <p>All UIInput derived UIComponents, that are placed within a UIData 
 *         container, such as a dataTable or panelSeries, should have their 
 *         <i>value</i> attribute bound to a bean property via a 
 *         ValueBinding/ValueExpression, since otherwise the UIData container 
 *         will not keep their successfully validated state, which can cause 
 *         the component to fail to function properly.</p>
     */
    public Object getValue() {
        if (this.value != null) {
            return this.value;
        }
        ValueBinding _vb = getValueBinding("value");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The current value of this component.</p>
 *         <p>All UIInput derived UIComponents, that are placed within a UIData 
 *         container, such as a dataTable or panelSeries, should have their 
 *         <i>value</i> attribute bound to a bean property via a 
 *         ValueBinding/ValueExpression, since otherwise the UIData container 
 *         will not keep their successfully validated state, which can cause 
 *         the component to fail to function properly.</p>
     * @see #getValue()
     */
    public void setValue(Object value) {
        this.value = value;
    }

    // valueChangeListener
    private javax.faces.el.MethodBinding valueChangeListener = null;

    /**
 * <p>MethodBinding representing a value change listener method that will be 
 * 		notified when a new value has been set for this input component. The 
 * 		expression must evaluate to a public method that takes a 
 * 		ValueChangeEvent parameter, with a return type of void.</p>
     */
    public javax.faces.el.MethodBinding getValueChangeListener() {
        if (this.valueChangeListener != null) {
            return this.valueChangeListener;
        }
        ValueBinding _vb = getValueBinding("valueChangeListener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>MethodBinding representing a value change listener method that will be 
 * 		notified when a new value has been set for this input component. The 
 * 		expression must evaluate to a public method that takes a 
 * 		ValueChangeEvent parameter, with a return type of void.</p>
     * @see #getValueChangeListener()
     */
    public void setValueChangeListener(javax.faces.el.MethodBinding valueChangeListener) {
        this.valueChangeListener = valueChangeListener;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.converter = (javax.faces.convert.Converter) _values[1];
        this.id = (String) _values[2];
        this.immediate = ((Boolean) _values[3]).booleanValue();
        this.immediate_set = ((Boolean) _values[4]).booleanValue();
        this.rendered = ((Boolean) _values[5]).booleanValue();
        this.rendered_set = ((Boolean) _values[6]).booleanValue();
        this.required = ((Boolean) _values[7]).booleanValue();
        this.required_set = ((Boolean) _values[8]).booleanValue();
        this.requiredMessage = (String) _values[9];
        this.validator = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[10]);
        this.value = (Object) _values[11];
        this.valueChangeListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[12]);
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[13];
        _values[0] = super.saveState(_context);
        _values[1] = this.converter;
        _values[2] = this.id;
        _values[3] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.required ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.required_set ? Boolean.TRUE : Boolean.FALSE;
        _values[9] = this.requiredMessage;
        _values[10] = saveAttachedState(_context, validator);
        _values[11] = this.value;
        _values[12] = saveAttachedState(_context, valueChangeListener);
        return _values;
    }

}
