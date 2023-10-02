public class JumpGame {
    public static void main(String[] args) { 
        int[] nums = {2,2,1,0,4};

        int reachable = 0; 

        for(int i = 0; i < nums.length; i++) { 
            System.out.println(reachable) ;
            if(i > reachable) 
            reachable = Math.max(reachable, i + nums[i]); 

        }

      
        
    


    }

}