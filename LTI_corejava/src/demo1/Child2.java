package demo1;

public class Child2 extends Child{

	void c2feature1(){
		System.out.println("c2 feature1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child2 c2 =new Child2();
		c2.c2feature1();
		c2.c1feature1();
		c2.pfeature1();
		c2.pfeature2();
		
		
	}

}
