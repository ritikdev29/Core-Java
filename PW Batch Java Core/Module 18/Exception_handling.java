public class Exception_handling {
    public static void main(String[] args) {
        int num = 6;
        int num2 = 0;
        int result = 0;

        try{
            result = num / num2;
            System.out.println("in try catch block..");
        }
        catch(Exception e){
            System.out.println("Some thing went wrong .." + e);

        }
        System.out.println(result);
        System.out.println("Bay..");
    }
    
}
