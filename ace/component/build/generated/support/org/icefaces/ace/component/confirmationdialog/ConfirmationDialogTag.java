package org.icefaces.ace.component.confirmationdialog;

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
public class ConfirmationDialogTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.ConfirmationDialogRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.ConfirmationDialog";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression closable;
	public void setClosable(javax.el.ValueExpression closable) {
		this.closable = closable;
	}
	private javax.el.ValueExpression closeOnEscape;
	public void setCloseOnEscape(javax.el.ValueExpression closeOnEscape) {
		this.closeOnEscape = closeOnEscape;
	}
	private javax.el.ValueExpression dragHandle;
	public void setDragHandle(javax.el.ValueExpression dragHandle) {
		this.dragHandle = dragHandle;
	}
	private javax.el.ValueExpression draggable;
	public void setDraggable(javax.el.ValueExpression draggable) {
		this.draggable = draggable;
	}
	private javax.el.ValueExpression header;
	public void setHeader(javax.el.ValueExpression header) {
		this.header = header;
	}
	private javax.el.ValueExpression height;
	public void setHeight(javax.el.ValueExpression height) {
		this.height = height;
	}
	private javax.el.ValueExpression hideEffect;
	public void setHideEffect(javax.el.ValueExpression hideEffect) {
		this.hideEffect = hideEffect;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression message;
	public void setMessage(javax.el.ValueExpression message) {
		this.message = message;
	}
	private javax.el.ValueExpression modal;
	public void setModal(javax.el.ValueExpression modal) {
		this.modal = modal;
	}
	private javax.el.ValueExpression position;
	public void setPosition(javax.el.ValueExpression position) {
		this.position = position;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression severity;
	public void setSeverity(javax.el.ValueExpression severity) {
		this.severity = severity;
	}
	private javax.el.ValueExpression showEffect;
	public void setShowEffect(javax.el.ValueExpression showEffect) {
		this.showEffect = showEffect;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
	}
	private javax.el.ValueExpression widgetVar;
	public void setWidgetVar(javax.el.ValueExpression widgetVar) {
		this.widgetVar = widgetVar;
	}
	private javax.el.ValueExpression width;
	public void setWidth(javax.el.ValueExpression width) {
		this.width = width;
	}
	private javax.el.ValueExpression zindex;
	public void setZindex(javax.el.ValueExpression zindex) {
		this.zindex = zindex;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.confirmationdialog.ConfirmationDialogBase _component = null;
		try {
			_component = (org.icefaces.ace.component.confirmationdialog.ConfirmationDialogBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.confirmationdialog.ConfirmationDialogBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (closable != null) {
			_component.setValueExpression("closable", closable);
		}
		if (closeOnEscape != null) {
			_component.setValueExpression("closeOnEscape", closeOnEscape);
		}
		if (dragHandle != null) {
			_component.setValueExpression("dragHandle", dragHandle);
		}
		if (draggable != null) {
			_component.setValueExpression("draggable", draggable);
		}
		if (header != null) {
			_component.setValueExpression("header", header);
		}
		if (height != null) {
			_component.setValueExpression("height", height);
		}
		if (hideEffect != null) {
			_component.setValueExpression("hideEffect", hideEffect);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (message != null) {
			_component.setValueExpression("message", message);
		}
		if (modal != null) {
			_component.setValueExpression("modal", modal);
		}
		if (position != null) {
			_component.setValueExpression("position", position);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (severity != null) {
			_component.setValueExpression("severity", severity);
		}
		if (showEffect != null) {
			_component.setValueExpression("showEffect", showEffect);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (styleClass != null) {
			_component.setValueExpression("styleClass", styleClass);
		}
		if (widgetVar != null) {
			_component.setValueExpression("widgetVar", widgetVar);
		}
		if (width != null) {
			_component.setValueExpression("width", width);
		}
		if (zindex != null) {
			_component.setValueExpression("zindex", zindex);
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
		closable = null;
		closeOnEscape = null;
		dragHandle = null;
		draggable = null;
		header = null;
		height = null;
		hideEffect = null;
		id = null;
		message = null;
		modal = null;
		position = null;
		rendered = null;
		severity = null;
		showEffect = null;
		style = null;
		styleClass = null;
		widgetVar = null;
		width = null;
		zindex = null;
	}
}