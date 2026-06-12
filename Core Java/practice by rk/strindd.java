public class strindd{
    public static void main(String[] args) {
        // System.out.println("he;l");
        String name = "Ritik Kumar Gupta";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.startsWith("Rit"));
        System.out.println(name.trim());
        System.out.println(name.replace("Kumar", "Roshan"));
        System.out.println(name.substring(3,5));
        System.out.println(name.replaceAll("um", "hi"));
    }
}