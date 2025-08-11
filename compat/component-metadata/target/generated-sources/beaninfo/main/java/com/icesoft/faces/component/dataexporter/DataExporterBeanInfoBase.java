package com.icesoft.faces.component.dataexporter;

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

abstract class DataExporterBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.dataexporter.Bundle-JSF", Locale.getDefault(), DataExporterBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>DataExporterBeanInfoBase</code>.</p>
     */
    public DataExporterBeanInfoBase() {

        beanClass = DataExporter.class;
        iconFileName_C16 = "DataExporter_C16";
        iconFileName_C32 = "DataExporter_C32";
        iconFileName_M16 = "DataExporter_M16";
        iconFileName_M32 = "DataExporter_M32";

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
        beanDescriptor.setDisplayName(resources.getString("DataExporter_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("DataExporter_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"dataExporter");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.FALSE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"dataExporter");
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

            PropertyDescriptor prop_clickToCreateFileText = new PropertyDescriptor("clickToCreateFileText",beanClass,"getClickToCreateFileText","setClickToCreateFileText");
            prop_clickToCreateFileText.setDisplayName(resources.getString("DataExporter_clickToCreateFileText_DisplayName"));
            prop_clickToCreateFileText.setShortDescription(resources.getString("DataExporter_clickToCreateFileText_Description"));
            prop_clickToCreateFileText.setExpert(false);
            prop_clickToCreateFileText.setHidden(false);
            prop_clickToCreateFileText.setPreferred(false);
            attrib = new AttributeDescriptor("clickToCreateFileText",false,"false",true);
            prop_clickToCreateFileText.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_clickToCreateFileText.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_for = new PropertyDescriptor("for",beanClass,"getFor","setFor");
            prop_for.setDisplayName(resources.getString("DataExporter_for_DisplayName"));
            prop_for.setShortDescription(resources.getString("DataExporter_for_Description"));
            prop_for.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_for.setExpert(false);
            prop_for.setHidden(false);
            prop_for.setPreferred(false);
            attrib = new AttributeDescriptor("for",false,null,true);
            prop_for.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_for.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("DataExporter_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("DataExporter_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_ignorePagination = new PropertyDescriptor("ignorePagination",beanClass,"isIgnorePagination","setIgnorePagination");
            prop_ignorePagination.setDisplayName(resources.getString("DataExporter_ignorePagination_DisplayName"));
            prop_ignorePagination.setShortDescription(resources.getString("DataExporter_ignorePagination_Description"));
            prop_ignorePagination.setExpert(false);
            prop_ignorePagination.setHidden(false);
            prop_ignorePagination.setPreferred(false);
            attrib = new AttributeDescriptor("ignorePagination",false,"false",true);
            prop_ignorePagination.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_ignorePagination.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_image = new PropertyDescriptor("image",beanClass,"getImage","setImage");
            prop_image.setDisplayName(resources.getString("DataExporter_image_DisplayName"));
            prop_image.setShortDescription(resources.getString("DataExporter_image_Description"));
            prop_image.setExpert(false);
            prop_image.setHidden(false);
            prop_image.setPreferred(false);
            attrib = new AttributeDescriptor("image",false,null,true);
            prop_image.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_image.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_includeColumns = new PropertyDescriptor("includeColumns",beanClass,"getIncludeColumns","setIncludeColumns");
            prop_includeColumns.setDisplayName(resources.getString("DataExporter_includeColumns_DisplayName"));
            prop_includeColumns.setShortDescription(resources.getString("DataExporter_includeColumns_Description"));
            prop_includeColumns.setExpert(false);
            prop_includeColumns.setHidden(false);
            prop_includeColumns.setPreferred(false);
            attrib = new AttributeDescriptor("includeColumns",false,null,true);
            prop_includeColumns.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_includeColumns.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_label = new PropertyDescriptor("label",beanClass,"getLabel","setLabel");
            prop_label.setDisplayName(resources.getString("DataExporter_label_DisplayName"));
            prop_label.setShortDescription(resources.getString("DataExporter_label_Description"));
            prop_label.setExpert(false);
            prop_label.setHidden(false);
            prop_label.setPreferred(false);
            attrib = new AttributeDescriptor("label",false,"true",true);
            prop_label.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_label.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_outputTypeHandler = new PropertyDescriptor("outputTypeHandler",beanClass,"getOutputTypeHandler","setOutputTypeHandler");
            prop_outputTypeHandler.setDisplayName(resources.getString("DataExporter_outputTypeHandler_DisplayName"));
            prop_outputTypeHandler.setShortDescription(resources.getString("DataExporter_outputTypeHandler_Description"));
            prop_outputTypeHandler.setExpert(false);
            prop_outputTypeHandler.setHidden(false);
            prop_outputTypeHandler.setPreferred(false);
            attrib = new AttributeDescriptor("outputTypeHandler",false,null,true);
            prop_outputTypeHandler.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_outputTypeHandler.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_popupBlockerLabel = new PropertyDescriptor("popupBlockerLabel",beanClass,"getPopupBlockerLabel","setPopupBlockerLabel");
            prop_popupBlockerLabel.setDisplayName(resources.getString("DataExporter_popupBlockerLabel_DisplayName"));
            prop_popupBlockerLabel.setShortDescription(resources.getString("DataExporter_popupBlockerLabel_Description"));
            prop_popupBlockerLabel.setExpert(false);
            prop_popupBlockerLabel.setHidden(false);
            prop_popupBlockerLabel.setPreferred(false);
            attrib = new AttributeDescriptor("popupBlockerLabel",false,"true",true);
            prop_popupBlockerLabel.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_popupBlockerLabel.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_renderLabelAsButton = new PropertyDescriptor("renderLabelAsButton",beanClass,"isRenderLabelAsButton","setRenderLabelAsButton");
            prop_renderLabelAsButton.setDisplayName(resources.getString("DataExporter_renderLabelAsButton_DisplayName"));
            prop_renderLabelAsButton.setShortDescription(resources.getString("DataExporter_renderLabelAsButton_Description"));
            prop_renderLabelAsButton.setExpert(false);
            prop_renderLabelAsButton.setHidden(false);
            prop_renderLabelAsButton.setPreferred(false);
            attrib = new AttributeDescriptor("renderLabelAsButton",false,"false",true);
            prop_renderLabelAsButton.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderLabelAsButton.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("DataExporter_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("DataExporter_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");
            prop_style.setDisplayName(resources.getString("DataExporter_style_DisplayName"));
            prop_style.setShortDescription(resources.getString("DataExporter_style_Description"));
            prop_style.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.css.CssStylePropertyEditor"));
            prop_style.setExpert(false);
            prop_style.setHidden(false);
            prop_style.setPreferred(false);
            attrib = new AttributeDescriptor("style",false,null,true);
            prop_style.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_style.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("DataExporter_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("DataExporter_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.StyleClassPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_type = new PropertyDescriptor("type",beanClass,"getType","setType");
            prop_type.setDisplayName(resources.getString("DataExporter_type_DisplayName"));
            prop_type.setShortDescription(resources.getString("DataExporter_type_Description"));
            prop_type.setExpert(false);
            prop_type.setHidden(false);
            prop_type.setPreferred(false);
            attrib = new AttributeDescriptor("type",false,"true",true);
            prop_type.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_type.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("DataExporter_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("DataExporter_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("DataExporter_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("DataExporter_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("DataExporter_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("DataExporter_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("DataExporter_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("DataExporter_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("DataExporter_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("DataExporter_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent","setParent");
            prop_parent.setDisplayName(resources.getString("DataExporter_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("DataExporter_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("DataExporter_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("DataExporter_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("DataExporter_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("DataExporter_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            propDescriptors = new PropertyDescriptor[] {
                prop_attributes,
                prop_childCount,
                prop_children,
                prop_clickToCreateFileText,
                prop_facets,
                prop_family,
                prop_for,
                prop_id,
                prop_ignorePagination,
                prop_image,
                prop_includeColumns,
                prop_label,
                prop_outputTypeHandler,
                prop_parent,
                prop_popupBlockerLabel,
                prop_renderLabelAsButton,
                prop_rendered,
                prop_rendererType,
                prop_rendersChildren,
                prop_style,
                prop_styleClass,
                prop_type,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
