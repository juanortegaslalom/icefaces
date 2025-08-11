package org.icefaces.ace.component.tree;

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

import org.icefaces.ace.component.tree.ITree;
import org.icefaces.ace.api.IceClientBehaviorHolder;
import java.util.Collection;
import java.util.Collections;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * Renders a hierarchical structure of ace:node contents. Supports client-side and server-side node selection and expansion. Other features available include: user reordering of nodes, multiple selection and lazy node state initialization.<p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/Tree">Tree Wiki Documentation</a>.</p>
 */
@ICEResourceLibrary("icefaces.ace")
@ICEResourceDependencies({
	@ICEResourceDependency(name="util/ace-components.js",library="",target="",browser=BrowserType.ALL,browserOverride={})
})
public abstract class TreeBase extends javax.faces.component.UIData implements ITree,IceClientBehaviorHolder{

	public static final String COMPONENT_TYPE = "org.icefaces.ace.component.Tree";
	public static final String RENDERER_TYPE = "org.icefaces.ace.component.TreeRenderer";

	private EnumSet<PropertyKeys> setOfUsedProperties = EnumSet.noneOf(PropertyKeys.class);

	public TreeBase() {
		super();
		setRendererType(RENDERER_TYPE);
	}

	public String getFamily() {
		return "org.icefaces.ace.Tree";
	}


	protected enum PropertyKeys {
		dragHandle,
		expansion,
		expansionMode,
		keyConverter,
		reordering,
		selectMultiple,
		selection,
		selectionMode,
		stateCreationCallback,
		stateMap,
		stateVar,
		type,
		;
		String toString;
		PropertyKeys(String toString) { this.toString = toString; }
		PropertyKeys() { }
		public String toString() {
			return ((toString != null) ? toString : name());
		}
	}

