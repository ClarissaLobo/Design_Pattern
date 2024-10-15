package myCampusTour.util;

import java.util.ArrayList;
import java.util.List;

public class LectureL {
    public ArrayList<Integer> choice(String Lecture)
    {
        List<Integer> list=new ArrayList<Integer>();  
        int co=0,eft=0,dura=0,cbf=0;
        Cost c=new Cost(); 
        Effort e=new Effort();
        Duration d=new Duration();
        CarbonFoot cf=new CarbonFoot();
    if(Lecture=="inperson")
    {    
        int ct=30;  
        int eff=1;
        int dur=2;
        int cr=6;
        int c_surcharge=(10/100)*ct;
        co=c.calculate_cost(c_surcharge+ct);
        eft=e.effort_cost(eff);
        dura=d.duration_calculate(dur);
        cbf=cf.CarbonFootprint(cr);

    }
    if(Lecture=="video_lecture")
    {
        int ct=20;
        int eff=2;
        int dur=3;
        int cr=4;
        co=c.calculate_cost(ct);
        eft= e.effort_cost(eff);
        dura=d.duration_calculate(dur);
        cbf=cf.CarbonFootprint(cr);
    }
    if(Lecture=="recorded_lecture")
    {
        int ct=28;
        int eff=3;
        int dur=4;
        int cr=5;
        co=c.calculate_cost(ct);
        eft=e.effort_cost(eff);
        dura=d.duration_calculate(dur);
        cbf=cf.CarbonFootprint(cr);
    }
    if(Lecture=="selfpace")
    {
        int ct=29;
        int eff=4;
        int dur=5;
        int cr=6;
        co=c.calculate_cost(ct);
        eft=e.effort_cost(eff);
        dura=d.duration_calculate(dur);
        cbf=cf.CarbonFootprint(cr);
    }
    if(Lecture=="hybrid_lecture")
    {
        int ct=20;
        int eff=5;
        int dur=6;
        int cr=7;
        co=c.calculate_cost(ct);
        eft=e.effort_cost(eff);
        dura=d.duration_calculate(dur);
        cbf=cf.CarbonFootprint(cr);
    }
    list.add(co);
    list.add(eft);
    list.add(dura);
    list.add(cbf);

    return (ArrayList<Integer>) list;
    
    }
}

