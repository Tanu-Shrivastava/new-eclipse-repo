package demo1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb =new Scanner(System.in);
		System.out.println("Average of 5 subjects out of 50");
		System.out.println("Marks of Maths");
		int math= kb.nextInt();
		System.out.println("Marks of Science");
		int sci= kb.nextInt();
		System.out.println("Marks of English");
		int eng= kb.nextInt();
		System.out.println("Marks of Hindi");
		int hin= kb.nextInt();
		System.out.println("Marks of Social");
		int sst= kb.nextInt();
		int avg_marks= (math+sci+sst+eng+hin)/5;
		System.out.println("Average Marks are " + (avg_marks));
		
		
		
	}

}
