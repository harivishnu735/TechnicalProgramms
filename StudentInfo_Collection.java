import java.util.*;
class Student{
    int rollno;
    String name;
    String branch;
    Student(int r,String nm,String br){
         rollno=r;
         name=nm;
         branch=br;
    }
}
class StudentInfo_Collection{
    public static void main(String args[]){
        ArrayList <Student> st=new ArrayList();
        Scanner sc=new Scanner(System.in);
        int rollno;
        String name;
        String branch;
        for(int i=0;i<2;i++){
          System.out.println("Enter RollNo ");
          rollno=sc.nextInt();
          System.out.println("Enter Name "); 
          name=sc.next();
         System.out.println("Enter Branch ");
         branch=sc.next();
         st.add(new Student(rollno,name,branch));
        }
        for(Student sd:st){
            System.out.println(sd.name+" "+sd.branch+" "+sd.rollno);
        }
    }
}