package myCampusTour.util;

import java.util.ArrayList;
import java.util.List;

public class Gift {
    public List<Integer> choice(String gift) {
        List<Integer> list = new ArrayList<Integer>();
        int co = 0, eft = 0, dura = 0, cbf = 0;
        Cost c = new Cost();
        Effort e = new Effort();
        Duration d = new Duration();
        CarbonFoot cf = new CarbonFoot();

        if (gift == "Event_centre") {
            int ct = 20;
            int eff = 1;
            int dur = 2;
            int cr = 6;
            co = c.calculate_cost(ct);
            eft = e.effort_cost(eff);
            dura = d.duration_calculate(dur);
            cbf = cf.CarbonFootprint(cr);
        }
        if (gift == "University_Union") {
            int ct = 20;
            int eff = 1;
            int dur = 2;
            int cr = 6;
            co = c.calculate_cost(ct);
            eft = e.effort_cost(eff);
            dura = d.duration_calculate(dur);
            cbf = cf.CarbonFootprint(cr);
        }
        if (gift == "Marketplace") {
            int ct = 20;
            int eff = 1;
            int dur = 2;
            int cr = 6;
            co = c.calculate_cost(ct);
            eft = e.effort_cost(eff);
            dura = d.duration_calculate(dur);
            cbf = cf.CarbonFootprint(cr);
        }
        if (gift == "ITC") {
            int ct = 20;
            int eff = 1;
            int dur = 2;
            int cr = 6;
            co = c.calculate_cost(ct);
            eft = e.effort_cost(eff);
            dura = d.duration_calculate(dur);
            cbf = cf.CarbonFootprint(cr);
        }
        if (gift == "C4") {
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
