import java.util.*;

public class Threads_main {

    public static void main(String[] args) {
        System.out.println("main threads..");

        String name = Thread.currentThread().getName();
        System.out.println("The main thread is : " + name);
        System.out.println("The periority of main thread is : " + Thread.currentThread().getPriority());// this is
                                                                                                        // directly call
                                                                                                        // --->

        System.out.println("After changing...");
        Thread t = Thread.currentThread();
        t.setName("Rk");
        t.setPriority(1);

        String name1 = Thread.currentThread().getName();
        System.out.println("The main thread is : " + name1);

        System.out.println("The periority of main thread is : " + Thread.currentThread().getPriority());// this is
                                                                                                        // directly call
                                                                                                        // --->

    }
}