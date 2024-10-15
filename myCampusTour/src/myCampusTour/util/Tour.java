package myCampusTour.util;
import java.util.ArrayList;
import java.util.List;

import enums.Cafeteria;
import enums.Lecture;
import enums.building;
import enums.building_ride;
import enums.gift;
import myCampusTour.builderWorkshop.BuilderWorkshopI;
import myCampusTour.builderWorkshop.CalculateTripData;



public class Tour implements BuilderWorkshopI{
    String build, ride_type1, gif, Cafeteria, lect;
    @Override
    public String building(building b) {
        // System.out.println(b.toString());
        build = b.toString();
        buildings b1bBuildings = new buildings();
        b1bBuildings.choice(build);
        return build;
    }

    @Override
    public String ride(building_ride r) {
        // System.out.println(r.toString());
        ride_type1 = r.toString();
        return ride_type1;
    }

    @Override
    public String gift(gift g) {
        // System.out.println(g.toString());
        gif = g.toString();
        return gif;
    }

    @Override
    public String cafeteria(Cafeteria c) {
        // System.out.println(c.toString());
        Cafeteria = c.toString();
        return Cafeteria;
    }

    @Override
    public String lecture(Lecture l) {
        // System.out.println(l.toString());
        lect = l.toString();
        return lect;
    }
    public MyFirstTour buildTour(){  
        List<Integer> buildingArray=new ArrayList<Integer>(); 
        List<Integer> rideArray=new ArrayList<Integer>(); 
        List<Integer> giftArray=new ArrayList<Integer>(); 
        List<Integer> cafetariaArray=new ArrayList<Integer>();
        List<Integer> lectureArray=new ArrayList<Integer>(); 
        System.out.println(build+" "+ride_type1+" "+gif+" "+Cafeteria+" "+lect);
        // String trip = build+","+ride_type1+","+gif+","+Cafeteria+","+lect;
        //create an object of building class and pass "build"
        buildings bd=new buildings();
        buildingArray = bd.choice(build);
        Building_ride br=new Building_ride();
        rideArray = br.choic(ride_type1);
        Gift gf=new Gift();
        giftArray = gf.choice(gif);
        CafeteriaC cf=new CafeteriaC();
        cafetariaArray = cf.cafe(Cafeteria);
        LectureL lec=new LectureL();
        lectureArray=lec.choice(lect);
        // System.out.println("Building Array: "+buildingArray);
        // System.out.println("Ride Array: "+rideArray);
        // System.out.println("Gift Array: "+giftArray);
        // System.out.println("Cafetaria Array: "+cafetariaArray);
        // System.out.println("Lecture Array: "+lectureArray);
        CalculateTripData calculateTripData = new CalculateTripData();
        calculateTripData.CalculateTripData1(buildingArray, rideArray, giftArray, cafetariaArray, lectureArray);
        return null;
    }
}
