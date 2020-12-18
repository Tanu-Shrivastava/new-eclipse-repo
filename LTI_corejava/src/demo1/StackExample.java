package demo1;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st= new Stack<>();
		for(int i=21;i<31; i++)
		{
			st.push(i);
		}
		
		
		System.out.println("Size of stack : " +st.size());
		
		int a=st.pop();
		System.out.println("Element popped : "+a);
		System.out.println("Size of stack : " +st.size());
		System.out.println("Top element of the stack : "+st.peek());
		
		int b=st.pop();
		System.out.println("Element popped : "+b);
		System.out.println("Size of stack : " +st.size());
		System.out.println("Top element of the stack : "+st.peek());
		
		int c=st.pop();
		System.out.println("Element popped : "+c);
		System.out.println("Size of stack : " +st.size());
		System.out.println("Top element of the stack : "+st.peek());
		
		int d=st.push(100);
		System.out.println("Element pushed : "+d);
		System.out.println("Size of stack : " +st.size());
		System.out.println("Top element of the stack : "+st.peek());
		
	}

}
