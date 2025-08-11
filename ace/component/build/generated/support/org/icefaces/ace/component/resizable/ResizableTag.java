package org.icefaces.ace.component.resizable;

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
public class ResizableTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.ResizableRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.Resizable";
	}
	private javax.el.ValueExpression animate;
	public void setAnimate(javax.el.ValueExpression animate) {
		this.animate = animate;
	}
	private javax.el.ValueExpression aspectRatio;
	public void setAspectRatio(javax.el.ValueExpression aspectRatio) {
		this.aspectRatio = aspectRatio;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression containment;
	public void setContainment(javax.el.ValueExpression containment) {
		this.containment = containment;
	}
	private javax.el.ValueExpression effect;
	public void setEffect(javax.el.ValueExpression effect) {
		this.effect = effect;
	}
	private javax.el.ValueExpression effectDuration;
	public void setEffectDuration(javax.el.ValueExpression effectDuration) {
		this.effectDuration = effectDuration;
	}
	private javax.el.ValueExpression forValue;
	public void setFor(javax.el.ValueExpression forValue) {
		this.forValue = forValue;
	}
	private javax.el.ValueExpression ghost;
	public void setGhost(javax.el.ValueExpression ghost) {
		this.ghost = ghost;
	}
	private javax.el.ValueExpression grid;
	public void setGrid(javax.el.ValueExpression grid) {
		this.grid = grid;
	}
	private javax.el.ValueExpression handles;
	public void setHandles(javax.el.ValueExpression handles) {
		this.handles = handles;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression maxHeight;
	public void setMaxHeight(javax.el.ValueExpression maxHeight) {
		this.maxHeight = maxHeight;
	}
	private javax.el.ValueExpression maxWidth;
	public void setMaxWidth(javax.el.ValueExpression maxWidth) {
		this.maxWidth = maxWidth;
	}
	private javax.el.ValueExpression minHeight;
	public void setMinHeight(javax.el.ValueExpression minHeight) {
		this.minHeight = minHeight;
	}
	private javax.el.ValueExpression minWidth;
	public void setMinWidth(javax.el.ValueExpression minWidth) {
		this.minWidth = minWidth;
	}
	private javax.el.ValueExpression proxy;
	public void setProxy(javax.el.ValueExpression proxy) {
		this.proxy = proxy;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.MethodExpression resizeListener;
	public void setResizeListener(javax.el.MethodExpression resizeListener) {
		this.resizeListener = resizeListener;
	}
	private javax.el.ValueExpression widgetVar;
	public void setWidgetVar(javax.el.ValueExpression widgetVar) {
		this.widgetVar = widgetVar;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.resizable.ResizableBase _component = null;
		try {
			_component = (org.icefaces.ace.component.resizable.ResizableBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.resizable.ResizableBase");
		}
		if (animate != null) {
			_component.setValueExpression("animate", animate);
		}
		if (aspectRatio != null) {
			_component.setValueExpression("aspectRatio", aspectRatio);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (containment != null) {
			_component.setValueExpression("containment", containment);
		}
		if (effect != null) {
			_component.setValueExpression("effect", effect);
		}
		if (effectDuration != null) {
			_component.setValueExpression("effectDuration", effectDuration);
		}
		if (forValue != null) {
			_component.setValueExpression("for", forValue);
		}
		if (ghost != null) {
			_component.setValueExpression("ghost", ghost);
		}
		if (grid != null) {
			_component.setValueExpression("grid", grid);
		}
		if (handles != null) {
			_component.setValueExpression("handles", handles);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (maxHeight != null) {
			_component.setValueExpression("maxHeight", maxHeight);
		}
		if (maxWidth != null) {
			_component.setValueExpression("maxWidth", maxWidth);
		}
		if (minHeight != null) {
			_component.setValueExpression("minHeight", minHeight);
		}
		if (minWidth != null) {
			_component.setValueExpression("minWidth", minWidth);
		}
		if (proxy != null) {
			_component.setValueExpression("proxy", proxy);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (resizeListener != null) {
			_component.setResizeListener(resizeListener);
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
		animate = null;
		aspectRatio = null;
		binding = null;
		containment = null;
		effect = null;
		effectDuration = null;
		forValue = null;
		ghost = null;
		grid = null;
		handles = null;
		id = null;
		maxHeight = null;
		maxWidth = null;
		minHeight = null;
		minWidth = null;
		proxy = null;
		rendered = null;
		resizeListener = null;
		widgetVar = null;
	}
}