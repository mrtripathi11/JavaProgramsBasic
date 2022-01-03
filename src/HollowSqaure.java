
import java.io.*;
public class HollowSqaure {
    public static void printHollow(int n, int m) {
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=m; j++) {
                if(i==1 || i ==n || j==1|| j ==m){
                    System.out.println("*");
                }
                else{
                    System.out.println(" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        printHollow(a,b);
    }
}
