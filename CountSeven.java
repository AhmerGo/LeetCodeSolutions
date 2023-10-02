public class CountSeven {
    public static void main(String[] args){
        System.out.println(countS(717));
   
    }

    public static int countS(int n) {
        if(n==0){
            return 0;
        }
        int x =0;
        if(n%10 == 7) {
            x++;
        }

        return x + countS(n/10);


    }
}