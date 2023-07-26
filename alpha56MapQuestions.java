import java.util.HashMap;
import java.util.*;

public class alpha56MapQuestions {


    //Majority element problem -1

    public static void majorityElement(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
             /* int num = nums[i];
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }
            else{
                hm.put(num,1);
            } */
                  //OR

            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);     

        }

           //Set<Integer> keyset = map.keySet();

         for(Integer key : map.keySet()){

            if(map.get(key)>nums.length/3){
                System.out.println(key);
            }
        }

    }

    //Valid Anagrams pronblem -2

    public static boolean isAnagram(String s, String t){ 
        if(s.length() != t.length()){
            return false;
        }
    Map<Character,Integer > map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                map.put(ch,map.get(ch)-1);
                }
            }
            else{ 
                return false; 
               }
        }

       

        return map.isEmpty();
 

    }





    public static void main(String[] args) {


        /* int[] nums = {1,3,2,5,1,3,1,5,1};

        majorityElement(nums); */

        String s= "race";
        String t = "care";
       System.out.println( isAnagram(s, t));  //O(n)


        


        
    }
    
}
