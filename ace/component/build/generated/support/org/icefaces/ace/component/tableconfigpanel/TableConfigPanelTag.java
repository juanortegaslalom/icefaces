package org.icefaces.ace.component.tableconfigpanel;

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
public class TableConfigPanelTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.TableConfigPanelRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.TableConfigPanel";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression columnNameConfigurable;
	public void setColumnNameConfigurable(javax.el.ValueExpression columnNameConfigurable) {
		this.columnNameConfigurable = columnNameConfigurable;
	}
	private javax.el.ValueExpression columnOrderingConfigurable;
	public void setColumnOrderingConfigurable(javax.el.ValueExpression columnOrderingConfigurable) {
		this.columnOrderingConfigurable = columnOrderingConfigurable;
	}
	private javax.el.ValueExpression columnSortingConfigurable;
	public void setColumnSortingConfigurable(javax.el.ValueExpression columnSortingConfigurable) {
		this.columnSortingConfigurable = columnSortingConfigurable;
	}
	private javax.el.ValueExpression columnVisibilityConfigurable;
	public void setColumnVisibilityConfigurable(javax.el.ValueExpression columnVisibilityConfigurable) {
		this.columnVisibilityConfigurable = columnVisibilityConfigurable;
	}
	private javax.el.ValueExpression dragHandle;
	public void setDragHandle(javax.el.ValueExpression dragHandle) {
		this.dragHandle = dragHandle;
	}
	private javax.el.ValueExpression forTarget;
	public void setFor(javax.el.ValueExpression forTarget) {
		this.forTarget = forTarget;
	}
	private javax.el.ValueExpression hideDisabledRows;
	public void setHideDisabledRows(javax.el.ValueExpression hideDisabledRows) {
		this.hideDisabledRows = hideDisabledRows;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression inColumnId;
	public void setInColumnId(javax.el.ValueExpression inColumnId) {
		this.inColumnId = inColumnId;
	}
	private javax.el.ValueExpression modal;
	public void setModal(javax.el.ValueExpression modal) {
		this.modal = modal;
	}
	private javax.el.ValueExpression offsetLeft;
	public void setOffsetLeft(javax.el.ValueExpression offsetLeft) {
		this.offsetLeft = offsetLeft;
	}
	private javax.el.ValueExpression offsetTop;
	public void setOffsetTop(javax.el.ValueExpression offsetTop) {
		this.offsetTop = offsetTop;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression type;
	public void setType(javax.el.ValueExpression type) {
		this.type = type;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.tableconfigpanel.TableConfigPanelBase _component = null;
		try {
			_component = (org.icefaces.ace.component.tableconfigpanel.TableConfigPanelBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.tableconfigpanel.TableConfigPanelBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (columnNameConfigurable != null) {
			_component.setValueExpression("columnNameConfigurable", columnNameConfigurable);
		}
		if (columnOrderingConfigurable != null) {
			_component.setValueExpression("columnOrderingConfigurable", columnOrderingConfigurable);
		}
		if (columnSortingConfigurable != null) {
			_component.setValueExpression("columnSortingConfigurable", columnSortingConfigurable);
		}
		if (columnVisibilityConfigurable != null) {
			_component.setValueExpression("columnVisibilityConfigurable", columnVisibilityConfigurable);
		}
		if (dragHandle != null) {
			_component.setValueExpression("dragHandle", dragHandle);
		}
		if (forTarget != null) {
			_component.setValueExpression("for", forTarget);
		}
		if (hideDisabledRows != null) {
			_component.setValueExpression("hideDisabledRows", hideDisabledRows);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (inColumnId != null) {
			_component.setValueExpression("inColumnId", inColumnId);
		}
		if (modal != null) {
			_component.setValueExpression("modal", modal);
		}
		if (offsetLeft != null) {
			_component.setValueExpression("offsetLeft", offsetLeft);
		}
		if (offsetTop != null) {
			_component.setValueExpression("offsetTop", offsetTop);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (type != null) {
			_component.setValueExpression("type", type);
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
		columnNameConfigurable = null;
		columnOrderingConfigurable = null;
		columnSortingConfigurable = null;
		columnVisibilityConfigurable = null;
		dragHandle = null;
		forTarget = null;
		hideDisabledRows = null;
		id = null;
		inColumnId = null;
		modal = null;
		offsetLeft = null;
		offsetTop = null;
		rendered = null;
		type = null;
	}
}