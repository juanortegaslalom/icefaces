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
package com.icesoft.faces.component.repeat;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.webapp.UIComponentTag;
import com.icesoft.faces.component.dragdrop.DragEvent;
import com.icesoft.faces.component.dragdrop.DropEvent;
import com.icesoft.faces.component.DisplayEvent;
import com.icesoft.faces.component.outputchart.*;
import com.icesoft.faces.component.ext.*;
import com.icesoft.faces.component.panelpositioned.*;
import com.icesoft.faces.component.paneltabset.*;
import com.icesoft.util.pooling.ELPool;

/**
 * <p>Auto-generated component tag class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

public class RepeatTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.Repeat";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return   null;
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        first = null;
        rows = null;
        value = null;
        _var = null;
        varStatus = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (first != null) {
                if (isValueReference(first)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(first));
                    _component.setValueBinding("first", _vb);
                } else {
                    _component.getAttributes().put("first", Integer.valueOf(first));
                }
            }
            if (rows != null) {
                if (isValueReference(rows)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(rows));
                    _component.setValueBinding("rows", _vb);
                } else {
                    _component.getAttributes().put("rows", Integer.valueOf(rows));
                }
            }
            if (value != null) {
                if (isValueReference(value)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(value));
                    _component.setValueBinding("value", _vb);
                } else {
                    _component.getAttributes().put("value", value);
                }
            }
            if (_var != null) {
                try{
                    com.icesoft.faces.component.panelseries.UISeries repeat = (com.icesoft.faces.component.panelseries.UISeries)_component;
                    repeat.setVar(_var);
                }catch (ClassCastException cce) {
                    throw new IllegalStateException(_component.toString() + " not expected type.  Expected: com.icesoft.faces.component.panelseries.UISeries.  Perhaps you're missing a tag?");
                }
            }
            if (varStatus != null) {
                if (isValueReference(varStatus)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(varStatus));
                    _component.setValueBinding("varStatus", _vb);
                } else {
                    _component.getAttributes().put("varStatus", varStatus);
                }
            }
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // first
    private String first = null;
    public void setFirst(String first) {
        this.first = first;
    }

    // rows
    private String rows = null;
    public void setRows(String rows) {
        this.rows = rows;
    }

    // value
    private String value = null;
    public void setValue(String value) {
        this.value = value;
    }

    // var
    private String _var = null;
    public void setVar(String _var) {
        this._var = _var;
    }

    // varStatus
    private String varStatus = null;
    public void setVarStatus(String varStatus) {
        this.varStatus = varStatus;
    }

    private static Class actionArgs[] = new Class[0];
    private static Class actionListenerArgs[] = { javax.faces.event.ActionEvent.class };
    private static Class validatorArgs[] = { FacesContext.class, UIComponent.class, Object.class };
    private static Class valueChangeListenerArgs[] = { javax.faces.event.ValueChangeEvent.class };


    // 
    // Methods From TagSupport
    // 

    public int doStartTag() throws JspException {
        int rc = 0;
        try {
            rc = super.doStartTag();
        } catch (JspException e) {
            throw e;
        } catch (Throwable t) {
            throw new JspException(t);
        }
        return rc;
    }


    public int doEndTag() throws JspException {
        int rc = 0;
        try {
            rc = super.doEndTag();
        } catch (JspException e) {
            throw e;
        } catch (Throwable t) {
            throw new JspException(t);
        }
        return rc;
    }

}
