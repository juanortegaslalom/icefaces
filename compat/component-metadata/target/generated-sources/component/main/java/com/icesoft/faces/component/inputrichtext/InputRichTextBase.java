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
package com.icesoft.faces.component.inputrichtext;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class InputRichTextBase extends javax.faces.component.UIInput {

    /**
     * <p>Construct a new <code>InputRichTextBase</code>.</p>
     */
    public InputRichTextBase() {
        super();
        setRendererType("com.icesoft.faces.InputRichTextRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Input";
    }

    // customConfigPath
    private String customConfigPath = null;

    /**
 * <p>This attribute defines the path of the custom config file, the path 
 *             is relative to the web app.</p>
     */
    public String getCustomConfigPath() {
        if (this.customConfigPath != null) {
            return this.customConfigPath;
        }
        ValueBinding _vb = getValueBinding("customConfigPath");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>This attribute defines the path of the custom config file, the path 
 *             is relative to the web app.</p>
     * @see #getCustomConfigPath()
     */
    public void setCustomConfigPath(String customConfigPath) {
        this.customConfigPath = customConfigPath;
    }

    // disabled
    private boolean disabled = false;
    private boolean disabled_set = false;

    /**
 * <p>Disable the component</p>
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
 * <p>Disable the component</p>
     * @see #isDisabled()
     */
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
        this.disabled_set = true;
    }

    // for
    private String _for = null;

    /**
 * <p>The for attribute references the id of the inputRichText which toolbarOnly attribute is set to "true".</p>
     */
    public String getFor() {
        if (this._for != null) {
            return this._for;
        }
        ValueBinding _vb = getValueBinding("for");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The for attribute references the id of the inputRichText which toolbarOnly attribute is set to "true".</p>
     * @see #getFor()
     */
    public void setFor(String _for) {
        this._for = _for;
    }

    // height
    private String height = null;

    /**
 * <p>height.</p>
     */
    public String getHeight() {
        if (this.height != null) {
            return this.height;
        }
        ValueBinding _vb = getValueBinding("height");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "200";
    }

    /**
 * <p>height.</p>
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

    // language
    private String language = null;

    /**
 * <p>
 *         The support of multi-language can use the following 54 languages. (e.g.) To set the French language use language="fr"
 *         <ul>
 *         <li>Afrikaans (af)</li><li>Arabic (ar)</li><li>Basque (eu)</li><li>Bengali/Bangla (bn)</li><li>Bosnian (bs)</li><li>Bulgarian (bg)</li><li>Catalan (ca)</li><li>Chinese Simplified (zh-cn)</li><li>Chinese Traditional (zh)</li><li>Croatian (hr)</li><li>Czech (cs)</li><li>Danish (da)</li><li>Dutch (nl)</li><li>English (en)</li><li>English (Australia) (en-au)</li><li>English (Canadian) (en-ca)</li><li>English (United Kingdom) (en-gb)</li><li>Esperanto (eo)</li><li>Estonian (et)</li><li>Faroese (fo)</li><li>Finnish (fi)</li><li>French (fr)</li><li>Galician (gl)</li><li>German (de)</li><li>Greek (el)</li><li>Hebrew (he)</li><li>Hindi (hi)</li><li>Hungarian (hu)</li><li>Italian (it)</li><li>Japanese (ja)</li><li>Khmer (km)</li><li>Korean (ko)</li><li>Latvian (lv)</li><li>Lithuanian (lt)</li><li>Malay (ms)</li><li>Mongolian (mn)</li><li>Norwegian (no)</li><li>Norwegian Bokmal (nb)</li><li>Persian (fa)</li><li>Polish (pl)</li><li>Portuguese (Brazil) (pt-br)</li><li>Portuguese (Portugal) (pt)</li><li>Romanian (ro)</li><li>Russian (ru)</li><li>Serbian (Cyrillic) (sr)</li><li>Serbian (Latin) (sr-latn)</li><li>Slovak (sk)</li><li>Slovenian (sl)</li><li>Spanish (es)</li><li>Swedish (sv)</li><li>Thai (th)</li><li>Turkish (tr)</li><li>Ukrainian (uk)</li><li>Vietnamese (vi)</li>
 *         </ul>
 * 		</p>
     */
    public String getLanguage() {
        if (this.language != null) {
            return this.language;
        }
        ValueBinding _vb = getValueBinding("language");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "en";
    }

    /**
 * <p>
 *         The support of multi-language can use the following 54 languages. (e.g.) To set the French language use language="fr"
 *         <ul>
 *         <li>Afrikaans (af)</li><li>Arabic (ar)</li><li>Basque (eu)</li><li>Bengali/Bangla (bn)</li><li>Bosnian (bs)</li><li>Bulgarian (bg)</li><li>Catalan (ca)</li><li>Chinese Simplified (zh-cn)</li><li>Chinese Traditional (zh)</li><li>Croatian (hr)</li><li>Czech (cs)</li><li>Danish (da)</li><li>Dutch (nl)</li><li>English (en)</li><li>English (Australia) (en-au)</li><li>English (Canadian) (en-ca)</li><li>English (United Kingdom) (en-gb)</li><li>Esperanto (eo)</li><li>Estonian (et)</li><li>Faroese (fo)</li><li>Finnish (fi)</li><li>French (fr)</li><li>Galician (gl)</li><li>German (de)</li><li>Greek (el)</li><li>Hebrew (he)</li><li>Hindi (hi)</li><li>Hungarian (hu)</li><li>Italian (it)</li><li>Japanese (ja)</li><li>Khmer (km)</li><li>Korean (ko)</li><li>Latvian (lv)</li><li>Lithuanian (lt)</li><li>Malay (ms)</li><li>Mongolian (mn)</li><li>Norwegian (no)</li><li>Norwegian Bokmal (nb)</li><li>Persian (fa)</li><li>Polish (pl)</li><li>Portuguese (Brazil) (pt-br)</li><li>Portuguese (Portugal) (pt)</li><li>Romanian (ro)</li><li>Russian (ru)</li><li>Serbian (Cyrillic) (sr)</li><li>Serbian (Latin) (sr-latn)</li><li>Slovak (sk)</li><li>Slovenian (sl)</li><li>Spanish (es)</li><li>Swedish (sv)</li><li>Thai (th)</li><li>Turkish (tr)</li><li>Ukrainian (uk)</li><li>Vietnamese (vi)</li>
 *         </ul>
 * 		</p>
     * @see #getLanguage()
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    // partialSubmit
    private boolean partialSubmit = false;
    private boolean partialSubmit_set = false;

    /**
 * <p>Whether a full or partialSubmit is used by the save button on the toolbar. partialSubmit won't be used when
 *     saveOnSubmit=true. Default value is false.</p>
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
 * <p>Whether a full or partialSubmit is used by the save button on the toolbar. partialSubmit won't be used when
 *     saveOnSubmit=true. Default value is false.</p>
     * @see #isPartialSubmit()
     */
    public void setPartialSubmit(boolean partialSubmit) {
        this.partialSubmit = partialSubmit;
        this.partialSubmit_set = true;
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

    // saveOnSubmit
    private boolean saveOnSubmit = false;
    private boolean saveOnSubmit_set = false;

    /**
 * <p>By default the data of the inputRichText will only be saved, when its 
 *         "save" button being clicked. Any other submit request will not save its
 *         data.
 *         In order to save its data on any submit request like inputText does, this 
 *         attribute can be set to true.</p>
     */
    public boolean isSaveOnSubmit() {
        if (this.saveOnSubmit_set) {
            return this.saveOnSubmit;
        }
        ValueBinding _vb = getValueBinding("saveOnSubmit");
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
 * <p>By default the data of the inputRichText will only be saved, when its 
 *         "save" button being clicked. Any other submit request will not save its
 *         data.
 *         In order to save its data on any submit request like inputText does, this 
 *         attribute can be set to true.</p>
     * @see #isSaveOnSubmit()
     */
    public void setSaveOnSubmit(boolean saveOnSubmit) {
        this.saveOnSubmit = saveOnSubmit;
        this.saveOnSubmit_set = true;
    }

    // skin
    private String skin = null;

    /**
 * <p>
 *         The following skins can be set to the component.
 *         <ul>
 *         <li> default (other synonyms silver, v2)</li>
 *         <li> office2003 </li>
 *         <li> kama </li>
 *         </ul>
 *         </p>
     */
    public String getSkin() {
        if (this.skin != null) {
            return this.skin;
        }
        ValueBinding _vb = getValueBinding("skin");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "default";
    }

    /**
 * <p>
 *         The following skins can be set to the component.
 *         <ul>
 *         <li> default (other synonyms silver, v2)</li>
 *         <li> office2003 </li>
 *         <li> kama </li>
 *         </ul>
 *         </p>
     * @see #getSkin()
     */
    public void setSkin(String skin) {
        this.skin = skin;
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
 * <p>Space-separated list of CSS style class(es) to be applied when this element is rendered. This value must be passed through as the "class" attribute on generated markup.
 *         <br/><br/>
 *         The base name for all style classes. Default value is iceInpRchTxt</p>
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
 * <p>Space-separated list of CSS style class(es) to be applied when this element is rendered. This value must be passed through as the "class" attribute on generated markup.
 *         <br/><br/>
 *         The base name for all style classes. Default value is iceInpRchTxt</p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // toolbar
    private String toolbar = null;

    /**
 * <p>There are two valid values for this field and its case sensitive.
 *         <ul>
 *             <li> Default </li>
 *             <li> Basic </li>            
 *         </ul></p>
     */
    public String getToolbar() {
        if (this.toolbar != null) {
            return this.toolbar;
        }
        ValueBinding _vb = getValueBinding("toolbar");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "Default";
    }

    /**
 * <p>There are two valid values for this field and its case sensitive.
 *         <ul>
 *             <li> Default </li>
 *             <li> Basic </li>            
 *         </ul></p>
     * @see #getToolbar()
     */
    public void setToolbar(String toolbar) {
        this.toolbar = toolbar;
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

    public void setValueChangeListener(javax.faces.el.MethodBinding valueChangeListener) {
        this.valueChangeListener = valueChangeListener;
    }

    // width
    private String width = null;

    /**
 * <p>Width.</p>
     */
    public String getWidth() {
        if (this.width != null) {
            return this.width;
        }
        ValueBinding _vb = getValueBinding("width");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "100%";
    }

    /**
 * <p>Width.</p>
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
        this.customConfigPath = (String) _values[1];
        this.disabled = ((Boolean) _values[2]).booleanValue();
        this.disabled_set = ((Boolean) _values[3]).booleanValue();
        this._for = (String) _values[4];
        this.height = (String) _values[5];
        this.id = (String) _values[6];
        this.immediate = ((Boolean) _values[7]).booleanValue();
        this.immediate_set = ((Boolean) _values[8]).booleanValue();
        this.language = (String) _values[9];
        this.partialSubmit = ((Boolean) _values[10]).booleanValue();
        this.partialSubmit_set = ((Boolean) _values[11]).booleanValue();
        this.rendered = ((Boolean) _values[12]).booleanValue();
        this.rendered_set = ((Boolean) _values[13]).booleanValue();
        this.required = ((Boolean) _values[14]).booleanValue();
        this.required_set = ((Boolean) _values[15]).booleanValue();
        this.requiredMessage = (String) _values[16];
        this.saveOnSubmit = ((Boolean) _values[17]).booleanValue();
        this.saveOnSubmit_set = ((Boolean) _values[18]).booleanValue();
        this.skin = (String) _values[19];
        this.style = (String) _values[20];
        this.styleClass = (String) _values[21];
        this.toolbar = (String) _values[22];
        this.value = (Object) _values[23];
        this.valueChangeListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[24]);
        this.width = (String) _values[25];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[26];
        _values[0] = super.saveState(_context);
        _values[1] = this.customConfigPath;
        _values[2] = this.disabled ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.disabled_set ? Boolean.TRUE : Boolean.FALSE;
        _values[4] = this._for;
        _values[5] = this.height;
        _values[6] = this.id;
        _values[7] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[9] = this.language;
        _values[10] = this.partialSubmit ? Boolean.TRUE : Boolean.FALSE;
        _values[11] = this.partialSubmit_set ? Boolean.TRUE : Boolean.FALSE;
        _values[12] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[13] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[14] = this.required ? Boolean.TRUE : Boolean.FALSE;
        _values[15] = this.required_set ? Boolean.TRUE : Boolean.FALSE;
        _values[16] = this.requiredMessage;
        _values[17] = this.saveOnSubmit ? Boolean.TRUE : Boolean.FALSE;
        _values[18] = this.saveOnSubmit_set ? Boolean.TRUE : Boolean.FALSE;
        _values[19] = this.skin;
        _values[20] = this.style;
        _values[21] = this.styleClass;
        _values[22] = this.toolbar;
        _values[23] = this.value;
        _values[24] = saveAttachedState(_context, valueChangeListener);
        _values[25] = this.width;
        return _values;
    }

}
