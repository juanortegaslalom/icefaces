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
package com.icesoft.faces.component.outputchart;

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

public class OutputChartTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.OutputChart";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.OutputChartRenderer";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        action = null;
        actionListener = null;
        chartTitle = null;
        colors = null;
        data = null;
        height = null;
        horizontal = null;
        immediate = null;
        labels = null;
        legendColumns = null;
        legendPlacement = null;
        renderOnSubmit = null;
        shapes = null;
        style = null;
        styleClass = null;
        type = null;
        width = null;
        xaxisLabels = null;
        xaxisTitle = null;
        yaxisTitle = null;
        value = null;
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
            if (chartTitle != null) {
                if (isValueReference(chartTitle)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(chartTitle));
                    _component.setValueBinding("chartTitle", _vb);
                } else {
                    _component.getAttributes().put("chartTitle", chartTitle);
                }
            }
            if (colors != null) {
                if (isValueReference(colors)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(colors));
                    _component.setValueBinding("colors", _vb);
                } else {
                    _component.getAttributes().put("colors", colors);
                }
            }
            if (data != null) {
                if (isValueReference(data)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(data));
                    _component.setValueBinding("data", _vb);
                } else {
                    _component.getAttributes().put("data", data);
                }
            }
            if (height != null) {
                if (isValueReference(height)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(height));
                    _component.setValueBinding("height", _vb);
                } else {
                    _component.getAttributes().put("height", height);
                }
            }
            if (horizontal != null) {
                if (isValueReference(horizontal)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(horizontal));
                    _component.setValueBinding("horizontal", _vb);
                } else {
                    _component.getAttributes().put("horizontal", Boolean.valueOf(horizontal));
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
            if (labels != null) {
                if (isValueReference(labels)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(labels));
                    _component.setValueBinding("labels", _vb);
                } else {
                    _component.getAttributes().put("labels", labels);
                }
            }
            if (legendColumns != null) {
                if (isValueReference(legendColumns)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(legendColumns));
                    _component.setValueBinding("legendColumns", _vb);
                } else {
                    _component.getAttributes().put("legendColumns", legendColumns);
                }
            }
            if (legendPlacement != null) {
                if (isValueReference(legendPlacement)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(legendPlacement));
                    _component.setValueBinding("legendPlacement", _vb);
                } else {
                    _component.getAttributes().put("legendPlacement", legendPlacement);
                }
            }
            if (renderOnSubmit != null) {
                if (isValueReference(renderOnSubmit)) {
                    Class[] selectionListenerArgs= new Class[]{OutputChart.class};
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(renderOnSubmit), selectionListenerArgs);
                    _component.getAttributes().put("renderOnSubmit", _mb);
                } else {
                    MethodBinding _mb = new com.icesoft.faces.el.LiteralBooleanMethodBinding(renderOnSubmit);
                    _component.getAttributes().put("renderOnSubmit", _mb);
                }
            }
            if (shapes != null) {
                if (isValueReference(shapes)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(shapes));
                    _component.setValueBinding("shapes", _vb);
                } else {
                    _component.getAttributes().put("shapes", shapes);
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
            if (width != null) {
                if (isValueReference(width)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(width));
                    _component.setValueBinding("width", _vb);
                } else {
                    _component.getAttributes().put("width", width);
                }
            }
            if (xaxisLabels != null) {
                if (isValueReference(xaxisLabels)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(xaxisLabels));
                    _component.setValueBinding("xaxisLabels", _vb);
                } else {
                    _component.getAttributes().put("xaxisLabels", xaxisLabels);
                }
            }
            if (xaxisTitle != null) {
                if (isValueReference(xaxisTitle)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(xaxisTitle));
                    _component.setValueBinding("xaxisTitle", _vb);
                } else {
                    _component.getAttributes().put("xaxisTitle", xaxisTitle);
                }
            }
            if (yaxisTitle != null) {
                if (isValueReference(yaxisTitle)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(yaxisTitle));
                    _component.setValueBinding("yaxisTitle", _vb);
                } else {
                    _component.getAttributes().put("yaxisTitle", yaxisTitle);
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

    // chartTitle
    private String chartTitle = null;
    public void setChartTitle(String chartTitle) {
        this.chartTitle = chartTitle;
    }

    // colors
    private String colors = null;
    public void setColors(String colors) {
        this.colors = colors;
    }

    // data
    private String data = null;
    public void setData(String data) {
        this.data = data;
    }

    // height
    private String height = null;
    public void setHeight(String height) {
        this.height = height;
    }

    // horizontal
    private String horizontal = null;
    public void setHorizontal(String horizontal) {
        this.horizontal = horizontal;
    }

    // immediate
    private String immediate = null;
    public void setImmediate(String immediate) {
        this.immediate = immediate;
    }

    // labels
    private String labels = null;
    public void setLabels(String labels) {
        this.labels = labels;
    }

    // legendColumns
    private String legendColumns = null;
    public void setLegendColumns(String legendColumns) {
        this.legendColumns = legendColumns;
    }

    // legendPlacement
    private String legendPlacement = null;
    public void setLegendPlacement(String legendPlacement) {
        this.legendPlacement = legendPlacement;
    }

    // renderOnSubmit
    private String renderOnSubmit = null;
    public void setRenderOnSubmit(String renderOnSubmit) {
        this.renderOnSubmit = renderOnSubmit;
    }

    // shapes
    private String shapes = null;
    public void setShapes(String shapes) {
        this.shapes = shapes;
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

    // width
    private String width = null;
    public void setWidth(String width) {
        this.width = width;
    }

    // xaxisLabels
    private String xaxisLabels = null;
    public void setXaxisLabels(String xaxisLabels) {
        this.xaxisLabels = xaxisLabels;
    }

    // xaxisTitle
    private String xaxisTitle = null;
    public void setXaxisTitle(String xaxisTitle) {
        this.xaxisTitle = xaxisTitle;
    }

    // yaxisTitle
    private String yaxisTitle = null;
    public void setYaxisTitle(String yaxisTitle) {
        this.yaxisTitle = yaxisTitle;
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
