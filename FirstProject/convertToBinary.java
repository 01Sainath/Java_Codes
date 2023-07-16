import java.util.Scanner;

public class convertToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		while(T-->0) {
			int N = input.nextInt();
			int zeros=0;
			int ones=0;
			
			StringBuilder str = new StringBuilder();
			
			while(N!=0) {
				str.append(N%2);
				if(N%2==0)
					zeros++;
				if(N%2==1)
					ones++;
				N=N/2;
			}
			System.out.println(str.reverse());
			
			System.out.println("ones:"+ones+" zeros:"+zeros);
			
		}
		
	}

}
