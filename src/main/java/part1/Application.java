package part1;

import java.awt.*;

public class Application {
    public static void main(String[] args) {

    ParkedCar car = new ParkedCar("Audi", "2015", "Black", "L12345A", 125);
    ParkingMeter meter = new ParkingMeter(60, 22);
    PoliceOfficer officer = new PoliceOfficer("Max Mustermann", "4788", "green");
    Object ticket = officer.patrol(car, meter);

    // Did the officer issue a ticket?
        if (ticket != null) {
        System.out.println(ticket);
    }
        else {
        System.out.println("No crimes committed!");
    }

    }
}






