/*class Parent{
    void display(){
        System.out.println("Parent class");
    }
}

class Child extends Parent{
    void displayChild(){
        System.out.println("Child class");
    }
}

class grandChild extends Child{
    void displayGC(){
        System.out.println("I'm Grand Child");
    }
}

public class A {
    public static void main(String[] args) {
        grandChild c = new grandChild();
        c.display();
        c.displayChild();
        c.displayGC();
    }
}*/

//Hirarchical Inheritance
class Parent{
    void display(){
        System.out.println("Parent class");
    }
}

class Brother extends Parent{
    void displayB(){
        System.out.println("Brother class");
    }
}

class Sister extends Parent{
    void displayGC(){
        System.out.println("Sister class");
    }
}

public class A {
    public static void main(String[] args) {
        Sister s = new Sister();
        s.displayGC();
        s.display();

        Brother b = new Brother();
        b.displayB();
        b.display();

    }
}
