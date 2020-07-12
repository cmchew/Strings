/*

Create a program that will allow users to enter a word, and a character number index.
Your program will print out the size of the word, as well as the substring (starting from 0)
to the index the user specified.
If the user entered index is larger than the size of the word, the program will print
"Index is larger than length".
 */

import java.util.Scanner;
public class UsingStringMethods {

    public static void main(String args[]) {

        //PROMPT user to enter a word
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = scanner.next();

        //Prompt user to enter a number index position
        System.out.println("Please enter a character number index:");
        int index = scanner.nextInt();

        System.out.println("The number of characters in this word is : " + word.length());

        if (index > word.length()){
            System.out.println("Index is larger than length.");
        }
        else {
            System.out.println("This section of word is " + word.substring(0,index));

        }

    }

}


