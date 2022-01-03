public class Reaarrange {
    static void reaarrange(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=arr[i-1] || arr[i]<=arr[i-1]){
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {56,15,64,87,50,47};
        //System.out.println(reaarrange(arr));
        reaarrange(arr);
    }
}
