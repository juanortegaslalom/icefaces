package org.icefaces.ace.component.timespinner;

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

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;

import org.icefaces.ace.component.timespinner.ITimeSpinner;
import org.icefaces.ace.api.IceClientBehaviorHolder;
import java.util.Collection;
import java.util.Collections;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * TimeSpinner is an input component that provides a time input.
 */

@ResourceDependencies({
	@ResourceDependency(name="datespinner.css",library="org.icefaces.component.datespinner",target=""),
	@ResourceDependency(name="component.js",library="org.icefaces.component.util",target=""),
	@ResourceDependency(name="timespinner.js",library="org.icefaces.component.datespinner",target="")
})

public abstract class TimeSpinnerBase extends javax.faces.component.UIInput implements ITimeSpinner,IceClientBehaviorHolder{

	public static final String COMPONENT_TYPE = "org.icefaces.component.TimeSpinner";
	public static final String RENDERER_TYPE = "org.icefaces.component.TimeSpinnerRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public TimeSpinnerBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.component.TimeSpinner";
	}


	protected enum PropertyKeys {
		disabled,
		locale,
		pattern,
		readonly,
		singleSubmit,
		size,
		style,
		styleClass,
		timeZone,
		useNative,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>disabled</code> property.</p>
	 * <p>Contents: Disables this component, so it does not receive focus or get submitted.</p>
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
	 * <p>Contents: Disables this component, so it does not receive focus or get submitted. Default = 'false'.</p>
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
	 * <p>Set the value of the <code>locale</code> property.</p>
	 * <p>Contents:  The locale to be used for labels and conversion.</p>
	 */
	public void setLocale(java.lang.Object locale) {
		PropertyKeys propToUse = PropertyKeys.locale;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.locale.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), locale );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.locale.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && locale != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",locale);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.locale.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (locale == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, locale);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>locale</code> property.</p>
	 * <p>Contents:  The locale to be used for labels and conversion.</p>
	 */
	public java.lang.Object getLocale() {
		java.lang.Object retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.locale.toString() );
		if (ve != null) {
				retVal = (java.lang.Object) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.locale.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.locale.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>pattern</code> property.</p>
	 * <p>Contents: The TimeFormat pattern used for localization.</p>
	 */
	public void setPattern(java.lang.String pattern) {
		PropertyKeys propToUse = PropertyKeys.pattern;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.pattern.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), pattern );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.pattern.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && pattern != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",pattern);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.pattern.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (pattern == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, pattern);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>pattern</code> property.</p>
	 * <p>Contents: The TimeFormat pattern used for localization. Default = 'hh:mm a'.</p>
	 */
	public java.lang.String getPattern() {
		java.lang.String retVal = "hh:mm a";
		ValueExpression ve = getValueExpression( PropertyKeys.pattern.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.pattern.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.pattern.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>readonly</code> property.</p>
	 * <p>Contents: Sets this component to read only, so value cannot be changed.</p>
	 */
	public void setReadonly(boolean readonly) {
		PropertyKeys propToUse = PropertyKeys.readonly;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.readonly.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), readonly );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.readonly.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",readonly);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.readonly.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, readonly);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>readonly</code> property.</p>
	 * <p>Contents: Sets this component to read only, so value cannot be changed.</p>
	 */
	public boolean isReadonly() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.readonly.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.readonly.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.readonly.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>singleSubmit</code> property.</p>
	 * <p>Contents: When singleSubmit is "true", triggering an action on this component will submit and execute only this component only (equivalent to <f:ajax execute='@this' render='@all'> ). When singleSubmit is "false", triggering an action on this component will submit and execute the full form that this component is contained within.</p>
	 */
	public void setSingleSubmit(boolean singleSubmit) {
		PropertyKeys propToUse = PropertyKeys.singleSubmit;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.singleSubmit.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), singleSubmit );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.singleSubmit.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",singleSubmit);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.singleSubmit.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, singleSubmit);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>singleSubmit</code> property.</p>
	 * <p>Contents: When singleSubmit is "true", triggering an action on this component will submit and execute only this component only (equivalent to <f:ajax execute='@this' render='@all'> ). When singleSubmit is "false", triggering an action on this component will submit and execute the full form that this component is contained within.</p>
	 */
	public boolean isSingleSubmit() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.singleSubmit.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.singleSubmit.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.singleSubmit.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>size</code> property.</p>
	 * <p>Contents: The width, in characters, of the input text field where the value of the date resides.</p>
	 */
	public void setSize(java.lang.String size) {
		PropertyKeys propToUse = PropertyKeys.size;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.size.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), size );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.size.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && size != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",size);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.size.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (size == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, size);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>size</code> property.</p>
	 * <p>Contents: The width, in characters, of the input text field where the value of the date resides. Default = '15'.</p>
	 */
	public java.lang.String getSize() {
		java.lang.String retVal = "15";
		ValueExpression ve = getValueExpression( PropertyKeys.size.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.size.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.size.toString() + "_defaultValues";
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
	 * <p>Contents: Sets the CSS style definition to be applied to this component.</p>
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
	 * <p>Contents: Sets the CSS style definition to be applied to this component.</p>
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
	 * <p>Set the value of the <code>timeZone</code> property.</p>
	 * <p>Contents: A String or a java.util.TimeZone instance that specify the timezone used for date conversion. Defaults to TimeZone.getDefault().</p>
	 */
	public void setTimeZone(java.lang.Object timeZone) {
		PropertyKeys propToUse = PropertyKeys.timeZone;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.timeZone.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), timeZone );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.timeZone.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && timeZone != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",timeZone);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.timeZone.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (timeZone == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, timeZone);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>timeZone</code> property.</p>
	 * <p>Contents: A String or a java.util.TimeZone instance that specify the timezone used for date conversion. Defaults to TimeZone.getDefault().</p>
	 */
	public java.lang.Object getTimeZone() {
		java.lang.Object retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.timeZone.toString() );
		if (ve != null) {
				retVal = (java.lang.Object) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.timeZone.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.timeZone.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>useNative</code> property.</p>
	 * <p>Contents: Deterines if native time picker should be used when available.  Currently, native support is available for iOS5, iOS6, and BlackBerry devices.</p>
	 */
	public void setUseNative(boolean useNative) {
		PropertyKeys propToUse = PropertyKeys.useNative;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.useNative.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), useNative );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.useNative.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",useNative);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.useNative.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, useNative);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>useNative</code> property.</p>
	 * <p>Contents: Deterines if native time picker should be used when available.  Currently, native support is available for iOS5, iOS6, and BlackBerry devices. Default = 'false'.</p>
	 */
	public boolean isUseNative() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.useNative.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.useNative.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.useNative.toString() + "_defaultValues";
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
			"change"));

	private static final Map<String, String> defaultRenderMap;
	private static final Map<String, String> defaultExecuteMap;
	private static final Map<String, String> listenerArgumentMap;
	static {
		Map<String, String> drm = new HashMap<String, String>(2);
		Map<String, String> dem = new HashMap<String, String>(2);
		Map<String, String> lam = new HashMap<String, String>(2);
		drm.put("change","@this");
		dem.put("change","@all");
		lam.put("change","");
		defaultRenderMap = Collections.unmodifiableMap(drm);
		defaultExecuteMap = Collections.unmodifiableMap(dem);
		listenerArgumentMap = Collections.unmodifiableMap(lam);
	}

	public Collection<String> getEventNames() {
		return eventNames;
	}

	public String getDefaultEventName() {
		return "change";
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