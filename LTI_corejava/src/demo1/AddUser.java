package demo1;

import java.util.Scanner;

public class AddUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner kb=new Scanner(System.in);
		System.out.println(" Enter First value ");
		a= kb.nextInt();
		System.out.println(" Enter Second value ");
		b= kb.nextInt();
		c=a+b;
	System.out.println("sum is " + c);
	System.out.println("Addition of "+ a+"and " + b +" is " + c);

	}

}