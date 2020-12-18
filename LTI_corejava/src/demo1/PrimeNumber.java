package demo1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner kb= new Scanner(System.in);
 System.out.println("Enter a number");
 int a = kb.nextInt();
 int count=0;
 for (int i=2; i<a; i++){
	 if(a%i==0)
		 count++;
 }
 if (count==0)
	 System.out.println("Prime number");
 else
	 System.out.println("Composite number");
 	}

}
