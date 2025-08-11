package org.icefaces.ace.component.animation;

import javax.faces.view.facelets.TagAttribute;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */

/**
 * The ace:animation tag provides a way to animate standard JSF components. Animations are based on the jQuery effects utilities.<p>For more information, see the <a href="http://wiki.icefaces.org/display/ICE/Animation">Animation Wiki Documentation</a>.
 */
public class AnimationBehaviorHandlerBase extends javax.faces.view.facelets.BehaviorHandler {
	public static final String BEHAVIOR_ID = "org.icefaces.ace.animation.Animation";

	protected final TagAttribute duration;
	protected final TagAttribute easing;
	protected final TagAttribute effectObject;
	protected final TagAttribute event;
	protected final TagAttribute from;
	protected final TagAttribute iterations;
	protected final TagAttribute name;
	protected final TagAttribute run;
	protected final TagAttribute to;

	public AnimationBehaviorHandlerBase(javax.faces.view.facelets.BehaviorConfig config) {
		super(config);
		duration = this.getAttribute("duration");
		easing = this.getAttribute("easing");
		effectObject = this.getAttribute("effectObject");
		event = this.getAttribute("event");
		from = this.getAttribute("from");
		iterations = this.getAttribute("iterations");
		name = this.getAttribute("name");
		run = this.getAttribute("run");
		to = this.getAttribute("to");
	}

}