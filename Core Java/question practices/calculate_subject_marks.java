import java.util.Scanner;


// package question practices;

public class calculate_subject_marks {
    public static void main(String[] args) {
        System.out.println("Taking input from the user of five subject🧨🎇🎆");
        Scanner rk = new Scanner(System.in);
        System.out.print("Enter a first sub marks : ");
        float a = rk.nextInt();
        //
        System.out.print("Enter a second sub marks : ");
        float b = rk.nextInt();
        //
        System.out.print("Enter a third sub marks : ");
        float c = rk.nextInt();
        //
        System.out.print("Enter a fourth sub marks : ");
        float d= rk.nextInt();
        //
        System.out.print("Enter a five sub marks : ");
        float e = rk.nextInt();

        float percantage = (a+b+c+d+e)/5;
        System.out.print("The total subject number is  : " );
        System.out.print(percantage);

        float hello = percantage /5;
        System.out.println(hello);
        System.out.println("By Rk tech");

        
    }
    
}
