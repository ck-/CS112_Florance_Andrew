/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week10lab2;

/**
 *
 * @author Andrew
 */
import java.util.Random;


public class dice {
    private int val;
    public int Throw(){
        Random generator = new Random();
        int num = generator.nextInt(6) + 1;
        val = num;
        return val;
    }
    public int Throw(int bounces){
        int sum=0;
        for (int i =0;i<bounces;i++){
            sum +=Throw();
        }
        return sum;
        
        
    
    }
      public int value(){
                return val;
        }
        
}