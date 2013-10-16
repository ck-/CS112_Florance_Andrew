/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermb2;

import java.util.Scanner;

/**
 *
 * @author Andrew
 */
public class Midtermb2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m=1;
        int f=1;
                
          Scanner userInput = new Scanner( System.in );
          
          
        System.out.printf("Hello enter an integer.");
          int n = userInput.nextInt();
          do
          {
              f=f*m;
              if(m!=n){
                  m=m+1;
              }
          }
          while(m!=n);
       System.out.printf("M==%d n==%d, f==%d", m, n, f);
        
    }
}
