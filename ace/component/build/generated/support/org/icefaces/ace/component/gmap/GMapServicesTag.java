package org.icefaces.ace.component.gmap;

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
public class GMapServicesTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.GMapServicesRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.GMapServices";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression div;
	public void setDiv(javax.el.ValueExpression div) {
		this.div = div;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression name;
	public void setName(javax.el.ValueExpression name) {
		this.name = name;
	}
	private javax.el.ValueExpression options;
	public void setOptions(javax.el.ValueExpression options) {
		this.options = options;
	}
	private javax.el.ValueExpression points;
	public void setPoints(javax.el.ValueExpression points) {
		this.points = points;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.gmap.GMapServicesBase _component = null;
		try {
			_component = (org.icefaces.ace.component.gmap.GMapServicesBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.gmap.GMapServicesBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (div != null) {
			_component.setValueExpression("div", div);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (name != null) {
			_component.setValueExpression("name", name);
		}
		if (options != null) {
			_component.setValueExpression("options", options);
		}
		if (points != null) {
			_component.setValueExpression("points", points);
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
		div = null;
		id = null;
		name = null;
		options = null;
		points = null;
		rendered = null;
	}
}