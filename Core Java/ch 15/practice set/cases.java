import java.util.*;

public class cases {

    public static void main(String[] args) {
        System.out.println("Welocome to my swich ...");
        System.out.print("Enter a value :");
        Scanner sc = new Scanner(System.in);
        int hello = sc.nextInt();
        switch (hello) {
            case 1:
                System.out.print("Light is on .");
                break;
            case 2:
            System.out.print("Fan is on .");
            break;
            case 3:
            System.out.print("computer is on >>");
            break;

            default:
            System.out.print("invalid input .....");
                break;
            
        }

    }

}
