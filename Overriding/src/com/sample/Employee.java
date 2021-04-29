package com.sample;         //without using constructor

public class Employee 

{
int getSalary()
{
	return 55000;
	
}
}

class Manager extends Employee
{
	int hra;
	int ta;
	int getSalary(int hra,int ta)
	{
		return 95000+hra+ta;
		
	}	
	
}