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
        {                    // finally block always execute
            sc.close();     // resource close always
        }
        System.out.println(num);   // this output 0
        
    }
    
}

/*
Try with resourse  
 try(Scanner sc= new Scanner (System.in))
 {
 num = sc.nextInt();
 }
 */
