package com.icesoft.faces.component.outputchart;

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

abstract class OutputChartBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.outputchart.Bundle-JSF", Locale.getDefault(), OutputChartBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>OutputChartBeanInfoBase</code>.</p>
     */
    public OutputChartBeanInfoBase() {

        beanClass = OutputChart.class;
        iconFileName_C16 = "OutputChart_C16";
        iconFileName_C32 = "OutputChart_C32";
        iconFileName_M16 = "OutputChart_M16";
        iconFileName_M32 = "OutputChart_M32";

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
        beanDescriptor.setDisplayName(resources.getString("OutputChart_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("OutputChart_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"outputChart");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.TRUE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"outputChart");
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

            PropertyDescriptor prop_action = new PropertyDescriptor("action",beanClass,"getAction","setAction");
            prop_action.setDisplayName(resources.getString("OutputChart_action_DisplayName"));
            prop_action.setShortDescription(resources.getString("OutputChart_action_Description"));
            prop_action.setExpert(false);
            prop_action.setHidden(false);
            prop_action.setPreferred(false);
            attrib = new AttributeDescriptor("action",false,null,true);
            prop_action.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_action.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.EVENTS);

            PropertyDescriptor prop_actionListener = new PropertyDescriptor("actionListener",beanClass,"getActionListener","setActionListener");
            prop_actionListener.setDisplayName(resources.getString("OutputChart_actionListener_DisplayName"));
            prop_actionListener.setShortDescription(resources.getString("OutputChart_actionListener_Description"));
            prop_actionListener.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.MethodBindingPropertyEditor"));
            prop_actionListener.setExpert(false);
            prop_actionListener.setHidden(false);
            prop_actionListener.setPreferred(false);
            attrib = new AttributeDescriptor("actionListener",false,null,true);
            prop_actionListener.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_actionListener.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_chartTitle = new PropertyDescriptor("chartTitle",beanClass,"getChartTitle","setChartTitle");
            prop_chartTitle.setDisplayName(resources.getString("OutputChart_chartTitle_DisplayName"));
            prop_chartTitle.setShortDescription(resources.getString("OutputChart_chartTitle_Description"));
            prop_chartTitle.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_chartTitle.setExpert(false);
            prop_chartTitle.setHidden(false);
            prop_chartTitle.setPreferred(false);
            attrib = new AttributeDescriptor("chartTitle",false,"Default Chart title",true);
            prop_chartTitle.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_chartTitle.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_colors = new PropertyDescriptor("colors",beanClass,"getColors","setColors");
            prop_colors.setDisplayName(resources.getString("OutputChart_colors_DisplayName"));
            prop_colors.setShortDescription(resources.getString("OutputChart_colors_Description"));
            prop_colors.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_colors.setExpert(false);
            prop_colors.setHidden(false);
            prop_colors.setPreferred(false);
            attrib = new AttributeDescriptor("colors",false,null,true);
            prop_colors.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_colors.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_data = new PropertyDescriptor("data",beanClass,"getData","setData");
            prop_data.setDisplayName(resources.getString("OutputChart_data_DisplayName"));
            prop_data.setShortDescription(resources.getString("OutputChart_data_Description"));
            prop_data.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_data.setExpert(false);
            prop_data.setHidden(false);
            prop_data.setPreferred(false);
            attrib = new AttributeDescriptor("data",false,"20, 30, 40",true);
            prop_data.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_data.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_height = new PropertyDescriptor("height",beanClass,"getHeight","setHeight");
            prop_height.setDisplayName(resources.getString("OutputChart_height_DisplayName"));
            prop_height.setShortDescription(resources.getString("OutputChart_height_Description"));
            prop_height.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_height.setExpert(false);
            prop_height.setHidden(false);
            prop_height.setPreferred(false);
            attrib = new AttributeDescriptor("height",false,"400",true);
            prop_height.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_height.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_horizontal = new PropertyDescriptor("horizontal",beanClass,"isHorizontal","setHorizontal");
            prop_horizontal.setDisplayName(resources.getString("OutputChart_horizontal_DisplayName"));
            prop_horizontal.setShortDescription(resources.getString("OutputChart_horizontal_Description"));
            prop_horizontal.setExpert(false);
            prop_horizontal.setHidden(false);
            prop_horizontal.setPreferred(false);
            attrib = new AttributeDescriptor("horizontal",false,"false",true);
            prop_horizontal.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_horizontal.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("OutputChart_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("OutputChart_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_immediate = new PropertyDescriptor("immediate",beanClass,"isImmediate","setImmediate");
            prop_immediate.setDisplayName(resources.getString("OutputChart_immediate_DisplayName"));
            prop_immediate.setShortDescription(resources.getString("OutputChart_immediate_Description"));
            prop_immediate.setExpert(false);
            prop_immediate.setHidden(false);
            prop_immediate.setPreferred(false);
            attrib = new AttributeDescriptor("immediate",false,null,true);
            prop_immediate.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_immediate.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_labels = new PropertyDescriptor("labels",beanClass,"getLabels","setLabels");
            prop_labels.setDisplayName(resources.getString("OutputChart_labels_DisplayName"));
            prop_labels.setShortDescription(resources.getString("OutputChart_labels_Description"));
            prop_labels.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_labels.setExpert(false);
            prop_labels.setHidden(false);
            prop_labels.setPreferred(false);
            attrib = new AttributeDescriptor("labels",false,null,true);
            prop_labels.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_labels.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_legendColumns = new PropertyDescriptor("legendColumns",beanClass,"getLegendColumns","setLegendColumns");
            prop_legendColumns.setDisplayName(resources.getString("OutputChart_legendColumns_DisplayName"));
            prop_legendColumns.setShortDescription(resources.getString("OutputChart_legendColumns_Description"));
            prop_legendColumns.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_legendColumns.setExpert(false);
            prop_legendColumns.setHidden(false);
            prop_legendColumns.setPreferred(false);
            attrib = new AttributeDescriptor("legendColumns",false,"0",true);
            prop_legendColumns.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_legendColumns.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_legendPlacement = new PropertyDescriptor("legendPlacement",beanClass,"getLegendPlacement","setLegendPlacement");
            prop_legendPlacement.setDisplayName(resources.getString("OutputChart_legendPlacement_DisplayName"));
            prop_legendPlacement.setShortDescription(resources.getString("OutputChart_legendPlacement_Description"));
            prop_legendPlacement.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_legendPlacement.setExpert(false);
            prop_legendPlacement.setHidden(false);
            prop_legendPlacement.setPreferred(false);
            attrib = new AttributeDescriptor("legendPlacement",false,"bottom",true);
            prop_legendPlacement.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_legendPlacement.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_renderOnSubmit = new PropertyDescriptor("renderOnSubmit",beanClass,"getRenderOnSubmit","setRenderOnSubmit");
            prop_renderOnSubmit.setDisplayName(resources.getString("OutputChart_renderOnSubmit_DisplayName"));
            prop_renderOnSubmit.setShortDescription(resources.getString("OutputChart_renderOnSubmit_Description"));
            prop_renderOnSubmit.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_renderOnSubmit.setExpert(false);
            prop_renderOnSubmit.setHidden(false);
            prop_renderOnSubmit.setPreferred(false);
            attrib = new AttributeDescriptor("renderOnSubmit",false,null,true);
            prop_renderOnSubmit.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderOnSubmit.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("OutputChart_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("OutputChart_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_shapes = new PropertyDescriptor("shapes",beanClass,"getShapes","setShapes");
            prop_shapes.setDisplayName(resources.getString("OutputChart_shapes_DisplayName"));
            prop_shapes.setShortDescription(resources.getString("OutputChart_shapes_Description"));
            prop_shapes.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_shapes.setExpert(false);
            prop_shapes.setHidden(false);
            prop_shapes.setPreferred(false);
            attrib = new AttributeDescriptor("shapes",false,null,true);
            prop_shapes.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_shapes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");
            prop_style.setDisplayName(resources.getString("OutputChart_style_DisplayName"));
            prop_style.setShortDescription(resources.getString("OutputChart_style_Description"));
            prop_style.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.css.CssStylePropertyEditor"));
            prop_style.setExpert(false);
            prop_style.setHidden(false);
            prop_style.setPreferred(false);
            attrib = new AttributeDescriptor("style",false,null,true);
            prop_style.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_style.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("OutputChart_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("OutputChart_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_type = new PropertyDescriptor("type",beanClass,"getType","setType");
            prop_type.setDisplayName(resources.getString("OutputChart_type_DisplayName"));
            prop_type.setShortDescription(resources.getString("OutputChart_type_Description"));
            prop_type.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_type.setExpert(false);
            prop_type.setHidden(false);
            prop_type.setPreferred(false);
            attrib = new AttributeDescriptor("type",false,"bar",true);
            prop_type.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_type.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_width = new PropertyDescriptor("width",beanClass,"getWidth","setWidth");
            prop_width.setDisplayName(resources.getString("OutputChart_width_DisplayName"));
            prop_width.setShortDescription(resources.getString("OutputChart_width_Description"));
            prop_width.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_width.setExpert(false);
            prop_width.setHidden(false);
            prop_width.setPreferred(false);
            attrib = new AttributeDescriptor("width",false,"400",true);
            prop_width.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_width.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_xaxisLabels = new PropertyDescriptor("xaxisLabels",beanClass,"getXaxisLabels","setXaxisLabels");
            prop_xaxisLabels.setDisplayName(resources.getString("OutputChart_xaxisLabels_DisplayName"));
            prop_xaxisLabels.setShortDescription(resources.getString("OutputChart_xaxisLabels_Description"));
            prop_xaxisLabels.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_xaxisLabels.setExpert(false);
            prop_xaxisLabels.setHidden(false);
            prop_xaxisLabels.setPreferred(false);
            attrib = new AttributeDescriptor("xaxisLabels",false,null,true);
            prop_xaxisLabels.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_xaxisLabels.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_xaxisTitle = new PropertyDescriptor("xaxisTitle",beanClass,"getXaxisTitle","setXaxisTitle");
            prop_xaxisTitle.setDisplayName(resources.getString("OutputChart_xaxisTitle_DisplayName"));
            prop_xaxisTitle.setShortDescription(resources.getString("OutputChart_xaxisTitle_Description"));
            prop_xaxisTitle.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_xaxisTitle.setExpert(false);
            prop_xaxisTitle.setHidden(false);
            prop_xaxisTitle.setPreferred(false);
            attrib = new AttributeDescriptor("xaxisTitle",false,"Default X title",true);
            prop_xaxisTitle.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_xaxisTitle.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_yaxisTitle = new PropertyDescriptor("yaxisTitle",beanClass,"getYaxisTitle","setYaxisTitle");
            prop_yaxisTitle.setDisplayName(resources.getString("OutputChart_yaxisTitle_DisplayName"));
            prop_yaxisTitle.setShortDescription(resources.getString("OutputChart_yaxisTitle_Description"));
            prop_yaxisTitle.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_yaxisTitle.setExpert(false);
            prop_yaxisTitle.setHidden(false);
            prop_yaxisTitle.setPreferred(false);
            attrib = new AttributeDescriptor("yaxisTitle",false,"Default Y title",true);
            prop_yaxisTitle.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_yaxisTitle.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("OutputChart_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("OutputChart_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("OutputChart_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("OutputChart_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("OutputChart_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("OutputChart_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("OutputChart_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("OutputChart_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("OutputChart_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("OutputChart_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);
            prop_parent.setDisplayName(resources.getString("OutputChart_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("OutputChart_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("OutputChart_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("OutputChart_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("OutputChart_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("OutputChart_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");
            prop_value.setDisplayName(resources.getString("OutputChart_value_DisplayName"));
            prop_value.setShortDescription(resources.getString("OutputChart_value_Description"));
            prop_value.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.faces.dt.std.ValueBindingPropertyEditor"));
            prop_value.setExpert(false);
            prop_value.setHidden(false);
            prop_value.setPreferred(false);
            attrib = new AttributeDescriptor("value",false,null,true);
            prop_value.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_value.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);
            prop_value.setValue("ignoreIsBound", "true");

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
