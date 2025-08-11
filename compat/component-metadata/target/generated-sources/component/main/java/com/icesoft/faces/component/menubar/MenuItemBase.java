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
 * A single Menu Item for use within a Menu Bar or parent Menu Item
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class MenuItemBase extends javax.faces.component.UICommand {

    /**
     * <p>Construct a new <code>MenuItemBase</code>.</p>
     */
    public MenuItemBase() {
        super();
        setRendererType("com.icesoft.faces.View");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.MenuNode";
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

    // alt
    private String alt = null;

    /**
 * <p>Passed through to IMG tag of rendered icon in MenuItem</p>
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
 * <p>Passed through to IMG tag of rendered icon in MenuItem</p>
     * @see #getAlt()
     */
    public void setAlt(String alt) {
        this.alt = alt;
    }

    // disabled
    private boolean disabled = false;
    private boolean disabled_set = false;

    /**
 * <p>Indicates tab should be disabled.</p>
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
 * <p>Indicates tab should be disabled.</p>
     * @see #isDisabled()
     */
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
        this.disabled_set = true;
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

    // icon
    private String icon = null;

    /**
 * <p>icon</p>
     */
    public String getIcon() {
        if (this.icon != null) {
            return this.icon;
        }
        ValueBinding _vb = getValueBinding("icon");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "/xmlhttp/css/xp/css-images/menu_blank_icon.gif";
    }

    /**
 * <p>icon</p>
     * @see #getIcon()
     */
    public void setIcon(String icon) {
        this.icon = icon;
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

    // link
    private String link = null;

    /**
 * <p>link</p>
     */
    public String getLink() {
        if (this.link != null) {
            return this.link;
        }
        ValueBinding _vb = getValueBinding("link");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "javascript:;";
    }

    /**
 * <p>link</p>
     * @see #getLink()
     */
    public void setLink(String link) {
        this.link = link;
    }

    // onclick
    private String onclick = null;

    /**
 * <p>Javascript to be executed before the MenuItem's CommandLink submits to the server.</p>
     */
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

    /**
 * <p>Javascript to be executed before the MenuItem's CommandLink submits to the server.</p>
     * @see #getOnclick()
     */
    public void setOnclick(String onclick) {
        this.onclick = onclick;
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
 *               element is rendered. This value must be passed through as the 
 *               "class" attribute on generated markup.<br/><br/>
 *               As the top level menu items are part of the menuBar so the style 
 *               class names rendered differently for top level and non 
 *               to level menu items. <br/>
 *               <p>
 *               The base name rendered same for all non top level menu item regardless
 *               of orientation. Default value is <b>iceMnuItm</b></p>
 *               if enabled 
 *               <ul>
 *                 <li>iceMnuItm</li>
 *                 <li>iceMnuItmImage</li>
 *                 <li>iceMnuItmLabel</li>
 *               </ul>
 * 
 *               if disabled 
 *               <ul>
 *                 <li>iceMnuItm-dis</li>
 *                 <li>iceMnuItmImage-dis</li>
 *                 <li>iceMnuItmLabel-dis</li>
 *               </ul>
 * 			  <p>
 * 			  As the top level menu item is part of the MenuBar, so it is 
 * 			  possible to have different representation for horizontal and 
 * 			  vertical menu. <br/>
 * 			  
 * 			  For the top level menu items the style class base name depends on 
 * 			  orientation of the menu . Default value for top level menu item
 * 			  <b>iceMnuBar</b>: <br/>
 * 			  if enabled + horizontal
 *               <ul>
 *                 <li>iceMnuBarItem</li>
 *                 <li>iceMnuBarItemImage</li>
 *                 <li>iceMnuBarItemLabel</li>
 *               </ul>
 * 
 * 			  if enabled + vertical
 *               <ul>
 *                 <li>iceMnuBarVrtItem</li>
 *                 <li>iceMnuBarVrtItemImage</li>
 *                 <li>iceMnuBarVrtItemLabel</li>
 *               </ul>
 * 
 * 			  if disabled + horizontal
 *               <ul>
 *                 <li>iceMnuBarItem-dis</li>
 *                 <li>iceMnuBarItemImage-dis</li>
 *                 <li>iceMnuBarItemLabel-dis</li>
 *               </ul>
 * 
 * 			  if disabled + vertical
 *               <ul>
 *                 <li>iceMnuBarVrtItem-dis</li>
 *                 <li>iceMnuBarVrtItemImage-dis</li>
 *                 <li>iceMnuBarVrtItemLabel-dis</li>
 *               </ul>
 * 			  
 * 			  </p></p>
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
 *               "class" attribute on generated markup.<br/><br/>
 *               As the top level menu items are part of the menuBar so the style 
 *               class names rendered differently for top level and non 
 *               to level menu items. <br/>
 *               <p>
 *               The base name rendered same for all non top level menu item regardless
 *               of orientation. Default value is <b>iceMnuItm</b></p>
 *               if enabled 
 *               <ul>
 *                 <li>iceMnuItm</li>
 *                 <li>iceMnuItmImage</li>
 *                 <li>iceMnuItmLabel</li>
 *               </ul>
 * 
 *               if disabled 
 *               <ul>
 *                 <li>iceMnuItm-dis</li>
 *                 <li>iceMnuItmImage-dis</li>
 *                 <li>iceMnuItmLabel-dis</li>
 *               </ul>
 * 			  <p>
 * 			  As the top level menu item is part of the MenuBar, so it is 
 * 			  possible to have different representation for horizontal and 
 * 			  vertical menu. <br/>
 * 			  
 * 			  For the top level menu items the style class base name depends on 
 * 			  orientation of the menu . Default value for top level menu item
 * 			  <b>iceMnuBar</b>: <br/>
 * 			  if enabled + horizontal
 *               <ul>
 *                 <li>iceMnuBarItem</li>
 *                 <li>iceMnuBarItemImage</li>
 *                 <li>iceMnuBarItemLabel</li>
 *               </ul>
 * 
 * 			  if enabled + vertical
 *               <ul>
 *                 <li>iceMnuBarVrtItem</li>
 *                 <li>iceMnuBarVrtItemImage</li>
 *                 <li>iceMnuBarVrtItemLabel</li>
 *               </ul>
 * 
 * 			  if disabled + horizontal
 *               <ul>
 *                 <li>iceMnuBarItem-dis</li>
 *                 <li>iceMnuBarItemImage-dis</li>
 *                 <li>iceMnuBarItemLabel-dis</li>
 *               </ul>
 * 
 * 			  if disabled + vertical
 *               <ul>
 *                 <li>iceMnuBarVrtItem-dis</li>
 *                 <li>iceMnuBarVrtItemImage-dis</li>
 *                 <li>iceMnuBarVrtItemLabel-dis</li>
 *               </ul>
 * 			  
 * 			  </p></p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // target
    private String target = null;

    /**
 * <p>target</p>
     */
    public String getTarget() {
        if (this.target != null) {
            return this.target;
        }
        ValueBinding _vb = getValueBinding("target");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>target</p>
     * @see #getTarget()
     */
    public void setTarget(String target) {
        this.target = target;
    }

    // title
    private String title = null;

    /**
 * <p>Passed through to root DIV tag of rendered MenuItem</p>
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
 * <p>Passed through to root DIV tag of rendered MenuItem</p>
     * @see #getTitle()
     */
    public void setTitle(String title) {
        this.title = title;
    }

    // value
    private Object value = null;

    /**
 * <p>The current value of this component.</p>
     */
    public Object getValue() {
        if (this.value != null) {
            return this.value;
        }
        ValueBinding _vb = getValueBinding("value");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return "menu item default";
    }

    /**
 * <p>The current value of this component.</p>
     * @see #getValue()
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.action = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[1]);
        this.actionListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[2]);
        this.alt = (String) _values[3];
        this.disabled = ((Boolean) _values[4]).booleanValue();
        this.disabled_set = ((Boolean) _values[5]).booleanValue();
        this.enabledOnUserRole = (String) _values[6];
        this.icon = (String) _values[7];
        this.id = (String) _values[8];
        this.immediate = ((Boolean) _values[9]).booleanValue();
        this.immediate_set = ((Boolean) _values[10]).booleanValue();
        this.link = (String) _values[11];
        this.onclick = (String) _values[12];
        this.rendered = ((Boolean) _values[13]).booleanValue();
        this.rendered_set = ((Boolean) _values[14]).booleanValue();
        this.renderedOnUserRole = (String) _values[15];
        this.style = (String) _values[16];
        this.styleClass = (String) _values[17];
        this.target = (String) _values[18];
        this.title = (String) _values[19];
        this.value = (Object) _values[20];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[21];
        _values[0] = super.saveState(_context);
        _values[1] = saveAttachedState(_context, action);
        _values[2] = saveAttachedState(_context, actionListener);
        _values[3] = this.alt;
        _values[4] = this.disabled ? Boolean.TRUE : Boolean.FALSE;
        _values[5] = this.disabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.enabledOnUserRole;
        _values[7] = this.icon;
        _values[8] = this.id;
        _values[9] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[10] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[11] = this.link;
        _values[12] = this.onclick;
        _values[13] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[14] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[15] = this.renderedOnUserRole;
        _values[16] = this.style;
        _values[17] = this.styleClass;
        _values[18] = this.target;
        _values[19] = this.title;
        _values[20] = this.value;
        return _values;
    }

}
