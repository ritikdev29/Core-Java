import javax.print.DocFlavor.STRING;

public class practiceset_15 {
    public static void main(String[] args) {
        // quess 1 a string to lower case

        String name = "hELLO I am GOOD bOY? ";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        //or

        name = name.toLowerCase();
        System.out.println(name);

        // problem 2
        String text = "To Lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        // pproblem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Ritik");
        System.out.println(letter);

        // problem 4
        //String myString = "This string contains    double and triple spaces";
        String myString = "This string contains double and  triple spaces";
        
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));// triple space nhi hai isliye ye -1 show kar rha hai nh 


        // prblem no 5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);


    }
    
}
