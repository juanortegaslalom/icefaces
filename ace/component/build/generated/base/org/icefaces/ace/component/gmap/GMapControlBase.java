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

import org.icefaces.ace.component.gmap.IGMapControl;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * The ace:gMapControl component serves as an easy interface to modify the position, style and rendered state of the controls that appear on the ace:gMap that this tag is nested within. For more information, see the <a href="http://wiki.icefaces.org/display/ICE/GMap">gMap</a> Wiki Documentation.
 */
@ICEResourceLibrary("icefaces.ace")
@ICEResourceDependencies({
	@ICEResourceDependency(name="util/ace-components.js",library="",target="",browser=BrowserType.ALL,browserOverride={})
})
public abstract class GMapControlBase extends javax.faces.component.UIPanel implements IGMapControl{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.GMapControl";
	public static final String RENDERER_TYPE = "org.icefaces.ace.component.GMapControlRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public GMapControlBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.component";
	}


	protected enum PropertyKeys {
		controlStyle,
		disabled,
		name,
		position,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>controlStyle</code> property.</p>
	 * <p>Contents: The style that will be used on the control. Will only affect Zoom and Type controls. Type style options are: 'default', 'dropdown' and 'bar'. Zoom style options are 'default', 'large' and 'small'. </p>
	 */
	public void setControlStyle(java.lang.String controlStyle) {
		PropertyKeys propToUse = PropertyKeys.controlStyle;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.controlStyle.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), controlStyle );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.controlStyle.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && controlStyle != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",controlStyle);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.controlStyle.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (controlStyle == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, controlStyle);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>controlStyle</code> property.</p>
	 * <p>Contents: The style that will be used on the control. Will only affect Zoom and Type controls. Type style options are: 'default', 'dropdown' and 'bar'. Zoom style options are 'default', 'large' and 'small'.  Default = 'none'.</p>
	 */
	public java.lang.String getControlStyle() {
		java.lang.String retVal = "none";
		ValueExpression ve = getValueExpression( PropertyKeys.controlStyle.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.controlStyle.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.controlStyle.toString() + "_defaultValues";
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
	 * <p>Contents: Choose whether or not to display the chosen map control.</p>
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
	 * <p>Contents: Choose whether or not to display the chosen map control. Default = 'false'.</p>
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
	 * <p>Set the value of the <code>name</code> property.</p>
	 * <p>Contents: The name of the control to affect. Valid entries are: 'all', 'type', 'overview', 'pan', 'rotate', 'scale', 'streetView' and 'zoom'.</p>
	 */
	public void setName(java.lang.String name) {
		PropertyKeys propToUse = PropertyKeys.name;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.name.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), name );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.name.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && name != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",name);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.name.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (name == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, name);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>name</code> property.</p>
	 * <p>Contents: The name of the control to affect. Valid entries are: 'all', 'type', 'overview', 'pan', 'rotate', 'scale', 'streetView' and 'zoom'.</p>
	 */
	public java.lang.String getName() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.name.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.name.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.name.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>position</code> property.</p>
	 * <p>Contents: The location for the chosen control to display. Valid entries are 'bottomCenter', 'bottomLeft', 'bottomRight', 'leftBottom', 'leftCenter', 'leftTop', 'rightBottom', 'rightCenter', 'rightTop', 'topCenter', 'topLeft' and 'topRight'.</p>
	 */
	public void setPosition(java.lang.String position) {
		PropertyKeys propToUse = PropertyKeys.position;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.position.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), position );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.position.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && position != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",position);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.position.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (position == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, position);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>position</code> property.</p>
	 * <p>Contents: The location for the chosen control to display. Valid entries are 'bottomCenter', 'bottomLeft', 'bottomRight', 'leftBottom', 'leftCenter', 'leftTop', 'rightBottom', 'rightCenter', 'rightTop', 'topCenter', 'topLeft' and 'topRight'. Default = 'none'.</p>
	 */
	public java.lang.String getPosition() {
		java.lang.String retVal = "none";
		ValueExpression ve = getValueExpression( PropertyKeys.position.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.position.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.position.toString() + "_defaultValues";
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