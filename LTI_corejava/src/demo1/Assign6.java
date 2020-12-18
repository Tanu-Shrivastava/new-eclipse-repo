package demo1;

import java.util.Scanner;

public class Assign6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb =new Scanner(System.in);
double dis_amt, total_amt;
System.out.println("Enter Price of product");
int price =kb.nextInt();
System.out.println("Enter Quantity of product");
int quan =kb.nextInt();
double totalprice= (price*quan);
if (totalprice>10000){
	dis_amt=(totalprice*0.15);
	total_amt=(totalprice-dis_amt);	
	System.out.println("Total Price : " + totalprice + " Discount amount : " + dis_amt +" Total Amount to be Paid : " + total_amt);
}
else if (10000>totalprice && totalprice>5000){
	dis_amt=(totalprice*0.10);
	total_amt=(totalprice-dis_amt);
	System.out.println("Total Price : " + totalprice + " Discount amount : " + dis_amt +" Total Amount to be Paid : " + total_amt);
	}
else 
	System.out.println("No discount Total Price " + totalprice);
	}

}
