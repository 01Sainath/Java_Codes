import java.util.Scanner;

public class chessBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		int T=input.nextInt();
		
		while(T-->0){
		    
		    int n=input.nextInt();
		
		    int squares=0;
		
		    for(int i=n; i>0; i--){
		      squares+=(i*i);
		      i--;
		}
		System.out.println(squares);
		}
	}

}
