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
package com.icesoft.faces.component.panelseries;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * TODO
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class UISeriesBase extends javax.faces.component.html.HtmlDataTable {

    /**
     * <p>Construct a new <code>UISeriesBase</code>.</p>
     */
    public UISeriesBase() {
        super();
        setRendererType("com.icesoft.faces.seriesRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Data";
    }

    // first
    private int first = Integer.MIN_VALUE;
    private boolean first_set = false;

    /**
 * <p>Zero-relative row number of the first row to be displayed. If this 
 * 		property is set to zero, rendering will begin with the first row of the 
 * 		underlying data.</p>
     */
    public int getFirst() {
        if (this.first_set) {
            return this.first;
        }
        ValueBinding _vb = getValueBinding("first");
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
 * <p>Zero-relative row number of the first row to be displayed. If this 
 * 		property is set to zero, rendering will begin with the first row of the 
 * 		underlying data.</p>
     * @see #getFirst()
     */
    public void setFirst(int first) {
        this.first = first;
        this.first_set = true;
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

    // rows
    private int rows = Integer.MIN_VALUE;
    private boolean rows_set = false;

    /**
 * <p>The number of rows to display, starting with the one identified
 * 		by the "first" property. If this value is set to zero, all
 * 		available rows in the underlying data model will be displayed.</p>
     */
    public int getRows() {
        if (this.rows_set) {
            return this.rows;
        }
        ValueBinding _vb = getValueBinding("rows");
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
 * <p>The number of rows to display, starting with the one identified
 * 		by the "first" property. If this value is set to zero, all
 * 		available rows in the underlying data model will be displayed.</p>
     * @see #getRows()
     */
    public void setRows(int rows) {
        this.rows = rows;
        this.rows_set = true;
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
 *               Space-separated list of CSS style class(es) to be applied when
 *               this element is rendered.  This value must be passed through
 *               as the "class" attribute on generated markup.
 *               <br/> The default class would be rendered as <b>icePnlSrs</b>
 *             </p>
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
 *               Space-separated list of CSS style class(es) to be applied when
 *               this element is rendered.  This value must be passed through
 *               as the "class" attribute on generated markup.
 *               <br/> The default class would be rendered as <b>icePnlSrs</b>
 *             </p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // value
    private Object value = null;

    /**
 * <p>The data model for this component.</p>
     */
    public Object getValue() {
        if (this.value != null) {
            return this.value;
        }
        ValueBinding _vb = getValueBinding("value");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The data model for this component.</p>
     * @see #getValue()
     */
    public void setValue(Object value) {
        this.value = value;
    }

    // var
    private String _var = null;

    /**
 * <p>Name of a request-scope attribute under which the model data for
 * 		the row selected by the current value of the "rowIndex" property
 * 		(i.e. also the current value of the "rowData" property) will be
 * 		exposed.</p>
     */
    public String getVar() {
        return this._var;
    }

    /**
 * <p>Name of a request-scope attribute under which the model data for
 * 		the row selected by the current value of the "rowIndex" property
 * 		(i.e. also the current value of the "rowData" property) will be
 * 		exposed.</p>
     * @see #getVar()
     */
    public void setVar(String _var) {
        this._var = _var;
    }

    // varStatus
    private String varStatus = null;

    /**
 * <p>Name of a request-scope attribute under which the current indexed  
 *         state will be exposed. This is modeled after the Facelets JSTL c:forEach  
 *         varStatus. The varStatus object has 5 sub-properties:</p>
 *         <dl>
 *         <dt>int <b>begin</b></dt> 
 *         <dd>Corresponds to the UIData container's <b>first</b> property, the 
 *             index at which it begins iteration.</dd>
 *         <dt>int <b>end</b></dt>
 *         <dd>The ending index of iteration, corresponding to the UIData 
 *             container's <b>first</b> plus <b>rows</b> minus 1. Note: 
 *             If the UIData's DataModel's isRowAvailable() method returns false, 
 *             prematurely ending iteration, then the actual ending index may not 
 *             equal the value for this <b>end</b> property.</dd>
 *         <dt>int <b>index</b></dt>
 *         <dd>The current iteration index. Corresponding to the UIData 
 *             container's getRowIndex() value, which also corresponds with the 
 *             UIData's DataModel's getRowIndex() value.</dd>
 *         <dt>boolean <b>first</b></dt>
 *         <dd>Defined simply as: <b>varStatus.index == varStatus.begin</b></dd>
 *         <dt>boolean <b>last</b></dt>
 *         <dd>Defined simply as: <b>varStatus.index == varStatus.end</b>. Note: 
 *             This has the same limitations as the <b>end</b> property.</dd>
     */
    public String getVarStatus() {
        if (this.varStatus != null) {
            return this.varStatus;
        }
        ValueBinding _vb = getValueBinding("varStatus");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Name of a request-scope attribute under which the current indexed  
 *         state will be exposed. This is modeled after the Facelets JSTL c:forEach  
 *         varStatus. The varStatus object has 5 sub-properties:</p>
 *         <dl>
 *         <dt>int <b>begin</b></dt> 
 *         <dd>Corresponds to the UIData container's <b>first</b> property, the 
 *             index at which it begins iteration.</dd>
 *         <dt>int <b>end</b></dt>
 *         <dd>The ending index of iteration, corresponding to the UIData 
 *             container's <b>first</b> plus <b>rows</b> minus 1. Note: 
 *             If the UIData's DataModel's isRowAvailable() method returns false, 
 *             prematurely ending iteration, then the actual ending index may not 
 *             equal the value for this <b>end</b> property.</dd>
 *         <dt>int <b>index</b></dt>
 *         <dd>The current iteration index. Corresponding to the UIData 
 *             container's getRowIndex() value, which also corresponds with the 
 *             UIData's DataModel's getRowIndex() value.</dd>
 *         <dt>boolean <b>first</b></dt>
 *         <dd>Defined simply as: <b>varStatus.index == varStatus.begin</b></dd>
 *         <dt>boolean <b>last</b></dt>
 *         <dd>Defined simply as: <b>varStatus.index == varStatus.end</b>. Note: 
 *             This has the same limitations as the <b>end</b> property.</dd>
     * @see #getVarStatus()
     */
    public void setVarStatus(String varStatus) {
        this.varStatus = varStatus;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.first = ((Integer) _values[1]).intValue();
        this.first_set = ((Boolean) _values[2]).booleanValue();
        this.id = (String) _values[3];
        this.rendered = ((Boolean) _values[4]).booleanValue();
        this.rendered_set = ((Boolean) _values[5]).booleanValue();
        this.rows = ((Integer) _values[6]).intValue();
        this.rows_set = ((Boolean) _values[7]).booleanValue();
        this.style = (String) _values[8];
        this.styleClass = (String) _values[9];
        this.value = (Object) _values[10];
        this._var = (String) _values[11];
        this.varStatus = (String) _values[12];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[13];
        _values[0] = super.saveState(_context);
        _values[1] = new Integer(this.first);
        _values[2] = this.first_set ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.id;
        _values[4] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = new Integer(this.rows);
        _values[7] = this.rows_set ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.style;
        _values[9] = this.styleClass;
        _values[10] = this.value;
        _values[11] = this._var;
        _values[12] = this.varStatus;
        return _values;
    }

}
