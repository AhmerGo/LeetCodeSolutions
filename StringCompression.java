public class StringCompression  {
    public static void main(String[] args)  {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        StringBuilder sb = new StringBuilder(); 
        int increment = 0;
        for(char ch : chars)  {
            if(!sb.toString().contains(ch+"")) {
                sb.append(ch+"");
                increment = 0;
            }else{ 
                increment++; 
            } 
            System.out.println(increment);
        }

        System.out.println(sb); 


    }
}