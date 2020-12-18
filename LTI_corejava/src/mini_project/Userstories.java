package mini_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Userstories {

	Scanner kb =new Scanner(System.in);
	complaint_model cm = new complaint_model();

	
	public ArrayList<complaint_model> search_by_bankname(String x, ArrayList<complaint_model> c)
	{	ArrayList<complaint_model> complaint = new ArrayList<>();
		
		Iterator<complaint_model> itr= c.iterator();
		while(itr.hasNext()){
			complaint_model c1=(complaint_model)itr.next();
			if(c1.getCompany().contains(x))
				{c1.fetchcomplaints();
				;}
		}
		return complaint ;	
	}
	
	
	public ArrayList<complaint_model> search_by_id(int x, ArrayList<complaint_model> c)
	{	ArrayList<complaint_model> complaint = new ArrayList<>();
		
		Iterator<complaint_model> itr= c.iterator();
		while(itr.hasNext()){
			complaint_model c1=(complaint_model)itr.next();
			if(Integer.parseInt(c1.getCompany_id())==x)
				{c1.fetchcomplaints();
				}
		}
		return complaint ;	
	}
	
	
	public ArrayList<complaint_model> timely_response(String x, ArrayList<complaint_model> c)
	{	ArrayList<complaint_model> complaint = new ArrayList<>();
		
		Iterator<complaint_model> itr= c.iterator();
		while(itr.hasNext()){
			complaint_model c1=(complaint_model)itr.next();
			if(c1.getTimely_response()=="Yes")
				{c1.fetchcomplaints();
				}
		}
		return complaint ;	
	}
	
	public ArrayList<complaint_model> closed_complaints(String x, ArrayList<complaint_model> c)
	{	ArrayList<complaint_model> complaint = new ArrayList<>();
		
		Iterator<complaint_model> itr= c.iterator();
		while(itr.hasNext()){
			complaint_model c1=(complaint_model)itr.next();
			if(c1.getTimely_response()=="closed" && c1.getTimely_response()=="closed with explaination")
				{c1.fetchcomplaints();
				}
		}
		return complaint ;	
	}
	
	
	
	}
	

