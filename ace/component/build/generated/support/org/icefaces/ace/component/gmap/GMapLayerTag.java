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
public class GMapLayerTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.GMapLayerRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.GMapLayer";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression layerType;
	public void setLayerType(javax.el.ValueExpression layerType) {
		this.layerType = layerType;
	}
	private javax.el.ValueExpression options;
	public void setOptions(javax.el.ValueExpression options) {
		this.options = options;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression url;
	public void setUrl(javax.el.ValueExpression url) {
		this.url = url;
	}
	private javax.el.ValueExpression visible;
	public void setVisible(javax.el.ValueExpression visible) {
		this.visible = visible;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.gmap.GMapLayerBase _component = null;
		try {
			_component = (org.icefaces.ace.component.gmap.GMapLayerBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.gmap.GMapLayerBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (layerType != null) {
			_component.setValueExpression("layerType", layerType);
		}
		if (options != null) {
			_component.setValueExpression("options", options);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (url != null) {
			_component.setValueExpression("url", url);
		}
		if (visible != null) {
			_component.setValueExpression("visible", visible);
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
		id = null;
		layerType = null;
		options = null;
		rendered = null;
		url = null;
		visible = null;
	}
}