import java.util.Scanner;
public class welcom {
    public static void main(String[] args) {
        //  i create e name 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name  = sc.nextLine();
        System.out.println("Welcome " + name + " to Rk Coding.....");

        System.out.print("Enter your age : ");

        int hello = sc.nextInt();
        System.out.print( " Hello " + name  + " Your age is : " + hello );



    }
    
}
