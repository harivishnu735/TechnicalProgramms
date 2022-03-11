import java.util.*;
class Student{
    String sname;
    int srollno;
    String sbranch;
    String ssection;
    String sadress;
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rollno");
        srollno=sc.nextInt();
        System.out.println("Enter the Name ");
        sname=sc.next(); 
        System.out.println("Enter the Branch ");
        sbranch=sc.next();
        System.out.println("Enter the Section ");
        ssection=sc.next();
        System.out.println("Enter the Adress ");
        sadress=sc.next(); 
    }
    void show()
    {
    System.out.println("Name is :"+sname);
    System.out.println("Roll No is :"+srollno);
    System.out.println("Branch is :"+sbranch);
    System.out.println("Section is :"+ssection);
    System.out.println("Adress is :"+sadress);
    }
    void reading()
    {
        System.out.println(sname+" Is Reading the book");
    }
    void listening()
    {
      System.out.println(sname+" Is Listening the class");   
    }
}

class StudentDetailsInScanner{
    public static void main(String args[])
    {
      Student std1=new Student();
      std1.input();
      std1.reading();
      std1.listening();
      std1.show();
     
      Student std2=new Student();
      std2.input();
      std2.reading();
      std2.listening();
      std2.show();
    }
}