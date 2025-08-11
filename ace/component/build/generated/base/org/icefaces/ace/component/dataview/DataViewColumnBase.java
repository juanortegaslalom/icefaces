package org.icefaces.ace.component.dataview;

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

import org.icefaces.ace.component.dataview.IDataViewColumn;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * DataViewColumns defines a column in the table region of the DataView component.
 */
public abstract class DataViewColumnBase extends javax.faces.component.UIComponentBase implements IDataViewColumn{

	public static final String COMPONENT_TYPE = "org.icefaces.DataViewColumn";
	public static final String RENDERER_TYPE = null;

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public DataViewColumnBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.DataViewColumn";
	}


	protected enum PropertyKeys {
		footerText,
		headerText,
		markup,
		reactivePriority,
		styleClass,
		type,
		value,
		converter,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>footerText</code> property.</p>
	 * <p>Contents: Define the text to render in the footer of this column.</p>
	 */
	public void setFooterText(java.lang.String footerText) {
		PropertyKeys propToUse = PropertyKeys.footerText;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.footerText.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), footerText );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.footerText.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && footerText != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",footerText);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.footerText.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (footerText == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, footerText);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>footerText</code> property.</p>
	 * <p>Contents: Define the text to render in the footer of this column.</p>
	 */
	public java.lang.String getFooterText() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.footerText.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.footerText.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.footerText.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>headerText</code> property.</p>
	 * <p>Contents: Define the text to render in the header of this column.</p>
	 */
	public void setHeaderText(java.lang.String headerText) {
		PropertyKeys propToUse = PropertyKeys.headerText;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.headerText.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), headerText );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.headerText.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && headerText != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",headerText);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.headerText.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (headerText == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, headerText);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>headerText</code> property.</p>
	 * <p>Contents: Define the text to render in the header of this column.</p>
	 */
	public java.lang.String getHeaderText() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.headerText.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.headerText.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.headerText.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>markup</code> property.</p>
	 * <p>Contents: Define a String of arbitrary HTML markup to render (when 'type' is set to 'markup') replacing the substring {{value}} with the String representation of the 'value' attribute.</p>
	 */
	public void setMarkup(java.lang.String markup) {
		PropertyKeys propToUse = PropertyKeys.markup;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.markup.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), markup );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.markup.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && markup != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",markup);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.markup.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (markup == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, markup);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>markup</code> property.</p>
	 * <p>Contents: Define a String of arbitrary HTML markup to render (when 'type' is set to 'markup') replacing the substring {{value}} with the String representation of the 'value' attribute.</p>
	 */
	public java.lang.String getMarkup() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.markup.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.markup.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.markup.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>reactivePriority</code> property.</p>
	 * <p>Contents: Define the order that columns are displayed when hiding columns in width constrained cases. Property has no effect unless the 'reactiveColumnVisibility' property of the DataView is enabled. If priority for a given column is unset, priority is assigned in the same order as page markup, following the column with the highest explicit priority.</p>
	 */
	public void setReactivePriority(java.lang.Integer reactivePriority) {
		PropertyKeys propToUse = PropertyKeys.reactivePriority;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.reactivePriority.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), reactivePriority );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.reactivePriority.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && reactivePriority != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",reactivePriority);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.reactivePriority.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (reactivePriority == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, reactivePriority);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>reactivePriority</code> property.</p>
	 * <p>Contents: Define the order that columns are displayed when hiding columns in width constrained cases. Property has no effect unless the 'reactiveColumnVisibility' property of the DataView is enabled. If priority for a given column is unset, priority is assigned in the same order as page markup, following the column with the highest explicit priority.</p>
	 */
	public java.lang.Integer getReactivePriority() {
		java.lang.Integer retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.reactivePriority.toString() );
		if (ve != null) {
				retVal = (java.lang.Integer) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.reactivePriority.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.reactivePriority.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>styleClass</code> property.</p>
	 * <p>Contents: Sets the CSS class to apply to this component.</p>
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
	 * <p>Contents: Sets the CSS class to apply to this component.</p>
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
	 * <p>Set the value of the <code>type</code> property.</p>
	 * <p>Contents: Define the ColumnType of this column, determining how the 'value' attribute of this component will be rendered. Valid options include : text, bool, date, image, markup.
	 * Text will render the String representation of the value object.
	 * Bool assumes the value object is a boolean type and renders a checkbox icon.
	 * Date assumes the value object is a Date object and renders according to the required f:dateTimeConverter child component.
	 * Image assume the value is a representation of an image URL.
	 * Markup renders the String 'markup' attribute with the substring '{{value}}' replaced with the String representation of the value object.</p>
	 */
	public void setType(org.icefaces.ace.component.dataview.ColumnType type) {
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
	 * <p>Contents: Define the ColumnType of this column, determining how the 'value' attribute of this component will be rendered. Valid options include : text, bool, date, image, markup.
	 * Text will render the String representation of the value object.
	 * Bool assumes the value object is a boolean type and renders a checkbox icon.
	 * Date assumes the value object is a Date object and renders according to the required f:dateTimeConverter child component.
	 * Image assume the value is a representation of an image URL.
	 * Markup renders the String 'markup' attribute with the substring '{{value}}' replaced with the String representation of the value object. Default = 'org.icefaces.ace.component.dataview.ColumnType.text'.</p>
	 */
	public org.icefaces.ace.component.dataview.ColumnType getType() {
		org.icefaces.ace.component.dataview.ColumnType retVal = org.icefaces.ace.component.dataview.ColumnType.text;
		ValueExpression ve = getValueExpression( PropertyKeys.type.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.component.dataview.ColumnType) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.type.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.component.dataview.ColumnType) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.type.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.component.dataview.ColumnType) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>value</code> property.</p>
	 * <p>Contents: Define a ValueExpression whose resulting Object will be iteratively rendered in the table region of the DataView according to the 'type' of this column.</p>
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
	 * <p>Contents: Define a ValueExpression whose resulting Object will be iteratively rendered in the table region of the DataView according to the 'type' of this column.</p>
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
	 * <p>Set the value of the <code>converter</code> property.</p>
	 */
	public void setConverter(javax.faces.convert.Converter converter) {
		StateHelper sh = getStateHelper(); 
		String clientId = getClientId();
		String valuesKey = PropertyKeys.converter.toString() + "_rowValues"; 
		Map clientValues = (Map) sh.get(valuesKey); 
		if (clientValues == null) {
			clientValues = new HashMap(); 
		}
		if (converter != null) clientValues.put(clientId, converter);
		else clientValues.remove(clientId);
		//Always re-add the delta values to the map. JSF merges the values into the main map
		//and values are not state saved unless they're in the delta map. 
		sh.put(valuesKey, clientValues);
	}

	/**
	 * <p>Return the value of the <code>converter</code> property.</p>
	 */
	public javax.faces.convert.Converter getConverter() {
		javax.faces.convert.Converter retVal = null;
		StateHelper sh = getStateHelper(); 
		String valuesKey = PropertyKeys.converter.toString() + "_rowValues";
		Map clientValues = (Map) sh.get(valuesKey);
		if (clientValues != null) { 
			String clientId = getClientId();
			if (clientValues.containsKey( clientId ) ) { 
				retVal = (javax.faces.convert.Converter) clientValues.get(clientId); 
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

}