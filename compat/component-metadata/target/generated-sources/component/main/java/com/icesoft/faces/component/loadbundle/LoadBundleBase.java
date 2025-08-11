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
package com.icesoft.faces.component.loadbundle;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Load bundle
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class LoadBundleBase extends javax.faces.component.UIOutput {

    /**
     * <p>Construct a new <code>LoadBundleBase</code>.</p>
     */
    public LoadBundleBase() {
        super();
        setRendererType("null");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.LoadBundle";
    }

    // basename
    private String basename = null;

    /**
 * <p>Base name of the resource bundle to be loaded.</p>
     */
    public String getBasename() {
        if (this.basename != null) {
            return this.basename;
        }
        ValueBinding _vb = getValueBinding("basename");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Base name of the resource bundle to be loaded.</p>
     * @see #getBasename()
     */
    public void setBasename(String basename) {
        this.basename = basename;
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

    // var
    private String _var = null;

    /**
 * <p>Name of a request scope attribute under which the resource bundle will be exposed.</p>
     */
    public String getVar() {
        if (this._var != null) {
            return this._var;
        }
        ValueBinding _vb = getValueBinding("var");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Name of a request scope attribute under which the resource bundle will be exposed.</p>
     * @see #getVar()
     */
    public void setVar(String _var) {
        this._var = _var;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.basename = (String) _values[1];
        this.id = (String) _values[2];
        this.rendered = ((Boolean) _values[3]).booleanValue();
        this.rendered_set = ((Boolean) _values[4]).booleanValue();
        this._var = (String) _values[5];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[6];
        _values[0] = super.saveState(_context);
        _values[1] = this.basename;
        _values[2] = this.id;
        _values[3] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this._var;
        return _values;
    }

}
