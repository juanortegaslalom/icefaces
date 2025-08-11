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

public class RowSelectorTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.RowSelector";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return   null;
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        clickAction = null;
        clickListener = null;
        clickedRow = null;
        dblClickDelay = null;
        enhancedMultiple = null;
        immediate = null;
        keyboardNavigationEnabled = null;
        mouseOverClass = null;
        multiple = null;
        preStyleOnSelection = null;
        renderedOnUserRole = null;
        selectedClass = null;
        selectedMouseOverClass = null;
        selectionAction = null;
        selectionListener = null;
        singleRowAutoSelect = null;
        styleClass = null;
        tabindex = null;
        toggleOnClick = null;
        toggleOnInput = null;
        value = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (clickAction != null) {
                if (isValueReference(clickAction)) {
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(clickAction), null );
                    _component.getAttributes().put("clickAction", _mb);
                } else {
                    throw new IllegalArgumentException(clickAction);
                }
            }
            if (clickListener != null) {
                if (isValueReference(clickListener)) {
                    Class[] clickListenerArgs= new Class[]{com.icesoft.faces.component.ext.ClickActionEvent.class};
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(clickListener), clickListenerArgs );
                    _component.getAttributes().put("clickListener", _mb);
                } else {
                    throw new IllegalArgumentException(clickListener);
                }
            }
            if (clickedRow != null) {
                if (isValueReference(clickedRow)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(clickedRow));
                    _component.setValueBinding("clickedRow", _vb);
                } else {
                    _component.getAttributes().put("clickedRow", Integer.valueOf(clickedRow));
                }
            }
            if (dblClickDelay != null) {
                if (isValueReference(dblClickDelay)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(dblClickDelay));
                    _component.setValueBinding("dblClickDelay", _vb);
                } else {
                    _component.getAttributes().put("dblClickDelay", Integer.valueOf(dblClickDelay));
                }
            }
            if (enhancedMultiple != null) {
                if (isValueReference(enhancedMultiple)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(enhancedMultiple));
                    _component.setValueBinding("enhancedMultiple", _vb);
                } else {
                    _component.getAttributes().put("enhancedMultiple", Boolean.valueOf(enhancedMultiple));
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
            if (mouseOverClass != null) {
                if (isValueReference(mouseOverClass)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(mouseOverClass));
                    _component.setValueBinding("mouseOverClass", _vb);
                } else {
                    _component.getAttributes().put("mouseOverClass", mouseOverClass);
                }
            }
            if (multiple != null) {
                if (isValueReference(multiple)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(multiple));
                    _component.setValueBinding("multiple", _vb);
                } else {
                    _component.getAttributes().put("multiple", Boolean.valueOf(multiple));
                }
            }
            if (preStyleOnSelection != null) {
                if (isValueReference(preStyleOnSelection)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(preStyleOnSelection));
                    _component.setValueBinding("preStyleOnSelection", _vb);
                } else {
                    _component.getAttributes().put("preStyleOnSelection", Boolean.valueOf(preStyleOnSelection));
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
            if (selectedClass != null) {
                if (isValueReference(selectedClass)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(selectedClass));
                    _component.setValueBinding("selectedClass", _vb);
                } else {
                    _component.getAttributes().put("selectedClass", selectedClass);
                }
            }
            if (selectedMouseOverClass != null) {
                if (isValueReference(selectedMouseOverClass)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(selectedMouseOverClass));
                    _component.setValueBinding("selectedMouseOverClass", _vb);
                } else {
                    _component.getAttributes().put("selectedMouseOverClass", selectedMouseOverClass);
                }
            }
            if (selectionAction != null) {
                if (isValueReference(selectionAction)) {
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(selectionAction), null );
                    _component.getAttributes().put("selectionAction", _mb);
                } else {
                    throw new IllegalArgumentException(selectionAction);
                }
            }
            if (selectionListener != null) {
                if (isValueReference(selectionListener)) {
                    Class[] selectionListenerArgs= new Class[]{com.icesoft.faces.component.ext.RowSelectorEvent.class};
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(selectionListener), selectionListenerArgs );
                    _component.getAttributes().put("selectionListener", _mb);
                } else {
                    throw new IllegalArgumentException(selectionListener);
                }
            }
            if (singleRowAutoSelect != null) {
                if (isValueReference(singleRowAutoSelect)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(singleRowAutoSelect));
                    _component.setValueBinding("singleRowAutoSelect", _vb);
                } else {
                    _component.getAttributes().put("singleRowAutoSelect", Boolean.valueOf(singleRowAutoSelect));
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
            if (tabindex != null) {
                if (isValueReference(tabindex)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(tabindex));
                    _component.setValueBinding("tabindex", _vb);
                } else {
                    _component.getAttributes().put("tabindex", tabindex);
                }
            }
            if (toggleOnClick != null) {
                if (isValueReference(toggleOnClick)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(toggleOnClick));
                    _component.setValueBinding("toggleOnClick", _vb);
                } else {
                    _component.getAttributes().put("toggleOnClick", Boolean.valueOf(toggleOnClick));
                }
            }
            if (toggleOnInput != null) {
                if (isValueReference(toggleOnInput)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(toggleOnInput));
                    _component.setValueBinding("toggleOnInput", _vb);
                } else {
                    _component.getAttributes().put("toggleOnInput", Boolean.valueOf(toggleOnInput));
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

    // clickAction
    private String clickAction = null;
    public void setClickAction(String clickAction) {
        this.clickAction = clickAction;
    }

    // clickListener
    private String clickListener = null;
    public void setClickListener(String clickListener) {
        this.clickListener = clickListener;
    }

    // clickedRow
    private String clickedRow = null;
    public void setClickedRow(String clickedRow) {
        this.clickedRow = clickedRow;
    }

    // dblClickDelay
    private String dblClickDelay = null;
    public void setDblClickDelay(String dblClickDelay) {
        this.dblClickDelay = dblClickDelay;
    }

    // enhancedMultiple
    private String enhancedMultiple = null;
    public void setEnhancedMultiple(String enhancedMultiple) {
        this.enhancedMultiple = enhancedMultiple;
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

    // mouseOverClass
    private String mouseOverClass = null;
    public void setMouseOverClass(String mouseOverClass) {
        this.mouseOverClass = mouseOverClass;
    }

    // multiple
    private String multiple = null;
    public void setMultiple(String multiple) {
        this.multiple = multiple;
    }

    // preStyleOnSelection
    private String preStyleOnSelection = null;
    public void setPreStyleOnSelection(String preStyleOnSelection) {
        this.preStyleOnSelection = preStyleOnSelection;
    }

    // renderedOnUserRole
    private String renderedOnUserRole = null;
    public void setRenderedOnUserRole(String renderedOnUserRole) {
        this.renderedOnUserRole = renderedOnUserRole;
    }

    // selectedClass
    private String selectedClass = null;
    public void setSelectedClass(String selectedClass) {
        this.selectedClass = selectedClass;
    }

    // selectedMouseOverClass
    private String selectedMouseOverClass = null;
    public void setSelectedMouseOverClass(String selectedMouseOverClass) {
        this.selectedMouseOverClass = selectedMouseOverClass;
    }

    // selectionAction
    private String selectionAction = null;
    public void setSelectionAction(String selectionAction) {
        this.selectionAction = selectionAction;
    }

    // selectionListener
    private String selectionListener = null;
    public void setSelectionListener(String selectionListener) {
        this.selectionListener = selectionListener;
    }

    // singleRowAutoSelect
    private String singleRowAutoSelect = null;
    public void setSingleRowAutoSelect(String singleRowAutoSelect) {
        this.singleRowAutoSelect = singleRowAutoSelect;
    }

    // styleClass
    private String styleClass = null;
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // tabindex
    private String tabindex = null;
    public void setTabindex(String tabindex) {
        this.tabindex = tabindex;
    }

    // toggleOnClick
    private String toggleOnClick = null;
    public void setToggleOnClick(String toggleOnClick) {
        this.toggleOnClick = toggleOnClick;
    }

    // toggleOnInput
    private String toggleOnInput = null;
    public void setToggleOnInput(String toggleOnInput) {
        this.toggleOnInput = toggleOnInput;
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
