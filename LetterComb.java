import java.util.LinkedList;
import java.util.*;
import java.util.Arrays;
public class LetterComb {
    public static void main(String[] args){

        String digits = "23";
        System.out.println(letterCombination(digits));
    }

    public static List<String> letterCombination(String digits){
            LinkedList<String> linky = new LinkedList<>();
            if(digits.length() == 0) {
                return linky;
            }
            linky.add("");
            String[] map = {"0", "1", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            for(int i = 0; i < digits.length(); i++) {
                int num = digits.charAt(i) - '0';

                //  while length of the first element in list is equal to i, add every permutation of digit's alphanumeral;
                //  after we add every permutation to the list, we remove the next character and find its respective permutations
                // we do this over and over until the first element's length in the list is equivalent to i.
                while(linky.peek().length() == i){
                    System.out.println(linky);
                    System.out.println(linky.peek().length() + " " + i);
                    String t = linky.remove();
                    for(char ch : map[num].toCharArray()) {
                        linky.add(ch+t);
                    }
                }
      
            }
            return linky;
    }
}