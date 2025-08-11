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
package com.icesoft.faces.component.ext;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Groups a set of child components together
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class HtmlPanelGroupBase extends javax.faces.component.html.HtmlPanelGroup {

    /**
     * <p>Construct a new <code>HtmlPanelGroupBase</code>.</p>
     */
    public HtmlPanelGroupBase() {
        super();
        setRendererType("com.icesoft.faces.Group");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Panel";
    }

    // contextValue
    private Object contextValue = null;

    /**
 * <p>A means of uniquely identifying this component, from the 
 * 		data model's perspective. For example, if this were on a 
 * 		dataTable's cell, then it would encapsulate some means of 
 * 		identifying the row and the column.</p>
     */
    public Object getContextValue() {
        if (this.contextValue != null) {
            return this.contextValue;
        }
        ValueBinding _vb = getValueBinding("contextValue");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>A means of uniquely identifying this component, from the 
 * 		data model's perspective. For example, if this were on a 
 * 		dataTable's cell, then it would encapsulate some means of 
 * 		identifying the row and the column.</p>
     * @see #getContextValue()
     */
    public void setContextValue(Object contextValue) {
        this.contextValue = contextValue;
    }

    // dragListener
    private javax.faces.el.MethodBinding dragListener = null;

    /**
 * <p>The dragListener specifies a method on a backing bean that will
 * 		accept DnDEvents. This value must be a method binding
 * 		expression.</p>
     */
    public javax.faces.el.MethodBinding getDragListener() {
        if (this.dragListener != null) {
            return this.dragListener;
        }
        ValueBinding _vb = getValueBinding("dragListener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The dragListener specifies a method on a backing bean that will
 * 		accept DnDEvents. This value must be a method binding
 * 		expression.</p>
     * @see #getDragListener()
     */
    public void setDragListener(javax.faces.el.MethodBinding dragListener) {
        this.dragListener = dragListener;
    }

    // dragMask
    private String dragMask = null;

    /**
 * <p>Drag mask is used to prevent drag events from propagating to the
 * 		server. For example if your backing bean is not interested in
 * 		HOVER_START events then adding hover_start to the mask will stop
 * 		the event from being sent. Multiple values are specified in a
 * 		comma separated list. Possible values are. dragging,
 * 		drag_cancel,dropped,hover_start,hover_end</p>
     */
    public String getDragMask() {
        if (this.dragMask != null) {
            return this.dragMask;
        }
        ValueBinding _vb = getValueBinding("dragMask");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Drag mask is used to prevent drag events from propagating to the
 * 		server. For example if your backing bean is not interested in
 * 		HOVER_START events then adding hover_start to the mask will stop
 * 		the event from being sent. Multiple values are specified in a
 * 		comma separated list. Possible values are. dragging,
 * 		drag_cancel,dropped,hover_start,hover_end</p>
     * @see #getDragMask()
     */
    public void setDragMask(String dragMask) {
        this.dragMask = dragMask;
    }

    // dragOptions
    private String dragOptions = null;

    /**
 * <p>Optional effects for draggable panels. List in a coma seperated
 * 		string. (revert,ghosting,solid) revert - When a draggable is
 * 		dropped the draggable will move back to it's starting position.
 * 		ghosting - When a draggable is dragged a ghost copy is left in
 * 		the original position. solid - Do not make transparent when
 * 		dragging.</p>
     */
    public String getDragOptions() {
        if (this.dragOptions != null) {
            return this.dragOptions;
        }
        ValueBinding _vb = getValueBinding("dragOptions");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Optional effects for draggable panels. List in a coma seperated
 * 		string. (revert,ghosting,solid) revert - When a draggable is
 * 		dropped the draggable will move back to it's starting position.
 * 		ghosting - When a draggable is dragged a ghost copy is left in
 * 		the original position. solid - Do not make transparent when
 * 		dragging.</p>
     * @see #getDragOptions()
     */
    public void setDragOptions(String dragOptions) {
        this.dragOptions = dragOptions;
    }

    // dragValue
    private Object dragValue = null;

    /**
 * <p>The drop value of this panel, for use in DnDEvents. This value
 * 		can be a string or a value binding expression.</p>
     */
    public Object getDragValue() {
        if (this.dragValue != null) {
            return this.dragValue;
        }
        ValueBinding _vb = getValueBinding("dragValue");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The drop value of this panel, for use in DnDEvents. This value
 * 		can be a string or a value binding expression.</p>
     * @see #getDragValue()
     */
    public void setDragValue(Object dragValue) {
        this.dragValue = dragValue;
    }

    // draggable
    private String draggable = null;

    /**
 * <p>When set to 'true' this panel is draggable. The user will be
 * 		able to drag the panel to any position on the page. Note: all
 * 		Draggable panels must be contained in a form.</p>
     */
    public String getDraggable() {
        if (this.draggable != null) {
            return this.draggable;
        }
        ValueBinding _vb = getValueBinding("draggable");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>When set to 'true' this panel is draggable. The user will be
 * 		able to drag the panel to any position on the page. Note: all
 * 		Draggable panels must be contained in a form.</p>
     * @see #getDraggable()
     */
    public void setDraggable(String draggable) {
        this.draggable = draggable;
    }

    // dropListener
    private javax.faces.el.MethodBinding dropListener = null;

    /**
 * <p>The dropListener specifies a method on a backing bean that will
 * 		accept DnDEvents. This value must be a method binding
 * 		expression. This method will be called when a droppable is
 * 		dropped or hovered on this panel unless masked.</p>
     */
    public javax.faces.el.MethodBinding getDropListener() {
        if (this.dropListener != null) {
            return this.dropListener;
        }
        ValueBinding _vb = getValueBinding("dropListener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The dropListener specifies a method on a backing bean that will
 * 		accept DnDEvents. This value must be a method binding
 * 		expression. This method will be called when a droppable is
 * 		dropped or hovered on this panel unless masked.</p>
     * @see #getDropListener()
     */
    public void setDropListener(javax.faces.el.MethodBinding dropListener) {
        this.dropListener = dropListener;
    }

    // dropMask
    private String dropMask = null;

    /**
 * <p>Drop mask is used to prevent drop events from propagating to the
 * 		server. For example if your backing bean is not interested in
 * 		HOVER_START events then adding hover_start to the mask will stop
 * 		the event from being sent. Multiple values are specified in a
 * 		comma separated list. Possible values are. dropped,hover_start</p>
     */
    public String getDropMask() {
        if (this.dropMask != null) {
            return this.dropMask;
        }
        ValueBinding _vb = getValueBinding("dropMask");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Drop mask is used to prevent drop events from propagating to the
 * 		server. For example if your backing bean is not interested in
 * 		HOVER_START events then adding hover_start to the mask will stop
 * 		the event from being sent. Multiple values are specified in a
 * 		comma separated list. Possible values are. dropped,hover_start</p>
     * @see #getDropMask()
     */
    public void setDropMask(String dropMask) {
        this.dropMask = dropMask;
    }

    // dropTarget
    private Object dropTarget = null;

    /**
 * <p>When set to true this panel is a dropTarget for draggable
 * 		panels. Drop targets detect when a draggable has been dropped on
 * 		a specific region of the page. Note: all Drop Target panels must
 * 		be contained in a form.</p>
     */
    public Object getDropTarget() {
        if (this.dropTarget != null) {
            return this.dropTarget;
        }
        ValueBinding _vb = getValueBinding("dropTarget");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>When set to true this panel is a dropTarget for draggable
 * 		panels. Drop targets detect when a draggable has been dropped on
 * 		a specific region of the page. Note: all Drop Target panels must
 * 		be contained in a form.</p>
     * @see #getDropTarget()
     */
    public void setDropTarget(Object dropTarget) {
        this.dropTarget = dropTarget;
    }

    // dropTargetScrollerId
    private String dropTargetScrollerId = null;

    /**
 * <p>Id of scrollable div containing drop target.
 *     Not needed if drop target is not in a scrollable div.</p>
     */
    public String getDropTargetScrollerId() {
        if (this.dropTargetScrollerId != null) {
            return this.dropTargetScrollerId;
        }
        ValueBinding _vb = getValueBinding("dropTargetScrollerId");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Id of scrollable div containing drop target.
 *     Not needed if drop target is not in a scrollable div.</p>
     * @see #getDropTargetScrollerId()
     */
    public void setDropTargetScrollerId(String dropTargetScrollerId) {
        this.dropTargetScrollerId = dropTargetScrollerId;
    }

    // dropValue
    private Object dropValue = null;

    /**
 * <p>The drop value of this panel, for use in DnDEvents. This value can 
 * 		be a string or a value binding expression.</p>
     */
    public Object getDropValue() {
        if (this.dropValue != null) {
            return this.dropValue;
        }
        ValueBinding _vb = getValueBinding("dropValue");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The drop value of this panel, for use in DnDEvents. This value can 
 * 		be a string or a value binding expression.</p>
     * @see #getDropValue()
     */
    public void setDropValue(Object dropValue) {
        this.dropValue = dropValue;
    }

    // effect
    private com.icesoft.faces.context.effects.Effect effect = null;

    /**
 * <p>The Javascript Effect</p>
     */
    public com.icesoft.faces.context.effects.Effect getEffect() {
        if (this.effect != null) {
            return this.effect;
        }
        ValueBinding _vb = getValueBinding("effect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The Javascript Effect</p>
     * @see #getEffect()
     */
    public void setEffect(com.icesoft.faces.context.effects.Effect effect) {
        this.effect = effect;
    }

    // hoverclass
    private String hoverclass = null;

    /**
 * <p>Hover class</p>
     */
    public String getHoverclass() {
        if (this.hoverclass != null) {
            return this.hoverclass;
        }
        ValueBinding _vb = getValueBinding("hoverclass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Hover class</p>
     * @see #getHoverclass()
     */
    public void setHoverclass(String hoverclass) {
        this.hoverclass = hoverclass;
    }

    // id
    private String id = null;

    /**
 * <p>The component identifier for this component. This value must be 
 *   			unique within the closest parent component that is a naming 
 *   			container.</p>
     */
    public String getId() {
        if (this.id != null) {
            return this.id;
        }
        ValueBinding _vb = getValueBinding("id");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The component identifier for this component. This value must be 
 *   			unique within the closest parent component that is a naming 
 *   			container.</p>
     * @see #getId()
     */
    public void setId(String id) {
        this.id = id;
    }

    // menuPopup
    private String menuPopup = null;

    /**
 * <p>Specify the id of the menuPopup which should show when the 
 *         user context-clicks on this component.</p>
     */
    public String getMenuPopup() {
        if (this.menuPopup != null) {
            return this.menuPopup;
        }
        ValueBinding _vb = getValueBinding("menuPopup");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Specify the id of the menuPopup which should show when the 
 *         user context-clicks on this component.</p>
     * @see #getMenuPopup()
     */
    public void setMenuPopup(String menuPopup) {
        this.menuPopup = menuPopup;
    }

    // onclick
    private String onclick = null;

    public String getOnclick() {
        if (this.onclick != null) {
            return this.onclick;
        }
        ValueBinding _vb = getValueBinding("onclick");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    // onclickeffect
    private com.icesoft.faces.context.effects.Effect onclickeffect = null;

    /**
 * <p>Effect invoked on onclick event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnclickeffect() {
        if (this.onclickeffect != null) {
            return this.onclickeffect;
        }
        ValueBinding _vb = getValueBinding("onclickeffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onclick event</p>
     * @see #getOnclickeffect()
     */
    public void setOnclickeffect(com.icesoft.faces.context.effects.Effect onclickeffect) {
        this.onclickeffect = onclickeffect;
    }

    // ondblclick
    private String ondblclick = null;

    public String getOndblclick() {
        if (this.ondblclick != null) {
            return this.ondblclick;
        }
        ValueBinding _vb = getValueBinding("ondblclick");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOndblclick(String ondblclick) {
        this.ondblclick = ondblclick;
    }

    // ondblclickeffect
    private com.icesoft.faces.context.effects.Effect ondblclickeffect = null;

    /**
 * <p>Effect invoked on ondblclick event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOndblclickeffect() {
        if (this.ondblclickeffect != null) {
            return this.ondblclickeffect;
        }
        ValueBinding _vb = getValueBinding("ondblclickeffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on ondblclick event</p>
     * @see #getOndblclickeffect()
     */
    public void setOndblclickeffect(com.icesoft.faces.context.effects.Effect ondblclickeffect) {
        this.ondblclickeffect = ondblclickeffect;
    }

    // onkeydown
    private String onkeydown = null;

    public String getOnkeydown() {
        if (this.onkeydown != null) {
            return this.onkeydown;
        }
        ValueBinding _vb = getValueBinding("onkeydown");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnkeydown(String onkeydown) {
        this.onkeydown = onkeydown;
    }

    // onkeydowneffect
    private com.icesoft.faces.context.effects.Effect onkeydowneffect = null;

    /**
 * <p>Effect invoked on onkeydown event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnkeydowneffect() {
        if (this.onkeydowneffect != null) {
            return this.onkeydowneffect;
        }
        ValueBinding _vb = getValueBinding("onkeydowneffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onkeydown event</p>
     * @see #getOnkeydowneffect()
     */
    public void setOnkeydowneffect(com.icesoft.faces.context.effects.Effect onkeydowneffect) {
        this.onkeydowneffect = onkeydowneffect;
    }

    // onkeypress
    private String onkeypress = null;

    public String getOnkeypress() {
        if (this.onkeypress != null) {
            return this.onkeypress;
        }
        ValueBinding _vb = getValueBinding("onkeypress");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnkeypress(String onkeypress) {
        this.onkeypress = onkeypress;
    }

    // onkeypresseffect
    private com.icesoft.faces.context.effects.Effect onkeypresseffect = null;

    /**
 * <p>Effect invoked on onkeypress event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnkeypresseffect() {
        if (this.onkeypresseffect != null) {
            return this.onkeypresseffect;
        }
        ValueBinding _vb = getValueBinding("onkeypresseffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onkeypress event</p>
     * @see #getOnkeypresseffect()
     */
    public void setOnkeypresseffect(com.icesoft.faces.context.effects.Effect onkeypresseffect) {
        this.onkeypresseffect = onkeypresseffect;
    }

    // onkeyup
    private String onkeyup = null;

    public String getOnkeyup() {
        if (this.onkeyup != null) {
            return this.onkeyup;
        }
        ValueBinding _vb = getValueBinding("onkeyup");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnkeyup(String onkeyup) {
        this.onkeyup = onkeyup;
    }

    // onkeyupeffect
    private com.icesoft.faces.context.effects.Effect onkeyupeffect = null;

    /**
 * <p>Effect invoked on onkeyup event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnkeyupeffect() {
        if (this.onkeyupeffect != null) {
            return this.onkeyupeffect;
        }
        ValueBinding _vb = getValueBinding("onkeyupeffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onkeyup event</p>
     * @see #getOnkeyupeffect()
     */
    public void setOnkeyupeffect(com.icesoft.faces.context.effects.Effect onkeyupeffect) {
        this.onkeyupeffect = onkeyupeffect;
    }

    // onmousedown
    private String onmousedown = null;

    public String getOnmousedown() {
        if (this.onmousedown != null) {
            return this.onmousedown;
        }
        ValueBinding _vb = getValueBinding("onmousedown");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnmousedown(String onmousedown) {
        this.onmousedown = onmousedown;
    }

    // onmousedowneffect
    private com.icesoft.faces.context.effects.Effect onmousedowneffect = null;

    /**
 * <p>Effect invoked on onmousedown event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnmousedowneffect() {
        if (this.onmousedowneffect != null) {
            return this.onmousedowneffect;
        }
        ValueBinding _vb = getValueBinding("onmousedowneffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onmousedown event</p>
     * @see #getOnmousedowneffect()
     */
    public void setOnmousedowneffect(com.icesoft.faces.context.effects.Effect onmousedowneffect) {
        this.onmousedowneffect = onmousedowneffect;
    }

    // onmousemove
    private String onmousemove = null;

    public String getOnmousemove() {
        if (this.onmousemove != null) {
            return this.onmousemove;
        }
        ValueBinding _vb = getValueBinding("onmousemove");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnmousemove(String onmousemove) {
        this.onmousemove = onmousemove;
    }

    // onmousemoveeffect
    private com.icesoft.faces.context.effects.Effect onmousemoveeffect = null;

    /**
 * <p>Effect invoked on onmousemove event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnmousemoveeffect() {
        if (this.onmousemoveeffect != null) {
            return this.onmousemoveeffect;
        }
        ValueBinding _vb = getValueBinding("onmousemoveeffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onmousemove event</p>
     * @see #getOnmousemoveeffect()
     */
    public void setOnmousemoveeffect(com.icesoft.faces.context.effects.Effect onmousemoveeffect) {
        this.onmousemoveeffect = onmousemoveeffect;
    }

    // onmouseout
    private String onmouseout = null;

    public String getOnmouseout() {
        if (this.onmouseout != null) {
            return this.onmouseout;
        }
        ValueBinding _vb = getValueBinding("onmouseout");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnmouseout(String onmouseout) {
        this.onmouseout = onmouseout;
    }

    // onmouseouteffect
    private com.icesoft.faces.context.effects.Effect onmouseouteffect = null;

    /**
 * <p>Effect invoked on onmouse event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnmouseouteffect() {
        if (this.onmouseouteffect != null) {
            return this.onmouseouteffect;
        }
        ValueBinding _vb = getValueBinding("onmouseouteffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onmouse event</p>
     * @see #getOnmouseouteffect()
     */
    public void setOnmouseouteffect(com.icesoft.faces.context.effects.Effect onmouseouteffect) {
        this.onmouseouteffect = onmouseouteffect;
    }

    // onmouseover
    private String onmouseover = null;

    public String getOnmouseover() {
        if (this.onmouseover != null) {
            return this.onmouseover;
        }
        ValueBinding _vb = getValueBinding("onmouseover");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnmouseover(String onmouseover) {
        this.onmouseover = onmouseover;
    }

    // onmouseovereffect
    private com.icesoft.faces.context.effects.Effect onmouseovereffect = null;

    /**
 * <p>Effect invoked on onmouseover event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnmouseovereffect() {
        if (this.onmouseovereffect != null) {
            return this.onmouseovereffect;
        }
        ValueBinding _vb = getValueBinding("onmouseovereffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onmouseover event</p>
     * @see #getOnmouseovereffect()
     */
    public void setOnmouseovereffect(com.icesoft.faces.context.effects.Effect onmouseovereffect) {
        this.onmouseovereffect = onmouseovereffect;
    }

    // onmouseup
    private String onmouseup = null;

    public String getOnmouseup() {
        if (this.onmouseup != null) {
            return this.onmouseup;
        }
        ValueBinding _vb = getValueBinding("onmouseup");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setOnmouseup(String onmouseup) {
        this.onmouseup = onmouseup;
    }

    // onmouseupeffect
    private com.icesoft.faces.context.effects.Effect onmouseupeffect = null;

    /**
 * <p>Effect invoked on onmouseup event</p>
     */
    public com.icesoft.faces.context.effects.Effect getOnmouseupeffect() {
        if (this.onmouseupeffect != null) {
            return this.onmouseupeffect;
        }
        ValueBinding _vb = getValueBinding("onmouseupeffect");
        if (_vb != null) {
            return (com.icesoft.faces.context.effects.Effect) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Effect invoked on onmouseup event</p>
     * @see #getOnmouseupeffect()
     */
    public void setOnmouseupeffect(com.icesoft.faces.context.effects.Effect onmouseupeffect) {
        this.onmouseupeffect = onmouseupeffect;
    }

    // panelTooltip
    private String panelTooltip = null;

    /**
 * <p>Hover class</p>
     */
    public String getPanelTooltip() {
        if (this.panelTooltip != null) {
            return this.panelTooltip;
        }
        ValueBinding _vb = getValueBinding("panelTooltip");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Hover class</p>
     * @see #getPanelTooltip()
     */
    public void setPanelTooltip(String panelTooltip) {
        this.panelTooltip = panelTooltip;
    }

    // rendered
    private boolean rendered = false;
    private boolean rendered_set = false;

    /**
 * <p>Flag indicating whether or not this component should be rendered 
 *   			(during Render Response Phase), or processed on any subsequent form 
 *   			submit.</p>
     */
    public boolean isRendered() {
        if (this.rendered_set) {
            return this.rendered;
        }
        ValueBinding _vb = getValueBinding("rendered");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
 * <p>Flag indicating whether or not this component should be rendered 
 *   			(during Render Response Phase), or processed on any subsequent form 
 *   			submit.</p>
     * @see #isRendered()
     */
    public void setRendered(boolean rendered) {
        this.rendered = rendered;
        this.rendered_set = true;
    }

    // renderedOnUserRole
    private String renderedOnUserRole = null;

    /**
 * <p>If user is in given role, this component will be rendered
 * 		normally. If not, nothing is rendered and the body of this tag
 * 		will be skipped.</p>
     */
    public String getRenderedOnUserRole() {
        if (this.renderedOnUserRole != null) {
            return this.renderedOnUserRole;
        }
        ValueBinding _vb = getValueBinding("renderedOnUserRole");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>If user is in given role, this component will be rendered
 * 		normally. If not, nothing is rendered and the body of this tag
 * 		will be skipped.</p>
     * @see #getRenderedOnUserRole()
     */
    public void setRenderedOnUserRole(String renderedOnUserRole) {
        this.renderedOnUserRole = renderedOnUserRole;
    }

    // renderedStyle
    private String renderedStyle = null;

    public String getRenderedStyle() {
        if (this.renderedStyle != null) {
            return this.renderedStyle;
        }
        ValueBinding _vb = getValueBinding("renderedStyle");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setRenderedStyle(String renderedStyle) {
        this.renderedStyle = renderedStyle;
    }

    // scrollHeight
    private String scrollHeight = null;

    /**
 * <p>Height for scrollable panel. You must need to define the measurement unit without any space (e.g.) <br/>
 *         &lt;ice:panelGroup scrollHeight="50em" &gt; <br/> or <br/>
 *         &lt;ice:panelGroup scrollHeight="50px" &gt; <br/></p>
     */
    public String getScrollHeight() {
        if (this.scrollHeight != null) {
            return this.scrollHeight;
        }
        ValueBinding _vb = getValueBinding("scrollHeight");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Height for scrollable panel. You must need to define the measurement unit without any space (e.g.) <br/>
 *         &lt;ice:panelGroup scrollHeight="50em" &gt; <br/> or <br/>
 *         &lt;ice:panelGroup scrollHeight="50px" &gt; <br/></p>
     * @see #getScrollHeight()
     */
    public void setScrollHeight(String scrollHeight) {
        this.scrollHeight = scrollHeight;
    }

    // scrollWidth
    private String scrollWidth = null;

    /**
 * <p>Width for scrollable panel. You must need to define the measurement unit without any space (e.g.) <br/>
 *         &lt;ice:panelGroup scrollWidth="50em" &gt; <br/> or <br/>
 *         &lt;ice:panelGroup scrollWidth="50px" &gt; <br/></p>
     */
    public String getScrollWidth() {
        if (this.scrollWidth != null) {
            return this.scrollWidth;
        }
        ValueBinding _vb = getValueBinding("scrollWidth");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Width for scrollable panel. You must need to define the measurement unit without any space (e.g.) <br/>
 *         &lt;ice:panelGroup scrollWidth="50em" &gt; <br/> or <br/>
 *         &lt;ice:panelGroup scrollWidth="50px" &gt; <br/></p>
     * @see #getScrollWidth()
     */
    public void setScrollWidth(String scrollWidth) {
        this.scrollWidth = scrollWidth;
    }

    // styleClass
    private String styleClass = null;

    /**
 * <p>Space-separated list of CSS style class(es) to be applied when this 
 * 		element is rendered. This value is passed through as the "class" 
 * 		attribute on generated markup.
 * 		The base name for all style classes. Default value is <b>icePnlGrp</b>.</p>
     */
    public String getStyleClass() {
        if (this.styleClass != null) {
            return this.styleClass;
        }
        ValueBinding _vb = getValueBinding("styleClass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Space-separated list of CSS style class(es) to be applied when this 
 * 		element is rendered. This value is passed through as the "class" 
 * 		attribute on generated markup.
 * 		The base name for all style classes. Default value is <b>icePnlGrp</b>.</p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // title
    private String title = null;

    /**
 * <p>Advisory title information about markup elements generated for this 
 * 		component.</p>
     */
    public String getTitle() {
        if (this.title != null) {
            return this.title;
        }
        ValueBinding _vb = getValueBinding("title");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Advisory title information about markup elements generated for this 
 * 		component.</p>
     * @see #getTitle()
     */
    public void setTitle(String title) {
        this.title = title;
    }

    // visible
    private boolean visible = false;
    private boolean visible_set = false;

    /**
 * <p>Set the visibility of this component. When false CSS style is
 * 		set to display:none</p>
     */
    public boolean isVisible() {
        if (this.visible_set) {
            return this.visible;
        }
        ValueBinding _vb = getValueBinding("visible");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
 * <p>Set the visibility of this component. When false CSS style is
 * 		set to display:none</p>
     * @see #isVisible()
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
        this.visible_set = true;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.contextValue = (Object) _values[1];
        this.dragListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[2]);
        this.dragMask = (String) _values[3];
        this.dragOptions = (String) _values[4];
        this.dragValue = (Object) _values[5];
        this.draggable = (String) _values[6];
        this.dropListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[7]);
        this.dropMask = (String) _values[8];
        this.dropTarget = (Object) _values[9];
        this.dropTargetScrollerId = (String) _values[10];
        this.dropValue = (Object) _values[11];
        this.effect = (com.icesoft.faces.context.effects.Effect) _values[12];
        this.hoverclass = (String) _values[13];
        this.id = (String) _values[14];
        this.menuPopup = (String) _values[15];
        this.onclick = (String) _values[16];
        this.onclickeffect = (com.icesoft.faces.context.effects.Effect) _values[17];
        this.ondblclick = (String) _values[18];
        this.ondblclickeffect = (com.icesoft.faces.context.effects.Effect) _values[19];
        this.onkeydown = (String) _values[20];
        this.onkeydowneffect = (com.icesoft.faces.context.effects.Effect) _values[21];
        this.onkeypress = (String) _values[22];
        this.onkeypresseffect = (com.icesoft.faces.context.effects.Effect) _values[23];
        this.onkeyup = (String) _values[24];
        this.onkeyupeffect = (com.icesoft.faces.context.effects.Effect) _values[25];
        this.onmousedown = (String) _values[26];
        this.onmousedowneffect = (com.icesoft.faces.context.effects.Effect) _values[27];
        this.onmousemove = (String) _values[28];
        this.onmousemoveeffect = (com.icesoft.faces.context.effects.Effect) _values[29];
        this.onmouseout = (String) _values[30];
        this.onmouseouteffect = (com.icesoft.faces.context.effects.Effect) _values[31];
        this.onmouseover = (String) _values[32];
        this.onmouseovereffect = (com.icesoft.faces.context.effects.Effect) _values[33];
        this.onmouseup = (String) _values[34];
        this.onmouseupeffect = (com.icesoft.faces.context.effects.Effect) _values[35];
        this.panelTooltip = (String) _values[36];
        this.rendered = ((Boolean) _values[37]).booleanValue();
        this.rendered_set = ((Boolean) _values[38]).booleanValue();
        this.renderedOnUserRole = (String) _values[39];
        this.renderedStyle = (String) _values[40];
        this.scrollHeight = (String) _values[41];
        this.scrollWidth = (String) _values[42];
        this.styleClass = (String) _values[43];
        this.title = (String) _values[44];
        this.visible = ((Boolean) _values[45]).booleanValue();
        this.visible_set = ((Boolean) _values[46]).booleanValue();
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[47];
        _values[0] = super.saveState(_context);
        _values[1] = this.contextValue;
        _values[2] = saveAttachedState(_context, dragListener);
        _values[3] = this.dragMask;
        _values[4] = this.dragOptions;
        _values[5] = this.dragValue;
        _values[6] = this.draggable;
        _values[7] = saveAttachedState(_context, dropListener);
        _values[8] = this.dropMask;
        _values[9] = this.dropTarget;
        _values[10] = this.dropTargetScrollerId;
        _values[11] = this.dropValue;
        _values[12] = this.effect;
        _values[13] = this.hoverclass;
        _values[14] = this.id;
        _values[15] = this.menuPopup;
        _values[16] = this.onclick;
        _values[17] = this.onclickeffect;
        _values[18] = this.ondblclick;
        _values[19] = this.ondblclickeffect;
        _values[20] = this.onkeydown;
        _values[21] = this.onkeydowneffect;
        _values[22] = this.onkeypress;
        _values[23] = this.onkeypresseffect;
        _values[24] = this.onkeyup;
        _values[25] = this.onkeyupeffect;
        _values[26] = this.onmousedown;
        _values[27] = this.onmousedowneffect;
        _values[28] = this.onmousemove;
        _values[29] = this.onmousemoveeffect;
        _values[30] = this.onmouseout;
        _values[31] = this.onmouseouteffect;
        _values[32] = this.onmouseover;
        _values[33] = this.onmouseovereffect;
        _values[34] = this.onmouseup;
        _values[35] = this.onmouseupeffect;
        _values[36] = this.panelTooltip;
        _values[37] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[38] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[39] = this.renderedOnUserRole;
        _values[40] = this.renderedStyle;
        _values[41] = this.scrollHeight;
        _values[42] = this.scrollWidth;
        _values[43] = this.styleClass;
        _values[44] = this.title;
        _values[45] = this.visible ? Boolean.TRUE : Boolean.FALSE;
        _values[46] = this.visible_set ? Boolean.TRUE : Boolean.FALSE;
        return _values;
    }

}
