package org.icefaces.ace.component.pushbutton;

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
public class PushButtonTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.PushButtonRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.PushButton";
	}
	private javax.el.MethodExpression action;
	public void setAction(javax.el.MethodExpression action) {
		this.action = action;
	}
	private javax.el.MethodExpression actionListener;
	public void setActionListener(javax.el.MethodExpression actionListener) {
		this.actionListener = actionListener;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
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
	private javax.el.ValueExpression label;
	public void setLabel(javax.el.ValueExpression label) {
		this.label = label;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
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
	private javax.el.ValueExpression value;
	public void setValue(javax.el.ValueExpression value) {
		this.value = value;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.pushbutton.PushButtonBase _component = null;
		try {
			_component = (org.icefaces.ace.component.pushbutton.PushButtonBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.pushbutton.PushButtonBase");
		}
		if (action != null) {
			_component.setActionExpression(action);
		}
		if (actionListener != null) {
			_component.addActionListener(new MethodExpressionActionListener(actionListener));
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
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
		if (label != null) {
			_component.setValueExpression("label", label);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
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
		if (value != null) {
			_component.setValueExpression("value", value);
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
		action = null;
		actionListener = null;
		binding = null;
		disabled = null;
		id = null;
		immediate = null;
		label = null;
		rendered = null;
		style = null;
		styleClass = null;
		tabindex = null;
		value = null;
	}
}