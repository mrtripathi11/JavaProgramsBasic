import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0 || sum>9){
            if(n == 0){
                n = sum;
                sum =0;
            }
            sum = sum + n%10;
            n = n/10;
        }
        System.out.println("Sum of digits is : "+ sum);
    }
}
