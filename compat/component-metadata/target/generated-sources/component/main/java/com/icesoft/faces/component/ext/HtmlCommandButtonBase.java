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
 * A button that can Submit or Reset a form
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class HtmlCommandButtonBase extends javax.faces.component.html.HtmlCommandButton {

    /**
     * <p>Construct a new <code>HtmlCommandButtonBase</code>.</p>
     */
    public HtmlCommandButtonBase() {
        super();
        setRendererType("com.icesoft.faces.Button");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Command";
    }

    // accesskey
    private String accesskey = null;

    /**
 * <p>Access key that, when pressed, transfers focus to this element.</p>
     */
    public String getAccesskey() {
        if (this.accesskey != null) {
            return this.accesskey;
        }
        ValueBinding _vb = getValueBinding("accesskey");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Access key that, when pressed, transfers focus to this element.</p>
     * @see #getAccesskey()
     */
    public void setAccesskey(String accesskey) {
        this.accesskey = accesskey;
    }

    // action
    private javax.faces.el.MethodBinding action = null;

    /**
 * <p>MethodBinding representing the application action to invoke when
 * 		this component is activated by the user. The expression must
 * 		evaluate to a either a String or a public method that takes no
 * 		parameters, and returns a String (the logical outcome) which is
 * 		passed to the NavigationHandler for this application.</p>
     */
    public javax.faces.el.MethodBinding getAction() {
        if (this.action != null) {
            return this.action;
        }
        ValueBinding _vb = getValueBinding("action");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>MethodBinding representing the application action to invoke when
 * 		this component is activated by the user. The expression must
 * 		evaluate to a either a String or a public method that takes no
 * 		parameters, and returns a String (the logical outcome) which is
 * 		passed to the NavigationHandler for this application.</p>
     * @see #getAction()
     */
    public void setAction(javax.faces.el.MethodBinding action) {
        this.action = action;
    }

    // actionListener
    private javax.faces.el.MethodBinding actionListener = null;

    /**
 * <p>MethodBinding representing an action listener method that will be 
 * 		notified when this component is activated by the user. The expression 
 * 		must evaluate to a public method that takes an ActionEvent parameter, 
 * 		with a return type of void.</p>
     */
    public javax.faces.el.MethodBinding getActionListener() {
        if (this.actionListener != null) {
            return this.actionListener;
        }
        ValueBinding _vb = getValueBinding("actionListener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>MethodBinding representing an action listener method that will be 
 * 		notified when this component is activated by the user. The expression 
 * 		must evaluate to a public method that takes an ActionEvent parameter, 
 * 		with a return type of void.</p>
     * @see #getActionListener()
     */
    public void setActionListener(javax.faces.el.MethodBinding actionListener) {
        this.actionListener = actionListener;
    }

    // alt
    private String alt = null;

    /**
 * <p>Alternate textual description of the element rendered by this component.</p>
     */
    public String getAlt() {
        if (this.alt != null) {
            return this.alt;
        }
        ValueBinding _vb = getValueBinding("alt");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Alternate textual description of the element rendered by this component.</p>
     * @see #getAlt()
     */
    public void setAlt(String alt) {
        this.alt = alt;
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

    // image
    private String image = null;

    /**
 * <p>Absolute or relative URL of the image to be displayed for this button. 
 *         If specified, this "input" element will be of type "image". Otherwise, 
 *         it will be of the type specified by the "type" property with a label 
 *         specified by the "value" property.</p>
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
 * <p>Absolute or relative URL of the image to be displayed for this button. 
 *         If specified, this "input" element will be of type "image". Otherwise, 
 *         it will be of the type specified by the "type" property with a label 
 *         specified by the "value" property.</p>
     * @see #getImage()
     */
    public void setImage(String image) {
        this.image = image;
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

    // onblur
    private String onblur = null;

    /**
 * <p>Javascript code executed when this element loses focus.</p>
     */
    public String getOnblur() {
        if (this.onblur != null) {
            return this.onblur;
        }
        ValueBinding _vb = getValueBinding("onblur");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Javascript code executed when this element loses focus.</p>
     * @see #getOnblur()
     */
    public void setOnblur(String onblur) {
        this.onblur = onblur;
    }

    // onchange
    private String onchange = null;

    /**
 * <p>Javascript code executed when this element loses focus and its value 
 * 		has been modified since gaining focus.</p>
     */
    public String getOnchange() {
        if (this.onchange != null) {
            return this.onchange;
        }
        ValueBinding _vb = getValueBinding("onchange");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Javascript code executed when this element loses focus and its value 
 * 		has been modified since gaining focus.</p>
     * @see #getOnchange()
     */
    public void setOnchange(String onchange) {
        this.onchange = onchange;
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

    // onfocus
    private String onfocus = null;

    /**
 * <p>Javascript code executed when this element receives focus.</p>
     */
    public String getOnfocus() {
        if (this.onfocus != null) {
            return this.onfocus;
        }
        ValueBinding _vb = getValueBinding("onfocus");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Javascript code executed when this element receives focus.</p>
     * @see #getOnfocus()
     */
    public void setOnfocus(String onfocus) {
        this.onfocus = onfocus;
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

    // onselect
    private String onselect = null;

    /**
 * <p>Javascript code executed when text within this element is selected by 
 * 		the user.</p>
     */
    public String getOnselect() {
        if (this.onselect != null) {
            return this.onselect;
        }
        ValueBinding _vb = getValueBinding("onselect");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Javascript code executed when text within this element is selected by 
 * 		the user.</p>
     * @see #getOnselect()
     */
    public void setOnselect(String onselect) {
        this.onselect = onselect;
    }

    // panelConfirmation
    private String panelConfirmation = null;

    /**
 * <p>The id of the ice:panelConfirmation component linked to this button.</p>
     */
    public String getPanelConfirmation() {
        if (this.panelConfirmation != null) {
            return this.panelConfirmation;
        }
        ValueBinding _vb = getValueBinding("panelConfirmation");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The id of the ice:panelConfirmation component linked to this button.</p>
     * @see #getPanelConfirmation()
     */
    public void setPanelConfirmation(String panelConfirmation) {
        this.panelConfirmation = panelConfirmation;
    }

    // partialSubmit
    private boolean partialSubmit = false;
    private boolean partialSubmit_set = false;

    /**
 * <p>Enable component to perform partial submit. Default value is false.</p>
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
 * <p>Enable component to perform partial submit. Default value is false.</p>
     * @see #isPartialSubmit()
     */
    public void setPartialSubmit(boolean partialSubmit) {
        this.partialSubmit = partialSubmit;
        this.partialSubmit_set = true;
    }

    // readonly
    private boolean readonly = false;
    private boolean readonly_set = false;

    /**
 * <p>Flag indicating that this component will prohibit changes by the user. 
 * 		The element may receive focus unless it has also been disabled. This
 *         attribute is valid for input types "text" and "password" only. It is
 *         non-functional for other input types like "radio" or "checkbox".</p>
     */
    public boolean isReadonly() {
        if (this.readonly_set) {
            return this.readonly;
        }
        ValueBinding _vb = getValueBinding("readonly");
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
 * <p>Flag indicating that this component will prohibit changes by the user. 
 * 		The element may receive focus unless it has also been disabled. This
 *         attribute is valid for input types "text" and "password" only. It is
 *         non-functional for other input types like "radio" or "checkbox".</p>
     * @see #isReadonly()
     */
    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
        this.readonly_set = true;
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
 * <p>The base name for all style classes. Default value is <b>iceCmdBtn</b> if 
 * 		enabled and <b>iceCmdBtn-dis</b> if disabled.</p>
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
 * <p>The base name for all style classes. Default value is <b>iceCmdBtn</b> if 
 * 		enabled and <b>iceCmdBtn-dis</b> if disabled.</p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
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

    // type
    private String type = null;

    /**
 * <p>Type of button to create. Valid values are "submit" and "reset". If not 
 *         specified, or not a valid value, the default value is "submit".</p>
     */
    public String getType() {
        if (this.type != null) {
            return this.type;
        }
        ValueBinding _vb = getValueBinding("type");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "submit";
    }

    /**
 * <p>Type of button to create. Valid values are "submit" and "reset". If not 
 *         specified, or not a valid value, the default value is "submit".</p>
     * @see #getType()
     */
    public void setType(String type) {
        this.type = type;
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
        this.accesskey = (String) _values[1];
        this.action = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[2]);
        this.actionListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[3]);
        this.alt = (String) _values[4];
        this.dir = (String) _values[5];
        this.disabled = ((Boolean) _values[6]).booleanValue();
        this.disabled_set = ((Boolean) _values[7]).booleanValue();
        this.effect = (com.icesoft.faces.context.effects.Effect) _values[8];
        this.enabledOnUserRole = (String) _values[9];
        this.id = (String) _values[10];
        this.image = (String) _values[11];
        this.immediate = ((Boolean) _values[12]).booleanValue();
        this.immediate_set = ((Boolean) _values[13]).booleanValue();
        this.lang = (String) _values[14];
        this.onblur = (String) _values[15];
        this.onchange = (String) _values[16];
        this.onclick = (String) _values[17];
        this.onclickeffect = (com.icesoft.faces.context.effects.Effect) _values[18];
        this.ondblclick = (String) _values[19];
        this.ondblclickeffect = (com.icesoft.faces.context.effects.Effect) _values[20];
        this.onfocus = (String) _values[21];
        this.onkeydown = (String) _values[22];
        this.onkeydowneffect = (com.icesoft.faces.context.effects.Effect) _values[23];
        this.onkeypress = (String) _values[24];
        this.onkeypresseffect = (com.icesoft.faces.context.effects.Effect) _values[25];
        this.onkeyup = (String) _values[26];
        this.onkeyupeffect = (com.icesoft.faces.context.effects.Effect) _values[27];
        this.onmousedown = (String) _values[28];
        this.onmousedowneffect = (com.icesoft.faces.context.effects.Effect) _values[29];
        this.onmousemove = (String) _values[30];
        this.onmousemoveeffect = (com.icesoft.faces.context.effects.Effect) _values[31];
        this.onmouseout = (String) _values[32];
        this.onmouseouteffect = (com.icesoft.faces.context.effects.Effect) _values[33];
        this.onmouseover = (String) _values[34];
        this.onmouseovereffect = (com.icesoft.faces.context.effects.Effect) _values[35];
        this.onmouseup = (String) _values[36];
        this.onmouseupeffect = (com.icesoft.faces.context.effects.Effect) _values[37];
        this.onselect = (String) _values[38];
        this.panelConfirmation = (String) _values[39];
        this.partialSubmit = ((Boolean) _values[40]).booleanValue();
        this.partialSubmit_set = ((Boolean) _values[41]).booleanValue();
        this.readonly = ((Boolean) _values[42]).booleanValue();
        this.readonly_set = ((Boolean) _values[43]).booleanValue();
        this.rendered = ((Boolean) _values[44]).booleanValue();
        this.rendered_set = ((Boolean) _values[45]).booleanValue();
        this.renderedOnUserRole = (String) _values[46];
        this.style = (String) _values[47];
        this.styleClass = (String) _values[48];
        this.tabindex = (String) _values[49];
        this.type = (String) _values[50];
        this.value = (Object) _values[51];
        this.visible = ((Boolean) _values[52]).booleanValue();
        this.visible_set = ((Boolean) _values[53]).booleanValue();
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[54];
        _values[0] = super.saveState(_context);
        _values[1] = this.accesskey;
        _values[2] = saveAttachedState(_context, action);
        _values[3] = saveAttachedState(_context, actionListener);
        _values[4] = this.alt;
        _values[5] = this.dir;
        _values[6] = this.disabled ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.disabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.effect;
        _values[9] = this.enabledOnUserRole;
        _values[10] = this.id;
        _values[11] = this.image;
        _values[12] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[13] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[14] = this.lang;
        _values[15] = this.onblur;
        _values[16] = this.onchange;
        _values[17] = this.onclick;
        _values[18] = this.onclickeffect;
        _values[19] = this.ondblclick;
        _values[20] = this.ondblclickeffect;
        _values[21] = this.onfocus;
        _values[22] = this.onkeydown;
        _values[23] = this.onkeydowneffect;
        _values[24] = this.onkeypress;
        _values[25] = this.onkeypresseffect;
        _values[26] = this.onkeyup;
        _values[27] = this.onkeyupeffect;
        _values[28] = this.onmousedown;
        _values[29] = this.onmousedowneffect;
        _values[30] = this.onmousemove;
        _values[31] = this.onmousemoveeffect;
        _values[32] = this.onmouseout;
        _values[33] = this.onmouseouteffect;
        _values[34] = this.onmouseover;
        _values[35] = this.onmouseovereffect;
        _values[36] = this.onmouseup;
        _values[37] = this.onmouseupeffect;
        _values[38] = this.onselect;
        _values[39] = this.panelConfirmation;
        _values[40] = this.partialSubmit ? Boolean.TRUE : Boolean.FALSE;
        _values[41] = this.partialSubmit_set ? Boolean.TRUE : Boolean.FALSE;
        _values[42] = this.readonly ? Boolean.TRUE : Boolean.FALSE;
        _values[43] = this.readonly_set ? Boolean.TRUE : Boolean.FALSE;
        _values[44] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[45] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[46] = this.renderedOnUserRole;
        _values[47] = this.style;
        _values[48] = this.styleClass;
        _values[49] = this.tabindex;
        _values[50] = this.type;
        _values[51] = this.value;
        _values[52] = this.visible ? Boolean.TRUE : Boolean.FALSE;
        _values[53] = this.visible_set ? Boolean.TRUE : Boolean.FALSE;
        return _values;
    }

}
