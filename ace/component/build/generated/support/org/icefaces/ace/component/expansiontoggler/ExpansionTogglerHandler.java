package org.icefaces.ace.component.expansiontoggler;

import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.MetaRuleset;
import org.icefaces.facelets.tag.icefaces.core.MethodRule;

import java.util.EventObject;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */
public class ExpansionTogglerHandler extends ComponentHandler{


	public ExpansionTogglerHandler(ComponentConfig componentConfig) {
		super(componentConfig);
	}


	protected MetaRuleset createMetaRuleset(Class type) {
		MetaRuleset metaRuleset = super.createMetaRuleset(type);
		metaRuleset.addRule( new MethodRule("changeListener", null, new Class[] {org.icefaces.ace.event.ExpansionChangeEvent.class}) );
	
		return metaRuleset;
	}
}