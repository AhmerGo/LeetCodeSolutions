import java.util.Arrays;
public class RevWord{ 
    public static void main(String[] args) {

        String s = "A very  good  example ";
        
        StringBuilder sb = new StringBuilder();

        String[] str = s.split(" "); // splits string into an array of strings separated by spaces

        for(int i = str.length-1; i >= 0; i--) {
            if(str[i] != "") { // if the index of the string array at i, isn't equivalent to this "null" value then we can 
                sb.append(str[i]); // add the word into the stringbuilder
                sb.append(' '); // add a space after the word
            }
        }
        sb.setLength(sb.length()-1); // this might result on a leading space in some scenarios and so we'll remove the leading space by reducing length by 1.
        System.out.println(sb);
    }
}