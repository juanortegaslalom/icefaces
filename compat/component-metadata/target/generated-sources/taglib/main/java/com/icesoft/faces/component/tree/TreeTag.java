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
package com.icesoft.faces.component.tree;

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

public class TreeTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.TreeView";
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
        action = null;
        actionListener = null;
        documentImage = null;
        folderImage = null;
        folderOpenImage = null;
        hideNavigation = null;
        hideRootNode = null;
        imageDir = null;
        immediate = null;
        keyboardNavigationEnabled = null;
        navCloseTop = null;
        navOpenTop = null;
        navOpenTopNoSiblings = null;
        style = null;
        styleClass = null;
        value = null;
        _var = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (action != null) {
                if (isValueReference(action)) {
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(action), actionArgs);
                    _component.getAttributes().put("action", _mb);
                } else {
                    MethodBinding _mb = new com.icesoft.faces.component.ext.taglib.MethodBindingString(action);
                    _component.getAttributes().put("action", _mb);
                }
            }
            if (actionListener != null) {
                if (isValueReference(actionListener)) {
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(actionListener), actionListenerArgs);
                    _component.getAttributes().put("actionListener", _mb);
                } else {
                    throw new IllegalArgumentException(actionListener);
                }
            }
            if (documentImage != null) {
                if (isValueReference(documentImage)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(documentImage));
                    _component.setValueBinding("documentImage", _vb);
                } else {
                    _component.getAttributes().put("documentImage", documentImage);
                }
            }
            if (folderImage != null) {
                if (isValueReference(folderImage)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(folderImage));
                    _component.setValueBinding("folderImage", _vb);
                } else {
                    _component.getAttributes().put("folderImage", folderImage);
                }
            }
            if (folderOpenImage != null) {
                if (isValueReference(folderOpenImage)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(folderOpenImage));
                    _component.setValueBinding("folderOpenImage", _vb);
                } else {
                    _component.getAttributes().put("folderOpenImage", folderOpenImage);
                }
            }
            if (hideNavigation != null) {
                if (isValueReference(hideNavigation)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(hideNavigation));
                    _component.setValueBinding("hideNavigation", _vb);
                } else {
                    _component.getAttributes().put("hideNavigation", hideNavigation);
                }
            }
            if (hideRootNode != null) {
                if (isValueReference(hideRootNode)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(hideRootNode));
                    _component.setValueBinding("hideRootNode", _vb);
                } else {
                    _component.getAttributes().put("hideRootNode", hideRootNode);
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
            if (navCloseTop != null) {
                if (isValueReference(navCloseTop)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(navCloseTop));
                    _component.setValueBinding("navCloseTop", _vb);
                } else {
                    _component.getAttributes().put("navCloseTop", navCloseTop);
                }
            }
            if (navOpenTop != null) {
                if (isValueReference(navOpenTop)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(navOpenTop));
                    _component.setValueBinding("navOpenTop", _vb);
                } else {
                    _component.getAttributes().put("navOpenTop", navOpenTop);
                }
            }
            if (navOpenTopNoSiblings != null) {
                if (isValueReference(navOpenTopNoSiblings)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(navOpenTopNoSiblings));
                    _component.setValueBinding("navOpenTopNoSiblings", _vb);
                } else {
                    _component.getAttributes().put("navOpenTopNoSiblings", navOpenTopNoSiblings);
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
            if (_var != null) {
                if (isValueReference(_var)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(_var));
                    _component.setValueBinding("var", _vb);
                } else {
                    _component.getAttributes().put("var", _var);
                }
            }
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // action
    private String action = null;
    public void setAction(String action) {
        this.action = action;
    }

    // actionListener
    private String actionListener = null;
    public void setActionListener(String actionListener) {
        this.actionListener = actionListener;
    }

    // documentImage
    private String documentImage = null;
    public void setDocumentImage(String documentImage) {
        this.documentImage = documentImage;
    }

    // folderImage
    private String folderImage = null;
    public void setFolderImage(String folderImage) {
        this.folderImage = folderImage;
    }

    // folderOpenImage
    private String folderOpenImage = null;
    public void setFolderOpenImage(String folderOpenImage) {
        this.folderOpenImage = folderOpenImage;
    }

    // hideNavigation
    private String hideNavigation = null;
    public void setHideNavigation(String hideNavigation) {
        this.hideNavigation = hideNavigation;
    }

    // hideRootNode
    private String hideRootNode = null;
    public void setHideRootNode(String hideRootNode) {
        this.hideRootNode = hideRootNode;
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

    // navCloseTop
    private String navCloseTop = null;
    public void setNavCloseTop(String navCloseTop) {
        this.navCloseTop = navCloseTop;
    }

    // navOpenTop
    private String navOpenTop = null;
    public void setNavOpenTop(String navOpenTop) {
        this.navOpenTop = navOpenTop;
    }

    // navOpenTopNoSiblings
    private String navOpenTopNoSiblings = null;
    public void setNavOpenTopNoSiblings(String navOpenTopNoSiblings) {
        this.navOpenTopNoSiblings = navOpenTopNoSiblings;
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

    // var
    private String _var = null;
    public void setVar(String _var) {
        this._var = _var;
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
