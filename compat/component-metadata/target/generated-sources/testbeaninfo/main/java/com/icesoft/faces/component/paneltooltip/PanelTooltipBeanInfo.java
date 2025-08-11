package com.icesoft.faces.component.paneltooltip;

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

public class PanelTooltipBeanInfo extends SimpleBeanInfo {

    /**
     * <p>Construct a new <code>PanelTooltipBeanInfo</code>.</p>
     */
    public PanelTooltipBeanInfo() {

        beanClass = PanelTooltip.class;

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

            PropertyDescriptor prop_displayListener = new PropertyDescriptor("displayListener",beanClass,"getDisplayListener","setDisplayListener");

            PropertyDescriptor prop_displayOn = new PropertyDescriptor("displayOn",beanClass,"getDisplayOn","setDisplayOn");

            PropertyDescriptor prop_draggable = new PropertyDescriptor("draggable",beanClass,"getDraggable","setDraggable");

            PropertyDescriptor prop_effect = new PropertyDescriptor("effect",beanClass,"getEffect","setEffect");

            PropertyDescriptor prop_hideOn = new PropertyDescriptor("hideOn",beanClass,"getHideOn","setHideOn");

            PropertyDescriptor prop_hoverDelay = new PropertyDescriptor("hoverDelay",beanClass,"getHoverDelay","setHoverDelay");

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");

            PropertyDescriptor prop_moveWithMouse = new PropertyDescriptor("moveWithMouse",beanClass,"isMoveWithMouse","setMoveWithMouse");

            PropertyDescriptor prop_onclick = new PropertyDescriptor("onclick",beanClass,"getOnclick","setOnclick");

            PropertyDescriptor prop_onclickeffect = new PropertyDescriptor("onclickeffect",beanClass,"getOnclickeffect","setOnclickeffect");

            PropertyDescriptor prop_ondblclick = new PropertyDescriptor("ondblclick",beanClass,"getOndblclick","setOndblclick");

            PropertyDescriptor prop_ondblclickeffect = new PropertyDescriptor("ondblclickeffect",beanClass,"getOndblclickeffect","setOndblclickeffect");

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

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");

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
                prop_attributes,
                prop_childCount,
                prop_children,
                prop_displayListener,
                prop_displayOn,
                prop_draggable,
                prop_effect,
                prop_facets,
                prop_family,
                prop_hideOn,
                prop_hoverDelay,
                prop_id,
                prop_moveWithMouse,
                prop_onclick,
                prop_onclickeffect,
                prop_ondblclick,
                prop_ondblclickeffect,
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
                prop_parent,
                prop_rendered,
                prop_renderedOnUserRole,
                prop_rendererType,
                prop_rendersChildren,
                prop_style,
                prop_styleClass,
                prop_visible,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
