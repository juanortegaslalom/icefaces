package com.icesoft.faces.component.selectinputdate;

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

abstract class SelectInputDateBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.selectinputdate.Bundle-JSF", Locale.getDefault(), SelectInputDateBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>SelectInputDateBeanInfoBase</code>.</p>
     */
    public SelectInputDateBeanInfoBase() {

        beanClass = SelectInputDate.class;
        iconFileName_C16 = "SelectInputDate_C16";
        iconFileName_C32 = "SelectInputDate_C32";
        iconFileName_M16 = "SelectInputDate_M16";
        iconFileName_M32 = "SelectInputDate_M32";

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
        beanDescriptor.setDisplayName(resources.getString("SelectInputDate_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("SelectInputDate_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"selectInputDate");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.TRUE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"selectInputDate");
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
            prop_action.setDisplayName(resources.getString("SelectInputDate_action_DisplayName"));
            prop_action.setShortDescription(resources.getString("SelectInputDate_action_Description"));
            prop_action.setExpert(false);
            prop_action.setHidden(false);
            prop_action.setPreferred(false);
            attrib = new AttributeDescriptor("action",false,null,true);
            prop_action.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_action.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.EVENTS);

            PropertyDescriptor prop_actionListener = new PropertyDescriptor("actionListener",beanClass,"getActionListener","setActionListener");
            prop_actionListener.setDisplayName(resources.getString("SelectInputDate_actionListener_DisplayName"));
            prop_actionListener.setShortDescription(resources.getString("SelectInputDate_actionListener_Description"));
            prop_actionListener.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.MethodBindingPropertyEditor"));
            prop_actionListener.setExpert(false);
            prop_actionListener.setHidden(false);
            prop_actionListener.setPreferred(false);
            attrib = new AttributeDescriptor("actionListener",false,null,true);
            prop_actionListener.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_actionListener.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_autocomplete = new PropertyDescriptor("autocomplete",beanClass,"getAutocomplete","setAutocomplete");
            prop_autocomplete.setDisplayName(resources.getString("SelectInputDate_autocomplete_DisplayName"));
            prop_autocomplete.setShortDescription(resources.getString("SelectInputDate_autocomplete_Description"));
            prop_autocomplete.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_autocomplete.setExpert(false);
            prop_autocomplete.setHidden(false);
            prop_autocomplete.setPreferred(false);
            attrib = new AttributeDescriptor("autocomplete",false,null,true);
            prop_autocomplete.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_autocomplete.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_converter = new PropertyDescriptor("converter",beanClass,"getConverter","setConverter");
            prop_converter.setDisplayName(resources.getString("SelectInputDate_converter_DisplayName"));
            prop_converter.setShortDescription(resources.getString("SelectInputDate_converter_Description"));
            prop_converter.setExpert(false);
            prop_converter.setHidden(false);
            prop_converter.setPreferred(false);
            attrib = new AttributeDescriptor("converter",false,null,true);
            prop_converter.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_converter.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_dir = new PropertyDescriptor("dir",beanClass,"getDir","setDir");
            prop_dir.setDisplayName(resources.getString("SelectInputDate_dir_DisplayName"));
            prop_dir.setShortDescription(resources.getString("SelectInputDate_dir_Description"));
            prop_dir.setExpert(false);
            prop_dir.setHidden(false);
            prop_dir.setPreferred(false);
            attrib = new AttributeDescriptor("dir",false,null,true);
            prop_dir.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_dir.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_disabled = new PropertyDescriptor("disabled",beanClass,"isDisabled","setDisabled");
            prop_disabled.setDisplayName(resources.getString("SelectInputDate_disabled_DisplayName"));
            prop_disabled.setShortDescription(resources.getString("SelectInputDate_disabled_Description"));
            prop_disabled.setExpert(false);
            prop_disabled.setHidden(false);
            prop_disabled.setPreferred(false);
            attrib = new AttributeDescriptor("disabled",false,null,true);
            prop_disabled.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_disabled.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_enabledOnUserRole = new PropertyDescriptor("enabledOnUserRole",beanClass,"getEnabledOnUserRole","setEnabledOnUserRole");
            prop_enabledOnUserRole.setDisplayName(resources.getString("SelectInputDate_enabledOnUserRole_DisplayName"));
            prop_enabledOnUserRole.setShortDescription(resources.getString("SelectInputDate_enabledOnUserRole_Description"));
            prop_enabledOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_enabledOnUserRole.setExpert(false);
            prop_enabledOnUserRole.setHidden(false);
            prop_enabledOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("enabledOnUserRole",false,null,true);
            prop_enabledOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_enabledOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_ADVANCED);

            PropertyDescriptor prop_highlightClass = new PropertyDescriptor("highlightClass",beanClass,"getHighlightClass","setHighlightClass");
            prop_highlightClass.setDisplayName(resources.getString("SelectInputDate_highlightClass_DisplayName"));
            prop_highlightClass.setShortDescription(resources.getString("SelectInputDate_highlightClass_Description"));
            prop_highlightClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_highlightClass.setExpert(false);
            prop_highlightClass.setHidden(false);
            prop_highlightClass.setPreferred(false);
            attrib = new AttributeDescriptor("highlightClass",false,null,true);
            prop_highlightClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_highlightClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_highlightUnit = new PropertyDescriptor("highlightUnit",beanClass,"getHighlightUnit","setHighlightUnit");
            prop_highlightUnit.setDisplayName(resources.getString("SelectInputDate_highlightUnit_DisplayName"));
            prop_highlightUnit.setShortDescription(resources.getString("SelectInputDate_highlightUnit_Description"));
            prop_highlightUnit.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_highlightUnit.setExpert(false);
            prop_highlightUnit.setHidden(false);
            prop_highlightUnit.setPreferred(false);
            attrib = new AttributeDescriptor("highlightUnit",false,null,true);
            prop_highlightUnit.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_highlightUnit.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_highlightValue = new PropertyDescriptor("highlightValue",beanClass,"getHighlightValue","setHighlightValue");
            prop_highlightValue.setDisplayName(resources.getString("SelectInputDate_highlightValue_DisplayName"));
            prop_highlightValue.setShortDescription(resources.getString("SelectInputDate_highlightValue_Description"));
            prop_highlightValue.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_highlightValue.setExpert(false);
            prop_highlightValue.setHidden(false);
            prop_highlightValue.setPreferred(false);
            attrib = new AttributeDescriptor("highlightValue",false,null,true);
            prop_highlightValue.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_highlightValue.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("SelectInputDate_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("SelectInputDate_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_imageDir = new PropertyDescriptor("imageDir",beanClass,"getImageDir","setImageDir");
            prop_imageDir.setDisplayName(resources.getString("SelectInputDate_imageDir_DisplayName"));
            prop_imageDir.setShortDescription(resources.getString("SelectInputDate_imageDir_Description"));
            prop_imageDir.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_imageDir.setExpert(false);
            prop_imageDir.setHidden(false);
            prop_imageDir.setPreferred(false);
            attrib = new AttributeDescriptor("imageDir",false,"\"/xmlhttp/css/xp/css-images/\"",true);
            prop_imageDir.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_imageDir.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_immediate = new PropertyDescriptor("immediate",beanClass,"isImmediate","setImmediate");
            prop_immediate.setDisplayName(resources.getString("SelectInputDate_immediate_DisplayName"));
            prop_immediate.setShortDescription(resources.getString("SelectInputDate_immediate_Description"));
            prop_immediate.setExpert(false);
            prop_immediate.setHidden(false);
            prop_immediate.setPreferred(false);
            attrib = new AttributeDescriptor("immediate",false,null,true);
            prop_immediate.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_immediate.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_inputTitle = new PropertyDescriptor("inputTitle",beanClass,"getInputTitle","setInputTitle");
            prop_inputTitle.setDisplayName(resources.getString("SelectInputDate_inputTitle_DisplayName"));
            prop_inputTitle.setShortDescription(resources.getString("SelectInputDate_inputTitle_Description"));
            prop_inputTitle.setExpert(false);
            prop_inputTitle.setHidden(false);
            prop_inputTitle.setPreferred(false);
            attrib = new AttributeDescriptor("inputTitle",false,null,true);
            prop_inputTitle.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_inputTitle.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_lang = new PropertyDescriptor("lang",beanClass,"getLang","setLang");
            prop_lang.setDisplayName(resources.getString("SelectInputDate_lang_DisplayName"));
            prop_lang.setShortDescription(resources.getString("SelectInputDate_lang_Description"));
            prop_lang.setExpert(false);
            prop_lang.setHidden(false);
            prop_lang.setPreferred(false);
            attrib = new AttributeDescriptor("lang",false,null,true);
            prop_lang.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_lang.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_maxlength = new PropertyDescriptor("maxlength",beanClass,"getMaxlength","setMaxlength");
            prop_maxlength.setDisplayName(resources.getString("SelectInputDate_maxlength_DisplayName"));
            prop_maxlength.setShortDescription(resources.getString("SelectInputDate_maxlength_Description"));
            prop_maxlength.setExpert(false);
            prop_maxlength.setHidden(false);
            prop_maxlength.setPreferred(false);
            attrib = new AttributeDescriptor("maxlength",false,null,true);
            prop_maxlength.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_maxlength.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_navDate = new PropertyDescriptor("navDate",beanClass,"getNavDate","setNavDate");
            prop_navDate.setDisplayName(resources.getString("SelectInputDate_navDate_DisplayName"));
            prop_navDate.setShortDescription(resources.getString("SelectInputDate_navDate_Description"));
            prop_navDate.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.DatePropertyEditor"));
            prop_navDate.setExpert(false);
            prop_navDate.setHidden(true);
            prop_navDate.setPreferred(false);
            prop_navDate.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onclick = new PropertyDescriptor("onclick",beanClass,"getOnclick","setOnclick");
            prop_onclick.setDisplayName(resources.getString("SelectInputDate_onclick_DisplayName"));
            prop_onclick.setShortDescription(resources.getString("SelectInputDate_onclick_Description"));
            prop_onclick.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onclick.setExpert(false);
            prop_onclick.setHidden(true);
            prop_onclick.setPreferred(false);
            attrib = new AttributeDescriptor("onclick",false,null,true);
            prop_onclick.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onclick.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_ondblclick = new PropertyDescriptor("ondblclick",beanClass,"getOndblclick","setOndblclick");
            prop_ondblclick.setDisplayName(resources.getString("SelectInputDate_ondblclick_DisplayName"));
            prop_ondblclick.setShortDescription(resources.getString("SelectInputDate_ondblclick_Description"));
            prop_ondblclick.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_ondblclick.setExpert(false);
            prop_ondblclick.setHidden(true);
            prop_ondblclick.setPreferred(false);
            attrib = new AttributeDescriptor("ondblclick",false,null,true);
            prop_ondblclick.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_ondblclick.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeydown = new PropertyDescriptor("onkeydown",beanClass,"getOnkeydown","setOnkeydown");
            prop_onkeydown.setDisplayName(resources.getString("SelectInputDate_onkeydown_DisplayName"));
            prop_onkeydown.setShortDescription(resources.getString("SelectInputDate_onkeydown_Description"));
            prop_onkeydown.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeydown.setExpert(false);
            prop_onkeydown.setHidden(true);
            prop_onkeydown.setPreferred(false);
            attrib = new AttributeDescriptor("onkeydown",false,null,true);
            prop_onkeydown.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeydown.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeypress = new PropertyDescriptor("onkeypress",beanClass,"getOnkeypress","setOnkeypress");
            prop_onkeypress.setDisplayName(resources.getString("SelectInputDate_onkeypress_DisplayName"));
            prop_onkeypress.setShortDescription(resources.getString("SelectInputDate_onkeypress_Description"));
            prop_onkeypress.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeypress.setExpert(false);
            prop_onkeypress.setHidden(true);
            prop_onkeypress.setPreferred(false);
            attrib = new AttributeDescriptor("onkeypress",false,null,true);
            prop_onkeypress.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeypress.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeyup = new PropertyDescriptor("onkeyup",beanClass,"getOnkeyup","setOnkeyup");
            prop_onkeyup.setDisplayName(resources.getString("SelectInputDate_onkeyup_DisplayName"));
            prop_onkeyup.setShortDescription(resources.getString("SelectInputDate_onkeyup_Description"));
            prop_onkeyup.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeyup.setExpert(false);
            prop_onkeyup.setHidden(true);
            prop_onkeyup.setPreferred(false);
            attrib = new AttributeDescriptor("onkeyup",false,null,true);
            prop_onkeyup.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeyup.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmousedown = new PropertyDescriptor("onmousedown",beanClass,"getOnmousedown","setOnmousedown");
            prop_onmousedown.setDisplayName(resources.getString("SelectInputDate_onmousedown_DisplayName"));
            prop_onmousedown.setShortDescription(resources.getString("SelectInputDate_onmousedown_Description"));
            prop_onmousedown.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmousedown.setExpert(false);
            prop_onmousedown.setHidden(true);
            prop_onmousedown.setPreferred(false);
            attrib = new AttributeDescriptor("onmousedown",false,null,true);
            prop_onmousedown.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousedown.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmousemove = new PropertyDescriptor("onmousemove",beanClass,"getOnmousemove","setOnmousemove");
            prop_onmousemove.setDisplayName(resources.getString("SelectInputDate_onmousemove_DisplayName"));
            prop_onmousemove.setShortDescription(resources.getString("SelectInputDate_onmousemove_Description"));
            prop_onmousemove.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmousemove.setExpert(false);
            prop_onmousemove.setHidden(true);
            prop_onmousemove.setPreferred(false);
            attrib = new AttributeDescriptor("onmousemove",false,null,true);
            prop_onmousemove.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousemove.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseout = new PropertyDescriptor("onmouseout",beanClass,"getOnmouseout","setOnmouseout");
            prop_onmouseout.setDisplayName(resources.getString("SelectInputDate_onmouseout_DisplayName"));
            prop_onmouseout.setShortDescription(resources.getString("SelectInputDate_onmouseout_Description"));
            prop_onmouseout.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseout.setExpert(false);
            prop_onmouseout.setHidden(true);
            prop_onmouseout.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseout",false,null,true);
            prop_onmouseout.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseout.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseover = new PropertyDescriptor("onmouseover",beanClass,"getOnmouseover","setOnmouseover");
            prop_onmouseover.setDisplayName(resources.getString("SelectInputDate_onmouseover_DisplayName"));
            prop_onmouseover.setShortDescription(resources.getString("SelectInputDate_onmouseover_Description"));
            prop_onmouseover.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseover.setExpert(false);
            prop_onmouseover.setHidden(true);
            prop_onmouseover.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseover",false,null,true);
            prop_onmouseover.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseover.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseup = new PropertyDescriptor("onmouseup",beanClass,"getOnmouseup","setOnmouseup");
            prop_onmouseup.setDisplayName(resources.getString("SelectInputDate_onmouseup_DisplayName"));
            prop_onmouseup.setShortDescription(resources.getString("SelectInputDate_onmouseup_Description"));
            prop_onmouseup.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseup.setExpert(false);
            prop_onmouseup.setHidden(true);
            prop_onmouseup.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseup",false,null,true);
            prop_onmouseup.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseup.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_partialSubmit = new PropertyDescriptor("partialSubmit",beanClass,"isPartialSubmit","setPartialSubmit");
            prop_partialSubmit.setDisplayName(resources.getString("SelectInputDate_partialSubmit_DisplayName"));
            prop_partialSubmit.setShortDescription(resources.getString("SelectInputDate_partialSubmit_Description"));
            prop_partialSubmit.setExpert(false);
            prop_partialSubmit.setHidden(false);
            prop_partialSubmit.setPreferred(false);
            attrib = new AttributeDescriptor("partialSubmit",false,"true",true);
            prop_partialSubmit.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_partialSubmit.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_popupDateFormat = new PropertyDescriptor("popupDateFormat",beanClass,"getPopupDateFormat","setPopupDateFormat");
            prop_popupDateFormat.setDisplayName(resources.getString("SelectInputDate_popupDateFormat_DisplayName"));
            prop_popupDateFormat.setShortDescription(resources.getString("SelectInputDate_popupDateFormat_Description"));
            prop_popupDateFormat.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_popupDateFormat.setExpert(false);
            prop_popupDateFormat.setHidden(false);
            prop_popupDateFormat.setPreferred(false);
            attrib = new AttributeDescriptor("popupDateFormat",false,"\"MM/dd/yyyy\"",true);
            prop_popupDateFormat.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_popupDateFormat.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_readonly = new PropertyDescriptor("readonly",beanClass,"isReadonly","setReadonly");
            prop_readonly.setDisplayName(resources.getString("SelectInputDate_readonly_DisplayName"));
            prop_readonly.setShortDescription(resources.getString("SelectInputDate_readonly_Description"));
            prop_readonly.setExpert(false);
            prop_readonly.setHidden(false);
            prop_readonly.setPreferred(false);
            attrib = new AttributeDescriptor("readonly",false,null,true);
            prop_readonly.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_readonly.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_renderAsPopup = new PropertyDescriptor("renderAsPopup",beanClass,"isRenderAsPopup","setRenderAsPopup");
            prop_renderAsPopup.setDisplayName(resources.getString("SelectInputDate_renderAsPopup_DisplayName"));
            prop_renderAsPopup.setShortDescription(resources.getString("SelectInputDate_renderAsPopup_Description"));
            prop_renderAsPopup.setExpert(false);
            prop_renderAsPopup.setHidden(false);
            prop_renderAsPopup.setPreferred(false);
            attrib = new AttributeDescriptor("renderAsPopup",false,null,true);
            prop_renderAsPopup.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderAsPopup.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_renderMonthAsDropdown = new PropertyDescriptor("renderMonthAsDropdown",beanClass,"isRenderMonthAsDropdown","setRenderMonthAsDropdown");
            prop_renderMonthAsDropdown.setDisplayName(resources.getString("SelectInputDate_renderMonthAsDropdown_DisplayName"));
            prop_renderMonthAsDropdown.setShortDescription(resources.getString("SelectInputDate_renderMonthAsDropdown_Description"));
            prop_renderMonthAsDropdown.setExpert(false);
            prop_renderMonthAsDropdown.setHidden(false);
            prop_renderMonthAsDropdown.setPreferred(false);
            attrib = new AttributeDescriptor("renderMonthAsDropdown",false,null,true);
            prop_renderMonthAsDropdown.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderMonthAsDropdown.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_renderWeekNumbers = new PropertyDescriptor("renderWeekNumbers",beanClass,"isRenderWeekNumbers","setRenderWeekNumbers");
            prop_renderWeekNumbers.setDisplayName(resources.getString("SelectInputDate_renderWeekNumbers_DisplayName"));
            prop_renderWeekNumbers.setShortDescription(resources.getString("SelectInputDate_renderWeekNumbers_Description"));
            prop_renderWeekNumbers.setExpert(false);
            prop_renderWeekNumbers.setHidden(false);
            prop_renderWeekNumbers.setPreferred(false);
            attrib = new AttributeDescriptor("renderWeekNumbers",false,null,true);
            prop_renderWeekNumbers.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderWeekNumbers.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_renderYearAsDropdown = new PropertyDescriptor("renderYearAsDropdown",beanClass,"isRenderYearAsDropdown","setRenderYearAsDropdown");
            prop_renderYearAsDropdown.setDisplayName(resources.getString("SelectInputDate_renderYearAsDropdown_DisplayName"));
            prop_renderYearAsDropdown.setShortDescription(resources.getString("SelectInputDate_renderYearAsDropdown_Description"));
            prop_renderYearAsDropdown.setExpert(false);
            prop_renderYearAsDropdown.setHidden(false);
            prop_renderYearAsDropdown.setPreferred(false);
            attrib = new AttributeDescriptor("renderYearAsDropdown",false,null,true);
            prop_renderYearAsDropdown.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderYearAsDropdown.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("SelectInputDate_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("SelectInputDate_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");
            prop_renderedOnUserRole.setDisplayName(resources.getString("SelectInputDate_renderedOnUserRole_DisplayName"));
            prop_renderedOnUserRole.setShortDescription(resources.getString("SelectInputDate_renderedOnUserRole_Description"));
            prop_renderedOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_renderedOnUserRole.setExpert(false);
            prop_renderedOnUserRole.setHidden(false);
            prop_renderedOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("renderedOnUserRole",false,null,true);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_required = new PropertyDescriptor("required",beanClass,"isRequired","setRequired");
            prop_required.setDisplayName(resources.getString("SelectInputDate_required_DisplayName"));
            prop_required.setShortDescription(resources.getString("SelectInputDate_required_Description"));
            prop_required.setExpert(false);
            prop_required.setHidden(false);
            prop_required.setPreferred(false);
            attrib = new AttributeDescriptor("required",false,null,true);
            prop_required.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_required.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);

            PropertyDescriptor prop_requiredMessage = new PropertyDescriptor("requiredMessage",beanClass,"getRequiredMessage","setRequiredMessage");
            prop_requiredMessage.setDisplayName(resources.getString("SelectInputDate_requiredMessage_DisplayName"));
            prop_requiredMessage.setShortDescription(resources.getString("SelectInputDate_requiredMessage_Description"));
            prop_requiredMessage.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_requiredMessage.setExpert(false);
            prop_requiredMessage.setHidden(false);
            prop_requiredMessage.setPreferred(false);
            attrib = new AttributeDescriptor("requiredMessage",false,null,true);
            prop_requiredMessage.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_requiredMessage.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");
            prop_style.setDisplayName(resources.getString("SelectInputDate_style_DisplayName"));
            prop_style.setShortDescription(resources.getString("SelectInputDate_style_Description"));
            prop_style.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.css.CssStylePropertyEditor"));
            prop_style.setExpert(false);
            prop_style.setHidden(false);
            prop_style.setPreferred(false);
            attrib = new AttributeDescriptor("style",false,null,true);
            prop_style.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_style.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("SelectInputDate_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("SelectInputDate_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_tabindex = new PropertyDescriptor("tabindex",beanClass,"getTabindex","setTabindex");
            prop_tabindex.setDisplayName(resources.getString("SelectInputDate_tabindex_DisplayName"));
            prop_tabindex.setShortDescription(resources.getString("SelectInputDate_tabindex_Description"));
            prop_tabindex.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.IntegerPropertyEditor"));
            prop_tabindex.setExpert(false);
            prop_tabindex.setHidden(false);
            prop_tabindex.setPreferred(false);
            attrib = new AttributeDescriptor("tabindex",false,null,true);
            prop_tabindex.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_tabindex.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_tabindex.setValue("maxValue", new Integer(Short.MAX_VALUE));
            prop_tabindex.setValue("minValue", new Integer(0));

            PropertyDescriptor prop_title = new PropertyDescriptor("title",beanClass,"getTitle","setTitle");
            prop_title.setDisplayName(resources.getString("SelectInputDate_title_DisplayName"));
            prop_title.setShortDescription(resources.getString("SelectInputDate_title_Description"));
            prop_title.setExpert(false);
            prop_title.setHidden(false);
            prop_title.setPreferred(false);
            attrib = new AttributeDescriptor("title",false,null,true);
            prop_title.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_title.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_validator = new PropertyDescriptor("validator",beanClass,"getValidator","setValidator");
            prop_validator.setDisplayName(resources.getString("SelectInputDate_validator_DisplayName"));
            prop_validator.setShortDescription(resources.getString("SelectInputDate_validator_Description"));
            prop_validator.setExpert(false);
            prop_validator.setHidden(false);
            prop_validator.setPreferred(false);
            attrib = new AttributeDescriptor("validator",false,null,true);
            prop_validator.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_validator.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");
            prop_value.setDisplayName(resources.getString("SelectInputDate_value_DisplayName"));
            prop_value.setShortDescription(resources.getString("SelectInputDate_value_Description"));
            prop_value.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.faces.dt.std.ValueBindingPropertyEditor"));
            prop_value.setExpert(false);
            prop_value.setHidden(false);
            prop_value.setPreferred(false);
            attrib = new AttributeDescriptor("value",false,null,true);
            prop_value.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_value.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);
            prop_value.setValue("ignoreIsBound", "true");

            PropertyDescriptor prop_valueChangeListener = new PropertyDescriptor("valueChangeListener",beanClass,"getValueChangeListener","setValueChangeListener");
            prop_valueChangeListener.setDisplayName(resources.getString("SelectInputDate_valueChangeListener_DisplayName"));
            prop_valueChangeListener.setShortDescription(resources.getString("SelectInputDate_valueChangeListener_Description"));
            prop_valueChangeListener.setExpert(false);
            prop_valueChangeListener.setHidden(false);
            prop_valueChangeListener.setPreferred(false);
            attrib = new AttributeDescriptor("valueChangeListener",false,null,true);
            prop_valueChangeListener.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_valueChangeListener.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);

            PropertyDescriptor prop_visible = new PropertyDescriptor("visible",beanClass,"isVisible","setVisible");
            prop_visible.setDisplayName(resources.getString("SelectInputDate_visible_DisplayName"));
            prop_visible.setShortDescription(resources.getString("SelectInputDate_visible_Description"));
            prop_visible.setExpert(false);
            prop_visible.setHidden(false);
            prop_visible.setPreferred(false);
            attrib = new AttributeDescriptor("visible",false,"true",true);
            prop_visible.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_visible.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("SelectInputDate_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("SelectInputDate_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("SelectInputDate_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("SelectInputDate_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("SelectInputDate_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("SelectInputDate_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_converterMessage = new PropertyDescriptor("converterMessage",beanClass,"getConverterMessage","setConverterMessage");
            prop_converterMessage.setDisplayName(resources.getString("SelectInputDate_converterMessage_DisplayName"));
            prop_converterMessage.setShortDescription(resources.getString("SelectInputDate_converterMessage_Description"));
            prop_converterMessage.setExpert(false);
            prop_converterMessage.setHidden(false);
            prop_converterMessage.setPreferred(false);
            attrib = new AttributeDescriptor("converterMessage",false,null,true);
            prop_converterMessage.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_converterMessage.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("SelectInputDate_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("SelectInputDate_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("SelectInputDate_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("SelectInputDate_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_localValue = new PropertyDescriptor("localValue",beanClass,"getLocalValue",null);
            prop_localValue.setDisplayName(resources.getString("SelectInputDate_localValue_DisplayName"));
            prop_localValue.setShortDescription(resources.getString("SelectInputDate_localValue_Description"));
            prop_localValue.setExpert(false);
            prop_localValue.setHidden(true);
            prop_localValue.setPreferred(false);
            prop_localValue.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_localValueSet = new PropertyDescriptor("localValueSet",beanClass,"isLocalValueSet","setLocalValueSet");
            prop_localValueSet.setDisplayName(resources.getString("SelectInputDate_localValueSet_DisplayName"));
            prop_localValueSet.setShortDescription(resources.getString("SelectInputDate_localValueSet_Description"));
            prop_localValueSet.setExpert(false);
            prop_localValueSet.setHidden(true);
            prop_localValueSet.setPreferred(false);
            prop_localValueSet.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);
            prop_parent.setDisplayName(resources.getString("SelectInputDate_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("SelectInputDate_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("SelectInputDate_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("SelectInputDate_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("SelectInputDate_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("SelectInputDate_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_submittedValue = new PropertyDescriptor("submittedValue",beanClass,"getSubmittedValue","setSubmittedValue");
            prop_submittedValue.setDisplayName(resources.getString("SelectInputDate_submittedValue_DisplayName"));
            prop_submittedValue.setShortDescription(resources.getString("SelectInputDate_submittedValue_Description"));
            prop_submittedValue.setExpert(false);
            prop_submittedValue.setHidden(true);
            prop_submittedValue.setPreferred(false);
            prop_submittedValue.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_validatorMessage = new PropertyDescriptor("validatorMessage",beanClass,"getValidatorMessage","setValidatorMessage");
            prop_validatorMessage.setDisplayName(resources.getString("SelectInputDate_validatorMessage_DisplayName"));
            prop_validatorMessage.setShortDescription(resources.getString("SelectInputDate_validatorMessage_Description"));
            prop_validatorMessage.setExpert(false);
            prop_validatorMessage.setHidden(false);
            prop_validatorMessage.setPreferred(false);
            attrib = new AttributeDescriptor("validatorMessage",false,null,true);
            prop_validatorMessage.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_validatorMessage.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            propDescriptors = new PropertyDescriptor[] {
                prop_action,
                prop_actionListener,
                prop_attributes,
                prop_autocomplete,
                prop_childCount,
                prop_children,
                prop_converter,
                prop_converterMessage,
                prop_dir,
                prop_disabled,
                prop_enabledOnUserRole,
                prop_facets,
                prop_family,
                prop_highlightClass,
                prop_highlightUnit,
                prop_highlightValue,
                prop_id,
                prop_imageDir,
                prop_immediate,
                prop_inputTitle,
                prop_lang,
                prop_localValue,
                prop_localValueSet,
                prop_maxlength,
                prop_navDate,
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
                prop_partialSubmit,
                prop_popupDateFormat,
                prop_readonly,
                prop_renderAsPopup,
                prop_renderMonthAsDropdown,
                prop_renderWeekNumbers,
                prop_renderYearAsDropdown,
                prop_rendered,
                prop_renderedOnUserRole,
                prop_rendererType,
                prop_rendersChildren,
                prop_required,
                prop_requiredMessage,
                prop_style,
                prop_styleClass,
                prop_submittedValue,
                prop_tabindex,
                prop_title,
                prop_validator,
                prop_validatorMessage,
                prop_value,
                prop_valueChangeListener,
                prop_visible,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
