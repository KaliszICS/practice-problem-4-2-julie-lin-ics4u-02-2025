/**
 * Car class representing a car with make, model, year and price.
 */
public class Car {
    /**
     * The make of the car.
     * The model of the car.
     * The year of manufacture of the car.
     * The price of the car.
     */
    private String make;
    private String model;
    private int year;
    private double price; 

    /**
     * Constructor to initialize the Car object.
     *
     * @param make  The make of the car.
     * @param model The model of the car.
     * @param year  The year of manufacture of the car.
     * @param price The price of the car.
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    // Setters
    /**
     * Sets the make of the car.
     *
     * @param make The new make of the car.
     */
    public void setMake(String make) {
        this.make = make;
    }
    /**
     * Sets the model of the car.
     *
     * @param model The new model of the car.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Sets the year of manufacture of the car.
     *
     * @param year The new year of manufacture of the car.
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * Sets the price of the car.
     *
     * @param price The new price of the car.
     */
    public void setPrice(double price) {
        this.price = price;
    }
    // Getters
    /**
     * Returns the make of the car.
     *
     * @return The make of the car.
     */
    public String getMake() {
        return this.make;
    }
    /**
     * Returns the model of the car.
     *
     * @return The model of the car.
     */
    public String getModel() {
        return this.model;
    }
    /**
     * Returns the year of manufacture of the car.
     *
     * @return The year of manufacture of the car.
     */
    public int getYear() {
        return this.year;
    
    }
    /**
     * Returns the price of the car.
     *
     * @return The price of the car.
     */
    public double getPrice() {
        return this.price;
    }
}