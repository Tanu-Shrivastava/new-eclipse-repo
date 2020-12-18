package demo1;

public class BugFixing3 {

	//check if the array contains every number from 1 to K atleast once
	public boolean solution(int[] A, int K) {
	int n = A.length;
	for (int i = 0; i < n - 1; i++) {
	if (A[i]+1 < A[i + 1])
	return false;
	}
	if (A[0] != 1 && A[n - 1] != K)
	return false;
	else
	return true;
	}
	
	
	public static void main(String[] args) {
	int[] A = {1, 1, 2, 2, 3, 4, 5, 6};
	int K = 7;
	
	System.out.println(new BugFixing3().solution(A, K));
	}
	

}
