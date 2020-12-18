package ExCollections;

import java.util.ArrayList;

public class ExArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> fruits =new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Mango");
		
		System.out.println(fruits);
		 fruits.add(2, "Litchi");
		 System.out.println(fruits);
		 fruits.remove(1);
		 System.out.println(fruits);
		 System.out.println("is list empty ;"+fruits.isEmpty());
		 System.out.println("is kiwi there "+fruits.contains("Kiwi"));
		 fruits.clear();
		 System.out.println(fruits);
	}

}
