import java.util.Scanner;

public class swich_case_statement2_lec18 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age : ");
        Scanner hello = new Scanner(System.in);
        age = hello.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are going to become adult .");
                break;
            case 23:
                System.out.println("Youare going to join a job .");
                break;
            case 60:
                System.out.println("You are goin to retired.");
                break;
            default:
                System.out.println(" Enjoy your life.🎈gh");
                break;
        }

        String var = "Ritik";
        //or char var = 'r'

        switch (var) {
            case "Ritik"://case 'r':
                System.out.println("You are going to become to adult.");

                break;
            case "pk":
                System.out.println("You are going to job .");
                break;
            case "Hey":
                System.out.println("You are going to get retired.");
                break;
            default:
                System.out.println(" Enjoy hello your life.🎈gh");

        }

    }
}
