//BITWISE MANUPULATION
public class alpha13BitwiseManupulation {





    //To Check if numer is ODD or EVEN--->

/*     public static void oddOrEven(int num){
        int bitmask = 1;
        if((num & bitmask) ==0){
            System.out.println("number is even");
        }
        else System.out.println("number id odd");
    } */
    






   //To GET the ith bit from a number-->

       /* public static void getIthBit(int n,int i){
        int bitmask =1<<i;
        if(( n & bitmask) == 0){
            System.out.println("ithbit is 0");
        }
        else System.out.println("ith bit is 1");
    } */





 


   //TO set a number at ith bit--->

  /*  public static int setIthBit(int n,int i){
    int bitMask = 1<<i;
    return n|bitMask;
   } */








   //To Clear ith bit--->

  /*  public static int clearIthBit(int n,int i){
    int bitmask =~(i<<i);
    return n&bitmask;
   } */
   






   //tO DO UPDATE IN bits position-->

/* public static int upadateIthBit(int n,int i,int newbit){
    if(newbit ==0){
        return clearIthBit(n,i);
    }else return setIthBit(n,i);

}
 */






 //TO clear last ith bits-->

/*  public static int clearIthBits(int n,int i){
    int bitmask= (-1)<<i;
    return n&bitmask;
 } */






//TO clear range of bits-->

/*  public static int clearIBits(int n,int i,int j){
    int  a = (~0)<<(j+1);
    int b = (i<<i)-1;
    int bitmask = a|b;
    return n & bitmask;
 } */






 //To check if number is in 2 to the power or not-->

 /* public static boolean isPowerOfTwo(int n)
 {return (n&(n-1)) ==0;} */
 






  //To count no. of set bits(1)--> 

 /* public static int countSet(int n){
    int count =0;
    while(n>0){
        if((n&1)!=0){
            count++;
        }
         n = n>>1;     
    }
    return count;
 } */
 




 


 //FAST EXPONENTIATION--->

 /* public static int fastExpo(int a,int n){
    int ans =1;
    while(n>0){
        if((n&1)!=0){
            ans = ans*a;
        }
        a = a*a;
        n = n>>1;
    }
    return ans;
 } */
    



    public static void main(String[] args) {
        //oddOrEven(9);
        //getIthBit(10,3);
       // System.out.println(setIthBit(10, 2));
       //System.out.println(clearIthBit(10,1));
       //System.out.println(updateIthBit(10,3,1));
       //System.out.println(clearIthBits(15,2));
       //System.out.println(clearIBits(10,2,4));
       //System.out.println(isPowerOfTwo(8));
       //System.out.println(countSet(10));
       //System.out.println(fastExpo(5,3));

    }

    
}
