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

public class HtmlFormBeanInfo extends SimpleBeanInfo {

    /**
     * <p>Construct a new <code>HtmlFormBeanInfo</code>.</p>
     */
    public HtmlFormBeanInfo() {

        beanClass = HtmlForm.class;

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

            PropertyDescriptor prop_accept = new PropertyDescriptor("accept",beanClass,"getAccept","setAccept");

            PropertyDescriptor prop_acceptcharset = new PropertyDescriptor("acceptcharset",beanClass,"getAcceptcharset","setAcceptcharset");

            PropertyDescriptor prop_action = new PropertyDescriptor("action",beanClass,"getAction","setAction");

            PropertyDescriptor prop_actionListener = new PropertyDescriptor("actionListener",beanClass,"getActionListener","setActionListener");

            PropertyDescriptor prop_autocomplete = new PropertyDescriptor("autocomplete",beanClass,"getAutocomplete","setAutocomplete");

            PropertyDescriptor prop_dir = new PropertyDescriptor("dir",beanClass,"getDir","setDir");

            PropertyDescriptor prop_enctype = new PropertyDescriptor("enctype",beanClass,"getEnctype","setEnctype");

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");

            PropertyDescriptor prop_lang = new PropertyDescriptor("lang",beanClass,"getLang","setLang");

            PropertyDescriptor prop_onclick = new PropertyDescriptor("onclick",beanClass,"getOnclick","setOnclick");

            PropertyDescriptor prop_ondblclick = new PropertyDescriptor("ondblclick",beanClass,"getOndblclick","setOndblclick");

            PropertyDescriptor prop_onkeydown = new PropertyDescriptor("onkeydown",beanClass,"getOnkeydown","setOnkeydown");

            PropertyDescriptor prop_onkeypress = new PropertyDescriptor("onkeypress",beanClass,"getOnkeypress","setOnkeypress");

            PropertyDescriptor prop_onkeyup = new PropertyDescriptor("onkeyup",beanClass,"getOnkeyup","setOnkeyup");

            PropertyDescriptor prop_onmousedown = new PropertyDescriptor("onmousedown",beanClass,"getOnmousedown","setOnmousedown");

            PropertyDescriptor prop_onmousemove = new PropertyDescriptor("onmousemove",beanClass,"getOnmousemove","setOnmousemove");

            PropertyDescriptor prop_onmouseout = new PropertyDescriptor("onmouseout",beanClass,"getOnmouseout","setOnmouseout");

            PropertyDescriptor prop_onmouseover = new PropertyDescriptor("onmouseover",beanClass,"getOnmouseover","setOnmouseover");

            PropertyDescriptor prop_onmouseup = new PropertyDescriptor("onmouseup",beanClass,"getOnmouseup","setOnmouseup");

            PropertyDescriptor prop_partialSubmit = new PropertyDescriptor("partialSubmit",beanClass,"isPartialSubmit","setPartialSubmit");

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");

            PropertyDescriptor prop_submitted = new PropertyDescriptor("submitted",beanClass,"isSubmitted","setSubmitted");

            PropertyDescriptor prop_target = new PropertyDescriptor("target",beanClass,"getTarget","setTarget");

            PropertyDescriptor prop_title = new PropertyDescriptor("title",beanClass,"getTitle","setTitle");

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);

            PropertyDescriptor prop_onreset = new PropertyDescriptor("onreset",beanClass,"getOnreset","setOnreset");

            PropertyDescriptor prop_onsubmit = new PropertyDescriptor("onsubmit",beanClass,"getOnsubmit","setOnsubmit");

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);

            PropertyDescriptor prop_prependId = new PropertyDescriptor("prependId",beanClass,"isPrependId","setPrependId");

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);

            propDescriptors = new PropertyDescriptor[] {
                prop_accept,
                prop_acceptcharset,
                prop_action,
                prop_actionListener,
                prop_attributes,
                prop_autocomplete,
                prop_childCount,
                prop_children,
                prop_dir,
                prop_enctype,
                prop_facets,
                prop_family,
                prop_id,
                prop_lang,
                prop_onclick,
                prop_ondblclick,
                prop_onkeydown,
                prop_onkeypress,
                prop_onkeyup,
                prop_onmousedown,
                prop_onmousemove,
                prop_onmouseout,
                prop_onmouseover,
                prop_onmouseup,
                prop_onreset,
                prop_onsubmit,
                prop_parent,
                prop_partialSubmit,
                prop_prependId,
                prop_rendered,
                prop_renderedOnUserRole,
                prop_rendererType,
                prop_rendersChildren,
                prop_style,
                prop_styleClass,
                prop_submitted,
                prop_target,
                prop_title,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
