import java.util.Arrays;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {1,2,3};
//		System.out.print(arr);
		
		char array_variable [] = new char[10];
		 for (int i = 0; i < 10; ++i)
		 {
		 array_variable[i] = 'i';
//		 System.out.print(array_variable[i] + "");
		 }
		 
		 System.out.println(Arrays.toString(array_variable));
	}

}
