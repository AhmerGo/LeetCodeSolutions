public class ChangePi {
    public static void main(String[] args){
        String str = "xpix";

        
        System.out.println(changePi(str));
    }

    public static String changePi(String str) {
        if(str.length() < 2) {
            return str;
        }
        String s = "";

        if(str.substring(0,2).equals("pi")) { 
            s = "3.14";
        }else{
            s = str.substring(0,1);
        }
        return s + changePi(str.substring(1,str.length()));

        
    }
}