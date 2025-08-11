package org.icefaces.ace.component.tree;

/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */
public interface ITree {

	public void setDragHandle(java.lang.String dragHandle);

	public java.lang.String getDragHandle();

	public void setExpansion(java.lang.Boolean expansion);

	public java.lang.Boolean isExpansion();

	public void setExpansionMode(org.icefaces.ace.component.tree.TreeExpansionMode expansionMode);

	public org.icefaces.ace.component.tree.TreeExpansionMode getExpansionMode();

	public void setKeyConverter(org.icefaces.ace.model.tree.KeySegmentConverter keyConverter);

	public org.icefaces.ace.model.tree.KeySegmentConverter getKeyConverter();

	public void setReordering(java.lang.Boolean reordering);

	public java.lang.Boolean isReordering();

	public void setSelectMultiple(java.lang.Boolean selectMultiple);

	public java.lang.Boolean isSelectMultiple();

	public void setSelection(java.lang.Boolean selection);

	public java.lang.Boolean isSelection();

	public void setSelectionMode(org.icefaces.ace.component.tree.TreeSelectionMode selectionMode);

	public org.icefaces.ace.component.tree.TreeSelectionMode getSelectionMode();

	public void setStateCreationCallback(org.icefaces.ace.model.tree.NodeStateCreationCallback stateCreationCallback);

	public org.icefaces.ace.model.tree.NodeStateCreationCallback getStateCreationCallback();

	public void setStateMap(org.icefaces.ace.model.tree.NodeStateMap stateMap);

	public org.icefaces.ace.model.tree.NodeStateMap getStateMap();

	public void setStateVar(java.lang.String stateVar);

	public java.lang.String getStateVar();

	public void setType(java.lang.String type);

	public java.lang.String getType();
}
