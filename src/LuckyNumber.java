import java.util.Scanner;
public class LuckyNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int lucky = sc.nextInt();
        int luckysum = 0;
        if(lucky<1000 || lucky>9999){
            System.out.println("Inavalid number");
        }
        else{
            while (lucky!=0){
                int r = lucky%10;
                luckysum=luckysum+r;
                lucky=lucky/10;
            }
            if(luckysum%3==0 || luckysum%5==0 || luckysum%7 ==0){
                System.out.println("Luckysumber");
            }
            else{
                System.out.println("Invalid number");
            }
        }
    }
}
