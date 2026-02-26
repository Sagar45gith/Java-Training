import java.util.Scanner;
public class StringMethods{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String ss = sc.nextLine();

        //1.length
        System.out.println("Length "+ss.length());

        //2.toUpperCase()
        System.out.println("Uppercase "+ss.toUpperCase());

        //3.tolowerCase()
        System.out.println("Lowercase "+ss.toLowerCase());

        //4.chatAt(index)
        System.out.println(ss.charAt(7));

        //5.substring(begin,end)
        System.out.println(ss.substring(0,5));

        //6.concat or '+'
        String str = "Babar Azam";
        System.out.println("Concat: "+ss.concat(str));
        System.out.println(ss+" "+str);

        //7.equals()
        System.out.println(ss.equals("Bin"));

        //equalsIgnoreCase
        System.out.println(ss.equalsIgnoreCase("Bin"));
        
        //9.replace
        System.out.println(ss.replace("Bin", "Laden"));

        //10.trim() - removes the spaces
        String strr = "         air    ";
        System.out.println(strr.trim());

        //11.startsWith()
        System.out.println(ss.startsWith("V"));

        //12.endsWith()
        System.out.println(ss.endsWith("i"));

        //13.indexOf()
        System.out.println(ss.indexOf('o'));

        //14.compareTo()
        System.out.println(ss.compareTo("Wohit Sharma"));

        //15.split()
        String[] words=ss.split(" ");
        for(String word:words){
            System.out.println(word);
        }
        //16.isLetter() and 17.isDigit()
        for(int i =0;i<input.length();i++){
            char c = ss.charAt(i);
            if(Character.isLetter(c)){
                System.out.println("Is Letter");
            }
            else if(Character.isDigit(c)){
                System.out.println("Its a Digit");
            }
            else{
                System.out.println("Nor a letter nor a digit");
            }
        }
    }
}