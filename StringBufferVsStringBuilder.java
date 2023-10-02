
public class StringBufferVsStringBuilder{
    public static void main (String[] args){
        StringBuffer sb = new StringBuffer("Navin");
        sb.append(" Reddy");
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i)== ' ' || sb.charAt(i)== 'n' || sb.charAt(i) == 'N'){
              sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
        sb.insert(0,"N");
        sb.insert(4,"n");
        sb.insert(6,"Java ");
        String str = sb.toString();
        sb.insert(sb.length()," L");
        
        System.out.println(sb);
    }
}