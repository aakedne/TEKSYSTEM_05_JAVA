package com.example;

import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicReference;

public class CartSystem extends TheSystem {
    CartSystem() throws FileNotFoundException {
    }

    @Override
    public void display() {
        System.out.println("Cart");
        System.out.printf("% -10s, %-10s,%-10s, -$10s" ,"Name", "Description", "Price", "Quantity", "Subtotal");
        AtomicReference <Double> subTotal = new AtomicReference<>(0,0);
        getItemCollection().forEach(key, value)->{
        	Double ItemTotal = value.getItemPrice() * value.getQuantity();
        	System.out.format("%-10s %-10s $-10.2f %-10d %-10.2f%n ", value.getItemName(), value.getItemDescrip(), value.getItemPrice(), itemTotal);
        	subTotal.set(subTotal.get()+itemTotal)));
        
        System.out.format("%-10s %-10.f$n", "pretax Total", subTotal.get());
        System.out.format("%-10s %-10.f$n", "Tax", subTotal.get()*0.05);
        System.out.format("%-10s %-10.f$n","Total", subTotal.get()+subTotal.get()*0.05);
        }
    }
    
}
