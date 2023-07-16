package fileHandeling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\ibitw\\Desktop\\Java\\write.txt");
		FileReader fr=new FileReader(f);
		
		char [] ch = new char[(int)f.length()];
		fr.read(ch);
		for(char c:ch)
			System.out.print(c);
//		int ele = fr.read();
//		while(ele!=-1) {
//			System.out.print((char)ele);
//			ele=fr.read();
//		}
	}

}
