package demo1;

import java.util.Arrays;
import java.util.HashSet;

public class FrogJump2 {

	public static int solution(int X, int[] A)
	{
		HashSet<Integer> hs= new HashSet<>();
		for(int i=1; i<=X; i++)
		{
			hs.add(i);
		
		 }
		 
		int position=-1;
		for(int i=0; i<A.length; i++)
		{
			if(hs.contains(A[i])==true)
			{
				hs.remove(A[i]);
			}
			
			if(hs.isEmpty()==true){
				position=i;
				break;
			}
		}
		return position;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array={1, 5, 4, 3, 2, 3, 6, 5};
		System.out.println(solution(6, array));
	}

}
