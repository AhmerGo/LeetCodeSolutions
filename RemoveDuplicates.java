import java.util.Arrays;
public class RemoveDuplicates{
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] tempArr = new int[nums.length];
        int x = 0;
        int prev = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]>prev){
                tempArr[x] = nums[i];
                prev = nums[i];
                x++;
            }
        }
        nums = tempArr;
        System.out.println(Arrays.toString(nums));
    }
}