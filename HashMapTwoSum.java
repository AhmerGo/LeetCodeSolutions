import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
public class HashMapTwoSum {
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            for (Integer x: map.keySet()) {
                String key = x.toString();
                String value = map.get(x).toString();
                System.out.println(key + " " + value);
            }
            System.out.println("Next iteration of map: ");
            System.out.println("Complement value: "+complement);
            
            if(map.containsKey(complement)) {
                arr[0] = map.get(complement);
                arr[1] = i;
                break;
            }
            map.put(nums[i], i);
        }

        System.out.println(Arrays.toString(arr));





    }
}