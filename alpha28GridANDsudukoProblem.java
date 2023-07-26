public class alpha28GridANDsudukoProblem{
   
   
    //no of possible ways to reach to the destinamtion cell when you can move only right and down (GRID WAYS)

   /*  public static int gridWays(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==n){
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);

        return w1+ w2;
    } */




    // FUNCTION TO COMPLETE A SUDUKO

/* public static boolean isSafe(int sudoku[][],int row,int col,int digit){
    //check row

    for(int i=0;i<9;i++){
        if(sudoku[row][i] == digit)
        return false;
    }

    //check column
    for(int j=0;j<9;j++){
        if(sudoku[j][col] == digit)
        return false;
    }

    //check grid

    int strow = (row/3)*3;
    int stcol = (col/3)*3;
    for(int i = strow;i<strow+3;i++){
        for(int j = stcol;j<stcol+3;j++){
            if(sudoku[i][j]==digit){
                return false;
            }
        }
    }
    return true;
}



    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }



public static boolean sudokuSolver(int sudoku[][],int row,int col){
 
 //base case
    if(row == 9 ){
    return true;
  }

    //recursion
    int nextRow = row;int nextCol = col+1;

    if(col+1 == 9){
        nextCol = 0;
        nextRow = row +1;
    }

    if(sudoku[row][col] !=0){
       return sudokuSolver(sudoku, nextRow, nextCol);
    }
    for(int digit =1;digit<=9;digit++){
        if(isSafe(sudoku,row,col,digit)){
            sudoku[row][col] = digit;

            if(sudokuSolver(sudoku, nextRow, nextCol)){ //sol exist
                return true;   
            }  
             sudoku[row][col] = 0;
                
        }
    }
    return false;
} */


     

    public static void main(String[] args) {
        //int n=3,m=3; 
       // System.out.println(gridWays(0,0,n,m));
       
       int sudoko[][] = {{0,0,8,0,0,0,0,0,0},
       {4,9,0,1,5,7,0,0,2},
       {0,0,3,0,0,4,1,9,0},
       {1,8,5,0,6,0,0,2,0},
       {0,0,0,0,2,0,0,6,0},
       {9,6,0,4,0,5,3,0,0},
       {0,3,0,0,7,2,0,0,4},
       {0,4,9,0,3,0,0,5,7},
       {8,2,7,0,0,9,0,1,3}};

       if(sudokuSolver(sudoko, 0, 0)){
        System.out.println("solution possible");
        printSudoku(sudoko);
       }
       else{
        System.out.println("solution doesn't exist");
       }



    }
}