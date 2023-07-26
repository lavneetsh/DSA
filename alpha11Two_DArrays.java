//2-D ARRAY

import java.util.Scanner;

public class alpha11Two_DArrays {



    //Search an element in an 2-D array

/* public static boolean Search(int matrix[][],int key){

    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            
           if( matrix[i][j]==key){
            System.out.println("element in the cell ("+i+","+j+")");
            return true;
           }
        }
    }
    System.out.println("ELEMENT NOT FOUND");
    return false;
    } */






    //find the largest and smallest element in an 2-D array

 /*    public static void largestSmallest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            
            for(int j=0;j<matrix[0].length;j++){

                if(matrix[i][j]>largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                }
                
               }
            }
             System.out.println("Largest Element is : "+largest);
             System.out.println("Smallest Element is : "+smallest);

        } */

    



//Spiral MATRIX question

/* public static void spiralMatrix(int matrix[][]){


    int startrow = 0;
    int endrow =matrix[0].length-1;
    int startcol = 0;
    int endcol =matrix[0].length-1;

    while(startrow<=endrow && startcol<=endcol){

    //top
    for(int i=startcol;i<=endcol;i++){
        System.out.print(matrix[startrow][i]+" ");

    }

    //right
    for(int j=startrow+1;j<=endrow;j++){
        System.out.print(matrix[j][endcol]+" ");

    }
    //bottom
    for(int i=endcol-1;i>=startcol;i--){
        System.out.print(matrix[endrow][i]+" ");

    }
    //left
    for(int j=endrow-1;j>=startrow+1;j--){
        System.out.print(matrix[j][startcol]+" ");

    }

    startrow++;
    startcol++;
    endrow--;
    endcol--;



    }


} */






// Diagonal sum

/* public static void diagonalSum(int matrix[][]){
    int sumsd = 0;
    int sumpd = 0;
    for(int i =0;i<matrix.length;i++){
          sumpd +=  matrix[i][i];
          
          if(i!=matrix.length-i-1){
            sumsd+= matrix[i][matrix.length-i-1];
          }


    }
    System.out.println("sum of primary diagonal : "+sumpd);
    System.out.println("sum of secondary diagonal : "+sumsd);
}
 */

  




 //SEARCH element in a sorted matrix

/*  public static boolean staircaseSearch(int matrix[][],int key){
          int i =0;

    int col = matrix[0].length-1;
    while(i<matrix.length && col>=0 ){
        if(key == matrix[i][col]){
            System.out.println("key found at ( "+i+","+col+" )");
            return true;
        }
        else if(key<matrix[i][col]){
            col--;
        }
        else if(key>matrix[i][col]){
            i++;
        }
    }
    System.out.println("key not present in the matrix");
    return false;
 } */






 //By using the other special cell

/*  int row = matrix.length-1;
 int col = 0;
  
 while(row>=0 && col<=matrix[0].length-1 ){
    if(key == matrix[row][col]){
        System.out.println("key found at ( "+row+","+col+" )");
        return true;
    }
    else if(key<matrix[row][col]){
        row--;
    }
    else if(key>matrix[row][col]){
        col++;
    }
}
System.out.println("key not present in the matrix");
return false;
} */
 




    public static void main(String[] args) {
       // int matrix[][] = new int[3][3];
       //Scanner sc = new Scanner(System.in);




        
        //input for 2-D array

   /*  System.out.println("enter the elements");
        for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            
            matrix[i][j] = sc.nextInt();
        }
    }
    */



        //Output for 2-D array

    /*   for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
  
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();

    } */
       
    
    //Search(matrix, 8);
    //largestSmallest(matrix);



  /*   int matrix[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}}; */

                       int matrix[][] = {{1,2,3},
                                         {4,5,6},
                                         {7,8,9}};

     //spiralMatrix(matrix);  
     //iagonalSum( matrix);
     int key = 8;  
     System.out.println(staircaseSearch(matrix, key));
        
    }
}
