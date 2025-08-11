package org.icefaces.ace.component.autocompleteentry;

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
public class AutoCompleteEntryTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.AutoCompleteEntryRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.AutoCompleteEntry";
	}
	private javax.el.ValueExpression accesskey;
	public void setAccesskey(javax.el.ValueExpression accesskey) {
		this.accesskey = accesskey;
	}
	private javax.el.ValueExpression alt;
	public void setAlt(javax.el.ValueExpression alt) {
		this.alt = alt;
	}
	private javax.el.ValueExpression autocomplete;
	public void setAutocomplete(javax.el.ValueExpression autocomplete) {
		this.autocomplete = autocomplete;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression caseSensitive;
	public void setCaseSensitive(javax.el.ValueExpression caseSensitive) {
		this.caseSensitive = caseSensitive;
	}
	private javax.el.ValueExpression clientSide;
	public void setClientSide(javax.el.ValueExpression clientSide) {
		this.clientSide = clientSide;
	}
	private javax.el.ValueExpression converter;
	public void setConverter(javax.el.ValueExpression converter) {
		this.converter = converter;
	}
	private javax.el.ValueExpression converterMessage;
	public void setConverterMessage(javax.el.ValueExpression converterMessage) {
		this.converterMessage = converterMessage;
	}
	private javax.el.ValueExpression delay;
	public void setDelay(javax.el.ValueExpression delay) {
		this.delay = delay;
	}
	private javax.el.ValueExpression dir;
	public void setDir(javax.el.ValueExpression dir) {
		this.dir = dir;
	}
	private javax.el.ValueExpression direction;
	public void setDirection(javax.el.ValueExpression direction) {
		this.direction = direction;
	}
	private javax.el.ValueExpression disabled;
	public void setDisabled(javax.el.ValueExpression disabled) {
		this.disabled = disabled;
	}
	private javax.el.ValueExpression filterBy;
	public void setFilterBy(javax.el.ValueExpression filterBy) {
		this.filterBy = filterBy;
	}
	private javax.el.ValueExpression filterMatchMode;
	public void setFilterMatchMode(javax.el.ValueExpression filterMatchMode) {
		this.filterMatchMode = filterMatchMode;
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
	private javax.el.ValueExpression maxlength;
	public void setMaxlength(javax.el.ValueExpression maxlength) {
		this.maxlength = maxlength;
	}
	private javax.el.ValueExpression minChars;
	public void setMinChars(javax.el.ValueExpression minChars) {
		this.minChars = minChars;
	}
	private javax.el.ValueExpression onblur;
	public void setOnblur(javax.el.ValueExpression onblur) {
		this.onblur = onblur;
	}
	private javax.el.ValueExpression onchange;
	public void setOnchange(javax.el.ValueExpression onchange) {
		this.onchange = onchange;
	}
	private javax.el.ValueExpression onclick;
	public void setOnclick(javax.el.ValueExpression onclick) {
		this.onclick = onclick;
	}
	private javax.el.ValueExpression ondblclick;
	public void setOndblclick(javax.el.ValueExpression ondblclick) {
		this.ondblclick = ondblclick;
	}
	private javax.el.ValueExpression onfocus;
	public void setOnfocus(javax.el.ValueExpression onfocus) {
		this.onfocus = onfocus;
	}
	private javax.el.ValueExpression onkeydown;
	public void setOnkeydown(javax.el.ValueExpression onkeydown) {
		this.onkeydown = onkeydown;
	}
	private javax.el.ValueExpression onkeypress;
	public void setOnkeypress(javax.el.ValueExpression onkeypress) {
		this.onkeypress = onkeypress;
	}
	private javax.el.ValueExpression onkeyup;
	public void setOnkeyup(javax.el.ValueExpression onkeyup) {
		this.onkeyup = onkeyup;
	}
	private javax.el.ValueExpression onmousedown;
	public void setOnmousedown(javax.el.ValueExpression onmousedown) {
		this.onmousedown = onmousedown;
	}
	private javax.el.ValueExpression onmousemove;
	public void setOnmousemove(javax.el.ValueExpression onmousemove) {
		this.onmousemove = onmousemove;
	}
	private javax.el.ValueExpression onmouseout;
	public void setOnmouseout(javax.el.ValueExpression onmouseout) {
		this.onmouseout = onmouseout;
	}
	private javax.el.ValueExpression onmouseover;
	public void setOnmouseover(javax.el.ValueExpression onmouseover) {
		this.onmouseover = onmouseover;
	}
	private javax.el.ValueExpression onmouseup;
	public void setOnmouseup(javax.el.ValueExpression onmouseup) {
		this.onmouseup = onmouseup;
	}
	private javax.el.ValueExpression onselect;
	public void setOnselect(javax.el.ValueExpression onselect) {
		this.onselect = onselect;
	}
	private javax.el.ValueExpression optionalIndicator;
	public void setOptionalIndicator(javax.el.ValueExpression optionalIndicator) {
		this.optionalIndicator = optionalIndicator;
	}
	private javax.el.ValueExpression placeholder;
	public void setPlaceholder(javax.el.ValueExpression placeholder) {
		this.placeholder = placeholder;
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
	private javax.el.ValueExpression rows;
	public void setRows(javax.el.ValueExpression rows) {
		this.rows = rows;
	}
	private javax.el.ValueExpression showEffect;
	public void setShowEffect(javax.el.ValueExpression showEffect) {
		this.showEffect = showEffect;
	}
	private javax.el.ValueExpression showEffectLength;
	public void setShowEffectLength(javax.el.ValueExpression showEffectLength) {
		this.showEffectLength = showEffectLength;
	}
	private javax.el.ValueExpression size;
	public void setSize(javax.el.ValueExpression size) {
		this.size = size;
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
	private javax.el.MethodExpression textChangeListener;
	public void setTextChangeListener(javax.el.MethodExpression textChangeListener) {
		this.textChangeListener = textChangeListener;
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
		org.icefaces.ace.component.autocompleteentry.AutoCompleteEntryBase _component = null;
		try {
			_component = (org.icefaces.ace.component.autocompleteentry.AutoCompleteEntryBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.autocompleteentry.AutoCompleteEntryBase");
		}
		if (accesskey != null) {
			_component.setValueExpression("accesskey", accesskey);
		}
		if (alt != null) {
			_component.setValueExpression("alt", alt);
		}
		if (autocomplete != null) {
			_component.setValueExpression("autocomplete", autocomplete);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (caseSensitive != null) {
			_component.setValueExpression("caseSensitive", caseSensitive);
		}
		if (clientSide != null) {
			_component.setValueExpression("clientSide", clientSide);
		}
		if (converter != null) {
			_component.setValueExpression("converter", converter);
		}
		if (converterMessage != null) {
			_component.setValueExpression("converterMessage", converterMessage);
		}
		if (delay != null) {
			_component.setValueExpression("delay", delay);
		}
		if (dir != null) {
			_component.setValueExpression("dir", dir);
		}
		if (direction != null) {
			_component.setValueExpression("direction", direction);
		}
		if (disabled != null) {
			_component.setValueExpression("disabled", disabled);
		}
		if (filterBy != null) {
			_component.setValueExpression("filterBy", filterBy);
		}
		if (filterMatchMode != null) {
			_component.setValueExpression("filterMatchMode", filterMatchMode);
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
		if (maxlength != null) {
			_component.setValueExpression("maxlength", maxlength);
		}
		if (minChars != null) {
			_component.setValueExpression("minChars", minChars);
		}
		if (onblur != null) {
			_component.setValueExpression("onblur", onblur);
		}
		if (onchange != null) {
			_component.setValueExpression("onchange", onchange);
		}
		if (onclick != null) {
			_component.setValueExpression("onclick", onclick);
		}
		if (ondblclick != null) {
			_component.setValueExpression("ondblclick", ondblclick);
		}
		if (onfocus != null) {
			_component.setValueExpression("onfocus", onfocus);
		}
		if (onkeydown != null) {
			_component.setValueExpression("onkeydown", onkeydown);
		}
		if (onkeypress != null) {
			_component.setValueExpression("onkeypress", onkeypress);
		}
		if (onkeyup != null) {
			_component.setValueExpression("onkeyup", onkeyup);
		}
		if (onmousedown != null) {
			_component.setValueExpression("onmousedown", onmousedown);
		}
		if (onmousemove != null) {
			_component.setValueExpression("onmousemove", onmousemove);
		}
		if (onmouseout != null) {
			_component.setValueExpression("onmouseout", onmouseout);
		}
		if (onmouseover != null) {
			_component.setValueExpression("onmouseover", onmouseover);
		}
		if (onmouseup != null) {
			_component.setValueExpression("onmouseup", onmouseup);
		}
		if (onselect != null) {
			_component.setValueExpression("onselect", onselect);
		}
		if (optionalIndicator != null) {
			_component.setValueExpression("optionalIndicator", optionalIndicator);
		}
		if (placeholder != null) {
			_component.setValueExpression("placeholder", placeholder);
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
		if (rows != null) {
			_component.setValueExpression("rows", rows);
		}
		if (showEffect != null) {
			_component.setValueExpression("showEffect", showEffect);
		}
		if (showEffectLength != null) {
			_component.setValueExpression("showEffectLength", showEffectLength);
		}
		if (size != null) {
			_component.setValueExpression("size", size);
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
		if (textChangeListener != null) {
			_component.setTextChangeListener(textChangeListener);
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
		accesskey = null;
		alt = null;
		autocomplete = null;
		binding = null;
		caseSensitive = null;
		clientSide = null;
		converter = null;
		converterMessage = null;
		delay = null;
		dir = null;
		direction = null;
		disabled = null;
		filterBy = null;
		filterMatchMode = null;
		height = null;
		hideEffect = null;
		hideEffectLength = null;
		id = null;
		immediate = null;
		indicatorPosition = null;
		label = null;
		labelPosition = null;
		lang = null;
		listValue = null;
		listVar = null;
		maxlength = null;
		minChars = null;
		onblur = null;
		onchange = null;
		onclick = null;
		ondblclick = null;
		onfocus = null;
		onkeydown = null;
		onkeypress = null;
		onkeyup = null;
		onmousedown = null;
		onmousemove = null;
		onmouseout = null;
		onmouseover = null;
		onmouseup = null;
		onselect = null;
		optionalIndicator = null;
		placeholder = null;
		readonly = null;
		rendered = null;
		required = null;
		requiredIndicator = null;
		requiredMessage = null;
		rows = null;
		showEffect = null;
		showEffectLength = null;
		size = null;
		style = null;
		styleClass = null;
		tabindex = null;
		textChangeListener = null;
		title = null;
		validator = null;
		validatorMessage = null;
		value = null;
		valueChangeListener = null;
		width = null;
	}
}