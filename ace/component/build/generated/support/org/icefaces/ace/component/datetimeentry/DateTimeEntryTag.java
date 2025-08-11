package org.icefaces.ace.component.datetimeentry;

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
public class DateTimeEntryTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.DateTimeEntryRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.DateTimeEntry";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression buttonText;
	public void setButtonText(javax.el.ValueExpression buttonText) {
		this.buttonText = buttonText;
	}
	private javax.el.ValueExpression converter;
	public void setConverter(javax.el.ValueExpression converter) {
		this.converter = converter;
	}
	private javax.el.ValueExpression converterMessage;
	public void setConverterMessage(javax.el.ValueExpression converterMessage) {
		this.converterMessage = converterMessage;
	}
	private javax.el.ValueExpression disableHoverStyling;
	public void setDisableHoverStyling(javax.el.ValueExpression disableHoverStyling) {
		this.disableHoverStyling = disableHoverStyling;
	}
	private javax.el.ValueExpression disabled;
	public void setDisabled(javax.el.ValueExpression disabled) {
		this.disabled = disabled;
	}
	private javax.el.ValueExpression effect;
	public void setEffect(javax.el.ValueExpression effect) {
		this.effect = effect;
	}
	private javax.el.ValueExpression effectDuration;
	public void setEffectDuration(javax.el.ValueExpression effectDuration) {
		this.effectDuration = effectDuration;
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
	private javax.el.ValueExpression leftMonthOffset;
	public void setLeftMonthOffset(javax.el.ValueExpression leftMonthOffset) {
		this.leftMonthOffset = leftMonthOffset;
	}
	private javax.el.ValueExpression lenientParsing;
	public void setLenientParsing(javax.el.ValueExpression lenientParsing) {
		this.lenientParsing = lenientParsing;
	}
	private javax.el.ValueExpression locale;
	public void setLocale(javax.el.ValueExpression locale) {
		this.locale = locale;
	}
	private javax.el.ValueExpression maxHour;
	public void setMaxHour(javax.el.ValueExpression maxHour) {
		this.maxHour = maxHour;
	}
	private javax.el.ValueExpression maxMinute;
	public void setMaxMinute(javax.el.ValueExpression maxMinute) {
		this.maxMinute = maxMinute;
	}
	private javax.el.ValueExpression maxSecond;
	public void setMaxSecond(javax.el.ValueExpression maxSecond) {
		this.maxSecond = maxSecond;
	}
	private javax.el.ValueExpression maxdate;
	public void setMaxdate(javax.el.ValueExpression maxdate) {
		this.maxdate = maxdate;
	}
	private javax.el.ValueExpression maxlength;
	public void setMaxlength(javax.el.ValueExpression maxlength) {
		this.maxlength = maxlength;
	}
	private javax.el.ValueExpression minHour;
	public void setMinHour(javax.el.ValueExpression minHour) {
		this.minHour = minHour;
	}
	private javax.el.ValueExpression minMinute;
	public void setMinMinute(javax.el.ValueExpression minMinute) {
		this.minMinute = minMinute;
	}
	private javax.el.ValueExpression minSecond;
	public void setMinSecond(javax.el.ValueExpression minSecond) {
		this.minSecond = minSecond;
	}
	private javax.el.ValueExpression mindate;
	public void setMindate(javax.el.ValueExpression mindate) {
		this.mindate = mindate;
	}
	private javax.el.ValueExpression navigator;
	public void setNavigator(javax.el.ValueExpression navigator) {
		this.navigator = navigator;
	}
	private javax.el.ValueExpression optionalIndicator;
	public void setOptionalIndicator(javax.el.ValueExpression optionalIndicator) {
		this.optionalIndicator = optionalIndicator;
	}
	private javax.el.ValueExpression pages;
	public void setPages(javax.el.ValueExpression pages) {
		this.pages = pages;
	}
	private javax.el.ValueExpression pattern;
	public void setPattern(javax.el.ValueExpression pattern) {
		this.pattern = pattern;
	}
	private javax.el.ValueExpression popupIcon;
	public void setPopupIcon(javax.el.ValueExpression popupIcon) {
		this.popupIcon = popupIcon;
	}
	private javax.el.ValueExpression popupIconOnly;
	public void setPopupIconOnly(javax.el.ValueExpression popupIconOnly) {
		this.popupIconOnly = popupIconOnly;
	}
	private javax.el.ValueExpression readOnlyInputText;
	public void setReadOnlyInputText(javax.el.ValueExpression readOnlyInputText) {
		this.readOnlyInputText = readOnlyInputText;
	}
	private javax.el.ValueExpression readonly;
	public void setReadonly(javax.el.ValueExpression readonly) {
		this.readonly = readonly;
	}
	private javax.el.ValueExpression renderAsPopup;
	public void setRenderAsPopup(javax.el.ValueExpression renderAsPopup) {
		this.renderAsPopup = renderAsPopup;
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
	private javax.el.ValueExpression selectOtherMonths;
	public void setSelectOtherMonths(javax.el.ValueExpression selectOtherMonths) {
		this.selectOtherMonths = selectOtherMonths;
	}
	private javax.el.ValueExpression showButtonPanel;
	public void setShowButtonPanel(javax.el.ValueExpression showButtonPanel) {
		this.showButtonPanel = showButtonPanel;
	}
	private javax.el.ValueExpression showOn;
	public void setShowOn(javax.el.ValueExpression showOn) {
		this.showOn = showOn;
	}
	private javax.el.ValueExpression showOtherMonths;
	public void setShowOtherMonths(javax.el.ValueExpression showOtherMonths) {
		this.showOtherMonths = showOtherMonths;
	}
	private javax.el.ValueExpression showWeek;
	public void setShowWeek(javax.el.ValueExpression showWeek) {
		this.showWeek = showWeek;
	}
	private javax.el.ValueExpression singleSubmit;
	public void setSingleSubmit(javax.el.ValueExpression singleSubmit) {
		this.singleSubmit = singleSubmit;
	}
	private javax.el.ValueExpression size;
	public void setSize(javax.el.ValueExpression size) {
		this.size = size;
	}
	private javax.el.ValueExpression stepHour;
	public void setStepHour(javax.el.ValueExpression stepHour) {
		this.stepHour = stepHour;
	}
	private javax.el.ValueExpression stepMinute;
	public void setStepMinute(javax.el.ValueExpression stepMinute) {
		this.stepMinute = stepMinute;
	}
	private javax.el.ValueExpression stepSecond;
	public void setStepSecond(javax.el.ValueExpression stepSecond) {
		this.stepSecond = stepSecond;
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
	private javax.el.ValueExpression timeOnly;
	public void setTimeOnly(javax.el.ValueExpression timeOnly) {
		this.timeOnly = timeOnly;
	}
	private javax.el.ValueExpression timeZone;
	public void setTimeZone(javax.el.ValueExpression timeZone) {
		this.timeZone = timeZone;
	}
	private javax.el.ValueExpression todayNowButtonsAlsoSelect;
	public void setTodayNowButtonsAlsoSelect(javax.el.ValueExpression todayNowButtonsAlsoSelect) {
		this.todayNowButtonsAlsoSelect = todayNowButtonsAlsoSelect;
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
	private javax.el.ValueExpression yearRange;
	public void setYearRange(javax.el.ValueExpression yearRange) {
		this.yearRange = yearRange;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.datetimeentry.DateTimeEntryBase _component = null;
		try {
			_component = (org.icefaces.ace.component.datetimeentry.DateTimeEntryBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.datetimeentry.DateTimeEntryBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (buttonText != null) {
			_component.setValueExpression("buttonText", buttonText);
		}
		if (converter != null) {
			_component.setValueExpression("converter", converter);
		}
		if (converterMessage != null) {
			_component.setValueExpression("converterMessage", converterMessage);
		}
		if (disableHoverStyling != null) {
			_component.setValueExpression("disableHoverStyling", disableHoverStyling);
		}
		if (disabled != null) {
			_component.setValueExpression("disabled", disabled);
		}
		if (effect != null) {
			_component.setValueExpression("effect", effect);
		}
		if (effectDuration != null) {
			_component.setValueExpression("effectDuration", effectDuration);
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
		if (leftMonthOffset != null) {
			_component.setValueExpression("leftMonthOffset", leftMonthOffset);
		}
		if (lenientParsing != null) {
			_component.setValueExpression("lenientParsing", lenientParsing);
		}
		if (locale != null) {
			_component.setValueExpression("locale", locale);
		}
		if (maxHour != null) {
			_component.setValueExpression("maxHour", maxHour);
		}
		if (maxMinute != null) {
			_component.setValueExpression("maxMinute", maxMinute);
		}
		if (maxSecond != null) {
			_component.setValueExpression("maxSecond", maxSecond);
		}
		if (maxdate != null) {
			_component.setValueExpression("maxdate", maxdate);
		}
		if (maxlength != null) {
			_component.setValueExpression("maxlength", maxlength);
		}
		if (minHour != null) {
			_component.setValueExpression("minHour", minHour);
		}
		if (minMinute != null) {
			_component.setValueExpression("minMinute", minMinute);
		}
		if (minSecond != null) {
			_component.setValueExpression("minSecond", minSecond);
		}
		if (mindate != null) {
			_component.setValueExpression("mindate", mindate);
		}
		if (navigator != null) {
			_component.setValueExpression("navigator", navigator);
		}
		if (optionalIndicator != null) {
			_component.setValueExpression("optionalIndicator", optionalIndicator);
		}
		if (pages != null) {
			_component.setValueExpression("pages", pages);
		}
		if (pattern != null) {
			_component.setValueExpression("pattern", pattern);
		}
		if (popupIcon != null) {
			_component.setValueExpression("popupIcon", popupIcon);
		}
		if (popupIconOnly != null) {
			_component.setValueExpression("popupIconOnly", popupIconOnly);
		}
		if (readOnlyInputText != null) {
			_component.setValueExpression("readOnlyInputText", readOnlyInputText);
		}
		if (readonly != null) {
			_component.setValueExpression("readonly", readonly);
		}
		if (renderAsPopup != null) {
			_component.setValueExpression("renderAsPopup", renderAsPopup);
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
		if (selectOtherMonths != null) {
			_component.setValueExpression("selectOtherMonths", selectOtherMonths);
		}
		if (showButtonPanel != null) {
			_component.setValueExpression("showButtonPanel", showButtonPanel);
		}
		if (showOn != null) {
			_component.setValueExpression("showOn", showOn);
		}
		if (showOtherMonths != null) {
			_component.setValueExpression("showOtherMonths", showOtherMonths);
		}
		if (showWeek != null) {
			_component.setValueExpression("showWeek", showWeek);
		}
		if (singleSubmit != null) {
			_component.setValueExpression("singleSubmit", singleSubmit);
		}
		if (size != null) {
			_component.setValueExpression("size", size);
		}
		if (stepHour != null) {
			_component.setValueExpression("stepHour", stepHour);
		}
		if (stepMinute != null) {
			_component.setValueExpression("stepMinute", stepMinute);
		}
		if (stepSecond != null) {
			_component.setValueExpression("stepSecond", stepSecond);
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
		if (timeOnly != null) {
			_component.setValueExpression("timeOnly", timeOnly);
		}
		if (timeZone != null) {
			_component.setValueExpression("timeZone", timeZone);
		}
		if (todayNowButtonsAlsoSelect != null) {
			_component.setValueExpression("todayNowButtonsAlsoSelect", todayNowButtonsAlsoSelect);
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
		if (yearRange != null) {
			_component.setValueExpression("yearRange", yearRange);
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
		buttonText = null;
		converter = null;
		converterMessage = null;
		disableHoverStyling = null;
		disabled = null;
		effect = null;
		effectDuration = null;
		id = null;
		immediate = null;
		indicatorPosition = null;
		label = null;
		labelPosition = null;
		leftMonthOffset = null;
		lenientParsing = null;
		locale = null;
		maxHour = null;
		maxMinute = null;
		maxSecond = null;
		maxdate = null;
		maxlength = null;
		minHour = null;
		minMinute = null;
		minSecond = null;
		mindate = null;
		navigator = null;
		optionalIndicator = null;
		pages = null;
		pattern = null;
		popupIcon = null;
		popupIconOnly = null;
		readOnlyInputText = null;
		readonly = null;
		renderAsPopup = null;
		rendered = null;
		required = null;
		requiredIndicator = null;
		requiredMessage = null;
		selectOtherMonths = null;
		showButtonPanel = null;
		showOn = null;
		showOtherMonths = null;
		showWeek = null;
		singleSubmit = null;
		size = null;
		stepHour = null;
		stepMinute = null;
		stepSecond = null;
		style = null;
		styleClass = null;
		tabindex = null;
		timeOnly = null;
		timeZone = null;
		todayNowButtonsAlsoSelect = null;
		validator = null;
		validatorMessage = null;
		value = null;
		valueChangeListener = null;
		widgetVar = null;
		yearRange = null;
	}
}