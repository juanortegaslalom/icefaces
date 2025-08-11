package org.icefaces.ace.component.list;

import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.MetaRuleset;
import org.icefaces.facelets.tag.icefaces.core.MethodRule;

import java.util.EventObject;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */
public class ACEListHandler extends ComponentHandler{


	public ACEListHandler(ComponentConfig componentConfig) {
		super(componentConfig);
	}


	protected MetaRuleset createMetaRuleset(Class type) {
		MetaRuleset metaRuleset = super.createMetaRuleset(type);
		metaRuleset.addRule( new MethodRule("selectionListener", null, new Class[] {org.icefaces.ace.event.ListSelectEvent.class}) );
	
		return metaRuleset;
	}
}