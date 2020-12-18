package demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codility1 
{

	public int solution(int n)
	{
		char bin[] = Integer.toBinaryString(n).toCharArray();
	
		int finalgap=0;
		int countof0=0;
		if(n==1)
			return 0;		
		for(int i=0; i<bin.length; i++)
		{
			
			//System.out.print(bin[i]);
			
			if(bin[i]=='0')
				{countof0++;}
			
			else if(bin[i]=='1')
			{
				if(countof0>=finalgap)
					finalgap=countof0;
					countof0=0;
				
			}
		
		}
		return finalgap;
		
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Codility1 c = new Codility1();
ArrayList<Integer> al= new ArrayList<>();
HashMap<Integer, Integer> hm= new HashMap<>();
		int num;
		Scanner kb =new Scanner(System.in);
		String choice="y";
		
		while(choice.equalsIgnoreCase("y"))
		{
		System.out.println("enter a number");
		num=kb.nextInt();
		System.out.println("\n"+c.solution(num));
		//al.add(c.solution(num));
	    hm.put(num, c.solution(num));
		System.out.println("do you want to continue : y/n");
		choice=kb.next();
		}
		
		/*for(Integer al1:al)
		{
			System.out.println("gap of various decimal numbers " +al1);
		}
		
		System.out.println("enter the binary gap you want");
		int gap=kb.nextInt();
		if(al.contains(gap)){
			for(int i=0; i<al.size();i++)
			{
				System.out.println(al.get(i));
			}
		}*/
		
		for(Map.Entry<Integer, Integer> hm1:hm.entrySet())
		{
			System.out.println("Decimal Number : "+hm1.getKey()+" Binary Gap : "+hm1.getValue());
		}
		
		for(Map.Entry<Integer, Integer> hm1:hm.entrySet())
		{
			System.out.println("enter the binary gap you want");
			int gap=kb.nextInt();
			if(gap==hm1.getValue())
			{
				System.out.println("Decimal Number : "+hm1.getKey()+" Binary Gap : "+hm1.getValue());
				break;
			}
		}
		
	
		}

	}
