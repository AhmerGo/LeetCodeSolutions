import java.util.ArrayList;
public class UniqueCharacters { 
    public static void main(String[] argS)  {
        String s = "statistics";
        System.out.println(uniqueValIndex(s));

    }

    public static ArrayList uniqueValIndex(String s) { 
        ArrayList<Integer> arr = new ArrayList<>();
        boolean unique = true;
        int x = 0;
        
        for(int i = 0; i < s.length();i++) {
            char ch = s.charAt(i);
            for(int j = 0; j < s.length(); j++ ){
                System.out.println(s.charAt(j) + " " + ch); 
                if(ch==s.charAt(j)) {
                    x++;
                }
                if(x>1){
                    unique = false;
                    break;
                }
            }
            if(unique){
                arr.add(i);
            }
            x = 0;
            unique = true;
        }

        return arr;
    }

}