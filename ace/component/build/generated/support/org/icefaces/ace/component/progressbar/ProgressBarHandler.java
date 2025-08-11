package org.icefaces.ace.component.progressbar;

import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.MetaRuleset;
import org.icefaces.facelets.tag.icefaces.core.MethodRule;

import java.util.EventObject;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */
public class ProgressBarHandler extends ComponentHandler{


	public ProgressBarHandler(ComponentConfig componentConfig) {
		super(componentConfig);
	}


	protected MetaRuleset createMetaRuleset(Class type) {
		MetaRuleset metaRuleset = super.createMetaRuleset(type);
		metaRuleset.addRule( new MethodRule("cancelListener", null, new Class[0]) );
		metaRuleset.addRule( new MethodRule("changeListener", null, new Class[] {org.icefaces.ace.event.ProgressBarChangeEvent.class}) );
		metaRuleset.addRule( new MethodRule("completeListener", null, new Class[0]) );
	
		return metaRuleset;
	}
}