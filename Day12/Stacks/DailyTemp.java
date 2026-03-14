import java.util.*;
public class DailyTemp{
    public int[] solve(int[] temp){
        int n = temp.length;
        int[] res = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i =0;i<n;i++){
            while(!stack.isEmpty() && temp[i]>temp[stack.peek()]){
                int index = stack.pop();
                res[index]=i-index;
            }
            stack.push(i);
        }
        return res;
    }
    public static void main(String[] args){
        int[] temp = {73,74,75,71,69,72,76,73};
        DailyTemp sol = new DailyTemp();
        int[] res = sol.solve(temp);
        System.out.println("Output: "+Arrays.toString(res));
    }
}