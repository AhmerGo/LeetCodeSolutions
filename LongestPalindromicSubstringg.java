import java.util.Stack;
import java.util.LinkedList;
public class LongestPalindromicSubstringg  { 
    public static void main(String[] args)  { 
        String s = "babad";
        int tempLen = 0;
        String sub = "";
        
        for(int i = 0; i <= s.length() ; i ++ ) { 
            for(int j = i; j <= s.length() ; j ++)   { 
                String g = s.substring(i,j);
                if(palindromeCheck(g) && tempLen <= g.length()) { 
                    tempLen = g.length();
                    sub = g;
                }
            }
        }
        System.out.println(sub);
         

    

    }


    public static boolean palindromeCheck(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();    
        return sb.toString().equals(s);

    }
}