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
package com.icesoft.faces.component.datapaginator;

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

public class DataPaginatorTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.DataScroller";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.DataScroller";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        actionListener = null;
        disabled = null;
        displayedRowsCountVar = null;
        enabledOnUserRole = null;
        fastStep = null;
        firstRowIndexVar = null;
        _for = null;
        immediate = null;
        keyboardNavigationEnabled = null;
        lastRowIndexVar = null;
        pageCountVar = null;
        pageIndexVar = null;
        paginator = null;
        paginatorMaxPages = null;
        renderFacetsIfSinglePage = null;
        renderedOnUserRole = null;
        rowsCountVar = null;
        style = null;
        styleClass = null;
        tabindex = null;
        vertical = null;
        layout = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (actionListener != null) {
                if (isValueReference(actionListener)) {
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(actionListener), actionListenerArgs);
                    _component.getAttributes().put("actionListener", _mb);
                } else {
                    throw new IllegalArgumentException(actionListener);
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
            if (displayedRowsCountVar != null) {
                if (isValueReference(displayedRowsCountVar)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(displayedRowsCountVar));
                    _component.setValueBinding("displayedRowsCountVar", _vb);
                } else {
                    _component.getAttributes().put("displayedRowsCountVar", displayedRowsCountVar);
                }
            }
            if (enabledOnUserRole != null) {
                if (isValueReference(enabledOnUserRole)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(enabledOnUserRole));
                    _component.setValueBinding("enabledOnUserRole", _vb);
                } else {
                    _component.getAttributes().put("enabledOnUserRole", enabledOnUserRole);
                }
            }
            if (fastStep != null) {
                if (isValueReference(fastStep)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(fastStep));
                    _component.setValueBinding("fastStep", _vb);
                } else {
                    _component.getAttributes().put("fastStep", Integer.valueOf(fastStep));
                }
            }
            if (firstRowIndexVar != null) {
                if (isValueReference(firstRowIndexVar)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(firstRowIndexVar));
                    _component.setValueBinding("firstRowIndexVar", _vb);
                } else {
                    _component.getAttributes().put("firstRowIndexVar", firstRowIndexVar);
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
            if (lastRowIndexVar != null) {
                if (isValueReference(lastRowIndexVar)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(lastRowIndexVar));
                    _component.setValueBinding("lastRowIndexVar", _vb);
                } else {
                    _component.getAttributes().put("lastRowIndexVar", lastRowIndexVar);
                }
            }
            if (pageCountVar != null) {
                if (isValueReference(pageCountVar)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(pageCountVar));
                    _component.setValueBinding("pageCountVar", _vb);
                } else {
                    _component.getAttributes().put("pageCountVar", pageCountVar);
                }
            }
            if (pageIndexVar != null) {
                if (isValueReference(pageIndexVar)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(pageIndexVar));
                    _component.setValueBinding("pageIndexVar", _vb);
                } else {
                    _component.getAttributes().put("pageIndexVar", pageIndexVar);
                }
            }
            if (paginator != null) {
                if (isValueReference(paginator)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(paginator));
                    _component.setValueBinding("paginator", _vb);
                } else {
                    _component.getAttributes().put("paginator", Boolean.valueOf(paginator));
                }
            }
            if (paginatorMaxPages != null) {
                if (isValueReference(paginatorMaxPages)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(paginatorMaxPages));
                    _component.setValueBinding("paginatorMaxPages", _vb);
                } else {
                    _component.getAttributes().put("paginatorMaxPages", Integer.valueOf(paginatorMaxPages));
                }
            }
            if (renderFacetsIfSinglePage != null) {
                if (isValueReference(renderFacetsIfSinglePage)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(renderFacetsIfSinglePage));
                    _component.setValueBinding("renderFacetsIfSinglePage", _vb);
                } else {
                    _component.getAttributes().put("renderFacetsIfSinglePage", Boolean.valueOf(renderFacetsIfSinglePage));
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
            if (rowsCountVar != null) {
                if (isValueReference(rowsCountVar)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(rowsCountVar));
                    _component.setValueBinding("rowsCountVar", _vb);
                } else {
                    _component.getAttributes().put("rowsCountVar", rowsCountVar);
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
            if (tabindex != null) {
                if (isValueReference(tabindex)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(tabindex));
                    _component.setValueBinding("tabindex", _vb);
                } else {
                    _component.getAttributes().put("tabindex", Integer.valueOf(tabindex));
                }
            }
            if (vertical != null) {
                if (isValueReference(vertical)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(vertical));
                    _component.setValueBinding("vertical", _vb);
                } else {
                    _component.getAttributes().put("vertical", Boolean.valueOf(vertical));
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
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // actionListener
    private String actionListener = null;
    public void setActionListener(String actionListener) {
        this.actionListener = actionListener;
    }

    // disabled
    private String disabled = null;
    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    // displayedRowsCountVar
    private String displayedRowsCountVar = null;
    public void setDisplayedRowsCountVar(String displayedRowsCountVar) {
        this.displayedRowsCountVar = displayedRowsCountVar;
    }

    // enabledOnUserRole
    private String enabledOnUserRole = null;
    public void setEnabledOnUserRole(String enabledOnUserRole) {
        this.enabledOnUserRole = enabledOnUserRole;
    }

    // fastStep
    private String fastStep = null;
    public void setFastStep(String fastStep) {
        this.fastStep = fastStep;
    }

    // firstRowIndexVar
    private String firstRowIndexVar = null;
    public void setFirstRowIndexVar(String firstRowIndexVar) {
        this.firstRowIndexVar = firstRowIndexVar;
    }

    // for
    private String _for = null;
    public void setFor(String _for) {
        this._for = _for;
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

    // lastRowIndexVar
    private String lastRowIndexVar = null;
    public void setLastRowIndexVar(String lastRowIndexVar) {
        this.lastRowIndexVar = lastRowIndexVar;
    }

    // pageCountVar
    private String pageCountVar = null;
    public void setPageCountVar(String pageCountVar) {
        this.pageCountVar = pageCountVar;
    }

    // pageIndexVar
    private String pageIndexVar = null;
    public void setPageIndexVar(String pageIndexVar) {
        this.pageIndexVar = pageIndexVar;
    }

    // paginator
    private String paginator = null;
    public void setPaginator(String paginator) {
        this.paginator = paginator;
    }

    // paginatorMaxPages
    private String paginatorMaxPages = null;
    public void setPaginatorMaxPages(String paginatorMaxPages) {
        this.paginatorMaxPages = paginatorMaxPages;
    }

    // renderFacetsIfSinglePage
    private String renderFacetsIfSinglePage = null;
    public void setRenderFacetsIfSinglePage(String renderFacetsIfSinglePage) {
        this.renderFacetsIfSinglePage = renderFacetsIfSinglePage;
    }

    // renderedOnUserRole
    private String renderedOnUserRole = null;
    public void setRenderedOnUserRole(String renderedOnUserRole) {
        this.renderedOnUserRole = renderedOnUserRole;
    }

    // rowsCountVar
    private String rowsCountVar = null;
    public void setRowsCountVar(String rowsCountVar) {
        this.rowsCountVar = rowsCountVar;
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

    // tabindex
    private String tabindex = null;
    public void setTabindex(String tabindex) {
        this.tabindex = tabindex;
    }

    // vertical
    private String vertical = null;
    public void setVertical(String vertical) {
        this.vertical = vertical;
    }

    // layout
    private String layout = null;
    public void setLayout(String layout) {
        this.layout = layout;
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
