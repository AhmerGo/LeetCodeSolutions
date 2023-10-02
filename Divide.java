public class Divide {
    public static void main(String[] args){
        int dividend = -2147483648;
        int divisor = -1;
        int quotient = 0;
        int track = 0;
        if(isNeg(dividend)){
            Math.abs(dividend);
            track++;

        }
        if(isNeg(divisor)){
            divisor *= -1;
            track++;
        }
        System.out.println(Math.abs(-4));
        System.out.println(dividend);
        System.out.println(divisor);
        while(dividend>=divisor){
            dividend-= divisor; 
            quotient++;
        }
        
        for(int i =0; i < track; i++){
            quotient*= -1;
        }
        System.out.print(quotient);
    }

    public static boolean isNeg(int a){
        return a < 0;
    }
}