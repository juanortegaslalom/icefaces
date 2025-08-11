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
package com.icesoft.faces.component.paneltabset;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * A container for a set of child Panel Tab components
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class PanelTabSetBase extends com.icesoft.faces.component.panelseries.UISeries {

    /**
     * <p>Construct a new <code>PanelTabSetBase</code>.</p>
     */
    public PanelTabSetBase() {
        super();
        setRendererType("com.icesoft.faces.TabbedPane");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Panel";
    }

    // align
    private String align = null;

    /**
 * <p>Sets the horizontal alignment (left, right, justify, center) for the cell contents</p>
     */
    public String getAlign() {
        if (this.align != null) {
            return this.align;
        }
        ValueBinding _vb = getValueBinding("align");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Sets the horizontal alignment (left, right, justify, center) for the cell contents</p>
     * @see #getAlign()
     */
    public void setAlign(String align) {
        this.align = align;
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
 * <p>Definition of how much space the user agent should leave between
 *         the border of each cell and its contents.</p>
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
 * <p>Definition of how much space the user agent should leave between
 *         the border of each cell and its contents.</p>
     * @see #getCellpadding()
     */
    public void setCellpadding(String cellpadding) {
        this.cellpadding = cellpadding;
    }

    // cellspacing
    private String cellspacing = null;

    /**
 * <p>Definition of how much space the user agent should leave between
 *         the left side of the table and the leftmost column, the top of
 *         the table and the top of the top side of the topmost row, and so
 *         on for the right and bottom of the table. It also specifies the
 *         amount of space to leave between cells.</p>
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
 * <p>Definition of how much space the user agent should leave between
 *         the left side of the table and the leftmost column, the top of
 *         the table and the top of the top side of the topmost row, and so
 *         on for the right and bottom of the table. It also specifies the
 *         amount of space to leave between cells.</p>
     * @see #getCellspacing()
     */
    public void setCellspacing(String cellspacing) {
        this.cellspacing = cellspacing;
    }

    // dir
    private String dir = null;

    /**
 * <p>Direction indication for text that does not inherit
 *         directionality. Valid values are "LTR" (left-to-right) and "RTL"
 *         (right-to-left).</p>
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
 * <p>Direction indication for text that does not inherit
 *         directionality. Valid values are "LTR" (left-to-right) and "RTL"
 *         (right-to-left).</p>
     * @see #getDir()
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    // first
    private int first = Integer.MIN_VALUE;
    private boolean first_set = false;

    /**
 * <p>Sets or retrieves which field of a given data source, as
 * 		specified by the dataSrc property, to bind to the specified
 * 		object.</p>
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
 * <p>Sets or retrieves which field of a given data source, as
 * 		specified by the dataSrc property, to bind to the specified
 * 		object.</p>
     * @see #getFirst()
     */
    public void setFirst(int first) {
        this.first = first;
        this.first_set = true;
    }

    // frame
    private String frame = null;

    /**
 * <p>Code specifying which sides of the frame surrounding this table
 *         will be visible. Valid values are: none (no sides, default
 *         value); above (top side only); below (bottom side only); hsides
 *         (top and bottom sides only); vsides (right and left sides only);
 *         lhs (left hand side only); rhs (right hand side only); box (all
 *         four sides); and border (all four sides).</p>
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
 * <p>Code specifying which sides of the frame surrounding this table
 *         will be visible. Valid values are: none (no sides, default
 *         value); above (top side only); below (bottom side only); hsides
 *         (top and bottom sides only); vsides (right and left sides only);
 *         lhs (left hand side only); rhs (right hand side only); box (all
 *         four sides); and border (all four sides).</p>
     * @see #getFrame()
     */
    public void setFrame(String frame) {
        this.frame = frame;
    }

    // height
    private String height = null;

    /**
 * <p>height of the entire table, for visual user agents.</p>
     */
    public String getHeight() {
        if (this.height != null) {
            return this.height;
        }
        ValueBinding _vb = getValueBinding("height");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>height of the entire table, for visual user agents.</p>
     * @see #getHeight()
     */
    public void setHeight(String height) {
        this.height = height;
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

    // immediate
    private boolean immediate = false;
    private boolean immediate_set = false;

    /**
 * <p>Flag indicating that this component's value must be converted
 * 		and validated immediately (that is, during Apply Request Values
 * 		phase), rather than waiting until Process Validations phase.</p>
     */
    public boolean isImmediate() {
        if (this.immediate_set) {
            return this.immediate;
        }
        ValueBinding _vb = getValueBinding("immediate");
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
 * <p>Flag indicating that this component's value must be converted
 * 		and validated immediately (that is, during Apply Request Values
 * 		phase), rather than waiting until Process Validations phase.</p>
     * @see #isImmediate()
     */
    public void setImmediate(boolean immediate) {
        this.immediate = immediate;
        this.immediate_set = true;
    }

    // keyboardNavigationEnabled
    private boolean keyboardNavigationEnabled = false;
    private boolean keyboardNavigationEnabled_set = false;

    /**
 * <p>Enables keyboard support, default value is true.</p>
     */
    public boolean isKeyboardNavigationEnabled() {
        if (this.keyboardNavigationEnabled_set) {
            return this.keyboardNavigationEnabled;
        }
        ValueBinding _vb = getValueBinding("keyboardNavigationEnabled");
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
 * <p>Enables keyboard support, default value is true.</p>
     * @see #isKeyboardNavigationEnabled()
     */
    public void setKeyboardNavigationEnabled(boolean keyboardNavigationEnabled) {
        this.keyboardNavigationEnabled = keyboardNavigationEnabled;
        this.keyboardNavigationEnabled_set = true;
    }

    // lang
    private String lang = null;

    /**
 * <p>Code describing the language used in the generated markup for
 *         this component.</p>
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
 * <p>Code describing the language used in the generated markup for
 *         this component.</p>
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

    // partialSubmit
    private boolean partialSubmit = false;
    private boolean partialSubmit_set = false;

    /**
 * <p>Enable component to perform partial submit. Default value is true.</p>
     */
    public boolean isPartialSubmit() {
        if (this.partialSubmit_set) {
            return this.partialSubmit;
        }
        ValueBinding _vb = getValueBinding("partialSubmit");
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
 * <p>Enable component to perform partial submit. Default value is true.</p>
     * @see #isPartialSubmit()
     */
    public void setPartialSubmit(boolean partialSubmit) {
        this.partialSubmit = partialSubmit;
        this.partialSubmit_set = true;
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

    // selectedIndex
    private int selectedIndex = Integer.MIN_VALUE;
    private boolean selectedIndex_set = false;

    /**
 * <p>Index of tab that is selected by default.</p>
     */
    public int getSelectedIndex() {
        if (this.selectedIndex_set) {
            return this.selectedIndex;
        }
        ValueBinding _vb = getValueBinding("selectedIndex");
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
 * <p>Index of tab that is selected by default.</p>
     * @see #getSelectedIndex()
     */
    public void setSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
        this.selectedIndex_set = true;
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
 * 				<p>Defines the base class name for all style classes.</p>
 *                 <p>Default value for the base class name is <b>icePnlTbSet</b>. The base class name
 *                 is used as a prefix for the style classes that will be applied to the elements that make up
 *                 the panelTabSet. The default style classes are defined in the xp.css and royale.css that are included
 *                 with ICEfaces.</p>
 *                 <p>Style Classes Used:</p>
 *                      <ul>
 *                        <li>icePnlTbSet</li>
 *                        <li>icePnlTbSetBtm</li>
 *                        <li>icePnlTbSetCnt</li>
 *                        <li>icePnlTbSetCntBtm</li>
 *                        <li>icePnlTbSetSpcr</li>
 *                        <li>icePnlTbSetSpcrBtm</li>
 *                        <li>icePnlTbSetHdrIconLft</li>
 *                        <li>icePnlTbSetHdrIconRt</li>
 *                        <li>icePnlTbSetHdrLbl</li>
 *                      </ul>
 *                  <p/>                 
 *                  <p>To override the defaults with a base class name of <b>myTabSet</b> the developer 
 *                  will need to define the following styleclasses in their web applications css.</p>
 *                      <ul>
 *                        <li>myTabSet</li>
 *                        <li>myTabSetBtm</li>
 *                        <li>myTabSetCnt</li>
 *                        <li>myTabSetCntBtm</li>
 *                        <li>myTabSetSpcr</li>
 *                        <li>myTabSetSpcrBtm</li>
 *                        <li>myTabSetHdrIconLft</li>
 *                        <li>myTabSetHdrIconRt</li>
 *                        <li>myTabSetHdrLbl</li>
 *                      </ul>
 *                  <p/>
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
 * 				<p>Defines the base class name for all style classes.</p>
 *                 <p>Default value for the base class name is <b>icePnlTbSet</b>. The base class name
 *                 is used as a prefix for the style classes that will be applied to the elements that make up
 *                 the panelTabSet. The default style classes are defined in the xp.css and royale.css that are included
 *                 with ICEfaces.</p>
 *                 <p>Style Classes Used:</p>
 *                      <ul>
 *                        <li>icePnlTbSet</li>
 *                        <li>icePnlTbSetBtm</li>
 *                        <li>icePnlTbSetCnt</li>
 *                        <li>icePnlTbSetCntBtm</li>
 *                        <li>icePnlTbSetSpcr</li>
 *                        <li>icePnlTbSetSpcrBtm</li>
 *                        <li>icePnlTbSetHdrIconLft</li>
 *                        <li>icePnlTbSetHdrIconRt</li>
 *                        <li>icePnlTbSetHdrLbl</li>
 *                      </ul>
 *                  <p/>                 
 *                  <p>To override the defaults with a base class name of <b>myTabSet</b> the developer 
 *                  will need to define the following styleclasses in their web applications css.</p>
 *                      <ul>
 *                        <li>myTabSet</li>
 *                        <li>myTabSetBtm</li>
 *                        <li>myTabSetCnt</li>
 *                        <li>myTabSetCntBtm</li>
 *                        <li>myTabSetSpcr</li>
 *                        <li>myTabSetSpcrBtm</li>
 *                        <li>myTabSetHdrIconLft</li>
 *                        <li>myTabSetHdrIconRt</li>
 *                        <li>myTabSetHdrLbl</li>
 *                      </ul>
 *                  <p/>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // summary
    private String summary = null;

    /**
 * <p>Summary of this table's purpose and structure, for user agents
 *         rendering to non-visual media such as speech and Braille.</p>
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
 * <p>Summary of this table's purpose and structure, for user agents
 *         rendering to non-visual media such as speech and Braille.</p>
     * @see #getSummary()
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    // tabChangeListener
    private javax.faces.el.MethodBinding tabChangeListener = null;

    /**
 * <p>the name of the class that will be added to the
 * 		HtmlPanelTabbedPane component as a TabChangeListener</p>
     */
    public javax.faces.el.MethodBinding getTabChangeListener() {
        if (this.tabChangeListener != null) {
            return this.tabChangeListener;
        }
        ValueBinding _vb = getValueBinding("tabChangeListener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>the name of the class that will be added to the
 * 		HtmlPanelTabbedPane component as a TabChangeListener</p>
     * @see #getTabChangeListener()
     */
    public void setTabChangeListener(javax.faces.el.MethodBinding tabChangeListener) {
        this.tabChangeListener = tabChangeListener;
    }

    // tabPlacement
    private String tabPlacement = null;

    /**
 * <p>The placement for the tabs relative to the content. Possible
 * 		values; Top, Bottom. Default is Top. Left and Right not
 * 		supported in this release.</p>
     */
    public String getTabPlacement() {
        if (this.tabPlacement != null) {
            return this.tabPlacement;
        }
        ValueBinding _vb = getValueBinding("tabPlacement");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "Top";
    }

    /**
 * <p>The placement for the tabs relative to the content. Possible
 * 		values; Top, Bottom. Default is Top. Left and Right not
 * 		supported in this release.</p>
     * @see #getTabPlacement()
     */
    public void setTabPlacement(String tabPlacement) {
        this.tabPlacement = tabPlacement;
    }

    // tabindex
    private String tabindex = null;

    /**
 * <p>Position of this element in the tabbing order for the current document. 
 * 		This value must be an integer between 0 and 32767.</p>
     */
    public String getTabindex() {
        if (this.tabindex != null) {
            return this.tabindex;
        }
        ValueBinding _vb = getValueBinding("tabindex");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Position of this element in the tabbing order for the current document. 
 * 		This value must be an integer between 0 and 32767.</p>
     * @see #getTabindex()
     */
    public void setTabindex(String tabindex) {
        this.tabindex = tabindex;
    }

    // title
    private String title = null;

    /**
 * <p>Advisory title information about markup elements generated for
 * 		this component.</p>
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
 * <p>Advisory title information about markup elements generated for
 * 		this component.</p>
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
 * <p>Width of the entire tab set. If this value is set and the actual width needed to
 *         display all contained tabs is greater than this value, then the tab set will be clipped.</p>
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
 * <p>Width of the entire tab set. If this value is set and the actual width needed to
 *         display all contained tabs is greater than this value, then the tab set will be clipped.</p>
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
        this.align = (String) _values[1];
        this.bgcolor = (String) _values[2];
        this.border = ((Integer) _values[3]).intValue();
        this.border_set = ((Boolean) _values[4]).booleanValue();
        this.cellpadding = (String) _values[5];
        this.cellspacing = (String) _values[6];
        this.dir = (String) _values[7];
        this.first = ((Integer) _values[8]).intValue();
        this.first_set = ((Boolean) _values[9]).booleanValue();
        this.frame = (String) _values[10];
        this.height = (String) _values[11];
        this.id = (String) _values[12];
        this.immediate = ((Boolean) _values[13]).booleanValue();
        this.immediate_set = ((Boolean) _values[14]).booleanValue();
        this.keyboardNavigationEnabled = ((Boolean) _values[15]).booleanValue();
        this.keyboardNavigationEnabled_set = ((Boolean) _values[16]).booleanValue();
        this.lang = (String) _values[17];
        this.onclick = (String) _values[18];
        this.ondblclick = (String) _values[19];
        this.onkeydown = (String) _values[20];
        this.onkeypress = (String) _values[21];
        this.onkeyup = (String) _values[22];
        this.onmousedown = (String) _values[23];
        this.onmousemove = (String) _values[24];
        this.onmouseout = (String) _values[25];
        this.onmouseover = (String) _values[26];
        this.onmouseup = (String) _values[27];
        this.partialSubmit = ((Boolean) _values[28]).booleanValue();
        this.partialSubmit_set = ((Boolean) _values[29]).booleanValue();
        this.rendered = ((Boolean) _values[30]).booleanValue();
        this.rendered_set = ((Boolean) _values[31]).booleanValue();
        this.renderedOnUserRole = (String) _values[32];
        this.rows = ((Integer) _values[33]).intValue();
        this.rows_set = ((Boolean) _values[34]).booleanValue();
        this.rules = (String) _values[35];
        this.selectedIndex = ((Integer) _values[36]).intValue();
        this.selectedIndex_set = ((Boolean) _values[37]).booleanValue();
        this.style = (String) _values[38];
        this.styleClass = (String) _values[39];
        this.summary = (String) _values[40];
        this.tabChangeListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[41]);
        this.tabPlacement = (String) _values[42];
        this.tabindex = (String) _values[43];
        this.title = (String) _values[44];
        this.value = (Object) _values[45];
        this._var = (String) _values[46];
        this.varStatus = (String) _values[47];
        this.visible = ((Boolean) _values[48]).booleanValue();
        this.visible_set = ((Boolean) _values[49]).booleanValue();
        this.width = (String) _values[50];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[51];
        _values[0] = super.saveState(_context);
        _values[1] = this.align;
        _values[2] = this.bgcolor;
        _values[3] = new Integer(this.border);
        _values[4] = this.border_set ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.cellpadding;
        _values[6] = this.cellspacing;
        _values[7] = this.dir;
        _values[8] = new Integer(this.first);
        _values[9] = this.first_set ? Boolean.TRUE : Boolean.FALSE;
        _values[10] = this.frame;
        _values[11] = this.height;
        _values[12] = this.id;
        _values[13] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[14] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[15] = this.keyboardNavigationEnabled ? Boolean.TRUE : Boolean.FALSE;
        _values[16] = this.keyboardNavigationEnabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[17] = this.lang;
        _values[18] = this.onclick;
        _values[19] = this.ondblclick;
        _values[20] = this.onkeydown;
        _values[21] = this.onkeypress;
        _values[22] = this.onkeyup;
        _values[23] = this.onmousedown;
        _values[24] = this.onmousemove;
        _values[25] = this.onmouseout;
        _values[26] = this.onmouseover;
        _values[27] = this.onmouseup;
        _values[28] = this.partialSubmit ? Boolean.TRUE : Boolean.FALSE;
        _values[29] = this.partialSubmit_set ? Boolean.TRUE : Boolean.FALSE;
        _values[30] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[31] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[32] = this.renderedOnUserRole;
        _values[33] = new Integer(this.rows);
        _values[34] = this.rows_set ? Boolean.TRUE : Boolean.FALSE;
        _values[35] = this.rules;
        _values[36] = new Integer(this.selectedIndex);
        _values[37] = this.selectedIndex_set ? Boolean.TRUE : Boolean.FALSE;
        _values[38] = this.style;
        _values[39] = this.styleClass;
        _values[40] = this.summary;
        _values[41] = saveAttachedState(_context, tabChangeListener);
        _values[42] = this.tabPlacement;
        _values[43] = this.tabindex;
        _values[44] = this.title;
        _values[45] = this.value;
        _values[46] = this._var;
        _values[47] = this.varStatus;
        _values[48] = this.visible ? Boolean.TRUE : Boolean.FALSE;
        _values[49] = this.visible_set ? Boolean.TRUE : Boolean.FALSE;
        _values[50] = this.width;
        return _values;
    }

}
