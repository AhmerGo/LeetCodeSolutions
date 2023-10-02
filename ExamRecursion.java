public class ExamRecursion {

    public static void main(String[] args) { 
        double [] cool= {12,45,22,15,32};

        System.out.println(fun(cool,0,4));

    }


    public static double fun(double [] a, int b, int c) {
        double d,e;
        System.out.println((b) + " " + (c));
        if (b>c) return 0;
        if (b==c) return a[b];

        d= fun(a,b,(b+c)/2);
        System.out.println("d: "+d);
        System.out.println((b) + " " + (c));

        e= fun(a,(b+c)/2+1,c);
        System.out.println("e: "+e);

        if (d >=e)
        return d;
        else
        return e;
    }

}
