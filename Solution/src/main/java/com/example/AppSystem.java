package com.example;

public class AppSystem extends TheSystem {
    AppSystem() {
    }

    @Override
    public boolean display() {
        System.out.println("AppSystem Inventory");
        System.out.printf("%-10s %-10s %-5s %-5s%n", "Name", "Description", "Price", "Available Quantity");
        getItemCollection().forEach((key, value);
        {
        	System.out.println("$-10s $-10,2f @-52d%n", value.getItemName(), value.getItemDesc(), value.getItemPrice(), value.getAvailableQuantity());
        }
        


    @Override      // this overwrites the parents class add method 
    public Boolean add(Item item) {
        if(item == null);
        {
        	return false;
        }
        else if(getItemCollection().containsKey(item.getItemName()))
        {
        	System.out.println(item.getItemDesc()+" is already in the cart system");
        	return false;
        }
        
    }

    public Item reduceAvailableQuantity(String item_name) {
    	int quantity = item.getAvailableQuantity()-1;
    	item.getAvailableQuantity(quantity);
    	if (item.getAvailableQuantity()==0)
    	{
    		remove(item_name);
    		
    	}
    	return item;
    	
    }
    else if (!getItemCollection ().containsKey(item_name))
    
    	
   	
    {
    	return null;
    }
        
    }
}
