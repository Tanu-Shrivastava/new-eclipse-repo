package demo1;

public class Child extends Parent {

	void c1feature1(){
		
		System.out.println("Child1 feature1");
	
	}
	
	public static void main(String[] args) {
		
		
		Child ch =new Child();
		ch.pfeature1();
		ch.pfeature2();
		ch.c1feature1();
		System.out.println(ch.a);
	//	System.out.println(ch.b);//it is private
		System.out.println(ch.c);
	}

	
}
