package org.icefaces.ace.component.ajax;

import javax.faces.view.facelets.TagAttribute;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * Applied on components that support client behaviors similar to the standard f:ajax behavior.<p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/Ajax">Ajax Wiki Documentation</a>.
 */
public class AjaxBehaviorHandlerBase extends javax.faces.view.facelets.TagHandler {
	public static final String BEHAVIOR_ID = "org.icefaces.ace.component.AjaxBehavior";

	protected final TagAttribute disabled;
	protected final TagAttribute event;
	protected final TagAttribute execute;
	protected final TagAttribute immediate;
	protected final TagAttribute listener;
	protected final TagAttribute onComplete;
	protected final TagAttribute onError;
	protected final TagAttribute onStart;
	protected final TagAttribute onSuccess;
	protected final TagAttribute render;

	public AjaxBehaviorHandlerBase(javax.faces.view.facelets.TagConfig config) {
		super(config);
		disabled = this.getAttribute("disabled");
		event = this.getAttribute("event");
		execute = this.getAttribute("execute");
		immediate = this.getAttribute("immediate");
		listener = this.getAttribute("listener");
		onComplete = this.getAttribute("onComplete");
		onError = this.getAttribute("onError");
		onStart = this.getAttribute("onStart");
		onSuccess = this.getAttribute("onSuccess");
		render = this.getAttribute("render");
	}

	public void apply(javax.faces.view.facelets.FaceletContext ctx, javax.faces.component.UIComponent parent) throws java.io.IOException { }

}