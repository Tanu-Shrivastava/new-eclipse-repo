package com.lti.casestudy.day1;

import java.util.Scanner;

public class App {

		//////////////////////Scenario 1//////////////////
		void scenario(){
		System.out.println("This is Sceanrio 1");
		Student s1 =new Student(101, "Priya", "10-05-2001");
		Student s2 =new Student(102, "lina", "02-11-1998");
		Student s3 =new Student(103, "Riya", "27-02-2000");
		
		Info in=new Info();
		in.display(s1);
		in.display(s2);
		in.display(s3);
		System.out.println("\n");
		}
		/////////////////////Scenario 2////////////////////
		void scenario2(){
		System.out.println("This is Sceanrio 2");
		Student obj[] = new Student[5];
		obj[0]= new Student(104, "Amit", "09-01-2001");
		obj[1]= new Student(105, "Anuj", "29-09-2000");
		obj[2]= new Student(106, "Akshat", "21-04-1999");
		obj[3]= new Student(107, "Rakesh", "03-11-2006");
		Info in=new Info();
		for(int i=0;i<4;i++)
		{
			in.display(obj[i]);
		}
		System.out.println("\n");
		}
		///////////////////Scenario 3//////////////////////
		
		
		void scenario3(){
		System.out.println("This is Sceanrio 3");
		Scanner kb =new Scanner(System.in);
		Info in=new Info();
		
		System.out.println("Enter the inputs you want to enter :");
		int n =kb.nextInt();
		Student obj[] = new Student[n];
		for (int i=0;i<n; i++){
			System.out.println("Enter id");
			int id=kb.nextInt();
			kb.nextLine();
			System.out.println("Enter name");
			String name=kb.next();
			
			System.out.println("Enter dob");
			String dob=kb.next();
			
			obj[i] = new Student();
			obj[i].setId(id);
			obj[i].setName(name);
			obj[i].setDob(dob);
		}
		for(int i=0;i<n;i++)
		{
			in.display(obj[i]);
		}
		System.out.println("\n");
		}
		
		void coursedisplay(){
			System.out.println("Courses");
			Course c1 =new Course(1, "Science", 3, 100);
			Course c2 =new Course(2, "Sst", 6, 300);
			Course c3 =new Course(3, "maths", 4, 500);
			
			Info in=new Info();
			in.display1(c1);
			in.display1(c2);
			in.display1(c3);
			System.out.println("\n");
			}
		public static void main(String[] args) {
		
			App a =new App();
			a.scenario();
			a.scenario2();
			a.scenario3();
			a.coursedisplay();
	}

}
