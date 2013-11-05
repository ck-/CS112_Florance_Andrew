/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


 
 
 
import java.util.Random;
import java.util.Scanner;

public class dice {
    private int val;
    public int Throw(){
        Random generator = new Random();
        int num = generator.nextInt(6) + 1;
        val = num;
        return num;
    }
      public int value(){
                return val;
        }
        
}
