/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class Midterm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int oddOrEven=0;
        int play;
        int winner=0;
        int loser=0;
        int gameWinner=0;
        int i=1;
        String[] userGuess= new String[100];
        int[] computer= new int[100];
         Scanner userInput = new Scanner( System.in );
        do 
        {
         Random rand = new Random(); 
         rand.nextInt(10); 
         int ranNumber = rand.nextInt(10) + 1;
         
         // Ask if number is odd or even.
         
         System.out.println("Guess If the number is odd or even, enter now.1 for odd 2 for even.");
           int guess = userInput.nextInt();
            oddOrEven=ranNumber%2;
            if(guess==2&&oddOrEven==0){
                System.out.printf("You win");
                //keep track of user and computer guesses and winner.
                userGuess[i]="Even";
                computer[i]=ranNumber;
                winner=winner+1;
            }
            else if(guess==1&&oddOrEven==1){
                 System.out.printf("You win");
                   //keep track of user and computer guesses and winner.
                  winner=winner+1;
                    userGuess[i]="Odd";
                computer[i]=ranNumber;
}
            else {
                   if (guess==1&&oddOrEven==0){
                 System.out.printf("You lose");
                   //keep track of user and computer guesses and loser.
                     userGuess[i]="Odd";
                    computer[i]=ranNumber;
                    loser=loser+1;
                   
                  } 
                   else if (guess==2&&oddOrEven==1) {
                         //keep track of user and computer guesses and loser.
                       System.out.printf("You lose\n");
                     userGuess[i]="Even";
                    computer[i]=ranNumber;
                    loser=loser+1;  
                   }
            
                   }
                  //I is used to store inputs into arrays.
             i++;
             
             //ask user if  he wants to play. if not break.
            System.out.println("Do you want to play again? 1 for yes 2 for no.\n");
            play = userInput.nextInt();
            if(play==2)
                break;
        }
       while(play==1); 
        
        
        //Figures out who won and display Who won more games.
        if(loser>winner)
             System.out.printf("You Lost! You won %d times and lost %d times"
                     + " and a total number of %d games where played Below are game results", winner, loser, i-1);
        
        else if(winner>loser)
             System.out.printf("You Won! You won %d times and lost %d times and a total number of %d games where played Below are game results ", i);
        else
             System.out.printf("You Tied! you won %d times and lost %d "
                     + "times  and a total number of %d games where played Below are game results ",  winner, loser, i-1);
        
        
        // Display more details on each game.
        for(int a=1;a<i;a++){
            
          if (userGuess[a]=="Even"&&computer[a]%2==0)
              
            System.out.printf("\nGame %d, You Guess %s and the number was %d\nWinner:You!\n", a, userGuess[a], computer[a]);
          
          else if (userGuess[a]=="Odd"&&computer[a]%2==1)
              
             System.out.printf("\nGame %d, You Guess %s and the number was %d\nWinner:You!\n", a, userGuess[a], computer[a]);
          
          else
               System.out.printf("\nGame %d, You Guess %s and the number was %d\nWinner:Computer!\n", a, userGuess[a], computer[a]);
                  
                       
                }
            
        
      
            
            
    }

}
