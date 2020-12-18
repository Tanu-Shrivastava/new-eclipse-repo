package demo1;

import java.util.Arrays;

public class BugFixing2 {

	//return the minimal value that occurs in both the arrays
	//if no match found return -1


		int solution(int[] A, int[] B) {
	        int n = A.length;
	        int m = B.length;
	        Arrays.sort(A);
	        Arrays.sort(B);
	        
	     //   if(n==0 || m==0)
	       // 	return -1;
	        
	        int i=0;
	        for (int k = 0; k < n; k++) {
	            if (A[k] == B[i])
	                return A[k];
	           //{ if(B[i]>A[k])
	            //{	k++;
	            while (i < m-1  && B[i] < A[k])
	                i += 1;
	            
	           // else
	    	     //   k+=1;
	        }
	        return -1;
	    }
		
		public static void main(String[] args) {
			int[] A = {7, 2, 4, 6, 9, 7, 3};
			int[] B = {1, 1, 8, 3, 9};
			System.out.println(new BugFixing2().solution(A, B));
		}
	
}
