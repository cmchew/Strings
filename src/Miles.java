/*


Miles per Gallon is considered to be the average mileage of a motor
vehicle which uses Petrol or Diesel as fuel. Miles represents the
distance the vehicle traveled in the units of Miles. Write a program
to compute a mileage where mileage = miles/gallons.

Output should look something like this:

 */

import java.util.Scanner;

public class Miles {
    public static void main(String args[]) {

        //Initialize known values
        //mileage = miles/gallons

        Scanner scanner = new Scanner (System.in);

        //PROMPT user for number of miles
        System.out.println("Please enter the number of miles traveled:");
        double miles = scanner.nextInt();

        //PROMPT user to enter the number of gallons used
        System.out.println("Please enter the number of gallons used:");
        double gallons = scanner.nextInt();

        double mileage = miles/gallons;

        //PRINT mileage
        System.out.println("The mileage for this vehicle is " + mileage + ".");













    }




}
