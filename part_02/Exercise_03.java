package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args)
        throws java.io.IOException {


            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number in feet: ");
            double feet = input.nextDouble();

            System.out.println("Your feet in meters is: " + feet * 0.305);
        }
    }
