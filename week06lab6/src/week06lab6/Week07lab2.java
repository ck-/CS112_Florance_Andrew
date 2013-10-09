/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week07lab2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class Week07lab2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int play=0;
         int winning= 0;
         int losing= 0;
         int i = 1;
         int done;
         int [] myarry= new int[2];
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
               myarry[0]=myarry[0]+1;
           }
           else if(ranWeapon==2){
               System.out.println("You Lose");
               myarry[1]=myarry[1]+1;
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
                myarry[0]= myarry[0] + 1;
           }
           else if(ranWeapon==3){
               System.out.println("You Lose");
                myarry[1]=myarry[0]+1;
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
                 myarry[0]= myarry[0] + 1;
           }
           
           else if(ranWeapon==1){
               System.out.println("You Lose");
                 myarry[1]= myarry[1] + 1;
           }
           else if(ranWeapon==3)
                   System.out.println("Tied!");
           else
           System.out.println("Invalid input please try again.");
       }
         
        if (myarry[0]>done)
            break;
        if (myarry[1]>done)
            break;
         }
       while(play>=i++);
         
  if (myarry[0]>myarry[1]){
            System.out.printf("You're the winner! You won %d and the computer won %d", myarry[0], myarry[1]);
            
                    }
        else if (myarry[0]>myarry[1])
            System.out.printf("You lost!You won %d times and the computer won times %d", myarry[0], myarry[1]);
        else
            System.out.printf("You tied!You won %d times and the computer won %d times", myarry[0], myarry[1]);
    }
}
