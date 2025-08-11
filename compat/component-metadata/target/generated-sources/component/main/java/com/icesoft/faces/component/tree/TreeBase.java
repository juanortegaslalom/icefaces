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
package com.icesoft.faces.component.tree;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Provides a hierarchical tree view of expandable/collapsible Tree Nodes
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class TreeBase extends javax.faces.component.UICommand {

    /**
     * <p>Construct a new <code>TreeBase</code>.</p>
     */
    public TreeBase() {
        super();
        setRendererType("com.icesoft.faces.View");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.TreeView";
    }

    // action
    private javax.faces.el.MethodBinding action = null;

    /**
 * <p>MethodBinding representing the application action to invoke when
 * 		this component is activated by the user. The expression must
 * 		evaluate to a either a String or a public method that takes no
 * 		parameters, and returns a String (the logical outcome) which is
 * 		passed to the NavigationHandler for this application.</p>
     */
    public javax.faces.el.MethodBinding getAction() {
        if (this.action != null) {
            return this.action;
        }
        ValueBinding _vb = getValueBinding("action");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>MethodBinding representing the application action to invoke when
 * 		this component is activated by the user. The expression must
 * 		evaluate to a either a String or a public method that takes no
 * 		parameters, and returns a String (the logical outcome) which is
 * 		passed to the NavigationHandler for this application.</p>
     * @see #getAction()
     */
    public void setAction(javax.faces.el.MethodBinding action) {
        this.action = action;
    }

    // actionListener
    private javax.faces.el.MethodBinding actionListener = null;

    /**
 * <p>MethodBinding representing an action listener method that will be 
 * 		notified when this component is activated by the user. The expression 
 * 		must evaluate to a public method that takes an ActionEvent parameter, 
 * 		with a return type of void.</p>
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
 * 		notified when this component is activated by the user. The expression 
 * 		must evaluate to a public method that takes an ActionEvent parameter, 
 * 		with a return type of void.</p>
     * @see #getActionListener()
     */
    public void setActionListener(javax.faces.el.MethodBinding actionListener) {
        this.actionListener = actionListener;
    }

    // documentImage
    private String documentImage = null;

    public String getDocumentImage() {
        if (this.documentImage != null) {
            return this.documentImage;
        }
        ValueBinding _vb = getValueBinding("documentImage");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setDocumentImage(String documentImage) {
        this.documentImage = documentImage;
    }

    // folderImage
    private String folderImage = null;

    public String getFolderImage() {
        if (this.folderImage != null) {
            return this.folderImage;
        }
        ValueBinding _vb = getValueBinding("folderImage");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setFolderImage(String folderImage) {
        this.folderImage = folderImage;
    }

    // folderOpenImage
    private String folderOpenImage = null;

    public String getFolderOpenImage() {
        if (this.folderOpenImage != null) {
            return this.folderOpenImage;
        }
        ValueBinding _vb = getValueBinding("folderOpenImage");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setFolderOpenImage(String folderOpenImage) {
        this.folderOpenImage = folderOpenImage;
    }

    // hideNavigation
    private String hideNavigation = null;

    /**
 * <p>Declares whether the navigation links will be rendered. Valid
 *         values are true and false.</p>
     */
    public String getHideNavigation() {
        if (this.hideNavigation != null) {
            return this.hideNavigation;
        }
        ValueBinding _vb = getValueBinding("hideNavigation");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "false";
    }

    /**
 * <p>Declares whether the navigation links will be rendered. Valid
 *         values are true and false.</p>
     * @see #getHideNavigation()
     */
    public void setHideNavigation(String hideNavigation) {
        this.hideNavigation = hideNavigation;
    }

    // hideRootNode
    private String hideRootNode = null;

    /**
 * <p>Declares whether the root tree node will be rendered. Valid
 *         values are true and false.</p>
     */
    public String getHideRootNode() {
        if (this.hideRootNode != null) {
            return this.hideRootNode;
        }
        ValueBinding _vb = getValueBinding("hideRootNode");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "false";
    }

    /**
 * <p>Declares whether the root tree node will be rendered. Valid
 *         values are true and false.</p>
     * @see #getHideRootNode()
     */
    public void setHideRootNode(String hideRootNode) {
        this.hideRootNode = hideRootNode;
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

    // imageDir
    private String imageDir = null;

    /**
 * <p>Set directory for location of the tree images.</p>
     */
    public String getImageDir() {
        if (this.imageDir != null) {
            return this.imageDir;
        }
        ValueBinding _vb = getValueBinding("imageDir");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Set directory for location of the tree images.</p>
     * @see #getImageDir()
     */
    public void setImageDir(String imageDir) {
        this.imageDir = imageDir;
    }

    // immediate
    private boolean immediate = false;
    private boolean immediate_set = false;

    /**
 * <p>Flag indicating that this component's value must be converted
 * 		and validated immediately (that is, during Apply Request Values
 * 		phase), rather than waiting until Process Validations phase.</p>
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
 * <p>Flag indicating that this component's value must be converted
 * 		and validated immediately (that is, during Apply Request Values
 * 		phase), rather than waiting until Process Validations phase.</p>
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
 * <p>Enables keyboard support, default value is true.</p>
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
 * <p>Enables keyboard support, default value is true.</p>
     * @see #isKeyboardNavigationEnabled()
     */
    public void setKeyboardNavigationEnabled(boolean keyboardNavigationEnabled) {
        this.keyboardNavigationEnabled = keyboardNavigationEnabled;
        this.keyboardNavigationEnabled_set = true;
    }

    // navCloseTop
    private String navCloseTop = null;

    public String getNavCloseTop() {
        if (this.navCloseTop != null) {
            return this.navCloseTop;
        }
        ValueBinding _vb = getValueBinding("navCloseTop");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    public void setNavCloseTop(String navCloseTop) {
        this.navCloseTop = navCloseTop;
    }

    // navOpenTop
    private String navOpenTop = null;

    /**
 * <p>Name of the image that overrides the default image.</p>
     */
    public String getNavOpenTop() {
        if (this.navOpenTop != null) {
            return this.navOpenTop;
        }
        ValueBinding _vb = getValueBinding("navOpenTop");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Name of the image that overrides the default image.</p>
     * @see #getNavOpenTop()
     */
    public void setNavOpenTop(String navOpenTop) {
        this.navOpenTop = navOpenTop;
    }

    // navOpenTopNoSiblings
    private String navOpenTopNoSiblings = null;

    /**
 * <p>Name of the image that overrides the default image.</p>
     */
    public String getNavOpenTopNoSiblings() {
        if (this.navOpenTopNoSiblings != null) {
            return this.navOpenTopNoSiblings;
        }
        ValueBinding _vb = getValueBinding("navOpenTopNoSiblings");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Name of the image that overrides the default image.</p>
     * @see #getNavOpenTopNoSiblings()
     */
    public void setNavOpenTopNoSiblings(String navOpenTopNoSiblings) {
        this.navOpenTopNoSiblings = navOpenTopNoSiblings;
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
 * <p>
 * 		Space-separated list of CSS style class(es) to be applied when this 
 * 		element is rendered. This value must be passed through as the "class" 
 * 		attribute on generated markup.
 * 		</p>
 *         <p>Defines the base class name for all style classes.
 *         Default value is <b>iceTree</b></p>
 *               </p><ul>
 *                 <li>iceTree</li>
 *                 <li>iceTreeRow</li>
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
 * 		Space-separated list of CSS style class(es) to be applied when this 
 * 		element is rendered. This value must be passed through as the "class" 
 * 		attribute on generated markup.
 * 		</p>
 *         <p>Defines the base class name for all style classes.
 *         Default value is <b>iceTree</b></p>
 *               </p><ul>
 *                 <li>iceTree</li>
 *                 <li>iceTreeRow</li>
 *               </ul>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // value
    private Object value = null;

    /**
 * <p>Sets the component's model value, which must be a JSF value binding expression 
 *         to an implementation of the "javax.swing.tree.TreeModel" interface.</p>
     */
    public Object getValue() {
        if (this.value != null) {
            return this.value;
        }
        ValueBinding _vb = getValueBinding("value");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Sets the component's model value, which must be a JSF value binding expression 
 *         to an implementation of the "javax.swing.tree.TreeModel" interface.</p>
     * @see #getValue()
     */
    public void setValue(Object value) {
        this.value = value;
    }

    // var
    private String _var = null;

    /**
 * <p>Name of a request-scope attribute under which the model data for
 *         the row selected by the current value of the "rowIndex" property
 *         (i.e. also the current value of the "rowData" property) will be
 *         exposed.</p>
     */
    public String getVar() {
        if (this._var != null) {
            return this._var;
        }
        ValueBinding _vb = getValueBinding("var");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Name of a request-scope attribute under which the model data for
 *         the row selected by the current value of the "rowIndex" property
 *         (i.e. also the current value of the "rowData" property) will be
 *         exposed.</p>
     * @see #getVar()
     */
    public void setVar(String _var) {
        this._var = _var;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.action = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[1]);
        this.actionListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[2]);
        this.documentImage = (String) _values[3];
        this.folderImage = (String) _values[4];
        this.folderOpenImage = (String) _values[5];
        this.hideNavigation = (String) _values[6];
        this.hideRootNode = (String) _values[7];
        this.id = (String) _values[8];
        this.imageDir = (String) _values[9];
        this.immediate = ((Boolean) _values[10]).booleanValue();
        this.immediate_set = ((Boolean) _values[11]).booleanValue();
        this.keyboardNavigationEnabled = ((Boolean) _values[12]).booleanValue();
        this.keyboardNavigationEnabled_set = ((Boolean) _values[13]).booleanValue();
        this.navCloseTop = (String) _values[14];
        this.navOpenTop = (String) _values[15];
        this.navOpenTopNoSiblings = (String) _values[16];
        this.rendered = ((Boolean) _values[17]).booleanValue();
        this.rendered_set = ((Boolean) _values[18]).booleanValue();
        this.style = (String) _values[19];
        this.styleClass = (String) _values[20];
        this.value = (Object) _values[21];
        this._var = (String) _values[22];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[23];
        _values[0] = super.saveState(_context);
        _values[1] = saveAttachedState(_context, action);
        _values[2] = saveAttachedState(_context, actionListener);
        _values[3] = this.documentImage;
        _values[4] = this.folderImage;
        _values[5] = this.folderOpenImage;
        _values[6] = this.hideNavigation;
        _values[7] = this.hideRootNode;
        _values[8] = this.id;
        _values[9] = this.imageDir;
        _values[10] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[11] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[12] = this.keyboardNavigationEnabled ? Boolean.TRUE : Boolean.FALSE;
        _values[13] = this.keyboardNavigationEnabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[14] = this.navCloseTop;
        _values[15] = this.navOpenTop;
        _values[16] = this.navOpenTopNoSiblings;
        _values[17] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[18] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[19] = this.style;
        _values[20] = this.styleClass;
        _values[21] = this.value;
        _values[22] = this._var;
        return _values;
    }

}
