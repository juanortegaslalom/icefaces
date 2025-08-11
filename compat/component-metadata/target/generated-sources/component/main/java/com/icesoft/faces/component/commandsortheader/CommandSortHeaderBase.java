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
package com.icesoft.faces.component.commandsortheader;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Provides a column sorting header facet for a Data Table
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class CommandSortHeaderBase extends javax.faces.component.UICommand {

    /**
     * <p>Construct a new <code>CommandSortHeaderBase</code>.</p>
     */
    public CommandSortHeaderBase() {
        super();
        setRendererType("com.icesoft.faces.SortHeader");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Command";
    }

    // arrow
    private boolean arrow = false;
    private boolean arrow_set = false;

    /**
 * <p>Indicates whether an arrow, that shows the sort direction should be 
 * 		rendered. Default: false <br/>
 * 		Note: This is deprecated. It no longer has any effect in 1.7. To alter 
 * 		the appearance of the arrow images, the following style classes need to be
 * 		customized:
 * 		<ul>
 * 		  <li>iceCmdSrtHdrAsc</li>
 * 		  <li>iceCmdSrtHdrDesc</li>
 * 		</ul></p>
     */
    public boolean isArrow() {
        if (this.arrow_set) {
            return this.arrow;
        }
        ValueBinding _vb = getValueBinding("arrow");
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
 * <p>Indicates whether an arrow, that shows the sort direction should be 
 * 		rendered. Default: false <br/>
 * 		Note: This is deprecated. It no longer has any effect in 1.7. To alter 
 * 		the appearance of the arrow images, the following style classes need to be
 * 		customized:
 * 		<ul>
 * 		  <li>iceCmdSrtHdrAsc</li>
 * 		  <li>iceCmdSrtHdrDesc</li>
 * 		</ul></p>
     * @see #isArrow()
     */
    public void setArrow(boolean arrow) {
        this.arrow = arrow;
        this.arrow_set = true;
    }

    // columnName
    private String columnName = null;

    /**
 * <p>The name of this column. This name must uniquely identify this column among 
 * 		all other (sortable) columns in the same data_table. The sortColumn attribute 
 * 		of the embedding data_table reflects the current sort column (see extended 
 * 		data_table).</p>
     */
    public String getColumnName() {
        if (this.columnName != null) {
            return this.columnName;
        }
        ValueBinding _vb = getValueBinding("columnName");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The name of this column. This name must uniquely identify this column among 
 * 		all other (sortable) columns in the same data_table. The sortColumn attribute 
 * 		of the embedding data_table reflects the current sort column (see extended 
 * 		data_table).</p>
     * @see #getColumnName()
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
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

    // styleClass
    private String styleClass = null;

    /**
 * <p>The base name for all style classes. Default value is <b>iceCmdSrtHdr</b> 
 * 		if enabled and <b>iceCmdSrtHdr-dis</b> if disabled.</p>
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
 * <p>The base name for all style classes. Default value is <b>iceCmdSrtHdr</b> 
 * 		if enabled and <b>iceCmdSrtHdr-dis</b> if disabled.</p>
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
        this.arrow = ((Boolean) _values[1]).booleanValue();
        this.arrow_set = ((Boolean) _values[2]).booleanValue();
        this.columnName = (String) _values[3];
        this.disabled = ((Boolean) _values[4]).booleanValue();
        this.disabled_set = ((Boolean) _values[5]).booleanValue();
        this.enabledOnUserRole = (String) _values[6];
        this.id = (String) _values[7];
        this.immediate = ((Boolean) _values[8]).booleanValue();
        this.immediate_set = ((Boolean) _values[9]).booleanValue();
        this.rendered = ((Boolean) _values[10]).booleanValue();
        this.rendered_set = ((Boolean) _values[11]).booleanValue();
        this.renderedOnUserRole = (String) _values[12];
        this.styleClass = (String) _values[13];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[14];
        _values[0] = super.saveState(_context);
        _values[1] = this.arrow ? Boolean.TRUE : Boolean.FALSE;
        _values[2] = this.arrow_set ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.columnName;
        _values[4] = this.disabled ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.disabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.enabledOnUserRole;
        _values[7] = this.id;
        _values[8] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[9] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[10] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[11] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[12] = this.renderedOnUserRole;
        _values[13] = this.styleClass;
        return _values;
    }

}
