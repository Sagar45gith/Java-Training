import java.util.*;
public class seprateChaining{
    static int tablesize=10;
    static LinkedList<Integer> []table = new LinkedList[tablesize];
    static public void insert(int key){
        int index= key%tablesize;
        if(table[index]==null){
            table[index]=new LinkedList<>();
        }
        table[index].add(key);
    }
    static public void display(){
        for(int i =0;i<tablesize;i++){
            System.out.print(i+"->");
            if(table[i]!=null){
                for(int value:table[i]){
                    System.out.print(value+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        insert(10);
        insert(23);
        insert(19);
        insert(30);
        insert(22);
        insert(29);

        display();
    }
}