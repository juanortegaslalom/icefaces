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
public class TabSetTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.TabSetRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.TabSet";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression cancelOnInvalid;
	public void setCancelOnInvalid(javax.el.ValueExpression cancelOnInvalid) {
		this.cancelOnInvalid = cancelOnInvalid;
	}
	private javax.el.ValueExpression clientSide;
	public void setClientSide(javax.el.ValueExpression clientSide) {
		this.clientSide = clientSide;
	}
	private javax.el.ValueExpression disabled;
	public void setDisabled(javax.el.ValueExpression disabled) {
		this.disabled = disabled;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression immediate;
	public void setImmediate(javax.el.ValueExpression immediate) {
		this.immediate = immediate;
	}
	private javax.el.ValueExpression orientation;
	public void setOrientation(javax.el.ValueExpression orientation) {
		this.orientation = orientation;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression selectedIndex;
	public void setSelectedIndex(javax.el.ValueExpression selectedIndex) {
		this.selectedIndex = selectedIndex;
	}
	private javax.el.ValueExpression showEffect;
	public void setShowEffect(javax.el.ValueExpression showEffect) {
		this.showEffect = showEffect;
	}
	private javax.el.ValueExpression showEffectLength;
	public void setShowEffectLength(javax.el.ValueExpression showEffectLength) {
		this.showEffectLength = showEffectLength;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
	}
	private javax.el.MethodExpression tabChangeListener;
	public void setTabChangeListener(javax.el.MethodExpression tabChangeListener) {
		this.tabChangeListener = tabChangeListener;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.tabset.TabSetBase _component = null;
		try {
			_component = (org.icefaces.ace.component.tabset.TabSetBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.tabset.TabSetBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (cancelOnInvalid != null) {
			_component.setValueExpression("cancelOnInvalid", cancelOnInvalid);
		}
		if (clientSide != null) {
			_component.setValueExpression("clientSide", clientSide);
		}
		if (disabled != null) {
			_component.setValueExpression("disabled", disabled);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (immediate != null) {
			_component.setValueExpression("immediate", immediate);
		}
		if (orientation != null) {
			_component.setValueExpression("orientation", orientation);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (selectedIndex != null) {
			_component.setValueExpression("selectedIndex", selectedIndex);
		}
		if (showEffect != null) {
			_component.setValueExpression("showEffect", showEffect);
		}
		if (showEffectLength != null) {
			_component.setValueExpression("showEffectLength", showEffectLength);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (styleClass != null) {
			_component.setValueExpression("styleClass", styleClass);
		}
		if (tabChangeListener != null) {
			_component.setTabChangeListener(tabChangeListener);
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
		cancelOnInvalid = null;
		clientSide = null;
		disabled = null;
		id = null;
		immediate = null;
		orientation = null;
		rendered = null;
		selectedIndex = null;
		showEffect = null;
		showEffectLength = null;
		style = null;
		styleClass = null;
		tabChangeListener = null;
	}
}