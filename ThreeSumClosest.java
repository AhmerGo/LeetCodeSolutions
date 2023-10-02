import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class ThreeSumClosest { 
    public static void main(String[] args)  {
        int[] nums = {4,0,5,-5,3,3,0,-4,-5};
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int target = -2;
        int closestSum = Integer.MAX_VALUE; // initialize cloesest sum to larger val
        int minDiff = Integer.MAX_VALUE; // same
        int sum = 0;
        for(int i = 0; i < nums.length-2; i++) {
            int right = nums.length -1;
            int left = i+1;

            while(left < right) {
                list.add(nums[i]);
                list.add(nums[i+1]);
                list.add(nums[right]);
                System.out.println(list) ;
                list.clear();
                sum = nums[i] + nums[i+1] + nums[right];
                int diff = Math.abs(sum-target);
                if(diff<minDiff) {
                    System.out.println(diff) ;
                    minDiff = diff;
                    closestSum = sum;
                }
                System.out.println(sum);


                if(sum < target ) {
                    left++  ;
                }else if (sum > target){
                    right--;
                }else{
                    System.out.println(sum);
                }
            }
            System.out.println(closestSum);
        }

    }



}