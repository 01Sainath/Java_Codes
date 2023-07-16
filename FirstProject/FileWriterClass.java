import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\ibitw\\Desktop\\Java\\write.txt");
		fw.write("Name: \n");
		fw.write(83);
		fw.write('a');
		char [] ch= {'i','n','a','t','h'};
		fw.write(ch);
		fw.write("\n");
		char [] ch1= {'I','b','i','t','w','a','r'};
		fw.write(ch1);
		fw.flush();
		fw.close();
	}

}
