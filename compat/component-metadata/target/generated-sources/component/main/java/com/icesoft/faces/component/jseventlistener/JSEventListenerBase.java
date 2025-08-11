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
package com.icesoft.faces.component.jseventlistener;

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

abstract class JSEventListenerBase extends javax.faces.component.UICommand {

    /**
     * <p>Construct a new <code>JSEventListenerBase</code>.</p>
     */
    public JSEventListenerBase() {
        super();
        setRendererType("com.icesoft.faces.JSEventListenerRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Command";
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

    // events
    private String events = null;

    /**
 * <p>List of "," separated events (e.g) events="click[, keydown, ...]".</p>
     */
    public String getEvents() {
        if (this.events != null) {
            return this.events;
        }
        ValueBinding _vb = getValueBinding("events");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>List of "," separated events (e.g) events="click[, keydown, ...]".</p>
     * @see #getEvents()
     */
    public void setEvents(String events) {
        this.events = events;
    }

    // handler
    private String handler = null;

    /**
 * <p>Its an optional attribute. Can be used to define a callback handlers 
 *         for the events listed in "events" attribute(e.g.) <br/>
 *         &lt;ice:jsEventListener events="click" handler="myClickHandler"&gt;<br/> 
 *         .... <br/><br/>       
 * 
 *         &lt;ice:jsEventListener events="click, keydown" handler="myHandler"&gt;<br/>
 *         ....</p>
     */
    public String getHandler() {
        if (this.handler != null) {
            return this.handler;
        }
        ValueBinding _vb = getValueBinding("handler");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Its an optional attribute. Can be used to define a callback handlers 
 *         for the events listed in "events" attribute(e.g.) <br/>
 *         &lt;ice:jsEventListener events="click" handler="myClickHandler"&gt;<br/> 
 *         .... <br/><br/>       
 * 
 *         &lt;ice:jsEventListener events="click, keydown" handler="myHandler"&gt;<br/>
 *         ....</p>
     * @see #getHandler()
     */
    public void setHandler(String handler) {
        this.handler = handler;
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
 *         element is rendered. This value must be passed through as the "class" 
 *         attribute on generated markup. <br/></p>
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
 *         element is rendered. This value must be passed through as the "class" 
 *         attribute on generated markup. <br/></p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.action = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[1]);
        this.actionListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[2]);
        this.events = (String) _values[3];
        this.handler = (String) _values[4];
        this.immediate = ((Boolean) _values[5]).booleanValue();
        this.immediate_set = ((Boolean) _values[6]).booleanValue();
        this.style = (String) _values[7];
        this.styleClass = (String) _values[8];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[9];
        _values[0] = super.saveState(_context);
        _values[1] = saveAttachedState(_context, action);
        _values[2] = saveAttachedState(_context, actionListener);
        _values[3] = this.events;
        _values[4] = this.handler;
        _values[5] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.style;
        _values[8] = this.styleClass;
        return _values;
    }

}
