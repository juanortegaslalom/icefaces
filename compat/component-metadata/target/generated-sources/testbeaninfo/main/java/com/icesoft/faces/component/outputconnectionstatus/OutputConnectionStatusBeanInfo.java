package com.icesoft.faces.component.outputconnectionstatus;

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

public class OutputConnectionStatusBeanInfo extends SimpleBeanInfo {

    /**
     * <p>Construct a new <code>OutputConnectionStatusBeanInfo</code>.</p>
     */
    public OutputConnectionStatusBeanInfo() {

        beanClass = OutputConnectionStatus.class;

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

            PropertyDescriptor prop_activeLabel = new PropertyDescriptor("activeLabel",beanClass,"getActiveLabel","setActiveLabel");

            PropertyDescriptor prop_cautionLabel = new PropertyDescriptor("cautionLabel",beanClass,"getCautionLabel","setCautionLabel");

            PropertyDescriptor prop_disconnectedLabel = new PropertyDescriptor("disconnectedLabel",beanClass,"getDisconnectedLabel","setDisconnectedLabel");

            PropertyDescriptor prop_displayHourglassWhenActive = new PropertyDescriptor("displayHourglassWhenActive",beanClass,"isDisplayHourglassWhenActive","setDisplayHourglassWhenActive");

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");

            PropertyDescriptor prop_inactiveLabel = new PropertyDescriptor("inactiveLabel",beanClass,"getInactiveLabel","setInactiveLabel");

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");

            PropertyDescriptor prop_showPopupOnDisconnect = new PropertyDescriptor("showPopupOnDisconnect",beanClass,"isShowPopupOnDisconnect","setShowPopupOnDisconnect");

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");

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
