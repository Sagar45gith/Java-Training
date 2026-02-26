interface Human{
    void power(); //by default abstact method (interface)
    default void identity(){
        System.out.println("Saul Godman");
    }
}
interface Women{

    void energy();
    default void energy1(){    //Why default method? because if we have two interfaces with same method name then we can use default method to avoid ambiguity. (if we have two interfaces with same method name and both are default then we get error because of ambiguity).
        System.out.println("Kim Wexler");
    }
}

class Jimmy implements Human,Women{
    public void power(){
        System.out.println("Lalo salamanca");
    }
    public void energy(){
        System.out.println("Kim Wexler");
    }
}

public class InterfaceDemo{
    public static void main(String[] args){
        Human h1 = new Jimmy();
        h1.power();
        h1.identity();

        Women w1 = new Jimmy();
        w1.energy();
    }
}