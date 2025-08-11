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
 * An image or icon
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class HtmlGraphicImageBase extends javax.faces.component.html.HtmlGraphicImage {

    /**
     * <p>Construct a new <code>HtmlGraphicImageBase</code>.</p>
     */
    public HtmlGraphicImageBase() {
        super();
        setRendererType("com.icesoft.faces.Image");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Graphic";
    }

    // alt
    private String alt = null;

    /**
 * <p>Alternate textual description of the element rendered by this component.</p>
     */
    public String getAlt() {
        if (this.alt != null) {
            return this.alt;
        }
        ValueBinding _vb = getValueBinding("alt");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Alternate textual description of the element rendered by this component.</p>
     * @see #getAlt()
     */
    public void setAlt(String alt) {
        this.alt = alt;
    }

    // dir
    private String dir = null;

    /**
 * <p>Direction indication for text that does not inherit directionality.
 * 			  Valid values are "LTR" (left-to-right) and "RTL" (right-to-left).</p>
     */
    public String getDir() {
        if (this.dir != null) {
            return this.dir;
        }
        ValueBinding _vb = getValueBinding("dir");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Direction indication for text that does not inherit directionality.
 * 			  Valid values are "LTR" (left-to-right) and "RTL" (right-to-left).</p>
     * @see #getDir()
     */
    public void setDir(String dir) {
        this.dir = dir;
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

    // height
    private String height = null;

    /**
 * <p>Override for the height of this image.</p>
     */
    public String getHeight() {
        if (this.height != null) {
            return this.height;
        }
        ValueBinding _vb = getValueBinding("height");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Override for the height of this image.</p>
     * @see #getHeight()
     */
    public void setHeight(String height) {
        this.height = height;
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

    // lang
    private String lang = null;

    /**
 * <p>Code describing the language used in the generated markup for this 
 * 		component.</p>
     */
    public String getLang() {
        if (this.lang != null) {
            return this.lang;
        }
        ValueBinding _vb = getValueBinding("lang");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Code describing the language used in the generated markup for this 
 * 		component.</p>
     * @see #getLang()
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    // longdesc
    private String longdesc = null;

    /**
 * <p>URI to a long description of the image represented by this element.</p>
     */
    public String getLongdesc() {
        if (this.longdesc != null) {
            return this.longdesc;
        }
        ValueBinding _vb = getValueBinding("longdesc");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>URI to a long description of the image represented by this element.</p>
     * @see #getLongdesc()
     */
    public void setLongdesc(String longdesc) {
        this.longdesc = longdesc;
    }

    // mimeType
    private String mimeType = null;

    /**
 * <p>The MIME type of the image that is rendered dynamically (by means of a 
 * 		byte array) by this element.</p>
     */
    public String getMimeType() {
        if (this.mimeType != null) {
            return this.mimeType;
        }
        ValueBinding _vb = getValueBinding("mimeType");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The MIME type of the image that is rendered dynamically (by means of a 
 * 		byte array) by this element.</p>
     * @see #getMimeType()
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
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
 * <p>Space-separated list of CSS style class(es) to be applied when this 
 * 		element is rendered. This value must be passed through as the "class" 
 * 		attribute on generated markup.<br/>
 * 		The default class rendered as <b>iceGphImg</b></p>
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
 * 		element is rendered. This value must be passed through as the "class" 
 * 		attribute on generated markup.<br/>
 * 		The default class rendered as <b>iceGphImg</b></p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // url
    private String url = null;

    /**
 * <p>Context-relative URL to retrieve the resource associated with
 *               this component.  This is an alias for the "value" property.</p>
     */
    public String getUrl() {
        if (this.url != null) {
            return this.url;
        }
        ValueBinding _vb = getValueBinding("url");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Context-relative URL to retrieve the resource associated with
 *               this component.  This is an alias for the "value" property.</p>
     * @see #getUrl()
     */
    public void setUrl(String url) {
        this.url = url;
    }

    // usemap
    private String usemap = null;

    /**
 * <p>The name of a client side image map (an HTML "map" element) for which 
 * 		this element provides the image.</p>
     */
    public String getUsemap() {
        if (this.usemap != null) {
            return this.usemap;
        }
        ValueBinding _vb = getValueBinding("usemap");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The name of a client side image map (an HTML "map" element) for which 
 * 		this element provides the image.</p>
     * @see #getUsemap()
     */
    public void setUsemap(String usemap) {
        this.usemap = usemap;
    }

    // value
    private String value = null;

    /**
 * <p>The value of this component can be set to one of the following type:
 *           <ul>
 *             <li>String</li>
 *             <li>byte[]</li>
 *             <li>com.icesoft.faces.context.Resource
 *                  <ul>
 *                     <li>com.icesoft.faces.context.JarResource</li>
 *                     <li>com.icesoft.faces.context.FileResource</li>
 *                     <li>com.icesoft.faces.context.ByteArrayResource</li>
 *                  </ul>
 *             </li>
 *           </ul></p>
     */
    public String getValue() {
        if (this.value != null) {
            return this.value;
        }
        ValueBinding _vb = getValueBinding("value");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The value of this component can be set to one of the following type:
 *           <ul>
 *             <li>String</li>
 *             <li>byte[]</li>
 *             <li>com.icesoft.faces.context.Resource
 *                  <ul>
 *                     <li>com.icesoft.faces.context.JarResource</li>
 *                     <li>com.icesoft.faces.context.FileResource</li>
 *                     <li>com.icesoft.faces.context.ByteArrayResource</li>
 *                  </ul>
 *             </li>
 *           </ul></p>
     * @see #getValue()
     */
    public void setValue(String value) {
        this.value = value;
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

    // width
    private String width = null;

    /**
 * <p>Override for the width of this image.</p>
     */
    public String getWidth() {
        if (this.width != null) {
            return this.width;
        }
        ValueBinding _vb = getValueBinding("width");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Override for the width of this image.</p>
     * @see #getWidth()
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.alt = (String) _values[1];
        this.dir = (String) _values[2];
        this.effect = (com.icesoft.faces.context.effects.Effect) _values[3];
        this.height = (String) _values[4];
        this.id = (String) _values[5];
        this.lang = (String) _values[6];
        this.longdesc = (String) _values[7];
        this.mimeType = (String) _values[8];
        this.onclick = (String) _values[9];
        this.onclickeffect = (com.icesoft.faces.context.effects.Effect) _values[10];
        this.ondblclick = (String) _values[11];
        this.ondblclickeffect = (com.icesoft.faces.context.effects.Effect) _values[12];
        this.onkeydown = (String) _values[13];
        this.onkeydowneffect = (com.icesoft.faces.context.effects.Effect) _values[14];
        this.onkeypress = (String) _values[15];
        this.onkeypresseffect = (com.icesoft.faces.context.effects.Effect) _values[16];
        this.onkeyup = (String) _values[17];
        this.onkeyupeffect = (com.icesoft.faces.context.effects.Effect) _values[18];
        this.onmousedown = (String) _values[19];
        this.onmousedowneffect = (com.icesoft.faces.context.effects.Effect) _values[20];
        this.onmousemove = (String) _values[21];
        this.onmousemoveeffect = (com.icesoft.faces.context.effects.Effect) _values[22];
        this.onmouseout = (String) _values[23];
        this.onmouseouteffect = (com.icesoft.faces.context.effects.Effect) _values[24];
        this.onmouseover = (String) _values[25];
        this.onmouseovereffect = (com.icesoft.faces.context.effects.Effect) _values[26];
        this.onmouseup = (String) _values[27];
        this.onmouseupeffect = (com.icesoft.faces.context.effects.Effect) _values[28];
        this.rendered = ((Boolean) _values[29]).booleanValue();
        this.rendered_set = ((Boolean) _values[30]).booleanValue();
        this.renderedOnUserRole = (String) _values[31];
        this.style = (String) _values[32];
        this.styleClass = (String) _values[33];
        this.url = (String) _values[34];
        this.usemap = (String) _values[35];
        this.value = (String) _values[36];
        this.visible = ((Boolean) _values[37]).booleanValue();
        this.visible_set = ((Boolean) _values[38]).booleanValue();
        this.width = (String) _values[39];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[40];
        _values[0] = super.saveState(_context);
        _values[1] = this.alt;
        _values[2] = this.dir;
        _values[3] = this.effect;
        _values[4] = this.height;
        _values[5] = this.id;
        _values[6] = this.lang;
        _values[7] = this.longdesc;
        _values[8] = this.mimeType;
        _values[9] = this.onclick;
        _values[10] = this.onclickeffect;
        _values[11] = this.ondblclick;
        _values[12] = this.ondblclickeffect;
        _values[13] = this.onkeydown;
        _values[14] = this.onkeydowneffect;
        _values[15] = this.onkeypress;
        _values[16] = this.onkeypresseffect;
        _values[17] = this.onkeyup;
        _values[18] = this.onkeyupeffect;
        _values[19] = this.onmousedown;
        _values[20] = this.onmousedowneffect;
        _values[21] = this.onmousemove;
        _values[22] = this.onmousemoveeffect;
        _values[23] = this.onmouseout;
        _values[24] = this.onmouseouteffect;
        _values[25] = this.onmouseover;
        _values[26] = this.onmouseovereffect;
        _values[27] = this.onmouseup;
        _values[28] = this.onmouseupeffect;
        _values[29] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[30] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[31] = this.renderedOnUserRole;
        _values[32] = this.style;
        _values[33] = this.styleClass;
        _values[34] = this.url;
        _values[35] = this.usemap;
        _values[36] = this.value;
        _values[37] = this.visible ? Boolean.TRUE : Boolean.FALSE;
        _values[38] = this.visible_set ? Boolean.TRUE : Boolean.FALSE;
        _values[39] = this.width;
        return _values;
    }

}
