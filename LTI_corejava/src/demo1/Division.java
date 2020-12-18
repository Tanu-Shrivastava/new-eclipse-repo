package demo1;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb =new Scanner(System.in);
		System.out.println("enter the number");
		int n=kb.nextInt();
		while(n>0){
			n=n/10;
			System.out.println(n);
		}
		
	}

}
