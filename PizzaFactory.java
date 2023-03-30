package com.pizzafactory.models.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PizzaFactory {
    public static void main(String[] args) throws NumberFormatException, IOException{
        int pizzaType;
        int pizzaSize = 0;
        int pizza;
        int pizzaPrice=0;
        int toppingPrice=0;
        int extraCheesePrice=0;
        int sidesPrice=0;
        int choice =0;
        int vendorChoice =0;
        int ch8;
        
        HashMap<Integer, String> vegPizza = new HashMap<>();
        HashMap<Integer, String> crustMap = new HashMap<>();
        HashMap<Integer, String> nonVegPizza = new HashMap<>();
        HashMap<Integer, Integer> vegRegularPizza = new HashMap<>();
        HashMap<Integer, Integer> vegMediumPizza = new HashMap<>();
        HashMap<Integer, Integer> vegLargePizza = new HashMap<>();
        HashMap<Integer, Integer> nonVegRegularPizza = new HashMap<>();
        HashMap<Integer, Integer> nonVegMediumPizza = new HashMap<>();
        HashMap<Integer, Integer> nonVegLargePizza = new HashMap<>();
        vegRegularPizza.put(1, 150);
        vegRegularPizza.put(2, 175);
        vegRegularPizza.put(3, 160);
        vegMediumPizza.put(1, 200);
        vegMediumPizza.put(2, 375);
        vegMediumPizza.put(3, 290);
        vegLargePizza.put(1,325);
        vegLargePizza.put(2,475);
        vegLargePizza.put(3,340);
        nonVegRegularPizza.put(1, 190);
        nonVegRegularPizza.put(2, 210);
        nonVegRegularPizza.put(3, 220);
        nonVegMediumPizza.put(1, 325);
        nonVegMediumPizza.put(2, 370);
        nonVegMediumPizza.put(3, 380);
        nonVegLargePizza.put(1,425);
        nonVegLargePizza.put(2,500);
        nonVegLargePizza.put(3,525);
        vegPizza.put(1, "Deluxe Veggie");
        vegPizza.put(2, "Cheese and Corn ");
        vegPizza.put(3, "Paneer Tikka");
        nonVegPizza.put(1, "Non-Veg Supreme ");
        nonVegPizza.put(2, "Chicken Tikka ");
        nonVegPizza.put(3, "Pepper Barbecue Chicken");
        crustMap.put(1,"New Hand Tossed");
        crustMap.put(2,"Wheat Thin Crust");
        crustMap.put(3, "Cheese Burst");
        crustMap.put(4,"Fresh Pan Pizza");
        
        
        
        Topping t = new Topping();
        Cheese c = new Cheese();
        Sides s = new Sides();
        placedOrder po = new placedOrder();
        
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
        System.out.println("Welcome to our Pizza Factory");
      //  System.out.println("Please place your order from below menu");
        System.out.println("1. Are you a Buyer?\n2. Are you a Vendor?");
        int options = Integer.parseInt(reader.readLine());
        if(options ==1) {
        

        do {
	        System.out.println("1. Vegetarian\n2. Non-Vegetarian");
	        pizzaType = Integer.parseInt(reader.readLine());
	            switch (pizzaType) {
	                case 1 -> {
	                    System.out.println("Select size of pizza\n1. Regular\n2. Medium\n3. Large");
	                    pizzaSize = Integer.parseInt(reader.readLine());
	                    if (pizzaSize == 1) {
	                    	System.out.println("Choose your Pizza");
	                    	 for (Map.Entry<Integer,String> entry : vegPizza.entrySet()) {
	                    		 int rate = entry.getKey();
	                             System.out.println(entry.getKey() +
	                                              " : " + entry.getValue()+" Rate:"+vegRegularPizza.get(rate));
	                             }
	                        pizza = Integer.parseInt(reader.readLine());
	                       
	                            pizzaPrice += vegRegularPizza.get(pizza);
	                       
	                    } else if (pizzaSize == 2) {
	                    	System.out.println("Choose your Pizza");
	                    	 for (Map.Entry<Integer,String> entry : vegPizza.entrySet()) {
	                    		 int rate = entry.getKey();
	                             System.out.println(entry.getKey() +
	                                              " : " + entry.getValue()+" Rate:"+vegMediumPizza.get(rate));
	                             }
	                        pizza = Integer.parseInt(reader.readLine());
	                        pizzaPrice += vegMediumPizza.get(pizza);
	                    } else {
	                    	System.out.println("Choose your Pizza");
	                    	 for (Map.Entry<Integer,String> entry : vegPizza.entrySet()) {
	                    		 int rate = entry.getKey();
	                             System.out.println(entry.getKey() +
	                                              " : " + entry.getValue()+" Rate:"+vegLargePizza.get(rate));
	                             }
	                        pizza = Integer.parseInt(reader.readLine());
	                        pizzaPrice += vegLargePizza.get(pizza);
	                    }
	                }
	                case 2 -> {
	                    System.out.println("Select size of pizza\n 1. Regular \n 2. Medium \n 3. Large");
	                    pizzaSize = Integer.parseInt(reader.readLine());
	                    if (pizzaSize == 1) {
	                    	System.out.println("Choose your Pizza");
	                    	 for (Map.Entry<Integer,String> entry : nonVegPizza.entrySet()) {
	                    		 int rate = entry.getKey();
	                             System.out.println(entry.getKey() +
	                                              " : " + entry.getValue()+" Rate:"+nonVegRegularPizza.get(rate));
	                             }
	                        pizza = Integer.parseInt(reader.readLine());
	                        pizzaPrice += nonVegRegularPizza.get(pizza);
	                    } else if (pizzaSize == 2) {
	                    	System.out.println("Choose your Pizza");
	                    	 for (Map.Entry<Integer,String> entry : nonVegPizza.entrySet()) {
	                    		 int rate = entry.getKey();
	                             System.out.println(entry.getKey() +
	                                              " : " + entry.getValue()+" Rate: "+nonVegMediumPizza.get(rate));
	                             }
	                        pizza = Integer.parseInt(reader.readLine());
	                        pizzaPrice += nonVegMediumPizza.get(pizza);
	                    } else {
	                    	System.out.println("Choose your Pizza");
	                    	 for (Map.Entry<Integer,String> entry : nonVegPizza.entrySet()) {
	                    		 int rate = entry.getKey();
	                             System.out.println(entry.getKey() +
	                                              " : " + entry.getValue()+" Rate:"+nonVegLargePizza.get(rate));
	                             }
	                        pizza = Integer.parseInt(reader.readLine());
	                        pizzaPrice += nonVegLargePizza.get(pizza);
	                    }
	                }
	                	
	                }
	            
	            
	            System.out.println("Please select crust"); 
	            for (Map.Entry<Integer,String> entry : crustMap.entrySet()) {
           		 
                    System.out.println(entry.getKey() +
                                     " : " + entry.getValue());
                    }
	            int crust = Integer.parseInt(reader.readLine());
	            
	            toppingPrice += t.getToppingPrice(pizzaSize, pizzaType);
	              extraCheesePrice += c.getCheeseprice();
	               sidesPrice += s.getSides(); 
	                
	            System.out.println("Do you want to order more pizza\n1. Yes\n2. No");
	         
	            choice = Integer.parseInt(reader.readLine());
	           
        }while(choice==1);
        
        po.getTotal(pizzaPrice,toppingPrice,extraCheesePrice,sidesPrice);
        }
        if(options==2){
    	System.out.println("Do you want to add new pizza or update pizza rate \n1. Add\n2. Update");
       vendorChoice = Integer.parseInt(reader.readLine());
       switch(vendorChoice) {
       case 1 ->{
    	   System.out.println("1. Add new Veg-Pizza\n2. Add new Non-Veg Pizza\n3. Add Toppings\n4. Add Sides");
    	   int store = Integer.parseInt(reader.readLine());
    	   switch(store) {
    	   case 1 ->{
    		   int ch;
    		   do {
        	   System.out.println("Veg Pizza Name");
        	   String Pizzaname = reader.readLine();
        	   System.out.println("Please add the price of Regular,Medium,Large");
        	   int reg = Integer.parseInt(reader.readLine());;
        	   int med = Integer.parseInt(reader.readLine());;
        	   int lar = Integer.parseInt(reader.readLine());;
        	   int veg = vegPizza.size()+1;
        	   vegPizza.put(veg,Pizzaname);
        	   vegRegularPizza.put(veg, reg);
        	   vegMediumPizza.put(veg, med);
        	   vegLargePizza.put(veg, lar);
        	   System.out.println("Successfully Added");
        	   System.out.println("Do you want add more Veg Pizza\n1. Yes\n2. No");
  	         
	             ch = Integer.parseInt(reader.readLine());
    		   }while(ch==1);

    	   }
    	   case 2->{
    		   int ch1;
    		   do {
        	   System.out.println("Non-Veg Pizza Name");
        	   String Pizzaname = reader.readLine();
        	   System.out.println("Please put the price of Regular,Medium,Large");
        	   int reg = Integer.parseInt(reader.readLine());;
        	   int med = Integer.parseInt(reader.readLine());;
        	   int lar = Integer.parseInt(reader.readLine());;
        	   int nonveg = nonVegPizza.size()+1;
        	   nonVegPizza.put(nonveg,Pizzaname);
        	   nonVegRegularPizza.put(nonveg, reg);
        	   nonVegMediumPizza.put(nonveg, med);
        	   nonVegLargePizza.put(nonveg, lar);
        	   System.out.println("Successfully Added");
        	   System.out.println("Do you want to add more Non-Veg Pizza\n1. Yes\n2. No");
    	       ch1 = Integer.parseInt(reader.readLine());
    		   }while(ch1==1);

    	   }
    	   case 3 ->{
    		   int ch2;
    		   do {
    		   System.out.println("Add new toppings and rate");
    		   String top = reader.readLine();
    		   int rate = Integer.parseInt(reader.readLine());
    		  int size= t.toppingsRateMap.size()+1;
    		  t.toppingsRateMap.put(size,rate);
    		  t.toppingsMap.put(size,top);
    		  System.out.println("Successfully Added");
    		  System.out.println("Do you want to add more toppings\n1. Yes\n2. No");
   	         
	             ch2 = Integer.parseInt(reader.readLine());
    		   }while(ch2==1);
    		   
    	  }
    	   case 4->{
    		   int ch3;
    		   do {
    		   System.out.println("Add new sides and rate");
    		   String side = reader.readLine();
    		   int rate = Integer.parseInt(reader.readLine());
    		   int size = s.sidesItemMap.size()+1;
    		   s.sidesItemMap.put(size,side);
    		   s.sidesMap.put(size,rate);
    		   System.out.println("Successfully Added");
    		   System.out.println("Do you want to add more sides\n1. Yes\n2. No");
    	         
	             ch3 = Integer.parseInt(reader.readLine());
    		   }while(ch3==1);
    		   
    	   }
    	   }
       }
    	   case 2->{
    		   System.out.println("Do you want to update \n1.Veg Pizza\n2.Non-Veg Pizza\n3.Toppings\n4.Sides");
    		   int updateChoice = Integer.parseInt(reader.readLine());
    		   switch(updateChoice) {
    		   case 1->{
    			   int ch4;
    		   
    			   do {
    			   System.out.println("Select your pizza");
    			   for (Map.Entry<Integer,String> entry : vegPizza.entrySet()) {
              		 
                       System.out.println(entry.getKey() +
                                        " : " + entry.getValue());
                       }
                  int pizzaChoice = Integer.parseInt(reader.readLine());
                  System.out.println("Select Type\n1.Regular\n2.Medium\n3.Large");
                  int type =  Integer.parseInt(reader.readLine());
                  System.out.println("Please enter rate");
                  int rate =  Integer.parseInt(reader.readLine());
                  if(type == 1) {
                  	vegRegularPizza.put(pizzaChoice,rate);
                  }
                  else if(type==2) {
                  	vegMediumPizza.put(pizzaChoice,rate);
                  }
                else {
                  	vegLargePizza.put(pizzaChoice,rate);
                  }  
                System.out.println("Successfully Updated");
                System.out.println("Do you want to update more Veg Pizza\n1. Yes\n2. No");
     	         
	             ch4 = Integer.parseInt(reader.readLine());
    		   }while(ch4==1);
    		   }
    		   case 2->{
    			   int ch5;
    			   do {
    			   System.out.println("Select Your Pizza");
    			   for (Map.Entry<Integer,String> entry : nonVegPizza.entrySet()) {
              		 
                       System.out.println(entry.getKey() +
                                        " : " + entry.getValue());
                       }
                  int pizzaChoice = Integer.parseInt(reader.readLine());
                  System.out.println("Select Type\n1.Regular\n2.Medium\n3.Large");
                  int type =  Integer.parseInt(reader.readLine());
                  System.out.println("Please enter rate");
                  int rate =  Integer.parseInt(reader.readLine());
                  if(type == 1) {
                  	nonVegRegularPizza.put(pizzaChoice,rate);
                  }
                  else if(type==2) {
                  	nonVegMediumPizza.put(pizzaChoice,rate);
                  }
                else {
                  	nonVegLargePizza.put(pizzaChoice,rate);
                  }
                System.out.println("Successfully Updated");
                System.out.println("Do you want to update more Non-Veg Pizza\n1. Yes\n2. No");
     	         
	             ch5 = Integer.parseInt(reader.readLine());
    			   }while(ch5==1);
    		   }
    		   case 3->{
    			   int ch6;
    			   do {
    			   System.out.println("Select toppings id and add new topping:");
    		   
    			   for (Map.Entry<Integer,String> entry : t.toppingsMap.entrySet()) {
  		       		 
		                System.out.println(entry.getKey() +
		                                 " : " + entry.getValue());
		                }
    			   int id = Integer.parseInt(reader.readLine());
		            String topping = reader.readLine();
		         t.toppingsMap.put(id,topping);
		      System.out.println("Successfully Updated");
		      System.out.println("Do you want to add More topping\n1. Yes\n2. No");
	  	         
	             ch6 = Integer.parseInt(reader.readLine());
    			   }while(ch6==1);   
    		   }
    		   case 4->{
    			   int ch7;
    			   do {
    			   System.out.println("Select your sides id and add new sides name:");
  			     for (Map.Entry<Integer,String> entry : s.sidesItemMap.entrySet()) {
  			   		 
  			         System.out.println(entry.getKey() +
  			                          " : " + entry.getValue());
  			         }
  			  
    			   int id = Integer.parseInt(reader.readLine());
    			   String sides = reader.readLine();	
    			   s.sidesItemMap.put(id, sides);
    			   System.out.println("Successfully Updated");
    			   System.out.println("Do you want to update more sides\n1. Yes\n2. No");
    	  	         
  	             ch7 = Integer.parseInt(reader.readLine());
    		   }while(ch7==1);
    		   }
    		   }
    	   }
    	   
       }
       }
        System.out.println("Return to Home Page?\n1. Yes\n2. No");
	         
          ch8 = Integer.parseInt(reader.readLine());
        }while(ch8==1);
        }
}
