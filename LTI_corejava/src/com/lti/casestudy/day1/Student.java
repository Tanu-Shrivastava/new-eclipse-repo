package com.lti.casestudy.day1;

import java.util.Scanner;

public class Student {

	private int id;
	private String name;
	private String dob;
	
	Student(int id, String name, String dob){
		
		this.id=id;
		this.name=name;
		this.dob=dob;
	}
	
	Student(){
		id =0;
		name="";
		dob="";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
		
		
	}
	

