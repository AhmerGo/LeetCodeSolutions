import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class RevVowel {
    public static void main(String[] args) { 
        Queue<Character> a = new LinkedList<>();
        String s = "Hello";

        char[] cha = s.toCharArray();
        for(int i = s.length()-1; i >= 0; i--) {
            char ch = cha[i];
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                a.add(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(a);
                sb.append(a.remove());
            }else{
                sb.append(ch);
            }
        }
        
        System.out.println(sb);
        

    }
}