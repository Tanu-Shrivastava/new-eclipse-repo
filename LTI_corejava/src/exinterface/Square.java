package exinterface;

public class Square {


	public static void main(String[] args) {
		
		
	
	
	Shape s=()->{
		System.out.println("interface calling lambda expression");
	};
	s.draw();
}
}