package myCampusTour.builderWorkshop;

import enums.Cafeteria;
import enums.Lecture;
import enums.building;
import enums.building_ride;
import enums.gift;

public interface BuilderWorkshopI {
	// static int construct(Object o) {
    //     // ((Tour) o).TestMethod();
    //     // ((Tour) o).
    //     // TODO Auto-generated method stub
    //     return 0;
    // }
    // BuilderWorkshopI building(building b);
    // BuilderWorkshopI ride(building_ride r);
    // BuilderWorkshopI gift(gift g);
    // BuilderWorkshopI cafeteria(Cafeteria c);
    // BuilderWorkshopI lecture(Lecture l);
    String building(building b);
    String ride(building_ride r);
    String gift(gift g);
    String cafeteria(Cafeteria c);
    String lecture(Lecture l);
    
}
