import java.util.*;
public class alpha57Set1 {







    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
/* 
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
 */
    
        /* System.out.println(set);
        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());

        set.remove(2);

        if(set.contains(2)) {
            System.out.println("set contains 2");
        } */
       
        
        //Iterator interface

         HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("kolkata");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);


        /* Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        } */

        /* for(String city : cities){
            System.out.println(city);
        } */


        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("kolkata");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Kolkata");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts);
    }


    
}
