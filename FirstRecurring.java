public class FirstRecurring {
    public static void main(String[] argS) {
        String a = "DBCABA";
        String temp;
        for(int i = 0; i < a.length();i++) {
            temp = a.substring(0,i);
            if(temp.contains(a.charAt(i)+"")){
                System.out.println(i);
                break;
            }
            
            
            
        }
    }
}