package RelationShipTypes;

public class TestLibraryBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b=new Book("ABCD", "XYZ", 300);
		Library lib =new Library(b, 20);
				
		lib.display();
		
	}

}
