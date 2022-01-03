import java.util.Arrays;

public class MaxMin {
    public static long getmaxmin(long[] arr,long n){
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args) {
        long A[] = {3, 2, 1, 56, 10000, 167};
        long N =6;
        getmaxmin(A,N);
    }
}
