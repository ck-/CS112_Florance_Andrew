/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week06lab6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class Week06lab6 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int play=0;
         int winning= 0;
         int losing= 0;
         int i = 0;
         int done;
           Scanner userInput = new Scanner( System.in );
      System.out.println("how many times do you want to play?");
                play = userInput.nextInt();
                done = (play/2) + 1;
         do
         {
              
         // Randomly Generate a weapon for the computer.    
       
         Random rand = new Random(); 
         rand.nextInt(3); 
         int ranWeapon = rand.nextInt(3) + 1;
    
             
                i++;
               
        //Ask user for a guess.
   System.out.println("Welcome to the rock paper Scissors game! Guess 1 for rock 2 for paper and 3 scissors");
       int weapon = userInput.nextInt();
       
       //If player chooses rock
      
       if (weapon==1){
           if (ranWeapon==3){
               System.out.println("You Win.");
               winning=winning+1;
           }
           else if(ranWeapon==2){
               System.out.println("You Lose");
               losing=losing+1;
           }
           else if (ranWeapon==1)
                   System.out.println("Tied!");
           else
           System.out.println("Invalid input please try again.");
       }
       
       
       //If player chooses paper.
        if (weapon==2){
           if (ranWeapon==1){
               System.out.println("You Win.");
               winning= winning + 1;
           }
           else if(ranWeapon==3){
               System.out.println("You Lose");
               losing=losing+1;
           }
           else if(ranWeapon==2)
                   System.out.println("Tied!");
           else
           System.out.println("Invalid input please try again.");
       }
        
        //If player chooses scissors.
         if (weapon==3){
           if (ranWeapon==2){
               System.out.println("You Win.");
                winning= winning + 1;
           }
           
           else if(ranWeapon==1){
               System.out.println("You Lose");
               losing = losing + 1;
           }
           else if(ranWeapon==3)
                   System.out.println("Tied!");
           else
           System.out.println("Invalid input please try again.");
       }
         
        if (winning>done)
            break;
        if (losing>done)
            break;
         }
       while(play>=i++);
         
  if (winning>losing)
            System.out.printf("You're the winner! You won %d times and the computer won times %d", winning, losing);
        else if (losing>winning)
            System.out.printf("You lost!You won %d times and the computer won times %d", winning, losing);
        else 
            System.out.printf("You tied!You won %d times and the computer won %d times", winning, losing);
    }
}
