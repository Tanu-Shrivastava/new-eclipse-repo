package demo1;

import java.util.HashSet;

public class PermElements {

	public static int solution(int[] A)
	{
		HashSet<Integer> hs=new HashSet<>();
		if(A.length==0)
			return 0;
		for(int i=0; i<A.length; i++)
			hs.add(A[i]);
		for(int i=1; i<=A.length; i++)
		{
			if(hs.contains(i)!=true)
				return 0;
		}
			return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array={2, 3, 4, 5};
		System.out.println(solution(array));
	}

}
