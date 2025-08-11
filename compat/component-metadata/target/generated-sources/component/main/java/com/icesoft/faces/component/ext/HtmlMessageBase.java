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
 * Displays a message associated with a component
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class HtmlMessageBase extends javax.faces.component.html.HtmlMessage {

    /**
     * <p>Construct a new <code>HtmlMessageBase</code>.</p>
     */
    public HtmlMessageBase() {
        super();
        setRendererType("com.icesoft.faces.Message");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Message";
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

    // effect
    private com.icesoft.faces.context.effects.Effect effect = null;

    /**
 * <p>The Javascript Effect</p>
     */
    public com.icesoft.faces.context.effects.Effect getEffect() {
        if (this.effect != null) {
            return this.effect;
        }
        ValueBinding _vb = getValueBinding("effect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The Javascript Effect</p>
     * @see #getEffect()
     */
    public void setEffect(com.icesoft.faces.context.effects.Effect effect) {
        this.effect = effect;
    }

    // errorClass
    private String errorClass = null;

    /**
 * <p>CSS style class to apply to any message with a severity class of "ERROR".
 * 		<br/>The default class rendered as <b>iceMsgError</b>.</p>
     */
    public String getErrorClass() {
        if (this.errorClass != null) {
            return this.errorClass;
        }
        ValueBinding _vb = getValueBinding("errorClass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>CSS style class to apply to any message with a severity class of "ERROR".
 * 		<br/>The default class rendered as <b>iceMsgError</b>.</p>
     * @see #getErrorClass()
     */
    public void setErrorClass(String errorClass) {
        this.errorClass = errorClass;
    }

    // errorStyle
    private String errorStyle = null;

    /**
 * <p>CSS style(s) to apply to any message with a severity class of "ERROR".</p>
     */
    public String getErrorStyle() {
        if (this.errorStyle != null) {
            return this.errorStyle;
        }
        ValueBinding _vb = getValueBinding("errorStyle");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>CSS style(s) to apply to any message with a severity class of "ERROR".</p>
     * @see #getErrorStyle()
     */
    public void setErrorStyle(String errorStyle) {
        this.errorStyle = errorStyle;
    }

    // escape
    private boolean escape = false;
    private boolean escape_set = false;

    /**
 * <p>Flag indicating whether the message text should be escaped or not (e.g. for including HTML tags in the message).</p>
     */
    public boolean isEscape() {
        if (this.escape_set) {
            return this.escape;
        }
        ValueBinding _vb = getValueBinding("escape");
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
 * <p>Flag indicating whether the message text should be escaped or not (e.g. for including HTML tags in the message).</p>
     * @see #isEscape()
     */
    public void setEscape(boolean escape) {
        this.escape = escape;
        this.escape_set = true;
    }

    // fatalClass
    private String fatalClass = null;

    /**
 * <p>CSS style class to apply to any message with a severity class of "FATAL".
 * 		<br/>The default class rendered as <b>iceMsgFatal</b>.</p>
     */
    public String getFatalClass() {
        if (this.fatalClass != null) {
            return this.fatalClass;
        }
        ValueBinding _vb = getValueBinding("fatalClass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>CSS style class to apply to any message with a severity class of "FATAL".
 * 		<br/>The default class rendered as <b>iceMsgFatal</b>.</p>
     * @see #getFatalClass()
     */
    public void setFatalClass(String fatalClass) {
        this.fatalClass = fatalClass;
    }

    // fatalStyle
    private String fatalStyle = null;

    /**
 * <p>CSS style(s) to apply to any message with a severity class of "FATAL".</p>
     */
    public String getFatalStyle() {
        if (this.fatalStyle != null) {
            return this.fatalStyle;
        }
        ValueBinding _vb = getValueBinding("fatalStyle");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>CSS style(s) to apply to any message with a severity class of "FATAL".</p>
     * @see #getFatalStyle()
     */
    public void setFatalStyle(String fatalStyle) {
        this.fatalStyle = fatalStyle;
    }

    // for
    private String _for = null;

    /**
 * <p>Client identifier of the component for which to display messages.</p>
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
 * <p>Client identifier of the component for which to display messages.</p>
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

    // infoClass
    private String infoClass = null;

    /**
 * <p>CSS style class to apply to any message with a severity class of "INFO".
 * 		<br/>The default class rendered as <b>iceMsgInfo</b>.</p>
     */
    public String getInfoClass() {
        if (this.infoClass != null) {
            return this.infoClass;
        }
        ValueBinding _vb = getValueBinding("infoClass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>CSS style class to apply to any message with a severity class of "INFO".
 * 		<br/>The default class rendered as <b>iceMsgInfo</b>.</p>
     * @see #getInfoClass()
     */
    public void setInfoClass(String infoClass) {
        this.infoClass = infoClass;
    }

    // infoStyle
    private String infoStyle = null;

    /**
 * <p>CSS style(s) to apply to any message with a severity class of "INFO".</p>
     */
    public String getInfoStyle() {
        if (this.infoStyle != null) {
            return this.infoStyle;
        }
        ValueBinding _vb = getValueBinding("infoStyle");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>CSS style(s) to apply to any message with a severity class of "INFO".</p>
     * @see #getInfoStyle()
     */
    public void setInfoStyle(String infoStyle) {
        this.infoStyle = infoStyle;
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

    // showDetail
    private boolean showDetail = false;
    private boolean showDetail_set = false;

    /**
 * <p>Flag indicating whether the detail portion of displayed messages should 
 * 		be included. Default value is "true".</p>
     */
    public boolean isShowDetail() {
        if (this.showDetail_set) {
            return this.showDetail;
        }
        ValueBinding _vb = getValueBinding("showDetail");
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
 * <p>Flag indicating whether the detail portion of displayed messages should 
 * 		be included. Default value is "true".</p>
     * @see #isShowDetail()
     */
    public void setShowDetail(boolean showDetail) {
        this.showDetail = showDetail;
        this.showDetail_set = true;
    }

    // showSummary
    private boolean showSummary = false;
    private boolean showSummary_set = false;

    /**
 * <p>Flag indicating whether the summary portion of displayed messages should
 * 		be included. Default value is "false".</p>
     */
    public boolean isShowSummary() {
        if (this.showSummary_set) {
            return this.showSummary;
        }
        ValueBinding _vb = getValueBinding("showSummary");
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
 * <p>Flag indicating whether the summary portion of displayed messages should
 * 		be included. Default value is "false".</p>
     * @see #isShowSummary()
     */
    public void setShowSummary(boolean showSummary) {
        this.showSummary = showSummary;
        this.showSummary_set = true;
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
 * 		attribute on generated markup.<br/>
 * 		The default class rendered as <b>iceMsg</b>. 
 * 		</p> 
 *         <ul>
 *           <li>iceMsg</li>
 *           <li>iceMsgError</li>
 *           <li>iceMsgFatal</li>
 *           <li>iceMsgInfo</li>
 *           <li>iceMsgWarn</li>
 *         </ul>
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
 * 		attribute on generated markup.<br/>
 * 		The default class rendered as <b>iceMsg</b>. 
 * 		</p> 
 *         <ul>
 *           <li>iceMsg</li>
 *           <li>iceMsgError</li>
 *           <li>iceMsgFatal</li>
 *           <li>iceMsgInfo</li>
 *           <li>iceMsgWarn</li>
 *         </ul>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
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

    // tooltip
    private boolean tooltip = false;
    private boolean tooltip_set = false;

    /**
 * <p>Flag indicating whether the detail portion of the message should be
 * 		displayed as a tooltip.</p>
     */
    public boolean isTooltip() {
        if (this.tooltip_set) {
            return this.tooltip;
        }
        ValueBinding _vb = getValueBinding("tooltip");
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
 * <p>Flag indicating whether the detail portion of the message should be
 * 		displayed as a tooltip.</p>
     * @see #isTooltip()
     */
    public void setTooltip(boolean tooltip) {
        this.tooltip = tooltip;
        this.tooltip_set = true;
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

    // warnClass
    private String warnClass = null;

    /**
 * <p>CSS style class to apply to any message with a severity class of "WARN".
 * 		<br/>The default class rendered as <b>iceMsgWarn</b>.</p>
     */
    public String getWarnClass() {
        if (this.warnClass != null) {
            return this.warnClass;
        }
        ValueBinding _vb = getValueBinding("warnClass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>CSS style class to apply to any message with a severity class of "WARN".
 * 		<br/>The default class rendered as <b>iceMsgWarn</b>.</p>
     * @see #getWarnClass()
     */
    public void setWarnClass(String warnClass) {
        this.warnClass = warnClass;
    }

    // warnStyle
    private String warnStyle = null;

    /**
 * <p>CSS style(s) to apply to any message with a severity class of "WARN".</p>
     */
    public String getWarnStyle() {
        if (this.warnStyle != null) {
            return this.warnStyle;
        }
        ValueBinding _vb = getValueBinding("warnStyle");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>CSS style(s) to apply to any message with a severity class of "WARN".</p>
     * @see #getWarnStyle()
     */
    public void setWarnStyle(String warnStyle) {
        this.warnStyle = warnStyle;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.dir = (String) _values[1];
        this.effect = (com.icesoft.faces.context.effects.Effect) _values[2];
        this.errorClass = (String) _values[3];
        this.errorStyle = (String) _values[4];
        this.escape = ((Boolean) _values[5]).booleanValue();
        this.escape_set = ((Boolean) _values[6]).booleanValue();
        this.fatalClass = (String) _values[7];
        this.fatalStyle = (String) _values[8];
        this._for = (String) _values[9];
        this.id = (String) _values[10];
        this.infoClass = (String) _values[11];
        this.infoStyle = (String) _values[12];
        this.lang = (String) _values[13];
        this.rendered = ((Boolean) _values[14]).booleanValue();
        this.rendered_set = ((Boolean) _values[15]).booleanValue();
        this.renderedOnUserRole = (String) _values[16];
        this.showDetail = ((Boolean) _values[17]).booleanValue();
        this.showDetail_set = ((Boolean) _values[18]).booleanValue();
        this.showSummary = ((Boolean) _values[19]).booleanValue();
        this.showSummary_set = ((Boolean) _values[20]).booleanValue();
        this.style = (String) _values[21];
        this.styleClass = (String) _values[22];
        this.title = (String) _values[23];
        this.tooltip = ((Boolean) _values[24]).booleanValue();
        this.tooltip_set = ((Boolean) _values[25]).booleanValue();
        this.visible = ((Boolean) _values[26]).booleanValue();
        this.visible_set = ((Boolean) _values[27]).booleanValue();
        this.warnClass = (String) _values[28];
        this.warnStyle = (String) _values[29];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[30];
        _values[0] = super.saveState(_context);
        _values[1] = this.dir;
        _values[2] = this.effect;
        _values[3] = this.errorClass;
        _values[4] = this.errorStyle;
        _values[5] = this.escape ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.escape_set ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.fatalClass;
        _values[8] = this.fatalStyle;
        _values[9] = this._for;
        _values[10] = this.id;
        _values[11] = this.infoClass;
        _values[12] = this.infoStyle;
        _values[13] = this.lang;
        _values[14] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[15] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[16] = this.renderedOnUserRole;
        _values[17] = this.showDetail ? Boolean.TRUE : Boolean.FALSE;
        _values[18] = this.showDetail_set ? Boolean.TRUE : Boolean.FALSE;
        _values[19] = this.showSummary ? Boolean.TRUE : Boolean.FALSE;
        _values[20] = this.showSummary_set ? Boolean.TRUE : Boolean.FALSE;
        _values[21] = this.style;
        _values[22] = this.styleClass;
        _values[23] = this.title;
        _values[24] = this.tooltip ? Boolean.TRUE : Boolean.FALSE;
        _values[25] = this.tooltip_set ? Boolean.TRUE : Boolean.FALSE;
        _values[26] = this.visible ? Boolean.TRUE : Boolean.FALSE;
        _values[27] = this.visible_set ? Boolean.TRUE : Boolean.FALSE;
        _values[28] = this.warnClass;
        _values[29] = this.warnStyle;
        return _values;
    }

}
