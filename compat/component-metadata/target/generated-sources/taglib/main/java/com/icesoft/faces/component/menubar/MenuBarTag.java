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
package com.icesoft.faces.component.menubar;

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

public class MenuBarTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.Menu";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.View";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        displayOnClick = null;
        imageDir = null;
        immediate = null;
        keyboardNavigationEnabled = null;
        noIcons = null;
        orientation = null;
        renderedOnUserRole = null;
        scrollableDivMode = null;
        style = null;
        styleClass = null;
        value = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (displayOnClick != null) {
                if (isValueReference(displayOnClick)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(displayOnClick));
                    _component.setValueBinding("displayOnClick", _vb);
                } else {
                    _component.getAttributes().put("displayOnClick", Boolean.valueOf(displayOnClick));
                }
            }
            if (imageDir != null) {
                if (isValueReference(imageDir)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(imageDir));
                    _component.setValueBinding("imageDir", _vb);
                } else {
                    _component.getAttributes().put("imageDir", imageDir);
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
            if (keyboardNavigationEnabled != null) {
                if (isValueReference(keyboardNavigationEnabled)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(keyboardNavigationEnabled));
                    _component.setValueBinding("keyboardNavigationEnabled", _vb);
                } else {
                    _component.getAttributes().put("keyboardNavigationEnabled", Boolean.valueOf(keyboardNavigationEnabled));
                }
            }
            if (noIcons != null) {
                if (isValueReference(noIcons)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(noIcons));
                    _component.setValueBinding("noIcons", _vb);
                } else {
                    _component.getAttributes().put("noIcons", noIcons);
                }
            }
            if (orientation != null) {
                if (isValueReference(orientation)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(orientation));
                    _component.setValueBinding("orientation", _vb);
                } else {
                    _component.getAttributes().put("orientation", orientation);
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
            if (scrollableDivMode != null) {
                if (isValueReference(scrollableDivMode)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(scrollableDivMode));
                    _component.setValueBinding("scrollableDivMode", _vb);
                } else {
                    _component.getAttributes().put("scrollableDivMode", Boolean.valueOf(scrollableDivMode));
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
            if (value != null) {
                if (isValueReference(value)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(value));
                    _component.setValueBinding("value", _vb);
                } else {
                    _component.getAttributes().put("value", value);
                }
            }
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // displayOnClick
    private String displayOnClick = null;
    public void setDisplayOnClick(String displayOnClick) {
        this.displayOnClick = displayOnClick;
    }

    // imageDir
    private String imageDir = null;
    public void setImageDir(String imageDir) {
        this.imageDir = imageDir;
    }

    // immediate
    private String immediate = null;
    public void setImmediate(String immediate) {
        this.immediate = immediate;
    }

    // keyboardNavigationEnabled
    private String keyboardNavigationEnabled = null;
    public void setKeyboardNavigationEnabled(String keyboardNavigationEnabled) {
        this.keyboardNavigationEnabled = keyboardNavigationEnabled;
    }

    // noIcons
    private String noIcons = null;
    public void setNoIcons(String noIcons) {
        this.noIcons = noIcons;
    }

    // orientation
    private String orientation = null;
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    // renderedOnUserRole
    private String renderedOnUserRole = null;
    public void setRenderedOnUserRole(String renderedOnUserRole) {
        this.renderedOnUserRole = renderedOnUserRole;
    }

    // scrollableDivMode
    private String scrollableDivMode = null;
    public void setScrollableDivMode(String scrollableDivMode) {
        this.scrollableDivMode = scrollableDivMode;
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

    // value
    private String value = null;
    public void setValue(String value) {
        this.value = value;
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
