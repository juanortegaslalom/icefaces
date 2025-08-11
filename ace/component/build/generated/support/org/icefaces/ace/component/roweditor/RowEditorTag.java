package org.icefaces.ace.component.roweditor;

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
public class RowEditorTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.RowEditorRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.RowEditor";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression cancelTitle;
	public void setCancelTitle(javax.el.ValueExpression cancelTitle) {
		this.cancelTitle = cancelTitle;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.MethodExpression rowEditCancelListener;
	public void setRowEditCancelListener(javax.el.MethodExpression rowEditCancelListener) {
		this.rowEditCancelListener = rowEditCancelListener;
	}
	private javax.el.MethodExpression rowEditListener;
	public void setRowEditListener(javax.el.MethodExpression rowEditListener) {
		this.rowEditListener = rowEditListener;
	}
	private javax.el.ValueExpression startTitle;
	public void setStartTitle(javax.el.ValueExpression startTitle) {
		this.startTitle = startTitle;
	}
	private javax.el.ValueExpression submitTitle;
	public void setSubmitTitle(javax.el.ValueExpression submitTitle) {
		this.submitTitle = submitTitle;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.roweditor.RowEditorBase _component = null;
		try {
			_component = (org.icefaces.ace.component.roweditor.RowEditorBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.roweditor.RowEditorBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (cancelTitle != null) {
			_component.setValueExpression("cancelTitle", cancelTitle);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (rowEditCancelListener != null) {
			_component.setRowEditCancelListener(rowEditCancelListener);
		}
		if (rowEditListener != null) {
			_component.setRowEditListener(rowEditListener);
		}
		if (startTitle != null) {
			_component.setValueExpression("startTitle", startTitle);
		}
		if (submitTitle != null) {
			_component.setValueExpression("submitTitle", submitTitle);
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
		cancelTitle = null;
		id = null;
		rendered = null;
		rowEditCancelListener = null;
		rowEditListener = null;
		startTitle = null;
		submitTitle = null;
	}
}