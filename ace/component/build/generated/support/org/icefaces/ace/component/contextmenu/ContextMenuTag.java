package org.icefaces.ace.component.contextmenu;

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
public class ContextMenuTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.ContextMenuRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.ContextMenu";
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
	private javax.el.ValueExpression fetch;
	public void setFetch(javax.el.ValueExpression fetch) {
		this.fetch = fetch;
	}
	private javax.el.ValueExpression forValue;
	public void setFor(javax.el.ValueExpression forValue) {
		this.forValue = forValue;
	}
	private javax.el.ValueExpression forDelegate;
	public void setForDelegate(javax.el.ValueExpression forDelegate) {
		this.forDelegate = forDelegate;
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
	private javax.el.ValueExpression store;
	public void setStore(javax.el.ValueExpression store) {
		this.store = store;
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
	private javax.el.ValueExpression zindex;
	public void setZindex(javax.el.ValueExpression zindex) {
		this.zindex = zindex;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.contextmenu.ContextMenuBase _component = null;
		try {
			_component = (org.icefaces.ace.component.contextmenu.ContextMenuBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.contextmenu.ContextMenuBase");
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
		if (fetch != null) {
			_component.setValueExpression("fetch", fetch);
		}
		if (forValue != null) {
			_component.setValueExpression("for", forValue);
		}
		if (forDelegate != null) {
			_component.setValueExpression("forDelegate", forDelegate);
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
		if (store != null) {
			_component.setValueExpression("store", store);
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
		if (zindex != null) {
			_component.setValueExpression("zindex", zindex);
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
		direction = null;
		effect = null;
		effectDuration = null;
		fetch = null;
		forValue = null;
		forDelegate = null;
		id = null;
		model = null;
		rendered = null;
		store = null;
		style = null;
		styleClass = null;
		widgetVar = null;
		zindex = null;
	}
}