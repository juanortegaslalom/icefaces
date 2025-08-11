package org.icefaces.ace.component.menuitem;

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
public class MenuItemTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return null;
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.MenuItem";
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
	private javax.el.ValueExpression helpText;
	public void setHelpText(javax.el.ValueExpression helpText) {
		this.helpText = helpText;
	}
	private javax.el.ValueExpression icon;
	public void setIcon(javax.el.ValueExpression icon) {
		this.icon = icon;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression immediate;
	public void setImmediate(javax.el.ValueExpression immediate) {
		this.immediate = immediate;
	}
	private javax.el.ValueExpression onclick;
	public void setOnclick(javax.el.ValueExpression onclick) {
		this.onclick = onclick;
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
	private javax.el.ValueExpression target;
	public void setTarget(javax.el.ValueExpression target) {
		this.target = target;
	}
	private javax.el.ValueExpression url;
	public void setUrl(javax.el.ValueExpression url) {
		this.url = url;
	}
	private javax.el.ValueExpression urlEncoding;
	public void setUrlEncoding(javax.el.ValueExpression urlEncoding) {
		this.urlEncoding = urlEncoding;
	}
	private javax.el.ValueExpression urlParameters;
	public void setUrlParameters(javax.el.ValueExpression urlParameters) {
		this.urlParameters = urlParameters;
	}
	private javax.el.ValueExpression value;
	public void setValue(javax.el.ValueExpression value) {
		this.value = value;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.menuitem.MenuItemBase _component = null;
		try {
			_component = (org.icefaces.ace.component.menuitem.MenuItemBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.menuitem.MenuItemBase");
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
		if (helpText != null) {
			_component.setValueExpression("helpText", helpText);
		}
		if (icon != null) {
			_component.setValueExpression("icon", icon);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (immediate != null) {
			_component.setValueExpression("immediate", immediate);
		}
		if (onclick != null) {
			_component.setValueExpression("onclick", onclick);
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
		if (target != null) {
			_component.setValueExpression("target", target);
		}
		if (url != null) {
			_component.setValueExpression("url", url);
		}
		if (urlEncoding != null) {
			_component.setValueExpression("urlEncoding", urlEncoding);
		}
		if (urlParameters != null) {
			_component.setValueExpression("urlParameters", urlParameters);
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
		helpText = null;
		icon = null;
		id = null;
		immediate = null;
		onclick = null;
		rendered = null;
		style = null;
		styleClass = null;
		target = null;
		url = null;
		urlEncoding = null;
		urlParameters = null;
		value = null;
	}
}