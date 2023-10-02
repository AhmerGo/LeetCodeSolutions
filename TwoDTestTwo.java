public class TwoDTestTwo {
    public static void main(String[] args) { 


        int[][] matr = new int[3][2];
    

        for(int i = 0; i < matr.length; i++) {
            for(int j = 0; j < matr[0].length; j++) {
                matr[i][j] = i + j;
            }
        }

        for(int i = 0; i < matr.length; i++) {
            for(int j = 0; j < matr[0].length; j++) {
                System.out.println(matr[i][j]);
            }
        }

        System.out.println("\n"+matr.length);
        System.out.println(matr[0].length);



    }

}