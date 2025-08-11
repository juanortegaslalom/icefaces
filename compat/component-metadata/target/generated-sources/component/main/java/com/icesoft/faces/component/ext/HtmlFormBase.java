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
 * Defines a form region
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class HtmlFormBase extends javax.faces.component.html.HtmlForm {

    /**
     * <p>Construct a new <code>HtmlFormBase</code>.</p>
     */
    public HtmlFormBase() {
        super();
        setRendererType("com.icesoft.faces.Form");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Form";
    }

    // accept
    private String accept = null;

    /**
 * <p>List of content types that a server processing this form will handle 
 * 		correctly</p>
     */
    public String getAccept() {
        if (this.accept != null) {
            return this.accept;
        }
        ValueBinding _vb = getValueBinding("accept");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>List of content types that a server processing this form will handle 
 * 		correctly</p>
     * @see #getAccept()
     */
    public void setAccept(String accept) {
        this.accept = accept;
    }

    // acceptcharset
    private String acceptcharset = null;

    /**
 * <p>List of character encodings for input data that are accepted by the 
 * 		server processing this form.</p>
     */
    public String getAcceptcharset() {
        if (this.acceptcharset != null) {
            return this.acceptcharset;
        }
        ValueBinding _vb = getValueBinding("acceptcharset");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>List of character encodings for input data that are accepted by the 
 * 		server processing this form.</p>
     * @see #getAcceptcharset()
     */
    public void setAcceptcharset(String acceptcharset) {
        this.acceptcharset = acceptcharset;
    }

    // action
    private javax.faces.el.MethodBinding action = null;

    /**
 * <p>MethodBinding representing the application action to invoke when
 *         this component is activated by the user. The expression must
 *         evaluate to a either a String or a public method that takes no
 *         parameters, and returns a String (the logical outcome) which is
 *         passed to the NavigationHandler for this application.</p>
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
 *         this component is activated by the user. The expression must
 *         evaluate to a either a String or a public method that takes no
 *         parameters, and returns a String (the logical outcome) which is
 *         passed to the NavigationHandler for this application.</p>
     * @see #getAction()
     */
    public void setAction(javax.faces.el.MethodBinding action) {
        this.action = action;
    }

    // actionListener
    private javax.faces.el.MethodBinding actionListener = null;

    /**
 * <p>MethodBinding representing an action listener method that will be 
 *         notified when this component is activated by the user. The expression 
 *         must evaluate to a public method that takes an ActionEvent parameter, 
 *         with a return type of void.
 *         
 *         This listener will only be invoked if the target component itself doesn't 
 *         handle the ActionEvent.</p>
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
 *         notified when this component is activated by the user. The expression 
 *         must evaluate to a public method that takes an ActionEvent parameter, 
 *         with a return type of void.
 *         
 *         This listener will only be invoked if the target component itself doesn't 
 *         handle the ActionEvent.</p>
     * @see #getActionListener()
     */
    public void setActionListener(javax.faces.el.MethodBinding actionListener) {
        this.actionListener = actionListener;
    }

    // autocomplete
    private String autocomplete = null;

    /**
 * <p>Passed through to root element.</p>
     */
    public String getAutocomplete() {
        if (this.autocomplete != null) {
            return this.autocomplete;
        }
        ValueBinding _vb = getValueBinding("autocomplete");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Passed through to root element.</p>
     * @see #getAutocomplete()
     */
    public void setAutocomplete(String autocomplete) {
        this.autocomplete = autocomplete;
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

    // enctype
    private String enctype = null;

    /**
 * <p>Content type used to submit the form to the server. If not 
 * 		 specified, the default value is "application/x-www-form-urlencoded".</p>
     */
    public String getEnctype() {
        if (this.enctype != null) {
            return this.enctype;
        }
        ValueBinding _vb = getValueBinding("enctype");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "application/x-www-form-urlencoded";
    }

    /**
 * <p>Content type used to submit the form to the server. If not 
 * 		 specified, the default value is "application/x-www-form-urlencoded".</p>
     * @see #getEnctype()
     */
    public void setEnctype(String enctype) {
        this.enctype = enctype;
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
 * 		element is rendered. This value must be passed through as the "class" 
 * 		attribute on generated markup.<br/>
 * 		The default class would be rendered as <b>iceFrm</b></p>
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
 * 		element is rendered. This value must be passed through as the "class" 
 * 		attribute on generated markup.<br/>
 * 		The default class would be rendered as <b>iceFrm</b></p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // submitted
    private boolean submitted = false;
    private boolean submitted_set = false;

    /**
 * <p>submitted</p>
     */
    public boolean isSubmitted() {
        if (this.submitted_set) {
            return this.submitted;
        }
        ValueBinding _vb = getValueBinding("submitted");
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
 * <p>submitted</p>
     * @see #isSubmitted()
     */
    public void setSubmitted(boolean submitted) {
        this.submitted = submitted;
        this.submitted_set = true;
    }

    // target
    private String target = null;

    /**
 * <p>Name of a frame where the response retrieved after this form submit is 
 * 		to be displayed.</p>
     */
    public String getTarget() {
        if (this.target != null) {
            return this.target;
        }
        ValueBinding _vb = getValueBinding("target");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Name of a frame where the response retrieved after this form submit is 
 * 		to be displayed.</p>
     * @see #getTarget()
     */
    public void setTarget(String target) {
        this.target = target;
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

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.accept = (String) _values[1];
        this.acceptcharset = (String) _values[2];
        this.action = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[3]);
        this.actionListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[4]);
        this.autocomplete = (String) _values[5];
        this.dir = (String) _values[6];
        this.enctype = (String) _values[7];
        this.id = (String) _values[8];
        this.lang = (String) _values[9];
        this.onclick = (String) _values[10];
        this.ondblclick = (String) _values[11];
        this.onkeydown = (String) _values[12];
        this.onkeypress = (String) _values[13];
        this.onkeyup = (String) _values[14];
        this.onmousedown = (String) _values[15];
        this.onmousemove = (String) _values[16];
        this.onmouseout = (String) _values[17];
        this.onmouseover = (String) _values[18];
        this.onmouseup = (String) _values[19];
        this.partialSubmit = ((Boolean) _values[20]).booleanValue();
        this.partialSubmit_set = ((Boolean) _values[21]).booleanValue();
        this.rendered = ((Boolean) _values[22]).booleanValue();
        this.rendered_set = ((Boolean) _values[23]).booleanValue();
        this.renderedOnUserRole = (String) _values[24];
        this.style = (String) _values[25];
        this.styleClass = (String) _values[26];
        this.submitted = ((Boolean) _values[27]).booleanValue();
        this.submitted_set = ((Boolean) _values[28]).booleanValue();
        this.target = (String) _values[29];
        this.title = (String) _values[30];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[31];
        _values[0] = super.saveState(_context);
        _values[1] = this.accept;
        _values[2] = this.acceptcharset;
        _values[3] = saveAttachedState(_context, action);
        _values[4] = saveAttachedState(_context, actionListener);
        _values[5] = this.autocomplete;
        _values[6] = this.dir;
        _values[7] = this.enctype;
        _values[8] = this.id;
        _values[9] = this.lang;
        _values[10] = this.onclick;
        _values[11] = this.ondblclick;
        _values[12] = this.onkeydown;
        _values[13] = this.onkeypress;
        _values[14] = this.onkeyup;
        _values[15] = this.onmousedown;
        _values[16] = this.onmousemove;
        _values[17] = this.onmouseout;
        _values[18] = this.onmouseover;
        _values[19] = this.onmouseup;
        _values[20] = this.partialSubmit ? Boolean.TRUE : Boolean.FALSE;
        _values[21] = this.partialSubmit_set ? Boolean.TRUE : Boolean.FALSE;
        _values[22] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[23] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[24] = this.renderedOnUserRole;
        _values[25] = this.style;
        _values[26] = this.styleClass;
        _values[27] = this.submitted ? Boolean.TRUE : Boolean.FALSE;
        _values[28] = this.submitted_set ? Boolean.TRUE : Boolean.FALSE;
        _values[29] = this.target;
        _values[30] = this.title;
        return _values;
    }

}
