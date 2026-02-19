import java.util.*;

public class HappyNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        while (n != 1 && n != 4) {
            int sum = 0;

            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n = n / 10;
            }

            n = sum;   // Update number for next iteration
        }

        if (n == 1) {
            System.out.println("Happy");
        } else {
            System.out.println("Sad");
        }
    }
}
