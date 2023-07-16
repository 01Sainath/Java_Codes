package fileHandeling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\ibitw\\Desktop\\java\\printWriter.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		int val = Integer.parseInt(br.readLine());
		double d = Double.parseDouble(br.readLine());
		String str = br.readLine();
		
		System.out.println(val+" "+d+" "+str);
		
		String str1 = br.readLine();
		String [] str2 = str1.trim().split(" ");
		
		int arr[]=new int[str2.length];
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(str2[i]);
			System.out.print(arr[i]+" ");
		}
		
	}

}
