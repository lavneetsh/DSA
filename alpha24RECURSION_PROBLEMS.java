//RECURSION problems



 class aplha24 {




   //question-1 - (Print numbers from n to 1 in dereasing order)

   /* public static void printDecreasing(int n){
    if(n==1){
        System.out.println(1);
        return;

    } 
    System.out.print(n+" ");
    printDecreasing(n-1);

   }
 */





 //question-2  - (Print numbers increasing order)

/*  public static void printInc(int n){
  if(n==1){
    System.out.print(n+" ");
    return;
  }
    printInc(n-1);
    System.out.print(n+" ");
 } */





 //QUESTION-3 - (Print factorial of a number n)

 /* public static int fact(int n){
    if(n==0){
        return 1;
    }
    int fnm1 = fact(n-1);
    int fn = n*fact(n-1);
    return fn;
 } */





 //question-4  - (Print sum of first n Natural numbers)

/*  public static int calSum(int n){

    if(n == 1){
        return 1;
    }
   int sum_nm1 = calSum(n-1);
   int  sum_n = n+calSum(n-1);
    return sum_n; 
 } */
 




 //question-5 - (Print Nth fibbonachi number)

 /* public static int fib(int n){

    if(n==0||n==1){
        return n;
    }
    int fnm1 = fib(n-1);
    int fnm2 = fib(n-2);
    int fn = fnm1+fnm2;
    return fn;
 } */




 //QUESTION-6 - (Check if given array is sorted or not)

/*  public static boolean isSorted(int arr[],int i){
    if(i==arr.length-1){
        return true;
    }
    if(arr[i]>arr[i+1]){
        return false;
    }

    return isSorted(arr, i+1);
 } */






 //QUESTION-7 - (fuction to find the first occurence of a number in array)

/*public static int firstOccurence(int arr[],int key,int i){

    if(i == arr.length){
        return -1;
    }
    if(arr[i]==key){
        return i;
    }
    return firstOccurence(arr, key, i+1);
 } */






//question-8 - (fn to find last occurence of a element in an array)

/* public static int lasttOccurence(int arr[],int key,int i){
    if(i == arr.length){
        return -1;
    }
    int isFound = lasttOccurence(arr, key, i+1);

    if(arr[i]==key && isFound==-1){
        return i;
    }
     return isFound;

} */





//question-9 - (Print x^n)

/* public static int power(int x,int n){
    if(n==0){
        return 1;
    }
    int xnm1 = power(x,n-1);
    int xn = x*xnm1;
    return xn; 
} */




//QUESTION-10 - (OPTIMISED x^n)

/* 
public static int optimizedPower(int a, int n){
    if(n==0){
        return 1;
    }
    int halfpower= optimizedPower(a, n/2);
    int halfPowerSq = halfpower*halfpower;

    if(n%2!=0){
        halfPowerSq = a* halfPowerSq;
    }
    return halfPowerSq;
} 
*/


//Tiling  problem - (Given a 2Xn Board...)

/* public static int tilingProblem(int n){

    if(n==0||n==1){
        return 1;
    }
    //vertical
    int fnm1 = tilingProblem(n-1);
    //horizontal
    int fnm2 = tilingProblem(n-2);

    int totWays = fnm1+fnm2;
    return totWays;
} */




    public static void main(String[] args) {
        int n =5;
        //printDecreasing(n);
      //    printInc(n);
       //System.out.println(fact(n));
      // System.out.println(calSum(n));
      //System.out.println(fib(8));
      //int arr[] = {1,2,3,4,5,8,5,7};
      //System.out.println(isSorted(arr, 0));
      //System.out.println(firstOccurence(arr, 5, 0));
      //System.out.println(lasttOccurence(arr, 5, 0));
      //System.out.println(power(2, 10));
      //System.out.println(optimizedPower(2, 5));
      //System.out.println(tilingProblem(4));
        
    }
    
}
