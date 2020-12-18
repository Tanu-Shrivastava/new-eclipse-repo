package demo1;

public class CountDiv {
	
	public static int solution(int A, int B, int K)
	{
		int count=0;
		int[] array=new int[(B-A)+1];
		for(int i=0; i<(B-A)+1;i++)
		{
			array[i]=i+A;
			if(array[i]%K==0)
				count++;
		}
		return count;
		
		/*int div_a=(int)Math.floor(A/K);
		int div_b=(int)Math.floor(B/K);
		int ans= div_b-div_a;
		
		return ans;*/
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println(solution(11, 45, 6));
		
		
	}

}
