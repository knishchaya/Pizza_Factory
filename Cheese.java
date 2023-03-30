package com.pizzafactory.models.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.HashMap;
import java.util.*;
//import java.util.Scanner;
public class Cheese {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   static HashMap<Integer,Integer> extraCheeseMap = new HashMap<>();
  static {
	  extraCheeseMap.put(1, 35);
  }
	public int getCheeseprice() throws NumberFormatException, IOException{
	
    int extraCheesePrice=0;
    int extraCheese=0;
    
    for (Map.Entry<Integer,Integer> entry : extraCheeseMap.entrySet()) {
		 
        System.out.println("Extra Cheese Price" +
                         " : " + entry.getValue());
        }
 		System.out.println("Do you need extra cheese \n1. Yes \n2. No");
 		
		 extraCheese = Integer.parseInt(reader.readLine());	
 	
		 if(extraCheese==1)
		extraCheesePrice += extraCheeseMap.get(1);
     return extraCheesePrice;
    }
}
     

