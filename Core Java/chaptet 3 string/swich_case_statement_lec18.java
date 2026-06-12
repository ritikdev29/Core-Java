import java.util.Scanner;

public class swich_case_statement_lec18 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age>56) {
            System.out.println("you are exprience .");
            
        }
        else if (age>46) {
            System.out.println("You are semi exprience.");

            
        }
        else if (age>36) {
            System.out.println("You are semi semi experience.");

            
        }
        else{
            System.out.println("you are not exprience.");
        }
        
    }
}
