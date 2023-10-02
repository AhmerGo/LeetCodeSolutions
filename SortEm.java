import java.util.Arrays;
public class SortEm {
    public static void main(String[] args){
        int[] a = {3,65,1,7,13,4};
        int temp = 0;
        for(int i= 0; i < a.length; i ++){
            for(int j = 0; j < a.length; j++){
                System.out.println(Arrays.toString(a));

                if(a[i] < a[j]) { 
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}