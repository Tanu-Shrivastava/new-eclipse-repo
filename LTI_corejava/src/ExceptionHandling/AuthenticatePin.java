package ExceptionHandling;

public class AuthenticatePin {

	static void checkPin(String pinno) throws CheckPinLengthException{
		if (pinno.length()>4)
		{
			throw new CheckPinLengthException(pinno);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	String pinno ="353465";
	checkPin(pinno);
}
	catch(CheckPinLengthException e){
		System.out.println("make sure your pin length is 4");
	}	
		
	}

}
