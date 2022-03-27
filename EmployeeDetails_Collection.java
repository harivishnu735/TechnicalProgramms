import java.util.*;
class Employee{
    int eid;
    String ename;
    String edept;
    Employee(int id,String nm,String de){
         eid=id;
         ename=nm;
         edept=de;
    }
}
class EmployeeDetails_Collection{
    public static void main(String args[]){
        ArrayList <Employee> em=new ArrayList();
        Scanner sc=new Scanner(System.in);
        int eid;
        String ename;
        String edept;
       
        for(int i=0;i<2;i++){
          System.out.println("Enter Id ");
          eid=sc.nextInt();
          System.out.println("Enter Name "); 
          ename=sc.next();
         System.out.println("Enter Departament ");
         edept=sc.next();
         em.add(new Employee(eid,ename,edept));
        }
         System.out.println("********* Employee Details **********");
        for(Employee e:em){
            System.out.println("Name :"+e.ename+"\n"+"Dept :"+e.edept+"\n"+"Id :"+e.eid);
        }
    }
}