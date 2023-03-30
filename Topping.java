package com.pizzafactory.models.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class Topping {
	   public static  HashMap<Integer,Integer> toppingsRateMap = new HashMap<>();
	   public static  HashMap<Integer,Integer> toppingsNonVegRateMap = new HashMap<>();
	   public static  HashMap<Integer,String> toppingsNonVegMap = new HashMap<>();
	    public static final HashMap<Integer,String> toppingsMap = new HashMap<>();
	    static {
	    toppingsRateMap.put(1, 20);
	    toppingsRateMap.put(2, 25);
	    toppingsRateMap.put(3, 35);
	    toppingsRateMap.put(4, 30);
	    toppingsRateMap.put(5, 10);
	    toppingsMap.put(1, "Black olive");
	    toppingsMap.put(2, "Capsicum");
	    toppingsMap.put(3, "Paneer");
	    toppingsMap.put(4, "Mushroom");
	    toppingsMap.put(5, "Fresh tomato");
	    toppingsNonVegMap.put(1, "Chicken tikka");
	    toppingsNonVegMap.put(2, "Barbeque chicken ");
	    toppingsNonVegMap.put(3, "Grilled chicken");
	    toppingsNonVegRateMap.put(1, 35);
	    toppingsNonVegRateMap.put(2, 45);
	    toppingsNonVegRateMap.put(3, 40);
	    }
	public int getToppingPrice(int pizzaSize, int pizzaType) throws NumberFormatException, IOException{
    int topping;
    int toppingPrice=0;
    int choice;
    int countTopping =0;
 
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do {
		    System.out.println("Select your topping");
		    if(pizzaSize!=3) {
		        if (pizzaType == 1) {
		            System.out.println("Available toppings are:");
		            for (Map.Entry<Integer,String> entry : toppingsMap.entrySet()) {
		            	int rate = entry.getKey();
		                System.out.println(entry.getKey() +
		                                 " : " + entry.getValue()+" Rate:"+toppingsRateMap.get(rate));
		                }
		            topping = Integer.parseInt(reader.readLine());
		            toppingPrice += toppingsRateMap.get(topping);
		            }
		    else if (pizzaType == 2) {
		        	 System.out.println("Available toppings are:");
		             for (Map.Entry<Integer,String> entry : toppingsNonVegMap.entrySet()) {
		            	 int rate = entry.getKey();
		        		 
		                 System.out.println(entry.getKey() +
		                                  " : " + entry.getValue()+" Rate"+toppingsNonVegRateMap.get(rate));
		                 }
		            topping = Integer.parseInt(reader.readLine());
		            toppingPrice += toppingsNonVegRateMap.get(topping);
		        }
		    }
		    else {
		        if(countTopping<2){
		        	if (pizzaType == 1) 
		        	{
		        	 System.out.println("Available toppings are:");
		             for (Map.Entry<Integer,String> entry : toppingsMap.entrySet()) {
		            	 int rate = entry.getKey();
		                 System.out.println(entry.getKey() +
		                                  " : " + entry.getValue()+" Rate:"+toppingsRateMap.get(rate));
		                 }
		            topping = Integer.parseInt(reader.readLine());
		            toppingPrice=0;
		        	}
		        	else
		        	{
		        		 System.out.println("Available toppings are:");
			             for (Map.Entry<Integer,String> entry : toppingsNonVegMap.entrySet()) {
			            	 int rate = entry.getKey();
			                 System.out.println(entry.getKey() +
			                                  " : " + entry.getValue()+" Rate:"+toppingsNonVegRateMap.get(rate));
			                 }
			            topping = Integer.parseInt(reader.readLine());
			            toppingPrice=0;
		        	}
		        }else {
		            if (pizzaType == 1) {
		            	 System.out.println("Available toppings are:");
		                 for (Map.Entry<Integer,String> entry : toppingsMap.entrySet()) {
		                	 int rate = entry.getKey();
		            		 
		                     System.out.println(entry.getKey() +
		                                      " : " + entry.getValue()+" Rate:"+toppingsRateMap.get(rate));
		                     }
		                topping =Integer.parseInt(reader.readLine());
		                toppingPrice += toppingsRateMap.get(topping);

		            } else if (pizzaType == 2) {
		            	 System.out.println("Available toppings are:");
		                 for (Map.Entry<Integer,String> entry : toppingsNonVegMap.entrySet()) {
		                	 int rate = entry.getKey();
		                     System.out.println(entry.getKey() +
		                                      " : " + entry.getValue()+" Rate:"+toppingsNonVegRateMap.get(rate));
		                     }
		                topping = Integer.parseInt(reader.readLine());
		                toppingPrice += toppingsNonVegRateMap.get(topping);
		            }
		        }
		    }
		    System.out.println("Do you want to add more topping\n1. Yes\n2. No");
		    choice =Integer.parseInt(reader.readLine());
		    if(choice == 1){
		        countTopping++;
		    }
		    
		}while(choice==1);
	
    return toppingPrice;
	

}
}
