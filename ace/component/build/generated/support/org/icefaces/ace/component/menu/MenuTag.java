package org.icefaces.ace.component.menu;

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
public class MenuTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.MenuRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.Menu";
	}
	private javax.el.ValueExpression at;
	public void setAt(javax.el.ValueExpression at) {
		this.at = at;
	}
	private javax.el.ValueExpression backLabel;
	public void setBackLabel(javax.el.ValueExpression backLabel) {
		this.backLabel = backLabel;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
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
	private javax.el.ValueExpression maxHeight;
	public void setMaxHeight(javax.el.ValueExpression maxHeight) {
		this.maxHeight = maxHeight;
	}
	private javax.el.ValueExpression model;
	public void setModel(javax.el.ValueExpression model) {
		this.model = model;
	}
	private javax.el.ValueExpression my;
	public void setMy(javax.el.ValueExpression my) {
		this.my = my;
	}
	private javax.el.ValueExpression position;
	public void setPosition(javax.el.ValueExpression position) {
		this.position = position;
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
	private javax.el.ValueExpression tiered;
	public void setTiered(javax.el.ValueExpression tiered) {
		this.tiered = tiered;
	}
	private javax.el.ValueExpression trigger;
	public void setTrigger(javax.el.ValueExpression trigger) {
		this.trigger = trigger;
	}
	private javax.el.ValueExpression triggerEvent;
	public void setTriggerEvent(javax.el.ValueExpression triggerEvent) {
		this.triggerEvent = triggerEvent;
	}
	private javax.el.ValueExpression type;
	public void setType(javax.el.ValueExpression type) {
		this.type = type;
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
		org.icefaces.ace.component.menu.MenuBase _component = null;
		try {
			_component = (org.icefaces.ace.component.menu.MenuBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.menu.MenuBase");
		}
		if (at != null) {
			_component.setValueExpression("at", at);
		}
		if (backLabel != null) {
			_component.setValueExpression("backLabel", backLabel);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
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
		if (maxHeight != null) {
			_component.setValueExpression("maxHeight", maxHeight);
		}
		if (model != null) {
			_component.setValueExpression("model", model);
		}
		if (my != null) {
			_component.setValueExpression("my", my);
		}
		if (position != null) {
			_component.setValueExpression("position", position);
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
		if (tiered != null) {
			_component.setValueExpression("tiered", tiered);
		}
		if (trigger != null) {
			_component.setValueExpression("trigger", trigger);
		}
		if (triggerEvent != null) {
			_component.setValueExpression("triggerEvent", triggerEvent);
		}
		if (type != null) {
			_component.setValueExpression("type", type);
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
		at = null;
		backLabel = null;
		binding = null;
		effect = null;
		effectDuration = null;
		id = null;
		maxHeight = null;
		model = null;
		my = null;
		position = null;
		rendered = null;
		style = null;
		styleClass = null;
		tiered = null;
		trigger = null;
		triggerEvent = null;
		type = null;
		widgetVar = null;
		zindex = null;
	}
}