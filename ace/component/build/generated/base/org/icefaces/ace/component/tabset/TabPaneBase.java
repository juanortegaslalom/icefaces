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

import org.icefaces.ace.component.tabset.ITabPane;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * <p>The TabPane component belongs inside of a TabSet component, and encapsulates both the clickable label, and the content pane that is shown when the TabPane is selected. The clickable label part may be specified by the label property, or by the label facet, allowing for any components to comprise the label. <p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/TabPane">TabPane Wiki Documentation</a>.
 */
public abstract class TabPaneBase extends javax.faces.component.UIComponentBase implements ITabPane{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.TabPane";
	public static final String RENDERER_TYPE = null;

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public TabPaneBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.TabPane";
	}


	protected enum PropertyKeys {
		cache,
		disabled,
		label,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>cache</code> property.</p>
	 * <p>Contents: When clientSide=true on the tabSet, all tabPane components are always cached on the client, so this only applies when the tabSet has clientSide=false. When this property value is "none" then no caching occurs in the browser and the tab contents are completely rendered and updated in the browser when the tab is active, and become unrendered when the tab is no longer active. The other values involve the tab contents being cached in different ways. The contents are lazily loaded when the tab first becomes active, and then remain in the browser. When the value is "dynamic", the lazily loaded tab contents will continue to be rendered whether the tab is still active or not, and any changes will be detected and granularly updated. When the value is "static", the tab will not be rendered or updated after the first time. This is an optimisation to save CPU rendering time. It is facilitated by "staticAuto", which is usually like static mode, except when a component within the tab initiates a lifecycle causing a full render, then it will automatically change to being dynamic for just that lifecycle, so that the tab contents may be rendered and updated in the browser. As well, there is "dynamicRevertStaticAuto", which allows for the application to indicate that it wants to temporarily use dynamic caching for the current lifecycle only, and have the tabPane automatically revert the mode back to static auto mode afterwards. This is intended to be set in action/actionListener methods that knowingly update an otherwise statically cached tabPane.</p>
	 */
	public void setCache(java.lang.String cache) {
		PropertyKeys propToUse = PropertyKeys.cache;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.cache.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), cache );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.cache.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && cache != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",cache);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.cache.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (cache == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, cache);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>cache</code> property.</p>
	 * <p>Contents: When clientSide=true on the tabSet, all tabPane components are always cached on the client, so this only applies when the tabSet has clientSide=false. When this property value is "none" then no caching occurs in the browser and the tab contents are completely rendered and updated in the browser when the tab is active, and become unrendered when the tab is no longer active. The other values involve the tab contents being cached in different ways. The contents are lazily loaded when the tab first becomes active, and then remain in the browser. When the value is "dynamic", the lazily loaded tab contents will continue to be rendered whether the tab is still active or not, and any changes will be detected and granularly updated. When the value is "static", the tab will not be rendered or updated after the first time. This is an optimisation to save CPU rendering time. It is facilitated by "staticAuto", which is usually like static mode, except when a component within the tab initiates a lifecycle causing a full render, then it will automatically change to being dynamic for just that lifecycle, so that the tab contents may be rendered and updated in the browser. As well, there is "dynamicRevertStaticAuto", which allows for the application to indicate that it wants to temporarily use dynamic caching for the current lifecycle only, and have the tabPane automatically revert the mode back to static auto mode afterwards. This is intended to be set in action/actionListener methods that knowingly update an otherwise statically cached tabPane. Default = 'none'.</p>
	 */
	public java.lang.String getCache() {
		java.lang.String retVal = "none";
		ValueExpression ve = getValueExpression( PropertyKeys.cache.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.cache.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.cache.toString() + "_defaultValues";
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
	 * <p>Contents: If true then this tab will be disabled and can not be selected.</p>
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
	 * <p>Contents: If true then this tab will be disabled and can not be selected.</p>
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
	 * <p>Set the value of the <code>label</code> property.</p>
	 * <p>Contents: The text label in the clickable tab for the TabPane. Where these are rendered is determined by TabSet's orientation property. Alternatively, the label facet may be used to specify components to represent the label.</p>
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
	 * <p>Contents: The text label in the clickable tab for the TabPane. Where these are rendered is determined by TabSet's orientation property. Alternatively, the label facet may be used to specify components to represent the label.</p>
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
	 * <p>Set the value of the <code>label facet</code> property.</p>
	 */
	public void setLabelFacet(javax.faces.component.UIComponent label) {
		getFacets().put("label", label);
	}

	/**
	 * <p>Return the value of the <code>label facet</code> property.</p>
	 */
	public javax.faces.component.UIComponent getLabelFacet() {
		 return getFacet("label");
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