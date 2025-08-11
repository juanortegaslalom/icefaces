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

abstract class RowSelectorBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.ext.Bundle-JSF", Locale.getDefault(), RowSelectorBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>RowSelectorBeanInfoBase</code>.</p>
     */
    public RowSelectorBeanInfoBase() {

        beanClass = RowSelector.class;
        iconFileName_C16 = "RowSelector_C16";
        iconFileName_C32 = "RowSelector_C32";
        iconFileName_M16 = "RowSelector_M16";
        iconFileName_M32 = "RowSelector_M32";

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
        beanDescriptor.setDisplayName(resources.getString("RowSelector_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("RowSelector_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"rowSelector");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.FALSE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"rowSelector");
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

            PropertyDescriptor prop_clickAction = new PropertyDescriptor("clickAction",beanClass,"getClickAction","setClickAction");
            prop_clickAction.setDisplayName(resources.getString("RowSelector_clickAction_DisplayName"));
            prop_clickAction.setShortDescription(resources.getString("RowSelector_clickAction_Description"));
            prop_clickAction.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.MethodBindingPropertyEditor"));
            prop_clickAction.setExpert(false);
            prop_clickAction.setHidden(false);
            prop_clickAction.setPreferred(false);
            attrib = new AttributeDescriptor("clickAction",false,null,true);
            prop_clickAction.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_clickAction.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_clickListener = new PropertyDescriptor("clickListener",beanClass,"getClickListener","setClickListener");
            prop_clickListener.setDisplayName(resources.getString("RowSelector_clickListener_DisplayName"));
            prop_clickListener.setShortDescription(resources.getString("RowSelector_clickListener_Description"));
            prop_clickListener.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.MethodBindingPropertyEditor"));
            prop_clickListener.setExpert(false);
            prop_clickListener.setHidden(false);
            prop_clickListener.setPreferred(false);
            attrib = new AttributeDescriptor("clickListener",false,null,true);
            prop_clickListener.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_clickListener.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_clickedRow = new PropertyDescriptor("clickedRow",beanClass,"getClickedRow","setClickedRow");
            prop_clickedRow.setDisplayName(resources.getString("RowSelector_clickedRow_DisplayName"));
            prop_clickedRow.setShortDescription(resources.getString("RowSelector_clickedRow_Description"));
            prop_clickedRow.setExpert(false);
            prop_clickedRow.setHidden(false);
            prop_clickedRow.setPreferred(false);
            attrib = new AttributeDescriptor("clickedRow",false,"-1",true);
            prop_clickedRow.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_clickedRow.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_dblClickDelay = new PropertyDescriptor("dblClickDelay",beanClass,"getDblClickDelay","setDblClickDelay");
            prop_dblClickDelay.setDisplayName(resources.getString("RowSelector_dblClickDelay_DisplayName"));
            prop_dblClickDelay.setShortDescription(resources.getString("RowSelector_dblClickDelay_Description"));
            prop_dblClickDelay.setExpert(false);
            prop_dblClickDelay.setHidden(false);
            prop_dblClickDelay.setPreferred(false);
            attrib = new AttributeDescriptor("dblClickDelay",false,"200",true);
            prop_dblClickDelay.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_dblClickDelay.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_enhancedMultiple = new PropertyDescriptor("enhancedMultiple",beanClass,"isEnhancedMultiple","setEnhancedMultiple");
            prop_enhancedMultiple.setDisplayName(resources.getString("RowSelector_enhancedMultiple_DisplayName"));
            prop_enhancedMultiple.setShortDescription(resources.getString("RowSelector_enhancedMultiple_Description"));
            prop_enhancedMultiple.setExpert(false);
            prop_enhancedMultiple.setHidden(false);
            prop_enhancedMultiple.setPreferred(false);
            attrib = new AttributeDescriptor("enhancedMultiple",false,"true",true);
            prop_enhancedMultiple.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_enhancedMultiple.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("RowSelector_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("RowSelector_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_immediate = new PropertyDescriptor("immediate",beanClass,"isImmediate","setImmediate");
            prop_immediate.setDisplayName(resources.getString("RowSelector_immediate_DisplayName"));
            prop_immediate.setShortDescription(resources.getString("RowSelector_immediate_Description"));
            prop_immediate.setExpert(false);
            prop_immediate.setHidden(false);
            prop_immediate.setPreferred(false);
            attrib = new AttributeDescriptor("immediate",false,"true",true);
            prop_immediate.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_immediate.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_keyboardNavigationEnabled = new PropertyDescriptor("keyboardNavigationEnabled",beanClass,"isKeyboardNavigationEnabled","setKeyboardNavigationEnabled");
            prop_keyboardNavigationEnabled.setDisplayName(resources.getString("RowSelector_keyboardNavigationEnabled_DisplayName"));
            prop_keyboardNavigationEnabled.setShortDescription(resources.getString("RowSelector_keyboardNavigationEnabled_Description"));
            prop_keyboardNavigationEnabled.setExpert(false);
            prop_keyboardNavigationEnabled.setHidden(false);
            prop_keyboardNavigationEnabled.setPreferred(false);
            attrib = new AttributeDescriptor("keyboardNavigationEnabled",false,"false",true);
            prop_keyboardNavigationEnabled.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_keyboardNavigationEnabled.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_mouseOverClass = new PropertyDescriptor("mouseOverClass",beanClass,"getMouseOverClass","setMouseOverClass");
            prop_mouseOverClass.setDisplayName(resources.getString("RowSelector_mouseOverClass_DisplayName"));
            prop_mouseOverClass.setShortDescription(resources.getString("RowSelector_mouseOverClass_Description"));
            prop_mouseOverClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_mouseOverClass.setExpert(false);
            prop_mouseOverClass.setHidden(false);
            prop_mouseOverClass.setPreferred(false);
            attrib = new AttributeDescriptor("mouseOverClass",false,null,true);
            prop_mouseOverClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_mouseOverClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_multiple = new PropertyDescriptor("multiple",beanClass,"isMultiple","setMultiple");
            prop_multiple.setDisplayName(resources.getString("RowSelector_multiple_DisplayName"));
            prop_multiple.setShortDescription(resources.getString("RowSelector_multiple_Description"));
            prop_multiple.setExpert(false);
            prop_multiple.setHidden(false);
            prop_multiple.setPreferred(false);
            attrib = new AttributeDescriptor("multiple",false,"false",true);
            prop_multiple.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_multiple.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_preStyleOnSelection = new PropertyDescriptor("preStyleOnSelection",beanClass,"isPreStyleOnSelection","setPreStyleOnSelection");
            prop_preStyleOnSelection.setDisplayName(resources.getString("RowSelector_preStyleOnSelection_DisplayName"));
            prop_preStyleOnSelection.setShortDescription(resources.getString("RowSelector_preStyleOnSelection_Description"));
            prop_preStyleOnSelection.setExpert(false);
            prop_preStyleOnSelection.setHidden(false);
            prop_preStyleOnSelection.setPreferred(false);
            attrib = new AttributeDescriptor("preStyleOnSelection",false,"false",true);
            prop_preStyleOnSelection.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_preStyleOnSelection.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("RowSelector_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("RowSelector_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");
            prop_renderedOnUserRole.setDisplayName(resources.getString("RowSelector_renderedOnUserRole_DisplayName"));
            prop_renderedOnUserRole.setShortDescription(resources.getString("RowSelector_renderedOnUserRole_Description"));
            prop_renderedOnUserRole.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_renderedOnUserRole.setExpert(false);
            prop_renderedOnUserRole.setHidden(false);
            prop_renderedOnUserRole.setPreferred(false);
            attrib = new AttributeDescriptor("renderedOnUserRole",false,null,true);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_renderedOnUserRole.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_selectedClass = new PropertyDescriptor("selectedClass",beanClass,"getSelectedClass","setSelectedClass");
            prop_selectedClass.setDisplayName(resources.getString("RowSelector_selectedClass_DisplayName"));
            prop_selectedClass.setShortDescription(resources.getString("RowSelector_selectedClass_Description"));
            prop_selectedClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_selectedClass.setExpert(false);
            prop_selectedClass.setHidden(false);
            prop_selectedClass.setPreferred(false);
            attrib = new AttributeDescriptor("selectedClass",false,null,true);
            prop_selectedClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_selectedClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_selectedMouseOverClass = new PropertyDescriptor("selectedMouseOverClass",beanClass,"getSelectedMouseOverClass","setSelectedMouseOverClass");
            prop_selectedMouseOverClass.setDisplayName(resources.getString("RowSelector_selectedMouseOverClass_DisplayName"));
            prop_selectedMouseOverClass.setShortDescription(resources.getString("RowSelector_selectedMouseOverClass_Description"));
            prop_selectedMouseOverClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_selectedMouseOverClass.setExpert(false);
            prop_selectedMouseOverClass.setHidden(false);
            prop_selectedMouseOverClass.setPreferred(false);
            attrib = new AttributeDescriptor("selectedMouseOverClass",false,null,true);
            prop_selectedMouseOverClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_selectedMouseOverClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_selectionAction = new PropertyDescriptor("selectionAction",beanClass,"getSelectionAction","setSelectionAction");
            prop_selectionAction.setDisplayName(resources.getString("RowSelector_selectionAction_DisplayName"));
            prop_selectionAction.setShortDescription(resources.getString("RowSelector_selectionAction_Description"));
            prop_selectionAction.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.MethodBindingPropertyEditor"));
            prop_selectionAction.setExpert(false);
            prop_selectionAction.setHidden(false);
            prop_selectionAction.setPreferred(false);
            attrib = new AttributeDescriptor("selectionAction",false,null,true);
            prop_selectionAction.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_selectionAction.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_selectionListener = new PropertyDescriptor("selectionListener",beanClass,"getSelectionListener","setSelectionListener");
            prop_selectionListener.setDisplayName(resources.getString("RowSelector_selectionListener_DisplayName"));
            prop_selectionListener.setShortDescription(resources.getString("RowSelector_selectionListener_Description"));
            prop_selectionListener.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.MethodBindingPropertyEditor"));
            prop_selectionListener.setExpert(false);
            prop_selectionListener.setHidden(false);
            prop_selectionListener.setPreferred(false);
            attrib = new AttributeDescriptor("selectionListener",false,null,true);
            prop_selectionListener.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_selectionListener.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_singleRowAutoSelect = new PropertyDescriptor("singleRowAutoSelect",beanClass,"isSingleRowAutoSelect","setSingleRowAutoSelect");
            prop_singleRowAutoSelect.setDisplayName(resources.getString("RowSelector_singleRowAutoSelect_DisplayName"));
            prop_singleRowAutoSelect.setShortDescription(resources.getString("RowSelector_singleRowAutoSelect_Description"));
            prop_singleRowAutoSelect.setExpert(false);
            prop_singleRowAutoSelect.setHidden(false);
            prop_singleRowAutoSelect.setPreferred(false);
            attrib = new AttributeDescriptor("singleRowAutoSelect",false,"false",true);
            prop_singleRowAutoSelect.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_singleRowAutoSelect.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");
            prop_styleClass.setDisplayName(resources.getString("RowSelector_styleClass_DisplayName"));
            prop_styleClass.setShortDescription(resources.getString("RowSelector_styleClass_Description"));
            prop_styleClass.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_styleClass.setExpert(false);
            prop_styleClass.setHidden(false);
            prop_styleClass.setPreferred(false);
            attrib = new AttributeDescriptor("styleClass",false,null,true);
            prop_styleClass.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_styleClass.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_tabindex = new PropertyDescriptor("tabindex",beanClass,"getTabindex","setTabindex");
            prop_tabindex.setDisplayName(resources.getString("RowSelector_tabindex_DisplayName"));
            prop_tabindex.setShortDescription(resources.getString("RowSelector_tabindex_Description"));
            prop_tabindex.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.IntegerPropertyEditor"));
            prop_tabindex.setExpert(false);
            prop_tabindex.setHidden(false);
            prop_tabindex.setPreferred(false);
            attrib = new AttributeDescriptor("tabindex",false,null,true);
            prop_tabindex.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_tabindex.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ADVANCED);
            prop_tabindex.setValue("maxValue", new Integer(Short.MAX_VALUE));
            prop_tabindex.setValue("minValue", new Integer(0));

            PropertyDescriptor prop_toggleOnClick = new PropertyDescriptor("toggleOnClick",beanClass,"isToggleOnClick","setToggleOnClick");
            prop_toggleOnClick.setDisplayName(resources.getString("RowSelector_toggleOnClick_DisplayName"));
            prop_toggleOnClick.setShortDescription(resources.getString("RowSelector_toggleOnClick_Description"));
            prop_toggleOnClick.setExpert(false);
            prop_toggleOnClick.setHidden(false);
            prop_toggleOnClick.setPreferred(false);
            attrib = new AttributeDescriptor("toggleOnClick",false,"true",true);
            prop_toggleOnClick.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_toggleOnClick.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_toggleOnInput = new PropertyDescriptor("toggleOnInput",beanClass,"isToggleOnInput","setToggleOnInput");
            prop_toggleOnInput.setDisplayName(resources.getString("RowSelector_toggleOnInput_DisplayName"));
            prop_toggleOnInput.setShortDescription(resources.getString("RowSelector_toggleOnInput_Description"));
            prop_toggleOnInput.setExpert(false);
            prop_toggleOnInput.setHidden(false);
            prop_toggleOnInput.setPreferred(false);
            attrib = new AttributeDescriptor("toggleOnInput",false,"true",true);
            prop_toggleOnInput.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_toggleOnInput.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");
            prop_value.setDisplayName(resources.getString("RowSelector_value_DisplayName"));
            prop_value.setShortDescription(resources.getString("RowSelector_value_Description"));
            prop_value.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.faces.dt.std.ValueBindingPropertyEditor"));
            prop_value.setExpert(false);
            prop_value.setHidden(false);
            prop_value.setPreferred(false);
            attrib = new AttributeDescriptor("value",false,"false",true);
            prop_value.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_value.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);
            prop_value.setValue("ignoreIsBound", "true");

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("RowSelector_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("RowSelector_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("RowSelector_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("RowSelector_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("RowSelector_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("RowSelector_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("RowSelector_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("RowSelector_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("RowSelector_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("RowSelector_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);
            prop_parent.setDisplayName(resources.getString("RowSelector_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("RowSelector_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("RowSelector_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("RowSelector_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("RowSelector_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("RowSelector_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            propDescriptors = new PropertyDescriptor[] {
                prop_attributes,
                prop_childCount,
                prop_children,
                prop_clickAction,
                prop_clickListener,
                prop_clickedRow,
                prop_dblClickDelay,
                prop_enhancedMultiple,
                prop_facets,
                prop_family,
                prop_id,
                prop_immediate,
                prop_keyboardNavigationEnabled,
                prop_mouseOverClass,
                prop_multiple,
                prop_parent,
                prop_preStyleOnSelection,
                prop_rendered,
                prop_renderedOnUserRole,
                prop_rendererType,
                prop_rendersChildren,
                prop_selectedClass,
                prop_selectedMouseOverClass,
                prop_selectionAction,
                prop_selectionListener,
                prop_singleRowAutoSelect,
                prop_styleClass,
                prop_tabindex,
                prop_toggleOnClick,
                prop_toggleOnInput,
                prop_value,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
