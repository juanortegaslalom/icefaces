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
package com.icesoft.faces.component.ext;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Provides a tabular view of a UIData structure
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class HtmlDataTableBase extends com.icesoft.faces.component.panelseries.UISeries {

    /**
     * <p>Construct a new <code>HtmlDataTableBase</code>.</p>
     */
    public HtmlDataTableBase() {
        super();
        setRendererType("com.icesoft.faces.Table");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Data";
    }

    // bgcolor
    private String bgcolor = null;

    /**
 * <p>Name or code of the background color for this table.</p>
     */
    public String getBgcolor() {
        if (this.bgcolor != null) {
            return this.bgcolor;
        }
        ValueBinding _vb = getValueBinding("bgcolor");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Name or code of the background color for this table.</p>
     * @see #getBgcolor()
     */
    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    // border
    private int border = Integer.MIN_VALUE;
    private boolean border_set = false;

    /**
 * <p>Width (in pixels) of the border to be drawn around this table.</p>
     */
    public int getBorder() {
        if (this.border_set) {
            return this.border;
        }
        ValueBinding _vb = getValueBinding("border");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return Integer.MIN_VALUE;
            } else {
                return ((Integer) _result).intValue();
            }
        }
        return Integer.MIN_VALUE;
    }

    /**
 * <p>Width (in pixels) of the border to be drawn around this table.</p>
     * @see #getBorder()
     */
    public void setBorder(int border) {
        this.border = border;
        this.border_set = true;
    }

    // cellpadding
    private String cellpadding = null;

    /**
 * <p>Definition of how much space the user agent should leave between the 
 *         border of each cell and its contents.</p>
     */
    public String getCellpadding() {
        if (this.cellpadding != null) {
            return this.cellpadding;
        }
        ValueBinding _vb = getValueBinding("cellpadding");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Definition of how much space the user agent should leave between the 
 *         border of each cell and its contents.</p>
     * @see #getCellpadding()
     */
    public void setCellpadding(String cellpadding) {
        this.cellpadding = cellpadding;
    }

    // cellspacing
    private String cellspacing = null;

    /**
 * <p>Definition of how much space the user agent should leave between the 
 *         left side of the table and the leftmost column, the top of the table 
 *         and the top of the top side of the topmost row, and so on for the right 
 *         and bottom of the table. It also specifies the amount of space to leave 
 *         between cells.</p>
     */
    public String getCellspacing() {
        if (this.cellspacing != null) {
            return this.cellspacing;
        }
        ValueBinding _vb = getValueBinding("cellspacing");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Definition of how much space the user agent should leave between the 
 *         left side of the table and the leftmost column, the top of the table 
 *         and the top of the top side of the topmost row, and so on for the right 
 *         and bottom of the table. It also specifies the amount of space to leave 
 *         between cells.</p>
     * @see #getCellspacing()
     */
    public void setCellspacing(String cellspacing) {
        this.cellspacing = cellspacing;
    }

    // clientOnly
    private boolean clientOnly = false;
    private boolean clientOnly_set = false;

    /**
 * <p>If false, saves the width of the columns to the server, its only applicable
 *         when resizeable = true. "true" is the default value. It helps when the
 *         width of the column needs to be preserved after the resize operation.</p>
     */
    public boolean isClientOnly() {
        if (this.clientOnly_set) {
            return this.clientOnly;
        }
        ValueBinding _vb = getValueBinding("clientOnly");
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
 * <p>If false, saves the width of the columns to the server, its only applicable
 *         when resizeable = true. "true" is the default value. It helps when the
 *         width of the column needs to be preserved after the resize operation.</p>
     * @see #isClientOnly()
     */
    public void setClientOnly(boolean clientOnly) {
        this.clientOnly = clientOnly;
        this.clientOnly_set = true;
    }

    // columnClasses
    private String columnClasses = null;

    /**
 * <p>
 *         Comma-delimited list of CSS style classes that will be applied to the 
 *         columns of this table. A space separated list of classes may also be 
 *         specified for any individual column. If the number of elements in this 
 *         list is less than the number of columns specified in the "columns" 
 *         attribute, no "class" attribute is output for each column greater than 
 *         the number of elements in the list. If the number of elements in the 
 *         list is greater than the number of columns specified in the "columns" 
 *         attribute, the elements at the posisiton in the list after the value 
 *         of the "columns" attribute are ignored.	
 *         </p>
 *         <p>
 *         If the value of this attribute is not being set, the tableRenderer would 
 *         render the default classes using the following pattern (e.g.) <br/>
 *         &lt;td class="iceDatTblCol1" /&gt; <br/>
 *         &lt;td class="iceDatTblCol2" /&gt; <br/>
 * 		&lt;td class="iceDatTblCol1" /&gt; <br/>
 * 	    &lt;td class="iceDatTblCol2" /&gt; <br/>
 * 		....              
 *         </p>
 *         <p>
 *         The above class pattern would allow you to define the base style in the 
 *         "column" class and if you want to customize any of the specific column 
 *         you can override the column+index class.
 *         </p>
     */
    public String getColumnClasses() {
        if (this.columnClasses != null) {
            return this.columnClasses;
        }
        ValueBinding _vb = getValueBinding("columnClasses");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 *         Comma-delimited list of CSS style classes that will be applied to the 
 *         columns of this table. A space separated list of classes may also be 
 *         specified for any individual column. If the number of elements in this 
 *         list is less than the number of columns specified in the "columns" 
 *         attribute, no "class" attribute is output for each column greater than 
 *         the number of elements in the list. If the number of elements in the 
 *         list is greater than the number of columns specified in the "columns" 
 *         attribute, the elements at the posisiton in the list after the value 
 *         of the "columns" attribute are ignored.	
 *         </p>
 *         <p>
 *         If the value of this attribute is not being set, the tableRenderer would 
 *         render the default classes using the following pattern (e.g.) <br/>
 *         &lt;td class="iceDatTblCol1" /&gt; <br/>
 *         &lt;td class="iceDatTblCol2" /&gt; <br/>
 * 		&lt;td class="iceDatTblCol1" /&gt; <br/>
 * 	    &lt;td class="iceDatTblCol2" /&gt; <br/>
 * 		....              
 *         </p>
 *         <p>
 *         The above class pattern would allow you to define the base style in the 
 *         "column" class and if you want to customize any of the specific column 
 *         you can override the column+index class.
 *         </p>
     * @see #getColumnClasses()
     */
    public void setColumnClasses(String columnClasses) {
        this.columnClasses = columnClasses;
    }

    // columnWidths
    private String columnWidths = null;

    /**
 * <p>A comma separated list of the widths of each column for a scrollable table. Please note that column widths must be set in pixels. This attribute does not yet support percentage column widths.</p>
     */
    public String getColumnWidths() {
        if (this.columnWidths != null) {
            return this.columnWidths;
        }
        ValueBinding _vb = getValueBinding("columnWidths");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>A comma separated list of the widths of each column for a scrollable table. Please note that column widths must be set in pixels. This attribute does not yet support percentage column widths.</p>
     * @see #getColumnWidths()
     */
    public void setColumnWidths(String columnWidths) {
        this.columnWidths = columnWidths;
    }

    // dir
    private String dir = null;

    /**
 * <p>Direction indication for text that does not inherit directionality.
 * 			  Valid values are "LTR" (left-to-right) and "RTL" (right-to-left).</p>
     */
    public String getDir() {
        if (this.dir != null) {
            return this.dir;
        }
        ValueBinding _vb = getValueBinding("dir");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Direction indication for text that does not inherit directionality.
 * 			  Valid values are "LTR" (left-to-right) and "RTL" (right-to-left).</p>
     * @see #getDir()
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    // first
    private int first = Integer.MIN_VALUE;
    private boolean first_set = false;

    /**
 * <p>Zero-relative row number of the first row to be displayed. If this
 *       property is set to zero, rendering will begin with the first row of the
 *       underlying data.</p>
     */
    public int getFirst() {
        if (this.first_set) {
            return this.first;
        }
        ValueBinding _vb = getValueBinding("first");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return Integer.MIN_VALUE;
            } else {
                return ((Integer) _result).intValue();
            }
        }
        return Integer.MIN_VALUE;
    }

    /**
 * <p>Zero-relative row number of the first row to be displayed. If this
 *       property is set to zero, rendering will begin with the first row of the
 *       underlying data.</p>
     * @see #getFirst()
     */
    public void setFirst(int first) {
        this.first = first;
        this.first_set = true;
    }

    // footerClass
    private String footerClass = null;

    /**
 * <p>    
 * 		Space-separated list of CSS style class(es) that will be applied to any
 * 		footer generated for this table.
 * 		<br/>
 * 		The default classe rendered as <b>iceDatTblFtr</b>.
 * 		</p>
     */
    public String getFooterClass() {
        if (this.footerClass != null) {
            return this.footerClass;
        }
        ValueBinding _vb = getValueBinding("footerClass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>    
 * 		Space-separated list of CSS style class(es) that will be applied to any
 * 		footer generated for this table.
 * 		<br/>
 * 		The default classe rendered as <b>iceDatTblFtr</b>.
 * 		</p>
     * @see #getFooterClass()
     */
    public void setFooterClass(String footerClass) {
        this.footerClass = footerClass;
    }

    // frame
    private String frame = null;

    /**
 * <p>Code specifying which sides of the frame surrounding this table will be 
 *         visible. Valid values are: none (no sides, default value); above 
 *         (top side only); below (bottom side only); hsides (top and bottom sides 
 *         only); vsides (right and left sides only); lhs (left hand side only); 
 *         rhs (right hand side only); box (all four sides); and border (all four 
 *         sides).</p>
     */
    public String getFrame() {
        if (this.frame != null) {
            return this.frame;
        }
        ValueBinding _vb = getValueBinding("frame");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Code specifying which sides of the frame surrounding this table will be 
 *         visible. Valid values are: none (no sides, default value); above 
 *         (top side only); below (bottom side only); hsides (top and bottom sides 
 *         only); vsides (right and left sides only); lhs (left hand side only); 
 *         rhs (right hand side only); box (all four sides); and border (all four 
 *         sides).</p>
     * @see #getFrame()
     */
    public void setFrame(String frame) {
        this.frame = frame;
    }

    // headerClass
    private String headerClass = null;

    /**
 * <p>  
 *         Space-separated list of CSS style class(es) that will be applied to any 
 *         header generated for this table.	
 *         <br/>
 *         	The default class would rendered as <b>iceDatTblHdr</b>.	
 *         </p>
     */
    public String getHeaderClass() {
        if (this.headerClass != null) {
            return this.headerClass;
        }
        ValueBinding _vb = getValueBinding("headerClass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>  
 *         Space-separated list of CSS style class(es) that will be applied to any 
 *         header generated for this table.	
 *         <br/>
 *         	The default class would rendered as <b>iceDatTblHdr</b>.	
 *         </p>
     * @see #getHeaderClass()
     */
    public void setHeaderClass(String headerClass) {
        this.headerClass = headerClass;
    }

    // headerClasses
    private String headerClasses = null;

    /**
 * <p>This attribute can be used to define the separate style classes for the each 
 * 		header of the each column.<br/>
 * 		
 * 		The default would rendered as : iceDatTblColHdr1, iceDatTblColHdr2 alternatively<br/>
 * 		Note: The attribute has been deprecated.</p>
     */
    public String getHeaderClasses() {
        if (this.headerClasses != null) {
            return this.headerClasses;
        }
        ValueBinding _vb = getValueBinding("headerClasses");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>This attribute can be used to define the separate style classes for the each 
 * 		header of the each column.<br/>
 * 		
 * 		The default would rendered as : iceDatTblColHdr1, iceDatTblColHdr2 alternatively<br/>
 * 		Note: The attribute has been deprecated.</p>
     * @see #getHeaderClasses()
     */
    public void setHeaderClasses(String headerClasses) {
        this.headerClasses = headerClasses;
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

    // lang
    private String lang = null;

    /**
 * <p>Code describing the language used in the generated markup for this 
 * 		component.</p>
     */
    public String getLang() {
        if (this.lang != null) {
            return this.lang;
        }
        ValueBinding _vb = getValueBinding("lang");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Code describing the language used in the generated markup for this 
 * 		component.</p>
     * @see #getLang()
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    // onclick
    private String onclick = null;

    public String getOnclick() {
        if (this.onclick != null) {
            return this.onclick;
        }
        ValueBinding _vb = getValueBinding("onclick");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    // ondblclick
    private String ondblclick = null;

    public String getOndblclick() {
        if (this.ondblclick != null) {
            return this.ondblclick;
        }
        ValueBinding _vb = getValueBinding("ondblclick");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOndblclick(String ondblclick) {
        this.ondblclick = ondblclick;
    }

    // onkeydown
    private String onkeydown = null;

    public String getOnkeydown() {
        if (this.onkeydown != null) {
            return this.onkeydown;
        }
        ValueBinding _vb = getValueBinding("onkeydown");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnkeydown(String onkeydown) {
        this.onkeydown = onkeydown;
    }

    // onkeypress
    private String onkeypress = null;

    public String getOnkeypress() {
        if (this.onkeypress != null) {
            return this.onkeypress;
        }
        ValueBinding _vb = getValueBinding("onkeypress");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnkeypress(String onkeypress) {
        this.onkeypress = onkeypress;
    }

    // onkeyup
    private String onkeyup = null;

    public String getOnkeyup() {
        if (this.onkeyup != null) {
            return this.onkeyup;
        }
        ValueBinding _vb = getValueBinding("onkeyup");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnkeyup(String onkeyup) {
        this.onkeyup = onkeyup;
    }

    // onmousedown
    private String onmousedown = null;

    public String getOnmousedown() {
        if (this.onmousedown != null) {
            return this.onmousedown;
        }
        ValueBinding _vb = getValueBinding("onmousedown");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnmousedown(String onmousedown) {
        this.onmousedown = onmousedown;
    }

    // onmousemove
    private String onmousemove = null;

    public String getOnmousemove() {
        if (this.onmousemove != null) {
            return this.onmousemove;
        }
        ValueBinding _vb = getValueBinding("onmousemove");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnmousemove(String onmousemove) {
        this.onmousemove = onmousemove;
    }

    // onmouseout
    private String onmouseout = null;

    public String getOnmouseout() {
        if (this.onmouseout != null) {
            return this.onmouseout;
        }
        ValueBinding _vb = getValueBinding("onmouseout");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnmouseout(String onmouseout) {
        this.onmouseout = onmouseout;
    }

    // onmouseover
    private String onmouseover = null;

    public String getOnmouseover() {
        if (this.onmouseover != null) {
            return this.onmouseover;
        }
        ValueBinding _vb = getValueBinding("onmouseover");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnmouseover(String onmouseover) {
        this.onmouseover = onmouseover;
    }

    // onmouseup
    private String onmouseup = null;

    public String getOnmouseup() {
        if (this.onmouseup != null) {
            return this.onmouseup;
        }
        ValueBinding _vb = getValueBinding("onmouseup");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnmouseup(String onmouseup) {
        this.onmouseup = onmouseup;
    }

    // renderRowTabindex
    private boolean renderRowTabindex = false;
    private boolean renderRowTabindex_set = false;

    /**
 * <p>Row tabindex is required for dataTable Find feature. If Find feature is not used and
 *         the tabindex interferes with tabbing through inputs in the table, set this to false.</p>
     */
    public boolean isRenderRowTabindex() {
        if (this.renderRowTabindex_set) {
            return this.renderRowTabindex;
        }
        ValueBinding _vb = getValueBinding("renderRowTabindex");
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
 * <p>Row tabindex is required for dataTable Find feature. If Find feature is not used and
 *         the tabindex interferes with tabbing through inputs in the table, set this to false.</p>
     * @see #isRenderRowTabindex()
     */
    public void setRenderRowTabindex(boolean renderRowTabindex) {
        this.renderRowTabindex = renderRowTabindex;
        this.renderRowTabindex_set = true;
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

    // renderedOnUserRole
    private String renderedOnUserRole = null;

    /**
 * <p>If user is in given role, this component will be rendered
 * 		normally. If not, nothing is rendered and the body of this tag
 * 		will be skipped.</p>
     */
    public String getRenderedOnUserRole() {
        if (this.renderedOnUserRole != null) {
            return this.renderedOnUserRole;
        }
        ValueBinding _vb = getValueBinding("renderedOnUserRole");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>If user is in given role, this component will be rendered
 * 		normally. If not, nothing is rendered and the body of this tag
 * 		will be skipped.</p>
     * @see #getRenderedOnUserRole()
     */
    public void setRenderedOnUserRole(String renderedOnUserRole) {
        this.renderedOnUserRole = renderedOnUserRole;
    }

    // resizable
    private boolean resizable = false;
    private boolean resizable_set = false;

    /**
 * <p>
 *             To make columns resizable, this attribute needs to be true.
 *         </p>
 *         <b>Note: </b> Only those columns of the table can be dragged which are
 *         defined as the "header" facet of a column. The headers which are defined by
 *         the "columnGroup" can not be dragged.
 *          <p>
 *         This feature does not yet support dataTables with the 'scrollable' attribute
 *         set. This combination of features is slated for a future release.
 *         </p>
     */
    public boolean isResizable() {
        if (this.resizable_set) {
            return this.resizable;
        }
        ValueBinding _vb = getValueBinding("resizable");
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
 * <p>
 *             To make columns resizable, this attribute needs to be true.
 *         </p>
 *         <b>Note: </b> Only those columns of the table can be dragged which are
 *         defined as the "header" facet of a column. The headers which are defined by
 *         the "columnGroup" can not be dragged.
 *          <p>
 *         This feature does not yet support dataTables with the 'scrollable' attribute
 *         set. This combination of features is slated for a future release.
 *         </p>
     * @see #isResizable()
     */
    public void setResizable(boolean resizable) {
        this.resizable = resizable;
        this.resizable_set = true;
    }

    // resizableColumnWidths
    private String resizableColumnWidths = null;

    /**
 * <p>A comma separated list of the widths of each column for a resizable table. Please note that column widths must be
 *         set in pixels. This attribute does not yet support percentage column widths.</p>
     */
    public String getResizableColumnWidths() {
        if (this.resizableColumnWidths != null) {
            return this.resizableColumnWidths;
        }
        ValueBinding _vb = getValueBinding("resizableColumnWidths");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>A comma separated list of the widths of each column for a resizable table. Please note that column widths must be
 *         set in pixels. This attribute does not yet support percentage column widths.</p>
     * @see #getResizableColumnWidths()
     */
    public void setResizableColumnWidths(String resizableColumnWidths) {
        this.resizableColumnWidths = resizableColumnWidths;
    }

    // rowClasses
    private String rowClasses = null;

    /**
 * <p>      
 *         Comma-delimited list of CSS style classes that will be applied to the 
 *         rows of this table. A space separated list of classes may also be 
 *         specified for any individual row. Thes styles are applied, in turn, 
 *         to each row in the table. For example, if the list has two elements, 
 *         the first style class in the list is applied to the first row, the 
 *         second to the second row, the first to the third row, the second to 
 *         the fourth row, etc. In other words, we keep iterating through the 
 *         list until we reach the end, and then we start at the beginning again.
 *         <br/>	
 *         The default classes rendered as <b>iceDatTblRow1, iceDatTblRow2</b>  alternatively.
 *         </p>
     */
    public String getRowClasses() {
        if (this.rowClasses != null) {
            return this.rowClasses;
        }
        ValueBinding _vb = getValueBinding("rowClasses");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>      
 *         Comma-delimited list of CSS style classes that will be applied to the 
 *         rows of this table. A space separated list of classes may also be 
 *         specified for any individual row. Thes styles are applied, in turn, 
 *         to each row in the table. For example, if the list has two elements, 
 *         the first style class in the list is applied to the first row, the 
 *         second to the second row, the first to the third row, the second to 
 *         the fourth row, etc. In other words, we keep iterating through the 
 *         list until we reach the end, and then we start at the beginning again.
 *         <br/>	
 *         The default classes rendered as <b>iceDatTblRow1, iceDatTblRow2</b>  alternatively.
 *         </p>
     * @see #getRowClasses()
     */
    public void setRowClasses(String rowClasses) {
        this.rowClasses = rowClasses;
    }

    // rows
    private int rows = Integer.MIN_VALUE;
    private boolean rows_set = false;

    /**
 * <p>The number of rows to display, starting with the one identified
 * 		by the "first" property. If this value is set to zero, all
 * 		available rows in the underlying data model will be displayed.</p>
     */
    public int getRows() {
        if (this.rows_set) {
            return this.rows;
        }
        ValueBinding _vb = getValueBinding("rows");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return Integer.MIN_VALUE;
            } else {
                return ((Integer) _result).intValue();
            }
        }
        return Integer.MIN_VALUE;
    }

    /**
 * <p>The number of rows to display, starting with the one identified
 * 		by the "first" property. If this value is set to zero, all
 * 		available rows in the underlying data model will be displayed.</p>
     * @see #getRows()
     */
    public void setRows(int rows) {
        this.rows = rows;
        this.rows_set = true;
    }

    // rules
    private String rules = null;

    /**
 * <p>Code specifying which rules will appear between cells within 
 *         this table. Valid values are: none (no rules, default value); 
 *         groups (between row groups); rows (between rows only); cols 
 *         (between columns only); and all (between all rows and columns).</p>
     */
    public String getRules() {
        if (this.rules != null) {
            return this.rules;
        }
        ValueBinding _vb = getValueBinding("rules");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Code specifying which rules will appear between cells within 
 *         this table. Valid values are: none (no rules, default value); 
 *         groups (between row groups); rows (between rows only); cols 
 *         (between columns only); and all (between all rows and columns).</p>
     * @see #getRules()
     */
    public void setRules(String rules) {
        this.rules = rules;
    }

    // scrollFooter
    private boolean scrollFooter = false;
    private boolean scrollFooter_set = false;

    /**
 * <p>In scrollable mode the footer scrolls as well, to trun the scrolling off
 *         it can be set to the false. The default value is true.</p>
     */
    public boolean isScrollFooter() {
        if (this.scrollFooter_set) {
            return this.scrollFooter;
        }
        ValueBinding _vb = getValueBinding("scrollFooter");
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
 * <p>In scrollable mode the footer scrolls as well, to trun the scrolling off
 *         it can be set to the false. The default value is true.</p>
     * @see #isScrollFooter()
     */
    public void setScrollFooter(boolean scrollFooter) {
        this.scrollFooter = scrollFooter;
        this.scrollFooter_set = true;
    }

    // scrollHeight
    private String scrollHeight = null;

    /**
 * <p>Set the height of the scroll table.</p>
     */
    public String getScrollHeight() {
        if (this.scrollHeight != null) {
            return this.scrollHeight;
        }
        ValueBinding _vb = getValueBinding("scrollHeight");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Set the height of the scroll table.</p>
     * @see #getScrollHeight()
     */
    public void setScrollHeight(String scrollHeight) {
        this.scrollHeight = scrollHeight;
    }

    // scrollable
    private boolean scrollable = false;
    private boolean scrollable_set = false;

    /**
 * <p>When true table is scrollable.
 * 		(Note: you will also need to set columnWidths, and scrollHeight)
 *         When table is scrollable pass-thru attributes like bgcolor will not work
 *         because they are passed to the outer scrollable div only, not to the table
 *         itself. Use style classes instead. See the styleClass, rowClasses and
 *         columnClasses attributes.</p>
     */
    public boolean isScrollable() {
        if (this.scrollable_set) {
            return this.scrollable;
        }
        ValueBinding _vb = getValueBinding("scrollable");
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
 * <p>When true table is scrollable.
 * 		(Note: you will also need to set columnWidths, and scrollHeight)
 *         When table is scrollable pass-thru attributes like bgcolor will not work
 *         because they are passed to the outer scrollable div only, not to the table
 *         itself. Use style classes instead. See the styleClass, rowClasses and
 *         columnClasses attributes.</p>
     * @see #isScrollable()
     */
    public void setScrollable(boolean scrollable) {
        this.scrollable = scrollable;
        this.scrollable_set = true;
    }

    // sortAscending
    private boolean sortAscending = false;
    private boolean sortAscending_set = false;

    /**
 * <p>Sets default sort order, required for sortheader component.</p>
     */
    public boolean isSortAscending() {
        if (this.sortAscending_set) {
            return this.sortAscending;
        }
        ValueBinding _vb = getValueBinding("sortAscending");
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
 * <p>Sets default sort order, required for sortheader component.</p>
     * @see #isSortAscending()
     */
    public void setSortAscending(boolean sortAscending) {
        this.sortAscending = sortAscending;
        this.sortAscending_set = true;
    }

    // sortColumn
    private String sortColumn = null;

    /**
 * <p>Sets column to be sort, required for sortheader component.</p>
     */
    public String getSortColumn() {
        if (this.sortColumn != null) {
            return this.sortColumn;
        }
        ValueBinding _vb = getValueBinding("sortColumn");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Sets column to be sort, required for sortheader component.</p>
     * @see #getSortColumn()
     */
    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
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
 * 		Space-separated list of CSS style class(es) to be applied when this 
 * 		element is rendered. This value must be passed through as the "class" 
 * 		attribute on generated markup.
 * 		the default class rendered as <b>iceDatTbl</b>.
 *               if enabled
 *               <ul>
 *                 <li>iceDatTbl</li>
 *                 <li>iceDatTblCol</li>
 *                 <li>iceDatTblCol1</li>                
 *                 <li>iceDatTblCol2</li>
 *                 <li>iceDatTblColHdr</li>
 *                 <li>iceDatTblColHdr1</li>
 *                 <li>iceDatTblColHdr2</li>
 *                 <li>iceDatTblRow1</li>
 *                 <li>iceDatTblRow2</li>                
 *                 <li>iceDatTblHdr</li>
 *                 <li>iceDatTblFtr</li>   
 *                 <li>iceDatTblScrlHdrTbl</li>  
 *                 <li>iceDatTblScrlBdyTbl</li>           
 *               </ul>   
 *               The following style class is being rendered for the div of the 
 *               "header" if the dataTable is scrollable. 
 *               <ul>
 *                 <li>iceDatTblScrlSpr</li>                
 *               </ul>      
 *               
 *               The following style class is being rendered for active sortable column header. 
 *               <ul>
 *                 <li>iceDatTblActvSrtHdr</li>                
 *               </ul>                        
 *         </p>
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
 * 		Space-separated list of CSS style class(es) to be applied when this 
 * 		element is rendered. This value must be passed through as the "class" 
 * 		attribute on generated markup.
 * 		the default class rendered as <b>iceDatTbl</b>.
 *               if enabled
 *               <ul>
 *                 <li>iceDatTbl</li>
 *                 <li>iceDatTblCol</li>
 *                 <li>iceDatTblCol1</li>                
 *                 <li>iceDatTblCol2</li>
 *                 <li>iceDatTblColHdr</li>
 *                 <li>iceDatTblColHdr1</li>
 *                 <li>iceDatTblColHdr2</li>
 *                 <li>iceDatTblRow1</li>
 *                 <li>iceDatTblRow2</li>                
 *                 <li>iceDatTblHdr</li>
 *                 <li>iceDatTblFtr</li>   
 *                 <li>iceDatTblScrlHdrTbl</li>  
 *                 <li>iceDatTblScrlBdyTbl</li>           
 *               </ul>   
 *               The following style class is being rendered for the div of the 
 *               "header" if the dataTable is scrollable. 
 *               <ul>
 *                 <li>iceDatTblScrlSpr</li>                
 *               </ul>      
 *               
 *               The following style class is being rendered for active sortable column header. 
 *               <ul>
 *                 <li>iceDatTblActvSrtHdr</li>                
 *               </ul>                        
 *         </p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // summary
    private String summary = null;

    /**
 * <p>Summary of this table's purpose and structure, for user 
 *         agents rendering to non-visual media such as speech and Braille.</p>
     */
    public String getSummary() {
        if (this.summary != null) {
            return this.summary;
        }
        ValueBinding _vb = getValueBinding("summary");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Summary of this table's purpose and structure, for user 
 *         agents rendering to non-visual media such as speech and Braille.</p>
     * @see #getSummary()
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    // title
    private String title = null;

    /**
 * <p>Advisory title information about markup elements generated for this 
 * 		component.</p>
     */
    public String getTitle() {
        if (this.title != null) {
            return this.title;
        }
        ValueBinding _vb = getValueBinding("title");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Advisory title information about markup elements generated for this 
 * 		component.</p>
     * @see #getTitle()
     */
    public void setTitle(String title) {
        this.title = title;
    }

    // value
    private Object value = null;

    /**
 * <p>The data model for this component.</p>
     */
    public Object getValue() {
        if (this.value != null) {
            return this.value;
        }
        ValueBinding _vb = getValueBinding("value");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The data model for this component.</p>
     * @see #getValue()
     */
    public void setValue(Object value) {
        this.value = value;
    }

    // var
    private String _var = null;

    /**
 * <p>Name of a request-scope attribute under which the model data for
 * 		the row selected by the current value of the "rowIndex" property
 * 		(i.e. also the current value of the "rowData" property) will be
 * 		exposed.</p>
     */
    public String getVar() {
        return this._var;
    }

    /**
 * <p>Name of a request-scope attribute under which the model data for
 * 		the row selected by the current value of the "rowIndex" property
 * 		(i.e. also the current value of the "rowData" property) will be
 * 		exposed.</p>
     * @see #getVar()
     */
    public void setVar(String _var) {
        this._var = _var;
    }

    // varStatus
    private String varStatus = null;

    /**
 * <p>Name of a request-scope attribute under which the current indexed  
 *         state will be exposed. This is modeled after the Facelets JSTL c:forEach  
 *         varStatus. The varStatus object has 5 sub-properties:</p>
 *         <dl>
 *         <dt>int <b>begin</b></dt> 
 *         <dd>Corresponds to the UIData container's <b>first</b> property, the 
 *             index at which it begins iteration.</dd>
 *         <dt>int <b>end</b></dt>
 *         <dd>The ending index of iteration, corresponding to the UIData 
 *             container's <b>first</b> plus <b>rows</b> minus 1. Note: 
 *             If the UIData's DataModel's isRowAvailable() method returns false, 
 *             prematurely ending iteration, then the actual ending index may not 
 *             equal the value for this <b>end</b> property.</dd>
 *         <dt>int <b>index</b></dt>
 *         <dd>The current iteration index. Corresponding to the UIData 
 *             container's getRowIndex() value, which also corresponds with the 
 *             UIData's DataModel's getRowIndex() value.</dd>
 *         <dt>boolean <b>first</b></dt>
 *         <dd>Defined simply as: <b>varStatus.index == varStatus.begin</b></dd>
 *         <dt>boolean <b>last</b></dt>
 *         <dd>Defined simply as: <b>varStatus.index == varStatus.end</b>. Note: 
 *             This has the same limitations as the <b>end</b> property.</dd>
     */
    public String getVarStatus() {
        if (this.varStatus != null) {
            return this.varStatus;
        }
        ValueBinding _vb = getValueBinding("varStatus");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Name of a request-scope attribute under which the current indexed  
 *         state will be exposed. This is modeled after the Facelets JSTL c:forEach  
 *         varStatus. The varStatus object has 5 sub-properties:</p>
 *         <dl>
 *         <dt>int <b>begin</b></dt> 
 *         <dd>Corresponds to the UIData container's <b>first</b> property, the 
 *             index at which it begins iteration.</dd>
 *         <dt>int <b>end</b></dt>
 *         <dd>The ending index of iteration, corresponding to the UIData 
 *             container's <b>first</b> plus <b>rows</b> minus 1. Note: 
 *             If the UIData's DataModel's isRowAvailable() method returns false, 
 *             prematurely ending iteration, then the actual ending index may not 
 *             equal the value for this <b>end</b> property.</dd>
 *         <dt>int <b>index</b></dt>
 *         <dd>The current iteration index. Corresponding to the UIData 
 *             container's getRowIndex() value, which also corresponds with the 
 *             UIData's DataModel's getRowIndex() value.</dd>
 *         <dt>boolean <b>first</b></dt>
 *         <dd>Defined simply as: <b>varStatus.index == varStatus.begin</b></dd>
 *         <dt>boolean <b>last</b></dt>
 *         <dd>Defined simply as: <b>varStatus.index == varStatus.end</b>. Note: 
 *             This has the same limitations as the <b>end</b> property.</dd>
     * @see #getVarStatus()
     */
    public void setVarStatus(String varStatus) {
        this.varStatus = varStatus;
    }

    // width
    private String width = null;

    /**
 * <p>Width of the entire table, for visual user agents.</p>
     */
    public String getWidth() {
        if (this.width != null) {
            return this.width;
        }
        ValueBinding _vb = getValueBinding("width");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Width of the entire table, for visual user agents.</p>
     * @see #getWidth()
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.bgcolor = (String) _values[1];
        this.border = ((Integer) _values[2]).intValue();
        this.border_set = ((Boolean) _values[3]).booleanValue();
        this.cellpadding = (String) _values[4];
        this.cellspacing = (String) _values[5];
        this.clientOnly = ((Boolean) _values[6]).booleanValue();
        this.clientOnly_set = ((Boolean) _values[7]).booleanValue();
        this.columnClasses = (String) _values[8];
        this.columnWidths = (String) _values[9];
        this.dir = (String) _values[10];
        this.first = ((Integer) _values[11]).intValue();
        this.first_set = ((Boolean) _values[12]).booleanValue();
        this.footerClass = (String) _values[13];
        this.frame = (String) _values[14];
        this.headerClass = (String) _values[15];
        this.headerClasses = (String) _values[16];
        this.id = (String) _values[17];
        this.lang = (String) _values[18];
        this.onclick = (String) _values[19];
        this.ondblclick = (String) _values[20];
        this.onkeydown = (String) _values[21];
        this.onkeypress = (String) _values[22];
        this.onkeyup = (String) _values[23];
        this.onmousedown = (String) _values[24];
        this.onmousemove = (String) _values[25];
        this.onmouseout = (String) _values[26];
        this.onmouseover = (String) _values[27];
        this.onmouseup = (String) _values[28];
        this.renderRowTabindex = ((Boolean) _values[29]).booleanValue();
        this.renderRowTabindex_set = ((Boolean) _values[30]).booleanValue();
        this.rendered = ((Boolean) _values[31]).booleanValue();
        this.rendered_set = ((Boolean) _values[32]).booleanValue();
        this.renderedOnUserRole = (String) _values[33];
        this.resizable = ((Boolean) _values[34]).booleanValue();
        this.resizable_set = ((Boolean) _values[35]).booleanValue();
        this.resizableColumnWidths = (String) _values[36];
        this.rowClasses = (String) _values[37];
        this.rows = ((Integer) _values[38]).intValue();
        this.rows_set = ((Boolean) _values[39]).booleanValue();
        this.rules = (String) _values[40];
        this.scrollFooter = ((Boolean) _values[41]).booleanValue();
        this.scrollFooter_set = ((Boolean) _values[42]).booleanValue();
        this.scrollHeight = (String) _values[43];
        this.scrollable = ((Boolean) _values[44]).booleanValue();
        this.scrollable_set = ((Boolean) _values[45]).booleanValue();
        this.sortAscending = ((Boolean) _values[46]).booleanValue();
        this.sortAscending_set = ((Boolean) _values[47]).booleanValue();
        this.sortColumn = (String) _values[48];
        this.style = (String) _values[49];
        this.styleClass = (String) _values[50];
        this.summary = (String) _values[51];
        this.title = (String) _values[52];
        this.value = (Object) _values[53];
        this._var = (String) _values[54];
        this.varStatus = (String) _values[55];
        this.width = (String) _values[56];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[57];
        _values[0] = super.saveState(_context);
        _values[1] = this.bgcolor;
        _values[2] = new Integer(this.border);
        _values[3] = this.border_set ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.cellpadding;
        _values[5] = this.cellspacing;
        _values[6] = this.clientOnly ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.clientOnly_set ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.columnClasses;
        _values[9] = this.columnWidths;
        _values[10] = this.dir;
        _values[11] = new Integer(this.first);
        _values[12] = this.first_set ? Boolean.TRUE : Boolean.FALSE;
        _values[13] = this.footerClass;
        _values[14] = this.frame;
        _values[15] = this.headerClass;
        _values[16] = this.headerClasses;
        _values[17] = this.id;
        _values[18] = this.lang;
        _values[19] = this.onclick;
        _values[20] = this.ondblclick;
        _values[21] = this.onkeydown;
        _values[22] = this.onkeypress;
        _values[23] = this.onkeyup;
        _values[24] = this.onmousedown;
        _values[25] = this.onmousemove;
        _values[26] = this.onmouseout;
        _values[27] = this.onmouseover;
        _values[28] = this.onmouseup;
        _values[29] = this.renderRowTabindex ? Boolean.TRUE : Boolean.FALSE;
        _values[30] = this.renderRowTabindex_set ? Boolean.TRUE : Boolean.FALSE;
        _values[31] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[32] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[33] = this.renderedOnUserRole;
        _values[34] = this.resizable ? Boolean.TRUE : Boolean.FALSE;
        _values[35] = this.resizable_set ? Boolean.TRUE : Boolean.FALSE;
        _values[36] = this.resizableColumnWidths;
        _values[37] = this.rowClasses;
        _values[38] = new Integer(this.rows);
        _values[39] = this.rows_set ? Boolean.TRUE : Boolean.FALSE;
        _values[40] = this.rules;
        _values[41] = this.scrollFooter ? Boolean.TRUE : Boolean.FALSE;
        _values[42] = this.scrollFooter_set ? Boolean.TRUE : Boolean.FALSE;
        _values[43] = this.scrollHeight;
        _values[44] = this.scrollable ? Boolean.TRUE : Boolean.FALSE;
        _values[45] = this.scrollable_set ? Boolean.TRUE : Boolean.FALSE;
        _values[46] = this.sortAscending ? Boolean.TRUE : Boolean.FALSE;
        _values[47] = this.sortAscending_set ? Boolean.TRUE : Boolean.FALSE;
        _values[48] = this.sortColumn;
        _values[49] = this.style;
        _values[50] = this.styleClass;
        _values[51] = this.summary;
        _values[52] = this.title;
        _values[53] = this.value;
        _values[54] = this._var;
        _values[55] = this.varStatus;
        _values[56] = this.width;
        return _values;
    }

}
