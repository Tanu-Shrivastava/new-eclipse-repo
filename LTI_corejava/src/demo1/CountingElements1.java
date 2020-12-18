package demo1;

public class CountingElements1 {

	public static int[] counting(int[] A , int m)
	{
		int[] count = new int[m+1];
		for(int i=0; i<A.length; i++)
		{
			count[A[i]]++;
		}
	
	return count;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array ={2, 4, 2, 5, 6, 2, 5};
int[] array1 = counting(array, 8);
for(Integer arr:array1)
	System.out.print(arr);
		
	}

}
