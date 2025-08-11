package org.icefaces.ace.component.chart;

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
public class ChartTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.ChartRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.Chart";
	}
	private javax.el.ValueExpression animated;
	public void setAnimated(javax.el.ValueExpression animated) {
		this.animated = animated;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression cursor;
	public void setCursor(javax.el.ValueExpression cursor) {
		this.cursor = cursor;
	}
	private javax.el.ValueExpression defaultAxesConfig;
	public void setDefaultAxesConfig(javax.el.ValueExpression defaultAxesConfig) {
		this.defaultAxesConfig = defaultAxesConfig;
	}
	private javax.el.ValueExpression defaultSeriesConfig;
	public void setDefaultSeriesConfig(javax.el.ValueExpression defaultSeriesConfig) {
		this.defaultSeriesConfig = defaultSeriesConfig;
	}
	private javax.el.ValueExpression height;
	public void setHeight(javax.el.ValueExpression height) {
		this.height = height;
	}
	private javax.el.ValueExpression hiddenInitPolling;
	public void setHiddenInitPolling(javax.el.ValueExpression hiddenInitPolling) {
		this.hiddenInitPolling = hiddenInitPolling;
	}
	private javax.el.ValueExpression highlighter;
	public void setHighlighter(javax.el.ValueExpression highlighter) {
		this.highlighter = highlighter;
	}
	private javax.el.ValueExpression highlighterAxes;
	public void setHighlighterAxes(javax.el.ValueExpression highlighterAxes) {
		this.highlighterAxes = highlighterAxes;
	}
	private javax.el.ValueExpression highlighterBringSeriesToFront;
	public void setHighlighterBringSeriesToFront(javax.el.ValueExpression highlighterBringSeriesToFront) {
		this.highlighterBringSeriesToFront = highlighterBringSeriesToFront;
	}
	private javax.el.ValueExpression highlighterFormatString;
	public void setHighlighterFormatString(javax.el.ValueExpression highlighterFormatString) {
		this.highlighterFormatString = highlighterFormatString;
	}
	private javax.el.ValueExpression highlighterLocation;
	public void setHighlighterLocation(javax.el.ValueExpression highlighterLocation) {
		this.highlighterLocation = highlighterLocation;
	}
	private javax.el.ValueExpression highlighterShowMarker;
	public void setHighlighterShowMarker(javax.el.ValueExpression highlighterShowMarker) {
		this.highlighterShowMarker = highlighterShowMarker;
	}
	private javax.el.ValueExpression highlighterYValueCount;
	public void setHighlighterYValueCount(javax.el.ValueExpression highlighterYValueCount) {
		this.highlighterYValueCount = highlighterYValueCount;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.MethodExpression imageExportListener;
	public void setImageExportListener(javax.el.MethodExpression imageExportListener) {
		this.imageExportListener = imageExportListener;
	}
	private javax.el.ValueExpression legend;
	public void setLegend(javax.el.ValueExpression legend) {
		this.legend = legend;
	}
	private javax.el.ValueExpression legendLocation;
	public void setLegendLocation(javax.el.ValueExpression legendLocation) {
		this.legendLocation = legendLocation;
	}
	private javax.el.ValueExpression legendPlacement;
	public void setLegendPlacement(javax.el.ValueExpression legendPlacement) {
		this.legendPlacement = legendPlacement;
	}
	private javax.el.MethodExpression pointChangeListener;
	public void setPointChangeListener(javax.el.MethodExpression pointChangeListener) {
		this.pointChangeListener = pointChangeListener;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.MethodExpression selectListener;
	public void setSelectListener(javax.el.MethodExpression selectListener) {
		this.selectListener = selectListener;
	}
	private javax.el.ValueExpression showTooltip;
	public void setShowTooltip(javax.el.ValueExpression showTooltip) {
		this.showTooltip = showTooltip;
	}
	private javax.el.ValueExpression stackSeries;
	public void setStackSeries(javax.el.ValueExpression stackSeries) {
		this.stackSeries = stackSeries;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression title;
	public void setTitle(javax.el.ValueExpression title) {
		this.title = title;
	}
	private javax.el.ValueExpression value;
	public void setValue(javax.el.ValueExpression value) {
		this.value = value;
	}
	private javax.el.ValueExpression widgetVar;
	public void setWidgetVar(javax.el.ValueExpression widgetVar) {
		this.widgetVar = widgetVar;
	}
	private javax.el.ValueExpression width;
	public void setWidth(javax.el.ValueExpression width) {
		this.width = width;
	}
	private javax.el.ValueExpression x2Axis;
	public void setX2Axis(javax.el.ValueExpression x2Axis) {
		this.x2Axis = x2Axis;
	}
	private javax.el.ValueExpression xAxis;
	public void setXAxis(javax.el.ValueExpression xAxis) {
		this.xAxis = xAxis;
	}
	private javax.el.ValueExpression yAxes;
	public void setYAxes(javax.el.ValueExpression yAxes) {
		this.yAxes = yAxes;
	}
	private javax.el.ValueExpression zoom;
	public void setZoom(javax.el.ValueExpression zoom) {
		this.zoom = zoom;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.chart.ChartBase _component = null;
		try {
			_component = (org.icefaces.ace.component.chart.ChartBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.chart.ChartBase");
		}
		if (animated != null) {
			_component.setValueExpression("animated", animated);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (cursor != null) {
			_component.setValueExpression("cursor", cursor);
		}
		if (defaultAxesConfig != null) {
			_component.setValueExpression("defaultAxesConfig", defaultAxesConfig);
		}
		if (defaultSeriesConfig != null) {
			_component.setValueExpression("defaultSeriesConfig", defaultSeriesConfig);
		}
		if (height != null) {
			_component.setValueExpression("height", height);
		}
		if (hiddenInitPolling != null) {
			_component.setValueExpression("hiddenInitPolling", hiddenInitPolling);
		}
		if (highlighter != null) {
			_component.setValueExpression("highlighter", highlighter);
		}
		if (highlighterAxes != null) {
			_component.setValueExpression("highlighterAxes", highlighterAxes);
		}
		if (highlighterBringSeriesToFront != null) {
			_component.setValueExpression("highlighterBringSeriesToFront", highlighterBringSeriesToFront);
		}
		if (highlighterFormatString != null) {
			_component.setValueExpression("highlighterFormatString", highlighterFormatString);
		}
		if (highlighterLocation != null) {
			_component.setValueExpression("highlighterLocation", highlighterLocation);
		}
		if (highlighterShowMarker != null) {
			_component.setValueExpression("highlighterShowMarker", highlighterShowMarker);
		}
		if (highlighterYValueCount != null) {
			_component.setValueExpression("highlighterYValueCount", highlighterYValueCount);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (imageExportListener != null) {
			_component.setImageExportListener(imageExportListener);
		}
		if (legend != null) {
			_component.setValueExpression("legend", legend);
		}
		if (legendLocation != null) {
			_component.setValueExpression("legendLocation", legendLocation);
		}
		if (legendPlacement != null) {
			_component.setValueExpression("legendPlacement", legendPlacement);
		}
		if (pointChangeListener != null) {
			_component.setPointChangeListener(pointChangeListener);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (selectListener != null) {
			_component.setSelectListener(selectListener);
		}
		if (showTooltip != null) {
			_component.setValueExpression("showTooltip", showTooltip);
		}
		if (stackSeries != null) {
			_component.setValueExpression("stackSeries", stackSeries);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (title != null) {
			_component.setValueExpression("title", title);
		}
		if (value != null) {
			_component.setValueExpression("value", value);
		}
		if (widgetVar != null) {
			_component.setValueExpression("widgetVar", widgetVar);
		}
		if (width != null) {
			_component.setValueExpression("width", width);
		}
		if (x2Axis != null) {
			_component.setValueExpression("x2Axis", x2Axis);
		}
		if (xAxis != null) {
			_component.setValueExpression("xAxis", xAxis);
		}
		if (yAxes != null) {
			_component.setValueExpression("yAxes", yAxes);
		}
		if (zoom != null) {
			_component.setValueExpression("zoom", zoom);
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
		animated = null;
		binding = null;
		cursor = null;
		defaultAxesConfig = null;
		defaultSeriesConfig = null;
		height = null;
		hiddenInitPolling = null;
		highlighter = null;
		highlighterAxes = null;
		highlighterBringSeriesToFront = null;
		highlighterFormatString = null;
		highlighterLocation = null;
		highlighterShowMarker = null;
		highlighterYValueCount = null;
		id = null;
		imageExportListener = null;
		legend = null;
		legendLocation = null;
		legendPlacement = null;
		pointChangeListener = null;
		rendered = null;
		selectListener = null;
		showTooltip = null;
		stackSeries = null;
		style = null;
		title = null;
		value = null;
		widgetVar = null;
		width = null;
		x2Axis = null;
		xAxis = null;
		yAxes = null;
		zoom = null;
	}
}