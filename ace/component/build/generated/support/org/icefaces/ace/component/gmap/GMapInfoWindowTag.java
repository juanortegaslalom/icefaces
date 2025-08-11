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
public class GMapInfoWindowTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.GMapInfoWindowRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.GMapInfoWindow";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression content;
	public void setContent(javax.el.ValueExpression content) {
		this.content = content;
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
	private javax.el.ValueExpression showOnClick;
	public void setShowOnClick(javax.el.ValueExpression showOnClick) {
		this.showOnClick = showOnClick;
	}
	private javax.el.ValueExpression startOpen;
	public void setStartOpen(javax.el.ValueExpression startOpen) {
		this.startOpen = startOpen;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.gmap.GMapInfoWindowBase _component = null;
		try {
			_component = (org.icefaces.ace.component.gmap.GMapInfoWindowBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.gmap.GMapInfoWindowBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (content != null) {
			_component.setValueExpression("content", content);
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
		if (showOnClick != null) {
			_component.setValueExpression("showOnClick", showOnClick);
		}
		if (startOpen != null) {
			_component.setValueExpression("startOpen", startOpen);
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
		content = null;
		disabled = null;
		id = null;
		latitude = null;
		longitude = null;
		options = null;
		rendered = null;
		showOnClick = null;
		startOpen = null;
	}
}