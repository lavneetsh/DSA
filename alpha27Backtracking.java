//Backtracking in array

public class alpha27Backtracking{
 //FUCTION TO PRINT ARRAY

 /*    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    */



    //BACKTRACKING IN ARRAY

   /*   public static void changeArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    } */





    //Find ALL POSSIBLE SUBSETS of String using Backtracking

   /*   public static void findSubsets(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }
            System.out.println(ans);
            return;
        }
        //recursion

         //yes choice
         findSubsets(str, ans+str.charAt(i), i+1);
 
         //No choice
         findSubsets(str, ans, i+1);
    } 
    */




    // FIND & PRINT ALL PERMUTATION OF A STRING

 /*   public static void findPermutation(String str,String ans){
        //base case

        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion - O(n*n!)

        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            //remove char

            String NewStr = str.substring(0, i)+str.substring(i+1);

            findPermutation(NewStr, ans+curr);
        }
    } */




    

    //N-QUEENS problem

/* public static void nQueens(char board[][], int row){

    
    //base case
    if(row == board.length){
        printBoard(board);
        count++;
        return;

    }
    
    
    //coulmn loop
    for(int j=0;j<board.length;j++){
        if(isSafe(board,row,j)){

        
        board[row][j] = 'Q';
        nQueens(board, row+1);    //function call
        board[row][j] = 'x';    //backtracking step
        }
        
    }
}


public static void printBoard(char board[][]){
    System.out.println("-------chess Board---------");
    
    for(int i=0;i<board.length;i++){
       for(int j=0;j<board.length;j++){
        System.out.print(board[i][j]+" ");
       }
       System.out.println();
    }
}
static int count = 0;


public static boolean isSafe(char board[][],int row,int col){
    //vertical up
    for(int i=row-1;i>=0;i--)
    if(board[i][col]=='Q'){
        return false;
    }

    //diagonal left up
    for(int i=row-1,j=col-1;i>=0 &&j>0;i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
    }


    //diagonal right up
    for(int i=row-1,j=col+1;i>=0 && j<board.length; i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
}
 */





    public static void main(String[] args) {

        /* int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr); */
        
        /* String str = "abc";
        findSubsets(str, "", 0);
        */
        //findPermutation("abc","");

        int n =4;
        char board[][] = new char[n][n];
        
        //initialize
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            
            }
        }
        nQueens(board, 0);
        System.out.println("Total ways to solve nQuenns : "+count);  
    }
}