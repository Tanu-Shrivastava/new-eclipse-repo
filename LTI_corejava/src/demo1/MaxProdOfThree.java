package demo1;

import java.util.Arrays;

public class MaxProdOfThree {

	public static int solution(int[] A){
		Arrays.sort(A);
		int n=A.length;
		int first3=A[0]*A[1]*A[n-1];
		int last3= A[n-1]*A[n-2]*A[n-3];
		int max =Math.max(first3, last3);
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2, 4, 2, -6, 4, 2, -6, 3};
		System.out.println(solution(arr));
	}

}
