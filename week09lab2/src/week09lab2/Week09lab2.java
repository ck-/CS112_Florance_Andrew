/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week09lab2;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class Week09lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         setVAlue mySetValue=new setVAlue();
                 
                 Scanner userInput = new Scanner( System.in );
                 System.out.println("Give me a number");
                 int val=userInput.nextInt();
                
                 mySetValue.displayMessage();

     
        // TODO code application logic here
    }
}
