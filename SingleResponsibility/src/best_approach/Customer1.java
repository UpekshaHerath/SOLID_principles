package best_approach;

/**
 * In this best approach every class has a single responsibility.
 * In the wrong_approach there were 3 approaches
 * Now -> one responsibility per class
 */

public class Customer1 {
    private String name;
    private Integer age;

    public Customer1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

}
