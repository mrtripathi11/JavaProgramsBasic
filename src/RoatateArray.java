public class RoatateArray {
    public static void  leftrotate(int [] arr ,int d,int n){
        for (int i = 0; i < d; i++) {
            leftrotateByOne(arr,n);
        }
    }
    public static void leftrotateByOne(int arr[],int n){
        int i, temp;
        temp = arr[0];
        for (i = 0; i <n-1 ; i++) {
            arr[i] = arr[i+1];
            arr[n-1]  = temp;
        }
    }
    void print(int[] arr ,int n){
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        RoatateArray rotate = new RoatateArray();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate.leftrotate(arr, 2, 7);
        rotate.print(arr, 7);

    }
}
