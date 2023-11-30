package bad_approach;

/**
 * We have to modify the circle class or any other class one by one when changing.
 * And these can't extend to add functionality. This is the problem and
 * this may violate the open close principle.
 */
public class Circle {

    void drawCircle() {
        System.out.println("Draw the circle");
    }
}
