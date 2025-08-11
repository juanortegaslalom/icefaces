package com.icesoft.faces.component.ext;

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

abstract class HtmlMessagesBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.ext.Bundle-JSF", Locale.getDefault(), HtmlMessagesBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>HtmlMessagesBeanInfoBase</code>.</p>
     */
    public HtmlMessagesBeanInfoBase() {

        beanClass = HtmlMessages.class;
        iconFileName_C16 = "HtmlMessages_C16";
        iconFileName_C32 = "HtmlMessages_C32";
        iconFileName_M16 = "HtmlMessages_M16";
        iconFileName_M32 = "HtmlMessages_M32";

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
        beanDescriptor.setDisplayName(resources.getString("HtmlMessages_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("HtmlMessages_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"messages");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.FALSE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"messages");
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

            PropertyDescriptor prop_dir = new PropertyDescriptor("dir",beanClass,"getDir","setDir");
            prop_dir.setDisplayName(resources.getString("HtmlMessages_dir_DisplayName"));
            prop_dir.setShortDescription(resources.getString("HtmlMessages_dir_Description"));
            prop_dir.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.SelectOneDomainEditor"));
            prop_dir.setExpert(false);
            prop_dir.setHidden(false);
            prop_dir.setPreferred(false);
            attrib = new AttributeDescriptor("dir",false,null,true);
            prop_dir.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_dir.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_dir.setValue("com.sun.rave.propertyeditors.DOMAIN_CLASS", com.sun.rave.propertyeditors.domains.TextDirectionDomain.class);

            PropertyDescriptor prop_effect = new PropertyDescriptor("effect",beanClass,"getEffect","setEffect");
            prop_effect.setDisplayName(resources.getString("HtmlMessages_effect_DisplayName"));
            prop_effect.setShortDescription(resources.getString("HtmlMessages_effect_Description"));
            prop_effect.setExpert(false);
            prop_effect.setHidden(false);
            prop_effect.setPreferred(false);
            attrib = new AttributeDescriptor("effect",false,null,true);
            prop_effect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_effect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_errorClass = new PropertyDescriptor("errorClass",beanClass,"getErrorClass","setErrorClass");
            prop_errorClass.setDisplayName(resources.getString("HtmlMessages_errorClass_DisplayName"));
            prop_errorClass.setShortDescription(resources.getString("HtmlMessages_errorClass_Description"));
            prop_errorClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_errorClass.setExpert(false);
            prop_errorClass.setHidden(false);
            prop_errorClass.setPreferred(false);
            attrib = new AttributeDescriptor("errorClass",false,null,true);
            prop_errorClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_errorClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_errorStyle = new PropertyDescriptor("errorStyle",beanClass,"getErrorStyle","setErrorStyle");
            prop_errorStyle.setDisplayName(resources.getString("HtmlMessages_errorStyle_DisplayName"));
            prop_errorStyle.setShortDescription(resources.getString("HtmlMessages_errorStyle_Description"));
            prop_errorStyle.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_errorStyle.setExpert(false);
            prop_errorStyle.setHidden(false);
            prop_errorStyle.setPreferred(false);
            attrib = new AttributeDescriptor("errorStyle",false,null,true);
            prop_errorStyle.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_errorStyle.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_escape = new PropertyDescriptor("escape",beanClass,"isEscape","setEscape");
            prop_escape.setDisplayName(resources.getString("HtmlMessages_escape_DisplayName"));
            prop_escape.setShortDescription(resources.getString("HtmlMessages_escape_Description"));
            prop_escape.setExpert(false);
            prop_escape.setHidden(false);
            prop_escape.setPreferred(false);
            attrib = new AttributeDescriptor("escape",false,"true",true);
            prop_escape.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_escape.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_fatalClass = new PropertyDescriptor("fatalClass",beanClass,"getFatalClass","setFatalClass");
            prop_fatalClass.setDisplayName(resources.getString("HtmlMessages_fatalClass_DisplayName"));
            prop_fatalClass.setShortDescription(resources.getString("HtmlMessages_fatalClass_Description"));
            prop_fatalClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_fatalClass.setExpert(false);
            prop_fatalClass.setHidden(false);
            prop_fatalClass.setPreferred(false);
            attrib = new AttributeDescriptor("fatalClass",false,null,true);
            prop_fatalClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_fatalClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_fatalStyle = new PropertyDescriptor("fatalStyle",beanClass,"getFatalStyle","setFatalStyle");
            prop_fatalStyle.setDisplayName(resources.getString("HtmlMessages_fatalStyle_DisplayName"));
            prop_fatalStyle.setShortDescription(resources.getString("HtmlMessages_fatalStyle_Description"));
            prop_fatalStyle.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_fatalStyle.setExpert(false);
            prop_fatalStyle.setHidden(false);
            prop_fatalStyle.setPreferred(false);
            attrib = new AttributeDescriptor("fatalStyle",false,null,true);
            prop_fatalStyle.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_fatalStyle.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_globalOnly = new PropertyDescriptor("globalOnly",beanClass,"isGlobalOnly","setGlobalOnly");
            prop_globalOnly.setDisplayName(resources.getString("HtmlMessages_globalOnly_DisplayName"));
            prop_globalOnly.setShortDescription(resources.getString("HtmlMessages_globalOnly_Description"));
            prop_globalOnly.setExpert(false);
            prop_globalOnly.setHidden(false);
            prop_globalOnly.setPreferred(false);
            attrib = new AttributeDescriptor("globalOnly",false,"false",true);
            prop_globalOnly.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_globalOnly.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("HtmlMessages_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("HtmlMessages_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_infoClass = new PropertyDescriptor("infoClass",beanClass,"getInfoClass","setInfoClass");
            prop_infoClass.setDisplayName(resources.getString("HtmlMessages_infoClass_DisplayName"));
            prop_infoClass.setShortDescription(resources.getString("HtmlMessages_infoClass_Description"));
            prop_infoClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_infoClass.setExpert(false);
            prop_infoClass.setHidden(false);
            prop_infoClass.setPreferred(false);
            attrib = new AttributeDescriptor("infoClass",false,null,true);
            prop_infoClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_infoClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_infoStyle = new PropertyDescriptor("infoStyle",beanClass,"getInfoStyle","setInfoStyle");
            prop_infoStyle.setDisplayName(resources.getString("HtmlMessages_infoStyle_DisplayName"));
            prop_infoStyle.setShortDescription(resources.getString("HtmlMessages_infoStyle_Description"));
            prop_infoStyle.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_infoStyle.setExpert(false);
            prop_infoStyle.setHidden(false);
            prop_infoStyle.setPreferred(false);
            attrib = new AttributeDescriptor("infoStyle",false,null,true);
            prop_infoStyle.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_infoStyle.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_lang = new PropertyDescriptor("lang",beanClass,"getLang","setLang");
            prop_lang.setDisplayName(resources.getString("HtmlMessages_lang_DisplayName"));
            prop_lang.setShortDescription(resources.getString("HtmlMessages_lang_Description"));
            prop_lang.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.SelectOneDomainEditor"));
            prop_lang.setExpert(false);
            prop_lang.setHidden(false);
            prop_lang.setPreferred(false);
            attrib = new AttributeDescriptor("lang",false,null,true);
            prop_lang.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_lang.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_lang.setValue("com.sun.rave.propertyeditors.DOMAIN_CLASS", com.sun.rave.propertyeditors.domains.LanguagesDomain.class);

            PropertyDescriptor prop_layout = new PropertyDescriptor("layout",beanClass,"getLayout","setLayout");
            prop_layout.setDisplayName(resources.getString("HtmlMessages_layout_DisplayName"));
            prop_layout.setShortDescription(resources.getString("HtmlMessages_layout_Description"));
            prop_layout.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_layout.setExpert(false);
            prop_layout.setHidden(false);
            prop_layout.setPreferred(false);
            attrib = new AttributeDescriptor("layout",false,"list",true);
            prop_layout.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_layout.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("HtmlMessages_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("HtmlMessages_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");
            prop_renderedOnUserRole.setDisplayName(resources.getString("HtmlMessages_renderedOnUserRole_DisplayName"));
            prop_renderedOnUserRole.setShortDescription(resources.getString("HtmlMessages_renderedOnUserRole_Description"));
            prop_renderedOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_renderedOnUserRole.setExpert(false);
            prop_renderedOnUserRole.setHidden(false);
            prop_renderedOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("renderedOnUserRole",false,null,true);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_showDetail = new PropertyDescriptor("showDetail",beanClass,"isShowDetail","setShowDetail");
            prop_showDetail.setDisplayName(resources.getString("HtmlMessages_showDetail_DisplayName"));
            prop_showDetail.setShortDescription(resources.getString("HtmlMessages_showDetail_Description"));
            prop_showDetail.setExpert(false);
            prop_showDetail.setHidden(false);
            prop_showDetail.setPreferred(false);
            attrib = new AttributeDescriptor("showDetail",false,"false",true);
            prop_showDetail.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_showDetail.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_showSummary = new PropertyDescriptor("showSummary",beanClass,"isShowSummary","setShowSummary");
            prop_showSummary.setDisplayName(resources.getString("HtmlMessages_showSummary_DisplayName"));
            prop_showSummary.setShortDescription(resources.getString("HtmlMessages_showSummary_Description"));
            prop_showSummary.setExpert(false);
            prop_showSummary.setHidden(false);
            prop_showSummary.setPreferred(false);
            attrib = new AttributeDescriptor("showSummary",false,"true",true);
            prop_showSummary.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_showSummary.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");
            prop_style.setDisplayName(resources.getString("HtmlMessages_style_DisplayName"));
            prop_style.setShortDescription(resources.getString("HtmlMessages_style_Description"));
            prop_style.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.css.CssStylePropertyEditor"));
            prop_style.setExpert(false);
            prop_style.setHidden(false);
            prop_style.setPreferred(false);
            attrib = new AttributeDescriptor("style",false,null,true);
            prop_style.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_style.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("HtmlMessages_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("HtmlMessages_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_title = new PropertyDescriptor("title",beanClass,"getTitle","setTitle");
            prop_title.setDisplayName(resources.getString("HtmlMessages_title_DisplayName"));
            prop_title.setShortDescription(resources.getString("HtmlMessages_title_Description"));
            prop_title.setExpert(false);
            prop_title.setHidden(false);
            prop_title.setPreferred(false);
            attrib = new AttributeDescriptor("title",false,null,true);
            prop_title.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_title.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_tooltip = new PropertyDescriptor("tooltip",beanClass,"isTooltip","setTooltip");
            prop_tooltip.setDisplayName(resources.getString("HtmlMessages_tooltip_DisplayName"));
            prop_tooltip.setShortDescription(resources.getString("HtmlMessages_tooltip_Description"));
            prop_tooltip.setExpert(false);
            prop_tooltip.setHidden(false);
            prop_tooltip.setPreferred(false);
            attrib = new AttributeDescriptor("tooltip",false,"false",true);
            prop_tooltip.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_tooltip.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_visible = new PropertyDescriptor("visible",beanClass,"isVisible","setVisible");
            prop_visible.setDisplayName(resources.getString("HtmlMessages_visible_DisplayName"));
            prop_visible.setShortDescription(resources.getString("HtmlMessages_visible_Description"));
            prop_visible.setExpert(false);
            prop_visible.setHidden(false);
            prop_visible.setPreferred(false);
            attrib = new AttributeDescriptor("visible",false,"true",true);
            prop_visible.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_visible.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_warnClass = new PropertyDescriptor("warnClass",beanClass,"getWarnClass","setWarnClass");
            prop_warnClass.setDisplayName(resources.getString("HtmlMessages_warnClass_DisplayName"));
            prop_warnClass.setShortDescription(resources.getString("HtmlMessages_warnClass_Description"));
            prop_warnClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_warnClass.setExpert(false);
            prop_warnClass.setHidden(false);
            prop_warnClass.setPreferred(false);
            attrib = new AttributeDescriptor("warnClass",false,null,true);
            prop_warnClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_warnClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_warnStyle = new PropertyDescriptor("warnStyle",beanClass,"getWarnStyle","setWarnStyle");
            prop_warnStyle.setDisplayName(resources.getString("HtmlMessages_warnStyle_DisplayName"));
            prop_warnStyle.setShortDescription(resources.getString("HtmlMessages_warnStyle_Description"));
            prop_warnStyle.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_warnStyle.setExpert(false);
            prop_warnStyle.setHidden(false);
            prop_warnStyle.setPreferred(false);
            attrib = new AttributeDescriptor("warnStyle",false,null,true);
            prop_warnStyle.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_warnStyle.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("HtmlMessages_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("HtmlMessages_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("HtmlMessages_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("HtmlMessages_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("HtmlMessages_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("HtmlMessages_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("HtmlMessages_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("HtmlMessages_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("HtmlMessages_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("HtmlMessages_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_for = new PropertyDescriptor("for",beanClass,"getFor","setFor");
            prop_for.setDisplayName(resources.getString("HtmlMessages_for_DisplayName"));
            prop_for.setShortDescription(resources.getString("HtmlMessages_for_Description"));
            prop_for.setExpert(false);
            prop_for.setHidden(false);
            prop_for.setPreferred(false);
            attrib = new AttributeDescriptor("for",false,null,true);
            prop_for.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_for.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);
            prop_parent.setDisplayName(resources.getString("HtmlMessages_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("HtmlMessages_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("HtmlMessages_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("HtmlMessages_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("HtmlMessages_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("HtmlMessages_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

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
                prop_globalOnly,
                prop_id,
                prop_infoClass,
                prop_infoStyle,
                prop_lang,
                prop_layout,
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
