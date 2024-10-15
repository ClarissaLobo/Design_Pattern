package myCampusTour.util;
import myCampusTour.myTour.EffortI;

public class Effort implements EffortI{

    public int effort_cost(int eff){
    {
        int Total_Effort=0;
        Total_Effort +=eff;
        // System.out.println("Total_Effort: "+Total_Effort);
        return Total_Effort;
    }   
}
}