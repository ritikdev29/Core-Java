
// package PW Batch Java Core.Module 22 MultiThreading;
import java.util.*;

// import java.S
class Calc extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your Calculator Apps");
        System.out.print("Enter First NUmber : ");
        int a = sc.nextInt();
        System.out.print("Enter a Second nmber  : ");
        int b = sc.nextInt();

        int res = a + b;
        System.out.println("Your sum is : " + res);
        System.out.println("Calculator task is end..");

        System.out.println("******************************************************************");

    }
}

class Message extends Thread {
    public void run() {
        System.out.println("Playing importance massaj for Task...");
        for (int i = 0; i < 3; i++) {
            System.out.println("Focus is important to master skills==");
        }
        System.out.println("Dsiplay end massej tasks ended...");

    }
}

public class Multiple_Threads {
    public static void main(String[] args) {
        System.out.println("Main Thread Started...");
        Calc cn = new Calc();
        cn.run();
        // Scanner sc = new Scanner(System.in);

    }

}
