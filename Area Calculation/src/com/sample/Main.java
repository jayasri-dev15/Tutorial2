package com.sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	
	{
	    
		Scanner scan=new Scanner(System.in);
		System.out.println("The available choices are listed below"+"\n1.Sphere"+"\n2.Cylinder"+"\n3.Cone"+"\nEnter your Choice from above : ");
		int n=scan.nextInt();
		if(n==1)
		{
			System.out.println("====== Calculating for Sphere ======");
			Sphere s=new Sphere(2,22/7f);
			System.out.println("The area of sphere is "+s.area()+" and the volume of the sphere is "+s.volume());
		}
		else if(n==2)
		{
			System.out.println("====== Calculating for Cylinder ======");
			Cylinder c=new Cylinder(2, 5, 22/7f);
			System.out.println("The area of cylinder is "+c.area()+" and the volume of the cylinder is "+c.volume());
		}
		else if(n==3)
		{
			System.out.println("====== Calculating for Cone ======");
			Cone cone=new Cone(2, 5, 22/7f);
			System.out.println("The area of cone is "+cone.area()+" and the volume of the cone is "+cone.volume());
		}
		else
		{
			System.out.println("Selected Out of the choice");
		}

	}

}
