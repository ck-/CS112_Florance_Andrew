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
public class setVAlue {
 private int m_val;
         
     public  void setValue(int val){
         
           m_val=val;
   
   
}
     public void displayMessage() 
     {
        if(m_val%2==0)
             System.out.println("Even");
        else
             System.out.println("odd");
         
     }
    
    
}
