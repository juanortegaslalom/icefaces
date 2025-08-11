package org.icefaces.ace.component.datatable;

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

import org.icefaces.ace.component.datatable.IDataTable;
import org.icefaces.ace.api.IceClientBehaviorHolder;
import java.util.Collection;
import java.util.Collections;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * Renders an HTML table element. This table and its associated components offers support for features like: scrolling, sorting, filtering, row selection, row editing, lazy loading and expandable subrows and subpanels.<p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/DataTable">DataTable Wiki Documentation</a>.</p>
 */
@ICEResourceLibrary("icefaces.ace")
@ICEResourceDependencies({
	@ICEResourceDependency(name="util/ace-datatable.js",library="",target="",browser=BrowserType.ALL,browserOverride={})
})
public abstract class DataTableBase extends javax.faces.component.UIData implements IDataTable,IceClientBehaviorHolder{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.DataTable";
	public static final String RENDERER_TYPE = "org.icefaces.ace.component.DataTableRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public DataTableBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.DataTable";
	}


	protected enum PropertyKeys {
		allColumnClicks,
		alwaysExecuteContents,
		clickableHeaderSorting,
		columnOrdering,
		columnPinning,
		columnPinningControlsInHeader,
		constantRefilter,
		currentPageReportTemplate,
		disabled,
		doubleClickSelect,
		emptyMessage,
		filterEvent,
		filterListener,
		filterValue,
		groupedFilterResults,
		height,
		hiddenScrollableSizing,
		lazy,
		liveScroll,
		page,
		pageCount,
		paginator,
		paginatorAlwaysVisible,
		paginatorPosition,
		paginatorTemplate,
		renderRowTabindex,
		reorderableColumns,
		resizableColumns,
		rowIndexVar,
		rowSelectListener,
		rowStateVar,
		rowStyleClass,
		rowUnselectListener,
		rows,
		rowsPerPageTemplate,
		scrollHeight,
		scrollWidthIE7,
		scrollable,
		selectionMode,
		singleSort,
		stateMap,
		staticHeaders,
		style,
		styleClass,
		tabIndex,
		toggleOnInvalidEdit,
		widgetVar,
		applyingFilters,
		applyingSorts,
		cachedGlobalFilter,
		filteredData,
		forcedUpdateCounter,
		tableConfigPanel,
		valueHashCode,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>allColumnClicks</code> property.</p>
	 * <p>Contents: Enable to have all column clicks accepted as selection and/or ajax click events. Typically only click eventsthat occur on a child div, span, or the td element itself are captured for processing.</p>
	 */
	public void setAllColumnClicks(boolean allColumnClicks) {
		PropertyKeys propToUse = PropertyKeys.allColumnClicks;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.allColumnClicks.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), allColumnClicks );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.allColumnClicks.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",allColumnClicks);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.allColumnClicks.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, allColumnClicks);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>allColumnClicks</code> property.</p>
	 * <p>Contents: Enable to have all column clicks accepted as selection and/or ajax click events. Typically only click eventsthat occur on a child div, span, or the td element itself are captured for processing.</p>
	 */
	public boolean isAllColumnClicks() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.allColumnClicks.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.allColumnClicks.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.allColumnClicks.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>alwaysExecuteContents</code> property.</p>
	 * <p>Contents: Enable the decoding of child components during table feature requests. The table attempts to decode children whenever it is executed, meaning whenever a parent region is submitted, or the table submits itself to paginate, make a selection, reorder columns, or any other feature. Decoding children during feature requests can result in unwanted input submission (during pagination for example), so by default this component suppresses child decoding whenever submitting itself. To cause decoding in the children of the table, use the row editing feature for row-scoped input decoding, ajax submit the form (or other table parent) for broad decodingor enable this option to submit during all table operations.</p>
	 */
	public void setAlwaysExecuteContents(java.lang.Boolean alwaysExecuteContents) {
		PropertyKeys propToUse = PropertyKeys.alwaysExecuteContents;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.alwaysExecuteContents.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), alwaysExecuteContents );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.alwaysExecuteContents.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && alwaysExecuteContents != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",alwaysExecuteContents);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.alwaysExecuteContents.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (alwaysExecuteContents == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, alwaysExecuteContents);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>alwaysExecuteContents</code> property.</p>
	 * <p>Contents: Enable the decoding of child components during table feature requests. The table attempts to decode children whenever it is executed, meaning whenever a parent region is submitted, or the table submits itself to paginate, make a selection, reorder columns, or any other feature. Decoding children during feature requests can result in unwanted input submission (during pagination for example), so by default this component suppresses child decoding whenever submitting itself. To cause decoding in the children of the table, use the row editing feature for row-scoped input decoding, ajax submit the form (or other table parent) for broad decodingor enable this option to submit during all table operations. Default = 'false'.</p>
	 */
	public java.lang.Boolean isAlwaysExecuteContents() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.alwaysExecuteContents.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.alwaysExecuteContents.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.alwaysExecuteContents.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>clickableHeaderSorting</code> property.</p>
	 * <p>Contents: Enabling makes the entire header container the clickable region for sort events.</p>
	 */
	public void setClickableHeaderSorting(boolean clickableHeaderSorting) {
		PropertyKeys propToUse = PropertyKeys.clickableHeaderSorting;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.clickableHeaderSorting.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), clickableHeaderSorting );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.clickableHeaderSorting.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",clickableHeaderSorting);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.clickableHeaderSorting.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, clickableHeaderSorting);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>clickableHeaderSorting</code> property.</p>
	 * <p>Contents: Enabling makes the entire header container the clickable region for sort events. Default = 'true'.</p>
	 */
	public boolean isClickableHeaderSorting() {
		java.lang.Boolean retVal = true;
		ValueExpression ve = getValueExpression( PropertyKeys.clickableHeaderSorting.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.clickableHeaderSorting.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.clickableHeaderSorting.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>columnOrdering</code> property.</p>
	 * <p>Contents: Defines a list of integers representing a rendering order for the Column children of the table.</p>
	 */
	public void setColumnOrdering(java.util.List columnOrdering) {
		PropertyKeys propToUse = PropertyKeys.columnOrdering;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.columnOrdering.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), columnOrdering );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.columnOrdering.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && columnOrdering != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",columnOrdering);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.columnOrdering.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (columnOrdering == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, columnOrdering);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>columnOrdering</code> property.</p>
	 * <p>Contents: Defines a list of integers representing a rendering order for the Column children of the table.</p>
	 */
	public java.util.List getColumnOrdering() {
		java.util.List retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.columnOrdering.toString() );
		if (ve != null) {
				retVal = (java.util.List) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.columnOrdering.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (java.util.List) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.columnOrdering.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (java.util.List) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>columnPinning</code> property.</p>
	 * <p>Contents: Enable statically positioned columns along the left hand side of a scrollable table.</p>
	 */
	public void setColumnPinning(boolean columnPinning) {
		PropertyKeys propToUse = PropertyKeys.columnPinning;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.columnPinning.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), columnPinning );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.columnPinning.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",columnPinning);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.columnPinning.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, columnPinning);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>columnPinning</code> property.</p>
	 * <p>Contents: Enable statically positioned columns along the left hand side of a scrollable table.</p>
	 */
	public boolean isColumnPinning() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.columnPinning.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.columnPinning.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.columnPinning.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>columnPinningControlsInHeader</code> property.</p>
	 * <p>Contents: Enable client controls to add column to the list of statically positioned columns.</p>
	 */
	public void setColumnPinningControlsInHeader(boolean columnPinningControlsInHeader) {
		PropertyKeys propToUse = PropertyKeys.columnPinningControlsInHeader;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.columnPinningControlsInHeader.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), columnPinningControlsInHeader );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.columnPinningControlsInHeader.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",columnPinningControlsInHeader);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.columnPinningControlsInHeader.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, columnPinningControlsInHeader);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>columnPinningControlsInHeader</code> property.</p>
	 * <p>Contents: Enable client controls to add column to the list of statically positioned columns.</p>
	 */
	public boolean isColumnPinningControlsInHeader() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.columnPinningControlsInHeader.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.columnPinningControlsInHeader.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.columnPinningControlsInHeader.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>constantRefilter</code> property.</p>
	 * <p>Contents: Enable to force creation of the filtered data set from the bound value every render. Alternately attempt to use hashCodes of the value property to detect changes and prompt refiltering.</p>
	 */
	public void setConstantRefilter(boolean constantRefilter) {
		PropertyKeys propToUse = PropertyKeys.constantRefilter;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.constantRefilter.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), constantRefilter );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.constantRefilter.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",constantRefilter);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.constantRefilter.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, constantRefilter);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>constantRefilter</code> property.</p>
	 * <p>Contents: Enable to force creation of the filtered data set from the bound value every render. Alternately attempt to use hashCodes of the value property to detect changes and prompt refiltering. Default = 'false'.</p>
	 */
	public boolean isConstantRefilter() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.constantRefilter.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.constantRefilter.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.constantRefilter.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>currentPageReportTemplate</code> property.</p>
	 * <p>Contents: Defines a coded string representing the layout of the text displaying the current page. Default is: "{currentPage} of {totalPages}".</p>
	 */
	public void setCurrentPageReportTemplate(java.lang.String currentPageReportTemplate) {
		PropertyKeys propToUse = PropertyKeys.currentPageReportTemplate;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.currentPageReportTemplate.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), currentPageReportTemplate );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.currentPageReportTemplate.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && currentPageReportTemplate != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",currentPageReportTemplate);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.currentPageReportTemplate.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (currentPageReportTemplate == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, currentPageReportTemplate);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>currentPageReportTemplate</code> property.</p>
	 * <p>Contents: Defines a coded string representing the layout of the text displaying the current page. Default is: "{currentPage} of {totalPages}".</p>
	 */
	public java.lang.String getCurrentPageReportTemplate() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.currentPageReportTemplate.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.currentPageReportTemplate.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.currentPageReportTemplate.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>disabled</code> property.</p>
	 * <p>Contents: Disable all features of the data table.</p>
	 */
	public void setDisabled(boolean disabled) {
		PropertyKeys propToUse = PropertyKeys.disabled;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.disabled.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), disabled );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.disabled.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",disabled);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.disabled.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, disabled);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>disabled</code> property.</p>
	 * <p>Contents: Disable all features of the data table. Default = 'false'.</p>
	 */
	public boolean isDisabled() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.disabled.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.disabled.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.disabled.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>doubleClickSelect</code> property.</p>
	 * <p>Contents: Enable to require a double-click to fire row/cell selection events.</p>
	 */
	public void setDoubleClickSelect(boolean doubleClickSelect) {
		PropertyKeys propToUse = PropertyKeys.doubleClickSelect;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.doubleClickSelect.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), doubleClickSelect );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.doubleClickSelect.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",doubleClickSelect);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.doubleClickSelect.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, doubleClickSelect);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>doubleClickSelect</code> property.</p>
	 * <p>Contents: Enable to require a double-click to fire row/cell selection events.</p>
	 */
	public boolean isDoubleClickSelect() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.doubleClickSelect.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.doubleClickSelect.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.doubleClickSelect.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>emptyMessage</code> property.</p>
	 * <p>Contents: Define a string to render when there are no records to display.</p>
	 */
	public void setEmptyMessage(java.lang.String emptyMessage) {
		PropertyKeys propToUse = PropertyKeys.emptyMessage;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.emptyMessage.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), emptyMessage );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.emptyMessage.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && emptyMessage != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",emptyMessage);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.emptyMessage.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (emptyMessage == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, emptyMessage);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>emptyMessage</code> property.</p>
	 * <p>Contents: Define a string to render when there are no records to display.</p>
	 */
	public java.lang.String getEmptyMessage() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.emptyMessage.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.emptyMessage.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.emptyMessage.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>filterEvent</code> property.</p>
	 * <p>Contents: Defines the Javascript event on which to trigger filter event, ex. 'keyup', 'blur', 'change' and 'enter'.</p>
	 */
	public void setFilterEvent(java.lang.String filterEvent) {
		PropertyKeys propToUse = PropertyKeys.filterEvent;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.filterEvent.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), filterEvent );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.filterEvent.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && filterEvent != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",filterEvent);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.filterEvent.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (filterEvent == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, filterEvent);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>filterEvent</code> property.</p>
	 * <p>Contents: Defines the Javascript event on which to trigger filter event, ex. 'keyup', 'blur', 'change' and 'enter'. Default = 'change'.</p>
	 */
	public java.lang.String getFilterEvent() {
		java.lang.String retVal = "change";
		ValueExpression ve = getValueExpression( PropertyKeys.filterEvent.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.filterEvent.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.filterEvent.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>filterListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever the table row is filtered. The method receives a single argument, TableFilterEvent.</p>
	 */
	public void setFilterListener(javax.el.MethodExpression filterListener) {
		PropertyKeys propToUse = PropertyKeys.filterListener;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.filterListener.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), filterListener );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.filterListener.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && filterListener != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",filterListener);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.filterListener.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (filterListener == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, filterListener);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>filterListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever the table row is filtered. The method receives a single argument, TableFilterEvent.</p>
	 */
	public javax.el.MethodExpression getFilterListener() {
		javax.el.MethodExpression retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.filterListener.toString() );
		if (ve != null) {
				retVal = (javax.el.MethodExpression) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.filterListener.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.filterListener.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>filterValue</code> property.</p>
	 * <p>Contents: Defines the input to the column non-specific filter, coming from the client, or from the app via a value binding.</p>
	 */
	public void setFilterValue(java.lang.String filterValue) {
		PropertyKeys propToUse = PropertyKeys.filterValue;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.filterValue.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), filterValue );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.filterValue.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && filterValue != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",filterValue);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.filterValue.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (filterValue == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, filterValue);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>filterValue</code> property.</p>
	 * <p>Contents: Defines the input to the column non-specific filter, coming from the client, or from the app via a value binding.</p>
	 */
	public java.lang.String getFilterValue() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.filterValue.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.filterValue.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.filterValue.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>groupedFilterResults</code> property.</p>
	 * <p>Contents: Enable to display all members of groups (as defined by ace:column groupBy) that contain a matching row during filtering.</p>
	 */
	public void setGroupedFilterResults(boolean groupedFilterResults) {
		PropertyKeys propToUse = PropertyKeys.groupedFilterResults;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.groupedFilterResults.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), groupedFilterResults );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.groupedFilterResults.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",groupedFilterResults);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.groupedFilterResults.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, groupedFilterResults);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>groupedFilterResults</code> property.</p>
	 * <p>Contents: Enable to display all members of groups (as defined by ace:column groupBy) that contain a matching row during filtering.</p>
	 */
	public boolean isGroupedFilterResults() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.groupedFilterResults.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.groupedFilterResults.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.groupedFilterResults.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>height</code> property.</p>
	 * <p>Contents: Defines a fixed height for the scrollable table in pixels. Deprecated; superseded by scrollHeight.</p>
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
	 * <p>Contents: Defines a fixed height for the scrollable table in pixels. Deprecated; superseded by scrollHeight.</p>
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
	 * <p>Set the value of the <code>hiddenScrollableSizing</code> property.</p>
	 * <p>Contents: Enable the default handling of the scrollable table when rendered into a hidden page region. The table attempts to poll its hidden status, looking for when it is shown and then call the scrollable table sizing JavaScript. This can be expensive in environments of reduced JavaScript performance with many tables and a complex DOM. When this is disabled, upon revealing a hidden scrollable table, to ensure it is sized correctly the JS 'tableWidgetVar.resizeScrolling()' function must be called.</p>
	 */
	public void setHiddenScrollableSizing(java.lang.Boolean hiddenScrollableSizing) {
		PropertyKeys propToUse = PropertyKeys.hiddenScrollableSizing;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.hiddenScrollableSizing.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), hiddenScrollableSizing );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.hiddenScrollableSizing.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && hiddenScrollableSizing != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",hiddenScrollableSizing);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.hiddenScrollableSizing.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (hiddenScrollableSizing == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, hiddenScrollableSizing);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>hiddenScrollableSizing</code> property.</p>
	 * <p>Contents: Enable the default handling of the scrollable table when rendered into a hidden page region. The table attempts to poll its hidden status, looking for when it is shown and then call the scrollable table sizing JavaScript. This can be expensive in environments of reduced JavaScript performance with many tables and a complex DOM. When this is disabled, upon revealing a hidden scrollable table, to ensure it is sized correctly the JS 'tableWidgetVar.resizeScrolling()' function must be called. Default = 'true'.</p>
	 */
	public java.lang.Boolean isHiddenScrollableSizing() {
		java.lang.Boolean retVal = true;
		ValueExpression ve = getValueExpression( PropertyKeys.hiddenScrollableSizing.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.hiddenScrollableSizing.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.hiddenScrollableSizing.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>lazy</code> property.</p>
	 * <p>Contents: Enables lazy loading. Lazy loading expects the 'value' property to reference an instance of LazyDataModel, an interface to support incremental fetching of table entities.</p>
	 */
	public void setLazy(boolean lazy) {
		PropertyKeys propToUse = PropertyKeys.lazy;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.lazy.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), lazy );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.lazy.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",lazy);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.lazy.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, lazy);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>lazy</code> property.</p>
	 * <p>Contents: Enables lazy loading. Lazy loading expects the 'value' property to reference an instance of LazyDataModel, an interface to support incremental fetching of table entities.</p>
	 */
	public boolean isLazy() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.lazy.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.lazy.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.lazy.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>liveScroll</code> property.</p>
	 * <p>Contents: Enables the table to insert additional rows as scrolling reaches the bottom of the table. The 'rows' property configures the number of new rows to be loaded. 
	 * Note: This feature is deprecated as of version 3.1 and is not supported. 
	 * This property will be removed in a future release.</p>
	 */
	public void setLiveScroll(boolean liveScroll) {
		PropertyKeys propToUse = PropertyKeys.liveScroll;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.liveScroll.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), liveScroll );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.liveScroll.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",liveScroll);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.liveScroll.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, liveScroll);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>liveScroll</code> property.</p>
	 * <p>Contents: Enables the table to insert additional rows as scrolling reaches the bottom of the table. The 'rows' property configures the number of new rows to be loaded. 
	 * Note: This feature is deprecated as of version 3.1 and is not supported. 
	 * This property will be removed in a future release.</p>
	 */
	public boolean isLiveScroll() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.liveScroll.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.liveScroll.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.liveScroll.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>page</code> property.</p>
	 * <p>Contents: Defines the index of the current page, beginning at 1.</p>
	 */
	public void setPage(int page) {
		PropertyKeys propToUse = PropertyKeys.page;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.page.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), page );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.page.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",page);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.page.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, page);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>page</code> property.</p>
	 * <p>Contents: Defines the index of the current page, beginning at 1.</p>
	 */
	public int getPage() {
		java.lang.Integer retVal = 0;
		ValueExpression ve = getValueExpression( PropertyKeys.page.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Integer) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.page.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.page.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>pageCount</code> property.</p>
	 * <p>Contents: Defines the maximum number of individual page links to display in paginator.</p>
	 */
	public void setPageCount(java.lang.Integer pageCount) {
		PropertyKeys propToUse = PropertyKeys.pageCount;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.pageCount.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), pageCount );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.pageCount.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && pageCount != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",pageCount);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.pageCount.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (pageCount == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, pageCount);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>pageCount</code> property.</p>
	 * <p>Contents: Defines the maximum number of individual page links to display in paginator. Default = '10'.</p>
	 */
	public java.lang.Integer getPageCount() {
		java.lang.Integer retVal = 10;
		ValueExpression ve = getValueExpression( PropertyKeys.pageCount.toString() );
		if (ve != null) {
				retVal = (java.lang.Integer) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.pageCount.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.pageCount.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>paginator</code> property.</p>
	 * <p>Contents: Enables pagination on the table. Note that the paginator works by adjusting the 'first' and 'page' properties and that disabling the paginator will not return these properties to their defaults; instead leaving the table at the position that was paginated to. To return the table to the first page, 'first' must be set to 0, or 'page' must be set to 1.Alternately the table has a convenience method for this, DataTable.resetSorting().</p>
	 */
	public void setPaginator(boolean paginator) {
		PropertyKeys propToUse = PropertyKeys.paginator;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.paginator.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), paginator );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.paginator.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",paginator);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.paginator.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, paginator);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>paginator</code> property.</p>
	 * <p>Contents: Enables pagination on the table. Note that the paginator works by adjusting the 'first' and 'page' properties and that disabling the paginator will not return these properties to their defaults; instead leaving the table at the position that was paginated to. To return the table to the first page, 'first' must be set to 0, or 'page' must be set to 1.Alternately the table has a convenience method for this, DataTable.resetSorting().</p>
	 */
	public boolean isPaginator() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.paginator.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.paginator.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.paginator.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>paginatorAlwaysVisible</code> property.</p>
	 * <p>Contents: Defines whether the paginator always displays, even when fewer then 1 page full of items are displayed.</p>
	 */
	public void setPaginatorAlwaysVisible(boolean paginatorAlwaysVisible) {
		PropertyKeys propToUse = PropertyKeys.paginatorAlwaysVisible;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.paginatorAlwaysVisible.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), paginatorAlwaysVisible );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.paginatorAlwaysVisible.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",paginatorAlwaysVisible);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.paginatorAlwaysVisible.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, paginatorAlwaysVisible);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>paginatorAlwaysVisible</code> property.</p>
	 * <p>Contents: Defines whether the paginator always displays, even when fewer then 1 page full of items are displayed.</p>
	 */
	public boolean isPaginatorAlwaysVisible() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.paginatorAlwaysVisible.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.paginatorAlwaysVisible.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.paginatorAlwaysVisible.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>paginatorPosition</code> property.</p>
	 * <p>Contents: Defines the location of the paginator if enabled. Available options are top, bottom, or the default, both.</p>
	 */
	public void setPaginatorPosition(java.lang.String paginatorPosition) {
		PropertyKeys propToUse = PropertyKeys.paginatorPosition;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.paginatorPosition.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), paginatorPosition );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.paginatorPosition.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && paginatorPosition != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",paginatorPosition);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.paginatorPosition.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (paginatorPosition == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, paginatorPosition);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>paginatorPosition</code> property.</p>
	 * <p>Contents: Defines the location of the paginator if enabled. Available options are top, bottom, or the default, both. Default = 'both'.</p>
	 */
	public java.lang.String getPaginatorPosition() {
		java.lang.String retVal = "both";
		ValueExpression ve = getValueExpression( PropertyKeys.paginatorPosition.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.paginatorPosition.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.paginatorPosition.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>paginatorTemplate</code> property.</p>
	 * <p>Contents: Defines a coded string representing the controls available as part of the paginator. Default is: "{FirstPageLink} {PreviousPageLink} {PageLinks} {NextPageLink} {LastPageLink}".</p>
	 */
	public void setPaginatorTemplate(java.lang.String paginatorTemplate) {
		PropertyKeys propToUse = PropertyKeys.paginatorTemplate;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.paginatorTemplate.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), paginatorTemplate );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.paginatorTemplate.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && paginatorTemplate != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",paginatorTemplate);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.paginatorTemplate.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (paginatorTemplate == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, paginatorTemplate);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>paginatorTemplate</code> property.</p>
	 * <p>Contents: Defines a coded string representing the controls available as part of the paginator. Default is: "{FirstPageLink} {PreviousPageLink} {PageLinks} {NextPageLink} {LastPageLink}".</p>
	 */
	public java.lang.String getPaginatorTemplate() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.paginatorTemplate.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.paginatorTemplate.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.paginatorTemplate.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>renderRowTabindex</code> property.</p>
	 * <p>Contents: Row tabindex is required for dataTable Find feature. If Find feature is not used and the tabindex interferes with tabbing through inputs in the table, set this to false.</p>
	 */
	public void setRenderRowTabindex(boolean renderRowTabindex) {
		PropertyKeys propToUse = PropertyKeys.renderRowTabindex;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.renderRowTabindex.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), renderRowTabindex );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.renderRowTabindex.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",renderRowTabindex);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.renderRowTabindex.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, renderRowTabindex);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>renderRowTabindex</code> property.</p>
	 * <p>Contents: Row tabindex is required for dataTable Find feature. If Find feature is not used and the tabindex interferes with tabbing through inputs in the table, set this to false. Default = 'true'.</p>
	 */
	public boolean isRenderRowTabindex() {
		java.lang.Boolean retVal = true;
		ValueExpression ve = getValueExpression( PropertyKeys.renderRowTabindex.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.renderRowTabindex.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.renderRowTabindex.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>reorderableColumns</code> property.</p>
	 * <p>Contents: Enable reordering of the table columns via header dragging.</p>
	 */
	public void setReorderableColumns(boolean reorderableColumns) {
		PropertyKeys propToUse = PropertyKeys.reorderableColumns;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.reorderableColumns.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), reorderableColumns );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.reorderableColumns.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",reorderableColumns);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.reorderableColumns.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, reorderableColumns);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>reorderableColumns</code> property.</p>
	 * <p>Contents: Enable reordering of the table columns via header dragging.</p>
	 */
	public boolean isReorderableColumns() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.reorderableColumns.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.reorderableColumns.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.reorderableColumns.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>resizableColumns</code> property.</p>
	 * <p>Contents: Enable resizing of the table columns via handles on the column headers.</p>
	 */
	public void setResizableColumns(boolean resizableColumns) {
		PropertyKeys propToUse = PropertyKeys.resizableColumns;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.resizableColumns.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), resizableColumns );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.resizableColumns.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",resizableColumns);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.resizableColumns.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, resizableColumns);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>resizableColumns</code> property.</p>
	 * <p>Contents: Enable resizing of the table columns via handles on the column headers.</p>
	 */
	public boolean isResizableColumns() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.resizableColumns.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.resizableColumns.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.resizableColumns.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>rowIndexVar</code> property.</p>
	 * <p>Contents: The request-scope attribute (if any) under which the data object index for the current row will be exposed when iterating.</p>
	 */
	public void setRowIndexVar(java.lang.String rowIndexVar) {
		PropertyKeys propToUse = PropertyKeys.rowIndexVar;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.rowIndexVar.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), rowIndexVar );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.rowIndexVar.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && rowIndexVar != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",rowIndexVar);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.rowIndexVar.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (rowIndexVar == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, rowIndexVar);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>rowIndexVar</code> property.</p>
	 * <p>Contents: The request-scope attribute (if any) under which the data object index for the current row will be exposed when iterating.</p>
	 */
	public java.lang.String getRowIndexVar() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.rowIndexVar.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.rowIndexVar.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.rowIndexVar.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>rowSelectListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a table element is selected. The method receives a single argument, RowSelectEvent.</p>
	 */
	public void setRowSelectListener(javax.el.MethodExpression rowSelectListener) {
		PropertyKeys propToUse = PropertyKeys.rowSelectListener;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.rowSelectListener.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), rowSelectListener );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.rowSelectListener.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && rowSelectListener != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",rowSelectListener);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.rowSelectListener.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (rowSelectListener == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, rowSelectListener);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>rowSelectListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a table element is selected. The method receives a single argument, RowSelectEvent.</p>
	 */
	public javax.el.MethodExpression getRowSelectListener() {
		javax.el.MethodExpression retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.rowSelectListener.toString() );
		if (ve != null) {
				retVal = (javax.el.MethodExpression) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.rowSelectListener.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.rowSelectListener.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>rowStateVar</code> property.</p>
	 * <p>Contents: The request-scope attribute (if any) under which the table state object for the current row will be exposed when iterating.</p>
	 */
	public void setRowStateVar(java.lang.String rowStateVar) {
		PropertyKeys propToUse = PropertyKeys.rowStateVar;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.rowStateVar.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), rowStateVar );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.rowStateVar.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && rowStateVar != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",rowStateVar);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.rowStateVar.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (rowStateVar == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, rowStateVar);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>rowStateVar</code> property.</p>
	 * <p>Contents: The request-scope attribute (if any) under which the table state object for the current row will be exposed when iterating. Default = 'rowState'.</p>
	 */
	public java.lang.String getRowStateVar() {
		java.lang.String retVal = "rowState";
		ValueExpression ve = getValueExpression( PropertyKeys.rowStateVar.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.rowStateVar.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.rowStateVar.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>rowStyleClass</code> property.</p>
	 * <p>Contents: Define css classes for each row of the dataTable. EL can be used in this attribute to produce conditional row styling.</p>
	 */
	public void setRowStyleClass(java.lang.String rowStyleClass) {
		PropertyKeys propToUse = PropertyKeys.rowStyleClass;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.rowStyleClass.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), rowStyleClass );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.rowStyleClass.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && rowStyleClass != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",rowStyleClass);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.rowStyleClass.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (rowStyleClass == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, rowStyleClass);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>rowStyleClass</code> property.</p>
	 * <p>Contents: Define css classes for each row of the dataTable. EL can be used in this attribute to produce conditional row styling.</p>
	 */
	public java.lang.String getRowStyleClass() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.rowStyleClass.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.rowStyleClass.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.rowStyleClass.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>rowUnselectListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a table element is deselected. The method receives a single argument, RowUnselectEvent.</p>
	 */
	public void setRowUnselectListener(javax.el.MethodExpression rowUnselectListener) {
		PropertyKeys propToUse = PropertyKeys.rowUnselectListener;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.rowUnselectListener.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), rowUnselectListener );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.rowUnselectListener.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && rowUnselectListener != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",rowUnselectListener);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.rowUnselectListener.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (rowUnselectListener == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, rowUnselectListener);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>rowUnselectListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a table element is deselected. The method receives a single argument, RowUnselectEvent.</p>
	 */
	public javax.el.MethodExpression getRowUnselectListener() {
		javax.el.MethodExpression retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.rowUnselectListener.toString() );
		if (ve != null) {
				retVal = (javax.el.MethodExpression) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.rowUnselectListener.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.rowUnselectListener.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>rows</code> property.</p>
	 * <p>Contents: The number of rows to be displayed, or zero to display the entire set of available rows.</p>
	 */
	public void setRows(int rows) {
		PropertyKeys propToUse = PropertyKeys.rows;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.rows.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), rows );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.rows.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",rows);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.rows.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, rows);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>rows</code> property.</p>
	 * <p>Contents: The number of rows to be displayed, or zero to display the entire set of available rows. Default = '0'.</p>
	 */
	public int getRows() {
		java.lang.Integer retVal = 0;
		ValueExpression ve = getValueExpression( PropertyKeys.rows.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Integer) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.rows.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.rows.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>rowsPerPageTemplate</code> property.</p>
	 * <p>Contents: Defines a list of comma separated integer values that represent the options of "number of items per page" presented to the user. "all" is a special keyword that allowsa user to reset the pagination offset show all rows. The "all" option label is defined by the  message key "org.icefaces.ace.component.datatable.ALL_LABEL". Any non-numerical value other than "all" will cause a NumberFormatException.</p>
	 */
	public void setRowsPerPageTemplate(java.lang.String rowsPerPageTemplate) {
		PropertyKeys propToUse = PropertyKeys.rowsPerPageTemplate;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.rowsPerPageTemplate.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), rowsPerPageTemplate );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.rowsPerPageTemplate.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && rowsPerPageTemplate != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",rowsPerPageTemplate);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.rowsPerPageTemplate.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (rowsPerPageTemplate == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, rowsPerPageTemplate);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>rowsPerPageTemplate</code> property.</p>
	 * <p>Contents: Defines a list of comma separated integer values that represent the options of "number of items per page" presented to the user. "all" is a special keyword that allowsa user to reset the pagination offset show all rows. The "all" option label is defined by the  message key "org.icefaces.ace.component.datatable.ALL_LABEL". Any non-numerical value other than "all" will cause a NumberFormatException.</p>
	 */
	public java.lang.String getRowsPerPageTemplate() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.rowsPerPageTemplate.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.rowsPerPageTemplate.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.rowsPerPageTemplate.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>scrollHeight</code> property.</p>
	 * <p>Contents: Defines a fixed height for the scrollable table in pixels.</p>
	 */
	public void setScrollHeight(java.lang.Integer scrollHeight) {
		PropertyKeys propToUse = PropertyKeys.scrollHeight;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.scrollHeight.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), scrollHeight );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.scrollHeight.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && scrollHeight != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",scrollHeight);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.scrollHeight.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (scrollHeight == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, scrollHeight);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>scrollHeight</code> property.</p>
	 * <p>Contents: Defines a fixed height for the scrollable table in pixels. Default = '100'.</p>
	 */
	public java.lang.Integer getScrollHeight() {
		java.lang.Integer retVal = 100;
		ValueExpression ve = getValueExpression( PropertyKeys.scrollHeight.toString() );
		if (ve != null) {
				retVal = (java.lang.Integer) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.scrollHeight.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.scrollHeight.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>scrollWidthIE7</code> property.</p>
	 * <p>Contents: When using the DataTable scrollable mode, the IE7 configuration gives an equal width to evey column, and defaults to 100% width. This implies there is never a horizontal scrollbar for the table, unless a fixed width is used on the table or the container of the table. Ratherthan doing this via CSS, this property will apply (via JS) the given width and necessary overflow rules to the ancestors of the DataTable elements to produce a scrollbar.Other browsers will produce a horizontal scrollbar automatically when required and this property is ignored.</p>
	 */
	public void setScrollWidthIE7(java.lang.String scrollWidthIE7) {
		PropertyKeys propToUse = PropertyKeys.scrollWidthIE7;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.scrollWidthIE7.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), scrollWidthIE7 );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.scrollWidthIE7.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && scrollWidthIE7 != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",scrollWidthIE7);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.scrollWidthIE7.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (scrollWidthIE7 == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, scrollWidthIE7);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>scrollWidthIE7</code> property.</p>
	 * <p>Contents: When using the DataTable scrollable mode, the IE7 configuration gives an equal width to evey column, and defaults to 100% width. This implies there is never a horizontal scrollbar for the table, unless a fixed width is used on the table or the container of the table. Ratherthan doing this via CSS, this property will apply (via JS) the given width and necessary overflow rules to the ancestors of the DataTable elements to produce a scrollbar.Other browsers will produce a horizontal scrollbar automatically when required and this property is ignored.</p>
	 */
	public java.lang.String getScrollWidthIE7() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.scrollWidthIE7.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.scrollWidthIE7.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.scrollWidthIE7.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>scrollable</code> property.</p>
	 * <p>Contents: Enabling renders a table that overflows the fixed height and adds a scrollbar. Note, used in combination with multi-row headers defined by a ColumnGroupcomponent, it is assumed that every body column of the table will have a associated single column spanning header column on the bottom row of the multi-row header. This is to allow for appropriate sizing of the scrollable column and the associated header td. Note,in IE7, the CSS/DOM engine doesn't suport the dynamic adjustments required for this feature andinstead the feature uses a fixed, equal size for each column of the table.</p>
	 */
	public void setScrollable(boolean scrollable) {
		PropertyKeys propToUse = PropertyKeys.scrollable;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.scrollable.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), scrollable );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.scrollable.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",scrollable);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.scrollable.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, scrollable);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>scrollable</code> property.</p>
	 * <p>Contents: Enabling renders a table that overflows the fixed height and adds a scrollbar. Note, used in combination with multi-row headers defined by a ColumnGroupcomponent, it is assumed that every body column of the table will have a associated single column spanning header column on the bottom row of the multi-row header. This is to allow for appropriate sizing of the scrollable column and the associated header td. Note,in IE7, the CSS/DOM engine doesn't suport the dynamic adjustments required for this feature andinstead the feature uses a fixed, equal size for each column of the table.</p>
	 */
	public boolean isScrollable() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.scrollable.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.scrollable.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.scrollable.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>selectionMode</code> property.</p>
	 * <p>Contents: Defines a code word indicating method of table element selection. Available values include: "multiple", "single", "cellblock", "cellrange" and "singlecell".</p>
	 */
	public void setSelectionMode(java.lang.String selectionMode) {
		PropertyKeys propToUse = PropertyKeys.selectionMode;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.selectionMode.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), selectionMode );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.selectionMode.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && selectionMode != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",selectionMode);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.selectionMode.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (selectionMode == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, selectionMode);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>selectionMode</code> property.</p>
	 * <p>Contents: Defines a code word indicating method of table element selection. Available values include: "multiple", "single", "cellblock", "cellrange" and "singlecell".</p>
	 */
	public java.lang.String getSelectionMode() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.selectionMode.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.selectionMode.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.selectionMode.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>singleSort</code> property.</p>
	 * <p>Contents: Disables sorting for multiple columns at once. Sorting is enabled by the use of sortBy on ace:column components.</p>
	 */
	public void setSingleSort(boolean singleSort) {
		PropertyKeys propToUse = PropertyKeys.singleSort;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.singleSort.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), singleSort );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.singleSort.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",singleSort);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.singleSort.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, singleSort);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>singleSort</code> property.</p>
	 * <p>Contents: Disables sorting for multiple columns at once. Sorting is enabled by the use of sortBy on ace:column components. Default = 'false'.</p>
	 */
	public boolean isSingleSort() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.singleSort.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.singleSort.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.singleSort.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>stateMap</code> property.</p>
	 * <p>Contents: Defines a map of your row data objects to UI states. Row-level features (selection, expansion, etc.) are manipulable through this repository.</p>
	 */
	public void setStateMap(org.icefaces.ace.model.table.RowStateMap stateMap) {
		PropertyKeys propToUse = PropertyKeys.stateMap;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.stateMap.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), stateMap );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.stateMap.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && stateMap != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",stateMap);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.stateMap.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (stateMap == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, stateMap);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>stateMap</code> property.</p>
	 * <p>Contents: Defines a map of your row data objects to UI states. Row-level features (selection, expansion, etc.) are manipulable through this repository.</p>
	 */
	public org.icefaces.ace.model.table.RowStateMap getStateMap() {
		org.icefaces.ace.model.table.RowStateMap retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.stateMap.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.model.table.RowStateMap) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.stateMap.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.model.table.RowStateMap) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.stateMap.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.model.table.RowStateMap) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>staticHeaders</code> property.</p>
	 * <p>Contents: Enable the default scrollable table behaviour of using JavaScript to size a table header and footer that are in a fixed position regardless of table body scrolling.</p>
	 */
	public void setStaticHeaders(java.lang.Boolean staticHeaders) {
		PropertyKeys propToUse = PropertyKeys.staticHeaders;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.staticHeaders.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), staticHeaders );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.staticHeaders.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && staticHeaders != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",staticHeaders);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.staticHeaders.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (staticHeaders == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, staticHeaders);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>staticHeaders</code> property.</p>
	 * <p>Contents: Enable the default scrollable table behaviour of using JavaScript to size a table header and footer that are in a fixed position regardless of table body scrolling. Default = 'true'.</p>
	 */
	public java.lang.Boolean isStaticHeaders() {
		java.lang.Boolean retVal = true;
		ValueExpression ve = getValueExpression( PropertyKeys.staticHeaders.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.staticHeaders.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.staticHeaders.toString() + "_defaultValues";
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
	 * <p>Contents: Custom inline CSS styles to use for this component. These styles are generally applied to the root DOM element of the component. This is intended for per-component basic style customizations. Note that due to browser CSS precedence rules, CSS rendered on a DOM element will take precedence over the external stylesheets used to provide the ThemeRoller theme on this component. If the CSS properties applied with this attribute do not affect the DOM element you want to style, you may need to create a custom theme styleClass for the theme CSS class that targets the particular DOM elements you wish to customize.</p>
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
	 * <p>Contents: Custom inline CSS styles to use for this component. These styles are generally applied to the root DOM element of the component. This is intended for per-component basic style customizations. Note that due to browser CSS precedence rules, CSS rendered on a DOM element will take precedence over the external stylesheets used to provide the ThemeRoller theme on this component. If the CSS properties applied with this attribute do not affect the DOM element you want to style, you may need to create a custom theme styleClass for the theme CSS class that targets the particular DOM elements you wish to customize.</p>
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
	 * <p>Set the value of the <code>styleClass</code> property.</p>
	 * <p>Contents: Custom CSS style class(es) to use for this component. These style classes can be defined in your page or in a theme CSS file.</p>
	 */
	public void setStyleClass(java.lang.String styleClass) {
		PropertyKeys propToUse = PropertyKeys.styleClass;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.styleClass.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), styleClass );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.styleClass.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && styleClass != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",styleClass);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.styleClass.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (styleClass == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, styleClass);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>styleClass</code> property.</p>
	 * <p>Contents: Custom CSS style class(es) to use for this component. These style classes can be defined in your page or in a theme CSS file.</p>
	 */
	public java.lang.String getStyleClass() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.styleClass.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.styleClass.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.styleClass.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>tabIndex</code> property.</p>
	 * <p>Contents: Defines a tabindex to be shared by all keyboard navigable elements of the table. This includes sort controls, filter fields and individual rows themselves.</p>
	 */
	public void setTabIndex(java.lang.Integer tabIndex) {
		PropertyKeys propToUse = PropertyKeys.tabIndex;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.tabIndex.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), tabIndex );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.tabIndex.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && tabIndex != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",tabIndex);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.tabIndex.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (tabIndex == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, tabIndex);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>tabIndex</code> property.</p>
	 * <p>Contents: Defines a tabindex to be shared by all keyboard navigable elements of the table. This includes sort controls, filter fields and individual rows themselves. Default = '0'.</p>
	 */
	public java.lang.Integer getTabIndex() {
		java.lang.Integer retVal = 0;
		ValueExpression ve = getValueExpression( PropertyKeys.tabIndex.toString() );
		if (ve != null) {
				retVal = (java.lang.Integer) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.tabIndex.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.tabIndex.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>toggleOnInvalidEdit</code> property.</p>
	 * <p>Contents: Enable the the client to revert the edited row with the default state following a failed edit. By default when validation fails during a row editing request the row remains in editing mode.</p>
	 */
	public void setToggleOnInvalidEdit(java.lang.Boolean toggleOnInvalidEdit) {
		PropertyKeys propToUse = PropertyKeys.toggleOnInvalidEdit;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.toggleOnInvalidEdit.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), toggleOnInvalidEdit );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.toggleOnInvalidEdit.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && toggleOnInvalidEdit != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",toggleOnInvalidEdit);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.toggleOnInvalidEdit.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (toggleOnInvalidEdit == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, toggleOnInvalidEdit);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>toggleOnInvalidEdit</code> property.</p>
	 * <p>Contents: Enable the the client to revert the edited row with the default state following a failed edit. By default when validation fails during a row editing request the row remains in editing mode. Default = 'false'.</p>
	 */
	public java.lang.Boolean isToggleOnInvalidEdit() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.toggleOnInvalidEdit.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.toggleOnInvalidEdit.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.toggleOnInvalidEdit.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>applyingFilters</code> property.</p>
	 */
	public void setApplyingFilters(java.lang.Boolean applyingFilters) {
		StateHelper sh = getStateHelper(); 
		String clientId = getClientId();
		String valuesKey = PropertyKeys.applyingFilters.toString() + "_rowValues"; 
		Map clientValues = (Map) sh.get(valuesKey); 
		if (clientValues == null) {
			clientValues = new HashMap(); 
		}
		if (applyingFilters != null) clientValues.put(clientId, applyingFilters);
		else clientValues.remove(clientId);
		//Always re-add the delta values to the map. JSF merges the values into the main map
		//and values are not state saved unless they're in the delta map. 
		sh.put(valuesKey, clientValues);
	}

	/**
	 * <p>Return the value of the <code>applyingFilters</code> property.</p>
	 */
	public java.lang.Boolean isApplyingFilters() {
		java.lang.Boolean retVal = true;
		StateHelper sh = getStateHelper(); 
		String valuesKey = PropertyKeys.applyingFilters.toString() + "_rowValues";
		Map clientValues = (Map) sh.get(valuesKey);
		if (clientValues != null) { 
			String clientId = getClientId();
			if (clientValues.containsKey( clientId ) ) { 
				retVal = (java.lang.Boolean) clientValues.get(clientId); 
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>applyingSorts</code> property.</p>
	 */
	public void setApplyingSorts(java.lang.Boolean applyingSorts) {
		StateHelper sh = getStateHelper(); 
		String clientId = getClientId();
		String valuesKey = PropertyKeys.applyingSorts.toString() + "_rowValues"; 
		Map clientValues = (Map) sh.get(valuesKey); 
		if (clientValues == null) {
			clientValues = new HashMap(); 
		}
		if (applyingSorts != null) clientValues.put(clientId, applyingSorts);
		else clientValues.remove(clientId);
		//Always re-add the delta values to the map. JSF merges the values into the main map
		//and values are not state saved unless they're in the delta map. 
		sh.put(valuesKey, clientValues);
	}

	/**
	 * <p>Return the value of the <code>applyingSorts</code> property.</p>
	 */
	public java.lang.Boolean isApplyingSorts() {
		java.lang.Boolean retVal = true;
		StateHelper sh = getStateHelper(); 
		String valuesKey = PropertyKeys.applyingSorts.toString() + "_rowValues";
		Map clientValues = (Map) sh.get(valuesKey);
		if (clientValues != null) { 
			String clientId = getClientId();
			if (clientValues.containsKey( clientId ) ) { 
				retVal = (java.lang.Boolean) clientValues.get(clientId); 
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>cachedGlobalFilter</code> property.</p>
	 */
	public void setCachedGlobalFilter(java.lang.Object cachedGlobalFilter) {
		StateHelper sh = getStateHelper(); 
		String clientId = getClientId();
		String valuesKey = PropertyKeys.cachedGlobalFilter.toString() + "_rowValues"; 
		Map clientValues = (Map) sh.get(valuesKey); 
		if (clientValues == null) {
			clientValues = new HashMap(); 
		}
		if (cachedGlobalFilter != null) clientValues.put(clientId, cachedGlobalFilter);
		else clientValues.remove(clientId);
		//Always re-add the delta values to the map. JSF merges the values into the main map
		//and values are not state saved unless they're in the delta map. 
		sh.put(valuesKey, clientValues);
	}

	/**
	 * <p>Return the value of the <code>cachedGlobalFilter</code> property.</p>
	 */
	public java.lang.Object getCachedGlobalFilter() {
		java.lang.Object retVal = null;
		StateHelper sh = getStateHelper(); 
		String valuesKey = PropertyKeys.cachedGlobalFilter.toString() + "_rowValues";
		Map clientValues = (Map) sh.get(valuesKey);
		if (clientValues != null) { 
			String clientId = getClientId();
			if (clientValues.containsKey( clientId ) ) { 
				retVal = (java.lang.Object) clientValues.get(clientId); 
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>filteredData</code> property.</p>
	 */
	public void setFilteredData(java.util.List filteredData) {
		StateHelper sh = getStateHelper(); 
		String clientId = getClientId();
		String valuesKey = PropertyKeys.filteredData.toString() + "_rowValues"; 
		Map clientValues = (Map) sh.get(valuesKey); 
		if (clientValues == null) {
			clientValues = new HashMap(); 
		}
		if (filteredData != null) clientValues.put(clientId, filteredData);
		else clientValues.remove(clientId);
		//Always re-add the delta values to the map. JSF merges the values into the main map
		//and values are not state saved unless they're in the delta map. 
		sh.put(valuesKey, clientValues);
	}

	/**
	 * <p>Return the value of the <code>filteredData</code> property.</p>
	 */
	public java.util.List getFilteredData() {
		java.util.List retVal = null;
		StateHelper sh = getStateHelper(); 
		String valuesKey = PropertyKeys.filteredData.toString() + "_rowValues";
		Map clientValues = (Map) sh.get(valuesKey);
		if (clientValues != null) { 
			String clientId = getClientId();
			if (clientValues.containsKey( clientId ) ) { 
				retVal = (java.util.List) clientValues.get(clientId); 
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>forcedUpdateCounter</code> property.</p>
	 */
	public void setForcedUpdateCounter(java.lang.Integer forcedUpdateCounter) {
		StateHelper sh = getStateHelper(); 
		String clientId = getClientId();
		String valuesKey = PropertyKeys.forcedUpdateCounter.toString() + "_rowValues"; 
		Map clientValues = (Map) sh.get(valuesKey); 
		if (clientValues == null) {
			clientValues = new HashMap(); 
		}
		if (forcedUpdateCounter != null) clientValues.put(clientId, forcedUpdateCounter);
		else clientValues.remove(clientId);
		//Always re-add the delta values to the map. JSF merges the values into the main map
		//and values are not state saved unless they're in the delta map. 
		sh.put(valuesKey, clientValues);
	}

	/**
	 * <p>Return the value of the <code>forcedUpdateCounter</code> property.</p>
	 */
	public java.lang.Integer getForcedUpdateCounter() {
		java.lang.Integer retVal = 0;
		StateHelper sh = getStateHelper(); 
		String valuesKey = PropertyKeys.forcedUpdateCounter.toString() + "_rowValues";
		Map clientValues = (Map) sh.get(valuesKey);
		if (clientValues != null) { 
			String clientId = getClientId();
			if (clientValues.containsKey( clientId ) ) { 
				retVal = (java.lang.Integer) clientValues.get(clientId); 
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>tableConfigPanel</code> property.</p>
	 */
	public void setTableConfigPanel(java.lang.String tableConfigPanel) {
		StateHelper sh = getStateHelper(); 
		String clientId = getClientId();
		String valuesKey = PropertyKeys.tableConfigPanel.toString() + "_rowValues"; 
		Map clientValues = (Map) sh.get(valuesKey); 
		if (clientValues == null) {
			clientValues = new HashMap(); 
		}
		if (tableConfigPanel != null) clientValues.put(clientId, tableConfigPanel);
		else clientValues.remove(clientId);
		//Always re-add the delta values to the map. JSF merges the values into the main map
		//and values are not state saved unless they're in the delta map. 
		sh.put(valuesKey, clientValues);
	}

	/**
	 * <p>Return the value of the <code>tableConfigPanel</code> property.</p>
	 */
	public java.lang.String getTableConfigPanel() {
		java.lang.String retVal = null;
		StateHelper sh = getStateHelper(); 
		String valuesKey = PropertyKeys.tableConfigPanel.toString() + "_rowValues";
		Map clientValues = (Map) sh.get(valuesKey);
		if (clientValues != null) { 
			String clientId = getClientId();
			if (clientValues.containsKey( clientId ) ) { 
				retVal = (java.lang.String) clientValues.get(clientId); 
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>valueHashCode</code> property.</p>
	 */
	public void setValueHashCode(java.lang.Integer valueHashCode) {
		StateHelper sh = getStateHelper(); 
		String clientId = getClientId();
		String valuesKey = PropertyKeys.valueHashCode.toString() + "_rowValues"; 
		Map clientValues = (Map) sh.get(valuesKey); 
		if (clientValues == null) {
			clientValues = new HashMap(); 
		}
		if (valueHashCode != null) clientValues.put(clientId, valueHashCode);
		else clientValues.remove(clientId);
		//Always re-add the delta values to the map. JSF merges the values into the main map
		//and values are not state saved unless they're in the delta map. 
		sh.put(valuesKey, clientValues);
	}

	/**
	 * <p>Return the value of the <code>valueHashCode</code> property.</p>
	 */
	public java.lang.Integer getValueHashCode() {
		java.lang.Integer retVal = null;
		StateHelper sh = getStateHelper(); 
		String valuesKey = PropertyKeys.valueHashCode.toString() + "_rowValues";
		Map clientValues = (Map) sh.get(valuesKey);
		if (clientValues != null) { 
			String clientId = getClientId();
			if (clientValues.containsKey( clientId ) ) { 
				retVal = (java.lang.Integer) clientValues.get(clientId); 
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
			"page",
			"rowsPerPage",
			"cellClick",
			"cellDblClick",
			"select",
			"deselect",
			"sort",
			"filter",
			"reorder",
			"editStart",
			"editSubmit",
			"editCancel",
			"expand",
			"contract",
			"pin",
			"unpin"));

	private static final Map<String, String> defaultRenderMap;
	private static final Map<String, String> defaultExecuteMap;
	private static final Map<String, String> listenerArgumentMap;
	static {
		Map<String, String> drm = new HashMap<String, String>(17);
		Map<String, String> dem = new HashMap<String, String>(17);
		Map<String, String> lam = new HashMap<String, String>(17);
		drm.put("page","@all");
		dem.put("page","@this");
		lam.put("page","");
		drm.put("rowsPerPage","@all");
		dem.put("rowsPerPage","@this");
		lam.put("rowsPerPage","");
		drm.put("cellClick","@all");
		dem.put("cellClick","@this");
		lam.put("cellClick","");
		drm.put("cellDblClick","@all");
		dem.put("cellDblClick","@this");
		lam.put("cellDblClick","");
		drm.put("select","@all");
		dem.put("select","@this");
		lam.put("select","");
		drm.put("deselect","@all");
		dem.put("deselect","@this");
		lam.put("deselect","");
		drm.put("sort","@all");
		dem.put("sort","@this");
		lam.put("sort","");
		drm.put("filter","@all");
		dem.put("filter","@this");
		lam.put("filter","");
		drm.put("reorder","@all");
		dem.put("reorder","@this");
		lam.put("reorder","");
		drm.put("editStart","@this");
		dem.put("editStart","@this");
		lam.put("editStart","");
		drm.put("editSubmit","@all");
		dem.put("editSubmit","@this");
		lam.put("editSubmit","");
		drm.put("editCancel","@this");
		dem.put("editCancel","@this");
		lam.put("editCancel","");
		drm.put("expand","@all");
		dem.put("expand","@this");
		lam.put("expand","");
		drm.put("contract","@all");
		dem.put("contract","@this");
		lam.put("contract","");
		drm.put("pin","@this");
		dem.put("pin","@this");
		lam.put("pin","");
		drm.put("unpin","@this");
		dem.put("unpin","@this");
		lam.put("unpin","");
		defaultRenderMap = Collections.unmodifiableMap(drm);
		defaultExecuteMap = Collections.unmodifiableMap(dem);
		listenerArgumentMap = Collections.unmodifiableMap(lam);
	}

	public Collection<String> getEventNames() {
		return eventNames;
	}

	public String getDefaultEventName() {
		return "select";
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