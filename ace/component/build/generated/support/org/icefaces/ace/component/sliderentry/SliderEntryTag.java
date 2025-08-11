package org.icefaces.ace.component.sliderentry;

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
public class SliderEntryTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.SliderEntryRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.SliderEntry";
	}
	private javax.el.ValueExpression animate;
	public void setAnimate(javax.el.ValueExpression animate) {
		this.animate = animate;
	}
	private javax.el.ValueExpression axis;
	public void setAxis(javax.el.ValueExpression axis) {
		this.axis = axis;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression clickableRail;
	public void setClickableRail(javax.el.ValueExpression clickableRail) {
		this.clickableRail = clickableRail;
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
	private javax.el.ValueExpression length;
	public void setLength(javax.el.ValueExpression length) {
		this.length = length;
	}
	private javax.el.ValueExpression max;
	public void setMax(javax.el.ValueExpression max) {
		this.max = max;
	}
	private javax.el.ValueExpression min;
	public void setMin(javax.el.ValueExpression min) {
		this.min = min;
	}
	private javax.el.ValueExpression onSlide;
	public void setOnSlide(javax.el.ValueExpression onSlide) {
		this.onSlide = onSlide;
	}
	private javax.el.ValueExpression onSlideEnd;
	public void setOnSlideEnd(javax.el.ValueExpression onSlideEnd) {
		this.onSlideEnd = onSlideEnd;
	}
	private javax.el.ValueExpression onSlideStart;
	public void setOnSlideStart(javax.el.ValueExpression onSlideStart) {
		this.onSlideStart = onSlideStart;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression showLabels;
	public void setShowLabels(javax.el.ValueExpression showLabels) {
		this.showLabels = showLabels;
	}
	private javax.el.ValueExpression stepPercent;
	public void setStepPercent(javax.el.ValueExpression stepPercent) {
		this.stepPercent = stepPercent;
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
		org.icefaces.ace.component.sliderentry.SliderEntryBase _component = null;
		try {
			_component = (org.icefaces.ace.component.sliderentry.SliderEntryBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.sliderentry.SliderEntryBase");
		}
		if (animate != null) {
			_component.setValueExpression("animate", animate);
		}
		if (axis != null) {
			_component.setValueExpression("axis", axis);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (clickableRail != null) {
			_component.setValueExpression("clickableRail", clickableRail);
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
		if (length != null) {
			_component.setValueExpression("length", length);
		}
		if (max != null) {
			_component.setValueExpression("max", max);
		}
		if (min != null) {
			_component.setValueExpression("min", min);
		}
		if (onSlide != null) {
			_component.setValueExpression("onSlide", onSlide);
		}
		if (onSlideEnd != null) {
			_component.setValueExpression("onSlideEnd", onSlideEnd);
		}
		if (onSlideStart != null) {
			_component.setValueExpression("onSlideStart", onSlideStart);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (showLabels != null) {
			_component.setValueExpression("showLabels", showLabels);
		}
		if (stepPercent != null) {
			_component.setValueExpression("stepPercent", stepPercent);
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
		if (valueChangeListener != null) {
			_component.setValueChangeListener(valueChangeListener);
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
		axis = null;
		binding = null;
		clickableRail = null;
		disabled = null;
		id = null;
		immediate = null;
		length = null;
		max = null;
		min = null;
		onSlide = null;
		onSlideEnd = null;
		onSlideStart = null;
		rendered = null;
		showLabels = null;
		stepPercent = null;
		style = null;
		styleClass = null;
		tabindex = null;
		value = null;
		valueChangeListener = null;
		widgetVar = null;
	}
}