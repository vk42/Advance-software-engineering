/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airportcheck;

import javax.swing.JOptionPane;

/**
 *
 * @author Mohd Samir
 */
class InvalidBaggage extends Exception {

    public InvalidBaggage(String message) {
        super(message);
    }
    
}
public class Create_Own_Exception {
     static int validateBag(int bag) throws InvalidBaggage{
         if(bag<=1){
             throw new InvalidBaggage("## Only one bag is allowed per person ##");    
         }else{
             
             JOptionPane.showMessageDialog(null, "## If bag will access then pay ##");
         }
         return bag;
     }
    public static void main(String args[])
    {
           try{  
      validateBag(13);  
      }catch(Exception m){System.out.println("Exception occured: "+m);} 
    }
}
