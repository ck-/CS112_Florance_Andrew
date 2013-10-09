/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week7lab2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class Week7lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int play;
        int i = 1;
        int done;
        int winning;
        int losing;
        int[] myarry = new int[2];
        int[] userMoveNo = new int[100];
        int[] computerMoveNo = new int[100];
        String userMoves[] = new String[100];
        String computerMoves[] = new String[100];



        Scanner userInput = new Scanner(System.in);
        System.out.println("how many times do you want to play?");
        play = userInput.nextInt();
        done = (play / 2) + 1;
        do {

            // Randomly Generate a weapon for the computer.    

            Random rand = new Random();
            rand.nextInt(3);
            int ranWeapon = rand.nextInt(3) + 1;


           

            //Ask user for a guess.
            System.out.println("Welcome to the rock paper Scissors game! Guess 1 for rock 2 for paper and 3 scissors");
            int weapon = userInput.nextInt();

            //If player chooses rock

            if (weapon == 1) {
                if (ranWeapon == 3) {
                    System.out.println("You Win.");
                    myarry[0] = myarry[0] + 1;
                    userMoves[i] = "Rock";
                    computerMoves[i] = "Scissors";
                } else if (ranWeapon == 2) {
                    System.out.println("You Lose");
                    myarry[1] = myarry[1] + 1;
                    userMoves[i] = "Rock";
                    computerMoves[i] = "Paper";

                } else if (ranWeapon == 1) {
                    System.out.println("Tied!");
                    userMoves[i] = "Rock";
                    userMoves[i] = "Rock";
                } else {
                    System.out.println("Invalid input please try again.");
                }
            }


            //If player chooses paper.
            if (weapon == 2) {
                if (ranWeapon == 1) {
                    System.out.println("You Win.");
                    myarry[0] = myarry[0] + 1;
                    userMoves[i] = "Paper";
                    computerMoves[i] = "Rock";
                } else if (ranWeapon == 3) {
                    System.out.println("You Lose");
                    myarry[1] = myarry[0] + 1;
                    userMoves[i] = "Paper";
                    computerMoves[i] = "Scissors";

                } else if (ranWeapon == 2) {
                    System.out.println("Tied!");
                    userMoves[i] = "Paper";
                    computerMoves[i] = "Paper";
                } else {
                    System.out.println("Invalid input please try again.");
                }
            }

            //If player chooses scissors.
            if (weapon == 3) {
                if (ranWeapon == 2) {
                    System.out.println("You Win.");
                    myarry[0] = myarry[0] + 1;
                    userMoves[i] = "Scissors";
                    computerMoves[i] = "Paper";
                } else if (ranWeapon == 1) {
                    System.out.println("You Lose");
                    myarry[1] = myarry[1] + 1;
                    userMoves[i] = "Scissors";
                    computerMoves[i] = "Rock";
                } else if (ranWeapon == 3) {
                    System.out.println("Tied!");
                    userMoves[i] = "scissors";
                    computerMoves[i] = "Scissors";
                } else {
                    System.out.println("Invalid input please try again.");
                }
            }
            
                i = i + 1;
            if (myarry[0] > done) {
                break;
            }
            if (myarry[1] > done) {
                break;
            }
        } while (play >= i);

        if (myarry[0] > myarry[1]) {
            System.out.printf("You're the winner!\n You won %d and the computer won %d%n", myarry[0], myarry[1]);


        } else if (myarry[1] > myarry[0]) {
            System.out.printf("You lost!\nYou won %d times and the computer won times %d%n", myarry[0], myarry[1]);

        } else {
            System.out.printf("You tied!\nYou won %d times and the computer won %d times %d%n", myarry[0], myarry[1]);
        }


        for (int xxu = 1; xxu < i; xxu++) {
            System.out.printf("Game %d:", xxu);
            System.out.printf(" User played %s, Computer played %s\n ", userMoves[xxu], computerMoves[xxu]);

        }
        // TODO code application logic here
    }
}
