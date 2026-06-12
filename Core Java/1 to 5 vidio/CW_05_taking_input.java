import java.util.Scanner;

public class CW_05_taking_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user ");
        Scanner rk = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        // int a = rk.nextInt();
        float a = rk.nextFloat();
        System.out.print("Entera second num :  : ");
        // int b = rk.nextInt();
        float b = rk.nextFloat();

        // int sum = a+b;
        float sum = a+b;
        System.out.print("The total sum is : " );
        System.out.print(sum);

        
        System.out.println("please Enter the valid in: ");
        boolean b1 = rk.hasNextInt();

        System.out.println(b1);

        String str = rk.next();
        // String str2 = rk.nextLine();

        System.out.println(str);

    }
    
}
