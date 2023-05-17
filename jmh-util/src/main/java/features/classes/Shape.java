package features.classes;

/**
 * <a href="https://openjdk.org/jeps/409">For more detail...</a>
 * <br>
 * The feature restricts which other classes or interfaces may extend or implement a sealed component. Showing another
 * improvement related to pattern matching combined with the JEP 406 will allow a more sophisticated and cleaner
 * inspection of the type, cast and act code pattern.
 * <br>
 * <br>
 * <br>
 * controlled inheritance:  Sealed classes allow you to control which classes can be subclasses.
 * By specifying which classes are allowed to extend a sealed class, you prevent arbitrary and uncontrolled subclassing.
 *
 */
public abstract sealed class Shape permits Rectangle, Circle, Square {
    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
