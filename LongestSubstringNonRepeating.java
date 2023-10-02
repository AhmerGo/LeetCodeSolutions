import java.util.Set;
import java.util.HashSet;
public class LongestSubstringNonRepeating {
    public static void main(String[] args) {
        String s = "abca";

        Set<Character> set = new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            // if the set does NOT contain the character, we will add the character to the set and then change the length to the difference of the two pointers
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
                
            }else{
                // if the character at "i" isn't equivalent to any character in the set, then we will remove the character from the set.
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));left++;
                set.add(s.charAt(right));
            }
            
        }

        System.out.println(maxLength);

            
            
            
    }
}