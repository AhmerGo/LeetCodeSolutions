import java.util.List;
import java.util.LinkedList;
public class MinSizeSubArraySum {
    public static void main(String[] args){
        int target = 11;
        int[] nums = {1,2,3,4,5};
        int currentSum = 0; 
        int length = Integer.MAX_VALUE;
        int start = 0;

        for(int i = 0; i < nums.length; i++){
           currentSum += nums[i];
           while(currentSum >= target) {
              // this math.min function starts to subtract all of the elements, ascendingly, until the currentSum is no longer greater than or equal to the target.
              length = Math.min(length,i-start+1) ;
              currentSum -= nums[start];
              start++;
           }
        }

        length = (length == Integer.MAX_VALUE ? 0 : length);
        System.out.println(length);
    }
}