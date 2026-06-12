public class lecture14_string {
    public static void main(String[] args){
        String name = "Ritik Kumar4677";
        // System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String rString = name.toLowerCase();
        System.out.println(rString);

        String rString2 = name.toUpperCase();
        System.out.println(rString2);


        String nonTrString = "    Ritik Gupta   ";
        System.out.println(nonTrString);

        String tString;
        System.out.println(nonTrString.trim());

        System.out.println(name.substring(2));
        System.out.println(name.substring(0));

        // System.out.println(name.substring(2,6));
        // substring use in program
        System.out.println(name.substring(2,9));

        String hello = "Harry";
        // System.out.println(Hello.replace(oldChar 'r', newChar 'p' ));
        System.out.println(hello.replace('r', 'p'));

        // System.out.println(hello.replace(target:"r" , replacement:"ier"));
        //  System.out.println(hello.replace(target:'r',replacement:'ier'));
        System.out.println(hello.startsWith("par"));
        System.out.println(hello.startsWith("Har"));
        System.out.println(hello.endsWith("Har"));// falsegiven result
        System.out.println(hello.endsWith("rry"));//true
       // char at print or indexing value
        System.out.println(hello.charAt(0));
        System.out.println(hello.charAt(2));
        
        // indexing of value
        String modifiedhello = "Harryrry";  // 0 ,1 2, 3 4 5
        System.out.println(modifiedhello.indexOf("rry"));
        // System.out.println(modifiedhello.indexOf("rry",fromindex:4));

        // System.out.println(modifiedhello.indexOf(str"rry", fromindex:4));

        System.out.println(hello.equals("Harry"));
        System.out.println(hello.equalsIgnoreCase("harRy")); // not upper and lower alphabetsread

        // escape charecter in java

        System.out.println("i am escape sequence \" double charecter");
        System.out.println("i am escape sequence \\ double charecter");


        
    } 
}
