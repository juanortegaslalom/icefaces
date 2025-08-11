package com.icesoft.faces.component.datapaginator;

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

public class DataPaginatorBeanInfo extends SimpleBeanInfo {

    /**
     * <p>Construct a new <code>DataPaginatorBeanInfo</code>.</p>
     */
    public DataPaginatorBeanInfo() {

        beanClass = DataPaginator.class;

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

            PropertyDescriptor prop_actionListener = new PropertyDescriptor("actionListener",beanClass,"getActionListener","setActionListener");

            PropertyDescriptor prop_disabled = new PropertyDescriptor("disabled",beanClass,"isDisabled","setDisabled");

            PropertyDescriptor prop_displayedRowsCountVar = new PropertyDescriptor("displayedRowsCountVar",beanClass,"getDisplayedRowsCountVar","setDisplayedRowsCountVar");

            PropertyDescriptor prop_enabledOnUserRole = new PropertyDescriptor("enabledOnUserRole",beanClass,"getEnabledOnUserRole","setEnabledOnUserRole");

            PropertyDescriptor prop_fastStep = new PropertyDescriptor("fastStep",beanClass,"getFastStep","setFastStep");

            PropertyDescriptor prop_firstRowIndexVar = new PropertyDescriptor("firstRowIndexVar",beanClass,"getFirstRowIndexVar","setFirstRowIndexVar");

            PropertyDescriptor prop_for = new PropertyDescriptor("for",beanClass,"getFor","setFor");

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");

            PropertyDescriptor prop_immediate = new PropertyDescriptor("immediate",beanClass,"isImmediate","setImmediate");

            PropertyDescriptor prop_keyboardNavigationEnabled = new PropertyDescriptor("keyboardNavigationEnabled",beanClass,"isKeyboardNavigationEnabled","setKeyboardNavigationEnabled");

            PropertyDescriptor prop_lastRowIndexVar = new PropertyDescriptor("lastRowIndexVar",beanClass,"getLastRowIndexVar","setLastRowIndexVar");

            PropertyDescriptor prop_pageCountVar = new PropertyDescriptor("pageCountVar",beanClass,"getPageCountVar","setPageCountVar");

            PropertyDescriptor prop_pageIndexVar = new PropertyDescriptor("pageIndexVar",beanClass,"getPageIndexVar","setPageIndexVar");

            PropertyDescriptor prop_paginator = new PropertyDescriptor("paginator",beanClass,"isPaginator","setPaginator");

            PropertyDescriptor prop_paginatorMaxPages = new PropertyDescriptor("paginatorMaxPages",beanClass,"getPaginatorMaxPages","setPaginatorMaxPages");

            PropertyDescriptor prop_renderFacetsIfSinglePage = new PropertyDescriptor("renderFacetsIfSinglePage",beanClass,"isRenderFacetsIfSinglePage","setRenderFacetsIfSinglePage");

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");

            PropertyDescriptor prop_rowsCountVar = new PropertyDescriptor("rowsCountVar",beanClass,"getRowsCountVar","setRowsCountVar");

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");

            PropertyDescriptor prop_tabindex = new PropertyDescriptor("tabindex",beanClass,"getTabindex","setTabindex");

            PropertyDescriptor prop_vertical = new PropertyDescriptor("vertical",beanClass,"isVertical","setVertical");

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);

            PropertyDescriptor prop_layout = new PropertyDescriptor("layout",beanClass,"getLayout","setLayout");

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);

            propDescriptors = new PropertyDescriptor[] {
                prop_actionListener,
                prop_attributes,
                prop_childCount,
                prop_children,
                prop_disabled,
                prop_displayedRowsCountVar,
                prop_enabledOnUserRole,
                prop_facets,
                prop_family,
                prop_fastStep,
                prop_firstRowIndexVar,
                prop_for,
                prop_id,
                prop_immediate,
                prop_keyboardNavigationEnabled,
                prop_lastRowIndexVar,
                prop_layout,
                prop_pageCountVar,
                prop_pageIndexVar,
                prop_paginator,
                prop_paginatorMaxPages,
                prop_parent,
                prop_renderFacetsIfSinglePage,
                prop_rendered,
                prop_renderedOnUserRole,
                prop_rendererType,
                prop_rendersChildren,
                prop_rowsCountVar,
                prop_style,
                prop_styleClass,
                prop_tabindex,
                prop_vertical,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
