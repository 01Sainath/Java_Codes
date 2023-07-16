package fileHandeling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\\\Users\\\\ibitw\\\\Desktop\\\\Java\\\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		while(line != null){
			System.out.println(line);
			line=br.readLine();
		}
		
	}

}
