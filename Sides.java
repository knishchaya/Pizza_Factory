package com.pizzafactory.models.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sides {
	public static HashMap<Integer,Integer> sidesMap = new HashMap<>();
	public static HashMap<Integer,String> sidesItemMap = new HashMap<>();
	static {   
	sidesMap.put(1, 55);
	    sidesMap.put(2, 90);
	    sidesItemMap.put(1,"Cold drink");
	    sidesItemMap.put(2,"Mousse cake");
	}
	public int getSides() throws NumberFormatException, IOException{
		int sidesChoice=0;
		int sides=0;
		int sidesPrice =0;
		int ch;
		   
		    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Do you need sides\n1.Yes\n2.No");
		    
			 sidesChoice = Integer.parseInt(reader.readLine());	
			 
			 
			 if(sidesChoice == 1) {
				 do {
					 
			     System.out.println("Select your sides:");
			     for (Map.Entry<Integer,String> entry : sidesItemMap.entrySet()) {
			   		 
			         System.out.println(entry.getKey() +
			                          " : " + entry.getValue());
			         }
			    // if(sc.hasNextInt())
			     sides = Integer.parseInt(reader.readLine());	
			    
			         if(sides > 0)
			         sidesPrice += sidesMap.get(sides);
			         System.out.println("Do you want to add more sides\n1. Yes\n2. No");
    	  	         
	  	             ch = Integer.parseInt(reader.readLine()); 
			     
			 }while(ch==1);
			 }
		 return sidesPrice;

	}
}
