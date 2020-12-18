package com.lti.casestudy.day1;

public class Course {
	
	private int cid;
	private String cname;
	private int cduration;
	private int cfees;
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
	public int getCduration() {
		return cduration;
	}
	public void setCduration(int cduration) {
		this.cduration = cduration;
	}
	public int getCfees() {
		return cfees;
	}
	public void setCfees(int cfees) {
		this.cfees = cfees;
	}

	Course(int cid, String cname, int cduration, int cfees )
	{
		this.cid=cid;
		this.cname=cname;
		this.cduration=cduration;
		this.cfees=cfees;
	}
}
