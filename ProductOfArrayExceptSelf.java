import java.util.Arrays;
public class ProductOfArrayExceptSelf {
    public static void main(String[] args)  {
        int nums[] = {1,2,3,4};
        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;
        
        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
            System.out.println(pre[i]);
        }
        for(int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
            System.out.println(suff[i]);
        }
        
        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println(pre[i] + " " + suff[i] );
            ans[i] = pre[i] * suff[i];
            
        }

    }
}