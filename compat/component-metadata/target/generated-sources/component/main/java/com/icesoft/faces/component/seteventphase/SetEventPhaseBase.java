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
package com.icesoft.faces.component.seteventphase;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Changes the phase that events will be broadcast in, for events 
 *         originating from components in its child hierarchy.
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class SetEventPhaseBase extends javax.faces.component.UIComponentBase {

    /**
     * <p>Construct a new <code>SetEventPhaseBase</code>.</p>
     */
    public SetEventPhaseBase() {
        super();
        setRendererType("null");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.SetEventPhase";
    }

    // disabled
    private boolean disabled = false;
    private boolean disabled_set = false;

    /**
 * <p>Disable the altering of event phases. This will not disable child input components, though.</p>
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
 * <p>Disable the altering of event phases. This will not disable child input components, though.</p>
     * @see #isDisabled()
     */
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
        this.disabled_set = true;
    }

    // events
    private String events = null;

    /**
 * <p>The types of events that should be changed to be broadcasted in the 
 *         different phase. Specified as a space delimited list of event class 
 *         names. If a short version of the class name is given, without a 
 *         package name, then "javax.faces.event" will be assumed. An event will 
 *         be determined to match the entries in this property if it passes the 
 *         instanceof test, meaning that if it is exactly that class, or is a
 *         subclass. If all events should have their phase changed, simply specify
 *         FacesEvent as the value of this property.</p>
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
 * <p>The types of events that should be changed to be broadcasted in the 
 *         different phase. Specified as a space delimited list of event class 
 *         names. If a short version of the class name is given, without a 
 *         package name, then "javax.faces.event" will be assumed. An event will 
 *         be determined to match the entries in this property if it passes the 
 *         instanceof test, meaning that if it is exactly that class, or is a
 *         subclass. If all events should have their phase changed, simply specify
 *         FacesEvent as the value of this property.</p>
     * @see #getEvents()
     */
    public void setEvents(String events) {
        this.events = events;
    }

    // phase
    private String phase = null;

    /**
 * <p>The name of the phase to change events to be broadcasted in. It can be 
 *         one of: ANY, APPLY_REQUEST_VALUES, PROCESS_VALIDATIONS, 
 *         UPDATE_MODEL_VALUES, INVOKE_APPLICATION.</p>
     */
    public String getPhase() {
        if (this.phase != null) {
            return this.phase;
        }
        ValueBinding _vb = getValueBinding("phase");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The name of the phase to change events to be broadcasted in. It can be 
 *         one of: ANY, APPLY_REQUEST_VALUES, PROCESS_VALIDATIONS, 
 *         UPDATE_MODEL_VALUES, INVOKE_APPLICATION.</p>
     * @see #getPhase()
     */
    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.disabled = ((Boolean) _values[1]).booleanValue();
        this.disabled_set = ((Boolean) _values[2]).booleanValue();
        this.events = (String) _values[3];
        this.phase = (String) _values[4];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[5];
        _values[0] = super.saveState(_context);
        _values[1] = this.disabled ? Boolean.TRUE : Boolean.FALSE;
        _values[2] = this.disabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.events;
        _values[4] = this.phase;
        return _values;
    }

}
