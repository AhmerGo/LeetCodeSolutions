import java.util.HashMap;
public class HashMaps {
    public static void main(String[] arguments){
        HashMap<Integer,String> a = new HashMap<>(); 
        String digits = "238";
        int store = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < digits.length(); i++){
            int num = digits.charAt(i) - '0';
            int extra = num >= 8 ? 1 : 0;
            int alphaNum = (digits.charAt(i) + 47) + ((num-2)*2) + extra;
            store = (num == 7 || num == 9) ? -1 : 0;
            while(store < 3) {
                sb.append((char)alphaNum);
                alphaNum += 1;
                store++;
            }
            a.put(num, sb.toString());
            sb.setLength(0);

        }
        System.out.println(a);
    }
}