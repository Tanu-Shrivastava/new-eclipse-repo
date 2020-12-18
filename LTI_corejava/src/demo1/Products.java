package demo1;

public class Products {
	
	private int pid;
	private String pname;
	private int price;
	public int stockavail;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStockavail() {
		return stockavail;
	}
	public void setStockavail(int stockavail) {
		this.stockavail = stockavail;
	}
	
public boolean stockNotify()
{
	if	(stockavail<10)
	{
		System.out.println("Stock availability is below 10");
	}
	
	else
		System.out.println("Available Stock is " + stockavail);
	return false;
}

void calculateProductCommission()
{
	double com = com=0.1*(price);
	System.out.println("Commision : "+com);
}

void checkProductAvailablity()
{
	if(this.pname.equalsIgnoreCase("laptop") || this.pname.equalsIgnoreCase("pendrive") || this.pname.equalsIgnoreCase("mouse"))
    {
	System.out.println(pname + " is available");	
    }
}

Products(int pid, String pname, int price, int stockavail)
{
	this.pid= pid;
	this.pname= pname;
	this.price= price;
	this.stockavail= stockavail;
	
}
public Products(int pid, String pname, int price) {
	stockavail=10;
	this.pid = pid;
	this.pname = pname;
	this.price = price;
}

	
}

