package classes;

import java.util.List;

/**
 * The Client class represents a client user in the application.
 * It extends the User class and adds additional fields for the client's email and contact number.
 */
public class Client extends User {
    private String gmail;
    private int number;
    ShoppingCart shoppingCart;
    List<Order> orders;

    /**
     * Constructs a new Client instance with the specified username, password, email, and contact number.
     *
     * @param username the username of the client
     * @param password the password of the client
     * @param gmail the email of the client
     * @param number the contact number of the client
     */
    public Client(String username, String password, String gmail, int number) {
        super(username, password);
        this.gmail = gmail;
        this.number = number;
    }

    /**
     * Returns a string representation of the client.
     * Includes the string representation of the User class along with the client's email and contact number.
     *
     * @return a string representation of the client
     */
    @Override
    public String toString() {
        return super.toString() + ", Gmail: " + gmail + ", Number: " + number;
    }
}
