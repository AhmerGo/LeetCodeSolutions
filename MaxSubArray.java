import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
public class MaxSubArray { 
    public static void main(String[] args){

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max_sum = Integer.MIN_VALUE;
        int j = 0;
        int sum = 0;
        while(j < nums.length){
            // resets sum if its value is less than 0 and the value at index j is greater than sum.
            if(sum < 0 && nums[j] >= sum){
                sum = 0;
            }
            // adds values of array to sum, and resets if things go neg 
            sum += nums[j];
            // This value keeps track of our max sum as we traverse through the array.
            max_sum = Math.max(sum, max_sum);
            j++;
        }
        System.out.println(max_sum);
    }
}   