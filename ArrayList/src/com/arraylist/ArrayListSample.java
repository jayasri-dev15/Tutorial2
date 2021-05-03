package com.arraylist;  //adding,removing,getting operations done using ARRAYLIST

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample
{
	public static void main(String[]args)
	{
		ArrayList<String> list=new ArrayList<String>();         // Adding "STRING" as a generic type arguments
		
		// Adding the elements to the list 
		
		list.add("Head first JAVA Book");
		list.add("JAVA");
		list.add("Javascript");
		
		// Iterating the elements 
		
		Iterator<String> iter=list.iterator();
		while(iter.hasNext())
		{
			System.out.println("The elements in the list are "+iter.next());
		}
		
		//--------------------- Second list -------------------------------
		
		ArrayList<Integer> Price=new ArrayList<Integer>();     //List 2 adds the price of the previous list of books
		
		Price.add(255);
		Price.add(300);
		Price.add(150);
		
		//System.out.println("The price of the books are "+Price);
	
		
		for(Object Obj:Price)                                 // Iterating the elements using the for loop
		{
			System.out.println("The price of the books are "+Obj);
		}
		
		//------------------- Third list -------------------------------
		
        ArrayList<Integer> year=new ArrayList<Integer>();     //List 3 adds the year of the books
		
		year.add(1955);
		year.add(2000);
		year.add(2005);
		
		for(Object Obj1:year)                                 // Iterating the elements using the for loop
		{
			System.out.println("The year of the books are "+Obj1);
		}
		
		//-----------------Combining first and the second list-----------
		
		year.addAll(Price);                                  // Generic of the same list can be added
		
		System.out.println("The combined list output is "+year);
		System.out.println("The size of the list is "+year.size());    // Getting the size of the list
		
		
		//----------------Removing the element from the list-------------
		
		year.remove(1);
		
		System.out.println("The list after removed the FIRST Index element is "+year);    // After removal check the size
		
		System.out.println("The size of the list after removal is "+year.size());    // Getting the size of the list after removing
		
		
		//---------------Retrieval of the element------------------------
		
		System.out.println("The element in the second index is "+year.get(2));
		
	}
}