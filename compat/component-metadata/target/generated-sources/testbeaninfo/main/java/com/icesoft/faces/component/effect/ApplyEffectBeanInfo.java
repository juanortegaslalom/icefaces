package com.icesoft.faces.component.effect;

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

public class ApplyEffectBeanInfo extends SimpleBeanInfo {

    /**
     * <p>Construct a new <code>ApplyEffectBeanInfo</code>.</p>
     */
    public ApplyEffectBeanInfo() {

        beanClass = ApplyEffect.class;

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

            PropertyDescriptor prop_autoReset = new PropertyDescriptor("autoReset",beanClass,"isAutoReset","setAutoReset");

            PropertyDescriptor prop_effectType = new PropertyDescriptor("effectType",beanClass,"getEffectType","setEffectType");

            PropertyDescriptor prop_event = new PropertyDescriptor("event",beanClass,"getEvent","setEvent");

            PropertyDescriptor prop_fire = new PropertyDescriptor("fire",beanClass,"isFire","setFire");

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");

            PropertyDescriptor prop_options = new PropertyDescriptor("options",beanClass,"getOptions","setOptions");

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");

            PropertyDescriptor prop_sequence = new PropertyDescriptor("sequence",beanClass,"getSequence","setSequence");

            PropertyDescriptor prop_sequenceNumber = new PropertyDescriptor("sequenceNumber",beanClass,"getSequenceNumber","setSequenceNumber");

            PropertyDescriptor prop_submit = new PropertyDescriptor("submit",beanClass,"isSubmit","setSubmit");

            PropertyDescriptor prop_transitory = new PropertyDescriptor("transitory",beanClass,"isTransitory","setTransitory");

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent","setParent");

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);

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
