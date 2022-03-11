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
         System.out.println("The Gross Salary is greater than 10000 &Less than 20000 is :"+grosssalary);

     } 
     else if(esalary>20000&&esalary<=40000){
         hra=(esalary*25)/100;
         da=(esalary*20)/100;
         grosssalary=esalary+hra+da;
         System.out.println("The Gross Salary is  greater  than 20000 &Less than 40000 is :"+grosssalary);
        
     } 
     else{
         hra=(esalary*30)/100;
         da=(esalary*30)/100;
         grosssalary=esalary+hra+da;
         System.out.println("The Gross Salary is  :"+grosssalary);
     }
    }
   
}
class EmployeeDetails{
    public static void main(String args[]){
    Employee emp1 = new Employee();
    emp1.ename="Hari";
    emp1.eid=123;
    emp1.edepart=" MECH ";
    emp1.esalary= 16000.00;
    emp1.eadress = " vijayawada ";
    System.out.println("******Employee 1 Details*******");  
    System.out.println("Name :"+emp1.ename+"\n"+"ID no :"+emp1.eid+"\n"+"Departement :"+emp1.edepart+"\n" + "Salary :"+emp1.esalary+"\n"+"Adress :"+emp1.eadress);
    emp1.totalsalary();
    
    Employee emp2 = new Employee();
    emp2.ename=" Vishnu ";
    emp2.eid=456;
    emp2.edepart=" Civil ";
    emp2.esalary= 23000.00;
    emp2.eadress = " Eluru ";
    System.out.println("******Employee 2 Details*******");  
    System.out.println("Name :"+emp2.ename+"\n"+"ID no :"+emp2.eid+"\n"+"Departement :"+emp2.edepart+"\n" + "Salary :"+emp2.esalary+"\n"+"Adress :"+emp2.eadress);
    emp2.totalsalary();
        
    }
}