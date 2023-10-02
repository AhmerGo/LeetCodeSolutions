import java.util.Arrays;

public class FloodFil {
    public static void main(String[] args) { 

        int[][] a = new int[4][6];
        

        for(int i = 0;  i < a.length; i ++) {
            for(int j = 0; j < a[0].length;j++) {
                a[i][j] = 1;
            }
        }

        System.out.println(Arrays.toString(a[0]));

        a = floodfill(a) ;

    
    }


    public static int[][] floodFill(int[][] a)  {
        if(a)




        floodFill(
    }
}