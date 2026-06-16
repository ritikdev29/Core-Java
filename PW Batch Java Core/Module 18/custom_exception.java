import java.util.Scanner;
// Custom Exception Class

class SalaryException extends Exception {
    // Constructor jo custom message receive karega
    SalaryException(String message) {
        super(message);   // Parent Exception class ko message pass kar raha hai
    }
}
// Company class
class Company {
   // throws => Exception ki responsibility caller ko de raha hai

    public void checkSalary(int salary) throws SalaryException {
     // Business Rule: Salary 20000 se kam nahi honi chahiye
        if (salary < 20000) {
            throw new SalaryException("Salary cannot be less than 20000");
        }

        System.out.println("Valid Salary");
    }
}

public class custom_exception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Company obj = new Company();

        while (true) {

            System.out.print("Enter Salary: ");
            int salary = sc.nextInt();

            try {
                obj.checkSalary(salary);

                // Valid salary mil gayi to loop band
                break;
            }
            catch (SalaryException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        System.out.println("Program Ended");
        
    }
}