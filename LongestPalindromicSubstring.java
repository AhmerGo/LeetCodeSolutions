public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "baba";
        String temp = "";
        int subX = 0;
        int subY = 0;
        int tempLen = 0 ;
        System.out.println(s.length()/2 ) ;

        for(int i = 0; i <= s.length(); i++ ) {
            int l = i; 
            int r = i;

            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) { 
                if(r-l +1 > tempLen) { 
                    temp = s.substring(l, r+1) ; 
                    tempLen = r-l + 1; 
                }
                l -= 1 ; 
                r += 1 ;
            }
            l = i; 
            r = i+ 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) { 
                if(r-l +1 > tempLen) { 
                    temp = s.substring(l, r+1) ; 
                    tempLen = r-l + 1; 
                }
                l -= 1 ; 
                r += 1 ;
            }
    
        }
        System.out.println(temp) ; 
    



    }

    public static boolean palindromeCheck(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();    
        return sb.toString().equals(s);

    }
}
