package com.icesoft.faces.component.panelseries;

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

abstract class UISeriesBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.panelseries.Bundle-JSF", Locale.getDefault(), UISeriesBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>UISeriesBeanInfoBase</code>.</p>
     */
    public UISeriesBeanInfoBase() {

        beanClass = UISeries.class;
        iconFileName_C16 = "UISeries_C16";
        iconFileName_C32 = "UISeries_C32";
        iconFileName_M16 = "UISeries_M16";
        iconFileName_M32 = "UISeries_M32";

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
        beanDescriptor.setDisplayName(resources.getString("UISeries_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("UISeries_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"uiSeries");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.TRUE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"seriesSeriesRenderer");
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

            PropertyDescriptor prop_first = new PropertyDescriptor("first",beanClass,"getFirst","setFirst");
            prop_first.setDisplayName(resources.getString("UISeries_first_DisplayName"));
            prop_first.setShortDescription(resources.getString("UISeries_first_Description"));
            prop_first.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.IntegerPropertyEditor"));
            prop_first.setExpert(false);
            prop_first.setHidden(false);
            prop_first.setPreferred(false);
            attrib = new AttributeDescriptor("first",false,"0",true);
            prop_first.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_first.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);
            prop_first.setValue("minValue", new Integer(0));
            prop_first.setValue("unsetValue", new Integer(Integer.MIN_VALUE));

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("UISeries_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("UISeries_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("UISeries_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("UISeries_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_rows = new PropertyDescriptor("rows",beanClass,"getRows","setRows");
            prop_rows.setDisplayName(resources.getString("UISeries_rows_DisplayName"));
            prop_rows.setShortDescription(resources.getString("UISeries_rows_Description"));
            prop_rows.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.IntegerPropertyEditor"));
            prop_rows.setExpert(false);
            prop_rows.setHidden(false);
            prop_rows.setPreferred(false);
            attrib = new AttributeDescriptor("rows",false,"0",true);
            prop_rows.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rows.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");
            prop_style.setDisplayName(resources.getString("UISeries_style_DisplayName"));
            prop_style.setShortDescription(resources.getString("UISeries_style_Description"));
            prop_style.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.css.CssStylePropertyEditor"));
            prop_style.setExpert(false);
            prop_style.setHidden(false);
            prop_style.setPreferred(false);
            attrib = new AttributeDescriptor("style",false,null,true);
            prop_style.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_style.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("UISeries_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("UISeries_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.StyleClassPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");
            prop_value.setDisplayName(resources.getString("UISeries_value_DisplayName"));
            prop_value.setShortDescription(resources.getString("UISeries_value_Description"));
            prop_value.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.faces.dt.std.ValueBindingPropertyEditor"));
            prop_value.setExpert(false);
            prop_value.setHidden(false);
            prop_value.setPreferred(false);
            attrib = new AttributeDescriptor("value",false,null,true);
            prop_value.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_value.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);
            prop_value.setValue("ignoreIsBound", "true");

            PropertyDescriptor prop_var = new PropertyDescriptor("var",beanClass,"getVar","setVar");
            prop_var.setDisplayName(resources.getString("UISeries_var_DisplayName"));
            prop_var.setShortDescription(resources.getString("UISeries_var_Description"));
            prop_var.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_var.setExpert(false);
            prop_var.setHidden(false);
            prop_var.setPreferred(false);
            attrib = new AttributeDescriptor("var",false,null,false);
            prop_var.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_var.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);

            PropertyDescriptor prop_varStatus = new PropertyDescriptor("varStatus",beanClass,"getVarStatus","setVarStatus");
            prop_varStatus.setDisplayName(resources.getString("UISeries_varStatus_DisplayName"));
            prop_varStatus.setShortDescription(resources.getString("UISeries_varStatus_Description"));
            prop_varStatus.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_varStatus.setExpert(false);
            prop_varStatus.setHidden(false);
            prop_varStatus.setPreferred(false);
            attrib = new AttributeDescriptor("varStatus",false,null,true);
            prop_varStatus.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_varStatus.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("UISeries_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("UISeries_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_bgcolor = new PropertyDescriptor("bgcolor",beanClass,"getBgcolor","setBgcolor");
            prop_bgcolor.setDisplayName(resources.getString("UISeries_bgcolor_DisplayName"));
            prop_bgcolor.setShortDescription(resources.getString("UISeries_bgcolor_Description"));
            prop_bgcolor.setExpert(false);
            prop_bgcolor.setHidden(false);
            prop_bgcolor.setPreferred(false);
            attrib = new AttributeDescriptor("bgcolor",false,null,true);
            prop_bgcolor.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_bgcolor.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_bodyrows = new PropertyDescriptor("bodyrows",beanClass,"getBodyrows","setBodyrows");
            prop_bodyrows.setDisplayName(resources.getString("UISeries_bodyrows_DisplayName"));
            prop_bodyrows.setShortDescription(resources.getString("UISeries_bodyrows_Description"));
            prop_bodyrows.setExpert(false);
            prop_bodyrows.setHidden(false);
            prop_bodyrows.setPreferred(false);
            attrib = new AttributeDescriptor("bodyrows",false,null,true);
            prop_bodyrows.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_bodyrows.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_border = new PropertyDescriptor("border",beanClass,"getBorder","setBorder");
            prop_border.setDisplayName(resources.getString("UISeries_border_DisplayName"));
            prop_border.setShortDescription(resources.getString("UISeries_border_Description"));
            prop_border.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.IntegerPropertyEditor"));
            prop_border.setExpert(false);
            prop_border.setHidden(false);
            prop_border.setPreferred(false);
            attrib = new AttributeDescriptor("border",false,null,true);
            prop_border.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_border.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);
            prop_border.setValue("minValue", new Integer(0));
            prop_border.setValue("unsetValue", new Integer(Integer.MIN_VALUE));

            PropertyDescriptor prop_captionClass = new PropertyDescriptor("captionClass",beanClass,"getCaptionClass","setCaptionClass");
            prop_captionClass.setDisplayName(resources.getString("UISeries_captionClass_DisplayName"));
            prop_captionClass.setShortDescription(resources.getString("UISeries_captionClass_Description"));
            prop_captionClass.setExpert(false);
            prop_captionClass.setHidden(false);
            prop_captionClass.setPreferred(false);
            attrib = new AttributeDescriptor("captionClass",false,null,true);
            prop_captionClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_captionClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_captionStyle = new PropertyDescriptor("captionStyle",beanClass,"getCaptionStyle","setCaptionStyle");
            prop_captionStyle.setDisplayName(resources.getString("UISeries_captionStyle_DisplayName"));
            prop_captionStyle.setShortDescription(resources.getString("UISeries_captionStyle_Description"));
            prop_captionStyle.setExpert(false);
            prop_captionStyle.setHidden(false);
            prop_captionStyle.setPreferred(false);
            attrib = new AttributeDescriptor("captionStyle",false,null,true);
            prop_captionStyle.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_captionStyle.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_cellpadding = new PropertyDescriptor("cellpadding",beanClass,"getCellpadding","setCellpadding");
            prop_cellpadding.setDisplayName(resources.getString("UISeries_cellpadding_DisplayName"));
            prop_cellpadding.setShortDescription(resources.getString("UISeries_cellpadding_Description"));
            prop_cellpadding.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.LengthPropertyEditor"));
            prop_cellpadding.setExpert(false);
            prop_cellpadding.setHidden(false);
            prop_cellpadding.setPreferred(false);
            attrib = new AttributeDescriptor("cellpadding",false,null,true);
            prop_cellpadding.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_cellpadding.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_cellspacing = new PropertyDescriptor("cellspacing",beanClass,"getCellspacing","setCellspacing");
            prop_cellspacing.setDisplayName(resources.getString("UISeries_cellspacing_DisplayName"));
            prop_cellspacing.setShortDescription(resources.getString("UISeries_cellspacing_Description"));
            prop_cellspacing.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.LengthPropertyEditor"));
            prop_cellspacing.setExpert(false);
            prop_cellspacing.setHidden(false);
            prop_cellspacing.setPreferred(false);
            attrib = new AttributeDescriptor("cellspacing",false,null,true);
            prop_cellspacing.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_cellspacing.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("UISeries_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("UISeries_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("UISeries_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("UISeries_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_columnClasses = new PropertyDescriptor("columnClasses",beanClass,"getColumnClasses","setColumnClasses");
            prop_columnClasses.setDisplayName(resources.getString("UISeries_columnClasses_DisplayName"));
            prop_columnClasses.setShortDescription(resources.getString("UISeries_columnClasses_Description"));
            prop_columnClasses.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.StyleClassPropertyEditor"));
            prop_columnClasses.setExpert(false);
            prop_columnClasses.setHidden(false);
            prop_columnClasses.setPreferred(false);
            attrib = new AttributeDescriptor("columnClasses",false,null,true);
            prop_columnClasses.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_columnClasses.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_dir = new PropertyDescriptor("dir",beanClass,"getDir","setDir");
            prop_dir.setDisplayName(resources.getString("UISeries_dir_DisplayName"));
            prop_dir.setShortDescription(resources.getString("UISeries_dir_Description"));
            prop_dir.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.SelectOneDomainEditor"));
            prop_dir.setExpert(false);
            prop_dir.setHidden(false);
            prop_dir.setPreferred(false);
            attrib = new AttributeDescriptor("dir",false,null,true);
            prop_dir.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_dir.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_dir.setValue("com.sun.rave.propertyeditors.DOMAIN_CLASS", com.sun.rave.propertyeditors.domains.TextDirectionDomain.class);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("UISeries_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("UISeries_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("UISeries_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("UISeries_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_footerClass = new PropertyDescriptor("footerClass",beanClass,"getFooterClass","setFooterClass");
            prop_footerClass.setDisplayName(resources.getString("UISeries_footerClass_DisplayName"));
            prop_footerClass.setShortDescription(resources.getString("UISeries_footerClass_Description"));
            prop_footerClass.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.StyleClassPropertyEditor"));
            prop_footerClass.setExpert(false);
            prop_footerClass.setHidden(false);
            prop_footerClass.setPreferred(false);
            attrib = new AttributeDescriptor("footerClass",false,null,true);
            prop_footerClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_footerClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_frame = new PropertyDescriptor("frame",beanClass,"getFrame","setFrame");
            prop_frame.setDisplayName(resources.getString("UISeries_frame_DisplayName"));
            prop_frame.setShortDescription(resources.getString("UISeries_frame_Description"));
            prop_frame.setPropertyEditorClass(loadClass(""));
            prop_frame.setExpert(false);
            prop_frame.setHidden(false);
            prop_frame.setPreferred(false);
            attrib = new AttributeDescriptor("frame",false,null,true);
            prop_frame.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_frame.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_frame.setValue("com.sun.rave.propertyeditors.DOMAIN_CLASS", com.sun.rave.propertyeditors.domains.HtmlTableBordersDomain.class);

            PropertyDescriptor prop_headerClass = new PropertyDescriptor("headerClass",beanClass,"getHeaderClass","setHeaderClass");
            prop_headerClass.setDisplayName(resources.getString("UISeries_headerClass_DisplayName"));
            prop_headerClass.setShortDescription(resources.getString("UISeries_headerClass_Description"));
            prop_headerClass.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.StyleClassPropertyEditor"));
            prop_headerClass.setExpert(false);
            prop_headerClass.setHidden(false);
            prop_headerClass.setPreferred(false);
            attrib = new AttributeDescriptor("headerClass",false,null,true);
            prop_headerClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_headerClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_lang = new PropertyDescriptor("lang",beanClass,"getLang","setLang");
            prop_lang.setDisplayName(resources.getString("UISeries_lang_DisplayName"));
            prop_lang.setShortDescription(resources.getString("UISeries_lang_Description"));
            prop_lang.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.SelectOneDomainEditor"));
            prop_lang.setExpert(false);
            prop_lang.setHidden(false);
            prop_lang.setPreferred(false);
            attrib = new AttributeDescriptor("lang",false,null,true);
            prop_lang.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_lang.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_lang.setValue("com.sun.rave.propertyeditors.DOMAIN_CLASS", com.sun.rave.propertyeditors.domains.LanguagesDomain.class);

            PropertyDescriptor prop_onclick = new PropertyDescriptor("onclick",beanClass,"getOnclick","setOnclick");
            prop_onclick.setDisplayName(resources.getString("UISeries_onclick_DisplayName"));
            prop_onclick.setShortDescription(resources.getString("UISeries_onclick_Description"));
            prop_onclick.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onclick.setExpert(false);
            prop_onclick.setHidden(true);
            prop_onclick.setPreferred(false);
            attrib = new AttributeDescriptor("onclick",false,null,true);
            prop_onclick.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onclick.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_ondblclick = new PropertyDescriptor("ondblclick",beanClass,"getOndblclick","setOndblclick");
            prop_ondblclick.setDisplayName(resources.getString("UISeries_ondblclick_DisplayName"));
            prop_ondblclick.setShortDescription(resources.getString("UISeries_ondblclick_Description"));
            prop_ondblclick.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_ondblclick.setExpert(false);
            prop_ondblclick.setHidden(true);
            prop_ondblclick.setPreferred(false);
            attrib = new AttributeDescriptor("ondblclick",false,null,true);
            prop_ondblclick.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_ondblclick.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeydown = new PropertyDescriptor("onkeydown",beanClass,"getOnkeydown","setOnkeydown");
            prop_onkeydown.setDisplayName(resources.getString("UISeries_onkeydown_DisplayName"));
            prop_onkeydown.setShortDescription(resources.getString("UISeries_onkeydown_Description"));
            prop_onkeydown.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeydown.setExpert(false);
            prop_onkeydown.setHidden(true);
            prop_onkeydown.setPreferred(false);
            attrib = new AttributeDescriptor("onkeydown",false,null,true);
            prop_onkeydown.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeydown.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeypress = new PropertyDescriptor("onkeypress",beanClass,"getOnkeypress","setOnkeypress");
            prop_onkeypress.setDisplayName(resources.getString("UISeries_onkeypress_DisplayName"));
            prop_onkeypress.setShortDescription(resources.getString("UISeries_onkeypress_Description"));
            prop_onkeypress.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeypress.setExpert(false);
            prop_onkeypress.setHidden(true);
            prop_onkeypress.setPreferred(false);
            attrib = new AttributeDescriptor("onkeypress",false,null,true);
            prop_onkeypress.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeypress.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeyup = new PropertyDescriptor("onkeyup",beanClass,"getOnkeyup","setOnkeyup");
            prop_onkeyup.setDisplayName(resources.getString("UISeries_onkeyup_DisplayName"));
            prop_onkeyup.setShortDescription(resources.getString("UISeries_onkeyup_Description"));
            prop_onkeyup.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeyup.setExpert(false);
            prop_onkeyup.setHidden(true);
            prop_onkeyup.setPreferred(false);
            attrib = new AttributeDescriptor("onkeyup",false,null,true);
            prop_onkeyup.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeyup.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmousedown = new PropertyDescriptor("onmousedown",beanClass,"getOnmousedown","setOnmousedown");
            prop_onmousedown.setDisplayName(resources.getString("UISeries_onmousedown_DisplayName"));
            prop_onmousedown.setShortDescription(resources.getString("UISeries_onmousedown_Description"));
            prop_onmousedown.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmousedown.setExpert(false);
            prop_onmousedown.setHidden(true);
            prop_onmousedown.setPreferred(false);
            attrib = new AttributeDescriptor("onmousedown",false,null,true);
            prop_onmousedown.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousedown.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmousemove = new PropertyDescriptor("onmousemove",beanClass,"getOnmousemove","setOnmousemove");
            prop_onmousemove.setDisplayName(resources.getString("UISeries_onmousemove_DisplayName"));
            prop_onmousemove.setShortDescription(resources.getString("UISeries_onmousemove_Description"));
            prop_onmousemove.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmousemove.setExpert(false);
            prop_onmousemove.setHidden(true);
            prop_onmousemove.setPreferred(false);
            attrib = new AttributeDescriptor("onmousemove",false,null,true);
            prop_onmousemove.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousemove.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseout = new PropertyDescriptor("onmouseout",beanClass,"getOnmouseout","setOnmouseout");
            prop_onmouseout.setDisplayName(resources.getString("UISeries_onmouseout_DisplayName"));
            prop_onmouseout.setShortDescription(resources.getString("UISeries_onmouseout_Description"));
            prop_onmouseout.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseout.setExpert(false);
            prop_onmouseout.setHidden(true);
            prop_onmouseout.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseout",false,null,true);
            prop_onmouseout.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseout.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseover = new PropertyDescriptor("onmouseover",beanClass,"getOnmouseover","setOnmouseover");
            prop_onmouseover.setDisplayName(resources.getString("UISeries_onmouseover_DisplayName"));
            prop_onmouseover.setShortDescription(resources.getString("UISeries_onmouseover_Description"));
            prop_onmouseover.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseover.setExpert(false);
            prop_onmouseover.setHidden(true);
            prop_onmouseover.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseover",false,null,true);
            prop_onmouseover.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseover.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseup = new PropertyDescriptor("onmouseup",beanClass,"getOnmouseup","setOnmouseup");
            prop_onmouseup.setDisplayName(resources.getString("UISeries_onmouseup_DisplayName"));
            prop_onmouseup.setShortDescription(resources.getString("UISeries_onmouseup_Description"));
            prop_onmouseup.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseup.setExpert(false);
            prop_onmouseup.setHidden(true);
            prop_onmouseup.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseup",false,null,true);
            prop_onmouseup.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseup.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);
            prop_parent.setDisplayName(resources.getString("UISeries_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("UISeries_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("UISeries_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("UISeries_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("UISeries_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("UISeries_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rowAvailable = new PropertyDescriptor("rowAvailable",beanClass,"isRowAvailable",null);
            prop_rowAvailable.setDisplayName(resources.getString("UISeries_rowAvailable_DisplayName"));
            prop_rowAvailable.setShortDescription(resources.getString("UISeries_rowAvailable_Description"));
            prop_rowAvailable.setExpert(false);
            prop_rowAvailable.setHidden(true);
            prop_rowAvailable.setPreferred(false);
            prop_rowAvailable.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_rowClasses = new PropertyDescriptor("rowClasses",beanClass,"getRowClasses","setRowClasses");
            prop_rowClasses.setDisplayName(resources.getString("UISeries_rowClasses_DisplayName"));
            prop_rowClasses.setShortDescription(resources.getString("UISeries_rowClasses_Description"));
            prop_rowClasses.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.StyleClassPropertyEditor"));
            prop_rowClasses.setExpert(false);
            prop_rowClasses.setHidden(false);
            prop_rowClasses.setPreferred(false);
            attrib = new AttributeDescriptor("rowClasses",false,null,true);
            prop_rowClasses.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rowClasses.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_rowCount = new PropertyDescriptor("rowCount",beanClass,"getRowCount",null);
            prop_rowCount.setDisplayName(resources.getString("UISeries_rowCount_DisplayName"));
            prop_rowCount.setShortDescription(resources.getString("UISeries_rowCount_Description"));
            prop_rowCount.setExpert(false);
            prop_rowCount.setHidden(true);
            prop_rowCount.setPreferred(false);
            prop_rowCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_rowData = new PropertyDescriptor("rowData",beanClass,"getRowData",null);
            prop_rowData.setDisplayName(resources.getString("UISeries_rowData_DisplayName"));
            prop_rowData.setShortDescription(resources.getString("UISeries_rowData_Description"));
            prop_rowData.setExpert(false);
            prop_rowData.setHidden(true);
            prop_rowData.setPreferred(false);
            prop_rowData.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_rowIndex = new PropertyDescriptor("rowIndex",beanClass,"getRowIndex","setRowIndex");
            prop_rowIndex.setDisplayName(resources.getString("UISeries_rowIndex_DisplayName"));
            prop_rowIndex.setShortDescription(resources.getString("UISeries_rowIndex_Description"));
            prop_rowIndex.setExpert(false);
            prop_rowIndex.setHidden(true);
            prop_rowIndex.setPreferred(false);
            prop_rowIndex.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_rowStatePreserved = new PropertyDescriptor("rowStatePreserved",beanClass,"isRowStatePreserved","setRowStatePreserved");
            prop_rowStatePreserved.setDisplayName(resources.getString("UISeries_rowStatePreserved_DisplayName"));
            prop_rowStatePreserved.setShortDescription(resources.getString("UISeries_rowStatePreserved_Description"));
            prop_rowStatePreserved.setExpert(false);
            prop_rowStatePreserved.setHidden(false);
            prop_rowStatePreserved.setPreferred(false);
            prop_rowStatePreserved.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_rules = new PropertyDescriptor("rules",beanClass,"getRules","setRules");
            prop_rules.setDisplayName(resources.getString("UISeries_rules_DisplayName"));
            prop_rules.setShortDescription(resources.getString("UISeries_rules_Description"));
            prop_rules.setPropertyEditorClass(loadClass(""));
            prop_rules.setExpert(false);
            prop_rules.setHidden(false);
            prop_rules.setPreferred(false);
            attrib = new AttributeDescriptor("rules",false,null,true);
            prop_rules.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rules.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);
            prop_rules.setValue("com.sun.rave.propertyeditors.DOMAIN_CLASS", com.sun.rave.propertyeditors.domains.HtmlTableRulesDomain.class);

            PropertyDescriptor prop_summary = new PropertyDescriptor("summary",beanClass,"getSummary","setSummary");
            prop_summary.setDisplayName(resources.getString("UISeries_summary_DisplayName"));
            prop_summary.setShortDescription(resources.getString("UISeries_summary_Description"));
            prop_summary.setExpert(false);
            prop_summary.setHidden(false);
            prop_summary.setPreferred(false);
            attrib = new AttributeDescriptor("summary",false,null,true);
            prop_summary.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_summary.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_title = new PropertyDescriptor("title",beanClass,"getTitle","setTitle");
            prop_title.setDisplayName(resources.getString("UISeries_title_DisplayName"));
            prop_title.setShortDescription(resources.getString("UISeries_title_Description"));
            prop_title.setExpert(false);
            prop_title.setHidden(false);
            prop_title.setPreferred(false);
            attrib = new AttributeDescriptor("title",false,null,true);
            prop_title.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_title.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_width = new PropertyDescriptor("width",beanClass,"getWidth","setWidth");
            prop_width.setDisplayName(resources.getString("UISeries_width_DisplayName"));
            prop_width.setShortDescription(resources.getString("UISeries_width_Description"));
            prop_width.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.LengthPropertyEditor"));
            prop_width.setExpert(false);
            prop_width.setHidden(false);
            prop_width.setPreferred(false);
            attrib = new AttributeDescriptor("width",false,null,true);
            prop_width.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_width.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            propDescriptors = new PropertyDescriptor[] {
                prop_attributes,
                prop_bgcolor,
                prop_bodyrows,
                prop_border,
                prop_captionClass,
                prop_captionStyle,
                prop_cellpadding,
                prop_cellspacing,
                prop_childCount,
                prop_children,
                prop_columnClasses,
                prop_dir,
                prop_facets,
                prop_family,
                prop_first,
                prop_footerClass,
                prop_frame,
                prop_headerClass,
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
                prop_parent,
                prop_rendered,
                prop_rendererType,
                prop_rendersChildren,
                prop_rowAvailable,
                prop_rowClasses,
                prop_rowCount,
                prop_rowData,
                prop_rowIndex,
                prop_rowStatePreserved,
                prop_rows,
                prop_rules,
                prop_style,
                prop_styleClass,
                prop_summary,
                prop_title,
                prop_value,
                prop_var,
                prop_varStatus,
                prop_width,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
