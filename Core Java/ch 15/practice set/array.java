// import java.util.*;
// public class array {
//     public static void main(String[] args) {
//         int [] marks = new int [50];
//         marks [0] = 20;
//         marks [1] = 30;
//         marks [2] = 40;
//         System.out.println("YOu output is : " + marks.length);
//         System.out.println(marks[0]);
//         for(int i = 0; i<marks.length;i++)
//         System.out.println("You lenth is array sizde :" +marks[i]);
//     }
    
// }
// Class to handle array operations
class ArrayHandler {
    int[] marks; // Instance variable

    // Constructor to initialize array
    ArrayHandler(int size) {
        marks = new int[size];
    }

    // Method to set values in array
    void setMarks() {
        marks[0] = 20;
        marks[1] = 30;
        marks[2] = 40;
    }

    // Method to display array size
    void displaySize() {
        System.out.println("Array ka size hai : " + marks.length);
    }

    // Method to display array elements
    void displayMarks() {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Index " + i + " ka value: " + marks[i]);
        }
    }
}

// Main class
public class array {
    public static void main(String[] args) {
        ArrayHandler arr = new ArrayHandler(50); // object creation
        arr.setMarks();      // values set karna
        arr.displaySize();   // array ka size print karna
        arr.displayMarks();  // array ke values print karna
    }
}

