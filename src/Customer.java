package src;

/*
 * Represents a customer of a bank 
 */

public class Customer {
    // instance vars
    /*
     * create name of a customer.
     */
    String name;

    /*
     * create address of a string.
     */
    String address;

    // constructor

    /*
     * creates a
     */

    public Customer(String name) {
        this.name = name;
    }

    /*
     * sets the address of the customers;
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /*
     * returns the name of customer
     * returns name
     */
    public String getName() {
        return this.name;
    }

    /*
     * returns the address of customers;
     */
    public String getAddress() {
        return this.address;
    }

}
