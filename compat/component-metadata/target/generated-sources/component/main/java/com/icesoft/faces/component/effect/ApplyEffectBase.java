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
package com.icesoft.faces.component.effect;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

/**
 * Add effects to parent component
 * <p>Auto-generated component class.
 * Do <strong>NOT</strong> modify; all changes
 * <strong>will</strong> be lost!</p>
 */

abstract class ApplyEffectBase extends javax.faces.component.UIComponentBase {

    /**
     * <p>Construct a new <code>ApplyEffectBase</code>.</p>
     */
    public ApplyEffectBase() {
        super();
        setRendererType("com.icesoft.faces.ApplyEffectRenderer");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.icesoft.faces.ApplyEffectFamily";
    }

    // autoReset
    private boolean autoReset = false;
    private boolean autoReset_set = false;

    /**
 * <p>Set the fire value to false after effect has been fired.
 *         Default is true.</p>
     */
    public boolean isAutoReset() {
        if (this.autoReset_set) {
            return this.autoReset;
        }
        ValueBinding _vb = getValueBinding("autoReset");
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
 * <p>Set the fire value to false after effect has been fired.
 *         Default is true.</p>
     * @see #isAutoReset()
     */
    public void setAutoReset(boolean autoReset) {
        this.autoReset = autoReset;
        this.autoReset_set = true;
    }

    // effectType
    private String effectType = null;

    /**
 * <table>
 *     <tr><td>effectType</td><td>Description</td><td>Options</td></tr>
 *     <tr>
 *         <td>appear</td>
 *         <td>Fade in an element from hidden to visiable</td>
 *         <td>
 *             <table>
 *             <tr>
 *                 <th>option</th>
 *                 <th>Description</th>
 *                 <th>Default Value</th>
 *             </tr>
 *             <tr>
 *                 <td>from</td>
 *                 <td>Starting opacity</td>
 *                 <td>0.0</td>
 *             </tr>
 *             <tr>
 *                 <td>to</td>
 *                 <td>Ending opacity</td>
 *                 <td>1.0</td>
 *             </tr>
 *             </table>
 *         </td>
 *     <tr>
 *         <td>fade</td>
 *         <td>Fade out an element from visiable to hidden</td>
 *         <td>
 *             <table>
 *             <tr>
 *                 <th>option</th>
 *                 <th>Description</th>
 *                 <th>Default Value</th>
 *             </tr>
 *             <tr>
 *                 <td>from</td>
 *                 <td>Starting opacity</td>
 *                 <td>1.0</td>
 *             </tr>
 *             <tr>
 *                 <td>to</td>
 *                 <td>Ending opacity</td>
 *                 <td>0.0</td>
 *             </tr>
 *             </table>
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>highlight</td>
 *         <td>Highlight an element in a specifed color, the fade to the backgroud color</td>
 *         <td>
 *             <table>
 *             <tr>
 *                 <th>option</th>
 *                 <th>Description</th>
 *                 <th>Default Value</th>
 *             </tr>
 *             <tr>
 *                 <td>startcolor</td>
 *                 <td>Highlight color</td>
 *                 <td>"#ffff99"</td>
 *             </tr>
 *             </table>        
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>pulsate</td>
 *         <td>Flash an element</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>scale</td>
 *         <td>Change the dimenstions of an element</td>
 *         <td>
 *             <table>
 *             <tr>
 *                 <th>option</th>
 *                 <th>Description</th>
 *                 <th>Default Value</th>
 *             </tr>
 *             <tr>
 *                 <td>scaleX</td>
 *                 <td>Scale X</td>
 *                 <td>true</td>
 *             </tr>
 *             <tr>
 *                 <td>scaleY</td>
 *                 <td>Scale Y</td>
 *                 <td>true</td>
 *             </tr>
 *             <tr>
 *                 <td>scaleContent</td>
 *                 <td>scale Content</td>
 *                 <td>true</td>
 *             </tr>
 *             <tr>
 *                 <td>scaleFromCenter</td>
 *                 <td>scale From Center</td>
 *                 <td>true</td>
 *             </tr>
 *             <tr>
 *                 <td>scaleMode</td>
 *                 <td>can be 'box' or 'contents' </td>
 *                 <td>'box'</td>
 *             </tr>
 *             <tr>
 *                 <td>scaleFrom</td>
 *                 <td>Starting percent to scale from</td>
 *                 <td>100.0</td>
 *             </tr>
 *             <tr>
 *                 <td>scaleTo</td>
 *                 <td>Ending percent to scale to</td>
 *                 <td>0</td>
 *             </tr>
 *             </table>
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>puff</td>
 *         <td>Grow and fade an element</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>blindup</td>
 *         <td>Remove an element by rolling it up</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>blinddown</td>
 *         <td>Show an element by rolling it down</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td> swtichoff
 *        </td>
 *         <td>Flash and then fold the element. Removing it from the display</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td> dropout
 *        </td>
 *         <td>Move the element down and fade. Removing it from the display</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td> shake
 *         </td>
 *         <td>Shake an element from left to right</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td>slidedown
 *         </td>
 *         <td>Slide an element doen from the top</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td>slideup
 *         </td>
 *         <td>Slide an element uo to the top. Removing it from the display</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td>squish
 *         </td>
 *         <td>Squish an element off of the display</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td>grow
 *         </td>
 *         <td>Grow an element from hidden to its normal size</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td>shrink
 *         </td>
 *         <td>Shrink an element off of the display</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>fold
 *         </td>
 *         <td>Fold and element into smaller picese, util it is removed from the diplsay</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>move
 *         </td>
 *         <td>Move and element to a new location</td>
 *         <td>
 *             <table>
 *             <tr>
 *                 <th>option</th>
 *                 <th>Description</th>
 *                 <th>Default Value</th>
 *             </tr>
 *             <tr>
 *                 <td>x</td>
 *                 <td>New X or left position</td>
 *                 <td>0</td>
 *             </tr>
 *             <tr>
 *                 <td>y</td>
 *                 <td>New Y or top position</td>
 *                 <td>0</td>
 *             </tr>
 *             <tr>
 *                 <td>mode</td>
 *                 <td>relative or absoulte</td>
 *                 <td>relative</td>
 *             </tr>
 *             </table>
 *         </td>
 *     </tr>
 *     <table>
     */
    public String getEffectType() {
        if (this.effectType != null) {
            return this.effectType;
        }
        ValueBinding _vb = getValueBinding("effectType");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <table>
 *     <tr><td>effectType</td><td>Description</td><td>Options</td></tr>
 *     <tr>
 *         <td>appear</td>
 *         <td>Fade in an element from hidden to visiable</td>
 *         <td>
 *             <table>
 *             <tr>
 *                 <th>option</th>
 *                 <th>Description</th>
 *                 <th>Default Value</th>
 *             </tr>
 *             <tr>
 *                 <td>from</td>
 *                 <td>Starting opacity</td>
 *                 <td>0.0</td>
 *             </tr>
 *             <tr>
 *                 <td>to</td>
 *                 <td>Ending opacity</td>
 *                 <td>1.0</td>
 *             </tr>
 *             </table>
 *         </td>
 *     <tr>
 *         <td>fade</td>
 *         <td>Fade out an element from visiable to hidden</td>
 *         <td>
 *             <table>
 *             <tr>
 *                 <th>option</th>
 *                 <th>Description</th>
 *                 <th>Default Value</th>
 *             </tr>
 *             <tr>
 *                 <td>from</td>
 *                 <td>Starting opacity</td>
 *                 <td>1.0</td>
 *             </tr>
 *             <tr>
 *                 <td>to</td>
 *                 <td>Ending opacity</td>
 *                 <td>0.0</td>
 *             </tr>
 *             </table>
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>highlight</td>
 *         <td>Highlight an element in a specifed color, the fade to the backgroud color</td>
 *         <td>
 *             <table>
 *             <tr>
 *                 <th>option</th>
 *                 <th>Description</th>
 *                 <th>Default Value</th>
 *             </tr>
 *             <tr>
 *                 <td>startcolor</td>
 *                 <td>Highlight color</td>
 *                 <td>"#ffff99"</td>
 *             </tr>
 *             </table>        
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>pulsate</td>
 *         <td>Flash an element</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>scale</td>
 *         <td>Change the dimenstions of an element</td>
 *         <td>
 *             <table>
 *             <tr>
 *                 <th>option</th>
 *                 <th>Description</th>
 *                 <th>Default Value</th>
 *             </tr>
 *             <tr>
 *                 <td>scaleX</td>
 *                 <td>Scale X</td>
 *                 <td>true</td>
 *             </tr>
 *             <tr>
 *                 <td>scaleY</td>
 *                 <td>Scale Y</td>
 *                 <td>true</td>
 *             </tr>
 *             <tr>
 *                 <td>scaleContent</td>
 *                 <td>scale Content</td>
 *                 <td>true</td>
 *             </tr>
 *             <tr>
 *                 <td>scaleFromCenter</td>
 *                 <td>scale From Center</td>
 *                 <td>true</td>
 *             </tr>
 *             <tr>
 *                 <td>scaleMode</td>
 *                 <td>can be 'box' or 'contents' </td>
 *                 <td>'box'</td>
 *             </tr>
 *             <tr>
 *                 <td>scaleFrom</td>
 *                 <td>Starting percent to scale from</td>
 *                 <td>100.0</td>
 *             </tr>
 *             <tr>
 *                 <td>scaleTo</td>
 *                 <td>Ending percent to scale to</td>
 *                 <td>0</td>
 *             </tr>
 *             </table>
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>puff</td>
 *         <td>Grow and fade an element</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>blindup</td>
 *         <td>Remove an element by rolling it up</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>blinddown</td>
 *         <td>Show an element by rolling it down</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td> swtichoff
 *        </td>
 *         <td>Flash and then fold the element. Removing it from the display</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td> dropout
 *        </td>
 *         <td>Move the element down and fade. Removing it from the display</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td> shake
 *         </td>
 *         <td>Shake an element from left to right</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td>slidedown
 *         </td>
 *         <td>Slide an element doen from the top</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td>slideup
 *         </td>
 *         <td>Slide an element uo to the top. Removing it from the display</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td>squish
 *         </td>
 *         <td>Squish an element off of the display</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td>grow
 *         </td>
 *         <td>Grow an element from hidden to its normal size</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *         <tr>
 *         <td>shrink
 *         </td>
 *         <td>Shrink an element off of the display</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>fold
 *         </td>
 *         <td>Fold and element into smaller picese, util it is removed from the diplsay</td>
 *         <td>
 *             None
 *         </td>
 *     </tr>
 *     <tr>
 *         <td>move
 *         </td>
 *         <td>Move and element to a new location</td>
 *         <td>
 *             <table>
 *             <tr>
 *                 <th>option</th>
 *                 <th>Description</th>
 *                 <th>Default Value</th>
 *             </tr>
 *             <tr>
 *                 <td>x</td>
 *                 <td>New X or left position</td>
 *                 <td>0</td>
 *             </tr>
 *             <tr>
 *                 <td>y</td>
 *                 <td>New Y or top position</td>
 *                 <td>0</td>
 *             </tr>
 *             <tr>
 *                 <td>mode</td>
 *                 <td>relative or absoulte</td>
 *                 <td>relative</td>
 *             </tr>
 *             </table>
 *         </td>
 *     </tr>
 *     <table>
     * @see #getEffectType()
     */
    public void setEffectType(String effectType) {
        this.effectType = effectType;
    }

    // event
    private String event = null;

    /**
 * <p>Javascript event to fire this effect on.
 *         click, dblclick, mousedown , mouseup, mousemove,mouseover, mouseout,
 *         keypress, keydown, keyup</p>
     */
    public String getEvent() {
        if (this.event != null) {
            return this.event;
        }
        ValueBinding _vb = getValueBinding("event");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Javascript event to fire this effect on.
 *         click, dblclick, mousedown , mouseup, mousemove,mouseover, mouseout,
 *         keypress, keydown, keyup</p>
     * @see #getEvent()
     */
    public void setEvent(String event) {
        this.event = event;
    }

    // fire
    private boolean fire = false;
    private boolean fire_set = false;

    /**
 * <p>TODO</p>
     */
    public boolean isFire() {
        if (this.fire_set) {
            return this.fire;
        }
        ValueBinding _vb = getValueBinding("fire");
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
 * <p>TODO</p>
     * @see #isFire()
     */
    public void setFire(boolean fire) {
        this.fire = fire;
        this.fire_set = true;
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

    // options
    private String options = null;

    /**
 * <p>A comma seperated list of options and their values.
 *         Example: highlight:'#dd0000',duration:1.0</p>
     */
    public String getOptions() {
        if (this.options != null) {
            return this.options;
        }
        ValueBinding _vb = getValueBinding("options");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>A comma seperated list of options and their values.
 *         Example: highlight:'#dd0000',duration:1.0</p>
     * @see #getOptions()
     */
    public void setOptions(String options) {
        this.options = options;
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

    // sequence
    private String sequence = null;

    /**
 * <p>Used to fire a number of effects in sequence.
 *         Defines the sequence name for this effect</p>
     */
    public String getSequence() {
        if (this.sequence != null) {
            return this.sequence;
        }
        ValueBinding _vb = getValueBinding("sequence");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext());
        }
        return null;
    }

    /**
 * <p>Used to fire a number of effects in sequence.
 *         Defines the sequence name for this effect</p>
     * @see #getSequence()
     */
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    // sequenceNumber
    private int sequenceNumber = Integer.MIN_VALUE;
    private boolean sequenceNumber_set = false;

    /**
 * <p>Used to fire a number of effects in sequence.
 *         Defines the sequenceNumber of a sequence. Starts at 1,
 *         lower number are fired first.</p>
     */
    public int getSequenceNumber() {
        if (this.sequenceNumber_set) {
            return this.sequenceNumber;
        }
        ValueBinding _vb = getValueBinding("sequenceNumber");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext());
            if (_result == null) {
                return Integer.MIN_VALUE;
            } else {
                return ((Integer) _result).intValue();
            }
        }
        return Integer.MIN_VALUE;
    }

    /**
 * <p>Used to fire a number of effects in sequence.
 *         Defines the sequenceNumber of a sequence. Starts at 1,
 *         lower number are fired first.</p>
     * @see #getSequenceNumber()
     */
    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        this.sequenceNumber_set = true;
    }

    // submit
    private boolean submit = false;
    private boolean submit_set = false;

    /**
 * <p>Fires a partial submit to the server when effect is complete.</p>
     */
    public boolean isSubmit() {
        if (this.submit_set) {
            return this.submit;
        }
        ValueBinding _vb = getValueBinding("submit");
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
 * <p>Fires a partial submit to the server when effect is complete.</p>
     * @see #isSubmit()
     */
    public void setSubmit(boolean submit) {
        this.submit = submit;
        this.submit_set = true;
    }

    // transitory
    private boolean transitory = false;
    private boolean transitory_set = false;

    /**
 * <p>When true records modifications to the CSS of the effected element.
 *         This will be sent to the server on the next submit.
 *         Default True</p>
     */
    public boolean isTransitory() {
        if (this.transitory_set) {
            return this.transitory;
        }
        ValueBinding _vb = getValueBinding("transitory");
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
 * <p>When true records modifications to the CSS of the effected element.
 *         This will be sent to the server on the next submit.
 *         Default True</p>
     * @see #isTransitory()
     */
    public void setTransitory(boolean transitory) {
        this.transitory = transitory;
        this.transitory_set = true;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    public void restoreState(FacesContext _context,Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.autoReset = ((Boolean) _values[1]).booleanValue();
        this.autoReset_set = ((Boolean) _values[2]).booleanValue();
        this.effectType = (String) _values[3];
        this.event = (String) _values[4];
        this.fire = ((Boolean) _values[5]).booleanValue();
        this.fire_set = ((Boolean) _values[6]).booleanValue();
        this.id = (String) _values[7];
        this.options = (String) _values[8];
        this.rendered = ((Boolean) _values[9]).booleanValue();
        this.rendered_set = ((Boolean) _values[10]).booleanValue();
        this.sequence = (String) _values[11];
        this.sequenceNumber = ((Integer) _values[12]).intValue();
        this.sequenceNumber_set = ((Boolean) _values[13]).booleanValue();
        this.submit = ((Boolean) _values[14]).booleanValue();
        this.submit_set = ((Boolean) _values[15]).booleanValue();
        this.transitory = ((Boolean) _values[16]).booleanValue();
        this.transitory_set = ((Boolean) _values[17]).booleanValue();
    }

    /**
     * <p>Save the state of this component.</p>
     */
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[18];
        _values[0] = super.saveState(_context);
        _values[1] = this.autoReset ? Boolean.TRUE : Boolean.FALSE;
        _values[2] = this.autoReset_set ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.effectType;
        _values[4] = this.event;
        _values[5] = this.fire ? Boolean.TRUE : Boolean.FALSE;
        _values[6] = this.fire_set ? Boolean.TRUE : Boolean.FALSE;
        _values[7] = this.id;
        _values[8] = this.options;
        _values[9] = this.rendered ? Boolean.TRUE : Boolean.FALSE;
        _values[10] = this.rendered_set ? Boolean.TRUE : Boolean.FALSE;
        _values[11] = this.sequence;
        _values[12] = new Integer(this.sequenceNumber);
        _values[13] = this.sequenceNumber_set ? Boolean.TRUE : Boolean.FALSE;
        _values[14] = this.submit ? Boolean.TRUE : Boolean.FALSE;
        _values[15] = this.submit_set ? Boolean.TRUE : Boolean.FALSE;
        _values[16] = this.transitory ? Boolean.TRUE : Boolean.FALSE;
        _values[17] = this.transitory_set ? Boolean.TRUE : Boolean.FALSE;
        return _values;
    }

}
