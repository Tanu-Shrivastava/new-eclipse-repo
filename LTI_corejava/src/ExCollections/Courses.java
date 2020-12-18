package ExCollections;

public class Courses {

	private int cid;
	private String cname;
	private int duration;
	private int fees;
	public Courses(int cid, String cname, int duration, int fees) {
		
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
		this.fees = fees;
	}
	
	

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
void show(){
		
		System.out.println("Id :"+ cid);
		System.out.println("Name :"+ cname);
		System.out.println("Duration :"+ duration);
		System.out.println("Fees :"+ fees);
		
	}
void get()
{
	System.out.println("Enter id :");
	
}
}
