package recursion.Maze;

public class mazeObstacle {
    static void main() {
        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        obstace("",0,0,maze);

    }
    static void obstace(String processed,int row,int col,boolean[][] maze){
        if (row== maze.length-1 && col== maze[0].length-1){
            System.out.println(processed);
            return;
        }
        if (row>=maze.length || col>=maze[0].length){
            return;
        }
        if (!maze[row][col]){
            return;
        }
        obstace(processed+"D",row+1,col,maze);
        obstace(processed+"R", row, col+1, maze);
    }
}
