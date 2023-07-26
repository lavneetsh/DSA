//linear serch
import java.util.*;
public class alpha8Searching {

    //1 code to do linear search
    /* public static int linearSearch(int numbers[],int key){

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    } */
            





    //2largest and smallest number in an array
/*     public static int isLargest(int arr[]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest = arr[i];

        }
        if(smallest>arr[i]){

            smallest = arr[i];
        }

    }
    return largest; //can also use largest
}  
 */




//Binary SEARCH --> prerequisite is array shoud be in sorted condition

/* public static int BinarySearch(int numbers[],int key){
    int start =0;
    int end = numbers.length-1;
while(start<=end){
    int mid = (start+end)/2;

    //comparisons

if(numbers[mid] == key){
      return mid;
}
else if(numbers[mid]>key){
    end = mid-1;
    System.out.println("left");
}
else{
    start = mid+1;
    System.out.println("right");
}
}
return -1;
}
 */
 







 //reverse an array-->optimise approach to do this other than filling it in another array from end
/*  public static void reverseArray(int numbers[]){
    int first =0;
    int last = numbers.length-1;
    while(first<last){
        int temp= numbers[last];
        numbers[last] = numbers[first];
        numbers[first] = temp;
        first++;
        last--;
        
    }

 } */




//Pairs in ARRAY
/* public static void pairsPrint(int numbers[]){

    for(int i=0;i<numbers.length;i++){
        int curr = numbers[i];
        for(int j =i+1;j<numbers.length-1;j++){
            int next = numbers[j];
            System.out.print("("+curr+","+next+")");
        }
        System.out.println();
    }
} */






//printing SUBARRAY-->a continuous part of an array
  /* public static void printSubarray(int numbers[],int arr[]){
    int s=0;
    arr[0]=0;
    for(int i=0;i<numbers.length;i++){
       for(int j=i;j<numbers.length;j++){
        for(int k=i;k<=j;k++){
            System.out.print(numbers[k]+" ");
            arr[s]= arr[s]+numbers[k];
            
        }
        s++;
        System.out.println();
    } 
}
}  */
         


//MAXIMUM SUBARRAY SUM to find
/* public static void maxSubarray(int numbers[]){   //O(n^3)
    int maxsum = Integer.MIN_VALUE; 
    for(int i=0;i<numbers.length;i++){
       for(int j=i;j<numbers.length;j++){
        int curr = 0;
        for(int k=i;k<=j;k++){
           System.out.print(numbers[k]+" ");
            curr += numbers[k];    
        }
        System.out.println("sum is :"+curr);
        if(curr>maxsum){
           maxsum=curr; 
        }       
    } 
}
System.out.println("maximum = "+maxsum);
}  */


  




    public static void main(String[] args) {
       //int marks[]= {2,4,6,8,10,12,14,16};
       //int numbers[]= {2,4,6,8,10,12,14};
       //int numbers[]= {2,4,6,8,10};
       //int num[]= {1,-2,6,-1,3};
       //int arr[] = new int[15];
       // int key =10;
        //System.out.println(linearSearch(marks,key));
        //System.out.println(isLargest(marks));
      // System.out.print(BinarySearch(numbers,key)); 
      // reverseArray(numbers);
      //pairsPrint(numbers);

       /* for (int i=0;i< numbers.length;i++) {
        System.out.print(numbers[i]+" ");
       }
        System.out.println(); */



        /*  printSubarray(num,arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
           }
           System.out.println();
           System.out.println("largest element is :"+isLargest(arr));  */

           //maxSubarray(numbers);



    }
    
}
