package myCampusTour.util;

import java.util.ArrayList;
import java.util.List;
import myCampusTour.builderWorkshop.CafeteriaI;

public class CafeteriaC implements CafeteriaI {
    public ArrayList<Integer> cafe(String Cafeteria) {
        List<Integer> list = new ArrayList<Integer>();
        int co = 0, eft = 0, dura = 0, cbf = 0;
        Cost c = new Cost();
        Effort e = new Effort();
        Duration d = new Duration();
        CarbonFoot cf = new CarbonFoot();
        if (Cafeteria == "queue") {
            int ct = 20;
            int eff = 1;
            int dur = 2;
            int cr = 6;
            co = c.calculate_cost(ct);
            eft = e.effort_cost(eff);
            dura = d.duration_calculate(dur);
            cbf = cf.CarbonFootprint(cr);
        }
        if (Cafeteria == "Mountain_view") {
            int ct = 20;
            int eff = 1;
            int dur = 2;
            int cr = 6;
            int c_surcharge=(10/100)*ct;
            co = c.calculate_cost(c_surcharge+ct);
            eft = e.effort_cost(eff);
            dura = d.duration_calculate(dur);
            cbf = cf.CarbonFootprint(cr);
        }
        if (Cafeteria == "CIB") {
            int ct = 20;
            int eff = 2;
            int dur = 3;
            int cr = 8;
            co = c.calculate_cost(ct);
            eft = e.effort_cost(eff);
            dura = d.duration_calculate(dur);
            cbf = cf.CarbonFootprint(cr);
        }

        if (Cafeteria == "CIB") {
            int ct = 30;
            int eff = 1;
            int dur = 2;
            int cr = 6;
            co = c.calculate_cost(ct);
            eft = e.effort_cost(eff);
            dura = d.duration_calculate(dur);
            cbf = cf.CarbonFootprint(cr);
        }

        if (Cafeteria == "Hinman") {
            int ct = 20;
            int eff = 1;
            int dur = 2;
            int cr = 6;
            co = c.calculate_cost(ct);
            eft = e.effort_cost(eff);
            dura = d.duration_calculate(dur);
            cbf = cf.CarbonFootprint(cr);
        }
        if (Cafeteria == "Bartl") {
            int ct = 20;
            int eff = 1;
            int dur = 2;
            int cr = 6;
            co = c.calculate_cost(ct);
            eft = e.effort_cost(eff);
            dura = d.duration_calculate(dur);
            cbf = cf.CarbonFootprint(cr);
        }
        list.add(co);
        list.add(eft);
        list.add(dura);
        list.add(cbf);

        return (ArrayList<Integer>) list;
    }

}
