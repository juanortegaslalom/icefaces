package org.icefaces.ace.component.menu;

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

import org.icefaces.ace.component.menu.IMenu;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * Menu is a navigation component with various customized modes like multi tiers, overlay and nested menus.<p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/Menu+and+Menubar">Menu Wiki Documentation</a>.
 */
@ICEResourceLibrary("icefaces.ace")
@ICEResourceDependencies({
	@ICEResourceDependency(name="util/ace-menu.js",library="",target="",browser=BrowserType.ALL,browserOverride={})
})
public abstract class MenuBase extends org.icefaces.ace.component.menu.AbstractMenu implements IMenu{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.Menu";
	public static final String RENDERER_TYPE = "org.icefaces.ace.component.MenuRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public MenuBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.component.Menu";
	}


	protected enum PropertyKeys {
		at,
		backLabel,
		effect,
		effectDuration,
		maxHeight,
		model,
		my,
		position,
		style,
		styleClass,
		tiered,
		trigger,
		triggerEvent,
		type,
		widgetVar,
		zindex,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>at</code> property.</p>
	 * <p>Contents: When position is dynamic, this attribute specifies the corner of trigger element to align with the menu. The format is "&lt;left|right&gt; &lt;top|bottom&gt;" (examples: "left top", "right bottom").</p>
	 */
	public void setAt(java.lang.String at) {
		PropertyKeys propToUse = PropertyKeys.at;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.at.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), at );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.at.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && at != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",at);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.at.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (at == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, at);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>at</code> property.</p>
	 * <p>Contents: When position is dynamic, this attribute specifies the corner of trigger element to align with the menu. The format is "&lt;left|right&gt; &lt;top|bottom&gt;" (examples: "left top", "right bottom"). Default = 'left bottom'.</p>
	 */
	public java.lang.String getAt() {
		java.lang.String retVal = "left bottom";
		ValueExpression ve = getValueExpression( PropertyKeys.at.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.at.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.at.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>backLabel</code> property.</p>
	 * <p>Contents: Label for the 'back' link (only applies to sliding menus).</p>
	 */
	public void setBackLabel(java.lang.String backLabel) {
		PropertyKeys propToUse = PropertyKeys.backLabel;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.backLabel.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), backLabel );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.backLabel.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && backLabel != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",backLabel);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.backLabel.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (backLabel == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, backLabel);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>backLabel</code> property.</p>
	 * <p>Contents: Label for the 'back' link (only applies to sliding menus). Default = 'Back'.</p>
	 */
	public java.lang.String getBackLabel() {
		java.lang.String retVal = "Back";
		ValueExpression ve = getValueExpression( PropertyKeys.backLabel.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.backLabel.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.backLabel.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>effect</code> property.</p>
	 * <p>Contents: Sets the effect for the menu display, default value is FADE. Possible values are "FADE", "SLIDE", "NONE". Use "NONE" to disable animation at all.</p>
	 */
	public void setEffect(java.lang.String effect) {
		PropertyKeys propToUse = PropertyKeys.effect;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.effect.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), effect );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.effect.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && effect != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",effect);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.effect.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (effect == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, effect);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>effect</code> property.</p>
	 * <p>Contents: Sets the effect for the menu display, default value is FADE. Possible values are "FADE", "SLIDE", "NONE". Use "NONE" to disable animation at all. Default = 'fade'.</p>
	 */
	public java.lang.String getEffect() {
		java.lang.String retVal = "fade";
		ValueExpression ve = getValueExpression( PropertyKeys.effect.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.effect.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.effect.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>effectDuration</code> property.</p>
	 * <p>Contents: Sets the effect duration in milliseconds.</p>
	 */
	public void setEffectDuration(int effectDuration) {
		PropertyKeys propToUse = PropertyKeys.effectDuration;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.effectDuration.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), effectDuration );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.effectDuration.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",effectDuration);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.effectDuration.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, effectDuration);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>effectDuration</code> property.</p>
	 * <p>Contents: Sets the effect duration in milliseconds. Default = '400'.</p>
	 */
	public int getEffectDuration() {
		java.lang.Integer retVal = 400;
		ValueExpression ve = getValueExpression( PropertyKeys.effectDuration.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Integer) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.effectDuration.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.effectDuration.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>maxHeight</code> property.</p>
	 * <p>Contents: Maximum height (in pixels) for the menu (only applies to sliding menus).</p>
	 */
	public void setMaxHeight(int maxHeight) {
		PropertyKeys propToUse = PropertyKeys.maxHeight;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.maxHeight.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), maxHeight );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.maxHeight.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",maxHeight);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.maxHeight.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, maxHeight);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>maxHeight</code> property.</p>
	 * <p>Contents: Maximum height (in pixels) for the menu (only applies to sliding menus). Default = '200'.</p>
	 */
	public int getMaxHeight() {
		java.lang.Integer retVal = 200;
		ValueExpression ve = getValueExpression( PropertyKeys.maxHeight.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Integer) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.maxHeight.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.maxHeight.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>model</code> property.</p>
	 * <p>Contents: org.icefaces.ace.model.MenuModel instance to create menus programmatically. For the menuitem and submenu components, use explicit ids, and avoid long processing in the getter method for this property, as it will be called multiple times, in every lifecycle. If using MyFaces, see wiki page for some known issues.</p>
	 */
	public void setModel(org.icefaces.ace.model.MenuModel model) {
		PropertyKeys propToUse = PropertyKeys.model;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.model.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), model );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.model.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && model != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",model);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.model.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (model == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, model);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>model</code> property.</p>
	 * <p>Contents: org.icefaces.ace.model.MenuModel instance to create menus programmatically. For the menuitem and submenu components, use explicit ids, and avoid long processing in the getter method for this property, as it will be called multiple times, in every lifecycle. If using MyFaces, see wiki page for some known issues.</p>
	 */
	public org.icefaces.ace.model.MenuModel getModel() {
		org.icefaces.ace.model.MenuModel retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.model.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.model.MenuModel) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.model.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.model.MenuModel) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.model.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.model.MenuModel) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>my</code> property.</p>
	 * <p>Contents: When position is dynamic, this attribute specifies the corner of the menu to align with the trigger element. The format is "&lt;left|right&gt; &lt;top|bottom&gt;" (examples: "left top", "right bottom").</p>
	 */
	public void setMy(java.lang.String my) {
		PropertyKeys propToUse = PropertyKeys.my;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.my.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), my );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.my.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && my != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",my);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.my.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (my == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, my);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>my</code> property.</p>
	 * <p>Contents: When position is dynamic, this attribute specifies the corner of the menu to align with the trigger element. The format is "&lt;left|right&gt; &lt;top|bottom&gt;" (examples: "left top", "right bottom"). Default = 'left top'.</p>
	 */
	public java.lang.String getMy() {
		java.lang.String retVal = "left top";
		ValueExpression ve = getValueExpression( PropertyKeys.my.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.my.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.my.toString() + "_defaultValues";
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
	 * <p>Contents: Sets the way the menu is placed on the page. When "static", the menu is displayed in the normal flow. When set to "dynamic", the menu is only displayed near the trigger component when the triggerEvent occurs. For the latter case, it is required to specify a trigger component.</p>
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
	 * <p>Contents: Sets the way the menu is placed on the page. When "static", the menu is displayed in the normal flow. When set to "dynamic", the menu is only displayed near the trigger component when the triggerEvent occurs. For the latter case, it is required to specify a trigger component. Default = 'static'.</p>
	 */
	public java.lang.String getPosition() {
		java.lang.String retVal = "static";
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

	/**
	 * <p>Set the value of the <code>style</code> property.</p>
	 * <p>Contents: Style of the main container element.</p>
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
	 * <p>Contents: Style of the main container element.</p>
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
	 * <p>Contents: Style class of the main container element.</p>
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
	 * <p>Contents: Style class of the main container element.</p>
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
	 * <p>Set the value of the <code>tiered</code> property.</p>
	 * <p>Contents: Sets the tiered mode, when set to true menu will be rendered in different tiers.</p>
	 */
	public void setTiered(boolean tiered) {
		PropertyKeys propToUse = PropertyKeys.tiered;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.tiered.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), tiered );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.tiered.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",tiered);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.tiered.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, tiered);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>tiered</code> property.</p>
	 * <p>Contents: Sets the tiered mode, when set to true menu will be rendered in different tiers.</p>
	 */
	public boolean isTiered() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.tiered.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Boolean) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.tiered.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.tiered.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>trigger</code> property.</p>
	 * <p>Contents: Server-side id of the component that will trigger the dynamic menu when the triggerEvent occurs. Used when position is dynamic. It is also possible to specify a client-side id of a plain HTML element on the page.</p>
	 */
	public void setTrigger(java.lang.String trigger) {
		PropertyKeys propToUse = PropertyKeys.trigger;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.trigger.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), trigger );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.trigger.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && trigger != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",trigger);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.trigger.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (trigger == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, trigger);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>trigger</code> property.</p>
	 * <p>Contents: Server-side id of the component that will trigger the dynamic menu when the triggerEvent occurs. Used when position is dynamic. It is also possible to specify a client-side id of a plain HTML element on the page.</p>
	 */
	public java.lang.String getTrigger() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.trigger.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.trigger.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.trigger.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>triggerEvent</code> property.</p>
	 * <p>Contents: Event that will trigger the menu to show, when position is dynamic. The possible values are "click", "mouseenter", "dblclick", and "rtclick".</p>
	 */
	public void setTriggerEvent(java.lang.String triggerEvent) {
		PropertyKeys propToUse = PropertyKeys.triggerEvent;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.triggerEvent.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), triggerEvent );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.triggerEvent.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && triggerEvent != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",triggerEvent);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.triggerEvent.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (triggerEvent == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, triggerEvent);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>triggerEvent</code> property.</p>
	 * <p>Contents: Event that will trigger the menu to show, when position is dynamic. The possible values are "click", "mouseenter", "dblclick", and "rtclick". Default = 'click'.</p>
	 */
	public java.lang.String getTriggerEvent() {
		java.lang.String retVal = "click";
		ValueExpression ve = getValueExpression( PropertyKeys.triggerEvent.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.triggerEvent.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.triggerEvent.toString() + "_defaultValues";
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
	 * <p>Contents: Type of menu, valid values are "plain", "tiered" and "sliding".</p>
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
	 * <p>Contents: Type of menu, valid values are "plain", "tiered" and "sliding". Default = 'plain'.</p>
	 */
	public java.lang.String getType() {
		java.lang.String retVal = "plain";
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
	 * <p>Set the value of the <code>widgetVar</code> property.</p>
	 * <p>Contents: Javascript variable name of the wrapped widget.</p>
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
	 * <p>Contents: Javascript variable name of the wrapped widget.</p>
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

	/**
	 * <p>Set the value of the <code>zindex</code> property.</p>
	 * <p>Contents: zindex property to control overlapping with other elements.</p>
	 */
	public void setZindex(int zindex) {
		PropertyKeys propToUse = PropertyKeys.zindex;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.zindex.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), zindex );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.zindex.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",zindex);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.zindex.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				clientValues.put(clientId, zindex);
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>zindex</code> property.</p>
	 * <p>Contents: zindex property to control overlapping with other elements. Default = '1'.</p>
	 */
	public int getZindex() {
		java.lang.Integer retVal = 1;
		ValueExpression ve = getValueExpression( PropertyKeys.zindex.toString() );
		if (ve != null) {
			Object o = ve.getValue( getFacesContext().getELContext() );
			if (o != null) { 
				retVal = (java.lang.Integer) o; 
			}
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.zindex.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.zindex.toString() + "_defaultValues";
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