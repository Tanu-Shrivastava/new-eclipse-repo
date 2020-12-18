package demo1;

import java.util.HashSet;

public class PermMissingNumber {
	
	public static int solution(int[] A)
	{
		long size=A.length;
		if(size==0)
			return 1;
		long sum=0;
		for(int A1:A)
			sum=sum+A1;
		long actualsum=((size+1)*(size+2))/2;
		 long missing=actualsum-sum;
		return (int)missing;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array={1, 2, 3, 5, 6, 7, 8};
		System.out.println(solution(array));
	}

}
