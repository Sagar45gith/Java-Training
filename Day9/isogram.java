import java.util.*;
public class isogram {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        // Your code here
        HashSet<Character> set = new HashSet<>();
        int len1 = data.length();
        for(int i =0;i<data.length();i++){
            set.add(data.charAt(i));
        }
        int len2 = set.size();
        
        if(len1==len2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "Machine";
        if(isIsogram(str)){
            System.out.println(str+" is an Isogram");
        }
        else{
            System.out.println(str+" is not an Isogram");
        }
    }
}