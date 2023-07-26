import java.util.*;
public class alpha29ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        //Operations

        //add Element
        list.add(1);  //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(5);

        //OR
        list.add(1, 9);    //O(n)

        //get Element
        int element = list.get(2);  //O(1)
        System.out.println(element);

        //remove/Delete Element 
        list.remove(2);
        System.out.println(list);

         //Set element At Index
         list.set(2, 10);
         System.out.println(list);

         //Contains Element
         System.out.println(list.contains(5));
         System.out.println(list.contains(11));

         //size of ArrayLIST
         System.out.println(list.size());

         //print an ARRAYLIST
         for(int i=0;i<list.size();i++){
           System.out.print(list.get(i)+" ");  
         }

    




    }
    
}
