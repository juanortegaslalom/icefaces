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
package com.icesoft.faces.component.gmap;

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

abstract class GMapControlBase extends javax.faces.component.UIPanel {

    /**
     * <p>Construct a new <code>GMapControlBase</code>.</p>
     */
    public GMapControlBase() {
        super();
        setRendererType("null");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.GMapControl";
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

    // name
    private String name = null;

    /**
 * <p>The name represents the control of the google map. The following are the valid values.
 *         <ul>
 *             <li>GSmallMapControl</li>
 *             <li>GLargeMapControl</li>
 *             <li>GSmallZoomControl</li>
 *             <li>GScaleControl</li>
 *             <li>GMapTypeControl</li>
 *             <li>GOverviewMapControl</li>                                                                        
 *         </ul></p>
     */
    public String getName() {
        if (this.name != null) {
            return this.name;
        }
        ValueBinding _vb = getValueBinding("name");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "GLargeMapControl";
    }

    /**
 * <p>The name represents the control of the google map. The following are the valid values.
 *         <ul>
 *             <li>GSmallMapControl</li>
 *             <li>GLargeMapControl</li>
 *             <li>GSmallZoomControl</li>
 *             <li>GScaleControl</li>
 *             <li>GMapTypeControl</li>
 *             <li>GOverviewMapControl</li>                                                                        
 *         </ul></p>
     * @see #getName()
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.id = (String) _values[1];
        this.name = (String) _values[2];
        this.rendered = ((Boolean) _values[3]).booleanValue();
        this.rendered_set = ((Boolean) _values[4]).booleanValue();
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[5];
        _values[0] = super.saveState(_context);
        _values[1] = this.id;
        _values[2] = this.name;
        _values[3] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        return _values;
    }

}
