package demo1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Queue<Integer> q =new LinkedList<>();
	
	for(int i=21; i<31; i++)
		q.add(i);
	
	System.out.println("Elements of queue : "+q);
	System.out.println("Size of queue : " +q.size());
	System.out.println();
	
	System.out.println("Removed Element : "+q.remove());
	System.out.println("Size of queue : " +q.size());
	System.out.println("Head Element of queue : " +q.peek());
	System.out.println("Elements of queue : "+q);
	System.out.println();
	
	
	System.out.println("Removed Element : "+q.remove());
	System.out.println("Size of queue : " +q.size());
	System.out.println("Head Element of queue : " +q.peek());
	System.out.println("Elements of queue : "+q);
	System.out.println();
	
	
	System.out.println("Added Element : "+q.add(100));
	System.out.println("Size of queue : " +q.size());
	System.out.println("Head Element of queue : " +q.peek());
	System.out.println("Elements of queue : "+q);
	System.out.println();
	}

}
