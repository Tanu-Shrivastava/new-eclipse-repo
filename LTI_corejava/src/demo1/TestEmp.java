package demo1;

import java.util.Scanner;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Employee emp =new Employee();
String tname, thiredate, tdob, tdesig;
int tempid, tsalary;
emp.setEmpid(-101);
System.out.println(emp.getEmpid());

Scanner kb = new Scanner(System.in);
System.out.println("Enter id, name, hiredate, dob, salary, designation");
tname=kb.nextLine();
thiredate=kb.next();
tdob=kb.next();
tdesig=kb.nextLine();
tempid=kb.nextInt();
tsalary=kb.nextInt();

emp.setDetails(tempid, tname, thiredate, tdob, tsalary, tdesig);
emp.getDetails();

	}

}
