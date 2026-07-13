import java.util.*;

class MyThread extends Thread {
    public void run() {
        System.out.println("Child thread..");
    }
}

public class Create_thread {
    public static void main(String[] args) {
        System.out.println("Main thread");
        MyThread m1 = new MyThread();
        m1.start();

    }

}
