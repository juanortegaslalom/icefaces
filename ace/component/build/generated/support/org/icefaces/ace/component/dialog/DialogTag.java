package org.icefaces.ace.component.dialog;

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
public class DialogTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.DialogRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.Dialog";
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
	private javax.el.ValueExpression dialogPosition;
	public void setDialogPosition(javax.el.ValueExpression dialogPosition) {
		this.dialogPosition = dialogPosition;
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
	private javax.el.ValueExpression minHeight;
	public void setMinHeight(javax.el.ValueExpression minHeight) {
		this.minHeight = minHeight;
	}
	private javax.el.ValueExpression minWidth;
	public void setMinWidth(javax.el.ValueExpression minWidth) {
		this.minWidth = minWidth;
	}
	private javax.el.ValueExpression modal;
	public void setModal(javax.el.ValueExpression modal) {
		this.modal = modal;
	}
	private javax.el.ValueExpression onHide;
	public void setOnHide(javax.el.ValueExpression onHide) {
		this.onHide = onHide;
	}
	private javax.el.ValueExpression onShow;
	public void setOnShow(javax.el.ValueExpression onShow) {
		this.onShow = onShow;
	}
	private javax.el.ValueExpression position;
	public void setPosition(javax.el.ValueExpression position) {
		this.position = position;
	}
	private javax.el.ValueExpression relativePosition;
	public void setRelativePosition(javax.el.ValueExpression relativePosition) {
		this.relativePosition = relativePosition;
	}
	private javax.el.ValueExpression relativeTo;
	public void setRelativeTo(javax.el.ValueExpression relativeTo) {
		this.relativeTo = relativeTo;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression resizable;
	public void setResizable(javax.el.ValueExpression resizable) {
		this.resizable = resizable;
	}
	private javax.el.ValueExpression showEffect;
	public void setShowEffect(javax.el.ValueExpression showEffect) {
		this.showEffect = showEffect;
	}
	private javax.el.ValueExpression showHeader;
	public void setShowHeader(javax.el.ValueExpression showHeader) {
		this.showHeader = showHeader;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
	}
	private javax.el.ValueExpression visible;
	public void setVisible(javax.el.ValueExpression visible) {
		this.visible = visible;
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
		org.icefaces.ace.component.dialog.DialogBase _component = null;
		try {
			_component = (org.icefaces.ace.component.dialog.DialogBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.dialog.DialogBase");
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
		if (dialogPosition != null) {
			_component.setValueExpression("dialogPosition", dialogPosition);
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
		if (minHeight != null) {
			_component.setValueExpression("minHeight", minHeight);
		}
		if (minWidth != null) {
			_component.setValueExpression("minWidth", minWidth);
		}
		if (modal != null) {
			_component.setValueExpression("modal", modal);
		}
		if (onHide != null) {
			_component.setValueExpression("onHide", onHide);
		}
		if (onShow != null) {
			_component.setValueExpression("onShow", onShow);
		}
		if (position != null) {
			_component.setValueExpression("position", position);
		}
		if (relativePosition != null) {
			_component.setValueExpression("relativePosition", relativePosition);
		}
		if (relativeTo != null) {
			_component.setValueExpression("relativeTo", relativeTo);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (resizable != null) {
			_component.setValueExpression("resizable", resizable);
		}
		if (showEffect != null) {
			_component.setValueExpression("showEffect", showEffect);
		}
		if (showHeader != null) {
			_component.setValueExpression("showHeader", showHeader);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (styleClass != null) {
			_component.setValueExpression("styleClass", styleClass);
		}
		if (visible != null) {
			_component.setValueExpression("visible", visible);
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
		dialogPosition = null;
		dragHandle = null;
		draggable = null;
		header = null;
		height = null;
		hideEffect = null;
		id = null;
		minHeight = null;
		minWidth = null;
		modal = null;
		onHide = null;
		onShow = null;
		position = null;
		relativePosition = null;
		relativeTo = null;
		rendered = null;
		resizable = null;
		showEffect = null;
		showHeader = null;
		style = null;
		styleClass = null;
		visible = null;
		widgetVar = null;
		width = null;
		zindex = null;
	}
}