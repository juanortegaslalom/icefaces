package org.icefaces.ace.component.list;

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
public class ACEListTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.ListRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.List";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression bodyClass;
	public void setBodyClass(javax.el.ValueExpression bodyClass) {
		this.bodyClass = bodyClass;
	}
	private javax.el.ValueExpression bodyStyle;
	public void setBodyStyle(javax.el.ValueExpression bodyStyle) {
		this.bodyStyle = bodyStyle;
	}
	private javax.el.ValueExpression bottomButtonClass;
	public void setBottomButtonClass(javax.el.ValueExpression bottomButtonClass) {
		this.bottomButtonClass = bottomButtonClass;
	}
	private javax.el.ValueExpression compact;
	public void setCompact(javax.el.ValueExpression compact) {
		this.compact = compact;
	}
	private javax.el.ValueExpression controlsContainerClass;
	public void setControlsContainerClass(javax.el.ValueExpression controlsContainerClass) {
		this.controlsContainerClass = controlsContainerClass;
	}
	private javax.el.ValueExpression controlsEnabled;
	public void setControlsEnabled(javax.el.ValueExpression controlsEnabled) {
		this.controlsEnabled = controlsEnabled;
	}
	private javax.el.ValueExpression controlsFormat;
	public void setControlsFormat(javax.el.ValueExpression controlsFormat) {
		this.controlsFormat = controlsFormat;
	}
	private javax.el.ValueExpression controlsItemClass;
	public void setControlsItemClass(javax.el.ValueExpression controlsItemClass) {
		this.controlsItemClass = controlsItemClass;
	}
	private javax.el.ValueExpression controlsSpacerClass;
	public void setControlsSpacerClass(javax.el.ValueExpression controlsSpacerClass) {
		this.controlsSpacerClass = controlsSpacerClass;
	}
	private javax.el.ValueExpression doubleClickMigration;
	public void setDoubleClickMigration(javax.el.ValueExpression doubleClickMigration) {
		this.doubleClickMigration = doubleClickMigration;
	}
	private javax.el.ValueExpression downButtonClass;
	public void setDownButtonClass(javax.el.ValueExpression downButtonClass) {
		this.downButtonClass = downButtonClass;
	}
	private javax.el.ValueExpression dragHandle;
	public void setDragHandle(javax.el.ValueExpression dragHandle) {
		this.dragHandle = dragHandle;
	}
	private javax.el.ValueExpression dragging;
	public void setDragging(javax.el.ValueExpression dragging) {
		this.dragging = dragging;
	}
	private javax.el.ValueExpression dropGroup;
	public void setDropGroup(javax.el.ValueExpression dropGroup) {
		this.dropGroup = dropGroup;
	}
	private javax.el.ValueExpression first;
	public void setFirst(javax.el.ValueExpression first) {
		this.first = first;
	}
	private javax.el.ValueExpression footerClass;
	public void setFooterClass(javax.el.ValueExpression footerClass) {
		this.footerClass = footerClass;
	}
	private javax.el.ValueExpression footerStyle;
	public void setFooterStyle(javax.el.ValueExpression footerStyle) {
		this.footerStyle = footerStyle;
	}
	private javax.el.ValueExpression headerClass;
	public void setHeaderClass(javax.el.ValueExpression headerClass) {
		this.headerClass = headerClass;
	}
	private javax.el.ValueExpression headerStyle;
	public void setHeaderStyle(javax.el.ValueExpression headerStyle) {
		this.headerStyle = headerStyle;
	}
	private javax.el.ValueExpression height;
	public void setHeight(javax.el.ValueExpression height) {
		this.height = height;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression itemClass;
	public void setItemClass(javax.el.ValueExpression itemClass) {
		this.itemClass = itemClass;
	}
	private javax.el.ValueExpression itemStyle;
	public void setItemStyle(javax.el.ValueExpression itemStyle) {
		this.itemStyle = itemStyle;
	}
	private javax.el.ValueExpression placeholder;
	public void setPlaceholder(javax.el.ValueExpression placeholder) {
		this.placeholder = placeholder;
	}
	private javax.el.ValueExpression placeholderClass;
	public void setPlaceholderClass(javax.el.ValueExpression placeholderClass) {
		this.placeholderClass = placeholderClass;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression rowIndex;
	public void setRowIndex(javax.el.ValueExpression rowIndex) {
		this.rowIndex = rowIndex;
	}
	private javax.el.ValueExpression rows;
	public void setRows(javax.el.ValueExpression rows) {
		this.rows = rows;
	}
	private javax.el.MethodExpression selectionListener;
	public void setSelectionListener(javax.el.MethodExpression selectionListener) {
		this.selectionListener = selectionListener;
	}
	private javax.el.ValueExpression selectionMode;
	public void setSelectionMode(javax.el.ValueExpression selectionMode) {
		this.selectionMode = selectionMode;
	}
	private javax.el.ValueExpression selections;
	public void setSelections(javax.el.ValueExpression selections) {
		this.selections = selections;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
	}
	private javax.el.ValueExpression topButtonClass;
	public void setTopButtonClass(javax.el.ValueExpression topButtonClass) {
		this.topButtonClass = topButtonClass;
	}
	private javax.el.ValueExpression upButtonClass;
	public void setUpButtonClass(javax.el.ValueExpression upButtonClass) {
		this.upButtonClass = upButtonClass;
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
		org.icefaces.ace.component.list.ListBase _component = null;
		try {
			_component = (org.icefaces.ace.component.list.ListBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.list.ListBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (bodyClass != null) {
			_component.setValueExpression("bodyClass", bodyClass);
		}
		if (bodyStyle != null) {
			_component.setValueExpression("bodyStyle", bodyStyle);
		}
		if (bottomButtonClass != null) {
			_component.setValueExpression("bottomButtonClass", bottomButtonClass);
		}
		if (compact != null) {
			_component.setValueExpression("compact", compact);
		}
		if (controlsContainerClass != null) {
			_component.setValueExpression("controlsContainerClass", controlsContainerClass);
		}
		if (controlsEnabled != null) {
			_component.setValueExpression("controlsEnabled", controlsEnabled);
		}
		if (controlsFormat != null) {
			_component.setValueExpression("controlsFormat", controlsFormat);
		}
		if (controlsItemClass != null) {
			_component.setValueExpression("controlsItemClass", controlsItemClass);
		}
		if (controlsSpacerClass != null) {
			_component.setValueExpression("controlsSpacerClass", controlsSpacerClass);
		}
		if (doubleClickMigration != null) {
			_component.setValueExpression("doubleClickMigration", doubleClickMigration);
		}
		if (downButtonClass != null) {
			_component.setValueExpression("downButtonClass", downButtonClass);
		}
		if (dragHandle != null) {
			_component.setValueExpression("dragHandle", dragHandle);
		}
		if (dragging != null) {
			_component.setValueExpression("dragging", dragging);
		}
		if (dropGroup != null) {
			_component.setValueExpression("dropGroup", dropGroup);
		}
		if (first != null) {
			_component.setValueExpression("first", first);
		}
		if (footerClass != null) {
			_component.setValueExpression("footerClass", footerClass);
		}
		if (footerStyle != null) {
			_component.setValueExpression("footerStyle", footerStyle);
		}
		if (headerClass != null) {
			_component.setValueExpression("headerClass", headerClass);
		}
		if (headerStyle != null) {
			_component.setValueExpression("headerStyle", headerStyle);
		}
		if (height != null) {
			_component.setValueExpression("height", height);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (itemClass != null) {
			_component.setValueExpression("itemClass", itemClass);
		}
		if (itemStyle != null) {
			_component.setValueExpression("itemStyle", itemStyle);
		}
		if (placeholder != null) {
			_component.setValueExpression("placeholder", placeholder);
		}
		if (placeholderClass != null) {
			_component.setValueExpression("placeholderClass", placeholderClass);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (rowIndex != null) {
			_component.setValueExpression("rowIndex", rowIndex);
		}
		if (rows != null) {
			_component.setValueExpression("rows", rows);
		}
		if (selectionListener != null) {
			_component.setSelectionListener(selectionListener);
		}
		if (selectionMode != null) {
			_component.setValueExpression("selectionMode", selectionMode);
		}
		if (selections != null) {
			_component.setValueExpression("selections", selections);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (styleClass != null) {
			_component.setValueExpression("styleClass", styleClass);
		}
		if (topButtonClass != null) {
			_component.setValueExpression("topButtonClass", topButtonClass);
		}
		if (upButtonClass != null) {
			_component.setValueExpression("upButtonClass", upButtonClass);
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
		bodyClass = null;
		bodyStyle = null;
		bottomButtonClass = null;
		compact = null;
		controlsContainerClass = null;
		controlsEnabled = null;
		controlsFormat = null;
		controlsItemClass = null;
		controlsSpacerClass = null;
		doubleClickMigration = null;
		downButtonClass = null;
		dragHandle = null;
		dragging = null;
		dropGroup = null;
		first = null;
		footerClass = null;
		footerStyle = null;
		headerClass = null;
		headerStyle = null;
		height = null;
		id = null;
		itemClass = null;
		itemStyle = null;
		placeholder = null;
		placeholderClass = null;
		rendered = null;
		rowIndex = null;
		rows = null;
		selectionListener = null;
		selectionMode = null;
		selections = null;
		style = null;
		styleClass = null;
		topButtonClass = null;
		upButtonClass = null;
		value = null;
		var = null;
	}
}