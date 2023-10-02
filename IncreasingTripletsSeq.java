public class IncreasingTripletsSeq {
    public static void main(String[] args) {
        int[] nums = {20,100,10,12,5,13};
        int x = 0;
        int next = 1;

        for(int i = 0; i < nums.length; i++) { 
           if(nums[i] < nums[next]){
                x++;
           }else{
                x = 0;
           }
           System.out.println(nums[i] + "  " + nums[next]); 
           if(next+1 < nums.length){
                next++;
           }
           System.out.println(x) ; 

           if(x == 2) {
                System.out.println("True") ; 
           }
            
        }
    }
}