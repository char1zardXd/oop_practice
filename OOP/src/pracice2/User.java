package pracice2;

public class User {
    String full_name;
    String phone;
    String email;

    public User(String full_name, String phone, String email) {
        this.full_name = full_name;
        this.phone = phone;
        this.email = email;
    }

    public void addTransport() {

    }

    public void checkHistory() {

    }

    public void makePayment() {

    }

    @Override
    public String toString() {
        return "User{" +
                "full_name='" + full_name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
