import java.util.Stack;
public class FirstOccurence {
    public static void main(String [] args){
        String haystack = "sadbutsad";
        String needle = "but";
        System.out.println(strStr(haystack,needle));

    }


    public static int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);


        
    }
}