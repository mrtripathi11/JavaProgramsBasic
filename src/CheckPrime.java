public class CheckPrime {
    public static boolean prime(int n){
        if(n==0||n==1)
            return false;
        if(n==2)
            return true;
        for (int i = 2; i <= n/2; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(prime(11));
    }
}
