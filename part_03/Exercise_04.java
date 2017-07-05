package part_03;


import java.util.Random;
import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */

public class Exercise_04 {

    public static void main(String[] strings) {

        // generate a random number >= 0 and <= 3
        Random rn = new Random();
        int computerHand = rn.nextInt(3) + 1;
        // use this as the computer's hand


        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
        int playerHand = input.nextInt();

        // call getHand(int hand) to determine the computers hand
        String comphand = getHand(computerHand);
        // call getHand(int hand) to determine the players hand
        String playhand = getHand(playerHand);
        // call determineWinner(int computerHand, int playerHand) to determine who won
        String winner = determineWinner(computerHand, playerHand);
        // print out a message to the console stating which hand the computer had, which hand
        // the play had and who won.
        System.out.println("player had " + playhand + " computer had " + comphand + " " + winner);
    }

    public static String getHand(int hand) {

        // use a switch statement to determine each players hand
        // 0 = scissor, 1 = rock, 2 = paper
        switch (hand) {
            case 0:
                return "sissor";
            case 1:
                return "rock";
            case 2:
                return "paper";
        }
        return "hand";
    }

    public static String determineWinner(int computer, int player) {

        String status = "";

        switch (player) {
            // use conditional ("?") operator
            case 0:
                status = (computer != 1) ? "You won!" : "You lost :(";
                break;
            // implement the two remaining cases
            case 1:
                status = (computer != 2) ? "You won!" : "You lost :(";
                break;
            case 2:
                status = (computer != 0) ? "You won!" : "You lost :(";
                break;
        }

        return status;

    }
}