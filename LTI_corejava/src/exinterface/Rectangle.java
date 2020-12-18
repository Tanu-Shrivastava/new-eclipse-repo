package exinterface;

public class Rectangle implements Shape{

	
	

	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("normal interface method overridding");
	}
	
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.draw();
	}
}

