package crispane.udemy.java;

// CAUTION: Do note append values to strings like this, it's inefficient and not recommended.
// There is StringBuffer() for that.

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My string is equal to " + myString);
        myString = myString + " \u00A92020";
        System.out.println("My string is equal to " + myString);
        String lastString = "10";
        int myInt = 50;
        System.out.println("Last string is equal to " + lastString + myInt);
    }
}

// Strings in Java are immutable. That means you can't change a String after it's created.
// Instead a new string is created.


