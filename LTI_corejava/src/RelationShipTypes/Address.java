package RelationShipTypes;

public class Address {

	private String roadname;
	private String buildingname;
	private int pincode;
	private String city;
	public String getRoadname() {
		return roadname;
	}
	public void setRoadname(String roadname) {
		this.roadname = roadname;
	}
	public String getBuildingname() {
		return buildingname;
	}
	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String roadname, String buildingname, int pincode, String city) {
		
		this.roadname = roadname;
		this.buildingname = buildingname;
		this.pincode = pincode;
		this.city = city;
	}
	
	
	
}
