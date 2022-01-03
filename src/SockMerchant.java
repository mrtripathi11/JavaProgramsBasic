import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lemngth");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of an array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count =0;
        int pair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i ; j++) {
                if (arr[i] == arr[j]) {
                    count = count + 1;
                }
            }
            pair = pair+(count/2);
        }
        System.out.println(pair);
    }
}
