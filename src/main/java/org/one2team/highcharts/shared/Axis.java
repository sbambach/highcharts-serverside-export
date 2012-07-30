package org.one2team.highcharts.shared;

import com.google.gwt.shared.Array;
import com.google.gwt.shared.ArrayString;

public interface Axis {
  
  enum Type {
    linear, datetime;
  }

  Title getTitle ();

  Labels getLabels ();
  
  DateTimeLabelFormats getDateTimeLabelFormats ();

  <T> T getUserObject ();

  ArrayString getCategories ();

  int getCategoriesLength ();

  Array<PlotLines> getPlotLines();

  Array<PlotBands> getPlotBands();

	int getMaxZoom ();

	double getMin ();

    double getMinRange ();

	double getMax ();

	boolean isShowFirstLabel ();

	boolean isStartOnTick ();

	double getTickInterval ();

	double getMinorTickInterval ();

	String getType ();

	Axis setMin (double min);

    Axis setMinRange (double minRange);
  
  Axis setMax (double max);

  Axis setType (String type);

  Axis setTickInterval (double tickInterval);

  Axis setMinorTickInterval (double minorTickInterval);

  Axis setStartOnTick (boolean startOnTick);

  Axis setShowFirstLabel (boolean showFirstLabel);

  void setUserObject (Object userObject);
  
  Axis setMaxZoom (int maxZoom);
  
  Axis setPlotLines (Array<PlotLines> plotLines);

  Axis setPlotBands (Array<PlotBands> plotBands);

  public interface Labels {
    
    Labels setAlign (String align);
    
    Labels setRotation (double r);

  }
  
  public interface PlotLines {
    
    Label getLabel();

		String getColor();

		String getDashStyle();

		String getId();

		double getValue();

		int getWidth();

		int getZIndex();

		PlotLines setLabel (Label label);
    
    PlotLines setColor (String color);
    
    PlotLines setDashStyle (String dashStyle);
    
    PlotLines setId (String id);
    
    PlotLines setValue (double value);
    
    PlotLines setWidth (int width);
    
    PlotLines setZIndex (int zindex);
    
    public interface Label {
      
      String getAlign();

			String getVerticalAlign();

			double getRotation();

			String getText();

			String getTextAlign();

			double getX();

			double getY();

			Style getStyle();

			Label setAlign (String align);
      
      Label setVerticalAlign (String verticalAlign);
      
      Label setRotation (double rotation);
      
      Label setText (String text);
      
      Label setTextAlign (String textAlign);
      
      Label setX (double x);
      
      Label setY (double y);

      Label setStyle(Style style);
      
    }
    
  }

    public interface PlotBands {

        Label getLabel();

        String getColor();

        String getId();

        double getFrom();

        double getTo();

        int getZIndex();

        PlotBands setLabel (Label label);

        PlotBands setColor (String color);

        PlotBands setId (String id);

        PlotBands setFrom (double from);

        PlotBands setTo (double to);

        PlotBands setZIndex (int zindex);

        public interface Label {

            String getAlign();

            String getVerticalAlign();

            double getRotation();

            String getText();

            String getTextAlign();

            double getX();

            double getY();

            Style getStyle();

            Label setAlign (String align);

            Label setVerticalAlign (String verticalAlign);

            Label setRotation (double rotation);

            Label setText (String text);

            Label setTextAlign (String textAlign);

            Label setX (double x);

            Label setY (double y);

            Label setStyle(Style style);

        }

    }
}
