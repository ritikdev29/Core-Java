import java.util.Scanner;

public class chw18_elseif {
    public static void main(String[] args) {
        System.out.print("Enter Your Age : ");
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age > 56) {
            System.out.println("You are exprience .");
            
        } else if (age > 46) {
            System.out.println("You are semi exprience.");

        } else if (age > 36) {
            System.out.println("You are semi -semi exprience.");

        } else {
            System.out.println("You are not exprience.");
        }
        if (age<=3) {
            System.out.println("You are baby/");
            
        }

    }
}
