import java.util.*;

public class User {
    private String email;
    private String password;
    private String city;
    private String street;
    private String house;
    private String apartment;
    private String firstName;
    private String secondName;
    private double balance;
    private List<String> billingHistory;
    private List<String> payments;
    private String resetToken;

    public User(String email, String password, String city, String street, String house, String apartment, String firstName, String secondName) {
        this.email = email;
        this.password = password;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
        this.firstName = firstName;
        this.secondName = secondName;
        this.balance = 0.0;
        this.billingHistory = new ArrayList<>();
        this.payments = new ArrayList<>();
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public void register(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void restorePassword(String email) {
        if (this.email.equals(email)) {
            this.resetToken = UUID.randomUUID().toString();
        }
    }

    public String getAddressString() {
        return city + " " + street + " " + house + " " + apartment;
    }

    public String getFullName() {
        return secondName + " " + firstName;
    }

    public void addBalance(double sum) {
        this.balance += sum;
    }

    public double getBalance() {
        return this.balance;
    }

    public List<String> getBillingStatistics() {
        return billingHistory;
    }

    public List<String> getPaymentsStatistics() {
        return payments;
    }
}
