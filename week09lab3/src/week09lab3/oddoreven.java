/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week09lab3;

/**
 *
 * @author Andrew
 */
public class oddoreven {
     private int m_val;
         
     public   oddoreven(int val){
         
           m_val=val;
   
   
}
     public String oddeven() 
     {
        if(m_val%2==0)
             return "even";
             
        else
             return "odd";
             
        
     }
}
