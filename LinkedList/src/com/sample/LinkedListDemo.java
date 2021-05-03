package com.sample;    //Linked list operations

import java.util.LinkedList;

public class LinkedListDemo 
{

	public static void main(String[] args)
	{
		//-----------------------List 1---------------------
		
		LinkedList<String> list=new LinkedList<String>();
		
		// adding the elements to the list
		
		list.add("Python");
		list.add("Java");
		list.add("PHP");
		
		for(Object obj:list)
		{
			System.out.println(obj+"\n");
		}
		
		//----------------------List 2----------------------
		
        LinkedList<String> list1=new LinkedList<String>();
		
		// adding the elements to the list
		
		list1.add("NodeJS");
		list1.add("Linux");
		list1.add("C++");
		
		for(Object obj1:list1)
		{
			System.out.println(obj1+"\n");
		}
		
		// removing the elements 
		
		list1.removeFirst();
		list1.removeLast();
		
		System.out.println(list1+"\n");                       // Gives linux alone as output
		
		//retrieving the elements from list 1
		
		System.out.println(list.getFirst()+"\n");             // gives Python and PHP as output
		System.out.println(list.getLast()+"\n");
		
		

	}

}
