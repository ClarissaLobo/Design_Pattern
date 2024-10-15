package myCampusTour.util;
import java.io.FileWriter;
import java.io.BufferedWriter; 
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import myCampusTour.builderWorkshop.buildingI;

public class buildings implements buildingI {

    // public buildings(String build) {
    // }
    public ArrayList<Integer> choice(String build) {
        List<Integer> list = new ArrayList<Integer>();
        int co = 0, eft = 0, dura = 0, cbf = 0;
        // Cost c=new Cost();
        Effort e = new Effort();
        Duration d = new Duration();
        CarbonFoot cf = new CarbonFoot();
        if (build == "SOM") {
            int eff = 1;
            int dur = 2;
            int cr = 6;
            eft=e.effort_cost(eff);
            dura=d.duration_calculate(dur);
            cbf=cf.CarbonFootprint(cr);

        }
        else if (build == "WATSON") {
            int eff = 2;
            int dur = 3;
            int cr = 4;
            eft=e.effort_cost(eff);
            dura=d.duration_calculate(dur);
            cbf=cf.CarbonFootprint(cr);
        }
        else if (build == "Engineering") {
            int eff = 3;
            int dur = 4;
            int cr = 5;
            eft=e.effort_cost(eff);
            dura=d.duration_calculate(dur);
            cbf=cf.CarbonFootprint(cr);
        }
        else if (build == "Union") {
            int eff = 4;
            int dur = 5;
            int cr = 6;
            eft=e.effort_cost(eff);
            dura=d.duration_calculate(dur);
            cbf=cf.CarbonFootprint(cr);
        }
        else if (build == "Bartle") {
            int eff = 5;
            int dur = 6;
            int cr = 7;
            eft=e.effort_cost(eff);
            dura=d.duration_calculate(dur);
            cbf=cf.CarbonFootprint(cr);
        }
        else
        {
          CreateLogFile();
        }
        list.add(co);
        list.add(eft);
        list.add(dura);
        list.add(cbf);

        return (ArrayList<Integer>) list;
    }
        //Create ErrorLog File
    public void CreateLogFile() {
        
        try {
            
          File myObj = new File("errorLog.txt");
          if(!myObj.exists()){
          
            myObj.createNewFile();
            System.out.println("File created: " + myObj.getName());
            WriteToFile();
            
          }
          else
          {
            WriteToFile();
          }
        } 
        catch(IOException e)
                {
                    System.out.println("issue" +e);
                }
        }
    
    
        public static void WriteToFile() {
        try (FileWriter f = new FileWriter("errorLog.txt", false);
        BufferedWriter b = new BufferedWriter(f);
        PrintWriter p = new PrintWriter(b);) 
        { 
          p.println(" Building doesn't exist"); 
        } 
         catch (IOException i) 
         { i.printStackTrace(); }
        }
    
    }