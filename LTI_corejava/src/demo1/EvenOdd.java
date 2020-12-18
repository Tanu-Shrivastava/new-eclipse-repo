package demo1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);
System.out.println("Enter a number");
int a =kb.nextInt();
if (a%2==0){
	System.out.println(a + " is an even number");}
	else 
		System.out.println(a +" is an odd number");
}
	}


