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
package com.icesoft.faces.component.outputconnectionstatus;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Displays the status of the network connection between the client browser and the server
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class OutputConnectionStatusBase extends javax.faces.component.html.HtmlPanelGroup {

    /**
     * <p>Construct a new <code>OutputConnectionStatusBase</code>.</p>
     */
    public OutputConnectionStatusBase() {
        super();
        setRendererType("com.icesoft.faces.OutputConnectionStatusRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Panel";
    }

    // activeLabel
    private String activeLabel = null;

    /**
 * <p>The connection status component would show this label, when The
 *     connection is alive and there is a request pending.</p>
     */
    public String getActiveLabel() {
        if (this.activeLabel != null) {
            return this.activeLabel;
        }
        ValueBinding _vb = getValueBinding("activeLabel");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "";
    }

    /**
 * <p>The connection status component would show this label, when The
 *     connection is alive and there is a request pending.</p>
     * @see #getActiveLabel()
     */
    public void setActiveLabel(String activeLabel) {
        this.activeLabel = activeLabel;
    }

    // cautionLabel
    private String cautionLabel = null;

    /**
 * <p>The connection status component would show this label, when The
 *         connection state is unknown as a heartbeat ping has not been
 *         acknowledged. However, connection recovery activities are in
 *         progress which will change the state to either "Connected" or
 *         "Disconnected" status.</p>
     */
    public String getCautionLabel() {
        if (this.cautionLabel != null) {
            return this.cautionLabel;
        }
        ValueBinding _vb = getValueBinding("cautionLabel");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "";
    }

    /**
 * <p>The connection status component would show this label, when The
 *         connection state is unknown as a heartbeat ping has not been
 *         acknowledged. However, connection recovery activities are in
 *         progress which will change the state to either "Connected" or
 *         "Disconnected" status.</p>
     * @see #getCautionLabel()
     */
    public void setCautionLabel(String cautionLabel) {
        this.cautionLabel = cautionLabel;
    }

    // disconnectedLabel
    private String disconnectedLabel = null;

    /**
 * <p>The connection status component would show this label, when The
 *     connection has been lost, either due to network error or the
 *     application session expiring.</p>
     */
    public String getDisconnectedLabel() {
        if (this.disconnectedLabel != null) {
            return this.disconnectedLabel;
        }
        ValueBinding _vb = getValueBinding("disconnectedLabel");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "";
    }

    /**
 * <p>The connection status component would show this label, when The
 *     connection has been lost, either due to network error or the
 *     application session expiring.</p>
     * @see #getDisconnectedLabel()
     */
    public void setDisconnectedLabel(String disconnectedLabel) {
        this.disconnectedLabel = disconnectedLabel;
    }

    // displayHourglassWhenActive
    private boolean displayHourglassWhenActive = false;
    private boolean displayHourglassWhenActive_set = false;

    /**
 * <p>Whether to render hour-glass pointer together with the element corresponding to busy state.</p>
     */
    public boolean isDisplayHourglassWhenActive() {
        if (this.displayHourglassWhenActive_set) {
            return this.displayHourglassWhenActive;
        }
        ValueBinding _vb = getValueBinding("displayHourglassWhenActive");
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
 * <p>Whether to render hour-glass pointer together with the element corresponding to busy state.</p>
     * @see #isDisplayHourglassWhenActive()
     */
    public void setDisplayHourglassWhenActive(boolean displayHourglassWhenActive) {
        this.displayHourglassWhenActive = displayHourglassWhenActive;
        this.displayHourglassWhenActive_set = true;
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

    // inactiveLabel
    private String inactiveLabel = null;

    /**
 * <p>The connection status component would show this label, when the
 *     connection is alive and there is no pending activity.</p>
     */
    public String getInactiveLabel() {
        if (this.inactiveLabel != null) {
            return this.inactiveLabel;
        }
        ValueBinding _vb = getValueBinding("inactiveLabel");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "";
    }

    /**
 * <p>The connection status component would show this label, when the
 *     connection is alive and there is no pending activity.</p>
     * @see #getInactiveLabel()
     */
    public void setInactiveLabel(String inactiveLabel) {
        this.inactiveLabel = inactiveLabel;
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

    // showPopupOnDisconnect
    private boolean showPopupOnDisconnect = false;
    private boolean showPopupOnDisconnect_set = false;

    /**
 * <p>Whether to popup a reload dialog when connection is lost: true or false (default).</p>
     */
    public boolean isShowPopupOnDisconnect() {
        if (this.showPopupOnDisconnect_set) {
            return this.showPopupOnDisconnect;
        }
        ValueBinding _vb = getValueBinding("showPopupOnDisconnect");
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
 * <p>Whether to popup a reload dialog when connection is lost: true or false (default).</p>
     * @see #isShowPopupOnDisconnect()
     */
    public void setShowPopupOnDisconnect(boolean showPopupOnDisconnect) {
        this.showPopupOnDisconnect = showPopupOnDisconnect;
        this.showPopupOnDisconnect_set = true;
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
 * 		</p>
 *         <p>Defines the base class name for all style classes.
 *         Default value is <b>iceOutConStat</b></p>
 *               </p><ul>
 *                 <li>iceOutConStat</li>
 *                 <li>iceOutConStatInactv</li>
 *                 <li>iceOutConStatActv</li>
 *                 <li>iceOutConStatCaution</li>
 *                 <li>iceOutConStatDisconnect</li>
 *               </ul>
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
 * 		</p>
 *         <p>Defines the base class name for all style classes.
 *         Default value is <b>iceOutConStat</b></p>
 *               </p><ul>
 *                 <li>iceOutConStat</li>
 *                 <li>iceOutConStatInactv</li>
 *                 <li>iceOutConStatActv</li>
 *                 <li>iceOutConStatCaution</li>
 *                 <li>iceOutConStatDisconnect</li>
 *               </ul>
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
        this.activeLabel = (String) _values[1];
        this.cautionLabel = (String) _values[2];
        this.disconnectedLabel = (String) _values[3];
        this.displayHourglassWhenActive = ((Boolean) _values[4]).booleanValue();
        this.displayHourglassWhenActive_set = ((Boolean) _values[5]).booleanValue();
        this.id = (String) _values[6];
        this.inactiveLabel = (String) _values[7];
        this.rendered = ((Boolean) _values[8]).booleanValue();
        this.rendered_set = ((Boolean) _values[9]).booleanValue();
        this.renderedOnUserRole = (String) _values[10];
        this.showPopupOnDisconnect = ((Boolean) _values[11]).booleanValue();
        this.showPopupOnDisconnect_set = ((Boolean) _values[12]).booleanValue();
        this.style = (String) _values[13];
        this.styleClass = (String) _values[14];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[15];
        _values[0] = super.saveState(_context);
        _values[1] = this.activeLabel;
        _values[2] = this.cautionLabel;
        _values[3] = this.disconnectedLabel;
        _values[4] = this.displayHourglassWhenActive ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.displayHourglassWhenActive_set ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.id;
        _values[7] = this.inactiveLabel;
        _values[8] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[9] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[10] = this.renderedOnUserRole;
        _values[11] = this.showPopupOnDisconnect ? Boolean.TRUE : Boolean.FALSE;
        _values[12] = this.showPopupOnDisconnect_set ? Boolean.TRUE : Boolean.FALSE;
        _values[13] = this.style;
        _values[14] = this.styleClass;
        return _values;
    }

}
