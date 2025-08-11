package com.icesoft.faces.component.panelpositioned;

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

abstract class PanelPositionedBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.panelpositioned.Bundle-JSF", Locale.getDefault(), PanelPositionedBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>PanelPositionedBeanInfoBase</code>.</p>
     */
    public PanelPositionedBeanInfoBase() {

        beanClass = PanelPositioned.class;
        iconFileName_C16 = "PanelPositioned_C16";
        iconFileName_C32 = "PanelPositioned_C32";
        iconFileName_M16 = "PanelPositioned_M16";
        iconFileName_M32 = "PanelPositioned_M32";

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
        beanDescriptor.setDisplayName(resources.getString("PanelPositioned_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("PanelPositioned_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"panelPositioned");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.TRUE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"panelPositioned");
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

            PropertyDescriptor prop_beforeChangedListener = new PropertyDescriptor("beforeChangedListener",beanClass,"getBeforeChangedListener","setBeforeChangedListener");
            prop_beforeChangedListener.setDisplayName(resources.getString("PanelPositioned_beforeChangedListener_DisplayName"));
            prop_beforeChangedListener.setShortDescription(resources.getString("PanelPositioned_beforeChangedListener_Description"));
            prop_beforeChangedListener.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.MethodBindingPropertyEditor"));
            prop_beforeChangedListener.setExpert(false);
            prop_beforeChangedListener.setHidden(false);
            prop_beforeChangedListener.setPreferred(false);
            attrib = new AttributeDescriptor("beforeChangedListener",false,null,true);
            prop_beforeChangedListener.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_beforeChangedListener.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_constraint = new PropertyDescriptor("constraint",beanClass,"getConstraint","setConstraint");
            prop_constraint.setDisplayName(resources.getString("PanelPositioned_constraint_DisplayName"));
            prop_constraint.setShortDescription(resources.getString("PanelPositioned_constraint_Description"));
            prop_constraint.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_constraint.setExpert(false);
            prop_constraint.setHidden(false);
            prop_constraint.setPreferred(false);
            attrib = new AttributeDescriptor("constraint",false,null,true);
            prop_constraint.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_constraint.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_disabled = new PropertyDescriptor("disabled",beanClass,"isDisabled","setDisabled");
            prop_disabled.setDisplayName(resources.getString("PanelPositioned_disabled_DisplayName"));
            prop_disabled.setShortDescription(resources.getString("PanelPositioned_disabled_Description"));
            prop_disabled.setExpert(false);
            prop_disabled.setHidden(false);
            prop_disabled.setPreferred(false);
            attrib = new AttributeDescriptor("disabled",false,null,true);
            prop_disabled.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_disabled.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_enabledOnUserRole = new PropertyDescriptor("enabledOnUserRole",beanClass,"getEnabledOnUserRole","setEnabledOnUserRole");
            prop_enabledOnUserRole.setDisplayName(resources.getString("PanelPositioned_enabledOnUserRole_DisplayName"));
            prop_enabledOnUserRole.setShortDescription(resources.getString("PanelPositioned_enabledOnUserRole_Description"));
            prop_enabledOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_enabledOnUserRole.setExpert(false);
            prop_enabledOnUserRole.setHidden(false);
            prop_enabledOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("enabledOnUserRole",false,null,true);
            prop_enabledOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_enabledOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_ADVANCED);

            PropertyDescriptor prop_first = new PropertyDescriptor("first",beanClass,"getFirst","setFirst");
            prop_first.setDisplayName(resources.getString("PanelPositioned_first_DisplayName"));
            prop_first.setShortDescription(resources.getString("PanelPositioned_first_Description"));
            prop_first.setExpert(false);
            prop_first.setHidden(false);
            prop_first.setPreferred(false);
            attrib = new AttributeDescriptor("first",false,"0",true);
            prop_first.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_first.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_handle = new PropertyDescriptor("handle",beanClass,"getHandle","setHandle");
            prop_handle.setDisplayName(resources.getString("PanelPositioned_handle_DisplayName"));
            prop_handle.setShortDescription(resources.getString("PanelPositioned_handle_Description"));
            prop_handle.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_handle.setExpert(false);
            prop_handle.setHidden(false);
            prop_handle.setPreferred(false);
            attrib = new AttributeDescriptor("handle",false,null,true);
            prop_handle.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_handle.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_hoverclass = new PropertyDescriptor("hoverclass",beanClass,"getHoverclass","setHoverclass");
            prop_hoverclass.setDisplayName(resources.getString("PanelPositioned_hoverclass_DisplayName"));
            prop_hoverclass.setShortDescription(resources.getString("PanelPositioned_hoverclass_Description"));
            prop_hoverclass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_hoverclass.setExpert(false);
            prop_hoverclass.setHidden(false);
            prop_hoverclass.setPreferred(false);
            attrib = new AttributeDescriptor("hoverclass",false,null,true);
            prop_hoverclass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_hoverclass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("PanelPositioned_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("PanelPositioned_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_listener = new PropertyDescriptor("listener",beanClass,"getListener","setListener");
            prop_listener.setDisplayName(resources.getString("PanelPositioned_listener_DisplayName"));
            prop_listener.setShortDescription(resources.getString("PanelPositioned_listener_Description"));
            prop_listener.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.MethodBindingPropertyEditor"));
            prop_listener.setExpert(false);
            prop_listener.setHidden(false);
            prop_listener.setPreferred(false);
            attrib = new AttributeDescriptor("listener",false,null,true);
            prop_listener.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_listener.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_overlap = new PropertyDescriptor("overlap",beanClass,"getOverlap","setOverlap");
            prop_overlap.setDisplayName(resources.getString("PanelPositioned_overlap_DisplayName"));
            prop_overlap.setShortDescription(resources.getString("PanelPositioned_overlap_Description"));
            prop_overlap.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_overlap.setExpert(false);
            prop_overlap.setHidden(false);
            prop_overlap.setPreferred(false);
            attrib = new AttributeDescriptor("overlap",false,null,true);
            prop_overlap.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_overlap.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("PanelPositioned_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("PanelPositioned_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");
            prop_renderedOnUserRole.setDisplayName(resources.getString("PanelPositioned_renderedOnUserRole_DisplayName"));
            prop_renderedOnUserRole.setShortDescription(resources.getString("PanelPositioned_renderedOnUserRole_Description"));
            prop_renderedOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_renderedOnUserRole.setExpert(false);
            prop_renderedOnUserRole.setHidden(false);
            prop_renderedOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("renderedOnUserRole",false,null,true);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_rows = new PropertyDescriptor("rows",beanClass,"getRows","setRows");
            prop_rows.setDisplayName(resources.getString("PanelPositioned_rows_DisplayName"));
            prop_rows.setShortDescription(resources.getString("PanelPositioned_rows_Description"));
            prop_rows.setExpert(false);
            prop_rows.setHidden(false);
            prop_rows.setPreferred(false);
            attrib = new AttributeDescriptor("rows",false,"0",true);
            prop_rows.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rows.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");
            prop_style.setDisplayName(resources.getString("PanelPositioned_style_DisplayName"));
            prop_style.setShortDescription(resources.getString("PanelPositioned_style_Description"));
            prop_style.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.css.CssStylePropertyEditor"));
            prop_style.setExpert(false);
            prop_style.setHidden(false);
            prop_style.setPreferred(false);
            attrib = new AttributeDescriptor("style",false,null,true);
            prop_style.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_style.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("PanelPositioned_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("PanelPositioned_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");
            prop_value.setDisplayName(resources.getString("PanelPositioned_value_DisplayName"));
            prop_value.setShortDescription(resources.getString("PanelPositioned_value_Description"));
            prop_value.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.faces.dt.std.ValueBindingPropertyEditor"));
            prop_value.setExpert(false);
            prop_value.setHidden(false);
            prop_value.setPreferred(false);
            attrib = new AttributeDescriptor("value",false,null,true);
            prop_value.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_value.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);
            prop_value.setValue("ignoreIsBound", "true");

            PropertyDescriptor prop_var = new PropertyDescriptor("var",beanClass,"getVar","setVar");
            prop_var.setDisplayName(resources.getString("PanelPositioned_var_DisplayName"));
            prop_var.setShortDescription(resources.getString("PanelPositioned_var_Description"));
            prop_var.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_var.setExpert(false);
            prop_var.setHidden(false);
            prop_var.setPreferred(false);
            attrib = new AttributeDescriptor("var",false,null,true);
            prop_var.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_var.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_varStatus = new PropertyDescriptor("varStatus",beanClass,"getVarStatus","setVarStatus");
            prop_varStatus.setDisplayName(resources.getString("PanelPositioned_varStatus_DisplayName"));
            prop_varStatus.setShortDescription(resources.getString("PanelPositioned_varStatus_Description"));
            prop_varStatus.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_varStatus.setExpert(false);
            prop_varStatus.setHidden(false);
            prop_varStatus.setPreferred(false);
            attrib = new AttributeDescriptor("varStatus",false,null,true);
            prop_varStatus.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_varStatus.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("PanelPositioned_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("PanelPositioned_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("PanelPositioned_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("PanelPositioned_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("PanelPositioned_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("PanelPositioned_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("PanelPositioned_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("PanelPositioned_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("PanelPositioned_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("PanelPositioned_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);
            prop_parent.setDisplayName(resources.getString("PanelPositioned_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("PanelPositioned_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("PanelPositioned_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("PanelPositioned_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("PanelPositioned_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("PanelPositioned_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rowAvailable = new PropertyDescriptor("rowAvailable",beanClass,"isRowAvailable",null);
            prop_rowAvailable.setDisplayName(resources.getString("PanelPositioned_rowAvailable_DisplayName"));
            prop_rowAvailable.setShortDescription(resources.getString("PanelPositioned_rowAvailable_Description"));
            prop_rowAvailable.setExpert(false);
            prop_rowAvailable.setHidden(true);
            prop_rowAvailable.setPreferred(false);
            prop_rowAvailable.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_rowCount = new PropertyDescriptor("rowCount",beanClass,"getRowCount",null);
            prop_rowCount.setDisplayName(resources.getString("PanelPositioned_rowCount_DisplayName"));
            prop_rowCount.setShortDescription(resources.getString("PanelPositioned_rowCount_Description"));
            prop_rowCount.setExpert(false);
            prop_rowCount.setHidden(true);
            prop_rowCount.setPreferred(false);
            prop_rowCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_rowData = new PropertyDescriptor("rowData",beanClass,"getRowData",null);
            prop_rowData.setDisplayName(resources.getString("PanelPositioned_rowData_DisplayName"));
            prop_rowData.setShortDescription(resources.getString("PanelPositioned_rowData_Description"));
            prop_rowData.setExpert(false);
            prop_rowData.setHidden(true);
            prop_rowData.setPreferred(false);
            prop_rowData.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_rowIndex = new PropertyDescriptor("rowIndex",beanClass,"getRowIndex","setRowIndex");
            prop_rowIndex.setDisplayName(resources.getString("PanelPositioned_rowIndex_DisplayName"));
            prop_rowIndex.setShortDescription(resources.getString("PanelPositioned_rowIndex_Description"));
            prop_rowIndex.setExpert(false);
            prop_rowIndex.setHidden(true);
            prop_rowIndex.setPreferred(false);
            prop_rowIndex.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_rowStatePreserved = new PropertyDescriptor("rowStatePreserved",beanClass,"isRowStatePreserved","setRowStatePreserved");
            prop_rowStatePreserved.setDisplayName(resources.getString("PanelPositioned_rowStatePreserved_DisplayName"));
            prop_rowStatePreserved.setShortDescription(resources.getString("PanelPositioned_rowStatePreserved_Description"));
            prop_rowStatePreserved.setExpert(false);
            prop_rowStatePreserved.setHidden(false);
            prop_rowStatePreserved.setPreferred(false);
            prop_rowStatePreserved.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            propDescriptors = new PropertyDescriptor[] {
                prop_attributes,
                prop_beforeChangedListener,
                prop_childCount,
                prop_children,
                prop_constraint,
                prop_disabled,
                prop_enabledOnUserRole,
                prop_facets,
                prop_family,
                prop_first,
                prop_handle,
                prop_hoverclass,
                prop_id,
                prop_listener,
                prop_overlap,
                prop_parent,
                prop_rendered,
                prop_renderedOnUserRole,
                prop_rendererType,
                prop_rendersChildren,
                prop_rowAvailable,
                prop_rowCount,
                prop_rowData,
                prop_rowIndex,
                prop_rowStatePreserved,
                prop_rows,
                prop_style,
                prop_styleClass,
                prop_value,
                prop_var,
                prop_varStatus,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
