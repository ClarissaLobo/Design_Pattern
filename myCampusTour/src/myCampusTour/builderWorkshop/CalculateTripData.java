package myCampusTour.builderWorkshop;

import java.util.List;

public class CalculateTripData {
    public void CalculateTripData1(List<Integer> buildingArray, List<Integer> rideArray, List<Integer> giftArray,
        List<Integer> cafetariaArray, List<Integer> lectureArray){
        int cost = buildingArray.get(0) + rideArray.get(0) + giftArray.get(0) + cafetariaArray.get(0) + lectureArray.get(0);
        int effort = buildingArray.get(1) + rideArray.get(1) + giftArray.get(1) + cafetariaArray.get(1) + lectureArray.get(1);
        int carbonfootprint = buildingArray.get(2) + rideArray.get(2) + giftArray.get(2) + cafetariaArray.get(2) + lectureArray.get(2);
        int duration = buildingArray.get(3) + rideArray.get(3) + giftArray.get(3) + cafetariaArray.get(3) + lectureArray.get(3);
        System.out.println("Total Cost: "+cost);
        System.out.println("Total Effort: "+effort);
        System.out.println("Total Carbon FootPrint: "+carbonfootprint);
        System.out.println("Total Duration: "+duration);
    }
}
