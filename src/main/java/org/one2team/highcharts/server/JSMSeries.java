package org.one2team.highcharts.server;

import com.google.gwt.shared.Array;
import org.one2team.highcharts.server.JSMPlotOptions.JSMSeries.JSMStates;
import org.one2team.highcharts.shared.PlotOptions.Series.States;
import org.one2team.highcharts.shared.Point;
import org.one2team.highcharts.shared.Series;
import org.one2team.utils.JSMArray;
import org.one2team.utils.JSMArrayString;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(namespace = "chartoptions")
public class JSMSeries extends JSMBaseObject implements Series {

  public JSMSeries () {
  }

  @Override
  public String getName () {
    return this.name;
  }

  @Override
  public String getType () {
  	System.out.println("series.type "+type);
    return this.type;
  }

  @SuppressWarnings("unchecked")
  @Override
  public JSMArray<Point> getData () {
    if (data == null)
      data = new JSMArray<Point> ();
    return (JSMArray<Point>) data;
  }

  @Override
  public JSMPlotOptions.JSMSeries.JSMMarker getMarker () {
      if (this.marker == null)
          this.marker = new JSMPlotOptions.JSMSeries.JSMMarker();
      return marker;
  }

  @Override
  public Series setColor (String color) {
    this.color = color;
    return this;
  }

  @Override
  public Series setName (String name) {
    this.name = name;
    return this;
  }

  @Override
  public Series setType (String type) {
    this.type = type;
    return this;
  }

  @Override
  @XmlTransient
  public Series setData (Array<Point> data) {
    this.data = data;
    return this;
  }

  @Override
  public String getColor () {
    return this.color;
  }

  @Override
  public Series setCenter (String x, String y) {
  	if (center == null)
  		center = new JSMCenter ();
    center.setX (x);
    center.setY (y);
    return this;
  }

  @Override
  public Series setSize (String size) {
    this.size = size;
    return this;
  }

  @Override
  public Series setLineWidth (int lineWidth) {
      this.lineWidth = lineWidth;
      return this;
  }

  @Override
  public String getCenterX () {
    return (center != null) ? center.getX () : null;
  }

  @Override
  public String getCenterY () {
    return (center != null) ? center.getY () : null;
  }

  @Override
  public String getSize () {
    return size;
  }

  @Override
  public int getLineWidth () {
      return lineWidth;
  }

  @Override
  public Series setStates (States states) {
    this.states = states;
    return this;
  }
  
  @Override
  public States getStates () {
  	if (this.states == null)
  		this.states = new JSMStates ();
    return this.states;
  }

  @XmlElement(type = JSMStates.class)
  public States states;

  @XmlElements(@XmlElement(name = "data", type = JSMPoint.class))
  public Object data;

  public JSMPlotOptions.JSMSeries.JSMMarker marker;

  @XmlElement
  public String color;

  @XmlElement
  public String name;

  @XmlElement
  public String type;

  @XmlElement
  public String size;

  @XmlElement
  public Integer lineWidth;

  public JSMCenter center;

  public static class JSMCenter extends JSMArrayString {

		public void setX (String x) {
			add (0, x);
		}

		public String getX () {
			return (String) get (0);
		}

		public void setY (String y) {
			add (1, y);
		}

		public String getY () {
			return (String) get (1);
		}

		private static final long serialVersionUID = 1L;
  }
}
