import java.util.*;
class EmployeeSalary{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Salary amount:");
double salary=sc.nextDouble();
System.out.println("Enter The HRA amount:");
double hra=sc.nextDouble();
System.out.println("Enter The DA amount:");
double da=sc.nextDouble();
hra=(salary*30)/100;
da=(salary*20)/100;
double total=salary+hra+da;
System.out.println("Salary + Hra amt  "+hra);
System.out.println("Salary + DA amount "+da);
System.out.println("Total gross Salary amount "+total);
}
}