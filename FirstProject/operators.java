import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X,Y;
		
		X=sc.nextInt();
		Y=sc.nextInt();
		
		if(X<Y)
			System.out.println(X+" is smaller than "+Y);
		else if(X>Y)
			System.out.println(X+" is greater than "+Y);
		else
			System.out.println(X+" is equal to "+Y);

	}

}
