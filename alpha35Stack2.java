//Stack implementation using Java Collection Framework
import java.util.*;

import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
public class alpha35Stack2 {


    //Question1- Push at the bottom of stack (using Recursion)

   /*  public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    */



    //Reverse a String using a Stack

     /* public static String reverseString(String str){
        
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        if(idx == 0){
            return "no elemnt";
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
              result.append(curr); 
        }
        return result.toString();
        
    }
 */



    //Reverse a Stack(using recursion)

  /*  public static void reverseStack(Stack<Integer> s){
   if(s.isEmpty()){
          return;
   }
 
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);

        }
    
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
           System.out.println(s.pop());
        }
    } */





    //Stock Span PRoblem

   /*  public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice>stocks[s.peek()]){
                s.pop();

            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    } */







    //Check the valid string or not

    /*  public static boolean isValid(String str){
           Stack<Character> s = new Stack<>();
           for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            //opening
            if(ch =='('||ch =='{'||ch =='['){
                s.push(ch);
            }
       
            else{ //closing

                if(s.isEmpty()){
                    return false;
                }
            
           
               else if(ch==')' && s.peek()=='('||ch =='}'&& s.peek()=='{'||ch==']'&& s.peek()=='['){
                
                    s.pop();
                    
                }
                else{
                    return false;
                }
            }
        }
        
        if(s.isEmpty()){
            return true;
        }
        return false;

    } */

           

    //DUPLICATE PARANTHESIS CHECK

    /* public static boolean isDuplicate(String str){

        Stack<Character> s = new Stack<>();

        int count =0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //opening,oprand,oprator;
             if(ch !=')'&&ch !='}'&&ch !=']'){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    System.out.println("Not a valid paranthesis");
                    return false;
                }
                 count = 0;
                while(ch==')' && s.peek()!='('||ch =='}'&& s.peek()!='{'||ch==']'&& s.peek()!='['){
                    System.out.println("popping : "+s.pop());
                    count++;

                }

                if(count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
        }
        return false;
    } */



    //Maximum Area in Histogram

//(MY try to this question)
public static int maxArea(int[] height){


    int maxArea = Integer.MIN_VALUE;
    int area ;
   
   for(int i=0;i<height.length-1;i++){
      int minLength = height[i];
    for(int j=i+1;j<height.length;j++){
        if(height[j]<minLength){
            minLength = height[j];
        }
        area = minLength*((j+1)-i);
        maxArea = Math.max(maxArea,area);
    }
}
    return maxArea;
    
 }


 //APLHA Stack approach
 public static void maxAreaa(int arr[]){
    int maxArea = 0;
    int nsr[] = new int[arr.length];
    int nsl[] = new int[arr.length];
   


    //Next smaller right
    Stack<Integer> s = new Stack<>();

    for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){

            s.pop();
        }
        if(s.isEmpty()){
            nsr[i] = arr.length;
        }
        else{
            nsr[i] = s.peek();
        }
        s.push(i);
    }

     //Next smaller Left
           s = new Stack<>();

    for(int i=0;i<arr.length;i++){
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]){

            s.pop();
        }
        if(s.isEmpty()){
            nsl[i] = -1;
        }
        else{
            nsl[i] = s.peek();
        }
        s.push(i);
    }


    //current Area : width = j-i-1 = nsr[i]-nsl[j]-1

    for(int i =0;i<arr.length;i++){
        int height = arr[i];
        int width = nsr[i]-nsl[i]-1;
        int currArea = height*width;
        maxArea = Math.max(currArea,maxArea);
        }
        System.out.println("max area in histogram = "+maxArea);

 }







    public static void main(String[] args) {
        

        /*Stack<Integer> s = new Stack<>();
           s.push(1);
        s.push(2);
        s.push(3); */

       

        //pushAtBottom(s,4);


       /*  while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        } */

       //System.out.println( reverseString(""));
 

/* 
        reverseStack(s);
        printStack(s); */

        /* int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockSpan(stocks,span);

        for(int i =0;i<span.length;i++){
            System.out.println(span[i]+" ");
        } */






   //(Ques)-NEXT greater in right-->
   
       /*  int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
       int nextGreater[] = new int[arr.length];


       for(int i=arr.length-1;i>=0;i--){
        //step-1
       
        while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
            s.pop();
        }

        //step-2 if-else 
        if(s.isEmpty()){
            nextGreater[i] = -1;
        }else {
            nextGreater[i] = arr[s.peek()];
                                                         
        }                                         

        //step-3 push
        s.push(i);
        System.out.println("peek element is at index "+s.peek());
       }
       for(int i =0;i<nextGreater.length;i++){
        System.out.print(nextGreater[i] +" ");
       }
       System.out.println(); */
       
      //Paranthesis check
      
      String str = "[{((a+b)*c)}";
      //System.out.println(isValid(str));

     // System.out.println(isDuplicate(str));
     /* int height[] = {2,1,5,6,2,3};
     System.out.println("my approach: "+maxArea(height)); 
      maxAreaa(height); */





    }
    
}
