package mini_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fileread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);
ArrayList<complaint_model> complaint = new ArrayList<>();
File myFile =new File("D://tanuj/java/complaints.csv");
if(myFile.exists()){
		try {
			System.out.println("found");
			kb =new Scanner(myFile);
			int i=0;
			kb.nextLine();
			while(i<10){
				if(i>0){
				String[] attributes =kb.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
				complaint_model cm =new complaint_model(attributes[0], attributes[1], attributes[2], attributes[3], attributes[4], attributes[5], attributes[6], attributes[7], attributes[8], attributes[9], attributes[10], attributes[11], attributes[12], attributes[13]);
				complaint.add(cm);
				System.out.println(kb.nextLine());
				System.out.println("done");
				}
				i++;
				
			}
			
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}


Userstories us =new Userstories();
ArrayList<complaint_model> cm1 = new ArrayList<>();
System.out.println("enter bank name");
String bankname = kb.next();
us.search_by_bankname(bankname, cm1);

System.out.println("enter bank id");
String bankid = kb.next();
us.search_by_id(468879, cm1);

System.out.println("enter bank name");
String response= kb.next();
us.timely_response(response, cm1);

System.out.println("enter bank name");
String closedcom = kb.next();
us.closed_complaints(closedcom, cm1);





	}}

	
