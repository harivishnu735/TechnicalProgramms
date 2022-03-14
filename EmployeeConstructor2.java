/* Employee
4 constructors with same instance variable names(this)
4 objects cretaed 4 constructors
diaplay all the information */

class Employee{
    String ename;
    int eid;
    String edepart;
    double esalary;
    String eadress;
    
  Employee(String ename,int eid,String edepart,double esalary,String eadress)
  {
   this.ename=ename;
   this.eid=eid;
   this.edepart=edepart;
   this.esalary=esalary;
   this.eadress=eadress;
  }
  Employee(String ename,String edepart)
  {
      this.ename=ename;
      this.edepart=edepart;
  }
  Employee()
  {
      
  }
  Employee(int eid)
  {
      this.eid=eid;
  }
  void working()
  {
      System.out.println(ename+" Is Working ");
  }
  void display()
  {
      System.out.println("Name :"+ename+"\n"+"ID no :"+eid+"\n"+"Departement :"+edepart+"\n" + "Salary :"+esalary+"\n"+"Adress :"+eadress); 
  }
   
}
class EmployeeConstructor2{
    public static void main(String args[]){
        
    Employee emp1 = new Employee("Hari",123,"Mech",15000,"Eluru");
    System.out.println("************Employee 1 Details **************");
    emp1.display();
    emp1.working();
    
    Employee emp2 = new Employee("Vishnu","Civil");
    System.out.println("************Employee 2 Details **************");
    emp2.display();
    emp2.working();

    Employee emp3 = new Employee();
    System.out.println("************Employee 3 Details **************");
    emp3.display();
    emp3.working();
    
    Employee emp4=new Employee(7890);
     System.out.println("************Employee 4 Details **************");
     emp4.display();
     emp4.working();
    }
}