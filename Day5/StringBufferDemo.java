import java.util.Scanner;
public class StringBufferDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = "Baelor";
        StringBuffer sb = new StringBuffer(ip);
        
        sb.append(" Targaryen");
        System.out.println(sb.toString());

        //insert
        sb.insert(0, "King ");
        System.out.println(sb.toString());

        //replace
        sb.replace(5, 11, "Aegon");
        System.out.println(sb.toString());

        //delete
        sb.delete(0, 5);
        System.out.println(sb.toString());

        //reverse
        sb.reverse();
        System.out.println(sb.toString());

    }
}