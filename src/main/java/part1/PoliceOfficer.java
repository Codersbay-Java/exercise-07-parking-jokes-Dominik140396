package part1;

import java.awt.*;

public class PoliceOfficer {
    String name;
    String badgeNumber;
    Color colour;

    public PoliceOfficer(String name, String badgeNumber, Color colour) {
        this.name = name;
        this.badgeNumber = badgeNumber;
        this.colour = colour;
    }

    public static void main(String[] args) {

    }
    int diff = ParkingMeter.minutesPurchased - ParkingMeter.minutesParked;
    public int patrol(ParkedCar car, ParkingMeter meter) {
           if(ParkingMeter.minutesPurchased >= ParkingMeter.minutesParked) {
               System.out.println("All good");
               return diff;
           } else {
               System.out.println("Stand too long");
               return 0;
           }
    }

}

