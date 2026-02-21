
public class overload{

        void display(int a, int b){
            int sum = a+b;
            System.out.println("Sum: "+sum);
        }

        void display(int a, int b, int c){
            int sum = a+b+c;
            System.out.println("Sum: "+sum);
        }

        void display(float a, float b, float c){
            float sum = a+b+c;
            System.out.println("Sum: "+sum);
        }

    public static void main(String[] args) {
        overload ob = new overload();
        ob.display(10,20);
        ob.display(10,20,30);
        ob.display(11.3f,12.4f,7.3f);
    }
}
