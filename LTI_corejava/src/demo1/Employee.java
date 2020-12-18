package demo1;

public class Employee {

	private int empid;
	private String name;
	private String hiredate;
	private String dob;
	private int salary;
	private String desig;
	
	
	void getYearsOfExp()
	{
		System.out.println("Display Years of Experience");
	}
	

	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		if (empid>0)
		{
		this.empid = empid;
		}
		else System.out.println("Employee Should be Positive");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHiredate() {
		return hiredate;
	}


	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDesig() {
		return desig;
	}


	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	void getDetails()
	{
		System.out.println("Ëmployee id " + empid);
		System.out.println("Ëmployee name " + name);
		System.out.println("Ëmployee Hire date " + hiredate);
		System.out.println("Ëmployee DOB " + dob);
		System.out.println("Ëmployee salary " + salary);
		System.out.println("Ëmployee Designation " + desig);
	}
	
	void setDetails(int employeeid, String ename, String hiredate, String dob, int salary, String desig  ){
		
		empid = employeeid;
		name=ename;
		this.hiredate=hiredate;
		this.dob=dob;
		this.salary=salary;
		this.desig=desig;
		
			}

}
