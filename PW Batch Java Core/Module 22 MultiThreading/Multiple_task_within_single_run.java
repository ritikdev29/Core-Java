
import java.util.*;

//Multiple task within single run()
class MyThread1 extends Thread {
    public void run() {

        String tName = Thread.currentThread().getName();
        if (tName.equals("Calc")) {
            calc();

        } else {
            importanceMesg();
        }

    }

    public void calc() {
        System.out.println("Calculation Task Started...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter a second Number : ");
        int c = sc.nextInt();

        int res = a + c;
        System.out.println("Your sum is : " + res);
        System.out.println("Calculator task end.");
        System.out.println("*********************************");

    }

    public void importanceMesg() {
        System.out.println("Display importance massaj task//");
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Focus is importance to master skills");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println("Some problem......");
        }
        System.out.println("Display Importance Massej task ended.. ");
    }

}

public class Multiple_task_within_single_run {
    public static void main(String[] args) {

        System.out.println("Main thread is started");

        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();

        thread1.setName("Calc");
        thread2.setName("Importance Massej. OR print");

        thread1.start();
        thread2.start();

    }

}
