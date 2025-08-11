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
package com.icesoft.faces.component.outputmedia;

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

public class OutputMediaTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.OutputMedia";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.OutputMedia";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        codebase = null;
        mimeType = null;
        player = null;
        renderedOnUserRole = null;
        source = null;
        standbyText = null;
        style = null;
        styleClass = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (codebase != null) {
                if (isValueReference(codebase)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(codebase));
                    _component.setValueBinding("codebase", _vb);
                } else {
                    _component.getAttributes().put("codebase", codebase);
                }
            }
            if (mimeType != null) {
                if (isValueReference(mimeType)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(mimeType));
                    _component.setValueBinding("mimeType", _vb);
                } else {
                    _component.getAttributes().put("mimeType", mimeType);
                }
            }
            if (player != null) {
                if (isValueReference(player)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(player));
                    _component.setValueBinding("player", _vb);
                } else {
                    _component.getAttributes().put("player", player);
                }
            }
            if (renderedOnUserRole != null) {
                if (isValueReference(renderedOnUserRole)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(renderedOnUserRole));
                    _component.setValueBinding("renderedOnUserRole", _vb);
                } else {
                    _component.getAttributes().put("renderedOnUserRole", renderedOnUserRole);
                }
            }
            if (source != null) {
                if (isValueReference(source)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(source));
                    _component.setValueBinding("source", _vb);
                } else {
                    _component.getAttributes().put("source", source);
                }
            }
            if (standbyText != null) {
                if (isValueReference(standbyText)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(standbyText));
                    _component.setValueBinding("standbyText", _vb);
                } else {
                    _component.getAttributes().put("standbyText", standbyText);
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
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // codebase
    private String codebase = null;
    public void setCodebase(String codebase) {
        this.codebase = codebase;
    }

    // mimeType
    private String mimeType = null;
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    // player
    private String player = null;
    public void setPlayer(String player) {
        this.player = player;
    }

    // renderedOnUserRole
    private String renderedOnUserRole = null;
    public void setRenderedOnUserRole(String renderedOnUserRole) {
        this.renderedOnUserRole = renderedOnUserRole;
    }

    // source
    private String source = null;
    public void setSource(String source) {
        this.source = source;
    }

    // standbyText
    private String standbyText = null;
    public void setStandbyText(String standbyText) {
        this.standbyText = standbyText;
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
