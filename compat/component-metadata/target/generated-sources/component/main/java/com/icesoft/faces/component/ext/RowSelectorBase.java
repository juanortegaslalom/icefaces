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
 * enables row selection for dataTable
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class RowSelectorBase extends javax.faces.component.UIPanel {

    /**
     * <p>Construct a new <code>RowSelectorBase</code>.</p>
     */
    public RowSelectorBase() {
        super();
        setRendererType("null");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.RowSelectorFamily";
    }

    // clickAction
    private javax.faces.el.MethodBinding clickAction = null;

    /**
 * <p>
 *              Action method to call when a row is clicked or double-clicked. 
 *                 </p>
     */
    public javax.faces.el.MethodBinding getClickAction() {
        if (this.clickAction != null) {
            return this.clickAction;
        }
        ValueBinding _vb = getValueBinding("clickAction");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 *              Action method to call when a row is clicked or double-clicked. 
 *                 </p>
     * @see #getClickAction()
     */
    public void setClickAction(javax.faces.el.MethodBinding clickAction) {
        this.clickAction = clickAction;
    }

    // clickListener
    private javax.faces.el.MethodBinding clickListener = null;

    /**
 * <p>
 *              Listener method to call with a ClickActionEvent when a row is clicked or double-clicked. This listener
 *              is fired independently of selectionListener. The ClickActionEvent object contains a reference to
 *              a RowSelectorEvent if the click or double click resulted in (de)selection of the row, otherwise
 *              it will be null. ClickActionEvent.isDblClick() determines whether the click event was
 *              a single click or a double click.
 *                 </p>
     */
    public javax.faces.el.MethodBinding getClickListener() {
        if (this.clickListener != null) {
            return this.clickListener;
        }
        ValueBinding _vb = getValueBinding("clickListener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 *              Listener method to call with a ClickActionEvent when a row is clicked or double-clicked. This listener
 *              is fired independently of selectionListener. The ClickActionEvent object contains a reference to
 *              a RowSelectorEvent if the click or double click resulted in (de)selection of the row, otherwise
 *              it will be null. ClickActionEvent.isDblClick() determines whether the click event was
 *              a single click or a double click.
 *                 </p>
     * @see #getClickListener()
     */
    public void setClickListener(javax.faces.el.MethodBinding clickListener) {
        this.clickListener = clickListener;
    }

    // clickedRow
    private int clickedRow = Integer.MIN_VALUE;
    private boolean clickedRow_set = false;

    /**
 * <p>
 *            The table row that was last clicked. Setting this to some value will not effect row selection.
 *                 </p>
     */
    public int getClickedRow() {
        if (this.clickedRow_set) {
            return this.clickedRow;
        }
        ValueBinding _vb = getValueBinding("clickedRow");
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
 * <p>
 *            The table row that was last clicked. Setting this to some value will not effect row selection.
 *                 </p>
     * @see #getClickedRow()
     */
    public void setClickedRow(int clickedRow) {
        this.clickedRow = clickedRow;
        this.clickedRow_set = true;
    }

    // dblClickDelay
    private int dblClickDelay = Integer.MIN_VALUE;
    private boolean dblClickDelay_set = false;

    /**
 * <p>
 *             The delay or timeout in milliseconds to wait for a second click (after a first click has been made on a row) to notify 
 *             the server whether the ClickActionEvent was a single click or a double click. This attribute only applies 
 *             when clickListener and/or clickAction are specified. Valid values are 0 to 1000. Default is 200.
 *             </p>
     */
    public int getDblClickDelay() {
        if (this.dblClickDelay_set) {
            return this.dblClickDelay;
        }
        ValueBinding _vb = getValueBinding("dblClickDelay");
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
 * <p>
 *             The delay or timeout in milliseconds to wait for a second click (after a first click has been made on a row) to notify 
 *             the server whether the ClickActionEvent was a single click or a double click. This attribute only applies 
 *             when clickListener and/or clickAction are specified. Valid values are 0 to 1000. Default is 200.
 *             </p>
     * @see #getDblClickDelay()
     */
    public void setDblClickDelay(int dblClickDelay) {
        this.dblClickDelay = dblClickDelay;
        this.dblClickDelay_set = true;
    }

    // enhancedMultiple
    private boolean enhancedMultiple = false;
    private boolean enhancedMultiple_set = false;

    /**
 * <p> When enhancedMultiple is true, it allows following selection
 *         behaviour:
 *             <ul>
 *                 <li> "Click" selects clicked row and deselects rest </li>
 *                 <li> "Click + Ctrl" flip the selection of clicked row and keeps 
 *                 previous selection intact</li>
 *                 <li> "Click + Shift" selects all rows from last clicked row to 
 *                 newly clicked row, and deselect rest</li>
 *                 <li> "Click + Shift + Ctrl" selects all rows from last clicked 
 *                 row to newly clicked row and keeps previous selection intact</li>
 *             </ul>          
 *         </p>
     */
    public boolean isEnhancedMultiple() {
        if (this.enhancedMultiple_set) {
            return this.enhancedMultiple;
        }
        ValueBinding _vb = getValueBinding("enhancedMultiple");
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
 * <p> When enhancedMultiple is true, it allows following selection
 *         behaviour:
 *             <ul>
 *                 <li> "Click" selects clicked row and deselects rest </li>
 *                 <li> "Click + Ctrl" flip the selection of clicked row and keeps 
 *                 previous selection intact</li>
 *                 <li> "Click + Shift" selects all rows from last clicked row to 
 *                 newly clicked row, and deselect rest</li>
 *                 <li> "Click + Shift + Ctrl" selects all rows from last clicked 
 *                 row to newly clicked row and keeps previous selection intact</li>
 *             </ul>          
 *         </p>
     * @see #isEnhancedMultiple()
     */
    public void setEnhancedMultiple(boolean enhancedMultiple) {
        this.enhancedMultiple = enhancedMultiple;
        this.enhancedMultiple_set = true;
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

    // immediate
    private boolean immediate = false;
    private boolean immediate_set = false;

    /**
 * <p>If true, the selectionListener and selectionAction will be 
 *         executed immediately, during Apply Request Values phase of the request 
 *         processing lifecycle, and if false, during the Invoke Application phase. 
 *         The default value is true, for backwards compatibility.</p>
     */
    public boolean isImmediate() {
        if (this.immediate_set) {
            return this.immediate;
        }
        ValueBinding _vb = getValueBinding("immediate");
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
 * <p>If true, the selectionListener and selectionAction will be 
 *         executed immediately, during Apply Request Values phase of the request 
 *         processing lifecycle, and if false, during the Invoke Application phase. 
 *         The default value is true, for backwards compatibility.</p>
     * @see #isImmediate()
     */
    public void setImmediate(boolean immediate) {
        this.immediate = immediate;
        this.immediate_set = true;
    }

    // keyboardNavigationEnabled
    private boolean keyboardNavigationEnabled = false;
    private boolean keyboardNavigationEnabled_set = false;

    /**
 * <p> Enables keyboard support. Default value is true. When true it 
 *         enables "up" and "down" arrow keys to set the focus on rows, as it was hovered 
 *         by the mouse. Once row has a focus then it can be selected/deselected by
 *         hitting the "space" or "enter" key</p>
     */
    public boolean isKeyboardNavigationEnabled() {
        if (this.keyboardNavigationEnabled_set) {
            return this.keyboardNavigationEnabled;
        }
        ValueBinding _vb = getValueBinding("keyboardNavigationEnabled");
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
 * <p> Enables keyboard support. Default value is true. When true it 
 *         enables "up" and "down" arrow keys to set the focus on rows, as it was hovered 
 *         by the mouse. Once row has a focus then it can be selected/deselected by
 *         hitting the "space" or "enter" key</p>
     * @see #isKeyboardNavigationEnabled()
     */
    public void setKeyboardNavigationEnabled(boolean keyboardNavigationEnabled) {
        this.keyboardNavigationEnabled = keyboardNavigationEnabled;
        this.keyboardNavigationEnabled_set = true;
    }

    // mouseOverClass
    private String mouseOverClass = null;

    /**
 * <p>
 * 				 This method has been deprecated in 1.6. Please use the styleClass
 * 				 instead.
 *                 </p>
     */
    public String getMouseOverClass() {
        if (this.mouseOverClass != null) {
            return this.mouseOverClass;
        }
        ValueBinding _vb = getValueBinding("mouseOverClass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 * 				 This method has been deprecated in 1.6. Please use the styleClass
 * 				 instead.
 *                 </p>
     * @see #getMouseOverClass()
     */
    public void setMouseOverClass(String mouseOverClass) {
        this.mouseOverClass = mouseOverClass;
    }

    // multiple
    private boolean multiple = false;
    private boolean multiple_set = false;

    /**
 * <p> When true, more then one row can be selected. Default is false.
 *                 </p>
     */
    public boolean isMultiple() {
        if (this.multiple_set) {
            return this.multiple;
        }
        ValueBinding _vb = getValueBinding("multiple");
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
 * <p> When true, more then one row can be selected. Default is false.
 *                 </p>
     * @see #isMultiple()
     */
    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
        this.multiple_set = true;
    }

    // preStyleOnSelection
    private boolean preStyleOnSelection = false;
    private boolean preStyleOnSelection_set = false;

    /**
 * <p> When the user (de)selects a row, there can be a latency 
 * 		             with the network communication with the server, and the 
 * 		             JSF lifecycle executing, before the client will be updated
 * 		             to depict the row selection. When <b>preStyleOnSelection</b>
 * 		             is true, the table row's styling will be updated immediately,
 * 		             improving the application's perceived responsiveness. When
 * 		             applications directly manage row selection, on the server 
 * 		             side, to implement specific rules for (de)selection, they
 * 		             should see this to false, to avoid styling being set and 
 * 		             reset. For backwards compatibility with such applications,
 * 		             the default value is false.</p>
     */
    public boolean isPreStyleOnSelection() {
        if (this.preStyleOnSelection_set) {
            return this.preStyleOnSelection;
        }
        ValueBinding _vb = getValueBinding("preStyleOnSelection");
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
 * <p> When the user (de)selects a row, there can be a latency 
 * 		             with the network communication with the server, and the 
 * 		             JSF lifecycle executing, before the client will be updated
 * 		             to depict the row selection. When <b>preStyleOnSelection</b>
 * 		             is true, the table row's styling will be updated immediately,
 * 		             improving the application's perceived responsiveness. When
 * 		             applications directly manage row selection, on the server 
 * 		             side, to implement specific rules for (de)selection, they
 * 		             should see this to false, to avoid styling being set and 
 * 		             reset. For backwards compatibility with such applications,
 * 		             the default value is false.</p>
     * @see #isPreStyleOnSelection()
     */
    public void setPreStyleOnSelection(boolean preStyleOnSelection) {
        this.preStyleOnSelection = preStyleOnSelection;
        this.preStyleOnSelection_set = true;
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

    // selectedClass
    private String selectedClass = null;

    /**
 * <p>
 * 				 This method has been deprecated in 1.6. Please use the styleClass
 * 				 instead.
 *                 </p>
     */
    public String getSelectedClass() {
        if (this.selectedClass != null) {
            return this.selectedClass;
        }
        ValueBinding _vb = getValueBinding("selectedClass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 * 				 This method has been deprecated in 1.6. Please use the styleClass
 * 				 instead.
 *                 </p>
     * @see #getSelectedClass()
     */
    public void setSelectedClass(String selectedClass) {
        this.selectedClass = selectedClass;
    }

    // selectedMouseOverClass
    private String selectedMouseOverClass = null;

    /**
 * <p>
 * 				 This method has been deprecated in 1.6. Please use the styleClass
 * 				 instead.
 *                 </p>
     */
    public String getSelectedMouseOverClass() {
        if (this.selectedMouseOverClass != null) {
            return this.selectedMouseOverClass;
        }
        ValueBinding _vb = getValueBinding("selectedMouseOverClass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 * 				 This method has been deprecated in 1.6. Please use the styleClass
 * 				 instead.
 *                 </p>
     * @see #getSelectedMouseOverClass()
     */
    public void setSelectedMouseOverClass(String selectedMouseOverClass) {
        this.selectedMouseOverClass = selectedMouseOverClass;
    }

    // selectionAction
    private javax.faces.el.MethodBinding selectionAction = null;

    /**
 * <p>
 *              Action method to call when a row is clicked
 *                 </p>
     */
    public javax.faces.el.MethodBinding getSelectionAction() {
        if (this.selectionAction != null) {
            return this.selectionAction;
        }
        ValueBinding _vb = getValueBinding("selectionAction");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 *              Action method to call when a row is clicked
 *                 </p>
     * @see #getSelectionAction()
     */
    public void setSelectionAction(javax.faces.el.MethodBinding selectionAction) {
        this.selectionAction = selectionAction;
    }

    // selectionListener
    private javax.faces.el.MethodBinding selectionListener = null;

    /**
 * <p>
 *              Listener method to call with a RowSelectorEvent when a row is (de)selected 
 *                 </p>
     */
    public javax.faces.el.MethodBinding getSelectionListener() {
        if (this.selectionListener != null) {
            return this.selectionListener;
        }
        ValueBinding _vb = getValueBinding("selectionListener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 *              Listener method to call with a RowSelectorEvent when a row is (de)selected 
 *                 </p>
     * @see #getSelectionListener()
     */
    public void setSelectionListener(javax.faces.el.MethodBinding selectionListener) {
        this.selectionListener = selectionListener;
    }

    // singleRowAutoSelect
    private boolean singleRowAutoSelect = false;
    private boolean singleRowAutoSelect_set = false;

    /**
 * <p>When true selects rows automatically on arrow key events in single selection mode</p>
     */
    public boolean isSingleRowAutoSelect() {
        if (this.singleRowAutoSelect_set) {
            return this.singleRowAutoSelect;
        }
        ValueBinding _vb = getValueBinding("singleRowAutoSelect");
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
 * <p>When true selects rows automatically on arrow key events in single selection mode</p>
     * @see #isSingleRowAutoSelect()
     */
    public void setSingleRowAutoSelect(boolean singleRowAutoSelect) {
        this.singleRowAutoSelect = singleRowAutoSelect;
        this.singleRowAutoSelect_set = true;
    }

    // styleClass
    private String styleClass = null;

    /**
 * <p>
 *               Space-separated list of CSS style class(es) to be applied when this
 *               element is rendered. This value must be passed through as the 
 *               "class" attribute on generated markup.<br/>
 *                 Default value is <b>iceRowSel</b>:<br/>        
 *                Style Classes Used:
 *                      <ul>
 *                        <li>iceRowSelMouseOver</li>
 *                        <li>iceRowSelSelected</li>                      
 *                        <li>iceRowSelSelectedMouseOver</li> 
 *                      </ul>  
 *                 </p>
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
 *               Space-separated list of CSS style class(es) to be applied when this
 *               element is rendered. This value must be passed through as the 
 *               "class" attribute on generated markup.<br/>
 *                 Default value is <b>iceRowSel</b>:<br/>        
 *                Style Classes Used:
 *                      <ul>
 *                        <li>iceRowSelMouseOver</li>
 *                        <li>iceRowSelSelected</li>                      
 *                        <li>iceRowSelSelectedMouseOver</li> 
 *                      </ul>  
 *                 </p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // tabindex
    private String tabindex = null;

    /**
 * <p>Position of this element in the tabbing order for the current document. 
 * 		This value must be an integer between 0 and 32767.</p>
     */
    public String getTabindex() {
        if (this.tabindex != null) {
            return this.tabindex;
        }
        ValueBinding _vb = getValueBinding("tabindex");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Position of this element in the tabbing order for the current document. 
 * 		This value must be an integer between 0 and 32767.</p>
     * @see #getTabindex()
     */
    public void setTabindex(String tabindex) {
        this.tabindex = tabindex;
    }

    // toggleOnClick
    private boolean toggleOnClick = false;
    private boolean toggleOnClick_set = false;

    /**
 * <p>
 * 		Do row selection on mouse click. When false, row (de)selection will not 
 *         happen when the user clicks on a table row. Default value is true.
 *                 </p>
     */
    public boolean isToggleOnClick() {
        if (this.toggleOnClick_set) {
            return this.toggleOnClick;
        }
        ValueBinding _vb = getValueBinding("toggleOnClick");
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
 * <p>
 * 		Do row selection on mouse click. When false, row (de)selection will not 
 *         happen when the user clicks on a table row. Default value is true.
 *                 </p>
     * @see #isToggleOnClick()
     */
    public void setToggleOnClick(boolean toggleOnClick) {
        this.toggleOnClick = toggleOnClick;
        this.toggleOnClick_set = true;
    }

    // toggleOnInput
    private boolean toggleOnInput = false;
    private boolean toggleOnInput_set = false;

    /**
 * <p>
 * 		Do row selection, even when the user clicks on an input field or link 
 * 		in a table cell. Default value is true. When false, row (de)selection
 * 		will not happen when the user clicks inside an input field, list,
 * 		menu, button, or link.</p>
     */
    public boolean isToggleOnInput() {
        if (this.toggleOnInput_set) {
            return this.toggleOnInput;
        }
        ValueBinding _vb = getValueBinding("toggleOnInput");
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
 * <p>
 * 		Do row selection, even when the user clicks on an input field or link 
 * 		in a table cell. Default value is true. When false, row (de)selection
 * 		will not happen when the user clicks inside an input field, list,
 * 		menu, button, or link.</p>
     * @see #isToggleOnInput()
     */
    public void setToggleOnInput(boolean toggleOnInput) {
        this.toggleOnInput = toggleOnInput;
        this.toggleOnInput_set = true;
    }

    // value
    private Object value = null;

    /**
 * <p>A ValueBinding to a per dataTable row java.lang.Boolean 
 * 		property, which determines if that row is selected. Typically the 
 * 		ValueBinding refers to a property of the dataTable's <i>var</i>
 * 		attribute, but another strategy is to use a smart java.util.Map to 
 * 		centrally maintain the selection state.</p>
     */
    public Object getValue() {
        if (this.value != null) {
            return this.value;
        }
        ValueBinding _vb = getValueBinding("value");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return "false";
    }

    /**
 * <p>A ValueBinding to a per dataTable row java.lang.Boolean 
 * 		property, which determines if that row is selected. Typically the 
 * 		ValueBinding refers to a property of the dataTable's <i>var</i>
 * 		attribute, but another strategy is to use a smart java.util.Map to 
 * 		centrally maintain the selection state.</p>
     * @see #getValue()
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.clickAction = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[1]);
        this.clickListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[2]);
        this.clickedRow = ((Integer) _values[3]).intValue();
        this.clickedRow_set = ((Boolean) _values[4]).booleanValue();
        this.dblClickDelay = ((Integer) _values[5]).intValue();
        this.dblClickDelay_set = ((Boolean) _values[6]).booleanValue();
        this.enhancedMultiple = ((Boolean) _values[7]).booleanValue();
        this.enhancedMultiple_set = ((Boolean) _values[8]).booleanValue();
        this.id = (String) _values[9];
        this.immediate = ((Boolean) _values[10]).booleanValue();
        this.immediate_set = ((Boolean) _values[11]).booleanValue();
        this.keyboardNavigationEnabled = ((Boolean) _values[12]).booleanValue();
        this.keyboardNavigationEnabled_set = ((Boolean) _values[13]).booleanValue();
        this.mouseOverClass = (String) _values[14];
        this.multiple = ((Boolean) _values[15]).booleanValue();
        this.multiple_set = ((Boolean) _values[16]).booleanValue();
        this.preStyleOnSelection = ((Boolean) _values[17]).booleanValue();
        this.preStyleOnSelection_set = ((Boolean) _values[18]).booleanValue();
        this.rendered = ((Boolean) _values[19]).booleanValue();
        this.rendered_set = ((Boolean) _values[20]).booleanValue();
        this.renderedOnUserRole = (String) _values[21];
        this.selectedClass = (String) _values[22];
        this.selectedMouseOverClass = (String) _values[23];
        this.selectionAction = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[24]);
        this.selectionListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[25]);
        this.singleRowAutoSelect = ((Boolean) _values[26]).booleanValue();
        this.singleRowAutoSelect_set = ((Boolean) _values[27]).booleanValue();
        this.styleClass = (String) _values[28];
        this.tabindex = (String) _values[29];
        this.toggleOnClick = ((Boolean) _values[30]).booleanValue();
        this.toggleOnClick_set = ((Boolean) _values[31]).booleanValue();
        this.toggleOnInput = ((Boolean) _values[32]).booleanValue();
        this.toggleOnInput_set = ((Boolean) _values[33]).booleanValue();
        this.value = (Object) _values[34];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[35];
        _values[0] = super.saveState(_context);
        _values[1] = saveAttachedState(_context, clickAction);
        _values[2] = saveAttachedState(_context, clickListener);
        _values[3] = new Integer(this.clickedRow);
        _values[4] = this.clickedRow_set ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = new Integer(this.dblClickDelay);
        _values[6] = this.dblClickDelay_set ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.enhancedMultiple ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.enhancedMultiple_set ? Boolean.TRUE : Boolean.FALSE;
        _values[9] = this.id;
        _values[10] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[11] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[12] = this.keyboardNavigationEnabled ? Boolean.TRUE : Boolean.FALSE;
        _values[13] = this.keyboardNavigationEnabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[14] = this.mouseOverClass;
        _values[15] = this.multiple ? Boolean.TRUE : Boolean.FALSE;
        _values[16] = this.multiple_set ? Boolean.TRUE : Boolean.FALSE;
        _values[17] = this.preStyleOnSelection ? Boolean.TRUE : Boolean.FALSE;
        _values[18] = this.preStyleOnSelection_set ? Boolean.TRUE : Boolean.FALSE;
        _values[19] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[20] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[21] = this.renderedOnUserRole;
        _values[22] = this.selectedClass;
        _values[23] = this.selectedMouseOverClass;
        _values[24] = saveAttachedState(_context, selectionAction);
        _values[25] = saveAttachedState(_context, selectionListener);
        _values[26] = this.singleRowAutoSelect ? Boolean.TRUE : Boolean.FALSE;
        _values[27] = this.singleRowAutoSelect_set ? Boolean.TRUE : Boolean.FALSE;
        _values[28] = this.styleClass;
        _values[29] = this.tabindex;
        _values[30] = this.toggleOnClick ? Boolean.TRUE : Boolean.FALSE;
        _values[31] = this.toggleOnClick_set ? Boolean.TRUE : Boolean.FALSE;
        _values[32] = this.toggleOnInput ? Boolean.TRUE : Boolean.FALSE;
        _values[33] = this.toggleOnInput_set ? Boolean.TRUE : Boolean.FALSE;
        _values[34] = this.value;
        return _values;
    }

}
