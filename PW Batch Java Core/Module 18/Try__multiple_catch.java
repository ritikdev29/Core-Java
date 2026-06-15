public class Try__multiple_catch {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        int result = 0;
        int values[] = {4,5,6,7};
        String name = null;

        try{
            result = num1 / name.length();
            System.out.println(values[5]);
        }
        catch(ArithmeticException e){
            System.out.println("cannot diviisible by zero..." + e);

        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limits..");
        }
        catch(Exception e){
            System.out.println("Something went wrong..");
        }
        System.out.println(result);
        System.out.println("Bye");
    }
    
}
