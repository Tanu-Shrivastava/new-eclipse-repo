package demo1;

import java.util.Arrays;

public class Triangle {

	public static int solution(int[] A)
	{
		Arrays.sort(A);
		for(int i=2; i<A.length; i++)
		{
			if((long)A[i]+(long)A[i+1]>(long)A[i+2])
		
				{return 1;
				}
			
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
