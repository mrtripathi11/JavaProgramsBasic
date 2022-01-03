public class GCDOfTWONumbers {
    public static int gcd(int m ,int n){
        if(m==0)
            return n;
        if(n==0)
            return m;
        if(m==n){
            return m;
        }
        if(m>n){
            return gcd(m-n,n);
        }
        else{
            return  gcd(m,n-m);
        }
    }

    public static void main(String[] args) {
        int m =40;
        int n = 20;
        System.out.println("GCD of numbers 14 and 12 is:" + gcd(m,n));
    }
}
