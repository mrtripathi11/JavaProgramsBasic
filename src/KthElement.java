public class KthElement {
    public static boolean findxinkwindowsize(int N,int[] arr,int x,int k){
        int i ;
        boolean b= false;
        for ( i = 0; i < N; i=i+k) {
            for (int j = 0; j < k; j++) {
                if(i+j<N && arr[i+j] == x)
                    break;
                if(j==k)
                    return false;
                if(i+j>=N)
                    return false;
            }
        }
        if( i>=N)
            return true;
        else
            return b;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,3,8,6,3,9};
        int x = 3;
        int k = 3;
        int n = arr.length;
        if(findxinkwindowsize(n,arr,x,k)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
    }
    }
}
