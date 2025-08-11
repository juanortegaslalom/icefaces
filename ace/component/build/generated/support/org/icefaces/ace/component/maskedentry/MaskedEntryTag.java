package org.icefaces.ace.component.maskedentry;

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
public class MaskedEntryTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.MaskedEntryRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.MaskedEntry";
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
	private javax.el.ValueExpression mask;
	public void setMask(javax.el.ValueExpression mask) {
		this.mask = mask;
	}
	private javax.el.ValueExpression maxlength;
	public void setMaxlength(javax.el.ValueExpression maxlength) {
		this.maxlength = maxlength;
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
	private javax.el.ValueExpression placeHolder;
	public void setPlaceHolder(javax.el.ValueExpression placeHolder) {
		this.placeHolder = placeHolder;
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
	private javax.el.ValueExpression widgetVar;
	public void setWidgetVar(javax.el.ValueExpression widgetVar) {
		this.widgetVar = widgetVar;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.maskedentry.MaskedEntryBase _component = null;
		try {
			_component = (org.icefaces.ace.component.maskedentry.MaskedEntryBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.maskedentry.MaskedEntryBase");
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
		if (mask != null) {
			_component.setValueExpression("mask", mask);
		}
		if (maxlength != null) {
			_component.setValueExpression("maxlength", maxlength);
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
		if (placeHolder != null) {
			_component.setValueExpression("placeHolder", placeHolder);
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
		if (widgetVar != null) {
			_component.setValueExpression("widgetVar", widgetVar);
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
		converter = null;
		converterMessage = null;
		dir = null;
		disabled = null;
		id = null;
		immediate = null;
		indicatorPosition = null;
		label = null;
		labelPosition = null;
		lang = null;
		mask = null;
		maxlength = null;
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
		placeHolder = null;
		readonly = null;
		rendered = null;
		required = null;
		requiredIndicator = null;
		requiredMessage = null;
		size = null;
		style = null;
		styleClass = null;
		tabindex = null;
		title = null;
		validator = null;
		validatorMessage = null;
		value = null;
		valueChangeListener = null;
		widgetVar = null;
	}
}