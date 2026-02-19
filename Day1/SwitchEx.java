import java.util.*;

public class SwitchEx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Choice (VIBGYOR):");
        char ch = sc.next().charAt(0);
        ch=Character.toUpperCase(ch);
        String color=switch(ch){
            case 'V' ->{yield "Violent";}
            case 'I' ->{yield "Indigo";}
            case 'B' ->{yield "Blue";}
            case 'G' ->{yield "Green";}
            case 'Y' ->{yield "Yellow";}
            case 'O' ->{yield "Orange";}
            case 'R' ->{yield "Red";}
            default ->{yield "Invalid Input";}
        };
        System.out.println("Color is: " +color);
        /*
        switch(ch){
            case 'V':
                System.out.println("Violet");
                break;
            case 'I':
                System.out.println("Indigo");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'R':
                System.out.println("Red");
                break;
            default:
                System.out.println("NOt in the VIBGYOR");
        } */



    }
}
