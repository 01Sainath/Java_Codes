package fileHandeling;

import java.io.*;

public class creatingAFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\ibitw\\Desktop\\Java\\test");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
	}

}
