package org.icefaces.ace.component.menubar;

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
public class MenuBarTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.MenuBarRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.MenuBar";
	}
	private javax.el.ValueExpression autoSubmenuDisplay;
	public void setAutoSubmenuDisplay(javax.el.ValueExpression autoSubmenuDisplay) {
		this.autoSubmenuDisplay = autoSubmenuDisplay;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression direction;
	public void setDirection(javax.el.ValueExpression direction) {
		this.direction = direction;
	}
	private javax.el.ValueExpression effect;
	public void setEffect(javax.el.ValueExpression effect) {
		this.effect = effect;
	}
	private javax.el.ValueExpression effectDuration;
	public void setEffectDuration(javax.el.ValueExpression effectDuration) {
		this.effectDuration = effectDuration;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression model;
	public void setModel(javax.el.ValueExpression model) {
		this.model = model;
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
	private javax.el.ValueExpression widgetVar;
	public void setWidgetVar(javax.el.ValueExpression widgetVar) {
		this.widgetVar = widgetVar;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.menubar.MenuBarBase _component = null;
		try {
			_component = (org.icefaces.ace.component.menubar.MenuBarBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.menubar.MenuBarBase");
		}
		if (autoSubmenuDisplay != null) {
			_component.setValueExpression("autoSubmenuDisplay", autoSubmenuDisplay);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (direction != null) {
			_component.setValueExpression("direction", direction);
		}
		if (effect != null) {
			_component.setValueExpression("effect", effect);
		}
		if (effectDuration != null) {
			_component.setValueExpression("effectDuration", effectDuration);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (model != null) {
			_component.setValueExpression("model", model);
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
		autoSubmenuDisplay = null;
		binding = null;
		direction = null;
		effect = null;
		effectDuration = null;
		id = null;
		model = null;
		rendered = null;
		style = null;
		styleClass = null;
		widgetVar = null;
	}
}