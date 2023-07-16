import java.util.*;

public class minimumHouseNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int T= input.nextInt();
		while(T-->0) {
			
			int N=input.nextInt();
			
			int array[] = new int[N];
			
			for(int i=0; i<N; i++) {
				array[i]=input.nextInt();
			}
			
			int copy[] = Arrays.copyOf(array,array.length);
			
			Arrays.sort(copy);
			
			for(int i=0; i<N; i++) {
				if(copy[0]==array[i])
					System.out.println(i);
			}
			
			
		}

	}

}
