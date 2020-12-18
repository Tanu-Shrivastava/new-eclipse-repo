package demo1;

public class CountingElement2 {
	
	public static int[] counting(int[] A , int m)
	{
		int[] count = new int[m+1];
		for(int i=0; i<A.length; i++)
		{
			count[A[i]]++;
		}
	
	return count;}

	public static boolean solution(int[] a, int[] b, int m)
	{
		int sum_a=0;
		int sum_b=0;
		for (int i = 0; i < a.length; i++) 
            sum_a +=  a[i];
		for (int i = 0; i < b.length; i++) 
            sum_b +=  b[i];
		int diff=sum_a-sum_b;
		if(diff%2==1)
			return false;
		diff=diff/2;
		int[] count=counting(a, m);
		for(int i=0; i<a.length; i++)
		{
			if(0<=b[i]-diff && b[i]-diff <=m && count[b[i]-diff]>0)
				return true;
			
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={6, 6, 1, 2, 3};
		int[] b={1, 5, 3, 2, 1};
		System.out.println(solution(a, b, 10));
	}

}
