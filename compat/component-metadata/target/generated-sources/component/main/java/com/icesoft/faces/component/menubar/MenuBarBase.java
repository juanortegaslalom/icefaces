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
package com.icesoft.faces.component.menubar;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * A menu bar providing popup nested child menus
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class MenuBarBase extends javax.faces.component.UICommand {

    /**
     * <p>Construct a new <code>MenuBarBase</code>.</p>
     */
    public MenuBarBase() {
        super();
        setRendererType("com.icesoft.faces.View");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.Menu";
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

    // displayOnClick
    private boolean displayOnClick = false;
    private boolean displayOnClick_set = false;

    /**
 * <p>
 *         By default the sub menus are being displayed on the hover event. which
 *         can be replaced with the click event by setting this attribute to true.</p>
     */
    public boolean isDisplayOnClick() {
        if (this.displayOnClick_set) {
            return this.displayOnClick;
        }
        ValueBinding _vb = getValueBinding("displayOnClick");
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
 * <p>
 *         By default the sub menus are being displayed on the hover event. which
 *         can be replaced with the click event by setting this attribute to true.</p>
     * @see #isDisplayOnClick()
     */
    public void setDisplayOnClick(boolean displayOnClick) {
        this.displayOnClick = displayOnClick;
        this.displayOnClick_set = true;
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
 * <p>Set directory for location of the tree images.
 *             Default directory is /xmlhttp/css/xp/css-images/ which is include in the icefaces.jar.</p>
     */
    public String getImageDir() {
        if (this.imageDir != null) {
            return this.imageDir;
        }
        ValueBinding _vb = getValueBinding("imageDir");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "/xmlhttp/css/xp/css-images/";
    }

    /**
 * <p>Set directory for location of the tree images.
 *             Default directory is /xmlhttp/css/xp/css-images/ which is include in the icefaces.jar.</p>
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

    // noIcons
    private String noIcons = null;

    /**
 * <p>If true, this component will not rendered icons and icon spacers in menuItems.
 *         The default is false. By default icons are rendered.</p>
     */
    public String getNoIcons() {
        if (this.noIcons != null) {
            return this.noIcons;
        }
        ValueBinding _vb = getValueBinding("noIcons");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "false";
    }

    /**
 * <p>If true, this component will not rendered icons and icon spacers in menuItems.
 *         The default is false. By default icons are rendered.</p>
     * @see #getNoIcons()
     */
    public void setNoIcons(String noIcons) {
        this.noIcons = noIcons;
    }

    // orientation
    private String orientation = null;

    /**
 * <p>Defines the orientation of the top-level menu items, whether they 
 *         are layed out in a horizontal or vertical fashion. When horizontal,
 *         sub menus appear below, and when vertical they appear to the side. 
 *         The default is horizontal.</p>
     */
    public String getOrientation() {
        if (this.orientation != null) {
            return this.orientation;
        }
        ValueBinding _vb = getValueBinding("orientation");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "horizontal";
    }

    /**
 * <p>Defines the orientation of the top-level menu items, whether they 
 *         are layed out in a horizontal or vertical fashion. When horizontal,
 *         sub menus appear below, and when vertical they appear to the side. 
 *         The default is horizontal.</p>
     * @see #getOrientation()
     */
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    // rendered
    private boolean rendered = false;
    private boolean rendered_set = false;

    /**
 * <p>Flag indicating whether or not this component should be rendered
 *             (during Render Response Phase), or processed on any subsequent form
 *             submit.</p>
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
 *             (during Render Response Phase), or processed on any subsequent form
 *             submit.</p>
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

    // scrollableDivMode
    private boolean scrollableDivMode = false;
    private boolean scrollableDivMode_set = false;

    /**
 * <p>
 *         By default (false) the sub menus positions are adjusted properly when in scrollable browser window.
 *         When set to true, sub menus positions are adjusetd in scrollable divs but not in scrollable browser window.</p>
     */
    public boolean isScrollableDivMode() {
        if (this.scrollableDivMode_set) {
            return this.scrollableDivMode;
        }
        ValueBinding _vb = getValueBinding("scrollableDivMode");
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
 * <p>
 *         By default (false) the sub menus positions are adjusted properly when in scrollable browser window.
 *         When set to true, sub menus positions are adjusetd in scrollable divs but not in scrollable browser window.</p>
     * @see #isScrollableDivMode()
     */
    public void setScrollableDivMode(boolean scrollableDivMode) {
        this.scrollableDivMode = scrollableDivMode;
        this.scrollableDivMode_set = true;
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
 *               element is rendered. This value must be passed through as the 
 *               "class" attribute on generated markup.<br/>
 *               The base name for all style classes. Default value is <b>iceMnuBar</b></p>
 *               if enabled + horizontal
 *               <ul>
 *                 <li>iceMnuBar</li>
 *                 <li>iceMnuBarItem</li>
 *                 <li>iceMnuBarItemLabel</li>
 *                 <li>iceMnuBarItemImage</li>                
 *                 <li>iceMnuBarSubMenu</li>
 *                 <li>iceMnuBarSubMenuInd</li>
 *               </ul>
 *               if enabled + vertical
 *               <ul>                
 *                 <li>iceMnuBarVrt</li>
 *                 <li>iceMnuBarVrtItem</li>
 *                 <li>iceMnuBarVrtItemLabel</li>
 *                 <li>iceMnuBarVrtItemImage</li>
 *                 <li>iceMnuBarVrtSubMenu</li>
 *                 <li>iceMnuBarVrtSubMenuInd</li>
 *               </ul>   
 *               if disabled + horizontal
 *               <ul>
 *                 <li>iceMnuBar-dis</li>
 *                 <li>iceMnuBarItem-dis</li>
 *                 <li>iceMnuBarItemLabel-dis</li>
 *                 <li>iceMnuBarItemImage-dis</li>
 *                 <li>iceMnuBarSubMenu-dis</li>
 *                 <li>iceMnuBarSubMenuInd-dis</li>
 *               </ul>
 *               if disabled + vertical
 *               <ul>                
 *                 <li>iceMnuBarVrt-dis</li>
 *                 <li>iceMnuBarVrtItem-dis</li>
 *                 <li>iceMnuBarVrtItemLabel-dis</li>
 *                 <li>iceMnuBarVrtItemImage-dis</li>                
 *                 <li>iceMnuBarVrtSubMenu-dis</li>
 *                 <li>iceMnuBarVrtSubMenuInd-dis</li>
 *               </ul></p>
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
 *               element is rendered. This value must be passed through as the 
 *               "class" attribute on generated markup.<br/>
 *               The base name for all style classes. Default value is <b>iceMnuBar</b></p>
 *               if enabled + horizontal
 *               <ul>
 *                 <li>iceMnuBar</li>
 *                 <li>iceMnuBarItem</li>
 *                 <li>iceMnuBarItemLabel</li>
 *                 <li>iceMnuBarItemImage</li>                
 *                 <li>iceMnuBarSubMenu</li>
 *                 <li>iceMnuBarSubMenuInd</li>
 *               </ul>
 *               if enabled + vertical
 *               <ul>                
 *                 <li>iceMnuBarVrt</li>
 *                 <li>iceMnuBarVrtItem</li>
 *                 <li>iceMnuBarVrtItemLabel</li>
 *                 <li>iceMnuBarVrtItemImage</li>
 *                 <li>iceMnuBarVrtSubMenu</li>
 *                 <li>iceMnuBarVrtSubMenuInd</li>
 *               </ul>   
 *               if disabled + horizontal
 *               <ul>
 *                 <li>iceMnuBar-dis</li>
 *                 <li>iceMnuBarItem-dis</li>
 *                 <li>iceMnuBarItemLabel-dis</li>
 *                 <li>iceMnuBarItemImage-dis</li>
 *                 <li>iceMnuBarSubMenu-dis</li>
 *                 <li>iceMnuBarSubMenuInd-dis</li>
 *               </ul>
 *               if disabled + vertical
 *               <ul>                
 *                 <li>iceMnuBarVrt-dis</li>
 *                 <li>iceMnuBarVrtItem-dis</li>
 *                 <li>iceMnuBarVrtItemLabel-dis</li>
 *                 <li>iceMnuBarVrtItemImage-dis</li>                
 *                 <li>iceMnuBarVrtSubMenu-dis</li>
 *                 <li>iceMnuBarVrtSubMenuInd-dis</li>
 *               </ul></p>
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
        this.action = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[1]);
        this.actionListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[2]);
        this.displayOnClick = ((Boolean) _values[3]).booleanValue();
        this.displayOnClick_set = ((Boolean) _values[4]).booleanValue();
        this.id = (String) _values[5];
        this.imageDir = (String) _values[6];
        this.immediate = ((Boolean) _values[7]).booleanValue();
        this.immediate_set = ((Boolean) _values[8]).booleanValue();
        this.keyboardNavigationEnabled = ((Boolean) _values[9]).booleanValue();
        this.keyboardNavigationEnabled_set = ((Boolean) _values[10]).booleanValue();
        this.noIcons = (String) _values[11];
        this.orientation = (String) _values[12];
        this.rendered = ((Boolean) _values[13]).booleanValue();
        this.rendered_set = ((Boolean) _values[14]).booleanValue();
        this.renderedOnUserRole = (String) _values[15];
        this.scrollableDivMode = ((Boolean) _values[16]).booleanValue();
        this.scrollableDivMode_set = ((Boolean) _values[17]).booleanValue();
        this.style = (String) _values[18];
        this.styleClass = (String) _values[19];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[20];
        _values[0] = super.saveState(_context);
        _values[1] = saveAttachedState(_context, action);
        _values[2] = saveAttachedState(_context, actionListener);
        _values[3] = this.displayOnClick ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this.displayOnClick_set ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.id;
        _values[6] = this.imageDir;
        _values[7] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[9] = this.keyboardNavigationEnabled ? Boolean.TRUE : Boolean.FALSE;
        _values[10] = this.keyboardNavigationEnabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[11] = this.noIcons;
        _values[12] = this.orientation;
        _values[13] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[14] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[15] = this.renderedOnUserRole;
        _values[16] = this.scrollableDivMode ? Boolean.TRUE : Boolean.FALSE;
        _values[17] = this.scrollableDivMode_set ? Boolean.TRUE : Boolean.FALSE;
        _values[18] = this.style;
        _values[19] = this.styleClass;
        return _values;
    }

}
