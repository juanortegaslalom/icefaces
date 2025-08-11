package org.icefaces.ace.component.dataview;

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
public class DataViewTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.DataViewRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.DataView";
	}
	private javax.el.ValueExpression activationMode;
	public void setActivationMode(javax.el.ValueExpression activationMode) {
		this.activationMode = activationMode;
	}
	private javax.el.ValueExpression activeRowIndex;
	public void setActiveRowIndex(javax.el.ValueExpression activeRowIndex) {
		this.activeRowIndex = activeRowIndex;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression disabled;
	public void setDisabled(javax.el.ValueExpression disabled) {
		this.disabled = disabled;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression reactiveColumnVisibility;
	public void setReactiveColumnVisibility(javax.el.ValueExpression reactiveColumnVisibility) {
		this.reactiveColumnVisibility = reactiveColumnVisibility;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression rowIndexVar;
	public void setRowIndexVar(javax.el.ValueExpression rowIndexVar) {
		this.rowIndexVar = rowIndexVar;
	}
	private javax.el.ValueExpression rowStripe;
	public void setRowStripe(javax.el.ValueExpression rowStripe) {
		this.rowStripe = rowStripe;
	}
	private javax.el.ValueExpression rowStroke;
	public void setRowStroke(javax.el.ValueExpression rowStroke) {
		this.rowStroke = rowStroke;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
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
		org.icefaces.ace.component.dataview.DataViewBase _component = null;
		try {
			_component = (org.icefaces.ace.component.dataview.DataViewBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.dataview.DataViewBase");
		}
		if (activationMode != null) {
			_component.setValueExpression("activationMode", activationMode);
		}
		if (activeRowIndex != null) {
			_component.setValueExpression("activeRowIndex", activeRowIndex);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (disabled != null) {
			_component.setValueExpression("disabled", disabled);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (reactiveColumnVisibility != null) {
			_component.setValueExpression("reactiveColumnVisibility", reactiveColumnVisibility);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (rowIndexVar != null) {
			_component.setValueExpression("rowIndexVar", rowIndexVar);
		}
		if (rowStripe != null) {
			_component.setValueExpression("rowStripe", rowStripe);
		}
		if (rowStroke != null) {
			_component.setValueExpression("rowStroke", rowStroke);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (styleClass != null) {
			_component.setValueExpression("styleClass", styleClass);
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
		activationMode = null;
		activeRowIndex = null;
		binding = null;
		disabled = null;
		id = null;
		reactiveColumnVisibility = null;
		rendered = null;
		rowIndexVar = null;
		rowStripe = null;
		rowStroke = null;
		style = null;
		styleClass = null;
		value = null;
		var = null;
	}
}