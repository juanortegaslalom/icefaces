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

public class HtmlCommandLinkBeanInfo extends SimpleBeanInfo {

    /**
     * <p>Construct a new <code>HtmlCommandLinkBeanInfo</code>.</p>
     */
    public HtmlCommandLinkBeanInfo() {

        beanClass = HtmlCommandLink.class;

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

            PropertyDescriptor prop_accesskey = new PropertyDescriptor("accesskey",beanClass,"getAccesskey","setAccesskey");

            PropertyDescriptor prop_action = new PropertyDescriptor("action",beanClass,"getAction","setAction");

            PropertyDescriptor prop_actionListener = new PropertyDescriptor("actionListener",beanClass,"getActionListener","setActionListener");

            PropertyDescriptor prop_charset = new PropertyDescriptor("charset",beanClass,"getCharset","setCharset");

            PropertyDescriptor prop_coords = new PropertyDescriptor("coords",beanClass,"getCoords","setCoords");

            PropertyDescriptor prop_dir = new PropertyDescriptor("dir",beanClass,"getDir","setDir");

            PropertyDescriptor prop_disabled = new PropertyDescriptor("disabled",beanClass,"isDisabled","setDisabled");

            PropertyDescriptor prop_effect = new PropertyDescriptor("effect",beanClass,"getEffect","setEffect");

            PropertyDescriptor prop_enabledOnUserRole = new PropertyDescriptor("enabledOnUserRole",beanClass,"getEnabledOnUserRole","setEnabledOnUserRole");

            PropertyDescriptor prop_hreflang = new PropertyDescriptor("hreflang",beanClass,"getHreflang","setHreflang");

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");

            PropertyDescriptor prop_immediate = new PropertyDescriptor("immediate",beanClass,"isImmediate","setImmediate");

            PropertyDescriptor prop_lang = new PropertyDescriptor("lang",beanClass,"getLang","setLang");

            PropertyDescriptor prop_onblur = new PropertyDescriptor("onblur",beanClass,"getOnblur","setOnblur");

            PropertyDescriptor prop_onclick = new PropertyDescriptor("onclick",beanClass,"getOnclick","setOnclick");

            PropertyDescriptor prop_onclickeffect = new PropertyDescriptor("onclickeffect",beanClass,"getOnclickeffect","setOnclickeffect");

            PropertyDescriptor prop_ondblclick = new PropertyDescriptor("ondblclick",beanClass,"getOndblclick","setOndblclick");

            PropertyDescriptor prop_ondblclickeffect = new PropertyDescriptor("ondblclickeffect",beanClass,"getOndblclickeffect","setOndblclickeffect");

            PropertyDescriptor prop_onfocus = new PropertyDescriptor("onfocus",beanClass,"getOnfocus","setOnfocus");

            PropertyDescriptor prop_onkeydown = new PropertyDescriptor("onkeydown",beanClass,"getOnkeydown","setOnkeydown");

            PropertyDescriptor prop_onkeydowneffect = new PropertyDescriptor("onkeydowneffect",beanClass,"getOnkeydowneffect","setOnkeydowneffect");

            PropertyDescriptor prop_onkeypress = new PropertyDescriptor("onkeypress",beanClass,"getOnkeypress","setOnkeypress");

            PropertyDescriptor prop_onkeypresseffect = new PropertyDescriptor("onkeypresseffect",beanClass,"getOnkeypresseffect","setOnkeypresseffect");

            PropertyDescriptor prop_onkeyup = new PropertyDescriptor("onkeyup",beanClass,"getOnkeyup","setOnkeyup");

            PropertyDescriptor prop_onkeyupeffect = new PropertyDescriptor("onkeyupeffect",beanClass,"getOnkeyupeffect","setOnkeyupeffect");

            PropertyDescriptor prop_onmousedown = new PropertyDescriptor("onmousedown",beanClass,"getOnmousedown","setOnmousedown");

            PropertyDescriptor prop_onmousedowneffect = new PropertyDescriptor("onmousedowneffect",beanClass,"getOnmousedowneffect","setOnmousedowneffect");

            PropertyDescriptor prop_onmousemove = new PropertyDescriptor("onmousemove",beanClass,"getOnmousemove","setOnmousemove");

            PropertyDescriptor prop_onmousemoveeffect = new PropertyDescriptor("onmousemoveeffect",beanClass,"getOnmousemoveeffect","setOnmousemoveeffect");

            PropertyDescriptor prop_onmouseout = new PropertyDescriptor("onmouseout",beanClass,"getOnmouseout","setOnmouseout");

            PropertyDescriptor prop_onmouseouteffect = new PropertyDescriptor("onmouseouteffect",beanClass,"getOnmouseouteffect","setOnmouseouteffect");

            PropertyDescriptor prop_onmouseover = new PropertyDescriptor("onmouseover",beanClass,"getOnmouseover","setOnmouseover");

            PropertyDescriptor prop_onmouseovereffect = new PropertyDescriptor("onmouseovereffect",beanClass,"getOnmouseovereffect","setOnmouseovereffect");

            PropertyDescriptor prop_onmouseup = new PropertyDescriptor("onmouseup",beanClass,"getOnmouseup","setOnmouseup");

            PropertyDescriptor prop_onmouseupeffect = new PropertyDescriptor("onmouseupeffect",beanClass,"getOnmouseupeffect","setOnmouseupeffect");

            PropertyDescriptor prop_panelConfirmation = new PropertyDescriptor("panelConfirmation",beanClass,"getPanelConfirmation","setPanelConfirmation");

            PropertyDescriptor prop_partialSubmit = new PropertyDescriptor("partialSubmit",beanClass,"isPartialSubmit","setPartialSubmit");

            PropertyDescriptor prop_rel = new PropertyDescriptor("rel",beanClass,"getRel","setRel");

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");

            PropertyDescriptor prop_rev = new PropertyDescriptor("rev",beanClass,"getRev","setRev");

            PropertyDescriptor prop_shape = new PropertyDescriptor("shape",beanClass,"getShape","setShape");

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");

            PropertyDescriptor prop_tabindex = new PropertyDescriptor("tabindex",beanClass,"getTabindex","setTabindex");

            PropertyDescriptor prop_target = new PropertyDescriptor("target",beanClass,"getTarget","setTarget");

            PropertyDescriptor prop_title = new PropertyDescriptor("title",beanClass,"getTitle","setTitle");

            PropertyDescriptor prop_type = new PropertyDescriptor("type",beanClass,"getType","setType");

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");

            PropertyDescriptor prop_visible = new PropertyDescriptor("visible",beanClass,"isVisible","setVisible");

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);

