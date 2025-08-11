package org.icefaces.ace.component.graphicimage;

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
public class GraphicImageTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.GraphicImageRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.GraphicImage";
	}
	private javax.el.ValueExpression alt;
	public void setAlt(javax.el.ValueExpression alt) {
		this.alt = alt;
	}
	private javax.el.ValueExpression dir;
	public void setDir(javax.el.ValueExpression dir) {
		this.dir = dir;
	}
	private javax.el.ValueExpression height;
	public void setHeight(javax.el.ValueExpression height) {
		this.height = height;
	}
	private javax.el.ValueExpression ismap;
	public void setIsmap(javax.el.ValueExpression ismap) {
		this.ismap = ismap;
	}
	private javax.el.ValueExpression longdesc;
	public void setLongdesc(javax.el.ValueExpression longdesc) {
		this.longdesc = longdesc;
	}
	private javax.el.ValueExpression mimeType;
	public void setMimeType(javax.el.ValueExpression mimeType) {
		this.mimeType = mimeType;
	}
	private javax.el.ValueExpression name;
	public void setName(javax.el.ValueExpression name) {
		this.name = name;
	}
	private javax.el.ValueExpression scope;
	public void setScope(javax.el.ValueExpression scope) {
		this.scope = scope;
	}
	private javax.el.ValueExpression src;
	public void setSrc(javax.el.ValueExpression src) {
		this.src = src;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
	}
	private javax.el.ValueExpression title;
	public void setTitle(javax.el.ValueExpression title) {
		this.title = title;
	}
	private javax.el.ValueExpression url;
	public void setUrl(javax.el.ValueExpression url) {
		this.url = url;
	}
	private javax.el.ValueExpression usemap;
	public void setUsemap(javax.el.ValueExpression usemap) {
		this.usemap = usemap;
	}
	private javax.el.ValueExpression value;
	public void setValue(javax.el.ValueExpression value) {
		this.value = value;
	}
	private javax.el.ValueExpression width;
	public void setWidth(javax.el.ValueExpression width) {
		this.width = width;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.graphicimage.GraphicImageBase _component = null;
		try {
			_component = (org.icefaces.ace.component.graphicimage.GraphicImageBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.graphicimage.GraphicImageBase");
		}
		if (alt != null) {
			_component.setValueExpression("alt", alt);
		}
		if (dir != null) {
			_component.setValueExpression("dir", dir);
		}
		if (height != null) {
			_component.setValueExpression("height", height);
		}
		if (ismap != null) {
			_component.setValueExpression("ismap", ismap);
		}
		if (longdesc != null) {
			_component.setValueExpression("longdesc", longdesc);
		}
		if (mimeType != null) {
			_component.setValueExpression("mimeType", mimeType);
		}
		if (name != null) {
			_component.setValueExpression("name", name);
		}
		if (scope != null) {
			_component.setValueExpression("scope", scope);
		}
		if (src != null) {
			_component.setValueExpression("src", src);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (styleClass != null) {
			_component.setValueExpression("styleClass", styleClass);
		}
		if (title != null) {
			_component.setValueExpression("title", title);
		}
		if (url != null) {
			_component.setValueExpression("url", url);
		}
		if (usemap != null) {
			_component.setValueExpression("usemap", usemap);
		}
		if (value != null) {
			_component.setValueExpression("value", value);
		}
		if (width != null) {
			_component.setValueExpression("width", width);
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
		alt = null;
		dir = null;
		height = null;
		ismap = null;
		longdesc = null;
		mimeType = null;
		name = null;
		scope = null;
		src = null;
		style = null;
		styleClass = null;
		title = null;
		url = null;
		usemap = null;
		value = null;
		width = null;
	}
}