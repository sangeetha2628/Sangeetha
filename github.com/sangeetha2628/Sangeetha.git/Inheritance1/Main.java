package com.Inherit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		String email;
		String mob;
		String dept;
		int age;
		int roll;
		Scanner s=new Scanner(System.in);
		name=s.next();
		email=s.next();
		mob=s.next();
		dept=s.next();
		age=s.nextInt();
		roll=s.nextInt();
		Student stu=new Student(name,email,mob,dept,age,roll);
		stu.display();
		
		
	}

}
