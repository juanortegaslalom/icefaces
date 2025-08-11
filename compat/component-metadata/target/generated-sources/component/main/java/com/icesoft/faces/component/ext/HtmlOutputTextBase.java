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
 * Displays text for labels and other read-only values
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class HtmlOutputTextBase extends javax.faces.component.html.HtmlOutputText {

    /**
     * <p>Construct a new <code>HtmlOutputTextBase</code>.</p>
     */
    public HtmlOutputTextBase() {
        super();
        setRendererType("com.icesoft.faces.Text");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Output";
    }

    // converter
    private javax.faces.convert.Converter converter = null;

    /**
 * <p>Converter instance registered with this component.</p>
     */
    public javax.faces.convert.Converter getConverter() {
        if (this.converter != null) {
            return this.converter;
        }
        ValueBinding _vb = getValueBinding("converter");
        if (_vb != null) {
            return (javax.faces.convert.Converter) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Converter instance registered with this component.</p>
     * @see #getConverter()
     */
    public void setConverter(javax.faces.convert.Converter converter) {
        this.converter = converter;
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

    // escape
    private boolean escape = false;
    private boolean escape_set = false;

    /**
 * <p>Flag indicating that characters that are sensitive in HTML and XML 
 * 		markup must be escaped. This flag is set to "true" by default.</p>
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
 * <p>Flag indicating that characters that are sensitive in HTML and XML 
 * 		markup must be escaped. This flag is set to "true" by default.</p>
     * @see #isEscape()
     */
    public void setEscape(boolean escape) {
        this.escape = escape;
        this.escape_set = true;
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

    // nospan
    private boolean nospan = false;
    private boolean nospan_set = false;

    /**
 * <p>Flag indicating no span tag rendered for text. Default is false.</p>
     */
    public boolean isNospan() {
        if (this.nospan_set) {
            return this.nospan;
        }
        ValueBinding _vb = getValueBinding("nospan");
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
 * <p>Flag indicating no span tag rendered for text. Default is false.</p>
     * @see #isNospan()
     */
    public void setNospan(boolean nospan) {
        this.nospan = nospan;
        this.nospan_set = true;
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

    // onclickeffect
    private com.icesoft.faces.context.effects.Effect onclickeffect = null;

    /**
 * <p>Effect invoked on onclick event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnclickeffect() {
        if (this.onclickeffect != null) {
            return this.onclickeffect;
        }
        ValueBinding _vb = getValueBinding("onclickeffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onclick event</p>
     * @see #getOnclickeffect()
     */
    public void setOnclickeffect(com.icesoft.faces.context.effects.Effect onclickeffect) {
        this.onclickeffect = onclickeffect;
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

    // ondblclickeffect
    private com.icesoft.faces.context.effects.Effect ondblclickeffect = null;

    /**
 * <p>Effect invoked on ondblclick event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOndblclickeffect() {
        if (this.ondblclickeffect != null) {
            return this.ondblclickeffect;
        }
        ValueBinding _vb = getValueBinding("ondblclickeffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on ondblclick event</p>
     * @see #getOndblclickeffect()
     */
    public void setOndblclickeffect(com.icesoft.faces.context.effects.Effect ondblclickeffect) {
        this.ondblclickeffect = ondblclickeffect;
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

    // onkeydowneffect
    private com.icesoft.faces.context.effects.Effect onkeydowneffect = null;

    /**
 * <p>Effect invoked on onkeydown event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnkeydowneffect() {
        if (this.onkeydowneffect != null) {
            return this.onkeydowneffect;
        }
        ValueBinding _vb = getValueBinding("onkeydowneffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onkeydown event</p>
     * @see #getOnkeydowneffect()
     */
    public void setOnkeydowneffect(com.icesoft.faces.context.effects.Effect onkeydowneffect) {
        this.onkeydowneffect = onkeydowneffect;
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

    // onkeypresseffect
    private com.icesoft.faces.context.effects.Effect onkeypresseffect = null;

    /**
 * <p>Effect invoked on onkeypress event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnkeypresseffect() {
        if (this.onkeypresseffect != null) {
            return this.onkeypresseffect;
        }
        ValueBinding _vb = getValueBinding("onkeypresseffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onkeypress event</p>
     * @see #getOnkeypresseffect()
     */
    public void setOnkeypresseffect(com.icesoft.faces.context.effects.Effect onkeypresseffect) {
        this.onkeypresseffect = onkeypresseffect;
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

    // onkeyupeffect
    private com.icesoft.faces.context.effects.Effect onkeyupeffect = null;

    /**
 * <p>Effect invoked on onkeyup event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnkeyupeffect() {
        if (this.onkeyupeffect != null) {
            return this.onkeyupeffect;
        }
        ValueBinding _vb = getValueBinding("onkeyupeffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onkeyup event</p>
     * @see #getOnkeyupeffect()
     */
    public void setOnkeyupeffect(com.icesoft.faces.context.effects.Effect onkeyupeffect) {
        this.onkeyupeffect = onkeyupeffect;
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

    // onmousedowneffect
    private com.icesoft.faces.context.effects.Effect onmousedowneffect = null;

    /**
 * <p>Effect invoked on onmousedown event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnmousedowneffect() {
        if (this.onmousedowneffect != null) {
            return this.onmousedowneffect;
        }
        ValueBinding _vb = getValueBinding("onmousedowneffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onmousedown event</p>
     * @see #getOnmousedowneffect()
     */
    public void setOnmousedowneffect(com.icesoft.faces.context.effects.Effect onmousedowneffect) {
        this.onmousedowneffect = onmousedowneffect;
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

    // onmousemoveeffect
    private com.icesoft.faces.context.effects.Effect onmousemoveeffect = null;

    /**
 * <p>Effect invoked on onmousemove event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnmousemoveeffect() {
        if (this.onmousemoveeffect != null) {
            return this.onmousemoveeffect;
        }
        ValueBinding _vb = getValueBinding("onmousemoveeffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onmousemove event</p>
     * @see #getOnmousemoveeffect()
     */
    public void setOnmousemoveeffect(com.icesoft.faces.context.effects.Effect onmousemoveeffect) {
        this.onmousemoveeffect = onmousemoveeffect;
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

    // onmouseouteffect
    private com.icesoft.faces.context.effects.Effect onmouseouteffect = null;

    /**
 * <p>Effect invoked on onmouse event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnmouseouteffect() {
        if (this.onmouseouteffect != null) {
            return this.onmouseouteffect;
        }
        ValueBinding _vb = getValueBinding("onmouseouteffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onmouse event</p>
     * @see #getOnmouseouteffect()
     */
    public void setOnmouseouteffect(com.icesoft.faces.context.effects.Effect onmouseouteffect) {
        this.onmouseouteffect = onmouseouteffect;
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

    // onmouseovereffect
    private com.icesoft.faces.context.effects.Effect onmouseovereffect = null;

    /**
 * <p>Effect invoked on onmouseover event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnmouseovereffect() {
        if (this.onmouseovereffect != null) {
            return this.onmouseovereffect;
        }
        ValueBinding _vb = getValueBinding("onmouseovereffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onmouseover event</p>
     * @see #getOnmouseovereffect()
     */
    public void setOnmouseovereffect(com.icesoft.faces.context.effects.Effect onmouseovereffect) {
        this.onmouseovereffect = onmouseovereffect;
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

    // onmouseupeffect
    private com.icesoft.faces.context.effects.Effect onmouseupeffect = null;

    /**
 * <p>Effect invoked on onmouseup event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnmouseupeffect() {
        if (this.onmouseupeffect != null) {
            return this.onmouseupeffect;
        }
        ValueBinding _vb = getValueBinding("onmouseupeffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onmouseup event</p>
     * @see #getOnmouseupeffect()
     */
    public void setOnmouseupeffect(com.icesoft.faces.context.effects.Effect onmouseupeffect) {
        this.onmouseupeffect = onmouseupeffect;
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
 * 		element is rendered. This value is passed through as the "class" 
 * 		attribute on generated markup.
 * 		The base name for all style classes. Default value is <b>iceOutTxt</b>.</p>
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
 * 		element is rendered. This value is passed through as the "class" 
 * 		attribute on generated markup.
 * 		The base name for all style classes. Default value is <b>iceOutTxt</b>.</p>
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

    // value
    private Object value = null;

    /**
 * <p>The current value of this component.</p>
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
 * <p>The current value of this component.</p>
     * @see #getValue()
     */
    public void setValue(Object value) {
        this.value = value;
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

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.converter = (javax.faces.convert.Converter) _values[1];
        this.dir = (String) _values[2];
        this.effect = (com.icesoft.faces.context.effects.Effect) _values[3];
        this.escape = ((Boolean) _values[4]).booleanValue();
        this.escape_set = ((Boolean) _values[5]).booleanValue();
        this.id = (String) _values[6];
        this.lang = (String) _values[7];
        this.nospan = ((Boolean) _values[8]).booleanValue();
        this.nospan_set = ((Boolean) _values[9]).booleanValue();
        this.onclick = (String) _values[10];
        this.onclickeffect = (com.icesoft.faces.context.effects.Effect) _values[11];
        this.ondblclick = (String) _values[12];
        this.ondblclickeffect = (com.icesoft.faces.context.effects.Effect) _values[13];
        this.onkeydown = (String) _values[14];
        this.onkeydowneffect = (com.icesoft.faces.context.effects.Effect) _values[15];
        this.onkeypress = (String) _values[16];
        this.onkeypresseffect = (com.icesoft.faces.context.effects.Effect) _values[17];
        this.onkeyup = (String) _values[18];
        this.onkeyupeffect = (com.icesoft.faces.context.effects.Effect) _values[19];
        this.onmousedown = (String) _values[20];
        this.onmousedowneffect = (com.icesoft.faces.context.effects.Effect) _values[21];
        this.onmousemove = (String) _values[22];
        this.onmousemoveeffect = (com.icesoft.faces.context.effects.Effect) _values[23];
        this.onmouseout = (String) _values[24];
        this.onmouseouteffect = (com.icesoft.faces.context.effects.Effect) _values[25];
        this.onmouseover = (String) _values[26];
        this.onmouseovereffect = (com.icesoft.faces.context.effects.Effect) _values[27];
        this.onmouseup = (String) _values[28];
        this.onmouseupeffect = (com.icesoft.faces.context.effects.Effect) _values[29];
        this.rendered = ((Boolean) _values[30]).booleanValue();
        this.rendered_set = ((Boolean) _values[31]).booleanValue();
        this.renderedOnUserRole = (String) _values[32];
        this.style = (String) _values[33];
        this.styleClass = (String) _values[34];
        this.title = (String) _values[35];
        this.value = (Object) _values[36];
        this.visible = ((Boolean) _values[37]).booleanValue();
        this.visible_set = ((Boolean) _values[38]).booleanValue();
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[39];
        _values[0] = super.saveState(_context);
        _values[1] = this.converter;
        _values[2] = this.dir;
        _values[3] = this.effect;
        _values[4] = this.escape ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.escape_set ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.id;
        _values[7] = this.lang;
        _values[8] = this.nospan ? Boolean.TRUE : Boolean.FALSE;
        _values[9] = this.nospan_set ? Boolean.TRUE : Boolean.FALSE;
        _values[10] = this.onclick;
        _values[11] = this.onclickeffect;
        _values[12] = this.ondblclick;
        _values[13] = this.ondblclickeffect;
        _values[14] = this.onkeydown;
        _values[15] = this.onkeydowneffect;
        _values[16] = this.onkeypress;
        _values[17] = this.onkeypresseffect;
        _values[18] = this.onkeyup;
        _values[19] = this.onkeyupeffect;
        _values[20] = this.onmousedown;
        _values[21] = this.onmousedowneffect;
        _values[22] = this.onmousemove;
        _values[23] = this.onmousemoveeffect;
        _values[24] = this.onmouseout;
        _values[25] = this.onmouseouteffect;
        _values[26] = this.onmouseover;
        _values[27] = this.onmouseovereffect;
        _values[28] = this.onmouseup;
        _values[29] = this.onmouseupeffect;
        _values[30] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[31] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[32] = this.renderedOnUserRole;
        _values[33] = this.style;
        _values[34] = this.styleClass;
        _values[35] = this.title;
        _values[36] = this.value;
        _values[37] = this.visible ? Boolean.TRUE : Boolean.FALSE;
        _values[38] = this.visible_set ? Boolean.TRUE : Boolean.FALSE;
        return _values;
    }

}
