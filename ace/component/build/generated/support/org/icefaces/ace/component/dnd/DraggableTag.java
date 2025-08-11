package org.icefaces.ace.component.dnd;

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
public class DraggableTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.DraggableRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.Draggable";
	}
	private javax.el.ValueExpression axis;
	public void setAxis(javax.el.ValueExpression axis) {
		this.axis = axis;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression containment;
	public void setContainment(javax.el.ValueExpression containment) {
		this.containment = containment;
	}
	private javax.el.ValueExpression cursor;
	public void setCursor(javax.el.ValueExpression cursor) {
		this.cursor = cursor;
	}
	private javax.el.ValueExpression datasource;
	public void setDatasource(javax.el.ValueExpression datasource) {
		this.datasource = datasource;
	}
	private javax.el.ValueExpression disabled;
	public void setDisabled(javax.el.ValueExpression disabled) {
		this.disabled = disabled;
	}
	private javax.el.ValueExpression dragOnly;
	public void setDragOnly(javax.el.ValueExpression dragOnly) {
		this.dragOnly = dragOnly;
	}
	private javax.el.MethodExpression dragStartListener;
	public void setDragStartListener(javax.el.MethodExpression dragStartListener) {
		this.dragStartListener = dragStartListener;
	}
	private javax.el.ValueExpression forValue;
	public void setFor(javax.el.ValueExpression forValue) {
		this.forValue = forValue;
	}
	private javax.el.ValueExpression grid;
	public void setGrid(javax.el.ValueExpression grid) {
		this.grid = grid;
	}
	private javax.el.ValueExpression handle;
	public void setHandle(javax.el.ValueExpression handle) {
		this.handle = handle;
	}
	private javax.el.ValueExpression helper;
	public void setHelper(javax.el.ValueExpression helper) {
		this.helper = helper;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression opacity;
	public void setOpacity(javax.el.ValueExpression opacity) {
		this.opacity = opacity;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression revert;
	public void setRevert(javax.el.ValueExpression revert) {
		this.revert = revert;
	}
	private javax.el.ValueExpression scope;
	public void setScope(javax.el.ValueExpression scope) {
		this.scope = scope;
	}
	private javax.el.ValueExpression snap;
	public void setSnap(javax.el.ValueExpression snap) {
		this.snap = snap;
	}
	private javax.el.ValueExpression snapMode;
	public void setSnapMode(javax.el.ValueExpression snapMode) {
		this.snapMode = snapMode;
	}
	private javax.el.ValueExpression snapTolerance;
	public void setSnapTolerance(javax.el.ValueExpression snapTolerance) {
		this.snapTolerance = snapTolerance;
	}
	private javax.el.ValueExpression stack;
	public void setStack(javax.el.ValueExpression stack) {
		this.stack = stack;
	}
	private javax.el.ValueExpression widgetVar;
	public void setWidgetVar(javax.el.ValueExpression widgetVar) {
		this.widgetVar = widgetVar;
	}
	private javax.el.ValueExpression zindex;
	public void setZindex(javax.el.ValueExpression zindex) {
		this.zindex = zindex;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.dnd.DraggableBase _component = null;
		try {
			_component = (org.icefaces.ace.component.dnd.DraggableBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.dnd.DraggableBase");
		}
		if (axis != null) {
			_component.setValueExpression("axis", axis);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (containment != null) {
			_component.setValueExpression("containment", containment);
		}
		if (cursor != null) {
			_component.setValueExpression("cursor", cursor);
		}
		if (datasource != null) {
			_component.setValueExpression("datasource", datasource);
		}
		if (disabled != null) {
			_component.setValueExpression("disabled", disabled);
		}
		if (dragOnly != null) {
			_component.setValueExpression("dragOnly", dragOnly);
		}
		if (dragStartListener != null) {
			_component.setDragStartListener(dragStartListener);
		}
		if (forValue != null) {
			_component.setValueExpression("for", forValue);
		}
		if (grid != null) {
			_component.setValueExpression("grid", grid);
		}
		if (handle != null) {
			_component.setValueExpression("handle", handle);
		}
		if (helper != null) {
			_component.setValueExpression("helper", helper);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (opacity != null) {
			_component.setValueExpression("opacity", opacity);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (revert != null) {
			_component.setValueExpression("revert", revert);
		}
		if (scope != null) {
			_component.setValueExpression("scope", scope);
		}
		if (snap != null) {
			_component.setValueExpression("snap", snap);
		}
		if (snapMode != null) {
			_component.setValueExpression("snapMode", snapMode);
		}
		if (snapTolerance != null) {
			_component.setValueExpression("snapTolerance", snapTolerance);
		}
		if (stack != null) {
			_component.setValueExpression("stack", stack);
		}
		if (widgetVar != null) {
			_component.setValueExpression("widgetVar", widgetVar);
		}
		if (zindex != null) {
			_component.setValueExpression("zindex", zindex);
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
		axis = null;
		binding = null;
		containment = null;
		cursor = null;
		datasource = null;
		disabled = null;
		dragOnly = null;
		dragStartListener = null;
		forValue = null;
		grid = null;
		handle = null;
		helper = null;
		id = null;
		opacity = null;
		rendered = null;
		revert = null;
		scope = null;
		snap = null;
		snapMode = null;
		snapTolerance = null;
		stack = null;
		widgetVar = null;
		zindex = null;
	}
}