package fileHandeling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class printWriter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("C:\\Users\\ibitw\\Desktop\\java\\printWriter.txt");
		
		pw.println(100);
		pw.println(100.10);
		pw.println("learning...");
		for(int i=0; i<5; i++) {
			pw.print(i+" ");
		}
		
		pw.flush();
		pw.close();
		
	}

}
