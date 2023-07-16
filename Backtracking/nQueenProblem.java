import java.util.Scanner;

public class nQueenProblem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int board[][] = new int[n][n];

        if(!nQueens(board, n, 0)){
            System.out.println("Solution does not exist...");
        }
        else{
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    private static boolean nQueens(int[][] board, int n, int col) {
        if(col>=n)
            return true;
        for(int i=0; i<n; i++){
            if(isValid(board, n, i, col)){
                board[i][col] = 1;
                if(nQueens(board, n,  col+1))
                    return true;
                board[i][col] = 0;
            }
        }
        return false;
    }

    private static boolean isValid(int[][] board, int n, int r, int c){

        // same row attack...
        for(int i=0; i<c; i++){
            if(board[r][i]==1)
                return false;
        }

        // upper left diagonal attack...
        for(int i=r,j=c; i>=0 && j>=0; i--,j--){
            if(board[i][j]==1)
                return false;
        }

        // lower diagonal attack...
       
        int row=r+1,col=c-1;
        while(row<n && col>=0){
            if(board[row][col]==1){
                return false;
            }
            row++;col--;
        }

        return true;
    }
}
 