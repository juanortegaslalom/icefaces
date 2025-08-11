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
package com.icesoft.faces.component;

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

public class PanelGroupTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.HtmlPanelGroup";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.Group";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        contextValue = null;
        dragListener = null;
        dragMask = null;
        dragOptions = null;
        dragValue = null;
        draggable = null;
        dropListener = null;
        dropMask = null;
        dropTarget = null;
        dropTargetScrollerId = null;
        dropValue = null;
        effect = null;
        hoverclass = null;
        menuPopup = null;
        onclick = null;
        onclickeffect = null;
        ondblclick = null;
        ondblclickeffect = null;
        onkeydown = null;
        onkeydowneffect = null;
        onkeypress = null;
        onkeypresseffect = null;
        onkeyup = null;
        onkeyupeffect = null;
        onmousedown = null;
        onmousedowneffect = null;
        onmousemove = null;
        onmousemoveeffect = null;
        onmouseout = null;
        onmouseouteffect = null;
        onmouseover = null;
        onmouseovereffect = null;
        onmouseup = null;
        onmouseupeffect = null;
        panelTooltip = null;
        renderedOnUserRole = null;
        renderedStyle = null;
        scrollHeight = null;
        scrollWidth = null;
        styleClass = null;
        title = null;
        visible = null;
        layout = null;
        style = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (contextValue != null) {
                if (isValueReference(contextValue)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(contextValue));
                    _component.setValueBinding("contextValue", _vb);
                } else {
                    _component.getAttributes().put("contextValue", contextValue);
                }
            }
            if (dragListener != null) {
                if (isValueReference(dragListener)) {
                    Class[] dragListenerArgs = new Class[]{com.icesoft.faces.component.dragdrop.DragEvent.class};
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(dragListener), dragListenerArgs);
                    ((com.icesoft.faces.component.ext.HtmlPanelGroup)_component).setDragListener(_mb);
                } else {
                    throw new IllegalArgumentException(dragListener);
                }
            }
            if (dragMask != null) {
                if (isValueReference(dragMask)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(dragMask));
                    _component.setValueBinding("dragMask", _vb);
                } else {
                    _component.getAttributes().put("dragMask", dragMask);
                }
            }
            if (dragOptions != null) {
                if (isValueReference(dragOptions)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(dragOptions));
                    _component.setValueBinding("dragOptions", _vb);
                } else {
                    _component.getAttributes().put("dragOptions", dragOptions);
                }
            }
            if (dragValue != null) {
                if (isValueReference(dragValue)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(dragValue));
                    _component.setValueBinding("dragValue", _vb);
                } else {
                    _component.getAttributes().put("dragValue", dragValue);
                }
            }
            if (draggable != null) {
                if (isValueReference(draggable)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(draggable));
                    _component.setValueBinding("draggable", _vb);
                } else {
                    _component.getAttributes().put("draggable", draggable);
                }
            }
            if (dropListener != null) {
                if (isValueReference(dropListener)) {
                    Class[] dropListenerArgs= new Class[]{com.icesoft.faces.component.dragdrop.DropEvent.class};
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(dropListener), dropListenerArgs );
                    _component.getAttributes().put("dropListener", _mb);
                } else {
                    throw new IllegalArgumentException(dropListener);
                }
            }
            if (dropMask != null) {
                if (isValueReference(dropMask)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(dropMask));
                    _component.setValueBinding("dropMask", _vb);
                } else {
                    _component.getAttributes().put("dropMask", dropMask);
                }
            }
            if (dropTarget != null) {
                if (isValueReference(dropTarget)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(dropTarget));
                    _component.setValueBinding("dropTarget", _vb);
                } else {
                    _component.getAttributes().put("dropTarget", dropTarget);
                }
            }
            if (dropTargetScrollerId != null) {
                if (isValueReference(dropTargetScrollerId)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(dropTargetScrollerId));
                    _component.setValueBinding("dropTargetScrollerId", _vb);
                } else {
                    _component.getAttributes().put("dropTargetScrollerId", dropTargetScrollerId);
                }
            }
            if (dropValue != null) {
                if (isValueReference(dropValue)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(dropValue));
                    _component.setValueBinding("dropValue", _vb);
                } else {
                    _component.getAttributes().put("dropValue", dropValue);
                }
            }
            if (effect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addEffect(effect, _component);
            }
            if (hoverclass != null) {
                if (isValueReference(hoverclass)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(hoverclass));
                    _component.setValueBinding("hoverclass", _vb);
                } else {
                    _component.getAttributes().put("hoverclass", hoverclass);
                }
            }
            if (menuPopup != null) {
                if (isValueReference(menuPopup)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(menuPopup));
                    _component.setValueBinding("menuPopup", _vb);
                } else {
                    _component.getAttributes().put("menuPopup", menuPopup);
                }
            }
            if (onclick != null) {
                if (isValueReference(onclick)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onclick));
                    _component.setValueBinding("onclick", _vb);
                } else {
                    _component.getAttributes().put("onclick", onclick);
                }
            }
            if (onclickeffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onclickeffect, "onclickeffect", _component);
            }
            if (ondblclick != null) {
                if (isValueReference(ondblclick)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(ondblclick));
                    _component.setValueBinding("ondblclick", _vb);
                } else {
                    _component.getAttributes().put("ondblclick", ondblclick);
                }
            }
            if (ondblclickeffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(ondblclickeffect, "ondblclickeffect", _component);
            }
            if (onkeydown != null) {
                if (isValueReference(onkeydown)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onkeydown));
                    _component.setValueBinding("onkeydown", _vb);
                } else {
                    _component.getAttributes().put("onkeydown", onkeydown);
                }
            }
            if (onkeydowneffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onkeydowneffect, "onkeydowneffect", _component);
            }
            if (onkeypress != null) {
                if (isValueReference(onkeypress)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onkeypress));
                    _component.setValueBinding("onkeypress", _vb);
                } else {
                    _component.getAttributes().put("onkeypress", onkeypress);
                }
            }
            if (onkeypresseffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onkeypresseffect, "onkeypresseffect", _component);
            }
            if (onkeyup != null) {
                if (isValueReference(onkeyup)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onkeyup));
                    _component.setValueBinding("onkeyup", _vb);
                } else {
                    _component.getAttributes().put("onkeyup", onkeyup);
                }
            }
            if (onkeyupeffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onkeyupeffect, "onkeyupeffect", _component);
            }
            if (onmousedown != null) {
                if (isValueReference(onmousedown)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmousedown));
                    _component.setValueBinding("onmousedown", _vb);
                } else {
                    _component.getAttributes().put("onmousedown", onmousedown);
                }
            }
            if (onmousedowneffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onmousedowneffect, "onmousedowneffect", _component);
            }
            if (onmousemove != null) {
                if (isValueReference(onmousemove)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmousemove));
                    _component.setValueBinding("onmousemove", _vb);
                } else {
                    _component.getAttributes().put("onmousemove", onmousemove);
                }
            }
            if (onmousemoveeffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onmousemoveeffect, "onmousemoveeffect", _component);
            }
            if (onmouseout != null) {
                if (isValueReference(onmouseout)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmouseout));
                    _component.setValueBinding("onmouseout", _vb);
                } else {
                    _component.getAttributes().put("onmouseout", onmouseout);
                }
            }
            if (onmouseouteffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onmouseouteffect, "onmouseouteffect", _component);
            }
            if (onmouseover != null) {
                if (isValueReference(onmouseover)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmouseover));
                    _component.setValueBinding("onmouseover", _vb);
                } else {
                    _component.getAttributes().put("onmouseover", onmouseover);
                }
            }
            if (onmouseovereffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onmouseovereffect, "onmouseovereffect", _component);
            }
            if (onmouseup != null) {
                if (isValueReference(onmouseup)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmouseup));
                    _component.setValueBinding("onmouseup", _vb);
                } else {
                    _component.getAttributes().put("onmouseup", onmouseup);
                }
            }
            if (onmouseupeffect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addLocalEffect(onmouseupeffect, "onmouseupeffect", _component);
            }
            if (panelTooltip != null) {
                if (isValueReference(panelTooltip)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(panelTooltip));
                    _component.setValueBinding("panelTooltip", _vb);
                } else {
                    _component.getAttributes().put("panelTooltip", panelTooltip);
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
            if (renderedStyle != null) {
                if (isValueReference(renderedStyle)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(renderedStyle));
                    _component.setValueBinding("renderedStyle", _vb);
                } else {
                    _component.getAttributes().put("renderedStyle", renderedStyle);
                }
            }
            if (scrollHeight != null) {
                if (isValueReference(scrollHeight)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(scrollHeight));
                    _component.setValueBinding("scrollHeight", _vb);
                } else {
                    _component.getAttributes().put("scrollHeight", scrollHeight);
                }
            }
            if (scrollWidth != null) {
                if (isValueReference(scrollWidth)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(scrollWidth));
                    _component.setValueBinding("scrollWidth", _vb);
                } else {
                    _component.getAttributes().put("scrollWidth", scrollWidth);
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
            if (visible != null) {
                if (isValueReference(visible)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(visible));
                    _component.setValueBinding("visible", _vb);
                } else {
                    _component.getAttributes().put("visible", Boolean.valueOf(visible));
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
            if (style != null) {
                if (isValueReference(style)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(style));
                    _component.setValueBinding("style", _vb);
                } else {
                    _component.getAttributes().put("style", style);
                }
            }
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // contextValue
    private String contextValue = null;
    public void setContextValue(String contextValue) {
        this.contextValue = contextValue;
    }

    // dragListener
    private String dragListener = null;
    public void setDragListener(String dragListener) {
        this.dragListener = dragListener;
    }

    // dragMask
    private String dragMask = null;
    public void setDragMask(String dragMask) {
        this.dragMask = dragMask;
    }

    // dragOptions
    private String dragOptions = null;
    public void setDragOptions(String dragOptions) {
        this.dragOptions = dragOptions;
    }

    // dragValue
    private String dragValue = null;
    public void setDragValue(String dragValue) {
        this.dragValue = dragValue;
    }

    // draggable
    private String draggable = null;
    public void setDraggable(String draggable) {
        this.draggable = draggable;
    }

    // dropListener
    private String dropListener = null;
    public void setDropListener(String dropListener) {
        this.dropListener = dropListener;
    }

    // dropMask
    private String dropMask = null;
    public void setDropMask(String dropMask) {
        this.dropMask = dropMask;
    }

    // dropTarget
    private String dropTarget = null;
    public void setDropTarget(String dropTarget) {
        this.dropTarget = dropTarget;
    }

    // dropTargetScrollerId
    private String dropTargetScrollerId = null;
    public void setDropTargetScrollerId(String dropTargetScrollerId) {
        this.dropTargetScrollerId = dropTargetScrollerId;
    }

    // dropValue
    private String dropValue = null;
    public void setDropValue(String dropValue) {
        this.dropValue = dropValue;
    }

    // effect
    private String effect = null;
    public void setEffect(String effect) {
        this.effect = effect;
    }

    // hoverclass
    private String hoverclass = null;
    public void setHoverclass(String hoverclass) {
        this.hoverclass = hoverclass;
    }

    // menuPopup
    private String menuPopup = null;
    public void setMenuPopup(String menuPopup) {
        this.menuPopup = menuPopup;
    }

    // onclick
    private String onclick = null;
    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    // onclickeffect
    private String onclickeffect = null;
    public void setOnclickeffect(String onclickeffect) {
        this.onclickeffect = onclickeffect;
    }

    // ondblclick
    private String ondblclick = null;
    public void setOndblclick(String ondblclick) {
        this.ondblclick = ondblclick;
    }

    // ondblclickeffect
    private String ondblclickeffect = null;
    public void setOndblclickeffect(String ondblclickeffect) {
        this.ondblclickeffect = ondblclickeffect;
    }

    // onkeydown
    private String onkeydown = null;
    public void setOnkeydown(String onkeydown) {
        this.onkeydown = onkeydown;
    }

    // onkeydowneffect
    private String onkeydowneffect = null;
    public void setOnkeydowneffect(String onkeydowneffect) {
        this.onkeydowneffect = onkeydowneffect;
    }

    // onkeypress
    private String onkeypress = null;
    public void setOnkeypress(String onkeypress) {
        this.onkeypress = onkeypress;
    }

    // onkeypresseffect
    private String onkeypresseffect = null;
    public void setOnkeypresseffect(String onkeypresseffect) {
        this.onkeypresseffect = onkeypresseffect;
    }

    // onkeyup
    private String onkeyup = null;
    public void setOnkeyup(String onkeyup) {
        this.onkeyup = onkeyup;
    }

    // onkeyupeffect
    private String onkeyupeffect = null;
    public void setOnkeyupeffect(String onkeyupeffect) {
        this.onkeyupeffect = onkeyupeffect;
    }

    // onmousedown
    private String onmousedown = null;
    public void setOnmousedown(String onmousedown) {
        this.onmousedown = onmousedown;
    }

    // onmousedowneffect
    private String onmousedowneffect = null;
    public void setOnmousedowneffect(String onmousedowneffect) {
        this.onmousedowneffect = onmousedowneffect;
    }

    // onmousemove
    private String onmousemove = null;
    public void setOnmousemove(String onmousemove) {
        this.onmousemove = onmousemove;
    }

    // onmousemoveeffect
    private String onmousemoveeffect = null;
    public void setOnmousemoveeffect(String onmousemoveeffect) {
        this.onmousemoveeffect = onmousemoveeffect;
    }

    // onmouseout
    private String onmouseout = null;
    public void setOnmouseout(String onmouseout) {
        this.onmouseout = onmouseout;
    }

    // onmouseouteffect
    private String onmouseouteffect = null;
    public void setOnmouseouteffect(String onmouseouteffect) {
        this.onmouseouteffect = onmouseouteffect;
    }

    // onmouseover
    private String onmouseover = null;
    public void setOnmouseover(String onmouseover) {
        this.onmouseover = onmouseover;
    }

    // onmouseovereffect
    private String onmouseovereffect = null;
    public void setOnmouseovereffect(String onmouseovereffect) {
        this.onmouseovereffect = onmouseovereffect;
    }

    // onmouseup
    private String onmouseup = null;
    public void setOnmouseup(String onmouseup) {
        this.onmouseup = onmouseup;
    }

    // onmouseupeffect
    private String onmouseupeffect = null;
    public void setOnmouseupeffect(String onmouseupeffect) {
        this.onmouseupeffect = onmouseupeffect;
    }

    // panelTooltip
    private String panelTooltip = null;
    public void setPanelTooltip(String panelTooltip) {
        this.panelTooltip = panelTooltip;
    }

    // renderedOnUserRole
    private String renderedOnUserRole = null;
    public void setRenderedOnUserRole(String renderedOnUserRole) {
        this.renderedOnUserRole = renderedOnUserRole;
    }

    // renderedStyle
    private String renderedStyle = null;
    public void setRenderedStyle(String renderedStyle) {
        this.renderedStyle = renderedStyle;
    }

    // scrollHeight
    private String scrollHeight = null;
    public void setScrollHeight(String scrollHeight) {
        this.scrollHeight = scrollHeight;
    }

    // scrollWidth
    private String scrollWidth = null;
    public void setScrollWidth(String scrollWidth) {
        this.scrollWidth = scrollWidth;
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

    // visible
    private String visible = null;
    public void setVisible(String visible) {
        this.visible = visible;
    }

    // layout
    private String layout = null;
    public void setLayout(String layout) {
        this.layout = layout;
    }

    // style
    private String style = null;
    public void setStyle(String style) {
        this.style = style;
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
