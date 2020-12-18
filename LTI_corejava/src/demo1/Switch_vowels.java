package demo1;

import java.util.Scanner;

public class Switch_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);
System.out.println("Enter an Alphabet in lower case");
char ch = kb.next().charAt(0);
switch(ch){
case 'a':
	System.out.println("It is an vowel");
	break;
case 'e':
	System.out.println("It is an vowel");break;
case 'i':
	System.out.println("It is an vowel");break;
case 'o':
	System.out.println("It is an vowel");break;
case 'u':
	System.out.println("It is an vowel");break;
default :
	System.out.println("It is a consonant");
	

}

		
	}

}
