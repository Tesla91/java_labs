package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */
public class Exercise_04 {

    public static void main(String[] args)
       throws java.io.IOException {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number in pounds: ");
            double pounds = input.nextDouble();

            System.out.println("Your pounds in kilos is: " + pounds * 0.454);

    }
}
