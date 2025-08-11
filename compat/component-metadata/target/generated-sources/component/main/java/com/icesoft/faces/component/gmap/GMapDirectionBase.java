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

abstract class GMapDirectionBase extends javax.faces.component.UIPanel {

    /**
     * <p>Construct a new <code>GMapDirectionBase</code>.</p>
     */
    public GMapDirectionBase() {
        super();
        setRendererType("null");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.GMapDirection";
    }

    // from
    private String from = null;

    /**
 * <p>Point A</p>
     */
    public String getFrom() {
        if (this.from != null) {
            return this.from;
        }
        ValueBinding _vb = getValueBinding("from");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Point A</p>
     * @see #getFrom()
     */
    public void setFrom(String from) {
        this.from = from;
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

    // locateAddress
    private boolean locateAddress = false;
    private boolean locateAddress_set = false;

    /**
 * <p>This attribute tells to the map to get the direction if set to true.</p>
     */
    public boolean isLocateAddress() {
        if (this.locateAddress_set) {
            return this.locateAddress;
        }
        ValueBinding _vb = getValueBinding("locateAddress");
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
 * <p>This attribute tells to the map to get the direction if set to true.</p>
     * @see #isLocateAddress()
     */
    public void setLocateAddress(boolean locateAddress) {
        this.locateAddress = locateAddress;
        this.locateAddress_set = true;
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

    // textualDivId
    private String textualDivId = null;

    /**
 * <p>This attribute reference the id of the panelGroup, that displays the textual direction. (e.g.)<br/>
 *         
 *         &lt;ice:GMap&gt;<br/>
 *              &lt;ice:GDirection textualDivId="textDiv" ...../&gt;</br>
 *          &lt;/ice:GMap&gt; </br>
 *          &lt;ice:panelGroup id="textDiv"/&gt;</p>
     */
    public String getTextualDivId() {
        if (this.textualDivId != null) {
            return this.textualDivId;
        }
        ValueBinding _vb = getValueBinding("textualDivId");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>This attribute reference the id of the panelGroup, that displays the textual direction. (e.g.)<br/>
 *         
 *         &lt;ice:GMap&gt;<br/>
 *              &lt;ice:GDirection textualDivId="textDiv" ...../&gt;</br>
 *          &lt;/ice:GMap&gt; </br>
 *          &lt;ice:panelGroup id="textDiv"/&gt;</p>
     * @see #getTextualDivId()
     */
    public void setTextualDivId(String textualDivId) {
        this.textualDivId = textualDivId;
    }

    // to
    private String to = null;

    /**
 * <p>Point B</p>
     */
    public String getTo() {
        if (this.to != null) {
            return this.to;
        }
        ValueBinding _vb = getValueBinding("to");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Point B</p>
     * @see #getTo()
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.from = (String) _values[1];
        this.id = (String) _values[2];
        this.locateAddress = ((Boolean) _values[3]).booleanValue();
        this.locateAddress_set = ((Boolean) _values[4]).booleanValue();
        this.rendered = ((Boolean) _values[5]).booleanValue();
        this.rendered_set = ((Boolean) _values[6]).booleanValue();
        this.textualDivId = (String) _values[7];
        this.to = (String) _values[8];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[9];
        _values[0] = super.saveState(_context);
        _values[1] = this.from;
        _values[2] = this.id;
        _values[3] = this.locateAddress ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.locateAddress_set ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.textualDivId;
        _values[8] = this.to;
        return _values;
    }

}
