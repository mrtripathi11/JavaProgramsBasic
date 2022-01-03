import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Enter a no to check if it is palindrome");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int digits = 0, r,temp;
        temp = n;
        while (n > 0) {
            r = n % 10;
            digits = (digits * 10) + r;
            n = n / 10;
        }
        if (temp == digits) {
            System.out.println("it is palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
