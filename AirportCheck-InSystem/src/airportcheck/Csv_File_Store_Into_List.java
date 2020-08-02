/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airportcheck;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mohd Samir
 */
public class Csv_File_Store_Into_List {
//     public static void main(String args[]){
//     //  String string = "src\\readcsvfile\\flightDetails.csv";
//       Csv_File_Store_Into_List c = new Csv_File_Store_Into_List();
//       c.datastructre();
////       datastructre(string);
//   }
   // String string = "src\\readcsvfile\\flightDetails.csv";
   public  void datastructre (){
        	String COMMA_DELIMITER=",";
		List<List<String>> records = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("src\\readcsvfile\\flightDetails.csv"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(COMMA_DELIMITER);
		        records.add(Arrays.asList(values));
		    }
		    System.out.println(records);
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
    }

  
}