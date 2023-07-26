//OOPS-->Shallow and deep copy constructors
public class alpha16OOPS_ShallowDeepCons {
    public static void main(String[] args) {
        
  /*   Student s1 = new Student();
    s1.name="lavneet";
    s1.roll=456;s1.password="abcd";
    s1.marks[0]=100;
    s1.marks[1]=90;
    s1.marks[2]=80;

    Student s2 = new Student(s1);

    s1.marks[2]=100;

    for(int i =0;i<3;i++)
    {
        System.out.println(s2.marks[i]);

    }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    // non parametized constructor
    Student(){
        System.out.println("constructor is called...");
    } */
//Deep copy constructor-->

/* Student(Student s1){
    marks = new int[3];
    this.name = s1.name;
    this.password = s1.password;
    this.roll = s1.roll;
    for(int i=0;i<marks.length;i++){
        this.marks[i] = s1.marks[i];
    } */


}


    //Shallow copy constructor--->
 /*    Student(Student s1){
        this.name =s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks; //only refrence of array mark copied here thatsy it is changing after copied
        this.password = s1.password;   
} */
}
