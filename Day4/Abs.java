/* Abstract Method
    * An abstract method is a method that is declared without an implementation (No body). 
    * It is meant to be overridden by subclasses. 
    * Abstract methods are defined in abstract classes, and they must be implemented by any concrete subclass.
    * 
    * Abstract Class
    * An abstract class is a class that cannot be instantiated. It is meant to be subclassed by concrete classes. 
    * Abstract classes can contain both abstract and non-abstract methods. 
    * Abstract methods in an abstract class must be implemented by any concrete subclass that extends it.
    * 
    * Interface  (100% Abstraction).
    * An interface is a reference type in Java that is similar to a class but can contain
    * only abstract methods, default methods, static methods, and final variables.
    * An interface cannot be instantiated and is meant to be implemented by classes.
    * Interfaces are used to achieve abstraction and multiple inheritance in Java.
    * Multipple inheritance is not possible with classes in Java, but it is possible with interfaces.
    * A class can implement multiple interfaces, allowing it to inherit behavior from multiple sources.
    * 
    * 
    * Two types to declare abstract class:
    * 1. Using abstract keyword:
    *   abstract class MyAbstractClass {
    *      // Abstract method (no body)
    *     abstract void myAbstractMethod();
    *     // Non-abstract method (with body)
    *    void myNonAbstractMethod() {
    *       System.out.println("This is a non-abstract method.");
    *   }
    * 
    * 2. Using interface:
    *  interface MyInterface {
    *    // Abstract method (no body)
    *   void myAbstractMethod();
    *   // Default method (with body)
    *  default void myDefaultMethod() {
    *      System.out.println("This is a default method.");
    * }
    * 
    * * Abstract classes are used when you want to provide a common base class for a group of related classes, while interfaces are used when you want to define a contract that multiple classes can implement.
    * * Abstract classes can have constructors, while interfaces cannot.
    *   why? because abstract classes can have instance variables and can be instantiated through their subclasses, while interfaces cannot have instance variables and cannot be instantiated directly.
    * * * Abstract classes can have both abstract and non-abstract methods, while interfaces can only have abstract methods (until Java 8, after which they can also have default and static methods).
    * * * A class can extend only one abstract class, but it can implement multiple interfaces
*/

abstract class Shape {
// Abstract method
    abstract double area();

    // Concrete method
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {

    int radius = 5;

    // Implementing abstract method
    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

public class Abs{
    public static void main(String[] args) {

        Shape shape = new Circle();  // Upcasting
        shape.display();
        System.out.println("Area of Circle: " + shape.area());
    }
}