package org.icefaces.ace.component.growlmessages;

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
public class GrowlMessagesTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.GrowlMessagesRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.GrowlMessages";
	}
	private javax.el.ValueExpression autoHide;
	public void setAutoHide(javax.el.ValueExpression autoHide) {
		this.autoHide = autoHide;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression closeAll;
	public void setCloseAll(javax.el.ValueExpression closeAll) {
		this.closeAll = closeAll;
	}
	private javax.el.ValueExpression displayDuration;
	public void setDisplayDuration(javax.el.ValueExpression displayDuration) {
		this.displayDuration = displayDuration;
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
	private javax.el.ValueExpression header;
	public void setHeader(javax.el.ValueExpression header) {
		this.header = header;
	}
	private javax.el.ValueExpression hideEffectDuration;
	public void setHideEffectDuration(javax.el.ValueExpression hideEffectDuration) {
		this.hideEffectDuration = hideEffectDuration;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression maxVisibleMessages;
	public void setMaxVisibleMessages(javax.el.ValueExpression maxVisibleMessages) {
		this.maxVisibleMessages = maxVisibleMessages;
	}
	private javax.el.ValueExpression messageOrder;
	public void setMessageOrder(javax.el.ValueExpression messageOrder) {
		this.messageOrder = messageOrder;
	}
	private javax.el.ValueExpression messageStyleClass;
	public void setMessageStyleClass(javax.el.ValueExpression messageStyleClass) {
		this.messageStyleClass = messageStyleClass;
	}
	private javax.el.ValueExpression position;
	public void setPosition(javax.el.ValueExpression position) {
		this.position = position;
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
	private javax.el.ValueExpression showEffectDuration;
	public void setShowEffectDuration(javax.el.ValueExpression showEffectDuration) {
		this.showEffectDuration = showEffectDuration;
	}
	private javax.el.ValueExpression showSummary;
	public void setShowSummary(javax.el.ValueExpression showSummary) {
		this.showSummary = showSummary;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.growlmessages.GrowlMessagesBase _component = null;
		try {
			_component = (org.icefaces.ace.component.growlmessages.GrowlMessagesBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.growlmessages.GrowlMessagesBase");
		}
		if (autoHide != null) {
			_component.setValueExpression("autoHide", autoHide);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (closeAll != null) {
			_component.setValueExpression("closeAll", closeAll);
		}
		if (displayDuration != null) {
			_component.setValueExpression("displayDuration", displayDuration);
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
		if (header != null) {
			_component.setValueExpression("header", header);
		}
		if (hideEffectDuration != null) {
			_component.setValueExpression("hideEffectDuration", hideEffectDuration);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (maxVisibleMessages != null) {
			_component.setValueExpression("maxVisibleMessages", maxVisibleMessages);
		}
		if (messageOrder != null) {
			_component.setValueExpression("messageOrder", messageOrder);
		}
		if (messageStyleClass != null) {
			_component.setValueExpression("messageStyleClass", messageStyleClass);
		}
		if (position != null) {
			_component.setValueExpression("position", position);
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
		if (showEffectDuration != null) {
			_component.setValueExpression("showEffectDuration", showEffectDuration);
		}
		if (showSummary != null) {
			_component.setValueExpression("showSummary", showSummary);
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
		autoHide = null;
		binding = null;
		closeAll = null;
		displayDuration = null;
		escape = null;
		forValue = null;
		globalOnly = null;
		header = null;
		hideEffectDuration = null;
		id = null;
		maxVisibleMessages = null;
		messageOrder = null;
		messageStyleClass = null;
		position = null;
		redisplay = null;
		rendered = null;
		showDetail = null;
		showEffectDuration = null;
		showSummary = null;
	}
}