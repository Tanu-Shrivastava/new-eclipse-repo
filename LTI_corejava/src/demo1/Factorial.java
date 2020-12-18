package demo1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		int fact=1;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number you need factorial");
		int n =kb.nextInt();
		for(int i=1; i<=n;i++){
			fact=fact*i;
		}
		System.out.println("Factorial of " +n+ " is "+fact);
	}

}
