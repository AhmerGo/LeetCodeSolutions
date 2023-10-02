import java.io.list
public class CombinationSum {
    public static void main(String[] args){

        int[] candidates = {2,3,6,7};
        int target = 7;

        for(int i = 0; i < candidates.length; i++){
            if(sum(candidates[i], candidates, i, target) == target){
               break;
            }
        }
   
    }

    public static int sum(int a, int[] array, int index, int target){
        int test = a;
        while(test != target){
            index++;
            test += a;
            if(test + array[index] == target){
                System.out.println(a + (array[index]));
                return index;
            }
        }
        return 0;
    }
}