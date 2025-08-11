package org.icefaces.ace.component.roweditor;

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

import org.icefaces.ace.component.roweditor.IRowEditor;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * <p>Renders a set of controls that reveal, submit and hide the hidden input facet of a  ace:cellEditor.</p><p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/RowEditor">Row Editor Wiki Documentation</a>.</p>
 */
public abstract class RowEditorBase extends javax.faces.component.UIComponentBase implements IRowEditor{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.RowEditor";
	public static final String RENDERER_TYPE = "org.icefaces.ace.component.RowEditorRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public RowEditorBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.RowEditor";
	}


	protected enum PropertyKeys {
		cancelTitle,
		rowEditCancelListener,
		rowEditListener,
		startTitle,
		submitTitle,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>cancelTitle</code> property.</p>
	 * <p>Contents: Define a String title attribute for the cancel editing button. This will be shown as a browser tooltip when hovering over the icon. The default for this tooltip is definedin the ace messages bundle for easy i18n.</p>
	 */
	public void setCancelTitle(java.lang.String cancelTitle) {
		PropertyKeys propToUse = PropertyKeys.cancelTitle;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.cancelTitle.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), cancelTitle );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.cancelTitle.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && cancelTitle != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",cancelTitle);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.cancelTitle.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (cancelTitle == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, cancelTitle);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>cancelTitle</code> property.</p>
	 * <p>Contents: Define a String title attribute for the cancel editing button. This will be shown as a browser tooltip when hovering over the icon. The default for this tooltip is definedin the ace messages bundle for easy i18n.</p>
	 */
	public java.lang.String getCancelTitle() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.cancelTitle.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.cancelTitle.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.cancelTitle.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>rowEditCancelListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a table row editing is canceled. The method receives a single argument, RowEditCancelEvent.</p>
	 */
	public void setRowEditCancelListener(javax.el.MethodExpression rowEditCancelListener) {
		PropertyKeys propToUse = PropertyKeys.rowEditCancelListener;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.rowEditCancelListener.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), rowEditCancelListener );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.rowEditCancelListener.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && rowEditCancelListener != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",rowEditCancelListener);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.rowEditCancelListener.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (rowEditCancelListener == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, rowEditCancelListener);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>rowEditCancelListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a table row editing is canceled. The method receives a single argument, RowEditCancelEvent.</p>
	 */
	public javax.el.MethodExpression getRowEditCancelListener() {
		javax.el.MethodExpression retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.rowEditCancelListener.toString() );
		if (ve != null) {
				retVal = (javax.el.MethodExpression) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.rowEditCancelListener.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.rowEditCancelListener.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>rowEditListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a table row is edited. The method receives a single argument, RowEditEvent.</p>
	 */
	public void setRowEditListener(javax.el.MethodExpression rowEditListener) {
		PropertyKeys propToUse = PropertyKeys.rowEditListener;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.rowEditListener.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), rowEditListener );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.rowEditListener.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && rowEditListener != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",rowEditListener);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.rowEditListener.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (rowEditListener == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, rowEditListener);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>rowEditListener</code> property.</p>
	 * <p>Contents: MethodExpression reference called whenever a table row is edited. The method receives a single argument, RowEditEvent.</p>
	 */
	public javax.el.MethodExpression getRowEditListener() {
		javax.el.MethodExpression retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.rowEditListener.toString() );
		if (ve != null) {
				retVal = (javax.el.MethodExpression) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.rowEditListener.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.rowEditListener.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>startTitle</code> property.</p>
	 * <p>Contents: Define a String title attribute for the begin editing button. This will be shown as a browser tooltip when hovering over the icon. The default for this tooltip is definedin the ace messages bundle for easy i18n.</p>
	 */
	public void setStartTitle(java.lang.String startTitle) {
		PropertyKeys propToUse = PropertyKeys.startTitle;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.startTitle.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), startTitle );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.startTitle.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && startTitle != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",startTitle);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.startTitle.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (startTitle == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, startTitle);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>startTitle</code> property.</p>
	 * <p>Contents: Define a String title attribute for the begin editing button. This will be shown as a browser tooltip when hovering over the icon. The default for this tooltip is definedin the ace messages bundle for easy i18n.</p>
	 */
	public java.lang.String getStartTitle() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.startTitle.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.startTitle.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.startTitle.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>submitTitle</code> property.</p>
	 * <p>Contents: Define a String title attribute for the finish editing row button. This will be shown as a browser tooltip when hovering over the icon. The default for this tooltip is definedin the ace messages bundle for easy i18n.</p>
	 */
	public void setSubmitTitle(java.lang.String submitTitle) {
		PropertyKeys propToUse = PropertyKeys.submitTitle;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.submitTitle.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), submitTitle );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.submitTitle.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && submitTitle != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",submitTitle);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.submitTitle.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (submitTitle == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, submitTitle);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>submitTitle</code> property.</p>
	 * <p>Contents: Define a String title attribute for the finish editing row button. This will be shown as a browser tooltip when hovering over the icon. The default for this tooltip is definedin the ace messages bundle for easy i18n.</p>
	 */
	public java.lang.String getSubmitTitle() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.submitTitle.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.submitTitle.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.submitTitle.toString() + "_defaultValues";
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