//Leetcode 503
import java.util.*;
public class NextGreater{
    public int[] solve(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result,-1);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i =0;i<2*n;i++){
            int num=nums[i%n];
            while(!stack.isEmpty() && nums[stack.peek()]<num){
                result[stack.pop()]=num;
            }
            if(i<n){
                stack.push(i);
            }
        }
        return result;
    }
    public static void main(String[] args){
        NextGreater sol = new NextGreater();
        int[] nums={1,2,3,4,3};
        int[] res = sol.solve(nums); 
        System.out.println("Arrays: "+ Arrays.toString(res));       
    }
}
