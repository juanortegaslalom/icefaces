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
 * a single column of data within a dataTable
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class UIColumnBase extends javax.faces.component.UIColumn {

    /**
     * <p>Construct a new <code>UIColumnBase</code>.</p>
     */
    public UIColumnBase() {
        super();
        setRendererType("null");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Column";
    }

    // colspan
    private String colspan = null;

    /**
 * <p>
 *         This is exactly an html colspan attribute. Due to the iterative nature 
 *         of the table body, this attribute is not suitable inside the body of the 
 *         dataTable. So this attribute will only be apply on the columns that are 
 *         descendent of the colmnGroup component.
 *         </p>
     */
    public String getColspan() {
        if (this.colspan != null) {
            return this.colspan;
        }
        ValueBinding _vb = getValueBinding("colspan");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 *         This is exactly an html colspan attribute. Due to the iterative nature 
 *         of the table body, this attribute is not suitable inside the body of the 
 *         dataTable. So this attribute will only be apply on the columns that are 
 *         descendent of the colmnGroup component.
 *         </p>
     * @see #getColspan()
     */
    public void setColspan(String colspan) {
        this.colspan = colspan;
    }

    // groupOn
    private String groupOn = null;

    /**
 * <p>
 *               The groupOn attribute, enables the application to show the one to 
 *               many relationship in the tabular format. Only the distinct values will 
 *               be rendered for the grouped column, and its rowspan value will be 
 *               set to its none distinct count.  </p>
 *               <b> Note: </b>
 *                <ul>
 *                  <li> Application must provide the sorted data for the grouped column.          
 *                  <li> This attribute is just for the layout, it does not have any effect 
 *               on the underlying dataModel.
 *               </ul>
 *               &lt;ice:dataTable var="employee" .. &gt;<br/>
 *                     &nbsp;&nbsp;&lt;ice:column groupOn="#{employee.deptName}" &gt;<br/>
 *                         &nbsp;&nbsp;&nbsp;&nbsp;&lt;ice:outputText value="#{employee.deptName}"/&gt;<br/>
 *                     &nbsp;&nbsp;&lt;/ice:colum&gt;<br/>
 *                     &nbsp;&nbsp;&lt;ice:column &gt;<br/>
 *                         &nbsp;&nbsp;&nbsp;&nbsp;&lt;ice:outputText value="#{employee.name}"/&gt;<br/>
 *                     &nbsp;&nbsp;&lt;/ice:colum&gt;<br/>                    
 *                     .....<br/>
 *              &lt;/ice:dataTable .. &gt;
     */
    public String getGroupOn() {
        if (this.groupOn != null) {
            return this.groupOn;
        }
        ValueBinding _vb = getValueBinding("groupOn");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 *               The groupOn attribute, enables the application to show the one to 
 *               many relationship in the tabular format. Only the distinct values will 
 *               be rendered for the grouped column, and its rowspan value will be 
 *               set to its none distinct count.  </p>
 *               <b> Note: </b>
 *                <ul>
 *                  <li> Application must provide the sorted data for the grouped column.          
 *                  <li> This attribute is just for the layout, it does not have any effect 
 *               on the underlying dataModel.
 *               </ul>
 *               &lt;ice:dataTable var="employee" .. &gt;<br/>
 *                     &nbsp;&nbsp;&lt;ice:column groupOn="#{employee.deptName}" &gt;<br/>
 *                         &nbsp;&nbsp;&nbsp;&nbsp;&lt;ice:outputText value="#{employee.deptName}"/&gt;<br/>
 *                     &nbsp;&nbsp;&lt;/ice:colum&gt;<br/>
 *                     &nbsp;&nbsp;&lt;ice:column &gt;<br/>
 *                         &nbsp;&nbsp;&nbsp;&nbsp;&lt;ice:outputText value="#{employee.name}"/&gt;<br/>
 *                     &nbsp;&nbsp;&lt;/ice:colum&gt;<br/>                    
 *                     .....<br/>
 *              &lt;/ice:dataTable .. &gt;
     * @see #getGroupOn()
     */
    public void setGroupOn(String groupOn) {
        this.groupOn = groupOn;
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

    // rowspan
    private String rowspan = null;

    /**
 * <p>
 *         This is exactly an html rowspan attribute. Due to the iterative nature 
 *         of the table body, this attribute is not suitable inside the body of the 
 *         dataTable. So this attribute will only be apply on the columns that are 
 *         descendent of the colmnGroup component. <br/>
 *         <b>Hint: </b> The groupOn attribute might give you the result, which you 
 *         need from the rowspan inside the body of the table. 
 *         </p>
     */
    public String getRowspan() {
        if (this.rowspan != null) {
            return this.rowspan;
        }
        ValueBinding _vb = getValueBinding("rowspan");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 *         This is exactly an html rowspan attribute. Due to the iterative nature 
 *         of the table body, this attribute is not suitable inside the body of the 
 *         dataTable. So this attribute will only be apply on the columns that are 
 *         descendent of the colmnGroup component. <br/>
 *         <b>Hint: </b> The groupOn attribute might give you the result, which you 
 *         need from the rowspan inside the body of the table. 
 *         </p>
     * @see #getRowspan()
     */
    public void setRowspan(String rowspan) {
        this.rowspan = rowspan;
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
 *         Space-separated list of CSS style class(es) to be applied when
 *         this element is rendered. This value must be passed through as
 *         the "class" attribute on generated markup. <p>
 *         If this attribute is defined on the column, the new styleClass will be 
 *         extending the existing styleClasses.
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
 *         Space-separated list of CSS style class(es) to be applied when
 *         this element is rendered. This value must be passed through as
 *         the "class" attribute on generated markup. <p>
 *         If this attribute is defined on the column, the new styleClass will be 
 *         extending the existing styleClasses.
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
        this.colspan = (String) _values[1];
        this.groupOn = (String) _values[2];
        this.id = (String) _values[3];
        this.rendered = ((Boolean) _values[4]).booleanValue();
        this.rendered_set = ((Boolean) _values[5]).booleanValue();
        this.renderedOnUserRole = (String) _values[6];
        this.rowspan = (String) _values[7];
        this.style = (String) _values[8];
        this.styleClass = (String) _values[9];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[10];
        _values[0] = super.saveState(_context);
        _values[1] = this.colspan;
        _values[2] = this.groupOn;
        _values[3] = this.id;
        _values[4] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.renderedOnUserRole;
        _values[7] = this.rowspan;
        _values[8] = this.style;
        _values[9] = this.styleClass;
        return _values;
    }

}
