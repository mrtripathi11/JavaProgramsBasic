import java.util.Scanner;

public class StringOperator {
    public static int operationsOnBinaryString(String str){
        int res = str.charAt(0)-'0';
        for (int i = 0; i < str.length(); ) {
            char prev = str.charAt(i);
            i++;
            if(prev == 'A')
                res = res & (str.charAt(i)-'0');
            else if (prev == 'B')
                res = res | (str.charAt(i)-'0');
            else
                res = res ^ (str.charAt(i)-'0');
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter string");
        String st = sc.nextLine();
        System.out.println(operationsOnBinaryString(st));
    }
}
