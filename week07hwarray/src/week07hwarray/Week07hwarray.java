/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week07hwarray;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Andrew Florance
 */
public class Week07hwarray {

   
    public static void main(String[] args) {
        Scanner userInput = new Scanner( System.in );
          int[] scoreArry=new int[3];
          int[] userGuess=new int[100];
          int[] randomNumber=new int[100];
          int i=1;
         int playAgain = 1;
         boolean correct;
         boolean less;
         boolean play = true;

         do
        {
         Random rand = new Random(); 
         rand.nextInt(10); 
         int ranNumber = rand.nextInt(10) + 1;
            
                 System.out.println("enter a number");
                   int guess = userInput.nextInt();
                   correct = (guess==ranNumber);
                   less = (guess<ranNumber);
                   if(correct){
                       System.out.println("you win");
                       userGuess[i]=guess;
                       randomNumber[i]=ranNumber;
                       scoreArry[0]=scoreArry[0]+1;
                   }
                   else if (less){
                       System.out.println("your guess is less than the number!");
                          userGuess[i]=guess;
                       randomNumber[i]=ranNumber;
                       scoreArry[1]=scoreArry[1]+1;
                   }
                   else{
                       System.out.println("You guess is greater than the number");
                          userGuess[i]=guess;
                       randomNumber[i]=ranNumber;
                       scoreArry[2]=scoreArry[2]+1;
                  
                   }
                    System.out.println("Do you want to play again? 1 for yes 2 for no.");
                     int again = userInput.nextInt();
                    
                     i++;
                     
                     if(again==1)
                         play = true;
                     else 
                         play = false;
        }     
          while (play); 
         System.out.printf("You guessed a number less than the random number %d times,"
                 + "a number greater than the random number %d times and you won %d times."
                 + "For a total of %d times played", scoreArry[1], scoreArry[2], scoreArry[0],scoreArry[0]+scoreArry[1]+scoreArry[2]);
         for(int a=1;a<i;a++){
             if(userGuess[a]==randomNumber[a])
                 System.out.printf("\nGame %d:\nYour Guess: %d\nComputer Guess: %d\nWinner: You!", a, userGuess[a], randomNumber[a]);
             else
                 System.out.printf("\nGame %d:\nYour Guess: %d\nComputer Guess: %d\nWinner: Computer.", a, userGuess[a], randomNumber[a]);
                 
        }
         
    }
         }