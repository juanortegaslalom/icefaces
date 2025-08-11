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
package com.icesoft.faces.component.paneltooltip;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class PanelTooltipBase extends javax.faces.component.UIPanel {

    /**
     * <p>Construct a new <code>PanelTooltipBase</code>.</p>
     */
    public PanelTooltipBase() {
        super();
        setRendererType("com.icesoft.faces.PanelTooltipRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Panel";
    }

    // displayListener
    private javax.faces.el.MethodBinding displayListener = null;

    /**
 * <p>The displayListener is a MethodBinding/MethodExpression that 
 * 		specifies a method on a backing bean that will accept a 
 * 		com.icesoft.faces.component.DisplayEvent.</p>
     */
    public javax.faces.el.MethodBinding getDisplayListener() {
        if (this.displayListener != null) {
            return this.displayListener;
        }
        ValueBinding _vb = getValueBinding("displayListener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The displayListener is a MethodBinding/MethodExpression that 
 * 		specifies a method on a backing bean that will accept a 
 * 		com.icesoft.faces.component.DisplayEvent.</p>
     * @see #getDisplayListener()
     */
    public void setDisplayListener(javax.faces.el.MethodBinding displayListener) {
        this.displayListener = displayListener;
    }

    // displayOn
    private String displayOn = null;

    /**
 * <p>
 *         The following are the valid values for the displayOn attribute:
 *             <ul>
 *                 <li> hover (default): cursor hover </li>
 *                 <li> click: left mouse button clicked </li>
 *                 <li> altclick: right mouse button clicked (tied to the "contextmenu" JS event) </li>
 *                 <li> dblclick: double click </li>
 *             </ul>
     */
    public String getDisplayOn() {
        if (this.displayOn != null) {
            return this.displayOn;
        }
        ValueBinding _vb = getValueBinding("displayOn");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "hover";
    }

    /**
 * <p>
 *         The following are the valid values for the displayOn attribute:
 *             <ul>
 *                 <li> hover (default): cursor hover </li>
 *                 <li> click: left mouse button clicked </li>
 *                 <li> altclick: right mouse button clicked (tied to the "contextmenu" JS event) </li>
 *                 <li> dblclick: double click </li>
 *             </ul>
     * @see #getDisplayOn()
     */
    public void setDisplayOn(String displayOn) {
        this.displayOn = displayOn;
    }

    // draggable
    private String draggable = null;

    /**
 * <p>When set to 'true' this panelTooltip is draggable. The user will be
 * 		able to drag the panel to any position on the page. 
 * 		Note: all Draggable panels must be contained in a form. If the panelTooltip
 * 		is draggable it becomes dynamic automatically.</p>
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
 * <p>When set to 'true' this panelTooltip is draggable. The user will be
 * 		able to drag the panel to any position on the page. 
 * 		Note: all Draggable panels must be contained in a form. If the panelTooltip
 * 		is draggable it becomes dynamic automatically.</p>
     * @see #getDraggable()
     */
    public void setDraggable(String draggable) {
        this.draggable = draggable;
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

    // hideOn
    private String hideOn = null;

    /**
 * <p>
 *         The following are the valid values for the autoHide attribute:
 *             <ul>
 *                 <li> mouseout </li>
 *                 <li> mousedown </li>
 *                 <li> none </li>
 *             </ul> 
 *             </p>
 *             <p>
 *             <h3>  mouseout :</h3> the tooltip will be hide (un-rdender or invisible, depending
 *             on the dynamic attribute) when the user moves the mouse out of the 
 *             triggering component. 
 *             </p>
 *             
 *             <p>
 *             <h3>  mousedown :</h3> the tooltip will be hide (un-rdender or invisible, depending
 *             on the dynamic attribute) when the user clicks any area outside of 
 *             the panelTooltip itself is clicked. 
 *             </p>  
 *             
 *             <p>
 *             <h3>  none :</h3> the tooltip will not be hide until the application 
 *             changes the "visible" attribute to be false<br/>
 *             </p>
     */
    public String getHideOn() {
        if (this.hideOn != null) {
            return this.hideOn;
        }
        ValueBinding _vb = getValueBinding("hideOn");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "mouseout";
    }

    /**
 * <p>
 *         The following are the valid values for the autoHide attribute:
 *             <ul>
 *                 <li> mouseout </li>
 *                 <li> mousedown </li>
 *                 <li> none </li>
 *             </ul> 
 *             </p>
 *             <p>
 *             <h3>  mouseout :</h3> the tooltip will be hide (un-rdender or invisible, depending
 *             on the dynamic attribute) when the user moves the mouse out of the 
 *             triggering component. 
 *             </p>
 *             
 *             <p>
 *             <h3>  mousedown :</h3> the tooltip will be hide (un-rdender or invisible, depending
 *             on the dynamic attribute) when the user clicks any area outside of 
 *             the panelTooltip itself is clicked. 
 *             </p>  
 *             
 *             <p>
 *             <h3>  none :</h3> the tooltip will not be hide until the application 
 *             changes the "visible" attribute to be false<br/>
 *             </p>
     * @see #getHideOn()
     */
    public void setHideOn(String hideOn) {
        this.hideOn = hideOn;
    }

    // hoverDelay
    private int hoverDelay = Integer.MIN_VALUE;
    private boolean hoverDelay_set = false;

    /**
 * <p># of milliseconds that mouse must be continuously hovered over the 
 *         component before the tooltip is displayed.</p>
     */
    public int getHoverDelay() {
        if (this.hoverDelay_set) {
            return this.hoverDelay;
        }
        ValueBinding _vb = getValueBinding("hoverDelay");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return Integer.MIN_VALUE;
            } else {
                return ((Integer) _result).intValue();
            }
        }
        return Integer.MIN_VALUE;
    }

    /**
 * <p># of milliseconds that mouse must be continuously hovered over the 
 *         component before the tooltip is displayed.</p>
     * @see #getHoverDelay()
     */
    public void setHoverDelay(int hoverDelay) {
        this.hoverDelay = hoverDelay;
        this.hoverDelay_set = true;
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

    // moveWithMouse
    private boolean moveWithMouse = false;
    private boolean moveWithMouse_set = false;

    /**
 * <p>When set to "true" this will cause the panelTooltip to track with the mouse.
 *         Default is "false"</p>
     */
    public boolean isMoveWithMouse() {
        if (this.moveWithMouse_set) {
            return this.moveWithMouse;
        }
        ValueBinding _vb = getValueBinding("moveWithMouse");
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
 * <p>When set to "true" this will cause the panelTooltip to track with the mouse.
 *         Default is "false"</p>
     * @see #isMoveWithMouse()
     */
    public void setMoveWithMouse(boolean moveWithMouse) {
        this.moveWithMouse = moveWithMouse;
        this.moveWithMouse_set = true;
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

    // style
    private String style = null;

    /**
 * <p>CSS style(s) to be applied when this component is rendered.</p>
     */
    public String getStyle() {
        if (this.style != null) {
            return this.style;
        }
        ValueBinding _vb = getValueBinding("style");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>CSS style(s) to be applied when this component is rendered.</p>
     * @see #getStyle()
     */
    public void setStyle(String style) {
        this.style = style;
    }

    // styleClass
    private String styleClass = null;

    /**
 * <p>
 *         Space-separated list of CSS style class(es) to be applied when this 
 *         element is rendered. This value must be passed through as the "class" 
 *         attribute on generated markup.
 *         </p>
 *         <p>Defines the base class name for all style classes.
 *         Default value is <b>icePnlTlTip</b></p>
 *               </p><ul>
 *                 <li>icePnlTlTip</li>
 *                 <li>icePnlTlTipHdr</li>
 *                 <li>icePnlTlTipBody</li>
 *                 <li>icePnlTlTipFtr</li>
 *               </ul>
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
 * <p>
 *         Space-separated list of CSS style class(es) to be applied when this 
 *         element is rendered. This value must be passed through as the "class" 
 *         attribute on generated markup.
 *         </p>
 *         <p>Defines the base class name for all style classes.
 *         Default value is <b>icePnlTlTip</b></p>
 *               </p><ul>
 *                 <li>icePnlTlTip</li>
 *                 <li>icePnlTlTipHdr</li>
 *                 <li>icePnlTlTipBody</li>
 *                 <li>icePnlTlTipFtr</li>
 *               </ul>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
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
        this.displayListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[1]);
        this.displayOn = (String) _values[2];
        this.draggable = (String) _values[3];
        this.effect = (com.icesoft.faces.context.effects.Effect) _values[4];
        this.hideOn = (String) _values[5];
        this.hoverDelay = ((Integer) _values[6]).intValue();
        this.hoverDelay_set = ((Boolean) _values[7]).booleanValue();
        this.id = (String) _values[8];
        this.moveWithMouse = ((Boolean) _values[9]).booleanValue();
        this.moveWithMouse_set = ((Boolean) _values[10]).booleanValue();
        this.onclick = (String) _values[11];
        this.onclickeffect = (com.icesoft.faces.context.effects.Effect) _values[12];
        this.ondblclick = (String) _values[13];
        this.ondblclickeffect = (com.icesoft.faces.context.effects.Effect) _values[14];
        this.onkeydown = (String) _values[15];
        this.onkeydowneffect = (com.icesoft.faces.context.effects.Effect) _values[16];
        this.onkeypress = (String) _values[17];
        this.onkeypresseffect = (com.icesoft.faces.context.effects.Effect) _values[18];
        this.onkeyup = (String) _values[19];
        this.onkeyupeffect = (com.icesoft.faces.context.effects.Effect) _values[20];
        this.onmousedown = (String) _values[21];
        this.onmousedowneffect = (com.icesoft.faces.context.effects.Effect) _values[22];
        this.onmousemove = (String) _values[23];
        this.onmousemoveeffect = (com.icesoft.faces.context.effects.Effect) _values[24];
        this.onmouseout = (String) _values[25];
        this.onmouseouteffect = (com.icesoft.faces.context.effects.Effect) _values[26];
        this.onmouseover = (String) _values[27];
        this.onmouseovereffect = (com.icesoft.faces.context.effects.Effect) _values[28];
        this.onmouseup = (String) _values[29];
        this.onmouseupeffect = (com.icesoft.faces.context.effects.Effect) _values[30];
        this.rendered = ((Boolean) _values[31]).booleanValue();
        this.rendered_set = ((Boolean) _values[32]).booleanValue();
        this.renderedOnUserRole = (String) _values[33];
        this.style = (String) _values[34];
        this.styleClass = (String) _values[35];
        this.visible = ((Boolean) _values[36]).booleanValue();
        this.visible_set = ((Boolean) _values[37]).booleanValue();
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[38];
        _values[0] = super.saveState(_context);
        _values[1] = saveAttachedState(_context, displayListener);
        _values[2] = this.displayOn;
        _values[3] = this.draggable;
        _values[4] = this.effect;
        _values[5] = this.hideOn;
        _values[6] = new Integer(this.hoverDelay);
        _values[7] = this.hoverDelay_set ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.id;
        _values[9] = this.moveWithMouse ? Boolean.TRUE : Boolean.FALSE;
        _values[10] = this.moveWithMouse_set ? Boolean.TRUE : Boolean.FALSE;
        _values[11] = this.onclick;
        _values[12] = this.onclickeffect;
        _values[13] = this.ondblclick;
        _values[14] = this.ondblclickeffect;
        _values[15] = this.onkeydown;
        _values[16] = this.onkeydowneffect;
        _values[17] = this.onkeypress;
        _values[18] = this.onkeypresseffect;
        _values[19] = this.onkeyup;
        _values[20] = this.onkeyupeffect;
        _values[21] = this.onmousedown;
        _values[22] = this.onmousedowneffect;
        _values[23] = this.onmousemove;
        _values[24] = this.onmousemoveeffect;
        _values[25] = this.onmouseout;
        _values[26] = this.onmouseouteffect;
        _values[27] = this.onmouseover;
        _values[28] = this.onmouseovereffect;
        _values[29] = this.onmouseup;
        _values[30] = this.onmouseupeffect;
        _values[31] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[32] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[33] = this.renderedOnUserRole;
        _values[34] = this.style;
        _values[35] = this.styleClass;
        _values[36] = this.visible ? Boolean.TRUE : Boolean.FALSE;
        _values[37] = this.visible_set ? Boolean.TRUE : Boolean.FALSE;
        return _values;
    }

}
