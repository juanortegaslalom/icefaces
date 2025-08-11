package com.icesoft.faces.component.outputchart;

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

public class OutputChartBeanInfo extends SimpleBeanInfo {

    /**
     * <p>Construct a new <code>OutputChartBeanInfo</code>.</p>
     */
    public OutputChartBeanInfo() {

        beanClass = OutputChart.class;

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

            PropertyDescriptor prop_action = new PropertyDescriptor("action",beanClass,"getAction","setAction");

            PropertyDescriptor prop_actionListener = new PropertyDescriptor("actionListener",beanClass,"getActionListener","setActionListener");

            PropertyDescriptor prop_chartTitle = new PropertyDescriptor("chartTitle",beanClass,"getChartTitle","setChartTitle");

            PropertyDescriptor prop_colors = new PropertyDescriptor("colors",beanClass,"getColors","setColors");

            PropertyDescriptor prop_data = new PropertyDescriptor("data",beanClass,"getData","setData");

            PropertyDescriptor prop_height = new PropertyDescriptor("height",beanClass,"getHeight","setHeight");

            PropertyDescriptor prop_horizontal = new PropertyDescriptor("horizontal",beanClass,"isHorizontal","setHorizontal");

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");

            PropertyDescriptor prop_immediate = new PropertyDescriptor("immediate",beanClass,"isImmediate","setImmediate");

            PropertyDescriptor prop_labels = new PropertyDescriptor("labels",beanClass,"getLabels","setLabels");

            PropertyDescriptor prop_legendColumns = new PropertyDescriptor("legendColumns",beanClass,"getLegendColumns","setLegendColumns");

            PropertyDescriptor prop_legendPlacement = new PropertyDescriptor("legendPlacement",beanClass,"getLegendPlacement","setLegendPlacement");

            PropertyDescriptor prop_renderOnSubmit = new PropertyDescriptor("renderOnSubmit",beanClass,"getRenderOnSubmit","setRenderOnSubmit");

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");

            PropertyDescriptor prop_shapes = new PropertyDescriptor("shapes",beanClass,"getShapes","setShapes");

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");

            PropertyDescriptor prop_type = new PropertyDescriptor("type",beanClass,"getType","setType");

            PropertyDescriptor prop_width = new PropertyDescriptor("width",beanClass,"getWidth","setWidth");

            PropertyDescriptor prop_xaxisLabels = new PropertyDescriptor("xaxisLabels",beanClass,"getXaxisLabels","setXaxisLabels");

            PropertyDescriptor prop_xaxisTitle = new PropertyDescriptor("xaxisTitle",beanClass,"getXaxisTitle","setXaxisTitle");

            PropertyDescriptor prop_yaxisTitle = new PropertyDescriptor("yaxisTitle",beanClass,"getYaxisTitle","setYaxisTitle");

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");

            propDescriptors = new PropertyDescriptor[] {
                prop_action,
                prop_actionListener,
                prop_attributes,
                prop_chartTitle,
                prop_childCount,
                prop_children,
                prop_colors,
                prop_data,
                prop_facets,
                prop_family,
                prop_height,
                prop_horizontal,
                prop_id,
                prop_immediate,
                prop_labels,
                prop_legendColumns,
                prop_legendPlacement,
                prop_parent,
                prop_renderOnSubmit,
                prop_rendered,
                prop_rendererType,
                prop_rendersChildren,
                prop_shapes,
                prop_style,
                prop_styleClass,
                prop_type,
                prop_value,
                prop_width,
                prop_xaxisLabels,
                prop_xaxisTitle,
                prop_yaxisTitle,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
