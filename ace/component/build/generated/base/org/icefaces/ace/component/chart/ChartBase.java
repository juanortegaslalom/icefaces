package org.icefaces.ace.component.chart;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

import java.util.EnumSet;

import java.util.Iterator;

import javax.faces.context.FacesContext;
import javax.el.MethodExpression;
import javax.el.ValueExpression;

import javax.faces.component.StateHelper;

import javax.faces.component.UIComponent;
import javax.faces.render.Renderer;
import javax.faces.component.NamingContainer;
import javax.faces.component.UINamingContainer;
import javax.faces.component.UniqueIdVendor;
import javax.faces.component.UIViewRoot;

import org.icefaces.resources.ICEResourceDependencies;
import org.icefaces.resources.ICEResourceDependency;

import org.icefaces.resources.ICEBrowserDependency;

import org.icefaces.resources.BrowserType;

import org.icefaces.resources.ICEResourceLibrary;

import org.icefaces.ace.component.chart.IChart;
import org.icefaces.ace.api.IceClientBehaviorHolder;
import java.util.Collection;
import java.util.Collections;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * Render a HTML &lt;canvas&rt; data visualization using a Java interface to the jqPlot charting API. A List of ChartSeries subclasses define the data and its representation in the visualization.<p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/Chart">Chart Wiki Documentation</a>.</p>
 */
