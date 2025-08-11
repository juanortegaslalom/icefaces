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

abstract class HtmlOutputLinkBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.ext.Bundle-JSF", Locale.getDefault(), HtmlOutputLinkBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>HtmlOutputLinkBeanInfoBase</code>.</p>
     */
    public HtmlOutputLinkBeanInfoBase() {

        beanClass = HtmlOutputLink.class;
        iconFileName_C16 = "HtmlOutputLink_C16";
        iconFileName_C32 = "HtmlOutputLink_C32";
        iconFileName_M16 = "HtmlOutputLink_M16";
        iconFileName_M32 = "HtmlOutputLink_M32";

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
        beanDescriptor.setDisplayName(resources.getString("HtmlOutputLink_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("HtmlOutputLink_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"outputLink");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.TRUE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"outputLink");
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

            PropertyDescriptor prop_accesskey = new PropertyDescriptor("accesskey",beanClass,"getAccesskey","setAccesskey");
            prop_accesskey.setDisplayName(resources.getString("HtmlOutputLink_accesskey_DisplayName"));
            prop_accesskey.setShortDescription(resources.getString("HtmlOutputLink_accesskey_Description"));
            prop_accesskey.setExpert(false);
            prop_accesskey.setHidden(false);
            prop_accesskey.setPreferred(false);
            attrib = new AttributeDescriptor("accesskey",false,null,true);
            prop_accesskey.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_accesskey.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_charset = new PropertyDescriptor("charset",beanClass,"getCharset","setCharset");
            prop_charset.setDisplayName(resources.getString("HtmlOutputLink_charset_DisplayName"));
            prop_charset.setShortDescription(resources.getString("HtmlOutputLink_charset_Description"));
            prop_charset.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.SelectOneDomainEditor"));
            prop_charset.setExpert(false);
            prop_charset.setHidden(false);
            prop_charset.setPreferred(false);
            attrib = new AttributeDescriptor("charset",false,null,true);
            prop_charset.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_charset.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_charset.setValue("com.sun.rave.propertyeditors.DOMAIN_CLASS", com.sun.rave.propertyeditors.domains.CharacterSetsDomain.class);

            PropertyDescriptor prop_converter = new PropertyDescriptor("converter",beanClass,"getConverter","setConverter");
            prop_converter.setDisplayName(resources.getString("HtmlOutputLink_converter_DisplayName"));
            prop_converter.setShortDescription(resources.getString("HtmlOutputLink_converter_Description"));
            prop_converter.setExpert(false);
            prop_converter.setHidden(false);
            prop_converter.setPreferred(false);
            attrib = new AttributeDescriptor("converter",false,null,true);
            prop_converter.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_converter.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_coords = new PropertyDescriptor("coords",beanClass,"getCoords","setCoords");
            prop_coords.setDisplayName(resources.getString("HtmlOutputLink_coords_DisplayName"));
            prop_coords.setShortDescription(resources.getString("HtmlOutputLink_coords_Description"));
            prop_coords.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_coords.setExpert(false);
            prop_coords.setHidden(false);
            prop_coords.setPreferred(false);
            attrib = new AttributeDescriptor("coords",false,null,true);
            prop_coords.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_coords.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_dir = new PropertyDescriptor("dir",beanClass,"getDir","setDir");
            prop_dir.setDisplayName(resources.getString("HtmlOutputLink_dir_DisplayName"));
            prop_dir.setShortDescription(resources.getString("HtmlOutputLink_dir_Description"));
            prop_dir.setExpert(false);
            prop_dir.setHidden(false);
            prop_dir.setPreferred(false);
            attrib = new AttributeDescriptor("dir",false,null,true);
            prop_dir.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_dir.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_disabled = new PropertyDescriptor("disabled",beanClass,"isDisabled","setDisabled");
            prop_disabled.setDisplayName(resources.getString("HtmlOutputLink_disabled_DisplayName"));
            prop_disabled.setShortDescription(resources.getString("HtmlOutputLink_disabled_Description"));
            prop_disabled.setExpert(false);
            prop_disabled.setHidden(false);
            prop_disabled.setPreferred(false);
            attrib = new AttributeDescriptor("disabled",false,null,true);
            prop_disabled.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_disabled.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_effect = new PropertyDescriptor("effect",beanClass,"getEffect","setEffect");
            prop_effect.setDisplayName(resources.getString("HtmlOutputLink_effect_DisplayName"));
            prop_effect.setShortDescription(resources.getString("HtmlOutputLink_effect_Description"));
            prop_effect.setExpert(false);
            prop_effect.setHidden(false);
            prop_effect.setPreferred(false);
            attrib = new AttributeDescriptor("effect",false,null,true);
            prop_effect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_effect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_enabledOnUserRole = new PropertyDescriptor("enabledOnUserRole",beanClass,"getEnabledOnUserRole","setEnabledOnUserRole");
            prop_enabledOnUserRole.setDisplayName(resources.getString("HtmlOutputLink_enabledOnUserRole_DisplayName"));
            prop_enabledOnUserRole.setShortDescription(resources.getString("HtmlOutputLink_enabledOnUserRole_Description"));
            prop_enabledOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_enabledOnUserRole.setExpert(false);
            prop_enabledOnUserRole.setHidden(false);
            prop_enabledOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("enabledOnUserRole",false,null,true);
            prop_enabledOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_enabledOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_ADVANCED);

            PropertyDescriptor prop_hreflang = new PropertyDescriptor("hreflang",beanClass,"getHreflang","setHreflang");
            prop_hreflang.setDisplayName(resources.getString("HtmlOutputLink_hreflang_DisplayName"));
            prop_hreflang.setShortDescription(resources.getString("HtmlOutputLink_hreflang_Description"));
            prop_hreflang.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.SelectOneDomainEditor"));
            prop_hreflang.setExpert(false);
            prop_hreflang.setHidden(false);
            prop_hreflang.setPreferred(false);
            attrib = new AttributeDescriptor("hreflang",false,null,true);
            prop_hreflang.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_hreflang.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_hreflang.setValue("com.sun.rave.propertyeditors.DOMAIN_CLASS", com.sun.rave.propertyeditors.domains.LanguagesDomain.class);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("HtmlOutputLink_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("HtmlOutputLink_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_lang = new PropertyDescriptor("lang",beanClass,"getLang","setLang");
            prop_lang.setDisplayName(resources.getString("HtmlOutputLink_lang_DisplayName"));
            prop_lang.setShortDescription(resources.getString("HtmlOutputLink_lang_Description"));
            prop_lang.setExpert(false);
            prop_lang.setHidden(false);
            prop_lang.setPreferred(false);
            attrib = new AttributeDescriptor("lang",false,null,true);
            prop_lang.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_lang.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_onblur = new PropertyDescriptor("onblur",beanClass,"getOnblur","setOnblur");
            prop_onblur.setDisplayName(resources.getString("HtmlOutputLink_onblur_DisplayName"));
            prop_onblur.setShortDescription(resources.getString("HtmlOutputLink_onblur_Description"));
            prop_onblur.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onblur.setExpert(false);
            prop_onblur.setHidden(false);
            prop_onblur.setPreferred(false);
            attrib = new AttributeDescriptor("onblur",false,null,true);
            prop_onblur.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onblur.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onclick = new PropertyDescriptor("onclick",beanClass,"getOnclick","setOnclick");
            prop_onclick.setDisplayName(resources.getString("HtmlOutputLink_onclick_DisplayName"));
            prop_onclick.setShortDescription(resources.getString("HtmlOutputLink_onclick_Description"));
            prop_onclick.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onclick.setExpert(false);
            prop_onclick.setHidden(true);
            prop_onclick.setPreferred(false);
            attrib = new AttributeDescriptor("onclick",false,null,true);
            prop_onclick.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onclick.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onclickeffect = new PropertyDescriptor("onclickeffect",beanClass,"getOnclickeffect","setOnclickeffect");
            prop_onclickeffect.setDisplayName(resources.getString("HtmlOutputLink_onclickeffect_DisplayName"));
            prop_onclickeffect.setShortDescription(resources.getString("HtmlOutputLink_onclickeffect_Description"));
            prop_onclickeffect.setExpert(false);
            prop_onclickeffect.setHidden(true);
            prop_onclickeffect.setPreferred(false);
            attrib = new AttributeDescriptor("onclickeffect",false,null,true);
            prop_onclickeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onclickeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_ondblclick = new PropertyDescriptor("ondblclick",beanClass,"getOndblclick","setOndblclick");
            prop_ondblclick.setDisplayName(resources.getString("HtmlOutputLink_ondblclick_DisplayName"));
            prop_ondblclick.setShortDescription(resources.getString("HtmlOutputLink_ondblclick_Description"));
            prop_ondblclick.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_ondblclick.setExpert(false);
            prop_ondblclick.setHidden(true);
            prop_ondblclick.setPreferred(false);
            attrib = new AttributeDescriptor("ondblclick",false,null,true);
            prop_ondblclick.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_ondblclick.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_ondblclickeffect = new PropertyDescriptor("ondblclickeffect",beanClass,"getOndblclickeffect","setOndblclickeffect");
            prop_ondblclickeffect.setDisplayName(resources.getString("HtmlOutputLink_ondblclickeffect_DisplayName"));
            prop_ondblclickeffect.setShortDescription(resources.getString("HtmlOutputLink_ondblclickeffect_Description"));
            prop_ondblclickeffect.setExpert(false);
            prop_ondblclickeffect.setHidden(true);
            prop_ondblclickeffect.setPreferred(false);
            attrib = new AttributeDescriptor("ondblclickeffect",false,null,true);
            prop_ondblclickeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_ondblclickeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onfocus = new PropertyDescriptor("onfocus",beanClass,"getOnfocus","setOnfocus");
            prop_onfocus.setDisplayName(resources.getString("HtmlOutputLink_onfocus_DisplayName"));
            prop_onfocus.setShortDescription(resources.getString("HtmlOutputLink_onfocus_Description"));
            prop_onfocus.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onfocus.setExpert(false);
            prop_onfocus.setHidden(false);
            prop_onfocus.setPreferred(false);
            attrib = new AttributeDescriptor("onfocus",false,null,true);
            prop_onfocus.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onfocus.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeydown = new PropertyDescriptor("onkeydown",beanClass,"getOnkeydown","setOnkeydown");
            prop_onkeydown.setDisplayName(resources.getString("HtmlOutputLink_onkeydown_DisplayName"));
            prop_onkeydown.setShortDescription(resources.getString("HtmlOutputLink_onkeydown_Description"));
            prop_onkeydown.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeydown.setExpert(false);
            prop_onkeydown.setHidden(true);
            prop_onkeydown.setPreferred(false);
            attrib = new AttributeDescriptor("onkeydown",false,null,true);
            prop_onkeydown.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeydown.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeydowneffect = new PropertyDescriptor("onkeydowneffect",beanClass,"getOnkeydowneffect","setOnkeydowneffect");
            prop_onkeydowneffect.setDisplayName(resources.getString("HtmlOutputLink_onkeydowneffect_DisplayName"));
            prop_onkeydowneffect.setShortDescription(resources.getString("HtmlOutputLink_onkeydowneffect_Description"));
            prop_onkeydowneffect.setExpert(false);
            prop_onkeydowneffect.setHidden(true);
            prop_onkeydowneffect.setPreferred(false);
            attrib = new AttributeDescriptor("onkeydowneffect",false,null,true);
            prop_onkeydowneffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeydowneffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onkeypress = new PropertyDescriptor("onkeypress",beanClass,"getOnkeypress","setOnkeypress");
            prop_onkeypress.setDisplayName(resources.getString("HtmlOutputLink_onkeypress_DisplayName"));
            prop_onkeypress.setShortDescription(resources.getString("HtmlOutputLink_onkeypress_Description"));
            prop_onkeypress.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeypress.setExpert(false);
            prop_onkeypress.setHidden(true);
            prop_onkeypress.setPreferred(false);
            attrib = new AttributeDescriptor("onkeypress",false,null,true);
            prop_onkeypress.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeypress.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeypresseffect = new PropertyDescriptor("onkeypresseffect",beanClass,"getOnkeypresseffect","setOnkeypresseffect");
            prop_onkeypresseffect.setDisplayName(resources.getString("HtmlOutputLink_onkeypresseffect_DisplayName"));
            prop_onkeypresseffect.setShortDescription(resources.getString("HtmlOutputLink_onkeypresseffect_Description"));
            prop_onkeypresseffect.setExpert(false);
            prop_onkeypresseffect.setHidden(true);
            prop_onkeypresseffect.setPreferred(false);
            attrib = new AttributeDescriptor("onkeypresseffect",false,null,true);
            prop_onkeypresseffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeypresseffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onkeyup = new PropertyDescriptor("onkeyup",beanClass,"getOnkeyup","setOnkeyup");
            prop_onkeyup.setDisplayName(resources.getString("HtmlOutputLink_onkeyup_DisplayName"));
            prop_onkeyup.setShortDescription(resources.getString("HtmlOutputLink_onkeyup_Description"));
            prop_onkeyup.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeyup.setExpert(false);
            prop_onkeyup.setHidden(true);
            prop_onkeyup.setPreferred(false);
            attrib = new AttributeDescriptor("onkeyup",false,null,true);
            prop_onkeyup.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeyup.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeyupeffect = new PropertyDescriptor("onkeyupeffect",beanClass,"getOnkeyupeffect","setOnkeyupeffect");
            prop_onkeyupeffect.setDisplayName(resources.getString("HtmlOutputLink_onkeyupeffect_DisplayName"));
            prop_onkeyupeffect.setShortDescription(resources.getString("HtmlOutputLink_onkeyupeffect_Description"));
            prop_onkeyupeffect.setExpert(false);
            prop_onkeyupeffect.setHidden(true);
            prop_onkeyupeffect.setPreferred(false);
            attrib = new AttributeDescriptor("onkeyupeffect",false,null,true);
            prop_onkeyupeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeyupeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmousedown = new PropertyDescriptor("onmousedown",beanClass,"getOnmousedown","setOnmousedown");
            prop_onmousedown.setDisplayName(resources.getString("HtmlOutputLink_onmousedown_DisplayName"));
            prop_onmousedown.setShortDescription(resources.getString("HtmlOutputLink_onmousedown_Description"));
            prop_onmousedown.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmousedown.setExpert(false);
            prop_onmousedown.setHidden(true);
            prop_onmousedown.setPreferred(false);
            attrib = new AttributeDescriptor("onmousedown",false,null,true);
            prop_onmousedown.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousedown.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmousedowneffect = new PropertyDescriptor("onmousedowneffect",beanClass,"getOnmousedowneffect","setOnmousedowneffect");
            prop_onmousedowneffect.setDisplayName(resources.getString("HtmlOutputLink_onmousedowneffect_DisplayName"));
            prop_onmousedowneffect.setShortDescription(resources.getString("HtmlOutputLink_onmousedowneffect_Description"));
            prop_onmousedowneffect.setExpert(false);
            prop_onmousedowneffect.setHidden(true);
            prop_onmousedowneffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmousedowneffect",false,null,true);
            prop_onmousedowneffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousedowneffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmousemove = new PropertyDescriptor("onmousemove",beanClass,"getOnmousemove","setOnmousemove");
            prop_onmousemove.setDisplayName(resources.getString("HtmlOutputLink_onmousemove_DisplayName"));
            prop_onmousemove.setShortDescription(resources.getString("HtmlOutputLink_onmousemove_Description"));
            prop_onmousemove.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmousemove.setExpert(false);
            prop_onmousemove.setHidden(true);
            prop_onmousemove.setPreferred(false);
            attrib = new AttributeDescriptor("onmousemove",false,null,true);
            prop_onmousemove.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousemove.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmousemoveeffect = new PropertyDescriptor("onmousemoveeffect",beanClass,"getOnmousemoveeffect","setOnmousemoveeffect");
            prop_onmousemoveeffect.setDisplayName(resources.getString("HtmlOutputLink_onmousemoveeffect_DisplayName"));
            prop_onmousemoveeffect.setShortDescription(resources.getString("HtmlOutputLink_onmousemoveeffect_Description"));
            prop_onmousemoveeffect.setExpert(false);
            prop_onmousemoveeffect.setHidden(true);
            prop_onmousemoveeffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmousemoveeffect",false,null,true);
            prop_onmousemoveeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousemoveeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmouseout = new PropertyDescriptor("onmouseout",beanClass,"getOnmouseout","setOnmouseout");
            prop_onmouseout.setDisplayName(resources.getString("HtmlOutputLink_onmouseout_DisplayName"));
            prop_onmouseout.setShortDescription(resources.getString("HtmlOutputLink_onmouseout_Description"));
            prop_onmouseout.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseout.setExpert(false);
            prop_onmouseout.setHidden(true);
            prop_onmouseout.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseout",false,null,true);
            prop_onmouseout.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseout.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseouteffect = new PropertyDescriptor("onmouseouteffect",beanClass,"getOnmouseouteffect","setOnmouseouteffect");
            prop_onmouseouteffect.setDisplayName(resources.getString("HtmlOutputLink_onmouseouteffect_DisplayName"));
            prop_onmouseouteffect.setShortDescription(resources.getString("HtmlOutputLink_onmouseouteffect_Description"));
            prop_onmouseouteffect.setExpert(false);
            prop_onmouseouteffect.setHidden(true);
            prop_onmouseouteffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseouteffect",false,null,true);
            prop_onmouseouteffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseouteffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmouseover = new PropertyDescriptor("onmouseover",beanClass,"getOnmouseover","setOnmouseover");
            prop_onmouseover.setDisplayName(resources.getString("HtmlOutputLink_onmouseover_DisplayName"));
            prop_onmouseover.setShortDescription(resources.getString("HtmlOutputLink_onmouseover_Description"));
            prop_onmouseover.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseover.setExpert(false);
            prop_onmouseover.setHidden(true);
            prop_onmouseover.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseover",false,null,true);
            prop_onmouseover.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseover.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseovereffect = new PropertyDescriptor("onmouseovereffect",beanClass,"getOnmouseovereffect","setOnmouseovereffect");
            prop_onmouseovereffect.setDisplayName(resources.getString("HtmlOutputLink_onmouseovereffect_DisplayName"));
            prop_onmouseovereffect.setShortDescription(resources.getString("HtmlOutputLink_onmouseovereffect_Description"));
            prop_onmouseovereffect.setExpert(false);
            prop_onmouseovereffect.setHidden(true);
            prop_onmouseovereffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseovereffect",false,null,true);
            prop_onmouseovereffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseovereffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmouseup = new PropertyDescriptor("onmouseup",beanClass,"getOnmouseup","setOnmouseup");
            prop_onmouseup.setDisplayName(resources.getString("HtmlOutputLink_onmouseup_DisplayName"));
            prop_onmouseup.setShortDescription(resources.getString("HtmlOutputLink_onmouseup_Description"));
            prop_onmouseup.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseup.setExpert(false);
            prop_onmouseup.setHidden(true);
            prop_onmouseup.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseup",false,null,true);
            prop_onmouseup.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseup.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseupeffect = new PropertyDescriptor("onmouseupeffect",beanClass,"getOnmouseupeffect","setOnmouseupeffect");
            prop_onmouseupeffect.setDisplayName(resources.getString("HtmlOutputLink_onmouseupeffect_DisplayName"));
            prop_onmouseupeffect.setShortDescription(resources.getString("HtmlOutputLink_onmouseupeffect_Description"));
            prop_onmouseupeffect.setExpert(false);
            prop_onmouseupeffect.setHidden(true);
            prop_onmouseupeffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseupeffect",false,null,true);
            prop_onmouseupeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseupeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_percentEncode = new PropertyDescriptor("percentEncode",beanClass,"isPercentEncode","setPercentEncode");
            prop_percentEncode.setDisplayName(resources.getString("HtmlOutputLink_percentEncode_DisplayName"));
            prop_percentEncode.setShortDescription(resources.getString("HtmlOutputLink_percentEncode_Description"));
            prop_percentEncode.setExpert(false);
            prop_percentEncode.setHidden(false);
            prop_percentEncode.setPreferred(false);
            attrib = new AttributeDescriptor("percentEncode",false,"false",true);
            prop_percentEncode.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_percentEncode.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_rel = new PropertyDescriptor("rel",beanClass,"getRel","setRel");
            prop_rel.setDisplayName(resources.getString("HtmlOutputLink_rel_DisplayName"));
            prop_rel.setShortDescription(resources.getString("HtmlOutputLink_rel_Description"));
            prop_rel.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.SelectOneDomainEditor"));
            prop_rel.setExpert(false);
            prop_rel.setHidden(false);
            prop_rel.setPreferred(false);
            attrib = new AttributeDescriptor("rel",false,null,true);
            prop_rel.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rel.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_rel.setValue("com.sun.rave.propertyeditors.DOMAIN_CLASS", com.sun.rave.propertyeditors.domains.HtmlLinkTypesDomain.class);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("HtmlOutputLink_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("HtmlOutputLink_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");
            prop_renderedOnUserRole.setDisplayName(resources.getString("HtmlOutputLink_renderedOnUserRole_DisplayName"));
            prop_renderedOnUserRole.setShortDescription(resources.getString("HtmlOutputLink_renderedOnUserRole_Description"));
            prop_renderedOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_renderedOnUserRole.setExpert(false);
            prop_renderedOnUserRole.setHidden(false);
            prop_renderedOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("renderedOnUserRole",false,null,true);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_rev = new PropertyDescriptor("rev",beanClass,"getRev","setRev");
            prop_rev.setDisplayName(resources.getString("HtmlOutputLink_rev_DisplayName"));
            prop_rev.setShortDescription(resources.getString("HtmlOutputLink_rev_Description"));
            prop_rev.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.SelectOneDomainEditor"));
            prop_rev.setExpert(false);
            prop_rev.setHidden(false);
            prop_rev.setPreferred(false);
            attrib = new AttributeDescriptor("rev",false,null,true);
            prop_rev.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rev.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_rev.setValue("com.sun.rave.propertyeditors.DOMAIN_CLASS", com.sun.rave.propertyeditors.domains.HtmlLinkTypesDomain.class);

            PropertyDescriptor prop_shape = new PropertyDescriptor("shape",beanClass,"getShape","setShape");
            prop_shape.setDisplayName(resources.getString("HtmlOutputLink_shape_DisplayName"));
            prop_shape.setShortDescription(resources.getString("HtmlOutputLink_shape_Description"));
            prop_shape.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.SelectOneDomainEditor"));
            prop_shape.setExpert(false);
            prop_shape.setHidden(false);
            prop_shape.setPreferred(false);
            attrib = new AttributeDescriptor("shape",false,null,true);
            prop_shape.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_shape.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_shape.setValue("com.sun.rave.propertyeditors.DOMAIN_CLASS", com.sun.rave.propertyeditors.domains.HtmlRegionShapesDomain.class);

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");
            prop_style.setDisplayName(resources.getString("HtmlOutputLink_style_DisplayName"));
            prop_style.setShortDescription(resources.getString("HtmlOutputLink_style_Description"));
            prop_style.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.css.CssStylePropertyEditor"));
            prop_style.setExpert(false);
            prop_style.setHidden(false);
            prop_style.setPreferred(false);
            attrib = new AttributeDescriptor("style",false,null,true);
            prop_style.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_style.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("HtmlOutputLink_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("HtmlOutputLink_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.StyleClassPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_tabindex = new PropertyDescriptor("tabindex",beanClass,"getTabindex","setTabindex");
            prop_tabindex.setDisplayName(resources.getString("HtmlOutputLink_tabindex_DisplayName"));
            prop_tabindex.setShortDescription(resources.getString("HtmlOutputLink_tabindex_Description"));
            prop_tabindex.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.IntegerPropertyEditor"));
            prop_tabindex.setExpert(false);
            prop_tabindex.setHidden(false);
            prop_tabindex.setPreferred(false);
            attrib = new AttributeDescriptor("tabindex",false,null,true);
            prop_tabindex.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_tabindex.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_tabindex.setValue("maxValue", new Integer(Short.MAX_VALUE));
            prop_tabindex.setValue("minValue", new Integer(0));

            PropertyDescriptor prop_target = new PropertyDescriptor("target",beanClass,"getTarget","setTarget");
            prop_target.setDisplayName(resources.getString("HtmlOutputLink_target_DisplayName"));
            prop_target.setShortDescription(resources.getString("HtmlOutputLink_target_Description"));
            prop_target.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.SelectOneDomainEditor"));
            prop_target.setExpert(false);
            prop_target.setHidden(false);
            prop_target.setPreferred(false);
            attrib = new AttributeDescriptor("target",false,null,true);
            prop_target.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_target.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);
            prop_target.setValue("com.sun.rave.propertyeditors.DOMAIN_CLASS", com.sun.rave.propertyeditors.domains.HtmlFrameTargetsDomain.class);

            PropertyDescriptor prop_title = new PropertyDescriptor("title",beanClass,"getTitle","setTitle");
            prop_title.setDisplayName(resources.getString("HtmlOutputLink_title_DisplayName"));
            prop_title.setShortDescription(resources.getString("HtmlOutputLink_title_Description"));
            prop_title.setExpert(false);
            prop_title.setHidden(false);
            prop_title.setPreferred(false);
            attrib = new AttributeDescriptor("title",false,null,true);
            prop_title.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_title.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_type = new PropertyDescriptor("type",beanClass,"getType","setType");
            prop_type.setDisplayName(resources.getString("HtmlOutputLink_type_DisplayName"));
            prop_type.setShortDescription(resources.getString("HtmlOutputLink_type_Description"));
            prop_type.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.SelectOneDomainEditor"));
            prop_type.setExpert(false);
            prop_type.setHidden(false);
            prop_type.setPreferred(false);
            attrib = new AttributeDescriptor("type",false,null,true);
            prop_type.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_type.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_type.setValue("com.sun.rave.propertyeditors.DOMAIN_CLASS", com.sun.rave.propertyeditors.domains.MimeTypesDomain.class);

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");
            prop_value.setDisplayName(resources.getString("HtmlOutputLink_value_DisplayName"));
            prop_value.setShortDescription(resources.getString("HtmlOutputLink_value_Description"));
            prop_value.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.faces.dt.std.ValueBindingPropertyEditor"));
            prop_value.setExpert(false);
            prop_value.setHidden(false);
            prop_value.setPreferred(false);
            attrib = new AttributeDescriptor("value",false,null,true);
            prop_value.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_value.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);
            prop_value.setValue("ignoreIsBound", "true");

            PropertyDescriptor prop_visible = new PropertyDescriptor("visible",beanClass,"isVisible","setVisible");
            prop_visible.setDisplayName(resources.getString("HtmlOutputLink_visible_DisplayName"));
            prop_visible.setShortDescription(resources.getString("HtmlOutputLink_visible_Description"));
            prop_visible.setExpert(false);
            prop_visible.setHidden(false);
            prop_visible.setPreferred(false);
            attrib = new AttributeDescriptor("visible",false,"true",true);
            prop_visible.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_visible.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("HtmlOutputLink_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("HtmlOutputLink_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("HtmlOutputLink_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("HtmlOutputLink_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("HtmlOutputLink_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("HtmlOutputLink_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("HtmlOutputLink_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("HtmlOutputLink_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("HtmlOutputLink_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("HtmlOutputLink_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_fragment = new PropertyDescriptor("fragment",beanClass,"getFragment","setFragment");
            prop_fragment.setDisplayName(resources.getString("HtmlOutputLink_fragment_DisplayName"));
            prop_fragment.setShortDescription(resources.getString("HtmlOutputLink_fragment_Description"));
            prop_fragment.setExpert(false);
            prop_fragment.setHidden(false);
            prop_fragment.setPreferred(false);
            attrib = new AttributeDescriptor("fragment",false,null,true);
            prop_fragment.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_fragment.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_localValue = new PropertyDescriptor("localValue",beanClass,"getLocalValue",null);
            prop_localValue.setDisplayName(resources.getString("HtmlOutputLink_localValue_DisplayName"));
            prop_localValue.setShortDescription(resources.getString("HtmlOutputLink_localValue_Description"));
            prop_localValue.setExpert(false);
            prop_localValue.setHidden(true);
            prop_localValue.setPreferred(false);
            prop_localValue.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);
            prop_parent.setDisplayName(resources.getString("HtmlOutputLink_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("HtmlOutputLink_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("HtmlOutputLink_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("HtmlOutputLink_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("HtmlOutputLink_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("HtmlOutputLink_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            propDescriptors = new PropertyDescriptor[] {
                prop_accesskey,
                prop_attributes,
                prop_charset,
                prop_childCount,
                prop_children,
                prop_converter,
                prop_coords,
                prop_dir,
                prop_disabled,
                prop_effect,
                prop_enabledOnUserRole,
                prop_facets,
                prop_family,
                prop_fragment,
                prop_hreflang,
                prop_id,
                prop_lang,
                prop_localValue,
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
                prop_parent,
                prop_percentEncode,
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
