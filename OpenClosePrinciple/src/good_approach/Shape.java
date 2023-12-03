package good_approach;

/**
 * This shape interface is open to extension close to modify.
 * Just create an interface when you need to implement a common functionality for other classes also.
 * Then that property will be open to extension and close for modification
 */

public interface Shape {
    void Draw();
}
