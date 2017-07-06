package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int number = input.nextInt();

        if (number == 1)System.out.println("ONE");
        else{
            if (number == 2)System.out.println("TWO");
                else{
                if (number == 3)System.out.println("THREE");
                        else{
                    if (number == 4)System.out.println("FOUR");
                                else{
                        if (number == 5)System.out.println("FIVE");
                                        else{
                            if (number == 6)System.out.println("SIX");
                                                else{
                                if (number == 7)System.out.println("SEVEN");
                                                        else{
                                    if (number == 8)System.out.println("EIGHT");
                                                                else{
                                        if (number == 9)System.out.println("NINE");
                                                                        else{
                                            if (number < 2 | number > 9)System.out.println("OTHER");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
