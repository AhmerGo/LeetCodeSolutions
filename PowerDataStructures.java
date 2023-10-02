public class PowerDataStructures { 
    public static void main(String[] args)  { 
        System.out.println(power(2,5));
    }

    public static double power(double x, double n) { 
        if(n==0)  { 
            return 1; 
        }else if(n%2==1) { 
            double y= power(x,(n-1)/2);
            return x*y*y;
        }else{ 
            double y = power(x,n/2);
            return y*y;
        }
    }
}