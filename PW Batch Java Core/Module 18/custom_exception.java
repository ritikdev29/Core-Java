import java.util.Scanner;

class SalaryException extends Exception {

    SalaryException(String message) {
        super(message);
    }
}

class Company {

    public void checkSalary(int salary) throws SalaryException {

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