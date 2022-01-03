import java.util.Scanner;

public class RatAndHouse {
    public static int solution(int r,int unit,int[] arr,int n){
        if(arr == null){
            return -1;
        }
        int res  = r*unit;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+arr[i];
            count++;
            if (sum >= res)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt ();
        int unit = sc.nextInt ();
        int n = sc.nextInt ();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();
        System.out.println (solution (r, unit, arr, n));
    }
}

