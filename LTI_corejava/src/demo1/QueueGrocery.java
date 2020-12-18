package demo1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueGrocery {

	
	public static int grocery(int[] A)
	{

		Queue<Integer> q=new LinkedList<>();
		
		for(int i=0; i<A.length; i++)
		{
			q.add(A[i]);
		}
		
		//System.out.println(q);
		
		int result=0;
		int size=0;
		for(int i=0; i<A.length; i++)
		{
			if(A[i]==0)
				size+=1;
			else
			{
				size-=1;
				result =Integer.max(result, -size);
			}
			
		}
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={0, 1, 0, 0, 0, 1, 1, 1, 1};
		grocery(A);
		
	}

}
