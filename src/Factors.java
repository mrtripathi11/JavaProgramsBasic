import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its factors");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                System.out.println(i);;
            }
            else {
                n=n*(-1);
                for (int j = 1; j <= n; j++) {
                    if(n%i==0){
                        System.out.println(j);
                    }
                    else{
                        System.out.println("Inavalid number");
                    }
                }
            }
        }
    }
}
