import java.util.Scanner;
public class multiple_catch_block {
    public static void main(String[] args) {
        
        int num =0;
        Scanner sc =new Scanner(System.in);

        try {
            num = sc.nextInt();
            // System.out.println("Enter a number : ");
            // sc.close(); this are multiple so use finally block used
        } catch (Exception e) {
            System.out.println("Enter a number : ");
            
            // sc.close(); this are multiple so use finally block used

            
        }
        finally
        {
            sc.close();
        }
        System.out.println(num);   // this output 0
        
    }
    
}
