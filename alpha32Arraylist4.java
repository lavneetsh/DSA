
import java.util.*;
public class alpha32Arraylist4 {

    /* public static int storeWater(ArrayList<Integer> height){
        int maxWater =0;
        //bruteforce - O(N^2)
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i),height.get(j));
                int width = j-1;
                int currWater = width*ht;
                maxWater = Math.max(maxWater,currWater);

            }
        }
       
        return maxWater;
    } */

    //TwO POINTER APPROACH
/* 
 public static int storeWater(ArrayList<Integer> height){
    int maxWater = 0;
    int lp = 0;
    int rp = height.size()-1;

    while(lp<rp){
        //calculater water area
        int ht = Math.min(height.get(lp),height.get(rp));
        int width = rp-lp;
        int currWater = ht*width;
        maxWater = Math.max(maxWater,currWater);

        //update ptr

        if(height.get(lp)<height.get(rp)){
            lp++;
        } else{
            rp--;
        }
    
        }
        return maxWater;
    } */
 




    //PROBLEM--pair Sum-1
    public static boolean PairSum(ArrayList<Integer> list,int target)
    {

        int lp  = 0;
        int rp = list.size()-1;
        while(lp!=rp){
        //case1
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }
        //case 2
        if(list.get(lp)+list.get(rp)<target){
            lp++;
        } else{
            rp--;
        }
    }
    return false;
    }



    
//PROBLEM-PAIR SUM-2

public static boolean pairSum(ArrayList<Integer> list,int target){
    int n = list.size();
    int bp = -1;
    for(int i=0;i<list.size();i++){
        if(list.get(i)>list.get(i+1)){
        bp = i;
        break;
    }}

          int lp = bp+1;//smallest
          int rp = bp;//largest

         while(lp!=rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case2
            if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%n;
            }
            //case3
            else{
                rp = (n+rp-1)%n;
            }
         }
       return false;

}

    public static void main(String[] args) {

       //ArrayList<Integer> height = new ArrayList<>();
       ArrayList<Integer> list = new ArrayList<>();
       /* height.add(1);
       height.add(8);
       height.add(6);
       height.add(2);
       height.add(5);
       height.add(4);
       height.add(8);
       height.add(3);
       height.add(7);
        System.out.println("Maximum water is: "+storeWater(height)); */
        
       /*  height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        System.out.println(PairSum(height, 9)); */

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
       System.out.println(pairSum(list, target));
    }

    
}
