/*abstract class Human{

    abstract void eat();

    void walk(){
        System.out.println("Walking");
    }
}

class Mammal extends Human{
    
    void eat(){
        System.out.println("Humans Eat Everything");
    }
}

public class Abs2{
    public static void main(String[] args){
        Human ob = new Mammal();
        ob.eat();
        ob.walk();
    }
}
*/
abstract class Hero{
    private String Name;
    public Hero(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }

    abstract void power();

    public static void info(){
        System.out.println("DC Danger");
    }
}

class joker extends Hero{
    public joker(String name){
        super(name);
    }

    @Override
    void power(){
        System.out.println(getName());
    }
}

public class Abs2{
    public static void main(String[] args){
        Hero ob = new joker("Ser Dunken The Tall");
        ob.power();
        Hero.info();    //Static method can be called with the class name and abstract class can also have static method. cant use objects to call static method. (ob.info() is wrong).
    }
}