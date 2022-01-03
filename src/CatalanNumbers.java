public class CatalanNumbers {
    public static long fact(long n){
        if(n==0 || n==1)
            return 1;
        return( n* fact(n-1));
    }
    public static long catalan(long c){
        if(c == 0 || c==1){
            return 1;
        }
        else{
            return (fact(2*c)/((fact(c+1))*fact(c)));
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(20));
        System.out.println(catalan(5));
    }
}
