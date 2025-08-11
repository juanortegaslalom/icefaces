package org.icefaces.ace.component.fileentry;

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
public class FileEntryTag extends javax.faces.webapp.UIComponentELTag {
	public String getRendererType() {
		return "org.icefaces.ace.component.FileEntryRenderer";
	}
	public String getComponentType() {
		return "org.icefaces.ace.component.FileEntry";
	}
	private javax.el.ValueExpression absolutePath;
	public void setAbsolutePath(javax.el.ValueExpression absolutePath) {
		this.absolutePath = absolutePath;
	}
	private javax.el.ValueExpression autoUpload;
	public void setAutoUpload(javax.el.ValueExpression autoUpload) {
		this.autoUpload = autoUpload;
	}
	private javax.el.ValueExpression binding;
	public void setBinding(javax.el.ValueExpression binding) {
		this.binding = binding;
	}
	private javax.el.ValueExpression callback;
	public void setCallback(javax.el.ValueExpression callback) {
		this.callback = callback;
	}
	private javax.el.ValueExpression disabled;
	public void setDisabled(javax.el.ValueExpression disabled) {
		this.disabled = disabled;
	}
	private javax.el.MethodExpression fileEntryListener;
	public void setFileEntryListener(javax.el.MethodExpression fileEntryListener) {
		this.fileEntryListener = fileEntryListener;
	}
	private javax.el.ValueExpression id;
	public void setId(javax.el.ValueExpression id) {
		this.id = id;
	}
	private javax.el.ValueExpression immediate;
	public void setImmediate(javax.el.ValueExpression immediate) {
		this.immediate = immediate;
	}
	private javax.el.ValueExpression immediateValidation;
	public void setImmediateValidation(javax.el.ValueExpression immediateValidation) {
		this.immediateValidation = immediateValidation;
	}
	private javax.el.ValueExpression label;
	public void setLabel(javax.el.ValueExpression label) {
		this.label = label;
	}
	private javax.el.ValueExpression maxFileCount;
	public void setMaxFileCount(javax.el.ValueExpression maxFileCount) {
		this.maxFileCount = maxFileCount;
	}
	private javax.el.ValueExpression maxFileCountMessage;
	public void setMaxFileCountMessage(javax.el.ValueExpression maxFileCountMessage) {
		this.maxFileCountMessage = maxFileCountMessage;
	}
	private javax.el.ValueExpression maxFileSize;
	public void setMaxFileSize(javax.el.ValueExpression maxFileSize) {
		this.maxFileSize = maxFileSize;
	}
	private javax.el.ValueExpression maxFileSizeMessage;
	public void setMaxFileSizeMessage(javax.el.ValueExpression maxFileSizeMessage) {
		this.maxFileSizeMessage = maxFileSizeMessage;
	}
	private javax.el.ValueExpression maxTotalSize;
	public void setMaxTotalSize(javax.el.ValueExpression maxTotalSize) {
		this.maxTotalSize = maxTotalSize;
	}
	private javax.el.ValueExpression maxTotalSizeMessage;
	public void setMaxTotalSizeMessage(javax.el.ValueExpression maxTotalSizeMessage) {
		this.maxTotalSizeMessage = maxTotalSizeMessage;
	}
	private javax.el.ValueExpression messagePersistence;
	public void setMessagePersistence(javax.el.ValueExpression messagePersistence) {
		this.messagePersistence = messagePersistence;
	}
	private javax.el.ValueExpression multiple;
	public void setMultiple(javax.el.ValueExpression multiple) {
		this.multiple = multiple;
	}
	private javax.el.ValueExpression relativePath;
	public void setRelativePath(javax.el.ValueExpression relativePath) {
		this.relativePath = relativePath;
	}
	private javax.el.ValueExpression rendered;
	public void setRendered(javax.el.ValueExpression rendered) {
		this.rendered = rendered;
	}
	private javax.el.ValueExpression required;
	public void setRequired(javax.el.ValueExpression required) {
		this.required = required;
	}
	private javax.el.ValueExpression requiredMessage;
	public void setRequiredMessage(javax.el.ValueExpression requiredMessage) {
		this.requiredMessage = requiredMessage;
	}
	private javax.el.ValueExpression results;
	public void setResults(javax.el.ValueExpression results) {
		this.results = results;
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
	private javax.el.ValueExpression useOriginalFilename;
	public void setUseOriginalFilename(javax.el.ValueExpression useOriginalFilename) {
		this.useOriginalFilename = useOriginalFilename;
	}
	private javax.el.ValueExpression useSessionSubdir;
	public void setUseSessionSubdir(javax.el.ValueExpression useSessionSubdir) {
		this.useSessionSubdir = useSessionSubdir;
	}

	protected void setProperties(UIComponent component) {
		super.setProperties(component);
		org.icefaces.ace.component.fileentry.FileEntryBase _component = null;
		try {
			_component = (org.icefaces.ace.component.fileentry.FileEntryBase) component;
		} catch (ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected:org.icefaces.ace.component.fileentry.FileEntryBase");
		}
		if (absolutePath != null) {
			_component.setValueExpression("absolutePath", absolutePath);
		}
		if (autoUpload != null) {
			_component.setValueExpression("autoUpload", autoUpload);
		}
		if (binding != null) {
			_component.setValueExpression("binding", binding);
		}
		if (callback != null) {
			_component.setValueExpression("callback", callback);
		}
		if (disabled != null) {
			_component.setValueExpression("disabled", disabled);
		}
		if (fileEntryListener != null) {
			_component.setFileEntryListener(fileEntryListener);
		}
		if (id != null) {
			_component.setValueExpression("id", id);
		}
		if (immediate != null) {
			_component.setValueExpression("immediate", immediate);
		}
		if (immediateValidation != null) {
			_component.setValueExpression("immediateValidation", immediateValidation);
		}
		if (label != null) {
			_component.setValueExpression("label", label);
		}
		if (maxFileCount != null) {
			_component.setValueExpression("maxFileCount", maxFileCount);
		}
		if (maxFileCountMessage != null) {
			_component.setValueExpression("maxFileCountMessage", maxFileCountMessage);
		}
		if (maxFileSize != null) {
			_component.setValueExpression("maxFileSize", maxFileSize);
		}
		if (maxFileSizeMessage != null) {
			_component.setValueExpression("maxFileSizeMessage", maxFileSizeMessage);
		}
		if (maxTotalSize != null) {
			_component.setValueExpression("maxTotalSize", maxTotalSize);
		}
		if (maxTotalSizeMessage != null) {
			_component.setValueExpression("maxTotalSizeMessage", maxTotalSizeMessage);
		}
		if (messagePersistence != null) {
			_component.setValueExpression("messagePersistence", messagePersistence);
		}
		if (multiple != null) {
			_component.setValueExpression("multiple", multiple);
		}
		if (relativePath != null) {
			_component.setValueExpression("relativePath", relativePath);
		}
		if (rendered != null) {
			_component.setValueExpression("rendered", rendered);
		}
		if (required != null) {
			_component.setValueExpression("required", required);
		}
		if (requiredMessage != null) {
			_component.setValueExpression("requiredMessage", requiredMessage);
		}
		if (results != null) {
			_component.setValueExpression("results", results);
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
		if (useOriginalFilename != null) {
			_component.setValueExpression("useOriginalFilename", useOriginalFilename);
		}
		if (useSessionSubdir != null) {
			_component.setValueExpression("useSessionSubdir", useSessionSubdir);
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
		absolutePath = null;
		autoUpload = null;
		binding = null;
		callback = null;
		disabled = null;
		fileEntryListener = null;
		id = null;
		immediate = null;
		immediateValidation = null;
		label = null;
		maxFileCount = null;
		maxFileCountMessage = null;
		maxFileSize = null;
		maxFileSizeMessage = null;
		maxTotalSize = null;
		maxTotalSizeMessage = null;
		messagePersistence = null;
		multiple = null;
		relativePath = null;
		rendered = null;
		required = null;
		requiredMessage = null;
		results = null;
		size = null;
		style = null;
		styleClass = null;
		tabindex = null;
		useOriginalFilename = null;
		useSessionSubdir = null;
	}
}