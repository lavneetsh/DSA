//Sorting Algorithm

public class alpha10SortingBasicAlgo {
    
 //BUBBLE SORT ALGORITHM
  /* public static void bubbleSort(int arr[]){
    for(int turn = 0;turn<arr.length-1;turn++){
        for(int j=0;j<arr.length-2-turn;j++){
          if(arr[j]>arr[j+1]){
            int temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;
          }
        }
    }
    for(int i=0;i<arr.length;i++)
    {
    System.out.print(arr[i]+" ");
    } } */




  //SELECTION SORT ALGORITHM
  /* public static void selectionSort(int arr[]){
      for(int i=0;i<arr.length-1;i++){
        int minpos = i;
      for(int j=i+1;j <arr.length;j++){
        if(arr[j]<arr[minpos]){
            minpos = j; 
        }
      }
      int temp = arr[minpos];
      arr[minpos] = arr[i];
      arr[i] = temp;

    }
    for(int i=0;i<arr.length;i++)
    {
    System.out.print(arr[i]+" ");
    }
  } */



  //Inserton sort
  /* public static void insertionSort(int num[]){

     for(int i=1;i<num.length;i++){
        int curr = num[i];
        int prev = i-1;

        //finding correct position to insert 

        while(prev>=0 && num[prev]>curr){
            num[prev+1]=num[prev];
            prev--;
        }
        //insertion
        num[prev+1]=curr;
        }
        for(int i=0;i<num.length;i++){
           System.out.print(num[i]+" ");
     }
  } */


   // Counting Sort
          
   public static void couningSort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int  )
   }


    
    public static void main(String[] args){
        int arr[] = {2,6,4,3,1,9,8,6,3,8};
        //bubbleSort(arr);
        //selectionSort(arr);
        insertionSort(arr);


 
        

    }
}
