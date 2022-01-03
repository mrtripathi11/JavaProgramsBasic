import java.util.List;
import java.util.Scanner;

public class OddNumbersCheck {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while (n>0){
            if(n%2==0){
                System.out.println("Even Number");
                break;
            }
            else
                System.out.println("Odd Number");
                break;
        }
    }
}
