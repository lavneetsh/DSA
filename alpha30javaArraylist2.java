//import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class alpha30javaArraylist2 {
    
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2)); 
        list.set(idx2, temp);
    }



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);  //O(1)
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        //System.out.println(list);
        
        //Sorting an arrayList
         //Ascemding order
        Collections.sort(list);
        System.out.println(list);  

        //Decending order

        Collections.sort(list,Collections.reverseOrder()); 
        System.out.println(list);

        //Swap two elements
        int idx1 = 1;
        int idx2 = 3;
        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.print(list);

        //Find Maximum element of Arraylist

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){

            max = Math.max(max,list.get(i));
            /* if(max<list.get(i)){
                max = list.get(i);
            } */
        }
        System.out.println("max element = "+max);







        //print Reverse of Arraylist - O(N)

        for(int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        

    }
}
