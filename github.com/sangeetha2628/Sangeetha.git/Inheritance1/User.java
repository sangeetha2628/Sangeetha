package com.Inherit;

public class User {
	private String name;
	private String email;
	private String mob;
	private int age;
	
	public User(String name, String email, String mob, String dept, int roll) {
		this.name=name;
		this.email=email;
		this.mob=mob;
		this.age=age;
		
		
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.email);
		System.out.println(this.mob);
		System.out.println(this.age);
		
	}
	

}
