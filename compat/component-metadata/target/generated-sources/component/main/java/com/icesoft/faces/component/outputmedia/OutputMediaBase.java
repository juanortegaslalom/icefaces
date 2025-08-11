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
package com.icesoft.faces.component.outputmedia;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Media object component.
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class OutputMediaBase extends javax.faces.component.UIComponentBase {

    /**
     * <p>Construct a new <code>OutputMediaBase</code>.</p>
     */
    public OutputMediaBase() {
        super();
        setRendererType("com.icesoft.faces.OutputMedia");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.OutputMedia";
    }

    // codebase
    private String codebase = null;

    /**
 * <p>Overrides default codebase set by the player attribute.</p>
     */
    public String getCodebase() {
        if (this.codebase != null) {
            return this.codebase;
        }
        ValueBinding _vb = getValueBinding("codebase");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Overrides default codebase set by the player attribute.</p>
     * @see #getCodebase()
     */
    public void setCodebase(String codebase) {
        this.codebase = codebase;
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

    // mimeType
    private String mimeType = null;

    /**
 * <p>MIME type of the media data. If not specified, the browser will try to determine
 *         the MIME type based on the media source file extension.</p>
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
 * <p>MIME type of the media data. If not specified, the browser will try to determine
 *         the MIME type based on the media source file extension.</p>
     * @see #getMimeType()
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    // player
    private String player = null;

    /**
 * <p>"windows", "flash", "quicktime" or "real". This sets the default values for the
 *         object tag's classid and codebase attributes and param name used to specify
 *         the URL of the media data object. It also sets the default value for the embed
 *         tag's pluginspage attribute.</p>
     */
    public String getPlayer() {
        if (this.player != null) {
            return this.player;
        }
        ValueBinding _vb = getValueBinding("player");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>"windows", "flash", "quicktime" or "real". This sets the default values for the
 *         object tag's classid and codebase attributes and param name used to specify
 *         the URL of the media data object. It also sets the default value for the embed
 *         tag's pluginspage attribute.</p>
     * @see #getPlayer()
     */
    public void setPlayer(String player) {
        this.player = player;
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

    // source
    private String source = null;

    /**
 * <p>URL of the media data object. Relative URL is relative to the current web page.</p>
     */
    public String getSource() {
        if (this.source != null) {
            return this.source;
        }
        ValueBinding _vb = getValueBinding("source");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>URL of the media data object. Relative URL is relative to the current web page.</p>
     * @see #getSource()
     */
    public void setSource(String source) {
        this.source = source;
    }

    // standbyText
    private String standbyText = null;

    /**
 * <p>Message displayed while loading the media data.</p>
     */
    public String getStandbyText() {
        if (this.standbyText != null) {
            return this.standbyText;
        }
        ValueBinding _vb = getValueBinding("standbyText");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Message displayed while loading the media data.</p>
     * @see #getStandbyText()
     */
    public void setStandbyText(String standbyText) {
        this.standbyText = standbyText;
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
 * <p>Space-separated list of CSS style class(es) to be applied when
 * 		this element is rendered. This value must be passed through as
 * 		the "class" attribute on generated markup.</p>
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
 * <p>Space-separated list of CSS style class(es) to be applied when
 * 		this element is rendered. This value must be passed through as
 * 		the "class" attribute on generated markup.</p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.codebase = (String) _values[1];
        this.id = (String) _values[2];
        this.mimeType = (String) _values[3];
        this.player = (String) _values[4];
        this.rendered = ((Boolean) _values[5]).booleanValue();
        this.rendered_set = ((Boolean) _values[6]).booleanValue();
        this.renderedOnUserRole = (String) _values[7];
        this.source = (String) _values[8];
        this.standbyText = (String) _values[9];
        this.style = (String) _values[10];
        this.styleClass = (String) _values[11];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[12];
        _values[0] = super.saveState(_context);
        _values[1] = this.codebase;
        _values[2] = this.id;
        _values[3] = this.mimeType;
        _values[4] = this.player;
        _values[5] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.renderedOnUserRole;
        _values[8] = this.source;
        _values[9] = this.standbyText;
        _values[10] = this.style;
        _values[11] = this.styleClass;
        return _values;
    }

}
