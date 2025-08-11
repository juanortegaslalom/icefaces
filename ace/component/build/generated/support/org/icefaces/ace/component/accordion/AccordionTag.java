package org.icefaces.ace.component.accordion;

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
public class AccordionTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.AccordionRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.Accordion";
	}
	private javax.el.ValueExpression activeIndex;
	public void setActiveIndex(javax.el.ValueExpression activeIndex) {
		this.activeIndex = activeIndex;
	}
	private javax.el.ValueExpression autoHeight;
	public void setAutoHeight(javax.el.ValueExpression autoHeight) {
		this.autoHeight = autoHeight;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression cache;
	public void setCache(javax.el.ValueExpression cache) {
		this.cache = cache;
	}
	private javax.el.ValueExpression collapsible;
	public void setCollapsible(javax.el.ValueExpression collapsible) {
		this.collapsible = collapsible;
	}
	private javax.el.ValueExpression disabled;
	public void setDisabled(javax.el.ValueExpression disabled) {
		this.disabled = disabled;
	}
	private javax.el.ValueExpression dynamic;
	public void setDynamic(javax.el.ValueExpression dynamic) {
		this.dynamic = dynamic;
	}
	private javax.el.ValueExpression effect;
	public void setEffect(javax.el.ValueExpression effect) {
		this.effect = effect;
	}
	private javax.el.ValueExpression event;
	public void setEvent(javax.el.ValueExpression event) {
		this.event = event;
	}
	private javax.el.ValueExpression fillSpace;
	public void setFillSpace(javax.el.ValueExpression fillSpace) {
		this.fillSpace = fillSpace;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.MethodExpression paneChangeListener;
	public void setPaneChangeListener(javax.el.MethodExpression paneChangeListener) {
		this.paneChangeListener = paneChangeListener;
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
		org.icefaces.ace.component.accordion.AccordionBase _component = null;
		try {
			_component = (org.icefaces.ace.component.accordion.AccordionBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.accordion.AccordionBase");
		}
		if (activeIndex != null) {
			_component.setValueExpression("activeIndex", activeIndex);
		}
		if (autoHeight != null) {
			_component.setValueExpression("autoHeight", autoHeight);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (cache != null) {
			_component.setValueExpression("cache", cache);
		}
		if (collapsible != null) {
			_component.setValueExpression("collapsible", collapsible);
		}
		if (disabled != null) {
			_component.setValueExpression("disabled", disabled);
		}
		if (dynamic != null) {
			_component.setValueExpression("dynamic", dynamic);
		}
		if (effect != null) {
			_component.setValueExpression("effect", effect);
		}
		if (event != null) {
			_component.setValueExpression("event", event);
		}
		if (fillSpace != null) {
			_component.setValueExpression("fillSpace", fillSpace);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (paneChangeListener != null) {
			_component.setPaneChangeListener(paneChangeListener);
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
		activeIndex = null;
		autoHeight = null;
		binding = null;
		cache = null;
		collapsible = null;
		disabled = null;
		dynamic = null;
		effect = null;
		event = null;
		fillSpace = null;
		id = null;
		paneChangeListener = null;
		rendered = null;
		style = null;
		styleClass = null;
		widgetVar = null;
	}
}