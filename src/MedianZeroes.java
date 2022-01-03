public class MedianZeroes {
    static void medianzeroes(int [] arr,int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

            if (sum >= n) {
                System.out.println(sum - n);
            }
            else {
                System.out.println(1);
            }
        }
    }

    public static void main(String[] args) {
        int n =4 ;
        int[] arr = {8, 4, 6, 2};
        medianzeroes(arr,n);
    }
}
