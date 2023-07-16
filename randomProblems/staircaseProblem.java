package randomProblems;

import java.util.Scanner;

public class staircaseProblem {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int stairs = 1;
        int spaces = n-1;

        for(int i=0; i<n; i++){
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            spaces--;
            for(int k=0; k<stairs; k++){
                System.out.print("#");
            }
            stairs++;
            System.out.println();
        }
    }
}
