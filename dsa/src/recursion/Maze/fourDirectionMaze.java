package recursion.Maze;

public class fourDirectionMaze {
    static void main() {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        allDirection("",0,0,maze);
    }
    static void allDirection(String processed,int row,int col,boolean[][] maze){
        if (row== maze.length-1 && col== maze[0].length-1){
            System.out.println(processed);
            return;
        }
        if (row<0 || row>=maze.length || col>=maze[0].length || col<0){
            return;
        }
        if (!maze[row][col]){
            return;
        }
        maze[row][col]=false;
        allDirection(processed+"Down ",row+1,col,maze);
        allDirection(processed+"Right ", row, col+1, maze);
        allDirection(processed+"Up ",row-1,col,maze);
        allDirection(processed+"Left ", row, col-1, maze);
        maze[row][col]=true;
    }
}