            propDescriptors = new PropertyDescriptor[] {
                prop_accesskey,
                prop_action,
                prop_actionListener,
                prop_attributes,
                prop_charset,
                prop_childCount,
                prop_children,
                prop_coords,
                prop_dir,
                prop_disabled,
                prop_effect,
                prop_enabledOnUserRole,
                prop_facets,
                prop_family,
                prop_hreflang,
                prop_id,
                prop_immediate,
                prop_lang,
                prop_onblur,
                prop_onclick,
                prop_onclickeffect,
                prop_ondblclick,
                prop_ondblclickeffect,
                prop_onfocus,
                prop_onkeydown,
                prop_onkeydowneffect,
                prop_onkeypress,
                prop_onkeypresseffect,
                prop_onkeyup,
                prop_onkeyupeffect,
                prop_onmousedown,
                prop_onmousedowneffect,
                prop_onmousemove,
                prop_onmousemoveeffect,
                prop_onmouseout,
                prop_onmouseouteffect,
                prop_onmouseover,
                prop_onmouseovereffect,
                prop_onmouseup,
                prop_onmouseupeffect,
                prop_panelConfirmation,
                prop_parent,
                prop_partialSubmit,
                prop_rel,
                prop_rendered,
                prop_renderedOnUserRole,
                prop_rendererType,
                prop_rendersChildren,
                prop_rev,
                prop_shape,
                prop_style,
                prop_styleClass,
                prop_tabindex,
                prop_target,
                prop_title,
                prop_type,
                prop_value,
                prop_visible,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
