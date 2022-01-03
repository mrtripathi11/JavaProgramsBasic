import java.util.Arrays;

public class CircularRotate {
    static int[] arr = new int[]{1,2,3,4,5};
    static void rotate(){
        int i=0,j = arr.length-1 ;
        while (i != j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Normal Array");
        System.out.println(Arrays.toString(arr));
        rotate();
        System.out.println("R0tated Array");
        System.out.println(Arrays.toString(arr));
    }
}
