public class SBTest { 
    public static void main(String[] args ) { 
        StringBuilder sb = new StringBuilder(); 
        sb.append("abc"); 

        System.out.println(sb.toString().contains("z"));
        
    }
}