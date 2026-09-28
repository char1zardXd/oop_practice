package pracice2;

public class Vehicle {
    int license_plate;
    String type; // passenger, truck, electric
    int user_id;

    public Vehicle(int license_plate, String type, int user_id) {
        this.license_plate = license_plate;
        this.type = type;
        this.user_id = user_id;
    }

    public void getNumber() {

    }

    public void changeOwner() {

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "license_plate=" + license_plate +
                ", type='" + type + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}