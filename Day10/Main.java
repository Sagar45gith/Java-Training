import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[26];

        // Count frequency
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        // Find maximum frequency
        int max = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i] > max){
                max = freq[i];
            }
        }

        // Print characters with max frequency
        for(int i = 0; i < 26; i++){
            if(freq[i] == max){
                System.out.print((char)(i + 'a') + " ");
            }
        }
    }
}