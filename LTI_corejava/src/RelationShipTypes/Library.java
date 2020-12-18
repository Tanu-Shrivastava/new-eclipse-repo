package RelationShipTypes;

public class Library {

	Book book;
	private int stock;
	
	void display(){
		System.out.println("Book name :" +book.getBname());
		System.out.println("Author name :" +book.getAuthorname());
		
		System.out.println("Book Price :" +book.getPrice());
		System.out.println("Books Available :" +stock);
		
	}

	public Library(Book book, int stock) {
		super();
		this.book = book;
		this.stock = stock;
	}
}
