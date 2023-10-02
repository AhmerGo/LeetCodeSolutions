public class HappyNumber { 
    public static void main(String[] args)  {

        int n = 19;
        int sum = 0;



        while(n != 1 ) { 

            while(n > 0) {
                sum += (n%10)*(n%10);
                n /= 10;
            }

            n=sum;
            sum = 0;

        }


            System.out.println(n);









       
    }
}