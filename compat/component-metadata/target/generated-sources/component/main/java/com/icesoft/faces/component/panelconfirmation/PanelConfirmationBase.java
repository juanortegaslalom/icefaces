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
package com.icesoft.faces.component.panelconfirmation;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Displays a confirmation dialog asking the user to confirm or to cancel the requested operation.
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class PanelConfirmationBase extends javax.faces.component.UIComponentBase {

    /**
     * <p>Construct a new <code>PanelConfirmationBase</code>.</p>
     */
    public PanelConfirmationBase() {
        super();
        setRendererType("com.icesoft.faces.PanelConfirmationRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.PanelConfirmation";
    }

    // acceptLabel
    private String acceptLabel = null;

    /**
 * <p>The text to appear on the acceptance button (default value is 'Accept').</p>
     */
    public String getAcceptLabel() {
        if (this.acceptLabel != null) {
            return this.acceptLabel;
        }
        ValueBinding _vb = getValueBinding("acceptLabel");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The text to appear on the acceptance button (default value is 'Accept').</p>
     * @see #getAcceptLabel()
     */
    public void setAcceptLabel(String acceptLabel) {
        this.acceptLabel = acceptLabel;
    }

    // autoCentre
    private boolean autoCentre = false;
    private boolean autoCentre_set = false;

    /**
 * <p>Used to keep the popup centred on the screen through scrolling
 * 		and window resizing events. Default value is 'false'.</p>
     */
    public boolean isAutoCentre() {
        if (this.autoCentre_set) {
            return this.autoCentre;
        }
        ValueBinding _vb = getValueBinding("autoCentre");
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
 * <p>Used to keep the popup centred on the screen through scrolling
 * 		and window resizing events. Default value is 'false'.</p>
     * @see #isAutoCentre()
     */
    public void setAutoCentre(boolean autoCentre) {
        this.autoCentre = autoCentre;
        this.autoCentre_set = true;
    }

    // cancelLabel
    private String cancelLabel = null;

    /**
 * <p>The text to appear on the cancellation button (default value is 'Cancel').</p>
     */
    public String getCancelLabel() {
        if (this.cancelLabel != null) {
            return this.cancelLabel;
        }
        ValueBinding _vb = getValueBinding("cancelLabel");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The text to appear on the cancellation button (default value is 'Cancel').</p>
     * @see #getCancelLabel()
     */
    public void setCancelLabel(String cancelLabel) {
        this.cancelLabel = cancelLabel;
    }

    // displayAtMouse
    private boolean displayAtMouse = false;
    private boolean displayAtMouse_set = false;

    /**
 * <p>When set to 'true' this panel will pop up near the mouse pointer position at the moment of triggering
 *         the event. It overrides the autoCentre property. Default value is 'false'.</p>
     */
    public boolean isDisplayAtMouse() {
        if (this.displayAtMouse_set) {
            return this.displayAtMouse;
        }
        ValueBinding _vb = getValueBinding("displayAtMouse");
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
 * <p>When set to 'true' this panel will pop up near the mouse pointer position at the moment of triggering
 *         the event. It overrides the autoCentre property. Default value is 'false'.</p>
     * @see #isDisplayAtMouse()
     */
    public void setDisplayAtMouse(boolean displayAtMouse) {
        this.displayAtMouse = displayAtMouse;
        this.displayAtMouse_set = true;
    }

    // draggable
    private boolean draggable = false;
    private boolean draggable_set = false;

    /**
 * <p>When set to 'true' this panel is draggable. The user will be able to drag the panel to any position 
 *         on the page. Default value is 'false'.</p>
     */
    public boolean isDraggable() {
        if (this.draggable_set) {
            return this.draggable;
        }
        ValueBinding _vb = getValueBinding("draggable");
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
 * <p>When set to 'true' this panel is draggable. The user will be able to drag the panel to any position 
 *         on the page. Default value is 'false'.</p>
     * @see #isDraggable()
     */
    public void setDraggable(boolean draggable) {
        this.draggable = draggable;
        this.draggable_set = true;
    }

    // escape
    private boolean escape = false;
    private boolean escape_set = false;

    /**
 * <p>Flag indicating that characters that are sensitive in HTML and XML 
 * 		markup must be escaped. This flag is set to "true" by default.</p>
     */
    public boolean isEscape() {
        if (this.escape_set) {
            return this.escape;
        }
        ValueBinding _vb = getValueBinding("escape");
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
 * <p>Flag indicating that characters that are sensitive in HTML and XML 
 * 		markup must be escaped. This flag is set to "true" by default.</p>
     * @see #isEscape()
     */
    public void setEscape(boolean escape) {
        this.escape = escape;
        this.escape_set = true;
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

    // message
    private String message = null;

    /**
 * <p>The text to appear in the body of the popup.</p>
     */
    public String getMessage() {
        if (this.message != null) {
            return this.message;
        }
        ValueBinding _vb = getValueBinding("message");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The text to appear in the body of the popup.</p>
     * @see #getMessage()
     */
    public void setMessage(String message) {
        this.message = message;
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

    // title
    private String title = null;

    /**
 * <p>The text of the popup header.</p>
     */
    public String getTitle() {
        if (this.title != null) {
            return this.title;
        }
        ValueBinding _vb = getValueBinding("title");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The text of the popup header.</p>
     * @see #getTitle()
     */
    public void setTitle(String title) {
        this.title = title;
    }

    // type
    private String type = null;

    /**
 * <p>
 * 		The type of confirmation dialog (buttons that will be
 *         displayed in the popup). Possible values are:
 * 		</p>
 *         <ul>
 *             <li><strong>acceptOnly</strong> - Will only display accept button.</li>
 *             <li><strong>cancelOnly</strong> - Will only display cancel button.</li>
 *             <li><strong>normal</strong> - Will only display both buttons.</li>
 *         </ul>
 *         <p>Default value is <strong>normal</strong>.
     */
    public String getType() {
        if (this.type != null) {
            return this.type;
        }
        ValueBinding _vb = getValueBinding("type");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "normal";
    }

    /**
 * <p>
 * 		The type of confirmation dialog (buttons that will be
 *         displayed in the popup). Possible values are:
 * 		</p>
 *         <ul>
 *             <li><strong>acceptOnly</strong> - Will only display accept button.</li>
 *             <li><strong>cancelOnly</strong> - Will only display cancel button.</li>
 *             <li><strong>normal</strong> - Will only display both buttons.</li>
 *         </ul>
 *         <p>Default value is <strong>normal</strong>.
     * @see #getType()
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.acceptLabel = (String) _values[1];
        this.autoCentre = ((Boolean) _values[2]).booleanValue();
        this.autoCentre_set = ((Boolean) _values[3]).booleanValue();
        this.cancelLabel = (String) _values[4];
        this.displayAtMouse = ((Boolean) _values[5]).booleanValue();
        this.displayAtMouse_set = ((Boolean) _values[6]).booleanValue();
        this.draggable = ((Boolean) _values[7]).booleanValue();
        this.draggable_set = ((Boolean) _values[8]).booleanValue();
        this.escape = ((Boolean) _values[9]).booleanValue();
        this.escape_set = ((Boolean) _values[10]).booleanValue();
        this.id = (String) _values[11];
        this.message = (String) _values[12];
        this.rendered = ((Boolean) _values[13]).booleanValue();
        this.rendered_set = ((Boolean) _values[14]).booleanValue();
        this.style = (String) _values[15];
        this.styleClass = (String) _values[16];
        this.title = (String) _values[17];
        this.type = (String) _values[18];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[19];
        _values[0] = super.saveState(_context);
        _values[1] = this.acceptLabel;
        _values[2] = this.autoCentre ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.autoCentre_set ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.cancelLabel;
        _values[5] = this.displayAtMouse ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.displayAtMouse_set ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.draggable ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.draggable_set ? Boolean.TRUE : Boolean.FALSE;
        _values[9] = this.escape ? Boolean.TRUE : Boolean.FALSE;
        _values[10] = this.escape_set ? Boolean.TRUE : Boolean.FALSE;
        _values[11] = this.id;
        _values[12] = this.message;
        _values[13] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[14] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[15] = this.style;
        _values[16] = this.styleClass;
        _values[17] = this.title;
        _values[18] = this.type;
        return _values;
    }

}
