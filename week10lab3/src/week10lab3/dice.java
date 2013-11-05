/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week10lab3;

import java.util.Random;


public class dice {
    private int val;
    private int m_bounces;
    public dice(int bounces){
        m_bounces=bounces;
    }
    public dice(){
        m_bounces=1;
    }
    
    
    public int Throw(){
         Random generator = new Random();
        int sum=0;
        for (int i =0;i<m_bounces;i++){
            sum += generator.nextInt(6) + 1;
            val=sum/m_bounces;
        }
        return val;
    }
      public int value(){
                return val;
        }
        
}