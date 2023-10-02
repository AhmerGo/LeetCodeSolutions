import java.util.Arrays;

public class FirstLastIndex{
    public static void main(String[] args)  {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;


        System.out.println(Arrays.toString(solution(nums,target)));
    
    }


    public static int[] solution(int[] nums, int target) { 
        int index = Arrays.binarySearch(nums,target);
        if(index < 0){ 
            return new int[] {-1,-1};
        }
        int left = index - 1 >= 0 && nums[index-1] ==target ? index - 1 : index;
        int right = index + 1 < nums.length && nums[index+1] == target ? index + 1 : index;
        System.out.println(right);
        boolean leftBoo = true;
        boolean rightBoo = true;
        while(leftBoo || rightBoo) { 
            if(left-1 >= 0 && nums[left-1] == target){
                left--;
            }
            if(right+1 < nums.length && nums[right+1]==target){
                right++;
            }
            if(right+1==nums.length || nums[right+1]!=target){
                rightBoo = false;
            }

            if(left==0 || nums[left-1]!= target){
                leftBoo = false;
            }
           
        }
        return new int[] {left,right};

    }
}