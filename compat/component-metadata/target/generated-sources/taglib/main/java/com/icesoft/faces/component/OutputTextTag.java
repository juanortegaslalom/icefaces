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

public class OutputTextTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.HtmlOutputText";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.Text";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        converter = null;
        dir = null;
        effect = null;
        escape = null;
        lang = null;
        nospan = null;
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
        renderedOnUserRole = null;
        style = null;
        styleClass = null;
        title = null;
        value = null;
        visible = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (converter != null) {
                if (isValueReference(converter)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(converter));
                    _component.setValueBinding("converter", _vb);
                } else {
                    Converter _converter = FacesContext.getCurrentInstance().
                        getApplication().createConverter(converter);
                    _component.getAttributes().put("converter", _converter);
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
            if (effect != null) {
                com.icesoft.faces.component.ext.taglib.Util.addEffect(effect, _component);
            }
            if (escape != null) {
                if (isValueReference(escape)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(escape));
                    _component.setValueBinding("escape", _vb);
                } else {
                    _component.getAttributes().put("escape", Boolean.valueOf(escape));
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
            if (nospan != null) {
                if (isValueReference(nospan)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(nospan));
                    _component.setValueBinding("nospan", _vb);
                } else {
                    _component.getAttributes().put("nospan", Boolean.valueOf(nospan));
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
            if (renderedOnUserRole != null) {
                if (isValueReference(renderedOnUserRole)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(renderedOnUserRole));
                    _component.setValueBinding("renderedOnUserRole", _vb);
                } else {
                    _component.getAttributes().put("renderedOnUserRole", renderedOnUserRole);
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
            if (visible != null) {
                if (isValueReference(visible)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(visible));
                    _component.setValueBinding("visible", _vb);
                } else {
                    _component.getAttributes().put("visible", Boolean.valueOf(visible));
                }
            }
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // converter
    private String converter = null;
    public void setConverter(String converter) {
        this.converter = converter;
    }

    // dir
    private String dir = null;
    public void setDir(String dir) {
        this.dir = dir;
    }

    // effect
    private String effect = null;
    public void setEffect(String effect) {
        this.effect = effect;
    }

    // escape
    private String escape = null;
    public void setEscape(String escape) {
        this.escape = escape;
    }

    // lang
    private String lang = null;
    public void setLang(String lang) {
        this.lang = lang;
    }

    // nospan
    private String nospan = null;
    public void setNospan(String nospan) {
        this.nospan = nospan;
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

    // renderedOnUserRole
    private String renderedOnUserRole = null;
    public void setRenderedOnUserRole(String renderedOnUserRole) {
        this.renderedOnUserRole = renderedOnUserRole;
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

    // visible
    private String visible = null;
    public void setVisible(String visible) {
        this.visible = visible;
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
