import java.util.Scanner;

public class tempCodeRunnerFile {
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

        String var = "Ritik ";

        switch (var) {
            case "Ritik":
                System.out.println("You are going to become to adult.");

                break;
            case "Riti":
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
    