	/**
	 * <p>Set the value of the <code>dragHandle</code> property.</p>
	 * <p>Contents: Specifies the jQuery selector(s) of the elements inside the node container that will be used as the drag handle(s). If this attribute isn't specified, any point of the node container can initiate the dragging action. The selectors are relative to the node's root element. When using multiple selectors, separate them by commas. The handles apply to all nodes defined in the tree.</p>
	 */
	public void setDragHandle(java.lang.String dragHandle) {
		PropertyKeys propToUse = PropertyKeys.dragHandle;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.dragHandle.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), dragHandle );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.dragHandle.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && dragHandle != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",dragHandle);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.dragHandle.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (dragHandle == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, dragHandle);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>dragHandle</code> property.</p>
	 * <p>Contents: Specifies the jQuery selector(s) of the elements inside the node container that will be used as the drag handle(s). If this attribute isn't specified, any point of the node container can initiate the dragging action. The selectors are relative to the node's root element. When using multiple selectors, separate them by commas. The handles apply to all nodes defined in the tree.</p>
	 */
	public java.lang.String getDragHandle() {
		java.lang.String retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.dragHandle.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.dragHandle.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.dragHandle.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>expansion</code> property.</p>
	 * <p>Contents: Enable expansion feature of this tree component. This toggles this feature for the entire tree, per-node configuration of this feature available via the NodeState.</p>
	 */
	public void setExpansion(java.lang.Boolean expansion) {
		PropertyKeys propToUse = PropertyKeys.expansion;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.expansion.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), expansion );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.expansion.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && expansion != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",expansion);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.expansion.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (expansion == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, expansion);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>expansion</code> property.</p>
	 * <p>Contents: Enable expansion feature of this tree component. This toggles this feature for the entire tree, per-node configuration of this feature available via the NodeState. Default = 'false'.</p>
	 */
	public java.lang.Boolean isExpansion() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.expansion.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.expansion.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.expansion.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>expansionMode</code> property.</p>
	 * <p>Contents: Select the request behaviour of the expansion feature. When 'client', the children of every node are pre-rendered in the DOM and exposed by JavaScript when nodes are expanded. In the default 'server' mode, only visible nodes are inthe DOM and expansion and contraction are caused by ajax page updates.</p>
	 */
	public void setExpansionMode(org.icefaces.ace.component.tree.TreeExpansionMode expansionMode) {
		PropertyKeys propToUse = PropertyKeys.expansionMode;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.expansionMode.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), expansionMode );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.expansionMode.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && expansionMode != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",expansionMode);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.expansionMode.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (expansionMode == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, expansionMode);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>expansionMode</code> property.</p>
	 * <p>Contents: Select the request behaviour of the expansion feature. When 'client', the children of every node are pre-rendered in the DOM and exposed by JavaScript when nodes are expanded. In the default 'server' mode, only visible nodes are inthe DOM and expansion and contraction are caused by ajax page updates. Default = 'org.icefaces.ace.component.tree.TreeExpansionMode.server'.</p>
	 */
	public org.icefaces.ace.component.tree.TreeExpansionMode getExpansionMode() {
		org.icefaces.ace.component.tree.TreeExpansionMode retVal = org.icefaces.ace.component.tree.TreeExpansionMode.server;
		ValueExpression ve = getValueExpression( PropertyKeys.expansionMode.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.component.tree.TreeExpansionMode) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.expansionMode.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.component.tree.TreeExpansionMode) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.expansionMode.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.component.tree.TreeExpansionMode) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>keyConverter</code> property.</p>
	 * <p>Contents: Optionally define a custom KeySegmentConverter object to produce segmented identifier keys for nodes based on something other than indexes.</p>
	 */
	public void setKeyConverter(org.icefaces.ace.model.tree.KeySegmentConverter keyConverter) {
		PropertyKeys propToUse = PropertyKeys.keyConverter;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.keyConverter.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), keyConverter );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.keyConverter.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && keyConverter != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",keyConverter);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.keyConverter.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (keyConverter == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, keyConverter);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>keyConverter</code> property.</p>
	 * <p>Contents: Optionally define a custom KeySegmentConverter object to produce segmented identifier keys for nodes based on something other than indexes.</p>
	 */
	public org.icefaces.ace.model.tree.KeySegmentConverter getKeyConverter() {
		org.icefaces.ace.model.tree.KeySegmentConverter retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.keyConverter.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.model.tree.KeySegmentConverter) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.keyConverter.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.model.tree.KeySegmentConverter) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.keyConverter.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.model.tree.KeySegmentConverter) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>reordering</code> property.</p>
	 * <p>Contents: Enable reordering of the nodes of this tree.</p>
	 */
	public void setReordering(java.lang.Boolean reordering) {
		PropertyKeys propToUse = PropertyKeys.reordering;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.reordering.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), reordering );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.reordering.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && reordering != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",reordering);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.reordering.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (reordering == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, reordering);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>reordering</code> property.</p>
	 * <p>Contents: Enable reordering of the nodes of this tree. Default = 'false'.</p>
	 */
	public java.lang.Boolean isReordering() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.reordering.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.reordering.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.reordering.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>selectMultiple</code> property.</p>
	 * <p>Contents: Disable the selection of multiple nodes simultaneously.</p>
	 */
	public void setSelectMultiple(java.lang.Boolean selectMultiple) {
		PropertyKeys propToUse = PropertyKeys.selectMultiple;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.selectMultiple.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), selectMultiple );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.selectMultiple.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && selectMultiple != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",selectMultiple);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.selectMultiple.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (selectMultiple == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, selectMultiple);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>selectMultiple</code> property.</p>
	 * <p>Contents: Disable the selection of multiple nodes simultaneously. Default = 'true'.</p>
	 */
	public java.lang.Boolean isSelectMultiple() {
		java.lang.Boolean retVal = true;
		ValueExpression ve = getValueExpression( PropertyKeys.selectMultiple.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.selectMultiple.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.selectMultiple.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>selection</code> property.</p>
	 * <p>Contents: Enable selection feature of this tree component. This toggles this feature for the entire tree, per-node configuration of this feature available via the NodeState.</p>
	 */
	public void setSelection(java.lang.Boolean selection) {
		PropertyKeys propToUse = PropertyKeys.selection;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.selection.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), selection );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.selection.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && selection != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",selection);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.selection.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (selection == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, selection);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>selection</code> property.</p>
	 * <p>Contents: Enable selection feature of this tree component. This toggles this feature for the entire tree, per-node configuration of this feature available via the NodeState. Default = 'false'.</p>
	 */
	public java.lang.Boolean isSelection() {
		java.lang.Boolean retVal = false;
		ValueExpression ve = getValueExpression( PropertyKeys.selection.toString() );
		if (ve != null) {
				retVal = (java.lang.Boolean) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.selection.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.selection.toString() + "_defaultValues";
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
	 * <p>Set the value of the <code>selectionMode</code> property.</p>
	 * <p>Contents: Select the request behaviour of the selection feature. When 'client', the (de)selection of a node is recorded on the client, and communicated to the server on the next request executing this component. In the default 'server' mode, when a node is (de)selected, the component communicates the change the server immediately with an ajax update.</p>
	 */
	public void setSelectionMode(org.icefaces.ace.component.tree.TreeSelectionMode selectionMode) {
		PropertyKeys propToUse = PropertyKeys.selectionMode;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.selectionMode.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), selectionMode );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.selectionMode.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && selectionMode != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",selectionMode);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.selectionMode.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (selectionMode == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, selectionMode);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>selectionMode</code> property.</p>
	 * <p>Contents: Select the request behaviour of the selection feature. When 'client', the (de)selection of a node is recorded on the client, and communicated to the server on the next request executing this component. In the default 'server' mode, when a node is (de)selected, the component communicates the change the server immediately with an ajax update. Default = 'org.icefaces.ace.component.tree.TreeSelectionMode.server'.</p>
	 */
	public org.icefaces.ace.component.tree.TreeSelectionMode getSelectionMode() {
		org.icefaces.ace.component.tree.TreeSelectionMode retVal = org.icefaces.ace.component.tree.TreeSelectionMode.server;
		ValueExpression ve = getValueExpression( PropertyKeys.selectionMode.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.component.tree.TreeSelectionMode) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.selectionMode.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.component.tree.TreeSelectionMode) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.selectionMode.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.component.tree.TreeSelectionMode) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>stateCreationCallback</code> property.</p>
	 * <p>Contents: Bind an implementer of the NodeStateCreationCallback interface to take as input, a node object and a default NodeState and return a NodeState configured with the state appropriatefor the given node object.</p>
	 */
	public void setStateCreationCallback(org.icefaces.ace.model.tree.NodeStateCreationCallback stateCreationCallback) {
		PropertyKeys propToUse = PropertyKeys.stateCreationCallback;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.stateCreationCallback.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), stateCreationCallback );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.stateCreationCallback.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && stateCreationCallback != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",stateCreationCallback);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.stateCreationCallback.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (stateCreationCallback == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, stateCreationCallback);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>stateCreationCallback</code> property.</p>
	 * <p>Contents: Bind an implementer of the NodeStateCreationCallback interface to take as input, a node object and a default NodeState and return a NodeState configured with the state appropriatefor the given node object.</p>
	 */
	public org.icefaces.ace.model.tree.NodeStateCreationCallback getStateCreationCallback() {
		org.icefaces.ace.model.tree.NodeStateCreationCallback retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.stateCreationCallback.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.model.tree.NodeStateCreationCallback) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.stateCreationCallback.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.model.tree.NodeStateCreationCallback) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.stateCreationCallback.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.model.tree.NodeStateCreationCallback) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>stateMap</code> property.</p>
	 * <p>Contents: Define a NodeStateMap ValueExpression to access the store of Tree node object state information. The state map provides an API for looking up the state of a particular node object, as well as reverse look-ups to get node objects with a particular state.</p>
	 */
	public void setStateMap(org.icefaces.ace.model.tree.NodeStateMap stateMap) {
		PropertyKeys propToUse = PropertyKeys.stateMap;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.stateMap.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), stateMap );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.stateMap.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && stateMap != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",stateMap);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.stateMap.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (stateMap == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, stateMap);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>stateMap</code> property.</p>
	 * <p>Contents: Define a NodeStateMap ValueExpression to access the store of Tree node object state information. The state map provides an API for looking up the state of a particular node object, as well as reverse look-ups to get node objects with a particular state.</p>
	 */
	public org.icefaces.ace.model.tree.NodeStateMap getStateMap() {
		org.icefaces.ace.model.tree.NodeStateMap retVal = null;
		ValueExpression ve = getValueExpression( PropertyKeys.stateMap.toString() );
		if (ve != null) {
				retVal = (org.icefaces.ace.model.tree.NodeStateMap) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.stateMap.toString() + "_rowValues";
			Map clientValues = (Map) sh.get(valuesKey);
			boolean mapNoValue = false;
			if (clientValues != null) { 
				String clientId = getClientId();
				if (clientValues.containsKey( clientId ) ) { 
					retVal = (org.icefaces.ace.model.tree.NodeStateMap) clientValues.get(clientId); 
				} else { 
					mapNoValue=true;
				}
			}
			if (mapNoValue || clientValues == null ) { 
				String defaultKey = PropertyKeys.stateMap.toString() + "_defaultValues";
				Map defaultValues = (Map) sh.get(defaultKey); 
				if (defaultValues != null) { 
					if (defaultValues.containsKey("defValue" )) {
						retVal = (org.icefaces.ace.model.tree.NodeStateMap) defaultValues.get("defValue"); 
					}
				}
			}
		}
		return retVal;
	}

	/**
	 * <p>Set the value of the <code>stateVar</code> property.</p>
	 * <p>Contents: The request-scope attribute exposing the state object for the currentnode when iterating.</p>
	 */
	public void setStateVar(java.lang.String stateVar) {
		PropertyKeys propToUse = PropertyKeys.stateVar;
		addToSetOfUsedProperties(propToUse);
		ValueExpression ve = getValueExpression(PropertyKeys.stateVar.toString() );
		if (ve != null) {
			// map of style values per clientId
			ve.setValue(getFacesContext().getELContext(), stateVar );
		} else { 
			StateHelper sh = getStateHelper(); 
			if (isDisconnected(this))  {
				String defaultKey = PropertyKeys.stateVar.toString() + "_defaultValues";
				Map clientDefaults = (Map) sh.get(defaultKey);
				if (clientDefaults == null && stateVar != null) { 
					clientDefaults = new HashMap(); 
					clientDefaults.put("defValue",stateVar);
					sh.put(defaultKey, clientDefaults); 
				} 
			} else {
				String clientId = getClientId();
				String valuesKey = PropertyKeys.stateVar.toString() + "_rowValues"; 
				Map clientValues = (Map) sh.get(valuesKey); 
				if (clientValues == null) {
					clientValues = new HashMap(); 
				}
				if (stateVar == null) {
					clientValues.remove(clientId);
				} else {
					clientValues.put(clientId, stateVar);
				}
				//Always re-add the delta values to the map. JSF merges the values into the main map
				//and values are not state saved unless they're in the delta map. 
				sh.put(valuesKey, clientValues);
			}
		}
	}

	/**
	 * <p>Return the value of the <code>stateVar</code> property.</p>
	 * <p>Contents: The request-scope attribute exposing the state object for the currentnode when iterating. Default = 'nodeState'.</p>
	 */
	public java.lang.String getStateVar() {
		java.lang.String retVal = "nodeState";
		ValueExpression ve = getValueExpression( PropertyKeys.stateVar.toString() );
		if (ve != null) {
				retVal = (java.lang.String) ve.getValue( getFacesContext().getELContext() ); 
		} else {
			StateHelper sh = getStateHelper(); 
			String valuesKey = PropertyKeys.stateVar.toString() + "_rowValues";
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
				String defaultKey = PropertyKeys.stateVar.toString() + "_defaultValues";
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
	 * <p>Contents: Define a ValueExpression that returns a String representation of the 'rendering type' of this node. The rendering type is matched against the String 'type' attribute of ace:node tag instances to determine which node template should be used to render a given node object.</p>
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
	 * <p>Contents: Define a ValueExpression that returns a String representation of the 'rendering type' of this node. The rendering type is matched against the String 'type' attribute of ace:node tag instances to determine which node template should be used to render a given node object.</p>
	 */
	public java.lang.String getType() {
		java.lang.String retVal = null;
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
			"expand",
			"contract",
			"select",
			"deselect",
			"reorder"));

	private static final Map<String, String> defaultRenderMap;
	private static final Map<String, String> defaultExecuteMap;
	private static final Map<String, String> listenerArgumentMap;
	static {
		Map<String, String> drm = new HashMap<String, String>(6);
		Map<String, String> dem = new HashMap<String, String>(6);
		Map<String, String> lam = new HashMap<String, String>(6);
		drm.put("expand","@all");
		dem.put("expand","@this");
		lam.put("expand","");
		drm.put("contract","@all");
		dem.put("contract","@this");
		lam.put("contract","");
		drm.put("select","@all");
		dem.put("select","@this");
		lam.put("select","");
		drm.put("deselect","@all");
		dem.put("deselect","@this");
		lam.put("deselect","");
		drm.put("reorder","@all");
		dem.put("reorder","@this");
		lam.put("reorder","");
		defaultRenderMap = Collections.unmodifiableMap(drm);
		defaultExecuteMap = Collections.unmodifiableMap(dem);
		listenerArgumentMap = Collections.unmodifiableMap(lam);
	}

	public Collection<String> getEventNames() {
		return eventNames;
	}

	public String getDefaultEventName() {
		return "select";
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