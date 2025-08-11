package org.icefaces.ace.component.outputlist;

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
public class OutputListItemsTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.OutputListItemsRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.OutputListItems";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression first;
	public void setFirst(javax.el.ValueExpression first) {
		this.first = first;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression inset;
	public void setInset(javax.el.ValueExpression inset) {
		this.inset = inset;
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
	private javax.el.ValueExpression varStatus;
	public void setVarStatus(javax.el.ValueExpression varStatus) {
		this.varStatus = varStatus;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.outputlist.OutputListItemsBase _component = null;
		try {
			_component = (org.icefaces.ace.component.outputlist.OutputListItemsBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.outputlist.OutputListItemsBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (first != null) {
			_component.setValueExpression("first", first);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (inset != null) {
			_component.setValueExpression("inset", inset);
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
		if (varStatus != null) {
			_component.setValueExpression("varStatus", varStatus);
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
		first = null;
		id = null;
		inset = null;
		rendered = null;
		rowIndex = null;
		rows = null;
		style = null;
		styleClass = null;
		value = null;
		var = null;
		varStatus = null;
	}
}