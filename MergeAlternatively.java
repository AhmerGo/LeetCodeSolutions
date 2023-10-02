public class MergeAlternatively{ 
    public static void main(String[] args)  {
        String word1 = "abcd";
        String word2 = "pq";
        int one = 0;
        int two = 0;

        int x = word1.length() + word2.length();
        StringBuilder a = new StringBuilder();

        while(a.length() < x) {
            if(a.length()%2 == 0 && one <= word1.length() || two == word2.length()) {
                a.append(word1.charAt(one));
                one++;
            }else if(two <= word2.length() || one == word1.length()){ 
                a.append(word2.charAt(two));
                two++;
            }            
        }


        System.out.println(a);
    }
}