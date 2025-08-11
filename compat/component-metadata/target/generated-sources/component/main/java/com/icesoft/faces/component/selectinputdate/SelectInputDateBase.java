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
package com.icesoft.faces.component.selectinputdate;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * An text entry or popup calendar date-input control
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class SelectInputDateBase extends javax.faces.component.UIInput {

    /**
     * <p>Construct a new <code>SelectInputDateBase</code>.</p>
     */
    public SelectInputDateBase() {
        super();
        setRendererType("com.icesoft.faces.Calendar");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Input";
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

    // autocomplete
    private String autocomplete = null;

    /**
 * <p>Passed through to root element.</p>
     */
    public String getAutocomplete() {
        if (this.autocomplete != null) {
            return this.autocomplete;
        }
        ValueBinding _vb = getValueBinding("autocomplete");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Passed through to root element.</p>
     * @see #getAutocomplete()
     */
    public void setAutocomplete(String autocomplete) {
        this.autocomplete = autocomplete;
    }

    // converter
    private javax.faces.convert.Converter converter = null;

    /**
 * <p>Converter instance registered with this component.
 *         Converter must be a javax.faces.convert.DateTimeConverter instance, or subclass,
 *         which can be accomplished by using the f:convertDateTime tag.
 *         Note: DateTimeConverter's default timeZone, if none is specified, is GMT.</p>
     */
    public javax.faces.convert.Converter getConverter() {
        if (this.converter != null) {
            return this.converter;
        }
        ValueBinding _vb = getValueBinding("converter");
        if (_vb != null) {
            return (javax.faces.convert.Converter) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Converter instance registered with this component.
 *         Converter must be a javax.faces.convert.DateTimeConverter instance, or subclass,
 *         which can be accomplished by using the f:convertDateTime tag.
 *         Note: DateTimeConverter's default timeZone, if none is specified, is GMT.</p>
     * @see #getConverter()
     */
    public void setConverter(javax.faces.convert.Converter converter) {
        this.converter = converter;
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

    // highlightClass
    private String highlightClass = null;

    /**
 * <p>
 * 		This attribute defines class(s) for days to be highlighted.
 * 		
 * 		<br/>Note: In order to highlight a day, following three attributes need to be 
 *              set with corresponding values:
 *             <ol>
 *                 <li> highlightClass
 *             	<li> highlightUnit   
 *             	<li> highlightValue
 *             </ol> 
 *         </p>
     */
    public String getHighlightClass() {
        if (this.highlightClass != null) {
            return this.highlightClass;
        }
        ValueBinding _vb = getValueBinding("highlightClass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 * 		This attribute defines class(s) for days to be highlighted.
 * 		
 * 		<br/>Note: In order to highlight a day, following three attributes need to be 
 *              set with corresponding values:
 *             <ol>
 *                 <li> highlightClass
 *             	<li> highlightUnit   
 *             	<li> highlightValue
 *             </ol> 
 *         </p>
     * @see #getHighlightClass()
     */
    public void setHighlightClass(String highlightClass) {
        this.highlightClass = highlightClass;
    }

    // highlightUnit
    private String highlightUnit = null;

    /**
 * <p>This attribute defines the level where highlight need to
 * 		be applied. The valid values can be set using the following 
 * 		java.util.Calendar constants:
 * 		<UL>
 * 			<LI>YEAR
 *         	<LI>MONTH
 *         	<LI>WEEK_OF_YEAR
 *         	<LI>WEEK_OF_MONTH
 *         	<LI>DATE
 *         	<LI>DAY_OF_YEAR
 *         	<LI>DAY_OF_WEEK
 *         	<LI>DAY_OF_WEEK_IN_MONTH
 *         </UL>
 * 		
 * 		Above units can be defined using String representation or as constant
 * 		as well (e.g.) <br/>
 * 		*.jsp<br/>
 * 		&lt;ice:selectInputDate highlightUnit="YEAR".. /&gt; <br/>
 * 		equivalent to <br/>
 * 		&lt;ice:selectInputDate highlightUnit="1".. /&gt; <br/>
 * 		bean </br>
 * 		public String getHighlightUnit() {
 * 			return String.valueOf(Calendar.YEAR); 
 * 		}		
 * 		<br/>
 * 		Note: In order to highlight a day, following three attributes need to be 
 *              set with corresponding values:
 *             <ol>
 *                 <li> highlightClass
 *             	<li> highlightUnit   
 *             	<li> highlightValue
 *             </ol>
 *         </p>
     */
    public String getHighlightUnit() {
        if (this.highlightUnit != null) {
            return this.highlightUnit;
        }
        ValueBinding _vb = getValueBinding("highlightUnit");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>This attribute defines the level where highlight need to
 * 		be applied. The valid values can be set using the following 
 * 		java.util.Calendar constants:
 * 		<UL>
 * 			<LI>YEAR
 *         	<LI>MONTH
 *         	<LI>WEEK_OF_YEAR
 *         	<LI>WEEK_OF_MONTH
 *         	<LI>DATE
 *         	<LI>DAY_OF_YEAR
 *         	<LI>DAY_OF_WEEK
 *         	<LI>DAY_OF_WEEK_IN_MONTH
 *         </UL>
 * 		
 * 		Above units can be defined using String representation or as constant
 * 		as well (e.g.) <br/>
 * 		*.jsp<br/>
 * 		&lt;ice:selectInputDate highlightUnit="YEAR".. /&gt; <br/>
 * 		equivalent to <br/>
 * 		&lt;ice:selectInputDate highlightUnit="1".. /&gt; <br/>
 * 		bean </br>
 * 		public String getHighlightUnit() {
 * 			return String.valueOf(Calendar.YEAR); 
 * 		}		
 * 		<br/>
 * 		Note: In order to highlight a day, following three attributes need to be 
 *              set with corresponding values:
 *             <ol>
 *                 <li> highlightClass
 *             	<li> highlightUnit   
 *             	<li> highlightValue
 *             </ol>
 *         </p>
     * @see #getHighlightUnit()
     */
    public void setHighlightUnit(String highlightUnit) {
        this.highlightUnit = highlightUnit;
    }

    // highlightValue
    private String highlightValue = null;

    /**
 * <p>
 * 		This attribute defines the value to be highlighted appropriate to 
 * 		the corresponding highlightUnit attribute.
 * 		(e.g.) <br/>
 * 		MONTH = 1 to 12<br/>
 * 		DAY_OF_WEEK = 1 to 7
 * 		
 * 		<br/>
 * 		Note: In order to highlight a day, following three attributes need to be 
 *              set with corresponding values:		
 *             <ol>
 *                 <li> highlightClass
 *             	<li> highlightUnit   
 *             	<li> highlightValue
 *             </ol>             
 *         </p>
     */
    public String getHighlightValue() {
        if (this.highlightValue != null) {
            return this.highlightValue;
        }
        ValueBinding _vb = getValueBinding("highlightValue");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>
 * 		This attribute defines the value to be highlighted appropriate to 
 * 		the corresponding highlightUnit attribute.
 * 		(e.g.) <br/>
 * 		MONTH = 1 to 12<br/>
 * 		DAY_OF_WEEK = 1 to 7
 * 		
 * 		<br/>
 * 		Note: In order to highlight a day, following three attributes need to be 
 *              set with corresponding values:		
 *             <ol>
 *                 <li> highlightClass
 *             	<li> highlightUnit   
 *             	<li> highlightValue
 *             </ol>             
 *         </p>
     * @see #getHighlightValue()
     */
    public void setHighlightValue(String highlightValue) {
        this.highlightValue = highlightValue;
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
 * <p>Set directory for location of the button images. Deprecated. Use styleClass instead.
 *         The style class name for a button is made up of the styleClass name plus a predefined name.
 *         For example: with a styleClass name of "myCalendar", the button class names would be:
 *         myCalendarMovePrev, myCalendarMoveNext, myCalendarOpenPopup, myCalendarClosePopup.
 *         Override the images with the background-image property.</p>
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
 * <p>Set directory for location of the button images. Deprecated. Use styleClass instead.
 *         The style class name for a button is made up of the styleClass name plus a predefined name.
 *         For example: with a styleClass name of "myCalendar", the button class names would be:
 *         myCalendarMovePrev, myCalendarMoveNext, myCalendarOpenPopup, myCalendarClosePopup.
 *         Override the images with the background-image property.</p>
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

    // inputTitle
    private String inputTitle = null;

    /**
 * <p>Tooltip for the text input field.</p>
     */
    public String getInputTitle() {
        if (this.inputTitle != null) {
            return this.inputTitle;
        }
        ValueBinding _vb = getValueBinding("inputTitle");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Tooltip for the text input field.</p>
     * @see #getInputTitle()
     */
    public void setInputTitle(String inputTitle) {
        this.inputTitle = inputTitle;
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

    // maxlength
    private int maxlength = Integer.MIN_VALUE;
    private boolean maxlength_set = false;

    /**
 * <p>The maximum number of characters that may be entered in this field.</p>
     */
    public int getMaxlength() {
        if (this.maxlength_set) {
            return this.maxlength;
        }
        ValueBinding _vb = getValueBinding("maxlength");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return Integer.MIN_VALUE;
            } else {
                return ((Integer) _result).intValue();
            }
        }
        return Integer.MIN_VALUE;
    }

    /**
 * <p>The maximum number of characters that may be entered in this field.</p>
     * @see #getMaxlength()
     */
    public void setMaxlength(int maxlength) {
        this.maxlength = maxlength;
        this.maxlength_set = true;
    }

    // navDate
    private java.util.Date navDate = null;

    public java.util.Date getNavDate() {
        return this.navDate;
    }

    public void setNavDate(java.util.Date navDate) {
        this.navDate = navDate;
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

    // partialSubmit
    private boolean partialSubmit = false;
    private boolean partialSubmit_set = false;

    /**
 * <p>Enable component to perform partial submit. Default value is true.</p>
     */
    public boolean isPartialSubmit() {
        if (this.partialSubmit_set) {
            return this.partialSubmit;
        }
        ValueBinding _vb = getValueBinding("partialSubmit");
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
 * <p>Enable component to perform partial submit. Default value is true.</p>
     * @see #isPartialSubmit()
     */
    public void setPartialSubmit(boolean partialSubmit) {
        this.partialSubmit = partialSubmit;
        this.partialSubmit_set = true;
    }

    // popupDateFormat
    private String popupDateFormat = null;

    /**
 * <p>DEPRECATED
 *         Now one should instead use an f:convertDateTime tag with its pattern attribute.
 *         This is the pattern of the simple date format used in the text input, when renderAsPopup = true
 *         Also, if the <b>title</b> attribute is not specified, then <b>popupDateFormat</b> will be used to describe the date format, in the title attribute rendered on the text input field, when renderAsPopup = true</p>
     */
    public String getPopupDateFormat() {
        if (this.popupDateFormat != null) {
            return this.popupDateFormat;
        }
        ValueBinding _vb = getValueBinding("popupDateFormat");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "MM/dd/yyyy";
    }

    /**
 * <p>DEPRECATED
 *         Now one should instead use an f:convertDateTime tag with its pattern attribute.
 *         This is the pattern of the simple date format used in the text input, when renderAsPopup = true
 *         Also, if the <b>title</b> attribute is not specified, then <b>popupDateFormat</b> will be used to describe the date format, in the title attribute rendered on the text input field, when renderAsPopup = true</p>
     * @see #getPopupDateFormat()
     */
    public void setPopupDateFormat(String popupDateFormat) {
        this.popupDateFormat = popupDateFormat;
    }

    // readonly
    private boolean readonly = false;
    private boolean readonly_set = false;

    /**
 * <p>Flag indicating that this component will prohibit changes by the user. 
 * 		The element may receive focus unless it has also been disabled. This
 *         attribute is valid for input types "text" and "password" only. It is
 *         non-functional for other input types like "radio" or "checkbox".</p>
     */
    public boolean isReadonly() {
        if (this.readonly_set) {
            return this.readonly;
        }
        ValueBinding _vb = getValueBinding("readonly");
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
 * <p>Flag indicating that this component will prohibit changes by the user. 
 * 		The element may receive focus unless it has also been disabled. This
 *         attribute is valid for input types "text" and "password" only. It is
 *         non-functional for other input types like "radio" or "checkbox".</p>
     * @see #isReadonly()
     */
    public void setReadonly(boolean readonly) {
        this.readonly = readonly;
        this.readonly_set = true;
    }

    // renderAsPopup
    private boolean renderAsPopup = false;
    private boolean renderAsPopup_set = false;

    /**
 * <p>If true, render the selectInputDate as an inputText field with a button,
 *         which when pressed, displays a popup calendar. Else if false,
 *         only render the calendar, in-place.</p>
     */
    public boolean isRenderAsPopup() {
        if (this.renderAsPopup_set) {
            return this.renderAsPopup;
        }
        ValueBinding _vb = getValueBinding("renderAsPopup");
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
 * <p>If true, render the selectInputDate as an inputText field with a button,
 *         which when pressed, displays a popup calendar. Else if false,
 *         only render the calendar, in-place.</p>
     * @see #isRenderAsPopup()
     */
    public void setRenderAsPopup(boolean renderAsPopup) {
        this.renderAsPopup = renderAsPopup;
        this.renderAsPopup_set = true;
    }

    // renderMonthAsDropdown
    private boolean renderMonthAsDropdown = false;
    private boolean renderMonthAsDropdown_set = false;

    /**
 * <p>If true, the list of months is rendered in a dropdown list.
 *         If false (the default), only the specified month is rendered,
 *         with left and right arrow buttons to navigate to other months.</p>
     */
    public boolean isRenderMonthAsDropdown() {
        if (this.renderMonthAsDropdown_set) {
            return this.renderMonthAsDropdown;
        }
        ValueBinding _vb = getValueBinding("renderMonthAsDropdown");
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
 * <p>If true, the list of months is rendered in a dropdown list.
 *         If false (the default), only the specified month is rendered,
 *         with left and right arrow buttons to navigate to other months.</p>
     * @see #isRenderMonthAsDropdown()
     */
    public void setRenderMonthAsDropdown(boolean renderMonthAsDropdown) {
        this.renderMonthAsDropdown = renderMonthAsDropdown;
        this.renderMonthAsDropdown_set = true;
    }

    // renderWeekNumbers
    private boolean renderWeekNumbers = false;
    private boolean renderWeekNumbers_set = false;

    /**
 * <p>Whether to render the week numbers of the year. Default is false.</p>
     */
    public boolean isRenderWeekNumbers() {
        if (this.renderWeekNumbers_set) {
            return this.renderWeekNumbers;
        }
        ValueBinding _vb = getValueBinding("renderWeekNumbers");
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
 * <p>Whether to render the week numbers of the year. Default is false.</p>
     * @see #isRenderWeekNumbers()
     */
    public void setRenderWeekNumbers(boolean renderWeekNumbers) {
        this.renderWeekNumbers = renderWeekNumbers;
        this.renderWeekNumbers_set = true;
    }

    // renderYearAsDropdown
    private boolean renderYearAsDropdown = false;
    private boolean renderYearAsDropdown_set = false;

    /**
 * <p>If true, a list of 11 years is rendered in a dropdown list, with the specified year in the middle,
 *         plus a "previous" item and a "next" item to navigate to other years.
 *         If false (the default), only the specified year is rendered, with left
 *         and right arrow buttons to navigate to other years.</p>
     */
    public boolean isRenderYearAsDropdown() {
        if (this.renderYearAsDropdown_set) {
            return this.renderYearAsDropdown;
        }
        ValueBinding _vb = getValueBinding("renderYearAsDropdown");
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
 * <p>If true, a list of 11 years is rendered in a dropdown list, with the specified year in the middle,
 *         plus a "previous" item and a "next" item to navigate to other years.
 *         If false (the default), only the specified year is rendered, with left
 *         and right arrow buttons to navigate to other years.</p>
     * @see #isRenderYearAsDropdown()
     */
    public void setRenderYearAsDropdown(boolean renderYearAsDropdown) {
        this.renderYearAsDropdown = renderYearAsDropdown;
        this.renderYearAsDropdown_set = true;
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

    // required
    private boolean required = false;
    private boolean required_set = false;

    /**
 * <p>Flag indicating that the user is required to provide a submitted value 
 * 		for this input component.</p>
     */
    public boolean isRequired() {
        if (this.required_set) {
            return this.required;
        }
        ValueBinding _vb = getValueBinding("required");
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
 * <p>Flag indicating that the user is required to provide a submitted value 
 * 		for this input component.</p>
     * @see #isRequired()
     */
    public void setRequired(boolean required) {
        this.required = required;
        this.required_set = true;
    }

    // requiredMessage
    private String requiredMessage = null;

    /**
 * <p>A ValueExpression enabled attribute that, if present, will be used as the text of the validation message for the "required" facility, if the "required" facility is used.</p>
     */
    public String getRequiredMessage() {
        if (this.requiredMessage != null) {
            return this.requiredMessage;
        }
        ValueBinding _vb = getValueBinding("requiredMessage");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>A ValueExpression enabled attribute that, if present, will be used as the text of the validation message for the "required" facility, if the "required" facility is used.</p>
     * @see #getRequiredMessage()
     */
    public void setRequiredMessage(String requiredMessage) {
        this.requiredMessage = requiredMessage;
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
 * <p>Defines the base class name for all style classes. Default value is <b>iceSelInpDate</b></p>
 *               if enabled
 *               <ul>
 *                 <li>iceSelInpDate</li>
 *                 <li>iceSelInpDateInput</li>
 *                 <li>iceSelInpDateMonthYear</li>
 *                 <li>iceSelInpDateMoYrDropdown</li>
 *                 <li>iceSelInpDateWeek</li>
 *                 <li>iceSelInpDateDay</li>
 *                 <li>iceSelInpDateCur</li>
 *                 <li>iceSelInpDatePopup</li>
 *                 <li>iceSelInpDateOpenPopup</li>
 *                 <li>iceSelInpDateClosePopup</li>                
 *               </ul>
 *               
 *               if disabled
 *               <ul>
 *                 <li>iceSelInpDate-dis</li>
 *                 <li>iceSelInpDateInput-dis</li>
 *                 <li>iceSelInpDateMonthYear-dis</li>
 *                 <li>iceSelInpDateMovePrev-dis</li>
 *                 <li>iceSelInpDateMoveNext-dis</li>
 *                 <li>iceSelInpDateWeek-dis</li>
 *                 <li>iceSelInpDateDay-dis</li>
 *                 <li>iceSelInpDatePopup-dis</li>
 *                 <li>iceSelInpDateOpenPopup-dis</li>
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
 * <p>Defines the base class name for all style classes. Default value is <b>iceSelInpDate</b></p>
 *               if enabled
 *               <ul>
 *                 <li>iceSelInpDate</li>
 *                 <li>iceSelInpDateInput</li>
 *                 <li>iceSelInpDateMonthYear</li>
 *                 <li>iceSelInpDateMoYrDropdown</li>
 *                 <li>iceSelInpDateWeek</li>
 *                 <li>iceSelInpDateDay</li>
 *                 <li>iceSelInpDateCur</li>
 *                 <li>iceSelInpDatePopup</li>
 *                 <li>iceSelInpDateOpenPopup</li>
 *                 <li>iceSelInpDateClosePopup</li>                
 *               </ul>
 *               
 *               if disabled
 *               <ul>
 *                 <li>iceSelInpDate-dis</li>
 *                 <li>iceSelInpDateInput-dis</li>
 *                 <li>iceSelInpDateMonthYear-dis</li>
 *                 <li>iceSelInpDateMovePrev-dis</li>
 *                 <li>iceSelInpDateMoveNext-dis</li>
 *                 <li>iceSelInpDateWeek-dis</li>
 *                 <li>iceSelInpDateDay-dis</li>
 *                 <li>iceSelInpDatePopup-dis</li>
 *                 <li>iceSelInpDateOpenPopup-dis</li>
 *               </ul>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // tabindex
    private String tabindex = null;

    /**
 * <p>Position of this element in the tabbing order for the current document. 
 * 		This value must be an integer between 0 and 32767.</p>
     */
    public String getTabindex() {
        if (this.tabindex != null) {
            return this.tabindex;
        }
        ValueBinding _vb = getValueBinding("tabindex");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Position of this element in the tabbing order for the current document. 
 * 		This value must be an integer between 0 and 32767.</p>
     * @see #getTabindex()
     */
    public void setTabindex(String tabindex) {
        this.tabindex = tabindex;
    }

    // title
    private String title = null;

    /**
 * <p>Advisory title information about markup elements generated for this 
 * 		component.</p>
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
 * <p>Advisory title information about markup elements generated for this 
 * 		component.</p>
     * @see #getTitle()
     */
    public void setTitle(String title) {
        this.title = title;
    }

    // validator
    private javax.faces.el.MethodBinding validator = null;

    /**
 * <p>MethodBinding representing a validator method that will be called 
 * 		during Process Validations to perform correctness checks on the value 
 * 		of this component. The expression must evaluate to a public method that 
 * 		takes FacesContext, UIComponent, and Object parameters, with a return 
 * 		type of void.</p>
     */
    public javax.faces.el.MethodBinding getValidator() {
        if (this.validator != null) {
            return this.validator;
        }
        ValueBinding _vb = getValueBinding("validator");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>MethodBinding representing a validator method that will be called 
 * 		during Process Validations to perform correctness checks on the value 
 * 		of this component. The expression must evaluate to a public method that 
 * 		takes FacesContext, UIComponent, and Object parameters, with a return 
 * 		type of void.</p>
     * @see #getValidator()
     */
    public void setValidator(javax.faces.el.MethodBinding validator) {
        this.validator = validator;
    }

    // value
    private Object value = null;

    /**
 * <p>The current value of this component.</p>
 *         <p>All UIInput derived UIComponents, that are placed within a UIData 
 *         container, such as a dataTable or panelSeries, should have their 
 *         <i>value</i> attribute bound to a bean property via a 
 *         ValueBinding/ValueExpression, since otherwise the UIData container 
 *         will not keep their successfully validated state, which can cause 
 *         the component to fail to function properly.</p>
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
 * <p>The current value of this component.</p>
 *         <p>All UIInput derived UIComponents, that are placed within a UIData 
 *         container, such as a dataTable or panelSeries, should have their 
 *         <i>value</i> attribute bound to a bean property via a 
 *         ValueBinding/ValueExpression, since otherwise the UIData container 
 *         will not keep their successfully validated state, which can cause 
 *         the component to fail to function properly.</p>
     * @see #getValue()
     */
    public void setValue(Object value) {
        this.value = value;
    }

    // valueChangeListener
    private javax.faces.el.MethodBinding valueChangeListener = null;

    /**
 * <p>MethodBinding representing a value change listener method that will be 
 * 		notified when a new value has been set for this input component. The 
 * 		expression must evaluate to a public method that takes a 
 * 		ValueChangeEvent parameter, with a return type of void.</p>
     */
    public javax.faces.el.MethodBinding getValueChangeListener() {
        if (this.valueChangeListener != null) {
            return this.valueChangeListener;
        }
        ValueBinding _vb = getValueBinding("valueChangeListener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>MethodBinding representing a value change listener method that will be 
 * 		notified when a new value has been set for this input component. The 
 * 		expression must evaluate to a public method that takes a 
 * 		ValueChangeEvent parameter, with a return type of void.</p>
     * @see #getValueChangeListener()
     */
    public void setValueChangeListener(javax.faces.el.MethodBinding valueChangeListener) {
        this.valueChangeListener = valueChangeListener;
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

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.action = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[1]);
        this.actionListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[2]);
        this.autocomplete = (String) _values[3];
        this.converter = (javax.faces.convert.Converter) _values[4];
        this.dir = (String) _values[5];
        this.disabled = ((Boolean) _values[6]).booleanValue();
        this.disabled_set = ((Boolean) _values[7]).booleanValue();
        this.enabledOnUserRole = (String) _values[8];
        this.highlightClass = (String) _values[9];
        this.highlightUnit = (String) _values[10];
        this.highlightValue = (String) _values[11];
        this.id = (String) _values[12];
        this.imageDir = (String) _values[13];
        this.immediate = ((Boolean) _values[14]).booleanValue();
        this.immediate_set = ((Boolean) _values[15]).booleanValue();
        this.inputTitle = (String) _values[16];
        this.lang = (String) _values[17];
        this.maxlength = ((Integer) _values[18]).intValue();
        this.maxlength_set = ((Boolean) _values[19]).booleanValue();
        this.navDate = (java.util.Date) _values[20];
        this.onclick = (String) _values[21];
        this.ondblclick = (String) _values[22];
        this.onkeydown = (String) _values[23];
        this.onkeypress = (String) _values[24];
        this.onkeyup = (String) _values[25];
        this.onmousedown = (String) _values[26];
        this.onmousemove = (String) _values[27];
        this.onmouseout = (String) _values[28];
        this.onmouseover = (String) _values[29];
        this.onmouseup = (String) _values[30];
        this.partialSubmit = ((Boolean) _values[31]).booleanValue();
        this.partialSubmit_set = ((Boolean) _values[32]).booleanValue();
        this.popupDateFormat = (String) _values[33];
        this.readonly = ((Boolean) _values[34]).booleanValue();
        this.readonly_set = ((Boolean) _values[35]).booleanValue();
        this.renderAsPopup = ((Boolean) _values[36]).booleanValue();
        this.renderAsPopup_set = ((Boolean) _values[37]).booleanValue();
        this.renderMonthAsDropdown = ((Boolean) _values[38]).booleanValue();
        this.renderMonthAsDropdown_set = ((Boolean) _values[39]).booleanValue();
        this.renderWeekNumbers = ((Boolean) _values[40]).booleanValue();
        this.renderWeekNumbers_set = ((Boolean) _values[41]).booleanValue();
        this.renderYearAsDropdown = ((Boolean) _values[42]).booleanValue();
        this.renderYearAsDropdown_set = ((Boolean) _values[43]).booleanValue();
        this.rendered = ((Boolean) _values[44]).booleanValue();
        this.rendered_set = ((Boolean) _values[45]).booleanValue();
        this.renderedOnUserRole = (String) _values[46];
        this.required = ((Boolean) _values[47]).booleanValue();
        this.required_set = ((Boolean) _values[48]).booleanValue();
        this.requiredMessage = (String) _values[49];
        this.style = (String) _values[50];
        this.styleClass = (String) _values[51];
        this.tabindex = (String) _values[52];
        this.title = (String) _values[53];
        this.validator = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[54]);
        this.value = (Object) _values[55];
        this.valueChangeListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[56]);
        this.visible = ((Boolean) _values[57]).booleanValue();
        this.visible_set = ((Boolean) _values[58]).booleanValue();
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[59];
        _values[0] = super.saveState(_context);
        _values[1] = saveAttachedState(_context, action);
        _values[2] = saveAttachedState(_context, actionListener);
        _values[3] = this.autocomplete;
        _values[4] = this.converter;
        _values[5] = this.dir;
        _values[6] = this.disabled ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.disabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.enabledOnUserRole;
        _values[9] = this.highlightClass;
        _values[10] = this.highlightUnit;
        _values[11] = this.highlightValue;
        _values[12] = this.id;
        _values[13] = this.imageDir;
        _values[14] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[15] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[16] = this.inputTitle;
        _values[17] = this.lang;
        _values[18] = new Integer(this.maxlength);
        _values[19] = this.maxlength_set ? Boolean.TRUE : Boolean.FALSE;
        _values[20] = this.navDate;
        _values[21] = this.onclick;
        _values[22] = this.ondblclick;
        _values[23] = this.onkeydown;
        _values[24] = this.onkeypress;
        _values[25] = this.onkeyup;
        _values[26] = this.onmousedown;
        _values[27] = this.onmousemove;
        _values[28] = this.onmouseout;
        _values[29] = this.onmouseover;
        _values[30] = this.onmouseup;
        _values[31] = this.partialSubmit ? Boolean.TRUE : Boolean.FALSE;
        _values[32] = this.partialSubmit_set ? Boolean.TRUE : Boolean.FALSE;
        _values[33] = this.popupDateFormat;
        _values[34] = this.readonly ? Boolean.TRUE : Boolean.FALSE;
        _values[35] = this.readonly_set ? Boolean.TRUE : Boolean.FALSE;
        _values[36] = this.renderAsPopup ? Boolean.TRUE : Boolean.FALSE;
        _values[37] = this.renderAsPopup_set ? Boolean.TRUE : Boolean.FALSE;
        _values[38] = this.renderMonthAsDropdown ? Boolean.TRUE : Boolean.FALSE;
        _values[39] = this.renderMonthAsDropdown_set ? Boolean.TRUE : Boolean.FALSE;
        _values[40] = this.renderWeekNumbers ? Boolean.TRUE : Boolean.FALSE;
        _values[41] = this.renderWeekNumbers_set ? Boolean.TRUE : Boolean.FALSE;
        _values[42] = this.renderYearAsDropdown ? Boolean.TRUE : Boolean.FALSE;
        _values[43] = this.renderYearAsDropdown_set ? Boolean.TRUE : Boolean.FALSE;
        _values[44] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[45] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[46] = this.renderedOnUserRole;
        _values[47] = this.required ? Boolean.TRUE : Boolean.FALSE;
        _values[48] = this.required_set ? Boolean.TRUE : Boolean.FALSE;
        _values[49] = this.requiredMessage;
        _values[50] = this.style;
        _values[51] = this.styleClass;
        _values[52] = this.tabindex;
        _values[53] = this.title;
        _values[54] = saveAttachedState(_context, validator);
        _values[55] = this.value;
        _values[56] = saveAttachedState(_context, valueChangeListener);
        _values[57] = this.visible ? Boolean.TRUE : Boolean.FALSE;
        _values[58] = this.visible_set ? Boolean.TRUE : Boolean.FALSE;
        return _values;
    }

}
