import java.util.Scanner;

public class AlternativeSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len = sc.nextInt();
        int[] arr =new int[len];
        int temp ;
        System.out.println("Enter the elements of array");
        for (int i = 0;i<len;i++){

            arr[i] = sc.nextInt();
        }
        int[] brr=new int[len];
        for(int i=0;i<len-1;i++)
        {
            for(int j=1;j<len;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<len-1;i++)
        {
            for(int j=1;j<len;j++)
            {
                if(brr[i]<brr[j])
                {
                    int temp1=brr[i];
                    brr[i]=brr[j];
                    brr[j]=temp1;
                }
            }
        }
        System.out.println("sorted array is " );
        for (int i = 0; i < len; i++) {
           System.out.print(" "+arr[i]);
        }
        /*//descending order
        for (int m = 0; m < len; m--) {
            System.out.println(arr[m]);
        }
        //ascending order
        for (int j = len-1; j < len/2; j++) {
            System.out.println(arr[j]);
        }*/
        //System.out.println("Alternative sorting is " + arr[m]+arr[j]);
        int m=0;
        int l=len/2;
        int[] crr=new int[len];
        for(int i=0;i<len;i++)
        {
            if(i<=l-1)
            {
                crr[m]=arr[i];
            }
            m+=2;
        }
        int length=len-l;
    }
}
