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
public class GMapMarkerTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.GMapMarkerRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.GMapMarker";
	}
	private javax.el.ValueExpression animation;
	public void setAnimation(javax.el.ValueExpression animation) {
		this.animation = animation;
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
	private javax.el.ValueExpression latitude;
	public void setLatitude(javax.el.ValueExpression latitude) {
		this.latitude = latitude;
	}
	private javax.el.ValueExpression longitude;
	public void setLongitude(javax.el.ValueExpression longitude) {
		this.longitude = longitude;
	}
	private javax.el.ValueExpression options;
	public void setOptions(javax.el.ValueExpression options) {
		this.options = options;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.gmap.GMapMarkerBase _component = null;
		try {
			_component = (org.icefaces.ace.component.gmap.GMapMarkerBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.gmap.GMapMarkerBase");
		}
		if (animation != null) {
			_component.setValueExpression("animation", animation);
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
		if (latitude != null) {
			_component.setValueExpression("latitude", latitude);
		}
		if (longitude != null) {
			_component.setValueExpression("longitude", longitude);
		}
		if (options != null) {
			_component.setValueExpression("options", options);
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
		animation = null;
		binding = null;
		disabled = null;
		id = null;
		latitude = null;
		longitude = null;
		options = null;
		rendered = null;
	}
}