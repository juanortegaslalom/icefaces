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
package com.icesoft.faces.component.panelborder;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Arranges and resizes child components to fit in five predefined
 * 		regions (N, S, E, W, Center)
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class PanelBorderBase extends javax.faces.component.html.HtmlPanelGroup {

    /**
     * <p>Construct a new <code>PanelBorderBase</code>.</p>
     */
    public PanelBorderBase() {
        super();
        setRendererType("com.icesoft.faces.BorderLayout");
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
 * <p>Passed through to root element.</p>
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
 * <p>Passed through to root element.</p>
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
    private String border = null;

    /**
 * <p>Width (in pixels) of the border to be drawn around this table.</p>
     */
    public String getBorder() {
        if (this.border != null) {
            return this.border;
        }
        ValueBinding _vb = getValueBinding("border");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "0";
    }

    /**
 * <p>Width (in pixels) of the border to be drawn around this table.</p>
     * @see #getBorder()
     */
    public void setBorder(String border) {
        this.border = border;
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

    // layout
    private String layout = null;

    /**
 * <p>layout | north | south | west | east | center |
 * 		===================|========|========|=======|========|========|
 * 		default | top | bottom | left | right | center | horizontal
 * 		reverse | top | bottom | right | left | center | vertical
 * 		reverse | bottom | top | left | right | center | center only |
 * 		none | none | none | none | center | hide north | none | bottom
 * 		| left | right | center | hide east | top | bottom | left | none
 * 		| center | hide south | top | none | left | right | center |
 * 		hide west | top | bottom | none | right | center |</p>
     */
    public String getLayout() {
        if (this.layout != null) {
            return this.layout;
        }
        ValueBinding _vb = getValueBinding("layout");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "none";
    }

    /**
 * <p>layout | north | south | west | east | center |
 * 		===================|========|========|=======|========|========|
 * 		default | top | bottom | left | right | center | horizontal
 * 		reverse | top | bottom | right | left | center | vertical
 * 		reverse | bottom | top | left | right | center | center only |
 * 		none | none | none | none | center | hide north | none | bottom
 * 		| left | right | center | hide east | top | bottom | left | none
 * 		| center | hide south | top | none | left | right | center |
 * 		hide west | top | bottom | none | right | center |</p>
     * @see #getLayout()
     */
    public void setLayout(String layout) {
        this.layout = layout;
    }

    // renderCenter
    private boolean renderCenter = false;
    private boolean renderCenter_set = false;

    /**
 * <p>If false, the center facet will not be rendered. The layout
 * 		attribute overrides this property.</p>
     */
    public boolean isRenderCenter() {
        if (this.renderCenter_set) {
            return this.renderCenter;
        }
        ValueBinding _vb = getValueBinding("renderCenter");
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
 * <p>If false, the center facet will not be rendered. The layout
 * 		attribute overrides this property.</p>
     * @see #isRenderCenter()
     */
    public void setRenderCenter(boolean renderCenter) {
        this.renderCenter = renderCenter;
        this.renderCenter_set = true;
    }

    // renderEast
    private boolean renderEast = false;
    private boolean renderEast_set = false;

    /**
 * <p>If false, the east facet will not be rendered. The layout
 * 		attribute overrides this property.</p>
     */
    public boolean isRenderEast() {
        if (this.renderEast_set) {
            return this.renderEast;
        }
        ValueBinding _vb = getValueBinding("renderEast");
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
 * <p>If false, the east facet will not be rendered. The layout
 * 		attribute overrides this property.</p>
     * @see #isRenderEast()
     */
    public void setRenderEast(boolean renderEast) {
        this.renderEast = renderEast;
        this.renderEast_set = true;
    }

    // renderNorth
    private boolean renderNorth = false;
    private boolean renderNorth_set = false;

    /**
 * <p>If false, the north facet will not be rendered. The layout
 * 		attribute overrides this property.</p>
     */
    public boolean isRenderNorth() {
        if (this.renderNorth_set) {
            return this.renderNorth;
        }
        ValueBinding _vb = getValueBinding("renderNorth");
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
 * <p>If false, the north facet will not be rendered. The layout
 * 		attribute overrides this property.</p>
     * @see #isRenderNorth()
     */
    public void setRenderNorth(boolean renderNorth) {
        this.renderNorth = renderNorth;
        this.renderNorth_set = true;
    }

    // renderSouth
    private boolean renderSouth = false;
    private boolean renderSouth_set = false;

    /**
 * <p>If false, the south facet will not be rendered. The layout
 * 		attribute overrides this property.</p>
     */
    public boolean isRenderSouth() {
        if (this.renderSouth_set) {
            return this.renderSouth;
        }
        ValueBinding _vb = getValueBinding("renderSouth");
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
 * <p>If false, the south facet will not be rendered. The layout
 * 		attribute overrides this property.</p>
     * @see #isRenderSouth()
     */
    public void setRenderSouth(boolean renderSouth) {
        this.renderSouth = renderSouth;
        this.renderSouth_set = true;
    }

    // renderWest
    private boolean renderWest = false;
    private boolean renderWest_set = false;

    /**
 * <p>If false, the west facet will not be rendered. The layout
 * 		attribute overrides this property.</p>
     */
    public boolean isRenderWest() {
        if (this.renderWest_set) {
            return this.renderWest;
        }
        ValueBinding _vb = getValueBinding("renderWest");
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
 * <p>If false, the west facet will not be rendered. The layout
 * 		attribute overrides this property.</p>
     * @see #isRenderWest()
     */
    public void setRenderWest(boolean renderWest) {
        this.renderWest = renderWest;
        this.renderWest_set = true;
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
 *               <p>Defines the base class name for all style classes. Default value is <b>icePnlBrdr</b></p>
 *               <ul>
 *                 <li>icePnlBrdrNorth</li>
 *                 <li>icePnlBrdrEast</li>
 *                 <li>icePnlBrdrWest</li>
 *                 <li>icePnlBrdrSouth</li>
 *                 <li>icePnlBrdrCenter</li>
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
 *               <p>Defines the base class name for all style classes. Default value is <b>icePnlBrdr</b></p>
 *               <ul>
 *                 <li>icePnlBrdrNorth</li>
 *                 <li>icePnlBrdrEast</li>
 *                 <li>icePnlBrdrWest</li>
 *                 <li>icePnlBrdrSouth</li>
 *                 <li>icePnlBrdrCenter</li>
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
        this.align = (String) _values[1];
        this.bgcolor = (String) _values[2];
        this.border = (String) _values[3];
        this.cellpadding = (String) _values[4];
        this.cellspacing = (String) _values[5];
        this.dir = (String) _values[6];
        this.frame = (String) _values[7];
        this.height = (String) _values[8];
        this.id = (String) _values[9];
        this.lang = (String) _values[10];
        this.layout = (String) _values[11];
        this.renderCenter = ((Boolean) _values[12]).booleanValue();
        this.renderCenter_set = ((Boolean) _values[13]).booleanValue();
        this.renderEast = ((Boolean) _values[14]).booleanValue();
        this.renderEast_set = ((Boolean) _values[15]).booleanValue();
        this.renderNorth = ((Boolean) _values[16]).booleanValue();
        this.renderNorth_set = ((Boolean) _values[17]).booleanValue();
        this.renderSouth = ((Boolean) _values[18]).booleanValue();
        this.renderSouth_set = ((Boolean) _values[19]).booleanValue();
        this.renderWest = ((Boolean) _values[20]).booleanValue();
        this.renderWest_set = ((Boolean) _values[21]).booleanValue();
        this.rendered = ((Boolean) _values[22]).booleanValue();
        this.rendered_set = ((Boolean) _values[23]).booleanValue();
        this.renderedOnUserRole = (String) _values[24];
        this.rules = (String) _values[25];
        this.style = (String) _values[26];
        this.styleClass = (String) _values[27];
        this.summary = (String) _values[28];
        this.title = (String) _values[29];
        this.width = (String) _values[30];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[31];
        _values[0] = super.saveState(_context);
        _values[1] = this.align;
        _values[2] = this.bgcolor;
        _values[3] = this.border;
        _values[4] = this.cellpadding;
        _values[5] = this.cellspacing;
        _values[6] = this.dir;
        _values[7] = this.frame;
        _values[8] = this.height;
        _values[9] = this.id;
        _values[10] = this.lang;
        _values[11] = this.layout;
        _values[12] = this.renderCenter ? Boolean.TRUE : Boolean.FALSE;
        _values[13] = this.renderCenter_set ? Boolean.TRUE : Boolean.FALSE;
        _values[14] = this.renderEast ? Boolean.TRUE : Boolean.FALSE;
        _values[15] = this.renderEast_set ? Boolean.TRUE : Boolean.FALSE;
        _values[16] = this.renderNorth ? Boolean.TRUE : Boolean.FALSE;
        _values[17] = this.renderNorth_set ? Boolean.TRUE : Boolean.FALSE;
        _values[18] = this.renderSouth ? Boolean.TRUE : Boolean.FALSE;
        _values[19] = this.renderSouth_set ? Boolean.TRUE : Boolean.FALSE;
        _values[20] = this.renderWest ? Boolean.TRUE : Boolean.FALSE;
        _values[21] = this.renderWest_set ? Boolean.TRUE : Boolean.FALSE;
        _values[22] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[23] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[24] = this.renderedOnUserRole;
        _values[25] = this.rules;
        _values[26] = this.style;
        _values[27] = this.styleClass;
        _values[28] = this.summary;
        _values[29] = this.title;
        _values[30] = this.width;
        return _values;
    }

}
