package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
   

    private Object getItemCollection;
	private HashMap<String, Item> itemCollection;

	TheSystem() throws FileNotFoundException{
        HashMap<String, item> itemCollection = new HashMap <String, item>();
       if(getClass().getSimpleName().equals("AppSystem"))
       {
    	   Scanner scan = new Scanner(new FileReader("sample.txt"));
    	   while(scan.hasNext())
    	   {
    		   String line = scan.nextLine();
    		   String []temInfo = line,split("\\s");
    		   Item item = new Item(itemInfo[0], itemInfo[1]), Double.parseDouble(itemInfo[2], Integer.parseInt(itemInfo[3])));
    		   itemCollection.put(item.getItemName(),item);
    	   }
    	   }
    }
    public void setItemCollection(HashMap<String, Item> itemCollection) {
    	this.itemCollection = itemCollection;
    }
    
    public HashMap<String, Item> getItemCollection(){
        return this.getItemCollection();
    }
    
    public Boolean checkAvailability(Item item) {
        if(item.getQuantity() >= item.getAvailableQuantity()) 
    }
     System.out.println("The system can't add " + item.getItemName() + "to the card. System only has " +item.getAvailableQuantity() + "" +item.getItemName()+"s");
     	return false;
    }else {
    	return true;
    }
   
    
    public Boolean add(Item item) {
        if(item==null)
        {
        	return false;
        }
        else if(this.getItemCollection.containsKey(item.getItemName()))
        {
        	int quantity = item.getQuantity()+1;
        	item.setQuantity(quantity);
        	this.getItemCollection.put(item.getItemName(),item);
        	return true;
        }
        else if(!((Object) this.getItemCollection).containKey(item.getItemName()))
        {
        	item.setQuantity(1);
        	this.getItemCollection.put(item.getItemName(), item);
        	return true;
        }
        return false;
    }
    

    public Item remove(String itemName) {
       if(this.getItemCollection().containsKey(itemName))
       {
    	   return this.getItemCollection().remove(itemName);
       }
       return null;
    }

    public abstract void display();
    }
