package org.icefaces.ace.component.messages;

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
public class MessagesTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.MessagesRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.Messages";
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression changeEffect;
	public void setChangeEffect(javax.el.ValueExpression changeEffect) {
		this.changeEffect = changeEffect;
	}
	private javax.el.ValueExpression changeEffectDuration;
	public void setChangeEffectDuration(javax.el.ValueExpression changeEffectDuration) {
		this.changeEffectDuration = changeEffectDuration;
	}
	private javax.el.ValueExpression escape;
	public void setEscape(javax.el.ValueExpression escape) {
		this.escape = escape;
	}
	private javax.el.ValueExpression forValue;
	public void setFor(javax.el.ValueExpression forValue) {
		this.forValue = forValue;
	}
	private javax.el.ValueExpression globalOnly;
	public void setGlobalOnly(javax.el.ValueExpression globalOnly) {
		this.globalOnly = globalOnly;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression initEffect;
	public void setInitEffect(javax.el.ValueExpression initEffect) {
		this.initEffect = initEffect;
	}
	private javax.el.ValueExpression initEffectDuration;
	public void setInitEffectDuration(javax.el.ValueExpression initEffectDuration) {
		this.initEffectDuration = initEffectDuration;
	}
	private javax.el.ValueExpression lang;
	public void setLang(javax.el.ValueExpression lang) {
		this.lang = lang;
	}
	private javax.el.ValueExpression redisplay;
	public void setRedisplay(javax.el.ValueExpression redisplay) {
		this.redisplay = redisplay;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression showDetail;
	public void setShowDetail(javax.el.ValueExpression showDetail) {
		this.showDetail = showDetail;
	}
	private javax.el.ValueExpression showSummary;
	public void setShowSummary(javax.el.ValueExpression showSummary) {
		this.showSummary = showSummary;
	}
	private javax.el.ValueExpression style;
	public void setStyle(javax.el.ValueExpression style) {
		this.style = style;
	}
	private javax.el.ValueExpression styleClass;
	public void setStyleClass(javax.el.ValueExpression styleClass) {
		this.styleClass = styleClass;
	}
	private javax.el.ValueExpression title;
	public void setTitle(javax.el.ValueExpression title) {
		this.title = title;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.messages.MessagesBase _component = null;
		try {
			_component = (org.icefaces.ace.component.messages.MessagesBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.messages.MessagesBase");
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (changeEffect != null) {
			_component.setValueExpression("changeEffect", changeEffect);
		}
		if (changeEffectDuration != null) {
			_component.setValueExpression("changeEffectDuration", changeEffectDuration);
		}
		if (escape != null) {
			_component.setValueExpression("escape", escape);
		}
		if (forValue != null) {
			_component.setValueExpression("for", forValue);
		}
		if (globalOnly != null) {
			_component.setValueExpression("globalOnly", globalOnly);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (initEffect != null) {
			_component.setValueExpression("initEffect", initEffect);
		}
		if (initEffectDuration != null) {
			_component.setValueExpression("initEffectDuration", initEffectDuration);
		}
		if (lang != null) {
			_component.setValueExpression("lang", lang);
		}
		if (redisplay != null) {
			_component.setValueExpression("redisplay", redisplay);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (showDetail != null) {
			_component.setValueExpression("showDetail", showDetail);
		}
		if (showSummary != null) {
			_component.setValueExpression("showSummary", showSummary);
		}
		if (style != null) {
			_component.setValueExpression("style", style);
		}
		if (styleClass != null) {
			_component.setValueExpression("styleClass", styleClass);
		}
		if (title != null) {
			_component.setValueExpression("title", title);
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
		changeEffect = null;
		changeEffectDuration = null;
		escape = null;
		forValue = null;
		globalOnly = null;
		id = null;
		initEffect = null;
		initEffectDuration = null;
		lang = null;
		redisplay = null;
		rendered = null;
		showDetail = null;
		showSummary = null;
		style = null;
		styleClass = null;
		title = null;
	}
}