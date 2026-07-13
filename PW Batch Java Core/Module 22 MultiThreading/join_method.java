import java.util.*;

class printing implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Focus is importance...");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Some problem....");
        }
    }
}

public class join_method {

    public static void main(String[] args) throws Exception {
        System.out.println("Main thread startes...");

        printing p = new printing();

        Thread t1 = new Thread(p);
        System.out.println(t1.isAlive());// false
        t1.start();
        System.out.println(t1.isAlive()); // true

        t1.join();

        System.out.println("Main Thread Finishing the work..");

    }

}
