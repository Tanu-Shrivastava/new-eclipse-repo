package demo1;

import java.util.HashMap;

public class OddOccurences {

	public static int solution(int[] A)
	{
		HashMap<Integer, Integer> hm = new HashMap<>();
		int oddno=0;
		for(int i : A)
		{
			if (hm.containsKey(i))
			{
				int occur=hm.get(i);
				occur++;
				hm.put(i, occur);
			}
			
			else 
			{
				hm.put(i, 1);
			}
		}
		
		for(Integer i:hm.keySet())
		{
			int occur=hm.get(i);
			if(occur % 2!=0)
			{
				oddno=i;
			}
		}
		
		return oddno;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array={2, 3, 4, 2, 5, 3, 5, 7, 7};
		System.out.println("the single number is "+solution(array));
	}

}
