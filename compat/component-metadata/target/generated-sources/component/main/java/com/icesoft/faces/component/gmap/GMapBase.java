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

abstract class GMapBase extends javax.faces.component.UIPanel {

    /**
     * <p>Construct a new <code>GMapBase</code>.</p>
     */
    public GMapBase() {
        super();
        setRendererType("com.icesoft.faces.GMapRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Panel";
    }

    // address
    private String address = null;

    /**
 * <p>The ice:gMap component can locate an address on the map, using the GClientGeocoder implicitly.
 *         <br/>(e.g.) To render a map with the default location.<br/>
 *          &lt;ice:gMap address="Calgary"/&gt;
 *          <br/><br/>
 *          To locate the address dynamically, the address needs to be bind with the bean and "locateAddress" attribute needs to return "true", when map needs to be located (e.g.)<br/>
 * 
 *          &lt;ice:inputText value="#{gmap.address}" valueChangeListener="#{gmap.addressChanged}" /&gt;<br/>
 *          &lt;ice:gMap address="#{gmap.address}" locateAddress="#{gmap.locateAddress}"/&gt;<br/><br/>
 *          
 *          Note: The valueChangeListener sets the value of the "locateAddress" to true of false, that causes the address to be locate on the google map.</p>
     */
    public String getAddress() {
        if (this.address != null) {
            return this.address;
        }
        ValueBinding _vb = getValueBinding("address");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The ice:gMap component can locate an address on the map, using the GClientGeocoder implicitly.
 *         <br/>(e.g.) To render a map with the default location.<br/>
 *          &lt;ice:gMap address="Calgary"/&gt;
 *          <br/><br/>
 *          To locate the address dynamically, the address needs to be bind with the bean and "locateAddress" attribute needs to return "true", when map needs to be located (e.g.)<br/>
 * 
 *          &lt;ice:inputText value="#{gmap.address}" valueChangeListener="#{gmap.addressChanged}" /&gt;<br/>
 *          &lt;ice:gMap address="#{gmap.address}" locateAddress="#{gmap.locateAddress}"/&gt;<br/><br/>
 *          
 *          Note: The valueChangeListener sets the value of the "locateAddress" to true of false, that causes the address to be locate on the google map.</p>
     * @see #getAddress()
     */
    public void setAddress(String address) {
        this.address = address;
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

    // latitude
    private String latitude = null;

    /**
 * <p>The latitude of the Map</p>
     */
    public String getLatitude() {
        if (this.latitude != null) {
            return this.latitude;
        }
        ValueBinding _vb = getValueBinding("latitude");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "56.46249048388979";
    }

    /**
 * <p>The latitude of the Map</p>
     * @see #getLatitude()
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    // locateAddress
    private boolean locateAddress = false;
    private boolean locateAddress_set = false;

    /**
 * <p>This attribute tells to the map to locate the address if set to true.</p>
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
 * <p>This attribute tells to the map to locate the address if set to true.</p>
     * @see #isLocateAddress()
     */
    public void setLocateAddress(boolean locateAddress) {
        this.locateAddress = locateAddress;
        this.locateAddress_set = true;
    }

    // longitude
    private String longitude = null;

    /**
 * <p>The longitude of the Map</p>
     */
    public String getLongitude() {
        if (this.longitude != null) {
            return this.longitude;
        }
        ValueBinding _vb = getValueBinding("longitude");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "-101.162109375";
    }

    /**
 * <p>The longitude of the Map</p>
     * @see #getLongitude()
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
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
 * <p>Space-separated list of CSS style class(es) to be applied when this element is rendered. This value must be passed through as the "class" attribute on generated markup.
 *         <br/><br/>
 *         The base name for all style classes. Default value is iceGmp        
 *         <ul>
 *             <li>iceGmpMapTd (this class will apply on the td, that contains the google map)</li>
 *             <li>iceGmpTxtTd (this class will apply on the td, that contains the default textual div used by GDirection component</li>
 *         <ul></p>
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
 * <p>Space-separated list of CSS style class(es) to be applied when this element is rendered. This value must be passed through as the "class" attribute on generated markup.
 *         <br/><br/>
 *         The base name for all style classes. Default value is iceGmp        
 *         <ul>
 *             <li>iceGmpMapTd (this class will apply on the td, that contains the google map)</li>
 *             <li>iceGmpTxtTd (this class will apply on the td, that contains the default textual div used by GDirection component</li>
 *         <ul></p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // type
    private String type = null;

    /**
 * <p>Type of the map. The following are the valid values:
 *         <ul>
 *            <li>Satellite</li>
 *            <li>Hybrid</li>
 *            <li>Map</li>
 *         </ul>  
 *         To render a map in Statellite view: <br/>
 *         &lt;ice:GMap type="Satellite" address="Calgary" /&gt;</p>
     */
    public String getType() {
        if (this.type != null) {
            return this.type;
        }
        ValueBinding _vb = getValueBinding("type");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "Map";
    }

    /**
 * <p>Type of the map. The following are the valid values:
 *         <ul>
 *            <li>Satellite</li>
 *            <li>Hybrid</li>
 *            <li>Map</li>
 *         </ul>  
 *         To render a map in Statellite view: <br/>
 *         &lt;ice:GMap type="Satellite" address="Calgary" /&gt;</p>
     * @see #getType()
     */
    public void setType(String type) {
        this.type = type;
    }

    // zoomLevel
    private int zoomLevel = Integer.MIN_VALUE;
    private boolean zoomLevel_set = false;

    /**
 * <p>Set the zoom level of the map
 *           
 *         &lt;ice:GMap zoomLevel="6"  /&gt;</p>
     */
    public int getZoomLevel() {
        if (this.zoomLevel_set) {
            return this.zoomLevel;
        }
        ValueBinding _vb = getValueBinding("zoomLevel");
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
 * <p>Set the zoom level of the map
 *           
 *         &lt;ice:GMap zoomLevel="6"  /&gt;</p>
     * @see #getZoomLevel()
     */
    public void setZoomLevel(int zoomLevel) {
        this.zoomLevel = zoomLevel;
        this.zoomLevel_set = true;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.address = (String) _values[1];
        this.id = (String) _values[2];
        this.latitude = (String) _values[3];
        this.locateAddress = ((Boolean) _values[4]).booleanValue();
        this.locateAddress_set = ((Boolean) _values[5]).booleanValue();
        this.longitude = (String) _values[6];
        this.rendered = ((Boolean) _values[7]).booleanValue();
        this.rendered_set = ((Boolean) _values[8]).booleanValue();
        this.renderedOnUserRole = (String) _values[9];
        this.style = (String) _values[10];
        this.styleClass = (String) _values[11];
        this.type = (String) _values[12];
        this.zoomLevel = ((Integer) _values[13]).intValue();
        this.zoomLevel_set = ((Boolean) _values[14]).booleanValue();
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[15];
        _values[0] = super.saveState(_context);
        _values[1] = this.address;
        _values[2] = this.id;
        _values[3] = this.latitude;
        _values[4] = this.locateAddress ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.locateAddress_set ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.longitude;
        _values[7] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[9] = this.renderedOnUserRole;
        _values[10] = this.style;
        _values[11] = this.styleClass;
        _values[12] = this.type;
        _values[13] = new Integer(this.zoomLevel);
        _values[14] = this.zoomLevel_set ? Boolean.TRUE : Boolean.FALSE;
        return _values;
    }

}
