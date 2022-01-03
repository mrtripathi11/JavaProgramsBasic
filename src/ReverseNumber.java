public class ReverseNumber {
    public static void main(String[] args) {
        int n = 221; //sc.nextInt();
        int digits = 0;
        while (n > 0) {
            int rem = n % 10;
            digits = (digits * 10) + rem;
            n = n / 10;
        }
        System.out.println("Reversed no :"+digits);
    }
}
