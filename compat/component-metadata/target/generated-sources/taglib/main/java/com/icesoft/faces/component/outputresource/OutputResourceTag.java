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
package com.icesoft.faces.component.outputresource;

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

public class OutputResourceTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.OutputResource";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.OutputResourceRenderer";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        attachment = null;
        disabled = null;
        fileName = null;
        image = null;
        label = null;
        lastModified = null;
        mimeType = null;
        renderedOnUserRole = null;
        resource = null;
        shared = null;
        style = null;
        styleClass = null;
        target = null;
        type = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (attachment != null) {
                if (isValueReference(attachment)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(attachment));
                    _component.setValueBinding("attachment", _vb);
                } else {
                    _component.getAttributes().put("attachment", Boolean.valueOf(attachment));
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
            if (fileName != null) {
                if (isValueReference(fileName)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(fileName));
                    _component.setValueBinding("fileName", _vb);
                } else {
                    _component.getAttributes().put("fileName", fileName);
                }
            }
            if (image != null) {
                if (isValueReference(image)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(image));
                    _component.setValueBinding("image", _vb);
                } else {
                    _component.getAttributes().put("image", image);
                }
            }
            if (label != null) {
                if (isValueReference(label)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(label));
                    _component.setValueBinding("label", _vb);
                } else {
                    _component.getAttributes().put("label", label);
                }
            }
            if (lastModified != null) {
                if (isValueReference(lastModified)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(lastModified));
                    _component.setValueBinding("lastModified", _vb);
                } else {
                    _component.getAttributes().put("lastModified", lastModified);
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
            if (renderedOnUserRole != null) {
                if (isValueReference(renderedOnUserRole)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(renderedOnUserRole));
                    _component.setValueBinding("renderedOnUserRole", _vb);
                } else {
                    _component.getAttributes().put("renderedOnUserRole", renderedOnUserRole);
                }
            }
            if (resource != null) {
                if (isValueReference(resource)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(resource));
                    _component.setValueBinding("resource", _vb);
                } else {
                    _component.getAttributes().put("resource", resource);
                }
            }
            if (shared != null) {
                if (isValueReference(shared)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(shared));
                    _component.setValueBinding("shared", _vb);
                } else {
                    _component.getAttributes().put("shared", Boolean.valueOf(shared));
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
            if (target != null) {
                if (isValueReference(target)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(target));
                    _component.setValueBinding("target", _vb);
                } else {
                    _component.getAttributes().put("target", target);
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

    // attachment
    private String attachment = null;
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    // disabled
    private String disabled = null;
    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    // fileName
    private String fileName = null;
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    // image
    private String image = null;
    public void setImage(String image) {
        this.image = image;
    }

    // label
    private String label = null;
    public void setLabel(String label) {
        this.label = label;
    }

    // lastModified
    private String lastModified = null;
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    // mimeType
    private String mimeType = null;
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    // renderedOnUserRole
    private String renderedOnUserRole = null;
    public void setRenderedOnUserRole(String renderedOnUserRole) {
        this.renderedOnUserRole = renderedOnUserRole;
    }

    // resource
    private String resource = null;
    public void setResource(String resource) {
        this.resource = resource;
    }

    // shared
    private String shared = null;
    public void setShared(String shared) {
        this.shared = shared;
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

    // target
    private String target = null;
    public void setTarget(String target) {
        this.target = target;
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
