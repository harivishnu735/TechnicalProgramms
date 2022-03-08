import java.util.*;
class Studentmarks{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Five Subject Marks :");
double physics=sc.nextDouble();
double chemistry=sc.nextDouble();
double biology=sc.nextDouble();
double maths=sc.nextDouble();
double computer=sc.nextDouble();
double average,total,percentage;
char grade;
total=physics+chemistry+biology+maths+computer;
average=(total/5.00);
percentage=(total/500.00)*100;
if(average>=90)
grade='A';
else if(average>=80&&average<=90)
grade='B';
else if(average>=70&&average<=80)
grade='C';
else if(average>=60&&average<=70)
grade='D';
else if(average>=40&&average<=60)
grade='E';
else 
grade='F';
System.out.println("The Total marks is :"+total);
System.out.println("The average marks is :"+average);
System.out.println("The percentage marks is :"+percentage);
System.out.println("The Grade is :"+grade);
}
}