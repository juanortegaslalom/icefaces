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
package com.icesoft.faces.component.panelpositioned;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * a container for a series of repeating child components
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class PanelPositionedBase extends javax.faces.component.UIData {

    /**
     * <p>Construct a new <code>PanelPositionedBase</code>.</p>
     */
    public PanelPositionedBase() {
        super();
        setRendererType("com.icesoft.faces.dragdrop.PanelPositionedRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.dragdrop.PanelPositionedFamily";
    }

    // beforeChangedListener
    private javax.faces.el.MethodBinding beforeChangedListener = null;

    /**
 * <p>beforeChangedListener called before the list is changed. Which takes a PanelPositionedEvent.
 * 		User can cancel event by calling cancel() on PanelPositionedEvent. If cancel() was called 
 * 		then the list will not be changed and the listener will not be called.
 * 		(e.g.) <br/>
 * 		    public void methodName(PanelPositionedEvent event);</p>
     */
    public javax.faces.el.MethodBinding getBeforeChangedListener() {
        if (this.beforeChangedListener != null) {
            return this.beforeChangedListener;
        }
        ValueBinding _vb = getValueBinding("beforeChangedListener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>beforeChangedListener called before the list is changed. Which takes a PanelPositionedEvent.
 * 		User can cancel event by calling cancel() on PanelPositionedEvent. If cancel() was called 
 * 		then the list will not be changed and the listener will not be called.
 * 		(e.g.) <br/>
 * 		    public void methodName(PanelPositionedEvent event);</p>
     * @see #getBeforeChangedListener()
     */
    public void setBeforeChangedListener(javax.faces.el.MethodBinding beforeChangedListener) {
        this.beforeChangedListener = beforeChangedListener;
    }

    // constraint
    private String constraint = null;

    /**
 * <p>    
 * 	        The following are the valid values for this attribute. This attribute
 * 	        has an impact on the presentation of the positioned element while dragging.
 *          </p>
 *          <ul>
 *             <li> horizontal: <br/> While dragging an item horizontally outside 
 *             from the positioned panel. The draggable element can be seen moving 
 *             outside, whereas with the "vertical" you can drag an element outside 
 *             but the draggable elemement doesn't go out of its container.</li>
 *             <li> vertical: <br/> While dragging an item vertically, the item 
 *             underneath it moves up or down smoothly with slide effect and makes 
 *             an empty space for the draggaed item, whereas in horizontal mode you
 *             don't see the slide effect</li>
 *             <li> false: <br/> You can drag the positioned element vertically or horizontally
 *             but you don't see any slide effect as well as the draggable element 
 *             doesn't go outside of its panel.
 *             
 *             </li>
 *          </ul>
     */
    public String getConstraint() {
        if (this.constraint != null) {
            return this.constraint;
        }
        ValueBinding _vb = getValueBinding("constraint");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>    
 * 	        The following are the valid values for this attribute. This attribute
 * 	        has an impact on the presentation of the positioned element while dragging.
 *          </p>
 *          <ul>
 *             <li> horizontal: <br/> While dragging an item horizontally outside 
 *             from the positioned panel. The draggable element can be seen moving 
 *             outside, whereas with the "vertical" you can drag an element outside 
 *             but the draggable elemement doesn't go out of its container.</li>
 *             <li> vertical: <br/> While dragging an item vertically, the item 
 *             underneath it moves up or down smoothly with slide effect and makes 
 *             an empty space for the draggaed item, whereas in horizontal mode you
 *             don't see the slide effect</li>
 *             <li> false: <br/> You can drag the positioned element vertically or horizontally
 *             but you don't see any slide effect as well as the draggable element 
 *             doesn't go outside of its panel.
 *             
 *             </li>
 *          </ul>
     * @see #getConstraint()
     */
    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    // disabled
    private boolean disabled = false;
    private boolean disabled_set = false;

    /**
 * <p>Flag indicating that this element must never receive focus or be 
 * 			 included in a subsequent submit.</p>
     */
    public boolean isDisabled() {
        if (this.disabled_set) {
            return this.disabled;
        }
        ValueBinding _vb = getValueBinding("disabled");
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
 * <p>Flag indicating that this element must never receive focus or be 
 * 			 included in a subsequent submit.</p>
     * @see #isDisabled()
     */
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
        this.disabled_set = true;
    }

    // enabledOnUserRole
    private String enabledOnUserRole = null;

    /**
 * <p>If user is in given role, this component will be rendered
 * 		normally. If not, the component will be in disabled state.</p>
     */
    public String getEnabledOnUserRole() {
        if (this.enabledOnUserRole != null) {
            return this.enabledOnUserRole;
        }
        ValueBinding _vb = getValueBinding("enabledOnUserRole");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>If user is in given role, this component will be rendered
 * 		normally. If not, the component will be in disabled state.</p>
     * @see #getEnabledOnUserRole()
     */
    public void setEnabledOnUserRole(String enabledOnUserRole) {
        this.enabledOnUserRole = enabledOnUserRole;
    }

    // first
    private int first = Integer.MIN_VALUE;
    private boolean first_set = false;

    /**
 * <p>Note: This is deprecated.<br/></p>
     */
    public int getFirst() {
        if (this.first_set) {
            return this.first;
        }
        ValueBinding _vb = getValueBinding("first");
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
 * <p>Note: This is deprecated.<br/></p>
     * @see #getFirst()
     */
    public void setFirst(int first) {
        this.first = first;
        this.first_set = true;
    }

    // handle
    private String handle = null;

    /**
 * <p>The css class of a child node that is used to drag the item. (e.g.)<br/>
 *         	
 *             &lt;ice:panelPositioned var="person" <br/>
 *                                  value="#{panelPositioned.people}"
 *                                  handle="personClass"
 *                                 &gt;<br/>
 *                 &lt;ice:panelGroup &gt;<br/>
 *                         &lt;ice:outputText style="cursor:move;" styleClass="personClass" value="drag #{person.name}"/&gt;<br/>
 *                         &lt;ice:outputText value="this panel can only be dragged by the person name."/&gt;<br/>
 *                 &lt;/ice:panelGroup&gt;<br/>
 *             &lt;/ice:panelPositioned&gt;    <br/></p>
     */
    public String getHandle() {
        if (this.handle != null) {
            return this.handle;
        }
        ValueBinding _vb = getValueBinding("handle");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The css class of a child node that is used to drag the item. (e.g.)<br/>
 *         	
 *             &lt;ice:panelPositioned var="person" <br/>
 *                                  value="#{panelPositioned.people}"
 *                                  handle="personClass"
 *                                 &gt;<br/>
 *                 &lt;ice:panelGroup &gt;<br/>
 *                         &lt;ice:outputText style="cursor:move;" styleClass="personClass" value="drag #{person.name}"/&gt;<br/>
 *                         &lt;ice:outputText value="this panel can only be dragged by the person name."/&gt;<br/>
 *                 &lt;/ice:panelGroup&gt;<br/>
 *             &lt;/ice:panelPositioned&gt;    <br/></p>
     * @see #getHandle()
     */
    public void setHandle(String handle) {
        this.handle = handle;
    }

    // hoverclass
    private String hoverclass = null;

    /**
 * <p>Note: This is deprecated.<br/></p>
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
 * <p>Note: This is deprecated.<br/></p>
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

    // listener
    private javax.faces.el.MethodBinding listener = null;

    /**
 * <p>Listener, called when list is changed. Which takes a PanelPositionedEvent.
 * 		(e.g.) <br/>
 * 		    public void methodName(PanelPositionedEvent event);</p>
     */
    public javax.faces.el.MethodBinding getListener() {
        if (this.listener != null) {
            return this.listener;
        }
        ValueBinding _vb = getValueBinding("listener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Listener, called when list is changed. Which takes a PanelPositionedEvent.
 * 		(e.g.) <br/>
 * 		    public void methodName(PanelPositionedEvent event);</p>
     * @see #getListener()
     */
    public void setListener(javax.faces.el.MethodBinding listener) {
        this.listener = listener;
    }

    // overlap
    private String overlap = null;

    /**
 * <p>Note: This is deprecated. <br/></p>
     */
    public String getOverlap() {
        if (this.overlap != null) {
            return this.overlap;
        }
        ValueBinding _vb = getValueBinding("overlap");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Note: This is deprecated. <br/></p>
     * @see #getOverlap()
     */
    public void setOverlap(String overlap) {
        this.overlap = overlap;
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

    // rows
    private int rows = Integer.MIN_VALUE;
    private boolean rows_set = false;

    /**
 * <p>Note: This is deprecated.<br/></p>
     */
    public int getRows() {
        if (this.rows_set) {
            return this.rows;
        }
        ValueBinding _vb = getValueBinding("rows");
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
 * <p>Note: This is deprecated.<br/></p>
     * @see #getRows()
     */
    public void setRows(int rows) {
        this.rows = rows;
        this.rows_set = true;
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
 *               Space-separated list of CSS style class(es) to be applied when
 *               this element is rendered.  This value must be passed through
 *               as the "class" attribute on generated markup.
 *               <br/> The default class would be rendered as <b>icePnlPos</b>
 *          </p>
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
 *               Space-separated list of CSS style class(es) to be applied when
 *               this element is rendered.  This value must be passed through
 *               as the "class" attribute on generated markup.
 *               <br/> The default class would be rendered as <b>icePnlPos</b>
 *          </p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // value
    private Object value = null;

    /**
 * <p>The data model for this component. Could be a java.util.List or an Array</p>
     */
    public Object getValue() {
        if (this.value != null) {
            return this.value;
        }
        ValueBinding _vb = getValueBinding("value");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The data model for this component. Could be a java.util.List or an Array</p>
     * @see #getValue()
     */
    public void setValue(Object value) {
        this.value = value;
    }

    // var
    private String _var = null;

    /**
 * <p>Name of a request-scope attribute under which the model data presented for
 *         the current row.</p>
     */
    public String getVar() {
        if (this._var != null) {
            return this._var;
        }
        ValueBinding _vb = getValueBinding("var");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Name of a request-scope attribute under which the model data presented for
 *         the current row.</p>
     * @see #getVar()
     */
    public void setVar(String _var) {
        this._var = _var;
    }

    // varStatus
    private String varStatus = null;

    /**
 * <p>Name of a request-scope attribute under which the current indexed  
 *         state will be exposed. This is modeled after the Facelets JSTL c:forEach  
 *         varStatus. The varStatus object has 5 sub-properties:</p>
 *         <dl>
 *         <dt>int <b>begin</b></dt> 
 *         <dd>Corresponds to the UIData container's <b>first</b> property, the 
 *             index at which it begins iteration.</dd>
 *         <dt>int <b>end</b></dt>
 *         <dd>The ending index of iteration, corresponding to the UIData 
 *             container's <b>first</b> plus <b>rows</b> minus 1. Note: 
 *             If the UIData's DataModel's isRowAvailable() method returns false, 
 *             prematurely ending iteration, then the actual ending index may not 
 *             equal the value for this <b>end</b> property.</dd>
 *         <dt>int <b>index</b></dt>
 *         <dd>The current iteration index. Corresponding to the UIData 
 *             container's getRowIndex() value, which also corresponds with the 
 *             UIData's DataModel's getRowIndex() value.</dd>
 *         <dt>boolean <b>first</b></dt>
 *         <dd>Defined simply as: <b>varStatus.index == varStatus.begin</b></dd>
 *         <dt>boolean <b>last</b></dt>
 *         <dd>Defined simply as: <b>varStatus.index == varStatus.end</b>. Note: 
 *             This has the same limitations as the <b>end</b> property.</dd>
     */
    public String getVarStatus() {
        if (this.varStatus != null) {
            return this.varStatus;
        }
        ValueBinding _vb = getValueBinding("varStatus");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Name of a request-scope attribute under which the current indexed  
 *         state will be exposed. This is modeled after the Facelets JSTL c:forEach  
 *         varStatus. The varStatus object has 5 sub-properties:</p>
 *         <dl>
 *         <dt>int <b>begin</b></dt> 
 *         <dd>Corresponds to the UIData container's <b>first</b> property, the 
 *             index at which it begins iteration.</dd>
 *         <dt>int <b>end</b></dt>
 *         <dd>The ending index of iteration, corresponding to the UIData 
 *             container's <b>first</b> plus <b>rows</b> minus 1. Note: 
 *             If the UIData's DataModel's isRowAvailable() method returns false, 
 *             prematurely ending iteration, then the actual ending index may not 
 *             equal the value for this <b>end</b> property.</dd>
 *         <dt>int <b>index</b></dt>
 *         <dd>The current iteration index. Corresponding to the UIData 
 *             container's getRowIndex() value, which also corresponds with the 
 *             UIData's DataModel's getRowIndex() value.</dd>
 *         <dt>boolean <b>first</b></dt>
 *         <dd>Defined simply as: <b>varStatus.index == varStatus.begin</b></dd>
 *         <dt>boolean <b>last</b></dt>
 *         <dd>Defined simply as: <b>varStatus.index == varStatus.end</b>. Note: 
 *             This has the same limitations as the <b>end</b> property.</dd>
     * @see #getVarStatus()
     */
    public void setVarStatus(String varStatus) {
        this.varStatus = varStatus;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.beforeChangedListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[1]);
        this.constraint = (String) _values[2];
        this.disabled = ((Boolean) _values[3]).booleanValue();
        this.disabled_set = ((Boolean) _values[4]).booleanValue();
        this.enabledOnUserRole = (String) _values[5];
        this.first = ((Integer) _values[6]).intValue();
        this.first_set = ((Boolean) _values[7]).booleanValue();
        this.handle = (String) _values[8];
        this.hoverclass = (String) _values[9];
        this.id = (String) _values[10];
        this.listener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[11]);
        this.overlap = (String) _values[12];
        this.rendered = ((Boolean) _values[13]).booleanValue();
        this.rendered_set = ((Boolean) _values[14]).booleanValue();
        this.renderedOnUserRole = (String) _values[15];
        this.rows = ((Integer) _values[16]).intValue();
        this.rows_set = ((Boolean) _values[17]).booleanValue();
        this.style = (String) _values[18];
        this.styleClass = (String) _values[19];
        this.value = (Object) _values[20];
        this._var = (String) _values[21];
        this.varStatus = (String) _values[22];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[23];
        _values[0] = super.saveState(_context);
        _values[1] = saveAttachedState(_context, beforeChangedListener);
        _values[2] = this.constraint;
        _values[3] = this.disabled ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.disabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.enabledOnUserRole;
        _values[6] = new Integer(this.first);
        _values[7] = this.first_set ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.handle;
        _values[9] = this.hoverclass;
        _values[10] = this.id;
        _values[11] = saveAttachedState(_context, listener);
        _values[12] = this.overlap;
        _values[13] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[14] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[15] = this.renderedOnUserRole;
        _values[16] = new Integer(this.rows);
        _values[17] = this.rows_set ? Boolean.TRUE : Boolean.FALSE;
        _values[18] = this.style;
        _values[19] = this.styleClass;
        _values[20] = this.value;
        _values[21] = this._var;
        _values[22] = this.varStatus;
        return _values;
    }

}
