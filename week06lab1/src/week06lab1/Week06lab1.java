/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week06lab1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class Week06lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Randomly Generate a weapon for the computer.    
         Scanner userInput = new Scanner( System.in );
         Random rand = new Random(); 
         rand.nextInt(10); 
         int ranNumber = rand.nextInt(10) + 1;
         boolean correct;
         boolean less;
                 System.out.println("enter a number");
                   int guess = userInput.nextInt();
                   correct = (guess==ranNumber);
                   less = (guess<ranNumber);
                   if(correct)
                       System.out.println("you win");
                   else if (less)
                       System.out.println("your guess is less than the number!");
                   else
                       System.out.println("You guess is greater than the number");
                          
         
         
        // TODO code application logic here
    }
}
