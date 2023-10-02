public class BunnyEars {
    public static void main(String[] args) {
        int bunnies = 5;

        System.out.println(BunnyEarsT(bunnies));
    }

    public static int BunnyEarsT(int bunnies) {
        if(bunnies == 1){
            return 2;
        }
        int x;
        if(bunnies % 2 == 0) {
            x = 3;
        }else{
            x = 2 ;
        }
        return BunnyEarsT(bunnies-1)+x;
    

    }
}