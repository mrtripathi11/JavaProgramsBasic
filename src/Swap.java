import java.util.Scanner;

public class Swap {
    public static void  swapn(int a,int b){
        b=b+a;
        a=b-a;
        b=b-a;
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        swapn(a,b);
        System.out.printf("%d %d " ,a,b);
    }
}
