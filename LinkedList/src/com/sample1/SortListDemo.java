package com.sample1;

public class SortListDemo  // creating a POJO model


{
private String name;        
private int EmployeeId;

SortListDemo(String name, int employeeId) 
{
	super();
	
	this.name = name;
	this.EmployeeId = employeeId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getEmployeeId() {
	return EmployeeId;
}

public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}

@Override
public String toString() {
	return "SortListDemo [name=" + name + ", EmployeeId=" + EmployeeId + ", getName()=" + getName()
			+ ", getEmployeeId()=" + getEmployeeId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}


}
