//panagram
import java.util.*;
public class LC1832{
    public static void main(String[] args){
        String str="qwertyuiopasdfghjklmnbvcxz";
        str=str.toLowerCase();
        Set<Character> letters = new HashSet<>();
        for(char c: str.toCharArray()){
            if(Character.isLetter(c)){
                letters.add(c);
            }
        }
        if(letters.size()==26){
            System.out.println("Panagram");
        }
        else{
            System.out.println("Not a Panagram");
        } 
    }
}
/*
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            seen[sentence.charAt(i) - 'a'] = true;
        }

        for (boolean b : seen) {
            if (!b) return false;
        }

        return true;
    }
}*/
