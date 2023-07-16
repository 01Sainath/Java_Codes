package fileHandeling;

import java.io.File;
import java.io.IOException;

public class constructorsAndMethods {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\ibitw\\Desktop\\Java");
		
		File f2 = new File("C:\\Users\\ibitw\\Desktop\\Java\\test","fuck.txt");
		
		f2.createNewFile();
		String str[]=f.list();
		for(String ele:str) { 
			File f1=new File(f,ele);
			if(f1.isFile()) {
				System.out.println(ele);
				System.out.println(f1.length());
			}
		}
		
		File f3 =new File("C:\\Users\\ibitw\\Desktop\\Java\\test\\fuck.txt");
		f3.delete();
	}

}
