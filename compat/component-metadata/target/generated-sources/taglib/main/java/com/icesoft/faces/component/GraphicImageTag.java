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

public class GraphicImageTag extends UIComponentTag {

    /**
     * <p>Return the requested component type.</p>
     */
    public String getComponentType() {
        return "com.icesoft.faces.HtmlGraphicImage";
    }

    /**
     * <p>Return the requested renderer type.</p>
     */
    public String getRendererType() {
        return "com.icesoft.faces.Image";
    }

    /**
     * <p>Release any allocated tag handler attributes.</p>
     */
    public void release() {
        super.release();
        alt = null;
        dir = null;
        effect = null;
        height = null;
        lang = null;
        longdesc = null;
        mimeType = null;
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
        url = null;
        usemap = null;
        value = null;
        visible = null;
        width = null;
        ismap = null;
        title = null;
    }

    /**
     * <p>Transfer tag attributes to component properties.</p>
     */
    protected void setProperties(UIComponent _component) {
        try{
            super.setProperties(_component);
            if (alt != null) {
                if (isValueReference(alt)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(alt));
                    _component.setValueBinding("alt", _vb);
                } else {
                    _component.getAttributes().put("alt", alt);
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
            if (height != null) {
                if (isValueReference(height)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(height));
                    _component.setValueBinding("height", _vb);
                } else {
                    _component.getAttributes().put("height", height);
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
            if (longdesc != null) {
                if (isValueReference(longdesc)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(longdesc));
                    _component.setValueBinding("longdesc", _vb);
                } else {
                    _component.getAttributes().put("longdesc", longdesc);
                }
            }
            if (mimeType != null) {
                if (isValueReference(mimeType)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(mimeType));
                    _component.setValueBinding("mimeType", _vb);
                } else {
                    _component.getAttributes().put("mimeType", mimeType);
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
            if (url != null) {
                if (isValueReference(url)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(url));
                    _component.setValueBinding("url", _vb);
                } else {
                    _component.getAttributes().put("url", url);
                }
            }
            if (usemap != null) {
                if (isValueReference(usemap)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(usemap));
                    _component.setValueBinding("usemap", _vb);
                } else {
                    _component.getAttributes().put("usemap", usemap);
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
            if (width != null) {
                if (isValueReference(width)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(width));
                    _component.setValueBinding("width", _vb);
                } else {
                    _component.getAttributes().put("width", width);
                }
            }
            if (ismap != null) {
                if (isValueReference(ismap)) {
                    ValueBinding _vb = getFacesContext().getApplication().createValueBinding(ELPool.get(ismap));
                    _component.setValueBinding("ismap", _vb);
                } else {
                    _component.getAttributes().put("ismap", Boolean.valueOf(ismap));
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
        }catch(Exception e1){e1.printStackTrace();throw new RuntimeException(e1);}
    }

    // alt
    private String alt = null;
    public void setAlt(String alt) {
        this.alt = alt;
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

    // height
    private String height = null;
    public void setHeight(String height) {
        this.height = height;
    }

    // lang
    private String lang = null;
    public void setLang(String lang) {
        this.lang = lang;
    }

    // longdesc
    private String longdesc = null;
    public void setLongdesc(String longdesc) {
        this.longdesc = longdesc;
    }

    // mimeType
    private String mimeType = null;
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
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

    // url
    private String url = null;
    public void setUrl(String url) {
        this.url = url;
    }

    // usemap
    private String usemap = null;
    public void setUsemap(String usemap) {
        this.usemap = usemap;
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

    // width
    private String width = null;
    public void setWidth(String width) {
        this.width = width;
    }

    // ismap
    private String ismap = null;
    public void setIsmap(String ismap) {
        this.ismap = ismap;
    }

    // title
    private String title = null;
    public void setTitle(String title) {
        this.title = title;
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
