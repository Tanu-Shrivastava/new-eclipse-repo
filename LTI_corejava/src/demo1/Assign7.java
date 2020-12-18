package demo1;

import java.util.Scanner;

public class Assign7 {
Scanner kb =new Scanner(System.in);
	public int amt=20000;
	void deposit(){
		System.out.println("Enter the amount you want to deposit");
		int dep=kb.nextInt();
		amt=amt+dep;
		System.out.println("Total amount "+amt);
	}
	
	void withdraw()
	{
		System.out.println("Enter the amount you want to withdraw");
		int wd=kb.nextInt();
		System.out.println("Your acc has : "+amt);
		System.out.println("Do you want to countinue: y/n");
		String choice =kb.next();
		if (choice.equalsIgnoreCase("y"))
			{amt=amt-wd;}
		else{
		System.out.println("Total amount "+amt);}
		System.out.println("Total amount "+amt);
	}
	
	int checkbalance(int amt)
	{
		return amt;
		
	}


}
