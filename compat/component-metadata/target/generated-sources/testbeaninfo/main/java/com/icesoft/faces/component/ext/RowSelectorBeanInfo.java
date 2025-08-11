package com.icesoft.faces.component.ext;

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

public class RowSelectorBeanInfo extends SimpleBeanInfo {

    /**
     * <p>Construct a new <code>RowSelectorBeanInfo</code>.</p>
     */
    public RowSelectorBeanInfo() {

        beanClass = RowSelector.class;

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

            PropertyDescriptor prop_clickAction = new PropertyDescriptor("clickAction",beanClass,"getClickAction","setClickAction");

            PropertyDescriptor prop_clickListener = new PropertyDescriptor("clickListener",beanClass,"getClickListener","setClickListener");

            PropertyDescriptor prop_clickedRow = new PropertyDescriptor("clickedRow",beanClass,"getClickedRow","setClickedRow");

            PropertyDescriptor prop_dblClickDelay = new PropertyDescriptor("dblClickDelay",beanClass,"getDblClickDelay","setDblClickDelay");

            PropertyDescriptor prop_enhancedMultiple = new PropertyDescriptor("enhancedMultiple",beanClass,"isEnhancedMultiple","setEnhancedMultiple");

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");

            PropertyDescriptor prop_immediate = new PropertyDescriptor("immediate",beanClass,"isImmediate","setImmediate");

            PropertyDescriptor prop_keyboardNavigationEnabled = new PropertyDescriptor("keyboardNavigationEnabled",beanClass,"isKeyboardNavigationEnabled","setKeyboardNavigationEnabled");

            PropertyDescriptor prop_mouseOverClass = new PropertyDescriptor("mouseOverClass",beanClass,"getMouseOverClass","setMouseOverClass");

            PropertyDescriptor prop_multiple = new PropertyDescriptor("multiple",beanClass,"isMultiple","setMultiple");

            PropertyDescriptor prop_preStyleOnSelection = new PropertyDescriptor("preStyleOnSelection",beanClass,"isPreStyleOnSelection","setPreStyleOnSelection");

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");

            PropertyDescriptor prop_renderedOnUserRole = new PropertyDescriptor("renderedOnUserRole",beanClass,"getRenderedOnUserRole","setRenderedOnUserRole");

            PropertyDescriptor prop_selectedClass = new PropertyDescriptor("selectedClass",beanClass,"getSelectedClass","setSelectedClass");

            PropertyDescriptor prop_selectedMouseOverClass = new PropertyDescriptor("selectedMouseOverClass",beanClass,"getSelectedMouseOverClass","setSelectedMouseOverClass");

            PropertyDescriptor prop_selectionAction = new PropertyDescriptor("selectionAction",beanClass,"getSelectionAction","setSelectionAction");

            PropertyDescriptor prop_selectionListener = new PropertyDescriptor("selectionListener",beanClass,"getSelectionListener","setSelectionListener");

            PropertyDescriptor prop_singleRowAutoSelect = new PropertyDescriptor("singleRowAutoSelect",beanClass,"isSingleRowAutoSelect","setSingleRowAutoSelect");

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");

            PropertyDescriptor prop_tabindex = new PropertyDescriptor("tabindex",beanClass,"getTabindex","setTabindex");

            PropertyDescriptor prop_toggleOnClick = new PropertyDescriptor("toggleOnClick",beanClass,"isToggleOnClick","setToggleOnClick");

            PropertyDescriptor prop_toggleOnInput = new PropertyDescriptor("toggleOnInput",beanClass,"isToggleOnInput","setToggleOnInput");

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");

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
