package org.icefaces.ace.component.gmap;

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

import org.icefaces.ace.component.gmap.IGMapMarker;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * The ace:gMapMarker component places one of Google's markers upon the given latitude/longitude coordinates of the parent ace:gMap. For more information, see the <a href="http://wiki.icefaces.org/display/ICE/GMap">gMap</a> Wiki Documentation.
 */
@ICEResourceLibrary("icefaces.ace")
@ICEResourceDependencies({
	@ICEResourceDependency(name="util/ace-components.js",library="",target="",browser=BrowserType.ALL,browserOverride={})
})
public abstract class GMapMarkerBase extends javax.faces.component.UIPanel implements IGMapMarker{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.GMapMarker";
	public static final String RENDERER_TYPE = "org.icefaces.ace.component.GMapMarkerRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public GMapMarkerBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.component";
	}


	protected enum PropertyKeys {
		animation,
		disabled,
		latitude,
		longitude,
		options,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>animation</code> property.</p>
	 * <p>Contents: The animation that the marker should use. Valid values are 'bounce', 'drop', or 'none'.</p>
	 */
	public void setAnimation(java.lang.String animation) {
		PropertyKeys propToUse = PropertyKeys.animation;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.animation.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), animation );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.animation.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && animation != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",animation);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.animation.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (animation == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, animation);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>animation</code> property.</p>
	 * <p>Contents: The animation that the marker should use. Valid values are 'bounce', 'drop', or 'none'.</p>
	 */
	public java.lang.String getAnimation() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.animation.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.animation.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.animation.toString() + "_defaultValues";
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
	 * <p>Contents: Set to true to remove the marker from the map</p>
	 */
	public void setDisabled(java.lang.Boolean disabled) {
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
				if (clientDefaults == null && disabled != null) { 
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
				if (disabled == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, disabled);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>disabled</code> property.</p>
	 * <p>Contents: Set to true to remove the marker from the map Default = 'false'.</p>
	 */
	public java.lang.Boolean isDisabled() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.disabled.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
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
	 * <p>Set the value of the <code>latitude</code> property.</p>
	 * <p>Contents: The latitude for the marker.</p>
	 */
	public void setLatitude(java.lang.String latitude) {
		PropertyKeys propToUse = PropertyKeys.latitude;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.latitude.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), latitude );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.latitude.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && latitude != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",latitude);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.latitude.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (latitude == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, latitude);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>latitude</code> property.</p>
	 * <p>Contents: The latitude for the marker.</p>
	 */
	public java.lang.String getLatitude() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.latitude.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.latitude.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.latitude.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>longitude</code> property.</p>
	 * <p>Contents: The longitude for the marker.</p>
	 */
	public void setLongitude(java.lang.String longitude) {
		PropertyKeys propToUse = PropertyKeys.longitude;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.longitude.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), longitude );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.longitude.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && longitude != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",longitude);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.longitude.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (longitude == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, longitude);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>longitude</code> property.</p>
	 * <p>Contents: The longitude for the marker.</p>
	 */
	public java.lang.String getLongitude() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.longitude.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.longitude.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.longitude.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>options</code> property.</p>
	 * <p>Contents: Additional options to be sent to the marker. Check google maps API for more specifics at https://developers.google.com/maps/documentation/javascript/reference#MarkerOptions. Form is attribute:'value'.</p>
	 */
	public void setOptions(java.lang.String options) {
		PropertyKeys propToUse = PropertyKeys.options;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.options.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), options );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.options.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && options != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",options);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.options.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (options == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, options);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>options</code> property.</p>
	 * <p>Contents: Additional options to be sent to the marker. Check google maps API for more specifics at https://developers.google.com/maps/documentation/javascript/reference#MarkerOptions. Form is attribute:'value'. Default = ' '.</p>
	 */
	public java.lang.String getOptions() {
		java.lang.String retVal = " ";
		ValueExpression ve = getValueExpression( PropertyKeys.options.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.options.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.options.toString() + "_defaultValues";
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