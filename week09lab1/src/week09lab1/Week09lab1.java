/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week09lab1;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Andrew
 */
public class Week09lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner userInput = new Scanner( System.in );
         Random rand = new Random(); 
         rand.nextInt(10); 
         int ranNumber = rand.nextInt(10) + 1;
     int oddOrEven=0;
     odd oddPrint=new odd(); 
     even evenPrint=new even();
    
        System.out.printf("Guess a number between one and 10");
        int guess=userInput.nextInt();
        oddOrEven=guess%2;
        if(oddOrEven==0)
           evenPrint.displayMessage();
         
        else
               oddPrint.displayMessage();
         
        
        // TODO code application logic here
    }
}
