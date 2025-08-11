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

public class PanelCollapsibleTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.PanelCollapsible";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.PanelCollapsibleRenderer";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        actionListener = null;
        disabled = null;
        enabledOnUserRole = null;
        expanded = null;
        immediate = null;
        renderedOnUserRole = null;
        style = null;
        styleClass = null;
        tabindex = null;
        toggleOnClick = null;
        toggleOnInput = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (actionListener != null) {
                if (isValueReference(actionListener)) {
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(actionListener), actionListenerArgs);
                    _component.getAttributes().put("actionListener", _mb);
                } else {
                    throw new IllegalArgumentException(actionListener);
                }
            }
            if (disabled != null) {
                if (isValueReference(disabled)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(disabled));
                    _component.setValueBinding("disabled", _vb);
                } else {
                    _component.getAttributes().put("disabled", Boolean.valueOf(disabled));
                }
            }
            if (enabledOnUserRole != null) {
                if (isValueReference(enabledOnUserRole)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(enabledOnUserRole));
                    _component.setValueBinding("enabledOnUserRole", _vb);
                } else {
                    _component.getAttributes().put("enabledOnUserRole", enabledOnUserRole);
                }
            }
            if (expanded != null) {
                if (isValueReference(expanded)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(expanded));
                    _component.setValueBinding("expanded", _vb);
                } else {
                    _component.getAttributes().put("expanded", Boolean.valueOf(expanded));
                }
            }
            if (immediate != null) {
                if (isValueReference(immediate)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(immediate));
                    _component.setValueBinding("immediate", _vb);
                } else {
                    _component.getAttributes().put("immediate", Boolean.valueOf(immediate));
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
            if (tabindex != null) {
                if (isValueReference(tabindex)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(tabindex));
                    _component.setValueBinding("tabindex", _vb);
                } else {
                    _component.getAttributes().put("tabindex", tabindex);
                }
            }
            if (toggleOnClick != null) {
                if (isValueReference(toggleOnClick)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(toggleOnClick));
                    _component.setValueBinding("toggleOnClick", _vb);
                } else {
                    _component.getAttributes().put("toggleOnClick", Boolean.valueOf(toggleOnClick));
                }
            }
            if (toggleOnInput != null) {
                if (isValueReference(toggleOnInput)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(toggleOnInput));
                    _component.setValueBinding("toggleOnInput", _vb);
                } else {
                    _component.getAttributes().put("toggleOnInput", Boolean.valueOf(toggleOnInput));
                }
            }
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // actionListener
    private String actionListener = null;
    public void setActionListener(String actionListener) {
        this.actionListener = actionListener;
    }

    // disabled
    private String disabled = null;
    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    // enabledOnUserRole
    private String enabledOnUserRole = null;
    public void setEnabledOnUserRole(String enabledOnUserRole) {
        this.enabledOnUserRole = enabledOnUserRole;
    }

    // expanded
    private String expanded = null;
    public void setExpanded(String expanded) {
        this.expanded = expanded;
    }

    // immediate
    private String immediate = null;
    public void setImmediate(String immediate) {
        this.immediate = immediate;
    }

    // renderedOnUserRole
    private String renderedOnUserRole = null;
    public void setRenderedOnUserRole(String renderedOnUserRole) {
        this.renderedOnUserRole = renderedOnUserRole;
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

    // tabindex
    private String tabindex = null;
    public void setTabindex(String tabindex) {
        this.tabindex = tabindex;
    }

    // toggleOnClick
    private String toggleOnClick = null;
    public void setToggleOnClick(String toggleOnClick) {
        this.toggleOnClick = toggleOnClick;
    }

    // toggleOnInput
    private String toggleOnInput = null;
    public void setToggleOnInput(String toggleOnInput) {
        this.toggleOnInput = toggleOnInput;
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
