import java.util.Scanner;

public class adityaAndDanish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T= input.nextInt();
		
		while(T-->0) {
			
			int N= input.nextInt();
			String S = input.next();
			char ch;
			int Aditya=0;
			int Danish=0;
			
			for(int i=0; i<N; i++) {
				ch = S.charAt(i);
				
				if(ch == 'A')
					Aditya++;
				if(ch == 'D')
					Danish++;
			}
			
			if(Aditya>Danish)
				System.out.println("Aditya");
			if(Aditya<Danish)
				System.out.println("Danish");
			if(Aditya==Danish)
				System.out.println("AdiDan");
			
		}
	}

}
