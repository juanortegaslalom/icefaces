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
 * A multiple-choice control represented as a checkbox.
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class HtmlCheckboxBase extends javax.faces.component.UIComponentBase {

    /**
     * <p>Construct a new <code>HtmlCheckboxBase</code>.</p>
     */
    public HtmlCheckboxBase() {
        super();
        setRendererType("com.icesoft.faces.Checkbox");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.HtmlCheckbox";
    }

    // for
    private String _for = null;

    /**
 * <p>ID of the selectManyCheckbox component to which this checkbox belongs.</p>
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
 * <p>ID of the selectManyCheckbox component to which this checkbox belongs.</p>
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

    // index
    private int index = Integer.MIN_VALUE;
    private boolean index_set = false;

    /**
 * <p>Index of the SelectItem mapped to this checkbox, starting with zero.</p>
     */
    public int getIndex() {
        if (this.index_set) {
            return this.index;
        }
        ValueBinding _vb = getValueBinding("index");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return Integer.MIN_VALUE;
            } else {
                return ((Integer) _result).intValue();
            }
        }
        return Integer.MIN_VALUE;
    }

    /**
 * <p>Index of the SelectItem mapped to this checkbox, starting with zero.</p>
     * @see #getIndex()
     */
    public void setIndex(int index) {
        this.index = index;
        this.index_set = true;
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

    // title
    private String title = null;

    /**
 * <p>Advisory title information about markup elements generated for
 *         this component.</p>
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
 *         this component.</p>
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
        this._for = (String) _values[1];
        this.id = (String) _values[2];
        this.index = ((Integer) _values[3]).intValue();
        this.index_set = ((Boolean) _values[4]).booleanValue();
        this.rendered = ((Boolean) _values[5]).booleanValue();
        this.rendered_set = ((Boolean) _values[6]).booleanValue();
        this.title = (String) _values[7];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[8];
        _values[0] = super.saveState(_context);
        _values[1] = this._for;
        _values[2] = this.id;
        _values[3] = new Integer(this.index);
        _values[4] = this.index_set ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.title;
        return _values;
    }

}
