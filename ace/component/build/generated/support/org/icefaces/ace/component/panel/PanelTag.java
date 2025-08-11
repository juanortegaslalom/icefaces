package org.icefaces.ace.component.panel;

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
public class PanelTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.PanelRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.Panel";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression closable;
	public void setClosable(javax.el.ValueExpression closable) {
		this.closable = closable;
	}
	private javax.el.ValueExpression closeSpeed;
	public void setCloseSpeed(javax.el.ValueExpression closeSpeed) {
		this.closeSpeed = closeSpeed;
	}
	private javax.el.ValueExpression collapsed;
	public void setCollapsed(javax.el.ValueExpression collapsed) {
		this.collapsed = collapsed;
	}
	private javax.el.ValueExpression disableInputs;
	public void setDisableInputs(javax.el.ValueExpression disableInputs) {
		this.disableInputs = disableInputs;
	}
	private javax.el.ValueExpression footer;
	public void setFooter(javax.el.ValueExpression footer) {
		this.footer = footer;
	}
	private javax.el.ValueExpression header;
	public void setHeader(javax.el.ValueExpression header) {
		this.header = header;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
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
	private javax.el.ValueExpression toggleSpeed;
	public void setToggleSpeed(javax.el.ValueExpression toggleSpeed) {
		this.toggleSpeed = toggleSpeed;
	}
	private javax.el.ValueExpression toggleable;
	public void setToggleable(javax.el.ValueExpression toggleable) {
		this.toggleable = toggleable;
	}
	private javax.el.ValueExpression visible;
	public void setVisible(javax.el.ValueExpression visible) {
		this.visible = visible;
	}
	private javax.el.ValueExpression widgetVar;
	public void setWidgetVar(javax.el.ValueExpression widgetVar) {
		this.widgetVar = widgetVar;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.panel.PanelBase _component = null;
		try {
			_component = (org.icefaces.ace.component.panel.PanelBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.panel.PanelBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (closable != null) {
			_component.setValueExpression("closable", closable);
		}
		if (closeSpeed != null) {
			_component.setValueExpression("closeSpeed", closeSpeed);
		}
		if (collapsed != null) {
			_component.setValueExpression("collapsed", collapsed);
		}
		if (disableInputs != null) {
			_component.setValueExpression("disableInputs", disableInputs);
		}
		if (footer != null) {
			_component.setValueExpression("footer", footer);
		}
		if (header != null) {
			_component.setValueExpression("header", header);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
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
		if (toggleSpeed != null) {
			_component.setValueExpression("toggleSpeed", toggleSpeed);
		}
		if (toggleable != null) {
			_component.setValueExpression("toggleable", toggleable);
		}
		if (visible != null) {
			_component.setValueExpression("visible", visible);
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
		closable = null;
		closeSpeed = null;
		collapsed = null;
		disableInputs = null;
		footer = null;
		header = null;
		id = null;
		rendered = null;
		style = null;
		styleClass = null;
		toggleSpeed = null;
		toggleable = null;
		visible = null;
		widgetVar = null;
	}
}