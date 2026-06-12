// javac folder/folderl1/folderl2/problem2.java
package folder.folderl1.folderl2;

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: " + (a + b));
    }
}

class ScCalculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: " + Math.sin(a + b));
    }
}

class HyCalculator {
    public void calculate(int a, int b) {
        System.out.println("Your result is: " + (a + b));
        System.out.println("Your result (sin) is: " + Math.sin(a + b));
    }
}

public class problem3 {
    public static void main(String[] args) {
        System.out.println("I am main method...");
        
        Calculator c = new Calculator();
        c.calculate(5, 10);

        ScCalculator sc = new ScCalculator();
        sc.calculate(5, 10);

        HyCalculator hy = new HyCalculator();
        hy.calculate(5, 10);
    }
}

