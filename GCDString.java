public class GCDString{
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        StringBuilder sb = new StringBuilder(); 

        int min = Math.min(str1.length(),str2.length());

        for(int i = 0; i < min; i++) {
            if(sb.length() >= Math.min(str1.length(),str2.length()) || sb.indexOf((str1.charAt(i)+"")) > 0) {
                break;
            }
            if(str1.charAt(i) == str2.charAt(i) && sb.indexOf((str1.charAt(i)+"")) == -1) {
                sb.append(str1.charAt(i));
            }

        }

        System.out.println(sb.toString());










        

    }
}