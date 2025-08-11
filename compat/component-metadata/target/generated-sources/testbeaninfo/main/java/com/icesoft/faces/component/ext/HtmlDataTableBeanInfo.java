package com.icesoft.faces.component.ext;

import java.awt.Image;
import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.util.Locale;
import java.util.ResourceBundle;


import java.beans.SimpleBeanInfo;

/**
 * <p>Auto-generated design time metadata class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

public class HtmlDataTableBeanInfo extends SimpleBeanInfo {

    /**
     * <p>Construct a new <code>HtmlDataTableBeanInfo</code>.</p>
     */
    public HtmlDataTableBeanInfo() {

        beanClass = HtmlDataTable.class;

    }

    /**
     * <p>The bean class that this BeanInfo represents.
     */
    protected Class beanClass;

    /**
     * <p>The cached BeanDescriptor.</p>
     */
    protected BeanDescriptor beanDescriptor;

    /**
     * <p>The index of the default property.</p>
     */
    protected int defaultPropertyIndex = -1;

    /**
     * <p>The name of the default property.</p>
     */
    protected String defaultPropertyName;

    /**
     * <p>The cached property descriptors.</p>
     */
    protected PropertyDescriptor[] propDescriptors;

    /**
     * <p>Return the <code>BeanDescriptor</code> for this bean.</p>
     */
    public BeanDescriptor getBeanDescriptor() {

        if (beanDescriptor != null) {
            return beanDescriptor;
        }

        beanDescriptor = new BeanDescriptor(beanClass);

        return beanDescriptor;

    }

    /**
     * <p>Return the index of the default property, or
     * -1 if there is no default property.</p>
     */
    public int getDefaultPropertyIndex() {

            defaultPropertyIndex = -1;
            return defaultPropertyIndex;
        }

    /**
     * <p>Return the <code>PropertyDescriptor</code>s for this bean.</p>
     */
    public PropertyDescriptor[] getPropertyDescriptors() {

        if (propDescriptors != null) {
            return propDescriptors;
        }

        try {

            PropertyDescriptor prop_bgcolor = new PropertyDescriptor("bgcolor",beanClass,"getBgcolor","setBgcolor");

            PropertyDescriptor prop_border = new PropertyDescriptor("border",beanClass,"getBorder","setBorder");

            PropertyDescriptor prop_cellpadding = new PropertyDescriptor("cellpadding",beanClass,"getCellpadding","setCellpadding");

            PropertyDescriptor prop_cellspacing = new PropertyDescriptor("cellspacing",beanClass,"getCellspacing","setCellspacing");

            PropertyDescriptor prop_clientOnly = new PropertyDescriptor("clientOnly",beanClass,"isClientOnly","setClientOnly");

            PropertyDescriptor prop_columnClasses = new PropertyDescriptor("columnClasses",beanClass,"getColumnClasses","setColumnClasses");

            PropertyDescriptor prop_columnWidths = new PropertyDescriptor("columnWidths",beanClass,"getColumnWidths","setColumnWidths");

            PropertyDescriptor prop_dir = new PropertyDescriptor("dir",beanClass,"getDir","setDir");

            PropertyDescriptor prop_first = new PropertyDescriptor("first",beanClass,"getFirst","setFirst");

            PropertyDescriptor prop_footerClass = new PropertyDescriptor("footerClass",beanClass,"getFooterClass","setFooterClass");

            PropertyDescriptor prop_frame = new PropertyDescriptor("frame",beanClass,"getFrame","setFrame");

            PropertyDescriptor prop_headerClass = new PropertyDescriptor("headerClass",beanClass,"getHeaderClass","setHeaderClass");

            PropertyDescriptor prop_headerClasses = new PropertyDescriptor("headerClasses",beanClass,"getHeaderClasses","setHeaderClasses");

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");

            PropertyDescriptor prop_lang = new PropertyDescriptor("lang",beanClass,"getLang","setLang");

            PropertyDescriptor prop_onclick = new PropertyDescriptor("onclick",beanClass,"getOnclick","setOnclick");

            PropertyDescriptor prop_ondblclick = new PropertyDescriptor("ondblclick",beanClass,"getOndblclick","setOndblclick");

            PropertyDescriptor prop_onkeydown = new PropertyDescriptor("onkeydown",beanClass,"getOnkeydown","setOnkeydown");

            PropertyDescriptor prop_onkeypress = new PropertyDescriptor("onkeypress",beanClass,"getOnkeypress","setOnkeypress");

            PropertyDescriptor prop_onkeyup = new PropertyDescriptor("onkeyup",beanClass,"getOnkeyup","setOnkeyup");

            PropertyDescriptor prop_onmousedown = new PropertyDescriptor("onmousedown",beanClass,"getOnmousedown","setOnmousedown");

            PropertyDescriptor prop_onmousemove = new PropertyDescriptor("onmousemove",beanClass,"getOnmousemove","setOnmousemove");

            PropertyDescriptor prop_onmouseout = new PropertyDescriptor("onmouseout",beanClass,"getOnmouseout","setOnmouseout");

            PropertyDescriptor prop_onmouseover = new PropertyDescriptor("onmouseover",beanClass,"getOnmouseover","setOnmouseover");

            PropertyDescriptor prop_onmouseup = new PropertyDescriptor("onmouseup",beanClass,"getOnmouseup","setOnmouseup");

            PropertyDescriptor prop_renderRowTabindex = new PropertyDescriptor("renderRowTabindex",beanClass,"isRenderRowTabindex","setRenderRowTabindex");

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");

            PropertyDescriptor prop_resizable = new PropertyDescriptor("resizable",beanClass,"isResizable","setResizable");

            PropertyDescriptor prop_resizableColumnWidths = new PropertyDescriptor("resizableColumnWidths",beanClass,"getResizableColumnWidths","setResizableColumnWidths");

            PropertyDescriptor prop_rowClasses = new PropertyDescriptor("rowClasses",beanClass,"getRowClasses","setRowClasses");

            PropertyDescriptor prop_rows = new PropertyDescriptor("rows",beanClass,"getRows","setRows");

            PropertyDescriptor prop_rules = new PropertyDescriptor("rules",beanClass,"getRules","setRules");

            PropertyDescriptor prop_scrollFooter = new PropertyDescriptor("scrollFooter",beanClass,"isScrollFooter","setScrollFooter");

            PropertyDescriptor prop_scrollHeight = new PropertyDescriptor("scrollHeight",beanClass,"getScrollHeight","setScrollHeight");

            PropertyDescriptor prop_scrollable = new PropertyDescriptor("scrollable",beanClass,"isScrollable","setScrollable");

            PropertyDescriptor prop_sortAscending = new PropertyDescriptor("sortAscending",beanClass,"isSortAscending","setSortAscending");

            PropertyDescriptor prop_sortColumn = new PropertyDescriptor("sortColumn",beanClass,"getSortColumn","setSortColumn");

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");

            PropertyDescriptor prop_summary = new PropertyDescriptor("summary",beanClass,"getSummary","setSummary");

            PropertyDescriptor prop_title = new PropertyDescriptor("title",beanClass,"getTitle","setTitle");

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");

            PropertyDescriptor prop_var = new PropertyDescriptor("var",beanClass,"getVar","setVar");

            PropertyDescriptor prop_varStatus = new PropertyDescriptor("varStatus",beanClass,"getVarStatus","setVarStatus");

            PropertyDescriptor prop_width = new PropertyDescriptor("width",beanClass,"getWidth","setWidth");

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);

            PropertyDescriptor prop_bodyrows = new PropertyDescriptor("bodyrows",beanClass,"getBodyrows","setBodyrows");

            PropertyDescriptor prop_captionClass = new PropertyDescriptor("captionClass",beanClass,"getCaptionClass","setCaptionClass");

            PropertyDescriptor prop_captionStyle = new PropertyDescriptor("captionStyle",beanClass,"getCaptionStyle","setCaptionStyle");

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);

            PropertyDescriptor prop_rowAvailable = new PropertyDescriptor("rowAvailable",beanClass,"isRowAvailable",null);

            PropertyDescriptor prop_rowCount = new PropertyDescriptor("rowCount",beanClass,"getRowCount",null);

            PropertyDescriptor prop_rowData = new PropertyDescriptor("rowData",beanClass,"getRowData",null);

            PropertyDescriptor prop_rowIndex = new PropertyDescriptor("rowIndex",beanClass,"getRowIndex","setRowIndex");

            PropertyDescriptor prop_rowStatePreserved = new PropertyDescriptor("rowStatePreserved",beanClass,"isRowStatePreserved","setRowStatePreserved");

            propDescriptors = new PropertyDescriptor[] {
                prop_attributes,
                prop_bgcolor,
                prop_bodyrows,
                prop_border,
                prop_captionClass,
                prop_captionStyle,
                prop_cellpadding,
                prop_cellspacing,
                prop_childCount,
                prop_children,
                prop_clientOnly,
                prop_columnClasses,
                prop_columnWidths,
                prop_dir,
                prop_facets,
                prop_family,
                prop_first,
                prop_footerClass,
                prop_frame,
                prop_headerClass,
                prop_headerClasses,
                prop_id,
                prop_lang,
                prop_onclick,
                prop_ondblclick,
                prop_onkeydown,
                prop_onkeypress,
                prop_onkeyup,
                prop_onmousedown,
                prop_onmousemove,
                prop_onmouseout,
                prop_onmouseover,
                prop_onmouseup,
                prop_parent,
                prop_renderRowTabindex,
                prop_rendered,
                prop_renderedOnUserRole,
                prop_rendererType,
                prop_rendersChildren,
                prop_resizable,
                prop_resizableColumnWidths,
                prop_rowAvailable,
                prop_rowClasses,
                prop_rowCount,
                prop_rowData,
                prop_rowIndex,
                prop_rowStatePreserved,
                prop_rows,
                prop_rules,
                prop_scrollFooter,
                prop_scrollHeight,
                prop_scrollable,
                prop_sortAscending,
                prop_sortColumn,
                prop_style,
                prop_styleClass,
                prop_summary,
                prop_title,
                prop_value,
                prop_var,
                prop_varStatus,
                prop_width,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
