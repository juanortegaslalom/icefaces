package org.icefaces.ace.component.datatable;

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
public class DataTableTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.DataTableRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.DataTable";
	}
	private javax.el.ValueExpression allColumnClicks;
	public void setAllColumnClicks(javax.el.ValueExpression allColumnClicks) {
		this.allColumnClicks = allColumnClicks;
	}
	private javax.el.ValueExpression alwaysExecuteContents;
	public void setAlwaysExecuteContents(javax.el.ValueExpression alwaysExecuteContents) {
		this.alwaysExecuteContents = alwaysExecuteContents;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression clickableHeaderSorting;
	public void setClickableHeaderSorting(javax.el.ValueExpression clickableHeaderSorting) {
		this.clickableHeaderSorting = clickableHeaderSorting;
	}
	private javax.el.ValueExpression columnOrdering;
	public void setColumnOrdering(javax.el.ValueExpression columnOrdering) {
		this.columnOrdering = columnOrdering;
	}
	private javax.el.ValueExpression columnPinning;
	public void setColumnPinning(javax.el.ValueExpression columnPinning) {
		this.columnPinning = columnPinning;
	}
	private javax.el.ValueExpression columnPinningControlsInHeader;
	public void setColumnPinningControlsInHeader(javax.el.ValueExpression columnPinningControlsInHeader) {
		this.columnPinningControlsInHeader = columnPinningControlsInHeader;
	}
	private javax.el.ValueExpression constantRefilter;
	public void setConstantRefilter(javax.el.ValueExpression constantRefilter) {
		this.constantRefilter = constantRefilter;
	}
	private javax.el.ValueExpression currentPageReportTemplate;
	public void setCurrentPageReportTemplate(javax.el.ValueExpression currentPageReportTemplate) {
		this.currentPageReportTemplate = currentPageReportTemplate;
	}
	private javax.el.ValueExpression disabled;
	public void setDisabled(javax.el.ValueExpression disabled) {
		this.disabled = disabled;
	}
	private javax.el.ValueExpression doubleClickSelect;
	public void setDoubleClickSelect(javax.el.ValueExpression doubleClickSelect) {
		this.doubleClickSelect = doubleClickSelect;
	}
	private javax.el.ValueExpression emptyMessage;
	public void setEmptyMessage(javax.el.ValueExpression emptyMessage) {
		this.emptyMessage = emptyMessage;
	}
	private javax.el.ValueExpression filterEvent;
	public void setFilterEvent(javax.el.ValueExpression filterEvent) {
		this.filterEvent = filterEvent;
	}
	private javax.el.MethodExpression filterListener;
	public void setFilterListener(javax.el.MethodExpression filterListener) {
		this.filterListener = filterListener;
	}
	private javax.el.ValueExpression filterValue;
	public void setFilterValue(javax.el.ValueExpression filterValue) {
		this.filterValue = filterValue;
	}
	private javax.el.ValueExpression first;
	public void setFirst(javax.el.ValueExpression first) {
		this.first = first;
	}
	private javax.el.ValueExpression groupedFilterResults;
	public void setGroupedFilterResults(javax.el.ValueExpression groupedFilterResults) {
		this.groupedFilterResults = groupedFilterResults;
	}
	private javax.el.ValueExpression height;
	public void setHeight(javax.el.ValueExpression height) {
		this.height = height;
	}
	private javax.el.ValueExpression hiddenScrollableSizing;
	public void setHiddenScrollableSizing(javax.el.ValueExpression hiddenScrollableSizing) {
		this.hiddenScrollableSizing = hiddenScrollableSizing;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression lazy;
	public void setLazy(javax.el.ValueExpression lazy) {
		this.lazy = lazy;
	}
	private javax.el.ValueExpression liveScroll;
	public void setLiveScroll(javax.el.ValueExpression liveScroll) {
		this.liveScroll = liveScroll;
	}
	private javax.el.ValueExpression page;
	public void setPage(javax.el.ValueExpression page) {
		this.page = page;
	}
	private javax.el.ValueExpression pageCount;
	public void setPageCount(javax.el.ValueExpression pageCount) {
		this.pageCount = pageCount;
	}
	private javax.el.ValueExpression paginator;
	public void setPaginator(javax.el.ValueExpression paginator) {
		this.paginator = paginator;
	}
	private javax.el.ValueExpression paginatorAlwaysVisible;
	public void setPaginatorAlwaysVisible(javax.el.ValueExpression paginatorAlwaysVisible) {
		this.paginatorAlwaysVisible = paginatorAlwaysVisible;
	}
	private javax.el.ValueExpression paginatorPosition;
	public void setPaginatorPosition(javax.el.ValueExpression paginatorPosition) {
		this.paginatorPosition = paginatorPosition;
	}
	private javax.el.ValueExpression paginatorTemplate;
	public void setPaginatorTemplate(javax.el.ValueExpression paginatorTemplate) {
		this.paginatorTemplate = paginatorTemplate;
	}
	private javax.el.ValueExpression renderRowTabindex;
	public void setRenderRowTabindex(javax.el.ValueExpression renderRowTabindex) {
		this.renderRowTabindex = renderRowTabindex;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression reorderableColumns;
	public void setReorderableColumns(javax.el.ValueExpression reorderableColumns) {
		this.reorderableColumns = reorderableColumns;
	}
	private javax.el.ValueExpression resizableColumns;
	public void setResizableColumns(javax.el.ValueExpression resizableColumns) {
		this.resizableColumns = resizableColumns;
	}
	private javax.el.ValueExpression rowIndex;
	public void setRowIndex(javax.el.ValueExpression rowIndex) {
		this.rowIndex = rowIndex;
	}
	private javax.el.ValueExpression rowIndexVar;
	public void setRowIndexVar(javax.el.ValueExpression rowIndexVar) {
		this.rowIndexVar = rowIndexVar;
	}
	private javax.el.MethodExpression rowSelectListener;
	public void setRowSelectListener(javax.el.MethodExpression rowSelectListener) {
		this.rowSelectListener = rowSelectListener;
	}
	private javax.el.ValueExpression rowStateVar;
	public void setRowStateVar(javax.el.ValueExpression rowStateVar) {
		this.rowStateVar = rowStateVar;
	}
	private javax.el.ValueExpression rowStyleClass;
	public void setRowStyleClass(javax.el.ValueExpression rowStyleClass) {
		this.rowStyleClass = rowStyleClass;
	}
	private javax.el.MethodExpression rowUnselectListener;
	public void setRowUnselectListener(javax.el.MethodExpression rowUnselectListener) {
		this.rowUnselectListener = rowUnselectListener;
	}
	private javax.el.ValueExpression rows;
	public void setRows(javax.el.ValueExpression rows) {
		this.rows = rows;
	}
	private javax.el.ValueExpression rowsPerPageTemplate;
	public void setRowsPerPageTemplate(javax.el.ValueExpression rowsPerPageTemplate) {
		this.rowsPerPageTemplate = rowsPerPageTemplate;
	}
	private javax.el.ValueExpression scrollHeight;
	public void setScrollHeight(javax.el.ValueExpression scrollHeight) {
		this.scrollHeight = scrollHeight;
	}
	private javax.el.ValueExpression scrollWidthIE7;
	public void setScrollWidthIE7(javax.el.ValueExpression scrollWidthIE7) {
		this.scrollWidthIE7 = scrollWidthIE7;
	}
	private javax.el.ValueExpression scrollable;
	public void setScrollable(javax.el.ValueExpression scrollable) {
		this.scrollable = scrollable;
	}
	private javax.el.ValueExpression selectionMode;
	public void setSelectionMode(javax.el.ValueExpression selectionMode) {
		this.selectionMode = selectionMode;
	}
	private javax.el.ValueExpression singleSort;
	public void setSingleSort(javax.el.ValueExpression singleSort) {
		this.singleSort = singleSort;
	}
	private javax.el.ValueExpression stateMap;
	public void setStateMap(javax.el.ValueExpression stateMap) {
		this.stateMap = stateMap;
	}
	private javax.el.ValueExpression staticHeaders;
	public void setStaticHeaders(javax.el.ValueExpression staticHeaders) {
		this.staticHeaders = staticHeaders;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
	}
	private javax.el.ValueExpression tabIndex;
	public void setTabIndex(javax.el.ValueExpression tabIndex) {
		this.tabIndex = tabIndex;
	}
	private javax.el.ValueExpression toggleOnInvalidEdit;
	public void setToggleOnInvalidEdit(javax.el.ValueExpression toggleOnInvalidEdit) {
		this.toggleOnInvalidEdit = toggleOnInvalidEdit;
	}
	private javax.el.ValueExpression value;
	public void setValue(javax.el.ValueExpression value) {
		this.value = value;
	}
	private javax.el.ValueExpression var;
	public void setVar(javax.el.ValueExpression var) {
		this.var = var;
	}
	private javax.el.ValueExpression widgetVar;
	public void setWidgetVar(javax.el.ValueExpression widgetVar) {
		this.widgetVar = widgetVar;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.datatable.DataTableBase _component = null;
		try {
			_component = (org.icefaces.ace.component.datatable.DataTableBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.datatable.DataTableBase");
		}
		if (allColumnClicks != null) {
			_component.setValueExpression("allColumnClicks", allColumnClicks);
		}
		if (alwaysExecuteContents != null) {
			_component.setValueExpression("alwaysExecuteContents", alwaysExecuteContents);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (clickableHeaderSorting != null) {
			_component.setValueExpression("clickableHeaderSorting", clickableHeaderSorting);
		}
		if (columnOrdering != null) {
			_component.setValueExpression("columnOrdering", columnOrdering);
		}
		if (columnPinning != null) {
			_component.setValueExpression("columnPinning", columnPinning);
		}
		if (columnPinningControlsInHeader != null) {
			_component.setValueExpression("columnPinningControlsInHeader", columnPinningControlsInHeader);
		}
		if (constantRefilter != null) {
			_component.setValueExpression("constantRefilter", constantRefilter);
		}
		if (currentPageReportTemplate != null) {
			_component.setValueExpression("currentPageReportTemplate", currentPageReportTemplate);
		}
		if (disabled != null) {
			_component.setValueExpression("disabled", disabled);
		}
		if (doubleClickSelect != null) {
			_component.setValueExpression("doubleClickSelect", doubleClickSelect);
		}
		if (emptyMessage != null) {
			_component.setValueExpression("emptyMessage", emptyMessage);
		}
		if (filterEvent != null) {
			_component.setValueExpression("filterEvent", filterEvent);
		}
		if (filterListener != null) {
			_component.setFilterListener(filterListener);
		}
		if (filterValue != null) {
			_component.setValueExpression("filterValue", filterValue);
		}
		if (first != null) {
			_component.setValueExpression("first", first);
		}
		if (groupedFilterResults != null) {
			_component.setValueExpression("groupedFilterResults", groupedFilterResults);
		}
		if (height != null) {
			_component.setValueExpression("height", height);
		}
		if (hiddenScrollableSizing != null) {
			_component.setValueExpression("hiddenScrollableSizing", hiddenScrollableSizing);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (lazy != null) {
			_component.setValueExpression("lazy", lazy);
		}
		if (liveScroll != null) {
			_component.setValueExpression("liveScroll", liveScroll);
		}
		if (page != null) {
			_component.setValueExpression("page", page);
		}
		if (pageCount != null) {
			_component.setValueExpression("pageCount", pageCount);
		}
		if (paginator != null) {
			_component.setValueExpression("paginator", paginator);
		}
		if (paginatorAlwaysVisible != null) {
			_component.setValueExpression("paginatorAlwaysVisible", paginatorAlwaysVisible);
		}
		if (paginatorPosition != null) {
			_component.setValueExpression("paginatorPosition", paginatorPosition);
		}
		if (paginatorTemplate != null) {
			_component.setValueExpression("paginatorTemplate", paginatorTemplate);
		}
		if (renderRowTabindex != null) {
			_component.setValueExpression("renderRowTabindex", renderRowTabindex);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (reorderableColumns != null) {
			_component.setValueExpression("reorderableColumns", reorderableColumns);
		}
		if (resizableColumns != null) {
			_component.setValueExpression("resizableColumns", resizableColumns);
		}
		if (rowIndex != null) {
			_component.setValueExpression("rowIndex", rowIndex);
		}
		if (rowIndexVar != null) {
			_component.setValueExpression("rowIndexVar", rowIndexVar);
		}
		if (rowSelectListener != null) {
			_component.setRowSelectListener(rowSelectListener);
		}
		if (rowStateVar != null) {
			_component.setValueExpression("rowStateVar", rowStateVar);
		}
		if (rowStyleClass != null) {
			_component.setValueExpression("rowStyleClass", rowStyleClass);
		}
		if (rowUnselectListener != null) {
			_component.setRowUnselectListener(rowUnselectListener);
		}
		if (rows != null) {
			_component.setValueExpression("rows", rows);
		}
		if (rowsPerPageTemplate != null) {
			_component.setValueExpression("rowsPerPageTemplate", rowsPerPageTemplate);
		}
		if (scrollHeight != null) {
			_component.setValueExpression("scrollHeight", scrollHeight);
		}
		if (scrollWidthIE7 != null) {
			_component.setValueExpression("scrollWidthIE7", scrollWidthIE7);
		}
		if (scrollable != null) {
			_component.setValueExpression("scrollable", scrollable);
		}
		if (selectionMode != null) {
			_component.setValueExpression("selectionMode", selectionMode);
		}
		if (singleSort != null) {
			_component.setValueExpression("singleSort", singleSort);
		}
		if (stateMap != null) {
			_component.setValueExpression("stateMap", stateMap);
		}
		if (staticHeaders != null) {
			_component.setValueExpression("staticHeaders", staticHeaders);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (styleClass != null) {
			_component.setValueExpression("styleClass", styleClass);
		}
		if (tabIndex != null) {
			_component.setValueExpression("tabIndex", tabIndex);
		}
		if (toggleOnInvalidEdit != null) {
			_component.setValueExpression("toggleOnInvalidEdit", toggleOnInvalidEdit);
		}
		if (value != null) {
			_component.setValueExpression("value", value);
		}
		if (var != null) {
			_component.setValueExpression("var", var);
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
		allColumnClicks = null;
		alwaysExecuteContents = null;
		binding = null;
		clickableHeaderSorting = null;
		columnOrdering = null;
		columnPinning = null;
		columnPinningControlsInHeader = null;
		constantRefilter = null;
		currentPageReportTemplate = null;
		disabled = null;
		doubleClickSelect = null;
		emptyMessage = null;
		filterEvent = null;
		filterListener = null;
		filterValue = null;
		first = null;
		groupedFilterResults = null;
		height = null;
		hiddenScrollableSizing = null;
		id = null;
		lazy = null;
		liveScroll = null;
		page = null;
		pageCount = null;
		paginator = null;
		paginatorAlwaysVisible = null;
		paginatorPosition = null;
		paginatorTemplate = null;
		renderRowTabindex = null;
		rendered = null;
		reorderableColumns = null;
		resizableColumns = null;
		rowIndex = null;
		rowIndexVar = null;
		rowSelectListener = null;
		rowStateVar = null;
		rowStyleClass = null;
		rowUnselectListener = null;
		rows = null;
		rowsPerPageTemplate = null;
		scrollHeight = null;
		scrollWidthIE7 = null;
		scrollable = null;
		selectionMode = null;
		singleSort = null;
		stateMap = null;
		staticHeaders = null;
		style = null;
		styleClass = null;
		tabIndex = null;
		toggleOnInvalidEdit = null;
		value = null;
		var = null;
		widgetVar = null;
	}
}