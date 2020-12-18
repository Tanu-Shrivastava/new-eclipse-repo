package ExCollections;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExLinkedList {

	public static void main(String[] args) {
        List<Courses> list =new ArrayList<Courses>();
		Courses c1 = new Courses(10, "java", 10, 3000);
		Courses c2 = new Courses(11, "c programming", 12, 100);
		Courses c3 = new Courses(12, "python", 9, 2500);
		Courses c4 = new Courses(13, ".net", 8, 1500);
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		
		list.stream().filter(courses -> courses.getCid()>11).forEach(courses -> System.out.println(courses.getCid() +" "+courses.getCname()));
		
	/*	Iterator itr = list.iterator();
		while(itr.hasNext()){
			Courses c = (Courses)itr.next();
			c.show();
		}*/
		
		
		/*Iterator itr1 = list.iterator();
		System.out.println("courses with fees greater than 2000");
		while(itr1.hasNext()){
			Courses c = (Courses)itr1.next();
			
			if(c.getFees()>2000){
			
				c.show();
			}
		}*/
		
		
		/*Iterator itr2 = list.iterator();
		System.out.println("Updated list");
		while(itr2.hasNext()){
			Courses c = (Courses)itr2.next();
			if(c.getCname()=="c programming"){
				c.setCname("c++");
				c.show();
			}
			
		}*/
	/*Scanner kb =new Scanner(System.in);
		System.out.println("Enter id :");*/
	
		
		
		
		
		
	}
}
