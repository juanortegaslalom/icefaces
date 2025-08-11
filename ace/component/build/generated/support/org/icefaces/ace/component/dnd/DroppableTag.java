package org.icefaces.ace.component.dnd;

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
public class DroppableTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.DroppableRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.Droppable";
	}
	private javax.el.ValueExpression accept;
	public void setAccept(javax.el.ValueExpression accept) {
		this.accept = accept;
	}
	private javax.el.ValueExpression activeStyleClass;
	public void setActiveStyleClass(javax.el.ValueExpression activeStyleClass) {
		this.activeStyleClass = activeStyleClass;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression datasource;
	public void setDatasource(javax.el.ValueExpression datasource) {
		this.datasource = datasource;
	}
	private javax.el.ValueExpression disabled;
	public void setDisabled(javax.el.ValueExpression disabled) {
		this.disabled = disabled;
	}
	private javax.el.MethodExpression dropListener;
	public void setDropListener(javax.el.MethodExpression dropListener) {
		this.dropListener = dropListener;
	}
	private javax.el.ValueExpression forValue;
	public void setFor(javax.el.ValueExpression forValue) {
		this.forValue = forValue;
	}
	private javax.el.ValueExpression hoverStyleClass;
	public void setHoverStyleClass(javax.el.ValueExpression hoverStyleClass) {
		this.hoverStyleClass = hoverStyleClass;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression scope;
	public void setScope(javax.el.ValueExpression scope) {
		this.scope = scope;
	}
	private javax.el.ValueExpression tolerance;
	public void setTolerance(javax.el.ValueExpression tolerance) {
		this.tolerance = tolerance;
	}
	private javax.el.ValueExpression widgetVar;
	public void setWidgetVar(javax.el.ValueExpression widgetVar) {
		this.widgetVar = widgetVar;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.dnd.DroppableBase _component = null;
		try {
			_component = (org.icefaces.ace.component.dnd.DroppableBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.dnd.DroppableBase");
		}
		if (accept != null) {
			_component.setValueExpression("accept", accept);
		}
		if (activeStyleClass != null) {
			_component.setValueExpression("activeStyleClass", activeStyleClass);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (datasource != null) {
			_component.setValueExpression("datasource", datasource);
		}
		if (disabled != null) {
			_component.setValueExpression("disabled", disabled);
		}
		if (dropListener != null) {
			_component.setDropListener(dropListener);
		}
		if (forValue != null) {
			_component.setValueExpression("for", forValue);
		}
		if (hoverStyleClass != null) {
			_component.setValueExpression("hoverStyleClass", hoverStyleClass);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (scope != null) {
			_component.setValueExpression("scope", scope);
		}
		if (tolerance != null) {
			_component.setValueExpression("tolerance", tolerance);
		}
		if (widgetVar != null) {
			_component.setValueExpression("widgetVar", widgetVar);
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
		accept = null;
		activeStyleClass = null;
		binding = null;
		datasource = null;
		disabled = null;
		dropListener = null;
		forValue = null;
		hoverStyleClass = null;
		id = null;
		rendered = null;
		scope = null;
		tolerance = null;
		widgetVar = null;
	}
}