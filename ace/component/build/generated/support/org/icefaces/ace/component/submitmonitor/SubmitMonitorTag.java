package org.icefaces.ace.component.submitmonitor;

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
public class SubmitMonitorTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.SubmitMonitorRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.SubmitMonitor";
	}
	private javax.el.ValueExpression activeLabel;
	public void setActiveLabel(javax.el.ValueExpression activeLabel) {
		this.activeLabel = activeLabel;
	}
	private javax.el.ValueExpression autoCenter;
	public void setAutoCenter(javax.el.ValueExpression autoCenter) {
		this.autoCenter = autoCenter;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression blockUI;
	public void setBlockUI(javax.el.ValueExpression blockUI) {
		this.blockUI = blockUI;
	}
	private javax.el.ValueExpression For;
	public void setFor(javax.el.ValueExpression For) {
		this.For = For;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression idleLabel;
	public void setIdleLabel(javax.el.ValueExpression idleLabel) {
		this.idleLabel = idleLabel;
	}
	private javax.el.ValueExpression networkErrorLabel;
	public void setNetworkErrorLabel(javax.el.ValueExpression networkErrorLabel) {
		this.networkErrorLabel = networkErrorLabel;
	}
	private javax.el.ValueExpression preload;
	public void setPreload(javax.el.ValueExpression preload) {
		this.preload = preload;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression serverErrorLabel;
	public void setServerErrorLabel(javax.el.ValueExpression serverErrorLabel) {
		this.serverErrorLabel = serverErrorLabel;
	}
	private javax.el.ValueExpression sessionExpiredLabel;
	public void setSessionExpiredLabel(javax.el.ValueExpression sessionExpiredLabel) {
		this.sessionExpiredLabel = sessionExpiredLabel;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.submitmonitor.SubmitMonitorBase _component = null;
		try {
			_component = (org.icefaces.ace.component.submitmonitor.SubmitMonitorBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.submitmonitor.SubmitMonitorBase");
		}
		if (activeLabel != null) {
			_component.setValueExpression("activeLabel", activeLabel);
		}
		if (autoCenter != null) {
			_component.setValueExpression("autoCenter", autoCenter);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (blockUI != null) {
			_component.setValueExpression("blockUI", blockUI);
		}
		if (For != null) {
			_component.setValueExpression("for", For);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (idleLabel != null) {
			_component.setValueExpression("idleLabel", idleLabel);
		}
		if (networkErrorLabel != null) {
			_component.setValueExpression("networkErrorLabel", networkErrorLabel);
		}
		if (preload != null) {
			_component.setValueExpression("preload", preload);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (serverErrorLabel != null) {
			_component.setValueExpression("serverErrorLabel", serverErrorLabel);
		}
		if (sessionExpiredLabel != null) {
			_component.setValueExpression("sessionExpiredLabel", sessionExpiredLabel);
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
		activeLabel = null;
		autoCenter = null;
		binding = null;
		blockUI = null;
		For = null;
		id = null;
		idleLabel = null;
		networkErrorLabel = null;
		preload = null;
		rendered = null;
		serverErrorLabel = null;
		sessionExpiredLabel = null;
		styleClass = null;
	}
}