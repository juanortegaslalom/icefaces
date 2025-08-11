package org.icefaces.ace.component.textareaentry;

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
public class TextAreaEntryTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.TextAreaEntryRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.TextAreaEntry";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression cols;
	public void setCols(javax.el.ValueExpression cols) {
		this.cols = cols;
	}
	private javax.el.ValueExpression converter;
	public void setConverter(javax.el.ValueExpression converter) {
		this.converter = converter;
	}
	private javax.el.ValueExpression converterMessage;
	public void setConverterMessage(javax.el.ValueExpression converterMessage) {
		this.converterMessage = converterMessage;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression immediate;
	public void setImmediate(javax.el.ValueExpression immediate) {
		this.immediate = immediate;
	}
	private javax.el.ValueExpression indicatorPosition;
	public void setIndicatorPosition(javax.el.ValueExpression indicatorPosition) {
		this.indicatorPosition = indicatorPosition;
	}
	private javax.el.ValueExpression label;
	public void setLabel(javax.el.ValueExpression label) {
		this.label = label;
	}
	private javax.el.ValueExpression labelPosition;
	public void setLabelPosition(javax.el.ValueExpression labelPosition) {
		this.labelPosition = labelPosition;
	}
	private javax.el.ValueExpression maxlength;
	public void setMaxlength(javax.el.ValueExpression maxlength) {
		this.maxlength = maxlength;
	}
	private javax.el.ValueExpression optionalIndicator;
	public void setOptionalIndicator(javax.el.ValueExpression optionalIndicator) {
		this.optionalIndicator = optionalIndicator;
	}
	private javax.el.ValueExpression placeholder;
	public void setPlaceholder(javax.el.ValueExpression placeholder) {
		this.placeholder = placeholder;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression required;
	public void setRequired(javax.el.ValueExpression required) {
		this.required = required;
	}
	private javax.el.ValueExpression requiredIndicator;
	public void setRequiredIndicator(javax.el.ValueExpression requiredIndicator) {
		this.requiredIndicator = requiredIndicator;
	}
	private javax.el.ValueExpression requiredMessage;
	public void setRequiredMessage(javax.el.ValueExpression requiredMessage) {
		this.requiredMessage = requiredMessage;
	}
	private javax.el.ValueExpression resizable;
	public void setResizable(javax.el.ValueExpression resizable) {
		this.resizable = resizable;
	}
	private javax.el.ValueExpression rows;
	public void setRows(javax.el.ValueExpression rows) {
		this.rows = rows;
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
	private javax.el.ValueExpression widgetVar;
	public void setWidgetVar(javax.el.ValueExpression widgetVar) {
		this.widgetVar = widgetVar;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.textareaentry.TextAreaEntryBase _component = null;
		try {
			_component = (org.icefaces.ace.component.textareaentry.TextAreaEntryBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.textareaentry.TextAreaEntryBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (cols != null) {
			_component.setValueExpression("cols", cols);
		}
		if (converter != null) {
			_component.setValueExpression("converter", converter);
		}
		if (converterMessage != null) {
			_component.setValueExpression("converterMessage", converterMessage);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (immediate != null) {
			_component.setValueExpression("immediate", immediate);
		}
		if (indicatorPosition != null) {
			_component.setValueExpression("indicatorPosition", indicatorPosition);
		}
		if (label != null) {
			_component.setValueExpression("label", label);
		}
		if (labelPosition != null) {
			_component.setValueExpression("labelPosition", labelPosition);
		}
		if (maxlength != null) {
			_component.setValueExpression("maxlength", maxlength);
		}
		if (optionalIndicator != null) {
			_component.setValueExpression("optionalIndicator", optionalIndicator);
		}
		if (placeholder != null) {
			_component.setValueExpression("placeholder", placeholder);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (required != null) {
			_component.setValueExpression("required", required);
		}
		if (requiredIndicator != null) {
			_component.setValueExpression("requiredIndicator", requiredIndicator);
		}
		if (requiredMessage != null) {
			_component.setValueExpression("requiredMessage", requiredMessage);
		}
		if (resizable != null) {
			_component.setValueExpression("resizable", resizable);
		}
		if (rows != null) {
			_component.setValueExpression("rows", rows);
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
		if (widgetVar != null) {
			_component.setValueExpression("widgetVar", widgetVar);
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
		cols = null;
		converter = null;
		converterMessage = null;
		id = null;
		immediate = null;
		indicatorPosition = null;
		label = null;
		labelPosition = null;
		maxlength = null;
		optionalIndicator = null;
		placeholder = null;
		rendered = null;
		required = null;
		requiredIndicator = null;
		requiredMessage = null;
		resizable = null;
		rows = null;
		validator = null;
		validatorMessage = null;
		value = null;
		valueChangeListener = null;
		widgetVar = null;
	}
}