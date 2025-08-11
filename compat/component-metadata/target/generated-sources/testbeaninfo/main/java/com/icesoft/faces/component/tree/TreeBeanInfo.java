package com.icesoft.faces.component.tree;

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

public class TreeBeanInfo extends SimpleBeanInfo {

    /**
     * <p>Construct a new <code>TreeBeanInfo</code>.</p>
     */
    public TreeBeanInfo() {

        beanClass = Tree.class;

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

            PropertyDescriptor prop_documentImage = new PropertyDescriptor("documentImage",beanClass,"getDocumentImage","setDocumentImage");

            PropertyDescriptor prop_folderImage = new PropertyDescriptor("folderImage",beanClass,"getFolderImage","setFolderImage");

            PropertyDescriptor prop_folderOpenImage = new PropertyDescriptor("folderOpenImage",beanClass,"getFolderOpenImage","setFolderOpenImage");

            PropertyDescriptor prop_hideNavigation = new PropertyDescriptor("hideNavigation",beanClass,"getHideNavigation","setHideNavigation");

            PropertyDescriptor prop_hideRootNode = new PropertyDescriptor("hideRootNode",beanClass,"getHideRootNode","setHideRootNode");

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");

            PropertyDescriptor prop_imageDir = new PropertyDescriptor("imageDir",beanClass,"getImageDir","setImageDir");

            PropertyDescriptor prop_immediate = new PropertyDescriptor("immediate",beanClass,"isImmediate","setImmediate");

            PropertyDescriptor prop_keyboardNavigationEnabled = new PropertyDescriptor("keyboardNavigationEnabled",beanClass,"isKeyboardNavigationEnabled","setKeyboardNavigationEnabled");

            PropertyDescriptor prop_navCloseTop = new PropertyDescriptor("navCloseTop",beanClass,"getNavCloseTop","setNavCloseTop");

            PropertyDescriptor prop_navOpenTop = new PropertyDescriptor("navOpenTop",beanClass,"getNavOpenTop","setNavOpenTop");

            PropertyDescriptor prop_navOpenTopNoSiblings = new PropertyDescriptor("navOpenTopNoSiblings",beanClass,"getNavOpenTopNoSiblings","setNavOpenTopNoSiblings");

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");

            PropertyDescriptor prop_style = new PropertyDescriptor("style",beanClass,"getStyle","setStyle");

            PropertyDescriptor prop_styleClass = new PropertyDescriptor("styleClass",beanClass,"getStyleClass","setStyleClass");

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");

            PropertyDescriptor prop_var = new PropertyDescriptor("var",beanClass,"getVar","setVar");

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);

            propDescriptors = new PropertyDescriptor[] {
                prop_action,
                prop_actionListener,
                prop_attributes,
                prop_childCount,
                prop_children,
                prop_documentImage,
                prop_facets,
                prop_family,
                prop_folderImage,
                prop_folderOpenImage,
                prop_hideNavigation,
                prop_hideRootNode,
                prop_id,
                prop_imageDir,
                prop_immediate,
                prop_keyboardNavigationEnabled,
                prop_navCloseTop,
                prop_navOpenTop,
                prop_navOpenTopNoSiblings,
                prop_parent,
                prop_rendered,
                prop_rendererType,
                prop_rendersChildren,
                prop_style,
                prop_styleClass,
                prop_value,
                prop_var,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
