import java.util.*;

class Demo {
    public void hello() {
        System.out.println("Hey ! i am Demo...");
    }

}

class Calc1 extends Demo implements Runnable { // this is good for thread used because they are any class extend this
                                               // implements----->
    public void run() {
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

}

class Messaj1 implements Runnable {

    public void run() {
        System.out.println("Display importance massaj task//");
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Focus is importance to master skills");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println("Some problem......");
        }
    }
}

public class create_thread02 {

    public static void main(String[] args) {

        System.out.println("Main thread started..");
        Calc1 c1 = new Calc1();
        Messaj1 m1 = new Messaj1();
        Demo d1 = new Demo();

        // Thread t0 = new Thread(d1);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m1);

        t1.start();
        t2.start();

        // t1.run();
        // t2.run();

    }

}
