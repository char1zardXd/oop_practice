package pracice2;

public class Main {
    static void main(String[] args) {
        User alex_user = new User("Alex Vorona", "+380999784147", "usermail@gmail.com");

        Vehicle lastochka = new Vehicle(5000, "electric", 5);

        Staff marina = new Staff("Marina Volga", "operator", "active");

        ParkingSpot spot42 = new ParkingSpot(42, "charger", "reserved");

        ParkingSession ps42 = new ParkingSession(5, 42, "24.03.26", "22.04.26", 1600);

        System.out.println(alex_user);
        System.out.println(lastochka);
        System.out.println(marina);
        System.out.println(spot42);
        System.out.println(ps42);
    }
}
