/*
String completion assignment
The following code is supposed to ask the user their pet's name and age.
Add the three lines necessary to make this work.

 */


import java.util.Scanner;

public class StringOne {
    public static void main(String args[]){

        String name;
        String breed;
        int age;

        Scanner scanner = new Scanner(System.in);

        //PROMPT user for pet name
        System.out.println("Greetings. What is your pet's name?");
        name = scanner.next();

        //PROMPT user for pet type
        System.out.println("What kind of animal is " + name + "?");
        breed = scanner.next();

        //PROMPT user for pet age
        System.out.println("How old is " + name + "?");
        age = scanner.nextInt();

        //PRINT name name breed and age

        System.out.println( name + " is your " + breed +  " and it is " + age + " years old." );

    }
}
