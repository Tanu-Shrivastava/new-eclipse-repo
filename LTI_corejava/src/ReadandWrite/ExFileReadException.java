package ReadandWrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExFileReadException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FileReader fr = null;
		int charval;
		try {
			fr =new FileReader("test.txt");
			while((charval=fr.read())!=-1){
				System.out.print((char)charval);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		
		
	}

}
