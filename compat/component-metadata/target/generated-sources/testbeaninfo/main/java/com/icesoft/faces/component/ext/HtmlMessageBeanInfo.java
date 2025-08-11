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

public class HtmlMessageBeanInfo extends SimpleBeanInfo {

    /**
     * <p>Construct a new <code>HtmlMessageBeanInfo</code>.</p>
     */
    public HtmlMessageBeanInfo() {

        beanClass = HtmlMessage.class;

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

            PropertyDescriptor prop_dir = new PropertyDescriptor("dir",beanClass,"getDir","setDir");

            PropertyDescriptor prop_effect = new PropertyDescriptor("effect",beanClass,"getEffect","setEffect");

            PropertyDescriptor prop_errorClass = new PropertyDescriptor("errorClass",beanClass,"getErrorClass","setErrorClass");

            PropertyDescriptor prop_errorStyle = new PropertyDescriptor("errorStyle",beanClass,"getErrorStyle","setErrorStyle");

            PropertyDescriptor prop_escape = new PropertyDescriptor("escape",beanClass,"isEscape","setEscape");

            PropertyDescriptor prop_fatalClass = new PropertyDescriptor("fatalClass",beanClass,"getFatalClass","setFatalClass");

            PropertyDescriptor prop_fatalStyle = new PropertyDescriptor("fatalStyle",beanClass,"getFatalStyle","setFatalStyle");

            PropertyDescriptor prop_for = new PropertyDescriptor("for",beanClass,"getFor","setFor");

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");

            PropertyDescriptor prop_infoClass = new PropertyDescriptor("infoClass",beanClass,"getInfoClass","setInfoClass");

            PropertyDescriptor prop_infoStyle = new PropertyDescriptor("infoStyle",beanClass,"getInfoStyle","setInfoStyle");

            PropertyDescriptor prop_lang = new PropertyDescriptor("lang",beanClass,"getLang","setLang");

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");

            PropertyDescriptor prop_showDetail = new PropertyDescriptor("showDetail",beanClass,"isShowDetail","setShowDetail");

            PropertyDescriptor prop_showSummary = new PropertyDescriptor("showSummary",beanClass,"isShowSummary","setShowSummary");

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");

            PropertyDescriptor prop_title = new PropertyDescriptor("title",beanClass,"getTitle","setTitle");

            PropertyDescriptor prop_tooltip = new PropertyDescriptor("tooltip",beanClass,"isTooltip","setTooltip");

            PropertyDescriptor prop_visible = new PropertyDescriptor("visible",beanClass,"isVisible","setVisible");

            PropertyDescriptor prop_warnClass = new PropertyDescriptor("warnClass",beanClass,"getWarnClass","setWarnClass");

            PropertyDescriptor prop_warnStyle = new PropertyDescriptor("warnStyle",beanClass,"getWarnStyle","setWarnStyle");

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);

            propDescriptors = new PropertyDescriptor[] {
                prop_attributes,
                prop_childCount,
                prop_children,
                prop_dir,
                prop_effect,
                prop_errorClass,
                prop_errorStyle,
                prop_escape,
                prop_facets,
                prop_family,
                prop_fatalClass,
                prop_fatalStyle,
                prop_for,
                prop_id,
                prop_infoClass,
                prop_infoStyle,
                prop_lang,
                prop_parent,
                prop_rendered,
                prop_renderedOnUserRole,
                prop_rendererType,
                prop_rendersChildren,
                prop_showDetail,
                prop_showSummary,
                prop_style,
                prop_styleClass,
                prop_title,
                prop_tooltip,
                prop_visible,
                prop_warnClass,
                prop_warnStyle,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
