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
package com.icesoft.faces.component.panelstack;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Displays only one of many associated child components at a time
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class PanelStackBase extends javax.faces.component.html.HtmlPanelGroup {

    /**
     * <p>Construct a new <code>PanelStackBase</code>.</p>
     */
    public PanelStackBase() {
        super();
        setRendererType("com.icesoft.faces.PanelStack");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Panel";
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

    // selectedPanel
    private String selectedPanel = null;

    /**
 * <p>Id of the child to be rendered.</p>
     */
    public String getSelectedPanel() {
        if (this.selectedPanel != null) {
            return this.selectedPanel;
        }
        ValueBinding _vb = getValueBinding("selectedPanel");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Id of the child to be rendered.</p>
     * @see #getSelectedPanel()
     */
    public void setSelectedPanel(String selectedPanel) {
        this.selectedPanel = selectedPanel;
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
 * <p>Defines the base class name for all style classes. Default value is <b>icePnlStk</b>.</p>
 * 		 <p>Style Classes Used:</p>
 *          <ul>
 *          	<li>icePnlStk</li>
 *          	<li>icePnlStkRow</li>
 *             <li>icePnlStkCol</li>                       
 *          </ul>
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
 * <p>Defines the base class name for all style classes. Default value is <b>icePnlStk</b>.</p>
 * 		 <p>Style Classes Used:</p>
 *          <ul>
 *          	<li>icePnlStk</li>
 *          	<li>icePnlStkRow</li>
 *             <li>icePnlStkCol</li>                       
 *          </ul>
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
        this.id = (String) _values[1];
        this.rendered = ((Boolean) _values[2]).booleanValue();
        this.rendered_set = ((Boolean) _values[3]).booleanValue();
        this.renderedOnUserRole = (String) _values[4];
        this.selectedPanel = (String) _values[5];
        this.style = (String) _values[6];
        this.styleClass = (String) _values[7];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[8];
        _values[0] = super.saveState(_context);
        _values[1] = this.id;
        _values[2] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.renderedOnUserRole;
        _values[5] = this.selectedPanel;
        _values[6] = this.style;
        _values[7] = this.styleClass;
        return _values;
    }

}
