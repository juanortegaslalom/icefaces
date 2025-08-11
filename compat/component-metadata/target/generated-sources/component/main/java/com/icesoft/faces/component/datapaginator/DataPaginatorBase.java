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
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Provides a paginated view and navigation facets for a DataTable
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class DataPaginatorBase extends javax.faces.component.html.HtmlPanelGroup {

    /**
     * <p>Construct a new <code>DataPaginatorBase</code>.</p>
     */
    public DataPaginatorBase() {
        super();
        setRendererType("com.icesoft.faces.DataScroller");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Panel";
    }

    // actionListener
    private javax.faces.el.MethodBinding actionListener = null;

    /**
 * <p>MethodBinding representing an action listener method that will be 
 * 		notified when the paginator would be clicked.</p>
     */
    public javax.faces.el.MethodBinding getActionListener() {
        if (this.actionListener != null) {
            return this.actionListener;
        }
        ValueBinding _vb = getValueBinding("actionListener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>MethodBinding representing an action listener method that will be 
 * 		notified when the paginator would be clicked.</p>
     * @see #getActionListener()
     */
    public void setActionListener(javax.faces.el.MethodBinding actionListener) {
        this.actionListener = actionListener;
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

    // displayedRowsCountVar
    private String displayedRowsCountVar = null;

    /**
 * <p>A parameter name, under which the actual displayed rows count is set in 
 * 		request scope similar to the var parameter.</p>
     */
    public String getDisplayedRowsCountVar() {
        if (this.displayedRowsCountVar != null) {
            return this.displayedRowsCountVar;
        }
        ValueBinding _vb = getValueBinding("displayedRowsCountVar");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>A parameter name, under which the actual displayed rows count is set in 
 * 		request scope similar to the var parameter.</p>
     * @see #getDisplayedRowsCountVar()
     */
    public void setDisplayedRowsCountVar(String displayedRowsCountVar) {
        this.displayedRowsCountVar = displayedRowsCountVar;
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

    // fastStep
    private int fastStep = Integer.MIN_VALUE;
    private boolean fastStep_set = false;

    /**
 * <p>step (pages) used for fastforward and fastrewind.</p>
     */
    public int getFastStep() {
        if (this.fastStep_set) {
            return this.fastStep;
        }
        ValueBinding _vb = getValueBinding("fastStep");
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
 * <p>step (pages) used for fastforward and fastrewind.</p>
     * @see #getFastStep()
     */
    public void setFastStep(int fastStep) {
        this.fastStep = fastStep;
        this.fastStep_set = true;
    }

    // firstRowIndexVar
    private String firstRowIndexVar = null;

    /**
 * <p>A parameter name, under which the actual first displayed row index is set 
 * 		in request scope similar to the var parameter.</p>
     */
    public String getFirstRowIndexVar() {
        if (this.firstRowIndexVar != null) {
            return this.firstRowIndexVar;
        }
        ValueBinding _vb = getValueBinding("firstRowIndexVar");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>A parameter name, under which the actual first displayed row index is set 
 * 		in request scope similar to the var parameter.</p>
     * @see #getFirstRowIndexVar()
     */
    public void setFirstRowIndexVar(String firstRowIndexVar) {
        this.firstRowIndexVar = firstRowIndexVar;
    }

    // for
    private String _for = null;

    /**
 * <p>Id of the dataTable.</p>
     */
    public String getFor() {
        if (this._for != null) {
            return this._for;
        }
        ValueBinding _vb = getValueBinding("for");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Id of the dataTable.</p>
     * @see #getFor()
     */
    public void setFor(String _for) {
        this._for = _for;
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
 * <p>True means, that the default ActionListener should be executed immediately 
 * 		(i.e. during Apply Request Values phase of the request processing lifecycle)
 * 		, rather than waiting until the Invoke Application phase.</p>
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
 * <p>True means, that the default ActionListener should be executed immediately 
 * 		(i.e. during Apply Request Values phase of the request processing lifecycle)
 * 		, rather than waiting until the Invoke Application phase.</p>
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
 * <p> Enables keyboard support. Default value is true. When true 
 *         it enables the following keys: Home, End, PageUp and PageDown to navigate
 *         to First, Last, Previous and Next page respectively.<br/>
 *         <b>Note:</b> Shortcut keys would only be processed when focus is on one of a
 *         paginator button or focus is on one of a row in the datatable when keyboardNavigationEnabled
 *         is true on rowSelector as well.        
 *         </p>
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
 * <p> Enables keyboard support. Default value is true. When true 
 *         it enables the following keys: Home, End, PageUp and PageDown to navigate
 *         to First, Last, Previous and Next page respectively.<br/>
 *         <b>Note:</b> Shortcut keys would only be processed when focus is on one of a
 *         paginator button or focus is on one of a row in the datatable when keyboardNavigationEnabled
 *         is true on rowSelector as well.        
 *         </p>
     * @see #isKeyboardNavigationEnabled()
     */
    public void setKeyboardNavigationEnabled(boolean keyboardNavigationEnabled) {
        this.keyboardNavigationEnabled = keyboardNavigationEnabled;
        this.keyboardNavigationEnabled_set = true;
    }

    // lastRowIndexVar
    private String lastRowIndexVar = null;

    /**
 * <p>A parameter name, under which the actual last displayed row index is set in 
 * 		request scope similar to the var parameter.</p>
     */
    public String getLastRowIndexVar() {
        if (this.lastRowIndexVar != null) {
            return this.lastRowIndexVar;
        }
        ValueBinding _vb = getValueBinding("lastRowIndexVar");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>A parameter name, under which the actual last displayed row index is set in 
 * 		request scope similar to the var parameter.</p>
     * @see #getLastRowIndexVar()
     */
    public void setLastRowIndexVar(String lastRowIndexVar) {
        this.lastRowIndexVar = lastRowIndexVar;
    }

    // pageCountVar
    private String pageCountVar = null;

    /**
 * <p>A parameter name, under which the actual page count is set in request scope 
 * 		similar to the var parameter.</p>
     */
    public String getPageCountVar() {
        if (this.pageCountVar != null) {
            return this.pageCountVar;
        }
        ValueBinding _vb = getValueBinding("pageCountVar");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>A parameter name, under which the actual page count is set in request scope 
 * 		similar to the var parameter.</p>
     * @see #getPageCountVar()
     */
    public void setPageCountVar(String pageCountVar) {
        this.pageCountVar = pageCountVar;
    }

    // pageIndexVar
    private String pageIndexVar = null;

    /**
 * <p>A parameter name, under which the actual page index is set in request scope 
 * 		similar to the var parameter.</p>
     */
    public String getPageIndexVar() {
        if (this.pageIndexVar != null) {
            return this.pageIndexVar;
        }
        ValueBinding _vb = getValueBinding("pageIndexVar");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>A parameter name, under which the actual page index is set in request scope 
 * 		similar to the var parameter.</p>
     * @see #getPageIndexVar()
     */
    public void setPageIndexVar(String pageIndexVar) {
        this.pageIndexVar = pageIndexVar;
    }

    // paginator
    private boolean paginator = false;
    private boolean paginator_set = false;

    /**
 * <p>If set true, then the page number links will be rendered.</p>
     */
    public boolean isPaginator() {
        if (this.paginator_set) {
            return this.paginator;
        }
        ValueBinding _vb = getValueBinding("paginator");
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
 * <p>If set true, then the page number links will be rendered.</p>
     * @see #isPaginator()
     */
    public void setPaginator(boolean paginator) {
        this.paginator = paginator;
        this.paginator_set = true;
    }

    // paginatorMaxPages
    private int paginatorMaxPages = Integer.MIN_VALUE;
    private boolean paginatorMaxPages_set = false;

    /**
 * <p>The maximum amount of pages to be displayed in the paginator.</p>
     */
    public int getPaginatorMaxPages() {
        if (this.paginatorMaxPages_set) {
            return this.paginatorMaxPages;
        }
        ValueBinding _vb = getValueBinding("paginatorMaxPages");
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
 * <p>The maximum amount of pages to be displayed in the paginator.</p>
     * @see #getPaginatorMaxPages()
     */
    public void setPaginatorMaxPages(int paginatorMaxPages) {
        this.paginatorMaxPages = paginatorMaxPages;
        this.paginatorMaxPages_set = true;
    }

    // renderFacetsIfSinglePage
    private boolean renderFacetsIfSinglePage = false;
    private boolean renderFacetsIfSinglePage_set = false;

    /**
 * <p>If set to false, then the data scroller will not be rendered when 
 * 		only a single page of data exists.</p>
     */
    public boolean isRenderFacetsIfSinglePage() {
        if (this.renderFacetsIfSinglePage_set) {
            return this.renderFacetsIfSinglePage;
        }
        ValueBinding _vb = getValueBinding("renderFacetsIfSinglePage");
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
 * <p>If set to false, then the data scroller will not be rendered when 
 * 		only a single page of data exists.</p>
     * @see #isRenderFacetsIfSinglePage()
     */
    public void setRenderFacetsIfSinglePage(boolean renderFacetsIfSinglePage) {
        this.renderFacetsIfSinglePage = renderFacetsIfSinglePage;
        this.renderFacetsIfSinglePage_set = true;
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

    // rowsCountVar
    private String rowsCountVar = null;

    /**
 * <p>A parameter name, under which the actual rows count is set in request 
 * 		scope similar to the var parameter.</p>
     */
    public String getRowsCountVar() {
        if (this.rowsCountVar != null) {
            return this.rowsCountVar;
        }
        ValueBinding _vb = getValueBinding("rowsCountVar");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>A parameter name, under which the actual rows count is set in request 
 * 		scope similar to the var parameter.</p>
     * @see #getRowsCountVar()
     */
    public void setRowsCountVar(String rowsCountVar) {
        this.rowsCountVar = rowsCountVar;
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
 *               Space-separated list of CSS style class(es) to be applied when this
 *               element is rendered. This value must be passed through as the 
 *               "class" attribute on generated markup.<br/>
 *               Default value is <b>iceDatPgr<b/></p>
 *               if enabled
 *               <ul>
 *                 <li>iceDatPgrScrBtn</li>
 *                 <li>iceDatPgrScrOut</li>
 *                 <li>iceDatPgrSrcCol</li>
 *                 <li>iceDatPgrCol</li>
 *                 <li>iceDatPgrTbl</li>                
 *               </ul>   
 *               if disabled
 *               <ul>
 *                 <li>iceDatPgrScrBtn-dis</li>
 *                 <li>iceDatPgrScrOut-dis</li>
 *                 <li>iceDatPgrSrcCol-dis</li>
 *                 <li>iceDatPgrCol-dis</li>
 *                 <li>iceDatPgrTbl-dis</li>                
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
 *               Space-separated list of CSS style class(es) to be applied when this
 *               element is rendered. This value must be passed through as the 
 *               "class" attribute on generated markup.<br/>
 *               Default value is <b>iceDatPgr<b/></p>
 *               if enabled
 *               <ul>
 *                 <li>iceDatPgrScrBtn</li>
 *                 <li>iceDatPgrScrOut</li>
 *                 <li>iceDatPgrSrcCol</li>
 *                 <li>iceDatPgrCol</li>
 *                 <li>iceDatPgrTbl</li>                
 *               </ul>   
 *               if disabled
 *               <ul>
 *                 <li>iceDatPgrScrBtn-dis</li>
 *                 <li>iceDatPgrScrOut-dis</li>
 *                 <li>iceDatPgrSrcCol-dis</li>
 *                 <li>iceDatPgrCol-dis</li>
 *                 <li>iceDatPgrTbl-dis</li>                
 *               </ul>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // tabindex
    private int tabindex = Integer.MIN_VALUE;
    private boolean tabindex_set = false;

    /**
 * <p>Position of this element in the tabbing order for the current document. This value must be an integer between 0 and 32767.</p>
     */
    public int getTabindex() {
        if (this.tabindex_set) {
            return this.tabindex;
        }
        ValueBinding _vb = getValueBinding("tabindex");
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
 * <p>Position of this element in the tabbing order for the current document. This value must be an integer between 0 and 32767.</p>
     * @see #getTabindex()
     */
    public void setTabindex(int tabindex) {
        this.tabindex = tabindex;
        this.tabindex_set = true;
    }

    // vertical
    private boolean vertical = false;
    private boolean vertical_set = false;

    /**
 * <p>True means, that the padinatior would render vertically, default is false.</p>
     */
    public boolean isVertical() {
        if (this.vertical_set) {
            return this.vertical;
        }
        ValueBinding _vb = getValueBinding("vertical");
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
 * <p>True means, that the padinatior would render vertically, default is false.</p>
     * @see #isVertical()
     */
    public void setVertical(boolean vertical) {
        this.vertical = vertical;
        this.vertical_set = true;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.actionListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[1]);
        this.disabled = ((Boolean) _values[2]).booleanValue();
        this.disabled_set = ((Boolean) _values[3]).booleanValue();
        this.displayedRowsCountVar = (String) _values[4];
        this.enabledOnUserRole = (String) _values[5];
        this.fastStep = ((Integer) _values[6]).intValue();
        this.fastStep_set = ((Boolean) _values[7]).booleanValue();
        this.firstRowIndexVar = (String) _values[8];
        this._for = (String) _values[9];
        this.id = (String) _values[10];
        this.immediate = ((Boolean) _values[11]).booleanValue();
        this.immediate_set = ((Boolean) _values[12]).booleanValue();
        this.keyboardNavigationEnabled = ((Boolean) _values[13]).booleanValue();
        this.keyboardNavigationEnabled_set = ((Boolean) _values[14]).booleanValue();
        this.lastRowIndexVar = (String) _values[15];
        this.pageCountVar = (String) _values[16];
        this.pageIndexVar = (String) _values[17];
        this.paginator = ((Boolean) _values[18]).booleanValue();
        this.paginator_set = ((Boolean) _values[19]).booleanValue();
        this.paginatorMaxPages = ((Integer) _values[20]).intValue();
        this.paginatorMaxPages_set = ((Boolean) _values[21]).booleanValue();
        this.renderFacetsIfSinglePage = ((Boolean) _values[22]).booleanValue();
        this.renderFacetsIfSinglePage_set = ((Boolean) _values[23]).booleanValue();
        this.rendered = ((Boolean) _values[24]).booleanValue();
        this.rendered_set = ((Boolean) _values[25]).booleanValue();
        this.renderedOnUserRole = (String) _values[26];
        this.rowsCountVar = (String) _values[27];
        this.style = (String) _values[28];
        this.styleClass = (String) _values[29];
        this.tabindex = ((Integer) _values[30]).intValue();
        this.tabindex_set = ((Boolean) _values[31]).booleanValue();
        this.vertical = ((Boolean) _values[32]).booleanValue();
        this.vertical_set = ((Boolean) _values[33]).booleanValue();
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[34];
        _values[0] = super.saveState(_context);
        _values[1] = saveAttachedState(_context, actionListener);
        _values[2] = this.disabled ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.disabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.displayedRowsCountVar;
        _values[5] = this.enabledOnUserRole;
        _values[6] = new Integer(this.fastStep);
        _values[7] = this.fastStep_set ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.firstRowIndexVar;
        _values[9] = this._for;
        _values[10] = this.id;
        _values[11] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[12] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[13] = this.keyboardNavigationEnabled ? Boolean.TRUE : Boolean.FALSE;
        _values[14] = this.keyboardNavigationEnabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[15] = this.lastRowIndexVar;
        _values[16] = this.pageCountVar;
        _values[17] = this.pageIndexVar;
        _values[18] = this.paginator ? Boolean.TRUE : Boolean.FALSE;
        _values[19] = this.paginator_set ? Boolean.TRUE : Boolean.FALSE;
        _values[20] = new Integer(this.paginatorMaxPages);
        _values[21] = this.paginatorMaxPages_set ? Boolean.TRUE : Boolean.FALSE;
        _values[22] = this.renderFacetsIfSinglePage ? Boolean.TRUE : Boolean.FALSE;
        _values[23] = this.renderFacetsIfSinglePage_set ? Boolean.TRUE : Boolean.FALSE;
        _values[24] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[25] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[26] = this.renderedOnUserRole;
        _values[27] = this.rowsCountVar;
        _values[28] = this.style;
        _values[29] = this.styleClass;
        _values[30] = new Integer(this.tabindex);
        _values[31] = this.tabindex_set ? Boolean.TRUE : Boolean.FALSE;
        _values[32] = this.vertical ? Boolean.TRUE : Boolean.FALSE;
        _values[33] = this.vertical_set ? Boolean.TRUE : Boolean.FALSE;
        return _values;
    }

}
