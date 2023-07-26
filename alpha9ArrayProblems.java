import java.util.*;
public class alpha9ArrayProblems {


    //MAXSUBARRAY using PRIFIX SUM technique
 /*    public static void maxSubarray(int numbers[]){    //O(n^2)
         int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
         prefix[0]= numbers[0];


        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+numbers[i]; 
             
        }
        for(int i=0;i<numbers.length;i++){  
            int start = i;
           for(int j=i;j<numbers.length;j++){
            int end = j;

            currSum = start ==0?prefix[end]:prefix[end]-prefix[start-1];     
            
            if(currSum>maxsum){
               maxsum=currSum; 
            }       
        } 
    }
    System.out.println("maximum = "+maxsum);
    }  */
    
    

  //MAXSUBARRAY using KADANE's ALGORITHM (if -ve number comes change it to zero for better undestanding)

   // (EASIEST ONE AMONG ALL WE HAVE DISCUSSED)
 /*  public static void kadans(int numbers[]){      //O(n)
    int ms = Integer.MIN_VALUE;
    int cs =0;

    for(int i=0;i<numbers.length;i++){
        cs = cs+numbers[i];
        if(cs<0){
            cs =0;
        }
        ms = Math.max(cs,ms);
     
    }
    System.out.println("maximum = "+ms);
  }
   */
    
    
    

//Trapping RAINWATER PROBLEM

/* public static void trapwattering(int height[]){
   
    int n = height.length;
    
    int leftmax[] = new int[n];
     leftmax[0]= height[0];
    for (int i = 1; i < n; i++) {
          leftmax[i] += Math.max(height[i],leftmax[i-1]);
    }


    int rightmax[] = new int[n];
     rightmax[n-1]= height[n-1];
        for (int i = n-2; i>=0 ; i--) {   
        rightmax[i] += Math.max(height[i],rightmax[i+1]);
        }


        int trappedwater = 0;
           for (int i=0;i<n;i++) {
            int waterlevel =  Math.min(leftmax[i], rightmax[i]);


            trappedwater += waterlevel-height[i]; 
           }
        System.out.println("water quantity will be : "+trappedwater);
        
     }
 */





//BUY and SELL Stocks

/* public static int buyAndSellStocks(int prices[]){
    int buyprice = Integer.MAX_VALUE;
    int maxprofit = 0;

    for(int i=0;i<prices.length;i++){
        if(prices[i]>buyprice){

        int profit = prices[i] - buyprice;
        maxprofit = Math.max(maxprofit, profit);
        }
        else{
            buyprice = prices[i];
        }
    }
    return maxprofit;
}
 */


//ASSIGNMENT QUESTIONS-->ARRAYS

//question--1
/* public static boolean checkTwice(int nums[]){

    for(int i=0;i<nums.length;i++){
        for(int j =i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                return true;
                
            }
        }
    }
    return false;
}  */
 



//QUESTION-->5
/* public static void question5(int nums[]){
    int i=0;
     for(int j=i+1;j<nums.length;j++){
    for(int k=j+1;k<nums.length;k++){
        if(nums[i]+nums[j]+nums[k]==0){
            System.out.println("numbers are"+nums[i]+","+nums[j]+","+nums[k]);
        }  
        }
    }}
     */

    
    public static void main(String[] args) {

       // int numbers[]= {4,2,0,6,3,2,5};
        //int prices[] = {7,1,5,3,6,4};
       // int nums[] = {1,1,1,3,3,4,3,2,4,2};
        int nums[] = {-1,0,1,2,-1,-4};

        
        //maxSubarray( numbers);
        //kadans(numbers);
        //trapwattering(numbers);
        //System.out.println(buyAndSellStocks(prices));
       // System.out.println(checkTwice(nums));
       question5(nums);
    }
}
