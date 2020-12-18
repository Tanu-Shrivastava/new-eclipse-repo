package RelationShipTypes;

public class Book {

	private String bname;
	private String authorname;
	private int price;
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String bname, String authorname, int price) {
		
		this.bname = bname;
		this.authorname = authorname;
		this.price = price;
	}
	
}
