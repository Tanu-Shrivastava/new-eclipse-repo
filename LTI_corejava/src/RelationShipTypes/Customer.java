package RelationShipTypes;

public class Customer {

	private int id;
	private String name;
    Address addobj;
	public Customer(int id, String name, Address addobj) {
		
		this.id = id;
		this.name = name;
		this.addobj = addobj;
	}
    
    void display(){
    	System.out.println("Id" + id);
    	System.out.println("Name" + name);
    	System.out.println("Roadname" + addobj.getRoadname());
    	System.out.println("Building name" + addobj.getBuildingname());
    	System.out.println("Pincode" + addobj.getPincode());
    	System.out.println("City" + addobj.getCity());
    	
    }

}
