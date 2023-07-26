//STRINGS IN JAVA

import java.util.Scanner;

public class alpha12Strings {

//to check if number is palindrome or not

   /*  public static boolean checkPalindrome(String str){

        for(int i =0;i<str.length()/2;i++){

            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                         return false;
            }
            
        }
        return true;
    } */






     //get the shortest distance;
     
    /*  public static float getShortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if( dir == 'N'){
                y++;
            }
            else if( dir == 'S'){
                y--;
            }
            else if( dir == 'W'){
                x--;
            }
            else{ 
                x++;             
            }
        }
        System.out.println(x);
        System.out.println(y);
         int x2 = x*x;
         int y2 = y*y;
        
        return (float)Math.sqrt(y2+x2);
     } */






     //To convert the first character of set of strings to uppercase

  /*    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder(""); 


        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1) {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
            }

            else{
                sb.append(str.charAt(i));
                }

            }
            return sb.toString();
        } */

      

//to compress the string

/* public static String compress(String str){
    StringBuilder sb = new StringBuilder("");

    int n = str.length();

    for(int i=0;i<n;i++){
        Integer count = 1;

        while(i<n-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
        sb.append(str.charAt(i)); 
        if(count>1){
            sb.append(count.toString());
        }  }
    return sb.toString();
}
 */




public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);



   /*  String str  = sc.next();
    String str1 = sc.nextLine();
    //String fullname = "Lavneet Sharma";





 --->   //length of string
    System.out.println(fullname.length());




--->    //CONCATENATION OF STRING
    String firstname= "Lavneet";
    String Lastname= "Sharma";

    String fullname = firstname+" "+Lastname;
    System.out.println(fullname);






 --->   //Search the character index
    System.out.println(fullname.charAt(4));





 --->   //check if a string is PALINDROME 
    //System.out.println(checkPalindrome("racecar"));



 -->   //get the shortest path
    //System.out.println(getShortestPath("WNEENESENNN"));






  -->  //comaprison bw two strings

   /*  String s1 ="Tony";
    String s2 ="Tony";
    String s3 =new String("Tony");

    if(s1==s2){
        System.out.println("Strings are equal");
    }
    if(s1!=s3){
        System.out.println("Strings s1 & s3 are not equal");
    }

    if(s1.equals(s3)){
        System.out.println("strings s1 and s3 atre eual bcuz of equals method use");
    }
 */







  //--->  //SUBSTRING IN A STRING

   /*  String str = "HelloWorld";
   str.substring(4,6);
    System.out.println( substring(str, 4, 6)); */







  //---> //from a set of strings,print the largest strings(LEXICOGRAPHICALLY)

   /* String fruits[] = {"apple","mango","banana"};
   String largest = fruits[0];

   for(int i=1;i<fruits.length;i++){
       if(largest.compareToIgnoreCase(fruits[i])<0){
           largest = fruits[i];
       
       }
   }
   System.out.println("so the largest string is : "+largest); */







 //--->  //STRINGBUILDER

/* StringBuilder sb new StringBuilder("");
for(char ch ='a';ch<='z';ch++){
    sb.append(ch);
} //abcdefghijk..
System.out.println(sb); */







//--->  //For a given String convert each the first letter of each word to uppercase.

/* String str ="hi, my name is lavneet sharma";
System.out.println(toUpperCase(str)); */





//--->//String compression
//System.out.println(compress("aaabbcccdd"));





    





}    
}
