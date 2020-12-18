package demo1;

public class ArithmeticFunctionWithVoid {

	void add(int a, int b)
	{System.out.println("Addition " + (a+b));}
	void sub(int a, int b)
	{System.out.println("subtraction " + (a-b));}
	void multi(int a, int b)
	{System.out.println("multiplicatiion " + (a*b));}
	void div(int a, int b)
	{System.out.println(" division" + (a/b));}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	ArithmeticFunctionWithVoid call = new ArithmeticFunctionWithVoid();
	call.add(20000, 4);
	call.div(45, 5);
	call.multi(2, 9);
	call.sub(33, 8);
	
		
	}

}
