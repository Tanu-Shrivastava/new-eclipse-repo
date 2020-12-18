package ReadandWrite;

import java.io.FileWriter;
import java.io.IOException;

public class ExFlieWriteException {

	public static void main(String[] args) {
		String data = "Welcome to java \n Hello, Let's start learning";
		FileWriter fw =null;
		try {
			fw =new FileWriter("abc.txt");
			fw.write(data);
			System.out.println("Data Written");
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		finally 
		{
			try{
				fw.close();
				
			}
			catch(IOException e){
				e.printStackTrace();
				
			}
		}
	}
}
