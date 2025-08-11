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
 * A single tab panel for use within a Panel Tab Set
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class PanelTabBase extends javax.faces.component.html.HtmlPanelGroup {

    /**
     * <p>Construct a new <code>PanelTabBase</code>.</p>
     */
    public PanelTabBase() {
        super();
        setRendererType("com.icesoft.faces.TabbedPaneTab");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Panel";
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

    // disabled
    private boolean disabled = false;
    private boolean disabled_set = false;

    /**
 * <p>Flag indicating that this element must never receive focus or be 
 * 			 included in a subsequent submit.</p>
     */
    public boolean isDisabled() {
        if (this.disabled_set) {
            return this.disabled;
        }
        ValueBinding _vb = getValueBinding("disabled");
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
 * <p>Flag indicating that this element must never receive focus or be 
 * 			 included in a subsequent submit.</p>
     * @see #isDisabled()
     */
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
        this.disabled_set = true;
    }

    // enabledOnUserRole
    private String enabledOnUserRole = null;

    /**
 * <p>If user is in given role, this component will be rendered
 * 		normally. If not, the component will be in disabled state.</p>
     */
    public String getEnabledOnUserRole() {
        if (this.enabledOnUserRole != null) {
            return this.enabledOnUserRole;
        }
        ValueBinding _vb = getValueBinding("enabledOnUserRole");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>If user is in given role, this component will be rendered
 * 		normally. If not, the component will be in disabled state.</p>
     * @see #getEnabledOnUserRole()
     */
    public void setEnabledOnUserRole(String enabledOnUserRole) {
        this.enabledOnUserRole = enabledOnUserRole;
    }

    // icon
    private String icon = null;

    /**
 * <p>The icon attribute sets the icon file for this panelTab component</p>
     */
    public String getIcon() {
        if (this.icon != null) {
            return this.icon;
        }
        ValueBinding _vb = getValueBinding("icon");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The icon attribute sets the icon file for this panelTab component</p>
     * @see #getIcon()
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    // iconAlignRight
    private boolean iconAlignRight = false;
    private boolean iconAlignRight_set = false;

    /**
 * <p>The icon attribute sets the icon file for this panelTab component</p>
     */
    public boolean isIconAlignRight() {
        if (this.iconAlignRight_set) {
            return this.iconAlignRight;
        }
        ValueBinding _vb = getValueBinding("iconAlignRight");
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
 * <p>The icon attribute sets the icon file for this panelTab component</p>
     * @see #isIconAlignRight()
     */
    public void setIconAlignRight(boolean iconAlignRight) {
        this.iconAlignRight = iconAlignRight;
        this.iconAlignRight_set = true;
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

    // label
    private String label = null;

    /**
 * <p>Label of this tab.</p>
     */
    public String getLabel() {
        if (this.label != null) {
            return this.label;
        }
        ValueBinding _vb = getValueBinding("label");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Label of this tab.</p>
     * @see #getLabel()
     */
    public void setLabel(String label) {
        this.label = label;
    }

    // labelWidth
    private String labelWidth = null;

    /**
 * <p>Integer value representing the width (in pixels) of the label text. If the actual width of the text turns out to be greater than the one specified, the text will be wrapped or clipped, depending on the labelWrap attribute.</p>
     */
    public String getLabelWidth() {
        if (this.labelWidth != null) {
            return this.labelWidth;
        }
        ValueBinding _vb = getValueBinding("labelWidth");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Integer value representing the width (in pixels) of the label text. If the actual width of the text turns out to be greater than the one specified, the text will be wrapped or clipped, depending on the labelWrap attribute.</p>
     * @see #getLabelWidth()
     */
    public void setLabelWidth(String labelWidth) {
        this.labelWidth = labelWidth;
    }

    // labelWrap
    private boolean labelWrap = false;
    private boolean labelWrap_set = false;

    /**
 * <p>If this attribute is set to true, then the label text will wrap to multiple lines instead of being clipped when the width of the text is greater than the one specified by the labelWidth attribute.</p>
     */
    public boolean isLabelWrap() {
        if (this.labelWrap_set) {
            return this.labelWrap;
        }
        ValueBinding _vb = getValueBinding("labelWrap");
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
 * <p>If this attribute is set to true, then the label text will wrap to multiple lines instead of being clipped when the width of the text is greater than the one specified by the labelWidth attribute.</p>
     * @see #isLabelWrap()
     */
    public void setLabelWrap(boolean labelWrap) {
        this.labelWrap = labelWrap;
        this.labelWrap_set = true;
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
 * <p>Space-separated list of CSS style class(es) to be applied when this
 *               element is rendered. This value must be passed through as the 
 *               "class" attribute on generated markup.</p>
 *               <p>Defines the base class name for all style classes used in tabbed panes.</p>
 *               <p>Default value for the base class name is <b>icePnlTb</b>. The base class name
 *               is used as a prefix for the style classes that will be applied to the elements that make up
 *               the panelTab. The default style classes are defined in the xp.css and royale.css that are included
 *               with ICEfaces.</p>
 *               <p>There are several parts of the CSS class names, as they are defined in the CSS files:
 *               <dl>
 *               <dt>icePnlTb</dt>
 *               <dd>The root of the class name, as set in the styleClass attribute</dd>
 *               <dt>On / Off / Over</dt>
 *               <dd>On: If tab is the selected one. Off: If tab is not the selected one. Over: When mouseover the tab.</dd>
 *               <dt>Btm</dt>
 *               <dd>If the tab is on the top, then "", else if the tab is on the bottom, then "Btm"</dd>
 *               <dt>Lft / Mid / Rt</dt>
 *               <dd>For the tab, which horizonal section, as left, middle, and right.</dd>
 *               <dt>Top / Mid / Btm</dt>
 *               <dd>For the tab, which vertical section, as top, middle, and bottom.</dd>
 *               <dt>-dis</dt>
 *               <dd>If the panel is enabled, then "", else if the panel is disabled, then "-dis"</dd>
 *               </dl>
 *               <p>Put together, the various sections are: ".{root_classname}{tab_is_On_or_Off_or_Over}{tab_on_top_or_bottom} .{horizonal_section_of_tab}{vertical_section_of_tab}{disabled}"<br/>
 *               That means there is a matrix of classes that have to be defined for the 3 possibilities of tab_is_On_or_Off_or_Over, the 2 possibilities of tab_on_top_or_bottom, the 3 values of horizonal_section_of_tab, the 3 values of vertical_section_of_tab, and the 2 possiblities for disabled, which is 3x2x3x3x2=108 combinations.<br/>
 *               So, given the default value of styleClass as being <b>icePnlTb</b>, if you want a styling for mousing over the tab, when tabs are on the bottom, for the right top side of the tab, then you would have to define this class in your CSS file: <b>.icePnlTbOverBtm .RtTop</b></br>
 *               And if you want a styling for the currently selected tab, when tabs are on the top, for the right middle side of the tab, and the tab is disabled, then you would have to define this class in your CSS file: <b>.icePnlTbOn .RtMid-dis</b></br>
 *               </p>
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
 * <p>Space-separated list of CSS style class(es) to be applied when this
 *               element is rendered. This value must be passed through as the 
 *               "class" attribute on generated markup.</p>
 *               <p>Defines the base class name for all style classes used in tabbed panes.</p>
 *               <p>Default value for the base class name is <b>icePnlTb</b>. The base class name
 *               is used as a prefix for the style classes that will be applied to the elements that make up
 *               the panelTab. The default style classes are defined in the xp.css and royale.css that are included
 *               with ICEfaces.</p>
 *               <p>There are several parts of the CSS class names, as they are defined in the CSS files:
 *               <dl>
 *               <dt>icePnlTb</dt>
 *               <dd>The root of the class name, as set in the styleClass attribute</dd>
 *               <dt>On / Off / Over</dt>
 *               <dd>On: If tab is the selected one. Off: If tab is not the selected one. Over: When mouseover the tab.</dd>
 *               <dt>Btm</dt>
 *               <dd>If the tab is on the top, then "", else if the tab is on the bottom, then "Btm"</dd>
 *               <dt>Lft / Mid / Rt</dt>
 *               <dd>For the tab, which horizonal section, as left, middle, and right.</dd>
 *               <dt>Top / Mid / Btm</dt>
 *               <dd>For the tab, which vertical section, as top, middle, and bottom.</dd>
 *               <dt>-dis</dt>
 *               <dd>If the panel is enabled, then "", else if the panel is disabled, then "-dis"</dd>
 *               </dl>
 *               <p>Put together, the various sections are: ".{root_classname}{tab_is_On_or_Off_or_Over}{tab_on_top_or_bottom} .{horizonal_section_of_tab}{vertical_section_of_tab}{disabled}"<br/>
 *               That means there is a matrix of classes that have to be defined for the 3 possibilities of tab_is_On_or_Off_or_Over, the 2 possibilities of tab_on_top_or_bottom, the 3 values of horizonal_section_of_tab, the 3 values of vertical_section_of_tab, and the 2 possiblities for disabled, which is 3x2x3x3x2=108 combinations.<br/>
 *               So, given the default value of styleClass as being <b>icePnlTb</b>, if you want a styling for mousing over the tab, when tabs are on the bottom, for the right top side of the tab, then you would have to define this class in your CSS file: <b>.icePnlTbOverBtm .RtTop</b></br>
 *               And if you want a styling for the currently selected tab, when tabs are on the top, for the right middle side of the tab, and the tab is disabled, then you would have to define this class in your CSS file: <b>.icePnlTbOn .RtMid-dis</b></br>
 *               </p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
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

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.dir = (String) _values[1];
        this.disabled = ((Boolean) _values[2]).booleanValue();
        this.disabled_set = ((Boolean) _values[3]).booleanValue();
        this.enabledOnUserRole = (String) _values[4];
        this.icon = (String) _values[5];
        this.iconAlignRight = ((Boolean) _values[6]).booleanValue();
        this.iconAlignRight_set = ((Boolean) _values[7]).booleanValue();
        this.id = (String) _values[8];
        this.label = (String) _values[9];
        this.labelWidth = (String) _values[10];
        this.labelWrap = ((Boolean) _values[11]).booleanValue();
        this.labelWrap_set = ((Boolean) _values[12]).booleanValue();
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
        this.style = (String) _values[27];
        this.styleClass = (String) _values[28];
        this.title = (String) _values[29];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[30];
        _values[0] = super.saveState(_context);
        _values[1] = this.dir;
        _values[2] = this.disabled ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.disabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.enabledOnUserRole;
        _values[5] = this.icon;
        _values[6] = this.iconAlignRight ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.iconAlignRight_set ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.id;
        _values[9] = this.label;
        _values[10] = this.labelWidth;
        _values[11] = this.labelWrap ? Boolean.TRUE : Boolean.FALSE;
        _values[12] = this.labelWrap_set ? Boolean.TRUE : Boolean.FALSE;
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
        _values[27] = this.style;
        _values[28] = this.styleClass;
        _values[29] = this.title;
        return _values;
    }

}
