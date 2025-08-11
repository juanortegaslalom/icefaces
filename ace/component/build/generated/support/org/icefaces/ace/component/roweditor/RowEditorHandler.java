package org.icefaces.ace.component.roweditor;

import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.MetaRuleset;
import org.icefaces.facelets.tag.icefaces.core.MethodRule;

import java.util.EventObject;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */
public class RowEditorHandler extends ComponentHandler{


	public RowEditorHandler(ComponentConfig componentConfig) {
		super(componentConfig);
	}


	protected MetaRuleset createMetaRuleset(Class type) {
		MetaRuleset metaRuleset = super.createMetaRuleset(type);
		metaRuleset.addRule( new MethodRule("rowEditCancelListener", null, new Class[] {org.icefaces.ace.event.RowEditCancelEvent.class}) );
		metaRuleset.addRule( new MethodRule("rowEditListener", null, new Class[] {org.icefaces.ace.event.RowEditEvent.class}) );
	
		return metaRuleset;
	}
}