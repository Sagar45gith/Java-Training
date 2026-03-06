import java.util.*;
public class ArrList{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1;i<=10;i++){
            arr.add(i);
        }
        /*for(int i =0;i<arr.size();i++){
            if(arr.get(i)>7){
                arr.remove(i);
            }
        }*/
        for(int i =arr.size()-1;i>=0;i--){
            if(arr.get(i)>7){
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}

//Output :
//[1, 2, 3, 4, 5, 6, 7, 9]
//Note : We cannot remove elements from an ArrayList while iterating through it using a for loop, as it can lead to unexpected behavior and errors. 
//In the above code, when we remove an element from the ArrayList, the indices of the remaining elements shift, which can cause us to skip over some elements
// or access out-of-bounds indices. To avoid this issue, we can use an iterator or a for-each loop to safely remove elements from the ArrayList while iterating through it.

//then why iterating backwards works?
//Iterating backwards works because when we remove an element from the ArrayList, the indices of the remaining elements shift to the left.
//By iterating backwards, we start from the end of the list and move towards the beginning. This way, when we remove an element, it does not affect the indices of the elements that we have already processed.
