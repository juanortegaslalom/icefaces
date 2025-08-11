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
package com.icesoft.faces.component.paneldivider;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * panelDivider
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class PanelDividerBase extends javax.faces.component.UIPanel {

    /**
     * <p>Construct a new <code>PanelDividerBase</code>.</p>
     */
    public PanelDividerBase() {
        super();
        setRendererType("com.icesoft.faces.PanelDividerRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Panel";
    }

    // dividerPosition
    private int dividerPosition = Integer.MIN_VALUE;
    private boolean dividerPosition_set = false;

    /**
 * <p>The divider position can be set between 1 to 100.</p>
     */
    public int getDividerPosition() {
        if (this.dividerPosition_set) {
            return this.dividerPosition;
        }
        ValueBinding _vb = getValueBinding("dividerPosition");
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
 * <p>The divider position can be set between 1 to 100.</p>
     * @see #getDividerPosition()
     */
    public void setDividerPosition(int dividerPosition) {
        this.dividerPosition = dividerPosition;
        this.dividerPosition_set = true;
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

    // orientation
    private String orientation = null;

    /**
 * <p>The orientation can be set to the vertical or the horizontal.</p>
     */
    public String getOrientation() {
        if (this.orientation != null) {
            return this.orientation;
        }
        ValueBinding _vb = getValueBinding("orientation");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "vertical";
    }

    /**
 * <p>The orientation can be set to the vertical or the horizontal.</p>
     * @see #getOrientation()
     */
    public void setOrientation(String orientation) {
        this.orientation = orientation;
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
 * <p>
 * 		Space-separated list of CSS style class(es) to be applied when this 
 * 		element is rendered. This value must be passed through as the "class" 
 * 		attribute on generated markup.
 * 		</p>
 * 		<p>Defines the base class name for all style classes.
 *         Default value is <b>icePnlDvr</b> for the vertical orientation, <b>icePnlDvrHor</b> for the horizontal orientation</p>
 *         If Vertical:<br/>
 *         <ul>
 *             <li>icePnlDvr</li>
 *             <li>icePnlDvrCnt</li>
 *             <li>icePnlDvrFst</li>
 *             <li>icePnlDvrSnd</li>
 *             <li>icePnlDvrSpt</li>            
 *         </ul>  
 * 
 *         If Horizontal:<br/>
 *         <ul>
 *             <li>icePnlDvrHor</li>
 *             <li>icePnlDvrHorCnt</li>
 *             <li>icePnlDvrHorFst</li>
 *             <li>icePnlDvrHorSnd</li>
 *             <li>icePnlDvrHorSpt</li>            
 *         </ul>
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
 * 		<p>Defines the base class name for all style classes.
 *         Default value is <b>icePnlDvr</b> for the vertical orientation, <b>icePnlDvrHor</b> for the horizontal orientation</p>
 *         If Vertical:<br/>
 *         <ul>
 *             <li>icePnlDvr</li>
 *             <li>icePnlDvrCnt</li>
 *             <li>icePnlDvrFst</li>
 *             <li>icePnlDvrSnd</li>
 *             <li>icePnlDvrSpt</li>            
 *         </ul>  
 * 
 *         If Horizontal:<br/>
 *         <ul>
 *             <li>icePnlDvrHor</li>
 *             <li>icePnlDvrHorCnt</li>
 *             <li>icePnlDvrHorFst</li>
 *             <li>icePnlDvrHorSnd</li>
 *             <li>icePnlDvrHorSpt</li>            
 *         </ul>
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
        this.dividerPosition = ((Integer) _values[1]).intValue();
        this.dividerPosition_set = ((Boolean) _values[2]).booleanValue();
        this.id = (String) _values[3];
        this.orientation = (String) _values[4];
        this.rendered = ((Boolean) _values[5]).booleanValue();
        this.rendered_set = ((Boolean) _values[6]).booleanValue();
        this.renderedOnUserRole = (String) _values[7];
        this.style = (String) _values[8];
        this.styleClass = (String) _values[9];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[10];
        _values[0] = super.saveState(_context);
        _values[1] = new Integer(this.dividerPosition);
        _values[2] = this.dividerPosition_set ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.id;
        _values[4] = this.orientation;
        _values[5] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.renderedOnUserRole;
        _values[8] = this.style;
        _values[9] = this.styleClass;
        return _values;
    }

}
