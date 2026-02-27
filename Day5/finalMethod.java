final class Parent{                 //cannot inherit final class.
    final void show(){              //cannot override final method
        System.out.println("Parent class");
    }
}

class child extends Parent{
    void show(){
        System.out.println("Child class");
    }
}

public class finalMethod{
    public static void main(String[] args){
        Parent p = new child();
        p.show();
    }
}

