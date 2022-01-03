import java.util.Scanner;

public class Difference {
    static int diffrencenum(int[] arr, int length,int num,int dif){
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (Math.abs(num - arr[i]) <= dif) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int dif = sc.nextInt();
        System.out.println(diffrencenum(arr,n,num,dif));
    }
}
