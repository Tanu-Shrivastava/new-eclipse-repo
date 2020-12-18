package demo1;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment4 {

	public static String solution(String[] A, String[] B, String P)
	{
		 ArrayList<String> al = new ArrayList<>();
	        for(int i=0; i<B.length; i++)
	        {
	            if(B[i].contains(P))
	            {
	                al.add(A[i]);
	            }
	        }
	        
	        Collections.sort(al);
	        
	        if(al.isEmpty()==true)
	        {
	            return "NO CONTACT";
	        }
	        
	        else
	        {
	            return al.get(0);
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
