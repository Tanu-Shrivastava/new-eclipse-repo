package ExceptionHandling;

public class CheckPinLengthException extends Exception{

     CheckPinLengthException(String pin){
    	 
    	 System.out.println("Length of the pin is not acceptable");
     }
}
