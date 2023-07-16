import java.util.Scanner;

public class secondSmallest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int X,Y,Z;
		
		X=input.nextInt();
		Y=input.nextInt();
		Z=input.nextInt();
		
		int min,max;
		
		min=X;
		if(Y<min)
			min=Y;
		if(Z<min)
			min=Z;
		
		max=X;
		if(Y>max)
			max=Y;
		if(Z>max)
			max=Z;
		
		if(X!=min && X!=max)
			System.out.println(X);
		else if(Y!=min && Y!=max)
			System.out.println(Y);
		else 
			System.out.println(Z);

			
		

	}

}
