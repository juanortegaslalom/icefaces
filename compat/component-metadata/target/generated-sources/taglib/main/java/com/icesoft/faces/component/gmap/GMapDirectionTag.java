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

public class GMapDirectionTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.GMapDirection";
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
        from = null;
        locateAddress = null;
        textualDivId = null;
        to = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (from != null) {
                if (isValueReference(from)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(from));
                    _component.setValueBinding("from", _vb);
                } else {
                    _component.getAttributes().put("from", from);
                }
            }
            if (locateAddress != null) {
                if (isValueReference(locateAddress)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(locateAddress));
                    _component.setValueBinding("locateAddress", _vb);
                } else {
                    _component.getAttributes().put("locateAddress", Boolean.valueOf(locateAddress));
                }
            }
            if (textualDivId != null) {
                if (isValueReference(textualDivId)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(textualDivId));
                    _component.setValueBinding("textualDivId", _vb);
                } else {
                    _component.getAttributes().put("textualDivId", textualDivId);
                }
            }
            if (to != null) {
                if (isValueReference(to)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(to));
                    _component.setValueBinding("to", _vb);
                } else {
                    _component.getAttributes().put("to", to);
                }
            }
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // from
    private String from = null;
    public void setFrom(String from) {
        this.from = from;
    }

    // locateAddress
    private String locateAddress = null;
    public void setLocateAddress(String locateAddress) {
        this.locateAddress = locateAddress;
    }

    // textualDivId
    private String textualDivId = null;
    public void setTextualDivId(String textualDivId) {
        this.textualDivId = textualDivId;
    }

    // to
    private String to = null;
    public void setTo(String to) {
        this.to = to;
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
