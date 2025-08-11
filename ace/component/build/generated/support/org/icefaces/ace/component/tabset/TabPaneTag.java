package org.icefaces.ace.component.tabset;

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
public class TabPaneTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return null;
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.TabPane";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression cache;
	public void setCache(javax.el.ValueExpression cache) {
		this.cache = cache;
	}
	private javax.el.ValueExpression disabled;
	public void setDisabled(javax.el.ValueExpression disabled) {
		this.disabled = disabled;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression label;
	public void setLabel(javax.el.ValueExpression label) {
		this.label = label;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.tabset.TabPaneBase _component = null;
		try {
			_component = (org.icefaces.ace.component.tabset.TabPaneBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.tabset.TabPaneBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (cache != null) {
			_component.setValueExpression("cache", cache);
		}
		if (disabled != null) {
			_component.setValueExpression("disabled", disabled);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (label != null) {
			_component.setValueExpression("label", label);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
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
		cache = null;
		disabled = null;
		id = null;
		label = null;
		rendered = null;
	}
}