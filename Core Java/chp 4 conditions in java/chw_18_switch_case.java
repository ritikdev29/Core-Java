import java.util.Scanner;

public class chw_18_switch_case {
    public static void main(String[] args) {
        System.out.print("Enter your age : ");
        int age;
        Scanner sc = new Scanner(System.in);

        age = sc.nextInt();
        switch (age) {
            case 1:
                System.out.println("Your are going to become an adult");
                break;
            case 23:
                System.out.println("You are going to join a job.");
                break;
            case 60:
                System.out.println("You are going to get retired.");
                break;
            default:
                System.out.println("Enjoy your life..");
                break;
        }

    }
}
