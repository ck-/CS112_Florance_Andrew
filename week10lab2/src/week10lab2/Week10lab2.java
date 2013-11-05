/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week10lab2;

/**
 *
 * @author Andrew
 */
public class Week10lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         dice myDice = new dice();
        
        System.out.println(myDice.Throw());
        System.out.println(myDice.value());
        System.out.println(myDice.Throw(3));
    }
}
