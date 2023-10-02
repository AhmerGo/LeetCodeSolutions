public class FlowerBed {
    public static void main(String[] args)  {

        int[] a = {0,0,1,0,1};
        System.out.println(canPlaceFlowers(a,1));

    
    }




    public static boolean canPlaceFlowers(int[] flowerbed, int n) { 
        if(flowerbed[0] == 0 && flowerbed[1] == 0) { 
            flowerbed[0] = 1;
            n--;
        }
        if(flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0)  {
            flowerbed[flowerbed.length-1] = 1;
            n--;
        }
        for(int i = 0; i < flowerbed.length; i++) { 
            if(n==0) {
                return true;
            }
            int left = i-1;
            int right = i+1;

            if(left >= 0 && right < flowerbed.length && flowerbed[left] == 0 && flowerbed[right] == 0 && flowerbed[i] == 0) {
                System.out.println(left);
                System.out.println(right);
                flowerbed[i] = 1;
                n--;
            }
            if(i+1 == flowerbed.length && n!= 0) {
                return false;
            }
        }

        return true;
    }

}
