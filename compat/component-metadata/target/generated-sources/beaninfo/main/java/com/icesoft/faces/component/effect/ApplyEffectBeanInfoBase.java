package com.icesoft.faces.component.effect;

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

abstract class ApplyEffectBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.effect.Bundle-JSF", Locale.getDefault(), ApplyEffectBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>ApplyEffectBeanInfoBase</code>.</p>
     */
    public ApplyEffectBeanInfoBase() {

        beanClass = ApplyEffect.class;
        iconFileName_C16 = "ApplyEffect_C16";
        iconFileName_C32 = "ApplyEffect_C32";
        iconFileName_M16 = "ApplyEffect_M16";
        iconFileName_M32 = "ApplyEffect_M32";

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
        beanDescriptor.setDisplayName(resources.getString("ApplyEffect_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("ApplyEffect_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"effect");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.FALSE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"effect");
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

            PropertyDescriptor prop_autoReset = new PropertyDescriptor("autoReset",beanClass,"isAutoReset","setAutoReset");
            prop_autoReset.setDisplayName(resources.getString("ApplyEffect_autoReset_DisplayName"));
            prop_autoReset.setShortDescription(resources.getString("ApplyEffect_autoReset_Description"));
            prop_autoReset.setExpert(false);
            prop_autoReset.setHidden(false);
            prop_autoReset.setPreferred(false);
            attrib = new AttributeDescriptor("autoReset",false,"true",true);
            prop_autoReset.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_autoReset.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_effectType = new PropertyDescriptor("effectType",beanClass,"getEffectType","setEffectType");
            prop_effectType.setDisplayName(resources.getString("ApplyEffect_effectType_DisplayName"));
            prop_effectType.setShortDescription(resources.getString("ApplyEffect_effectType_Description"));
            prop_effectType.setExpert(false);
            prop_effectType.setHidden(false);
            prop_effectType.setPreferred(false);
            attrib = new AttributeDescriptor("effectType",false,null,true);
            prop_effectType.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_effectType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_event = new PropertyDescriptor("event",beanClass,"getEvent","setEvent");
            prop_event.setDisplayName(resources.getString("ApplyEffect_event_DisplayName"));
            prop_event.setShortDescription(resources.getString("ApplyEffect_event_Description"));
            prop_event.setExpert(false);
            prop_event.setHidden(false);
            prop_event.setPreferred(false);
            attrib = new AttributeDescriptor("event",false,null,true);
            prop_event.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_event.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_fire = new PropertyDescriptor("fire",beanClass,"isFire","setFire");
            prop_fire.setDisplayName(resources.getString("ApplyEffect_fire_DisplayName"));
            prop_fire.setShortDescription(resources.getString("ApplyEffect_fire_Description"));
            prop_fire.setExpert(false);
            prop_fire.setHidden(false);
            prop_fire.setPreferred(false);
            attrib = new AttributeDescriptor("fire",false,"false",true);
            prop_fire.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_fire.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("ApplyEffect_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("ApplyEffect_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_options = new PropertyDescriptor("options",beanClass,"getOptions","setOptions");
            prop_options.setDisplayName(resources.getString("ApplyEffect_options_DisplayName"));
            prop_options.setShortDescription(resources.getString("ApplyEffect_options_Description"));
            prop_options.setExpert(false);
            prop_options.setHidden(false);
            prop_options.setPreferred(false);
            attrib = new AttributeDescriptor("options",false,null,true);
            prop_options.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_options.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("ApplyEffect_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("ApplyEffect_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_sequence = new PropertyDescriptor("sequence",beanClass,"getSequence","setSequence");
            prop_sequence.setDisplayName(resources.getString("ApplyEffect_sequence_DisplayName"));
            prop_sequence.setShortDescription(resources.getString("ApplyEffect_sequence_Description"));
            prop_sequence.setExpert(false);
            prop_sequence.setHidden(false);
            prop_sequence.setPreferred(false);
            attrib = new AttributeDescriptor("sequence",false,null,true);
            prop_sequence.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_sequence.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_sequenceNumber = new PropertyDescriptor("sequenceNumber",beanClass,"getSequenceNumber","setSequenceNumber");
            prop_sequenceNumber.setDisplayName(resources.getString("ApplyEffect_sequenceNumber_DisplayName"));
            prop_sequenceNumber.setShortDescription(resources.getString("ApplyEffect_sequenceNumber_Description"));
            prop_sequenceNumber.setExpert(false);
            prop_sequenceNumber.setHidden(false);
            prop_sequenceNumber.setPreferred(false);
            attrib = new AttributeDescriptor("sequenceNumber",false,"0",true);
            prop_sequenceNumber.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_sequenceNumber.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_submit = new PropertyDescriptor("submit",beanClass,"isSubmit","setSubmit");
            prop_submit.setDisplayName(resources.getString("ApplyEffect_submit_DisplayName"));
            prop_submit.setShortDescription(resources.getString("ApplyEffect_submit_Description"));
            prop_submit.setExpert(false);
            prop_submit.setHidden(false);
            prop_submit.setPreferred(false);
            attrib = new AttributeDescriptor("submit",false,"false",true);
            prop_submit.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_submit.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_transitory = new PropertyDescriptor("transitory",beanClass,"isTransitory","setTransitory");
            prop_transitory.setDisplayName(resources.getString("ApplyEffect_transitory_DisplayName"));
            prop_transitory.setShortDescription(resources.getString("ApplyEffect_transitory_Description"));
            prop_transitory.setExpert(false);
            prop_transitory.setHidden(false);
            prop_transitory.setPreferred(false);
            attrib = new AttributeDescriptor("transitory",false,"true",true);
            prop_transitory.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_transitory.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("ApplyEffect_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("ApplyEffect_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("ApplyEffect_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("ApplyEffect_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("ApplyEffect_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("ApplyEffect_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("ApplyEffect_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("ApplyEffect_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("ApplyEffect_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("ApplyEffect_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent","setParent");
            prop_parent.setDisplayName(resources.getString("ApplyEffect_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("ApplyEffect_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("ApplyEffect_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("ApplyEffect_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("ApplyEffect_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("ApplyEffect_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            propDescriptors = new PropertyDescriptor[] {
                prop_attributes,
                prop_autoReset,
                prop_childCount,
                prop_children,
                prop_effectType,
                prop_event,
                prop_facets,
                prop_family,
                prop_fire,
                prop_id,
                prop_options,
                prop_parent,
                prop_rendered,
                prop_rendererType,
                prop_rendersChildren,
                prop_sequence,
                prop_sequenceNumber,
                prop_submit,
                prop_transitory,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
