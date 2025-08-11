package org.icefaces.ace.component.textareaentry;

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

import org.icefaces.ace.component.textareaentry.ITextAreaEntry;
import org.icefaces.ace.api.IceClientBehaviorHolder;
import java.util.Collection;
import java.util.Collections;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * TextAreaEntry is a text area input component that can display some placeholder text inside the text area when the component doesn't have a value and is not focussed. It also has custom styling for invalid state and required status.<p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/TextAreaEntry">TextAreaEntry Wiki Documentation</a>.
 */
@ICEResourceLibrary("icefaces.ace")
@ICEResourceDependencies({
	@ICEResourceDependency(name="util/ace-components.js",library="",target="",browser=BrowserType.ALL,browserOverride={})
})
public abstract class TextAreaEntryBase extends javax.faces.component.html.HtmlInputTextarea implements ITextAreaEntry,IceClientBehaviorHolder{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.TextAreaEntry";
	public static final String RENDERER_TYPE = "org.icefaces.ace.component.TextAreaEntryRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public TextAreaEntryBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.TextAreaEntry";
	}


	protected enum PropertyKeys {
		indicatorPosition,
		labelPosition,
		maxlength,
		optionalIndicator,
		placeholder,
		requiredIndicator,
		resizable,
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
	 * <p>Set the value of the <code>indicatorPosition</code> property.</p>
	 * <p>Contents: Position of input-required or input-optional indicator relative to input field or label. Supported values are "left/right/top/bottom/labelLeft/labelRight/none". Default is "labelRight" if labelPosition is "inField", "right" otherwise.</p>
	 */
	public void setIndicatorPosition(java.lang.String indicatorPosition) {
		PropertyKeys propToUse = PropertyKeys.indicatorPosition;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.indicatorPosition.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), indicatorPosition );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.indicatorPosition.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && indicatorPosition != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",indicatorPosition);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.indicatorPosition.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (indicatorPosition == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, indicatorPosition);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>indicatorPosition</code> property.</p>
	 * <p>Contents: Position of input-required or input-optional indicator relative to input field or label. Supported values are "left/right/top/bottom/labelLeft/labelRight/none". Default is "labelRight" if labelPosition is "inField", "right" otherwise.</p>
	 */
	public java.lang.String getIndicatorPosition() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.indicatorPosition.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.indicatorPosition.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.indicatorPosition.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>labelPosition</code> property.</p>
	 * <p>Contents: Position of label relative to input field. Supported values are "left/right/top/bottom/inField/none". Default is "none".</p>
	 */
	public void setLabelPosition(java.lang.String labelPosition) {
		PropertyKeys propToUse = PropertyKeys.labelPosition;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.labelPosition.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), labelPosition );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.labelPosition.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && labelPosition != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",labelPosition);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.labelPosition.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (labelPosition == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, labelPosition);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>labelPosition</code> property.</p>
	 * <p>Contents: Position of label relative to input field. Supported values are "left/right/top/bottom/inField/none". Default is "none".</p>
	 */
	public java.lang.String getLabelPosition() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.labelPosition.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.labelPosition.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.labelPosition.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>maxlength</code> property.</p>
	 * <p>Contents: The maximum number of characters that may be entered in this field.</p>
	 */
	public void setMaxlength(int maxlength) {
		PropertyKeys propToUse = PropertyKeys.maxlength;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.maxlength.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), maxlength );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.maxlength.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",maxlength);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.maxlength.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, maxlength);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>maxlength</code> property.</p>
	 * <p>Contents: The maximum number of characters that may be entered in this field.</p>
	 */
	public int getMaxlength() {
		java.lang.Integer retVal = 0;
		ValueExpression ve = getValueExpression( PropertyKeys.maxlength.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Integer) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.maxlength.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.maxlength.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>optionalIndicator</code> property.</p>
	 * <p>Contents: Indicator indicating that the user is NOT required to provide a submitted value for this input component.</p>
	 */
	public void setOptionalIndicator(java.lang.String optionalIndicator) {
		PropertyKeys propToUse = PropertyKeys.optionalIndicator;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.optionalIndicator.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), optionalIndicator );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.optionalIndicator.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && optionalIndicator != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",optionalIndicator);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.optionalIndicator.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (optionalIndicator == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, optionalIndicator);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>optionalIndicator</code> property.</p>
	 * <p>Contents: Indicator indicating that the user is NOT required to provide a submitted value for this input component.</p>
	 */
	public java.lang.String getOptionalIndicator() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.optionalIndicator.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.optionalIndicator.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.optionalIndicator.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>placeholder</code> property.</p>
	 * <p>Contents: The HTML5 placeholder attribute represents a short hint (a word or short phrase) intended to aid the user with data entry when the input element has no value. If the placeholder attribute is not supported by the browser, the label 'inField' functionality will be used instead.</p>
	 */
	public void setPlaceholder(java.lang.String placeholder) {
		PropertyKeys propToUse = PropertyKeys.placeholder;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.placeholder.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), placeholder );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.placeholder.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && placeholder != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",placeholder);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.placeholder.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (placeholder == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, placeholder);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>placeholder</code> property.</p>
	 * <p>Contents: The HTML5 placeholder attribute represents a short hint (a word or short phrase) intended to aid the user with data entry when the input element has no value. If the placeholder attribute is not supported by the browser, the label 'inField' functionality will be used instead.</p>
	 */
	public java.lang.String getPlaceholder() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.placeholder.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.placeholder.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.placeholder.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>requiredIndicator</code> property.</p>
	 * <p>Contents: Indicator indicating that the user is required to provide a submitted value for this input component.</p>
	 */
	public void setRequiredIndicator(java.lang.String requiredIndicator) {
		PropertyKeys propToUse = PropertyKeys.requiredIndicator;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.requiredIndicator.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), requiredIndicator );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.requiredIndicator.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && requiredIndicator != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",requiredIndicator);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.requiredIndicator.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (requiredIndicator == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, requiredIndicator);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>requiredIndicator</code> property.</p>
	 * <p>Contents: Indicator indicating that the user is required to provide a submitted value for this input component.</p>
	 */
	public java.lang.String getRequiredIndicator() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.requiredIndicator.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.requiredIndicator.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.requiredIndicator.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>resizable</code> property.</p>
	 * <p>Contents: Make the text area resizable via dragging the bottom right corner. Works only if browser supports CSS3 resize property.</p>
	 */
	public void setResizable(boolean resizable) {
		PropertyKeys propToUse = PropertyKeys.resizable;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.resizable.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), resizable );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.resizable.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",resizable);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.resizable.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, resizable);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>resizable</code> property.</p>
	 * <p>Contents: Make the text area resizable via dragging the bottom right corner. Works only if browser supports CSS3 resize property. Default = 'true'.</p>
	 */
	public boolean isResizable() {
		java.lang.Boolean retVal = true;
		ValueExpression ve = getValueExpression( PropertyKeys.resizable.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.resizable.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.resizable.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>widgetVar</code> property.</p>
	 * <p>Contents: Name of the widget variable to access client-side API.</p>
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
	 * <p>Contents: Name of the widget variable to access client-side API.</p>
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
			"blur"));

	private static final Map<String, String> defaultRenderMap;
	private static final Map<String, String> defaultExecuteMap;
	private static final Map<String, String> listenerArgumentMap;
	static {
		Map<String, String> drm = new HashMap<String, String>(2);
		Map<String, String> dem = new HashMap<String, String>(2);
		Map<String, String> lam = new HashMap<String, String>(2);
		drm.put("blur","@all");
		dem.put("blur","@this");
		lam.put("blur","");
		defaultRenderMap = Collections.unmodifiableMap(drm);
		defaultExecuteMap = Collections.unmodifiableMap(dem);
		listenerArgumentMap = Collections.unmodifiableMap(lam);
	}

	public Collection<String> getEventNames() {
		return eventNames;
	}

	public String getDefaultEventName() {
		return "blur";
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