@ICEResourceLibrary("icefaces.ace")
@ICEResourceDependencies({
	@ICEResourceDependency(name="chart/excanvas.js",library="",target="",browser=BrowserType.IE8_OR_LESS,browserOverride={}),
	@ICEResourceDependency(name="chart/ace-chart.js",library="",target="",browser=BrowserType.ALL,browserOverride={})
})
public abstract class ChartBase extends javax.faces.component.UIComponentBase implements IChart,IceClientBehaviorHolder{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.Chart";
	public static final String RENDERER_TYPE = "org.icefaces.ace.component.ChartRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public ChartBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.Chart";
	}


	protected enum PropertyKeys {
		animated,
		cursor,
		defaultAxesConfig,
		defaultSeriesConfig,
		height,
		hiddenInitPolling,
		highlighter,
		highlighterAxes,
		highlighterBringSeriesToFront,
		highlighterFormatString,
		highlighterLocation,
		highlighterShowMarker,
		highlighterYValueCount,
		imageExportListener,
		legend,
		legendLocation,
		legendPlacement,
		pointChangeListener,
		selectListener,
		showTooltip,
		stackSeries,
		style,
		title,
		value,
		widgetVar,
		width,
		x2Axis,
		xAxis,
		yAxes,
		zoom,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>animated</code> property.</p>
	 * <p>Contents: Enables the draw animation behaviour of the chart. By default is enabled for all browsers but IE8 and lower for performanceconcerns.</p>
	 */
	public void setAnimated(java.lang.Boolean animated) {
		PropertyKeys propToUse = PropertyKeys.animated;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.animated.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), animated );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.animated.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && animated != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",animated);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.animated.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (animated == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, animated);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>animated</code> property.</p>
	 * <p>Contents: Enables the draw animation behaviour of the chart. By default is enabled for all browsers but IE8 and lower for performanceconcerns.</p>
	 */
	public java.lang.Boolean isAnimated() {
		java.lang.Boolean retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.animated.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.animated.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Boolean) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.animated.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Boolean) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>cursor</code> property.</p>
	 * <p>Contents: Enable a crosshair cursor on the chart.</p>
	 */
	public void setCursor(java.lang.Boolean cursor) {
		PropertyKeys propToUse = PropertyKeys.cursor;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.cursor.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), cursor );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.cursor.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && cursor != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",cursor);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.cursor.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (cursor == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, cursor);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>cursor</code> property.</p>
	 * <p>Contents: Enable a crosshair cursor on the chart.</p>
	 */
	public java.lang.Boolean isCursor() {
		java.lang.Boolean retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.cursor.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.cursor.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Boolean) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.cursor.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Boolean) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>defaultAxesConfig</code> property.</p>
	 * <p>Contents: Define a Axis whose configuration is used where other axes have not made an explicit configuration.</p>
	 */
	public void setDefaultAxesConfig(org.icefaces.ace.component.chart.Axis defaultAxesConfig) {
		PropertyKeys propToUse = PropertyKeys.defaultAxesConfig;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.defaultAxesConfig.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), defaultAxesConfig );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.defaultAxesConfig.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && defaultAxesConfig != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",defaultAxesConfig);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.defaultAxesConfig.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (defaultAxesConfig == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, defaultAxesConfig);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>defaultAxesConfig</code> property.</p>
	 * <p>Contents: Define a Axis whose configuration is used where other axes have not made an explicit configuration.</p>
	 */
	public org.icefaces.ace.component.chart.Axis getDefaultAxesConfig() {
		org.icefaces.ace.component.chart.Axis retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.defaultAxesConfig.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.component.chart.Axis) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.defaultAxesConfig.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.component.chart.Axis) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.defaultAxesConfig.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.component.chart.Axis) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>defaultSeriesConfig</code> property.</p>
	 * <p>Contents: Define a ChartSeries whose configuration is used where other ChartSeries have not made an explicit configuration. The data of this ChartSeries is irrelevant. If defined, this ChartSeries should explicitly have the typefield set, this will be used as the default type for all series which have not explicitly defined a type. If undefined the default type is determined by theChartSeries.getDefaultType() of the first attached series.</p>
	 */
	public void setDefaultSeriesConfig(org.icefaces.ace.model.chart.ChartSeries defaultSeriesConfig) {
		PropertyKeys propToUse = PropertyKeys.defaultSeriesConfig;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.defaultSeriesConfig.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), defaultSeriesConfig );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.defaultSeriesConfig.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && defaultSeriesConfig != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",defaultSeriesConfig);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.defaultSeriesConfig.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (defaultSeriesConfig == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, defaultSeriesConfig);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>defaultSeriesConfig</code> property.</p>
	 * <p>Contents: Define a ChartSeries whose configuration is used where other ChartSeries have not made an explicit configuration. The data of this ChartSeries is irrelevant. If defined, this ChartSeries should explicitly have the typefield set, this will be used as the default type for all series which have not explicitly defined a type. If undefined the default type is determined by theChartSeries.getDefaultType() of the first attached series.</p>
	 */
	public org.icefaces.ace.model.chart.ChartSeries getDefaultSeriesConfig() {
		org.icefaces.ace.model.chart.ChartSeries retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.defaultSeriesConfig.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.model.chart.ChartSeries) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.defaultSeriesConfig.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.model.chart.ChartSeries) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.defaultSeriesConfig.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.model.chart.ChartSeries) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>height</code> property.</p>
	 * <p>Contents: Define the height of the entire chart region in pixels.</p>
	 */
	public void setHeight(java.lang.Integer height) {
		PropertyKeys propToUse = PropertyKeys.height;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.height.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), height );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.height.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && height != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",height);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.height.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (height == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, height);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>height</code> property.</p>
	 * <p>Contents: Define the height of the entire chart region in pixels.</p>
	 */
	public java.lang.Integer getHeight() {
		java.lang.Integer retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.height.toString() );
		if (ve != null) {
				retVal = (java.lang.Integer) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.height.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Integer) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.height.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Integer) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>hiddenInitPolling</code> property.</p>
	 * <p>Contents: Enable the default handling of the chart when rendered into a hidden page region. Thechart polls its hidden status, looking for when it is shown, and then completes its initialization.This can be expensive in environments of reduced JavaScript performance with many charts and a complex DOM.When this is disabled, upon revealing a chart, to ensure it is correctly displayed, 'chartWidgetvar.replot()' must be called.</p>
	 */
	public void setHiddenInitPolling(java.lang.Boolean hiddenInitPolling) {
		PropertyKeys propToUse = PropertyKeys.hiddenInitPolling;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.hiddenInitPolling.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), hiddenInitPolling );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.hiddenInitPolling.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && hiddenInitPolling != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",hiddenInitPolling);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.hiddenInitPolling.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (hiddenInitPolling == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, hiddenInitPolling);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>hiddenInitPolling</code> property.</p>
	 * <p>Contents: Enable the default handling of the chart when rendered into a hidden page region. Thechart polls its hidden status, looking for when it is shown, and then completes its initialization.This can be expensive in environments of reduced JavaScript performance with many charts and a complex DOM.When this is disabled, upon revealing a chart, to ensure it is correctly displayed, 'chartWidgetvar.replot()' must be called. Default = 'true'.</p>
	 */
	public java.lang.Boolean isHiddenInitPolling() {
		java.lang.Boolean retVal = true;
		ValueExpression ve = getValueExpression( PropertyKeys.hiddenInitPolling.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.hiddenInitPolling.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Boolean) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.hiddenInitPolling.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Boolean) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>highlighter</code> property.</p>
	 * <p>Contents: Enables drawing an info string at the cursor position when hovering at data points. Default configuration displays x, y values.</p>
	 */
	public void setHighlighter(java.lang.Boolean highlighter) {
		PropertyKeys propToUse = PropertyKeys.highlighter;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.highlighter.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), highlighter );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.highlighter.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && highlighter != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",highlighter);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.highlighter.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (highlighter == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, highlighter);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>highlighter</code> property.</p>
	 * <p>Contents: Enables drawing an info string at the cursor position when hovering at data points. Default configuration displays x, y values.</p>
	 */
	public java.lang.Boolean isHighlighter() {
		java.lang.Boolean retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.highlighter.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.highlighter.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Boolean) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.highlighter.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Boolean) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>highlighterAxes</code> property.</p>
	 * <p>Contents: Defines the point values passed to the highlighter tooltip, either X, Y, XY or YX. Default is XY.</p>
	 */
	public void setHighlighterAxes(org.icefaces.ace.component.chart.HighlighterTooltipAxes highlighterAxes) {
		PropertyKeys propToUse = PropertyKeys.highlighterAxes;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.highlighterAxes.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), highlighterAxes );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.highlighterAxes.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && highlighterAxes != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",highlighterAxes);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.highlighterAxes.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (highlighterAxes == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, highlighterAxes);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>highlighterAxes</code> property.</p>
	 * <p>Contents: Defines the point values passed to the highlighter tooltip, either X, Y, XY or YX. Default is XY.</p>
	 */
	public org.icefaces.ace.component.chart.HighlighterTooltipAxes getHighlighterAxes() {
		org.icefaces.ace.component.chart.HighlighterTooltipAxes retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.highlighterAxes.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.component.chart.HighlighterTooltipAxes) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.highlighterAxes.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.component.chart.HighlighterTooltipAxes) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.highlighterAxes.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.component.chart.HighlighterTooltipAxes) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>highlighterBringSeriesToFront</code> property.</p>
	 * <p>Contents: Enables the highlighted series being temporarily reordered to be entirely visible.</p>
	 */
	public void setHighlighterBringSeriesToFront(java.lang.Boolean highlighterBringSeriesToFront) {
		PropertyKeys propToUse = PropertyKeys.highlighterBringSeriesToFront;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.highlighterBringSeriesToFront.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), highlighterBringSeriesToFront );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.highlighterBringSeriesToFront.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && highlighterBringSeriesToFront != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",highlighterBringSeriesToFront);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.highlighterBringSeriesToFront.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (highlighterBringSeriesToFront == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, highlighterBringSeriesToFront);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>highlighterBringSeriesToFront</code> property.</p>
	 * <p>Contents: Enables the highlighted series being temporarily reordered to be entirely visible.</p>
	 */
	public java.lang.Boolean isHighlighterBringSeriesToFront() {
		java.lang.Boolean retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.highlighterBringSeriesToFront.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.highlighterBringSeriesToFront.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Boolean) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.highlighterBringSeriesToFront.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Boolean) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>highlighterFormatString</code> property.</p>
	 * <p>Contents: Defines a format string populated with the x, y values indicated by the highlighterAxes. Takes C-style string format options ex. 'Date: %s, number of cats: %d' </p>
	 */
	public void setHighlighterFormatString(java.lang.String highlighterFormatString) {
		PropertyKeys propToUse = PropertyKeys.highlighterFormatString;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.highlighterFormatString.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), highlighterFormatString );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.highlighterFormatString.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && highlighterFormatString != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",highlighterFormatString);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.highlighterFormatString.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (highlighterFormatString == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, highlighterFormatString);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>highlighterFormatString</code> property.</p>
	 * <p>Contents: Defines a format string populated with the x, y values indicated by the highlighterAxes. Takes C-style string format options ex. 'Date: %s, number of cats: %d' </p>
	 */
	public java.lang.String getHighlighterFormatString() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.highlighterFormatString.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.highlighterFormatString.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.String) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.highlighterFormatString.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.String) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>highlighterLocation</code> property.</p>
	 * <p>Contents: Defines the direction the highlighter tooltip is located relative to the cursor. Is 'NW' by default.</p>
	 */
	public void setHighlighterLocation(org.icefaces.ace.component.chart.Location highlighterLocation) {
		PropertyKeys propToUse = PropertyKeys.highlighterLocation;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.highlighterLocation.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), highlighterLocation );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.highlighterLocation.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && highlighterLocation != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",highlighterLocation);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.highlighterLocation.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (highlighterLocation == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, highlighterLocation);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>highlighterLocation</code> property.</p>
	 * <p>Contents: Defines the direction the highlighter tooltip is located relative to the cursor. Is 'NW' by default.</p>
	 */
	public org.icefaces.ace.component.chart.Location getHighlighterLocation() {
		org.icefaces.ace.component.chart.Location retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.highlighterLocation.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.component.chart.Location) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.highlighterLocation.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.component.chart.Location) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.highlighterLocation.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.component.chart.Location) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>highlighterShowMarker</code> property.</p>
	 * <p>Contents: Enables drawing an 'active' styled point marker while the highlighter tooltip is shown. Is true by default.</p>
	 */
	public void setHighlighterShowMarker(java.lang.Boolean highlighterShowMarker) {
		PropertyKeys propToUse = PropertyKeys.highlighterShowMarker;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.highlighterShowMarker.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), highlighterShowMarker );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.highlighterShowMarker.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && highlighterShowMarker != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",highlighterShowMarker);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.highlighterShowMarker.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (highlighterShowMarker == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, highlighterShowMarker);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>highlighterShowMarker</code> property.</p>
	 * <p>Contents: Enables drawing an 'active' styled point marker while the highlighter tooltip is shown. Is true by default.</p>
	 */
	public java.lang.Boolean isHighlighterShowMarker() {
		java.lang.Boolean retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.highlighterShowMarker.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.highlighterShowMarker.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Boolean) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.highlighterShowMarker.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Boolean) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>highlighterYValueCount</code> property.</p>
	 * <p>Contents: Defines how many Y values a highlighter should expect in the data points array. Typically this is 1.  Certain plots, like OHLC, will have more y values in each data point array and will need this property adjusted to parse correctly.</p>
	 */
	public void setHighlighterYValueCount(java.lang.Integer highlighterYValueCount) {
		PropertyKeys propToUse = PropertyKeys.highlighterYValueCount;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.highlighterYValueCount.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), highlighterYValueCount );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.highlighterYValueCount.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && highlighterYValueCount != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",highlighterYValueCount);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.highlighterYValueCount.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (highlighterYValueCount == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, highlighterYValueCount);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>highlighterYValueCount</code> property.</p>
	 * <p>Contents: Defines how many Y values a highlighter should expect in the data points array. Typically this is 1.  Certain plots, like OHLC, will have more y values in each data point array and will need this property adjusted to parse correctly.</p>
	 */
	public java.lang.Integer getHighlighterYValueCount() {
		java.lang.Integer retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.highlighterYValueCount.toString() );
		if (ve != null) {
				retVal = (java.lang.Integer) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.highlighterYValueCount.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Integer) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.highlighterYValueCount.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Integer) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>imageExportListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever an exportToServer() call is made for this chart in the client side. The method receives a single argument, ChartImageExportEvent. The bytes representing the PNG image are obtained as a byte array by calling getBytes() on the ChartImageExportEvent object.</p>
	 */
	public void setImageExportListener(javax.el.MethodExpression imageExportListener) {
		PropertyKeys propToUse = PropertyKeys.imageExportListener;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.imageExportListener.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), imageExportListener );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.imageExportListener.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && imageExportListener != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",imageExportListener);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.imageExportListener.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (imageExportListener == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, imageExportListener);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>imageExportListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever an exportToServer() call is made for this chart in the client side. The method receives a single argument, ChartImageExportEvent. The bytes representing the PNG image are obtained as a byte array by calling getBytes() on the ChartImageExportEvent object.</p>
	 */
	public javax.el.MethodExpression getImageExportListener() {
		javax.el.MethodExpression retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.imageExportListener.toString() );
		if (ve != null) {
				retVal = (javax.el.MethodExpression) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.imageExportListener.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (javax.el.MethodExpression) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.imageExportListener.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (javax.el.MethodExpression) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>legend</code> property.</p>
	 * <p>Contents: Enabling displays the legend.</p>
	 */
	public void setLegend(java.lang.Boolean legend) {
		PropertyKeys propToUse = PropertyKeys.legend;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.legend.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), legend );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.legend.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && legend != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",legend);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.legend.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (legend == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, legend);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>legend</code> property.</p>
	 * <p>Contents: Enabling displays the legend.</p>
	 */
	public java.lang.Boolean isLegend() {
		java.lang.Boolean retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.legend.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.legend.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Boolean) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.legend.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Boolean) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>legendLocation</code> property.</p>
	 * <p>Contents: Defines the location of legend relative to the bounds of the chart. All of the cardinal directions are available in the following format: N, NE, E, SE, S, etc.</p>
	 */
	public void setLegendLocation(org.icefaces.ace.component.chart.Location legendLocation) {
		PropertyKeys propToUse = PropertyKeys.legendLocation;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.legendLocation.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), legendLocation );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.legendLocation.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && legendLocation != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",legendLocation);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.legendLocation.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (legendLocation == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, legendLocation);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>legendLocation</code> property.</p>
	 * <p>Contents: Defines the location of legend relative to the bounds of the chart. All of the cardinal directions are available in the following format: N, NE, E, SE, S, etc.</p>
	 */
	public org.icefaces.ace.component.chart.Location getLegendLocation() {
		org.icefaces.ace.component.chart.Location retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.legendLocation.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.component.chart.Location) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.legendLocation.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.component.chart.Location) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.legendLocation.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.component.chart.Location) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>legendPlacement</code> property.</p>
	 * <p>Contents: Defines the placement of the legend relative to the content of the chart. The available configurations are: INSIDE_GRID, OUTSIDE_GRID and OUTSIDE</p>
	 */
	public void setLegendPlacement(org.icefaces.ace.component.chart.LegendPlacement legendPlacement) {
		PropertyKeys propToUse = PropertyKeys.legendPlacement;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.legendPlacement.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), legendPlacement );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.legendPlacement.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && legendPlacement != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",legendPlacement);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.legendPlacement.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (legendPlacement == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, legendPlacement);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>legendPlacement</code> property.</p>
	 * <p>Contents: Defines the placement of the legend relative to the content of the chart. The available configurations are: INSIDE_GRID, OUTSIDE_GRID and OUTSIDE</p>
	 */
	public org.icefaces.ace.component.chart.LegendPlacement getLegendPlacement() {
		org.icefaces.ace.component.chart.LegendPlacement retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.legendPlacement.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.component.chart.LegendPlacement) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.legendPlacement.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.component.chart.LegendPlacement) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.legendPlacement.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.component.chart.LegendPlacement) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>pointChangeListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a series element is dragged to a new x or y value. The method receives a single argument, PointValueChangeEvent.</p>
	 */
	public void setPointChangeListener(javax.el.MethodExpression pointChangeListener) {
		PropertyKeys propToUse = PropertyKeys.pointChangeListener;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.pointChangeListener.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), pointChangeListener );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.pointChangeListener.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && pointChangeListener != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",pointChangeListener);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.pointChangeListener.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (pointChangeListener == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, pointChangeListener);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>pointChangeListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a series element is dragged to a new x or y value. The method receives a single argument, PointValueChangeEvent.</p>
	 */
	public javax.el.MethodExpression getPointChangeListener() {
		javax.el.MethodExpression retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.pointChangeListener.toString() );
		if (ve != null) {
				retVal = (javax.el.MethodExpression) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.pointChangeListener.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (javax.el.MethodExpression) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.pointChangeListener.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (javax.el.MethodExpression) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>selectListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a series element is selected. The method receives a single argument, SeriesSelectionEvent.</p>
	 */
	public void setSelectListener(javax.el.MethodExpression selectListener) {
		PropertyKeys propToUse = PropertyKeys.selectListener;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.selectListener.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), selectListener );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.selectListener.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && selectListener != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",selectListener);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.selectListener.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (selectListener == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, selectListener);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>selectListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a series element is selected. The method receives a single argument, SeriesSelectionEvent.</p>
	 */
	public javax.el.MethodExpression getSelectListener() {
		javax.el.MethodExpression retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.selectListener.toString() );
		if (ve != null) {
				retVal = (javax.el.MethodExpression) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.selectListener.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (javax.el.MethodExpression) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.selectListener.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (javax.el.MethodExpression) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>showTooltip</code> property.</p>
	 * <p>Contents: Enable display of a legend regarding the coordinates of the cursor. The 'cursor' property must be enabled to use this property.</p>
	 */
	public void setShowTooltip(java.lang.Boolean showTooltip) {
		PropertyKeys propToUse = PropertyKeys.showTooltip;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.showTooltip.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), showTooltip );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.showTooltip.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && showTooltip != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",showTooltip);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.showTooltip.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (showTooltip == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, showTooltip);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>showTooltip</code> property.</p>
	 * <p>Contents: Enable display of a legend regarding the coordinates of the cursor. The 'cursor' property must be enabled to use this property.</p>
	 */
	public java.lang.Boolean isShowTooltip() {
		java.lang.Boolean retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.showTooltip.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.showTooltip.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Boolean) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.showTooltip.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Boolean) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>stackSeries</code> property.</p>
	 * <p>Contents: Enables a stack or "mountain" plot.  Not all types of series may support this mode.</p>
	 */
	public void setStackSeries(java.lang.Boolean stackSeries) {
		PropertyKeys propToUse = PropertyKeys.stackSeries;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.stackSeries.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), stackSeries );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.stackSeries.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && stackSeries != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",stackSeries);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.stackSeries.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (stackSeries == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, stackSeries);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>stackSeries</code> property.</p>
	 * <p>Contents: Enables a stack or "mountain" plot.  Not all types of series may support this mode. Default = 'false'.</p>
	 */
	public java.lang.Boolean isStackSeries() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.stackSeries.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.stackSeries.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Boolean) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.stackSeries.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Boolean) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>style</code> property.</p>
	 * <p>Contents: Define CSS inline style for the chart container.</p>
	 */
	public void setStyle(java.lang.String style) {
		PropertyKeys propToUse = PropertyKeys.style;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.style.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), style );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.style.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && style != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",style);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.style.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (style == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, style);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>style</code> property.</p>
	 * <p>Contents: Define CSS inline style for the chart container.</p>
	 */
	public java.lang.String getStyle() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.style.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.style.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.String) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.style.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.String) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>title</code> property.</p>
	 * <p>Contents: Define a title of the entire chart.</p>
	 */
	public void setTitle(java.lang.String title) {
		PropertyKeys propToUse = PropertyKeys.title;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.title.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), title );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.title.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && title != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",title);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.title.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (title == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, title);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>title</code> property.</p>
	 * <p>Contents: Define a title of the entire chart.</p>
	 */
	public java.lang.String getTitle() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.title.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.title.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.String) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.title.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.String) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>value</code> property.</p>
	 * <p>Contents: Define an individual instance or List of ChartSeries objects to draw on this plot.</p>
	 */
	public void setValue(java.lang.Object value) {
		PropertyKeys propToUse = PropertyKeys.value;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.value.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), value );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.value.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && value != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",value);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.value.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (value == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, value);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>value</code> property.</p>
	 * <p>Contents: Define an individual instance or List of ChartSeries objects to draw on this plot.</p>
	 */
	public java.lang.Object getValue() {
		java.lang.Object retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.value.toString() );
		if (ve != null) {
				retVal = (java.lang.Object) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.value.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Object) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.value.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Object) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>widgetVar</code> property.</p>
	 * <p>Contents: The JavaScript global component instance name. Must be unique among components on a page. </p>
	 */
	public void setWidgetVar(java.lang.String widgetVar) {
		PropertyKeys propToUse = PropertyKeys.widgetVar;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.widgetVar.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), widgetVar );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.widgetVar.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && widgetVar != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",widgetVar);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.widgetVar.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (widgetVar == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, widgetVar);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>widgetVar</code> property.</p>
	 * <p>Contents: The JavaScript global component instance name. Must be unique among components on a page. </p>
	 */
	public java.lang.String getWidgetVar() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.widgetVar.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.widgetVar.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.String) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.widgetVar.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.String) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>width</code> property.</p>
	 * <p>Contents: Define the width of the entire chart region in pixels.</p>
	 */
	public void setWidth(java.lang.Integer width) {
		PropertyKeys propToUse = PropertyKeys.width;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.width.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), width );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.width.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && width != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",width);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.width.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (width == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, width);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>width</code> property.</p>
	 * <p>Contents: Define the width of the entire chart region in pixels.</p>
	 */
	public java.lang.Integer getWidth() {
		java.lang.Integer retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.width.toString() );
		if (ve != null) {
				retVal = (java.lang.Integer) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.width.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Integer) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.width.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Integer) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>x2Axis</code> property.</p>
	 * <p>Contents: Defines the configuration of the x1 axis. Attempts are made to interpret a configuration if undefined.</p>
	 */
	public void setX2Axis(org.icefaces.ace.component.chart.Axis x2Axis) {
		PropertyKeys propToUse = PropertyKeys.x2Axis;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.x2Axis.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), x2Axis );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.x2Axis.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && x2Axis != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",x2Axis);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.x2Axis.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (x2Axis == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, x2Axis);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>x2Axis</code> property.</p>
	 * <p>Contents: Defines the configuration of the x1 axis. Attempts are made to interpret a configuration if undefined.</p>
	 */
	public org.icefaces.ace.component.chart.Axis getX2Axis() {
		org.icefaces.ace.component.chart.Axis retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.x2Axis.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.component.chart.Axis) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.x2Axis.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.component.chart.Axis) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.x2Axis.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.component.chart.Axis) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>xAxis</code> property.</p>
	 * <p>Contents: Defines the configuration of the x axis. Attempts are made to interpret a configuration if undefined.</p>
	 */
	public void setXAxis(org.icefaces.ace.component.chart.Axis xAxis) {
		PropertyKeys propToUse = PropertyKeys.xAxis;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.xAxis.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), xAxis );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.xAxis.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && xAxis != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",xAxis);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.xAxis.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (xAxis == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, xAxis);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>xAxis</code> property.</p>
	 * <p>Contents: Defines the configuration of the x axis. Attempts are made to interpret a configuration if undefined.</p>
	 */
	public org.icefaces.ace.component.chart.Axis getXAxis() {
		org.icefaces.ace.component.chart.Axis retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.xAxis.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.component.chart.Axis) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.xAxis.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.component.chart.Axis) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.xAxis.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.component.chart.Axis) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>yAxes</code> property.</p>
	 * <p>Contents: Defines the configuration of the y axes (up to 9). Attempts are made to interpret a configuration if undefined.</p>
	 */
	public void setYAxes(org.icefaces.ace.component.chart.Axis[] yAxes) {
		PropertyKeys propToUse = PropertyKeys.yAxes;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.yAxes.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), yAxes );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.yAxes.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && yAxes != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",yAxes);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.yAxes.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (yAxes == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, yAxes);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>yAxes</code> property.</p>
	 * <p>Contents: Defines the configuration of the y axes (up to 9). Attempts are made to interpret a configuration if undefined.</p>
	 */
	public org.icefaces.ace.component.chart.Axis[] getYAxes() {
		org.icefaces.ace.component.chart.Axis[] retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.yAxes.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.component.chart.Axis[]) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.yAxes.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.component.chart.Axis[]) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.yAxes.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.component.chart.Axis[]) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>zoom</code> property.</p>
	 * <p>Contents: Enable click+drag selection of a range on the chart using the cursor. The 'cursor' property must be enabled to use this property.</p>
	 */
	public void setZoom(java.lang.Boolean zoom) {
		PropertyKeys propToUse = PropertyKeys.zoom;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.zoom.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), zoom );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.zoom.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && zoom != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",zoom);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.zoom.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (zoom == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, zoom);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>zoom</code> property.</p>
	 * <p>Contents: Enable click+drag selection of a range on the chart using the cursor. The 'cursor' property must be enabled to use this property.</p>
	 */
	public java.lang.Boolean isZoom() {
		java.lang.Boolean retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.zoom.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.zoom.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.lang.Boolean) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.zoom.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.lang.Boolean) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	private static boolean isDisconnected(UIComponent component) {
		UIComponent parent = component.getParent();
		if (parent != null && parent instanceof UIViewRoot) {
			return false;
		} else if (parent != null) {
			return isDisconnected(parent);
		} else {
			return true;
		}
	}

	 private void addToSetOfUsedProperties(PropertyKeys propertyKey){
		this.setOfUsedProperties.add(propertyKey);
	}

	protected boolean isPropertySet(String finder){
		if (setOfUsedProperties.isEmpty()){
			return false;
		}
		PropertyKeys pk = enumTypeContains(finder);
		if ((null != pk) && setOfUsedProperties.contains(pk)){
				return true;
		}
		return false;
	}

 @Override
	public void setValueExpression(String name, ValueExpression binding){
		PropertyKeys pkey = enumTypeContains( name);
		if (null != enumTypeContains( name)){
			addToSetOfUsedProperties(pkey);
		}
		super.setValueExpression(name, binding);
	}

	private PropertyKeys enumTypeContains( String name){
		for (PropertyKeys pkey: PropertyKeys.values()){
			if (pkey.toString().equals(name)){ 
				return pkey; 
			} 
		} 
		return null;
	}

	private static final Collection<String> eventNames =
		Collections.unmodifiableCollection(Arrays.asList(
			"click",
			"dragStart",
			"dragStop",
			"mouseInData",
			"mouseOutData",
			"showHighlighter",
			"hideHighlighter"));

	private static final Map<String, String> defaultRenderMap;
	private static final Map<String, String> defaultExecuteMap;
	private static final Map<String, String> listenerArgumentMap;
	static {
		Map<String, String> drm = new HashMap<String, String>(8);
		Map<String, String> dem = new HashMap<String, String>(8);
		Map<String, String> lam = new HashMap<String, String>(8);
		drm.put("click","@all");
		dem.put("click","@this");
		lam.put("click","");
		drm.put("dragStart","@all");
		dem.put("dragStart","@this");
		lam.put("dragStart","");
		drm.put("dragStop","@all");
		dem.put("dragStop","@this");
		lam.put("dragStop","");
		drm.put("mouseInData","@all");
		dem.put("mouseInData","@this");
		lam.put("mouseInData","");
		drm.put("mouseOutData","@all");
		dem.put("mouseOutData","@this");
		lam.put("mouseOutData","");
		drm.put("showHighlighter","@all");
		dem.put("showHighlighter","@this");
		lam.put("showHighlighter","");
		drm.put("hideHighlighter","@all");
		dem.put("hideHighlighter","@this");
		lam.put("hideHighlighter","");
		defaultRenderMap = Collections.unmodifiableMap(drm);
		defaultExecuteMap = Collections.unmodifiableMap(dem);
		listenerArgumentMap = Collections.unmodifiableMap(lam);
	}

	public Collection<String> getEventNames() {
		return eventNames;
	}

	public String getDefaultEventName() {
		return "click";
	}

	public String getDefaultRender(String event) {
		return defaultRenderMap.get(event);
	}

	public String getDefaultExecute(String event) {
		return defaultExecuteMap.get(event);
	}

	public String getListenerArgument(String event) {
		if (!listenerArgumentMap.containsKey(event)) {
			return null;
		}
		String listenerArg = listenerArgumentMap.get(event);
		return (listenerArg == null || listenerArg.length() == 0) ? "javax.faces.event.AjaxBehaviorEvent" : listenerArg;
	}

	public void addClientBehavior(String eventName, javax.faces.component.behavior.ClientBehavior behavior) {
		if (behavior.getClass().equals(javax.faces.component.behavior.AjaxBehavior.class)) {
			return;
		}
		super.addClientBehavior(eventName, behavior);
	}

}