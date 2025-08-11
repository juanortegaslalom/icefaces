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
public class DataViewColumnTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return null;
	}
	public String getComponentType() {
		return "org.icefaces.DataViewColumn";
	}
	private javax.el.ValueExpression footerText;
	public void setFooterText(javax.el.ValueExpression footerText) {
		this.footerText = footerText;
	}
	private javax.el.ValueExpression headerText;
	public void setHeaderText(javax.el.ValueExpression headerText) {
		this.headerText = headerText;
	}
	private javax.el.ValueExpression markup;
	public void setMarkup(javax.el.ValueExpression markup) {
		this.markup = markup;
	}
	private javax.el.ValueExpression reactivePriority;
	public void setReactivePriority(javax.el.ValueExpression reactivePriority) {
		this.reactivePriority = reactivePriority;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
	}
	private javax.el.ValueExpression type;
	public void setType(javax.el.ValueExpression type) {
		this.type = type;
	}
	private javax.el.ValueExpression value;
	public void setValue(javax.el.ValueExpression value) {
		this.value = value;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.dataview.DataViewColumnBase _component = null;
		try {
			_component = (org.icefaces.ace.component.dataview.DataViewColumnBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.dataview.DataViewColumnBase");
		}
		if (footerText != null) {
			_component.setValueExpression("footerText", footerText);
		}
		if (headerText != null) {
			_component.setValueExpression("headerText", headerText);
		}
		if (markup != null) {
			_component.setValueExpression("markup", markup);
		}
		if (reactivePriority != null) {
			_component.setValueExpression("reactivePriority", reactivePriority);
		}
		if (styleClass != null) {
			_component.setValueExpression("styleClass", styleClass);
		}
		if (type != null) {
			_component.setValueExpression("type", type);
		}
		if (value != null) {
			_component.setValueExpression("value", value);
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
		footerText = null;
		headerText = null;
		markup = null;
		reactivePriority = null;
		styleClass = null;
		type = null;
		value = null;
	}
}