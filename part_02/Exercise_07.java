package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of minutes between  1 and 1,000,000,000: ");
        int userNumber = input.nextInt();

        int numberYears = userNumber/365;

        int numberDays = userNumber%365;

        System.out.println(numberYears+ " years and "+ numberDays+ " days");
    }

}
