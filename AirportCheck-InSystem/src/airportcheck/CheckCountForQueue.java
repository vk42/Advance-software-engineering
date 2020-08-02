/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airportcheck;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mohd Samir
 */
public class CheckCountForQueue {
  
 public static int x;
    public  int checkCount(){
        x=0;
       // BufferedReader br=null;
       // System.out.println("....check data....");
        try {
            String csvFile="C:\\Users\\Mohd Samir\\Documents\\NetBeansProjects\\AirportCheck-InSystem\\src\\airportcheck\\BookingDetails.csv";
            String line2= "";
            
      
           BufferedReader br3 = new BufferedReader(new FileReader(csvFile));
           
            while ((line2 = br3.readLine()) != null  ) {
                
                // use comma as separator
                String[] cols = line2.split(",");
                if(line2.contains("FALSE")){
                    x++;
               //     System.out.println("count...num");
                }
            }
       
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CheckCountForQueue.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) { 
         Logger.getLogger(CheckCountForQueue.class.getName()).log(Level.SEVERE, null, ex);
     } 
        return x;
    }
    

}    

