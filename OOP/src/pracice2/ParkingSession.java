package pracice2;

public class ParkingSession {
    int vehicle_id;
    int spot_id;
    String entry_time;
    String exit_time;
    int cost;

    public ParkingSession(int vehicle_id, int spot_id, String entry_time, String exit_time, int cost) {
        this.vehicle_id = vehicle_id;
        this.spot_id = spot_id;
        this.entry_time = entry_time;
        this.exit_time = exit_time;
        this.cost = cost;
    }

    public void startSession() {

    }

    public void calculateCost() {

    }

    public void endSession() {

    }

    @Override
    public String toString() {
        return "ParkingSession{" +
                "vehicle_id=" + vehicle_id +
                ", spot_id=" + spot_id +
                ", entry_time='" + entry_time + '\'' +
                ", exit_time='" + exit_time + '\'' +
                ", cost=" + cost +
                '}';
    }
}
