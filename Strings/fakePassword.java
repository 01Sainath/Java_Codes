import java.util.Scanner;

public class fakePassword {
	public static void reversal(int a,int b, char arr[]) {
		for(int i = a; i<b; i++) {
			char temp = arr[i];
			arr[i] = arr[b];
			arr[b] = temp;
			b--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int T=input.nextInt();
		while(T-->0) {
			String O=input.next();
			String F=input.next();
			
			char chR[]=F.toCharArray();
			
			reversal(chR.length-2, chR.length-1, chR);
			reversal(0,chR.length-2-1,chR);
			reversal(0,chR.length-1,chR);
			
			char chL[]=F.toCharArray();
			
			reversal(0,1,chL);
			reversal(2,chL.length-1,chL);
			reversal(0,chL.length-1,chL);
			
			String fakeL=new String(chL);
			String fakeR=new String(chR);
			
			if(O.equals(fakeL) || O.equals(fakeR))
				System.out.println("Yes");
			else
				System.out.println("No");
			
		}
	}

}
