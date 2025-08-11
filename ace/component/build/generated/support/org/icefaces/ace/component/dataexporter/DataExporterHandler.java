package org.icefaces.ace.component.dataexporter;

import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.MetaRuleset;
import org.icefaces.facelets.tag.icefaces.core.MethodRule;

import java.util.EventObject;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */
public class DataExporterHandler extends ComponentHandler{


	public DataExporterHandler(ComponentConfig componentConfig) {
		super(componentConfig);
	}


	protected MetaRuleset createMetaRuleset(Class type) {
		MetaRuleset metaRuleset = super.createMetaRuleset(type);
		metaRuleset.addRule( new MethodRule("postProcessor", null, new Class[] {Object.class}) );
		metaRuleset.addRule( new MethodRule("preProcessor", null, new Class[] {Object.class}) );
	
		return metaRuleset;
	}
}