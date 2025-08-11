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
package com.icesoft.faces.component.panelconfirmation;

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

public class PanelConfirmationTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.PanelConfirmation";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.PanelConfirmationRenderer";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        acceptLabel = null;
        autoCentre = null;
        cancelLabel = null;
        displayAtMouse = null;
        draggable = null;
        escape = null;
        message = null;
        style = null;
        styleClass = null;
        title = null;
        type = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (acceptLabel != null) {
                if (isValueReference(acceptLabel)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(acceptLabel));
                    _component.setValueBinding("acceptLabel", _vb);
                } else {
                    _component.getAttributes().put("acceptLabel", acceptLabel);
                }
            }
            if (autoCentre != null) {
                if (isValueReference(autoCentre)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(autoCentre));
                    _component.setValueBinding("autoCentre", _vb);
                } else {
                    _component.getAttributes().put("autoCentre", Boolean.valueOf(autoCentre));
                }
            }
            if (cancelLabel != null) {
                if (isValueReference(cancelLabel)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(cancelLabel));
                    _component.setValueBinding("cancelLabel", _vb);
                } else {
                    _component.getAttributes().put("cancelLabel", cancelLabel);
                }
            }
            if (displayAtMouse != null) {
                if (isValueReference(displayAtMouse)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(displayAtMouse));
                    _component.setValueBinding("displayAtMouse", _vb);
                } else {
                    _component.getAttributes().put("displayAtMouse", Boolean.valueOf(displayAtMouse));
                }
            }
            if (draggable != null) {
                if (isValueReference(draggable)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(draggable));
                    _component.setValueBinding("draggable", _vb);
                } else {
                    _component.getAttributes().put("draggable", Boolean.valueOf(draggable));
                }
            }
            if (escape != null) {
                if (isValueReference(escape)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(escape));
                    _component.setValueBinding("escape", _vb);
                } else {
                    _component.getAttributes().put("escape", Boolean.valueOf(escape));
                }
            }
            if (message != null) {
                if (isValueReference(message)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(message));
                    _component.setValueBinding("message", _vb);
                } else {
                    _component.getAttributes().put("message", message);
                }
            }
            if (style != null) {
                if (isValueReference(style)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(style));
                    _component.setValueBinding("style", _vb);
                } else {
                    _component.getAttributes().put("style", style);
                }
            }
            if (styleClass != null) {
                if (isValueReference(styleClass)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(styleClass));
                    _component.setValueBinding("styleClass", _vb);
                } else {
                    _component.getAttributes().put("styleClass", styleClass);
                }
            }
            if (title != null) {
                if (isValueReference(title)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(title));
                    _component.setValueBinding("title", _vb);
                } else {
                    _component.getAttributes().put("title", title);
                }
            }
            if (type != null) {
                if (isValueReference(type)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(type));
                    _component.setValueBinding("type", _vb);
                } else {
                    _component.getAttributes().put("type", type);
                }
            }
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // acceptLabel
    private String acceptLabel = null;
    public void setAcceptLabel(String acceptLabel) {
        this.acceptLabel = acceptLabel;
    }

    // autoCentre
    private String autoCentre = null;
    public void setAutoCentre(String autoCentre) {
        this.autoCentre = autoCentre;
    }

    // cancelLabel
    private String cancelLabel = null;
    public void setCancelLabel(String cancelLabel) {
        this.cancelLabel = cancelLabel;
    }

    // displayAtMouse
    private String displayAtMouse = null;
    public void setDisplayAtMouse(String displayAtMouse) {
        this.displayAtMouse = displayAtMouse;
    }

    // draggable
    private String draggable = null;
    public void setDraggable(String draggable) {
        this.draggable = draggable;
    }

    // escape
    private String escape = null;
    public void setEscape(String escape) {
        this.escape = escape;
    }

    // message
    private String message = null;
    public void setMessage(String message) {
        this.message = message;
    }

    // style
    private String style = null;
    public void setStyle(String style) {
        this.style = style;
    }

    // styleClass
    private String styleClass = null;
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // title
    private String title = null;
    public void setTitle(String title) {
        this.title = title;
    }

    // type
    private String type = null;
    public void setType(String type) {
        this.type = type;
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
