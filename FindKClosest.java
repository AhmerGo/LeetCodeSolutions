import java.util.List;
import java.util.LinkedList;
public class FindKClosest {
    public static void main(String[] args)  { 
        int[] arr = {1,2,3,4,5};
        int k = 4;
        int x = -1;
        int left = 0, right = arr.length - k;
        
        while(left < right) {
            int mid = (left + right)/2;
            System.out.println((x - arr[mid]) + " " + (arr[mid+k]-x)) ;
            if(x - arr[mid] > arr[mid+k] -x) {
                left = mid +1;
            }else{
                right = mid;
            }
        } 
        System.out.println(left) ;
        // left is now one.

        List<Integer> res = new LinkedList<>();
        for(int i = left; i < left+k; i++) {
            res.add(arr[i]);
        }

        System.out.println(res) ;
    }
}