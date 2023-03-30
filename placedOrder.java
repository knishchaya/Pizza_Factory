package com.pizzafactory.models.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class placedOrder {
	public void getTotal(int pizzaPrice, int toppingPrice, int extraCheesePrice, int sidesPrice) throws NumberFormatException, IOException 
	{
		int totalCost = pizzaPrice + toppingPrice + extraCheesePrice + sidesPrice;
		int placeOrder =0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please verify your order");
			 System.out.println("Pizza:\t\t"+pizzaPrice + "\nTopping:\t"+toppingPrice + "\nExtra Cheese:\t"+extraCheesePrice + "\nSides:\t"+"\t"+sidesPrice +"\n------------------"+"\nTotal:\t\t"+totalCost);
			 System.out.println("\n\nItems once ordered, cannot be cancelled\n1. Place\n2. Cancel");
			// if(sc.hasNextInt())
				 placeOrder= Integer.parseInt(reader.readLine());	
		
			 if(placeOrder ==1){
			     System.out.println("You have successfully placed your order");
			 }else {
			     System.out.println("You missed the delicious pizza");
			 }
		}
	
	}

