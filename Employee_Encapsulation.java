import java.util.*;
class Employee{
    private int eid;
    private String ename;
    private int salary;
    
    void setEid(int eid){
        this.eid=eid;
    }
    void setEname(String ename){
        this.ename=ename;
    }
    void setSalary(int salary){
        this.salary=salary;
    }
    int getEid()
    {
        return this.eid;
    }
    String getEname()
    {
        return this.ename;
    }
    int getSalary()
    {
        return this.salary;
    }
}
class Employee_Encapsulation{
    public static void main(String args[]){
        Employee emp1=new Employee();
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id ");
        int id1=sc.nextInt();
        emp1.setEid(id1);
        System.out.println("Enter Name ");
        String n1=sc.next();
        emp1.setEname(n1);
        System.out.println("Enter Salary ");
        int s1=sc.nextInt();
        emp1.setSalary(s1);
      
        System.out.println("******** Employee 1 Details *****************");   
        System.out.println(emp1.getEid());
        System.out.println(emp1.getEname());
        System.out.println(emp1.getSalary());
        
         Employee emp2=new Employee();
         System.out.println("Enter Id ");
        int id2=sc.nextInt();
        emp2.setEid(id2);
        System.out.println("Enter Name ");
        String n2=sc.next();
        emp2.setEname(n2);
        System.out.println("Enter Salary ");
        int s2=sc.nextInt();
        emp2.setSalary(s2);
       
       System.out.println("******** Employee 2 Details *****************"); 
        System.out.println(emp2.getEid());
        System.out.println(emp2.getEname());
        System.out.println(emp2.getSalary());
    }
}