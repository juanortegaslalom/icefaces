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

abstract class UIColumnsBeanInfoBase extends SimpleBeanInfo {

    protected static ResourceBundle resources = ResourceBundle.getBundle("com.icesoft.faces.component.ext.Bundle-JSF", Locale.getDefault(), UIColumnsBeanInfoBase.class.getClassLoader());

    /**
     * <p>Construct a new <code>UIColumnsBeanInfoBase</code>.</p>
     */
    public UIColumnsBeanInfoBase() {

        beanClass = UIColumns.class;
        iconFileName_C16 = "UIColumns_C16";
        iconFileName_C32 = "UIColumns_C32";
        iconFileName_M16 = "UIColumns_M16";
        iconFileName_M32 = "UIColumns_M32";

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
        beanDescriptor.setDisplayName(resources.getString("UIColumns_DisplayName"));
        beanDescriptor.setShortDescription(resources.getString("UIColumns_Description"));
        beanDescriptor.setExpert(false);
        beanDescriptor.setHidden(false);
        beanDescriptor.setPreferred(false);
        beanDescriptor.setValue(Constants.BeanDescriptor.FACET_DESCRIPTORS,getFacetDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.INSTANCE_NAME,"columns");
        beanDescriptor.setValue(Constants.BeanDescriptor.IS_CONTAINER,Boolean.TRUE);
        beanDescriptor.setValue(Constants.BeanDescriptor.MARKUP_SECTION,"form");
        beanDescriptor.setValue(Constants.BeanDescriptor.PROPERTY_CATEGORIES,getCategoryDescriptors());
        beanDescriptor.setValue(Constants.BeanDescriptor.TAG_NAME,"columns");
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
            prop_first.setDisplayName(resources.getString("UIColumns_first_DisplayName"));
            prop_first.setShortDescription(resources.getString("UIColumns_first_Description"));
            prop_first.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.IntegerPropertyEditor"));
            prop_first.setExpert(false);
            prop_first.setHidden(false);
            prop_first.setPreferred(false);
            attrib = new AttributeDescriptor("first",false,"0",true);
            prop_first.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_first.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);
            prop_first.setValue("minValue", new Integer(0));
            prop_first.setValue("unsetValue", new Integer(Integer.MIN_VALUE));

