package org.icefaces.ace.component.tree;

import java.io.IOException;
import javax.el.*;
import javax.faces.*;
import javax.faces.component.*;
import javax.faces.context.*;
import javax.faces.convert.*;
import javax.faces.el.*;
import javax.faces.event.*;
import javax.faces.validator.*;
import javax.faces.webapp.*;
import javax.servlet.jsp.JspException;

/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */
public class TreeTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.TreeRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.Tree";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression dragHandle;
	public void setDragHandle(javax.el.ValueExpression dragHandle) {
		this.dragHandle = dragHandle;
	}
	private javax.el.ValueExpression expansion;
	public void setExpansion(javax.el.ValueExpression expansion) {
		this.expansion = expansion;
	}
	private javax.el.ValueExpression expansionMode;
	public void setExpansionMode(javax.el.ValueExpression expansionMode) {
		this.expansionMode = expansionMode;
	}
	private javax.el.ValueExpression first;
	public void setFirst(javax.el.ValueExpression first) {
		this.first = first;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression keyConverter;
	public void setKeyConverter(javax.el.ValueExpression keyConverter) {
		this.keyConverter = keyConverter;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression reordering;
	public void setReordering(javax.el.ValueExpression reordering) {
		this.reordering = reordering;
	}
	private javax.el.ValueExpression rowIndex;
	public void setRowIndex(javax.el.ValueExpression rowIndex) {
		this.rowIndex = rowIndex;
	}
	private javax.el.ValueExpression rows;
	public void setRows(javax.el.ValueExpression rows) {
		this.rows = rows;
	}
	private javax.el.ValueExpression selectMultiple;
	public void setSelectMultiple(javax.el.ValueExpression selectMultiple) {
		this.selectMultiple = selectMultiple;
	}
	private javax.el.ValueExpression selection;
	public void setSelection(javax.el.ValueExpression selection) {
		this.selection = selection;
	}
	private javax.el.ValueExpression selectionMode;
	public void setSelectionMode(javax.el.ValueExpression selectionMode) {
		this.selectionMode = selectionMode;
	}
	private javax.el.ValueExpression stateCreationCallback;
	public void setStateCreationCallback(javax.el.ValueExpression stateCreationCallback) {
		this.stateCreationCallback = stateCreationCallback;
	}
	private javax.el.ValueExpression stateMap;
	public void setStateMap(javax.el.ValueExpression stateMap) {
		this.stateMap = stateMap;
	}
	private javax.el.ValueExpression stateVar;
	public void setStateVar(javax.el.ValueExpression stateVar) {
		this.stateVar = stateVar;
	}
	private javax.el.ValueExpression type;
	public void setType(javax.el.ValueExpression type) {
		this.type = type;
	}
	private javax.el.ValueExpression value;
	public void setValue(javax.el.ValueExpression value) {
		this.value = value;
	}
	private javax.el.ValueExpression var;
	public void setVar(javax.el.ValueExpression var) {
		this.var = var;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.tree.TreeBase _component = null;
		try {
			_component = (org.icefaces.ace.component.tree.TreeBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.tree.TreeBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (dragHandle != null) {
			_component.setValueExpression("dragHandle", dragHandle);
		}
		if (expansion != null) {
			_component.setValueExpression("expansion", expansion);
		}
		if (expansionMode != null) {
			_component.setValueExpression("expansionMode", expansionMode);
		}
		if (first != null) {
			_component.setValueExpression("first", first);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (keyConverter != null) {
			_component.setValueExpression("keyConverter", keyConverter);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (reordering != null) {
			_component.setValueExpression("reordering", reordering);
		}
		if (rowIndex != null) {
			_component.setValueExpression("rowIndex", rowIndex);
		}
		if (rows != null) {
			_component.setValueExpression("rows", rows);
		}
		if (selectMultiple != null) {
			_component.setValueExpression("selectMultiple", selectMultiple);
		}
		if (selection != null) {
			_component.setValueExpression("selection", selection);
		}
		if (selectionMode != null) {
			_component.setValueExpression("selectionMode", selectionMode);
		}
		if (stateCreationCallback != null) {
			_component.setValueExpression("stateCreationCallback", stateCreationCallback);
		}
		if (stateMap != null) {
			_component.setValueExpression("stateMap", stateMap);
		}
		if (stateVar != null) {
			_component.setValueExpression("stateVar", stateVar);
		}
		if (type != null) {
			_component.setValueExpression("type", type);
		}
		if (value != null) {
			_component.setValueExpression("value", value);
		}
		if (var != null) {
			_component.setValueExpression("var", var);
		}
	}

	public int doStartTag() throws JspException {
		try {
			return super.doStartTag();
		} catch (Exception e) {
			Throwable root = e;			
			while (root.getCause() != null) {
				root = root.getCause();
			}
			throw new JspException(root);
		}
	}

	public int doEndTag() throws JspException {
		try {
			return super.doEndTag();
		} catch (Exception e) {
			Throwable root = e;			
			while (root.getCause() != null) {
				root = root.getCause();
			}
			throw new JspException(root);
		}
	}
	/**
	 * <p>Release any allocated tag handler attributes.</p>
 	 */
	public void release() {
		super.release();
		binding = null;
		dragHandle = null;
		expansion = null;
		expansionMode = null;
		first = null;
		id = null;
		keyConverter = null;
		rendered = null;
		reordering = null;
		rowIndex = null;
		rows = null;
		selectMultiple = null;
		selection = null;
		selectionMode = null;
		stateCreationCallback = null;
		stateMap = null;
		stateVar = null;
		type = null;
		value = null;
		var = null;
	}
}