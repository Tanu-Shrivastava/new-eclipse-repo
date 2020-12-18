package demo1;

import java.util.HashMap;

public class PassingCars {

	public static int solution(int[] A)
	{
		double east=0;
		double pass=0;
		for(int i=0; i<A.length; i++)
		{
			if(A[i]==0)
				east++;
			if(A[i]==1)
				pass=pass+east;
		}
		
		if(pass>1000000000 || pass<0)
		{
			return -1;
		}
		return (int)pass;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={0, 0, 1, 0, 1, 0};
		System.out.println(solution(arr));
	}

}
