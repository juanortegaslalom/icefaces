package com.icesoft.faces.component.datapaginator;

import java.awt.Image;
import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.util.Locale;
import java.util.ResourceBundle;

import com.sun.rave.designtime.CategoryDescriptor;
import com.sun.rave.designtime.Constants;
import com.sun.rave.designtime.faces.FacetDescriptor;
import com.sun.rave.designtime.markup.AttributeDescriptor;

import java.beans.SimpleBeanInfo;

/**
 * <p>Auto-generated design time metadata class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class DataPaginatorBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.datapaginator.Bundle-JSF", Locale.getDefault(), DataPaginatorBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>DataPaginatorBeanInfoBase</code>.</p>
     */
    public DataPaginatorBeanInfoBase() {

        beanClass = DataPaginator.class;
        iconFileName_C16 = "DataPaginator_C16";
        iconFileName_C32 = "DataPaginator_C32";
        iconFileName_M16 = "DataPaginator_M16";
        iconFileName_M32 = "DataPaginator_M32";

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
    protected int defaultPropertyIndex = -2;

    /**
     * <p>The name of the default property.</p>
     */
    protected String defaultPropertyName;

    /**
     * <p>The 16x16 color icon.</p>
     */
    protected String iconFileName_C16;

    /**
     * <p>The 32x32 color icon.</p>
     */
    protected String iconFileName_C32;

    /**
     * <p>The 16x16 monochrome icon.</p>
     */
    protected String iconFileName_M16;

    /**
     * <p>The 32x32 monochrome icon.</p>
     */
    protected String iconFileName_M32;

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
        beanDescriptor.setDisplayName(resources.getString("DataPaginator_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("DataPaginator_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"dataPaginator");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.TRUE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"dataPaginator");
        beanDescriptor.setValue(Constants.BeanDescriptor.TAGLIB_PREFIX,"ice");
        beanDescriptor.setValue(Constants.BeanDescriptor.TAGLIB_URI,"http://www.icesoft.com/icefaces/component");

        return beanDescriptor;

    }

    /**
     * <p>Return the <code>CategoryDescriptor</code> array for the property categories of this component.</p>
     */
    private CategoryDescriptor[] getCategoryDescriptors() {

        return com.icesoft.faces.ide.vwp.util.CategoryDescriptors.getDefaultCategoryDescriptors();

    }

    /**
     * <p>Return the index of the default property, or
     * -1 if there is no default property.</p>
     */
    public int getDefaultPropertyIndex() {

        if (defaultPropertyIndex > -2) {
            return defaultPropertyIndex;
        } else {
            if (defaultPropertyName == null) {
                defaultPropertyIndex = -1;
            } else {
                PropertyDescriptor pd[] = getPropertyDescriptors();
                for (int i = 0; i < pd.length; i++) {
                    if (defaultPropertyName.equals(pd[i].getName())) {
                        defaultPropertyIndex = i;
                        break;
                    }
                }
            }
        }
        return defaultPropertyIndex;
    }

    /**
     * <p>The cached facet descriptors.</p>
     */
    protected FacetDescriptor[] facetDescriptors;

    /**
     * <p>Return the <code>FacetDescriptor</code>s for this bean.</p>
     */
    public FacetDescriptor[] getFacetDescriptors() {

        if (facetDescriptors != null) {
            return facetDescriptors;
        }
        facetDescriptors = new FacetDescriptor[] {
        };
        return facetDescriptors;

    }

    /**
     * <p>Return the specified image (if any)
     * for this component class.</p>
     */
    public Image getIcon(int kind) {

        String name;
        switch (kind) {
            case ICON_COLOR_16x16:
                name = iconFileName_C16;
                break;
            case ICON_COLOR_32x32:
                name = iconFileName_C32;
                break;
            case ICON_MONO_16x16:
                name = iconFileName_M16;
                break;
            case ICON_MONO_32x32:
                name = iconFileName_M32;
                break;
            default:
                name = null;
                break;
        }
        if (name == null) {
            return null;
        }

        Image image = loadImage(name + ".png");
        if (image == null) {
            image = loadImage(name + ".gif");
        }
        return image;

    }

    /**
     * <p>Return a class loaded by name via the class loader that loaded this class.</p>
     */
    private java.lang.Class loadClass(java.lang.String name) {

        try {
            return Class.forName(name);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * <p>Return the <code>PropertyDescriptor</code>s for this bean.</p>
     */
    public PropertyDescriptor[] getPropertyDescriptors() {

        if (propDescriptors != null) {
            return propDescriptors;
        }
        AttributeDescriptor attrib = null;

        try {

            PropertyDescriptor prop_actionListener = new PropertyDescriptor("actionListener",beanClass,"getActionListener","setActionListener");
            prop_actionListener.setDisplayName(resources.getString("DataPaginator_actionListener_DisplayName"));
            prop_actionListener.setShortDescription(resources.getString("DataPaginator_actionListener_Description"));
            prop_actionListener.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.MethodBindingPropertyEditor"));
            prop_actionListener.setExpert(false);
            prop_actionListener.setHidden(false);
            prop_actionListener.setPreferred(false);
            attrib = new AttributeDescriptor("actionListener",false,null,true);
            prop_actionListener.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_actionListener.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_disabled = new PropertyDescriptor("disabled",beanClass,"isDisabled","setDisabled");
            prop_disabled.setDisplayName(resources.getString("DataPaginator_disabled_DisplayName"));
            prop_disabled.setShortDescription(resources.getString("DataPaginator_disabled_Description"));
            prop_disabled.setExpert(false);
            prop_disabled.setHidden(false);
            prop_disabled.setPreferred(false);
            attrib = new AttributeDescriptor("disabled",false,null,true);
            prop_disabled.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_disabled.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_displayedRowsCountVar = new PropertyDescriptor("displayedRowsCountVar",beanClass,"getDisplayedRowsCountVar","setDisplayedRowsCountVar");
            prop_displayedRowsCountVar.setDisplayName(resources.getString("DataPaginator_displayedRowsCountVar_DisplayName"));
            prop_displayedRowsCountVar.setShortDescription(resources.getString("DataPaginator_displayedRowsCountVar_Description"));
            prop_displayedRowsCountVar.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_displayedRowsCountVar.setExpert(false);
            prop_displayedRowsCountVar.setHidden(false);
            prop_displayedRowsCountVar.setPreferred(false);
            attrib = new AttributeDescriptor("displayedRowsCountVar",false,null,true);
            prop_displayedRowsCountVar.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_displayedRowsCountVar.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_enabledOnUserRole = new PropertyDescriptor("enabledOnUserRole",beanClass,"getEnabledOnUserRole","setEnabledOnUserRole");
            prop_enabledOnUserRole.setDisplayName(resources.getString("DataPaginator_enabledOnUserRole_DisplayName"));
            prop_enabledOnUserRole.setShortDescription(resources.getString("DataPaginator_enabledOnUserRole_Description"));
            prop_enabledOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_enabledOnUserRole.setExpert(false);
            prop_enabledOnUserRole.setHidden(false);
            prop_enabledOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("enabledOnUserRole",false,null,true);
            prop_enabledOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_enabledOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_ADVANCED);

            PropertyDescriptor prop_fastStep = new PropertyDescriptor("fastStep",beanClass,"getFastStep","setFastStep");
            prop_fastStep.setDisplayName(resources.getString("DataPaginator_fastStep_DisplayName"));
            prop_fastStep.setShortDescription(resources.getString("DataPaginator_fastStep_Description"));
            prop_fastStep.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.IntegerPropertyEditor"));
            prop_fastStep.setExpert(false);
            prop_fastStep.setHidden(false);
            prop_fastStep.setPreferred(false);
            attrib = new AttributeDescriptor("fastStep",false,null,true);
            prop_fastStep.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_fastStep.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_firstRowIndexVar = new PropertyDescriptor("firstRowIndexVar",beanClass,"getFirstRowIndexVar","setFirstRowIndexVar");
            prop_firstRowIndexVar.setDisplayName(resources.getString("DataPaginator_firstRowIndexVar_DisplayName"));
            prop_firstRowIndexVar.setShortDescription(resources.getString("DataPaginator_firstRowIndexVar_Description"));
            prop_firstRowIndexVar.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_firstRowIndexVar.setExpert(false);
            prop_firstRowIndexVar.setHidden(false);
            prop_firstRowIndexVar.setPreferred(false);
            attrib = new AttributeDescriptor("firstRowIndexVar",false,null,true);
            prop_firstRowIndexVar.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_firstRowIndexVar.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_for = new PropertyDescriptor("for",beanClass,"getFor","setFor");
            prop_for.setDisplayName(resources.getString("DataPaginator_for_DisplayName"));
            prop_for.setShortDescription(resources.getString("DataPaginator_for_Description"));
            prop_for.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_for.setExpert(false);
            prop_for.setHidden(false);
            prop_for.setPreferred(false);
            attrib = new AttributeDescriptor("for",false,null,true);
            prop_for.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_for.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("DataPaginator_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("DataPaginator_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_immediate = new PropertyDescriptor("immediate",beanClass,"isImmediate","setImmediate");
            prop_immediate.setDisplayName(resources.getString("DataPaginator_immediate_DisplayName"));
            prop_immediate.setShortDescription(resources.getString("DataPaginator_immediate_Description"));
            prop_immediate.setExpert(false);
            prop_immediate.setHidden(false);
            prop_immediate.setPreferred(false);
            attrib = new AttributeDescriptor("immediate",false,"false",true);
            prop_immediate.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_immediate.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_keyboardNavigationEnabled = new PropertyDescriptor("keyboardNavigationEnabled",beanClass,"isKeyboardNavigationEnabled","setKeyboardNavigationEnabled");
            prop_keyboardNavigationEnabled.setDisplayName(resources.getString("DataPaginator_keyboardNavigationEnabled_DisplayName"));
            prop_keyboardNavigationEnabled.setShortDescription(resources.getString("DataPaginator_keyboardNavigationEnabled_Description"));
            prop_keyboardNavigationEnabled.setExpert(false);
            prop_keyboardNavigationEnabled.setHidden(false);
            prop_keyboardNavigationEnabled.setPreferred(false);
            attrib = new AttributeDescriptor("keyboardNavigationEnabled",false,"false",true);
            prop_keyboardNavigationEnabled.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_keyboardNavigationEnabled.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_lastRowIndexVar = new PropertyDescriptor("lastRowIndexVar",beanClass,"getLastRowIndexVar","setLastRowIndexVar");
            prop_lastRowIndexVar.setDisplayName(resources.getString("DataPaginator_lastRowIndexVar_DisplayName"));
            prop_lastRowIndexVar.setShortDescription(resources.getString("DataPaginator_lastRowIndexVar_Description"));
            prop_lastRowIndexVar.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_lastRowIndexVar.setExpert(false);
            prop_lastRowIndexVar.setHidden(false);
            prop_lastRowIndexVar.setPreferred(false);
            attrib = new AttributeDescriptor("lastRowIndexVar",false,null,true);
            prop_lastRowIndexVar.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_lastRowIndexVar.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_pageCountVar = new PropertyDescriptor("pageCountVar",beanClass,"getPageCountVar","setPageCountVar");
            prop_pageCountVar.setDisplayName(resources.getString("DataPaginator_pageCountVar_DisplayName"));
            prop_pageCountVar.setShortDescription(resources.getString("DataPaginator_pageCountVar_Description"));
            prop_pageCountVar.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_pageCountVar.setExpert(false);
            prop_pageCountVar.setHidden(false);
            prop_pageCountVar.setPreferred(false);
            attrib = new AttributeDescriptor("pageCountVar",false,null,true);
            prop_pageCountVar.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_pageCountVar.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_pageIndexVar = new PropertyDescriptor("pageIndexVar",beanClass,"getPageIndexVar","setPageIndexVar");
            prop_pageIndexVar.setDisplayName(resources.getString("DataPaginator_pageIndexVar_DisplayName"));
            prop_pageIndexVar.setShortDescription(resources.getString("DataPaginator_pageIndexVar_Description"));
            prop_pageIndexVar.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_pageIndexVar.setExpert(false);
            prop_pageIndexVar.setHidden(false);
            prop_pageIndexVar.setPreferred(false);
            attrib = new AttributeDescriptor("pageIndexVar",false,null,true);
            prop_pageIndexVar.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_pageIndexVar.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_paginator = new PropertyDescriptor("paginator",beanClass,"isPaginator","setPaginator");
            prop_paginator.setDisplayName(resources.getString("DataPaginator_paginator_DisplayName"));
            prop_paginator.setShortDescription(resources.getString("DataPaginator_paginator_Description"));
            prop_paginator.setExpert(false);
            prop_paginator.setHidden(false);
            prop_paginator.setPreferred(false);
            attrib = new AttributeDescriptor("paginator",false,"false",true);
            prop_paginator.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_paginator.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_paginatorMaxPages = new PropertyDescriptor("paginatorMaxPages",beanClass,"getPaginatorMaxPages","setPaginatorMaxPages");
            prop_paginatorMaxPages.setDisplayName(resources.getString("DataPaginator_paginatorMaxPages_DisplayName"));
            prop_paginatorMaxPages.setShortDescription(resources.getString("DataPaginator_paginatorMaxPages_Description"));
            prop_paginatorMaxPages.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.IntegerPropertyEditor"));
            prop_paginatorMaxPages.setExpert(false);
            prop_paginatorMaxPages.setHidden(false);
            prop_paginatorMaxPages.setPreferred(false);
            attrib = new AttributeDescriptor("paginatorMaxPages",false,null,true);
            prop_paginatorMaxPages.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_paginatorMaxPages.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_renderFacetsIfSinglePage = new PropertyDescriptor("renderFacetsIfSinglePage",beanClass,"isRenderFacetsIfSinglePage","setRenderFacetsIfSinglePage");
            prop_renderFacetsIfSinglePage.setDisplayName(resources.getString("DataPaginator_renderFacetsIfSinglePage_DisplayName"));
            prop_renderFacetsIfSinglePage.setShortDescription(resources.getString("DataPaginator_renderFacetsIfSinglePage_Description"));
            prop_renderFacetsIfSinglePage.setExpert(false);
            prop_renderFacetsIfSinglePage.setHidden(false);
            prop_renderFacetsIfSinglePage.setPreferred(false);
            attrib = new AttributeDescriptor("renderFacetsIfSinglePage",false,"true",true);
            prop_renderFacetsIfSinglePage.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderFacetsIfSinglePage.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("DataPaginator_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("DataPaginator_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");
            prop_renderedOnUserRole.setDisplayName(resources.getString("DataPaginator_renderedOnUserRole_DisplayName"));
            prop_renderedOnUserRole.setShortDescription(resources.getString("DataPaginator_renderedOnUserRole_Description"));
            prop_renderedOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_renderedOnUserRole.setExpert(false);
            prop_renderedOnUserRole.setHidden(false);
            prop_renderedOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("renderedOnUserRole",false,null,true);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_rowsCountVar = new PropertyDescriptor("rowsCountVar",beanClass,"getRowsCountVar","setRowsCountVar");
            prop_rowsCountVar.setDisplayName(resources.getString("DataPaginator_rowsCountVar_DisplayName"));
            prop_rowsCountVar.setShortDescription(resources.getString("DataPaginator_rowsCountVar_Description"));
            prop_rowsCountVar.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_rowsCountVar.setExpert(false);
            prop_rowsCountVar.setHidden(false);
            prop_rowsCountVar.setPreferred(false);
            attrib = new AttributeDescriptor("rowsCountVar",false,null,true);
            prop_rowsCountVar.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rowsCountVar.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");
            prop_style.setDisplayName(resources.getString("DataPaginator_style_DisplayName"));
            prop_style.setShortDescription(resources.getString("DataPaginator_style_Description"));
            prop_style.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.css.CssStylePropertyEditor"));
            prop_style.setExpert(false);
            prop_style.setHidden(false);
            prop_style.setPreferred(false);
            attrib = new AttributeDescriptor("style",false,null,true);
            prop_style.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_style.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("DataPaginator_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("DataPaginator_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.StyleClassPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_tabindex = new PropertyDescriptor("tabindex",beanClass,"getTabindex","setTabindex");
            prop_tabindex.setDisplayName(resources.getString("DataPaginator_tabindex_DisplayName"));
            prop_tabindex.setShortDescription(resources.getString("DataPaginator_tabindex_Description"));
            prop_tabindex.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.IntegerPropertyEditor"));
            prop_tabindex.setExpert(false);
            prop_tabindex.setHidden(false);
            prop_tabindex.setPreferred(false);
            attrib = new AttributeDescriptor("tabindex",false,null,true);
            prop_tabindex.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_tabindex.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_vertical = new PropertyDescriptor("vertical",beanClass,"isVertical","setVertical");
            prop_vertical.setDisplayName(resources.getString("DataPaginator_vertical_DisplayName"));
            prop_vertical.setShortDescription(resources.getString("DataPaginator_vertical_Description"));
            prop_vertical.setExpert(false);
            prop_vertical.setHidden(false);
            prop_vertical.setPreferred(false);
            attrib = new AttributeDescriptor("vertical",false,"false",true);
            prop_vertical.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_vertical.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("DataPaginator_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("DataPaginator_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("DataPaginator_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("DataPaginator_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("DataPaginator_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("DataPaginator_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("DataPaginator_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("DataPaginator_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("DataPaginator_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("DataPaginator_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_layout = new PropertyDescriptor("layout",beanClass,"getLayout","setLayout");
            prop_layout.setDisplayName(resources.getString("DataPaginator_layout_DisplayName"));
            prop_layout.setShortDescription(resources.getString("DataPaginator_layout_Description"));
            prop_layout.setExpert(false);
            prop_layout.setHidden(false);
            prop_layout.setPreferred(false);
            attrib = new AttributeDescriptor("layout",false,null,true);
            prop_layout.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_layout.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);
            prop_parent.setDisplayName(resources.getString("DataPaginator_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("DataPaginator_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("DataPaginator_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("DataPaginator_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("DataPaginator_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("DataPaginator_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

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
