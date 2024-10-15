package myCampusTour.util;

import myCampusTour.myTour.DurationI;

public class Duration implements DurationI {

  public int duration_calculate(int d) {
    int Total_Duration = 0;
    Total_Duration += d;
    // System.out.println("Total_Duration: " + Total_Duration);
    return Total_Duration;

  }

}