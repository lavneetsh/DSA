//program to check a number is prime or not


public class alpha4IS_Prime{
    public static boolean isPrime(int n){
        boolean isPrime = true;

        for(int i=2;i<n-1;i++){
            if(n%i ==0){
               return false;

            }
        }
        return true;
    }
   

    //optimised approach

  
    public static void main(String[] args) {
         System.out.println(isPrime(8));
    }
}


