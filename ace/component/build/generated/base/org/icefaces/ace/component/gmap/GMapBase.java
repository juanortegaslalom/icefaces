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

import org.icefaces.ace.component.gmap.IGMap;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * The base component for the ACE gMap (Google Maps API) set of components. This component is how to define and control the map proper, as well as serving as a parent for the other gMap subcomponents. Important note: To function properly, you must define the property 'org.icefaces.ace.gmapKey' in your web.xml. You can get an API key at http://code.google.com/apis/maps/signup.html. For more information, see the <a href="http://wiki.icefaces.org/display/ICE/GMap">gMap</a> Wiki Documentation.
 */
@ICEResourceLibrary("icefaces.ace")
@ICEResourceDependencies({
	@ICEResourceDependency(name="gmap/api.js",library="",target="",browser=BrowserType.ALL,browserOverride={})
})
public abstract class GMapBase extends javax.faces.component.UIPanel implements IGMap{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.GMap";
	public static final String RENDERER_TYPE = "org.icefaces.ace.component.GMapRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public GMapBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.component";
	}


	protected enum PropertyKeys {
		address,
		intialized,
		latitude,
		locateAddress,
		longitude,
		options,
		style,
		styleClass,
		type,
		zoomLevel,
		oldLatitude,
		oldLongitude,
		oldType,
		oldZoomLevel,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>address</code> property.</p>
	 * <p>Contents: Address to locate.</p>
	 */
	public void setAddress(java.lang.String address) {
		PropertyKeys propToUse = PropertyKeys.address;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.address.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), address );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.address.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && address != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",address);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.address.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (address == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, address);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>address</code> property.</p>
	 * <p>Contents: Address to locate.</p>
	 */
	public java.lang.String getAddress() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.address.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.address.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.address.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>intialized</code> property.</p>
	 * <p>Contents: Specifies whether the map has been initialized or not.</p>
	 */
	public void setIntialized(boolean intialized) {
		PropertyKeys propToUse = PropertyKeys.intialized;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.intialized.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), intialized );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.intialized.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",intialized);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.intialized.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, intialized);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>intialized</code> property.</p>
	 * <p>Contents: Specifies whether the map has been initialized or not. Default = 'false'.</p>
	 */
	public boolean isIntialized() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.intialized.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.intialized.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.intialized.toString() + "_defaultValues";
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
	 * <p>Contents: The starting latitude for the map. Will be overridden if an address is provided.</p>
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
	 * <p>Contents: The starting latitude for the map. Will be overridden if an address is provided. Default = '51.06757388616548'.</p>
	 */
	public java.lang.String getLatitude() {
		java.lang.String retVal = "51.06757388616548";
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
	 * <p>Set the value of the <code>locateAddress</code> property.</p>
	 * <p>Contents: Whether the map should be locating the specified address. Default is false.</p>
	 */
	public void setLocateAddress(boolean locateAddress) {
		PropertyKeys propToUse = PropertyKeys.locateAddress;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.locateAddress.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), locateAddress );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.locateAddress.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",locateAddress);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.locateAddress.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, locateAddress);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>locateAddress</code> property.</p>
	 * <p>Contents: Whether the map should be locating the specified address. Default is false. Default = 'false'.</p>
	 */
	public boolean isLocateAddress() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.locateAddress.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.locateAddress.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.locateAddress.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>longitude</code> property.</p>
	 * <p>Contents: The starting longitude for the map. Will be overridden if an address is provided.</p>
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
	 * <p>Contents: The starting longitude for the map. Will be overridden if an address is provided. Default = '-114.08538937568665'.</p>
	 */
	public java.lang.String getLongitude() {
		java.lang.String retVal = "-114.08538937568665";
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
	 * <p>Contents: Additional options to be sent to the map. Check google maps API at https://developers.google.com/maps/documentation/javascript/reference#MapOptions for more specifics. Form is attribute:'value'.</p>
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
	 * <p>Contents: Additional options to be sent to the map. Check google maps API at https://developers.google.com/maps/documentation/javascript/reference#MapOptions for more specifics. Form is attribute:'value'.</p>
	 */
	public java.lang.String getOptions() {
		java.lang.String retVal = null;
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

	/**
	 * <p>Set the value of the <code>style</code> property.</p>
	 * <p>Contents: Styling for the main gMap div.</p>
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
	 * <p>Contents: Styling for the main gMap div.</p>
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
	 * <p>Contents: The classname for the main gMap div.</p>
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
	 * <p>Contents: The classname for the main gMap div.</p>
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
	 * <p>Contents: Map type to display by default. Possible values are 'HYBRID', 'ROADMAP', 'SATELLITE' and 'TERRAIN', case insensitive.</p>
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
	 * <p>Contents: Map type to display by default. Possible values are 'HYBRID', 'ROADMAP', 'SATELLITE' and 'TERRAIN', case insensitive. Default = 'ROADMAP'.</p>
	 */
	public java.lang.String getType() {
		java.lang.String retVal = "ROADMAP";
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
	 * <p>Set the value of the <code>zoomLevel</code> property.</p>
	 * <p>Contents: Starting zoom of the map element.</p>
	 */
	public void setZoomLevel(java.lang.String zoomLevel) {
		PropertyKeys propToUse = PropertyKeys.zoomLevel;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.zoomLevel.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), zoomLevel );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.zoomLevel.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && zoomLevel != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",zoomLevel);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.zoomLevel.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (zoomLevel == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, zoomLevel);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>zoomLevel</code> property.</p>
	 * <p>Contents: Starting zoom of the map element. Default = '5'.</p>
	 */
	public java.lang.String getZoomLevel() {
		java.lang.String retVal = "5";
		ValueExpression ve = getValueExpression( PropertyKeys.zoomLevel.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.zoomLevel.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.zoomLevel.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>oldLatitude</code> property.</p>
	 */
	public void setOldLatitude(java.lang.String oldLatitude) {
		StateHelper sh = getStateHelper(); 
		String clientId = getClientId();
		String valuesKey = PropertyKeys.oldLatitude.toString() + "_rowValues"; 
		Map clientValues = (Map) sh.get(valuesKey); 
		if (clientValues == null) {
			clientValues = new HashMap(); 
		}
		if (oldLatitude != null) clientValues.put(clientId, oldLatitude);
		else clientValues.remove(clientId);
		//Always re-add the delta values to the map. JSF merges the values into the main map
		//and values are not state saved unless they're in the delta map. 
		sh.put(valuesKey, clientValues);
	}

	/**
	 * <p>Return the value of the <code>oldLatitude</code> property.</p>
	 */
	public java.lang.String getOldLatitude() {
		java.lang.String retVal = null;
		StateHelper sh = getStateHelper(); 
		String valuesKey = PropertyKeys.oldLatitude.toString() + "_rowValues";
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
	 * <p>Set the value of the <code>oldLongitude</code> property.</p>
	 */
	public void setOldLongitude(java.lang.String oldLongitude) {
		StateHelper sh = getStateHelper(); 
		String clientId = getClientId();
		String valuesKey = PropertyKeys.oldLongitude.toString() + "_rowValues"; 
		Map clientValues = (Map) sh.get(valuesKey); 
		if (clientValues == null) {
			clientValues = new HashMap(); 
		}
		if (oldLongitude != null) clientValues.put(clientId, oldLongitude);
		else clientValues.remove(clientId);
		//Always re-add the delta values to the map. JSF merges the values into the main map
		//and values are not state saved unless they're in the delta map. 
		sh.put(valuesKey, clientValues);
	}

	/**
	 * <p>Return the value of the <code>oldLongitude</code> property.</p>
	 */
	public java.lang.String getOldLongitude() {
		java.lang.String retVal = null;
		StateHelper sh = getStateHelper(); 
		String valuesKey = PropertyKeys.oldLongitude.toString() + "_rowValues";
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
	 * <p>Set the value of the <code>oldType</code> property.</p>
	 */
	public void setOldType(java.lang.String oldType) {
		StateHelper sh = getStateHelper(); 
		String clientId = getClientId();
		String valuesKey = PropertyKeys.oldType.toString() + "_rowValues"; 
		Map clientValues = (Map) sh.get(valuesKey); 
		if (clientValues == null) {
			clientValues = new HashMap(); 
		}
		if (oldType != null) clientValues.put(clientId, oldType);
		else clientValues.remove(clientId);
		//Always re-add the delta values to the map. JSF merges the values into the main map
		//and values are not state saved unless they're in the delta map. 
		sh.put(valuesKey, clientValues);
	}

	/**
	 * <p>Return the value of the <code>oldType</code> property.</p>
	 */
	public java.lang.String getOldType() {
		java.lang.String retVal = null;
		StateHelper sh = getStateHelper(); 
		String valuesKey = PropertyKeys.oldType.toString() + "_rowValues";
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
	 * <p>Set the value of the <code>oldZoomLevel</code> property.</p>
	 */
	public void setOldZoomLevel(java.lang.String oldZoomLevel) {
		StateHelper sh = getStateHelper(); 
		String clientId = getClientId();
		String valuesKey = PropertyKeys.oldZoomLevel.toString() + "_rowValues"; 
		Map clientValues = (Map) sh.get(valuesKey); 
		if (clientValues == null) {
			clientValues = new HashMap(); 
		}
		if (oldZoomLevel != null) clientValues.put(clientId, oldZoomLevel);
		else clientValues.remove(clientId);
		//Always re-add the delta values to the map. JSF merges the values into the main map
		//and values are not state saved unless they're in the delta map. 
		sh.put(valuesKey, clientValues);
	}

	/**
	 * <p>Return the value of the <code>oldZoomLevel</code> property.</p>
	 */
	public java.lang.String getOldZoomLevel() {
		java.lang.String retVal = null;
		StateHelper sh = getStateHelper(); 
		String valuesKey = PropertyKeys.oldZoomLevel.toString() + "_rowValues";
		Map clientValues = (Map) sh.get(valuesKey);
		if (clientValues != null) { 
			String clientId = getClientId();
			if (clientValues.containsKey( clientId ) ) { 
				retVal = (java.lang.String) clientValues.get(clientId); 
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