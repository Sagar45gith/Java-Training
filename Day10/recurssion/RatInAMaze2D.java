public class RatInAMaze2D{
    static int n =5;
    static boolean isSafe(int[][] maze, int x, int y){
        if(x>=0 && x<n && y>=0 && y<n && maze[x][y]==1){
            return true;
        }
        return false;
    }
    static boolean solveMaze(int[][] maze,int x, int y, int[][] result){
        if(x==n-1 && y==n-1 && maze[x][y]==1){
            result[x][y]=1;
            return true;
        }
        if(isSafe(maze,x,y)){
            result[x][y]=1;
            //forward
            if(solveMaze(maze,x,y+1,result)){
                return true;
            }
            //downward
            if(solveMaze(maze,x+1,y,result)){
                return true;
            }
            //backtrack
            result[x][y]=0;
            return false;
        }
        return false;
    }
    public static void main(String[] args){
        int maze[][]={{1,1,0,1,0},{0,1,1,1,0},{0,1,0,0,0},{0,1,1,1,1},{0,0,0,0,1}};
        int result[][] = new int[n][n];
        if(solveMaze(maze,0,0,result)){
            for(int i =0;i<n;i++){
                for(int j =0;j<n;j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

