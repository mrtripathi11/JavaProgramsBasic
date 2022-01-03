import java.util.*;
public class GreatestSecondElement {
    public static int getSecondElement(int arr[],int total){
        Arrays.sort(arr);
        return arr[total-2];
    }
    /*static int getSSSS(int arr[] ,int total){
        int temp;
        for (int i = 0; i < total; i++) {
            if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr[total-2];
    }*/
    public static void main(String[] args) {
        int arr[] = {1,4,10,5,6};
        System.out.println(getSecondElement(arr,5));
        //System.out.println(getSSSS(arr,6));
    }
}
