package part_03;


import java.util.Scanner;

/**
 *
 */
public class Exercise_05 {

    public static void main(String[] strings) {

        // read an integer from the user >=1 and <= 999,999,999
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 1 - 999,999,999 ");
        int num = input.nextInt();

        // use the && operator to see if the user's number is divisible by both 4 and 7
        if ((num % 4 == 0) && (num % 7 == 0)) {
            System.out.println(num + " is divisible by both 4 and 7.");


            // use the || operator to see if the user's number is divisible by 4 or 7
        } else if ((num % 4 == 0) || (num % 7 == 0)) {
            System.out.println(num + " is divisible by 4 or 7.");

            // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        } else if ((num % 4 == 0) ^ (num % 7 == 0)) {
            System.out.println(num + " is divisible by 4 or 7 exclusively.");
        } else System.out.println("The number is not divisible by 4 or 7."); {

        }

        // print out the results
    }
}
