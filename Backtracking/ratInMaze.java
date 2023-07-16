import java.util.Scanner;

public class ratInMaze {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int maze[][] = new int[n][n];
        int result[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                maze[i][j] = input.nextInt();
            }
        }

        if(!mazeRunner(maze, result, 0, 0, n))
            System.out.println("Path does not exist...");
        else{
            // result[n-1][n-1]=1;
            System.out.println();
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }
        
    }

    private static boolean mazeRunner(int[][] maze, int[][] result
    , int x, int y, int n){
        
        if(x==n-1 && y==n-1){
            result[x][y] = 1;
            return true;
        }
            // return true;
        
        if(isValid(maze, x, y, n))
            result[x][y] = 1;
        else
            return false;

        if(mazeRunner(maze, result, x, y+1, n))
            return true;
        else if(mazeRunner(maze, result, x+1, y, n))
            return true;
        result[x][y]=0;
        return false;
    }

    private static boolean isValid(int maze[][], int x, int y, int n){
        if(x>=0 && y>=0 && x<n && y<n && maze[x][y]==1)
            return true;
        return false;
    }
}
