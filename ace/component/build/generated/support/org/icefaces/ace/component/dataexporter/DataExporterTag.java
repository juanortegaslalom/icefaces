package org.icefaces.ace.component.dataexporter;

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
public class DataExporterTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.DataExporterRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.DataExporter";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression customExporter;
	public void setCustomExporter(javax.el.ValueExpression customExporter) {
		this.customExporter = customExporter;
	}
	private javax.el.ValueExpression encoding;
	public void setEncoding(javax.el.ValueExpression encoding) {
		this.encoding = encoding;
	}
	private javax.el.ValueExpression excludeColumns;
	public void setExcludeColumns(javax.el.ValueExpression excludeColumns) {
		this.excludeColumns = excludeColumns;
	}
	private javax.el.ValueExpression expandedOnly;
	public void setExpandedOnly(javax.el.ValueExpression expandedOnly) {
		this.expandedOnly = expandedOnly;
	}
	private javax.el.ValueExpression fileName;
	public void setFileName(javax.el.ValueExpression fileName) {
		this.fileName = fileName;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression includeFooters;
	public void setIncludeFooters(javax.el.ValueExpression includeFooters) {
		this.includeFooters = includeFooters;
	}
	private javax.el.ValueExpression includeHeaders;
	public void setIncludeHeaders(javax.el.ValueExpression includeHeaders) {
		this.includeHeaders = includeHeaders;
	}
	private javax.el.ValueExpression label;
	public void setLabel(javax.el.ValueExpression label) {
		this.label = label;
	}
	private javax.el.ValueExpression pageOnly;
	public void setPageOnly(javax.el.ValueExpression pageOnly) {
		this.pageOnly = pageOnly;
	}
	private javax.el.MethodExpression postProcessor;
	public void setPostProcessor(javax.el.MethodExpression postProcessor) {
		this.postProcessor = postProcessor;
	}
	private javax.el.MethodExpression preProcessor;
	public void setPreProcessor(javax.el.MethodExpression preProcessor) {
		this.preProcessor = preProcessor;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression selectedRowsOnly;
	public void setSelectedRowsOnly(javax.el.ValueExpression selectedRowsOnly) {
		this.selectedRowsOnly = selectedRowsOnly;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
	}
	private javax.el.ValueExpression target;
	public void setTarget(javax.el.ValueExpression target) {
		this.target = target;
	}
	private javax.el.ValueExpression type;
	public void setType(javax.el.ValueExpression type) {
		this.type = type;
	}
	private javax.el.ValueExpression userColumnOrder;
	public void setUserColumnOrder(javax.el.ValueExpression userColumnOrder) {
		this.userColumnOrder = userColumnOrder;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.dataexporter.DataExporterBase _component = null;
		try {
			_component = (org.icefaces.ace.component.dataexporter.DataExporterBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.dataexporter.DataExporterBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (customExporter != null) {
			_component.setValueExpression("customExporter", customExporter);
		}
		if (encoding != null) {
			_component.setValueExpression("encoding", encoding);
		}
		if (excludeColumns != null) {
			_component.setValueExpression("excludeColumns", excludeColumns);
		}
		if (expandedOnly != null) {
			_component.setValueExpression("expandedOnly", expandedOnly);
		}
		if (fileName != null) {
			_component.setValueExpression("fileName", fileName);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (includeFooters != null) {
			_component.setValueExpression("includeFooters", includeFooters);
		}
		if (includeHeaders != null) {
			_component.setValueExpression("includeHeaders", includeHeaders);
		}
		if (label != null) {
			_component.setValueExpression("label", label);
		}
		if (pageOnly != null) {
			_component.setValueExpression("pageOnly", pageOnly);
		}
		if (postProcessor != null) {
			_component.setPostProcessor(postProcessor);
		}
		if (preProcessor != null) {
			_component.setPreProcessor(preProcessor);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (selectedRowsOnly != null) {
			_component.setValueExpression("selectedRowsOnly", selectedRowsOnly);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (styleClass != null) {
			_component.setValueExpression("styleClass", styleClass);
		}
		if (target != null) {
			_component.setValueExpression("target", target);
		}
		if (type != null) {
			_component.setValueExpression("type", type);
		}
		if (userColumnOrder != null) {
			_component.setValueExpression("userColumnOrder", userColumnOrder);
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
		customExporter = null;
		encoding = null;
		excludeColumns = null;
		expandedOnly = null;
		fileName = null;
		id = null;
		includeFooters = null;
		includeHeaders = null;
		label = null;
		pageOnly = null;
		postProcessor = null;
		preProcessor = null;
		rendered = null;
		selectedRowsOnly = null;
		style = null;
		styleClass = null;
		target = null;
		type = null;
		userColumnOrder = null;
	}
}