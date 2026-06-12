import java.util.Scanner;

public class lec_19_practice_set {
    public static void main(String[] args) {
        // problem no 1
        /*
         * int a = 10;
         * if (a=11)
         * 
         * System.out.println("i am 11");
         * else
         * System.out.println("i am not.");
         */
        // question no 2
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics: ");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in chemistry: ");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in maths : ");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("You overall percantage is : " + avg);
        if (avg >= 40 && m1 >= 33 && m2 >= 33) {
            System.out.println("Congrutulation yoou have prometed.");

        } else {
            System.out.println("Sorry , YOU have not been promoted please try again.!");
        }

        // question no 3
        float tax = 0;
        float income = sc.nextFloat();
        if (income < 2.5) {
            tax = tax + 0;
        } else if (income > 2.5f && income < 5f) {
            tax = tax + 0.05f * (5.0f - 2.5f);

        } else if (income > 5f && income < 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);

        } else if (income > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);

        }
        System.out.println("The total tax paid by the employee is : " + tax);

        // question np 4
        Scanner rk = new Scanner(System.in);
        System.out.println("Enter the switch 1 to 7 : ");
        int day = rk.nextInt();

        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("thuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("Sunday....");
            default -> System.out.println("Enter the valid opration...");

        }
        //  question no 5
        // write a java program to find wheather a year entered by the user is a leap year or not;





        // ques no 6
        //  write a progaram to find out the type of website grom the url
        // .com = commercial website , .org = organigation website, .in = indian website
        Scanner ak = new Scanner(System.in);
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
    }

}
