package wrong_approach;

/**
 * Here the Customer class have multiple responsibilities.
 * 1. To write customer data to DB
 * 2. To send email related to customers
 *
 * Therefor this approach is not good to follow
 */

public class Customer {
    private String name;
    private Integer age;

    public Customer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void sendEmailToCustomer() {
        System.out.println("Sent email to " + this.name);
    }

    public void saveCustomerInDB() {
        System.out.println("Saved the customer " + this.name + " DB...");
    }

}
