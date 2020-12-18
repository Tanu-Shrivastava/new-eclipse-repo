package demo1;

public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={1, 3, 2, 10, 5};
		int n=a.length;
		int[] prefix_a= new int[n];
		
		prefix_a[0]=a[0];
		for(int i=1; i<n; i++)
		{
			prefix_a[i]=prefix_a[i-1]+a[i];
		}
		
		for(Integer p:prefix_a)
		{
			System.out.println(p);
		}
	}

}
