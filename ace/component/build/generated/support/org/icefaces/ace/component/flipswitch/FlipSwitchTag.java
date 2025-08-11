package org.icefaces.ace.component.flipswitch;

import java.io.IOException;
import javax.el.*;
import javax.faces.*;
import javax.faces.component.*;
import javax.faces.context.*;
import javax.faces.convert.*;
import javax.faces.el.*;
import javax.faces.event.*;
import javax.faces.validator.*;
import javax.faces.webapp.*;
import javax.servlet.jsp.JspException;

/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */
public class FlipSwitchTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icesoft.faces.FlipSwitchRenderer";
	}
	public String getComponentType() {
		return "org.icesoft.faces.FlipSwitch";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression converter;
	public void setConverter(javax.el.ValueExpression converter) {
		this.converter = converter;
	}
	private javax.el.ValueExpression converterMessage;
	public void setConverterMessage(javax.el.ValueExpression converterMessage) {
		this.converterMessage = converterMessage;
	}
	private javax.el.ValueExpression disabled;
	public void setDisabled(javax.el.ValueExpression disabled) {
		this.disabled = disabled;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression immediate;
	public void setImmediate(javax.el.ValueExpression immediate) {
		this.immediate = immediate;
	}
	private javax.el.ValueExpression labelOff;
	public void setLabelOff(javax.el.ValueExpression labelOff) {
		this.labelOff = labelOff;
	}
	private javax.el.ValueExpression labelOn;
	public void setLabelOn(javax.el.ValueExpression labelOn) {
		this.labelOn = labelOn;
	}
	private javax.el.ValueExpression readonly;
	public void setReadonly(javax.el.ValueExpression readonly) {
		this.readonly = readonly;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression required;
	public void setRequired(javax.el.ValueExpression required) {
		this.required = required;
	}
	private javax.el.ValueExpression requiredMessage;
	public void setRequiredMessage(javax.el.ValueExpression requiredMessage) {
		this.requiredMessage = requiredMessage;
	}
	private javax.el.ValueExpression singleSubmit;
	public void setSingleSubmit(javax.el.ValueExpression singleSubmit) {
		this.singleSubmit = singleSubmit;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression tabindex;
	public void setTabindex(javax.el.ValueExpression tabindex) {
		this.tabindex = tabindex;
	}
	private javax.el.MethodExpression validator;
	public void setValidator(javax.el.MethodExpression validator) {
		this.validator = validator;
	}
	private javax.el.ValueExpression validatorMessage;
	public void setValidatorMessage(javax.el.ValueExpression validatorMessage) {
		this.validatorMessage = validatorMessage;
	}
	private javax.el.ValueExpression value;
	public void setValue(javax.el.ValueExpression value) {
		this.value = value;
	}
	private javax.el.MethodExpression valueChangeListener;
	public void setValueChangeListener(javax.el.MethodExpression valueChangeListener) {
		this.valueChangeListener = valueChangeListener;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.flipswitch.FlipSwitchBase _component = null;
		try {
			_component = (org.icefaces.ace.component.flipswitch.FlipSwitchBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.flipswitch.FlipSwitchBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (converter != null) {
			_component.setValueExpression("converter", converter);
		}
		if (converterMessage != null) {
			_component.setValueExpression("converterMessage", converterMessage);
		}
		if (disabled != null) {
			_component.setValueExpression("disabled", disabled);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (immediate != null) {
			_component.setValueExpression("immediate", immediate);
		}
		if (labelOff != null) {
			_component.setValueExpression("labelOff", labelOff);
		}
		if (labelOn != null) {
			_component.setValueExpression("labelOn", labelOn);
		}
		if (readonly != null) {
			_component.setValueExpression("readonly", readonly);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (required != null) {
			_component.setValueExpression("required", required);
		}
		if (requiredMessage != null) {
			_component.setValueExpression("requiredMessage", requiredMessage);
		}
		if (singleSubmit != null) {
			_component.setValueExpression("singleSubmit", singleSubmit);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (tabindex != null) {
			_component.setValueExpression("tabindex", tabindex);
		}
		if (validator != null) {
			_component.addValidator(new MethodExpressionValidator(valueChangeListener));
		}
		if (validatorMessage != null) {
			_component.setValueExpression("validatorMessage", validatorMessage);
		}
		if (value != null) {
			_component.setValueExpression("value", value);
		}
		if (valueChangeListener != null) {
			_component.addValueChangeListener(new MethodExpressionValueChangeListener(valueChangeListener));
		}
	}

	public int doStartTag() throws JspException {
		try {
			return super.doStartTag();
		} catch (Exception e) {
			Throwable root = e;			
			while (root.getCause() != null) {
				root = root.getCause();
			}
			throw new JspException(root);
		}
	}

	public int doEndTag() throws JspException {
		try {
			return super.doEndTag();
		} catch (Exception e) {
			Throwable root = e;			
			while (root.getCause() != null) {
				root = root.getCause();
			}
			throw new JspException(root);
		}
	}
	/**
	 * <p>Release any allocated tag handler attributes.</p>
 	 */
	public void release() {
		super.release();
		binding = null;
		converter = null;
		converterMessage = null;
		disabled = null;
		id = null;
		immediate = null;
		labelOff = null;
		labelOn = null;
		readonly = null;
		rendered = null;
		required = null;
		requiredMessage = null;
		singleSubmit = null;
		style = null;
		tabindex = null;
		validator = null;
		validatorMessage = null;
		value = null;
		valueChangeListener = null;
	}
}