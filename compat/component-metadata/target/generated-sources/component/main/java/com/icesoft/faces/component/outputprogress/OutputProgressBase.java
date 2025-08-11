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
package com.icesoft.faces.component.outputprogress;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Displays the progress of a long-running task
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class OutputProgressBase extends javax.faces.component.UIComponentBase {

    /**
     * <p>Construct a new <code>OutputProgressBase</code>.</p>
     */
    public OutputProgressBase() {
        super();
        setRendererType("com.icesoft.faces.Bar");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.Progress";
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

    // indeterminate
    private boolean indeterminate = false;
    private boolean indeterminate_set = false;

    /**
 * <p>When true percent numbers are hidden for an unknown task
 * 		duration.</p>
     */
    public boolean isIndeterminate() {
        if (this.indeterminate_set) {
            return this.indeterminate;
        }
        ValueBinding _vb = getValueBinding("indeterminate");
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
 * <p>When true percent numbers are hidden for an unknown task
 * 		duration.</p>
     * @see #isIndeterminate()
     */
    public void setIndeterminate(boolean indeterminate) {
        this.indeterminate = indeterminate;
        this.indeterminate_set = true;
    }

    // label
    private String label = null;

    /**
 * <p>The default label is the percentage value. The default can be
 * 		overridden by defining the label attribute.</p>
     */
    public String getLabel() {
        if (this.label != null) {
            return this.label;
        }
        ValueBinding _vb = getValueBinding("label");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The default label is the percentage value. The default can be
 * 		overridden by defining the label attribute.</p>
     * @see #getLabel()
     */
    public void setLabel(String label) {
        this.label = label;
    }

    // labelComplete
    private String labelComplete = null;

    /**
 * <p>The label to be displayed on completion of process. Could be
 * 		used with label attribute. The default value is Done.</p>
     */
    public String getLabelComplete() {
        if (this.labelComplete != null) {
            return this.labelComplete;
        }
        ValueBinding _vb = getValueBinding("labelComplete");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The label to be displayed on completion of process. Could be
 * 		used with label attribute. The default value is Done.</p>
     * @see #getLabelComplete()
     */
    public void setLabelComplete(String labelComplete) {
        this.labelComplete = labelComplete;
    }

    // labelPosition
    private String labelPosition = null;

    /**
 * <p>Percentage text could be set to different positions. Valid
 * 		values are |left | right | top | topcenter | topright | bottom |
 * 		bottomcenter | bottomright | embed |</p>
     */
    public String getLabelPosition() {
        if (this.labelPosition != null) {
            return this.labelPosition;
        }
        ValueBinding _vb = getValueBinding("labelPosition");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "embed";
    }

    /**
 * <p>Percentage text could be set to different positions. Valid
 * 		values are |left | right | top | topcenter | topright | bottom |
 * 		bottomcenter | bottomright | embed |</p>
     * @see #getLabelPosition()
     */
    public void setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
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
 *               Space-separated list of CSS style class(es) to be applied when this
 *               element is rendered. This value must be passed through as the 
 *               "class" attribute on generated markup.<br/>
 *               <p>Defines the base class name for all style classes used.
 *               Default value is <b>iceOutProg</b></p>
 * 
 *               <ul>
 *                 <li>iceOutProg</li>
 *                 <li>iceOutProgBg</li>
 *                 <li>iceOutProgTxt</li>
 *               </ul>              
 * 
 * 			  The main div which shows progress bar renderes out different style
 * 			  classes depending on the mode:<br/><br/>
 * 
 * 			  Standard Mode:
 *               <ul>
 *                 <li>iceOutProgFill</li>		
 *               </ul>                	
 * 				
 * 			  Indeterminate Mode:
 *               <ul>     
 *                 <li>iceOutProgIndetActv (during the progress)</li>
 *                 <li>iceOutProgIndetInactv (progress finished)</li>
 *               </ul>                
 *   		 	</p>
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
 *               Space-separated list of CSS style class(es) to be applied when this
 *               element is rendered. This value must be passed through as the 
 *               "class" attribute on generated markup.<br/>
 *               <p>Defines the base class name for all style classes used.
 *               Default value is <b>iceOutProg</b></p>
 * 
 *               <ul>
 *                 <li>iceOutProg</li>
 *                 <li>iceOutProgBg</li>
 *                 <li>iceOutProgTxt</li>
 *               </ul>              
 * 
 * 			  The main div which shows progress bar renderes out different style
 * 			  classes depending on the mode:<br/><br/>
 * 
 * 			  Standard Mode:
 *               <ul>
 *                 <li>iceOutProgFill</li>		
 *               </ul>                	
 * 				
 * 			  Indeterminate Mode:
 *               <ul>     
 *                 <li>iceOutProgIndetActv (during the progress)</li>
 *                 <li>iceOutProgIndetInactv (progress finished)</li>
 *               </ul>                
 *   		 	</p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // value
    private int value = Integer.MIN_VALUE;
    private boolean value_set = false;

    /**
 * <p>The percentage progress that should be depicted to the user, from 0 to 100 inclusive. 
 * 	    When <b>indeterminate</b>="true", 0 and 100 denote inactivity, and values between denote activity.</p>
     */
    public int getValue() {
        if (this.value_set) {
            return this.value;
        }
        ValueBinding _vb = getValueBinding("value");
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
 * <p>The percentage progress that should be depicted to the user, from 0 to 100 inclusive. 
 * 	    When <b>indeterminate</b>="true", 0 and 100 denote inactivity, and values between denote activity.</p>
     * @see #getValue()
     */
    public void setValue(int value) {
        this.value = value;
        this.value_set = true;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.id = (String) _values[1];
        this.indeterminate = ((Boolean) _values[2]).booleanValue();
        this.indeterminate_set = ((Boolean) _values[3]).booleanValue();
        this.label = (String) _values[4];
        this.labelComplete = (String) _values[5];
        this.labelPosition = (String) _values[6];
        this.rendered = ((Boolean) _values[7]).booleanValue();
        this.rendered_set = ((Boolean) _values[8]).booleanValue();
        this.renderedOnUserRole = (String) _values[9];
        this.style = (String) _values[10];
        this.styleClass = (String) _values[11];
        this.value = ((Integer) _values[12]).intValue();
        this.value_set = ((Boolean) _values[13]).booleanValue();
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[14];
        _values[0] = super.saveState(_context);
        _values[1] = this.id;
        _values[2] = this.indeterminate ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.indeterminate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.label;
        _values[5] = this.labelComplete;
        _values[6] = this.labelPosition;
        _values[7] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[9] = this.renderedOnUserRole;
        _values[10] = this.style;
        _values[11] = this.styleClass;
        _values[12] = new Integer(this.value);
        _values[13] = this.value_set ? Boolean.TRUE : Boolean.FALSE;
        return _values;
    }

}
