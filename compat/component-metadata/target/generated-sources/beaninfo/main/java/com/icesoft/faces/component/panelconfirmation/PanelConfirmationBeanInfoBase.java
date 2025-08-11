package com.icesoft.faces.component.panelconfirmation;

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

abstract class PanelConfirmationBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.panelconfirmation.Bundle-JSF", Locale.getDefault(), PanelConfirmationBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>PanelConfirmationBeanInfoBase</code>.</p>
     */
    public PanelConfirmationBeanInfoBase() {

        beanClass = PanelConfirmation.class;
        iconFileName_C16 = "PanelConfirmation_C16";
        iconFileName_C32 = "PanelConfirmation_C32";
        iconFileName_M16 = "PanelConfirmation_M16";
        iconFileName_M32 = "PanelConfirmation_M32";

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
        beanDescriptor.setDisplayName(resources.getString("PanelConfirmation_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("PanelConfirmation_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"panelConfirmation");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.FALSE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"panelConfirmation");
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

            PropertyDescriptor prop_acceptLabel = new PropertyDescriptor("acceptLabel",beanClass,"getAcceptLabel","setAcceptLabel");
            prop_acceptLabel.setDisplayName(resources.getString("PanelConfirmation_acceptLabel_DisplayName"));
            prop_acceptLabel.setShortDescription(resources.getString("PanelConfirmation_acceptLabel_Description"));
            prop_acceptLabel.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_acceptLabel.setExpert(false);
            prop_acceptLabel.setHidden(false);
            prop_acceptLabel.setPreferred(false);
            attrib = new AttributeDescriptor("acceptLabel",false,null,true);
            prop_acceptLabel.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_acceptLabel.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_autoCentre = new PropertyDescriptor("autoCentre",beanClass,"isAutoCentre","setAutoCentre");
            prop_autoCentre.setDisplayName(resources.getString("PanelConfirmation_autoCentre_DisplayName"));
            prop_autoCentre.setShortDescription(resources.getString("PanelConfirmation_autoCentre_Description"));
            prop_autoCentre.setExpert(false);
            prop_autoCentre.setHidden(false);
            prop_autoCentre.setPreferred(false);
            attrib = new AttributeDescriptor("autoCentre",false,"false",true);
            prop_autoCentre.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_autoCentre.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_cancelLabel = new PropertyDescriptor("cancelLabel",beanClass,"getCancelLabel","setCancelLabel");
            prop_cancelLabel.setDisplayName(resources.getString("PanelConfirmation_cancelLabel_DisplayName"));
            prop_cancelLabel.setShortDescription(resources.getString("PanelConfirmation_cancelLabel_Description"));
            prop_cancelLabel.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_cancelLabel.setExpert(false);
            prop_cancelLabel.setHidden(false);
            prop_cancelLabel.setPreferred(false);
            attrib = new AttributeDescriptor("cancelLabel",false,null,true);
            prop_cancelLabel.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_cancelLabel.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_displayAtMouse = new PropertyDescriptor("displayAtMouse",beanClass,"isDisplayAtMouse","setDisplayAtMouse");
            prop_displayAtMouse.setDisplayName(resources.getString("PanelConfirmation_displayAtMouse_DisplayName"));
            prop_displayAtMouse.setShortDescription(resources.getString("PanelConfirmation_displayAtMouse_Description"));
            prop_displayAtMouse.setExpert(false);
            prop_displayAtMouse.setHidden(false);
            prop_displayAtMouse.setPreferred(false);
            attrib = new AttributeDescriptor("displayAtMouse",false,"false",true);
            prop_displayAtMouse.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_displayAtMouse.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_draggable = new PropertyDescriptor("draggable",beanClass,"isDraggable","setDraggable");
            prop_draggable.setDisplayName(resources.getString("PanelConfirmation_draggable_DisplayName"));
            prop_draggable.setShortDescription(resources.getString("PanelConfirmation_draggable_Description"));
            prop_draggable.setExpert(false);
            prop_draggable.setHidden(false);
            prop_draggable.setPreferred(false);
            attrib = new AttributeDescriptor("draggable",false,"false",true);
            prop_draggable.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_draggable.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_escape = new PropertyDescriptor("escape",beanClass,"isEscape","setEscape");
            prop_escape.setDisplayName(resources.getString("PanelConfirmation_escape_DisplayName"));
            prop_escape.setShortDescription(resources.getString("PanelConfirmation_escape_Description"));
            prop_escape.setExpert(false);
            prop_escape.setHidden(false);
            prop_escape.setPreferred(false);
            attrib = new AttributeDescriptor("escape",false,"true",true);
            prop_escape.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_escape.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("PanelConfirmation_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("PanelConfirmation_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_message = new PropertyDescriptor("message",beanClass,"getMessage","setMessage");
            prop_message.setDisplayName(resources.getString("PanelConfirmation_message_DisplayName"));
            prop_message.setShortDescription(resources.getString("PanelConfirmation_message_Description"));
            prop_message.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_message.setExpert(false);
            prop_message.setHidden(false);
            prop_message.setPreferred(false);
            attrib = new AttributeDescriptor("message",false,null,true);
            prop_message.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_message.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("PanelConfirmation_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("PanelConfirmation_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");
            prop_style.setDisplayName(resources.getString("PanelConfirmation_style_DisplayName"));
            prop_style.setShortDescription(resources.getString("PanelConfirmation_style_Description"));
            prop_style.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.css.CssStylePropertyEditor"));
            prop_style.setExpert(false);
            prop_style.setHidden(false);
            prop_style.setPreferred(false);
            attrib = new AttributeDescriptor("style",false,null,true);
            prop_style.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_style.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("PanelConfirmation_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("PanelConfirmation_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.StyleClassPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_title = new PropertyDescriptor("title",beanClass,"getTitle","setTitle");
            prop_title.setDisplayName(resources.getString("PanelConfirmation_title_DisplayName"));
            prop_title.setShortDescription(resources.getString("PanelConfirmation_title_Description"));
            prop_title.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_title.setExpert(false);
            prop_title.setHidden(false);
            prop_title.setPreferred(false);
            attrib = new AttributeDescriptor("title",false,null,true);
            prop_title.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_title.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_type = new PropertyDescriptor("type",beanClass,"getType","setType");
            prop_type.setDisplayName(resources.getString("PanelConfirmation_type_DisplayName"));
            prop_type.setShortDescription(resources.getString("PanelConfirmation_type_Description"));
            prop_type.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.SelectOneDomainEditor"));
            prop_type.setExpert(false);
            prop_type.setHidden(false);
            prop_type.setPreferred(false);
            attrib = new AttributeDescriptor("type",false,"\"normal\"",true);
            prop_type.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_type.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("PanelConfirmation_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("PanelConfirmation_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("PanelConfirmation_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("PanelConfirmation_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("PanelConfirmation_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("PanelConfirmation_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("PanelConfirmation_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("PanelConfirmation_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("PanelConfirmation_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("PanelConfirmation_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent","setParent");
            prop_parent.setDisplayName(resources.getString("PanelConfirmation_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("PanelConfirmation_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("PanelConfirmation_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("PanelConfirmation_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("PanelConfirmation_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("PanelConfirmation_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            propDescriptors = new PropertyDescriptor[] {
                prop_acceptLabel,
                prop_attributes,
                prop_autoCentre,
                prop_cancelLabel,
                prop_childCount,
                prop_children,
                prop_displayAtMouse,
                prop_draggable,
                prop_escape,
                prop_facets,
                prop_family,
                prop_id,
                prop_message,
                prop_parent,
                prop_rendered,
                prop_rendererType,
                prop_rendersChildren,
                prop_style,
                prop_styleClass,
                prop_title,
                prop_type,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
