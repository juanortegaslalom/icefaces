package org.icefaces.ace.component.dnd;

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

import org.icefaces.ace.component.dnd.IDroppable;
import org.icefaces.ace.api.IceClientBehaviorHolder;
import java.util.Collection;
import java.util.Collections;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * Allows a specified component to act as an area where Draggable items can be moved onto and register the event.<p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/Droppable">Droppable Wiki Documentation</a>.
 */
@ICEResourceLibrary("icefaces.ace")
@ICEResourceDependencies({
	@ICEResourceDependency(name="util/ace-components.js",library="",target="",browser=BrowserType.ALL,browserOverride={})
})
public abstract class DroppableBase extends javax.faces.component.UIComponentBase implements IDroppable,IceClientBehaviorHolder{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.Droppable";
	public static final String RENDERER_TYPE = "org.icefaces.ace.component.DroppableRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public DroppableBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.Droppable";
	}


	protected enum PropertyKeys {
		accept,
		activeStyleClass,
		datasource,
		disabled,
		dropListener,
		forValue("for"),
		hoverStyleClass,
		scope,
		tolerance,
		widgetVar,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>accept</code> property.</p>
	 * <p>Contents: JQuery selector to define the set of acceptable draggables.</p>
	 */
	public void setAccept(java.lang.String accept) {
		PropertyKeys propToUse = PropertyKeys.accept;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.accept.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), accept );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.accept.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && accept != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",accept);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.accept.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (accept == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, accept);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>accept</code> property.</p>
	 * <p>Contents: JQuery selector to define the set of acceptable draggables.</p>
	 */
	public java.lang.String getAccept() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.accept.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.accept.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.accept.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>activeStyleClass</code> property.</p>
	 * <p>Contents: Class to apply to the droppable component when an acceptable draggable is dropped.</p>
	 */
	public void setActiveStyleClass(java.lang.String activeStyleClass) {
		PropertyKeys propToUse = PropertyKeys.activeStyleClass;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.activeStyleClass.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), activeStyleClass );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.activeStyleClass.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && activeStyleClass != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",activeStyleClass);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.activeStyleClass.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (activeStyleClass == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, activeStyleClass);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>activeStyleClass</code> property.</p>
	 * <p>Contents: Class to apply to the droppable component when an acceptable draggable is dropped.</p>
	 */
	public java.lang.String getActiveStyleClass() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.activeStyleClass.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.activeStyleClass.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.activeStyleClass.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>datasource</code> property.</p>
	 * <p>Contents: Allows you to set the ID of an ACE UIData component and that will provide a Java object as input for the drop event. That object is defined by matching the sibling index of the droppable to an object at that index in the UIData component backing.</p>
	 */
	public void setDatasource(java.lang.String datasource) {
		PropertyKeys propToUse = PropertyKeys.datasource;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.datasource.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), datasource );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.datasource.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && datasource != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",datasource);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.datasource.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (datasource == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, datasource);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>datasource</code> property.</p>
	 * <p>Contents: Allows you to set the ID of an ACE UIData component and that will provide a Java object as input for the drop event. That object is defined by matching the sibling index of the droppable to an object at that index in the UIData component backing.</p>
	 */
	public java.lang.String getDatasource() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.datasource.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.datasource.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.datasource.toString() + "_defaultValues";
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
	 * <p>Contents: If enabled, no draggables will activate this droppable.</p>
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
	 * <p>Contents: If enabled, no draggables will activate this droppable.</p>
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
	 * <p>Set the value of the <code>dropListener</code> property.</p>
	 * <p>Contents: MethodExpression reference to a method called whenever a draggable is moved into this droppable. The method receives a single argument, DragDropEvent.</p>
	 */
	public void setDropListener(javax.el.MethodExpression dropListener) {
		PropertyKeys propToUse = PropertyKeys.dropListener;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.dropListener.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), dropListener );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.dropListener.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && dropListener != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",dropListener);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.dropListener.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (dropListener == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, dropListener);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>dropListener</code> property.</p>
	 * <p>Contents: MethodExpression reference to a method called whenever a draggable is moved into this droppable. The method receives a single argument, DragDropEvent.</p>
	 */
	public javax.el.MethodExpression getDropListener() {
		javax.el.MethodExpression retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.dropListener.toString() );
		if (ve != null) {
				retVal = (javax.el.MethodExpression) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.dropListener.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.dropListener.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>for</code> property.</p>
	 * <p>Contents: Id of the component to add the droppable behavior to.</p>
	 */
	public void setFor(java.lang.String forValue) {
		PropertyKeys propToUse = PropertyKeys.forValue;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.forValue.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), forValue );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.forValue.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && forValue != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",forValue);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.forValue.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (forValue == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, forValue);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>for</code> property.</p>
	 * <p>Contents: Id of the component to add the droppable behavior to.</p>
	 */
	public java.lang.String getFor() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.forValue.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.forValue.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.forValue.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>hoverStyleClass</code> property.</p>
	 * <p>Contents: Class to apply to the droppable component when an acceptable draggable is hovering.</p>
	 */
	public void setHoverStyleClass(java.lang.String hoverStyleClass) {
		PropertyKeys propToUse = PropertyKeys.hoverStyleClass;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.hoverStyleClass.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), hoverStyleClass );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.hoverStyleClass.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && hoverStyleClass != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",hoverStyleClass);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.hoverStyleClass.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (hoverStyleClass == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, hoverStyleClass);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>hoverStyleClass</code> property.</p>
	 * <p>Contents: Class to apply to the droppable component when an acceptable draggable is hovering.</p>
	 */
	public java.lang.String getHoverStyleClass() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.hoverStyleClass.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.hoverStyleClass.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.hoverStyleClass.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>scope</code> property.</p>
	 * <p>Contents: This keyword allows sets of dragabbles and droppables with the same keyword to be associated with each other exclusively.</p>
	 */
	public void setScope(java.lang.String scope) {
		PropertyKeys propToUse = PropertyKeys.scope;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.scope.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), scope );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.scope.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && scope != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",scope);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.scope.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (scope == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, scope);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>scope</code> property.</p>
	 * <p>Contents: This keyword allows sets of dragabbles and droppables with the same keyword to be associated with each other exclusively.</p>
	 */
	public java.lang.String getScope() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.scope.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.scope.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.scope.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>tolerance</code> property.</p>
	 * <p>Contents: This arbitrary keyword specifies the method of checking if a draggable is 'over' the droppable, possible values include: fit (drag must be smaller), intersect (drag must cover > 50%). pointer (cursor must be inside drop) and touch (any of the drop touches).</p>
	 */
	public void setTolerance(java.lang.String tolerance) {
		PropertyKeys propToUse = PropertyKeys.tolerance;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.tolerance.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), tolerance );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.tolerance.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && tolerance != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",tolerance);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.tolerance.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (tolerance == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, tolerance);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>tolerance</code> property.</p>
	 * <p>Contents: This arbitrary keyword specifies the method of checking if a draggable is 'over' the droppable, possible values include: fit (drag must be smaller), intersect (drag must cover > 50%). pointer (cursor must be inside drop) and touch (any of the drop touches).</p>
	 */
	public java.lang.String getTolerance() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.tolerance.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.tolerance.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.tolerance.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>widgetVar</code> property.</p>
	 * <p>Contents: The JavaScript component instance variable name.</p>
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
	 * <p>Contents: The JavaScript component instance variable name.</p>
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
			"drop"));

	private static final Map<String, String> defaultRenderMap;
	private static final Map<String, String> defaultExecuteMap;
	private static final Map<String, String> listenerArgumentMap;
	static {
		Map<String, String> drm = new HashMap<String, String>(2);
		Map<String, String> dem = new HashMap<String, String>(2);
		Map<String, String> lam = new HashMap<String, String>(2);
		drm.put("drop","@all");
		dem.put("drop","@this");
		lam.put("drop","");
		defaultRenderMap = Collections.unmodifiableMap(drm);
		defaultExecuteMap = Collections.unmodifiableMap(dem);
		listenerArgumentMap = Collections.unmodifiableMap(lam);
	}

	public Collection<String> getEventNames() {
		return eventNames;
	}

	public String getDefaultEventName() {
		return "drop";
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