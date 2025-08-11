package org.icefaces.ace.component.tooltip;

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
public class TooltipTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.TooltipRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.Tooltip";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression converter;
	public void setConverter(javax.el.ValueExpression converter) {
		this.converter = converter;
	}
	private javax.el.MethodExpression displayListener;
	public void setDisplayListener(javax.el.MethodExpression displayListener) {
		this.displayListener = displayListener;
	}
	private javax.el.ValueExpression fetch;
	public void setFetch(javax.el.ValueExpression fetch) {
		this.fetch = fetch;
	}
	private javax.el.ValueExpression forValue;
	public void setFor(javax.el.ValueExpression forValue) {
		this.forValue = forValue;
	}
	private javax.el.ValueExpression forContainer;
	public void setForContainer(javax.el.ValueExpression forContainer) {
		this.forContainer = forContainer;
	}
	private javax.el.ValueExpression forDelegate;
	public void setForDelegate(javax.el.ValueExpression forDelegate) {
		this.forDelegate = forDelegate;
	}
	private javax.el.ValueExpression forElement;
	public void setForElement(javax.el.ValueExpression forElement) {
		this.forElement = forElement;
	}
	private javax.el.ValueExpression global;
	public void setGlobal(javax.el.ValueExpression global) {
		this.global = global;
	}
	private javax.el.ValueExpression hideDelay;
	public void setHideDelay(javax.el.ValueExpression hideDelay) {
		this.hideDelay = hideDelay;
	}
	private javax.el.ValueExpression hideEffect;
	public void setHideEffect(javax.el.ValueExpression hideEffect) {
		this.hideEffect = hideEffect;
	}
	private javax.el.ValueExpression hideEffectLength;
	public void setHideEffectLength(javax.el.ValueExpression hideEffectLength) {
		this.hideEffectLength = hideEffectLength;
	}
	private javax.el.ValueExpression hideEvent;
	public void setHideEvent(javax.el.ValueExpression hideEvent) {
		this.hideEvent = hideEvent;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression position;
	public void setPosition(javax.el.ValueExpression position) {
		this.position = position;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression showDelay;
	public void setShowDelay(javax.el.ValueExpression showDelay) {
		this.showDelay = showDelay;
	}
	private javax.el.ValueExpression showEffect;
	public void setShowEffect(javax.el.ValueExpression showEffect) {
		this.showEffect = showEffect;
	}
	private javax.el.ValueExpression showEffectLength;
	public void setShowEffectLength(javax.el.ValueExpression showEffectLength) {
		this.showEffectLength = showEffectLength;
	}
	private javax.el.ValueExpression showEvent;
	public void setShowEvent(javax.el.ValueExpression showEvent) {
		this.showEvent = showEvent;
	}
	private javax.el.ValueExpression speechBubble;
	public void setSpeechBubble(javax.el.ValueExpression speechBubble) {
		this.speechBubble = speechBubble;
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
	private javax.el.ValueExpression targetPosition;
	public void setTargetPosition(javax.el.ValueExpression targetPosition) {
		this.targetPosition = targetPosition;
	}
	private javax.el.ValueExpression value;
	public void setValue(javax.el.ValueExpression value) {
		this.value = value;
	}
	private javax.el.ValueExpression widgetVar;
	public void setWidgetVar(javax.el.ValueExpression widgetVar) {
		this.widgetVar = widgetVar;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.tooltip.TooltipBase _component = null;
		try {
			_component = (org.icefaces.ace.component.tooltip.TooltipBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.tooltip.TooltipBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (converter != null) {
			_component.setValueExpression("converter", converter);
		}
		if (displayListener != null) {
			_component.setDisplayListener(displayListener);
		}
		if (fetch != null) {
			_component.setValueExpression("fetch", fetch);
		}
		if (forValue != null) {
			_component.setValueExpression("for", forValue);
		}
		if (forContainer != null) {
			_component.setValueExpression("forContainer", forContainer);
		}
		if (forDelegate != null) {
			_component.setValueExpression("forDelegate", forDelegate);
		}
		if (forElement != null) {
			_component.setValueExpression("forElement", forElement);
		}
		if (global != null) {
			_component.setValueExpression("global", global);
		}
		if (hideDelay != null) {
			_component.setValueExpression("hideDelay", hideDelay);
		}
		if (hideEffect != null) {
			_component.setValueExpression("hideEffect", hideEffect);
		}
		if (hideEffectLength != null) {
			_component.setValueExpression("hideEffectLength", hideEffectLength);
		}
		if (hideEvent != null) {
			_component.setValueExpression("hideEvent", hideEvent);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (position != null) {
			_component.setValueExpression("position", position);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (showDelay != null) {
			_component.setValueExpression("showDelay", showDelay);
		}
		if (showEffect != null) {
			_component.setValueExpression("showEffect", showEffect);
		}
		if (showEffectLength != null) {
			_component.setValueExpression("showEffectLength", showEffectLength);
		}
		if (showEvent != null) {
			_component.setValueExpression("showEvent", showEvent);
		}
		if (speechBubble != null) {
			_component.setValueExpression("speechBubble", speechBubble);
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
		if (targetPosition != null) {
			_component.setValueExpression("targetPosition", targetPosition);
		}
		if (value != null) {
			_component.setValueExpression("value", value);
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
		converter = null;
		displayListener = null;
		fetch = null;
		forValue = null;
		forContainer = null;
		forDelegate = null;
		forElement = null;
		global = null;
		hideDelay = null;
		hideEffect = null;
		hideEffectLength = null;
		hideEvent = null;
		id = null;
		position = null;
		rendered = null;
		showDelay = null;
		showEffect = null;
		showEffectLength = null;
		showEvent = null;
		speechBubble = null;
		store = null;
		style = null;
		styleClass = null;
		targetPosition = null;
		value = null;
		widgetVar = null;
	}
}