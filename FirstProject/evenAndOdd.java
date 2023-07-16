import java.util.Scanner;

public class evenAndOdd {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			int N=input.nextInt();
			
			int numbers[] = new int[N];
			 
			for(int i=0; i<N; i++ ) {
				numbers[i]=input.nextInt();
			}
			
			for(int e=0; e<N; e++) {
				if(numbers[e]%2==0)
					System.out.print(numbers[e]+" ");
			}
			System.out.println();
			
			for(int o=0; o<N; o++) {
				if(numbers[o]%2!=0)
					System.out.print(numbers[o]+" ");
			}
		}

	}

}
