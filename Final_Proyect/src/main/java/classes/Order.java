package classes;

/**
 * The Order class represents an order in the application.
 * It contains a unique identifier for the order and the user associated with the order.
 */
public class Order {
    private String id;
    private User user;

    /**
     * Constructs a new Order instance with the specified identifier.
     *
     * @param id the unique identifier of the order
     */
    public Order(String id) {
        this.id = id;
    }

    /**
     * Returns a string representation of the order.
     * Includes only the identifier of the order.
     *
     * @return a string representing the order
     */
    @Override
    public String toString() {
        return id;
    }
}
