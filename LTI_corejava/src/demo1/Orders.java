package demo1;

public class Orders {

	private int orderid;
	private int odate;
	private int price;
	private int quantity;
	
	Orders(int orderid,
	 int odate,
	 int price,
	 int quantity){
		this.orderid=orderid;
		this.odate=odate;
		this.price=price;
		this.quantity=quantity;
		
	}

	void getOrders(int oid, int odate, int price, int quantity)
	{
		this.orderid=oid;
		this.odate=odate;
		this.price=price;
		this.quantity=quantity;
		
	}
}
