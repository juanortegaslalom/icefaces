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
package com.icesoft.faces.component.panelcollapsible;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * panelCollapsible Componenet
 * 
 * 		Contains a header facet and a body. When the expanded value is changed the
 * 		panel will expand or collapse.
 * 
 * 		Setting toggleOnClick to true will expand or collapse the body when the head is clicked. (Default is true)
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class PanelCollapsibleBase extends javax.faces.component.UIComponentBase {

    /**
     * <p>Construct a new <code>PanelCollapsibleBase</code>.</p>
     */
    public PanelCollapsibleBase() {
        super();
        setRendererType("com.icesoft.faces.PanelCollapsibleRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.PanelCollapsible";
    }

    // actionListener
    private javax.faces.el.MethodBinding actionListener = null;

    /**
 * <p>Fired when a panel is expanded or collapsed</p>
     */
    public javax.faces.el.MethodBinding getActionListener() {
        if (this.actionListener != null) {
            return this.actionListener;
        }
        ValueBinding _vb = getValueBinding("actionListener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Fired when a panel is expanded or collapsed</p>
     * @see #getActionListener()
     */
    public void setActionListener(javax.faces.el.MethodBinding actionListener) {
        this.actionListener = actionListener;
    }

    // disabled
    private boolean disabled = false;
    private boolean disabled_set = false;

    /**
 * <p>Flag indicating that this element must never receive focus or be 
 * 			 included in a subsequent submit.</p>
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
 * <p>Flag indicating that this element must never receive focus or be 
 * 			 included in a subsequent submit.</p>
     * @see #isDisabled()
     */
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
        this.disabled_set = true;
    }

    // enabledOnUserRole
    private String enabledOnUserRole = null;

    /**
 * <p>If user is in given role, this component will be rendered
 * 		normally. If not, the component will be in disabled state.</p>
     */
    public String getEnabledOnUserRole() {
        if (this.enabledOnUserRole != null) {
            return this.enabledOnUserRole;
        }
        ValueBinding _vb = getValueBinding("enabledOnUserRole");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>If user is in given role, this component will be rendered
 * 		normally. If not, the component will be in disabled state.</p>
     * @see #getEnabledOnUserRole()
     */
    public void setEnabledOnUserRole(String enabledOnUserRole) {
        this.enabledOnUserRole = enabledOnUserRole;
    }

    // expanded
    private boolean expanded = false;
    private boolean expanded_set = false;

    /**
 * <p>True when panel is expanded, false when collapsed</p>
     */
    public boolean isExpanded() {
        if (this.expanded_set) {
            return this.expanded;
        }
        ValueBinding _vb = getValueBinding("expanded");
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
 * <p>True when panel is expanded, false when collapsed</p>
     * @see #isExpanded()
     */
    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
        this.expanded_set = true;
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

    // immediate
    private boolean immediate = false;
    private boolean immediate_set = false;

    /**
 * <p>Flag indicating that this component's value must be converted
 * 		and validated immediately (that is, during Apply Request Values
 * 		phase), rather than waiting until Process Validations phase.</p>
     */
    public boolean isImmediate() {
        if (this.immediate_set) {
            return this.immediate;
        }
        ValueBinding _vb = getValueBinding("immediate");
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
 * <p>Flag indicating that this component's value must be converted
 * 		and validated immediately (that is, during Apply Request Values
 * 		phase), rather than waiting until Process Validations phase.</p>
     * @see #isImmediate()
     */
    public void setImmediate(boolean immediate) {
        this.immediate = immediate;
        this.immediate_set = true;
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
 * <p>CSS style</p>
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
 * <p>CSS style</p>
     * @see #getStyle()
     */
    public void setStyle(String style) {
        this.style = style;
    }

    // styleClass
    private String styleClass = null;

    /**
 * <p>
 *         Space-separated list of CSS style class(es) to be applied when this
 *         element is rendered. This value must be passed through as the 
 *         "class" attribute on generated markup.<br/>
 *         The base name for all style classes. Default value is <b>icePnlClpsbl</b></p>
 *         The class names for the panel, the header, and the content are:<br>
 * 		Expanded
 * 		<ul>
 *         <li>icePnlClpsbl</li>
 *         <li>icePnlClpsblHdr</li>
 *         <li>icePnlClpsblCnt</li>
 * 		</ul>
 *         Collapsed
 * 		<ul>
 *         <li>icePnlClpsblColpsd</li>
 *         <li>icePnlClpsblColpsdHdr</li>
 *         <li>icePnlClpsblColpsdCnt</li>
 * 		</ul>
 *         Expanded and disabled
 * 		<ul>
 *         <li>icePnlClpsbl-dis</li>
 *         <li>icePnlClpsblHdr-dis</li>
 *         <li>icePnlClpsblCnt-dis</li>
 * 		</ul>
 *         Collapsed and disabled
 * 		<ul>
 *         <li>icePnlClpsblColpsd-dis</li>
 *         <li>icePnlClpsblColpsdHdr-dis</li>
 *         <li>icePnlClpsblColpsdCnt-dis</li>
 *         </ul>
 * 		</p>
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
 *         Space-separated list of CSS style class(es) to be applied when this
 *         element is rendered. This value must be passed through as the 
 *         "class" attribute on generated markup.<br/>
 *         The base name for all style classes. Default value is <b>icePnlClpsbl</b></p>
 *         The class names for the panel, the header, and the content are:<br>
 * 		Expanded
 * 		<ul>
 *         <li>icePnlClpsbl</li>
 *         <li>icePnlClpsblHdr</li>
 *         <li>icePnlClpsblCnt</li>
 * 		</ul>
 *         Collapsed
 * 		<ul>
 *         <li>icePnlClpsblColpsd</li>
 *         <li>icePnlClpsblColpsdHdr</li>
 *         <li>icePnlClpsblColpsdCnt</li>
 * 		</ul>
 *         Expanded and disabled
 * 		<ul>
 *         <li>icePnlClpsbl-dis</li>
 *         <li>icePnlClpsblHdr-dis</li>
 *         <li>icePnlClpsblCnt-dis</li>
 * 		</ul>
 *         Collapsed and disabled
 * 		<ul>
 *         <li>icePnlClpsblColpsd-dis</li>
 *         <li>icePnlClpsblColpsdHdr-dis</li>
 *         <li>icePnlClpsblColpsdCnt-dis</li>
 *         </ul>
 * 		</p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // tabindex
    private String tabindex = null;

    /**
 * <p>Position of this element in the tabbing order for the current document. 
 * 		This value must be an integer between 0 and 32767.</p>
     */
    public String getTabindex() {
        if (this.tabindex != null) {
            return this.tabindex;
        }
        ValueBinding _vb = getValueBinding("tabindex");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Position of this element in the tabbing order for the current document. 
 * 		This value must be an integer between 0 and 32767.</p>
     * @see #getTabindex()
     */
    public void setTabindex(String tabindex) {
        this.tabindex = tabindex;
    }

    // toggleOnClick
    private boolean toggleOnClick = false;
    private boolean toggleOnClick_set = false;

    /**
 * <p>When true clicking on the header will expand or collapse the panel</p>
     */
    public boolean isToggleOnClick() {
        if (this.toggleOnClick_set) {
            return this.toggleOnClick;
        }
        ValueBinding _vb = getValueBinding("toggleOnClick");
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
 * <p>When true clicking on the header will expand or collapse the panel</p>
     * @see #isToggleOnClick()
     */
    public void setToggleOnClick(boolean toggleOnClick) {
        this.toggleOnClick = toggleOnClick;
        this.toggleOnClick_set = true;
    }

    // toggleOnInput
    private boolean toggleOnInput = false;
    private boolean toggleOnInput_set = false;

    /**
 * <p>When true clicking on a text input field in the header will expand or collapse the panel.</p>
     */
    public boolean isToggleOnInput() {
        if (this.toggleOnInput_set) {
            return this.toggleOnInput;
        }
        ValueBinding _vb = getValueBinding("toggleOnInput");
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
 * <p>When true clicking on a text input field in the header will expand or collapse the panel.</p>
     * @see #isToggleOnInput()
     */
    public void setToggleOnInput(boolean toggleOnInput) {
        this.toggleOnInput = toggleOnInput;
        this.toggleOnInput_set = true;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.actionListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[1]);
        this.disabled = ((Boolean) _values[2]).booleanValue();
        this.disabled_set = ((Boolean) _values[3]).booleanValue();
        this.enabledOnUserRole = (String) _values[4];
        this.expanded = ((Boolean) _values[5]).booleanValue();
        this.expanded_set = ((Boolean) _values[6]).booleanValue();
        this.id = (String) _values[7];
        this.immediate = ((Boolean) _values[8]).booleanValue();
        this.immediate_set = ((Boolean) _values[9]).booleanValue();
        this.rendered = ((Boolean) _values[10]).booleanValue();
        this.rendered_set = ((Boolean) _values[11]).booleanValue();
        this.renderedOnUserRole = (String) _values[12];
        this.style = (String) _values[13];
        this.styleClass = (String) _values[14];
        this.tabindex = (String) _values[15];
        this.toggleOnClick = ((Boolean) _values[16]).booleanValue();
        this.toggleOnClick_set = ((Boolean) _values[17]).booleanValue();
        this.toggleOnInput = ((Boolean) _values[18]).booleanValue();
        this.toggleOnInput_set = ((Boolean) _values[19]).booleanValue();
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[20];
        _values[0] = super.saveState(_context);
        _values[1] = saveAttachedState(_context, actionListener);
        _values[2] = this.disabled ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.disabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.enabledOnUserRole;
        _values[5] = this.expanded ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.expanded_set ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.id;
        _values[8] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[9] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[10] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[11] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[12] = this.renderedOnUserRole;
        _values[13] = this.style;
        _values[14] = this.styleClass;
        _values[15] = this.tabindex;
        _values[16] = this.toggleOnClick ? Boolean.TRUE : Boolean.FALSE;
        _values[17] = this.toggleOnClick_set ? Boolean.TRUE : Boolean.FALSE;
        _values[18] = this.toggleOnInput ? Boolean.TRUE : Boolean.FALSE;
        _values[19] = this.toggleOnInput_set ? Boolean.TRUE : Boolean.FALSE;
        return _values;
    }

}
