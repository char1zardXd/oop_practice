package pracice2;

public class ParkingSpot {
    int number;
    String type; // standard, invalid, charger
    String status; // free, occupied, reserved

    public ParkingSpot(int number, String type, String status) {
        this.number = number;
        this.type = type;
        this.status = status;
    }

    public void toOccupy() {

    }

    public void freeUp() {

    }

    public void toBlock() {

    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
