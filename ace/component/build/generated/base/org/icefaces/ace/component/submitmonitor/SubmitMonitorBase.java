package org.icefaces.ace.component.submitmonitor;

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

import org.icefaces.ace.component.submitmonitor.ISubmitMonitor;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * Monitors submits to the server, and indicates the status of the submits, server and network connection, and session validity. Examples of supported submit methods are: components doing full form submits, singleSubmit(s) such as via icecore:singleSubmit, partialSubmit(s) by ice: components, f:ajax submits by h: components, ace:ajax submits by ace: components, and direct use of ICEfaces javascript submit APIs. Supports configurable text labels and image state indicators, or facets for a fully configurable UI. Optionally uses an overlay for UI blocking during submits. Can be set to monitor a portion of the page, in tandem with other submitMonitors each monitoring their own distinct portions.<p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/SubmitMonitor">SubmitMonitor Wiki Documentation</a>.
 */
@ICEResourceLibrary("icefaces.ace")
@ICEResourceDependencies({
	@ICEResourceDependency(name="util/ace-components.js",library="",target="",browser=BrowserType.ALL,browserOverride={})
})
public abstract class SubmitMonitorBase extends javax.faces.component.UIComponentBase implements ISubmitMonitor{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.SubmitMonitor";
	public static final String RENDERER_TYPE = "org.icefaces.ace.component.SubmitMonitorRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public SubmitMonitorBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.SubmitMonitor";
	}


	protected enum PropertyKeys {
		activeLabel,
		autoCenter,
		blockUI,
		For("for"),
		idleLabel,
		networkErrorLabel,
		preload,
		serverErrorLabel,
		sessionExpiredLabel,
		styleClass,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>activeLabel</code> property.</p>
	 * <p>Contents: Label to be displayed on the submitMonitor while a submit is in progress.</p>
	 */
	public void setActiveLabel(java.lang.String activeLabel) {
		PropertyKeys propToUse = PropertyKeys.activeLabel;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.activeLabel.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), activeLabel );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.activeLabel.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && activeLabel != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",activeLabel);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.activeLabel.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (activeLabel == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, activeLabel);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>activeLabel</code> property.</p>
	 * <p>Contents: Label to be displayed on the submitMonitor while a submit is in progress.</p>
	 */
	public java.lang.String getActiveLabel() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.activeLabel.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.activeLabel.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.activeLabel.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>autoCenter</code> property.</p>
	 * <p>Contents: When blockUI is enabled, and this property is true, the submitMonitor will display centered over the translucent overlay.</p>
	 */
	public void setAutoCenter(java.lang.Boolean autoCenter) {
		PropertyKeys propToUse = PropertyKeys.autoCenter;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.autoCenter.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), autoCenter );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.autoCenter.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && autoCenter != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",autoCenter);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.autoCenter.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (autoCenter == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, autoCenter);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>autoCenter</code> property.</p>
	 * <p>Contents: When blockUI is enabled, and this property is true, the submitMonitor will display centered over the translucent overlay. Default = 'true'.</p>
	 */
	public java.lang.Boolean isAutoCenter() {
		java.lang.Boolean retVal = true;
		ValueExpression ve = getValueExpression( PropertyKeys.autoCenter.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.autoCenter.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.autoCenter.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>blockUI</code> property.</p>
	 * <p>Contents: When enabled, display a translucent overlay on a portion of the window, and only show the submitMonitor UI when the connection is not idle and a submit is underway. This property specifies on what portion of the window to show the overlay: "@all" means the whole document body, "@source" means only over the component that originated the request, or a for style component search string may be given to specify a component. Finally, "@none" means to disable the overlay and have the submitMonitor UI always present where it has been placed in the page.</p>
	 */
	public void setBlockUI(java.lang.String blockUI) {
		PropertyKeys propToUse = PropertyKeys.blockUI;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.blockUI.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), blockUI );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.blockUI.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && blockUI != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",blockUI);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.blockUI.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (blockUI == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, blockUI);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>blockUI</code> property.</p>
	 * <p>Contents: When enabled, display a translucent overlay on a portion of the window, and only show the submitMonitor UI when the connection is not idle and a submit is underway. This property specifies on what portion of the window to show the overlay: "@all" means the whole document body, "@source" means only over the component that originated the request, or a for style component search string may be given to specify a component. Finally, "@none" means to disable the overlay and have the submitMonitor UI always present where it has been placed in the page. Default = '@all'.</p>
	 */
	public java.lang.String getBlockUI() {
		java.lang.String retVal = "@all";
		ValueExpression ve = getValueExpression( PropertyKeys.blockUI.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.blockUI.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.blockUI.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>for</code> property.</p>
	 * <p>Contents: Specify space separated list of components, by their for property format search strings, so that those components and, recursively, all of their children, will be monitored by this component when they act as the source for submits. When this property is empty or unspecified, this component will monitor all submits from all sources. This property allows for different submitMonitor components to co-exist on a page, and each monitor different, non-overlapping, regions of the page, and be shown with their own unique labels etc.</p>
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
	 * <p>Contents: Specify space separated list of components, by their for property format search strings, so that those components and, recursively, all of their children, will be monitored by this component when they act as the source for submits. When this property is empty or unspecified, this component will monitor all submits from all sources. This property allows for different submitMonitor components to co-exist on a page, and each monitor different, non-overlapping, regions of the page, and be shown with their own unique labels etc.</p>
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

	/**
	 * <p>Set the value of the <code>idleLabel</code> property.</p>
	 * <p>Contents: Label to be displayed on the submitMonitor when no submit is in progress. This is only shown if blockUI="@none", since with the popup cases, the submitMonitor is not shown when idle.</p>
	 */
	public void setIdleLabel(java.lang.String idleLabel) {
		PropertyKeys propToUse = PropertyKeys.idleLabel;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.idleLabel.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), idleLabel );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.idleLabel.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && idleLabel != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",idleLabel);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.idleLabel.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (idleLabel == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, idleLabel);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>idleLabel</code> property.</p>
	 * <p>Contents: Label to be displayed on the submitMonitor when no submit is in progress. This is only shown if blockUI="@none", since with the popup cases, the submitMonitor is not shown when idle.</p>
	 */
	public java.lang.String getIdleLabel() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.idleLabel.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.idleLabel.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.idleLabel.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>networkErrorLabel</code> property.</p>
	 * <p>Contents: Label to be displayed on the submitMonitor when there is a network error.</p>
	 */
	public void setNetworkErrorLabel(java.lang.String networkErrorLabel) {
		PropertyKeys propToUse = PropertyKeys.networkErrorLabel;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.networkErrorLabel.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), networkErrorLabel );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.networkErrorLabel.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && networkErrorLabel != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",networkErrorLabel);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.networkErrorLabel.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (networkErrorLabel == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, networkErrorLabel);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>networkErrorLabel</code> property.</p>
	 * <p>Contents: Label to be displayed on the submitMonitor when there is a network error.</p>
	 */
	public java.lang.String getNetworkErrorLabel() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.networkErrorLabel.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.networkErrorLabel.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.networkErrorLabel.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>preload</code> property.</p>
	 * <p>Contents: When using images to indicate a server or network error, they may need to be preloaded while the server is still accessible. This preloads theme images when facets are not used.</p>
	 */
	public void setPreload(java.lang.Boolean preload) {
		PropertyKeys propToUse = PropertyKeys.preload;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.preload.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), preload );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.preload.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && preload != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",preload);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.preload.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (preload == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, preload);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>preload</code> property.</p>
	 * <p>Contents: When using images to indicate a server or network error, they may need to be preloaded while the server is still accessible. This preloads theme images when facets are not used. Default = 'true'.</p>
	 */
	public java.lang.Boolean isPreload() {
		java.lang.Boolean retVal = true;
		ValueExpression ve = getValueExpression( PropertyKeys.preload.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.preload.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.preload.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>serverErrorLabel</code> property.</p>
	 * <p>Contents: Label to be displayed on the submitMonitor when there is a server error.</p>
	 */
	public void setServerErrorLabel(java.lang.String serverErrorLabel) {
		PropertyKeys propToUse = PropertyKeys.serverErrorLabel;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.serverErrorLabel.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), serverErrorLabel );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.serverErrorLabel.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && serverErrorLabel != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",serverErrorLabel);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.serverErrorLabel.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (serverErrorLabel == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, serverErrorLabel);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>serverErrorLabel</code> property.</p>
	 * <p>Contents: Label to be displayed on the submitMonitor when there is a server error.</p>
	 */
	public java.lang.String getServerErrorLabel() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.serverErrorLabel.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.serverErrorLabel.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.serverErrorLabel.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>sessionExpiredLabel</code> property.</p>
	 * <p>Contents: Label to be displayed on the submitMonitor when the session is expired.</p>
	 */
	public void setSessionExpiredLabel(java.lang.String sessionExpiredLabel) {
		PropertyKeys propToUse = PropertyKeys.sessionExpiredLabel;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.sessionExpiredLabel.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), sessionExpiredLabel );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.sessionExpiredLabel.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && sessionExpiredLabel != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",sessionExpiredLabel);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.sessionExpiredLabel.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (sessionExpiredLabel == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, sessionExpiredLabel);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>sessionExpiredLabel</code> property.</p>
	 * <p>Contents: Label to be displayed on the submitMonitor when the session is expired.</p>
	 */
	public java.lang.String getSessionExpiredLabel() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.sessionExpiredLabel.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.sessionExpiredLabel.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.sessionExpiredLabel.toString() + "_defaultValues";
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
	 * <p>Contents: Style class of the container element.</p>
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
	 * <p>Contents: Style class of the container element.</p>
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
	 * <p>Set the value of the <code>idle facet</code> property.</p>
	 */
	public void setIdleFacet(javax.faces.component.UIComponent idle) {
		getFacets().put("idle", idle);
	}

	/**
	 * <p>Return the value of the <code>idle facet</code> property.</p>
	 */
	public javax.faces.component.UIComponent getIdleFacet() {
		 return getFacet("idle");
	}

	/**
	 * <p>Set the value of the <code>sessionExpired facet</code> property.</p>
	 */
	public void setSessionExpiredFacet(javax.faces.component.UIComponent sessionExpired) {
		getFacets().put("sessionExpired", sessionExpired);
	}

	/**
	 * <p>Return the value of the <code>sessionExpired facet</code> property.</p>
	 */
	public javax.faces.component.UIComponent getSessionExpiredFacet() {
		 return getFacet("sessionExpired");
	}

	/**
	 * <p>Set the value of the <code>active facet</code> property.</p>
	 */
	public void setActiveFacet(javax.faces.component.UIComponent active) {
		getFacets().put("active", active);
	}

	/**
	 * <p>Return the value of the <code>active facet</code> property.</p>
	 */
	public javax.faces.component.UIComponent getActiveFacet() {
		 return getFacet("active");
	}

	/**
	 * <p>Set the value of the <code>serverError facet</code> property.</p>
	 */
	public void setServerErrorFacet(javax.faces.component.UIComponent serverError) {
		getFacets().put("serverError", serverError);
	}

	/**
	 * <p>Return the value of the <code>serverError facet</code> property.</p>
	 */
	public javax.faces.component.UIComponent getServerErrorFacet() {
		 return getFacet("serverError");
	}

	/**
	 * <p>Set the value of the <code>networkError facet</code> property.</p>
	 */
	public void setNetworkErrorFacet(javax.faces.component.UIComponent networkError) {
		getFacets().put("networkError", networkError);
	}

	/**
	 * <p>Return the value of the <code>networkError facet</code> property.</p>
	 */
	public javax.faces.component.UIComponent getNetworkErrorFacet() {
		 return getFacet("networkError");
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