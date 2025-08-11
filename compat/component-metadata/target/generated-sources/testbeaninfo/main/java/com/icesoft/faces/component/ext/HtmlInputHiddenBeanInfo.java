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

public class HtmlInputHiddenBeanInfo extends SimpleBeanInfo {

    /**
     * <p>Construct a new <code>HtmlInputHiddenBeanInfo</code>.</p>
     */
    public HtmlInputHiddenBeanInfo() {

        beanClass = HtmlInputHidden.class;

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

            PropertyDescriptor prop_converter = new PropertyDescriptor("converter",beanClass,"getConverter","setConverter");

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");

            PropertyDescriptor prop_immediate = new PropertyDescriptor("immediate",beanClass,"isImmediate","setImmediate");

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");

            PropertyDescriptor prop_required = new PropertyDescriptor("required",beanClass,"isRequired","setRequired");

            PropertyDescriptor prop_requiredMessage = new PropertyDescriptor("requiredMessage",beanClass,"getRequiredMessage","setRequiredMessage");

            PropertyDescriptor prop_validator = new PropertyDescriptor("validator",beanClass,"getValidator","setValidator");

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");

            PropertyDescriptor prop_valueChangeListener = new PropertyDescriptor("valueChangeListener",beanClass,"getValueChangeListener","setValueChangeListener");

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);

            PropertyDescriptor prop_converterMessage = new PropertyDescriptor("converterMessage",beanClass,"getConverterMessage","setConverterMessage");

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);

            PropertyDescriptor prop_localValue = new PropertyDescriptor("localValue",beanClass,"getLocalValue",null);

            PropertyDescriptor prop_localValueSet = new PropertyDescriptor("localValueSet",beanClass,"isLocalValueSet","setLocalValueSet");

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);

            PropertyDescriptor prop_submittedValue = new PropertyDescriptor("submittedValue",beanClass,"getSubmittedValue","setSubmittedValue");

            PropertyDescriptor prop_validatorMessage = new PropertyDescriptor("validatorMessage",beanClass,"getValidatorMessage","setValidatorMessage");

            propDescriptors = new PropertyDescriptor[] {
                prop_attributes,
                prop_childCount,
                prop_children,
                prop_converter,
                prop_converterMessage,
                prop_facets,
                prop_family,
                prop_id,
                prop_immediate,
                prop_localValue,
                prop_localValueSet,
                prop_parent,
                prop_rendered,
                prop_rendererType,
                prop_rendersChildren,
                prop_required,
                prop_requiredMessage,
                prop_submittedValue,
                prop_validator,
                prop_validatorMessage,
                prop_value,
                prop_valueChangeListener,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
