import java.util.Arrays;
public class MultiplyStrings {

    public static void main(String[] args){
        String num1 = "321";
        String num2 = "123";
        System.out.println(num1 + "*" +  num2);
        System.out.println(Show(num1,num2));
    }
    public static String Show(String num1, String num2) {
        
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        int[] d = new int[num1.length() + num2.length()];
        for(int i = 0; i<num1.length();i++){
            for(int j = 0; j<num2.length();j++){
                d[i+j] = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        System.out.println(Arrays.toString(d));
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < d.length; i++){
            int digit = d[i]%10;
            int carry = d[i]/10;
            
            
            sb.insert(0,digit);
            if(i < d.length - 1){
                d[i+1] += carry;
            }
        }
        
        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();

    }   
}
