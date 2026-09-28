package pracice2;

public class Staff {
    String fullName;
    String role; // operator, administrator, inspector
    String shift_status; // active, closed

    public Staff(String fullName, String role, String shift_status) {
        this.fullName = fullName;
        this.role = role;
        this.shift_status = shift_status;
    }

    public void openBarrier() {

    }

    public void changeLocationStatus() {

    }

    public void checkPayment() {

    }

    @Override
    public String toString() {
        return "Staff{" +
                "fullName='" + fullName + '\'' +
                ", role='" + role + '\'' +
                ", shift_status='" + shift_status + '\'' +
                '}';
    }
}
