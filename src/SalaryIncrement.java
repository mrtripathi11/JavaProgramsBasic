import java.util.Scanner;

public class SalaryIncrement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary");
        int salary = sc.nextInt();
        int increment ;
        System.out.println("Enter appraisal");
        float appraisal = sc.nextFloat();
        if(appraisal>=1 && appraisal<=3){
            increment = salary+(int) (salary*0.1);
            System.out.println(increment);
        }
        else if (appraisal>=3.1 && appraisal<=4){
            increment = salary+(int)(salary*0.25);
            System.out.println(increment);
        }
        else if (appraisal>=4.1 && appraisal<=5){
            increment = salary+(int)(salary*0.30);
            System.out.println(increment);
        }
        else
            System.out.println("Not valid");
    }
}
