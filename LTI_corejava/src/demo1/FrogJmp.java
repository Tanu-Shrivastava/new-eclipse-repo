package demo1;

import java.util.HashMap;

public class FrogJmp {

	public static double solution(int X, int Y, int D)
	{
		
		if(X==Y)
			return 0;
		
		/*for(int i=0; i<=Y; i++)
		{
			X=X+D;
			count++;
			if(X>=Y)
				break;
			else
				continue;
		}*/
			int diff=Y-X;
			float jump=(float)diff/D;
			int jumps=(int)Math.ceil(jump);
			//jump=(float)(Math.ceil(jump));
			//return (int)jump;
			return jumps;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution(10, 100, 20));
	}

}
