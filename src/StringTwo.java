
/*
String assignment
Write a Java program that assigns your name to a variable and prints the variable to the console.

Then, enhance your program by asking user's name and print out personalized prompt.
 */

import java.util.Scanner;

public class StringTwo {

    public static void main(String args[]) {


        //Initialize known variables
        //ASSIGN name to a variable
        String name = "cassie";
        String userName;

        Scanner scanner = new Scanner(System.in);
        //PRINT name
        //System.out.println("My name is " + name  + ". It's nice to meet you.");
        //name = scanner.next();

        //PROMPT user for name
        System.out.println("Please enter your name:");
        userName = scanner.next();

        System.out.println("Greetings " + userName + "! It's nice to meet you.");


        //PRINT personalized greeting










    }
}
