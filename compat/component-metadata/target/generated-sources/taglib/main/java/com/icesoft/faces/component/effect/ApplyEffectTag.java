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
package com.icesoft.faces.component.effect;

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

public class ApplyEffectTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.ApplyEffect";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.ApplyEffectRenderer";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        autoReset = null;
        effectType = null;
        event = null;
        fire = null;
        options = null;
        sequence = null;
        sequenceNumber = null;
        submit = null;
        transitory = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (autoReset != null) {
                if (isValueReference(autoReset)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(autoReset));
                    _component.setValueBinding("autoReset", _vb);
                } else {
                    _component.getAttributes().put("autoReset", Boolean.valueOf(autoReset));
                }
            }
            if (effectType != null) {
                if (isValueReference(effectType)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(effectType));
                    _component.setValueBinding("effectType", _vb);
                } else {
                    _component.getAttributes().put("effectType", effectType);
                }
            }
            if (event != null) {
                if (isValueReference(event)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(event));
                    _component.setValueBinding("event", _vb);
                } else {
                    _component.getAttributes().put("event", event);
                }
            }
            if (fire != null) {
                if (isValueReference(fire)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(fire));
                    _component.setValueBinding("fire", _vb);
                } else {
                    _component.getAttributes().put("fire", Boolean.valueOf(fire));
                }
            }
            if (options != null) {
                if (isValueReference(options)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(options));
                    _component.setValueBinding("options", _vb);
                } else {
                    _component.getAttributes().put("options", options);
                }
            }
            if (sequence != null) {
                if (isValueReference(sequence)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(sequence));
                    _component.setValueBinding("sequence", _vb);
                } else {
                    _component.getAttributes().put("sequence", sequence);
                }
            }
            if (sequenceNumber != null) {
                if (isValueReference(sequenceNumber)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(sequenceNumber));
                    _component.setValueBinding("sequenceNumber", _vb);
                } else {
                    _component.getAttributes().put("sequenceNumber", Integer.valueOf(sequenceNumber));
                }
            }
            if (submit != null) {
                if (isValueReference(submit)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(submit));
                    _component.setValueBinding("submit", _vb);
                } else {
                    _component.getAttributes().put("submit", Boolean.valueOf(submit));
                }
            }
            if (transitory != null) {
                if (isValueReference(transitory)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(transitory));
                    _component.setValueBinding("transitory", _vb);
                } else {
                    _component.getAttributes().put("transitory", Boolean.valueOf(transitory));
                }
            }
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // autoReset
    private String autoReset = null;
    public void setAutoReset(String autoReset) {
        this.autoReset = autoReset;
    }

    // effectType
    private String effectType = null;
    public void setEffectType(String effectType) {
        this.effectType = effectType;
    }

    // event
    private String event = null;
    public void setEvent(String event) {
        this.event = event;
    }

    // fire
    private String fire = null;
    public void setFire(String fire) {
        this.fire = fire;
    }

    // options
    private String options = null;
    public void setOptions(String options) {
        this.options = options;
    }

    // sequence
    private String sequence = null;
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    // sequenceNumber
    private String sequenceNumber = null;
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    // submit
    private String submit = null;
    public void setSubmit(String submit) {
        this.submit = submit;
    }

    // transitory
    private String transitory = null;
    public void setTransitory(String transitory) {
        this.transitory = transitory;
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