            PropertyDescriptor prop_id = new PropertyDescriptor("id",beanClass,"getId","setId");
            prop_id.setDisplayName(resources.getString("UIColumns_id_DisplayName"));
            prop_id.setShortDescription(resources.getString("UIColumns_id_Description"));
            prop_id.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_id.setExpert(false);
            prop_id.setHidden(false);
            prop_id.setPreferred(false);
            attrib = new AttributeDescriptor("id",false,null,true);
            prop_id.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_id.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_rendered = new PropertyDescriptor("rendered",beanClass,"isRendered","setRendered");
            prop_rendered.setDisplayName(resources.getString("UIColumns_rendered_DisplayName"));
            prop_rendered.setShortDescription(resources.getString("UIColumns_rendered_Description"));
            prop_rendered.setExpert(false);
            prop_rendered.setHidden(false);
            prop_rendered.setPreferred(false);
            attrib = new AttributeDescriptor("rendered",false,"true",true);
            prop_rendered.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rendered.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_COMPONENT);

            PropertyDescriptor prop_rows = new PropertyDescriptor("rows",beanClass,"getRows","setRows");
            prop_rows.setDisplayName(resources.getString("UIColumns_rows_DisplayName"));
            prop_rows.setShortDescription(resources.getString("UIColumns_rows_Description"));
            prop_rows.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.IntegerPropertyEditor"));
            prop_rows.setExpert(false);
            prop_rows.setHidden(false);
            prop_rows.setPreferred(false);
            attrib = new AttributeDescriptor("rows",false,"0",true);
            prop_rows.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_rows.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.APPEARANCE);

            PropertyDescriptor prop_value = new PropertyDescriptor("value",beanClass,"getValue","setValue");
            prop_value.setDisplayName(resources.getString("UIColumns_value_DisplayName"));
            prop_value.setShortDescription(resources.getString("UIColumns_value_Description"));
            prop_value.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.faces.dt.std.ValueBindingPropertyEditor"));
            prop_value.setExpert(false);
            prop_value.setHidden(false);
            prop_value.setPreferred(false);
            attrib = new AttributeDescriptor("value",false,null,true);
            prop_value.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_value.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);
            prop_value.setValue("ignoreIsBound", "true");

            PropertyDescriptor prop_var = new PropertyDescriptor("var",beanClass,"getVar","setVar");
            prop_var.setDisplayName(resources.getString("UIColumns_var_DisplayName"));
            prop_var.setShortDescription(resources.getString("UIColumns_var_Description"));
            prop_var.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_var.setExpert(false);
            prop_var.setHidden(false);
            prop_var.setPreferred(false);
            attrib = new AttributeDescriptor("var",false,null,false);
            prop_var.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_var.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.DATA);

            PropertyDescriptor prop_varStatus = new PropertyDescriptor("varStatus",beanClass,"getVarStatus","setVarStatus");
            prop_varStatus.setDisplayName(resources.getString("UIColumns_varStatus_DisplayName"));
            prop_varStatus.setShortDescription(resources.getString("UIColumns_varStatus_Description"));
            prop_varStatus.setPropertyEditorClass(loadClass("org.netbeans.modules.visualweb.propertyeditors.StringPropertyEditor"));
            prop_varStatus.setExpert(false);
            prop_varStatus.setHidden(false);
            prop_varStatus.setPreferred(false);
            attrib = new AttributeDescriptor("varStatus",false,null,true);
            prop_varStatus.setValue(Constants.PropertyDescriptor.ATTRIBUTE_DESCRIPTOR,attrib);
            prop_varStatus.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.ICE_LAYOUT);

            PropertyDescriptor prop_attributes = new PropertyDescriptor("attributes",beanClass,"getAttributes",null);
            prop_attributes.setDisplayName(resources.getString("UIColumns_attributes_DisplayName"));
            prop_attributes.setShortDescription(resources.getString("UIColumns_attributes_Description"));
            prop_attributes.setExpert(false);
            prop_attributes.setHidden(true);
            prop_attributes.setPreferred(false);
            prop_attributes.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_childCount = new PropertyDescriptor("childCount",beanClass,"getChildCount",null);
            prop_childCount.setDisplayName(resources.getString("UIColumns_childCount_DisplayName"));
            prop_childCount.setShortDescription(resources.getString("UIColumns_childCount_Description"));
            prop_childCount.setExpert(false);
            prop_childCount.setHidden(true);
            prop_childCount.setPreferred(false);
            prop_childCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_children = new PropertyDescriptor("children",beanClass,"getChildren",null);
            prop_children.setDisplayName(resources.getString("UIColumns_children_DisplayName"));
            prop_children.setShortDescription(resources.getString("UIColumns_children_Description"));
            prop_children.setExpert(false);
            prop_children.setHidden(true);
            prop_children.setPreferred(false);
            prop_children.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_facets = new PropertyDescriptor("facets",beanClass,"getFacets",null);
            prop_facets.setDisplayName(resources.getString("UIColumns_facets_DisplayName"));
            prop_facets.setShortDescription(resources.getString("UIColumns_facets_Description"));
            prop_facets.setExpert(false);
            prop_facets.setHidden(true);
            prop_facets.setPreferred(false);
            prop_facets.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_family = new PropertyDescriptor("family",beanClass,"getFamily",null);
            prop_family.setDisplayName(resources.getString("UIColumns_family_DisplayName"));
            prop_family.setShortDescription(resources.getString("UIColumns_family_Description"));
            prop_family.setExpert(false);
            prop_family.setHidden(true);
            prop_family.setPreferred(false);
            prop_family.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_parent = new PropertyDescriptor("parent",beanClass,"getParent",null);
            prop_parent.setDisplayName(resources.getString("UIColumns_parent_DisplayName"));
            prop_parent.setShortDescription(resources.getString("UIColumns_parent_Description"));
            prop_parent.setExpert(false);
            prop_parent.setHidden(true);
            prop_parent.setPreferred(false);
            prop_parent.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendererType = new PropertyDescriptor("rendererType",beanClass,"getRendererType","setRendererType");
            prop_rendererType.setDisplayName(resources.getString("UIColumns_rendererType_DisplayName"));
            prop_rendererType.setShortDescription(resources.getString("UIColumns_rendererType_Description"));
            prop_rendererType.setExpert(false);
            prop_rendererType.setHidden(true);
            prop_rendererType.setPreferred(false);
            prop_rendererType.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rendersChildren = new PropertyDescriptor("rendersChildren",beanClass,"getRendersChildren",null);
            prop_rendersChildren.setDisplayName(resources.getString("UIColumns_rendersChildren_DisplayName"));
            prop_rendersChildren.setShortDescription(resources.getString("UIColumns_rendersChildren_Description"));
            prop_rendersChildren.setExpert(false);
            prop_rendersChildren.setHidden(true);
            prop_rendersChildren.setPreferred(false);
            prop_rendersChildren.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.INTERNAL);

            PropertyDescriptor prop_rowAvailable = new PropertyDescriptor("rowAvailable",beanClass,"isRowAvailable",null);
            prop_rowAvailable.setDisplayName(resources.getString("UIColumns_rowAvailable_DisplayName"));
            prop_rowAvailable.setShortDescription(resources.getString("UIColumns_rowAvailable_Description"));
            prop_rowAvailable.setExpert(false);
            prop_rowAvailable.setHidden(true);
            prop_rowAvailable.setPreferred(false);
            prop_rowAvailable.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_rowCount = new PropertyDescriptor("rowCount",beanClass,"getRowCount",null);
            prop_rowCount.setDisplayName(resources.getString("UIColumns_rowCount_DisplayName"));
            prop_rowCount.setShortDescription(resources.getString("UIColumns_rowCount_Description"));
            prop_rowCount.setExpert(false);
            prop_rowCount.setHidden(true);
            prop_rowCount.setPreferred(false);
            prop_rowCount.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_rowData = new PropertyDescriptor("rowData",beanClass,"getRowData",null);
            prop_rowData.setDisplayName(resources.getString("UIColumns_rowData_DisplayName"));
            prop_rowData.setShortDescription(resources.getString("UIColumns_rowData_Description"));
            prop_rowData.setExpert(false);
            prop_rowData.setHidden(true);
            prop_rowData.setPreferred(false);
            prop_rowData.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_rowIndex = new PropertyDescriptor("rowIndex",beanClass,"getRowIndex","setRowIndex");
            prop_rowIndex.setDisplayName(resources.getString("UIColumns_rowIndex_DisplayName"));
            prop_rowIndex.setShortDescription(resources.getString("UIColumns_rowIndex_Description"));
            prop_rowIndex.setExpert(false);
            prop_rowIndex.setHidden(true);
            prop_rowIndex.setPreferred(false);
            prop_rowIndex.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            PropertyDescriptor prop_rowStatePreserved = new PropertyDescriptor("rowStatePreserved",beanClass,"isRowStatePreserved","setRowStatePreserved");
            prop_rowStatePreserved.setDisplayName(resources.getString("UIColumns_rowStatePreserved_DisplayName"));
            prop_rowStatePreserved.setShortDescription(resources.getString("UIColumns_rowStatePreserved_Description"));
            prop_rowStatePreserved.setExpert(false);
            prop_rowStatePreserved.setHidden(false);
            prop_rowStatePreserved.setPreferred(false);
            prop_rowStatePreserved.setValue(Constants.PropertyDescriptor.CATEGORY,com.icesoft.faces.ide.vwp.util.CategoryDescriptors.GENERAL);

            propDescriptors = new PropertyDescriptor[] {
                prop_attributes,
                prop_childCount,
                prop_children,
                prop_facets,
                prop_family,
                prop_first,
                prop_id,
                prop_parent,
                prop_rendered,
                prop_rendererType,
                prop_rendersChildren,
                prop_rowAvailable,
                prop_rowCount,
                prop_rowData,
                prop_rowIndex,
                prop_rowStatePreserved,
                prop_rows,
                prop_value,
                prop_var,
                prop_varStatus,
            };
            return propDescriptors;

        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }

    }

}
