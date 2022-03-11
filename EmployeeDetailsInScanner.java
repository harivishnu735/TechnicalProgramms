import java.util.*;
class Employee{
    String ename;
    int eid;
    String edepart;
    double esalary;
    String eadress;
    
    void totalsalary()
    {
     double grosssalary=0;
     double hra=0;
     double da=0;
     if(esalary>=10000&&esalary<=20000){
         hra=(esalary*20)/100;
         da=(esalary*45)/100;
         grosssalary=esalary+hra+da;
         System.out.println("HRA is :"+hra);
         System.out.println("DA is :"+da);
         System.out.println("The Gross Salary is greater than 10000 &Less than 20000 is :"+grosssalary);

     } 
     else if(esalary>20000&&esalary<=40000){
         hra=(esalary*25)/100;
         da=(esalary*20)/100;
         grosssalary=esalary+hra+da;
          System.out.println("HRA is :"+hra);
         System.out.println("DA is :"+da);
         System.out.println("The Gross Salary is  greater  than 20000 &Less than 40000 is :"+grosssalary);
        
     } 
     else{
         hra=(esalary*30)/100;
         da=(esalary*30)/100;
         grosssalary=esalary+hra+da;
         System.out.println("HRA is :"+hra);
         System.out.println("DA is :"+da);
         System.out.println("The Gross Salary is  :"+grosssalary);
     }
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee Name");
        ename=sc.next();
        System.out.println("Enter the Id no ");
        eid=sc.nextInt(); 
        System.out.println("Enter the Departement ");
        edepart=sc.next();
        System.out.println("Enter the Employee Salary ");
        esalary=sc.nextDouble();
        System.out.println("Enter the Adress ");
        eadress=sc.next();
    }
    void show()
    {
     System.out.println("Name :"+ename+"\n"+"ID no :"+eid+"\n"+"Departement :"+edepart+"\n" + "Salary :"+esalary+"\n"+"Adress :"+eadress);    
    }
   
}
class EmployeeDetailsInScanner{
    public static void main(String args[]){
    Employee emp1 = new Employee();
    emp1.input();
    emp1.totalsalary();
    emp1.show();
    
    Employee emp2 = new Employee();
    emp2.input();
    emp2.totalsalary();
    emp2.show();
    }
}