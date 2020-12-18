package demo1;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxCounters {

	public static int[] solution(int N, int[] A)
	{/*
	int[] count=new int[N];
		for(int j=0; j<N; j++)
			count[j]=0;
	int max=0;
		for(int i=0; i<A.length; i++)
		{
			if(A[i]>=1 && A[i]<=N)                                                                      
			
			{
				count[A[i]-1]++;
				max=Arrays.stream(count).max().getAsInt();
			}
			
			
			
			else
			{
				for(int j=0; j<N; j++)
					count[j]=max;
			}
		}
		
		return count; */
		
		int max =0;
        int min =0;
     int[] count = new int[N]; //counter array
 for(int i=0; i<A.length; i++){
            if( A[i] >= 1 && A[i] <= N){
                if(count[ A[i] -1] < min){//  myarray[A[0]-1] myarray[3-1] myarray[2]<0 min=0
                	                         //  myarray[A[1]-1] myarray[4-1] myaary[3]   min
                    count[ A[i] -1] = min;
                }
                count[ A[i] -1 ] ++; //myarray[2]=0+1=1
            
         //maintaining max counter  //1>0      
                if( count[ A[i] -1 ] > max){ 
                    max = count[ A[i] -1 ];
                }
            }
            //this will be only when A[i] is 6
            else if( A[i] == N+1){  //3 ===6
            	//A[3]==5+1=6
            	//6==6(true)
                min = max; //making min and max both same 
                //it is not replacing all the values to max counter
            }
        }
        

        for(int j=0; j<count.length; j++){
            if(count[j] < min){
                count[j] = min; 
            }
        }
        
        return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array={3, 4, 4, 6, 1, 4, 4};
		int[] ans=solution(5, array);
		for(Integer ans1:ans)
			System.out.println(ans1);
	}

}
