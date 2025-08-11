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
package com.icesoft.faces.component.paneltabset;

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

public class PanelTabSetTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.PanelTabSet";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.TabbedPane";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        align = null;
        bgcolor = null;
        border = null;
        cellpadding = null;
        cellspacing = null;
        dir = null;
        first = null;
        frame = null;
        height = null;
        immediate = null;
        keyboardNavigationEnabled = null;
        lang = null;
        onclick = null;
        ondblclick = null;
        onkeydown = null;
        onkeypress = null;
        onkeyup = null;
        onmousedown = null;
        onmousemove = null;
        onmouseout = null;
        onmouseover = null;
        onmouseup = null;
        partialSubmit = null;
        renderedOnUserRole = null;
        rows = null;
        rules = null;
        selectedIndex = null;
        style = null;
        styleClass = null;
        summary = null;
        tabChangeListener = null;
        tabPlacement = null;
        tabindex = null;
        title = null;
        value = null;
        _var = null;
        varStatus = null;
        visible = null;
        width = null;
        bodyrows = null;
        captionClass = null;
        captionStyle = null;
        columnClasses = null;
        footerClass = null;
        headerClass = null;
        rowClasses = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (align != null) {
                if (isValueReference(align)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(align));
                    _component.setValueBinding("align", _vb);
                } else {
                    _component.getAttributes().put("align", align);
                }
            }
            if (bgcolor != null) {
                if (isValueReference(bgcolor)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(bgcolor));
                    _component.setValueBinding("bgcolor", _vb);
                } else {
                    _component.getAttributes().put("bgcolor", bgcolor);
                }
            }
            if (border != null) {
                if (isValueReference(border)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(border));
                    _component.setValueBinding("border", _vb);
                } else {
                    _component.getAttributes().put("border", Integer.valueOf(border));
                }
            }
            if (cellpadding != null) {
                if (isValueReference(cellpadding)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(cellpadding));
                    _component.setValueBinding("cellpadding", _vb);
                } else {
                    _component.getAttributes().put("cellpadding", cellpadding);
                }
            }
            if (cellspacing != null) {
                if (isValueReference(cellspacing)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(cellspacing));
                    _component.setValueBinding("cellspacing", _vb);
                } else {
                    _component.getAttributes().put("cellspacing", cellspacing);
                }
            }
            if (dir != null) {
                if (isValueReference(dir)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(dir));
                    _component.setValueBinding("dir", _vb);
                } else {
                    _component.getAttributes().put("dir", dir);
                }
            }
            if (first != null) {
                if (isValueReference(first)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(first));
                    _component.setValueBinding("first", _vb);
                } else {
                    _component.getAttributes().put("first", Integer.valueOf(first));
                }
            }
            if (frame != null) {
                if (isValueReference(frame)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(frame));
                    _component.setValueBinding("frame", _vb);
                } else {
                    _component.getAttributes().put("frame", frame);
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
            if (lang != null) {
                if (isValueReference(lang)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(lang));
                    _component.setValueBinding("lang", _vb);
                } else {
                    _component.getAttributes().put("lang", lang);
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
            if (ondblclick != null) {
                if (isValueReference(ondblclick)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(ondblclick));
                    _component.setValueBinding("ondblclick", _vb);
                } else {
                    _component.getAttributes().put("ondblclick", ondblclick);
                }
            }
            if (onkeydown != null) {
                if (isValueReference(onkeydown)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onkeydown));
                    _component.setValueBinding("onkeydown", _vb);
                } else {
                    _component.getAttributes().put("onkeydown", onkeydown);
                }
            }
            if (onkeypress != null) {
                if (isValueReference(onkeypress)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onkeypress));
                    _component.setValueBinding("onkeypress", _vb);
                } else {
                    _component.getAttributes().put("onkeypress", onkeypress);
                }
            }
            if (onkeyup != null) {
                if (isValueReference(onkeyup)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onkeyup));
                    _component.setValueBinding("onkeyup", _vb);
                } else {
                    _component.getAttributes().put("onkeyup", onkeyup);
                }
            }
            if (onmousedown != null) {
                if (isValueReference(onmousedown)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmousedown));
                    _component.setValueBinding("onmousedown", _vb);
                } else {
                    _component.getAttributes().put("onmousedown", onmousedown);
                }
            }
            if (onmousemove != null) {
                if (isValueReference(onmousemove)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmousemove));
                    _component.setValueBinding("onmousemove", _vb);
                } else {
                    _component.getAttributes().put("onmousemove", onmousemove);
                }
            }
            if (onmouseout != null) {
                if (isValueReference(onmouseout)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmouseout));
                    _component.setValueBinding("onmouseout", _vb);
                } else {
                    _component.getAttributes().put("onmouseout", onmouseout);
                }
            }
            if (onmouseover != null) {
                if (isValueReference(onmouseover)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmouseover));
                    _component.setValueBinding("onmouseover", _vb);
                } else {
                    _component.getAttributes().put("onmouseover", onmouseover);
                }
            }
            if (onmouseup != null) {
                if (isValueReference(onmouseup)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(onmouseup));
                    _component.setValueBinding("onmouseup", _vb);
                } else {
                    _component.getAttributes().put("onmouseup", onmouseup);
                }
            }
            if (partialSubmit != null) {
                if (isValueReference(partialSubmit)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(partialSubmit));
                    _component.setValueBinding("partialSubmit", _vb);
                } else {
                    _component.getAttributes().put("partialSubmit", Boolean.valueOf(partialSubmit));
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
            if (rows != null) {
                if (isValueReference(rows)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(rows));
                    _component.setValueBinding("rows", _vb);
                } else {
                    _component.getAttributes().put("rows", Integer.valueOf(rows));
                }
            }
            if (rules != null) {
                if (isValueReference(rules)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(rules));
                    _component.setValueBinding("rules", _vb);
                } else {
                    _component.getAttributes().put("rules", rules);
                }
            }
            if (selectedIndex != null) {
                if (isValueReference(selectedIndex)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(selectedIndex));
                    _component.setValueBinding("selectedIndex", _vb);
                } else {
                    _component.getAttributes().put("selectedIndex", Integer.valueOf(selectedIndex));
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
            if (summary != null) {
                if (isValueReference(summary)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(summary));
                    _component.setValueBinding("summary", _vb);
                } else {
                    _component.getAttributes().put("summary", summary);
                }
            }
            if (tabChangeListener != null) {
                if (isValueReference(tabChangeListener)) {
                    Class[] selectionListenerArgs= new Class[]{com.icesoft.faces.component.paneltabset.TabChangeEvent.class};
                    MethodBinding _mb = getFacesContext().getApplication().createMethodBinding(ELPool.get(tabChangeListener), selectionListenerArgs );
                    _component.getAttributes().put("tabChangeListener", _mb);
                } else {
                    throw new IllegalArgumentException(tabChangeListener);
                }
            }
            if (tabPlacement != null) {
                if (isValueReference(tabPlacement)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(tabPlacement));
                    _component.setValueBinding("tabPlacement", _vb);
                } else {
                    _component.getAttributes().put("tabPlacement", tabPlacement);
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
            if (title != null) {
                if (isValueReference(title)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(title));
                    _component.setValueBinding("title", _vb);
                } else {
                    _component.getAttributes().put("title", title);
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
            if (_var != null) {
                try{
                    com.icesoft.faces.component.panelseries.UISeries paneltabset = (com.icesoft.faces.component.panelseries.UISeries)_component;
                    paneltabset.setVar(_var);
                }catch (ClassCastException cce) {
                    throw new IllegalStateException(_component.toString() + " not expected type.  Expected: com.icesoft.faces.component.panelseries.UISeries.  Perhaps you're missing a tag?");
                }
            }
            if (varStatus != null) {
                if (isValueReference(varStatus)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(varStatus));
                    _component.setValueBinding("varStatus", _vb);
                } else {
                    _component.getAttributes().put("varStatus", varStatus);
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
            if (width != null) {
                if (isValueReference(width)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(width));
                    _component.setValueBinding("width", _vb);
                } else {
                    _component.getAttributes().put("width", width);
                }
            }
            if (bodyrows != null) {
                if (isValueReference(bodyrows)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(bodyrows));
                    _component.setValueBinding("bodyrows", _vb);
                } else {
                    _component.getAttributes().put("bodyrows", bodyrows);
                }
            }
            if (captionClass != null) {
                if (isValueReference(captionClass)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(captionClass));
                    _component.setValueBinding("captionClass", _vb);
                } else {
                    _component.getAttributes().put("captionClass", captionClass);
                }
            }
            if (captionStyle != null) {
                if (isValueReference(captionStyle)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(captionStyle));
                    _component.setValueBinding("captionStyle", _vb);
                } else {
                    _component.getAttributes().put("captionStyle", captionStyle);
                }
            }
            if (columnClasses != null) {
                if (isValueReference(columnClasses)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(columnClasses));
                    _component.setValueBinding("columnClasses", _vb);
                } else {
                    _component.getAttributes().put("columnClasses", columnClasses);
                }
            }
            if (footerClass != null) {
                if (isValueReference(footerClass)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(footerClass));
                    _component.setValueBinding("footerClass", _vb);
                } else {
                    _component.getAttributes().put("footerClass", footerClass);
                }
            }
            if (headerClass != null) {
                if (isValueReference(headerClass)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(headerClass));
                    _component.setValueBinding("headerClass", _vb);
                } else {
                    _component.getAttributes().put("headerClass", headerClass);
                }
            }
            if (rowClasses != null) {
                if (isValueReference(rowClasses)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(rowClasses));
                    _component.setValueBinding("rowClasses", _vb);
                } else {
                    _component.getAttributes().put("rowClasses", rowClasses);
                }
            }
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // align
    private String align = null;
    public void setAlign(String align) {
        this.align = align;
    }

    // bgcolor
    private String bgcolor = null;
    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    // border
    private String border = null;
    public void setBorder(String border) {
        this.border = border;
    }

    // cellpadding
    private String cellpadding = null;
    public void setCellpadding(String cellpadding) {
        this.cellpadding = cellpadding;
    }

    // cellspacing
    private String cellspacing = null;
    public void setCellspacing(String cellspacing) {
        this.cellspacing = cellspacing;
    }

    // dir
    private String dir = null;
    public void setDir(String dir) {
        this.dir = dir;
    }

    // first
    private String first = null;
    public void setFirst(String first) {
        this.first = first;
    }

    // frame
    private String frame = null;
    public void setFrame(String frame) {
        this.frame = frame;
    }

    // height
    private String height = null;
    public void setHeight(String height) {
        this.height = height;
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

    // lang
    private String lang = null;
    public void setLang(String lang) {
        this.lang = lang;
    }

    // onclick
    private String onclick = null;
    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    // ondblclick
    private String ondblclick = null;
    public void setOndblclick(String ondblclick) {
        this.ondblclick = ondblclick;
    }

    // onkeydown
    private String onkeydown = null;
    public void setOnkeydown(String onkeydown) {
        this.onkeydown = onkeydown;
    }

    // onkeypress
    private String onkeypress = null;
    public void setOnkeypress(String onkeypress) {
        this.onkeypress = onkeypress;
    }

    // onkeyup
    private String onkeyup = null;
    public void setOnkeyup(String onkeyup) {
        this.onkeyup = onkeyup;
    }

    // onmousedown
    private String onmousedown = null;
    public void setOnmousedown(String onmousedown) {
        this.onmousedown = onmousedown;
    }

    // onmousemove
    private String onmousemove = null;
    public void setOnmousemove(String onmousemove) {
        this.onmousemove = onmousemove;
    }

    // onmouseout
    private String onmouseout = null;
    public void setOnmouseout(String onmouseout) {
        this.onmouseout = onmouseout;
    }

    // onmouseover
    private String onmouseover = null;
    public void setOnmouseover(String onmouseover) {
        this.onmouseover = onmouseover;
    }

    // onmouseup
    private String onmouseup = null;
    public void setOnmouseup(String onmouseup) {
        this.onmouseup = onmouseup;
    }

    // partialSubmit
    private String partialSubmit = null;
    public void setPartialSubmit(String partialSubmit) {
        this.partialSubmit = partialSubmit;
    }

    // renderedOnUserRole
    private String renderedOnUserRole = null;
    public void setRenderedOnUserRole(String renderedOnUserRole) {
        this.renderedOnUserRole = renderedOnUserRole;
    }

    // rows
    private String rows = null;
    public void setRows(String rows) {
        this.rows = rows;
    }

    // rules
    private String rules = null;
    public void setRules(String rules) {
        this.rules = rules;
    }

    // selectedIndex
    private String selectedIndex = null;
    public void setSelectedIndex(String selectedIndex) {
        this.selectedIndex = selectedIndex;
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

    // summary
    private String summary = null;
    public void setSummary(String summary) {
        this.summary = summary;
    }

    // tabChangeListener
    private String tabChangeListener = null;
    public void setTabChangeListener(String tabChangeListener) {
        this.tabChangeListener = tabChangeListener;
    }

    // tabPlacement
    private String tabPlacement = null;
    public void setTabPlacement(String tabPlacement) {
        this.tabPlacement = tabPlacement;
    }

    // tabindex
    private String tabindex = null;
    public void setTabindex(String tabindex) {
        this.tabindex = tabindex;
    }

    // title
    private String title = null;
    public void setTitle(String title) {
        this.title = title;
    }

    // value
    private String value = null;
    public void setValue(String value) {
        this.value = value;
    }

    // var
    private String _var = null;
    public void setVar(String _var) {
        this._var = _var;
    }

    // varStatus
    private String varStatus = null;
    public void setVarStatus(String varStatus) {
        this.varStatus = varStatus;
    }

    // visible
    private String visible = null;
    public void setVisible(String visible) {
        this.visible = visible;
    }

    // width
    private String width = null;
    public void setWidth(String width) {
        this.width = width;
    }

    // bodyrows
    private String bodyrows = null;
    public void setBodyrows(String bodyrows) {
        this.bodyrows = bodyrows;
    }

    // captionClass
    private String captionClass = null;
    public void setCaptionClass(String captionClass) {
        this.captionClass = captionClass;
    }

    // captionStyle
    private String captionStyle = null;
    public void setCaptionStyle(String captionStyle) {
        this.captionStyle = captionStyle;
    }

    // columnClasses
    private String columnClasses = null;
    public void setColumnClasses(String columnClasses) {
        this.columnClasses = columnClasses;
    }

    // footerClass
    private String footerClass = null;
    public void setFooterClass(String footerClass) {
        this.footerClass = footerClass;
    }

    // headerClass
    private String headerClass = null;
    public void setHeaderClass(String headerClass) {
        this.headerClass = headerClass;
    }

    // rowClasses
    private String rowClasses = null;
    public void setRowClasses(String rowClasses) {
        this.rowClasses = rowClasses;
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
