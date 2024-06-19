package classes;

/**
 * The Admin class represents a user with administrator privileges.
 * It extends the User class and adds an additional field for the admin ID.
 */
public class Admin extends User {
    private int id;

    /**
     * Constructs a new Admin instance with the specified username, password, and admin ID.
     *
     * @param username the username of the administrator
     * @param password the password of the administrator
     * @param id the ID of the administrator
     */
    public Admin(String username, String password, int id) {
        super(username, password);
        this.id = id;
    }

    /**
     * Returns a string representation of the administrator.
     * Includes the string representation of the User class along with the admin ID.
     *
     * @return a string representation of the administrator
     */
    @Override
    public String toString() {
        return super.toString() + ", Id: " + id;
    }
}
