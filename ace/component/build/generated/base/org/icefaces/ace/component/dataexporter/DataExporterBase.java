package org.icefaces.ace.component.dataexporter;

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

import org.icefaces.ace.component.dataexporter.IDataExporter;
import org.icefaces.ace.api.IceClientBehaviorHolder;
import java.util.Collection;
import java.util.Collections;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * Utility to export data from a datatable as an Excel, PDF, XML or CSV document. This component renders an HTML button. More components and HTML elements can be nested inside this tag to give a different look to the button.<p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/DataExporter">DataExporter Wiki Documentation</a>.
 */
@ICEResourceLibrary("icefaces.ace")
@ICEResourceDependencies({
	@ICEResourceDependency(name="util/ace-datatable.js",library="",target="",browser=BrowserType.ALL,browserOverride={})
})
public abstract class DataExporterBase extends javax.faces.component.UIComponentBase implements IDataExporter,IceClientBehaviorHolder{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.DataExporter";
	public static final String RENDERER_TYPE = "org.icefaces.ace.component.DataExporterRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public DataExporterBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.component";
	}


	protected enum PropertyKeys {
		customExporter,
		encoding,
		excludeColumns,
		expandedOnly,
		fileName,
		includeFooters,
		includeHeaders,
		label,
		pageOnly,
		postProcessor,
		preProcessor,
		selectedRowsOnly,
		style,
		styleClass,
		target,
		type,
		userColumnOrder,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>customExporter</code> property.</p>
	 * <p>Contents: Specifies an object that implements a custom format type to use instead of one of the built-in formats. When this attribute is specified, it will override the "type" attribute. The object must extend org.icefaces.ace.component.dataexporter.Exporter.</p>
	 */
	public void setCustomExporter(java.lang.Object customExporter) {
		PropertyKeys propToUse = PropertyKeys.customExporter;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.customExporter.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), customExporter );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.customExporter.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && customExporter != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",customExporter);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.customExporter.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (customExporter == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, customExporter);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>customExporter</code> property.</p>
	 * <p>Contents: Specifies an object that implements a custom format type to use instead of one of the built-in formats. When this attribute is specified, it will override the "type" attribute. The object must extend org.icefaces.ace.component.dataexporter.Exporter.</p>
	 */
	public java.lang.Object getCustomExporter() {
		java.lang.Object retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.customExporter.toString() );
		if (ve != null) {
				retVal = (java.lang.Object) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.customExporter.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.customExporter.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>encoding</code> property.</p>
	 * <p>Contents: Define a character encoding to use.</p>
	 */
	public void setEncoding(java.lang.String encoding) {
		PropertyKeys propToUse = PropertyKeys.encoding;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.encoding.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), encoding );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.encoding.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && encoding != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",encoding);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.encoding.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (encoding == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, encoding);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>encoding</code> property.</p>
	 * <p>Contents: Define a character encoding to use. Default = 'UTF-8'.</p>
	 */
	public java.lang.String getEncoding() {
		java.lang.String retVal = "UTF-8";
		ValueExpression ve = getValueExpression( PropertyKeys.encoding.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.encoding.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.encoding.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>excludeColumns</code> property.</p>
	 * <p>Contents: Define a comma separated list of column indexes (zero-relative) to be excluded from export.</p>
	 */
	public void setExcludeColumns(java.lang.String excludeColumns) {
		PropertyKeys propToUse = PropertyKeys.excludeColumns;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.excludeColumns.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), excludeColumns );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.excludeColumns.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && excludeColumns != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",excludeColumns);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.excludeColumns.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (excludeColumns == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, excludeColumns);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>excludeColumns</code> property.</p>
	 * <p>Contents: Define a comma separated list of column indexes (zero-relative) to be excluded from export.</p>
	 */
	public java.lang.String getExcludeColumns() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.excludeColumns.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.excludeColumns.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.excludeColumns.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>expandedOnly</code> property.</p>
	 * <p>Contents: When using row expansion in the table, specify whether the child rows should be exported only if the parent row has been expanded by the user.</p>
	 */
	public void setExpandedOnly(boolean expandedOnly) {
		PropertyKeys propToUse = PropertyKeys.expandedOnly;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.expandedOnly.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), expandedOnly );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.expandedOnly.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",expandedOnly);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.expandedOnly.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, expandedOnly);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>expandedOnly</code> property.</p>
	 * <p>Contents: When using row expansion in the table, specify whether the child rows should be exported only if the parent row has been expanded by the user. Default = 'false'.</p>
	 */
	public boolean isExpandedOnly() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.expandedOnly.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.expandedOnly.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.expandedOnly.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>fileName</code> property.</p>
	 * <p>Contents: Define the filename of the generated file, defaults to dataTable id.</p>
	 */
	public void setFileName(java.lang.String fileName) {
		PropertyKeys propToUse = PropertyKeys.fileName;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.fileName.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), fileName );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.fileName.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && fileName != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",fileName);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.fileName.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (fileName == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, fileName);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>fileName</code> property.</p>
	 * <p>Contents: Define the filename of the generated file, defaults to dataTable id.</p>
	 */
	public java.lang.String getFileName() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.fileName.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.fileName.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.fileName.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>includeFooters</code> property.</p>
	 * <p>Contents: Disable whether column footers should be included at the bottom of the file. This is not applicable when attribute 'type' is set to 'xml'.</p>
	 */
	public void setIncludeFooters(boolean includeFooters) {
		PropertyKeys propToUse = PropertyKeys.includeFooters;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.includeFooters.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), includeFooters );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.includeFooters.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",includeFooters);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.includeFooters.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, includeFooters);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>includeFooters</code> property.</p>
	 * <p>Contents: Disable whether column footers should be included at the bottom of the file. This is not applicable when attribute 'type' is set to 'xml'. Default = 'true'.</p>
	 */
	public boolean isIncludeFooters() {
		java.lang.Boolean retVal = true;
		ValueExpression ve = getValueExpression( PropertyKeys.includeFooters.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.includeFooters.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.includeFooters.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>includeHeaders</code> property.</p>
	 * <p>Contents: Disable whether column headers should be included at the top of the file. This is not applicable when attribute 'type' is set to 'xml'.</p>
	 */
	public void setIncludeHeaders(boolean includeHeaders) {
		PropertyKeys propToUse = PropertyKeys.includeHeaders;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.includeHeaders.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), includeHeaders );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.includeHeaders.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",includeHeaders);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.includeHeaders.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, includeHeaders);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>includeHeaders</code> property.</p>
	 * <p>Contents: Disable whether column headers should be included at the top of the file. This is not applicable when attribute 'type' is set to 'xml'. Default = 'true'.</p>
	 */
	public boolean isIncludeHeaders() {
		java.lang.Boolean retVal = true;
		ValueExpression ve = getValueExpression( PropertyKeys.includeHeaders.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.includeHeaders.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.includeHeaders.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>label</code> property.</p>
	 * <p>Contents: Define the text that will appear on the button to trigger the export. Default value is 'Export'. Attribute applies only if the component has no children.</p>
	 */
	public void setLabel(java.lang.String label) {
		PropertyKeys propToUse = PropertyKeys.label;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.label.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), label );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.label.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && label != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",label);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.label.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (label == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, label);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>label</code> property.</p>
	 * <p>Contents: Define the text that will appear on the button to trigger the export. Default value is 'Export'. Attribute applies only if the component has no children.</p>
	 */
	public java.lang.String getLabel() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.label.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.label.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.label.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>pageOnly</code> property.</p>
	 * <p>Contents: Enable to export only the current page instead of the whole data set.</p>
	 */
	public void setPageOnly(boolean pageOnly) {
		PropertyKeys propToUse = PropertyKeys.pageOnly;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.pageOnly.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), pageOnly );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.pageOnly.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",pageOnly);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.pageOnly.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, pageOnly);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>pageOnly</code> property.</p>
	 * <p>Contents: Enable to export only the current page instead of the whole data set. Default = 'false'.</p>
	 */
	public boolean isPageOnly() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.pageOnly.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.pageOnly.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.pageOnly.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>postProcessor</code> property.</p>
	 * <p>Contents: Defines a public void method to invoke after the PDF or XLS document has been generated, allowing developers to manipulate the document. It must take a single argument of type Object. The object will be of type com.lowagie.text.Document (iText library) for PDF documents and of type org.apache.poi.ss.usermodel.Workbook (Apache POI library) for XLS documents.</p>
	 */
	public void setPostProcessor(javax.el.MethodExpression postProcessor) {
		PropertyKeys propToUse = PropertyKeys.postProcessor;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.postProcessor.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), postProcessor );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.postProcessor.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && postProcessor != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",postProcessor);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.postProcessor.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (postProcessor == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, postProcessor);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>postProcessor</code> property.</p>
	 * <p>Contents: Defines a public void method to invoke after the PDF or XLS document has been generated, allowing developers to manipulate the document. It must take a single argument of type Object. The object will be of type com.lowagie.text.Document (iText library) for PDF documents and of type org.apache.poi.ss.usermodel.Workbook (Apache POI library) for XLS documents.</p>
	 */
	public javax.el.MethodExpression getPostProcessor() {
		javax.el.MethodExpression retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.postProcessor.toString() );
		if (ve != null) {
				retVal = (javax.el.MethodExpression) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.postProcessor.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.postProcessor.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>preProcessor</code> property.</p>
	 * <p>Contents: Defines a public void method to invoke before the PDF or XLS document is generated, allowing developers to manipulate the document. It must take a single argument of type Object. The object will be of type com.lowagie.text.Document (iText library) for PDF documents and of type org.apache.poi.ss.usermodel.Workbook (Apache POI library) for XLS documents.</p>
	 */
	public void setPreProcessor(javax.el.MethodExpression preProcessor) {
		PropertyKeys propToUse = PropertyKeys.preProcessor;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.preProcessor.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), preProcessor );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.preProcessor.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && preProcessor != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",preProcessor);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.preProcessor.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (preProcessor == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, preProcessor);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>preProcessor</code> property.</p>
	 * <p>Contents: Defines a public void method to invoke before the PDF or XLS document is generated, allowing developers to manipulate the document. It must take a single argument of type Object. The object will be of type com.lowagie.text.Document (iText library) for PDF documents and of type org.apache.poi.ss.usermodel.Workbook (Apache POI library) for XLS documents.</p>
	 */
	public javax.el.MethodExpression getPreProcessor() {
		javax.el.MethodExpression retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.preProcessor.toString() );
		if (ve != null) {
				retVal = (javax.el.MethodExpression) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.preProcessor.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.preProcessor.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>selectedRowsOnly</code> property.</p>
	 * <p>Contents: Enable to export only the currently selected rows instead of the whole dataset.</p>
	 */
	public void setSelectedRowsOnly(boolean selectedRowsOnly) {
		PropertyKeys propToUse = PropertyKeys.selectedRowsOnly;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.selectedRowsOnly.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), selectedRowsOnly );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.selectedRowsOnly.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",selectedRowsOnly);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.selectedRowsOnly.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, selectedRowsOnly);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>selectedRowsOnly</code> property.</p>
	 * <p>Contents: Enable to export only the currently selected rows instead of the whole dataset. Default = 'false'.</p>
	 */
	public boolean isSelectedRowsOnly() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.selectedRowsOnly.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.selectedRowsOnly.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.selectedRowsOnly.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>target</code> property.</p>
	 * <p>Contents: Define the id of the ace:dataTable whose data will be exported.</p>
	 */
	public void setTarget(java.lang.String target) {
		PropertyKeys propToUse = PropertyKeys.target;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.target.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), target );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.target.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && target != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",target);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.target.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (target == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, target);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>target</code> property.</p>
	 * <p>Contents: Define the id of the ace:dataTable whose data will be exported.</p>
	 */
	public java.lang.String getTarget() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.target.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.target.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.target.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>type</code> property.</p>
	 * <p>Contents: Define the format of file export. Available formats: "xls","pdf","csv", "xml".</p>
	 */
	public void setType(java.lang.String type) {
		PropertyKeys propToUse = PropertyKeys.type;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.type.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), type );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.type.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && type != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",type);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.type.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (type == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, type);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>type</code> property.</p>
	 * <p>Contents: Define the format of file export. Available formats: "xls","pdf","csv", "xml".</p>
	 */
	public java.lang.String getType() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.type.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.type.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.type.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>userColumnOrder</code> property.</p>
	 * <p>Contents: Specify whether the columns should be exported according to the order established by the user in the client. When false, the column order defined in the markup will be used.</p>
	 */
	public void setUserColumnOrder(boolean userColumnOrder) {
		PropertyKeys propToUse = PropertyKeys.userColumnOrder;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.userColumnOrder.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), userColumnOrder );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.userColumnOrder.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",userColumnOrder);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.userColumnOrder.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, userColumnOrder);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>userColumnOrder</code> property.</p>
	 * <p>Contents: Specify whether the columns should be exported according to the order established by the user in the client. When false, the column order defined in the markup will be used. Default = 'true'.</p>
	 */
	public boolean isUserColumnOrder() {
		java.lang.Boolean retVal = true;
		ValueExpression ve = getValueExpression( PropertyKeys.userColumnOrder.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.userColumnOrder.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.userColumnOrder.toString() + "_defaultValues";
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
			"activate"));

	private static final Map<String, String> defaultRenderMap;
	private static final Map<String, String> defaultExecuteMap;
	private static final Map<String, String> listenerArgumentMap;
	static {
		Map<String, String> drm = new HashMap<String, String>(2);
		Map<String, String> dem = new HashMap<String, String>(2);
		Map<String, String> lam = new HashMap<String, String>(2);
		drm.put("activate","@all");
		dem.put("activate","@this");
		lam.put("activate","");
		defaultRenderMap = Collections.unmodifiableMap(drm);
		defaultExecuteMap = Collections.unmodifiableMap(dem);
		listenerArgumentMap = Collections.unmodifiableMap(lam);
	}

	public Collection<String> getEventNames() {
		return eventNames;
	}

	public String getDefaultEventName() {
		return "activate";
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