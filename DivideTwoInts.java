public class DivideTwoInts{
    public static void main(String[] args){
        int dividend = 12;
        int divisor = 3;
        int x = 0;
        int symbolOne = dividend/dividend;
        while(dividend > divisor){
            dividend -= Math.abs(divisor);
            x++;
        }
        System.out.println(x);

    }
}