import java.util.Arrays;
import java.util.Scanner;

public class AlternativeSort1 {
    static void alternativesort(int[] arr, int n) {
        Arrays.sort(arr);
        int i = 0, j = n - 1;
        while (i < j) {
            System.out.println(arr[j--] + " ");
            System.out.println(arr[i++] + " ");
        }
        if (n % 2 != 0) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,8,10,1,3,9};
        int n = arr.length;
        alternativesort(arr, n);
    }
}