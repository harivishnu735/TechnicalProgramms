public class StaticVariable
{

//main method
public static void main(String args[])
{
    StaticVariable obj=new StaticVariable();
}
//initializing Student class constructor by 3 times and passing 3 student names
StaticVariable()
{
 Student st1=new Student();
 st1.setName("shree");
 Student st2=new Student();
 st2.setName("balaji");
 Student st3=new Student();
 st3.setName("ajay");

//displaying student name and roll number
   
   System.out.println("Roll no :" +(st1.rollno++)+ " Name :"+st1.getName());  
   System.out.println("Roll no :" +(st2.rollno++)+ " Name :"+st2.getName());  
   System.out.println("Roll no :" +(st3.rollno++)+ " Name :"+st3.getName());
}
}
//declare Student class andd add declare name, rollno(static)
class Student
{
    String name;
    static int rollno=1;

//add getters and setterss
public String getName(){
    return name;
}
public void setName(String name) {
    this.name=name;
}
public static int getRollno(){
    return rollno;
}
public static void setRollno(int rollno){
    Student.rollno=rollno;
}
}