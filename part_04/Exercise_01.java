package part_04;

import java.util.Scanner;

/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */

class Exercise_01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 integers: ");

        int output[] = new int[10];
        output [0] = input.nextInt();
        output [1] = input.nextInt();
        output [2] = input.nextInt();
        output [3] = input.nextInt();
        output [4] = input.nextInt();
        output [5] = input.nextInt();
        output [6] = input.nextInt();
        output [7] = input.nextInt();
        output [8] = input.nextInt();
        output [9] = input.nextInt();

        System.out.println(output[1] + " " + output[3] + " " +  output[5] + " " +  output[7] + " " +  output[9]
                + " " +  output[8] + " " +  output[6] + " " +  output[4] + " " +  output[2] + " " +  output[0]);

    }
}
