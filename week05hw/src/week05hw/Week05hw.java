package week05hw;

/**
 *
 * @author Andrew
 */
 import java.util.Scanner;
import java.util.Random;
public class Week05hw {
   //Welcome to Andrew Florances Rock Paper Scissors game.
 
    public static void main(String[] args) {
        int play;
      
         do
         {
         // Randomly Generate a weapon for the computer.    
         Scanner userInput = new Scanner( System.in );
         Random rand = new Random(); 
         rand.nextInt(3); 
         int ranWeapon = rand.nextInt(3) + 1;
             play=1;
             
             
        //Ask user for a guess.
   System.out.println("Welcome to the rock paper Scissors game! Guess 1 for rock 2 for paper and 3 scissors");
       int weapon = userInput.nextInt();
       
       //If player chooses rock
       if (weapon==1){
           if (ranWeapon==3)
               System.out.println("You Win.");
           else if(ranWeapon==2)
               System.out.println("You Lose");
           else
                   System.out.println("Tied!");
       }
       //If player chooses paper.
        if (weapon==2){
           if (ranWeapon==1)
               System.out.println("You Win.");
           else if(ranWeapon==3)
               System.out.println("You Lose");
           else
                   System.out.println("Tied!");
       }
        //If player chooses scissors.
         if (weapon==3){
           if (ranWeapon==2)
               System.out.println("You Win.");
           else if(ranWeapon==1)
               System.out.println("You Lose");
           else
                   System.out.println("Tied!");
       }
         //Ask if user wants to play again. if not break.
        System.out.println("Do you want to play again? 1 for yes 2 for no.");
        play = userInput.nextInt();
        
        if(play==2)
            break;
         }
       while(play==1);
    }
}
// Good
