import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        // problem 1
        //int age = 80;
        // int yer_born = 2000 - 80; // logical erronr
        // System.out.println(6 / 0);

        // problem 2
        // try {
        //     int a = 666 / 0;
        // } catch (ArithmeticException e) {
        //     System.out.println("Ha Ha");
        // }
        // problem 3
        boolean flag = true;
        int [] marks = new int [3];
        marks [0] = 7;
        marks [1] =56;
        marks [2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i < 10) {
            try{
            System.out.print("Enter the value of index : ");
            index = sc.nextInt();
            System.out.println("The value of marks [index is ]: " + marks [index]);
            break;
            
        }
        catch (Exception e) {
            System.out.println("Invalid index");
            
            i++;
        }
        if (i>=10) {
            System.out.println("Error");
            
        }
       
    }

    }}
