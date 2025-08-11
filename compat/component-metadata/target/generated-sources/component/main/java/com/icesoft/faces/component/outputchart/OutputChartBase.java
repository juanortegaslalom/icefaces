/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an 'AS
 * IS' BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 */
package com.icesoft.faces.component.outputchart;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * creates chart
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class OutputChartBase extends javax.faces.component.UICommand {

    /**
     * <p>Construct a new <code>OutputChartBase</code>.</p>
     */
    public OutputChartBase() {
        super();
        setRendererType("com.icesoft.faces.OutputChartRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "javax.faces.Command";
    }

    // action
    private javax.faces.el.MethodBinding action = null;

    /**
 * <p>MethodBinding representing the application action to invoke when
 * 		this component is activated by the user. The expression must
 * 		evaluate to a either a String or a public method that takes no
 * 		parameters, and returns a String (the logical outcome) which is
 * 		passed to the NavigationHandler for this application.</p>
     */
    public javax.faces.el.MethodBinding getAction() {
        if (this.action != null) {
            return this.action;
        }
        ValueBinding _vb = getValueBinding("action");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>MethodBinding representing the application action to invoke when
 * 		this component is activated by the user. The expression must
 * 		evaluate to a either a String or a public method that takes no
 * 		parameters, and returns a String (the logical outcome) which is
 * 		passed to the NavigationHandler for this application.</p>
     * @see #getAction()
     */
    public void setAction(javax.faces.el.MethodBinding action) {
        this.action = action;
    }

    // actionListener
    private javax.faces.el.MethodBinding actionListener = null;

    /**
 * <p>MethodBinding representing an action listener method that will be 
 * 		notified when this component is activated by the user. The expression 
 * 		must evaluate to a public method that takes an ActionEvent parameter, 
 * 		with a return type of void.</p>
     */
    public javax.faces.el.MethodBinding getActionListener() {
        if (this.actionListener != null) {
            return this.actionListener;
        }
        ValueBinding _vb = getValueBinding("actionListener");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>MethodBinding representing an action listener method that will be 
 * 		notified when this component is activated by the user. The expression 
 * 		must evaluate to a public method that takes an ActionEvent parameter, 
 * 		with a return type of void.</p>
     * @see #getActionListener()
     */
    public void setActionListener(javax.faces.el.MethodBinding actionListener) {
        this.actionListener = actionListener;
    }

    // chartTitle
    private String chartTitle = null;

    /**
 * <p>Title for the component. The value of this attribute can be defined
 *         on the page or can be bound to the backing bean as String type.</p>
     */
    public String getChartTitle() {
        if (this.chartTitle != null) {
            return this.chartTitle;
        }
        ValueBinding _vb = getValueBinding("chartTitle");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "Default Chart title";
    }

    /**
 * <p>Title for the component. The value of this attribute can be defined
 *         on the page or can be bound to the backing bean as String type.</p>
     * @see #getChartTitle()
     */
    public void setChartTitle(String chartTitle) {
        this.chartTitle = chartTitle;
    }

    // colors
    private Object colors = null;

    /**
 * <p>     
 *         The value of this attribute can be defined on page or can be defined 
 *         using the backing bean, the valid types for the bean is:
 *         	<ul>
 * 			   <li> String array</li>
 *         	   <li> List of java.awt.Color</li>
 * 			</ul>
 *         </p>
     */
    public Object getColors() {
        if (this.colors != null) {
            return this.colors;
        }
        ValueBinding _vb = getValueBinding("colors");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>     
 *         The value of this attribute can be defined on page or can be defined 
 *         using the backing bean, the valid types for the bean is:
 *         	<ul>
 * 			   <li> String array</li>
 *         	   <li> List of java.awt.Color</li>
 * 			</ul>
 *         </p>
     * @see #getColors()
     */
    public void setColors(Object colors) {
        this.colors = colors;
    }

    // data
    private Object data = null;

    /**
 * <p>     
 *         Data of the chart. The valud of this attribute can be defined on page or
 *         can be bound to the backing bean:</br>
 * 		<b>(e.g.) defining on page</b>
 *         <pre> 
 *         &lt;ice:outputChart type="pie2d" 
 *         		labels="pass, fail" 
 *         		data="70, 30" 
 *         		colors="green, red"/&gt;
 * 
 *         dataset can be defined using the colon ":" 
 *         &lt;ice:outputChart type="barstacked" 
 *         		labels="pass, fail" 
 *         		data="70, 30, 10 : 10, 50, 70" 
 *         		colors="green, red"/&gt;
 *         </pre><br/>
 *        This attribute's value has correlation with the labels and color attribute.
 *        <br/> if the value bounded with backing bean:
 *            <ul>
 *              <li>double or 2d double array</li>
 *              <li>List of double or 2d double array</li>
 *            </ul>
 *         </p>
     */
    public Object getData() {
        if (this.data != null) {
            return this.data;
        }
        ValueBinding _vb = getValueBinding("data");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return "20, 30, 40";
    }

    /**
 * <p>     
 *         Data of the chart. The valud of this attribute can be defined on page or
 *         can be bound to the backing bean:</br>
 * 		<b>(e.g.) defining on page</b>
 *         <pre> 
 *         &lt;ice:outputChart type="pie2d" 
 *         		labels="pass, fail" 
 *         		data="70, 30" 
 *         		colors="green, red"/&gt;
 * 
 *         dataset can be defined using the colon ":" 
 *         &lt;ice:outputChart type="barstacked" 
 *         		labels="pass, fail" 
 *         		data="70, 30, 10 : 10, 50, 70" 
 *         		colors="green, red"/&gt;
 *         </pre><br/>
 *        This attribute's value has correlation with the labels and color attribute.
 *        <br/> if the value bounded with backing bean:
 *            <ul>
 *              <li>double or 2d double array</li>
 *              <li>List of double or 2d double array</li>
 *            </ul>
 *         </p>
     * @see #getData()
     */
    public void setData(Object data) {
        this.data = data;
    }

    // height
    private String height = null;

    /**
 * <p>Height of the chart. The value of this attribute can
 *         be defined on the page or can be bound to the backing bean as String type.</p>
     */
    public String getHeight() {
        if (this.height != null) {
            return this.height;
        }
        ValueBinding _vb = getValueBinding("height");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "400";
    }

    /**
 * <p>Height of the chart. The value of this attribute can
 *         be defined on the page or can be bound to the backing bean as String type.</p>
     * @see #getHeight()
     */
    public void setHeight(String height) {
        this.height = height;
    }

    // horizontal
    private boolean horizontal = false;
    private boolean horizontal_set = false;

    /**
 * <p>     
 *         This attribute is valid only for the following types of charts:
 *         <ul>
 *         	<li>bar</li>
 *         	<li>barclustered</li>
 *             <li>barstacked</li>        	
 *         </ul>  
 *         <b>Note: </b> Negative values in Stacked Bar charts are not supported by 
 *         the krysalis.jcharts.
 *         </p>
     */
    public boolean isHorizontal() {
        if (this.horizontal_set) {
            return this.horizontal;
        }
        ValueBinding _vb = getValueBinding("horizontal");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
 * <p>     
 *         This attribute is valid only for the following types of charts:
 *         <ul>
 *         	<li>bar</li>
 *         	<li>barclustered</li>
 *             <li>barstacked</li>        	
 *         </ul>  
 *         <b>Note: </b> Negative values in Stacked Bar charts are not supported by 
 *         the krysalis.jcharts.
 *         </p>
     * @see #isHorizontal()
     */
    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
        this.horizontal_set = true;
    }

    // id
    private String id = null;

    /**
 * <p>The component identifier for this component. This value must be 
 *   			unique within the closest parent component that is a naming 
 *   			container.</p>
     */
    public String getId() {
        if (this.id != null) {
            return this.id;
        }
        ValueBinding _vb = getValueBinding("id");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>The component identifier for this component. This value must be 
 *   			unique within the closest parent component that is a naming 
 *   			container.</p>
     * @see #getId()
     */
    public void setId(String id) {
        this.id = id;
    }

    // immediate
    private boolean immediate = false;
    private boolean immediate_set = false;

    /**
 * <p>Flag indicating that this component's value must be converted
 * 		and validated immediately (that is, during Apply Request Values
 * 		phase), rather than waiting until Process Validations phase.</p>
     */
    public boolean isImmediate() {
        if (this.immediate_set) {
            return this.immediate;
        }
        ValueBinding _vb = getValueBinding("immediate");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
 * <p>Flag indicating that this component's value must be converted
 * 		and validated immediately (that is, during Apply Request Values
 * 		phase), rather than waiting until Process Validations phase.</p>
     * @see #isImmediate()
     */
    public void setImmediate(boolean immediate) {
        this.immediate = immediate;
        this.immediate_set = true;
    }

    // labels
    private Object labels = null;

    /**
 * <p>   
 *         Legend label of the chart. This attribute can be used for any type of 
 *         chart. The value of the labels attribute has correlation with the data 
 *         and colors attribute.
 *         <br/>
 *         When used with pie2D and pie3D the number of values should be same for the
 *         labels, data and color attributes. (e.g.)
 *         <pre> 
 *         &lt;ice:outputChart type="pie2d" 
 *         		labels="pass, fail" 
 *         		data="70, 30" 
 *         		colors="green, red"/&gt;
 *          </pre> 
 *         When used with other charts except pie, then each labels' value should 
 *         be mapped with a dataset. A dataset can be indicated by the colon ":" (e.g.)  
 *         <pre>       
 *         &lt;ice:outputChart type="barstacked" 
 *         		labels="pass, fail" 
 *         		data="70, 30, 10: 10, 50, 70" 
 *         		colors="green, red"/&gt;
 *         </pre> 		
 *         The value of labels attribute can be defined on the page:
 *         	<ul>
 * 			   <li> a single word </li>
 *         	   <li> comma separated values </li>
 *         	</ul>
 *         The value of labels attribute can be defined using the backing bean:
 *         	<ul>
 * 			   <li> as String array </li>
 *         	   <li> as List of strings </li>
 * 			</ul>
 *         </p>
     */
    public Object getLabels() {
        if (this.labels != null) {
            return this.labels;
        }
        ValueBinding _vb = getValueBinding("labels");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>   
 *         Legend label of the chart. This attribute can be used for any type of 
 *         chart. The value of the labels attribute has correlation with the data 
 *         and colors attribute.
 *         <br/>
 *         When used with pie2D and pie3D the number of values should be same for the
 *         labels, data and color attributes. (e.g.)
 *         <pre> 
 *         &lt;ice:outputChart type="pie2d" 
 *         		labels="pass, fail" 
 *         		data="70, 30" 
 *         		colors="green, red"/&gt;
 *          </pre> 
 *         When used with other charts except pie, then each labels' value should 
 *         be mapped with a dataset. A dataset can be indicated by the colon ":" (e.g.)  
 *         <pre>       
 *         &lt;ice:outputChart type="barstacked" 
 *         		labels="pass, fail" 
 *         		data="70, 30, 10: 10, 50, 70" 
 *         		colors="green, red"/&gt;
 *         </pre> 		
 *         The value of labels attribute can be defined on the page:
 *         	<ul>
 * 			   <li> a single word </li>
 *         	   <li> comma separated values </li>
 *         	</ul>
 *         The value of labels attribute can be defined using the backing bean:
 *         	<ul>
 * 			   <li> as String array </li>
 *         	   <li> as List of strings </li>
 * 			</ul>
 *         </p>
     * @see #getLabels()
     */
    public void setLabels(Object labels) {
        this.labels = labels;
    }

    // legendColumns
    private Object legendColumns = null;

    /**
 * <p>    
 *         The number of columns for legend label.
 *         <pre> 
 * 		(e.g.) To show legend columns vertically
 *         &lt;ice:outputChart type="barstacked" 
 *         		labels="pass, fail" 
 *         		data="70, 30, 10: 10, 50, 70" 
 *         		colors="green, red"
 *         		legendPlacement="right"
 *         		legendColumns="1"/&gt;
 *          </pre>    
 *         </p>
     */
    public Object getLegendColumns() {
        if (this.legendColumns != null) {
            return this.legendColumns;
        }
        ValueBinding _vb = getValueBinding("legendColumns");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return "0";
    }

    /**
 * <p>    
 *         The number of columns for legend label.
 *         <pre> 
 * 		(e.g.) To show legend columns vertically
 *         &lt;ice:outputChart type="barstacked" 
 *         		labels="pass, fail" 
 *         		data="70, 30, 10: 10, 50, 70" 
 *         		colors="green, red"
 *         		legendPlacement="right"
 *         		legendColumns="1"/&gt;
 *          </pre>    
 *         </p>
     * @see #getLegendColumns()
     */
    public void setLegendColumns(Object legendColumns) {
        this.legendColumns = legendColumns;
    }

    // legendPlacement
    private Object legendPlacement = null;

    /**
 * <p>The placement of legend label can be set to one of the following:
 *         <ul>
 *         	<li>top</li>
 *         	<li>bottom (default)</li>
 *         	<li>left</li>
 *         	<li>right</li>
 *         	<li>none</li>          	  
 *         </ul>
 *         <pre> 
 * 		(e.g.)
 *         &lt;ice:outputChart type="barstacked" 
 *         		labels="pass, fail" 
 *         		data="70, 30, 10: 10, 50, 70" 
 *         		colors="green, red"
 *         		legendPlacement="right"/&gt;
 *          </pre>         
 *          Note: This attribute does not apply to pie3D charts.
 *          When the chart type is "custom", remember to read this attribute in
 *          your custom charting code and set the chart legend placement accordingly.
 *         </p>
     */
    public Object getLegendPlacement() {
        if (this.legendPlacement != null) {
            return this.legendPlacement;
        }
        ValueBinding _vb = getValueBinding("legendPlacement");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return "bottom";
    }

    /**
 * <p>The placement of legend label can be set to one of the following:
 *         <ul>
 *         	<li>top</li>
 *         	<li>bottom (default)</li>
 *         	<li>left</li>
 *         	<li>right</li>
 *         	<li>none</li>          	  
 *         </ul>
 *         <pre> 
 * 		(e.g.)
 *         &lt;ice:outputChart type="barstacked" 
 *         		labels="pass, fail" 
 *         		data="70, 30, 10: 10, 50, 70" 
 *         		colors="green, red"
 *         		legendPlacement="right"/&gt;
 *          </pre>         
 *          Note: This attribute does not apply to pie3D charts.
 *          When the chart type is "custom", remember to read this attribute in
 *          your custom charting code and set the chart legend placement accordingly.
 *         </p>
     * @see #getLegendPlacement()
     */
    public void setLegendPlacement(Object legendPlacement) {
        this.legendPlacement = legendPlacement;
    }

    // renderOnSubmit
    private javax.faces.el.MethodBinding renderOnSubmit = null;

    /**
 * <p>     
 *         The renderOnSubmit attribute lets the developer decide when to render 
 *         the chart. However the chart component ensures that the chart image would 
 *         be generated for first rendering phase but subsequent rendering of the
 *         chart would be based on this attribute's value.<br/>
 *         The value of this attribute can be defined on the page or can be bound 
 *         to the backing bean as method binding.
 *        <pre>
 *        &lt;ice:outputChart  renderOnSubmit="true"/&gt;
 *        or
 *        &lt;ice:outputChart  renderOnSubmit="#{bean.render}"/&gt;
 *        
 *        method's signature:
 *            public boolean render(OutputChart component)
 *        </pre>
 *         </p>
     */
    public javax.faces.el.MethodBinding getRenderOnSubmit() {
        if (this.renderOnSubmit != null) {
            return this.renderOnSubmit;
        }
        ValueBinding _vb = getValueBinding("renderOnSubmit");
        if (_vb != null) {
            return (javax.faces.el.MethodBinding) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>     
 *         The renderOnSubmit attribute lets the developer decide when to render 
 *         the chart. However the chart component ensures that the chart image would 
 *         be generated for first rendering phase but subsequent rendering of the
 *         chart would be based on this attribute's value.<br/>
 *         The value of this attribute can be defined on the page or can be bound 
 *         to the backing bean as method binding.
 *        <pre>
 *        &lt;ice:outputChart  renderOnSubmit="true"/&gt;
 *        or
 *        &lt;ice:outputChart  renderOnSubmit="#{bean.render}"/&gt;
 *        
 *        method's signature:
 *            public boolean render(OutputChart component)
 *        </pre>
 *         </p>
     * @see #getRenderOnSubmit()
     */
    public void setRenderOnSubmit(javax.faces.el.MethodBinding renderOnSubmit) {
        this.renderOnSubmit = renderOnSubmit;
    }

    // rendered
    private boolean rendered = false;
    private boolean rendered_set = false;

    /**
 * <p>Flag indicating whether or not this component should be rendered 
 *   			(during Render Response Phase), or processed on any subsequent form 
 *   			submit.</p>
     */
    public boolean isRendered() {
        if (this.rendered_set) {
            return this.rendered;
        }
        ValueBinding _vb = getValueBinding("rendered");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
 * <p>Flag indicating whether or not this component should be rendered 
 *   			(during Render Response Phase), or processed on any subsequent form 
 *   			submit.</p>
     * @see #isRendered()
     */
    public void setRendered(boolean rendered) {
        this.rendered = rendered;
        this.rendered_set = true;
    }

    // shapes
    private Object shapes = null;

    /**
 * <p>     
 *         This attribute can be used with the line and point chart. <br/>
 *         The following are the valid values:
 *         <ul>
 *         	<li>circle</li>
 *         	<li>diamond</li>
 *         	<li>square</li>
 *         	<li>triangle</li>
 *         </ul>
 *         The value of this attribute can be defined on page or can be defined 
 *         using the backing bean, the valid types for the bean is:
 *         	<ul>
 * 			   <li> String array containging above strings</li>
 *         	   <li> List of java.awt.Shape</li>
 * 			</ul>
 *         </p>
     */
    public Object getShapes() {
        if (this.shapes != null) {
            return this.shapes;
        }
        ValueBinding _vb = getValueBinding("shapes");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>     
 *         This attribute can be used with the line and point chart. <br/>
 *         The following are the valid values:
 *         <ul>
 *         	<li>circle</li>
 *         	<li>diamond</li>
 *         	<li>square</li>
 *         	<li>triangle</li>
 *         </ul>
 *         The value of this attribute can be defined on page or can be defined 
 *         using the backing bean, the valid types for the bean is:
 *         	<ul>
 * 			   <li> String array containging above strings</li>
 *         	   <li> List of java.awt.Shape</li>
 * 			</ul>
 *         </p>
     * @see #getShapes()
     */
    public void setShapes(Object shapes) {
        this.shapes = shapes;
    }

    // style
    private String style = null;

    /**
 * <p>CSS style(s) to be applied when this component is rendered.</p>
     */
    public String getStyle() {
        if (this.style != null) {
            return this.style;
        }
        ValueBinding _vb = getValueBinding("style");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>CSS style(s) to be applied when this component is rendered.</p>
     * @see #getStyle()
     */
    public void setStyle(String style) {
        this.style = style;
    }

    // styleClass
    private String styleClass = null;

    /**
 * <p>Space-separated list of CSS style class(es) to be applied when this 
 * 		element is rendered. This value is passed through as the "class" 
 * 		attribute on generated markup.
 * 		The base name for all style classes. Default value is <b>iceOutChrt</b>
 * 		if enabled and <b>iceOutChrt-dis</b> if disabled.</p>
     */
    public String getStyleClass() {
        if (this.styleClass != null) {
            return this.styleClass;
        }
        ValueBinding _vb = getValueBinding("styleClass");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Space-separated list of CSS style class(es) to be applied when this 
 * 		element is rendered. This value is passed through as the "class" 
 * 		attribute on generated markup.
 * 		The base name for all style classes. Default value is <b>iceOutChrt</b>
 * 		if enabled and <b>iceOutChrt-dis</b> if disabled.</p>
     * @see #getStyleClass()
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    // type
    private String type = null;

    /**
 * <p>Type of the chart. The valid values are as follows:
 *         <ul>
 *         	<li>area</li/>
 *         	<li>areastacked</li/>
 *         	<li>bar</li/>
 *         	<li>barclustered</li/>
 *         	<li>barstacked</li/>
 *         	<li>line</li/>
 *         	<li>pie2D</li/>
 *         	<li>pie3D</li/>
 *         	<li>point</li/>
 *         	<li>stock</li/>        	        	        	        	        	        	        	        	        	
 *         	<li>custom</li/>        	
 *         </ul>
 *         
 *         Only one type can be set at a time. The value of this attribute can
 *         be defined on the page or can be bound to the backing bean as String type.
 *         </p>
     */
    public String getType() {
        if (this.type != null) {
            return this.type;
        }
        ValueBinding _vb = getValueBinding("type");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "bar";
    }

    /**
 * <p>Type of the chart. The valid values are as follows:
 *         <ul>
 *         	<li>area</li/>
 *         	<li>areastacked</li/>
 *         	<li>bar</li/>
 *         	<li>barclustered</li/>
 *         	<li>barstacked</li/>
 *         	<li>line</li/>
 *         	<li>pie2D</li/>
 *         	<li>pie3D</li/>
 *         	<li>point</li/>
 *         	<li>stock</li/>        	        	        	        	        	        	        	        	        	
 *         	<li>custom</li/>        	
 *         </ul>
 *         
 *         Only one type can be set at a time. The value of this attribute can
 *         be defined on the page or can be bound to the backing bean as String type.
 *         </p>
     * @see #getType()
     */
    public void setType(String type) {
        this.type = type;
    }

    // width
    private String width = null;

    /**
 * <p>Width of the chart. The value of this attribute can
 *         be defined on the page or can be bound to the backing bean as String type.</p>
     */
    public String getWidth() {
        if (this.width != null) {
            return this.width;
        }
        ValueBinding _vb = getValueBinding("width");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "400";
    }

    /**
 * <p>Width of the chart. The value of this attribute can
 *         be defined on the page or can be bound to the backing bean as String type.</p>
     * @see #getWidth()
     */
    public void setWidth(String width) {
        this.width = width;
    }

    // xaxisLabels
    private Object xaxisLabels = null;

    /**
 * <p>     
 *         This attribute can be used with all types of charts except pie2D and pie3D.
 *         Each value of xaxisLabels is connected with a dataset.
 *         It can be defined on page or bound to the backing bean.
 *      	(e.g.)
 *      	<pre>
 *      	 &lt;ice:outputChart type="barstacked" 
 *         		labels="pass, fail" 
 *         		data="70, 30, 10 : 10, 50, 70" 
 *         		colors="green, red"
 * 				xaxisLabels="2001, 2002, 2003"        		
 *         		/&gt;   
 *        </pre>
 *         </p>
     */
    public Object getXaxisLabels() {
        if (this.xaxisLabels != null) {
            return this.xaxisLabels;
        }
        ValueBinding _vb = getValueBinding("xaxisLabels");
        if (_vb != null) {
            return (Object) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>     
 *         This attribute can be used with all types of charts except pie2D and pie3D.
 *         Each value of xaxisLabels is connected with a dataset.
 *         It can be defined on page or bound to the backing bean.
 *      	(e.g.)
 *      	<pre>
 *      	 &lt;ice:outputChart type="barstacked" 
 *         		labels="pass, fail" 
 *         		data="70, 30, 10 : 10, 50, 70" 
 *         		colors="green, red"
 * 				xaxisLabels="2001, 2002, 2003"        		
 *         		/&gt;   
 *        </pre>
 *         </p>
     * @see #getXaxisLabels()
     */
    public void setXaxisLabels(Object xaxisLabels) {
        this.xaxisLabels = xaxisLabels;
    }

    // xaxisTitle
    private String xaxisTitle = null;

    /**
 * <p>Title for x axis of the chart. Valid for all types of charts except 
 *         pie2D and pie3D. The value of this attribute can
 *         be defined on the page or can be bound to the backing bean as String type.</p>
     */
    public String getXaxisTitle() {
        if (this.xaxisTitle != null) {
            return this.xaxisTitle;
        }
        ValueBinding _vb = getValueBinding("xaxisTitle");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "Default X title";
    }

    /**
 * <p>Title for x axis of the chart. Valid for all types of charts except 
 *         pie2D and pie3D. The value of this attribute can
 *         be defined on the page or can be bound to the backing bean as String type.</p>
     * @see #getXaxisTitle()
     */
    public void setXaxisTitle(String xaxisTitle) {
        this.xaxisTitle = xaxisTitle;
    }

    // yaxisTitle
    private String yaxisTitle = null;

    /**
 * <p>Title for y axis of the chart. Valid for all types of charts except 
 *         pie2D and pie3D. The value of this attribute can
 *         be defined on the page or can be bound to the backing bean as String type.</p>
     */
    public String getYaxisTitle() {
        if (this.yaxisTitle != null) {
            return this.yaxisTitle;
        }
        ValueBinding _vb = getValueBinding("yaxisTitle");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return "Default Y title";
    }

    /**
 * <p>Title for y axis of the chart. Valid for all types of charts except 
 *         pie2D and pie3D. The value of this attribute can
 *         be defined on the page or can be bound to the backing bean as String type.</p>
     * @see #getYaxisTitle()
     */
    public void setYaxisTitle(String yaxisTitle) {
        this.yaxisTitle = yaxisTitle;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.action = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[1]);
        this.actionListener = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[2]);
        this.chartTitle = (String) _values[3];
        this.colors = (Object) _values[4];
        this.data = (Object) _values[5];
        this.height = (String) _values[6];
        this.horizontal = ((Boolean) _values[7]).booleanValue();
        this.horizontal_set = ((Boolean) _values[8]).booleanValue();
        this.id = (String) _values[9];
        this.immediate = ((Boolean) _values[10]).booleanValue();
        this.immediate_set = ((Boolean) _values[11]).booleanValue();
        this.labels = (Object) _values[12];
        this.legendColumns = (Object) _values[13];
        this.legendPlacement = (Object) _values[14];
        this.renderOnSubmit = (javax.faces.el.MethodBinding) restoreAttachedState(_context, _values[15]);
        this.rendered = ((Boolean) _values[16]).booleanValue();
        this.rendered_set = ((Boolean) _values[17]).booleanValue();
        this.shapes = (Object) _values[18];
        this.style = (String) _values[19];
        this.styleClass = (String) _values[20];
        this.type = (String) _values[21];
        this.width = (String) _values[22];
        this.xaxisLabels = (Object) _values[23];
        this.xaxisTitle = (String) _values[24];
        this.yaxisTitle = (String) _values[25];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[26];
        _values[0] = super.saveState(_context);
        _values[1] = saveAttachedState(_context, action);
        _values[2] = saveAttachedState(_context, actionListener);
        _values[3] = this.chartTitle;
        _values[4] = this.colors;
        _values[5] = this.data;
        _values[6] = this.height;
        _values[7] = this.horizontal ? Boolean.TRUE : Boolean.FALSE;
        _values[8] = this.horizontal_set ? Boolean.TRUE : Boolean.FALSE;
        _values[9] = this.id;
        _values[10] = this.immediate ? Boolean.TRUE : Boolean.FALSE;
        _values[11] = this.immediate_set ? Boolean.TRUE : Boolean.FALSE;
        _values[12] = this.labels;
        _values[13] = this.legendColumns;
        _values[14] = this.legendPlacement;
        _values[15] = saveAttachedState(_context, renderOnSubmit);
        _values[16] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[17] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[18] = this.shapes;
        _values[19] = this.style;
        _values[20] = this.styleClass;
        _values[21] = this.type;
        _values[22] = this.width;
        _values[23] = this.xaxisLabels;
        _values[24] = this.xaxisTitle;
        _values[25] = this.yaxisTitle;
        return _values;
    }

}
