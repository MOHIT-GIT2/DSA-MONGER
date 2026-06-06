package recursion.Maze;

public class mazeCountPath {
    static void main() {
        //int paths=count(3,3);
        printPath("",3,3);
        //System.out.println(paths);
    }
    static int count(int row,int col){
        if (row==1 || col==1){
            return 1;
        }
        int left=count(row-1,col);
        int right=count(row,col-1);
        return left+right;
    }
    static void printPath(String processed,int row,int col){
        if (row<=0 || col<=0){
            return;
        }
        if (row==1 && col==1){
            System.out.println(processed);
            return;
        }
        printPath(processed+"D ",row-1,col);
        printPath(processed+"DIAGONAL ",row-1,col-1);
        printPath(processed+"R ",row,col-1);
    }
}
