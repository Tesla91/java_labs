package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        int investAmount = input.nextInt();

        System.out.print("Enter annual interest rate in percentage: ");
        double intRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double investValue = investAmount;
        for (int i =1; i <= years; i++) {
            investValue =investValue + investValue*intRate/100;
        }

        System.out.println(investValue);
    }
}

