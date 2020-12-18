package ExCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> name =new ArrayList<>();
		ArrayList<String> email =new ArrayList<>();
		String pname;
		String pemail;
		Scanner kb =new Scanner(System.in);
		String choice="y";
		while(choice.equals("y")){
			System.out.println("enter the name of participant :");
			pname=kb.next();
			name.add(pname);
			System.out.println("enter the email of participant :");
			pemail=kb.next();
			email.add(pemail);
			System.out.println("Do you want to continue: y/n ");
			choice=kb.next();
		}
		System.out.println("Total participants: " + name.size());
		System.out.println("Total  email id: " + email.size());
		System.out.println("Enter the email of participant you want to delete :");
		pemail =kb.next();
		if(email.contains(pemail)){
			
			System.out.println(pemail+"is deleted");
			email.remove(pemail);
			System.out.println("Total participants and email id: " + email.size());
		}
		else 
			{System.out.println("not present");}
		
		System.out.println("Total and email id: " + email.size());
		
		
		
		
	}
}
