package RelationShipTypes;

public class TestCustomerAddress {
	
	public static void main(String[] args) {
		Address add=new Address("aa", "bb", 4789, "cc");
		Customer c =new Customer(101, "xyz", add);
		
	c.display();
	}
}
