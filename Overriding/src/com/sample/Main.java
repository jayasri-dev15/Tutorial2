package com.sample;

public class Main 
{

	public static void main(String[] args) 
	{
	
		Employee e=new Employee();
		System.out.println("The salary of the employee is "+e.getSalary());
        
		Manager m=new Manager();
		System.out.println("The salary of the manager after adding allowances is "+m.getSalary(2500, 1500));
	}

}
