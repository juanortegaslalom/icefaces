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
package com.icesoft.faces.component.style;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * <p>The outputStyle component is used to link the desired ICEfaces theme CSS stylesheets into the page to style the
 *              ICEfaces Component Suite components.
 *              </p>
 *               <p>Inserting the outputStyle component into the HEAD region of a page will link both the default CSS stylesheet for
 *               the theme and optionally an additional stylesheet that alters the default styles to accommodate differences in
 *               CSS rendering in various user-agents/browsers. </p>
 *              <p>The additional style sheet will have a different extension for each browser.</p>
 *              <ul>
 *               <li>Internet Explorer < 7 = _ie.css</li>
 *               <li>Internet Explorer 7 = _ie7.css</li>
 *               <li>Internet Explorer 8 = _ie8.css</li>
 *               <li>Safari = _safari.css</li>
 *               <li>Sun Studio Creator = _dt.css</li>
 *              </ul>
 *              <p>This extension replaces the .css value of the href attribute. So when href is 'xp.css' and the page is rendered in
 *              Internet Explorer, an additional style sheet will be included called 'xp_ie.css'.</p>
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class OutputStyleBase extends javax.faces.component.UIComponentBase {

    /**
     * <p>Construct a new <code>OutputStyleBase</code>.</p>
     */
    public OutputStyleBase() {
        super();
        setRendererType("com.icesoft.faces.style.OutputStyleRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.OutputStyle";
    }

    // href
    private String href = null;

    /**
 * <p>
 *                   The href value of the link element that is rendered. An additional link elelement is rendered for internet explorer browsers.
 *                   The IE style sheet must end with '_ie.css'. For example if the href value is 'style.css' then the IE style sheet needs to be
 *                   named 'style_ie.css'  
 *                 </p>
     */
    public String getHref() {
        if (this.href != null) {
            return this.href;
        }
        ValueBinding _vb = getValueBinding("href");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 *                   The href value of the link element that is rendered. An additional link elelement is rendered for internet explorer browsers.
 *                   The IE style sheet must end with '_ie.css'. For example if the href value is 'style.css' then the IE style sheet needs to be
 *                   named 'style_ie.css'  
 *                 </p>
     * @see #getHref()
     */
    public void setHref(String href) {
        this.href = href;
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

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.href = (String) _values[1];
        this.id = (String) _values[2];
        this.rendered = ((Boolean) _values[3]).booleanValue();
        this.rendered_set = ((Boolean) _values[4]).booleanValue();
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[5];
        _values[0] = super.saveState(_context);
        _values[1] = this.href;
        _values[2] = this.id;
        _values[3] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        return _values;
    }

}
