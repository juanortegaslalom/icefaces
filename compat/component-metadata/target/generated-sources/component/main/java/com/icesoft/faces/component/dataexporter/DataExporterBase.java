/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an 'AS
 * IS' BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 */
package com.icesoft.faces.component.dataexporter;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class DataExporterBase extends javax.faces.component.UIComponentBase {

    /**
     * <p>Construct a new <code>DataExporterBase</code>.</p>
     */
    public DataExporterBase() {
        super();
        setRendererType("com.icesoft.faces.DataExporterRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.DataExporter";
    }

    // clickToCreateFileText
    private String clickToCreateFileText = null;

    /**
 * <p>Note: This is deprecated as of 1.8.1. Specifying a value for this attribute will have no effect.</p>
     */
    public String getClickToCreateFileText() {
        if (this.clickToCreateFileText != null) {
            return this.clickToCreateFileText;
        }
        ValueBinding _vb = getValueBinding("clickToCreateFileText");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "false";
    }

    /**
 * <p>Note: This is deprecated as of 1.8.1. Specifying a value for this attribute will have no effect.</p>
     * @see #getClickToCreateFileText()
     */
    public void setClickToCreateFileText(String clickToCreateFileText) {
        this.clickToCreateFileText = clickToCreateFileText;
    }

    // for
    private String _for = null;

    /**
 * <p>ID of the dataTable that this dataExporter component will export data from.</p>
     */
    public String getFor() {
        if (this._for != null) {
            return this._for;
        }
        ValueBinding _vb = getValueBinding("for");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>ID of the dataTable that this dataExporter component will export data from.</p>
     * @see #getFor()
     */
    public void setFor(String _for) {
        this._for = _for;
    }

    // id
    private String id = null;

    /**
 * <p>The component identifier for this component. This value must be 
 *   			unique within the closest parent component that is a naming 
 *   			container.</p>
     */
    public String getId() {
        if (this.id != null) {
            return this.id;
        }
        ValueBinding _vb = getValueBinding("id");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The component identifier for this component. This value must be 
 *   			unique within the closest parent component that is a naming 
 *   			container.</p>
     * @see #getId()
     */
    public void setId(String id) {
        this.id = id;
    }

    // ignorePagination
    private boolean ignorePagination = false;
    private boolean ignorePagination_set = false;

    /**
 * <p>This is false by default. If true the dataExporter
 *         will ignore the "first" and "rows" properties on the associated dataTable.</p>
     */
    public boolean isIgnorePagination() {
        if (this.ignorePagination_set) {
            return this.ignorePagination;
        }
        ValueBinding _vb = getValueBinding("ignorePagination");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
 * <p>This is false by default. If true the dataExporter
 *         will ignore the "first" and "rows" properties on the associated dataTable.</p>
     * @see #isIgnorePagination()
     */
    public void setIgnorePagination(boolean ignorePagination) {
        this.ignorePagination = ignorePagination;
        this.ignorePagination_set = true;
    }

    // image
    private String image = null;

    /**
 * <p>The URL of an image that will be rendered instead of the 'label' attribute 
 *         text which the user can click on to initiate a data export download. When 
 *         this attribute is specified, the 'label' text will be used for the 'title' 
 *         and 'alt' text on the image element.</p>
     */
    public String getImage() {
        if (this.image != null) {
            return this.image;
        }
        ValueBinding _vb = getValueBinding("image");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The URL of an image that will be rendered instead of the 'label' attribute 
 *         text which the user can click on to initiate a data export download. When 
 *         this attribute is specified, the 'label' text will be used for the 'title' 
 *         and 'alt' text on the image element.</p>
     * @see #getImage()
     */
    public void setImage(String image) {
        this.image = image;
    }

    // includeColumns
    private String includeColumns = null;

    /**
 * <p>This attribute lets you define the order and number of columns that needs to be added to
 *         the generated output. It takes comma separated column indexes. 
 *         Note that index starts with 0. <br/><br/>
 *         
 *         If there are 6 columns in the table and you want to add only 1st, 4th 
 *         and 6th column to the generated output:<br/>
 *         &lt;ice:dataExporter includeColumns="0,3,5"... &gt;
 *         <br/>
 *         The column order of the above example can be changed a well:</br>
 *         &lt;ice:dataExporter includeColumns="5,0,3"... &gt;
 *         <br/>
 *         By default all columns will be included to the output, and in the default order.
 *         </p>
     */
    public String getIncludeColumns() {
        if (this.includeColumns != null) {
            return this.includeColumns;
        }
        ValueBinding _vb = getValueBinding("includeColumns");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>This attribute lets you define the order and number of columns that needs to be added to
 *         the generated output. It takes comma separated column indexes. 
 *         Note that index starts with 0. <br/><br/>
 *         
 *         If there are 6 columns in the table and you want to add only 1st, 4th 
 *         and 6th column to the generated output:<br/>
 *         &lt;ice:dataExporter includeColumns="0,3,5"... &gt;
 *         <br/>
 *         The column order of the above example can be changed a well:</br>
 *         &lt;ice:dataExporter includeColumns="5,0,3"... &gt;
 *         <br/>
 *         By default all columns will be included to the output, and in the default order.
 *         </p>
     * @see #getIncludeColumns()
     */
    public void setIncludeColumns(String includeColumns) {
        this.includeColumns = includeColumns;
    }

    // label
    private String label = null;

    /**
 * <p>The value of this attribute will be rendered to download the generated file.
 *         If it has not been defined then the file name will be rendered instead.
 *         If the image property has been specified, then the label will be used to
 *         render alt and title attributes on the HTML markup.</p>
     */
    public String getLabel() {
        if (this.label != null) {
            return this.label;
        }
        ValueBinding _vb = getValueBinding("label");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "true";
    }

    /**
 * <p>The value of this attribute will be rendered to download the generated file.
 *         If it has not been defined then the file name will be rendered instead.
 *         If the image property has been specified, then the label will be used to
 *         render alt and title attributes on the HTML markup.</p>
     * @see #getLabel()
     */
    public void setLabel(String label) {
        this.label = label;
    }

    // outputTypeHandler
    private com.icesoft.faces.component.dataexporter.OutputTypeHandler outputTypeHandler = null;

    /**
 * <p>Custom output handler can be define using this attribute. The custom handler
 *         must be a type of com.icesoft.faces.component.dataexporter.OutputTypeHandler</p>
     */
    public com.icesoft.faces.component.dataexporter.OutputTypeHandler getOutputTypeHandler() {
        if (this.outputTypeHandler != null) {
            return this.outputTypeHandler;
        }
        ValueBinding _vb = getValueBinding("outputTypeHandler");
        if (_vb != null) {
            return (com.icesoft.faces.component.dataexporter.OutputTypeHandler) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Custom output handler can be define using this attribute. The custom handler
 *         must be a type of com.icesoft.faces.component.dataexporter.OutputTypeHandler</p>
     * @see #getOutputTypeHandler()
     */
    public void setOutputTypeHandler(com.icesoft.faces.component.dataexporter.OutputTypeHandler outputTypeHandler) {
        this.outputTypeHandler = outputTypeHandler;
    }

    // popupBlockerLabel
    private String popupBlockerLabel = null;

    /**
 * <p>    
 *         When used in a browser with a popup blocker enabled downloading the 
 *         exported file will require two clicks instead of a single click. In this 
 *         case the value of this attribute will be used to update the label for 
 *         the dataExporter to reflect that the user must click the link/button/image 
 *         again to complete the download process.. 
 *         </p>
     */
    public String getPopupBlockerLabel() {
        if (this.popupBlockerLabel != null) {
            return this.popupBlockerLabel;
        }
        ValueBinding _vb = getValueBinding("popupBlockerLabel");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "true";
    }

    /**
 * <p>    
 *         When used in a browser with a popup blocker enabled downloading the 
 *         exported file will require two clicks instead of a single click. In this 
 *         case the value of this attribute will be used to update the label for 
 *         the dataExporter to reflect that the user must click the link/button/image 
 *         again to complete the download process.. 
 *         </p>
     * @see #getPopupBlockerLabel()
     */
    public void setPopupBlockerLabel(String popupBlockerLabel) {
        this.popupBlockerLabel = popupBlockerLabel;
    }

    // renderLabelAsButton
    private boolean renderLabelAsButton = false;
    private boolean renderLabelAsButton_set = false;

    /**
 * <p>This is false by default. If true the label text will be the label of a rendered button, instead of an anchor link.</p>
     */
    public boolean isRenderLabelAsButton() {
        if (this.renderLabelAsButton_set) {
            return this.renderLabelAsButton;
        }
        ValueBinding _vb = getValueBinding("renderLabelAsButton");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
 * <p>This is false by default. If true the label text will be the label of a rendered button, instead of an anchor link.</p>
     * @see #isRenderLabelAsButton()
     */
    public void setRenderLabelAsButton(boolean renderLabelAsButton) {
        this.renderLabelAsButton = renderLabelAsButton;
        this.renderLabelAsButton_set = true;
    }

    // rendered
    private boolean rendered = false;
    private boolean rendered_set = false;

    /**
 * <p>Flag indicating whether or not this component should be rendered 
 *   			(during Render Response Phase), or processed on any subsequent form 
 *   			submit.</p>
     */
    public boolean isRendered() {
        if (this.rendered_set) {
            return this.rendered;
        }
        ValueBinding _vb = getValueBinding("rendered");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
 * <p>Flag indicating whether or not this component should be rendered 
 *   			(during Render Response Phase), or processed on any subsequent form 
 *   			submit.</p>
     * @see #isRendered()
     */
    public void setRendered(boolean rendered) {
        this.rendered = rendered;
        this.rendered_set = true;
    }

    // style
    private String style = null;

    /**
 * <p>CSS style(s) to be applied when this component is rendered.</p>
     */
    public String getStyle() {
        if (this.style != null) {
            return this.style;
        }
        ValueBinding _vb = getValueBinding("style");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>CSS style(s) to be applied when this component is rendered.</p>
     * @see #getStyle()
     */
    public void setStyle(String style) {
        this.style = style;
    }

    // styleClass
    private String styleClass = null;

    /**
 * <p>
 *               Space-separated list of CSS style class(es) to be applied when this
 *               element is rendered. This value must be passed through as the 
 *               "class" attribute on generated markup.<br/>
 *               Default value is <b>iceDatExp<b/></p>
     */
    public String getStyleClass() {
        if (this.styleClass != null) {
            return this.styleClass;
        }
        ValueBinding _vb = getValueBinding("styleClass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 *               Space-separated list of CSS style class(es) to be applied when this
 *               element is rendered. This value must be passed through as the 
 *               "class" attribute on generated markup.<br/>
 *               Default value is <b>iceDatExp<b/></p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // type
    private String type = null;

    /**
 * <p>
 *         It can have one of the following value:
 *         <ul>
 *            <li>excel</li>
 *            <li>csv</li>
 *            <li>pdf</li>
 *         </ul>
 * 
 *         <b>Note:</b> If the custom handler has been defined using the <i>outputTypeHandler</i>
 *         attribute then it will take precedence over this attribute. Exporting to PDF requires
 *         the presence of the iText jar in your application, which can be downloaded from itextpdf.com
 *         </p>
     */
    public String getType() {
        if (this.type != null) {
            return this.type;
        }
        ValueBinding _vb = getValueBinding("type");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "true";
    }

    /**
 * <p>
 *         It can have one of the following value:
 *         <ul>
 *            <li>excel</li>
 *            <li>csv</li>
 *            <li>pdf</li>
 *         </ul>
 * 
 *         <b>Note:</b> If the custom handler has been defined using the <i>outputTypeHandler</i>
 *         attribute then it will take precedence over this attribute. Exporting to PDF requires
 *         the presence of the iText jar in your application, which can be downloaded from itextpdf.com
 *         </p>
     * @see #getType()
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.clickToCreateFileText = (String) _values[1];
        this._for = (String) _values[2];
        this.id = (String) _values[3];
        this.ignorePagination = ((Boolean) _values[4]).booleanValue();
        this.ignorePagination_set = ((Boolean) _values[5]).booleanValue();
        this.image = (String) _values[6];
        this.includeColumns = (String) _values[7];
        this.label = (String) _values[8];
        this.outputTypeHandler = (com.icesoft.faces.component.dataexporter.OutputTypeHandler) _values[9];
        this.popupBlockerLabel = (String) _values[10];
        this.renderLabelAsButton = ((Boolean) _values[11]).booleanValue();
        this.renderLabelAsButton_set = ((Boolean) _values[12]).booleanValue();
        this.rendered = ((Boolean) _values[13]).booleanValue();
        this.rendered_set = ((Boolean) _values[14]).booleanValue();
        this.style = (String) _values[15];
        this.styleClass = (String) _values[16];
        this.type = (String) _values[17];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[18];
        _values[0] = super.saveState(_context);
        _values[1] = this.clickToCreateFileText;
        _values[2] = this._for;
        _values[3] = this.id;
        _values[4] = this.ignorePagination ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.ignorePagination_set ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.image;
        _values[7] = this.includeColumns;
        _values[8] = this.label;
        _values[9] = this.outputTypeHandler;
        _values[10] = this.popupBlockerLabel;
        _values[11] = this.renderLabelAsButton ? Boolean.TRUE : Boolean.FALSE;
        _values[12] = this.renderLabelAsButton_set ? Boolean.TRUE : Boolean.FALSE;
        _values[13] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[14] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[15] = this.style;
        _values[16] = this.styleClass;
        _values[17] = this.type;
        return _values;
    }

}
