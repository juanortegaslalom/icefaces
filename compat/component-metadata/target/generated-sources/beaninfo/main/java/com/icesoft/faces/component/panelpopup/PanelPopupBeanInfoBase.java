package com.icesoft.faces.component.panelpopup;

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

abstract class PanelPopupBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.panelpopup.Bundle-JSF", Locale.getDefault(), PanelPopupBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>PanelPopupBeanInfoBase</code>.</p>
     */
    public PanelPopupBeanInfoBase() {

        beanClass = PanelPopup.class;
        iconFileName_C16 = "PanelPopup_C16";
        iconFileName_C32 = "PanelPopup_C32";
        iconFileName_M16 = "PanelPopup_M16";
        iconFileName_M32 = "PanelPopup_M32";

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
        beanDescriptor.setDisplayName(resources.getString("PanelPopup_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("PanelPopup_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"panelPopup");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.TRUE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"panelPopup");
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

            PropertyDescriptor prop_autoCentre = new PropertyDescriptor("autoCentre",beanClass,"isAutoCentre","setAutoCentre");
            prop_autoCentre.setDisplayName(resources.getString("PanelPopup_autoCentre_DisplayName"));
            prop_autoCentre.setShortDescription(resources.getString("PanelPopup_autoCentre_Description"));
            prop_autoCentre.setExpert(false);
            prop_autoCentre.setHidden(false);
            prop_autoCentre.setPreferred(false);
            attrib = new AttributeDescriptor("autoCentre",false,"false",true);
            prop_autoCentre.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_autoCentre.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_autoPosition = new PropertyDescriptor("autoPosition",beanClass,"getAutoPosition","setAutoPosition");
            prop_autoPosition.setDisplayName(resources.getString("PanelPopup_autoPosition_DisplayName"));
            prop_autoPosition.setShortDescription(resources.getString("PanelPopup_autoPosition_Description"));
            prop_autoPosition.setExpert(false);
            prop_autoPosition.setHidden(false);
            prop_autoPosition.setPreferred(false);
            attrib = new AttributeDescriptor("autoPosition",false,null,true);
            prop_autoPosition.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_autoPosition.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_clientOnly = new PropertyDescriptor("clientOnly",beanClass,"isClientOnly","setClientOnly");
            prop_clientOnly.setDisplayName(resources.getString("PanelPopup_clientOnly_DisplayName"));
            prop_clientOnly.setShortDescription(resources.getString("PanelPopup_clientOnly_Description"));
            prop_clientOnly.setExpert(false);
            prop_clientOnly.setHidden(false);
            prop_clientOnly.setPreferred(false);
            attrib = new AttributeDescriptor("clientOnly",false,"false",true);
            prop_clientOnly.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_clientOnly.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_draggable = new PropertyDescriptor("draggable",beanClass,"getDraggable","setDraggable");
            prop_draggable.setDisplayName(resources.getString("PanelPopup_draggable_DisplayName"));
            prop_draggable.setShortDescription(resources.getString("PanelPopup_draggable_Description"));
            prop_draggable.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_draggable.setExpert(false);
            prop_draggable.setHidden(false);
            prop_draggable.setPreferred(false);
            attrib = new AttributeDescriptor("draggable",false,null,true);
            prop_draggable.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_draggable.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_effect = new PropertyDescriptor("effect",beanClass,"getEffect","setEffect");
            prop_effect.setDisplayName(resources.getString("PanelPopup_effect_DisplayName"));
            prop_effect.setShortDescription(resources.getString("PanelPopup_effect_Description"));
            prop_effect.setExpert(false);
            prop_effect.setHidden(false);
            prop_effect.setPreferred(false);
            attrib = new AttributeDescriptor("effect",false,null,true);
            prop_effect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_effect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("PanelPopup_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("PanelPopup_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_modal = new PropertyDescriptor("modal",beanClass,"isModal","setModal");
            prop_modal.setDisplayName(resources.getString("PanelPopup_modal_DisplayName"));
            prop_modal.setShortDescription(resources.getString("PanelPopup_modal_Description"));
            prop_modal.setExpert(false);
            prop_modal.setHidden(false);
            prop_modal.setPreferred(false);
            attrib = new AttributeDescriptor("modal",false,"false",true);
            prop_modal.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_modal.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onclick = new PropertyDescriptor("onclick",beanClass,"getOnclick","setOnclick");
            prop_onclick.setDisplayName(resources.getString("PanelPopup_onclick_DisplayName"));
            prop_onclick.setShortDescription(resources.getString("PanelPopup_onclick_Description"));
            prop_onclick.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onclick.setExpert(false);
            prop_onclick.setHidden(true);
            prop_onclick.setPreferred(false);
            attrib = new AttributeDescriptor("onclick",false,null,true);
            prop_onclick.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onclick.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onclickeffect = new PropertyDescriptor("onclickeffect",beanClass,"getOnclickeffect","setOnclickeffect");
            prop_onclickeffect.setDisplayName(resources.getString("PanelPopup_onclickeffect_DisplayName"));
            prop_onclickeffect.setShortDescription(resources.getString("PanelPopup_onclickeffect_Description"));
            prop_onclickeffect.setExpert(false);
            prop_onclickeffect.setHidden(true);
            prop_onclickeffect.setPreferred(false);
            attrib = new AttributeDescriptor("onclickeffect",false,null,true);
            prop_onclickeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onclickeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_ondblclick = new PropertyDescriptor("ondblclick",beanClass,"getOndblclick","setOndblclick");
            prop_ondblclick.setDisplayName(resources.getString("PanelPopup_ondblclick_DisplayName"));
            prop_ondblclick.setShortDescription(resources.getString("PanelPopup_ondblclick_Description"));
            prop_ondblclick.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_ondblclick.setExpert(false);
            prop_ondblclick.setHidden(true);
            prop_ondblclick.setPreferred(false);
            attrib = new AttributeDescriptor("ondblclick",false,null,true);
            prop_ondblclick.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_ondblclick.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_ondblclickeffect = new PropertyDescriptor("ondblclickeffect",beanClass,"getOndblclickeffect","setOndblclickeffect");
            prop_ondblclickeffect.setDisplayName(resources.getString("PanelPopup_ondblclickeffect_DisplayName"));
            prop_ondblclickeffect.setShortDescription(resources.getString("PanelPopup_ondblclickeffect_Description"));
            prop_ondblclickeffect.setExpert(false);
            prop_ondblclickeffect.setHidden(true);
            prop_ondblclickeffect.setPreferred(false);
            attrib = new AttributeDescriptor("ondblclickeffect",false,null,true);
            prop_ondblclickeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_ondblclickeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onkeydown = new PropertyDescriptor("onkeydown",beanClass,"getOnkeydown","setOnkeydown");
            prop_onkeydown.setDisplayName(resources.getString("PanelPopup_onkeydown_DisplayName"));
            prop_onkeydown.setShortDescription(resources.getString("PanelPopup_onkeydown_Description"));
            prop_onkeydown.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeydown.setExpert(false);
            prop_onkeydown.setHidden(true);
            prop_onkeydown.setPreferred(false);
            attrib = new AttributeDescriptor("onkeydown",false,null,true);
            prop_onkeydown.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeydown.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeydowneffect = new PropertyDescriptor("onkeydowneffect",beanClass,"getOnkeydowneffect","setOnkeydowneffect");
            prop_onkeydowneffect.setDisplayName(resources.getString("PanelPopup_onkeydowneffect_DisplayName"));
            prop_onkeydowneffect.setShortDescription(resources.getString("PanelPopup_onkeydowneffect_Description"));
            prop_onkeydowneffect.setExpert(false);
            prop_onkeydowneffect.setHidden(true);
            prop_onkeydowneffect.setPreferred(false);
            attrib = new AttributeDescriptor("onkeydowneffect",false,null,true);
            prop_onkeydowneffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeydowneffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onkeypress = new PropertyDescriptor("onkeypress",beanClass,"getOnkeypress","setOnkeypress");
            prop_onkeypress.setDisplayName(resources.getString("PanelPopup_onkeypress_DisplayName"));
            prop_onkeypress.setShortDescription(resources.getString("PanelPopup_onkeypress_Description"));
            prop_onkeypress.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeypress.setExpert(false);
            prop_onkeypress.setHidden(true);
            prop_onkeypress.setPreferred(false);
            attrib = new AttributeDescriptor("onkeypress",false,null,true);
            prop_onkeypress.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeypress.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeypresseffect = new PropertyDescriptor("onkeypresseffect",beanClass,"getOnkeypresseffect","setOnkeypresseffect");
            prop_onkeypresseffect.setDisplayName(resources.getString("PanelPopup_onkeypresseffect_DisplayName"));
            prop_onkeypresseffect.setShortDescription(resources.getString("PanelPopup_onkeypresseffect_Description"));
            prop_onkeypresseffect.setExpert(false);
            prop_onkeypresseffect.setHidden(true);
            prop_onkeypresseffect.setPreferred(false);
            attrib = new AttributeDescriptor("onkeypresseffect",false,null,true);
            prop_onkeypresseffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeypresseffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onkeyup = new PropertyDescriptor("onkeyup",beanClass,"getOnkeyup","setOnkeyup");
            prop_onkeyup.setDisplayName(resources.getString("PanelPopup_onkeyup_DisplayName"));
            prop_onkeyup.setShortDescription(resources.getString("PanelPopup_onkeyup_Description"));
            prop_onkeyup.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onkeyup.setExpert(false);
            prop_onkeyup.setHidden(true);
            prop_onkeyup.setPreferred(false);
            attrib = new AttributeDescriptor("onkeyup",false,null,true);
            prop_onkeyup.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeyup.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onkeyupeffect = new PropertyDescriptor("onkeyupeffect",beanClass,"getOnkeyupeffect","setOnkeyupeffect");
            prop_onkeyupeffect.setDisplayName(resources.getString("PanelPopup_onkeyupeffect_DisplayName"));
            prop_onkeyupeffect.setShortDescription(resources.getString("PanelPopup_onkeyupeffect_Description"));
            prop_onkeyupeffect.setExpert(false);
            prop_onkeyupeffect.setHidden(true);
            prop_onkeyupeffect.setPreferred(false);
            attrib = new AttributeDescriptor("onkeyupeffect",false,null,true);
            prop_onkeyupeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onkeyupeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmousedown = new PropertyDescriptor("onmousedown",beanClass,"getOnmousedown","setOnmousedown");
            prop_onmousedown.setDisplayName(resources.getString("PanelPopup_onmousedown_DisplayName"));
            prop_onmousedown.setShortDescription(resources.getString("PanelPopup_onmousedown_Description"));
            prop_onmousedown.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmousedown.setExpert(false);
            prop_onmousedown.setHidden(true);
            prop_onmousedown.setPreferred(false);
            attrib = new AttributeDescriptor("onmousedown",false,null,true);
            prop_onmousedown.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousedown.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmousedowneffect = new PropertyDescriptor("onmousedowneffect",beanClass,"getOnmousedowneffect","setOnmousedowneffect");
            prop_onmousedowneffect.setDisplayName(resources.getString("PanelPopup_onmousedowneffect_DisplayName"));
            prop_onmousedowneffect.setShortDescription(resources.getString("PanelPopup_onmousedowneffect_Description"));
            prop_onmousedowneffect.setExpert(false);
            prop_onmousedowneffect.setHidden(true);
            prop_onmousedowneffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmousedowneffect",false,null,true);
            prop_onmousedowneffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousedowneffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmousemove = new PropertyDescriptor("onmousemove",beanClass,"getOnmousemove","setOnmousemove");
            prop_onmousemove.setDisplayName(resources.getString("PanelPopup_onmousemove_DisplayName"));
            prop_onmousemove.setShortDescription(resources.getString("PanelPopup_onmousemove_Description"));
            prop_onmousemove.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmousemove.setExpert(false);
            prop_onmousemove.setHidden(true);
            prop_onmousemove.setPreferred(false);
            attrib = new AttributeDescriptor("onmousemove",false,null,true);
            prop_onmousemove.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousemove.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmousemoveeffect = new PropertyDescriptor("onmousemoveeffect",beanClass,"getOnmousemoveeffect","setOnmousemoveeffect");
            prop_onmousemoveeffect.setDisplayName(resources.getString("PanelPopup_onmousemoveeffect_DisplayName"));
            prop_onmousemoveeffect.setShortDescription(resources.getString("PanelPopup_onmousemoveeffect_Description"));
            prop_onmousemoveeffect.setExpert(false);
            prop_onmousemoveeffect.setHidden(true);
            prop_onmousemoveeffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmousemoveeffect",false,null,true);
            prop_onmousemoveeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmousemoveeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmouseout = new PropertyDescriptor("onmouseout",beanClass,"getOnmouseout","setOnmouseout");
            prop_onmouseout.setDisplayName(resources.getString("PanelPopup_onmouseout_DisplayName"));
            prop_onmouseout.setShortDescription(resources.getString("PanelPopup_onmouseout_Description"));
            prop_onmouseout.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseout.setExpert(false);
            prop_onmouseout.setHidden(true);
            prop_onmouseout.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseout",false,null,true);
            prop_onmouseout.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseout.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseouteffect = new PropertyDescriptor("onmouseouteffect",beanClass,"getOnmouseouteffect","setOnmouseouteffect");
            prop_onmouseouteffect.setDisplayName(resources.getString("PanelPopup_onmouseouteffect_DisplayName"));
            prop_onmouseouteffect.setShortDescription(resources.getString("PanelPopup_onmouseouteffect_Description"));
            prop_onmouseouteffect.setExpert(false);
            prop_onmouseouteffect.setHidden(true);
            prop_onmouseouteffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseouteffect",false,null,true);
            prop_onmouseouteffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseouteffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmouseover = new PropertyDescriptor("onmouseover",beanClass,"getOnmouseover","setOnmouseover");
            prop_onmouseover.setDisplayName(resources.getString("PanelPopup_onmouseover_DisplayName"));
            prop_onmouseover.setShortDescription(resources.getString("PanelPopup_onmouseover_Description"));
            prop_onmouseover.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseover.setExpert(false);
            prop_onmouseover.setHidden(true);
            prop_onmouseover.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseover",false,null,true);
            prop_onmouseover.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseover.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseovereffect = new PropertyDescriptor("onmouseovereffect",beanClass,"getOnmouseovereffect","setOnmouseovereffect");
            prop_onmouseovereffect.setDisplayName(resources.getString("PanelPopup_onmouseovereffect_DisplayName"));
            prop_onmouseovereffect.setShortDescription(resources.getString("PanelPopup_onmouseovereffect_Description"));
            prop_onmouseovereffect.setExpert(false);
            prop_onmouseovereffect.setHidden(true);
            prop_onmouseovereffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseovereffect",false,null,true);
            prop_onmouseovereffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseovereffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_onmouseup = new PropertyDescriptor("onmouseup",beanClass,"getOnmouseup","setOnmouseup");
            prop_onmouseup.setDisplayName(resources.getString("PanelPopup_onmouseup_DisplayName"));
            prop_onmouseup.setShortDescription(resources.getString("PanelPopup_onmouseup_Description"));
            prop_onmouseup.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.JavaScriptPropertyEditor"));
            prop_onmouseup.setExpert(false);
            prop_onmouseup.setHidden(true);
            prop_onmouseup.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseup",false,null,true);
            prop_onmouseup.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseup.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.JAVASCRIPT);

            PropertyDescriptor prop_onmouseupeffect = new PropertyDescriptor("onmouseupeffect",beanClass,"getOnmouseupeffect","setOnmouseupeffect");
            prop_onmouseupeffect.setDisplayName(resources.getString("PanelPopup_onmouseupeffect_DisplayName"));
            prop_onmouseupeffect.setShortDescription(resources.getString("PanelPopup_onmouseupeffect_Description"));
            prop_onmouseupeffect.setExpert(false);
            prop_onmouseupeffect.setHidden(true);
            prop_onmouseupeffect.setPreferred(false);
            attrib = new AttributeDescriptor("onmouseupeffect",false,null,true);
            prop_onmouseupeffect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_onmouseupeffect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_positionOnLoadOnly = new PropertyDescriptor("positionOnLoadOnly",beanClass,"isPositionOnLoadOnly","setPositionOnLoadOnly");
            prop_positionOnLoadOnly.setDisplayName(resources.getString("PanelPopup_positionOnLoadOnly_DisplayName"));
            prop_positionOnLoadOnly.setShortDescription(resources.getString("PanelPopup_positionOnLoadOnly_Description"));
            prop_positionOnLoadOnly.setExpert(false);
            prop_positionOnLoadOnly.setHidden(false);
            prop_positionOnLoadOnly.setPreferred(false);
            attrib = new AttributeDescriptor("positionOnLoadOnly",false,"false",true);
            prop_positionOnLoadOnly.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_positionOnLoadOnly.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("PanelPopup_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("PanelPopup_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");
            prop_renderedOnUserRole.setDisplayName(resources.getString("PanelPopup_renderedOnUserRole_DisplayName"));
            prop_renderedOnUserRole.setShortDescription(resources.getString("PanelPopup_renderedOnUserRole_Description"));
            prop_renderedOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_renderedOnUserRole.setExpert(false);
            prop_renderedOnUserRole.setHidden(false);
            prop_renderedOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("renderedOnUserRole",false,null,true);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_resizable = new PropertyDescriptor("resizable",beanClass,"isResizable","setResizable");
            prop_resizable.setDisplayName(resources.getString("PanelPopup_resizable_DisplayName"));
            prop_resizable.setShortDescription(resources.getString("PanelPopup_resizable_Description"));
            prop_resizable.setExpert(false);
            prop_resizable.setHidden(true);
            prop_resizable.setPreferred(false);
            attrib = new AttributeDescriptor("resizable",false,"false",true);
            prop_resizable.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_resizable.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");
            prop_style.setDisplayName(resources.getString("PanelPopup_style_DisplayName"));
            prop_style.setShortDescription(resources.getString("PanelPopup_style_Description"));
            prop_style.setPropertyEditorClass(loadClass("com.sun.rave.propertyeditors.css.CssStylePropertyEditor"));
            prop_style.setExpert(false);
            prop_style.setHidden(false);
            prop_style.setPreferred(false);
            attrib = new AttributeDescriptor("style",false,null,true);
            prop_style.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_style.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("PanelPopup_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("PanelPopup_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);

            PropertyDescriptor prop_title = new PropertyDescriptor("title",beanClass,"getTitle","setTitle");
            prop_title.setDisplayName(resources.getString("PanelPopup_title_DisplayName"));
            prop_title.setShortDescription(resources.getString("PanelPopup_title_Description"));
            prop_title.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_title.setExpert(false);
            prop_title.setHidden(false);
            prop_title.setPreferred(false);
            attrib = new AttributeDescriptor("title",false,null,true);
            prop_title.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_title.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_visible = new PropertyDescriptor("visible",beanClass,"isVisible","setVisible");
            prop_visible.setDisplayName(resources.getString("PanelPopup_visible_DisplayName"));
            prop_visible.setShortDescription(resources.getString("PanelPopup_visible_Description"));
            prop_visible.setExpert(false);
            prop_visible.setHidden(false);
            prop_visible.setPreferred(false);
            attrib = new AttributeDescriptor("visible",false,"true",true);
            prop_visible.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_visible.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("PanelPopup_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("PanelPopup_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("PanelPopup_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("PanelPopup_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("PanelPopup_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("PanelPopup_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("PanelPopup_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("PanelPopup_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("PanelPopup_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("PanelPopup_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);
            prop_parent.setDisplayName(resources.getString("PanelPopup_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("PanelPopup_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("PanelPopup_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("PanelPopup_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("PanelPopup_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("PanelPopup_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            propDescriptors = new PropertyDescriptor[] {
                prop_attributes,
                prop_autoCentre,
                prop_autoPosition,
                prop_childCount,
                prop_children,
                prop_clientOnly,
                prop_draggable,
                prop_effect,
                prop_facets,
                prop_family,
                prop_id,
                prop_modal,
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
                prop_positionOnLoadOnly,
                prop_rendered,
                prop_renderedOnUserRole,
                prop_rendererType,
                prop_rendersChildren,
                prop_resizable,
                prop_style,
                prop_styleClass,
                prop_title,
                prop_visible,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
