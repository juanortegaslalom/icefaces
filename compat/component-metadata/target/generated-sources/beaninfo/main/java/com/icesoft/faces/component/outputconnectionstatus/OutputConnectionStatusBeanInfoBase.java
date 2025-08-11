package com.icesoft.faces.component.outputconnectionstatus;

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

abstract class OutputConnectionStatusBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.outputconnectionstatus.Bundle-JSF", Locale.getDefault(), OutputConnectionStatusBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>OutputConnectionStatusBeanInfoBase</code>.</p>
     */
    public OutputConnectionStatusBeanInfoBase() {

        beanClass = OutputConnectionStatus.class;
        iconFileName_C16 = "OutputConnectionStatus_C16";
        iconFileName_C32 = "OutputConnectionStatus_C32";
        iconFileName_M16 = "OutputConnectionStatus_M16";
        iconFileName_M32 = "OutputConnectionStatus_M32";

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
        beanDescriptor.setDisplayName(resources.getString("OutputConnectionStatus_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("OutputConnectionStatus_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"outputConnectionStatus");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.FALSE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"outputConnectionStatus");
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

            PropertyDescriptor prop_activeLabel = new PropertyDescriptor("activeLabel",beanClass,"getActiveLabel","setActiveLabel");
            prop_activeLabel.setDisplayName(resources.getString("OutputConnectionStatus_activeLabel_DisplayName"));
            prop_activeLabel.setShortDescription(resources.getString("OutputConnectionStatus_activeLabel_Description"));
            prop_activeLabel.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_activeLabel.setExpert(false);
            prop_activeLabel.setHidden(false);
            prop_activeLabel.setPreferred(false);
            attrib = new AttributeDescriptor("activeLabel",false,"\"\"",true);
            prop_activeLabel.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_activeLabel.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_cautionLabel = new PropertyDescriptor("cautionLabel",beanClass,"getCautionLabel","setCautionLabel");
            prop_cautionLabel.setDisplayName(resources.getString("OutputConnectionStatus_cautionLabel_DisplayName"));
            prop_cautionLabel.setShortDescription(resources.getString("OutputConnectionStatus_cautionLabel_Description"));
            prop_cautionLabel.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_cautionLabel.setExpert(false);
            prop_cautionLabel.setHidden(false);
            prop_cautionLabel.setPreferred(false);
            attrib = new AttributeDescriptor("cautionLabel",false,"\"\"",true);
            prop_cautionLabel.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_cautionLabel.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_disconnectedLabel = new PropertyDescriptor("disconnectedLabel",beanClass,"getDisconnectedLabel","setDisconnectedLabel");
            prop_disconnectedLabel.setDisplayName(resources.getString("OutputConnectionStatus_disconnectedLabel_DisplayName"));
            prop_disconnectedLabel.setShortDescription(resources.getString("OutputConnectionStatus_disconnectedLabel_Description"));
            prop_disconnectedLabel.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_disconnectedLabel.setExpert(false);
            prop_disconnectedLabel.setHidden(false);
            prop_disconnectedLabel.setPreferred(false);
            attrib = new AttributeDescriptor("disconnectedLabel",false,"\"\"",true);
            prop_disconnectedLabel.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_disconnectedLabel.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_displayHourglassWhenActive = new PropertyDescriptor("displayHourglassWhenActive",beanClass,"isDisplayHourglassWhenActive","setDisplayHourglassWhenActive");
            prop_displayHourglassWhenActive.setDisplayName(resources.getString("OutputConnectionStatus_displayHourglassWhenActive_DisplayName"));
            prop_displayHourglassWhenActive.setShortDescription(resources.getString("OutputConnectionStatus_displayHourglassWhenActive_Description"));
            prop_displayHourglassWhenActive.setExpert(false);
            prop_displayHourglassWhenActive.setHidden(false);
            prop_displayHourglassWhenActive.setPreferred(false);
            attrib = new AttributeDescriptor("displayHourglassWhenActive",false,"false",true);
            prop_displayHourglassWhenActive.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_displayHourglassWhenActive.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("OutputConnectionStatus_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("OutputConnectionStatus_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_inactiveLabel = new PropertyDescriptor("inactiveLabel",beanClass,"getInactiveLabel","setInactiveLabel");
            prop_inactiveLabel.setDisplayName(resources.getString("OutputConnectionStatus_inactiveLabel_DisplayName"));
            prop_inactiveLabel.setShortDescription(resources.getString("OutputConnectionStatus_inactiveLabel_Description"));
            prop_inactiveLabel.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_inactiveLabel.setExpert(false);
            prop_inactiveLabel.setHidden(false);
            prop_inactiveLabel.setPreferred(false);
            attrib = new AttributeDescriptor("inactiveLabel",false,"\"\"",true);
            prop_inactiveLabel.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_inactiveLabel.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("OutputConnectionStatus_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("OutputConnectionStatus_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");
            prop_renderedOnUserRole.setDisplayName(resources.getString("OutputConnectionStatus_renderedOnUserRole_DisplayName"));
            prop_renderedOnUserRole.setShortDescription(resources.getString("OutputConnectionStatus_renderedOnUserRole_Description"));
            prop_renderedOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_renderedOnUserRole.setExpert(false);
            prop_renderedOnUserRole.setHidden(false);
            prop_renderedOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("renderedOnUserRole",false,null,true);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_showPopupOnDisconnect = new PropertyDescriptor("showPopupOnDisconnect",beanClass,"isShowPopupOnDisconnect","setShowPopupOnDisconnect");
            prop_showPopupOnDisconnect.setDisplayName(resources.getString("OutputConnectionStatus_showPopupOnDisconnect_DisplayName"));
            prop_showPopupOnDisconnect.setShortDescription(resources.getString("OutputConnectionStatus_showPopupOnDisconnect_Description"));
            prop_showPopupOnDisconnect.setExpert(false);
            prop_showPopupOnDisconnect.setHidden(false);
            prop_showPopupOnDisconnect.setPreferred(false);
            attrib = new AttributeDescriptor("showPopupOnDisconnect",false,"false",true);
            prop_showPopupOnDisconnect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_showPopupOnDisconnect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");
            prop_style.setDisplayName(resources.getString("OutputConnectionStatus_style_DisplayName"));
            prop_style.setShortDescription(resources.getString("OutputConnectionStatus_style_Description"));
            prop_style.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.css.CssStylePropertyEditor"));
            prop_style.setExpert(false);
            prop_style.setHidden(false);
            prop_style.setPreferred(false);
            attrib = new AttributeDescriptor("style",false,null,true);
            prop_style.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_style.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("OutputConnectionStatus_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("OutputConnectionStatus_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("OutputConnectionStatus_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("OutputConnectionStatus_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("OutputConnectionStatus_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("OutputConnectionStatus_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("OutputConnectionStatus_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("OutputConnectionStatus_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("OutputConnectionStatus_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("OutputConnectionStatus_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("OutputConnectionStatus_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("OutputConnectionStatus_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_layout = new PropertyDescriptor("layout",beanClass,"getLayout","setLayout");
            prop_layout.setDisplayName(resources.getString("OutputConnectionStatus_layout_DisplayName"));
            prop_layout.setShortDescription(resources.getString("OutputConnectionStatus_layout_Description"));
            prop_layout.setExpert(false);
            prop_layout.setHidden(false);
            prop_layout.setPreferred(false);
            attrib = new AttributeDescriptor("layout",false,null,true);
            prop_layout.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_layout.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);
            prop_parent.setDisplayName(resources.getString("OutputConnectionStatus_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("OutputConnectionStatus_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("OutputConnectionStatus_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("OutputConnectionStatus_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("OutputConnectionStatus_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("OutputConnectionStatus_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            propDescriptors = new PropertyDescriptor[] {
                prop_activeLabel,
                prop_attributes,
                prop_cautionLabel,
                prop_childCount,
                prop_children,
                prop_disconnectedLabel,
                prop_displayHourglassWhenActive,
                prop_facets,
                prop_family,
                prop_id,
                prop_inactiveLabel,
                prop_layout,
                prop_parent,
                prop_rendered,
                prop_renderedOnUserRole,
                prop_rendererType,
                prop_rendersChildren,
                prop_showPopupOnDisconnect,
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
