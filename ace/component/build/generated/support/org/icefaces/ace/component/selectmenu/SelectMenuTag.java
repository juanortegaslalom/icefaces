package org.icefaces.ace.component.selectmenu;

import java.io.IOException;
import javax.el.*;
import javax.faces.*;
import javax.faces.component.*;
import javax.faces.context.*;
import javax.faces.convert.*;
import javax.faces.el.*;
import javax.faces.event.*;
import javax.faces.validator.*;
import javax.faces.webapp.*;
import javax.servlet.jsp.JspException;

/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */
public class SelectMenuTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.SelectMenuRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.SelectMenu";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression converter;
	public void setConverter(javax.el.ValueExpression converter) {
		this.converter = converter;
	}
	private javax.el.ValueExpression converterMessage;
	public void setConverterMessage(javax.el.ValueExpression converterMessage) {
		this.converterMessage = converterMessage;
	}
	private javax.el.ValueExpression dir;
	public void setDir(javax.el.ValueExpression dir) {
		this.dir = dir;
	}
	private javax.el.ValueExpression disabled;
	public void setDisabled(javax.el.ValueExpression disabled) {
		this.disabled = disabled;
	}
	private javax.el.ValueExpression height;
	public void setHeight(javax.el.ValueExpression height) {
		this.height = height;
	}
	private javax.el.ValueExpression hideEffect;
	public void setHideEffect(javax.el.ValueExpression hideEffect) {
		this.hideEffect = hideEffect;
	}
	private javax.el.ValueExpression hideEffectLength;
	public void setHideEffectLength(javax.el.ValueExpression hideEffectLength) {
		this.hideEffectLength = hideEffectLength;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression immediate;
	public void setImmediate(javax.el.ValueExpression immediate) {
		this.immediate = immediate;
	}
	private javax.el.ValueExpression indicatorPosition;
	public void setIndicatorPosition(javax.el.ValueExpression indicatorPosition) {
		this.indicatorPosition = indicatorPosition;
	}
	private javax.el.ValueExpression itemDisabled;
	public void setItemDisabled(javax.el.ValueExpression itemDisabled) {
		this.itemDisabled = itemDisabled;
	}
	private javax.el.ValueExpression itemValue;
	public void setItemValue(javax.el.ValueExpression itemValue) {
		this.itemValue = itemValue;
	}
	private javax.el.ValueExpression label;
	public void setLabel(javax.el.ValueExpression label) {
		this.label = label;
	}
	private javax.el.ValueExpression labelPosition;
	public void setLabelPosition(javax.el.ValueExpression labelPosition) {
		this.labelPosition = labelPosition;
	}
	private javax.el.ValueExpression lang;
	public void setLang(javax.el.ValueExpression lang) {
		this.lang = lang;
	}
	private javax.el.ValueExpression listValue;
	public void setListValue(javax.el.ValueExpression listValue) {
		this.listValue = listValue;
	}
	private javax.el.ValueExpression listVar;
	public void setListVar(javax.el.ValueExpression listVar) {
		this.listVar = listVar;
	}
	private javax.el.ValueExpression optionalIndicator;
	public void setOptionalIndicator(javax.el.ValueExpression optionalIndicator) {
		this.optionalIndicator = optionalIndicator;
	}
	private javax.el.ValueExpression readonly;
	public void setReadonly(javax.el.ValueExpression readonly) {
		this.readonly = readonly;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression required;
	public void setRequired(javax.el.ValueExpression required) {
		this.required = required;
	}
	private javax.el.ValueExpression requiredIndicator;
	public void setRequiredIndicator(javax.el.ValueExpression requiredIndicator) {
		this.requiredIndicator = requiredIndicator;
	}
	private javax.el.ValueExpression requiredMessage;
	public void setRequiredMessage(javax.el.ValueExpression requiredMessage) {
		this.requiredMessage = requiredMessage;
	}
	private javax.el.ValueExpression showEffect;
	public void setShowEffect(javax.el.ValueExpression showEffect) {
		this.showEffect = showEffect;
	}
	private javax.el.ValueExpression showEffectLength;
	public void setShowEffectLength(javax.el.ValueExpression showEffectLength) {
		this.showEffectLength = showEffectLength;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
	}
	private javax.el.ValueExpression tabindex;
	public void setTabindex(javax.el.ValueExpression tabindex) {
		this.tabindex = tabindex;
	}
	private javax.el.ValueExpression title;
	public void setTitle(javax.el.ValueExpression title) {
		this.title = title;
	}
	private javax.el.MethodExpression validator;
	public void setValidator(javax.el.MethodExpression validator) {
		this.validator = validator;
	}
	private javax.el.ValueExpression validatorMessage;
	public void setValidatorMessage(javax.el.ValueExpression validatorMessage) {
		this.validatorMessage = validatorMessage;
	}
	private javax.el.ValueExpression value;
	public void setValue(javax.el.ValueExpression value) {
		this.value = value;
	}
	private javax.el.MethodExpression valueChangeListener;
	public void setValueChangeListener(javax.el.MethodExpression valueChangeListener) {
		this.valueChangeListener = valueChangeListener;
	}
	private javax.el.ValueExpression width;
	public void setWidth(javax.el.ValueExpression width) {
		this.width = width;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.selectmenu.SelectMenuBase _component = null;
		try {
			_component = (org.icefaces.ace.component.selectmenu.SelectMenuBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.selectmenu.SelectMenuBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (converter != null) {
			_component.setValueExpression("converter", converter);
		}
		if (converterMessage != null) {
			_component.setValueExpression("converterMessage", converterMessage);
		}
		if (dir != null) {
			_component.setValueExpression("dir", dir);
		}
		if (disabled != null) {
			_component.setValueExpression("disabled", disabled);
		}
		if (height != null) {
			_component.setValueExpression("height", height);
		}
		if (hideEffect != null) {
			_component.setValueExpression("hideEffect", hideEffect);
		}
		if (hideEffectLength != null) {
			_component.setValueExpression("hideEffectLength", hideEffectLength);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (immediate != null) {
			_component.setValueExpression("immediate", immediate);
		}
		if (indicatorPosition != null) {
			_component.setValueExpression("indicatorPosition", indicatorPosition);
		}
		if (itemDisabled != null) {
			_component.setValueExpression("itemDisabled", itemDisabled);
		}
		if (itemValue != null) {
			_component.setValueExpression("itemValue", itemValue);
		}
		if (label != null) {
			_component.setValueExpression("label", label);
		}
		if (labelPosition != null) {
			_component.setValueExpression("labelPosition", labelPosition);
		}
		if (lang != null) {
			_component.setValueExpression("lang", lang);
		}
		if (listValue != null) {
			_component.setValueExpression("listValue", listValue);
		}
		if (listVar != null) {
			_component.setValueExpression("listVar", listVar);
		}
		if (optionalIndicator != null) {
			_component.setValueExpression("optionalIndicator", optionalIndicator);
		}
		if (readonly != null) {
			_component.setValueExpression("readonly", readonly);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (required != null) {
			_component.setValueExpression("required", required);
		}
		if (requiredIndicator != null) {
			_component.setValueExpression("requiredIndicator", requiredIndicator);
		}
		if (requiredMessage != null) {
			_component.setValueExpression("requiredMessage", requiredMessage);
		}
		if (showEffect != null) {
			_component.setValueExpression("showEffect", showEffect);
		}
		if (showEffectLength != null) {
			_component.setValueExpression("showEffectLength", showEffectLength);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (styleClass != null) {
			_component.setValueExpression("styleClass", styleClass);
		}
		if (tabindex != null) {
			_component.setValueExpression("tabindex", tabindex);
		}
		if (title != null) {
			_component.setValueExpression("title", title);
		}
		if (validator != null) {
			_component.addValidator(new MethodExpressionValidator(valueChangeListener));
		}
		if (validatorMessage != null) {
			_component.setValueExpression("validatorMessage", validatorMessage);
		}
		if (value != null) {
			_component.setValueExpression("value", value);
		}
		if (valueChangeListener != null) {
			_component.addValueChangeListener(new MethodExpressionValueChangeListener(valueChangeListener));
		}
		if (width != null) {
			_component.setValueExpression("width", width);
		}
	}

	public int doStartTag() throws JspException {
		try {
			return super.doStartTag();
		} catch (Exception e) {
			Throwable root = e;			
			while (root.getCause() != null) {
				root = root.getCause();
			}
			throw new JspException(root);
		}
	}

	public int doEndTag() throws JspException {
		try {
			return super.doEndTag();
		} catch (Exception e) {
			Throwable root = e;			
			while (root.getCause() != null) {
				root = root.getCause();
			}
			throw new JspException(root);
		}
	}
	/**
	 * <p>Release any allocated tag handler attributes.</p>
 	 */
	public void release() {
		super.release();
		binding = null;
		converter = null;
		converterMessage = null;
		dir = null;
		disabled = null;
		height = null;
		hideEffect = null;
		hideEffectLength = null;
		id = null;
		immediate = null;
		indicatorPosition = null;
		itemDisabled = null;
		itemValue = null;
		label = null;
		labelPosition = null;
		lang = null;
		listValue = null;
		listVar = null;
		optionalIndicator = null;
		readonly = null;
		rendered = null;
		required = null;
		requiredIndicator = null;
		requiredMessage = null;
		showEffect = null;
		showEffectLength = null;
		style = null;
		styleClass = null;
		tabindex = null;
		title = null;
		validator = null;
		validatorMessage = null;
		value = null;
		valueChangeListener = null;
		width = null;
	}
}