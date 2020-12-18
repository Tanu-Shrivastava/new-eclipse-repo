package demo1;

import java.math.BigInteger;

public class BinaryToOne {

	public static int numSteps(String s)
	{
		 BigInteger decimal = new BigInteger(s, 2);  
		  
		   System.out.println(decimal);
		   int decimal1=decimal.intValue();
		    
		int count=0;
		System.out.println("change"+decimal1);
		for(int i=0; i<Integer.MAX_VALUE; i++)
		{
			if(decimal1>1){
			if(decimal1%2==0)
			{
				System.out.println(decimal1);
				decimal1=decimal1/2;
				count++;
			}
			else
			{
				System.out.println(decimal1);
				decimal1=decimal1+1;
				count++;
			}}
			
			else
				break;
		}
		
		return count;
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "1111011110000011100000110001011011110010111001010111110001";
		System.out.println("ans "+numSteps(s));
		 
	}

}
