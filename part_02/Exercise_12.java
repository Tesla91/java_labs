package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of miles you will be driving: ");
        int miles = input.nextInt();

        System.out.print("Enter the MPG of your car: ");
        double mpg = input.nextDouble();

        System.out.print("Enter the price per gallon of gas: ");
        int price = input.nextInt();

        double cost = miles / mpg * price;
        double roundCost = Math.round(cost * 100.0) / 100.0;
        System.out.println("The cost of your journey will be $"+ roundCost);
    }
}