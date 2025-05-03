/**
 * Dog class represents a dog with a name, weight, and breed.
 */
public class Dog {
    /**
     * The name of the dog.
     * The weight of the dog in kilograms.
     * The breed of the dog.
     */
    private String name;
    private String breed;
    private int weight;
    /**
     * Constructor to initialize the Dog object.
     *
     * @param name  The name of the dog.
     * @param breed  The breed of the dog.
     * @param weight The weight of the dog in kilograms.
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }
       // Setters
    /**
     * Sets the name of the dog.
     *
     * @param name The new name of the dog.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Sets the breed of the dog.
     *
     * @param breed The new breed of the dog.
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
    /**
     * Sets the weight of the dog.
     *
     * @param weight The new weight of the dog in kilograms.
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    // Getters
    /**
     * Returns the name of the dog.
     *
     * @return The name of the dog.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Returns the breed of the dog.
     *
     * @return The breed of the dog.
     */
    public String getBreed() {
        return this.breed;
    }
    /**
     * Returns the weight of the dog.
     *
     * @return The weight of the dog in kilograms.
     */
    public int getWeight() {
        return this.weight;
    }

}