package myCampusTour.driver;

import enums.Cafeteria;
import enums.Lecture;
import enums.building;
import enums.building_ride;
import enums.gift;
import myCampusTour.builderWorkshop.BuilderWorkshopI;

public class TourDriver {
    public void Tour1(BuilderWorkshopI builder) {
        // builder.building(building.Engineering);
        builder.building(building.Engineering);
        builder.ride(building_ride.on_foot);
        builder.gift(gift.C4);
        builder.cafeteria(Cafeteria.Bartl);
        builder.lecture(Lecture.inperson);
    }

    public void Tour2(BuilderWorkshopI builder) {
        builder.building(building.Union);
        builder.ride(building_ride.bus_ride);
        builder.gift(gift.Marketplace);
        builder.cafeteria(Cafeteria.queue);
        builder.lecture(Lecture.video_lecture);
    }
}
