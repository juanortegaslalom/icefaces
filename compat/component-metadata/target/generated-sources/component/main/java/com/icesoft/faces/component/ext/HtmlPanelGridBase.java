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
 * Arranges child components in a grid
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class HtmlPanelGridBase extends javax.faces.component.html.HtmlPanelGrid {

    /**
     * <p>Construct a new <code>HtmlPanelGridBase</code>.</p>
     */
    public HtmlPanelGridBase() {
        super();
        setRendererType("com.icesoft.faces.Grid");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Panel";
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
 *  		The default column classes would be rendered as : <b>icePnlGrdCol1, 
 *  		icePnlGrdCol2 </b>alternatively
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
 *  		The default column classes would be rendered as : <b>icePnlGrdCol1, 
 *  		icePnlGrdCol2 </b>alternatively
 *         </p>
     * @see #getColumnClasses()
     */
    public void setColumnClasses(String columnClasses) {
        this.columnClasses = columnClasses;
    }

    // columns
    private int columns = Integer.MIN_VALUE;
    private boolean columns_set = false;

    public int getColumns() {
        if (this.columns_set) {
            return this.columns;
        }
        ValueBinding _vb = getValueBinding("columns");
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

    public void setColumns(int columns) {
        this.columns = columns;
        this.columns_set = true;
    }

    // footerClass
    private String footerClass = null;

    /**
 * <p>    
 * 		Space-separated list of CSS style class(es) that will be applied to any
 * 		footer generated for this table.
 * 		<br/>
 * 		The default footer class would be rendered as <b>icePnlGrdFtr</b>.
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
 * 		The default footer class would be rendered as <b>icePnlGrdFtr</b>.
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
 *         	The default header class would be rendered as <b>icePnlGrdHdr</b>.	
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
 *         	The default header class would be rendered as <b>icePnlGrdHdr</b>.	
 *         </p>
     * @see #getHeaderClass()
     */
    public void setHeaderClass(String headerClass) {
        this.headerClass = headerClass;
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
 *         The default classes rendered as <b>icePnlGrdRow1, icePnlGrdRow2</b> 
 *         alternatively.
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
 *         The default classes rendered as <b>icePnlGrdRow1, icePnlGrdRow2</b> 
 *         alternatively.
 *         </p>
     * @see #getRowClasses()
     */
    public void setRowClasses(String rowClasses) {
        this.rowClasses = rowClasses;
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
 *               <p>Defines the base class name for all style classes. Default value is <b>icePnlGrd</b></p>
 *               <ul>
 *                 <li>icePnlGrd</li>
 *                 <li>icePnlGrdHdr</li>
 *                 <li>icePnlGrdFtr</li>
 *                 <li>icePnlGrdRow1</li>
 *                 <li>icePnlGrdRow2</li>
 *                 <li>icePnlGrdCol1</li>
 *                 <li>icePnlGrdCol2</li>
 *               </ul>              
 *   		 </p>
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
 *               <p>Defines the base class name for all style classes. Default value is <b>icePnlGrd</b></p>
 *               <ul>
 *                 <li>icePnlGrd</li>
 *                 <li>icePnlGrdHdr</li>
 *                 <li>icePnlGrdFtr</li>
 *                 <li>icePnlGrdRow1</li>
 *                 <li>icePnlGrdRow2</li>
 *                 <li>icePnlGrdCol1</li>
 *                 <li>icePnlGrdCol2</li>
 *               </ul>              
 *   		 </p>
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

    // visible
    private boolean visible = false;
    private boolean visible_set = false;

    /**
 * <p>Set the visibility of this component. When false CSS style is
 * 		set to display:none</p>
     */
    public boolean isVisible() {
        if (this.visible_set) {
            return this.visible;
        }
        ValueBinding _vb = getValueBinding("visible");
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
 * <p>Set the visibility of this component. When false CSS style is
 * 		set to display:none</p>
     * @see #isVisible()
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
        this.visible_set = true;
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
        this.columnClasses = (String) _values[6];
        this.columns = ((Integer) _values[7]).intValue();
        this.columns_set = ((Boolean) _values[8]).booleanValue();
        this.footerClass = (String) _values[9];
        this.frame = (String) _values[10];
        this.headerClass = (String) _values[11];
        this.id = (String) _values[12];
        this.lang = (String) _values[13];
        this.onclick = (String) _values[14];
        this.ondblclick = (String) _values[15];
        this.onkeydown = (String) _values[16];
        this.onkeypress = (String) _values[17];
        this.onkeyup = (String) _values[18];
        this.onmousedown = (String) _values[19];
        this.onmousemove = (String) _values[20];
        this.onmouseout = (String) _values[21];
        this.onmouseover = (String) _values[22];
        this.onmouseup = (String) _values[23];
        this.rendered = ((Boolean) _values[24]).booleanValue();
        this.rendered_set = ((Boolean) _values[25]).booleanValue();
        this.renderedOnUserRole = (String) _values[26];
        this.rowClasses = (String) _values[27];
        this.rules = (String) _values[28];
        this.style = (String) _values[29];
        this.styleClass = (String) _values[30];
        this.summary = (String) _values[31];
        this.title = (String) _values[32];
        this.visible = ((Boolean) _values[33]).booleanValue();
        this.visible_set = ((Boolean) _values[34]).booleanValue();
        this.width = (String) _values[35];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[36];
        _values[0] = super.saveState(_context);
        _values[1] = this.bgcolor;
        _values[2] = new Integer(this.border);
        _values[3] = this.border_set ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.cellpadding;
        _values[5] = this.cellspacing;
        _values[6] = this.columnClasses;
        _values[7] = new Integer(this.columns);
        _values[8] = this.columns_set ? Boolean.TRUE : Boolean.FALSE;
        _values[9] = this.footerClass;
        _values[10] = this.frame;
        _values[11] = this.headerClass;
        _values[12] = this.id;
        _values[13] = this.lang;
        _values[14] = this.onclick;
        _values[15] = this.ondblclick;
        _values[16] = this.onkeydown;
        _values[17] = this.onkeypress;
        _values[18] = this.onkeyup;
        _values[19] = this.onmousedown;
        _values[20] = this.onmousemove;
        _values[21] = this.onmouseout;
        _values[22] = this.onmouseover;
        _values[23] = this.onmouseup;
        _values[24] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[25] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[26] = this.renderedOnUserRole;
        _values[27] = this.rowClasses;
        _values[28] = this.rules;
        _values[29] = this.style;
        _values[30] = this.styleClass;
        _values[31] = this.summary;
        _values[32] = this.title;
        _values[33] = this.visible ? Boolean.TRUE : Boolean.FALSE;
        _values[34] = this.visible_set ? Boolean.TRUE : Boolean.FALSE;
        _values[35] = this.width;
        return _values;
    }

}
