import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int leapyr = sc.nextInt();
        if(leapyr%4 == 0|| leapyr%100 ==0 || leapyr%400  == 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Provide valid year input");
        }
    }
}
