package org.icefaces.ace.component.column;

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
public class ColumnTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return null;
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.Column";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression colspan;
	public void setColspan(javax.el.ValueExpression colspan) {
		this.colspan = colspan;
	}
	private javax.el.ValueExpression configurable;
	public void setConfigurable(javax.el.ValueExpression configurable) {
		this.configurable = configurable;
	}
	private javax.el.ValueExpression filterBy;
	public void setFilterBy(javax.el.ValueExpression filterBy) {
		this.filterBy = filterBy;
	}
	private javax.el.ValueExpression filterMatchMode;
	public void setFilterMatchMode(javax.el.ValueExpression filterMatchMode) {
		this.filterMatchMode = filterMatchMode;
	}
	private javax.el.ValueExpression filterOptions;
	public void setFilterOptions(javax.el.ValueExpression filterOptions) {
		this.filterOptions = filterOptions;
	}
	private javax.el.ValueExpression filterStyle;
	public void setFilterStyle(javax.el.ValueExpression filterStyle) {
		this.filterStyle = filterStyle;
	}
	private javax.el.ValueExpression filterStyleClass;
	public void setFilterStyleClass(javax.el.ValueExpression filterStyleClass) {
		this.filterStyleClass = filterStyleClass;
	}
	private javax.el.ValueExpression filterValue;
	public void setFilterValue(javax.el.ValueExpression filterValue) {
		this.filterValue = filterValue;
	}
	private javax.el.ValueExpression footerText;
	public void setFooterText(javax.el.ValueExpression footerText) {
		this.footerText = footerText;
	}
	private javax.el.ValueExpression groupBy;
	public void setGroupBy(javax.el.ValueExpression groupBy) {
		this.groupBy = groupBy;
	}
	private javax.el.ValueExpression headerText;
	public void setHeaderText(javax.el.ValueExpression headerText) {
		this.headerText = headerText;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression pinningOrder;
	public void setPinningOrder(javax.el.ValueExpression pinningOrder) {
		this.pinningOrder = pinningOrder;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression reorderable;
	public void setReorderable(javax.el.ValueExpression reorderable) {
		this.reorderable = reorderable;
	}
	private javax.el.ValueExpression rowspan;
	public void setRowspan(javax.el.ValueExpression rowspan) {
		this.rowspan = rowspan;
	}
	private javax.el.ValueExpression sortAscending;
	public void setSortAscending(javax.el.ValueExpression sortAscending) {
		this.sortAscending = sortAscending;
	}
	private javax.el.ValueExpression sortBy;
	public void setSortBy(javax.el.ValueExpression sortBy) {
		this.sortBy = sortBy;
	}
	private javax.el.ValueExpression sortFunction;
	public void setSortFunction(javax.el.ValueExpression sortFunction) {
		this.sortFunction = sortFunction;
	}
	private javax.el.ValueExpression sortPriority;
	public void setSortPriority(javax.el.ValueExpression sortPriority) {
		this.sortPriority = sortPriority;
	}
	private javax.el.ValueExpression stacked;
	public void setStacked(javax.el.ValueExpression stacked) {
		this.stacked = stacked;
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
		org.icefaces.ace.component.column.ColumnBase _component = null;
		try {
			_component = (org.icefaces.ace.component.column.ColumnBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.column.ColumnBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (colspan != null) {
			_component.setValueExpression("colspan", colspan);
		}
		if (configurable != null) {
			_component.setValueExpression("configurable", configurable);
		}
		if (filterBy != null) {
			_component.setValueExpression("filterBy", filterBy);
		}
		if (filterMatchMode != null) {
			_component.setValueExpression("filterMatchMode", filterMatchMode);
		}
		if (filterOptions != null) {
			_component.setValueExpression("filterOptions", filterOptions);
		}
		if (filterStyle != null) {
			_component.setValueExpression("filterStyle", filterStyle);
		}
		if (filterStyleClass != null) {
			_component.setValueExpression("filterStyleClass", filterStyleClass);
		}
		if (filterValue != null) {
			_component.setValueExpression("filterValue", filterValue);
		}
		if (footerText != null) {
			_component.setValueExpression("footerText", footerText);
		}
		if (groupBy != null) {
			_component.setValueExpression("groupBy", groupBy);
		}
		if (headerText != null) {
			_component.setValueExpression("headerText", headerText);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (pinningOrder != null) {
			_component.setValueExpression("pinningOrder", pinningOrder);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (reorderable != null) {
			_component.setValueExpression("reorderable", reorderable);
		}
		if (rowspan != null) {
			_component.setValueExpression("rowspan", rowspan);
		}
		if (sortAscending != null) {
			_component.setValueExpression("sortAscending", sortAscending);
		}
		if (sortBy != null) {
			_component.setValueExpression("sortBy", sortBy);
		}
		if (sortFunction != null) {
			_component.setValueExpression("sortFunction", sortFunction);
		}
		if (sortPriority != null) {
			_component.setValueExpression("sortPriority", sortPriority);
		}
		if (stacked != null) {
			_component.setValueExpression("stacked", stacked);
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
		colspan = null;
		configurable = null;
		filterBy = null;
		filterMatchMode = null;
		filterOptions = null;
		filterStyle = null;
		filterStyleClass = null;
		filterValue = null;
		footerText = null;
		groupBy = null;
		headerText = null;
		id = null;
		pinningOrder = null;
		rendered = null;
		reorderable = null;
		rowspan = null;
		sortAscending = null;
		sortBy = null;
		sortFunction = null;
		sortPriority = null;
		stacked = null;
		style = null;
		styleClass = null;
	}
}