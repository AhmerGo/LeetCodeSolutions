import java.util.Arrays;

public class SearchCode{
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;

        System.out.println(solution(nums,target)); 
    }

    public static int solution(int[] nums, int target) { 
        int index = Arrays.binarySearch(nums,target);
        if(index >= 0){
            return index;
        }
        int diff = 0;
        int trueDiff = 300;
        int in = 0;
        for(int i = 0; i < nums.length; i++) {
            if(target < nums[0]) { 
                return 0;
            }else if(target>nums[i]) { 
                diff = Math.min(target-nums[i],trueDiff);

                if(diff>0){
                    trueDiff = diff;
                    in = i;
                }
            }else{
                break;
            }


        }

       



        

        return in+1;

    }



}
