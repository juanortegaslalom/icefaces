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
package com.icesoft.faces.component.dataexporter;

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

public class DataExporterTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.DataExporter";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.DataExporterRenderer";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        clickToCreateFileText = null;
        _for = null;
        ignorePagination = null;
        image = null;
        includeColumns = null;
        label = null;
        outputTypeHandler = null;
        popupBlockerLabel = null;
        renderLabelAsButton = null;
        style = null;
        styleClass = null;
        type = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (clickToCreateFileText != null) {
                if (isValueReference(clickToCreateFileText)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(clickToCreateFileText));
                    _component.setValueBinding("clickToCreateFileText", _vb);
                } else {
                    _component.getAttributes().put("clickToCreateFileText", clickToCreateFileText);
                }
            }
            if (_for != null) {
                if (isValueReference(_for)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(_for));
                    _component.setValueBinding("for", _vb);
                } else {
                    _component.getAttributes().put("for", _for);
                }
            }
            if (ignorePagination != null) {
                if (isValueReference(ignorePagination)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(ignorePagination));
                    _component.setValueBinding("ignorePagination", _vb);
                } else {
                    _component.getAttributes().put("ignorePagination", Boolean.valueOf(ignorePagination));
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
            if (includeColumns != null) {
                if (isValueReference(includeColumns)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(includeColumns));
                    _component.setValueBinding("includeColumns", _vb);
                } else {
                    _component.getAttributes().put("includeColumns", includeColumns);
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
            if (outputTypeHandler != null) {
                if (isValueReference(outputTypeHandler)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(outputTypeHandler));
                    _component.setValueBinding("outputTypeHandler", _vb);
                } else {
                    _component.getAttributes().put("outputTypeHandler", outputTypeHandler);
                }
            }
            if (popupBlockerLabel != null) {
                if (isValueReference(popupBlockerLabel)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(popupBlockerLabel));
                    _component.setValueBinding("popupBlockerLabel", _vb);
                } else {
                    _component.getAttributes().put("popupBlockerLabel", popupBlockerLabel);
                }
            }
            if (renderLabelAsButton != null) {
                if (isValueReference(renderLabelAsButton)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(renderLabelAsButton));
                    _component.setValueBinding("renderLabelAsButton", _vb);
                } else {
                    _component.getAttributes().put("renderLabelAsButton", Boolean.valueOf(renderLabelAsButton));
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

    // clickToCreateFileText
    private String clickToCreateFileText = null;
    public void setClickToCreateFileText(String clickToCreateFileText) {
        this.clickToCreateFileText = clickToCreateFileText;
    }

    // for
    private String _for = null;
    public void setFor(String _for) {
        this._for = _for;
    }

    // ignorePagination
    private String ignorePagination = null;
    public void setIgnorePagination(String ignorePagination) {
        this.ignorePagination = ignorePagination;
    }

    // image
    private String image = null;
    public void setImage(String image) {
        this.image = image;
    }

    // includeColumns
    private String includeColumns = null;
    public void setIncludeColumns(String includeColumns) {
        this.includeColumns = includeColumns;
    }

    // label
    private String label = null;
    public void setLabel(String label) {
        this.label = label;
    }

    // outputTypeHandler
    private String outputTypeHandler = null;
    public void setOutputTypeHandler(String outputTypeHandler) {
        this.outputTypeHandler = outputTypeHandler;
    }

    // popupBlockerLabel
    private String popupBlockerLabel = null;
    public void setPopupBlockerLabel(String popupBlockerLabel) {
        this.popupBlockerLabel = popupBlockerLabel;
    }

    // renderLabelAsButton
    private String renderLabelAsButton = null;
    public void setRenderLabelAsButton(String renderLabelAsButton) {
        this.renderLabelAsButton = renderLabelAsButton;
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
