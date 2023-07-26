//POLYMORPHISM--->

//compile time poymorphism(method overloading)
//Runtime polymorphism(method overriding)

public class alpha18POLYMORPHISM {

    public static void main(String[] args) {


     //compile time poymorphism(method overloading) 
        /* Calculator cal = new Calculator();
        System.out.println(cal.sum(7,8));
       System.out.println(cal.sum(7,9,8)); */
        
  //Runtime polymorphism(method overriding)
  //Deer d = new Deer();
 
  //d.eat();             //call the child class object only

  
       

    }
    
}

/* class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}

class Deer extends Animal{
    @Override
    void eat(){
        System.out.println("eat grass");
    }
} */

/* class Calculator{

    public int sum(int a,int b){
        return a+b;
    }

    public int sum(int a,int b,int c){
        return a+b+c;
    }
}
 */