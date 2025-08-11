package org.icefaces.ace.component.listcontrol;

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
public class ListControlTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.ListControlRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.ListControl";
	}
	private javax.el.ValueExpression allLeftClass;
	public void setAllLeftClass(javax.el.ValueExpression allLeftClass) {
		this.allLeftClass = allLeftClass;
	}
	private javax.el.ValueExpression allRightClass;
	public void setAllRightClass(javax.el.ValueExpression allRightClass) {
		this.allRightClass = allRightClass;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression controlClass;
	public void setControlClass(javax.el.ValueExpression controlClass) {
		this.controlClass = controlClass;
	}
	private javax.el.ValueExpression footerClass;
	public void setFooterClass(javax.el.ValueExpression footerClass) {
		this.footerClass = footerClass;
	}
	private javax.el.ValueExpression footerStyle;
	public void setFooterStyle(javax.el.ValueExpression footerStyle) {
		this.footerStyle = footerStyle;
	}
	private javax.el.ValueExpression format;
	public void setFormat(javax.el.ValueExpression format) {
		this.format = format;
	}
	private javax.el.ValueExpression headerClass;
	public void setHeaderClass(javax.el.ValueExpression headerClass) {
		this.headerClass = headerClass;
	}
	private javax.el.ValueExpression headerStyle;
	public void setHeaderStyle(javax.el.ValueExpression headerStyle) {
		this.headerStyle = headerStyle;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression leftClass;
	public void setLeftClass(javax.el.ValueExpression leftClass) {
		this.leftClass = leftClass;
	}
	private javax.el.ValueExpression position;
	public void setPosition(javax.el.ValueExpression position) {
		this.position = position;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression rightClass;
	public void setRightClass(javax.el.ValueExpression rightClass) {
		this.rightClass = rightClass;
	}
	private javax.el.ValueExpression selector;
	public void setSelector(javax.el.ValueExpression selector) {
		this.selector = selector;
	}
	private javax.el.ValueExpression spacerClass;
	public void setSpacerClass(javax.el.ValueExpression spacerClass) {
		this.spacerClass = spacerClass;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.listcontrol.ListControlBase _component = null;
		try {
			_component = (org.icefaces.ace.component.listcontrol.ListControlBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.listcontrol.ListControlBase");
		}
		if (allLeftClass != null) {
			_component.setValueExpression("allLeftClass", allLeftClass);
		}
		if (allRightClass != null) {
			_component.setValueExpression("allRightClass", allRightClass);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (controlClass != null) {
			_component.setValueExpression("controlClass", controlClass);
		}
		if (footerClass != null) {
			_component.setValueExpression("footerClass", footerClass);
		}
		if (footerStyle != null) {
			_component.setValueExpression("footerStyle", footerStyle);
		}
		if (format != null) {
			_component.setValueExpression("format", format);
		}
		if (headerClass != null) {
			_component.setValueExpression("headerClass", headerClass);
		}
		if (headerStyle != null) {
			_component.setValueExpression("headerStyle", headerStyle);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (leftClass != null) {
			_component.setValueExpression("leftClass", leftClass);
		}
		if (position != null) {
			_component.setValueExpression("position", position);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (rightClass != null) {
			_component.setValueExpression("rightClass", rightClass);
		}
		if (selector != null) {
			_component.setValueExpression("selector", selector);
		}
		if (spacerClass != null) {
			_component.setValueExpression("spacerClass", spacerClass);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (styleClass != null) {
			_component.setValueExpression("styleClass", styleClass);
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
		allLeftClass = null;
		allRightClass = null;
		binding = null;
		controlClass = null;
		footerClass = null;
		footerStyle = null;
		format = null;
		headerClass = null;
		headerStyle = null;
		id = null;
		leftClass = null;
		position = null;
		rendered = null;
		rightClass = null;
		selector = null;
		spacerClass = null;
		style = null;
		styleClass = null;
	}
}