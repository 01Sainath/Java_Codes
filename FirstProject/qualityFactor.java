import java.util.Scanner;

public class qualityFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int N =input.nextInt();
		
		long  P[] = new long [N];
		
		for(int i=0; i<N; i++) {
			P[i] = input.nextInt();
		}
		long a = P[0];
		if(a<0)
			a = a*(-1);
		long counter = a;
		
		for(int i=0; i<N-1; i++) {
			if(P[i]<P[i+1])
				counter += P[i+1]-P[i];
			else
				counter += P[i]-P[i+1];
		}
		
		System.out.println(counter);
	}

}
