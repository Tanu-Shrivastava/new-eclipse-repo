package demo1;
import java.util.Scanner;

public class PrintAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		Scanner kb =new Scanner(System.in);
		System.out.println("enter your name");
		name = kb.nextLine();
		System.out.println("enter your address");
		String address = kb.nextLine();
		System.out.println("enter your city");
		String city = kb.next();
		System.out.println("enter your age");
		int age = kb.nextInt();
		System.out.println("Your name is " + name + ", your address is " + address +" you live in city "+ city + " and your age is " + age);
	}

}
