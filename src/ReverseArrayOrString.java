public class ReverseArrayOrString {
    public static void arrayreverse(int[] arr, int start, int end){
        //start = 0;
        //end = n-1;
        int temp;
        while(start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start+=1;
            end-=1;
        }
    }
    static void print(int arr[] ,int n){
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+ " ");
            //System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {371,7673,262,100};
        //int n = arr.length;
        arrayreverse(arr,0,3);
        print(arr,4);
    }
}
