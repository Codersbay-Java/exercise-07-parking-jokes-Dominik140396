package part1;

public class PoliceOfficer {
    String name;
    String badgeNumber;
    String colour;

    public PoliceOfficer(String name, String badgeNumber, String colour) {
        this.name = name;
        this.badgeNumber = badgeNumber;
        this.colour = colour;
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

