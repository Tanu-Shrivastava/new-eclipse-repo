package demo1;

import java.util.Scanner;

public class Elseif {

	public static void main(String args[]){
		
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter a");
		int a=kb.nextInt();
		System.out.println("Enter b");
		int b=kb.nextInt();
		System.out.println("Enter c");
		int c=kb.nextInt();
		if (a>b && a>c){
			System.out.println(a + " is greater");
			}

		else if (b>a && b>c){
			System.out.println(b  +" is greater");}
			else if (c>a && c>a){
				System.out.println(c +" is greater");}
		
			else {
					System.out.println("all are equal");
			}
		}
		
}
