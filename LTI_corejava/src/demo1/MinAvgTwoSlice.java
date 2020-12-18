package demo1;

public class MinAvgTwoSlice {

	public static int solution(int[] A)
	{
		float min=Integer.MAX_VALUE;
		float avg2=0;
		float avg3=0;
		int pos=0;
		for(int i=0; i<A.length-2; i++)
		{
			avg2= (float)(A[i]+A[i+1])/2;
			avg3= (float)(A[i]+A[i+1]+A[i+2])/3;
			float min_avg=Math.min(avg2, avg3);
			if(min_avg<min)
			{
				min=min_avg;
				pos=i;
			}
			
					
		}
		return pos;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array={1, 3, 5, 2, 6};
		System.out.println(solution(array));
	}

}
