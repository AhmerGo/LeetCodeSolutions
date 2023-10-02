public class IntegerToRoman {
    public static void main(String[] args) {
        // create two parallel arrays of roman numerals and their equivalent values.
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int num = 58;
        // Since every index in both arrays can be equivalent to one another, we can create a tracker index i to parse through the nums array until 
        // num is greater than or equal to the given value.
        String t = "";
        int i = 0;
        while(num>0){
            if(num >= nums[i]) {
                t += symbols[i];
                num -= nums[i];
            }else{
                i++;
            }
        }
        System.out.println(t) ;

    }
}