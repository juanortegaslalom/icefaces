package org.icefaces.ace.component.datatable;

import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.MetaRuleset;
import org.icefaces.facelets.tag.icefaces.core.MethodRule;

import java.util.EventObject;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */
public class DataTableHandler extends ComponentHandler{


	public DataTableHandler(ComponentConfig componentConfig) {
		super(componentConfig);
	}


	protected MetaRuleset createMetaRuleset(Class type) {
		MetaRuleset metaRuleset = super.createMetaRuleset(type);
		metaRuleset.addRule( new MethodRule("filterListener", null, new Class[] {org.icefaces.ace.event.TableFilterEvent.class}) );
		metaRuleset.addRule( new MethodRule("rowSelectListener", null, new Class[] {org.icefaces.ace.event.SelectEvent.class}) );
		metaRuleset.addRule( new MethodRule("rowUnselectListener", null, new Class[] {org.icefaces.ace.event.UnselectEvent.class}) );
	
		return metaRuleset;
	}
}