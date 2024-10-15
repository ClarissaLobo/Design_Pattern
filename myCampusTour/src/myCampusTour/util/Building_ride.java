package myCampusTour.util;

import java.util.List;
import java.util.ArrayList;
import myCampusTour.builderWorkshop.building_rideI;

public class Building_ride implements building_rideI {
    // (String building_ride)
    // Building_ride r= new Building_rideft=eCost();

    public ArrayList<Integer> choic(String building_ride) {
        List<Integer> list = new ArrayList<Integer>();
        int co = 0, eft = 0, dura = 0, cbf = 0;
        Cost c = new Cost();
        Effort e = new Effort();
        Duration d = new Duration();
        CarbonFoot cf = new CarbonFoot();
        if (building_ride == "on_foot") {
            int ct = 1;
            int eff = 1;
            int dur = 2;
            int cr = 6;
            co=c.calculate_cost(ct);
            eft=e.effort_cost(eff);
            dura=d.duration_calculate(dur);
            cbf=cf.CarbonFootprint(cr);
        }
        if (building_ride == "bus_ride") {
            int ct = 3;
            int eff = 1;
            int dur = 2;
            int cr = 6;
            co=c.calculate_cost(ct);
            eft=e.effort_cost(eff);
            dura=d.duration_calculate(dur);
            cbf=cf.CarbonFootprint(cr);
        }
        if (building_ride == "bike") {
            int ct = 20;
            int eff = 1;
            int dur = 2;
            int cr = 6;
            co=c.calculate_cost(ct);
            eft=e.effort_cost(eff);
            dura=d.duration_calculate(dur);
            cbf=cf.CarbonFootprint(cr);
        }
        if (building_ride == "train") {
            int ct = 20;
            int eff = 1;
            int dur = 2;
            int cr = 6;
            co=c.calculate_cost(ct);
            eft=e.effort_cost(eff);
            dura=d.duration_calculate(dur);
            cbf=cf.CarbonFootprint(cr);
        }
        if (building_ride == "car") {
            int ct = 20;
            int eff = 1;
            int dur = 2;
            int cr = 6;
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
