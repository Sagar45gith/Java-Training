class Animal{
    void display(){
        System.out.println("Animalssss");
    }
}


class Cat extends Animal{
    @Override   //actul usage of @Override is to show that we are overriding the method. if we used another method like(display2) then we get a error, (cannot overide display2)
    void display(){
        System.out.println("meowwwwww");
    }    
}
public class override{

    public static void main(String[] args) {
        Cat c = new Cat();   //this is not overridiing.
        c.display();

        Animal a = new Cat();  // create the object with reference eto the parent class. This is used to show overriding
        a.display();
    }
}
