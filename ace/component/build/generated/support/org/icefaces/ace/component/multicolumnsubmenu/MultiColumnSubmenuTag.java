package org.icefaces.ace.component.multicolumnsubmenu;

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
public class MultiColumnSubmenuTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return null;
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.MultiColumnSubmenu";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression disabled;
	public void setDisabled(javax.el.ValueExpression disabled) {
		this.disabled = disabled;
	}
	private javax.el.ValueExpression footerClass;
	public void setFooterClass(javax.el.ValueExpression footerClass) {
		this.footerClass = footerClass;
	}
	private javax.el.ValueExpression headerClass;
	public void setHeaderClass(javax.el.ValueExpression headerClass) {
		this.headerClass = headerClass;
	}
	private javax.el.ValueExpression icon;
	public void setIcon(javax.el.ValueExpression icon) {
		this.icon = icon;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression label;
	public void setLabel(javax.el.ValueExpression label) {
		this.label = label;
	}
	private javax.el.ValueExpression positionLeft;
	public void setPositionLeft(javax.el.ValueExpression positionLeft) {
		this.positionLeft = positionLeft;
	}
	private javax.el.ValueExpression positionTop;
	public void setPositionTop(javax.el.ValueExpression positionTop) {
		this.positionTop = positionTop;
	}
	private javax.el.ValueExpression relativeTo;
	public void setRelativeTo(javax.el.ValueExpression relativeTo) {
		this.relativeTo = relativeTo;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
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
		org.icefaces.ace.component.multicolumnsubmenu.MultiColumnSubmenuBase _component = null;
		try {
			_component = (org.icefaces.ace.component.multicolumnsubmenu.MultiColumnSubmenuBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.multicolumnsubmenu.MultiColumnSubmenuBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (disabled != null) {
			_component.setValueExpression("disabled", disabled);
		}
		if (footerClass != null) {
			_component.setValueExpression("footerClass", footerClass);
		}
		if (headerClass != null) {
			_component.setValueExpression("headerClass", headerClass);
		}
		if (icon != null) {
			_component.setValueExpression("icon", icon);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (label != null) {
			_component.setValueExpression("label", label);
		}
		if (positionLeft != null) {
			_component.setValueExpression("positionLeft", positionLeft);
		}
		if (positionTop != null) {
			_component.setValueExpression("positionTop", positionTop);
		}
		if (relativeTo != null) {
			_component.setValueExpression("relativeTo", relativeTo);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
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
		binding = null;
		disabled = null;
		footerClass = null;
		headerClass = null;
		icon = null;
		id = null;
		label = null;
		positionLeft = null;
		positionTop = null;
		relativeTo = null;
		rendered = null;
		style = null;
		styleClass = null;
	}
}