import java.util.*;
public class MinimumElementInArray {
    public static int minimumelement(int[] arr){
        Arrays.sort(arr);
        return arr[5];
    }

    public static void main(String[] args) {
        //int n = 5;
        int[] arr = {376,726,326,10,368};
        System.out.println("Minimum element is " + minimumelement(arr));
    }
}
