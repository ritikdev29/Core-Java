import java.util.Scanner;
public class add_two_sum {

    public static void main(String[] args) {
        System.out.print("Welcom to a calculator.....");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("The sum of two number is : " + sum);
    }
}