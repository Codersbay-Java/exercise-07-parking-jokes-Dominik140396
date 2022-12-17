package part1;


public class ParkingTicket {

    int strafe = 25;
    int mehrStrafe = 10;
    int insgStrafe;

    public int feeSum() {
        if ((ParkingMeter.minutesPurchased - ParkingMeter.minutesParked) <= 60) {
            return strafe;
        } else {
            insgStrafe = strafe + mehrStrafe;
            return insgStrafe;
        }
    }
}



