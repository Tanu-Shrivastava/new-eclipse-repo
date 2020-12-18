package demo1;

import java.util.Scanner;

public class TapeEquillibrum {

	public static int solution(int[] A)
	{
		//int P=0;
		int sum1=0;
		int sum2=0;
		int diff=0;
		int actualsum=0;
		int min_diff=Integer.MAX_VALUE;
		
		for(int A1:A)
			{actualsum=actualsum+A1;}
		/*Scanner kb=new Scanner(System.in);
		System.out.println("enter th enumber where you want to split");
		P=kb.nextInt();
		
		for(int i=0; i<P;i++)
		{
			sum1=sum1+A[i];
		}
		
		for(int j=P; j<A.length; j++)
		{
			sum2=sum2+A[P];
		}
		
		int diff=sum1-sum2;
		return diff;*/
		
		for(int P=1; P<A.length; P++)
		{
			sum1=sum1+A[P-1];
			sum2=actualsum-sum1;
			diff=sum2-sum1;
			
			if(diff<0)
				diff=-diff;
			
			min_diff=Math.min(min_diff, diff);
		}
	
		
		return min_diff;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array={2, 3, 4, 4, 4, 2, 2, 5, 7, 7};
		System.out.println(solution(array));
	}

}
