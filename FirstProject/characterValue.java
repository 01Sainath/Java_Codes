import java.util.Scanner;

public class characterValue {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);		
		String letter;
		
		letter=sc.next();
		
		switch(letter) {
		case "P":
			System.out.println("PrepBytes");
			break;
		case "p":
			System.out.println("PrepBytes");
			break;
		case "Z":
			System.out.println("Zenith");
			break;
		case "z":
			System.out.println("Zenith");
			break;
		case "E":
			System.out.println("Expert Coder");
			break;
		case "e":
			System.out.println("Expert Coder");
			break;
		case "D":
			System.out.println("Data Structure");
			break;
		case "d":
			System.out.println("Data Structure");
			break;
		default:
			System.out.println("unidentified text");
		}

	}

}
