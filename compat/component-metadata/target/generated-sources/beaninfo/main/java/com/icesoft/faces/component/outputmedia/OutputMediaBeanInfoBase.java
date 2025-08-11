package com.icesoft.faces.component.outputmedia;

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

abstract class OutputMediaBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.outputmedia.Bundle-JSF", Locale.getDefault(), OutputMediaBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>OutputMediaBeanInfoBase</code>.</p>
     */
    public OutputMediaBeanInfoBase() {

        beanClass = OutputMedia.class;
        iconFileName_C16 = "OutputMedia_C16";
        iconFileName_C32 = "OutputMedia_C32";
        iconFileName_M16 = "OutputMedia_M16";
        iconFileName_M32 = "OutputMedia_M32";

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
        beanDescriptor.setDisplayName(resources.getString("OutputMedia_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("OutputMedia_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"outputMedia");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.FALSE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"outputMedia");
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

            PropertyDescriptor prop_codebase = new PropertyDescriptor("codebase",beanClass,"getCodebase","setCodebase");
            prop_codebase.setDisplayName(resources.getString("OutputMedia_codebase_DisplayName"));
            prop_codebase.setShortDescription(resources.getString("OutputMedia_codebase_Description"));
            prop_codebase.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_codebase.setExpert(false);
            prop_codebase.setHidden(false);
            prop_codebase.setPreferred(false);
            attrib = new AttributeDescriptor("codebase",false,null,true);
            prop_codebase.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_codebase.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("OutputMedia_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("OutputMedia_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_mimeType = new PropertyDescriptor("mimeType",beanClass,"getMimeType","setMimeType");
            prop_mimeType.setDisplayName(resources.getString("OutputMedia_mimeType_DisplayName"));
            prop_mimeType.setShortDescription(resources.getString("OutputMedia_mimeType_Description"));
            prop_mimeType.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_mimeType.setExpert(false);
            prop_mimeType.setHidden(false);
            prop_mimeType.setPreferred(false);
            attrib = new AttributeDescriptor("mimeType",false,null,true);
            prop_mimeType.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_mimeType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_player = new PropertyDescriptor("player",beanClass,"getPlayer","setPlayer");
            prop_player.setDisplayName(resources.getString("OutputMedia_player_DisplayName"));
            prop_player.setShortDescription(resources.getString("OutputMedia_player_Description"));
            prop_player.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.SelectOneDomainEditor"));
            prop_player.setExpert(false);
            prop_player.setHidden(false);
            prop_player.setPreferred(false);
            attrib = new AttributeDescriptor("player",false,null,true);
            prop_player.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_player.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("OutputMedia_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("OutputMedia_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");
            prop_renderedOnUserRole.setDisplayName(resources.getString("OutputMedia_renderedOnUserRole_DisplayName"));
            prop_renderedOnUserRole.setShortDescription(resources.getString("OutputMedia_renderedOnUserRole_Description"));
            prop_renderedOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_renderedOnUserRole.setExpert(false);
            prop_renderedOnUserRole.setHidden(false);
            prop_renderedOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("renderedOnUserRole",false,null,true);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_source = new PropertyDescriptor("source",beanClass,"getSource","setSource");
            prop_source.setDisplayName(resources.getString("OutputMedia_source_DisplayName"));
            prop_source.setShortDescription(resources.getString("OutputMedia_source_Description"));
            prop_source.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_source.setExpert(false);
            prop_source.setHidden(false);
            prop_source.setPreferred(false);
            attrib = new AttributeDescriptor("source",false,null,true);
            prop_source.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_source.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_standbyText = new PropertyDescriptor("standbyText",beanClass,"getStandbyText","setStandbyText");
            prop_standbyText.setDisplayName(resources.getString("OutputMedia_standbyText_DisplayName"));
            prop_standbyText.setShortDescription(resources.getString("OutputMedia_standbyText_Description"));
            prop_standbyText.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_standbyText.setExpert(false);
            prop_standbyText.setHidden(false);
            prop_standbyText.setPreferred(false);
            attrib = new AttributeDescriptor("standbyText",false,null,true);
            prop_standbyText.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_standbyText.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");
            prop_style.setDisplayName(resources.getString("OutputMedia_style_DisplayName"));
            prop_style.setShortDescription(resources.getString("OutputMedia_style_Description"));
            prop_style.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.css.CssStylePropertyEditor"));
            prop_style.setExpert(false);
            prop_style.setHidden(false);
            prop_style.setPreferred(false);
            attrib = new AttributeDescriptor("style",false,null,true);
            prop_style.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_style.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("OutputMedia_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("OutputMedia_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.StyleClassPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("OutputMedia_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("OutputMedia_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("OutputMedia_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("OutputMedia_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("OutputMedia_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("OutputMedia_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("OutputMedia_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("OutputMedia_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("OutputMedia_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("OutputMedia_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent","setParent");
            prop_parent.setDisplayName(resources.getString("OutputMedia_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("OutputMedia_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("OutputMedia_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("OutputMedia_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("OutputMedia_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("OutputMedia_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            propDescriptors = new PropertyDescriptor[] {
                prop_attributes,
                prop_childCount,
                prop_children,
                prop_codebase,
                prop_facets,
                prop_family,
                prop_id,
                prop_mimeType,
                prop_parent,
                prop_player,
                prop_rendered,
                prop_renderedOnUserRole,
                prop_rendererType,
                prop_rendersChildren,
                prop_source,
                prop_standbyText,
                prop_style,
                prop_styleClass,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
