package org.icefaces.ace.component.expansiontoggler;

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

import org.icefaces.ace.component.expansiontoggler.IExpansionToggler;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * <p>Renders a control to toggle the expanded state of this row. If this table only contains either PanelExpansion or RowExpansion, that type of expansion will occur. If both are children of the table, the 'expansion type' for each row is configurable via the RowState.</p><p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/ExpansionToggler">Expansion Toggler Wiki Documentation</a>.</p>
 */
public abstract class ExpansionTogglerBase extends javax.faces.component.UIComponentBase implements IExpansionToggler{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.ExpansionToggler";
	public static final String RENDERER_TYPE = "org.icefaces.ace.component.ExpansionTogglerRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public ExpansionTogglerBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.ExpansionToggler";
	}


	protected enum PropertyKeys {
		changeListener,
		toggled,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>changeListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a row element is expanded. The method receives a single argument, ExpansionChangeEvent.</p>
	 */
	public void setChangeListener(javax.el.MethodExpression changeListener) {
		PropertyKeys propToUse = PropertyKeys.changeListener;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.changeListener.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), changeListener );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.changeListener.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && changeListener != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",changeListener);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.changeListener.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (changeListener == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, changeListener);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>changeListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a row element is expanded. The method receives a single argument, ExpansionChangeEvent.</p>
	 */
	public javax.el.MethodExpression getChangeListener() {
		javax.el.MethodExpression retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.changeListener.toString() );
		if (ve != null) {
				retVal = (javax.el.MethodExpression) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.changeListener.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.changeListener.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>toggled</code> property.</p>
	 */
	public void setToggled(java.lang.Boolean toggled) {
		StateHelper sh = getStateHelper(); 
		String clientId = getClientId();
		String valuesKey = PropertyKeys.toggled.toString() + "_rowValues"; 
		Map clientValues = (Map) sh.get(valuesKey); 
		if (clientValues == null) {
			clientValues = new HashMap(); 
		}
		if (toggled != null) clientValues.put(clientId, toggled);
		else clientValues.remove(clientId);
		//Always re-add the delta values to the map. JSF merges the values into the main map
		//and values are not state saved unless they're in the delta map. 
		sh.put(valuesKey, clientValues);
	}

	/**
	 * <p>Return the value of the <code>toggled</code> property.</p>
	 */
	public java.lang.Boolean isToggled() {
		java.lang.Boolean retVal = false;
		StateHelper sh = getStateHelper(); 
		String valuesKey = PropertyKeys.toggled.toString() + "_rowValues";
		Map clientValues = (Map) sh.get(valuesKey);
		if (clientValues != null) { 
			String clientId = getClientId();
			if (clientValues.containsKey( clientId ) ) { 
				retVal = (java.lang.Boolean) clientValues.get(clientId); 
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