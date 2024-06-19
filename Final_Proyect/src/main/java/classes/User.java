package classes;

/**
 * The User class represents a generic user in the application.
 * It contains a username and a password.
 */
public class User {
    private String username;
    private String password;

    /**
     * Constructs a new User instance with the specified username and password.
     *
     * @param username the username of the user
     * @param password the password of the user
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Returns a string representation of the user.
     * Includes the username and password.
     *
     * @return a string representing the user
     */
    @Override
    public String toString() {
        return "Username: " + username + ", Password: " + password;
    }
}
