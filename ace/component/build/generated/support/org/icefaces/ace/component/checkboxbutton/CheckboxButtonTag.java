package org.icefaces.ace.component.checkboxbutton;

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
public class CheckboxButtonTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.CheckboxButtonRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.CheckboxButton";
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
	private javax.el.ValueExpression group;
	public void setGroup(javax.el.ValueExpression group) {
		this.group = group;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression immediate;
	public void setImmediate(javax.el.ValueExpression immediate) {
		this.immediate = immediate;
	}
	private javax.el.ValueExpression label;
	public void setLabel(javax.el.ValueExpression label) {
		this.label = label;
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
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
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
		org.icefaces.ace.component.checkboxbutton.CheckboxButtonBase _component = null;
		try {
			_component = (org.icefaces.ace.component.checkboxbutton.CheckboxButtonBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.checkboxbutton.CheckboxButtonBase");
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
		if (group != null) {
			_component.setValueExpression("group", group);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (immediate != null) {
			_component.setValueExpression("immediate", immediate);
		}
		if (label != null) {
			_component.setValueExpression("label", label);
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
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (styleClass != null) {
			_component.setValueExpression("styleClass", styleClass);
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
		group = null;
		id = null;
		immediate = null;
		label = null;
		rendered = null;
		required = null;
		requiredMessage = null;
		style = null;
		styleClass = null;
		tabindex = null;
		validator = null;
		validatorMessage = null;
		value = null;
		valueChangeListener = null;
	}
}