package org.icefaces.ace.component.chart;

import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.MetaRuleset;
import org.icefaces.facelets.tag.icefaces.core.MethodRule;

import java.util.EventObject;
/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */
public class ChartHandler extends ComponentHandler{


	public ChartHandler(ComponentConfig componentConfig) {
		super(componentConfig);
	}


	protected MetaRuleset createMetaRuleset(Class type) {
		MetaRuleset metaRuleset = super.createMetaRuleset(type);
		metaRuleset.addRule( new MethodRule("imageExportListener", null, new Class[] {org.icefaces.ace.event.ChartImageExportEvent.class}) );
		metaRuleset.addRule( new MethodRule("pointChangeListener", null, new Class[] {org.icefaces.ace.event.PointValueChangeEvent.class}) );
		metaRuleset.addRule( new MethodRule("selectListener", null, new Class[] {org.icefaces.ace.event.SeriesSelectionEvent.class}) );
	
		return metaRuleset;
	}
}