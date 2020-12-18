package exabstract;

public abstract class Bank {

	 public void getTransactionDetails()
	{
		System.out.println("GET transaction details");
	}
	
	abstract float getRateOfInterest();
	
}
