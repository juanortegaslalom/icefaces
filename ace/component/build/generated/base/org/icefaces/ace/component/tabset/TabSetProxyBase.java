package org.icefaces.ace.component.tabset;

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

import org.icefaces.ace.component.tabset.ITabSetProxy;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * <p>The TabSetProxy component is used in conjunction with a server-side TabSet component that is not inside of a form. The TabSetProxy will then instead be placed inside of a form, to handle the server communication on behalf of the TabSet. <p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/TabSetProxy">TabSetProxy Wiki Documentation</a>.
 */
public abstract class TabSetProxyBase extends javax.faces.component.UIPanel implements ITabSetProxy{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.TabSetProxy";
	public static final String RENDERER_TYPE = null;

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public TabSetProxyBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.component";
	}


	protected enum PropertyKeys {
		For("for"),
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>for</code> property.</p>
	 * <p>Contents: clientId of the tabSet component</p>
	 */
	public void setFor(java.lang.String For) {
		PropertyKeys propToUse = PropertyKeys.For;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.For.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), For );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.For.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && For != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",For);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.For.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (For == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, For);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>for</code> property.</p>
	 * <p>Contents: clientId of the tabSet component</p>
	 */
	public java.lang.String getFor() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.For.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.For.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.For.toString() + "_defaultValues";
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