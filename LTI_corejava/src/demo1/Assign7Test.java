package demo1;

import java.util.Scanner;

public class Assign7Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Assign7 a=new Assign7();
		Scanner kb1=new Scanner(System.in);
		int ch;
		System.out.println("Choose what you want to do?");
		ch=kb1.nextInt();
		switch(ch){
		case 1:
			a.deposit();
			break;
		case 2:
			a.withdraw();
			break;
		case 3:
			System.out.println("balance: "+a.checkbalance(a.amt));
			break;
		default :
		System.out.println("wrong choice");
			
		}
	}

}
