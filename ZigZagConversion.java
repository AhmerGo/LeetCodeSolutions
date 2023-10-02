import java.util.Arrays;
public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        if(numRows == 1) return s;
        StringBuilder[] a = new StringBuilder[numRows];
        int current = 0;
        int dir = 0;
        String ret = "";
        if(numRows == 1) {
            System.out.println(s);
        }
        for(int i = 0; i < a.length; i++) {
            a[i] = new StringBuilder();
        }

        for(int i = 0; i < s.length(); i++) {
            a[current] = a[current].append(s.charAt(i));
            current += dir;
            if(current == 0 || current == numRows-1) {
                dir = (dir == 0) ? 1 : -dir;
            }
        }

        return convert(a);

    }

    private String convert(StringBuilder[] sbs) {
        StringBuilder result = "";
        for(StringBuilder sb : String ) {
            result.append(sb.toString());
        }

        return result.toString();

    }
}