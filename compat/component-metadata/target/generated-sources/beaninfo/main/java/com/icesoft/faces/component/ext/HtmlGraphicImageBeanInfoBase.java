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

abstract class HtmlGraphicImageBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.ext.Bundle-JSF", Locale.getDefault(), HtmlGraphicImageBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>HtmlGraphicImageBeanInfoBase</code>.</p>
     */
    public HtmlGraphicImageBeanInfoBase() {

        beanClass = HtmlGraphicImage.class;
        iconFileName_C16 = "HtmlGraphicImage_C16";
        iconFileName_C32 = "HtmlGraphicImage_C32";
        iconFileName_M16 = "HtmlGraphicImage_M16";
        iconFileName_M32 = "HtmlGraphicImage_M32";

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
        beanDescriptor.setDisplayName(resources.getString("HtmlGraphicImage_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("HtmlGraphicImage_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"graphicImage");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.FALSE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"graphicImage");
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

            PropertyDescriptor prop_alt = new PropertyDescriptor("alt",beanClass,"getAlt","setAlt");
            prop_alt.setDisplayName(resources.getString("HtmlGraphicImage_alt_DisplayName"));
            prop_alt.setShortDescription(resources.getString("HtmlGraphicImage_alt_Description"));
            prop_alt.setExpert(false);
            prop_alt.setHidden(false);
            prop_alt.setPreferred(false);
            attrib = new AttributeDescriptor("alt",false,null,true);
            prop_alt.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_alt.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_dir = new PropertyDescriptor("dir",beanClass,"getDir","setDir");
            prop_dir.setDisplayName(resources.getString("HtmlGraphicImage_dir_DisplayName"));
            prop_dir.setShortDescription(resources.getString("HtmlGraphicImage_dir_Description"));
            prop_dir.setExpert(false);
            prop_dir.setHidden(false);
            prop_dir.setPreferred(false);
            attrib = new AttributeDescriptor("dir",false,null,true);
            prop_dir.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_dir.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_effect = new PropertyDescriptor("effect",beanClass,"getEffect","setEffect");
            prop_effect.setDisplayName(resources.getString("HtmlGraphicImage_effect_DisplayName"));
            prop_effect.setShortDescription(resources.getString("HtmlGraphicImage_effect_Description"));
            prop_effect.setExpert(false);
            prop_effect.setHidden(false);
            prop_effect.setPreferred(false);
            attrib = new AttributeDescriptor("effect",false,null,true);
            prop_effect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_effect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_height = new PropertyDescriptor("height",beanClass,"getHeight","setHeight");
            prop_height.setDisplayName(resources.getString("HtmlGraphicImage_height_DisplayName"));
            prop_height.setShortDescription(resources.getString("HtmlGraphicImage_height_Description"));
            prop_height.setExpert(false);
            prop_height.setHidden(false);
            prop_height.setPreferred(false);
            attrib = new AttributeDescriptor("height",false,null,true);
            prop_height.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_height.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("HtmlGraphicImage_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("HtmlGraphicImage_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_lang = new PropertyDescriptor("lang",beanClass,"getLang","setLang");
            prop_lang.setDisplayName(resources.getString("HtmlGraphicImage_lang_DisplayName"));
            prop_lang.setShortDescription(resources.getString("HtmlGraphicImage_lang_Description"));
            prop_lang.setExpert(false);
            prop_lang.setHidden(false);
            prop_lang.setPreferred(false);
            attrib = new AttributeDescriptor("lang",false,null,true);
            prop_lang.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_lang.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_longdesc = new PropertyDescriptor("longdesc",beanClass,"getLongdesc","setLongdesc");
            prop_longdesc.setDisplayName(resources.getString("HtmlGraphicImage_longdesc_DisplayName"));
            prop_longdesc.setShortDescription(resources.getString("HtmlGraphicImage_longdesc_Description"));
            prop_longdesc.setExpert(false);
            prop_longdesc.setHidden(false);
            prop_longdesc.setPreferred(false);
            attrib = new AttributeDescriptor("longdesc",false,null,true);
            prop_longdesc.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_longdesc.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_mimeType = new PropertyDescriptor("mimeType",beanClass,"getMimeType","setMimeType");
            prop_mimeType.setDisplayName(resources.getString("HtmlGraphicImage_mimeType_DisplayName"));
            prop_mimeType.setShortDescription(resources.getString("HtmlGraphicImage_mimeType_Description"));
            prop_mimeType.setExpert(false);
            prop_mimeType.setHidden(false);
            prop_mimeType.setPreferred(false);
            attrib = new AttributeDescriptor("mimeType",false,null,true);
            prop_mimeType.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_mimeType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_onclick = new PropertyDescriptor("onclick",beanClass,"getOnclick","setOnclick");
            prop_onclick.setDisplayName(resources.getString("HtmlGraphicImage_onclick_DisplayName"));
            prop_onclick.setShortDescription(resources.getString("HtmlGraphicImage_onclick_Description"));
            prop_onclick.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onclick.setExpert(false);
            prop_onclick.setHidden(true);
            prop_onclick.setPreferred(false);
            attrib = new AttributeDescriptor("onclick",false,null,true);
            prop_onclick.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onclick.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onclickeffect = new PropertyDescriptor("onclickeffect",beanClass,"getOnclickeffect","setOnclickeffect");
            prop_onclickeffect.setDisplayName(resources.getString("HtmlGraphicImage_onclickeffect_DisplayName"));
            prop_onclickeffect.setShortDescription(resources.getString("HtmlGraphicImage_onclickeffect_Description"));
            prop_onclickeffect.setExpert(false);
            prop_onclickeffect.setHidden(true);
            prop_onclickeffect.setPreferred(false);
            attrib = new AttributeDescriptor("onclickeffect",false,null,true);
            prop_onclickeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onclickeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_ondblclick = new PropertyDescriptor("ondblclick",beanClass,"getOndblclick","setOndblclick");
            prop_ondblclick.setDisplayName(resources.getString("HtmlGraphicImage_ondblclick_DisplayName"));
            prop_ondblclick.setShortDescription(resources.getString("HtmlGraphicImage_ondblclick_Description"));
            prop_ondblclick.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_ondblclick.setExpert(false);
            prop_ondblclick.setHidden(true);
            prop_ondblclick.setPreferred(false);
            attrib = new AttributeDescriptor("ondblclick",false,null,true);
            prop_ondblclick.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_ondblclick.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_ondblclickeffect = new PropertyDescriptor("ondblclickeffect",beanClass,"getOndblclickeffect","setOndblclickeffect");
            prop_ondblclickeffect.setDisplayName(resources.getString("HtmlGraphicImage_ondblclickeffect_DisplayName"));
            prop_ondblclickeffect.setShortDescription(resources.getString("HtmlGraphicImage_ondblclickeffect_Description"));
            prop_ondblclickeffect.setExpert(false);
            prop_ondblclickeffect.setHidden(true);
            prop_ondblclickeffect.setPreferred(false);
            attrib = new AttributeDescriptor("ondblclickeffect",false,null,true);
            prop_ondblclickeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_ondblclickeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onkeydown = new PropertyDescriptor("onkeydown",beanClass,"getOnkeydown","setOnkeydown");
            prop_onkeydown.setDisplayName(resources.getString("HtmlGraphicImage_onkeydown_DisplayName"));
            prop_onkeydown.setShortDescription(resources.getString("HtmlGraphicImage_onkeydown_Description"));
            prop_onkeydown.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeydown.setExpert(false);
            prop_onkeydown.setHidden(true);
            prop_onkeydown.setPreferred(false);
            attrib = new AttributeDescriptor("onkeydown",false,null,true);
            prop_onkeydown.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeydown.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeydowneffect = new PropertyDescriptor("onkeydowneffect",beanClass,"getOnkeydowneffect","setOnkeydowneffect");
            prop_onkeydowneffect.setDisplayName(resources.getString("HtmlGraphicImage_onkeydowneffect_DisplayName"));
            prop_onkeydowneffect.setShortDescription(resources.getString("HtmlGraphicImage_onkeydowneffect_Description"));
            prop_onkeydowneffect.setExpert(false);
            prop_onkeydowneffect.setHidden(true);
            prop_onkeydowneffect.setPreferred(false);
            attrib = new AttributeDescriptor("onkeydowneffect",false,null,true);
            prop_onkeydowneffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeydowneffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onkeypress = new PropertyDescriptor("onkeypress",beanClass,"getOnkeypress","setOnkeypress");
            prop_onkeypress.setDisplayName(resources.getString("HtmlGraphicImage_onkeypress_DisplayName"));
            prop_onkeypress.setShortDescription(resources.getString("HtmlGraphicImage_onkeypress_Description"));
            prop_onkeypress.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeypress.setExpert(false);
            prop_onkeypress.setHidden(true);
            prop_onkeypress.setPreferred(false);
            attrib = new AttributeDescriptor("onkeypress",false,null,true);
            prop_onkeypress.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeypress.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeypresseffect = new PropertyDescriptor("onkeypresseffect",beanClass,"getOnkeypresseffect","setOnkeypresseffect");
            prop_onkeypresseffect.setDisplayName(resources.getString("HtmlGraphicImage_onkeypresseffect_DisplayName"));
            prop_onkeypresseffect.setShortDescription(resources.getString("HtmlGraphicImage_onkeypresseffect_Description"));
            prop_onkeypresseffect.setExpert(false);
            prop_onkeypresseffect.setHidden(true);
            prop_onkeypresseffect.setPreferred(false);
            attrib = new AttributeDescriptor("onkeypresseffect",false,null,true);
            prop_onkeypresseffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeypresseffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onkeyup = new PropertyDescriptor("onkeyup",beanClass,"getOnkeyup","setOnkeyup");
            prop_onkeyup.setDisplayName(resources.getString("HtmlGraphicImage_onkeyup_DisplayName"));
            prop_onkeyup.setShortDescription(resources.getString("HtmlGraphicImage_onkeyup_Description"));
            prop_onkeyup.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeyup.setExpert(false);
            prop_onkeyup.setHidden(true);
            prop_onkeyup.setPreferred(false);
            attrib = new AttributeDescriptor("onkeyup",false,null,true);
            prop_onkeyup.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeyup.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeyupeffect = new PropertyDescriptor("onkeyupeffect",beanClass,"getOnkeyupeffect","setOnkeyupeffect");
            prop_onkeyupeffect.setDisplayName(resources.getString("HtmlGraphicImage_onkeyupeffect_DisplayName"));
            prop_onkeyupeffect.setShortDescription(resources.getString("HtmlGraphicImage_onkeyupeffect_Description"));
            prop_onkeyupeffect.setExpert(false);
            prop_onkeyupeffect.setHidden(true);
            prop_onkeyupeffect.setPreferred(false);
            attrib = new AttributeDescriptor("onkeyupeffect",false,null,true);
            prop_onkeyupeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeyupeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmousedown = new PropertyDescriptor("onmousedown",beanClass,"getOnmousedown","setOnmousedown");
            prop_onmousedown.setDisplayName(resources.getString("HtmlGraphicImage_onmousedown_DisplayName"));
            prop_onmousedown.setShortDescription(resources.getString("HtmlGraphicImage_onmousedown_Description"));
            prop_onmousedown.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmousedown.setExpert(false);
            prop_onmousedown.setHidden(true);
            prop_onmousedown.setPreferred(false);
            attrib = new AttributeDescriptor("onmousedown",false,null,true);
            prop_onmousedown.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousedown.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmousedowneffect = new PropertyDescriptor("onmousedowneffect",beanClass,"getOnmousedowneffect","setOnmousedowneffect");
            prop_onmousedowneffect.setDisplayName(resources.getString("HtmlGraphicImage_onmousedowneffect_DisplayName"));
            prop_onmousedowneffect.setShortDescription(resources.getString("HtmlGraphicImage_onmousedowneffect_Description"));
            prop_onmousedowneffect.setExpert(false);
            prop_onmousedowneffect.setHidden(true);
            prop_onmousedowneffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmousedowneffect",false,null,true);
            prop_onmousedowneffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousedowneffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmousemove = new PropertyDescriptor("onmousemove",beanClass,"getOnmousemove","setOnmousemove");
            prop_onmousemove.setDisplayName(resources.getString("HtmlGraphicImage_onmousemove_DisplayName"));
            prop_onmousemove.setShortDescription(resources.getString("HtmlGraphicImage_onmousemove_Description"));
            prop_onmousemove.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmousemove.setExpert(false);
            prop_onmousemove.setHidden(true);
            prop_onmousemove.setPreferred(false);
            attrib = new AttributeDescriptor("onmousemove",false,null,true);
            prop_onmousemove.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousemove.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmousemoveeffect = new PropertyDescriptor("onmousemoveeffect",beanClass,"getOnmousemoveeffect","setOnmousemoveeffect");
            prop_onmousemoveeffect.setDisplayName(resources.getString("HtmlGraphicImage_onmousemoveeffect_DisplayName"));
            prop_onmousemoveeffect.setShortDescription(resources.getString("HtmlGraphicImage_onmousemoveeffect_Description"));
            prop_onmousemoveeffect.setExpert(false);
            prop_onmousemoveeffect.setHidden(true);
            prop_onmousemoveeffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmousemoveeffect",false,null,true);
            prop_onmousemoveeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousemoveeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmouseout = new PropertyDescriptor("onmouseout",beanClass,"getOnmouseout","setOnmouseout");
            prop_onmouseout.setDisplayName(resources.getString("HtmlGraphicImage_onmouseout_DisplayName"));
            prop_onmouseout.setShortDescription(resources.getString("HtmlGraphicImage_onmouseout_Description"));
            prop_onmouseout.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseout.setExpert(false);
            prop_onmouseout.setHidden(true);
            prop_onmouseout.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseout",false,null,true);
            prop_onmouseout.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseout.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseouteffect = new PropertyDescriptor("onmouseouteffect",beanClass,"getOnmouseouteffect","setOnmouseouteffect");
            prop_onmouseouteffect.setDisplayName(resources.getString("HtmlGraphicImage_onmouseouteffect_DisplayName"));
            prop_onmouseouteffect.setShortDescription(resources.getString("HtmlGraphicImage_onmouseouteffect_Description"));
            prop_onmouseouteffect.setExpert(false);
            prop_onmouseouteffect.setHidden(true);
            prop_onmouseouteffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseouteffect",false,null,true);
            prop_onmouseouteffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseouteffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmouseover = new PropertyDescriptor("onmouseover",beanClass,"getOnmouseover","setOnmouseover");
            prop_onmouseover.setDisplayName(resources.getString("HtmlGraphicImage_onmouseover_DisplayName"));
            prop_onmouseover.setShortDescription(resources.getString("HtmlGraphicImage_onmouseover_Description"));
            prop_onmouseover.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseover.setExpert(false);
            prop_onmouseover.setHidden(true);
            prop_onmouseover.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseover",false,null,true);
            prop_onmouseover.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseover.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseovereffect = new PropertyDescriptor("onmouseovereffect",beanClass,"getOnmouseovereffect","setOnmouseovereffect");
            prop_onmouseovereffect.setDisplayName(resources.getString("HtmlGraphicImage_onmouseovereffect_DisplayName"));
            prop_onmouseovereffect.setShortDescription(resources.getString("HtmlGraphicImage_onmouseovereffect_Description"));
            prop_onmouseovereffect.setExpert(false);
            prop_onmouseovereffect.setHidden(true);
            prop_onmouseovereffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseovereffect",false,null,true);
            prop_onmouseovereffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseovereffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmouseup = new PropertyDescriptor("onmouseup",beanClass,"getOnmouseup","setOnmouseup");
            prop_onmouseup.setDisplayName(resources.getString("HtmlGraphicImage_onmouseup_DisplayName"));
            prop_onmouseup.setShortDescription(resources.getString("HtmlGraphicImage_onmouseup_Description"));
            prop_onmouseup.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseup.setExpert(false);
            prop_onmouseup.setHidden(true);
            prop_onmouseup.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseup",false,null,true);
            prop_onmouseup.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseup.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseupeffect = new PropertyDescriptor("onmouseupeffect",beanClass,"getOnmouseupeffect","setOnmouseupeffect");
            prop_onmouseupeffect.setDisplayName(resources.getString("HtmlGraphicImage_onmouseupeffect_DisplayName"));
            prop_onmouseupeffect.setShortDescription(resources.getString("HtmlGraphicImage_onmouseupeffect_Description"));
            prop_onmouseupeffect.setExpert(false);
            prop_onmouseupeffect.setHidden(true);
            prop_onmouseupeffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseupeffect",false,null,true);
            prop_onmouseupeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseupeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("HtmlGraphicImage_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("HtmlGraphicImage_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");
            prop_renderedOnUserRole.setDisplayName(resources.getString("HtmlGraphicImage_renderedOnUserRole_DisplayName"));
            prop_renderedOnUserRole.setShortDescription(resources.getString("HtmlGraphicImage_renderedOnUserRole_Description"));
            prop_renderedOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_renderedOnUserRole.setExpert(false);
            prop_renderedOnUserRole.setHidden(false);
            prop_renderedOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("renderedOnUserRole",false,null,true);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");
            prop_style.setDisplayName(resources.getString("HtmlGraphicImage_style_DisplayName"));
            prop_style.setShortDescription(resources.getString("HtmlGraphicImage_style_Description"));
            prop_style.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.css.CssStylePropertyEditor"));
            prop_style.setExpert(false);
            prop_style.setHidden(false);
            prop_style.setPreferred(false);
            attrib = new AttributeDescriptor("style",false,null,true);
            prop_style.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_style.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("HtmlGraphicImage_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("HtmlGraphicImage_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_url = new PropertyDescriptor("url",beanClass,"getUrl","setUrl");
            prop_url.setDisplayName(resources.getString("HtmlGraphicImage_url_DisplayName"));
            prop_url.setShortDescription(resources.getString("HtmlGraphicImage_url_Description"));
            prop_url.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_url.setExpert(false);
            prop_url.setHidden(false);
            prop_url.setPreferred(false);
            attrib = new AttributeDescriptor("url",false,null,true);
            prop_url.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_url.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);

            PropertyDescriptor prop_usemap = new PropertyDescriptor("usemap",beanClass,"getUsemap","setUsemap");
            prop_usemap.setDisplayName(resources.getString("HtmlGraphicImage_usemap_DisplayName"));
            prop_usemap.setShortDescription(resources.getString("HtmlGraphicImage_usemap_Description"));
            prop_usemap.setExpert(false);
            prop_usemap.setHidden(false);
            prop_usemap.setPreferred(false);
            attrib = new AttributeDescriptor("usemap",false,null,true);
            prop_usemap.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_usemap.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");
            prop_value.setDisplayName(resources.getString("HtmlGraphicImage_value_DisplayName"));
            prop_value.setShortDescription(resources.getString("HtmlGraphicImage_value_Description"));
            prop_value.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_value.setExpert(false);
            prop_value.setHidden(false);
            prop_value.setPreferred(false);
            attrib = new AttributeDescriptor("value",false,null,true);
            prop_value.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_value.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);
            prop_value.setValue("ignoreIsBound", "true");

            PropertyDescriptor prop_visible = new PropertyDescriptor("visible",beanClass,"isVisible","setVisible");
            prop_visible.setDisplayName(resources.getString("HtmlGraphicImage_visible_DisplayName"));
            prop_visible.setShortDescription(resources.getString("HtmlGraphicImage_visible_Description"));
            prop_visible.setExpert(false);
            prop_visible.setHidden(false);
            prop_visible.setPreferred(false);
            attrib = new AttributeDescriptor("visible",false,"true",true);
            prop_visible.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_visible.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_width = new PropertyDescriptor("width",beanClass,"getWidth","setWidth");
            prop_width.setDisplayName(resources.getString("HtmlGraphicImage_width_DisplayName"));
            prop_width.setShortDescription(resources.getString("HtmlGraphicImage_width_Description"));
            prop_width.setExpert(false);
            prop_width.setHidden(false);
            prop_width.setPreferred(false);
            attrib = new AttributeDescriptor("width",false,null,true);
            prop_width.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_width.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("HtmlGraphicImage_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("HtmlGraphicImage_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("HtmlGraphicImage_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("HtmlGraphicImage_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("HtmlGraphicImage_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("HtmlGraphicImage_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("HtmlGraphicImage_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("HtmlGraphicImage_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("HtmlGraphicImage_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("HtmlGraphicImage_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_ismap = new PropertyDescriptor("ismap",beanClass,"isIsmap","setIsmap");
            prop_ismap.setDisplayName(resources.getString("HtmlGraphicImage_ismap_DisplayName"));
            prop_ismap.setShortDescription(resources.getString("HtmlGraphicImage_ismap_Description"));
            prop_ismap.setExpert(false);
            prop_ismap.setHidden(false);
            prop_ismap.setPreferred(false);
            attrib = new AttributeDescriptor("ismap",false,null,true);
            prop_ismap.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_ismap.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);
            prop_parent.setDisplayName(resources.getString("HtmlGraphicImage_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("HtmlGraphicImage_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("HtmlGraphicImage_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("HtmlGraphicImage_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("HtmlGraphicImage_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("HtmlGraphicImage_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_title = new PropertyDescriptor("title",beanClass,"getTitle","setTitle");
            prop_title.setDisplayName(resources.getString("HtmlGraphicImage_title_DisplayName"));
            prop_title.setShortDescription(resources.getString("HtmlGraphicImage_title_Description"));
            prop_title.setExpert(false);
            prop_title.setHidden(false);
            prop_title.setPreferred(false);
            attrib = new AttributeDescriptor("title",false,null,true);
            prop_title.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_title.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            propDescriptors = new PropertyDescriptor[] {
                prop_alt,
                prop_attributes,
                prop_childCount,
                prop_children,
                prop_dir,
                prop_effect,
                prop_facets,
                prop_family,
                prop_height,
                prop_id,
                prop_ismap,
                prop_lang,
                prop_longdesc,
                prop_mimeType,
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
                prop_title,
                prop_url,
                prop_usemap,
                prop_value,
                prop_visible,
                prop_width,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
