/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Andrew
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dice myDice = new dice();
        
        System.out.println(myDice.Throw());
        System.out.println(myDice.value());
}
}