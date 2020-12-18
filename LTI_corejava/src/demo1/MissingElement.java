package demo1;

import java.util.HashSet;

public class MissingElement {

	public static int solution(int[] A)
	{
		int missing=0;
		HashSet<Integer> hs=new HashSet<>();
		//for(Integer A1:A)
			//hs.add(A1);
		if(A.length==0)
			return 1;
		for(int i=0; i<A.length; i++)
			hs.add(A[i]);
		for(int i=1; i<=A.length; i++)
		{
			if(hs.contains(i)!=true)
				return i;
				//{missing=i;}
		}
		
		//if(missing==0)
			//missing=A.length+1;
		//return missing;
			return A.length+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array={-2, -3, -1};
		System.out.println(solution(array));
	}

}
