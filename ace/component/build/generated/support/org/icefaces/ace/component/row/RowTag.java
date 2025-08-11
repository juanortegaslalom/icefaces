package org.icefaces.ace.component.row;

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
public class RowTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return null;
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.Row";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression condition;
	public void setCondition(javax.el.ValueExpression condition) {
		this.condition = condition;
	}
	private javax.el.ValueExpression groupBy;
	public void setGroupBy(javax.el.ValueExpression groupBy) {
		this.groupBy = groupBy;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression interval;
	public void setInterval(javax.el.ValueExpression interval) {
		this.interval = interval;
	}
	private javax.el.ValueExpression pos;
	public void setPos(javax.el.ValueExpression pos) {
		this.pos = pos;
	}
	private javax.el.ValueExpression predicate;
	public void setPredicate(javax.el.ValueExpression predicate) {
		this.predicate = predicate;
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
		org.icefaces.ace.component.row.RowBase _component = null;
		try {
			_component = (org.icefaces.ace.component.row.RowBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.row.RowBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (condition != null) {
			_component.setValueExpression("condition", condition);
		}
		if (groupBy != null) {
			_component.setValueExpression("groupBy", groupBy);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (interval != null) {
			_component.setValueExpression("interval", interval);
		}
		if (pos != null) {
			_component.setValueExpression("pos", pos);
		}
		if (predicate != null) {
			_component.setValueExpression("predicate", predicate);
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
		condition = null;
		groupBy = null;
		id = null;
		interval = null;
		pos = null;
		predicate = null;
		rendered = null;
		style = null;
		styleClass = null;
	}
}