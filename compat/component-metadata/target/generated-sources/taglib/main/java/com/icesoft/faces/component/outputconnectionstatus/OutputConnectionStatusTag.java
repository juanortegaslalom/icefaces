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
package com.icesoft.faces.component.outputconnectionstatus;

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

public class OutputConnectionStatusTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.OutputConnectionStatus";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.OutputConnectionStatusRenderer";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        activeLabel = null;
        cautionLabel = null;
        disconnectedLabel = null;
        displayHourglassWhenActive = null;
        inactiveLabel = null;
        renderedOnUserRole = null;
        showPopupOnDisconnect = null;
        style = null;
        styleClass = null;
        layout = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (activeLabel != null) {
                if (isValueReference(activeLabel)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(activeLabel));
                    _component.setValueBinding("activeLabel", _vb);
                } else {
                    _component.getAttributes().put("activeLabel", activeLabel);
                }
            }
            if (cautionLabel != null) {
                if (isValueReference(cautionLabel)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(cautionLabel));
                    _component.setValueBinding("cautionLabel", _vb);
                } else {
                    _component.getAttributes().put("cautionLabel", cautionLabel);
                }
            }
            if (disconnectedLabel != null) {
                if (isValueReference(disconnectedLabel)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(disconnectedLabel));
                    _component.setValueBinding("disconnectedLabel", _vb);
                } else {
                    _component.getAttributes().put("disconnectedLabel", disconnectedLabel);
                }
            }
            if (displayHourglassWhenActive != null) {
                if (isValueReference(displayHourglassWhenActive)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(displayHourglassWhenActive));
                    _component.setValueBinding("displayHourglassWhenActive", _vb);
                } else {
                    _component.getAttributes().put("displayHourglassWhenActive", Boolean.valueOf(displayHourglassWhenActive));
                }
            }
            if (inactiveLabel != null) {
                if (isValueReference(inactiveLabel)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(inactiveLabel));
                    _component.setValueBinding("inactiveLabel", _vb);
                } else {
                    _component.getAttributes().put("inactiveLabel", inactiveLabel);
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
            if (showPopupOnDisconnect != null) {
                if (isValueReference(showPopupOnDisconnect)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(showPopupOnDisconnect));
                    _component.setValueBinding("showPopupOnDisconnect", _vb);
                } else {
                    _component.getAttributes().put("showPopupOnDisconnect", Boolean.valueOf(showPopupOnDisconnect));
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
            if (layout != null) {
                if (isValueReference(layout)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(layout));
                    _component.setValueBinding("layout", _vb);
                } else {
                    _component.getAttributes().put("layout", layout);
                }
            }
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // activeLabel
    private String activeLabel = null;
    public void setActiveLabel(String activeLabel) {
        this.activeLabel = activeLabel;
    }

    // cautionLabel
    private String cautionLabel = null;
    public void setCautionLabel(String cautionLabel) {
        this.cautionLabel = cautionLabel;
    }

    // disconnectedLabel
    private String disconnectedLabel = null;
    public void setDisconnectedLabel(String disconnectedLabel) {
        this.disconnectedLabel = disconnectedLabel;
    }

    // displayHourglassWhenActive
    private String displayHourglassWhenActive = null;
    public void setDisplayHourglassWhenActive(String displayHourglassWhenActive) {
        this.displayHourglassWhenActive = displayHourglassWhenActive;
    }

    // inactiveLabel
    private String inactiveLabel = null;
    public void setInactiveLabel(String inactiveLabel) {
        this.inactiveLabel = inactiveLabel;
    }

    // renderedOnUserRole
    private String renderedOnUserRole = null;
    public void setRenderedOnUserRole(String renderedOnUserRole) {
        this.renderedOnUserRole = renderedOnUserRole;
    }

    // showPopupOnDisconnect
    private String showPopupOnDisconnect = null;
    public void setShowPopupOnDisconnect(String showPopupOnDisconnect) {
        this.showPopupOnDisconnect = showPopupOnDisconnect;
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

    // layout
    private String layout = null;
    public void setLayout(String layout) {
        this.layout = layout;
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
