// package com.company;

public class cwh_15_ps3 {
    public static void main(String[] args) {
        // Problem 1
        String name = "Ritik kUmar";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String text = "To My     Friend";
        text = text.replace(" ", "_"); // string is a inmutable so not chance but yaha par total string k chage kar diya gya hai 
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Sachin");
        System.out.println(letter);

        // Problem 4
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);

    }
}
