package fileHandeling;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\ibitw\\Desktop\\Java\\test.txt");
		BufferedWriter bw = new BufferedWriter(fw); 
		
		bw.write('S');
		bw.write(97);
		char [] ch = {'i','n','a','t','h'};
		bw.write(ch);
		bw.newLine();
		bw.write("I will be a good programmer");
		bw.newLine();
		bw.flush();
		bw.close();
	}

}
