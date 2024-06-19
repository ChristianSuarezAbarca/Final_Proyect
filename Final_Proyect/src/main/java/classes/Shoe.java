package classes;

/**
 * The Shoe class represents a shoe in the application.
 * It contains a unique identifier for the shoe and its size.
 */
public class Shoe {
    private String name;
    private int id;
    private int size;

    /**
     * Constructs a new Shoe instance with the specified identifier and size.
     *
     * @param id   the unique identifier of the shoe
     * @param size the size of the shoe
     */
    public Shoe(int id, int size) {
        this.id = id;
        this.size = size;
    }

    /**
     * Returns a string representation of the shoe.
     * Includes the identifier and size of the shoe.
     *
     * @return a string representing the shoe
     */
    @Override
    public String toString() {
        return id + ", Size: " + size;
    }
}
