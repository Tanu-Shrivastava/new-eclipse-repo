package demo1;

public class CyclicRotation {

		public static int[] solution(int[] A, int K){
			
			/*
			for(int j=0; j<K; j++){
			for(int i=0;i<A.length; i++){
				A[i+1]=A[i];
			}
			
			A[0]=A[A.length-1];
			}
			return A;*/
			
			
			int[] new_A = new int[A.length];
			
			for(int i=0; i<A.length;i++){
			int new_pos=(i+K)%A.length;
			new_A[new_pos]=A[i];}
			
			return new_A;
			
	}


		public static void main(String[] args) {
			int[] array={2, 3, 4, 5, 6};
			System.out.println(array);
			int[] new_array=solution(array, 2);
			for(int i=0;i<new_array.length;i++){
				System.out.println(new_array[i]);
			}
		}}


