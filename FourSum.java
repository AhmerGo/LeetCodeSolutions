import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Arrays;
public class FourSum {
    public static void main(String[] args) {
        int[] num = {0,0,0,0,1};
        int target = 1;
        System.out.println(threeSum(num,target));

    }
    public static List<List<Integer>> threeSum(int[] nums, int target) {
        
        List<List<Integer>>ans=new ArrayList<>();
        
        if(nums==null || nums.length==0) return ans;
        // real size of array 
        int n = nums.length;
        
        // sorting this array will enable us to adjust pointers to approximate to the target sum.
        Arrays.sort(nums);
        // 4-pointers i,j,first,last
        // i is the first pointer that increments by one every loop.
        for(int i=0;i<n;i++){
            // by subtracting the smallest element in the current set we can start approximating the target 
            long target2=(long)target-(long)nums[i];
            // j is the 2nd pointer(i+1) that increments by one every loop.
            for(int j=i+1;j<n;j++){
                // at this point we'll subtract the first 2 elements and have a remaining value that needs to be comprised of 
                // 2 distinct index values: "first" and "last."
                long remaining=(long)target2-(long)nums[j];
                // first is the 3rd pointer(j+1) that increments by one.
                int first=j+1;
                // last is the 4th pointer and the last element in the array.
                int last=n-1;
                // while the 3rd pointer is less than the last element pointer
                while(first<last){
                    
                    long twoSum=(long)nums[first]+(long)nums[last];
                    // if the sum is less than the remnant, we want to increase the left pointer(increase total value)
                    // if the sum is greater than the remnant, we want to decrease the right pointer(reduce total value)
                    if(twoSum<remaining) {
                        first++;
                    }
                    else if(twoSum>remaining) {
                        last--;
                    }
                    // this is invoked when twoSum == remaining, in which case we create a new list and and add it to the answer.
                    else{
                        List<Integer>res=new ArrayList<>();
                        res.add(nums[i]);//num 1
                        res.add(nums[j]);//num 2
                        res.add(nums[first]);//num 3
                        res.add(nums[last]);//num 4
                        ans.add(res);

                        // Processing the duplicates of number 3
                        while(first<last && nums[first]==res.get(2)) first++;

                        // Processing the duplicates of number 4
                        while(first<last && nums[last]==res.get(3)) last--;
                    }
                }
                // Processing the duplicates of number 2
                while(j+1<n && nums[j+1]==nums[j]) j++;
            }
            // Processing the duplicates of number 1
            while(i+1<n && nums[i+1]==nums[i]) i++;
        }
        return ans;
    }
}
