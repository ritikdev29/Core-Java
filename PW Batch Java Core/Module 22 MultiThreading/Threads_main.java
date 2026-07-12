import java.util.*;

public class Threads_main {

    public static void main(String[] args) {
        System.out.println("main threads..");

        String name = Thread.currentThread().getName();
        System.out.println("The main thread is : " + name);
        System.out.println("The periority of main thread is : " + Thread.currentThread().getPriority());// this is
                                                                                                        // directly call
                                                                                                        // ..

    }
}