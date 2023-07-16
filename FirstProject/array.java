import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	      
	      int T=input.nextInt();
	      
	      while(T-->0) {
	        
	        int N=input.nextInt();
	        
	        int array[] = new int[N];
	        
	        for(int i=0; i<N; i++) {
	          array[i]=input.nextInt();
	        }
	        
	        for(int j=0; j<N; j++) {          
	          System.out.print(array[j]+" ");
	        }

	      }
	}

}
