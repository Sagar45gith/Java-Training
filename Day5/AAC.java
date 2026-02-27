class Teacher {
    // Removed 'static' here so every teacher can have their own unique name!
    String name; 

    Teacher(String name) {
        this.name = name;
    }
}

class Student {
    public String name; 

    Student(String name) {
        this.name = name;
    }

    // ASSOCIATION HAPPENS HERE:
    // The Student method uses the Teacher object to do something (print a statement).
    // The Student does NOT store the Teacher as a class variable. 
    // They just interact and move on.
    void display(Teacher t) { 
        System.out.println(this.name + " is taught by " + t.name);   
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        // 1. We create the Teacher and Student independently in the main method.
        Teacher t = new Teacher("Nirmal");
        Student s = new Student("Shekhar");
        
        // 2. They interact here.
        s.display(t);   
        
        // 3. If 's' is destroyed, 't' still exists perfectly fine. They are independent.
    }
}