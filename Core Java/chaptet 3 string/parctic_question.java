import java.util.Scanner;

public class parctic_question {
    public static void main(String[] args) {
               // ques no 6
        //  write a progaram to find out the type of website grom the url
        // .com = commercial website , .org = organigation website, .in = indian website
        Scanner ak = new Scanner(System.in);
        System.out.println("Please Enter Your Website name : ");
        String website = ak.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an organigational website...");
            
        }
        else if (website.endsWith(".com")) {
            System.out.println("this is a commercial website....");
            
        }
        else if (website.endsWith(".in")) {
            System.out.println("this is a indian website....");
        
            
        }
        else {
            System.out.println("enter a valid string.");
    }
    
}
}
