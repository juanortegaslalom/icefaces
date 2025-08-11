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
public class GMapAutocompleteTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.GMapAutocompleteRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.GMapAutocomplete";
	}
	private javax.el.ValueExpression address;
	public void setAddress(javax.el.ValueExpression address) {
		this.address = address;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression latLng;
	public void setLatLng(javax.el.ValueExpression latLng) {
		this.latLng = latLng;
	}
	private javax.el.ValueExpression offset;
	public void setOffset(javax.el.ValueExpression offset) {
		this.offset = offset;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression size;
	public void setSize(javax.el.ValueExpression size) {
		this.size = size;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression types;
	public void setTypes(javax.el.ValueExpression types) {
		this.types = types;
	}
	private javax.el.ValueExpression url;
	public void setUrl(javax.el.ValueExpression url) {
		this.url = url;
	}
	private javax.el.ValueExpression window;
	public void setWindow(javax.el.ValueExpression window) {
		this.window = window;
	}
	private javax.el.ValueExpression windowOptions;
	public void setWindowOptions(javax.el.ValueExpression windowOptions) {
		this.windowOptions = windowOptions;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.gmap.GMapAutocompleteBase _component = null;
		try {
			_component = (org.icefaces.ace.component.gmap.GMapAutocompleteBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.gmap.GMapAutocompleteBase");
		}
		if (address != null) {
			_component.setValueExpression("address", address);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (latLng != null) {
			_component.setValueExpression("latLng", latLng);
		}
		if (offset != null) {
			_component.setValueExpression("offset", offset);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (size != null) {
			_component.setValueExpression("size", size);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (types != null) {
			_component.setValueExpression("types", types);
		}
		if (url != null) {
			_component.setValueExpression("url", url);
		}
		if (window != null) {
			_component.setValueExpression("window", window);
		}
		if (windowOptions != null) {
			_component.setValueExpression("windowOptions", windowOptions);
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
		address = null;
		binding = null;
		id = null;
		latLng = null;
		offset = null;
		rendered = null;
		size = null;
		style = null;
		types = null;
		url = null;
		window = null;
		windowOptions = null;
	}
}