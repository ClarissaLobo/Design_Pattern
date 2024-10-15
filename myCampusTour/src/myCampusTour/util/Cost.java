package myCampusTour.util;
import myCampusTour.myTour.CostI;

public class Cost implements CostI { 
    
    @Override
    public int calculate_cost(int cost) {
        int Total_Cost=0;
        Total_Cost += cost;
        // System.out.println("Total_Cost: "+Total_Cost);
        // System.out.println(Total_Cost);
        return Total_Cost;
    }
    
} 
