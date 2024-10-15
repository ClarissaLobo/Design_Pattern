package myCampusTour.driver;

import myCampusTour.util.MyLogger;
import myCampusTour.util.MyLogger.DebugLevel;
import myCampusTour.util.Tour;

/**
 * @author placeholder
 *
 */

public class Driver {
	public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */

		if (args.length != 2 || args[0].equals("${arg0}") ||
		args[1].equals("${arg1}")) {

		System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
		System.exit(0);
		}
		try {
			System.out.println("*******************************************************");
			System.out.println("*Hello!!!!!! Lets get started with the Tour assignment*");
			System.out.println("*******************************************************");
			TourDriver td = new TourDriver();
			Tour tour = new Tour();
			System.out.println("***********Trip1***********");
			td.Tour1(tour);
			tour.buildTour();
			System.out.println("***********Trip2***********");
			td.Tour2(tour);
			tour.buildTour();
		} catch (Exception e) {
			e.printStackTrace();
			MyLogger.writeMessage("Error in file",MyLogger.DebugLevel.ERROR);
			System.exit(1);
		}

	}
}
