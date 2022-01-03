import java.util.Scanner;

public class Octal8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = 0;
        int s =0,p,r;
        while(n>0){
            r = n%10;
            p = 8^i;
            s = s+p*r;
            i=i+1;
            n = n/10;
        }
        System.out.println("Octal conversion is =" + s);
    }
}
