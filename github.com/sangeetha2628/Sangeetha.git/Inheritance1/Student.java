package com.Inherit;

public class Student extends User{
	private String name;
	private int roll;
	private String dept;
	public Student(String name, String email, String mob, String dept, int age, int roll) {
		super(name,email,mob,dept,roll);
	this.roll=roll;
	this.name=name;
	this.dept=dept;
	
	}
	public void display()
	{
		super.display();
		System.out.println(this.roll);
		System.out.println(this.name);
		System.out.println(this.dept);
		
	}
	
	

}
