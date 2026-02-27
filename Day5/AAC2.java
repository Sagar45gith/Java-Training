class Engine {
    String type;
    
    Engine(String type) {
        this.type = type;
    }
}

class Car {
    // COMPOSITION HAPPENS HERE:
    // The Car HAS an Engine.
    Engine engine;
    
    // Notice the difference from Aggregation! 
    // The constructor does NOT take an existing Engine object.
    // It only takes a String, and the Car takes FULL responsibility for creating the Engine inside itself.
    Car(String engineType) {
        this.engine = new Engine(engineType);
    }
    
    void show() {
        System.out.println("Car has Engine: " + engine.type);
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        // 1. We only create the Whole (Car). 
        // The Part (Engine) is created invisibly inside the Car.
        Car c = new Car("Petrol Engine");
        c.show();
        
        // 2. Lifecycle proof: There is no independent Engine object in this main method.
        // If the Car 'c' gets destroyed by Java's Garbage Collector, 
        // the Engine inside it is destroyed too. The Engine cannot outlive the Car.
    }
}