//binomial function --> nCr=a!/b!*(a-b)!
import java.util.*;
class binomialfind{
 
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
             fact = fact*i; 

        }
        return fact;
    }


    public static int binomial(int a,int b){
            
    int fact_a = factorial(a);
    int fact_b = factorial(b);
    int factamb = factorial((a-b));
    int den = fact_b*(factamb);


    int bin =(int)(fact_a/den);
    return bin;



    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println( binomial(a,b));




        
    }
}


//overloading concept 

class Checkoverloading{


    public static int sum(int a,int b){
        int sum = a+b;
        return sum;
        
    }
    public static int sum(int a,int b,int c){
        int sum = a+b+c;
        return sum;

    }
    public static float sum(float a,float b,float c){
        float sum = a+b+c;
        return sum;

    }
    public static void main(String[] args) {

       System.out.println( sum(5,7));
       System.out.println(sum(5,7,8));
       System.out.println(sum(5.6f,7.6f,8.7f));
        
    }
}