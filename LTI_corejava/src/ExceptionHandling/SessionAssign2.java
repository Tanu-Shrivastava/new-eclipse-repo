package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SessionAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb =new Scanner(System.in);
		try{
			System.out.println("Enter 1st number");
			int a =kb.nextInt();
			System.out.println("Enter 2nd number");
			int b =kb.nextInt();
			int c=a/b;
			System.out.println("Division is " +c);
		}
		catch (InputMismatchException e){
			System.out.println("Input does not matches the data type");
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide from zero");
		}
		
		
		
	}

}
