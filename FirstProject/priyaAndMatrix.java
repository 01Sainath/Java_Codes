import java.util.Scanner;

public class priyaAndMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int N= input.nextInt();
		
		if(N==1)
			System.out.println(1);
		else
			System.out.println(N*(N-1));
		
	}

}
