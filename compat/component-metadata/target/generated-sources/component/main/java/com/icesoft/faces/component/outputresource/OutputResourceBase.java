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
package com.icesoft.faces.component.outputresource;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * A link to resource
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class OutputResourceBase extends javax.faces.component.UIComponentBase {

    /**
     * <p>Construct a new <code>OutputResourceBase</code>.</p>
     */
    public OutputResourceBase() {
        super();
        setRendererType("com.icesoft.faces.OutputResourceRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.OutputResource";
    }

    // attachment
    private boolean attachment = false;
    private boolean attachment_set = false;

    /**
 * <p>If true, specifies that the resource should be downloaded as an attachment. See also the resource attribute.</p>
     */
    public boolean isAttachment() {
        if (this.attachment_set) {
            return this.attachment;
        }
        ValueBinding _vb = getValueBinding("attachment");
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
 * <p>If true, specifies that the resource should be downloaded as an attachment. See also the resource attribute.</p>
     * @see #isAttachment()
     */
    public void setAttachment(boolean attachment) {
        this.attachment = attachment;
        this.attachment_set = true;
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

    // fileName
    private String fileName = null;

    /**
 * <p>The file name to be used for the attachment header. If the label is not specified the file name will be used.
 *         See also the resource attribute.</p>
     */
    public String getFileName() {
        if (this.fileName != null) {
            return this.fileName;
        }
        ValueBinding _vb = getValueBinding("fileName");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The file name to be used for the attachment header. If the label is not specified the file name will be used.
 *         See also the resource attribute.</p>
     * @see #getFileName()
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
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

    // image
    private String image = null;

    /**
 * <p>The image path that will be used to display an image for link instead of text.</p>
     */
    public String getImage() {
        if (this.image != null) {
            return this.image;
        }
        ValueBinding _vb = getValueBinding("image");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The image path that will be used to display an image for link instead of text.</p>
     * @see #getImage()
     */
    public void setImage(String image) {
        this.image = image;
    }

    // label
    private String label = null;

    /**
 * <p>The label to be displayed for the resource. The label will be used for the text of the link or button. 
 * 		If an image is used, the label will be used as the alt attribute value of the image element.</p>
     */
    public String getLabel() {
        if (this.label != null) {
            return this.label;
        }
        ValueBinding _vb = getValueBinding("label");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The label to be displayed for the resource. The label will be used for the text of the link or button. 
 * 		If an image is used, the label will be used as the alt attribute value of the image element.</p>
     * @see #getLabel()
     */
    public void setLabel(String label) {
        this.label = label;
    }

    // lastModified
    private java.util.Date lastModified = null;

    /**
 * <p>The java.util.Data object specifying the last modified header that will be sent to the 
 * 		browser for this resource. See also the resource attribute.</p>
     */
    public java.util.Date getLastModified() {
        if (this.lastModified != null) {
            return this.lastModified;
        }
        ValueBinding _vb = getValueBinding("lastModified");
        if (_vb != null) {
            return (java.util.Date) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The java.util.Data object specifying the last modified header that will be sent to the 
 * 		browser for this resource. See also the resource attribute.</p>
     * @see #getLastModified()
     */
    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    // mimeType
    private String mimeType = null;

    /**
 * <p>The mime-type for the resource. If not specified, and available from the backing
 * 		Resource, the Resource's mime-type will be used. See also the resource attribute.</p>
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
 * <p>The mime-type for the resource. If not specified, and available from the backing
 * 		Resource, the Resource's mime-type will be used. See also the resource attribute.</p>
     * @see #getMimeType()
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
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

    // resource
    private com.icesoft.faces.context.Resource resource = null;

    /**
 * <p>The object of type com.icesoft.faces.context.Resource that will be used.
 *         It can be use to override the attachment, fileName, lastModified and mimeType
 *         attributes via the withOptions() method.</p>
     */
    public com.icesoft.faces.context.Resource getResource() {
        if (this.resource != null) {
            return this.resource;
        }
        ValueBinding _vb = getValueBinding("resource");
        if (_vb != null) {
            return (com.icesoft.faces.context.Resource) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The object of type com.icesoft.faces.context.Resource that will be used.
 *         It can be use to override the attachment, fileName, lastModified and mimeType
 *         attributes via the withOptions() method.</p>
     * @see #getResource()
     */
    public void setResource(com.icesoft.faces.context.Resource resource) {
        this.resource = resource;
    }

    // shared
    private boolean shared = false;
    private boolean shared_set = false;

    /**
 * <p>If true (default), specifies that the resource should be cached by the 
 *         resource registry. If cached, resources having the same signature (@see
 *         Resource.calculateDigest() ) will be registered only once, and the same
 *         response will be be provided for that resource by the ResourceServer. 
 *         Therefore, if the developer has to dynamically set any properties on 
 *         the outputResource component, and have those properties applied dynamically
 *         to individual users, then the 'shared' attribute should be set to false.</p>
     */
    public boolean isShared() {
        if (this.shared_set) {
            return this.shared;
        }
        ValueBinding _vb = getValueBinding("shared");
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
 * <p>If true (default), specifies that the resource should be cached by the 
 *         resource registry. If cached, resources having the same signature (@see
 *         Resource.calculateDigest() ) will be registered only once, and the same
 *         response will be be provided for that resource by the ResourceServer. 
 *         Therefore, if the developer has to dynamically set any properties on 
 *         the outputResource component, and have those properties applied dynamically
 *         to individual users, then the 'shared' attribute should be set to false.</p>
     * @see #isShared()
     */
    public void setShared(boolean shared) {
        this.shared = shared;
        this.shared_set = true;
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
 * 		element is rendered. This value is passed through as the "class" 
 * 		attribute on generated markup.
 * 		The base name for all style classes. Default value is <b>iceOutLnk</b>
 * 		if rendered as a link, or <b>iceCmdBtn</b> if rendered as a button.</p>
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
 * 		element is rendered. This value is passed through as the "class" 
 * 		attribute on generated markup.
 * 		The base name for all style classes. Default value is <b>iceOutLnk</b>
 * 		if rendered as a link, or <b>iceCmdBtn</b> if rendered as a button.</p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // target
    private String target = null;

    /**
 * <p>Value of the target attribute when resource is rendered as a link. Default is "_blank".</p>
     */
    public String getTarget() {
        if (this.target != null) {
            return this.target;
        }
        ValueBinding _vb = getValueBinding("target");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "_blank";
    }

    /**
 * <p>Value of the target attribute when resource is rendered as a link. Default is "_blank".</p>
     * @see #getTarget()
     */
    public void setTarget(String target) {
        this.target = target;
    }

    // type
    private String type = null;

    /**
 * <p>The type of link to render:
 * 		link (default)
 *         image: renders a link with an image (must be used with the image attribute)
 *         button: renders a button with the text from value</p>
     */
    public String getType() {
        if (this.type != null) {
            return this.type;
        }
        ValueBinding _vb = getValueBinding("type");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The type of link to render:
 * 		link (default)
 *         image: renders a link with an image (must be used with the image attribute)
 *         button: renders a button with the text from value</p>
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
        this.attachment = ((Boolean) _values[1]).booleanValue();
        this.attachment_set = ((Boolean) _values[2]).booleanValue();
        this.disabled = ((Boolean) _values[3]).booleanValue();
        this.disabled_set = ((Boolean) _values[4]).booleanValue();
        this.fileName = (String) _values[5];
        this.id = (String) _values[6];
        this.image = (String) _values[7];
        this.label = (String) _values[8];
        this.lastModified = (java.util.Date) _values[9];
        this.mimeType = (String) _values[10];
        this.rendered = ((Boolean) _values[11]).booleanValue();
        this.rendered_set = ((Boolean) _values[12]).booleanValue();
        this.renderedOnUserRole = (String) _values[13];
        this.resource = (com.icesoft.faces.context.Resource) _values[14];
        this.shared = ((Boolean) _values[15]).booleanValue();
        this.shared_set = ((Boolean) _values[16]).booleanValue();
        this.style = (String) _values[17];
        this.styleClass = (String) _values[18];
        this.target = (String) _values[19];
        this.type = (String) _values[20];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[21];
        _values[0] = super.saveState(_context);
        _values[1] = this.attachment ? Boolean.TRUE : Boolean.FALSE;
        _values[2] = this.attachment_set ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.disabled ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.disabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.fileName;
        _values[6] = this.id;
        _values[7] = this.image;
        _values[8] = this.label;
        _values[9] = this.lastModified;
        _values[10] = this.mimeType;
        _values[11] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[12] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[13] = this.renderedOnUserRole;
        _values[14] = this.resource;
        _values[15] = this.shared ? Boolean.TRUE : Boolean.FALSE;
        _values[16] = this.shared_set ? Boolean.TRUE : Boolean.FALSE;
        _values[17] = this.style;
        _values[18] = this.styleClass;
        _values[19] = this.target;
        _values[20] = this.type;
        return _values;
    }

}
