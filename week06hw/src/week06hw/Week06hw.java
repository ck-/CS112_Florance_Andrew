/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week06hw;

/**
 *
 * @author Andrew
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class Week06hw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int done;
        int winning=0;
        int losing=0;
        int i=0;
        //Ask the user how many times do they want to play in a gui box.
        String play =
        JOptionPane.showInputDialog(null,"How many times do you want to play?");
        int y = Integer.parseInt(play);
        done = (y/2)+1;
         do
         {
              
         // Randomly Generate a weapon for the computer.    
       
         Random rand = new Random(); 
         rand.nextInt(3); 
         int ranWeapon = rand.nextInt(3) + 1;
    
             
                i++;
               
        //Ask user for a guess.
                String weapons =
   JOptionPane.showInputDialog(null,"Welcome to the rock paper Scissors game! Guess 1 for rock 2 for paper and 3 scissors");
       int weapon = Integer.parseInt(weapons);
       
       //If player chooses rock
      
       if (weapon==1){
           if (ranWeapon==3){
               JOptionPane.showMessageDialog(null, "You Win.");
               winning=winning+1;
           }
           else if(ranWeapon==2){
               JOptionPane.showMessageDialog(null,"You Lose");
               losing=losing+1;
           }
           else if (ranWeapon==1)
                   JOptionPane.showMessageDialog(null,"Tied!");
           else
           JOptionPane.showMessageDialog(null,"Invalid input please try again.");
       }
       
       
       //If player chooses paper.
        if (weapon==2){
           if (ranWeapon==1){
               JOptionPane.showMessageDialog(null,"You Win.");
               winning= winning + 1;
           }
           else if(ranWeapon==3){
               JOptionPane.showMessageDialog(null,"You Lose");
               losing=losing+1;
           }
           else if(ranWeapon==2)
                   JOptionPane.showMessageDialog(null,"Tied!");
           else
           JOptionPane.showMessageDialog(null,"Invalid input please try again.");
       }
        
        //If player chooses scissors.
         if (weapon==3){
           if (ranWeapon==2){
               JOptionPane.showMessageDialog(null,"You Win.");
                winning= winning + 1;
           }
           
           else if(ranWeapon==1){
               JOptionPane.showMessageDialog(null,"You Lose");
               losing = losing + 1;
           }
           else if(ranWeapon==3)
                   JOptionPane.showMessageDialog(null,"Tied!");
           else
           JOptionPane.showMessageDialog(null,"Invalid input please try again.");
       }
         
        if (winning>done)
            break;
        if (losing>done)
            break;
         }
       while(y>=i++);
         
  if (winning>losing)
            JOptionPane.showMessageDialog(null,"You're the winner!");
        else if (losing>winning)
            JOptionPane.showMessageDialog(null,"You lost!");
        else 
            JOptionPane.showMessageDialog(null,"You tied!");
        
     
    }
}
