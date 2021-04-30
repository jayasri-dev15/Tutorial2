package com.sample;

public abstract class Shapes 

{
abstract float area();                             // common method for all shapes
abstract float volume();

float radius,height,pi=22/7f;

Shapes(float radius, float height, float pi)      // In general calculating the area, volume (Radius, height and Pi values are common)

{
	super();
	this.radius = radius;
	this.height = height;
	this.pi = pi;
}


}

//--------------------------------- SPHERE ----------------------------------

class Sphere extends Shapes
{

	Sphere(float radius,float pi)                // For sphere height is not needed
	{
		super(radius,0, pi);                     // Set height=0 here
	}

	@Override
	float area() 
	{
		float areaOfSphere=4*pi*radius*radius;   // area of sphere = 4πr2
		
		return areaOfSphere;
	}

	@Override
	float volume()
	{
		float VolumeOfSphere=(4*pi*radius*radius*radius)/3;    //volume of sphere = 4/3πr3
		
		return VolumeOfSphere;
	}
	
}

//--------------------------------- CYLINDER --------------------------------

class Cylinder extends Shapes
{

	Cylinder(float radius, float height, float pi) 
	{
		super(radius, height, pi);
	}

	@Override
	float area() 
	{
		float areaOfCylinder=2*pi*radius*height + 2*pi*radius*radius;   //area of cylinder = 2πrh+2πr2
		
		return areaOfCylinder;
	}

	@Override
	float volume() 
	{
		float VolumeOfCylinder=pi*radius*radius*height;                //volume of cylinder = πr2h
		
		return VolumeOfCylinder;
	}
	
}

//---------------------------------- CONE ------------------------------------

class Cone extends Shapes
{

	Cone(float radius, float height, float pi)
	{
		super(radius, height, pi);
	}

	@Override
	float area()                                                      //area of cone = πr(r+sqrt(h2+r2))
	{
		float areaOfCone=(float) ((float)pi*radius*(radius+((double)Math.sqrt(height*height)+(radius*radius))));
		
		return areaOfCone;
	}

	@Override
	float volume()                                                   //volume of cone = πr2h/3

	{
		float VolumeOfCone=(pi*radius*radius*height)/3;
		return VolumeOfCone;
	}
	
}