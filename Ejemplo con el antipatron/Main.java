public class Main {
    public static void main(String[] args) {
        User user = new User("john.doe@example.com", "securePass123", "New York", "5th Ave", "10A", "2B", "John", "Doe");

        user.addBalance(100.50);
        System.out.println("User balance: " + user.getBalance());
        System.out.println("User full name: " + user.getFullName());
        System.out.println("User address: " + user.getAddressString());
    }
}
